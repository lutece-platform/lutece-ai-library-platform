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

/**
 * Represents the possible states of a subscription.
 */
public enum SubscriptionStatus
{
    /** Active subscription */
    ACTIVE( "active" ),

    /** Temporarily suspended subscription */
    SUSPENDED( "suspended" ),

    /** Permanently cancelled subscription */
    CANCELLED( "cancelled" );

    /** The database value for the status */
    private final String value;

    /**
     * Constructor.
     * 
     * @param value
     *            The database value
     */
    SubscriptionStatus( String value )
    {
        this.value = value;
    }

    /**
     * Gets the database value.
     * 
     * @return The database value
     */
    public String getValue( )
    {
        return value;
    }

    /**
     * Creates a SubscriptionStatus from a database value.
     * 
     * @param value
     *            The database value
     * @return The corresponding SubscriptionStatus
     * @throws IllegalArgumentException
     *             if value doesn't match any status
     */
    public static SubscriptionStatus fromValue( String value )
    {
        for ( SubscriptionStatus status : SubscriptionStatus.values( ) )
        {
            if ( status.getValue( ).equals( value ) )
            {
                return status;
            }
        }
        throw new IllegalArgumentException( "Invalid subscription status: " + value );
    }
}
