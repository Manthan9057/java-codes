import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int key;
    Node left;
    Node right;
    Node(int k) 
    {
        key = k;
        left = right = null;
    }
}

class Main {
    public static void main (String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);
        root.right.right = new Node(65);
        
        if(Bal(root) > 0)
        System.out.println("balanced");
        else
        System.out.println("not balanced");
    }
    
    public static int Bal(Node root) {
        if(root == null)
        return 0;
        int lh = Bal(root.left);
        if(lh == -1)
        return -1;
        
        int rh = Bal(root.right);
        if(rh == -1)
        return -1;
        if(Math.abs(lh-rh) > 1)
        return -1;
        else
        return Math.max(lh, rh) + 1;
    }
}