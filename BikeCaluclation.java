public class BikeCaluclation implements VehicleCaluclation
{
private Vehicle v;
BikeCaluclation(Vehicle v)
{
this.v=v;
}
public double caluclatePrice()
{
return 0.5*v.getValue();
}
}
