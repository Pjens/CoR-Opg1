class DeskTop implements Component {
  
  private int width, height;
  
  public DeskTop( int width, int height ) {
    this.width = width;
    this.height = height;
  }
  
  public void mouseClick( int x, int y ) {
   
    System.out.println( this );
  }
  
  public String toString() {
    return "[DeskTop: width=" + width +  ", height=" + height + "]";
  }
}