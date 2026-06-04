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
package fr.paris.lutece.plugins.platform.business.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object describing a model exposed to a client (chat completions catalog).
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class ModelInfoDTO
{

    @JsonProperty( "id" )
    private int id;

    @JsonProperty( "name" )
    private String name;

    @JsonProperty( "providerName" )
    private String providerName;

    @JsonProperty( "type" )
    private String type;

    /**
     * Default constructor
     */
    public ModelInfoDTO( )
    {
    }

    /**
     * Gets the model identifier
     *
     * @return the model identifier
     */
    public int getId( )
    {
        return id;
    }

    /**
     * Sets the model identifier
     *
     * @param id
     *            the model identifier
     */
    public void setId( int id )
    {
        this.id = id;
    }

    /**
     * Gets the deployment model name
     *
     * @return the model name
     */
    public String getName( )
    {
        return name;
    }

    /**
     * Sets the deployment model name
     *
     * @param name
     *            the model name
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * Gets the provider display name
     *
     * @return the provider name
     */
    public String getProviderName( )
    {
        return providerName;
    }

    /**
     * Sets the provider display name
     *
     * @param providerName
     *            the provider name
     */
    public void setProviderName( String providerName )
    {
        this.providerName = providerName;
    }

    /**
     * Gets the provider type
     *
     * @return the provider type
     */
    public String getType( )
    {
        return type;
    }

    /**
     * Sets the provider type
     *
     * @param type
     *            the provider type
     */
    public void setType( String type )
    {
        this.type = type;
    }
}
