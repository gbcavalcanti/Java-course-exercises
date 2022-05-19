

public class Rectangle {

	double width;
	double height;
	
	
	public Double area(){
		return width*height; 
	}
	
	public Double perimeter(){
		return 2*(width+height);
	} 
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
	}
}
