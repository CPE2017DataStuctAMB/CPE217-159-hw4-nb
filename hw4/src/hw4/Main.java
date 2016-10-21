package hw4;

public class Main {

    public static void main(String[] args)  {
        testCase(5);
    }

    private static Node constructTree1() {
        Node t0 = new Node(3);
        Node t1 = new Node(7);
        Node t2 = new Node(5);
        Node t3 = new Node(2);
        Node t4 = new Node(6);
        Node t5 = new Node(9);
        Node t6 = new Node(1);
        Node t7 = new Node(8);
        Node t8 = new Node(4);

        t0.setLeft(t1);
        t0.setRight(t2);

        t1.setLeft(t3);
        t1.setRight(t4);

        t4.setLeft(t6);
        t4.setRight(t7);

        t2.setRight(t5);
        t5.setLeft(t8);

        return t0;
    }

    private static Node constructTree2() {
        Node t0 = new Node(1);
        Node t1 = new Node(2);
        Node t2 = new Node(3);
        Node t3 = new Node(4);
        Node t4 = new Node(5);
        Node t5 = new Node(6);
        Node t6 = new Node(7);
        Node t7 = new Node(8);
        Node t8 = new Node(9);
        Node t9 = new Node(10);

        t0.setLeft(t1);
        t0.setRight(t2);
        t1.setRight(t4);
        t1.setLeft(t3);
        t4.setLeft(t6);
        t4.setRight(t7);
        t7.setRight(t9);

        t2.setRight(t5);
        t5.setLeft(t8);

        return t0;
    }

    public static void testCase(int n){
        if (n == 0){
            Node tree = constructTree1();
            tree.printTree();
        }
        else if (n == 1){
            Node tree = constructTree2();
            tree.printTree();
        }
        else if(n == 2){
            Stack s = new Stack(4);
            s.pop();
            s.push(new Node(5));
            s.push(new Node(6));
            s.push(new Node(7));
            s.push(new Node(8));s.printStack();
            s.push(new Node(9));
            System.out.println(s.pop().data);
            System.out.println(s.pop().data);
            System.out.println(s.pop().data);
            s.printStack();
        }
        else if (n == 3){
            Queue q = new Queue(4);
            q.dequeue();
            q.enqueue(new Node(5));
            q.enqueue(new Node(6));
            q.enqueue(new Node(7));
            q.enqueue(new Node(8));
            q.printQueue();
            q.enqueue(new Node(9));
            System.out.println(q.dequeue().data);
            System.out.println(q.dequeue().data);
            System.out.println(q.dequeue().data);
            q.printQueue();
        }
        else if (n == 4){
            Queue q = new Queue(4);
            q.printCircularIndices();
            q.enqueue(new Node(5));
            q.enqueue(new Node(6));
            q.printCircularIndices();
            q.enqueue(new Node(7));
            q.enqueue(new Node(8));
            q.printCircularIndices();
            q.printQueue();
            System.out.println(q.dequeue().data);
            q.printCircularIndices();
            System.out.println(q.dequeue().data);
            q.printCircularIndices();
            System.out.println(q.dequeue().data);
            q.printCircularIndices();
            q.enqueue(new Node(9));
            q.enqueue(new Node(10));
            q.enqueue(new Node(11));
            q.printQueue();
        }
        else if (n == 5){
            Node tree = constructTree1();
            tree.printTree();
            tree.printBFT();
            tree.printDFT();
        }
    }



}
