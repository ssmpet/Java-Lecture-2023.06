package ch06_class.Example05;

public class SamsungPhone {
	private String company;
	private String model;
	private String color;
	private int release;
	
	//getter, setter 구현
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		// 예외처리 코드
		if (!company.equals("삼성")) {
			System.out.println("삼성폰이 아닙니다.");
			return;
		}
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if (!(model.equals("갤럭시s20") || model.equals("갤럭시s21") || model.equals("갤럭시s22")))  {
			System.out.println("삼성폰 모델이 아닙니다.");
			return;
		}
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		return "SamsungPhone [company=" + company + ", model=" + model + ", color=" + color + ", release=" + release
				+ "]";
	}
	
	
	
}
