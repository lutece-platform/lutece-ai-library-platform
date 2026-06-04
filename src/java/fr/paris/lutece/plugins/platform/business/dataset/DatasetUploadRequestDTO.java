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

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

/**
 * DTO for dataset document upload request with base64 encoded files
 */
public class DatasetUploadRequestDTO
{
    @NotEmpty( message = "files must not be empty" )
    private List<FileUploadDTO> _files;
    private boolean _bUseDocumentIntelligence;
    private Integer _nDocumentIntelligenceProviderId;
    private int _nChunkSize = 1000;
    private int _nChunkOverlap = 200;
    private Integer _nFolderId;

    /**
     * Returns the target folder identifier for the uploaded documents
     *
     * @return The folder id, or null to store at the dataset root
     */
    public Integer getFolderId( )
    {
        return _nFolderId;
    }

    /**
     * Sets the target folder identifier for the uploaded documents
     *
     * @param nFolderId
     *            The folder id, or null for dataset root
     */
    public void setFolderId( Integer nFolderId )
    {
        _nFolderId = nFolderId;
    }

    @JsonProperty( "files" )
    public List<FileUploadDTO> getFiles( )
    {
        return _files;
    }

    public void setFiles( List<FileUploadDTO> files )
    {
        _files = files;
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

    /**
     * Inner class for file upload data
     */
    public static class FileUploadDTO
    {
        private String _strFileName;
        private String _strContentType;
        private String _strContent; // Base64 encoded content

        public String getFileName( )
        {
            return _strFileName;
        }

        public void setFileName( String strFileName )
        {
            _strFileName = strFileName;
        }

        public String getContentType( )
        {
            return _strContentType;
        }

        public void setContentType( String strContentType )
        {
            _strContentType = strContentType;
        }

        @JsonProperty( "content" )
        public String getContent( )
        {
            return _strContent;
        }

        public void setContent( String strContent )
        {
            _strContent = strContent;
        }
    }
}
