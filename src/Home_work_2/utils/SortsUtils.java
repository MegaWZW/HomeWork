package Home_work_2.utils;

public class SortsUtils {

    public static void bubble (int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > i; j--){
                if (arr[j-1] > arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void shake (int[] arr){
        int left = 0; //левая граница массива
        int right = arr.length - 1; //правая граница массива
        int flag = 1; //флаг наличия перемещений во время итерации

        while ((right > left) && flag > 0) {  //выполняем цикл пока левая и правая граница не сойдутся или не будет совершено ни одной перестановки
            flag = 0;
            for (int i = left; i < right; i++) { //движение по массиву слева направо
                if (arr[i] > arr[i +1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    flag = 1;
                }
            }
            right--; //смещение правой границы влево

            for(int i = right; i > left; i--) { //движение справа налево
                if (arr[i] < arr[i - 1]){
                    int tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                    flag = 1;
                }
            }
            left++; //смещение левой границы вправо
        }
    }
}
