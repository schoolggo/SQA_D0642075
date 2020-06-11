package triangleclassification;

public class Triangle {
	
	double edgeA;
	double edgeB;
	double edgeC;
	
	public Triangle(double a,double b,double c) {
		edgeA = a;
		edgeB = b;
		edgeC = c;
	}
	
	public void setEdge(double a,double b,double c) {
		edgeA = a;
		edgeB = b;
		edgeC = c;
	}
	
	public String classifyTriangleKind(Triangle tri) {
		double a = edgeA;
		double b = edgeB;
		double c = edgeC;
		if (a <= 0 || b <= 0 || c <= 0) {
			return "不是三角形";
		}
		if (a+b > c && b+c > a && c+a > b) {
			if (a == b) {
				if (b == c) {
					return "正三角形";
				}
				else if (a*a + b*b - c*c <= 0.04*a*a) {
					return "等腰直角三角形";
				}
				else {
					return "等腰三角形";
				}
			}
			else if (b == c) {
				if (b*b + c*c - a*a <= 0.04*b*b) {
					return "等腰直角三角形";
				}
				else {
					return "等腰三角形";
				}
			}
			else if(a == c){
					if (a*a + c*c - b*b <= 0.04*a*a) {
						return "等腰直角三角形";
					}
					else {
						return "等腰三角形";
					}
			}
			if (a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
				return "直角三角形";
			}
			else {
				return "一般三角形";
			}
		}
		return "不是三角形";

	}
}