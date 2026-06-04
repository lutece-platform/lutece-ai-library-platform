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
package fr.paris.lutece.plugins.platform.business.conversation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

/**
 * Data Transfer Object for Message
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class MessageDTO
{
    @JsonProperty( "id" )
    private final int id;
    @JsonProperty( "message" )
    private final String message;
    @JsonProperty( "role" )
    private final String role;
    @JsonProperty( "feedback" )
    private final FeedbackDTO feedback;
    @JsonProperty( "createdAt" )
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC" )
    private final Timestamp createdAt;

    /**
     * Constructor for MessageDTO without feedback
     * 
     * @param id
     *            The message id
     * @param message
     *            The message content
     * @param role
     *            The role of the message sender
     * @param feedback
     *            The feedback for the message
     * @param createdAt
     *            The timestamp when the message was created
     */
    public MessageDTO( int id, String message, String role, FeedbackDTO feedback, Timestamp createdAt )
    {
        this.id = id;
        this.message = message;
        this.role = role;
        this.feedback = feedback;
        this.createdAt = createdAt;
    }

    /**
     * Get the message content
     * 
     * @return The message content
     */
    public String getMessage( )
    {
        return message;
    }

    /**
     * Get the role of the message sender
     * 
     * @return The role
     */
    public String getRole( )
    {
        return role;
    }

    /**
     * Get the feedback for the message
     * 
     * @return The feedback (can be null)
     */
    public FeedbackDTO getFeedback( )
    {
        return feedback;
    }

    /**
     * Get the ID of the message
     *
     * @return The message ID
     */
    public int getId( )
    {
        return id;
    }

    /**
     * Get the timestamp when the message was created
     *
     * @return The creation timestamp
     */
    public Timestamp getCreatedAt( )
    {
        return createdAt;
    }

}
