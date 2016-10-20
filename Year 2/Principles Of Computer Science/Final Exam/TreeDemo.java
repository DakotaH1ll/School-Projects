package csci2010u;
 
public class TreeDemo {
 
    public static void main(String[] args) {
        //Testing BinaryTree class
 
        //Test the constructor
        BinaryTree testTree = new BinaryTree();
        System.out.println("testing print empty tree");
        System.out.println(testTree.toString());
        testTree.printInOrder();
 
        //Test sorted insert method
        testTree.insertSorted(5);
        System.out.println("testing print one node tree");
        System.out.println(testTree.toString());
        testTree.printInOrder();
 
        testTree.insertSorted(10);
        System.out.println("testing print two node tree");
        System.out.println(testTree.toString());
        testTree.printInOrder();
 
        testTree.insertSorted(2);
        testTree.insertSorted(3);
        System.out.println("testing print general-case binary tree");
        System.out.println(testTree.toString());
        testTree.printInOrder();
 
 
        System.out.println("\n\ntesting find method in binary tree");
        int data = 2;
        BTNode temp = testTree.find(data);
        if (temp == null) {
            System.out.println(data + " not found!");
        } else {
            System.out.println(data + " found!");
            if (temp.left != null)
                System.out.println(temp.data + " -> " + temp.left.data + " [left]");
            if (temp.right != null)
                System.out.println(temp.data + " -> " + temp.right.data + " [right]");
        }
 
    }
 
}