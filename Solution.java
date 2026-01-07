import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        ArrayList<String> lines = getFileData("/home/orik5/Projects/CustomAdvent/data");
        String answer="";
       for(int i =0; i<lines.size(); i++){
           String test = lines.get(i);
           System.out.println(test);
           int wCount = 0;
           int qCount= 0;
           int uCount= 0;
           int dCount= 0;
           int mCount= 0;
           String alphabet = "abcdefghijklmnopqrstuvwxyz";
           int initialCount = test.length();
           for(int b=0; b<=test.length()-1; b++){
               String a = test.substring(b, b+1);
               System.out.println("Current character at: "+a);
               if(a.equals("w")){
                   wCount-=10;
                   System.out.println("w+1");
               }else if(a.equals("q")){
                   qCount+=5;
                   System.out.println("q+1");
               }else if(a.equals("u")){
                   uCount-=6;
                   System.out.println("u+1");
               }else if(a.equals("d")){
                   dCount-=1;
                   System.out.println("d+1");
               }else if(a.equals("m")){
                   mCount+=7;
                   System.out.println("m+1");
               }
           }
           System.out.println("Final counts at: W: "+wCount+" Q: "+qCount+" U: "+uCount+" D: "+dCount+" M: "+mCount);
           System.out.println("Initial count: "+initialCount);
           int newcount = initialCount+wCount+qCount+uCount+dCount+mCount;
           if(newcount<0){
               newcount=newcount*-1;
           }
           System.out.println("New count: "+newcount);
           System.out.println("letter equivalent: "+alphabet.substring((newcount%26), (newcount%26)+1));
           answer+=alphabet.substring((newcount%26), (newcount%26)+1);
           System.out.println("Answer: "+answer);
       }
    }


public static ArrayList<String> getFileData(String fileName) {
    ArrayList<String> fileData = new ArrayList<>();
    try {
        File f = new File(fileName);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (!line.equals(""))
                fileData.add(line);
        }
        return fileData;
    }
    catch (FileNotFoundException e) {
        return fileData;
    }
}
}