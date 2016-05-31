package practices.accessing.methods.and.variables;

public class Temp {
    
    String str;
    int var;
    
    Temp(){ str = "Java"; }
    
    void setStr(String str){ this.str = str; }
    void setVar(int var) { this.var = var; }
    
    public static void main(String[] args){
        
        Temp tmp = new Temp();
        
        tmp.var = 10; 
        tmp.setVar(10);   
    
    }
}
