import java.util.*;
import java.math.*;
import java.text.DecimalFormat;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Icecream i = new Icecream();
        int r = s.nextInt();
        if(s.hasNextInt())
        {
            int h = s.nextInt();
            i.Quantity(r,h);
        }
        else
        i.Quantity(r);
    }
}
class Icecream
{
    double p =3.14;
    DecimalFormat d=new DecimalFormat("0.00");
    public void Quantity(int r,int h)
    {
        double vol =0.33*p*r*r*h;
        double vol1=Math.round(vol*100.0)/100.0;
        System.out.println(d.format(vol1));
    }
    public void Quantity(int r)
    {
        double vol = 1.33*p*r*r*r;
        double vol1=Math.round(vol*100.0)/100.0;
        System.out.println(d.format(vol1));
    }
}

/*
INPUT --- 4 5
OUTPUT --- 82.90

INPUT --- 4
OUTPUT --- 267.28
