package Home_work_2.arrays;

public class OperationsExample {
    public static void main(String[] args) {
        int[] array = {4, 10, 45, 78, 99, 10, 3, 17, 25, 73};

        DoWhileOperation dwOp = new DoWhileOperation();
        WhileOperation wOp = new WhileOperation();
        ForOperation fOp = new ForOperation();
        ForEachOperation feOp = new ForEachOperation();

        System.out.println("Do...while operations");
        dwOp.reverseArray(array);
        dwOp.showAllElements(array);
        dwOp.showEverySecondElement(array);

        System.out.println();

        System.out.println("While operations");
        wOp.reverseArray(array);
        wOp.showAllElements(array);
        wOp.showEverySecondElement(array);

        System.out.println();

        System.out.println("For operations");
        fOp.reverseArray(array);
        fOp.showAllElements(array);
        fOp.showEverySecondElement(array);

        System.out.println();

        System.out.println("For-each operation");
        feOp.showAllElements(array);
    }
}
