package DataStructures.Trees;

class pair{
    int height;
    boolean balanced;
}
public class BalancedTree {
    public static pair isBalanced(Node root){
        pair p = new pair();
        if(root == null){
            p.height = 0;
            p.balanced = true;
            return p;
        }
        else{
            pair Left = isBalanced(root.left);
            pair Right = isBalanced(root.right);
            int Height = Math.max(Left.height, Right.height)+ 1;

            if(Math.abs(Left.height - Right.height ) <= 1 && Left.balanced && Right.balanced){

                p.height = Height;
                p.balanced = true;
                return p;
            }
            else
            {
                p.height = Height;
                p.balanced = false;
                return p;
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.right= new Node(6);
        root.left.right.left= new Node(7);
        root.left.right.right= new Node(8);
//        root.left.right.right.left = new Node(9);
//        root.left.right.right.right= new Node(10);

        if(isBalanced(root).balanced)
            System.out.println(isBalanced(root).height );
        else
            System.out.println("Tree Not Balanced");
    }
}
