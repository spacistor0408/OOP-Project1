package Version1 ;
public class Test {
  public static void main(String[] args) {
    
    System.out.println( "Tes1:" ) ;
    BeverageMaker coffee = new CoffeeMaker() ;
    coffee.prepare() ;
    
    System.out.println( "Tes2:" ) ;
    BeverageMaker tea = new TeaMaker() ;
    tea.prepare() ;

  } // main()

} // class Test
