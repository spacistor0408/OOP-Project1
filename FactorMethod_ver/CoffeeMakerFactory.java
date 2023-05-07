package FactorMethod_ver ;

public class CoffeeMakerFactory implements MakerFactory {
    
  public BeverageMaker createMaker() {
    return new CoffeeMaker() ;
  } // creatMaker()

}
