public class TrianguloA extends PoligonoA{
  private int alfa,beta,gama;
  private float a,b,c;
  private float base,alt;

  public TrianguloA(){}

  public void setAlfa(int alfa){
    this.alfa=alfa;
  }
  public int getAlfa(){
    return alfa;
  }
    public void setBeta(int beta){
    this.beta=beta;
  }
  public int getBeta(){
    return beta;
  }
    public void setGama(int gama){
    this.gama=gama;
  }
  public int getGama(){
    return gama;
  }
    public void setA(float a){
    this.a=a ;
  }
  public float getA(){
    return a;
  }
    public void setB(float b){
    this.b=b ;
  }
  public float getB(){
    return b;
  }
    public void setC(float c){
    this.c=c ;
  }
  public float getC(){
    return c;
  }
    public void setBase(float base){
    this.base=base ;
  }
  public float getBase(){
    return base;
  }

  public void setAlt(float alt){
    this.alt=alt;
  }
  public float getAlt(){
    return alt;
  }

  @Override
  public double area(){
    return base*alt/2  ;
  }

  @Override 
  public double perimetro(){
    return a+b+c;
  }

  @Override
  public String toString(){
    return"TrianguloA{base="+base+" altura="+alt+"}";
  }
}

