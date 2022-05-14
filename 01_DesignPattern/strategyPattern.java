import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
  public void pay(int amount)
}

class KAKAOCardStrategy implements PaymentStrategy{
  private String name;
  private String cardNumber;
  private String cvv;
  private String dateOfExpiry;

  public KAKAOCardStrategy(String nm, String ccNum, String cvv, String expiryData){
    this.name = nmn
    this.cardNumber = ccNum
    this.cvv = cvv
    this.dateOfExpiry = expiryData
  }

  @override{
    public void pay(int amount){
      System.out.println(amount+'paid using KAKAO card')
    }
  }
}

class LUNACardStrategy implements PaymentStrategy{
  private String emailId;
  private String password;

  public LUNACardStrategy(String email, String pwd){
    this.emailId = email
    this.password = pwd
  }

  @override{
    public void pay(int amount){
      System.out.println(amount+'paid using LUNA card')
    }
  }
}

class Item {
  private String name;
  private int price;

  public Item(String name, int cost){
    this.name = name
    this.price = cost
  }

  public String getName(){
    return name
  }
  public int getPrice(){
    return price
  }
}

class ShoppingCart{
  List<Item> items

  public ShoppingCart(){
    this.items = new ArrayList<Item>()
  }

  public void addItem(Item item){
    this.items.add(item)
  }

  public void removeItem(Item item){
    this.items.remove(item)
  }

  public int calculateTotal(){
    int num = 0;
    for(Item item: items){
      sum += item.getPrice()
    }
    return sum
  }

  public void pay (PaymentStrategy paymentMethod){
    int amout = calculateTotal();
    paymentMethod.pay(amount)
  }
}

public class HelloWorld {
  public static void main (String[] args){
    ShoppingCart cart = new ShoppingCart();

    Item A = new Item('AA', 100);
    Item B = new Item('BB', 300);

    cart.addItem(A)
    cart.addItem(B)

    cart.pay(new LUNACardStrategy('seohyeon@gmail.com', '!pwd'))
    cart.pay(new KAKAOCardStrategy('seohyeon', '123433828', '456', '12/01'))
  }
}