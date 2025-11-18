class Rectangles{
    int length;
    int breadth;
    public Rectangles() {
        this.length = 1;
        this.breadth = 1;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0){
            System.out.println("Length should be positive ");
            this.length=length;
        }else{
            this.length = length;
        }
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        if(breadth<0){
            System.out.println("Breadth should be positive");
            this.breadth=breadth;
        }else{
            this.breadth = breadth;
        }
    }
    public void displayArea(){
        int result=0;
        if(length>0 && breadth>0){
            result=length*breadth;
            System.out.println("Area of the rectangle : "+result);
        }else{
            System.out.println("Please Provide the Length and Breadth Again");
        }

    }
}
public class Rectangle {
    public static void main(String[] args){
        Rectangles rectangles = new Rectangles();
        rectangles.setBreadth(10);
        rectangles.setLength(20);
        rectangles.displayArea();
    }
}
