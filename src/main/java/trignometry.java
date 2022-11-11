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
	
//	cos value
	public static double cos(int angle) {
		    double angleinr =((double) angle)*Math.PI/180;
//	        double angleinr = angle*Math.PI/180;
	        double n = 10;
	        int i,j;
	        double fac;
	        double cosa = 0;
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i; j++){
	                fac*=j;
	            }
	            cosa+=Math.pow(-1.0,i)*Math.pow(angleinr,2*i)/fac;
	        }
	        return cosa;
	}

	public static double cos(double angle) {
		
	        double n = 10;
	        int i,j;
	        double fac;
	        double cosa = 0;
	        if(angle>=6.29 || angle<0) {
	        	cosa=999;
	        }
	        else {
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i; j++){
	                fac*=j;
	            }
	            cosa+=Math.pow(-1.0,i)*Math.pow(angle,2*i)/fac;
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
	        if(angle>=6.29 || angle<0) {
	        	sine=999;
	        }
	        else {
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i+1; j++){
	                fac*=j;
	            }
	            sine+=Math.pow(-1.0,i)*Math.pow(angle,2*i+1)/fac;
	        }
	        }
	        return sine;
	}
	
	public static double sin(int angle) {
	        double angleinr = angle*Math.PI/180;
	        double n = 10;
	        int i,j;
	        double fac;
	        double sine = 0;
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i+1; j++){
	                fac*=j;
	            }
	            sine+=Math.pow(-1.0,i)*Math.pow(angleinr,2*i+1)/fac;
	        }
	        return sine;
	}
//	tan value
	public static double tan(int angle) {
		double angleinr = angle*Math.PI/180;
		double n=10;
		int i,j;
		double fac;
		double tana= 0;
		tana= sin(angleinr)/cos(angleinr);
		return tana;
	}
	public static double tan(double angle) {
		double n=10;
		int i,j;
		double fac;
		double tana= 0;
		if(angle>=6.29 || angle<0) {
        	tana=999;
        }
		else {
		tana= sin(angle)/cos(angle);
		}
		return tana;
	}
	public static double toRadian(double angle) {
		double angleinr=angle*Math.PI/180;
		System.out.println(angleinr);
		return angleinr;
	}
    // Function to calculate and display sine of an angle
    public static void main(String[] args) {
//    values should be changed hear
    	int angle=20;
    	double angleinr= angle * Math.PI/180;
    
    	
    	
        double sine= sin(angleinr);
        double cosa= cos(angleinr);
        double tana= tan(angleinr);
        toRadian(angle);
        System.out.println("angleinr is"+ angleinr);
        System.out.println("The sin value is "+sine +" and  "+ Math.sin(angleinr));
        System.out.println("The cos value is "+cosa +" and  "+ Math.cos(angleinr));
        System.out.println("The tan value is "+tana +" and  "+ Math.tan(angleinr));
   
    	}
}