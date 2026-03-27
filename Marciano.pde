public class Marciano {
 private int xPosition;
 private int yPosition;
 
 public Marciano(int xPos, int yPos) {
   this.xPosition = xPos;
   this.yPosition = yPos;
 }
 
 public void actualizarPosicion(int xUpdate, int yUpdate) {
   if (this.xPosition < 600 - 20)
   {this.xPosition += xUpdate;}
   
   if (this.yPosition < 600 - 20)
   {this.yPosition += yUpdate;}
 }
 
 public void dibujarMarciano() {
   fill(0,175,0);
   ellipse(this.xPosition, this.yPosition, 40, 40);
 }
}
