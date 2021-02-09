public class Logic {
    public static void main(String[] args) {
        //  || or
        // && and
        // ! not

        // for example
        boolean a = true || false;
        // the result will still true as one of them have to be true
        System.out.println(a);

        //----------------
        boolean b = true && false;
        // the result will still false as both have to be true
        System.out.println(b);

        //----------------
        boolean c = ! false; // 
        // the result will still true 
        System.out.println(c);
        
        // or 
        boolean d = ! (true || false); 
        // the result will still false 
        System.out.println(d);
    }
    
}
