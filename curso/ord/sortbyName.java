package es.altran.curso.ord;

import java.util.Comparator;
import es.altran.curso.Product;

public class sortbyName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return (o1.getName().compareTo(o2.getName()));
	}
		

}