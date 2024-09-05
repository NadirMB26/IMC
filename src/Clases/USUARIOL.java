
package Clases;

import java.util.ArrayList;
import java.util.List;

public class USUARIOL {
    private List<USUARIO>usuarios;
public USUARIOL(){
    usuarios=new ArrayList<>();
}
public int buscar(String usuario){
    int n=-1;
    for(int i=0; i<usuarios.size();i++){
        if(usuarios.get(i).getCedula().equals(usuario)){
            n=i;
            break;
        }
    }
    return n;
}
public int buscarc(String usuario){
    int n=-1;
    for(int i=0; i<usuarios.size();i++){
        if(usuarios.get(i).getEmail().equals(usuario)){
            n=i;
            break;
        }
    }
    return n;
}
public boolean insertar(USUARIO usuario){
    if(buscar(usuario.getCedula())==-1){
      usuarios.add(usuario);
      return true;
    }else{
        return false;
    }
}
public boolean modificar(USUARIO usuario){
       if(buscar(usuario.getCedula())!=-1){
           USUARIO usuarioaux=obtener(usuario.getCedula());
           usuarioaux.setContra(usuario.getContra());
           usuarioaux.setNombre(usuario.getNombre());
           usuarioaux.setApellido(usuarioaux.getApellido());
           usuarioaux.setEmail(usuarioaux.getEmail());
      usuarios.set(0,usuario);
      return true;
    }else{
        return false;
    }
}
public boolean eliminar(String usuario){
  if(buscar(usuario)!=-1){
      usuarios.remove(buscar(usuario));
      return true;
  } else{
      return false;
  }
}
public USUARIO obtener(String usuario){
   if(buscar(usuario)!=-1){
       return usuarios.get(buscar(usuario));
   }else{
       return null;
   }
}
}
