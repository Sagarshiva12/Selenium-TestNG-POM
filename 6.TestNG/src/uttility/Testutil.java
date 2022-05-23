package uttility;

import java.util.ArrayList;

public class Testutil
{
public static ArrayList<Object[]> readdataFromexcel() {
		
		
		ArrayList<Object[]> data=new ArrayList <Object[]>();
		
		
		Xls_Reader reader=new Xls_Reader("C:\\Selenium\\6.TestNG\\src\\testdata\"Test_Data.xlsx");
		
		
		 int rowCount=reader.getRowCount("TestData");
		 
		 for(int rowNum=2;rowNum<=rowCount;rowNum++ ) {
				
			 String firstname=reader.getCellData("TestData", "firstname", rowNum);
			 String lastname=reader.getCellData("TestData", "lastname", rowNum);
			 String address1=reader.getCellData("TestData", "address1", rowNum);
			 String address2=reader.getCellData("TestData", "address2", rowNum);
			 String city=reader.getCellData("TestData", "city", rowNum);
			 String state=reader.getCellData("TestData", "state", rowNum);
			 String emailaddress=reader.getCellData("TestData", "emailaddress", rowNum);
					
				
			 Object[] obj= {firstname,lastname,address1,address2,city,state,emailaddress};
			 
			 data.add(obj);
		
		
		
		 }
		return data;
		
	}

}


}
