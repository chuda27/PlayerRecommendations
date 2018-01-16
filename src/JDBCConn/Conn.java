/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBCConn;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author choirul.huda
 */
public class Conn {
    public static void main(String[] args) {
        double data = 90;
        System.out.println(data/4);
        /*
        MyConn myconn = new MyConn();
        String query = "select p.player_name as 'Player Name', p.player_overall as 'Player Overall', p.player_club as 'Club', pp.pp_preferred_positions as 'Positions' " 
                +"from player p join playing_position pp " 
                +"on p.id = pp.pp_id "  
                +"where pp.pp_preferred_positions like '%ST%' or '%CF%' ";
        myconn.setQuery(query);
        List<String> dataPlayer = myconn.getStiker();
        for (String coba : dataPlayer) {
            System.out.println(coba);
        }
        */
        DecimalFormat df = new DecimalFormat("#.##");
        double a = 0.3;
        double b = 0.25;
        double c = 0;
        for (int i = 0; i < 6; i++) {
            c += Math.pow(a, 2);
        }
        double d = Double.valueOf(df.format(c));
        
        System.out.println(d);
    }
    
}
