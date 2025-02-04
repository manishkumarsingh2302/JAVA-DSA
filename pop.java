public class ArrayClass1 {
static int STACK[] = new int[5];
static int top = -1;
//Member data
public static boolean isEmpty() {
return top == -1;
}
public static boolean isFull() {
return top == STACK.length - 1;
}
public static void push(int data) {
//step1: To check Over flow
if (isFull()) {
System.out.println("Stack Over flow");
}

//step2: Increase Top by 1
top++;
//step3: Assign value into the stack
STACK[top] = data;
System.out.println("Data Insert into the stack is success");
}
public static int pop() {
//step1: Check Under flow
int r = -1;
if (isEmpty()) {
System.out.println("Under Flow");
} else {
//step2: Assign data into another variable
r = STACK[top];
//step3: decreace top by 1
top--;
}
//step4: Return value of v
return r;
}
public static void display() {
if (isEmpty()) {
System.out.println("Stack is Empty");
} else {
System.out.println("Print Data of the Stack");
for (int i = top; i >= 0; i--) {
System.out.println("===" + STACK[i]);
}
}
}
public static int peek(){
if(!isEmpty()){
return STACK[top];
}else{
return -1;
}
}
public static void main(String[] args) {
push(10);
push(20);
push(30);
push(40);
push(50);
//push(60);
display();
System.out.println("Deleted Element :" + pop());
System.out.println("Deleted Element :" + pop());
System.out.println("Top Element of the Stack : "+peek());
System.out.println("Deleted Element : " + pop());
System.out.println("Deleted Element : " + pop());
System.out.println("Deleted Element : " + pop());
System.out.println("Deleted Element :"+pop());
}
}
