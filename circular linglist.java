public class Node {
public int data;
public Node next;
public Node(int data) {
this.data = data;
next = null;
System.out.println(&quot;Node Created Success&quot;);
}
public void display(Node head) {
Node temp = head;
do {
System.out.print(&quot;===&gt;&quot; + temp.data);

temp = temp.next;
} while (temp != head);
}
public static void main(String[] args) {
Node f1 = new Node(10);
Node f2 = new Node(20);
Node f3 = new Node(30);
f1.next = f2;
f2.next = f3;
f3.next = f1;
Node head = f1;
System.out.println(&quot;Print Data of Singly Linked List&quot;);
head.display(f3);
}
}