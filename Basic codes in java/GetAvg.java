public class GetAvg 
{
public int getAvg(int numA, int numB, int numC, int numD)
{
return (numA + numB + numC + numD) / 4;
}
public static void main(String args[])
{
GetAvg obj = new GetAvg();
int avg = obj.getAvg(100, 200, 300, 400);
System.out.println("Average of 100, 200, 300 and 400 is: " + avg);
}
}