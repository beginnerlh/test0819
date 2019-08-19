package practice0818;

public class Test3 {

    public static int f(int n,int m){
        if(n == 1){
            return 1;
        }

        return (f(n-1,m) + m-1) % n +1;
    }

    public static void main(String[] args) {
        System.out.println(f(52,3));
    }
}
