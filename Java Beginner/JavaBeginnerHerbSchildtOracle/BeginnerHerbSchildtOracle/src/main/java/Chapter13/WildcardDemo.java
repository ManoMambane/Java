/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author MO
 */
// use a wildcard
class NumericFns<T extends Number> {

    T num;

//    pass constructor ti numeric object
    NumericFns(T n) {
        num = n;
    }

//    /return the reciprocal/
    double reciprocal() {
        return 1 / num.doubleValue();
    }
//    return fractional component

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

//    determain absolute values of two objects are the same
    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue())
                == Math.abs(ob.num.doubleValue())) {
            return true;
        }

        return false;
    }
}

public class WildcardDemo {

    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<Integer>(6);

        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);

        NumericFns<Long> lOb = new NumericFns<Long>(5L);

        System.out.println("Testing iOb and dOb.");
        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute values are equal.");
        } else {
            System.out.println("Absolute values differ.");
        }

        System.out.println();

        System.out.println("Testing iOb and lOb.");
        if (iOb.absEqual(lOb)) {
            System.out.println("Absolute values are equal.");
        } else {
            System.out.println("Absolute values differ.");
        }
    }
}
