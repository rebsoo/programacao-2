// Rebeca Oliveira Silva (ros4)

public class Point {
    private int x = 0, y = 0;
    
    Point(int x, int y) {
    	if (isValid(x) && isValid(y)) {
    		this.x = x;
        	this.y = y;	
    	}
    }

    public int getX() { 
    	return x; 
    	}
    
    public int getY() { 
    	return y; 
    	}

    public void setX(int x) {
    	if (isValid(x)) {
    		this.x = x; 	
    	}
    }
    public void setY(int y) { 
    	if (isValid(y)) {
    		this.y = y; 	
    	}
    }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    
    public boolean isValid(int value) {
    	if(value >=0 && value <= 400) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public static void main (String[] args) {
    	Point p = new Point(30, 20);
    	
    	System.out.println("Validando o construtor:");
    	System.out.println("O ponto x é: " + p.x); // 30
    	System.out.println("O ponto y é: " + p.y); // 20
   
    	p.setX(450); // não será possível porque não cumpre o contrato
    	p.setY(50); // válido    	
    	
    	System.out.println("Validando o setX e o setY:");
    	System.out.println("O ponto x é: " + p.x);
    	System.out.println("O ponto y é: " + p.y);
    	
    	p.moveBy(800, -10000); // não será possível por causa do contrato
    	p.moveBy(80, -10); // será possível
    	
    	System.out.println("Validando o moveBy:");
    	System.out.println("O ponto x é: " + p.x);
    	System.out.println("O ponto y é: " + p.y);
    	
    }
}