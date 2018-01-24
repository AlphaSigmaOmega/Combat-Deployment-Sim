package ISU;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public abstract class MotherBase implements Comparable{
    private String FName;
    private String LName;
    private String Name;
    private String Rank;
    private String ERank="E";
    private int FA=0;
    private Random rand = new Random();
    
    public MotherBase(){
        pickName();
        setRank(ERank);
        Fight_Ability(Rank);
        
        
    }
    private void pickName() {
        try {
            FileReader fr = new FileReader("FirstNames.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(210) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            FName = randName;
        } catch (Exception e) {
        }
        try {
            FileReader fr = new FileReader("LastNames.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(605) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            LName = randName;
        } catch (Exception e) {
        }
        FName += " " + LName;
        Name=FName;
        
    }

    private void pickRank() {
        try {
            FileReader fr = new FileReader("RankList.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            MotherBase S;
            int n = rand.nextInt(10) + 1;
            //Names.txt length is max
            for (int i = 0; i < n; i++) {
                randName = br.readLine();
            }
            br.close();
            Rank = randName;
        } catch (Exception e) {
        }
    }
}
