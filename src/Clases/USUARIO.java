
package Clases;

public class USUARIO {
protected String Nombre;
protected String Apellido;
protected String Cedula;
protected String Genero;
protected String Email;
protected String Contra;  

    public USUARIO(String Nombre, String Apellido, String Cedula, String Genero, String Email, String Contra) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Genero = Genero;
        this.Email = Email;
        this.Contra = Contra;
    }

USUARIO(){

}
public void setNombre(String nombre){
    this.Nombre=nombre;
}
public String getNombre(){
  return Nombre;  
}
public void setApellido(String apellido){
    this.Apellido=apellido;
}
public String getApellido(){
    return Apellido;
}
public void setCedula(String cedula){
    this.Cedula=cedula;
}
public String getCedula(){
    return Cedula;
}
public void setGenero(String genero){
    this.Genero=genero;
}
public String setGenero(){
    return Genero;
}
public void setEmail(String email){
 this.Email=email;
}
public String getEmail(){
    return Email;
}
public void setContra(String contra){
    this.Contra=contra;
}
public String getContra(){
    return Contra;
}
}

