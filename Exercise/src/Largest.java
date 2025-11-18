class Dimensional{

    int[] num;
    public Dimensional(int[] num){
        this.num=num;
    }
    //Display The Highest Dimensional
    public void displayHighestDimensional(){
        if(num.length==0){
            System.out.println("The Largest Number in a Array is "+num[0]);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The Largest Number in a Array is "+max);
    }
}
public class Largest {
    public static void main(String[] args) {
        int[] arr={10,20,5,8,25};
        Dimensional dimensional=new Dimensional(arr);
        dimensional.displayHighestDimensional();
    }
}
