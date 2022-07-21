class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) { 
        aux(image,sr,sc,color,image[sr][sc]); 
        return image;
    } 
    public void aux(int[][] image, int sr, int sc, int color, int start) {
        boolean inBounds = sr>=0 &&  
                           sc>=0 &&  
                           sr<=image.length-1 &&  
                           sc<=image[0].length-1; 
        if(!inBounds) return;
        if(inBounds && image[sr][sc]!= start) return;   
        if(inBounds && image[sr][sc] == color) return;
        else if (inBounds && image[sr][sc] == start) { 
            image[sr][sc] = color; 
            aux(image,sr-1, sc,color,start);  
             aux(image,sr+1, sc,color,start); 
            aux(image,sr, sc+1,color,start); 
            aux(image,sr, sc-1,color,start);
        }
        else { 
            return;
        } 
    }
} 