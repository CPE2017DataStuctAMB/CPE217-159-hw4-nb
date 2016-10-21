package hw4;

public class Node extends BTreePrinter {

    Node left;
    Node right;
    int data;

    public Node(int data) {
        //Set init
        this.data = data;
        this.setLeft(null);
        this.setRight(null);
    }

    public void printTree() {
        BTreePrinter btree = new BTreePrinter();
        // uncomment the following line (and fix the error)
        btree.printTree(this);
    }

    public void printBFT() {
        Queue q = new Queue(50);
        System.out.print("BFT node sequence [ ");
        //this.inOrderTravel();
        System.out.println("]");
    }

    public void printDFT() {
        // PreOrder
        Stack s = new Stack(50);

        System.out.print("DFT node sequence [ ");
        this.preOrderTravel();
        System.out.println("]");
    }

    public void setLeft(Node ls){
        //Set left side Node
        this.left = ls;
    }

    public void setRight(Node rs){
        //Set Right side Node
        this.right = rs;
    }

    public void makeTree(Node ls, Node rs) {
        //This function make the tree completed node
        this.setLeft(ls);
        this.setRight(rs);
    }

    public void preOrderTravel(){
        System.out.print(data+" ");
        if(this.left != null){
            left.preOrderTravel();
        }
        if(this.right != null){
            right.preOrderTravel();
        }
    }
    public void inOrderTravel(){
        if(this.left != null){
            left.inOrderTravel();
        }
        System.out.print(data+" ");
        if(this.right != null){
            right.inOrderTravel();
        }
    }

}
