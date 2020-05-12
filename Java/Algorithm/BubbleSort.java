import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] listA = {45, 61, 23, 4561, 20, 12, 34, 2, 45, 1, 405, 9};
        sort(listA);
        System.out.println(Arrays.toString(listA));
    }

    public static int[] sort(int[] array) {
        //用于接受传递的值
        int temp = 0;


        //-1是因为循环到最后一个时，已经排好了，没必要在循环一次
        for (int i = 0; i < array.length - 1; i++) {
            //设置一个标识，用来判断有没有结束
            boolean flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {

                    //一给二，二给三，三再给二
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }

            if (flag == false) {
                break;
            }
        }
        return array;
    }
}
