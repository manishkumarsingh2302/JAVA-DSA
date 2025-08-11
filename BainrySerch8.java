//serch 16 in these given box [1,2,3,4,5,6,7,8,9,10] in binary serch?

class BainrySerch8{
    public static void main(String[] args) {
        int a []={1,2,3,4,5,6,7,8,9,10};
        int strt=0;
        int end=a.length-1;
        int mid=(strt+end)/2;
        int serch=8;
        while (strt<=end) {
            if(a[mid]==serch){
                System.out.println("our serch value id index ="+mid);
                break;
            } 

            else if(mid<serch){
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(strt+end)/2;
            
        }
    
        if(strt>end){
         System.out.println("your serch number not in this line");
        }
    }
}
