package app;

public class TriangleClassifier {
	public static final String TAM_GIAC_VUONG  = "Day la tam giac vuong";
	public static final String TAM_GIAC_DEU    = "Day la tam giac deu";
	public static final String TAM_GIAC_CAN    = "Day la tam giac can";
	public static final String TAM_GIAC_TU     = "Day la tam giac tu";
	public static final String TAM_GIAC_THUONG = "Day la tam giac thuong";
	public static final String NOT_NOTICE      = "Ba canh a, b, c khong phai la ba canh cua mot tam giac";

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
