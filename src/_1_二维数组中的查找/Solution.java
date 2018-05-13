package _1_二维数组中的查找;

/**
 * @Description：
 * @Author: dongchuan.yang 2018/5/13
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        // 行数
        int rows = array.length;
        // 列数
        int cols = array[0].length;
        // 选择最右上节点作为起始点
        for (int row = 0,col = cols-1;row < rows && col >= 0;){
            int tempValue = array[row][col];
            /**
             * 当tempValue小于target时,坐标下移
             * 当tempValue大于target时,坐标左移
             */
            if (tempValue == target){
                return true;
            }else if (tempValue < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}