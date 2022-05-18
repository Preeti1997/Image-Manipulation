package image1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Text {

	public static void main(String[] args) {

		String line;
		int count = 0;
		System.out.println("1111");
		File file1 = new File("C:/Users/plpre/Desktop/er.txt");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file1));
			while ((line = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					if (st.nextToken().equals("dog")) {
						count++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
