package triangleclassification;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testCheckTriangle3() {
		Triangle a = new Triangle(2, 3, 4);
		assertEquals("一般三角形"   , a.classifyTriangleKind(a));
	}
	
	@Test
	public void testCheckTriangle2() {
		Triangle a = new Triangle(1, 1, 1);
		assertEquals("正三角形"     , a.classifyTriangleKind(a));
	}	
		
	
	@Test
	public void testCheckTriangle5() {
		Triangle a = new Triangle(1, 2, 2);
		
		assertEquals("等腰三角形"   ,  a.classifyTriangleKind(a));
	}	
		
	@Test
	public void testCheckTriangle6() {
		Triangle a = new Triangle(3, 4, 5);
		assertEquals("直角三角形"   ,  a.classifyTriangleKind(a));
	}	

	@Test
	public void testCheckTriangle7() {
		Triangle a = new Triangle(2, 3, 4);
		assertEquals("一般三角形"   ,  a.classifyTriangleKind(a));		
	} 
	
	@Test
	public void testCheckTriangle4() {
		Triangle a = new Triangle(1, 1, 1.414);
		assertEquals("等腰直角三角形" , a.classifyTriangleKind(a));

	}

	@Test
	public void testCheckTriangle1() {
		Triangle a = new Triangle(0, 0, 0);
		assertEquals("不是三角形"   , a.classifyTriangleKind(a));
		a.setEdge(-1.0, 2.0, 3.0);
		assertEquals("不是三角形"   , a.classifyTriangleKind(a));
		a.setEdge(2.0, -1.0, 5.0);
		assertEquals("不是三角形"   , a.classifyTriangleKind(a));
	}

}
