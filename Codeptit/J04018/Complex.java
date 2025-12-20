package J04018;

public class Complex {
    int real,  imag;
    public Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }
    public int getReal(){
        return real;
    }
    public int getImag(){
        return imag;
    }
    public Complex add(Complex z) throws Exception{
        return new Complex(real + z.getReal(),imag + z.getImag());
    }
    public Complex mul(Complex z) throws Exception{
        return new Complex(real * z.getReal() - imag * z.getImag(), real * z.getImag() + imag * z.getReal());
    }
    @Override
    public String toString(){
        String ope = (imag >= 0) ? " + " : " - ";
        return real + ope + Math.abs(imag) + "i";
    }
}
