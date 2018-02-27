package com.orangeandbronze;

import java.io.File;

public interface FilenameFilter {
	
	boolean accept(File directory, String name);

}
