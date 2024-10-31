import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SortingInsertion solution = new SortingInsertion();
        // leetcode testcases
        int[] testcase1 = {5, 2, 3, 1};
        int[] testcase2 = {-7087, 12694, -19352, -7660, 12052, -11316, -352, 18321, 15, 19967, 6331, -1289, 6540, -10454, -19309};
        int[] testcase3 = {1, 25001, 3, 37501, 5, 25003, 7, 43751, 9, 25005, 11, 37503, 13, 25007, 15, 49219, 17, 25009, 19, 37505};
        int[] testcase4 = {15000, 2, 22500, 4, 15002, 6, 26250, 8, 15004, 10, 22502, 12, 15006, 14, 29062, 16, 15008, 18, 22504, 20};
        int[] testcase5 = {5, 2, 9, 1, 5, 6};
        int[] testcase6 = {5};
        int[] testcase7 = {5, 1};
        // Call the sortArray method
        solution.sortArray(testcase1, false);
        solution.sortArray(testcase2, false);
        solution.sortArray(testcase3, false);
        solution.sortArray(testcase4, false);
        solution.sortArray(testcase5, false);
        solution.sortArray(testcase6, false);
        solution.sortArray(testcase7, false);
        // Call the person to create and print data
        int lenOfArgs = args.length;
        String name = lenOfArgs > 0 ? args[0] : "John";
        String surname = lenOfArgs > 1 ? args[1] : "Dow";
        int age = lenOfArgs > 2 ? Integer.parseInt(args[2]) : 0;
        Person person = new Person(name, surname, age);
        person.getInfo();
        for (int i = 3; i < args.length; i++) {
            System.out.println("Arg was not taken -> index " + i + "Arg -> " + args[i]);
        }
    }
}