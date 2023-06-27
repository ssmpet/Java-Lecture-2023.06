package ch11_api.sec03_class;


public class Car {
	private String model;
	private String menufacturer;

	
	public Car() {}

	public Car(String model, String menufacturer) {
		this.model = model;
		this.menufacturer = menufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMenufacturer() {
		return menufacturer;
	}

	public void setMenufacturer(String menufacturer) {
		this.menufacturer = menufacturer;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", menufacturer=" + menufacturer + "]";
	}
	
	
}
