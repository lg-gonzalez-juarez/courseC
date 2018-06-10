package es.altran.curso;

public class Product {

	int numberID;// instance variable
	double price;//float
	String name="ElOrigen";
	
	// esta parte se puede implementar con la autoayuda del ide, 
	// click derecho, source, genera constructor using field
	public Product(int numberID,double price,String name) {
		super();
		this.numberID = numberID;
		this.price = price;
		this.name = name;
	}
	public Product() {
	}
	

		// definicion de funciones pa numberIdentifier
		public int getNumberID() {
			return numberID;
		}
		
		public void setNumberID(int numberID) {
			this.numberID=numberID;
		}
	
		// definicion de funciones pa name
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		// definicion de funciones pa price
				public double getPrice() {
					return price;
				}
				
				public void setPrice(double price) {
					this.price=price;
				}
			
		// se genera con la IDE, click derecho, source,
		// override y se indica el objeto, marcando el que se desea
		@Override
		public String toString() {
			return "Product [numberID="+ numberID +",price="+ price +",name="+ name +"]";
		}
		
}