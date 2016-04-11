package userinterface.properties;



import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;



public class DragLinear implements MouseMotionListener
{	
	public double xpercent,ypercent;
	public GUIGraphHandler g;
	int dx,dy;

	public DragLinear(GUIGraphHandler g1)
	{
		//theTabs.addMouseMotionListener(this);
		g = g1;
	//	System.out.println("DragLinear is here");
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e)
	{

	   	if(g.mousePt != null)
	   	{
	   		
		dx = e.getX() - g.mousePt.x;
        dy = e.getY() - g.mousePt.y;
        
        if(dx>0) g.xpercent = 0.02;
        else if(dx<0)    g.xpercent = -0.02;
        else g.xpercent =0 ;
        
        if(dy>0) g.ypercent = 0.02;
        else if(dy<0)    g.ypercent = -0.02;
        else g.ypercent =0 ;
        
        g.mousePt = e.getPoint();
        if(g.dragging) { g.doDrag(); }
      //  System.out.println("Dragged");
	   	}
    
		

	
		
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		   	

	}
	
}
