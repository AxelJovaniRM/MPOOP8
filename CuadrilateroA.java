public class CuadrilateroA extends PoligonoA{
  private int alfa,beta;
  private float a,b,base,altura;

  public CuadrilateroA(){}
  
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

  public void setBase(float base){
    this.base=base;
  }
  public float getBase(){
    return base;
  }

  public void setAltura(float altura){
    this.altura=altura;
  }
  public float getAltura(){
    return altura;
  }
  

  @Override
  public double area(){
    return base*altura;
  }
  
  @Override
  public double perimetro(){
    return 2*(a+b);
  }
                                                        
  @Override 
  public String toString(){
    return "CuadrilateroA{Base="+base+" Altura="+altura+"}";
  }
}

