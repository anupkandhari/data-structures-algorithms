
public class MathPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return x;
		else if (n < 0) {
			double a = myPow(x, -(n / 2));
			if (n % 2 == 0)
				return 1 / (a * a);
			else
				return 1 / (a * a * x);
		}
		double a = myPow(x, n / 2);
		if (n % 2 == 0)
			return a * a;
		else
			return a * a * x;
	}

	// Iterative method
	public double myPow2(double x, int n) {
	        long temp = n;
	        double res = 1;
	        
	        if (n < 0)
	            temp *= -1;
	               
	        while(temp > 0){
	            if (temp % 2 == 0){
	                temp/= 2;
	                x *= x;
	            }
	            else {
	                res *= x;
	                temp -= 1;
	            }    
	        }
	        
	        return n >= 0 ? res: (1/res); 
	    }

}
