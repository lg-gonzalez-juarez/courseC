package es.altran.curso;

import java.util.ArrayList;

//import es.altran.curso.ord.*;
import es.altran.curso.business.Business;

public class Execute {

		public static void main(String[] args) {
			Book b1=new Book(1,20.0,"LG1","bib1","Certif1");
			Book b2=new Book(2,40.0,"LG2","bib2","Certif2");
			MobilePhone m1=new MobilePhone(4,10.0,"Xiaomi",5,"Mix2");
			MobilePhone m2=new MobilePhone(3,20.0,"HTC",2,"one");
						    
	    ArrayList<Product> list=new ArrayList<Product>();
	    list.add(b1);
	    list.add(b2);
	    list.add(m1);
	    list.add(m2);
	    
	    System.out.println("Lista ordenada -ejemplo 1");
		for (Product prod : list) {
			System.out.println(prod);			
		}
	    
	    	Business logic=new Business();
	    	logic.sortbyPrice(list);
	    
	    	System.out.println("Lista ordenada por precio -ejemplo 2");
	    		for (Product prod: list) {
	    			System.out.println(prod.toString());
	    		}
	    	    
	    	logic.sortbyName(list);
		
	    	System.out.println("Lista Ordenada por nombre -ejemplo 3");
	    		for (Product prod : list) {
	    			System.out.println(prod);			
		}
		    		
	    System.out.println("[ejemplo 4] Producto con id 3:"+ logic.getProductbyId(list,3));
	    
	    // ejemplo 3 (funcion lambda)
	   list.sort((Product o1,Product o2)->(int)((o1.getPrice()-o2.getPrice())));
	   
	   list.sort((Product o1,Product o2)->{
		   int result=0;
		   if (o1.getPrice()<o2.getPrice()) {
			   result=-1;
		   }else if (o1.getPrice()>o2.getPrice()) {
			   result=1;
		   }; return result;});
	   
	   System.out.println("\n[example 5] Lista ordenada por precio");
	    list.forEach((p)->System.out.println(p));
	}

		// ejemplo 2
		//ArrayList<Product> list20=logic.getProductbyPrice(list,20.0,30.0);
		//System.out.println("list de 20 euros"); 
		//for(Product prod:list20){
		//	System.out.println(prod);
		//}		
		
		
}

	