package com.aruvishal.medical_management;

import java.sql.Connection;

import com.aruvishal.atm_machine.util.DBConnection;
import com.aruvishal.atm_machine.util.DBUtil;
import com.aruvishal.atm_machine.util.EmailUtil;

public class CreatingManagement {
	@SuppressWarnings({ "unused", "static-access" })
	String creat(String name1, String age1, String city1, String state1, String mobile_number1, String email_id1,
			String password1, String adhar1) throws Exception {
		String query = "insert into users(name,age,city,state,mobile_number,email,adhar_card,password) value('" + name1
				+ "'," + age1 + ", '" + city1 + "','" + state1 + "'," + mobile_number1 + ",'" + email_id1 + "',"
				+ password1 + "," + adhar1 + ")";
		Connection con = DBConnection.getConnection();
		boolean result = DBUtil.executInsertUpdateDelete(con, query);
		String text = "I AM A STUDENT OF IIIT VADODARA GUJRAT : Dear user your new id is registerd succesfully ";
		String subject = "Bank Account";
		EmailUtil mail = new EmailUtil();
		boolean isOfline = mail.isSentMail(email_id1, subject, text);
		String id_detail;
		return id_detail = " #########################-: Now your id is created succesfully :-############################## ";
	}
}