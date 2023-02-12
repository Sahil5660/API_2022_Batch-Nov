package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//purpose of this method to loadProperties file

public class LoadPropertiess {
	
	public static Properties LoadProperties(String Path) throws IOException {
		File f=new File(Path);
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);
		return pr;
	}

}
