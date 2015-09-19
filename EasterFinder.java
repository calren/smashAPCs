
/**
 * Write a description of class EasterFinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasterFinder
{
    
    public static void main(int year) {
        System.out.println("year is : " + year);
        int y = year;
        int a = y % 19;
        System.out.println ("a is: " + a);
        int b = y / 100;
        System.out.println("b is: " + b);
        int c = y % 100;
        System.out.println("c is: " + c);
        int d = b / 4;
        System.out.println("d is: " + d);
        int e = b % 4;
        System.out.println("e is: " + e);
        
        // divide b + 8 by 25 and get a quotient f
        int f = (b+8) / 25;
        System.out.println("f is: " + f);
        
        // Divide b - f + 1 by 3 and get a quotient g. Ignore the remainder
        int g = (b - f + 1) / 3;
        System.out.println("g is : " + g);
        
        // Divide 19 * a + b - d - g + 15 by 30 and get a remainder h.
        int h = (19 * a + b - d - g + 15) % 30;
        System.out.println("h is: " + h);
        
        // Divide c by 4 and get a quotient i and a remainder k.
        int i = c / 4;
        System.out.println("i is: " + i);
        int k = c % 4;
        System.out.println("k is: " + k);
        
        // Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        System.out.println("r is : " + r);
        
        // Divide a + 11 * h + 22 * r by 451 and get a quotient m
        int m = (a + 11 * h + 22 * r) / 451;
        System.out.println("m is: " + m);
        
        // Divide h + r - 7 * m + 114 by 31 and get a quotient n and a remainder p.
        int n = (h + r - 7 * m + 114) / 31;
        System.out.println("n is: " + n);
        int p = (h + r - 7 * m + 114) % 31;
        System.out.println("p is : " + p);
        
        System.out.println ("month is: " + n);
        System.out.println("day is: " + (p + 1));
    }
    
    /**
     * Constructor for objects of class EasterFinder
     */
    public EasterFinder()
    {
        // let y be the year
        int y;
    }

}
