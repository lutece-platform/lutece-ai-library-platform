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
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.paris.lutece.plugins.platform.business.dataset.DatasetDTO;

/**
 * Bot class representing a conversational agent with its properties and configurations
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class BotDTO implements Serializable
{
    private static final long serialVersionUID = 1L;

    @JsonProperty( "id" )
    private int _nId;

    @JsonProperty( "botName" )
    @NotEmpty( message = "bot name is required" )
    private String _strBotName;

    @JsonProperty( "botDescription" )
    private String _strBotDescription;
    @JsonProperty( "botSystemPrompt" )
    private String _strBotSystemPrompt;
    @JsonProperty( "logoBase64" )
    private String _strLogoBase64;
    @JsonProperty( "rateLimitByUserByDay" )
    private int _nRateLimitByUserByDay;
    @JsonProperty( "clientId" )
    private int _nClientId;
    @JsonProperty( "llmProviderId" )
    private int _nLlmProviderId;
    @JsonProperty( "embedProviderId" )
    private int _nEmbedProviderId;
    @JsonProperty( "createdAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampCreatedAt;
    @JsonProperty( "updatedAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampUpdatedAt;
    @JsonProperty( "listBotDatasets" )
    private List<DatasetDTO> _listBotDatasets;

    /**
     * Returns the bot ID
     * 
     * @return The bot ID
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the bot ID
     * 
     * @param nId
     *            The bot ID
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the bot name
     * 
     * @return The bot name
     */
    public String getBotName( )
    {
        return _strBotName;
    }

    /**
     * Sets the bot name
     * 
     * @param strBotName
     *            The bot name
     */
    public void setBotName( String strBotName )
    {
        _strBotName = strBotName;
    }

    /**
     * Returns the bot description
     * 
     * @return The bot description
     */
    public String getBotDescription( )
    {
        return _strBotDescription;
    }

    /**
     * Sets the bot description
     * 
     * @param strBotDescription
     *            The bot description
     */
    public void setBotDescription( String strBotDescription )
    {
        _strBotDescription = strBotDescription;
    }

    /**
     * Returns the bot system prompt
     * 
     * @return The bot system prompt
     */
    public String getBotSystemPrompt( )
    {
        return _strBotSystemPrompt;
    }

    /**
     * Sets the bot system prompt
     * 
     * @param strBotSystemPrompt
     *            The bot system prompt
     */
    public void setBotSystemPrompt( String strBotSystemPrompt )
    {
        _strBotSystemPrompt = strBotSystemPrompt;
    }

    /**
     * Returns the client ID
     * 
     * @return The client ID
     */
    public int getClientId( )
    {
        return _nClientId;
    }

    /**
     * Sets the client ID
     * 
     * @param nClientId
     *            The client ID
     */
    public void setClientId( int nClientId )
    {
        _nClientId = nClientId;
    }

    /**
     * Returns the LLM provider ID
     * 
     * @return The LLM provider ID
     */
    public int getLlmProviderId( )
    {
        return _nLlmProviderId;
    }

    /**
     * Sets the LLM provider ID
     * 
     * @param nLlmProviderId
     *            The LLM provider ID
     */
    public void setLlmProviderId( int nLlmProviderId )
    {
        _nLlmProviderId = nLlmProviderId;
    }

    /**
     * Returns the embedding provider ID
     * 
     * @return The embedding provider ID
     */
    public int getEmbedProviderId( )
    {
        return _nEmbedProviderId;
    }

    /**
     * Sets the embedding provider ID
     * 
     * @param nEmbedProviderId
     *            The embedding provider ID
     */
    public void setEmbedProviderId( int nEmbedProviderId )
    {
        _nEmbedProviderId = nEmbedProviderId;
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

    /**
     * Returns the list of datasets associated with the bot
     * 
     * @return The list of datasets
     */
    public List<DatasetDTO> getListBotDatasets( )
    {
        return _listBotDatasets;
    }

    /**
     * Sets the list of datasets associated with the bot
     * 
     * @param listBotDatasets
     *            The list of datasets
     */
    public void setListBotDatasets( List<DatasetDTO> listBotDatasets )
    {
        _listBotDatasets = listBotDatasets;
    }

    /**
     * Returns the logo in Base64 format
     * 
     * @return The logo in Base64 format
     */
    public String getLogoBase64( )
    {
        return _strLogoBase64;
    }

    /**
     * Sets the logo in Base64 format
     * 
     * @param strLogoBase64
     *            The logo in Base64 format
     */
    public void setLogoBase64( String strLogoBase64 )
    {
        _strLogoBase64 = strLogoBase64;
    }

    /**
     * Returns the rate limit by user by day
     * 
     * @return The rate limit by user by day
     */
    public int getRateLimitByUserByDay( )
    {
        return _nRateLimitByUserByDay;
    }

    /**
     * Sets the rate limit by user by day
     * 
     * @param nRateLimitByUserByDay
     *            The rate limit by user by day
     */
    public void setRateLimitByUserByDay( int nRateLimitByUserByDay )
    {
        _nRateLimitByUserByDay = nRateLimitByUserByDay;
    }
}
