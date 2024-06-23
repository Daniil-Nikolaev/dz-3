public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 53, 54, 84, 191, 52, 1642, 68, 907, 4231};
        int[] arr2=new int[]{1,2,7,10,11,14,24,57,58};
        int[] arr3=new int[]{101,263,343,453,555,643,727,802,969};
        solution solution = new solution();
        //1. Вывести число в обратном порядке
        solution.reverse(4323);
        //2.Вывести максимальные и минимальные цифры.
        solution.maxAndMin(8574642);
        //3.Цифры дубликаты
        solution.duplicates(12345677);
        //4.По возрастанию+1.
        solution.increase(67892531);
        //5. Максимальные и минимальные числа числа.
        solution.maxAndMinArray(arr);
        //6.Четные и нечетные.
        solution.evenAndOdd(arr);
        //7. Самое длинное и короткое число.
        solution.longestAndShortest(arr);
        //8. По возрастанию+1.
        solution.increaseInArr(arr2);
        //9.Палиндромы.
        solution.palindrome(arr3);





    }
}