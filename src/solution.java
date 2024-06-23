public class solution {
    //1. Вывести число в обратном порядке
   void reverse(int a) {
       for (; a != 0; a /= 10) {
           System.out.print(a % 10);
       }
       System.out.println();
   }
    //2.Вывести максимальные и минимальные цифры.
   void maxAndMin(int a) {
       int max=0;
       int min=9;
       for(;a>0;a/=10){
           if(a%10>max){
               max=a%10;
           }
           if(a%10<min){
               min=a%10;
           }
       }
       System.out.println("Максимальное число: "+max+" минимальное число: "+min);
   }
    //3.Цифры дубликаты
    void duplicates(int a) {
        boolean flag = true;
        int b=a%10;
        while (a>0) {
            a/=10;
            if (b == a % 10) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    //4.По возрастанию+1.
    void increase(int a) {
       String result="";
       int lastNumber=0;
       while (a!=0) {
           int digit = a % 10;
           a /=10;
           int nextDigit = a%10;
           if (digit-1==nextDigit) {
               result+=digit;
               lastNumber=digit;
           }else{
               if(lastNumber-1==digit){
                   result+=digit;
               }
           }
       }
       System.out.println(result);
    }
    //5. Максимальные и минимальные числа числа.
    void maxAndMinArray(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        System.out.println("Максимальное значение:" + max + ',' + "Минимальное значение:" + min);
    }
    //6.Четные и нечетные.
    void evenAndOdd(int arr[]){
        System.out.print("Четные значения: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("Нечетные значения: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    //7. Самое длинное и короткое число.
    void longestAndShortest(int arr[]){
        int longest = arr[0];
        int shortest = arr[0];
        for (int i : arr) {
            longest = Math.max(i, longest);
            shortest = Math.min(i, shortest);
        }
        System.out.println("Самое длинное число: " + longest + ';' + "Самое короткое число:" + shortest);
    }
    //8. По возрастанию+1.
    void increaseInArr(int arr[]){
        for(int i=1;i<arr.length;i++) {
            if(arr[i]==arr[i-1]+1) {
                System.out.print(arr[i-1]+","+arr[i]+";");
            }
        }
        System.out.println();
    }
    //9.Палиндромы.
    void palindrome(int arr[]){
        System.out.print("Числа палиндромы:");
        for(int i=0;i<arr.length;i++) {
            int num=arr[i];
            int sum=0;
            int a=num;
            while(a>0) {
                int last=a%10;
                sum=(sum*10)+last;
                a=a/10;
            }
            if(sum==num)
                System.out.print(num+",");
        }
    }
}