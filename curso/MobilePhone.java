package es.altran.curso;

public class MobilePhone extends Product{
	String model;  
	double inch;
	
	public MobilePhone(int numberID,double price,String name,double inch,String model) {
		super(numberID,price,name);//con este se actualiza el valor
		this.inch=inch;
		this.model=model;
	}

	public double getInch() {
		return inch;
	}

	public void setInch(double inch) {
		this.inch=inch;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Mobile [inch="+inch+",model="+model+"]";
	}
}