/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dsaj6;
/**
*
* @author Admin
*/
public class Tree {
public int data;
Tree left;
Tree right;
public Tree(int data) {
this.data = data;
left = null;
right = null;
}
public static void preOrder(Tree root) {
if (root == null) {
return;
}

//ROOT LEFT RIGHT
System.out.print(&quot;===&gt;&quot; + root.data);//ROOT
preOrder(root.left);//for Left Sub Tree
preOrder(root.right);
}
public static void inOrder(Tree root) {
if (root == null) {
return;
}
// LEFT ROOT RIGHT
inOrder(root.left);//for Left Sub Tree
System.out.print(&quot;===&gt;&quot; + root.data);//ROOT
inOrder(root.right);//Right Sub Tree
}
public static void postOrder(Tree root) {
if (root == null) {
return;
}
// LEFT RIGHT ROOT
postOrder(root.left);//for Left Sub Tree
postOrder(root.right);//Right Sub Tree
System.out.print("===>" + root.data);//ROOT
}
public static Tree insert(Tree root,int data){
if(root==null){
return new Tree(data);
}
if(data&lt;root.data){
root.left=insert(root.left, data);
}else{
root.right=insert(root.right, data);
}
return root;
}
public static void main(String[] args) {
Tree t1 = new Tree(100);
Tree t2 = new Tree(20);
t1.left = t2;
Tree t3 = new Tree(500);
t1.right = t3;
Tree t4 = new Tree(10);
t1.left.left = t4;
Tree t5 = new Tree(30);
t1.left.right = t5;
insert(t1, 40);
insert(t1, 5);
insert(t1, 200);

insert(t1, 600);
System.out.println("\nPrint Data of Tree Using In order Tree Trevarsal ");
inOrder(t1);
}
}