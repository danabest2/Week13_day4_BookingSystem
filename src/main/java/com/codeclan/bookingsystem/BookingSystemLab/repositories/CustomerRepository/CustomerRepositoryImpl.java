package com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Booking;
import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository.CourseRepositoryCustom;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourse(Long courseId){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.createAlias("bookingsAlias.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.id", courseId));

            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    };
    @Transactional
    public List<Customer> findCustomerByTownAndCourse(String town, String course){
        List<Customer> results = null;
        Session session = entityManager.unwrap((Session.class));
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.createAlias("bookingsAlias.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.name", course));
            cr.add(Restrictions.eq("courseAlias.town", town));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Customer> findCustomerOverAgeByTownAndCourse(int age, String town, String course) {
        List<Customer> results = null;
        Session session = entityManager.unwrap((Session.class));
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.createAlias("bookingsAlias.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.name", course));
            cr.add(Restrictions.eq("courseAlias.town", town));
            cr.add(Restrictions.gt("age", age));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
