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
package fr.paris.lutece.plugins.platform.business.pipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Data Transfer Object for Pipeline entity
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class PipelineDTO implements Serializable
{

    private static final long serialVersionUID = 1L;

    @JsonProperty( "id" )
    private int id;

    @JsonProperty( "name" )
    private String name;

    @JsonProperty( "description" )
    private String description;

    @JsonProperty( "maxConcurrentWorkers" )
    private int maxConcurrentWorkers;

    @JsonProperty( "idClient" )
    private int idClient;

    @JsonProperty( "rateLimitByUserByDay" )
    private int rateLimitByUserByDay;

    /**
     * Default constructor
     */
    public PipelineDTO( )
    {
    }

    /**
     * Constructor with all parameters
     * 
     * @param id
     *            the pipeline identifier
     * @param name
     *            the pipeline name
     * @param description
     *            the pipeline description
     * @param maxConcurrentWorkers
     *            the maximum number of concurrent workers
     * @param idClient
     *            the client identifier
     */
    public PipelineDTO( int id, String name, String description, int maxConcurrentWorkers, int idClient )
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxConcurrentWorkers = maxConcurrentWorkers;
        this.idClient = idClient;
    }

    /**
     * Gets the pipeline identifier
     * 
     * @return the pipeline identifier
     */
    public int getId( )
    {
        return id;
    }

    /**
     * Sets the pipeline identifier
     * 
     * @param id
     *            the pipeline identifier to set
     */
    public void setId( int id )
    {
        this.id = id;
    }

    /**
     * Gets the pipeline name
     * 
     * @return the pipeline name
     */
    public String getName( )
    {
        return name;
    }

    /**
     * Sets the pipeline name
     * 
     * @param name
     *            the pipeline name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * Gets the pipeline description
     * 
     * @return the pipeline description
     */
    public String getDescription( )
    {
        return description;
    }

    /**
     * Sets the pipeline description
     * 
     * @param description
     *            the pipeline description to set
     */
    public void setDescription( String description )
    {
        this.description = description;
    }

    /**
     * Gets the maximum number of concurrent workers
     * 
     * @return the maximum number of concurrent workers
     */
    public int getMaxConcurrentWorkers( )
    {
        return maxConcurrentWorkers;
    }

    /**
     * Sets the maximum number of concurrent workers
     * 
     * @param maxConcurrentWorkers
     *            the maximum number of concurrent workers to set
     */
    public void setMaxConcurrentWorkers( int maxConcurrentWorkers )
    {
        this.maxConcurrentWorkers = maxConcurrentWorkers;
    }

    /**
     * Gets the client identifier
     * 
     * @return the client identifier
     */
    public int getIdClient( )
    {
        return idClient;
    }

    /**
     * Sets the client identifier
     * 
     * @param idClient
     *            the client identifier to set
     */
    public void setIdClient( int idClient )
    {
        this.idClient = idClient;
    }

    /**
     * Gets the rate limit by user per day
     * 
     * @return the rate limit by user per day
     */
    public int getRateLimitByUserByDay( )
    {
        return rateLimitByUserByDay;
    }

    /**
     * Sets the rate limit by user per day
     * 
     * @param rateLimitByUserByDay
     *            the rate limit by user per day to set
     */
    public void setRateLimitByUserByDay( int rateLimitByUserByDay )
    {
        this.rateLimitByUserByDay = rateLimitByUserByDay;
    }
}
