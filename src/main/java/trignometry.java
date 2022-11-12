/**
 * 
 */
/**
 * @author sanga
 *
 */
import java.math.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class trignometry{
	
//	Power
	public static double power(double a, int b) {
		double pow=1;
		if(b==0)
			return pow;
		
		for (int i=1;i<=b;i++) {
			
			pow*=a;
		}
	
		return pow;
	}
	
//	degrees to radians
	public static double toRadian(double angle) {
		double angleinr=angle*Math.PI/180;
		return angleinr;
	}
	
//	factorial
	public static double factorial(double num) {
		double factorial=1;
		
		for (double i=num;i>0;i--) {
			factorial*=i;
		}
		return factorial;
	}
//	cos value
	public static double cos(int angle) {
		
		double cosa = 0;
		if(angle>=360 || angle<0) {
        	cosa=99999;
        }
		else {
		    double angleinr =toRadian(angle);
//	        double angleinr = angle*Math.PI/180;
	        double n = 10;
	        int i,j;
	        double fac;
	        
	        
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i; j++){
	                fac*=j;
	            }
	            cosa+=power(-1.0,i)*power(angleinr,2*i)/fac;
	        }
		}
	        return cosa;
	}

	public static double cos(double angle) {
		
	        double n = 10;
	        int i,j;
	        double fac;
	        double cosa = 0;
	        if(angle>=6.29 || angle<0) {
	        	cosa=99999;
	        }
	        else {
	        	double angleinr = toRadian(angle);
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i; j++){
	                fac*=j;
	            }
	            cosa+=power(-1.0,i)*power(angleinr,2*i)/fac;
	        }
	        }
	        return cosa;
		
	}
//	sin value
	public static double sin(double angle) {
	        double n = 10;
	        int i,j;
	        double fac;
	        double sine = 0;
	        if(angle>=360 || angle<0) {
	        	sine=99999;
	        }
	        else {
	        	double angleinr = toRadian(angle);
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i+1; j++){
	                fac*=j;
	            }
	            sine+=power(-1.0,i)*power(angleinr,2*i+1)/fac;
	        }
	        }
	        return sine;
	}
	
	public static double sin(int angle) {
		
		double sine = 0;
		if(angle>=360 || angle<0) {
        	sine=99999;
        }
		else {
	        double angleinr = toRadian(angle);
	        double n = 10;
	        int i,j;
	        double fac;
	        
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i+1; j++){
	                fac*=j;
	            }
	            sine+=power(-1.0,i)*power(angleinr,2*i+1)/fac;
	        }
		}
	        return sine;
	}
//	tan value
	public static double tan(int angle) {
		
		double tana= 0;
		if(angle>=360 || angle<0) {
        	tana=99999;
        }
		else {
				
		tana= sin(angle)/cos(angle);
		}
		return tana;
	}
	public static double tan(double angle) {
		double tana=0;
		if(angle>=6.29 || angle<0) {
        	tana=99999;
        }
		else {
		tana= sin(angle)/cos(angle);
		}
		return tana;
	}


}