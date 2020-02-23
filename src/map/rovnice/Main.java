package map.rovnice;

public class Main
{
    public static int vymen(int c,int d)
    {
        return c;
    }
    public static void main(String[] args)
    {
        Integer a=4;
        Integer b=10;
        a=vymen(b, b=a);
        System.out.print(a);
        System.out.println(b);

        // write your code here
    }
}
