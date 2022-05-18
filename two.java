package image1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class two {

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

            
              int imgWidth = sea.getWidth();
      		int imgHeight = sea.getHeight();
      		
      		
      	BufferedImage newImage = new BufferedImage(imgWidth , 2*imgHeight,BufferedImage.TYPE_INT_RGB);
          for (int i = 0; i < newImage.getHeight() ; i++){
              for (int j = 0 ; j < newImage.getWidth() ; j++){
                  
            	  if(i<imgHeight)
            		  newImage.setRGB(j,i,sea.getRGB(j,i));
            	  else
                         newImage.setRGB(j,i, body.getRGB(j,i-imgHeight));
              }
              }
          

		    File outputfile = new File("C:/Users/plpre/Desktop/d.jpg");
		    
			try {
				ImageIO.write(newImage, "jpg", outputfile);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
}


