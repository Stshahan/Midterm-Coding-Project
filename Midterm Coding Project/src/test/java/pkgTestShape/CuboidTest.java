package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {

	@Test
	public void constructorCube_test() {
		int depth = 10;
		Cuboid a = new Cuboid(10,20,depth);
		assertEquals(depth, a.getiDepth());
	}
	
	@Test
	public void setiDepth_test() {
		Cuboid a = new Cuboid(10,20,30);
		int expectedDepth = 60;
		a.setiDepth(60);
		assertEquals(expectedDepth,a.getiDepth());
	}
	@Test
	public void getiDepth_test() {
		Cuboid a = new Cuboid(10,20,30);
		int expectedDepth = 30;
		assertEquals(expectedDepth,a.getiDepth());
		
	}
	
	@Test
	public void area_test() {
		Cuboid a = new Cuboid(10,20,30);
		int expectedArea = 2200;
		assertEquals((int)expectedArea,(int)a.area());	
		
	}
	@Test
	public void volume_test() {
		Cuboid a = new Cuboid(10,20,30);
		int expectedVolume = 6000;
		assertEquals((int)expectedVolume,(int)a.volume());	
	
	}
	@Test
	public void perimeter_test() {
		Cuboid a = new Cuboid(10,20,30);
		boolean perimeterExceptionTest = false;
		try {
			a.perimeter();
		}
		catch(UnsupportedOperationException e)
		{
			perimeterExceptionTest = true;	
		}
		assertTrue(perimeterExceptionTest);
	}
	@Test
	public void SortByArea_test () {
			ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
			System.out.println();
			System.out.println("Area Test");
			cubes.add(new Cuboid(8,5,5));
			cubes.add(new Cuboid(2,4,8));
			cubes.add(new Cuboid(4,4,4));
			cubes.add(new Cuboid(5,7,5));
			cubes.add(new Cuboid(2,4,6));
			
			ArrayList<Cuboid> cubes1 = new ArrayList<Cuboid>();
			cubes1.add(new Cuboid(2,4,6));
			cubes1.add(new Cuboid(4,4,4));
			cubes1.add(new Cuboid(2,4,8));
			cubes1.add(new Cuboid(5,7,5));
			cubes1.add(new Cuboid(8,5,5));
			boolean arrayListCompare = true;
			System.out.println("presort");
			System.out.println("cubes   cubes1");
			for (int i = 0; i<cubes.size(); i++) {
		System.out.print(cubes.get(i).area() + "    " + cubes1.get(i).area()  );
		System.out.println();}
			System.out.println("");
			Collections.sort(cubes);
			System.out.println("postsort");
			System.out.println("");
			System.out.println("cubes   cubes1");
					for (int i = 0; i<cubes.size(); i++) {
				System.out.print(cubes.get(i).area() + "    " + cubes1.get(i).area()  );
				System.out.println();
			if (cubes.get(i).area() != cubes1.get(i).area())
				
				arrayListCompare = false; 
			}
			assertTrue(arrayListCompare);
			
		}
		
	
	@Test
	public void SortByVolume_test() {
		System.out.println();
		System.out.print("Volume Test");
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(new Cuboid(8,5,5));
		cubes.add(new Cuboid(2,4,8));
		cubes.add(new Cuboid(4,4,5));
		cubes.add(new Cuboid(5,7,5));
		cubes.add(new Cuboid(2,4,6));
		
		ArrayList<Cuboid> cubes1 = new ArrayList<Cuboid>();
		cubes1.add(new Cuboid(2,4,6));
		cubes1.add(new Cuboid(2,4,8));
		cubes1.add(new Cuboid(4,4,5));
		cubes1.add(new Cuboid(5,7,5));
		cubes1.add(new Cuboid(8,5,5));
		boolean arrayListCompare = true;
		System.out.println("presort");
		System.out.println("cubes   cubes1");
		for (int i = 0; i<cubes.size(); i++) {
	System.out.print(cubes.get(i).volume() + "    " + cubes1.get(i).volume()  );
	System.out.println();}
		System.out.println("");
		Collections.sort(cubes);
		System.out.println("postsort");
		System.out.println("");
				for (int i = 0; i<cubes.size(); i++) {
			System.out.print(cubes.get(i).volume() + "    " + cubes1.get(i).volume()  );
			System.out.println();
		if (cubes.get(i).volume() != cubes1.get(i).volume())
			
			arrayListCompare = false; 
		}
		assertTrue(arrayListCompare);
		
	}
	@Test
	public void exceptionTest() {
		Cuboid a = new Cuboid(10,20,30);
		boolean exceptionTest = false;
		try {
			a.setiDepth(-1);
		}
		catch (IllegalArgumentException b)
		{
			exceptionTest = true;
		}
		assertTrue(exceptionTest);
	}
	}

