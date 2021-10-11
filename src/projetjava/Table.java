package projetjava;
/**
 *
 * @author falad
 */
public abstract class Table {
    public String nom_croupier;
    public String[] player_list;
    public int nombre_joueur;
    
    public Table(String nom_croupier,int nombre_joueur){
        player_list = new String[nombre_joueur];
        this.nom_croupier = nom_croupier;
    }
    public void addPlayer_list(String player){
        int i = 0;
        while(player_list[i]!=""){
            i+=1;
            
        }
        if(i == nombre_joueur){
            System.out.print("Liste pleine");
        }
        else{
            player_list[i]=player;
        }
    }
    
    public String getNomCroupier(){
        return nom_croupier;
    }
    public String[] getPlayerList(){
        return player_list;
    }
}
