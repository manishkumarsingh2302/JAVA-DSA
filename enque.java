//Algorithm of enque() operation of Queue Data Structure

// Step1: First Check Over flow Condition

//Step2: To check Queue is Empty Increase front and rear by 1

//Step3: If queue is Not Empty then increase rear by 1

//Step4: Insert data into queue

========================================================================================

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import static array1.QueueDEMO.rear;

 public class QueueDEMO {

static int Q[] = new int[6];

static int front = -1;

static int rear = -1;

public static boolean isEmpty(){ 
    return front==-1 && rear==-1;
}

public static boolean isFull(){
    return rear==Q.length-1;
} 

public static void enq(int data) {

// Step1: First Check Over flow Condition 
if(isFull()){ 
    System.out.println("This over flow condition");

}else if(isEmpty()){

//Step2: To check Queue is Empty Increase front and rear by 1 
front++;
rear++;
//Step4: Insert data into queue

Q[rear]=data;

System.out.println("First Element Insert into the queue");

}else{

//Step3: If queue is Not Empty then increase rear by 1

rear++;

Q[rear]=data;

System.out.println("Data Insert after First Element");

}

}

public static void main(String[] args) {

enq(10);

enq(20);

enq(30);

enq(40);

enq(50);

enq(60);

enq(70);



}
 }
 