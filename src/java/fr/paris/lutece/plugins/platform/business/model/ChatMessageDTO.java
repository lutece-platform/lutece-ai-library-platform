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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * DTO representing a chat message in the chat completion API
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class ChatMessageDTO
{
    @JsonProperty( "role" )
    private String role;

    @JsonProperty( "content" )
    private Object content;

    @JsonProperty( "toolCalls" )
    private List<ToolCallDTO> toolCalls;

    @JsonProperty( "toolCallId" )
    private String toolCallId;

    @JsonProperty( "name" )
    private String name;

    public String getRole( )
    {
        return role;
    }

    public void setRole( String role )
    {
        this.role = role;
    }

    /**
     * Returns the content as a String if it is text, or null if it is multimodal content blocks.
     *
     * @return the text content, or null
     */
    public String getContent( )
    {
        return content instanceof String ? (String) content : null;
    }

    /**
     * Returns the raw content (String or List of content blocks).
     *
     * @return the raw content object
     */
    @JsonIgnore
    public Object getRawContent( )
    {
        return content;
    }

    /**
     * Sets the content (accepts String or List of content blocks).
     *
     * @param content
     *            the content to set
     */
    public void setContent( Object content )
    {
        this.content = content;
    }

    public List<ToolCallDTO> getToolCalls( )
    {
        return toolCalls;
    }

    public void setToolCalls( List<ToolCallDTO> toolCalls )
    {
        this.toolCalls = toolCalls;
    }

    public String getToolCallId( )
    {
        return toolCallId;
    }

    public void setToolCallId( String toolCallId )
    {
        this.toolCallId = toolCallId;
    }

    public String getName( )
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
