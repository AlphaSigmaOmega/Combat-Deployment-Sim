
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Objects;
import java.util.Random;
//CHILD CLASS//
//Keeps track of each Staff Member on the FOB & their respective Rank
public class Staff_List extends FOB_Management {

    private String FName;
    private String LName;
    private String Name;
    private String Rank;
    private String ERank="E";
    private int FA=0;
    private Random rand = new Random();

    public Staff_List() {
        pickName();
        setRank(ERank);
        Fight_Ability(Rank);
    }

    public Staff_List(String info) {
        //converts "CodeName <Rank>" String to a Staff Member
        int div = info.indexOf("<");
        FName = info.substring(0, div);
        Rank = info.substring(div + 1, info.length() - 1);
    }

    //Setters & Getters
    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getRank() {
        return Rank;
    }
    public int getFightAbility(){
        return FA;
    }
    public void setRank(String rank){
        Rank.equals(rank);
        
    }

    //Looks through txt file and picks random line to assign as name
    private void pickName() {
        try {
            FileReader fr = new FileReader("FirstNames.txt");
            BufferedReader br = new BufferedReader(fr);
            String randName = "";
            Staff_List S;
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
            Staff_List S;
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
            Staff_List S;
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

    //When called, supplied with all staff in rank sent in,
    //Checks rank, calculates rank ability * # of staff
    //Returns fighting_ability # in an int
    private int Fight_Ability(String Rnk) {
        String R = Rnk;
        if (R.equals("S++")) {
            int n = rand.nextInt(700) + 448; //Max is highest points to Rank, lowest is lowest point to Rank
            FA = n;
        } else if (R.equals("S+")) {
            int n = rand.nextInt(447) + 290;
            FA = n;
        } else if (R.equals("S")) {
            int n = rand.nextInt(289) + 185;
            FA = n;
        } else if (R.equals("A++")) {
            int n = rand.nextInt(184) + 110;
            FA = n;
        } else if (R.equals("A+")) {
            int n = rand.nextInt(109) + 80;
            FA = n;
        } else if (R.equals("A")) {
            int n = rand.nextInt(79) + 64;
            FA = n;
        } else if (R.equals("B")) {
            int n = rand.nextInt(63) + 48;
            FA = n;
        } else if (R.equals("C")) {
            int n = rand.nextInt(47) + 32;
            FA = n;
        } else if (R.equals("D")) {
            int n = rand.nextInt(31) + 16;
            FA = n;
        } else if (R.equals("E")) {
            int n = rand.nextInt(15) + 1;
            FA = n;
        } else {
            FA = -1;
            System.out.println("ERROR - Could not find rank...");
            System.out.println(R);
        }

        return FA;
    }

    public String toString() {
        return "Staff Member\n=========\nName: " + FName + " " + LName + "\nRank: <" + Rank + ">\nFighting Ability: " + FA;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.FName);
        hash = 37 * hash + Objects.hashCode(this.LName);
        hash = 37 * hash + Objects.hashCode(this.Rank);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Staff_List other = (Staff_List) obj;
        if (!Objects.equals(this.FName, other.FName)) {
            return false;
        }
        if (!Objects.equals(this.LName, other.LName)) {
            return false;
        }
        if (!Objects.equals(this.Rank, other.Rank)) {
            return false;
        }
        return true;
    }

}
