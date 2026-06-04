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

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

/**
 * Class representing a query request for the platform agent
 */
public class QueryRequestDTO
{

    @Positive( message = "botId must be a positive integer" )
    @JsonProperty( "botId" )
    private int botId;

    @JsonProperty( "query" )
    private String query;

    @NotBlank( message = "userId is required" )
    @JsonProperty( "userId" )
    private String userId;

    @JsonProperty( "conversationUuid" )
    private String conversationUuid;

    /**
     * Gets the bot identifier
     * 
     * @return The bot identifier
     */
    public int getBotId( )
    {
        return botId;
    }

    /**
     * Sets the bot identifier
     * 
     * @param botId
     *            The bot identifier
     */
    public void setBotId( int botId )
    {
        this.botId = botId;
    }

    /**
     * Gets the query text
     * 
     * @return The query text
     */
    public String getQuery( )
    {
        return query;
    }

    /**
     * Sets the query text
     * 
     * @param query
     *            The query text
     */
    public void setQuery( String query )
    {
        this.query = query;
    }

    /**
     * Gets the conversation UUID
     * 
     * @return The conversation UUID
     */
    public String getConversationUuid( )
    {
        return conversationUuid;
    }

    /**
     * Sets the conversation UUID
     * 
     * @param conversationUuid
     *            The conversation UUID
     */
    public void setConversationUuid( String conversationUuid )
    {
        this.conversationUuid = conversationUuid;
    }

    /**
     * Gets the user identifier
     * 
     * @return The user identifier
     */
    public String getUserId( )
    {
        return userId;
    }

    /**
     * Sets the user identifier
     * 
     * @param userId
     *            The user identifier
     */
    public void setUserId( String userId )
    {
        this.userId = userId;
    }

    @Override
    public String toString( )
    {
        return "QueryRequestDTO{" + "botId=" + botId + ", query='" + query + '\'' + ", userId='" + userId + '\'' + ", conversationUuid='" + conversationUuid
                + '\'' + '}';
    }
}
