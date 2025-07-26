//print Array {12,45,78,45};{48,56,85};{78,78}?
 
class Array1{
public static void main(String args[]){
 int [][]a={{12,45,78,45},{48,56,85},{78,78}};

for(int i=0;i<a.length;i++){

for(int j=0;j<a[i].length;j++){
    System.out.print(a[i][j]+" ");
}

System.out.println();

}
}


} 



