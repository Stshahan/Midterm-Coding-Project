package pkgTestShape;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void ConstructorTest() {
		int width = 10;
		Rectangle a = new Rectangle(width,20);
		assertEquals(width, a.getiWidth());
		
		
	}
	
	@Test
	public void getiWidthTest() {
		Rectangle a = new Rectangle(10,20);
		int expectedWidth = 10;
		assertEquals(expectedWidth,a.getiWidth());
		
		
	}
	@Test
	public void setiWidthTest() {
		Rectangle a = new Rectangle(10,20);
			int expectedWidth = 20;
			a.setiWidth(20);
			assertEquals(expectedWidth,a.getiWidth());
	}
	
	@Test
	public void getiLengthTest() {
		Rectangle a = new Rectangle(10,20);
		int expectedLength = 20;
		assertEquals(expectedLength,a.getiLength());
	
	}
	
	@Test
	public void setiLengthTest() {
		Rectangle a = new Rectangle(10,20);
		int expectedLength = 30;
		a.setiLength(30);
		assertEquals(expectedLength,a.getiLength());
	
	
	}
	@Test
	public void areaTest() {
		Rectangle a = new Rectangle(10,20);
		int expectedArea = 200;
		assertEquals((int)expectedArea,(int)a.area());
	
	}
	@Test
	public void perimeterTest() {
		Rectangle a = new Rectangle(10,20);
		int expectedPerimeter = 60;
		assertEquals((int)expectedPerimeter,(int)a.perimeter());
	
	}
	@Test
	public void compareToTest1() { //Tests the sort of rectangles
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		recs.add(new Rectangle(5,5));
		recs.add(new Rectangle(2,2));
		recs.add(new Rectangle(1,7));
		recs.add(new Rectangle(2,1));
		recs.add(new Rectangle(1,1));
		
		ArrayList<Rectangle> recs1 = new ArrayList<Rectangle>();
		recs1.add(new Rectangle(1,1));
		recs1.add(new Rectangle(2,1));
		recs1.add(new Rectangle(2,2));
		recs1.add(new Rectangle(1,7));
		recs1.add(new Rectangle(5,5));
		boolean arrayListCompare = true;
		Collections.sort(recs);
		System.out.println("");
				for (int i = 0; i<recs.size(); i++) {
			System.out.print(recs.get(i).area() + "    " + recs1.get(i).area()  );
			System.out.println();
		if (recs.get(i).area() != recs1.get(i).area())
			
			arrayListCompare = false; 
		}
		assertTrue(arrayListCompare);
		
	}
	/*@Test
	public void compareToTest2() { //Tests the sort of rectangles
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for( int i =0; i <5; i++) {
		int iWidth = ThreadLocalRandom.current().nextInt(1,10 +1);
		int iLength = ThreadLocalRandom.current().nextInt(1,10 +1);
		recs.add(new Rectangle(iWidth,iLength));
		
	}
		printList(recs);
		Collections.sort(recs);
		System.out.println("");
		printList(recs);

				
	}*/
	@Test
	public void exceptionTest() {
		Rectangle a = new Rectangle(10,20);
		boolean exceptionTest = false;
		try {
			a.setiLength(-1);
		}
		catch (IllegalArgumentException b)
		{
			exceptionTest = true;
		}
		assertTrue(exceptionTest);
	}
	public void printList(ArrayList<Rectangle> recs) {
	for(Rectangle elem : recs){
        System.out.println(elem.area()+"  ");
    }
}
}
	
