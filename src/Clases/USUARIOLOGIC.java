
package Clases;

import javax.swing.JOptionPane;

public class USUARIOLOGIC {
   private static USUARIOL usuariol= new USUARIOL();
   
   public static boolean autentificar(String usuario, String contra){
     if(obtener(usuario)!=null){
         USUARIO usuarioconsul=obtener(usuario);
        
         if(obtener(usuario).getEmail().equals(usuario)&&usuarioconsul.getContra().equals(contra)){
             
           return true;  
         }
         return true;
     }else{
         return false;
     }
   }
   public static boolean insertar(USUARIO usuario){
       return usuariol.insertar(usuario);
   }
    public static boolean modificar(USUARIO usuario){
       return usuariol.modificar(usuario);
   }
     public static boolean eliminar(String usuario){
       return usuariol.eliminar(usuario);
   }
   public static USUARIO obtener(String usuario){
       return usuariol.obtener(usuario);
   }
}
