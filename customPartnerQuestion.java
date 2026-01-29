import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class customPartnerQuestion {
    public static void main(String[] args){
        ArrayList<String> lines = getFileData("src/data");
        System.out.println(lines);
        int total = 0;

        for(int h=0; h< lines.size(); h++){
            String[] gifts = (lines.get(h)).split(",");

            for (String g : gifts) {
                System.out.println(g.trim());
                String a = g.trim();
                ArrayList<String> aList = new ArrayList<>();

                for (int u=0; u<a.length(); u++){
                    aList.add(a.substring(u, u+1));
                }

                boolean damaged = false;

                for(int e=0; e<aList.size(); e++){
                    String checkNum = aList.get(e);
                    System.out.println(aList.get(e));
                    System.out.println("CheckNum: "+checkNum);

                    for(int z=0; z<aList.size();z++){
                        String compNum = aList.get(z);
                        System.out.println("Compnum: "+compNum);

                        if(checkNum.equals(compNum)&&(!(z==e))){
                            System.out.println("Condition found to be "+checkNum.equals(compNum));
                            damaged = true;
                            break;
                        }
                    }

                    if (damaged){
                        break;
                    }
                }

                if (damaged) {
                    total += Integer.parseInt(a);
                }

                System.out.println(aList);
                System.out.println(total);
            }
        }

        System.out.println("Final total: "+total);
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
