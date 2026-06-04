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

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Transfer Object for Pipeline Request entity
 */
public class PipelineRequestDTO
{

    @JsonProperty( "pipelineId" )
    private int pipelineId;

    @JsonProperty( "versionName" )
    private String versionName;

    @NotBlank( message = "userId is required" )
    @JsonProperty( "userId" )
    private String userId;

    @JsonProperty( "inputs" )
    private List<PipelineInputVariableDTO> inputs;

    /**
     * Default constructor
     */
    public PipelineRequestDTO( )
    {
        this.inputs = new ArrayList<>( );
    }

    /**
     * Constructor with pipeline identifier
     * 
     * @param pipelineId
     *            the pipeline identifier
     */
    public PipelineRequestDTO( int pipelineId )
    {
        this.pipelineId = pipelineId;
        this.inputs = new ArrayList<>( );
    }

    /**
     * Constructor with pipeline identifier and version name
     * 
     * @param pipelineId
     *            the pipeline identifier
     * @param versionName
     *            the version name
     */
    public PipelineRequestDTO( int pipelineId, String versionName )
    {
        this.pipelineId = pipelineId;
        this.versionName = versionName;
        this.inputs = new ArrayList<>( );
    }

    /**
     * Gets the pipeline identifier
     * 
     * @return the pipeline identifier
     */
    public int getPipelineId( )
    {
        return pipelineId;
    }

    /**
     * Sets the pipeline identifier
     * 
     * @param pipelineId
     *            the pipeline identifier to set
     */
    public void setPipelineId( int pipelineId )
    {
        this.pipelineId = pipelineId;
    }

    /**
     * Gets the version name
     * 
     * @return the version name
     */
    public String getVersionName( )
    {
        return versionName;
    }

    /**
     * Sets the version name
     * 
     * @param versionName
     *            the version name to set
     */
    public void setVersionName( String versionName )
    {
        this.versionName = versionName;
    }

    /**
     * Gets the list of input variables
     * 
     * @return the list of input variables
     */
    public List<PipelineInputVariableDTO> getInputs( )
    {
        return inputs;
    }

    /**
     * Sets the list of input variables
     * 
     * @param inputs
     *            the list of input variables to set
     */
    public void setInputs( List<PipelineInputVariableDTO> inputs )
    {
        this.inputs = inputs != null ? inputs : new ArrayList<>( );
    }

    /**
     * Adds an input variable to the request
     * 
     * @param name
     *            the input variable name
     * @param value
     *            the input variable value
     */
    public void addInput( String name, Object value )
    {
        if ( this.inputs == null )
        {
            this.inputs = new ArrayList<>( );
        }
        this.inputs.add( new PipelineInputVariableDTO( name, value ) );
    }

    /**
     * Gets the user identifier
     * 
     * @return the user identifier
     */
    public String getUserId( )
    {
        return userId;
    }

    /**
     * Sets the user identifier
     * 
     * @param userId
     *            the user identifier to set
     */
    public void setUserId( String userId )
    {
        this.userId = userId;
    }

}
