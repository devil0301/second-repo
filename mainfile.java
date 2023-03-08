import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,temp=0,count=0;
    
        System.out.println("Enter number:");
        n=sc.nextInt();
        int sr=n;
        //System.out.println(sr);
        for(int i=1;i<n;i++){
            if (i%2!=0)   {
                temp=i;
            
                sr=sr-temp;
                count++;
                if(sr==0){
                System.out.println(count);
                }
            }
        }
        
        
    }
}
