import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class customPartnerQuestion {
    public static void main(String[] args){
        ArrayList<String> lines = getFileData("src/data");
        System.out.println(lines);
        int total = 0;
        int counter = 0;
        String[] gifts = (lines.get(0)).split(",");
        for (String g : gifts) {
            System.out.println(g.trim());
            String a = g.trim();
            ArrayList<String> aList = new ArrayList<>();
            for (int u=0; u<a.length(); u++){
                aList.add(a.substring(u, u+1));
            }
            for(int e=0; e<aList.size(); e++){
                System.out.println("e equals "+e);
                String checkNum = aList.get(e);
                for(int z=0; z<aList.size();z++){
                    System.out.println("e equals "+e);
                    System.out.println("z equals "+z);
                    String compNum = aList.get(z);
                    System.out.println("CheckNum: "+checkNum);
                    System.out.println("Compnum: "+compNum);
                    if(checkNum.equals(compNum)&&(!(z==e))){
                        System.out.println("Condition found to be "+checkNum.equals(compNum));
                        System.out.println("current num at: "+g.trim());
                        if(counter==0){
                            counter++;
                            total+=Integer.parseInt(g.trim());
                            System.out.println("added current num to total");
                        }


                    }
                }

            }
            System.out.println(aList);
            counter=0;
            System.out.println("counter back at "+counter);
        }
        System.out.println("total: "+total);
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
