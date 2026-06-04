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
 * Data Transfer Object for Pipeline Input Variable entity
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class PipelineInputVariableDTO
{

    @JsonProperty( "name" )
    private String name;

    @JsonProperty( "type" )
    private VariableType type;

    @JsonProperty( "value" )
    private Object value;

    /**
     * Enumeration of variable types
     */
    public enum VariableType
    {
        STRING,
        NUMBER,
        BOOLEAN,
        OBJECT,
        ARRAY,
        FILE
    }

    /**
     * Default constructor
     */
    public PipelineInputVariableDTO( )
    {
    }

    /**
     * Constructor with name and value
     * 
     * @param name
     *            the variable name
     * @param value
     *            the variable value
     */
    public PipelineInputVariableDTO( String name, Object value )
    {
        this.name = name;
        this.value = value;
        this.type = inferType( value );
    }

    /**
     * Gets the variable name
     * 
     * @return the variable name
     */
    public String getName( )
    {
        return name;
    }

    /**
     * Sets the variable name
     * 
     * @param name
     *            the variable name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * Gets the variable type
     * 
     * @return the variable type
     */
    public VariableType getType( )
    {
        return type;
    }

    /**
     * Sets the variable type
     * 
     * @param type
     *            the variable type to set
     */
    public void setType( VariableType type )
    {
        this.type = type;
    }

    /**
     * Gets the variable value
     * 
     * @return the variable value
     */
    public Object getValue( )
    {
        return value;
    }

    /**
     * Sets the variable value and infers its type
     * 
     * @param value
     *            the variable value to set
     */
    public void setValue( Object value )
    {
        this.value = value;
        this.type = inferType( value );
    }

    /**
     * Infers the variable type based on the value
     * 
     * @param value
     *            the value to analyze
     * @return the inferred variable type
     */
    private static VariableType inferType( Object value )
    {
        if ( value == null )
        {
            return VariableType.STRING;
        }
        else if ( value instanceof String )
        {
            return VariableType.STRING;
        }
        else if ( value instanceof Number )
        {
            return VariableType.NUMBER;
        }
        else if ( value instanceof Boolean )
        {
            return VariableType.BOOLEAN;
        }
        else if ( value instanceof java.util.List )
        {
            return VariableType.ARRAY;
        }
        else if ( value instanceof java.util.Map )
        {
            return VariableType.OBJECT;
        }
        else
        {
            return VariableType.STRING;
        }
    }
}
