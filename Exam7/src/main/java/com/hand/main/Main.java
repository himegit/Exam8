package com.hand.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hand.dao.DaoImp;

public class Main {

	private static String firstName = null;

	private static String lastName = null;

	private static String email = null;

	private static short addressId;

	private static DaoImp daoImp = new DaoImp();

	private static short customerId;

	public static void main(String[] args) {

		String conf = "applicationContext.xml";
		ApplicationContext ac = new FileSystemXmlApplicationContext(conf);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入FirstName:");
		firstName = sc.next();
		System.out.println("请输入LastName:");
		lastName = sc.next();
		System.out.println("请输入Email:");
		email = sc.next();
		System.out.println("请输入AddressID:");
		addressId = (short) sc.nextInt();
		while (!daoImp.findById(addressId)) {
			System.out.println("你的输入不正确，请重新输入，请输入AddressID:");
			addressId = (short) sc.nextInt();
		}

		daoImp.insert(firstName, lastName, email, addressId);

		System.out.println();
		System.out.println("请输入你要删除的Customer的ID：");
		customerId = sc.nextShort();

		while (!daoImp.dalete(customerId)) {
			System.out.println("删除失败，请重新删除");
			customerId = sc.nextShort();
		}
		System.out.println("你输入的ID为" + customerId + "已经被删除");

		// String result = daoImp.insert(filmTitle, filmDescription,
		// filmLanguage_id);
		// System.out.println(result);
	}

}
