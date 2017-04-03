class SimpleBird {
  private int worms_count; 
  public static final String SWIM_MESSAGE = "Hello, I'm not swimming";
  
  public void fly(){}
  
  public void сatch_worms(int worms_count) {
    this.worms_count = this.worms_count + worms_count;
  }
  
  public void swim(){
    System.out.println(SWIM_MESSAGE);
  }
}

class Duck extends SimpleBird {
  public static final String SWIM_MESSAGE = "Hello, I'm swimming on the lake";
}

class Pelican extends SimpleBird {
  public static final String SWIM_MESSAGE = "Hello, I'm swimming on the sea";
}

class Penguin extends SimpleBird{  
  fly(){
    throw new UnsupportedOperationException();
  }
}

class SmartBird extends SimpleBird {
  public void сatch_worms(int worms_count) {
    this.worms_count = this.worms_count + сatch_worms*2;
  }
}
 
public BirdTest{
  public static void main(String[] args){
    List<Bird> birdList = new ArrayList<Bird>();
    birdList.add(new SimpleBird());
    birdList.add(new Duck());
    birdList.add(new Pelican());
    birdList.add(new Penguin());
    birdList.add(new SmartBird());

    letTheBirdsFly ( birdList );
    letTheBirdsSwim ( birdList );
  }
  
  static void letTheBirdsFly ( List<Bird> birdList ){
    for ( Bird b : birdList ) {
      b.fly();
    }
  }
  static void letTheBirdsSwim ( List<Bird> birdList ){
    for ( Bird b : birdList ) {
      b.swim();
    }
  }
  
  public void CheckBehaviourForCatchingWorms( bird SimpleBird )
  {
    initial_worms_count = bird.worms_count
    bird.сatch_worms(1);
  
    Assert.Equal(initial_worms_count + 1, bird.worms_count);
  }
}
