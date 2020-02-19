
package programpacman;


public class PacMan {
  public int x, y, width, height;
PacMan(){
    
}  
public void moveLeft(){
    if (x<width || x>0) {
        x =x-1;
        
    }
}
public void moveRight(){
    if (x<width || x>0) {
        x =x+1;
        
    }
    
}
public void moveUp(){
    if (y<height || y>0) {
        y =y-1;
        
    }
    
}
public void moveDown(){
    if (y<height && y>0) {
        y =y-1;
        
    }
    
}
public void PrintPosition(){
    System.out.println("Titik koordinat adalah\t : "+x+","+y);
}
}
