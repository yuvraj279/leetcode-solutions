class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        return calc(n, sum, pro);
    }
    
    int calc(int n, int sum, int pro) {
        if (n % 10 == n) {
            sum += n;
            pro *= n;
            return pro - sum;
        }

        int j = n % 10;
        sum += j;
        pro *= j;
        return calc(n / 10, sum, pro);
    }
}
