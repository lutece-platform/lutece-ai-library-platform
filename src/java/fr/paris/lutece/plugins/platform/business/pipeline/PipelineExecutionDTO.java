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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Transfer Object for Pipeline Execution entity
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class PipelineExecutionDTO
{

    // Status constants
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_RUNNING = "RUNNING";
    public static final String STATUS_COMPLETED = "COMPLETED";
    public static final String STATUS_FAILED = "FAILED";

    // ToString format
    private static final String TO_STRING_FORMAT = "PipelineExecutionDTO{executionId='%s', pipelineId=%d, status='%s', creationDate=%s, completionDate=%s, outputs=%s, error='%s'}";

    @JsonProperty( "executionId" )
    private String executionId;

    @JsonProperty( "pipelineId" )
    private int pipelineId;

    @JsonProperty( "clientId" )
    private int clientId;

    @JsonProperty( "status" )
    private String status;

    @JsonProperty( "creationDate" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp creationDate;

    @JsonProperty( "completionDate" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private Timestamp completionDate;

    @JsonProperty( "outputs" )
    private List<PipelineOutputVariableDTO> outputs;

    @JsonProperty( "error" )
    private String error;

    /**
     * Default constructor
     */
    public PipelineExecutionDTO( )
    {
        this.outputs = new ArrayList<>( );
    }

    /**
     * Constructor with basic parameters
     * 
     * @param executionId
     *            the execution identifier
     * @param pipelineId
     *            the pipeline identifier
     * @param status
     *            the execution status
     */
    public PipelineExecutionDTO( String executionId, int pipelineId, String status )
    {
        this.executionId = executionId;
        this.pipelineId = pipelineId;
        this.status = status;
        this.outputs = new ArrayList<>( );
    }

    /**
     * Gets the owning client identifier
     * 
     * @return the client identifier
     */
    public int getClientId( )
    {
        return clientId;
    }

    /**
     * Sets the owning client identifier
     * 
     * @param clientId
     *            the client identifier
     */
    public void setClientId( int clientId )
    {
        this.clientId = clientId;
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
     * Gets the execution status
     * 
     * @return the execution status
     */
    public String getStatus( )
    {
        return status;
    }

    /**
     * Sets the execution status
     * 
     * @param status
     *            the execution status to set
     */
    public void setStatus( String status )
    {
        this.status = status;
    }

    /**
     * Gets the creation date
     * 
     * @return the creation date
     */
    public Timestamp getCreationDate( )
    {
        return creationDate;
    }

    /**
     * Sets the creation date
     * 
     * @param creationDate
     *            the creation date to set
     */
    public void setCreationDate( Timestamp creationDate )
    {
        this.creationDate = creationDate;
    }

    /**
     * Gets the completion date
     * 
     * @return the completion date
     */
    public Timestamp getCompletionDate( )
    {
        return completionDate;
    }

    /**
     * Sets the completion date
     * 
     * @param completionDate
     *            the completion date to set
     */
    public void setCompletionDate( Timestamp completionDate )
    {
        this.completionDate = completionDate;
    }

    /**
     * Gets the list of output variables
     * 
     * @return the list of output variables
     */
    public List<PipelineOutputVariableDTO> getOutputs( )
    {
        return outputs;
    }

    /**
     * Sets the list of output variables
     * 
     * @param outputs
     *            the list of output variables to set
     */
    public void setOutputs( List<PipelineOutputVariableDTO> outputs )
    {
        this.outputs = outputs != null ? outputs : new ArrayList<>( );
    }

    /**
     * Gets the error message
     * 
     * @return the error message
     */
    public String getError( )
    {
        return error;
    }

    /**
     * Sets the error message
     * 
     * @param error
     *            the error message to set
     */
    public void setError( String error )
    {
        this.error = error;
    }

    /**
     * Checks if the execution is completed
     * 
     * @return true if the execution is completed, false otherwise
     */
    public boolean isCompleted( )
    {
        return STATUS_COMPLETED.equals( status );
    }

    /**
     * Checks if the execution has failed
     * 
     * @return true if the execution has failed, false otherwise
     */
    public boolean isFailed( )
    {
        return STATUS_FAILED.equals( status );
    }

    /**
     * Checks if the execution is running
     * 
     * @return true if the execution is running, false otherwise
     */
    public boolean isRunning( )
    {
        return STATUS_RUNNING.equals( status );
    }

    /**
     * Checks if the execution is pending
     * 
     * @return true if the execution is pending, false otherwise
     */
    public boolean isPending( )
    {
        return STATUS_PENDING.equals( status );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString( )
    {
        return String.format( TO_STRING_FORMAT, executionId, pipelineId, status, creationDate, completionDate, outputs, error );
    }
}
