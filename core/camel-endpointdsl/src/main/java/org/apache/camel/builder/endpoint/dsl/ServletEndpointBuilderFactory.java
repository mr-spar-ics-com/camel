/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * To use a HTTP Servlet as entry for Camel routes when running in a servlet
 * container.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ServletEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Servlet component.
     */
    public interface ServletEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedServletEndpointBuilder advanced() {
            return (AdvancedServletEndpointBuilder) this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http producer will by default cache the response
         * body stream. If setting this option to true, then the producers will
         * not cache the response body stream but use the response stream as-is
         * as the message body.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default ServletEndpointBuilder disableStreamCache(
                boolean disableStreamCache) {
            doSetProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http producer will by default cache the response
         * body stream. If setting this option to true, then the producers will
         * not cache the response body stream but use the response stream as-is
         * as the message body.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default ServletEndpointBuilder disableStreamCache(
                String disableStreamCache) {
            doSetProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: common
         */
        default ServletEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: common
         */
        default ServletEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Configure the consumer to work in async mode.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder async(boolean async) {
            doSetProperty("async", async);
            return this;
        }
        /**
         * Configure the consumer to work in async mode.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder async(String async) {
            doSetProperty("async", async);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder chunked(boolean chunked) {
            doSetProperty("chunked", chunked);
            return this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder chunked(String chunked) {
            doSetProperty("chunked", chunked);
            return this;
        }
        /**
         * Used to only allow consuming if the HttpMethod matches, such as
         * GET/POST/PUT etc. Multiple methods can be specified separated by
         * comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder httpMethodRestrict(
                String httpMethodRestrict) {
            doSetProperty("httpMethodRestrict", httpMethodRestrict);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder matchOnUriPrefix(boolean matchOnUriPrefix) {
            doSetProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder matchOnUriPrefix(String matchOnUriPrefix) {
            doSetProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side the
         * response's body won't contain the exception's stack trace.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder muteException(boolean muteException) {
            doSetProperty("muteException", muteException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side the
         * response's body won't contain the exception's stack trace.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder muteException(String muteException) {
            doSetProperty("muteException", muteException);
            return this;
        }
        /**
         * To use a custom buffer size on the javax.servlet.ServletResponse.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder responseBufferSize(
                Integer responseBufferSize) {
            doSetProperty("responseBufferSize", responseBufferSize);
            return this;
        }
        /**
         * To use a custom buffer size on the javax.servlet.ServletResponse.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder responseBufferSize(
                String responseBufferSize) {
            doSetProperty("responseBufferSize", responseBufferSize);
            return this;
        }
        /**
         * Name of the servlet to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder servletName(String servletName) {
            doSetProperty("servletName", servletName);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder transferException(
                boolean transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default ServletEndpointBuilder transferException(
                String transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Servlet component.
     */
    public interface AdvancedServletEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default ServletEndpointBuilder basic() {
            return (ServletEndpointBuilder) this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: common (advanced)
         */
        default AdvancedServletEndpointBuilder httpBinding(Object httpBinding) {
            doSetProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: common (advanced)
         */
        default AdvancedServletEndpointBuilder httpBinding(String httpBinding) {
            doSetProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * Whether to automatic bind multipart/form-data as attachments on the
         * Camel Exchange. The options attachmentMultipartBinding=true and
         * disableStreamCache=false cannot work together. Remove
         * disableStreamCache to use AttachmentMultipartBinding. This is turn
         * off by default as this may require servlet specific configuration to
         * enable this when using Servlet's.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder attachmentMultipartBinding(
                boolean attachmentMultipartBinding) {
            doSetProperty("attachmentMultipartBinding", attachmentMultipartBinding);
            return this;
        }
        /**
         * Whether to automatic bind multipart/form-data as attachments on the
         * Camel Exchange. The options attachmentMultipartBinding=true and
         * disableStreamCache=false cannot work together. Remove
         * disableStreamCache to use AttachmentMultipartBinding. This is turn
         * off by default as this may require servlet specific configuration to
         * enable this when using Servlet's.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder attachmentMultipartBinding(
                String attachmentMultipartBinding) {
            doSetProperty("attachmentMultipartBinding", attachmentMultipartBinding);
            return this;
        }
        /**
         * Whether to eager check whether the HTTP requests has content if the
         * content-length header is 0 or not present. This can be turned on in
         * case HTTP clients do not send streamed data.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder eagerCheckContentAvailable(
                boolean eagerCheckContentAvailable) {
            doSetProperty("eagerCheckContentAvailable", eagerCheckContentAvailable);
            return this;
        }
        /**
         * Whether to eager check whether the HTTP requests has content if the
         * content-length header is 0 or not present. This can be turned on in
         * case HTTP clients do not send streamed data.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder eagerCheckContentAvailable(
                String eagerCheckContentAvailable) {
            doSetProperty("eagerCheckContentAvailable", eagerCheckContentAvailable);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whitelist of accepted filename extensions for accepting uploaded
         * files. Multiple extensions can be separated by comma, such as
         * txt,xml.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder fileNameExtWhitelist(
                String fileNameExtWhitelist) {
            doSetProperty("fileNameExtWhitelist", fileNameExtWhitelist);
            return this;
        }
        /**
         * Specifies whether to enable HTTP OPTIONS for this Servlet consumer.
         * By default OPTIONS is turned off.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder optionsEnabled(
                boolean optionsEnabled) {
            doSetProperty("optionsEnabled", optionsEnabled);
            return this;
        }
        /**
         * Specifies whether to enable HTTP OPTIONS for this Servlet consumer.
         * By default OPTIONS is turned off.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder optionsEnabled(
                String optionsEnabled) {
            doSetProperty("optionsEnabled", optionsEnabled);
            return this;
        }
        /**
         * Specifies whether to enable HTTP TRACE for this Servlet consumer. By
         * default TRACE is turned off.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder traceEnabled(boolean traceEnabled) {
            doSetProperty("traceEnabled", traceEnabled);
            return this;
        }
        /**
         * Specifies whether to enable HTTP TRACE for this Servlet consumer. By
         * default TRACE is turned off.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedServletEndpointBuilder traceEnabled(String traceEnabled) {
            doSetProperty("traceEnabled", traceEnabled);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageBody(
                boolean mapHttpMessageBody) {
            doSetProperty("mapHttpMessageBody", mapHttpMessageBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageBody(
                String mapHttpMessageBody) {
            doSetProperty("mapHttpMessageBody", mapHttpMessageBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageFormUrlEncodedBody(
                boolean mapHttpMessageFormUrlEncodedBody) {
            doSetProperty("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageFormUrlEncodedBody(
                String mapHttpMessageFormUrlEncodedBody) {
            doSetProperty("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageHeaders(
                boolean mapHttpMessageHeaders) {
            doSetProperty("mapHttpMessageHeaders", mapHttpMessageHeaders);
            return this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder mapHttpMessageHeaders(
                String mapHttpMessageHeaders) {
            doSetProperty("mapHttpMessageHeaders", mapHttpMessageHeaders);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedServletEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Servlet (camel-servlet)
     * To use a HTTP Servlet as entry for Camel routes when running in a servlet
     * container.
     * 
     * Category: http
     * Available as of version: 2.0
     * Maven coordinates: org.apache.camel:camel-servlet
     * 
     * Syntax: <code>servlet:contextPath</code>
     * 
     * Path parameter: contextPath (required)
     * The context-path to use
     */
    default ServletEndpointBuilder servlet(String path) {
        class ServletEndpointBuilderImpl extends AbstractEndpointBuilder implements ServletEndpointBuilder, AdvancedServletEndpointBuilder {
            public ServletEndpointBuilderImpl(String path) {
                super("servlet", path);
            }
        }
        return new ServletEndpointBuilderImpl(path);
    }
}