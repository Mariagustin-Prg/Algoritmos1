public Marciano m;

void setup() 
{
  background(0);
  fill(0,0,0);
  size(600, 600);
  ellipseMode(CENTER);
  rectMode(CENTER);
  m = new Marciano(100, 100);
}

void draw() {
  background(0);
  m.actualizarPosicion(10, 10);
  m.dibujarMarciano();
}
