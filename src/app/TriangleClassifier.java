package app;

public class TriangleClassifier {
	public static final String TAM_GIAC_VUONG  = "Tam giác vuông";
	public static final String TAM_GIAC_DEU    = "Tam giác đều";
	public static final String TAM_GIAC_CAN    = "Tam giác cân";
	public static final String TAM_GIAC_TU     = "Tam giác tù";
	public static final String TAM_GIAC_THUONG = "Tam giác thường";
	public static final String NOT_TRIANGLE    = "không phải là tam giác";

	public static Boolean isTriangle(int a, int b, int c){
		if(a<b+c && b<a+c && c<a+b){
			return true;
		}
		return false;
	}

	// là tam giác vuông
	public static Boolean isRightTriangle(int a, int b, int c){
		if(isTriangle(a, b, c)){
			if(a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a+b*b)
				return true;
		}
		return false;
	}

	// là tam giác đều
	public static Boolean isEquilateralTriangle(int a, int b, int c){
		if(isTriangle(a, b, c)){
			if(a == b && b == c)
				return true;
		}
		return false;
	}

	// là tam giác cân
	public static Boolean isIsoscelesTriangle(int a, int b, int c){
		if(isTriangle(a, b, c)){
			if(a==b || a==c || b==c)
				return true;
		}
		return false;
	}

	// là tam giác tù
	public static Boolean isPrisonTriangle(int a, int b, int c){
		if(isTriangle(a, b, c)){
			if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)
				return true;
		}
		return false;
	}

	// loại tam giác
	public static String getTypeTriangle(int a, int b, int c){
		if(isTriangle(a, b, c)){
			if(isRightTriangle(a, b, c))
				return TAM_GIAC_VUONG;
			else if(isEquilateralTriangle(a, b, c))
				return TAM_GIAC_DEU;
			else if(isIsoscelesTriangle(a, b, c))
				return TAM_GIAC_CAN;
			else if(isPrisonTriangle(a, b, c))
				return TAM_GIAC_TU;
			else
				return TAM_GIAC_THUONG;
		} else
			return NOT_NOTICE;
	}
}
