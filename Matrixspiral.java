import java.util.ArrayList;
import java.util.List;

public class Matrixspiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans =  new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top=0,bottom = n-1,left = 0, right = m -1;

        while(top<=bottom && left<=right){ //until the entire matrix is traversed.

            for(int i=left;i<=right;i++) //left-right
                ans.add(matrix[top][i]);

            top++;

            for(int i=top; i<=bottom;i++) //top-bottom
                ans.add(matrix[i][right]);

            right--;

            if(top<=bottom){
                for(int i=right; i>=left;i--) //right-left
                    ans.add(matrix[bottom][i]);
                bottom--;
            }

            if(left<=right){
                for(int i=bottom; i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
            }
        }
        return ans;

    }
}
