//fibonaaci till 10
class q2{
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 1;
        for(int i = 1; i<=10 ; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
