interface Calculator{
    void Calci(int a, int b);
}

 class lamda{
    public static void main (String[] args){
        Calculator c = (a,b) -> System.out.println(a + b);
        c.Calci(2,3);
    }
}