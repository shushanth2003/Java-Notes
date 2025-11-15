class Message{
    String name;
    public Message(String name){
        this.name=name;
    }

    //Display the Message
    public void displayName(){
        System.out.println("Hello this is "+name);
    }
}
public class MessagePrinter {
    public static void main(String[] args){
        Message m=new Message("Shushanth");
        m.displayName();
    }
}
