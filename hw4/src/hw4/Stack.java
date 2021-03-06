package hw4;

public class Stack {
    Node[] arr; // regular array
    int capacity;
    int size;

    public Stack(int cap){
        capacity = cap;
        arr = new Node[capacity];
        size = -1;//size starts at -1, means that the actual size is size+1
    }
    
    public void push(Node node){
        if (!isFull()){
            // add node to arr
            arr[++size] = node;
        }else{
            System.out.println("Stack Overflow!!!");
        }
    }
    public Node pop(){
        if (!isEmpty()){
            // remove last node, simply change index
            return arr[size--];
        }else{
            System.out.println("Stack Underflow!!!");
        }
        return null;
    }
    public boolean isFull(){
        return size == capacity -1;
    }
    public boolean isEmpty(){
        return size == -1;
    }
    
    public void printStack(){
        if (!isEmpty()) {
            System.out.print("[Bottom] ");
            int i = 0;
            while(i <= size)//print from the first object to the last(size time(s))
            //i starts at 0 and increased its value after operates arr[i] operation
                System.out.print(arr[i++].data + " ");
            System.out.println("[Top]");
        } else {
            System.out.println("Empty Stack!!!");
        }
    }
}
