public class inputGenrator {
    public static void main(String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input = "";
    for(int a=0; a<50; a++){
        for (int i=0; i<=9; i++){

            int randint = (int)(Math.random()*26);
            input+=alphabet.substring(randint, randint+1);

        }
        System.out.print(input);
        input = "";
        System.out.println(" ");
    }
    }
}
