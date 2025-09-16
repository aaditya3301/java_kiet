class mem{
    int x;
    void my(){
        System.out.println("hello universe");
    }
    public static void main(String[] args) {    // main has two access one is static and other is object
        System.out.println("hello new");
        // my();  //error because static method can call only static method directly
        mem m = new mem();
        System.out.println(m.x);
        m.my();
    }
}