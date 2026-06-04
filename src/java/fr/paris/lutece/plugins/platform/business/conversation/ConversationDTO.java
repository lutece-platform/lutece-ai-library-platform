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
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * Data Transfer Object for Conversation
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class ConversationDTO
{
    // Constants for class attributes
    private static final String ATTRIBUTE_CONVERSATION_UUID = "conversationUuid";
    private static final String ATTRIBUTE_BOT_ID = "botId";
    private static final String ATTRIBUTE_BOT_NAME = "botName";
    private static final String ATTRIBUTE_CREATED_AT = "createdAt";
    private static final String ATTRIBUTE_UPDATED_AT = "updatedAt";
    private static final String ATTRIBUTE_LAST_MESSAGE = "lastMessage";

    @JsonProperty( ATTRIBUTE_CONVERSATION_UUID )
    private String conversationUuid;
    @JsonProperty( ATTRIBUTE_BOT_ID )
    private int botId;
    @JsonProperty( ATTRIBUTE_BOT_NAME )
    private String botName;
    @JsonProperty( ATTRIBUTE_CREATED_AT )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp createdAt;
    @JsonProperty( ATTRIBUTE_UPDATED_AT )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp updatedAt;
    @JsonProperty( ATTRIBUTE_LAST_MESSAGE )
    private String lastMessage;

    /**
     * Get the conversation UUID
     * 
     * @return The conversation UUID
     */
    public String getConversationUuid( )
    {
        return conversationUuid;
    }

    /**
     * Set the conversation UUID
     * 
     * @param conversationUuid
     *            The conversation UUID to set
     */
    public void setConversationUuid( String conversationUuid )
    {
        this.conversationUuid = conversationUuid;
    }

    /**
     * Get the bot ID
     * 
     * @return The bot ID
     */
    public int getBotId( )
    {
        return botId;
    }

    /**
     * Set the bot ID
     * 
     * @param botId
     *            The bot ID to set
     */
    public void setBotId( int botId )
    {
        this.botId = botId;
    }

    /**
     * Get the bot name
     * 
     * @return The bot name
     */
    public String getBotName( )
    {
        return botName;
    }

    /**
     * Set the bot name
     * 
     * @param botName
     *            The bot name to set
     */
    public void setBotName( String botName )
    {
        this.botName = botName;
    }

    /**
     * Get the creation date
     * 
     * @return The creation date
     */
    public Timestamp getCreatedAt( )
    {
        return createdAt;
    }

    /**
     * Set the creation date
     * 
     * @param createdAt
     *            The creation date to set
     */
    public void setCreatedAt( Timestamp createdAt )
    {
        this.createdAt = createdAt;
    }

    /**
     * Get the update date
     * 
     * @return The update date
     */
    public Timestamp getUpdatedAt( )
    {
        return updatedAt;
    }

    /**
     * Set the update date
     * 
     * @param updatedAt
     *            The update date to set
     */
    public void setUpdatedAt( Timestamp updatedAt )
    {
        this.updatedAt = updatedAt;
    }

    /**
     * Get the last message
     * 
     * @return The last message
     */
    public String getLastMessage( )
    {
        return lastMessage;
    }

    /**
     * Set the last message
     * 
     * @param lastMessage
     *            The last message to set
     */
    public void setLastMessage( String lastMessage )
    {
        this.lastMessage = lastMessage;
    }
}
