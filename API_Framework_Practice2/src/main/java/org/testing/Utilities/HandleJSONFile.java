package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class HandleJSONFile {
	
	public static String LoadJSONFile(String path) throws FileNotFoundException {
	
	File f=new File(path);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject ob=new JSONObject(js);
	return ob.toString();

}
}