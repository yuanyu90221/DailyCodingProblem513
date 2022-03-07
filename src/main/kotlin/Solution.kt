class Solution {
    fun subArraySum(nums: IntArray, k: Int): IntArray {
        val len = nums.size -1
        var result: IntArray = intArrayOf()
        for (i in 0..len) {
            var sum = 0
            for ( last in i..len) {
                if (sum + nums[last] == k) {
                    result = nums.copyOfRange(i, last+1)
                    return  result
                }
                sum += nums[last]
            }
        }
        return result
    }
}