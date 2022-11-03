class Census{
    int a,b;
    float c,d;
    Census()
    {
        a=1;
        b=10;
        System.out.println(a+b);
    }
    /*void display()
    {
        System.out.println(a+b);
    }*/
    float big()
    {
        return c+d;
    }
}
 
class Main{
    public static void main(String args [])
    {
        Census x= new Census();
        float y;
        x.c=2;
        x.d=3;
        y=x.big();
        System.out.println(y);
    }
} 

