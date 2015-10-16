package projets;

public class Verifcase {
	
	
	public int[] Click (int line, int column, int typeDeCase)
	{
		int [] tab = new int [2];
		if (this.IsValid( line, column, typeDeCase))
		{
			for ( int x = line-1; x<=line+1 ;x++)
			{
				for ( int y = column-1; y<= column+1 ; y++)
				{
					if (this.IsValid( x,y, 0))
					{
					 tab[0]=x ;
					 tab[1]=y ;
					return tab;
					}
				}
			}
			return null;
			
		}
		
		return null ;
		
	}
	
	public boolean IsValid(int line, int column, int typeDeCase)
	{
		if ( line > 30 && line <=0 && column > 30 && column <= 0 && typeDeCase == 0)
		{
			return true;
		}
		return false;
	}

}
