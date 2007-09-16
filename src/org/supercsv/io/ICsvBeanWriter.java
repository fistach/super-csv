package org.supercsv.io;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.supercsv.cellprocessor.ift.CellProcessor;

/**
 * Supertype for all writers writing using beans
 * 
 * @author Kasper B. Graversen
 */
public interface ICsvBeanWriter extends ICsvWriter {
	/**
	 * Write an object
	 * 
	 * @param source
	 *            at object (bean instance) whose values to extract
	 * @param nameMapping
	 *            defines the fields of the class that must be written. null values are not allowed *
	 * @since 1.0
	 */
	public void write(Object source, String[] nameMapping) throws IOException, IllegalAccessException, InvocationTargetException;

	/**
	 * Write an object
	 * 
	 * @param source
	 *            at object (bean instance) whose values to extract
	 * @param nameMapping
	 *            defines the fields of the class that must be written. null values are not allowed
	 * @since 1.0
	 */
	public void write(Object source, String[] nameMapping, CellProcessor[] processor, StringBuilder errorLog) throws IOException, IllegalAccessException, InvocationTargetException;

}
