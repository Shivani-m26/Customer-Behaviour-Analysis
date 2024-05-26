package User;

import java.io.BufferedReader;
import java.io.FileReader;

import weka.core.Instances;

public class MyUtilsForWekaInstanceHelper {
	public static Instances getInstanceFromFile(String pFileName)
	{
	    Instances data = null;
	    try {
	        BufferedReader reader = new BufferedReader(new FileReader(pFileName));
	        data = new Instances(reader);
	        reader.close();
	        // setting class attribute
	        data.setClassIndex(data.numAttributes() - 1);
	    }
	    catch (Exception e) {
	        throw new RuntimeException(e);
	    } 
	    return data;

	}
}
