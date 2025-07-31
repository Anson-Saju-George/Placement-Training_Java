//package Fundamentals;
class _010_Ternery_and_Functions
{
    public void fun()
    {
        int a = 12, b = 10, c;
        c = (a > b) ? a : b; // Ternary Operator
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        _010_Ternery_and_Functions ob = new _010_Ternery_and_Functions();
        System.out.println("Hello World!");
        ob.fun();
    }
}
