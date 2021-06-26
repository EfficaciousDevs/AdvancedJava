package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class HDpair{
    int height,diameter;
}

public class TreeDiameter {
    public static int Height(Node root){
        if(root == null)
            return 0;
        else{
            int hLeft = Height(root.left);
            int hRight = Height(root.right);

            return 1 + Math.max(hLeft,hRight);
        }
    }

    public static int Diameter(Node root){
        if(root == null)
            return 0;
        else{
            int d1 = Height(root.left) + Height(root.right);
            int d2 = Diameter(root.left);
            int d3 = Diameter(root.right);

            return Math.max(d1,Math.max(d2,d3));
        }
    }
    public static HDpair OptimizedDiameter(Node root){
        HDpair pair = new HDpair();
        if(root == null)
        {
             pair.height = pair.diameter = 0;
             return pair;
        }
        else{
            HDpair Left = OptimizedDiameter(root.left);
            HDpair right = OptimizedDiameter(root.right);
            pair.height = 1 + Math.max(Left.height, right.height) ;

            int dia1 = Left.height + right.height;
            int dia2 = Left.diameter;
            int dia3 = right.diameter;

            pair.diameter = Math.max(dia1,Math.max(dia2,dia3));

            return pair;
        }
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

    public static void LevelWiseTraversal(Node root){
        Queue<Node> TreeQueue = new LinkedList<>();
        TreeQueue.add(root);
        TreeQueue.add(null);

        while(!TreeQueue.isEmpty()){
            Node temp = TreeQueue.poll();
            if(temp == null) {
                System.out.println();
                if(!TreeQueue.isEmpty())
                    TreeQueue.add(null);
            }
            else{
                System.out.print(temp.data +" ");
                if(temp.left != null)
                    TreeQueue.add(temp.left);
                if(temp.right != null)
                    TreeQueue.add(temp.right);
            }
        }
    }

    public static void PreOrderTraversal(Node root){
        if (root == null) {
            return;
        }
        else{
            System.out.print(root.data +" ");
            PreOrderTraversal(root.left);
            PreOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node Root = TreeBuildingLevelWise();
        LevelWiseTraversal(Root);

        System.out.println("Diameter Length: " + Diameter(Root));
        System.out.println("Diameter Value: " + OptimizedDiameter(Root).diameter);
        PreOrderTraversal(Root);
    }
}

