import java.util.*;

public class Interests {

	public void compute ()
	{
		double price,rate,time,si,com;
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the amount:");
	    price=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    time=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    si=(price*time*rate)/100;
	    com=price*Math.pow(1.0+rate/100.0,time) - price;
	    System.out.println("Simple Interest="+si);
	    System.out. println("Compound Interest="+com);
	}
}
