package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'AP' (access point).
 *
 * Soporte mensual (S/) = (0.02 x precio + 5) x cantidad
 */
public class EquipoAP extends EquipoRed { // TODO 2b: debe heredar de EquipoRed

    // TODO 2b: implementar calcularSoporteMensual()
    public abstract class calcularSoporteMensual{
        Double Soporte_AP = (0.02*getPrecio()+5)*getCantidad();

    }

}
