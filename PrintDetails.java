public class PrintDetails {
private Vehicle v;
public PrintDetails(Vehicle v)
{
this.v=v;
}
public void show()
{
System.out.println("Vehicle Company name is "+v.getName());
System.out.println("Vehicle Value is "+v.getValue());
System.out.println("Vehicle Manufacted year is "+v.getYear());
}
}
