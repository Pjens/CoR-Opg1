
class Main {
	  
	  public static void main( String[] argv ) {
	    
	    // Opbygning af decorator-kæde
	    
	    Component deskTop = new DeskTop( 800, 600 );
	    Component window1 = new Window( deskTop, 300, 250, 250, 300 );
	    Component window2 = new Window( window1,  50, 250, 200, 250 );
	    Component window3 = new Window( window2, 400, 150, 250, 350 );
	    Component window4 = new Window( window3, 100, 100, 400, 300 );
	    
	    // client
	    
	    window2.mouseClick( 450, 250 );
	  }
}