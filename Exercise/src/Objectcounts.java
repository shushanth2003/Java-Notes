class Objectcounter{
    int counter;
    public Objectcounter(){
        counter=0;
    }
    public void displayCounter(){
        counter++;
        System.out.println("Object Counter : "+counter);
    }
}
public class Objectcounts {
    public static void main(String[] args) {
        Objectcounter objectcounter=new Objectcounter();
        objectcounter.displayCounter();
        objectcounter.displayCounter();
        objectcounter.displayCounter();
    }
}
