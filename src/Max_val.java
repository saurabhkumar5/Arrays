public class Max_val {
    public static void main(String[] args) {
        int [] arr = {1,5,3,56,23,3};
        //if (arr[0]>arr[1] && arr[0]>arr[2]){
           // System.out.println(arr[0]);
       // } else if (arr[1]>arr[0] && arr[1]>arr[2]) {
          //  System.out.println(arr[1]);
       // }else {
          //  System.out.println(arr[2]);
        //}

              int ans = 0;
              for (int i = 0; i<arr.length; i++){
                  if (arr[i]>ans){
                      ans = arr[i];
                  }
              }
        System.out.println("max = "+ans);
    }
}
