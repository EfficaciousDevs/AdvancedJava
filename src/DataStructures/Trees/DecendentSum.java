package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DecendentSum {
    public static int Dsum(Node root) {
        //Base Case
        if (root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.data;

        //Recursive Case
        int Lsum = Dsum(root.left);
        int Rsum = Dsum(root.right);

        int temp = root.data;
        root.data = Lsum + Rsum;

        return temp + root.data;
    }

    public static Node TreeBuildingLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<Node> Tqueue = new LinkedList<>();
        System.out.println("Enter the Root node:");
        int data = sc.nextInt();
        Node root = new Node(data);
        Tqueue.add(root);

        while(!Tqueue.isEmpty()){
            Node currentNode = Tqueue.peek();
            System.out.println("Enter the " + currentNode.data + " LeftChild data");
            int dataL = sc.nextInt();
            if(dataL != -1) {
                currentNode.left = new Node(dataL);
                Tqueue.add(currentNode.left);
            }
            System.out.println("Enter the " + currentNode.data + " RightChild data");
            int dataR = sc.nextInt();
            if(dataR != -1) {
                currentNode.right = new Node(dataR);
                Tqueue.add(currentNode.right);
            }

            Tqueue.remove();
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = TreeBuildingLevelWise();
        System.out.println(Dsum(root));
    }
}
