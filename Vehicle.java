class Vehicle implements Functionality
{
String name;
int value;
int year;
public Vehicle()
{
System.out.println("New Vehicle instanted");
}
public Vehicle(String name,int value,int year)
{
this.name=name;
this.value=value;
this.year=year;
}
public void drive()
{
System.out.println("If you have  license you can drive ");
}
public void stop()
{
System.out.println("If there is no fuels,Vehicle Stops");
}
public void refuel()
{
System.out.println("If you fuel is over , Please Refuel it");
}

public String getName()
{
return name;
}
public int getValue()
{
return value;
}
public int getYear()
{
return year;
}
}
