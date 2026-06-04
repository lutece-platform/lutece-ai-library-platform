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
package fr.paris.lutece.plugins.platform.business.conversation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for Feedback representing user feedback on bot messages
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class FeedbackDTO implements Serializable
{
    private static final long serialVersionUID = 1L;

    @JsonProperty( "id" )
    private int _nId;

    @JsonProperty( "messageId" )
    private int _nMessageId;

    @JsonProperty( "userId" )
    private String _strUserId;

    @JsonProperty( "botId" )
    private int _nBotId;

    @JsonProperty( "isPositive" )
    private boolean _bIsPositive;

    @JsonProperty( "comment" )
    private String _strComment;

    @JsonProperty( "status" )
    private String _strStatus;

    @JsonProperty( "createdAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampCreatedAt;

    @JsonProperty( "updatedAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampUpdatedAt;

    /**
     * Default constructor
     */
    public FeedbackDTO( )
    {
    }

    /**
     * Constructor with all required fields
     * 
     * @param nMessageId
     *            The message ID
     * @param strUserId
     *            The user ID
     * @param nBotId
     *            The bot ID
     * @param nClientId
     *            The client ID
     * @param bIsPositive
     *            Whether the feedback is positive
     */
    public FeedbackDTO( int nId, int nMessageId, String strUserId, int nBotId, boolean bIsPositive, String strComment, String strStatus,
            Timestamp timestampCreatedAt, Timestamp timestampUpdatedAt )
    {
        _nId = nId;
        _nMessageId = nMessageId;
        _strUserId = strUserId;
        _nBotId = nBotId;
        _bIsPositive = bIsPositive;
        _strComment = strComment;
        _strStatus = strStatus;
        _timestampCreatedAt = timestampCreatedAt;
        _timestampUpdatedAt = timestampUpdatedAt;
    }

    /**
     * Returns the feedback ID
     * 
     * @return The feedback ID
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the feedback ID
     * 
     * @param nId
     *            The feedback ID
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the message ID
     * 
     * @return The message ID
     */
    public int getMessageId( )
    {
        return _nMessageId;
    }

    /**
     * Sets the message ID
     * 
     * @param nMessageId
     *            The message ID
     */
    public void setMessageId( int nMessageId )
    {
        _nMessageId = nMessageId;
    }

    /**
     * Returns the user ID
     * 
     * @return The user ID
     */
    public String getUserId( )
    {
        return _strUserId;
    }

    /**
     * Sets the user ID
     * 
     * @param strUserId
     *            The user ID
     */
    public void setUserId( String strUserId )
    {
        _strUserId = strUserId;
    }

    /**
     * Returns the bot ID
     * 
     * @return The bot ID
     */
    public int getBotId( )
    {
        return _nBotId;
    }

    /**
     * Sets the bot ID
     * 
     * @param nBotId
     *            The bot ID
     */
    public void setBotId( int nBotId )
    {
        _nBotId = nBotId;
    }

    /**
     * Returns whether the feedback is positive
     * 
     * @return true if positive, false if negative
     */
    public boolean isPositive( )
    {
        return _bIsPositive;
    }

    /**
     * Sets whether the feedback is positive
     * 
     * @param bIsPositive
     *            true if positive, false if negative
     */
    public void setIsPositive( boolean bIsPositive )
    {
        _bIsPositive = bIsPositive;
    }

    /**
     * Returns the feedback comment
     * 
     * @return The feedback comment
     */
    public String getComment( )
    {
        return _strComment;
    }

    /**
     * Sets the feedback comment
     * 
     * @param strComment
     *            The feedback comment
     */
    public void setComment( String strComment )
    {
        _strComment = strComment;
    }

    /**
     * Returns the feedback status
     * 
     * @return The feedback status
     */
    public String getStatus( )
    {
        return _strStatus;
    }

    /**
     * Sets the feedback status
     * 
     * @param strStatus
     *            The feedback status
     */
    public void setStatus( String strStatus )
    {
        _strStatus = strStatus;
    }

    /**
     * Returns the creation timestamp
     * 
     * @return The creation timestamp
     */
    public Timestamp getCreatedAt( )
    {
        return _timestampCreatedAt;
    }

    /**
     * Sets the creation timestamp
     * 
     * @param timestampCreatedAt
     *            The creation timestamp
     */
    public void setCreatedAt( Timestamp timestampCreatedAt )
    {
        _timestampCreatedAt = timestampCreatedAt;
    }

    /**
     * Returns the update timestamp
     * 
     * @return The update timestamp
     */
    public Timestamp getUpdatedAt( )
    {
        return _timestampUpdatedAt;
    }

    /**
     * Sets the update timestamp
     * 
     * @param timestampUpdatedAt
     *            The update timestamp
     */
    public void setUpdatedAt( Timestamp timestampUpdatedAt )
    {
        _timestampUpdatedAt = timestampUpdatedAt;
    }
}
