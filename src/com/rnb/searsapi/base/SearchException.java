package com.rnb.searsapi.base;

/**
 * The Exception thrown in case of any errors encountered while performing
 * search calls.
 *
 * @author tarung
 */
public class SearchException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new search exception.
	 */
	public SearchException() {
		super();
	}

	/**
	 * Instantiates a new search exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public SearchException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new search exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public SearchException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new search exception.
	 *
	 * @param message the message
	 */
	public SearchException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new search exception.
	 *
	 * @param cause the cause
	 */
	public SearchException(final Throwable cause) {
		super(cause);
	}

}
