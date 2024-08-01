package com.whatsapp1.controller;

import java.util.Scanner;

import com.whatsapp1.entity.whatsapp1User;
import com.whatsapp1.service.whatsapp1Service;
import com.whatsapp1.service.whatsapp1ServiceInterface;

public class Whatsapp1Controller implements Whatsapp1ControllerInterface {


	@Override
	public void createprofileController() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		whatsapp1User wu=new whatsapp1User();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		whatsapp1ServiceInterface wi=new whatsapp1Service();
		int i=wi.createProfileService(wu);
		
		if(i>0)
		{
			System.out.println("profile created");
		}
		else
		{
			System.out.println("profile rejected");
		}
	}

	@Override
	public void viewprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewallprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginprofileController() {
		// TODO Auto-generated method stub
		
	}

}
