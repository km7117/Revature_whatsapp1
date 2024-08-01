package com.whatsapp1.service;

import com.whatsapp1.dao.whatsapp1DAO;
import com.whatsapp1.dao.whatsapp1DAOInterface;
import com.whatsapp1.entity.whatsapp1User;

public class whatsapp1Service implements whatsapp1ServiceInterface {

	@Override
	public int createProfileService(whatsapp1User wu) {
		// TODO Auto-generated method stub
		
		whatsapp1DAOInterface wd=new whatsapp1DAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}

}
