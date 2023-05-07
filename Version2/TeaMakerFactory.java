package Version2;

public class TeaMakerFactory implements MakerFactory {
  
  public BeverageMaker createMaker() {
    return new TeaMaker() ;
  } // creatMaker()

}
