package Version1 ;
abstract class BeverageMaker {

  // Essential Step, Need To Implement Method
  abstract void brew() ;

  public void addCondiment() {} // Optional: addCondiment()
  public void addIce() {} // Optional: addIce()

  // Essential Step
  private void boilWater() {
    System.out.println( "煮水" ) ;
  } // boilWater()
  
  // Essential Step
  private void pourInCup() {
    System.out.println( "倒進杯子" ) ;
  } // pourInCup()

  public final void prepare() {
    boilWater() ;    // Step 1
    brew() ;         // Step 2
    pourInCup() ;    // Step 3
    addIce() ;       // Step 4
    addCondiment() ; // Step 5
  } // prepare()

} // class BeverageMaker