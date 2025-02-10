Algorithm to delete first node of Singly Linked List
Step1: Check if the list is empty or not
Step2: Store the current head in a temporary variable
Step3: Move the head pointer to the next node
Step4: free the memory of the deleted node
temp=null;
Step5: Return new head
==========================================================================================
 /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dsafeb2025;
/**
*
* @author Admin
*/
public class Node {
int data;
Node next;
public Node(int data) {
this.data = data;
next = null;
System.out.println(&quot;Node created Success&quot;);
}
public void display(Node head){
Node temp=head;

while(temp!=null){
System.out.print(&quot;----&gt;&quot;+temp.data);//10---&gt;20---&gt;30---&gt;40
temp=temp.next;
}
}
public Node addNodeAtStart(Node head,int data){
//step1: Create a new Node
Node newNode=new Node(data);
//step2: Make Point NewNode to Current Node
newNode.next=head;
//step3: Update head
head=newNode;
//step4: return new head
return head;
}
public void addNewNodeAtEnd(Node head,int data){
//step1:Create new Node
Node newNode=new Node(data);
//step2: Traverse the list
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
//step3: Setting the last node next pointer to the new node
temp.next=newNode;
}
public void addNewNodeAtPos(Node head,int data,int pos){
//step1: Create a new Node
Node newNode=new Node(data);
//step2: Traverse the list upto specified position
pos--;//3
Node temp1=head;
Node temp2=head.next;
while(pos&gt;1){
temp1=temp1.next;
temp2=temp2.next;
pos--;//1
}
temp1.next=newNode;
newNode.next=temp2;
}
public boolean isEmpty(Node head){
return head==null;
}
public Node deleteFirstNode(Node head){
//step1: Check the list is empty
if(isEmpty(head)){
System.out.println(&quot;List is Empty&quot;);
}else{
//step2: Store head into temporary variable
Node temp=head;
//step3: Move head to the next node
head=head.next;
//step4: Free memory of the temporary variable
temp=null;

}
return head;
}
public static void main(String[] args) {
Node first = new Node(10);
Node second = new Node(20);
Node third = new Node(30);
//Head point the first node of singly Linked List
Node head=first;
first.next=second;
second.next=third;
System.out.println("Print Data of Singly Linked List");
System.out.println("===>"+first.data+"===>"+second.data+"===>"+third.data);
System.out.println("Print Data of Singly Linked List Using head");
System.out.print("===>"+head.data);
System.out.print("===>"+head.next.data);
System.out.print("===>"+head.next.next.data);
System.out.println("Print Data of Singly Linked List Using Method");
head.display(head);
// head=head.addNodeAtStart(head, 5);
System.out.println("\nPrint Data after New Node at starting in singly linked List");
head.display(head);
System.out.println("print Data After Add new Node at end of singly linked List");
head.addNewNodeAtEnd(head, 40);
head.display(head);
System.out.println("\nPrint Data after insert new Node at Specific position\n");
head.addNewNodeAtPos(head,35,4);
head.display(head);
head=head.deleteFirstNode(head);
System.out.println("\nPrint data of singly Linked List After deletion first Node \n");
head.display(head);
}
}