/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuly;

import Controller.LopTCController;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class xuly_All {
      public static String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
     public  static String firstToUpperCase(String str){
         str = str.substring(0,1).toUpperCase().concat(str.substring(1));
          return str;
     }
    public static String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
            {
                str += " ";
            }
        }
        return str;
    }
       public static int taoMaLop() {
        int maLop;
        Random random = new Random();

        while (true) {
            maLop = random.nextInt(99991) + 10;
            if (LopTCController.ktMaLopTrung(maLop)==null) {
                break;
            } else {
                maLop = random.nextInt(99991) + 10;
            }
        }
        return maLop;
    }
 
}
