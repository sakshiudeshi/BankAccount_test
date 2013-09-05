/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_test;

/**
 *
 * @author sakshi
 */
public class PersonalDetails {

    String name;
    String address;

    public PersonalDetails() {
        name = "null";
        address = "null";
    }

    /**
     * Adds name to personal details
     *
     * @param str the string to be added as a name
     */
    public void setName(String str) {
        name = str;
    }

    /**
     * Adds address as personal details
     *
     * @param str the string to be added as address
     */
    public void setAddress(String str) {
        address = str;
    }

    /**
     *
     * @return name + " " + address
     */
    @Override
    public String toString() {
        return name + " " + address;
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
