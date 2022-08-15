package Home_work_2.arrays;

class WhileOperation implements IArraysOperation {

    public void showAllElements (int[] arr){
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;
        }
        System.out.print("\b\b\n");
    }

    @Override
    public void showEverySecondElement (int[] arr){
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i += 2;
        }
        System.out.print("\b\b\n");
    }

    @Override
    public void reverseArray(int[] arr){
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + ", ");
            i--;
        }
        System.out.print("\b\b\n");
    }
}
