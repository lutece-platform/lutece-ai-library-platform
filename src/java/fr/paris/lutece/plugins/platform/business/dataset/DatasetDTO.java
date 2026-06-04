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
package fr.paris.lutece.plugins.platform.business.dataset;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.sql.Timestamp;
import jakarta.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Dataset class representing a dataset entity in the platform agent module
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class DatasetDTO implements Serializable
{
    private static final long serialVersionUID = 1L;

    @JsonProperty( "id" )
    private int _nId;
    @JsonProperty( "datasetName" )
    @NotEmpty( message = "dataset name is required" )
    private String _strDatasetName;
    @JsonProperty( "datasetDescription" )
    private String _strDatasetDescription;
    @JsonProperty( "embedProviderId" )
    private int _nEmbedProviderId;
    @JsonProperty( "llmProviderId" )
    private int _nLlmProviderId;
    @JsonProperty( "clientId" )
    private int _nClientId;
    @JsonProperty( "createdAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampCreatedAt;
    @JsonProperty( "updatedAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp _timestampUpdatedAt;

    /**
     * Get the dataset ID
     * 
     * @return The dataset ID
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Set the dataset ID
     * 
     * @param nId
     *            The dataset ID
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Get the dataset name
     * 
     * @return The dataset name
     */
    public String getDatasetName( )
    {
        return _strDatasetName;
    }

    /**
     * Set the dataset name
     * 
     * @param strDatasetName
     *            The dataset name
     */
    public void setDatasetName( String strDatasetName )
    {
        _strDatasetName = strDatasetName;
    }

    /**
     * Get the dataset description
     * 
     * @return The dataset description
     */
    public String getDatasetDescription( )
    {
        return _strDatasetDescription;
    }

    /**
     * Set the dataset description
     * 
     * @param strDatasetDescription
     *            The dataset description
     */
    public void setDatasetDescription( String strDatasetDescription )
    {
        _strDatasetDescription = strDatasetDescription;
    }

    /**
     * Get the embed provider ID
     * 
     * @return The embed provider ID
     */
    public int getEmbedProviderId( )
    {
        return _nEmbedProviderId;
    }

    /**
     * Set the embed provider ID
     * 
     * @param nEmbedProviderId
     *            The embed provider ID
     */
    public void setEmbedProviderId( int nEmbedProviderId )
    {
        _nEmbedProviderId = nEmbedProviderId;
    }

    /**
     * Get the LLM provider ID
     * 
     * @return The LLM provider ID
     */
    public int getLlmProviderId( )
    {
        return _nLlmProviderId;
    }

    /**
     * Set the LLM provider ID
     * 
     * @param nLlmProviderId
     *            The LLM provider ID
     */
    public void setLlmProviderId( int nLlmProviderId )
    {
        _nLlmProviderId = nLlmProviderId;
    }

    /**
     * Get the client ID
     * 
     * @return The client ID
     */
    public int getClientId( )
    {
        return _nClientId;
    }

    /**
     * Set the client ID
     * 
     * @param nClientId
     *            The client ID
     */
    public void setClientId( int nClientId )
    {
        _nClientId = nClientId;
    }

    /**
     * Get the creation timestamp
     * 
     * @return The creation timestamp
     */
    public Timestamp getCreatedAt( )
    {
        return _timestampCreatedAt;
    }

    /**
     * Set the creation timestamp
     * 
     * @param timestampCreatedAt
     *            The creation timestamp
     */
    public void setCreatedAt( Timestamp timestampCreatedAt )
    {
        _timestampCreatedAt = timestampCreatedAt;
    }

    /**
     * Get the update timestamp
     * 
     * @return The update timestamp
     */
    public Timestamp getUpdatedAt( )
    {
        return _timestampUpdatedAt;
    }

    /**
     * Set the update timestamp
     * 
     * @param timestampUpdatedAt
     *            The update timestamp
     */
    public void setUpdatedAt( Timestamp timestampUpdatedAt )
    {
        _timestampUpdatedAt = timestampUpdatedAt;
    }
}
