import java.text.NumberFormat;

public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getCircumference(){
	return	Math.PI * 2 *radius;
		
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
		
	}
	
	private String formatNumber(double x) {
		x = Math.round(x);
		return Double.toString(x);
		
	}
	
	public String getFormattedCircumferance (){
		return formatNumber(getCircumference());
	}
	
	public String getformattedArea() {
		return formatNumber(getArea());
	}
	
	

}
