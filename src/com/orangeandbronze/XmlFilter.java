package com.orangeandbronze;

import java.io.File;

public class XmlFilter implements FilenameFilter {

	@Override
	public boolean accept(File directory, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".xml");
	}

}
