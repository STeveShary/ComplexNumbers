package complexNumbers;
class ComplexNumber {
    private double realComponent, imaginaryComponent, radius, theta;
    public ComplexNumber(boolean standardForm, double firstDouble, double secondDouble) {
        if (standardForm == true) {
            this.realComponent = firstDouble;
            this.imaginaryComponent = secondDouble;
            toPolarForm();
        } else {
            this.radius = firstDouble;
            this.theta = secondDouble;
            toStandardForm();
        }
    }
    public ComplexNumber add(ComplexNumber z2) {
        ComplexNumber z3;
        // NOTE:  You don't want to assign the new ComplexNumber(...) and return it in the same statement.
        // You should just return it.
        //
        // it should be reeturn new ComplexNumber(true, this.realComponent....
        return z3 = new ComplexNumber(true, this.realComponent + z2.realComponent,
                this.imaginaryComponent + z2.imaginaryComponent);
    }
    public ComplexNumber subtract(ComplexNumber z2) {
        ComplexNumber z3;

                this.imaginaryComponent - z2.imaginaryComponent);
    }
    public ComplexNumber multiply(ComplexNumber z2) {
        ComplexNumber z3;
        return z3 = new ComplexNumber(false, this.radius * z2.radius, this.theta + z2.theta);
    }
    public ComplexNumber divide(ComplexNumber z2) {
        ComplexNumber z3;
        return z3 = new ComplexNumber(false, this.radius / z2.radius, this.theta - z2.theta);
    }
    public ComplexNumber toThePowerOf(double x2) {
        ComplexNumber z3;
        return z3 = new ComplexNumber(false, Math.pow(this.radius, x2), this.theta * x2);
    }
    public ComplexNumber naturalLog() {
        return new ComplexNumber (true, Math.log(this.radius), this.theta);
    }
    private void toStandardForm() {
        realComponent = radius * Math.cos(theta);
        imaginaryComponent = radius * Math.sin(theta);
    }
    private void toPolarForm() {
        radius = Math.sqrt(Math.pow(realComponent, 2) + Math.pow(imaginaryComponent, 2));
        if (imaginaryComponent >= 0 & radius != 0) {
            theta = Math.acos(realComponent / radius);
        } else if (radius != 0) {
            theta = 2 * Math.PI - Math.acos(realComponent / radius);
        } else
            theta = 0;
    }
    public double getRealComponent() {
        return realComponent;
    }
    public double getImaginaryComponent() {
        return imaginaryComponent;
    }
    public double getRadius() {
        return radius;
    }
    public double getTheta() {
        return theta;
    }
}
