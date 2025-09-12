
public class NumeroComplexo {
    public double a;
    public double b;
  
    public NumeroComplexo(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return a + " + " + b + " i";
    }
    
    public double modulo() {
        return Math.sqrt((a*a)+(b*b));
    }
       
    public NumeroComplexo adicionar(NumeroComplexo z) {
        double a = this.a, b = this.b, c = z.a, d = z.b;
        //z1 = a + bi, z2 = c + di, z1+z2 = (a+c) + (b+d)i
        NumeroComplexo res = new NumeroComplexo(a+c,b+d);
        return res;
    }
    
    public NumeroComplexo multiplicar(NumeroComplexo z) {
        double a = this.a, b = this.b, c = z.a, d = z.b;
        //z1 = a + bi, z2 = c + di, z1*z2 = (ac - bd) + (ad + bc)i
        NumeroComplexo res = new NumeroComplexo((a*c - b*d), (a*d + b*c));
        return res;
    }

}
