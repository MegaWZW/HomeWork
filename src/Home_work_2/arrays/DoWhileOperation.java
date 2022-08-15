package Home_work_2.arrays;

class DoWhileOperation implements IArraysOperation{

    public void showAllElements (int[] arr) {
        int j = 0;
        do {
            System.out.print(arr[j] + ", ");
            j++;
        }while(j < arr.length);
        System.out.print("\b\b\n");
    }

    @Override
    public void showEverySecondElement (int[] arr){
        int j = 0;
        do {
            System.out.print(arr[j] + ", ");
            j += 2;
        }while(j < arr.length);
        System.out.print("\b\b\n");
    }

    @Override
    public void reverseArray(int[] arr) {
        int j = arr.length - 1;
        do {
            System.out.print(arr[j] + ", ");
            j--;
        }while(j >= 0);
        System.out.print("\b\b\n");
    }
}
