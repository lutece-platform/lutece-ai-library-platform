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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;

/**
 * DTO for chat completion request
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ChatCompletionRequestDTO
{
    @NotBlank( message = "model is required" )
    @JsonProperty( "model" )
    private String model;

    @NotEmpty( message = "messages must not be empty" )
    @JsonProperty( "messages" )
    private List<ChatMessageDTO> messages;

    @JsonProperty( "temperature" )
    private Double temperature;

    @JsonProperty( "maxTokens" )
    private Integer maxTokens;

    @JsonProperty( "topP" )
    private Double topP;

    @JsonProperty( "frequencyPenalty" )
    private Double frequencyPenalty;

    @JsonProperty( "presencePenalty" )
    private Double presencePenalty;

    @JsonProperty( "stop" )
    private List<String> stop;

    @JsonProperty( "tools" )
    private List<ToolDTO> tools;

    @JsonProperty( "toolChoice" )
    private String toolChoice;

    @JsonProperty( "responseFormat" )
    private String responseFormat;

    public String getModel( )
    {
        return model;
    }

    public void setModel( String model )
    {
        this.model = model;
    }

    public List<ChatMessageDTO> getMessages( )
    {
        return messages;
    }

    public void setMessages( List<ChatMessageDTO> messages )
    {
        this.messages = messages;
    }

    public Double getTemperature( )
    {
        return temperature;
    }

    public void setTemperature( Double temperature )
    {
        this.temperature = temperature;
    }

    public Integer getMaxTokens( )
    {
        return maxTokens;
    }

    public void setMaxTokens( Integer maxTokens )
    {
        this.maxTokens = maxTokens;
    }

    public Double getTopP( )
    {
        return topP;
    }

    public void setTopP( Double topP )
    {
        this.topP = topP;
    }

    public Double getFrequencyPenalty( )
    {
        return frequencyPenalty;
    }

    public void setFrequencyPenalty( Double frequencyPenalty )
    {
        this.frequencyPenalty = frequencyPenalty;
    }

    public Double getPresencePenalty( )
    {
        return presencePenalty;
    }

    public void setPresencePenalty( Double presencePenalty )
    {
        this.presencePenalty = presencePenalty;
    }

    public List<String> getStop( )
    {
        return stop;
    }

    public void setStop( List<String> stop )
    {
        this.stop = stop;
    }

    public List<ToolDTO> getTools( )
    {
        return tools;
    }

    public void setTools( List<ToolDTO> tools )
    {
        this.tools = tools;
    }

    public String getToolChoice( )
    {
        return toolChoice;
    }

    public void setToolChoice( String toolChoice )
    {
        this.toolChoice = toolChoice;
    }

    public String getResponseFormat( )
    {
        return responseFormat;
    }

    public void setResponseFormat( String responseFormat )
    {
        this.responseFormat = responseFormat;
    }
}
