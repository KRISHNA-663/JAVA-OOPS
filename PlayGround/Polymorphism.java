import java.util.*;
class MotorBike
{
    public String move(String m)
    {
        return m;
    }
}
class Vehicle extends MotorBike
{
    public String move(String a)
    {
        return a;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        Vehicle v = new Vehicle();
        System.out.println(v.move(b));
        System.out.println(v.move(a));
    }
}

/*INPUT --- Hi
            Hello
  OUTPUT --- Hello        
             Hi
*/             
