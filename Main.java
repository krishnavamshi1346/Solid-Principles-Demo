class Main{

public static void main(String args[])
{
System.out.println("Bike Details are");
Vehicle b= new Bike("Royal Enfield",100000,2019);
BikeCaluclation bc=new BikeCaluclation(b);
PrintDetails p;
p=new PrintDetails(b);
p.show();
System.out.println("Price after Depretion "+bc.caluclatePrice());
System.out.println();


System.out.println("Car Details are");
Vehicle c=new Car("Skoda",2000000,2021);
CarCaluclation cc=new CarCaluclation(c);
p=new PrintDetails(c);
p.show();
System.out.println("Price after Depretion "+cc.caluclatePrice());
System.out.println();

}
}
