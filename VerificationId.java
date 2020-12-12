package com.aruvishal.medical_management;

import java.sql.Connection;

import com.aruvishal.atm_machine.util.DBConnection;
import com.aruvishal.atm_machine.util.DBUtil;

public class VerificationId {
	
	

		boolean isValidUser(String adhar, String password) throws Exception {

			String query = "select count(*) as count from users where adhar_card=" + adhar
					+ " and password=" + password;
			Connection con = DBConnection.getConnection();
			int count = DBUtil.getresultSetCount(con, query);
			if (count == 0) {
				return false;
			} else {
				return true;
			}

		}
	}



