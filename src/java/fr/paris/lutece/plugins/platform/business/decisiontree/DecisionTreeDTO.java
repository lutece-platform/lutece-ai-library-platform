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
package fr.paris.lutece.plugins.platform.business.decisiontree;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for DecisionTree entity
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@JsonInclude( JsonInclude.Include.NON_NULL )
public class DecisionTreeDTO implements Serializable
{
    private static final long serialVersionUID = 1L;

    @JsonProperty( "id" )
    private int _nId;

    @JsonProperty( "treeName" )
    private String _strTreeName;

    @JsonProperty( "treeDescription" )
    private String _strTreeDescription;

    @JsonProperty( "welcomeMessage" )
    private String _strWelcomeMessage;

    @JsonProperty( "endMessage" )
    private String _strEndMessage;

    @JsonProperty( "logoBase64" )
    private String _strLogoBase64;

    public int getId( )
    {
        return _nId;
    }

    public void setId( int nId )
    {
        _nId = nId;
    }

    public String getTreeName( )
    {
        return _strTreeName;
    }

    public void setTreeName( String strTreeName )
    {
        _strTreeName = strTreeName;
    }

    public String getTreeDescription( )
    {
        return _strTreeDescription;
    }

    public void setTreeDescription( String strTreeDescription )
    {
        _strTreeDescription = strTreeDescription;
    }

    public String getWelcomeMessage( )
    {
        return _strWelcomeMessage;
    }

    public void setWelcomeMessage( String strWelcomeMessage )
    {
        _strWelcomeMessage = strWelcomeMessage;
    }

    public String getEndMessage( )
    {
        return _strEndMessage;
    }

    public void setEndMessage( String strEndMessage )
    {
        _strEndMessage = strEndMessage;
    }

    public String getLogoBase64( )
    {
        return _strLogoBase64;
    }

    public void setLogoBase64( String strLogoBase64 )
    {
        _strLogoBase64 = strLogoBase64;
    }
}
