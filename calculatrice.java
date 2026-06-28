public class calculatrice {
     public double addition(double a, double b) {
        return a + b;
    }
    public double soustraction(double a, double b) {
        return a - b;
    }
       public double multiplier(double a, double b) {
        return a * b;
    }
  public double diviser(double a, double b){
        return a / b;
    }
    public double racineCarree(double a){
        return Math.sqrt(a);
    }
 public double division(double a, double b){
        if(b==0){
            throw new IllegalArgumentException("division par zero interdite");
        }
        return a / b;}

}
