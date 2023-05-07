package FactorMethod_ver;

public class TeaMakerFactory implements MakerFactory {
  
  public BeverageMaker createMaker() {
    return new TeaMaker() ;
  } // creatMaker()

}
