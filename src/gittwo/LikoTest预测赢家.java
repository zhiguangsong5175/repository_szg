package gittwo;

public class LikoTest预测赢家 {

	public static void main(String[] args) {
		PredictTheWinner();
	}

	public static boolean PredictTheWinner() {
		int[] 	nums = new int[]{1, 2, 122, 7};
		Integer result= new Integer(0);
		 boolean total = total(nums, 0, nums.length-1, 0,result);
		System.out.println(total);
		return total;
	}
	
	/**
	 * n 双数+ 单数-
	 * @param nums
	 * @param start
	 * @param end
	 * @param n
	 * @param result
	 * @return
	 */
	public static boolean total(int[] nums, int start, int end, int n, Integer result) {
		if (n == nums.length - 1)
			return result>0;
		int thisResult = 0;
		int n2 = n % 2;
		if (nums[start] > nums[end]) {
			thisResult = nums[start];
			start++;
		}
		else {
			thisResult = nums[end];
			end--;
		}
		if (n2 == 0) {
			result += thisResult;
		}
		else {
			result -= thisResult;
		}
		n++;
		return total(nums, start, end, n, result);
	}
}
