abstract class Coffee{
  public abstract int getPrice()

  @override
  public String toString(){
    return 'Hi this coffee is' + this.getPrice()
  }
}

class CoffeFactory {
  public static Coffee getCoffee(String type, int price){
    if('Latte'.equalsIgnoreCase(type)) {return new Latte(price)}
    else if('Americano'.equalsIgnoreCase(type)){
      return new Americano(price)
    }
    else{
      return new DefaultCoffee();
    }
  }
}

class DefaultCoffee extends Coffee{
  private int price;

  public DefaultCoffee(){
    this.price =-1;
  }

  @override
  public int getPrice(){
    return this.price
  }
}

class Latte extends Coffee{
  private int price;

  public Latte(int price){
    this.price = price
  }
  @override
  public int getPrice(){
    return this.price
  }
}


class Americano extends Coffee{
  private int price;

  public Americano(int price){
    this.price = price
  }
  @override
  public int getPrice(){
    return this.price
  }
}

public class HelloWorld{
  public static void main(String[] args){
    Coffee latte = CoffeFactory.getCoffee('Latte', 4300)
    Coffee americano = CoffeFactory.getCoffee('Americano', 4300)
    System.out.println('Factory latte ::'+latte)
    System.out.println('Factory americano ::'+americano)
  }
}