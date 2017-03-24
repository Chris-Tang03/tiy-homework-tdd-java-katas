/**
 * Created by Cwolf on 3/23/17.
 */
public class Array1 {
    public static int sum2(int[] nums) {
        if(nums.length == 0 ) {
            return 0;
        } else if(nums.length == 1 ) {
            return nums[0];
        } else{
            return nums[0] + nums[1];
        }
    }

}


/*

{10, 20}  = 30
{10, 20, 30, 40, 50} = 30
{0, 10, 50} = 10


int[] demo

{10, 12, 13, 14}



 */


/**
 *
 * sum2(int[] nums) {
 *     if(nums.lenth == 0) {
 *         return 0
 *     }
 *
 *
 *     else if (nums.lenth == 1 ) {
 *         return nums[0]
 *     }
 *
 *
 *     else {
 *
 *
 *        return nums[0] + nums[1]
 *
 *     }
 *
 *
 *
 * }
 *
 *
 */

/*

Method that sums first two numbers in an Array
   public int sum2()

If the array is empty we return 0
if (array.length() = 0) {
retunr 0
if the array has one value only we return that value
otherwise we return the first number PLUS the second number in the array




 */
