class Solution {
    public int addDigits(int num) {
        int sum=0, remain=0;
        while(num > 9){
            sum = 0;
            while(num != 0){
                remain = num%10;
                sum += remain;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}