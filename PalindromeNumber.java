class Solution {
    public boolean isPalindrome(int x) {
        // 创建一个String的方法，将int x放入其中
        String z = String.valueOf(x);
        // 创建一个StringBuffer的方法
        StringBuffer y = new StringBuffer();
        // 将z放入这个StringBuffer当中
        y.append(z);
        // 进行判断，将z的值与y的(反)方法进行比较
        return z.equals(y.reverse().toString());

        
    }
}