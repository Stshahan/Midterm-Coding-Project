package pkgShape;

import java.util.Collections;
import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable {
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		iDepth = depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int depth) {
			if (depth <=0)
				throw new IllegalArgumentException();
		iDepth = depth;
	}

	@Override
	public double area() {
		return 2*super.getiWidth()*iDepth + 2*super.getiWidth()*super.getiLength() + 2*super.getiLength()*iDepth;
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	public double volume() {
		return super.area() * iDepth;
	}
	
	

	/*	@Override
	public int compareTo(Object o) {
		Cuboid Cube1 = (Cuboid) o;
		return (int) (this.volume()-Cube1.volume());
	}*/
		}



		class SortByArea implements Comparator <Cuboid> {
		SortByArea(){
		}
		@Override
		public int compare(Cuboid Cube1, Cuboid Cube2) {
			return (int) (Cube1.area() - Cube2.area());
		}
	}
		class SortByVolume implements Comparator <Cuboid> {
			SortByVolume(){
			}
			@Override
			public int compare(Cuboid Cube1, Cuboid Cube2) {
				return (int) (Cube1.volume() - Cube2.volume());
	}
}
