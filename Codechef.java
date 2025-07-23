import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc =new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    PriorityQueue<Integer>pq=new PriorityQueue<>();
	    for(int i=0;i<n;i++){
	        pq.add(sc.nextInt());
	    }
	    for(int i=0;i<k;i++){
	        int a=pq.poll();
	        int b=pq.poll();
	        int sum=a+b;
	        int avg;
	        if(sum%2==0)
	        avg=sum/2;
	        else
	        avg=(sum+1)/2;
	        pq.add(a);
	        pq.add(b);
	        pq.add(avg);
	    }
	    long total=0;
	    while(!pq.isEmpty()){
	        total+=pq.poll();
	    }
	    System.out.println(total);
	    }
	}

	}

