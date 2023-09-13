
package ativ.pkg04;
import javax.swing.JOptionPane;
public class Ativ04 {
    public static void main(String[] args) {
       int x,a,b,c,ma;
       double mp;
       String sx,sa,sb,sc;
       sx = JOptionPane.showInputDialog(null,"qual o valor e x");
       sa = JOptionPane.showInputDialog(null,"qual o valor e a");
       sb = JOptionPane.showInputDialog(null,"qual o valor e b");
       sc = JOptionPane.showInputDialog(null,"qual o valor e c");
       
       x = Integer.parseInt(sx);
       a = Integer.parseInt(sa);
       b = Integer.parseInt(sb);
       c = Integer.parseInt(sc);
       
       if(x% 2 == 0)
       {
           ma = (a+b+c)/3;
           JOptionPane.showMessageDialog(nul,"media aritimetica"+ma);
           if (x>10)
           {
               mp = ((a*2)+(b*3)+(c*4))/9;
               JOptionPane.showMessageDialog(null, "media ponderada"+mp);
           }
       }
       else
       {
           JOptionPane.showMessageDialog(null, "mumero impar");
       }
    }
    
}
