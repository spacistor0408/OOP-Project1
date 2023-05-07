### OOP ASSIGNMENT 1
##### Update Date: 2023/ 5/ 7
1. `class BeverageMaker`的`prepare()`把Step1- Step5的SOP寫清楚
2. `addIce()`和`addCondiment()`因為是選擇性要或不要，所以方法中沒寫內容，表示甚麼事情都不做
3. `brew()`定義為abstract，因為每個飲料製作方式皆不相同 

---
### BeverageMaker
**prepare**
因為是連鎖店，有固定的SOP，所以在Prepare裡面就已經寫好製作步驟，並使用Final讓subclass無法隨意改動
```java
public final void prepare() {
  boilWater() ;    // Step 1
  brew() ;         // Step 2
  pourInCup() ;    // Step 3
  addIce() ;       // Step 4
  addCondiment() ; // Step 5
} // prepare()
```
**addCondiment & addIce**
由於不一定會加冰塊或加其他添加物，但為了保持SOP一致，所以在這裡就先寫好Method，如果subclass有需要再自己實做內容即可
```java
  public void addCondiment() {} // Optional: addCondiment()
  public void addIce() {} // Optional: addIce()
```
**brew**
每個飲料製作方法都不一樣，所以這邊由subclass自己決定要怎麼實做
```java
abstract void brew() ;
```
**boilWater & pourInCup**
每個飲料都一定要煮水和倒進杯子，因為要做的事情完全相同，所以以private的方式，防止subclass隨意修改造成飲料店大亂
```java
private void boilWater() {
  System.out.println( "煮水" ) ;
} // boilWater()

private void pourInCup() {
  System.out.println( "倒進杯子" ) ;
} // pourInCup()
```

### CoffeeMaker
實做`brew()`的內容，因為煮咖啡要把熱水倒進磨好的咖啡粉裡
```java
public void brew() {
  System.out.println( "把熱水倒進磨好的咖啡粉" ) ;
} // brew()
```
因為我想要喝甜的熱拿鐵，所以就實做了`addCondiment()`的內容
```java
public void addCondiment() {
  System.out.println( "添加糖和牛奶" ) ;
} // addCondiment()
```

### TeaMaker
實做`brew()`，茶葉首泡1分鐘，回沖2分鐘，一共3分鐘
```java
public void brew() {
  System.out.println( "浸泡茶葉3分鐘" ) ;
} // brew()
```
實做`addIce()`，天氣炎熱想喝冰的，決定喝微冰
```java
public void addIce() {
  System.out.println( "加微冰" ) ;
} // addIce()
```

