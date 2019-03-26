package pkgShape;

public class Rectangle extends Shape  implements Comparable {

	private int iWidth;
	private int iLength;
	
	public Rectangle (int width, int length) {
		super();
		iWidth = width;
		iLength = length;
		}
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int width) {
		if (width <=0)
			throw new IllegalArgumentException();
		iWidth = width;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int length) {
		if (length <=0)
		throw new IllegalArgumentException();
		iLength = length;
	}

	@Override
	public double area() {
		double area = iLength * iWidth;
		
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = 2*iLength + 2* iWidth;
		return perimeter;
	}
	
	@Override
	public int compareTo(Object o) {
		Rectangle R = (Rectangle) o;
		return  (int)this.area() -  (int)R.area();
		 
	}
	
}
