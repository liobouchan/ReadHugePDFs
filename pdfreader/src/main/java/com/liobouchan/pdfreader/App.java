package com.liobouchan.pdfreader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LineIterator it = FileUtils.lineIterator(file,"UTF-8");
        try {
        	while (it.hasNext()) {
        		String line = it.nextLine();
        		// hacer cosas
			}
		} finally {
			// TODO: handle finally clause
			LineIterator.closeQuietly(it);
		}
    }
}
