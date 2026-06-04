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
package fr.paris.lutece.plugins.platform.business.bot;

import com.fasterxml.jackson.annotation.JsonInclude;
import fr.paris.lutece.api.user.User;

/**
 * Data Transfer Object for User information
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
public class UserDTO
{

    // String constants
    private static final String TOSTRING_FORMAT = "UserDTO{firstName='%s', lastName='%s', email='%s'}";

    private String firstName;
    private String lastName;
    private String email;

    /**
     * Default constructor
     */
    public UserDTO( )
    {
    }

    /**
     * Constructor with basic user information
     * 
     * @param firstName
     *            the first name of the user
     * @param lastName
     *            the last name of the user
     * @param email
     *            the email address of the user
     */
    public UserDTO( String firstName, String lastName, String email )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Constructor from User object
     * 
     * @param user
     *            the User object to create DTO from
     */
    public UserDTO( User user )
    {
        this.firstName = user.getFirstName( );
        this.lastName = user.getLastName( );
        this.email = user.getEmail( );
    }

    /**
     * Creates a UserDTO from a User object
     * 
     * @param user
     *            the User object to convert
     * @return a new UserDTO instance
     */
    public static UserDTO fromUser( User user )
    {
        return new UserDTO( user );
    }

    /**
     * Gets the first name
     * 
     * @return the first name
     */
    public String getFirstName( )
    {
        return firstName;
    }

    /**
     * Sets the first name
     * 
     * @param firstName
     *            the first name to set
     */
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    /**
     * Gets the last name
     * 
     * @return the last name
     */
    public String getLastName( )
    {
        return lastName;
    }

    /**
     * Sets the last name
     * 
     * @param lastName
     *            the last name to set
     */
    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    /**
     * Gets the email address
     * 
     * @return the email address
     */
    public String getEmail( )
    {
        return email;
    }

    /**
     * Sets the email address
     * 
     * @param email
     *            the email address to set
     */
    public void setEmail( String email )
    {
        this.email = email;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString( )
    {
        return String.format( TOSTRING_FORMAT, firstName, lastName, email );
    }
}
