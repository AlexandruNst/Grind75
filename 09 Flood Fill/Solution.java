class Solution {

    // T: O(n)
    // S: O(n)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;

        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int color, int ogColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length)
            return;
        if (image[r][c] != ogColor)
            return;
        image[r][c] = color;
        dfs(image, r + 1, c, color, ogColor);
        dfs(image, r - 1, c, color, ogColor);
        dfs(image, r, c + 1, color, ogColor);
        dfs(image, r, c - 1, color, ogColor);
    }
}

// Recursive and Iterative possible. In both cases: check if row and column are
// out of bounds, also check if the color is not the one we want to change. If
// not, then change the color and either rec call or add to the queue all 4
// directions.

// ITERATIVE SOLUTION BELOW WORKS FINE, it's just slower

// class Solution {
// public int[][] floodFill(int[][] image, int sr, int sc, int color) {
// if(image[sr][sc] == color) return image;
// int ogColor = image[sr][sc];
// Queue<List<Integer>> q = new LinkedList<>();
// q.add(new ArrayList<>(Arrays.asList(sr, sc)));
// while(!q.isEmpty()){
// List<Integer> coords = q.poll();
// int r = coords.get(0);
// int c = coords.get(1);
// if(r < 0 || r >= image.length || c < 0 || c >= image[0].length) continue;
// if(image[r][c] != ogColor) continue;
// image[r][c] = color;
// q.add(new ArrayList<>(Arrays.asList(r + 1, c)));
// q.add(new ArrayList<>(Arrays.asList(r - 1, c)));
// q.add(new ArrayList<>(Arrays.asList(r, c + 1)));
// q.add(new ArrayList<>(Arrays.asList(r, c - 1)));
// }

// return image;
// }
// }
