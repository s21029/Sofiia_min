import java.util.ArrayList;

public class Category {

    ArrayList<String> Products ;
    String Name;

    public Category(){};
    public Category(String name) {
        this.Name = name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }


    public ArrayList<String> getProducts() {
        return Products;
    }
    public void setProducts(ArrayList<String> products) {
        Products = products;
    }



    public Category(String name, ArrayList<String> Product ) {
        this.Name = name;
        this.Products = Products;
    }


    public void setProducts(String a) {
    }
}


