package map.rovnice;

public class Main
{
    public static int vymen(int c,int d)
    {
        return c;
    }
    public static void main(String[] args)
    {
        int a=4;
        int b=10;
        a=vymen(b, b=a);
        System.out.print(a);
        System.out.println(b);
        //takto som to teraz upravil
        // write your code here
    }
}
