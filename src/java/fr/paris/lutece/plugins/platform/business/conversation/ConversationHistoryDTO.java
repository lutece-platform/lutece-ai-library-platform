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

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Data Transfer Object representing a conversation history containing a conversation UUID and associated messages.
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class ConversationHistoryDTO
{

    private final String conversationUuid;
    private final List<MessageDTO> messages;

    /**
     * Constructs a new ConversationHistoryDTO with the specified conversation UUID and messages.
     *
     * @param conversationUuid
     *            the unique identifier of the conversation
     * @param messages
     *            the list of messages in the conversation
     */
    public ConversationHistoryDTO( String conversationUuid, List<MessageDTO> messages )
    {
        this.conversationUuid = conversationUuid;
        this.messages = messages;
    }

    /**
     * Gets the conversation UUID.
     *
     * @return the conversation UUID
     */
    public String getConversationUuid( )
    {
        return conversationUuid;
    }

    /**
     * Gets the list of messages in the conversation.
     *
     * @return the list of messages
     */
    public List<MessageDTO> getMessages( )
    {
        return messages;
    }
}
