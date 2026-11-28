package PAVANSIR.NON_PRIMITIVE_ARRAY;
import java.util.*;
class product{
  String name;
  int rating;
  double price;
  product(String name,int rating,double price){
    this.name=name;
    this.rating=rating;
    this.price=price;
  }
  @Override
  public String toString(){
    return "Product{name='" + name +"', rating=" + rating +", price=" + price + "}";
  }
}
public class Program3 {
    public static void main(String[] args) {
      product[]p={new product("watermelonseeds",5,500.0),
      new product("pumpkinseeds",5,360.0),
      new product("sunflowerseeds",4,520.0),
      new product("flaxseeds",3,490.0),};
      double totalPrice=0;
      for(product ele:p){
        totalPrice+=ele.price;
      }
      System.out.println("GrandTotal Amount to be paid:"+ totalPrice);
    }
}
