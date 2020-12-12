package com.aruvishal.medical_management;

import java.util.Scanner;

@SuppressWarnings("unused")
public class App {

	

	
	private static Scanner scanner;
	private static Scanner scanner2;
	public static void main(String[] args) throws Exception {

		scanner2 = new Scanner(System.in);
		int choice=entry();
		switch(choice)
		{
		case 1: 
		{
			System.out.println("Please enter the adhar number: ");
			String adhar=scanner2.nextLine();
			System.out.println("Please enter the password: ");
			String password=scanner2.nextLine();	
			VerificationId verification= new VerificationId();
			boolean truOrNot=verification.isValidUser(adhar,password); 
			break;
		}
		case 2:
		{
			System.out.println("Please enter the name:");
			String name1=scanner2.nextLine();
			System.out.println("Please enter the age: ");
			String age1=scanner2.nextLine();
			System.out.println("Please enter the city: ");
			String city1=scanner2.nextLine();
			System.out.println("Please enter the state: ");
			String state1=scanner2.nextLine();
			System.out.println("Please enter the mobile_number: ");
			String mobile_number1=scanner2.nextLine();
			System.out.println("Please enter the email_id: ");
			String email_id1=scanner2.nextLine();
			System.out.println("Please enter the password: ");
			String password1=scanner2.nextLine();
			System.out.println("Please enter the adhar_card_number: ");
			String adhar1=scanner2.nextLine();
			OTP op = new OTP();
			System.out.println("Program Started...................");
			String otp = op.generateOTP("5");
			// System.out.println("Generate OTP :" + otpmassage);
			PasswordManagement pass=new PasswordManagement();
			String mobileText = "your new id varification OTP:" + otp;

			boolean outcome = pass.sendOTP(otp, mobile_number1, mobileText);
			if(outcome)
			{
				CreatingManagement creatingManagement=new CreatingManagement();
			    String id=creatingManagement.creat(name1,age1,city1,state1,mobile_number1,email_id1,password1,adhar1);
			    System.out.println(id);
			}
			else
			{
				System.out.println("@@@@@@@@@@@@@@@@@@@@@ OOPS Sorry @@@@@@@@@@@@@@@@@@@@@@@ \n\n\n $$$$$$$$$$$$$$$$$$$$$$$$$$:- Please cheack your internet connectivity -:$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
			}
			
			
			

			break;
			
		}
		case 3:
		{
			System.out.println("\n\n\n                       &&&&&&&&&&&&&-: Please contact +91 4444 555565 number :-&&&&&&&&&&&&&&");
			break;
		}
		default:
		{
			entry();
		}
		}
	}
		
	static int entry()
	{
		scanner = new Scanner(System.in);
		System.out.println("Press 1 for LOGIN IF YOU HAVE OLD ID: ");
		System.out.println("Press 2 for CREATE NEW ID: ");
		System.out.println("Press 3 for HELPLINE");
		
		int optionChoice = 0;
		try {
			optionChoice = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("\n\n\n INVALID ENTRY \n\n\n");
			entry();
		}
		return optionChoice;
	}
	}

			