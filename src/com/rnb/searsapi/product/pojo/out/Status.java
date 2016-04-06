package com.rnb.searsapi.product.pojo.out;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Status data for the search result, for successful searches the
 * respMessage is 'Successful'.
 *
 * @author tarung
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status
{

	/** The response code. */
	@JsonProperty("ResponseCode")
	private String responseCode;

	/** The response message. */
	@JsonProperty("RespMessage")
	private String respMessage;

	/**
	 * Gets the response code.
	 *
	 * @return the response code
	 */
	public String getResponseCode()
	{
		return responseCode;
	}

	/**
	 * Sets the response code.
	 *
	 * @param responseCode the new response code
	 */
	public void setResponseCode(final String responseCode)
	{
		this.responseCode = responseCode;
	}

	/**
	 * Gets the response message.
	 *
	 * @return the response message
	 */
	public String getRespMessage()
	{
		return respMessage;
	}

	/**
	 * Sets the response message.
	 *
	 * @param respMessage the new response message
	 */
	public void setRespMessage(final String respMessage)
	{
		this.respMessage = respMessage;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Status [responseCode=").append(responseCode).append(", respMessage=").append(respMessage)
				.append("]");
		return builder.toString();
	}

}
