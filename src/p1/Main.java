package p1;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        double [] monthlySales = {1590.75, 9590.75, 8590.75};

        //for(int i = 0; i < monthlySales.length; i++)
           // System.out.println(monthlySales[i]);

        for(double each : monthlySales)
            if (each != 0)
                System.out.println(each);
    }
}

