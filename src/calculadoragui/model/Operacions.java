package calculadoragui.model;

public class Operacions {

    /**
     * Aquest mètode calcula la suma dels dos valors de tipus double que rep per
     * paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la suma.
     */
    public double suma(double op1, double op2) {
        return op1 + op2;
    }
/**
     * Aquest mètode calcula la resta dels dos valors de tipus double que rep per
     * paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la resta.
     */
    public double resta(double op1, double op2) {
        return op1 - op2;
    }
/**
     * Aquest mètode calcula la multiplicació dels dos valors de tipus double que rep per
     * paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double , torna un el resultat de la multiplicació.
     */
    public double multiplicacio(double op1, double op2) {
        return op1 * op2;
    }

    /**
     * Aquest mètode calcula la divisió dels dos valors de tipus double que rep per
     * paràmetre
     *
     * @param op1 primer operand
     * @param op2 segon operand
     * @return double, torna un el resultat de la divisió.
     */
    public double divisio(double op1, double op2) {
        return op1 / op2;
    }
}