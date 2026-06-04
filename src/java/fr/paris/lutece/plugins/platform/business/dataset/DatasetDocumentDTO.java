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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for Dataset Document
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class DatasetDocumentDTO
{
    private int _nId;
    private int _nDatasetId;
    private String _strName;
    private String _strDescription;
    private String _strOriginalFilename;
    private String _strContentType;
    private long _lSize;
    private int _nChunkSize;
    private int _nChunkOverlap;
    private boolean _bUseDocumentIntelligence;
    private Integer _nDocumentIntelligenceProviderId;
    private Integer _nFolderId;

    /**
     * Returns the folder identifier this document belongs to
     *
     * @return The folder id, or null for dataset root
     */
    public Integer getFolderId( )
    {
        return _nFolderId;
    }

    /**
     * Sets the folder identifier this document belongs to
     *
     * @param nFolderId
     *            The folder id, or null for dataset root
     */
    public void setFolderId( Integer nFolderId )
    {
        _nFolderId = nFolderId;
    }

    @JsonProperty( "id" )
    public int getId( )
    {
        return _nId;
    }

    public void setId( int nId )
    {
        _nId = nId;
    }

    public int getDatasetId( )
    {
        return _nDatasetId;
    }

    public void setDatasetId( int nDatasetId )
    {
        _nDatasetId = nDatasetId;
    }

    @JsonProperty( "name" )
    public String getName( )
    {
        return _strName;
    }

    public void setName( String strName )
    {
        _strName = strName;
    }

    @JsonProperty( "description" )
    public String getDescription( )
    {
        return _strDescription;
    }

    public void setDescription( String strDescription )
    {
        _strDescription = strDescription;
    }

    public String getOriginalFilename( )
    {
        return _strOriginalFilename;
    }

    public void setOriginalFilename( String strOriginalFilename )
    {
        _strOriginalFilename = strOriginalFilename;
    }

    public String getContentType( )
    {
        return _strContentType;
    }

    public void setContentType( String strContentType )
    {
        _strContentType = strContentType;
    }

    @JsonProperty( "size" )
    public long getSize( )
    {
        return _lSize;
    }

    public void setSize( long lSize )
    {
        _lSize = lSize;
    }

    public int getChunkSize( )
    {
        return _nChunkSize;
    }

    public void setChunkSize( int nChunkSize )
    {
        _nChunkSize = nChunkSize;
    }

    public int getChunkOverlap( )
    {
        return _nChunkOverlap;
    }

    public void setChunkOverlap( int nChunkOverlap )
    {
        _nChunkOverlap = nChunkOverlap;
    }

    public boolean isUseDocumentIntelligence( )
    {
        return _bUseDocumentIntelligence;
    }

    public void setUseDocumentIntelligence( boolean bUseDocumentIntelligence )
    {
        _bUseDocumentIntelligence = bUseDocumentIntelligence;
    }

    public Integer getDocumentIntelligenceProviderId( )
    {
        return _nDocumentIntelligenceProviderId;
    }

    public void setDocumentIntelligenceProviderId( Integer nDocumentIntelligenceProviderId )
    {
        _nDocumentIntelligenceProviderId = nDocumentIntelligenceProviderId;
    }
}
