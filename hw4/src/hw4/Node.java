package hw4;

public class Node extends BTreePrinter{

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void printTree() {
        // uncomment the following line (and fix the error)
        super.printTree(this);
    }

    public void printBFT() {
        Queue q = new Queue(50);
        System.out.print("BFT node sequence [ ");
        q.enqueue(this);
        while(!q.isEmpty())
        {
            Node currentNode = q.dequeue();
            System.out.print(currentNode.data+" ");
            if(haveChild(currentNode.left))
                q.enqueue(currentNode.left);
            if(haveChild(currentNode.right))
                q.enqueue(currentNode.right);
        }
        System.out.println("]");
    }

    public void printDFT() { // PreOrder
        Stack s = new Stack(50);
        System.out.print("DFT node sequence [ ");
        s.push(this);
        while(!s.isEmpty())
        {
            Node currentNode = s.pop();
            if(haveChild(currentNode.right))
                s.push(currentNode.right);
            if(haveChild(currentNode.left))
                s.push(currentNode.left);
        }
        System.out.println("]");
    }

    private boolean haveChild(Node node)
    {
        return node != null;
    }
}
