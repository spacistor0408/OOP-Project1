package FactorMethod_ver ;

public class Test {
  public static void main(String[] args) {
    
    MakerFactory makerFactory = null ;
    BeverageMaker maker = null ;

    System.out.println( "Tes1: Coffee Maker" ) ;
    makerFactory = new CoffeeMakerFactory() ;
    maker = makerFactory.createMaker() ;
    maker.prepare() ;
    
    System.out.println( "Tes2: Tea Maker" ) ;
    makerFactory = new TeaMakerFactory() ;
    maker = makerFactory.createMaker() ;
    maker.prepare() ;

  } // main()

} // class Test
