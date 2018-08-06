
/**
 * TODO Put here a description of what this class does.
 *
 * @author akhil.
 *         Created Mar 29, 2018.
 */


import java.util.*;
import java.lang.*;
import java.io.*;
public class spirograph 
{
	public static void main(String args[]) 
    {
		double R = 8.0;
		double r = 1.0;
		double a = 4.0;
		double pi = Math.PI;
		int nRev = 16;
		for(double t = 0.0; t < (pi*nRev); t+=0.01) 
        {
			double x1 = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
			double y1 = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
			double lonn = -118.2892102;
			double latt = 34.0210764;
			double x2=x1*0.001;
			double y2=y1*0.001;
			System.out.print(x2+lonn+",");
			System.out.println(y2+latt+",");
		}
	}
}
