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
import jakarta.validation.constraints.NotBlank;

/**
 * DTO representing a folder of a dataset exposed through the public REST API.
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class DatasetFolderDTO
{
    private Integer _nId;
    private int _nDatasetId;
    private Integer _nParentFolderId;
    @NotBlank( message = "folder name is required" )
    private String _strName;
    private String _strDescription;

    /**
     * Returns the folder identifier (null on creation payloads).
     *
     * @return The folder identifier
     */
    @JsonProperty( "id" )
    public Integer getId( )
    {
        return _nId;
    }

    /**
     * Sets the folder identifier.
     *
     * @param nId
     *            The folder identifier
     */
    public void setId( Integer nId )
    {
        _nId = nId;
    }

    /**
     * Returns the owning dataset identifier.
     *
     * @return The dataset identifier
     */
    @JsonProperty( "dataset_id" )
    public int getDatasetId( )
    {
        return _nDatasetId;
    }

    /**
     * Sets the owning dataset identifier.
     *
     * @param nDatasetId
     *            The dataset identifier
     */
    public void setDatasetId( int nDatasetId )
    {
        _nDatasetId = nDatasetId;
    }

    /**
     * Returns the parent folder identifier, or null when the folder sits at the dataset root.
     *
     * @return The parent folder identifier
     */
    @JsonProperty( "parent_folder_id" )
    public Integer getParentFolderId( )
    {
        return _nParentFolderId;
    }

    /**
     * Sets the parent folder identifier.
     *
     * @param nParentFolderId
     *            The parent folder identifier, or null for the dataset root
     */
    public void setParentFolderId( Integer nParentFolderId )
    {
        _nParentFolderId = nParentFolderId;
    }

    /**
     * Returns the folder name.
     *
     * @return The folder name
     */
    @JsonProperty( "name" )
    public String getName( )
    {
        return _strName;
    }

    /**
     * Sets the folder name.
     *
     * @param strName
     *            The folder name
     */
    public void setName( String strName )
    {
        _strName = strName;
    }

    /**
     * Returns the folder description.
     *
     * @return The folder description
     */
    @JsonProperty( "description" )
    public String getDescription( )
    {
        return _strDescription;
    }

    /**
     * Sets the folder description.
     *
     * @param strDescription
     *            The folder description
     */
    public void setDescription( String strDescription )
    {
        _strDescription = strDescription;
    }
}
