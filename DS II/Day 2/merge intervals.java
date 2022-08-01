class Solution {
    //Time: O(n log n) for sorting the given intervals
    //Space O(n) where n represent the length of given intervals
    public int[][] merge(int[][] intervals) {
		//Edge case
		if(intervals.length == 1) return intervals;
	
        //sort by intervals start time
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
        
        //create a list of int[]
        List<int[]> result = new ArrayList<>();
        
        //get the first interval from intervals
        int aStart = intervals[0][0],
            aEnd = intervals[0][1];
        
        //loop through the rest of intervals
        for(int i = 1; i < intervals.length; i++){
            //if b.Start <= aEnd meaning it is overlapping
            if(intervals[i][0] <= aEnd){
                //find the new max
                aEnd = Math.max(aEnd, intervals[i][1]);
            }
            else{
                //if not add it to the result and change the a.start and a.end
                result.add(new int[]{aStart, aEnd});
                aStart = intervals[i][0];
                aEnd = intervals[i][1];
            }
        }
        
        //add the last values
        result.add(new int[]{aStart, aEnd});
        
        //return the result
        return result.toArray(new int[result.size()][]);
    }
}