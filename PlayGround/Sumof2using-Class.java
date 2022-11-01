class Census{
    int a,b;
    Census(int x1, int y1)
    {
        a=x1;
        b=y1;
    }
    void display()
    {
        System.out.println(a+b);
    }
}
 
class Main{
    public static void main(String args [])
    {
        Census x= new Census(10,12);
        x.display();
    }
} 
