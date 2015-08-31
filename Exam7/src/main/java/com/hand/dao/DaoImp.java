package com.hand.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hand.model.Address;
import com.hand.model.Customer;

import config.HibernateUtil;

@Controller
@RequestMapping("Dao")
public class DaoImp {

	public static Session session = HibernateUtil.getSession();

	Transaction tx = null;

	public DaoImp() {
	}

	@RequestMapping("/insert.do")
	public void insert(String firstName, String lastName, String email, Short addressId) {

		Customer customer = new Customer();
		Address address = new Address();
		customer.setStoreId(new Integer(1).byteValue());
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setAddress(address);
		customer.setLastUpdate(new Date());
		customer.getAddress().setAddressId(addressId);
		customer.setCreateDate(new Date());
		try {
			tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
			System.out.println("已经保存数据如下：");
			System.out.println("ID:" + this.findByName(firstName));
			System.out.println("FirstName:" + firstName);
			System.out.println("LastName:" + lastName);
			System.out.println("Email:" + email);
			System.out.println("Address:" + this.findAddressById(addressId));

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public boolean findById(short addressId) {
		tx = session.beginTransaction();

		Address address = (Address) session.get(Address.class, addressId);

		tx.commit();
		if (address == null) {
			return false;
		} else {
			return true;
		}
	}

	public short findByName(String firstName) {
		tx = session.beginTransaction();
		String hql = "from Customer where first_name = '" + firstName + "'";
		Query query = session.createQuery(hql);
		Customer customer = (Customer) query.list().get(0);
		tx.commit();
		return customer.getCustomerId();

	}

	public String findAddressById(short addressId) {
		tx = session.beginTransaction();
		Address address = (Address) session.get(Address.class, addressId);
		tx.commit();
		return address.getAddress();
	}
	
	public boolean dalete(short customerId){
		Session session = HibernateUtil.getSession();
		Customer Customer = (Customer) session.get(Customer.class,customerId);
		Transaction ts = session.beginTransaction();
		try {
			session.delete(Customer);
			ts.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			ts.rollback();
			return false;
		}finally{
			session.close();
		}

	}
}
