/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberFormat;

/**
 *
 * @author svicente
 */
public class StringToNumber {

    /**
     * Convert string com . e , em inteiro
     * @param num
     * @return 
     */
    public static float getNumeroReal(String num) {
        String pattern = ".";

        return Float.valueOf(num.replaceAll("\\.", ","));
    }

    

}
