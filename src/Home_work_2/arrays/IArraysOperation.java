package Home_work_2.arrays;

public interface IArraysOperation {
    void showAllElements (int[] arr);
    default void showEverySecondElement (int[] arr){
        System.out.println("default method");
    }
    default void reverseArray(int[] arr){
        System.out.println("default method");
    }
}
