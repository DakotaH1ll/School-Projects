package csci2010u;
 
public class BTNode {
    public int data;
    public BTNode left;
    public BTNode right;
     
    public BTNode(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
     
    public String toString() {
        return ("data: " + data);
    }
}