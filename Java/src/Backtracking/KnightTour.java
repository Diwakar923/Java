package Backtracking;

import java.util.Arrays;

public class KnightTour {

	public static final int N = 8;
	public static final int[] row={2,1,-1,-2,-2,-1,1,2,2};
	public static final int[] col={1,2,2,1,-1,-2,-2,-1,1};

	public static void main(String[] args) {
		int visited[][] = new int[N][N];
		int pos = 1;
		
		KNightTour(visited,0,0,pos);

	}

	private static void KNightTour(int[][] visited, int x, int y, int pos) {
		visited[x][y] = pos;
		
		if(pos>= N*N){
			print(visited);
			//visited[x][y] = 0;
			return;
		}
		
		for (int k = 0; k < 8; k++)
        {
            int newX = x + row[k];
            int newY = y + col[k];
 
            
            if (isValid(newX, newY) && visited[newX][newY] == 0) {
                KNightTour(visited, newX, newY, pos + 1);
            }
        }
 
        visited[x][y] = 0;
	}

	private static boolean isValid(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }
 
        return true;
	}

	private static void print(int[][] visited) {
		for (int[] r: visited) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
	}

}
