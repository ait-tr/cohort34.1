package ait.equation;

import ait.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation eq1 = new QuadraticEquation(1, 2, 1);
        eq1.display();
        System.out.println("Delta = " + eq1.delta());
        System.out.println("Number of roots = " + eq1.quantityRoots());
        QuadraticEquation eq2 = new QuadraticEquation(4, 7, 3);
        eq2.display();
        System.out.println("Delta = " + eq2.delta());
        System.out.println("Number of roots = " + eq2.quantityRoots());
        QuadraticEquation eq3 = new QuadraticEquation(2, 5, 9);
        eq3.display();
        System.out.println("Delta = " + eq3.delta());
        System.out.println("Number of roots = " + eq3.quantityRoots());
    }
}
