import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int data; 
  Node left; 
  Node right; 
  Node(int val){
      data=val;
      left=right=null;
  }
}


class Tree { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
    	inorder(root);
    } 
    
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);    
        }
    } 

    /*public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right); 
            System.out.print(root.data+" ");   
        }
    }*/

    /*public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);    
        }
    } */
}
Code in Python:
class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key
 
 
# A function to do inorder tree traversal
def calcInorder(root):
 
    if root:
 
        # Recurring on left child
        calcInorder(root.left)
 
        # Printing data of node
        print(root.val, end=" "),
 
        # Recurring on right child
        calcInorder(root.right)
 
 
# A function to do postorder tree traversal
def calcPostorder(root):
 
    if root:
 
        # Recurring on left child
        calcPostorder(root.left)
 
        # Recurring on right child
        calcPostorder(root.right)
 
        # Printing data of node
        print(root.val, end=" "),
 
 
# A function to do preorder tree traversal
def calcPreorder(root):
 
    if root:
 
        # Printing data of node
        print(root.val, end=" "),
 
        # Recurring on left child
        calcPreorder(root.left)
 
        # Recurring on right child
        calcPreorder(root.right)
 
 
# Driver code
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

print ("Preorder: ")
calcPreorder(root)
 
print ("\nInorder: ")
calcInorder(root)
 
print ("\nPostorder: ")
calcPostorder(root)
