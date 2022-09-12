package com.ecsaccessmentjava.fromdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.ecsaccessmentjava.model.Student;
import com.google.gson.Gson;

public class Fromdatabase {

	public void callDatabase() {
		try {
			String jdbcURL = "jdbc:mysql://localhost:3306/javaexcel";
			String username = "root";
			String password = "mysqlroot";
			Connection con = null;
			Boolean continueflag = true;
			Scanner userin = new Scanner(System.in);

			while (Boolean.TRUE.equals(continueflag)) {
				System.out.println("Connecting to database..............." + jdbcURL);
				con = DriverManager.getConnection(jdbcURL, username, password);
				System.out.println("Connection is successful!!!!!!");

				System.out.println(
						"Enter 0 for Search by Admission Number \nJust type any other integer for search by name");
				int addmissionOrName = userin.nextInt();

				if (addmissionOrName == 0) {
					System.out.println("You have selected Search by Admission Number Enter the Admission Number :");
					int addmisioNum = userin.nextInt();

					String sql1 = "select * from javaexcel.sheet where AdmissionNumber = '" + addmisioNum + "';";
					PreparedStatement statement = con.prepareStatement(sql1);

					ResultSet rs = statement.executeQuery(sql1);

					if (rs.next() == false) {
						System.out.println("no records found");
					} else {

						do {
							Student st = new Student();

							int adm = rs.getInt(1);
							String name = rs.getString(2);
							Double phy = rs.getDouble(3);
							Double chem = rs.getDouble(4);
							Double math = rs.getDouble(5);
							st.setAddmissionNumber(adm);
							st.setName(name);
							st.setPhysicsMarks(phy);
							st.setChemistryMarks(chem);
							st.setMathMarks(math);
							st.setPhysicsGrade(phy);
							st.setPhysicsGradepoint(phy);
							st.setChemistryGrade(chem);
							st.setChemistryGradepoint(chem);
							st.setMathsGrade(math);
							st.setMathsGradepoint(math);
							st.setTotalMark(phy, chem, math);
							st.setPercentage(phy, chem, math);
							Gson json1 = new Gson();
							String jsonobject = json1.toJson(st);
							System.out.println(jsonobject);
						} while (rs.next());
					}

				}

				else {
					System.out.println("You have selected Search by Name Enter the Name : ");
					String studentname = userin.next();

					String sql2 = "select * from javaexcel.sheet where Name = '" + studentname + "';";

					PreparedStatement statement = con.prepareStatement(sql2);
					ResultSet rs = statement.executeQuery(sql2);

					if (rs.next() == false) {
						System.out.println("no record found");
					} else {

						do {
							Student st = new Student();

							int adm = rs.getInt(1);
							String name = rs.getString(2);
							Double phy = rs.getDouble(3);
							Double chem = rs.getDouble(4);
							Double math = rs.getDouble(5);
							st.setAddmissionNumber(adm);
							st.setName(name);
							st.setPhysicsMarks(phy);
							st.setChemistryMarks(chem);
							st.setMathMarks(math);
							st.setPhysicsGrade(phy);
							st.setPhysicsGradepoint(phy);
							st.setChemistryGrade(chem);
							st.setChemistryGradepoint(chem);
							st.setMathsGrade(math);
							st.setMathsGradepoint(math);
							st.setTotalMark(phy, chem, math);
							st.setPercentage(phy, chem, math);
							Gson json1 = new Gson();
							String jsonobject = json1.toJson(st);
							System.out.println(jsonobject);

						} while (rs.next());
					}

				}
				System.out.println("Do yo want to continue type y for yes and n for no : ");
				String str = userin.next();
				if (str.equals("y") || str.equals("Y")) {
					continueflag = true;

				} else {
					continueflag = false;
				}

			}
			userin.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
