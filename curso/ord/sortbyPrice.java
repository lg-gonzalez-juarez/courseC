package es.altran.curso.ord;

import es.altran.curso.Product;
import java.util.Comparator; //supongo que es parte de la library


public class sortbyPrice implements Comparator<Product> {
	@Override
	public int compare(Product o1,Product o2) {
	return (int) (o1.getPrice()-o2.getPrice());
}
}
