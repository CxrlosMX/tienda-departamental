/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superFunciones;



/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 21/08/2021
 *
 */
public class RecorreString  {

  
    public static String recorre(String cadena) {
        String c = "";
        for (int i = 0; i < 3; i++) {
            cadena += c.charAt(i);
        }
        return c;
    }

}
