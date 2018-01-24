
import java.util.ArrayList;

//PARENT CLASS//
public class FOB_Management implements Comparable{

    private Staff_List S;
    private int GMP = 5000;
    private String Rnk;
    private ArrayList RankSort[][];
    
    public FOB_Management(){
        RankSort = new ArrayList[10][];
        for (int x = 0; x < 15; x++) {
            Rnk="E";
            S = new Staff_List();
            S.setRank(Rnk);
            System.out.println(S);
        }
        
    }
    
    public void sortStaff(String rank){
        String r=rank;
        if (r.equals("S++")){
            
        }
    }
    
    public void buyStaff(String rank, int amount){
        String r=rank;
        int a=amount;
        for (int i = 0; i < a; i++) {
            S = new Staff_List();
            S.setRank(r);
            GMP-=1000;
        }
        sortStaff(r);
        
    }
    
    public int getGMP(){
        return GMP;
    }
    
    
}
