package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rsamu\\OneDrive\\Desktop\\DAFY_JAVA\\MavenProgram\\src\\test\\resources\\TestData\\Excel-1.xlsx");
		
		FileInputStream a= new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(a);
		
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r=s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			
		}
		
		
	
	
	
	
	}
}
