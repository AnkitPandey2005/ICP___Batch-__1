import java.util.*;

public class Three_Sum {
    static void main() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        List<List<Integer>> result = threesum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threesum(int[] arr){
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        //sort the array so we don't need any external dataset
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            //for escape for duplicate
            if(i>0 && arr[i]==arr[i-1]) continue;
            //move 2 pointer
            int j=i+1; //move left to right
            int k=n-1; //move right to left

            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    //skip duplicate for j and k
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k-1]) k++;
                }
            }
        }
        return ans;
    }
}
