import java.util.*;
import java.util.LinkedList;
import java.io.*;

class NodeNode {
    NodeNode left;
    NodeNode right;
    int data;
    
    NodeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution1 {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(NodeNode root) {

        NodeNode cur=root;

        Stack<NodeNode> q=new Stack<>();
        Queue<NodeNode> q1=new LinkedList<>();

        q.add(cur);
        
        if(q.size()!=0) {
        	NodeNode n=q.peek();
        	while(n.left!=null) {
        		q.add(n.left);
        		n=n.left;
        	}
        	while(q.size()!=0) {
        		System.out.print(q.pop().data+" ");
        	}
        	while(n.right!=null) {
        		q1.add(n.right);
        		n=n.right;
        	}
        	while(q1.size()!=0) {
        		System.out.print(" "+q1.poll().data);
        	}
        }
    }

	public static NodeNode insert(NodeNode root, int data) {
        if(root == null) {
            return new NodeNode(data);
        } else {
            NodeNode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}