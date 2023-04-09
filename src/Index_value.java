public class Index_value {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 33};
        int ans = -1;
        int x =33;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                 ans=i;
            }
        }

        System.out.println(ans);
    }

}
