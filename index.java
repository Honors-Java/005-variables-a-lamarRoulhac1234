int xPos1 = 70;
int yPos1 = 225;
int xPos2 = 225;
int yPos2 = 75;
int width = 100;
int height = 100;



void setup() {
	size(300, 300);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(175);

  ellipse(xPos1, yPos2, width, height);
  ellipse(xPos2, yPos2, width, height);
  ellipse(xPos1, yPos1, width, height);
  ellipse(xPos2, yPos1, width, height);
  
 
}