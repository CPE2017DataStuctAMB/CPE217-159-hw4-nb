package hw4;

public class Stack {
    Node[] arr; // regular array
    int capacity;
    int size;

    public Stack(int cap){
        capacity = cap;
        arr = new Node[capacity];
        size = -1;
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
            int i = -1;
            while(++i <= size)
                System.out.print(arr[i].data + " ");
            System.out.println("[Top]");
        } else {
            System.out.println("Empty Stack!!!");
        }
    }
}
