public class inputGenrator {
    public static void main(String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input = "";

        for (int i=0; i<=9; i++){
            for (int a=0; a<=9; a++){
                int randint = (int)(Math.random()*26);
                System.out.println("number: "+randint);
                input+=alphabet.substring(randint, randint+1);

            }
            System.out.println(" ");
            System.out.print(input);
        }

    }
}
