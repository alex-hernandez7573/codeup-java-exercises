public class Duck extends Bird{
    // Dukc inherits from bird
    // duck inherits all public methods
    // lets override


    //overrides makenoise
    public void makeNoise () {
        System.out.println(this.getName()+ "goes Quack Quack");
    }


}
