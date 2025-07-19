//febonacci serics print 15 times? exmpale 0,1,1,2,3,5,8,13........etc
   
 class FebonacciSerics{
   public static void main (String args[]){
    int no1=0;
    int no2=1;
   System.out.print(no1+","+no2);

   int times=15;
   for(int i=3;i<=times;i++){
   int sum=no1+no2;
   System.out.print(","+sum);
   no1=no2;
   no2=sum;
   
}
}
} 