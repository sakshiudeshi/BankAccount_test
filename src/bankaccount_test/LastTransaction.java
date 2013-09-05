/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_test;

/**
 *
 * @author sakshi
 */
public class LastTransaction {

    String last;

    public LastTransaction() {
        last = "null";
    }

    /**
     * Adds last transaction done
     *
     * @param str the string to be added as last transaction
     */
    public void modifyLast(String str) {
        last = str;
    }

    /**
     *
     * @return last
     */
    @Override
    public String toString() {
        return last;
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static void print(long longNum) {
        System.out.println(longNum);
    }

    private static void print(double doubleNum) {
        System.out.println(doubleNum);
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
