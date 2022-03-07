import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun subArraySumExample1() {
        assertEquals(true, intArrayOf(2,3,4).contentEquals(sol.subArraySum(intArrayOf(1,2,3,4,5), 9)))
    }
}