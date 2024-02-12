package Serialization_Deserialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Rectangle implements Serializable {
	private double hight;
	private double width;

	public Rectangle(double hight, double width) {

		this.hight = hight;
		this.width = width;
	}

	public double area()

	{
		return hight * width;

	}

	public double perimeter() {

		return 2 * (hight + width);
	}

	public static void serializedToFile(Object classObj, String FileName) {
		try {

			FileOutputStream fos = new FileOutputStream(FileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(classObj);

			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object desiralizationFromFileToObject(String fileName) {

		try {

			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object desirialized = ois.readObject();
			ois.close();
			fis.close();
			return desirialized;

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(18, 19);
		serializedToFile(rec, "serialiazedRectacgle1");
		Rectangle deSerialized = (Rectangle) desiralizationFromFileToObject("serialiazedRectacgle1");
		System.out.println(deSerialized);

	}

}