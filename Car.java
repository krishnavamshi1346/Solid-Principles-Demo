class Car extends Vehicle implements CarFunctionality,EngineInterface
{
private String name;
private int value;
private int year;
public Car(String name,int value,int year)
{
super(name,value,year);
this.name=name;
this.value=value;
this.year=year;
}
public void start()
{
System.out.println("This Depends on Engine Interface");

}
public void openDoor()
{
System.out.println("Open the door for entring into car");
}
public void turnOnAc()
{
System.out.println("Turn on Air Conditioner for better comfort");
}
}
