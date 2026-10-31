package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'SWITCH'.
 *
 * Soporte mensual (S/) = 0.015 x precio x cantidad
 */
public class EquipoSwitch extends EquipoRed{ // TODO 2b: debe heredar de EquipoRed

    // TODO 2b: implementar calcularSoporteMensual()
    public abstract class calcularSoporteMensual{
        Double Soporte = 0.015*getPrecio()*getCantidad();
    }
}
