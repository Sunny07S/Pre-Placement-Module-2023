class Solution {
   public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		combine(res, new ArrayList<Integer>(), 1, n, k);
		return res;
	}
	public static void combine(List<List<Integer>> res, List<Integer> comb, int start, int n, int k) {
		// when we have k elements on the current path
		if(k==0) {
			res.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n-k+1;i++) {
			comb.add(i);
			combine(res, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}
}