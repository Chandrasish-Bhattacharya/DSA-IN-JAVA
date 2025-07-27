class subarray{
    public static void main(String[] args) {
        int[] arr = {1 , 8 , 9 , 0};
        int n= arr.length;
        int maxsum = 0;
        for(int i = 0 ; i<n ; i++){
            int sum = 0;
            for(int j = i ; j<n;j++){
                sum += arr[j];
                System.out.println(sum);
            }
            maxsum = Math.max(maxsum , sum);
        }
        System.out.println(maxsum);
    }
}