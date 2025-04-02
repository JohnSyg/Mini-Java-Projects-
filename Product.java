package Product;
public class Product
{
    private double price;

    public Product()
    {

    }

    public Product(double p)
    {
        price = p;
    }

    public double get()
    {
        return price;
    }

    public void set(double p)
    {
        price = p;
    }
}