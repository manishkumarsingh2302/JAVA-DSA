//print given matrix a[][]={{1,2,3,4,5},{3,4,5},{5,6,78,0}}?
    
class main2{
    public static void main(String[] args) {
        int a[][][]={{1,2,3,4,5},{3,4,5},{5,6,78,0},{1,2,3,4,56}};
        for (int i=0;i<=a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++){ 
            
                System.out.print(a[i][j][k] +" ");
            }
            System.out.println();
        }
    }
}

}