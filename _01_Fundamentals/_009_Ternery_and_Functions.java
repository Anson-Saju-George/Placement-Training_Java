//package Fundamentals;
class _009_Ternery_and_Functions
{
    public void fun()
    {
        int a = 12, b = 10, c;
        c = (a > b) ? a : b; // Ternary Operator
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        _009_Ternery_and_Functions ob = new _009_Ternery_and_Functions();
        System.out.println("Hello World!");
        ob.fun();
    }
}
