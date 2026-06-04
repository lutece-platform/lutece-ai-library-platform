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
package fr.paris.lutece.plugins.platform.business.vision;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * DTO representing the response from vision processing operations
 */
@JsonInclude( JsonInclude.Include.NON_NULL )
@JsonIgnoreProperties( ignoreUnknown = true )
public class VisionResponseDTO
{

    private String status;
    private String ocrText;
    private JsonNode extractedData;
    private String errorMessage;

    // Default constructor
    public VisionResponseDTO( )
    {
        this.status = "OK";
    }

    // Constructor for successful response
    public VisionResponseDTO( String ocrText, JsonNode extractedData )
    {
        this.status = "OK";
        this.ocrText = ocrText;
        this.extractedData = extractedData;
    }

    // Constructor for error response
    public VisionResponseDTO( String status, String errorMessage )
    {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    // Static factory methods for cleaner creation
    public static VisionResponseDTO success( )
    {
        return new VisionResponseDTO( );
    }

    public static VisionResponseDTO success( String ocrText, JsonNode extractedData )
    {
        return new VisionResponseDTO( ocrText, extractedData );
    }

    public static VisionResponseDTO error( String errorMessage )
    {
        return new VisionResponseDTO( "ERROR", errorMessage );
    }

    public static VisionResponseDTO error( String status, String errorMessage )
    {
        return new VisionResponseDTO( status, errorMessage );
    }

    // Fluent builder methods
    public VisionResponseDTO withOcrText( String ocrText )
    {
        this.ocrText = ocrText;
        return this;
    }

    public VisionResponseDTO withExtractedData( JsonNode extractedData )
    {
        this.extractedData = extractedData;
        return this;
    }

    public VisionResponseDTO withErrorMessage( String errorMessage )
    {
        this.errorMessage = errorMessage;
        this.status = "ERROR";
        return this;
    }

    // Getters and Setters
    public String getStatus( )
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String getOcrText( )
    {
        return ocrText;
    }

    public void setOcrText( String ocrText )
    {
        this.ocrText = ocrText;
    }

    public JsonNode getExtractedData( )
    {
        return extractedData;
    }

    public void setExtractedData( JsonNode extractedData )
    {
        this.extractedData = extractedData;
    }

    public String getErrorMessage( )
    {
        return errorMessage;
    }

    public void setErrorMessage( String errorMessage )
    {
        this.errorMessage = errorMessage;
    }

    // Helper methods
    public boolean isSuccess( )
    {
        return "OK".equals( status );
    }

    public boolean hasOcrText( )
    {
        return ocrText != null && !ocrText.trim( ).isEmpty( );
    }

    public boolean hasExtractedData( )
    {
        return extractedData != null && !extractedData.isEmpty( );
    }

    public boolean hasError( )
    {
        return errorMessage != null && !errorMessage.trim( ).isEmpty( );
    }

    @Override
    public String toString( )
    {
        return "VisionResponseDTO{" + "status='" + status + '\'' + ", ocrText='"
                + ( ocrText != null ? ocrText.substring( 0, Math.min( 50, ocrText.length( ) ) ) + "..." : null ) + '\'' + ", extractedData=" + extractedData
                + ", errorMessage='" + errorMessage + '\'' + '}';
    }
}
