package Version2 ;

public class CoffeeMakerFactory implements MakerFactory {
    
  public BeverageMaker createMaker() {
    return new CoffeeMaker() ;
  } // creatMaker()

}
