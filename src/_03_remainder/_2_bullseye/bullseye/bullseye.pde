  
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=11;i>1;i-=1){
   if(i % 2==1){
    fill(255,0,0); 
   }
   else{
    fill(0,0,0);
   }
  ellipse(250,250,i*44,i*44);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
