package dbhelpers;

import java.awt.FlowLayout;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.File;


import dbhelpers.SearchQueryStub.Photo;
import dbhelpers.SearchQueryStub.Students;

public class Test {

	public static void main(String[] args)
			throws SearchQuerySQLExceptionException, SearchQueryIOExceptionException, IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		SearchQueryStub stub = new SearchQueryStub();

		SearchQueryStub.DoSearch params = new SearchQueryStub.DoSearch();

		params.setQueryS("r");

		SearchQueryStub.DoSearchResponse response = stub.doSearch(params);

		Students[] result = response.get_return();

		for (int i = 0; i < result.length; i++) {

			System.out.println("Firstname: " + i + " -- " + result[i].getFirstname());
			System.out.println("Lastname: " + i + " -- " + result[i].getLastname());
			System.out.println("Birthday: " + i + " -- " + dateFormat.format(result[i].getBday()));
			
			System.out.println("**********************");

		}

		SearchQueryStub.GetPhoto paramph = new SearchQueryStub.GetPhoto();

		paramph.setStudentid(50);

		SearchQueryStub.GetPhotoResponse responseph = stub.getPhoto(paramph);

		Photo resultph = responseph.get_return();

		
		 BufferedImage bufferedImage = null;
	        byte[] imageByte;
	       
	        
	        
	        try {

	            imageByte = Base64.getDecoder().decode(resultph.getBase64Image());	            
	            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
	            bufferedImage = ImageIO.read(bis);
	            bis.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		ImageIcon imageIcon = new ImageIcon(bufferedImage);
		Image img = imageIcon.getImage();
		Image newimg = img.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(300, 300);
		
		JLabel jLabel = new JLabel();
		jLabel.setName("Student ID: " + resultph.getStudentId());
		jLabel.setIcon(newIcon);
		
		jFrame.add(jLabel);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
