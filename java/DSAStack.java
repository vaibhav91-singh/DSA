import java.util.Stack;
class DSAStack{
    public static void main(String[]args){
        Stack<String> mystack = new Stack<>();
        mystack.push("Vaibhav");
        mystack.push("Ayush");
        mystack.push("Ayush");
        mystack.push("Shubham");
        mystack.push("Aditya");
        System.out.println(mystack);
        System.out.println("Top of the Stack is : " + mystack.peek());
        System.out.println("Check Stack is Empty or not : "+mystack.empty());
        mystack.pop();
        System.out.println(mystack);
    }
}



