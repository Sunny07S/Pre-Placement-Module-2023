class Solution {
    public int orangesRotting(int[][] grid) {
        
        int count = 2;
        boolean rot = true;
        int toRot = 0;
        while(rot){
            toRot = 0;
            rot=false;
            for(int r = 0; r < grid.length; r++){
                for(int c = 0; c < grid[0].length; c++){
                    if(grid[r][c] == 1){
                        // attempt rot
						
						// check left
                        if(c > 0 && grid[r][c-1] == count)
                            grid[r][c] = count+1;
						// check right
                        else if(c < grid[r].length - 1 && grid[r][c+1] == count)
                            grid[r][c] = count+1;
						// check up
                        else if(r > 0 && grid[r-1][c] == count)
                            grid[r][c] = count+1;
						// check down
                        else if(r < grid.length - 1 && grid[r+1][c] == count)
                            grid[r][c] = count+1;
						// if we rotted an orange this passthrough, there's a chance to rot on another passthrough
                        if(grid[r][c] == count+1)
                            rot=true;
						// track not rotted 
                        if(grid[r][c] == 1)
                            toRot++;
                    }
                }
            }
            count++;
        }
        
        return toRot == 0 ? count-3 : -1;
    }
}