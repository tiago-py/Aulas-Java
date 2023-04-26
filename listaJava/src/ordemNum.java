public class ordemNum {
    public static void main(String[] args) {
            int a =10, b = 5, c = 3;

            if(a>b && a>c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (b > c && b > a) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }else{
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
    }
}
