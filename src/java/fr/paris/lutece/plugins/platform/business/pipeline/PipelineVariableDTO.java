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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Data Transfer Object for Pipeline Variable entity
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class PipelineVariableDTO
{

    @JsonProperty( "name" )
    private String name;

    @JsonProperty( "type" )
    private String type;

    @JsonProperty( "required" )
    private boolean required;

    @JsonProperty( "description" )
    private String description;

    @JsonProperty( "title" )
    private String title;

    @JsonProperty( "defaultValue" )
    private Object defaultValue;

    @JsonProperty( "minValue" )
    private Double minValue;

    @JsonProperty( "maxValue" )
    private Double maxValue;

    @JsonProperty( "options" )
    private List<EnumOptionDTO> enumOptions;

    @JsonProperty( "pattern" )
    private String pattern;

    @JsonProperty( "placeholder" )
    private String placeholder;

    @JsonProperty( "minLength" )
    private Integer minLength;

    @JsonProperty( "maxLength" )
    private Integer maxLength;

    @JsonProperty( "isTextarea" )
    private boolean isTextarea;

    @JsonProperty( "rows" )
    private Integer rows;

    @JsonProperty( "multiple" )
    private boolean multiple;

    @JsonProperty( "acceptedContentTypes" )
    private List<String> acceptedContentTypes;

    @JsonProperty( "objectFields" )
    private Map<String, PipelineVariableDTO> objectFields;

    /**
     * Data Transfer Object for Enum Option entity
     */
    public static class EnumOptionDTO
    {

        @JsonProperty( "value" )
        private String value;

        @JsonProperty( "label" )
        private String label;

        @JsonProperty( "description" )
        private String description;

        /**
         * Default constructor
         */
        public EnumOptionDTO( )
        {
        }

        /**
         * Constructor with all parameters
         * 
         * @param value
         *            the option value
         * @param label
         *            the option label
         * @param description
         *            the option description
         */
        public EnumOptionDTO( String value, String label, String description )
        {
            this.value = value;
            this.label = label;
            this.description = description;
        }

        /**
         * Gets the option value
         * 
         * @return the option value
         */
        public String getValue( )
        {
            return value;
        }

        /**
         * Sets the option value
         * 
         * @param value
         *            the option value to set
         */
        public void setValue( String value )
        {
            this.value = value;
        }

        /**
         * Gets the option label
         * 
         * @return the option label
         */
        public String getLabel( )
        {
            return label;
        }

        /**
         * Sets the option label
         * 
         * @param label
         *            the option label to set
         */
        public void setLabel( String label )
        {
            this.label = label;
        }

        /**
         * Gets the option description
         * 
         * @return the option description
         */
        public String getDescription( )
        {
            return description;
        }

        /**
         * Sets the option description
         * 
         * @param description
         *            the option description to set
         */
        public void setDescription( String description )
        {
            this.description = description;
        }
    }

    /**
     * Default constructor
     */
    public PipelineVariableDTO( )
    {
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
    public String getType( )
    {
        return type;
    }

    /**
     * Sets the variable type
     * 
     * @param type
     *            the variable type to set
     */
    public void setType( String type )
    {
        this.type = type;
    }

    /**
     * Checks if the variable is required
     * 
     * @return true if the variable is required, false otherwise
     */
    public boolean isRequired( )
    {
        return required;
    }

    /**
     * Sets whether the variable is required
     * 
     * @param required
     *            true if the variable is required, false otherwise
     */
    public void setRequired( boolean required )
    {
        this.required = required;
    }

    /**
     * Gets the variable description
     * 
     * @return the variable description
     */
    public String getDescription( )
    {
        return description;
    }

    /**
     * Sets the variable description
     * 
     * @param description
     *            the variable description to set
     */
    public void setDescription( String description )
    {
        this.description = description;
    }

    /**
     * Gets the variable title
     * 
     * @return the variable title
     */
    public String getTitle( )
    {
        return title;
    }

    /**
     * Sets the variable title
     * 
     * @param title
     *            the variable title to set
     */
    public void setTitle( String title )
    {
        this.title = title;
    }

    /**
     * Gets the default value
     * 
     * @return the default value
     */
    public Object getDefaultValue( )
    {
        return defaultValue;
    }

    /**
     * Sets the default value
     * 
     * @param defaultValue
     *            the default value to set
     */
    public void setDefaultValue( Object defaultValue )
    {
        this.defaultValue = defaultValue;
    }

    /**
     * Gets the minimum value
     * 
     * @return the minimum value
     */
    public Double getMinValue( )
    {
        return minValue;
    }

    /**
     * Sets the minimum value
     * 
     * @param minValue
     *            the minimum value to set
     */
    public void setMinValue( Double minValue )
    {
        this.minValue = minValue;
    }

    /**
     * Gets the maximum value
     * 
     * @return the maximum value
     */
    public Double getMaxValue( )
    {
        return maxValue;
    }

    /**
     * Sets the maximum value
     * 
     * @param maxValue
     *            the maximum value to set
     */
    public void setMaxValue( Double maxValue )
    {
        this.maxValue = maxValue;
    }

    /**
     * Gets the enum options
     * 
     * @return the enum options
     */
    public List<EnumOptionDTO> getEnumOptions( )
    {
        return enumOptions;
    }

    /**
     * Sets the enum options
     * 
     * @param enumOptions
     *            the enum options to set
     */
    public void setEnumOptions( List<EnumOptionDTO> enumOptions )
    {
        this.enumOptions = enumOptions;
    }

    /**
     * Gets the pattern
     * 
     * @return the pattern
     */
    public String getPattern( )
    {
        return pattern;
    }

    /**
     * Sets the pattern
     * 
     * @param pattern
     *            the pattern to set
     */
    public void setPattern( String pattern )
    {
        this.pattern = pattern;
    }

    /**
     * Gets the placeholder
     * 
     * @return the placeholder
     */
    public String getPlaceholder( )
    {
        return placeholder;
    }

    /**
     * Sets the placeholder
     * 
     * @param placeholder
     *            the placeholder to set
     */
    public void setPlaceholder( String placeholder )
    {
        this.placeholder = placeholder;
    }

    /**
     * Gets the minimum length
     * 
     * @return the minimum length
     */
    public Integer getMinLength( )
    {
        return minLength;
    }

    /**
     * Sets the minimum length
     * 
     * @param minLength
     *            the minimum length to set
     */
    public void setMinLength( Integer minLength )
    {
        this.minLength = minLength;
    }

    /**
     * Gets the maximum length
     * 
     * @return the maximum length
     */
    public Integer getMaxLength( )
    {
        return maxLength;
    }

    /**
     * Sets the maximum length
     * 
     * @param maxLength
     *            the maximum length to set
     */
    public void setMaxLength( Integer maxLength )
    {
        this.maxLength = maxLength;
    }

    /**
     * Checks if the variable is a textarea
     * 
     * @return true if the variable is a textarea, false otherwise
     */
    public boolean isTextarea( )
    {
        return isTextarea;
    }

    /**
     * Sets whether the variable is a textarea
     * 
     * @param textarea
     *            true if the variable is a textarea, false otherwise
     */
    public void setTextarea( boolean textarea )
    {
        isTextarea = textarea;
    }

    /**
     * Gets the number of rows
     * 
     * @return the number of rows
     */
    public Integer getRows( )
    {
        return rows;
    }

    /**
     * Sets the number of rows
     * 
     * @param rows
     *            the number of rows to set
     */
    public void setRows( Integer rows )
    {
        this.rows = rows;
    }

    /**
     * Checks if this variable accepts multiple values.
     *
     * @return true if multiple
     */
    public boolean isMultiple( )
    {
        return multiple;
    }

    /**
     * Sets whether this variable accepts multiple values.
     *
     * @param multiple
     *            true if multiple
     */
    public void setMultiple( boolean multiple )
    {
        this.multiple = multiple;
    }

    /**
     * Gets the accepted content types.
     *
     * @return the accepted content types
     */
    public List<String> getAcceptedContentTypes( )
    {
        return acceptedContentTypes;
    }

    /**
     * Sets the accepted content types.
     *
     * @param acceptedContentTypes
     *            the content types to set
     */
    public void setAcceptedContentTypes( List<String> acceptedContentTypes )
    {
        this.acceptedContentTypes = acceptedContentTypes;
    }

    /**
     * Gets the object fields
     *
     * @return the object fields
     */
    public Map<String, PipelineVariableDTO> getObjectFields( )
    {
        return objectFields;
    }

    /**
     * Sets the object fields
     * 
     * @param objectFields
     *            the object fields to set
     */
    public void setObjectFields( Map<String, PipelineVariableDTO> objectFields )
    {
        this.objectFields = objectFields;
    }
}
