package Quadratic;

public class Quadratic {
    double a;
    double b;
    double c;

    public Quadratic(double a, double b, double c) { // Constrcuts a Quadratic equation with the given exponents
        this.a = a; // Coefficient of x^2
        this.b = b; // Coefficient of x
        this.c = c; // Constant Term
    }

    public void setA(double a) { // Sets the coefficient a.
        this.a = a;
    }

    public void setB(double b) { // Sets the coefficient b.
        this.b = b;
    }

    public void setC(double c) { // Sets the coefficient c.
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() { // Computes the discriminant of the quadratic equation.
        return b * b - 4 * a * c;
    }

    public boolean hasRealRoots() { // Determines if the quadratic equation has real roots.
        if (getDiscriminant() >= 0) {
            return true;
        }

        return false;
    }

    public double[] getRoots() { // Computes the real roots of the quadratic equation, if they exist.
        double discriminant = getDiscriminant();

        if (hasRealRoots()) {
            return new double[] {
                    (-b + Math.sqrt(discriminant)) / (2 * a), // Value for root 1
                    (-b - Math.sqrt(discriminant)) / (2 * a) // Value for root 2
            };
        }

        return new double[2]; // Fix later
    }


    public void getStandardForm() { // Prints the quadratic equation in standard form (ax^2 + bx + c).
        System.out.println(a + "x^2 + " + b + "x + " + c);

    }

    public void getVertexForm() { // Prints the quadratic equation in vertex form.
        double[] vertex = getVertex();

        System.out.println(a + "(x" + (-vertex[1]) + ")" + vertex[2]);
    }

    public void getFactoredForm() { // Prints the quadratic equation in factored form.

    }

    public double[] getVertex() { // Computes the vertex of the parabola.
        return new double[2];
    }

    public boolean isMaxiumum() { // Determines if the quadratic function has a maximum point.
        return true;
    }

    public double getXIntercept() { // Computes the x-intercepts of the quadratic equation, if they exist.
        return 0.0; // ???????
    }

    public double getYIntercept() { // Computes the y-intercept of the quadratic equation.
        return 0.0;
    }
}
