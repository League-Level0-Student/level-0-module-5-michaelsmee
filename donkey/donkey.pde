PImage Donkey;
PImage Tail;
PImage lol;
void setup() 
{


Donkey = loadImage("Donkey.jpg");
Tail = loadImage("Tail.png");
lol = loadImage("lol.png");
size(265,190);
}

void draw()
{

image(Tail, mouseX, mouseY);
image(Tail, mouseX-10, mouseY-20);
rect(0,0,30,30);
rect(205,30,40,40);
if(dist(0,0,mouseX,mouseY)<30) {
 background (Donkey);
}
else
{
background(200,200,200);
}
}