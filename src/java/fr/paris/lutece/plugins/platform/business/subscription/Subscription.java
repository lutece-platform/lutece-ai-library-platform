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
package fr.paris.lutece.plugins.platform.business.subscription;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * Represents a subscription entity in the platform.
 */
public class Subscription implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int _nId;

    @NotNull( message = "#i18n{platform.validation.subscription.clientId.notNull}" )
    private int _nClientId;

    @NotEmpty( message = "#i18n{platform.validation.subscription.resourceType.notEmpty}" )
    private String _strResourceType;

    @NotEmpty( message = "#i18n{platform.validation.subscription.resourceId.notEmpty}" )
    private String _strResourceId;

    private Timestamp _dateSubscriptionDate;

    @NotNull( message = "#i18n{platform.validation.subscription.status.notNull}" )
    private SubscriptionStatus _status;

    /**
     * Gets the subscription identifier.
     * 
     * @return The subscription identifier
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the subscription identifier.
     * 
     * @param id
     *            The subscription identifier
     */
    public void setId( int id )
    {
        _nId = id;
    }

    /**
     * Gets the client identifier.
     * 
     * @return The client identifier
     */
    public int getClientId( )
    {
        return _nClientId;
    }

    /**
     * Sets the client identifier.
     * 
     * @param clientId
     *            The client identifier
     */
    public void setClientId( int clientId )
    {
        _nClientId = clientId;
    }

    /**
     * Gets the resource type.
     * 
     * @return The resource type
     */
    public String getResourceType( )
    {
        return _strResourceType;
    }

    /**
     * Sets the resource type.
     * 
     * @param resourceType
     *            The resource type
     */
    public void setResourceType( String resourceType )
    {
        _strResourceType = resourceType;
    }

    /**
     * Gets the resource identifier.
     * 
     * @return The resource identifier
     */
    public String getResourceId( )
    {
        return _strResourceId;
    }

    /**
     * Sets the resource identifier.
     * 
     * @param resourceId
     *            The resource identifier
     */
    public void setResourceId( String resourceId )
    {
        _strResourceId = resourceId;
    }

    /**
     * Gets the subscription date.
     * 
     * @return The subscription date
     */
    public Timestamp getSubscriptionDate( )
    {
        return _dateSubscriptionDate;
    }

    /**
     * Sets the subscription date.
     * 
     * @param subscriptionDate
     *            The subscription date
     */
    public void setSubscriptionDate( Timestamp subscriptionDate )
    {
        _dateSubscriptionDate = subscriptionDate;
    }

    /**
     * Gets the subscription status.
     * 
     * @return The subscription status
     */
    public SubscriptionStatus getStatus( )
    {
        return _status;
    }

    /**
     * Sets the subscription status.
     * 
     * @param status
     *            The subscription status
     */
    public void setStatus( SubscriptionStatus status )
    {
        _status = status;
    }
}
