import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.print("输文件中的字符：");
        ch = in.next().charAt(0);
        System.out.println(ch + "替换为：" + (int)(ch + 0));
    }
}