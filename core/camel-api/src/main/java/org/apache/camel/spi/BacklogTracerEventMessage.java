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
package org.apache.camel.spi;

import java.util.Map;

/**
 * Represents a traced message by the BacklogTracer.
 */
public interface BacklogTracerEventMessage {

    String ROOT_TAG = "backlogTracerEventMessage";
    String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    /**
     * Unique id of the traced message
     */
    long getUid();

    /**
     * Timestamp of the traced event
     */
    long getTimestamp();

    /**
     * Route id
     */
    String getRouteId();

    /**
     * Whether this event was from a route that is created from Rest DSL.
     */
    boolean isRest();

    /**
     * Whether this event was from a route that is created from route template or kamelet.
     */
    boolean isTemplate();

    /**
     * Node id where the message is being routed to
     */
    String getToNode();

    /**
     * The exchange id
     */
    String getExchangeId();

    /**
     * The content of the message as XML (body and headers)
     */
    String getMessageAsXml();

    /**
     * The content of the message as JSon (body and headers)
     */
    String getMessageAsJSon();

    /**
     * Dumps the event message as XML using the {@link #ROOT_TAG} as root tag.
     * <p/>
     * The <tt>timestamp</tt> tag is formatted in the format defined by {@link #TIMESTAMP_FORMAT}
     *
     * @param  indent number of spaces to indent
     * @return        xml representation of this event
     */
    String toXml(int indent);

    /**
     * Dumps the event message as JSon.
     *
     * @param  indent number of spaces to indent
     * @return        JSon representation of this event
     */
    String toJSon(int indent);

    /**
     * The event message as an org.apache.camel.util.json.JsonObject object.
     */
    Map<String, Object> asJSon();

}
