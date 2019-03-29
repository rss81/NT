package sandbox;

import java.io.File;

public class NT {

	public static void main(String[] args)throws Exception {
		String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir); 
        
        File folder = new File(currentDir);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
               System.out.println(file.getName());
            }
          }
	}

}
