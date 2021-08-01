public class CarCaluclation implements VehicleCaluclation{
private Vehicle v;
CarCaluclation(Vehicle v)
{
this.v=v;
}
public double caluclatePrice()
{
return 0.8*v.getValue();
}
}
