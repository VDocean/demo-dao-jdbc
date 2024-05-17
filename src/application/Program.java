package application;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	


	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Department obj=new Department(1,"Books");
		System.out.println(obj);
		
		Seller seller=new Seller(21,"Bob","bob@gmail.com", new Date(),3000.00,obj);
	    System.out.println(seller);
	    
	    SellerDao sellerDao= DaoFactory.createSellerDao();
	}

}
