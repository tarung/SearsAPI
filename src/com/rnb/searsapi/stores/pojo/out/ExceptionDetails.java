package com.rnb.searsapi.stores.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Exception Details - In case when exception is thrown by the server while
 * performing stores search.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExceptionDetails {

	/** The exception stack. */
	@JsonProperty("exceptionStack")
	private String exceptionStack;

	/**
	 * Gets the exception stack.
	 *
	 * @return the exception stack
	 */
	public String getExceptionStack() {
		return exceptionStack;
	}

	/**
	 * Sets the exception stack.
	 *
	 * @param exceptionStack the new exception stack
	 */
	public void setExceptionStack(final String exceptionStack) {
		this.exceptionStack = exceptionStack;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ExceptionDetails [exceptionStack=").append(exceptionStack).append("]");
		return builder.toString();
	}

}
