package com.ecsaccessmentjava.main;

import java.io.IOException;
import java.sql.SQLException;

import com.ecsaccessmentjava.fromdatabase.Fromdatabase;



public class XlsxtoJson {

	public static void main(String[] args) throws IOException, SQLException{
	
		Details newDet = new Details();
		newDet.allDetails();
	 
		Fromdatabase fromdatabase = new Fromdatabase();
		fromdatabase.callDatabase();
	
	}

	
}

