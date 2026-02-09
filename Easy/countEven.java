class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=2;i<=num;i++){
        int sum =0;
        int n =i;
        while(n!=0){
          int digit = n%10;
          sum +=digit;
          n /= 10;
        }
            if(sum%2==0){
                count++;
            }
            System.out.println(sum);
        }
        return count;

    }
}