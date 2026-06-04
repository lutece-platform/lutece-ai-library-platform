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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for Pipeline Response entity
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class PipelineResponseDTO
{

    @JsonProperty( "executionId" )
    private String executionId;

    @JsonProperty( "status" )
    private String status;

    @JsonProperty( "message" )
    private String message;

    /**
     * Default constructor
     */
    public PipelineResponseDTO( )
    {
    }

    /**
     * Constructor with all parameters
     * 
     * @param executionId
     *            the execution identifier
     * @param status
     *            the response status
     * @param message
     *            the response message
     */
    public PipelineResponseDTO( String executionId, String status, String message )
    {
        this.executionId = executionId;
        this.status = status;
        this.message = message;
    }

    /**
     * Gets the execution identifier
     * 
     * @return the execution identifier
     */
    public String getExecutionId( )
    {
        return executionId;
    }

    /**
     * Sets the execution identifier
     * 
     * @param executionId
     *            the execution identifier to set
     */
    public void setExecutionId( String executionId )
    {
        this.executionId = executionId;
    }

    /**
     * Gets the response status
     * 
     * @return the response status
     */
    public String getStatus( )
    {
        return status;
    }

    /**
     * Sets the response status
     * 
     * @param status
     *            the response status to set
     */
    public void setStatus( String status )
    {
        this.status = status;
    }

    /**
     * Gets the response message
     * 
     * @return the response message
     */
    public String getMessage( )
    {
        return message;
    }

    /**
     * Sets the response message
     * 
     * @param message
     *            the response message to set
     */
    public void setMessage( String message )
    {
        this.message = message;
    }
}
