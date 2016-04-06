package com.rnb.searsapi.base;

/**
 * A utility class with some static methods.
 *
 * @author tarung
 */
public class StaticUtil {

	/**
	 * Checks if a String is null empty.
	 *
	 * @param str the input string
	 * @return true, if it is null or empty
	 */
	public static boolean isEmpty(final String str) {
		if (str != null) {
			return str.isEmpty();
		}
		return true;
	}

	/**
	 * Checks if a string is blank.
	 *
	 * @param str the input string
	 * @return true, if it is blank
	 */
	public static boolean isBlank(final String str) {
		if (str != null) {
			return str.trim().isEmpty();
		}
		return true;
	}

}
