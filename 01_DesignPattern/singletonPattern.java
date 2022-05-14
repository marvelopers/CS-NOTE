class Singleton{
  private static class singletonInstanceHolder{
    private static final Singleton INSTANCE = new Singleton();
  }

  public static synchronized Singleton getInstance(){
    return singletonInstanceHolder.INSTANCE;
  }
}

public class HelloWorld{
  public static void main(String[] args){
    Singleton a = Singleton.getInstance()
    Singleton b = Singleton.getInstance()
    System.out.println(a.hashCode())
    System.out.println(b.hashCode())
    if(a==b){
      System.out.println(true)
    }
  }
}