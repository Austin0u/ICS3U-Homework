package Quadratic;

public class Main {
    public static void main(String[] args) {
        // Case 1: Two distinct real roots (discriminant > 0)
        System.out.println("=== Case 1: Two Real Roots ===");
        Quadratic quadratic1 = new Quadratic(1, -3, 2); // x^2 - 3x + 2
        testQuadratic(quadratic1);

        // Case 2: One real root (discriminant == 0)
        System.out.println("\n=== Case 2: One Real Root ===");
        Quadratic quadratic2 = new Quadratic(1, -2, 1); // x^2 - 2x + 1
        testQuadratic(quadratic2);

        // Case 3: No real roots (discriminant < 0)
        System.out.println("\n=== Case 3: No Real Roots ===");
        Quadratic quadratic3 = new Quadratic(1, 0, 1); // x^2 + 1
        testQuadratic(quadratic3);
    }

    private static void testQuadratic(Quadratic quadratic) {
        quadratic.getStandardForm();
        quadratic.getVertexForm();
        quadratic.getFactoredForm();

        System.out.println("Discriminant: " + quadratic.getDiscriminant());
        System.out.println("Is Maximum: " + quadratic.isMaximum());
        System.out.println("Has Real Roots: " + quadratic.hasRealRoots());
        
        if (quadratic.hasRealRoots()) {
            double[] roots = quadratic.getRoots();
            
            if (roots[0] == roots[1]) {
                System.out.println("The quadratic equation has one root: " + roots[0]);
            } else {
                System.out.println("The quadratic equation has two roots: " + roots[0] + " and " + roots[1]);
            }
        } else {
            System.out.println("The quadratic equation has no real roots.");
        }
        

        double[] vertex = quadratic.getVertex();
        System.out.println("Vertex: (" + vertex[0] + ", " + vertex[1] + ")");
    }
}