package image1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 File file1 = new File("C:/Users/plpre/Desktop/a.jpg");
		 File file2 = new File("C:/Users/plpre/Desktop/b.jpg");
			BufferedImage sea = null;
			BufferedImage body = null;
			try {
				sea = ImageIO.read(file1);
				body = ImageIO.read(file2);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

             int green=body.getRGB(0,0);
              int imgWidth = sea.getWidth();
      		int imgHeight = sea.getHeight();
      		
			for(int i=0;i<imgHeight;i++)
			{
				for(int j=0;j<imgWidth;j++)
				{
					if(body.getRGB(j,i)!=green)
					{
						sea.setRGB(j,i,body.getRGB(j, i));
					}
				
				}
				
			}
				
			
			
			
		    File outputfile = new File("C:/Users/plpre/Desktop/e.jpg");
			try {
				ImageIO.write(sea, "jpg", outputfile);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

}
