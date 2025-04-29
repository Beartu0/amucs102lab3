public class triangle2 {
    private double base;
    private double height;

    public triangle2(){
        this.height=1.0;
        this.base=1.0;
    }
    public triangle2(double x,double y){
        height=y;
        base=x;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;

    }
    public void setHeight(int x){
        height=x;
    }
    public void setBase(int y ){
        base=y;
    }
    public String toString(){
        return "base="+base+" height="+ height;
    }
    public triangle2 tripleBase() {
        return new triangle2(base * 3, height);
    }
    public double area(){
        return (height*base)/2;
    }
    public boolean equals (triangle2 t){
        return(this.base==t.base&&this.height==t.height);
    }
}

