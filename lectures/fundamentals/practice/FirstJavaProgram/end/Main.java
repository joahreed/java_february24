class Main {

    public static void main(String[] args) {
        System.out.println("""
            My name is Coding Dojo
            I am 100 years old
            My hometown is Burbank, CA
                """);

        if (args.length == 3){

            System.out.format("""
                My name is %s
                I am %s years old
                My hometown is %s
                """, args[0], args[1], args[2]);
            }
    }
}