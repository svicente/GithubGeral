/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatTempo;

/**
 *
 * @author svicente
 */
//FormatTempo.SegundosToMinutosCutter().getTempoCutterHour();
public class SegundosToMinutosCutter {

    public String convertSegundosEmHora(double time)
    {        
        
        int hora = (int) time/3600;        
        
        int min = (int) time/60;        
        
        int seg = (int) time%60;                       
        //System.out.println(hora+":"+min+":"+seg);
        return formatHora(String.valueOf(hora))+":"+formatHora(String.valueOf(min))+":"+formatHora(String.valueOf(seg));
    }

    private static String formatHora(String line)
    {
        if(line.replace(" ", "").length()==1)
        {
            return "0"+line;
        }else if(line.replace(" ", "").length()>2){        
            return line.substring(0, 1);
        }else
            return line;
    }
    
//    public static void main(String[] args) {
//        SegundosToMinutosCutter x = new SegundosToMinutosCutter();
//        System.out.println(x.convertSegundosEmHora(13.025));        
//    }
}
