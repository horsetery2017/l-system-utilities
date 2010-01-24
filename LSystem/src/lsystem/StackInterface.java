/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lsystem;

/**
 *
 * @author tux
 */
public interface StackInterface <E>{

    public final String VERSION = "0.5.0";

    void dispose();

    /**
     * SimpleTurtle pop
     * @return turtle SimpleTurtle
     */
    E pop();

    /**
     * SimpleTurtle push
     * @param turtle SimpleTurtle
     */
    void push(E turtle);

}
