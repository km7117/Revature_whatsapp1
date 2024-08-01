package com.whatsapp1.view;

import java.util.Scanner;

import com.whatsapp1.controller.Whatsapp1Controller;
import com.whatsapp1.controller.Whatsapp1ControllerInterface;

public class Whatsapp1View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****** welcome *******");
		
		System.out.println("enter 1 to create profile");
		System.out.println("enter 2 to view profile");
		System.out.println("enter 3 to delete profile");
		System.out.println("enter 4 to edit profile");
		System.out.println("enter 5 to search profile");
		System.out.println("enter 6 to view all profile");
		System.out.println("enter 7 to login profile");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter yoyr chioce");
		
		Whatsapp1ControllerInterface wp=new Whatsapp1Controller();
		
		int c=sc.nextInt();
		
		switch(c)
		{
		case 1: wp.createprofileController();
			System.out.println("profile created");
			break;
		case 2: wp.viewprofileController();
			System.out.println("profile viewed");
			break;
		case 3: wp.deleteprofileController();
			System.out.println("profile deleted");
			break;
		case 4: wp.editprofileController();
			System.out.println("profile edited");
			break;
		case 5: wp.searchprofileController();
			System.out.println("profile searched");
			break;
		case 6: wp.viewallprofileController();
		 	System.out.println("profile viewed all");
		 	break;
		case 7: wp.loginprofileController();
			System.out.println("profile logged in");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
