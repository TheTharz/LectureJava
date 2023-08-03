public class ControlFlows {
    public static void main(String[] args){
        /*int marks = Integer.parseInt(args[0]);

        if(marks>70){
            System.out.println("Grade A");
        }else if(marks>55){
            System.out.println("Grade B");
        }else if(marks>40){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }*/

        int arr[] = {3,2,6,7,8};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
}
