public class EveryDayCode 
{
    public static void main(String[] args) {
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        for (int[] is : array1) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }

        System.out.println("==================================");


        int sum = 0;
        for(int i = 0; i < 11; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                if(array1[i][j] != 0)
                {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        System.out.println("=============================================================");
    
    
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;


        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;//第0行第0个值
                    array2[count][1] = j;//第1行第1个值
                    array2[count][2] = array1[i][j];//第2行第2个值
                }
            }
        }


        System.out.println("稀疏数组");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t"
                               + array2[i][1] + "\t"
                               + array2[i][2] + "\t");
        } 

/*         int result[][] = new int[array2[0][0]][array2[0][1]];

        for(int i = 1; i < array2.length; i++)
        {
            result[array2[i][0]][array2[i][1]] = array2[i][2];
        } */

/*         for (int[] is : array2) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        } */

    }
}
