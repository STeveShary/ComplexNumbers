package complexNumbers;

public class Application {
    public static void main(String[] args) {
        boolean standardForm;
        ComplexNumber z1 = new ComplexNumber(standardForm = true, 1, 1);
        ComplexNumber z2 = new ComplexNumber(standardForm = true, 1, -1);
        System.out.println("real1: " + z1.getRealComponent());
        System.out.println("imaginary1: " + z1.getImaginaryComponent());
        System.out.println();
        System.out.println("real2: " + z2.getRealComponent());
        System.out.println("imaginary2: " + z2.getImaginaryComponent());
        System.out.println();
        System.out.println("real added: " + z1.add(z2).getRealComponent());
        System.out.println("imaginary added: " + z1.add(z2).getImaginaryComponent());
        System.out.println();
        System.out.println("real subtracted: " + z1.subtract(z2).getRealComponent());
        System.out.println("imaginary subtracted: " + z1.subtract(z2).getImaginaryComponent());
        System.out.println();
        System.out.println("real multiplied: " + z1.multiply(z2).getRealComponent());
        System.out.println("imaginary multiplied: " + z1.multiply(z2).getImaginaryComponent());
        System.out.println();
        System.out.println("real divided: " + z1.divide(z2).getRealComponent());
        System.out.println("imaginary divided: " + z1.divide(z2).getImaginaryComponent());
        System.out.println();
        System.out.println("radius of quotient: " + z1.divide(z2).getRadius());
        System.out.println("theta of quotient: " + z1.divide(z2).getTheta());
        System.out.println();
        System.out.println("cubed root of z1; real component: " + z1.toThePowerOf(1.0 / 3.0).getRealComponent());
        System.out.println(
                "cubed root of z1; imaginary component: " + z1.toThePowerOf(1.0 / 3.0).getImaginaryComponent());
        System.out.println();
        System.out.println("The natural logarithm of z1; real component: " + z1.naturalLog().getRealComponent());
        System.out.println("The natural logarithm of z1; imaginary component: " + z1.naturalLog().getImaginaryComponent());
// System.out.println("r: " + z1.getRadius());
// System.out.println("theta: " + z1.getTheta());
    }
}