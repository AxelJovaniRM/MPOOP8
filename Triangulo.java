public class Triangulo extends Poligono{
  private int alfa,beta,gama;
  private float a,b,c;
  private float base,alt;

  public Triangulo(){}

  public void setBase(float base){
    this.base=base;
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
    return"Triangulo{base="+base+" altura="+alt+"}";
  }
}