//package Fundamentals;
class _002_Main
{
    public void fun()
    {
        int a = 12, b = 10, c;
        c = (a > b) ? a : b; // Ternary Operator
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        _002_Main ob = new _002_Main();
        System.out.println("Hello World!");
        ob.fun();
    }
}
