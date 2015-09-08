package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.Address;
import com.hand.model.Customer;

public class DaoImp {

	private SessionFactory sessionFactory = null;

	private final String appName = "applicationContext.xml";

	private Session session = null;

	private Connection conn = JDBSTest2.getConnection();

	public String selectUser(String userName, String password) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appName);
		sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		session = sessionFactory.openSession();
		String hql = "FROM Customer where first_name ='" + userName + "'";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		for (Customer customer : customers) {
			System.out.println(customer.getLastName());
			if (customer.getLastName().equals(password)) {
				session.close();
				return "success";
			} else {
				session.close();
				return "error";
			}
		}
		return "error";
	}

	public List<Customer> findAll() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appName);
		sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		session = sessionFactory.openSession();
		String hql = "FROM Customer";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();
		session.close();
		return customers;
	}

	public ResultSet showCustomer() {
		String sql = "select a.first_name,a.last_name,b.address,a.email,a.customer_id,a.last_update from customer as a, address as b where a.address_id = b.address_id";
		ResultSet rs = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void dele(Short id) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appName);
		sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		session = sessionFactory.openSession();
		Customer emp = (Customer) session.get(Customer.class, id);
		Transaction ts = session.beginTransaction();
		try {
			session.delete(emp);
			ts.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			ts.rollback();
		} finally {
			session.close();
		}
		System.out.println("删除成功");
	}

	public List<Address> showAddress() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appName);
		sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		session = sessionFactory.openSession();
		String hql = "FROM Address";
		Query query = session.createQuery(hql);
		List<Address> lists = query.list();
		session.close();
		return lists;
	}

	public void addCustomer(String firstName, String lastName, String Email, String AddressId) {
		String sql = "select address_id from address where address_id = ?";
		ResultSet rs = null;
		short addressId;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, AddressId);
			rs = ps.executeQuery();
			addressId = rs.getShort(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.close();

	}
}
