package image1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

public class rotate {

	public static void main(String[] args) {
		
		 File file2 = new File("C:/Users/plpre/Desktop/b.jpg");
	
			BufferedImage body = null;
			try {
			
				body = ImageIO.read(file2);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			   int imgWidth = body.getWidth();
	      	   int imgHeight = body.getHeight();

	      	   
	      	   for(int i=0;i<imgHeight/2;i++)
	      	   {
	      		   for(int j=0;j<imgWidth;j++)
	      		   {
	      			   
	      			 if(i!=imgHeight-1-i)
	      			   {
	      			  int temp=body.getRGB(j, i);
	      			   body.setRGB(j, i,body.getRGB(j,imgHeight-1-i));
	      			   body.setRGB(j,imgHeight-1-i,temp);
	      			   }
	      			   
	      			   
	      			   
	      		   }
	      	   }
	      	   
	      	   
	      	for(int i=0;i<imgHeight;i++)
	      	{
	      		for (int j = 0; j< imgWidth/ 2; j++) {
	      			
	                int t = body.getRGB(j,i);
	                body.setRGB(j, i,body.getRGB(imgWidth-1-j,i));
	                body.setRGB(imgWidth-1-j,i,t);
	            }
	      	}
	           
	           
	            
	         
	            
	           File outputfile = new File("C:/Users/plpre/Desktop/rotated.jpg");
				try {
					ImageIO.write(body, "jpg", outputfile);
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		

	}

}
