package com.ecsaccessmentjava.main;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ecsaccessmentjava.model.Student;
import com.google.gson.Gson;

public class Details {

	public void allDetails() throws IOException, SQLException {

		try {

			String jdbcURL = "jdbc:mysql://localhost:3306/javaexcel";
			String username = "root";
			String password = "mysqlroot";
			Connection con = null;

			String excelFilePath = ".\\src\\main\\resources\\Info-classrooms.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelFilePath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");

			FileWriter file = new FileWriter(".\\src\\main\\resources\\JsonFile.json");
			ArrayList<String> jsonArray = new ArrayList<String>();

			int columcount = sheet.getRow(2).getPhysicalNumberOfCells();
			System.out.println("Connecting to database..............." + jdbcURL);
			con = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connection is successful!!!!!!");

			for (int i = 1; i < columcount; i++) {

				XSSFRow row = sheet.getRow(i);
				if (row != null) {
					int addmisionNumber = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
					String name = sheet.getRow(i).getCell(1).toString();
					double physicsMarks = sheet.getRow(i).getCell(2).getNumericCellValue();
					double chemistryMarks = sheet.getRow(i).getCell(3).getNumericCellValue();
					double mathsMarks = sheet.getRow(i).getCell(4).getNumericCellValue();
					Student studentOne = new Student();
					studentOne.setAddmissionNumber(addmisionNumber);
					studentOne.setName(name);
					studentOne.setPhysicsMarks(physicsMarks);
					studentOne.setChemistryMarks(chemistryMarks);
					studentOne.setMathMarks(mathsMarks);
					studentOne.setPhysicsGrade(physicsMarks);
					studentOne.setPhysicsGradepoint(physicsMarks);
					studentOne.setChemistryGrade(chemistryMarks);
					studentOne.setChemistryGradepoint(chemistryMarks);
					studentOne.setMathsGrade(mathsMarks);
					studentOne.setMathsGradepoint(mathsMarks);
					studentOne.setTotalMark(physicsMarks, chemistryMarks, mathsMarks);
					studentOne.setPercentage(physicsMarks, chemistryMarks, mathsMarks);

					String sql = "insert into javaexcel.sheet values('" + addmisionNumber + "', '" + name + "', '"
							+ physicsMarks + "', '" + chemistryMarks + "', '" + mathsMarks + "');";

					PreparedStatement statement = con.prepareStatement(sql);

					statement.execute(sql);

					Gson json = new Gson();

					String jsonstr = json.toJson(studentOne);
					System.out.println(jsonstr);

					jsonArray.add(jsonstr);

				}

			}
			
			file.write(jsonArray.toString());
			file.close();
			workbook.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
