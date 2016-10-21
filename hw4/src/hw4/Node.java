package hw4;

public class Node extends BTreePrinter {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        //Set init
        this.data = data;
    }

    public void printTree() {
        BTreePrinter btree = new BTreePrinter();
        // uncomment the following line (and fix the error)
        btree.printTree(this);
    }

    public void printBFT() {
        Queue q = new Queue(50);
        System.out.print("BFT node sequence [ ");
        System.out.println("]");
    }

    public void printDFT() { // PreOrder
        Stack s = new Stack(50);
        System.out.print("DFT node sequence [ ");
        System.out.println("]");
    }

    public void setLeft(Node ls){
        this.left = ls;
    }

    public void setRight(Node rs){
        this.right = rs;
    }

}
