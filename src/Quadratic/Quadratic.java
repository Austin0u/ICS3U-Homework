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
    
        if (discriminant >= 0) { // Two distinct real roots
            return new double[] {
                (-b + Math.sqrt(discriminant)) / (2 * a), // Value for root 1
                (-b - Math.sqrt(discriminant)) / (2 * a) // Value for root 2
            };
        } else { // No real roots
            return new double[] {0, 0}; // Placeholder values
        }
    }

    public void getStandardForm() { // Returns the quadratic equation in standard form (ax^2 + bx + c).
        System.out.println( 
            a + "x^2" // Coefficient of x^2
            + ((b != 0) ? ((b < 0) ? " " : " +") + b + "x" : "") // Coefficient of x
            + ((c != 0) ? ((c < 0) ? " " : " +") + c : "") // Constant term
        );
    }

    public void getVertexForm() { // Prints the quadratic equation in vertex form.
        double[] vertex = getVertex();

        System.out.println(
            a // stretch factor
            + ((vertex[0] != 0) ? "(x" + ((-vertex[0] < 0) ?  "" : "+") + (-vertex[0]) + ")" : "x") + "^2 " // x-coordinate of the vertex
            + ((vertex[1] != 0) ? ((vertex[1] < 0) ?  "" : "+") + (vertex[1]) : "") // y-coordinate of the vertex
        );
    }

    public void getFactoredForm() { // Prints the quadratic equation in factored form.
        double[] roots = getRoots();

        if (roots[0] == 0 && roots[1] == 0) { // No real roots
            System.out.println("No Factored Form (No Real Roots)");
        } else if (roots[0] == roots[1]) { // One root
            System.out.println(
                a // stretch factor
                + ((roots[0] != 0) ? "(x" + ((-roots[0] < 0) ? "" : "+") + -roots[0] + ")" : "") // root 1
                );
        } else {
            System.out.println(
            a // stretch factor
            + ((roots[0] != 0) ? "(x" + ((-roots[0] < 0) ? "" : "+") + -roots[0] + ")": "") // root 1
            + ((roots[1] != 0) ? "(x" + ((-roots[1] < 0) ? "" : "+") + -roots[1] + ")": "") // root 2
            );
        }
        
    }

    public double[] getVertex() { // Computes the vertex of the parabola.
        return new double[] {
            (-b / (2 * a) != 0) ? -b / (2 * a) : 0, // x-coordinate of the vertex (ternary to avoid -0.0)
            c - a * Math.pow(b / (2 * a),2) // y-coordinate of the vertex
        };
    }

    public boolean isMaximum() { // Determines if the quadratic function has a maximum point.
        return (a < 0); 
    }

    public double getXIntercept() { // Computes the x-intercepts of the quadratic equation, if they exist.
        return 0.0; // ???????
    }

    public double getYIntercept() { // Computes the y-intercept of the quadratic equation.
        return c;
    }
}
