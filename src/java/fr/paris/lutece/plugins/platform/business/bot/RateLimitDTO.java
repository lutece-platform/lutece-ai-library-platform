/*
 * Copyright (c) 2002-2026, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.platform.business.bot;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * Data Transfer Object exposing the rate limit state of a user on a bot.
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class RateLimitDTO
{

    @JsonProperty( "userId" )
    private String userId;

    @JsonProperty( "botId" )
    private int botId;

    @JsonProperty( "messageCount" )
    private int messageCount;

    @JsonProperty( "dateFirstMessage" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp dateFirstMessage;

    /**
     * Default constructor
     */
    public RateLimitDTO( )
    {
    }

    /**
     * Gets the user identifier
     *
     * @return the user identifier
     */
    public String getUserId( )
    {
        return userId;
    }

    /**
     * Sets the user identifier
     *
     * @param userId
     *            the user identifier
     */
    public void setUserId( String userId )
    {
        this.userId = userId;
    }

    /**
     * Gets the bot identifier
     *
     * @return the bot identifier
     */
    public int getBotId( )
    {
        return botId;
    }

    /**
     * Sets the bot identifier
     *
     * @param botId
     *            the bot identifier
     */
    public void setBotId( int botId )
    {
        this.botId = botId;
    }

    /**
     * Gets the number of messages consumed in the current window
     *
     * @return the message count
     */
    public int getMessageCount( )
    {
        return messageCount;
    }

    /**
     * Sets the number of messages consumed in the current window
     *
     * @param messageCount
     *            the message count
     */
    public void setMessageCount( int messageCount )
    {
        this.messageCount = messageCount;
    }

    /**
     * Gets the timestamp of the first message of the current window
     *
     * @return the first message timestamp
     */
    public Timestamp getDateFirstMessage( )
    {
        return dateFirstMessage;
    }

    /**
     * Sets the timestamp of the first message of the current window
     *
     * @param dateFirstMessage
     *            the first message timestamp
     */
    public void setDateFirstMessage( Timestamp dateFirstMessage )
    {
        this.dateFirstMessage = dateFirstMessage;
    }
}
