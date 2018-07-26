package Utilities;

import java.io.FileInputStream;

import java.io.IOException;




import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import Pages.Registration;
public class ExcelUti {

	public void getTestdata() throws IOException{
		
		FileInputStream fl= new FileInputStream("C:\\Rakesh\\Eclipse Workspace\\ExcelRead.xls");
		HSSFWorkbook x= new HSSFWorkbook(fl);
		HSSFSheet s= x.getSheet("Sheet1");
		
		int rowcount = s.getLastRowNum();
		for(int i=1; i<=rowcount;i++) {
			String FirstName=s.getRow(i).getCell(0).getStringCellValue();
			String LastName=s.getRow(i).getCell(1).getStringCellValue();
			String email=s.getRow(i).getCell(2).getStringCellValue();
			String Password=s.getRow(i).getCell(3).getStringCellValue();
			String Confirm=s.getRow(i).getCell(4).getStringCellValue();
			System.out.println(FirstName+ " " + LastName+""+ email+""+ Password+""+Confirm );
			Registration.registration(FirstName, LastName, email, Password, Confirm);
		}
		//String data=s.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data);
		}
	
	
	
	public static void main(String args[]) throws IOException {
		ExcelUti e=new ExcelUti();
		e.getTestdata();
	}
}
