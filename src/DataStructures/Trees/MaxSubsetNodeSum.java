package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pa{
    int include,exclude;
}
public class MaxSubsetNodeSum {
    public static pa subsetSum(Node root){
        pa p = new pa();
        if(root == null)
        {
            p.include = p.exclude = 0;
            return p;
        }
        pa Left = subsetSum(root.left);
        pa Right = subsetSum(root.right);

        p.include = root.data + Left.exclude + Right.exclude;
        p.exclude = Math.max(Left.include, Left.exclude) + Math.max(Right.include, Right.exclude);

        return p;
    }
    
    public static void KPrints(Node root,int k) {
        if(root == null || k < 0)
            return;

        if (k == 0)
        {
            System.out.print(root.data + " ");
            return;
        }
        if (root.left != null)
            KPrints(root.left, k-1);

        if (root.right != null)
            KPrints(root.right, k-1);
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
        sc.close();
        return root;
    }

    public static void main(String[] args) {
        Node Root = TreeBuildingLevelWise();

        pa result = subsetSum(Root);

        System.out.println(Math.max(result.include, result.exclude));

        KPrints(Root,2);
    }
}
