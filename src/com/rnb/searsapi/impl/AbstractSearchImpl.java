package com.rnb.searsapi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rnb.searsapi.base.BaseCriteria;
import com.rnb.searsapi.base.ParserUtil;
import com.rnb.searsapi.base.SearchException;

/**
 * The Abstract class that implements methods common to all the search
 * implementation classes.
 *
 * @author tarung
 */
public abstract class AbstractSearchImpl {

	/** The logger. */
	static final Logger logger = LoggerFactory.getLogger(AbstractSearchImpl.class);

	/** The parser utility */
	private final ParserUtil util = new ParserUtil();

	/**
	 * Generic implementation of the search method.
	 *
	 * @param <T> the generic type of the search results class.
	 * @param criteria the search criteria object.
	 * @param type the class type of search results.
	 * @param nestedLevel the nested level at which the search result data would
	 *            be found.
	 * @return the search results.
	 * @throws SearchException a runtime exception thrown in case of any errors
	 *             encountered while performing search calls.
	 */
	protected <T> T search(final BaseCriteria criteria, final Class<T> type, final int nestedLevel) {
		try {
			return util.performSearch(criteria, type, nestedLevel);
		} catch (final Exception e) {
			final String msg = "Error occurred while performing query: " + e.getMessage();
			logger.error(msg, e);
			throw new SearchException(msg, e);
		}
	}

}
