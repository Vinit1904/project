 /*42.	Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/

class Tile{
	double length;
	Tile(double length){
		this.length=length;
	}
}

class FloorCalc{
	private double f_length;
	private double f_width;
	
	FloorCalc(double f_length,double f_width){
		this.f_length=f_length;
		this.f_width=f_width;
	}
	
	void totalTiles(Tile t){
		
		double area=f_length*f_width;
		double tileArea=t.length*t.length;
		
		double totalTile=area/tileArea;
		
		System.out.println("Total tile: "+totalTile);
	}	
}

class floor{
	
	public static void main( String[] args ) 
    {
		FloorCalc f= new FloorCalc(10,10);
		Tile t =new Tile(2);
		
		f.totalTiles(t);
		
	}
	
}