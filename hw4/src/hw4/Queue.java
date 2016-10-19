package hw4;

public class Queue {
    Node[] arr; // circular Queue
    int capacity;
    int front;
    int back;
    int size;
    
    public Queue(int cap){
        capacity = cap;
        size = -1;//size starts at -1, means that the actual size is size+1
        front = 0;
        back = 0;
        arr = new Node[capacity];
    }
    
    public void enqueue(Node node){
        if (!isFull()){
            //add node to arr at front index
            arr[back++] = node;
            ++size;
            if(back == capacity )
                back = 0;
        }else{
            System.out.println("Queue Overflow!!!");
        }
    }
    
    public Node dequeue(){
        
        if (!isEmpty()){
            //remove node from arr at back index
            --size;
            return arr[front++];
        }else{
            System.out.println("Queue Underflow!!!");
        }
        return null; // fix this (out of place)
    }
    
    public boolean isEmpty(){
        return size == -1;
    }
    
    public boolean isFull(){
        return size == capacity - 1;
    }
    
    public void printCircularIndices(){
        System.out.println("Front index = " + front + " Back index = " + back);
    }
    
    public void printQueue(){
        if (!isEmpty()){
            System.out.print("[Front] ");
            int i = front;
            int j = 0;
            while(j++ <= size)//print object(s) in queue size time(s)
            {
                if(i == capacity)
                    i = 0;
                System.out.print(arr[i++].data+" ");
            }
            System.out.println("[Back]");
        }else{
            System.out.println("Empty Queue!!!");
        }
    }
}
