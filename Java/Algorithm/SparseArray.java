public class SparseArray {
    public static void main(String[] args) {

        //创建一个二维数组11*11
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        System.out.println("输出原始数组");
        for (int[] is : array1) {
            for (int i : is) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }


        //转换成稀疏数组保存
        // 1. 获取有效值个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值个数: " + sum);


        //创建稀疏数组
        int[][] array2 = new int[sum + 1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非0的值，存放在稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;//第count行第0个值
                    array2[count][1] = j;//第count行第1个值
                    array2[count][2] = array1[i][j];//第count行第array1[i][j]个值
                }
            }
        }

        System.out.println("稀疏数组");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t"
                               + array2[i][1] + "\t"
                               + array2[i][2] + "\t");
        }


        System.out.println("\n=======================还原数组========================\n");

        // 1. 读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        // 2. 给其中元素还原他的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        // 3. 打印
        System.out.println("输入原始的数组");

        for (int[] is : array3) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }
    }
}
