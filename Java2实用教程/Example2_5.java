package Java2实用教程;

import java.util.*;
class Example2_5 {
    public static void main(String arg[]) {
        int start = 0, middle, end;
        int a[] = {12, 52, 10, 6, 85};
        int len = a.length;
        for (int i = 0; i < len; i ++) {
            for (int j = i + 1; j < len; j ++) {
                if (a[j] < a[i]) {
                    a[j] = a[i] + a[j];
                    a[i] = a[j] - a[i];
                    a[j] = a[j] - a[i];
                }
            }
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("输入整数，程序判断该整数是否在数组中：");
        int number = reader.nextInt();
        int count = 0;
        end = len;
        middle = start + end >> 1;
        while(number != a[middle]) {
            if (number > a[middle]) {
                start = middle;
            }
            else if (number < a[middle]) {
                end = middle;
            }
            middle = start + end >> 1;
            count ++;
            if (count > len >> 1) {
                break;
            }
        }
        if (count > len >> 1) {
            System.out.println(number + "不在数组中");
        }
        else {
            System.out.println(number + "在数组中");
        }
    }
}
