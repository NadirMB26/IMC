
package Clases;

import java.util.ArrayList;
import java.util.List;


public class R_IMC {
private List<IMC>historial;   

    public R_IMC() {
          historial=new ArrayList<>();
    }

    public R_IMC( List<IMC> historial) {

        this.historial = historial;
    }
public void insertar(IMC usuario){
 
      historial.add(usuario);
     
  
}


    public List<IMC> getHistorial() {
        return historial;
    }

    public void setHistorial(List<IMC> historial) {
        this.historial = historial;
    }

}
