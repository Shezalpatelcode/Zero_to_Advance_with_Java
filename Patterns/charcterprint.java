package Patterns;

public class charcterprint {
    public static void main(String[] args) {
        int n=11;
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
               System.out.print(ch + " ");
               ch++;
            }
            System.out.println();
        }
    }
}
