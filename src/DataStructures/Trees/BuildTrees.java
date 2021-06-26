package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BuildTrees {
    public static Node buildTree(){
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        if(data == -1)
            return null;
        else{
            Node root = new Node(data);
            root.left = buildTree();
            root.right = buildTree();
            return root;
        }
    }
    public static void LevelOrderBuild(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the root node:");
        int data = sc.nextInt();

        Node root = new Node(data);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        while(!queue.isEmpty()){
            Node current = queue.peek();

            int LeftChild,RightChild;
            System.out.println("Enter the Left Node:");
            LeftChild = sc.nextInt();
            System.out.println("Enter the right Node:");
            RightChild = sc.nextInt();


            if(LeftChild != -1) {
                current.left = new Node(LeftChild);
                queue.add(current.left);
            }
            if(RightChild != -1)
            {
                current.right = new Node(RightChild);
                queue.add(current.right);
            }
            queue.remove();
        }

        LevelOrderTraversal(root);

    }
    public static void LevelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp == null) {
                System.out.println();
                if(!q.isEmpty())
                    q.add(null);
            }
            else{
                System.out.print(temp.data +" ");
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
//        Node Root = buildTree();
//        LevelOrderTraversal(Root);

        LevelOrderBuild();
    }
}
