import java.util.Stack;
class Question232 {
    private Stack<Integer> input;
    private Stack<Integer> output;
    public Question232() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
         shiftStacks();
         return output.pop();
    }
    
    public int peek() {
         shiftStacks();
         return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
    //explaination 
    private void shiftStacks() {
        if (output.isEmpty()) { //true
            while (!input.isEmpty()) { //False 
                // input -> jb tk input false hai tb tk output ke andr input(input ko pop kr ke) ke value ko puch kro 
                output.push(input.pop());
            }
}
}
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */