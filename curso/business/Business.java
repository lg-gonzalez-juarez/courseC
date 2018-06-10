package es.altran.curso.business;

import es.altran.curso.ord.sortbyName;
import es.altran.curso.ord.sortbyPrice;
import es.altran.curso.Product;//porque se usa la clase Product

import java.util.Collections;
import java.util.ArrayList;

public class Business {

	//paramLista
	public void sortbyPrice(ArrayList<Product>paramList) { 
		Collections.sort(paramList, new sortbyPrice());	
	}
	
	public void sortbyName(ArrayList<Product>paramList) {
		Collections.sort(paramList, new sortbyName());	
	}

	public Product getProductbyId(ArrayList<Product> paramList,int paramID) {
				Product result=new Product();
		for (Product prod:paramList) {
			if(prod.getNumberID()==paramID) {
				return prod;
			}
				
		}
		return result;//siempre retornar resultado
	}

	public ArrayList<Product> getProductByPrice(ArrayList<Product>paramList,double paramMin,double paramMax){
		ArrayList<Product> result=new ArrayList<Product>();
		for(Product prod:paramList) {
				if (prod.getPrice()>=paramMin && prod.getPrice()<=paramMax) {
				result.add(prod);
				}
		}
	return result;
	}
	
}