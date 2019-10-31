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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The jdbc component enables you to access databases through JDBC, where SQL
 * queries are sent in the message body.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JdbcEndpointBuilderFactory {


    /**
     * Builder for endpoint for the JDBC component.
     */
    public interface JdbcEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedJdbcEndpointBuilder advanced() {
            return (AdvancedJdbcEndpointBuilder) this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder allowNamedParameters(
                boolean allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
            return this;
        }
        /**
         * Whether to allow using named parameters in the queries.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder allowNamedParameters(
                String allowNamedParameters) {
            doSetProperty("allowNamedParameters", allowNamedParameters);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Specify the full package and class name to use as conversion when
         * outputType=SelectOne or SelectList.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder outputClass(String outputClass) {
            doSetProperty("outputClass", outputClass);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jdbc.JdbcOutputType</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder outputType(JdbcOutputType outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Determines the output the producer should use.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jdbc.JdbcOutputType</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder outputType(String outputType) {
            doSetProperty("outputType", outputType);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder parameters(Map<String, Object> parameters) {
            doSetProperty("parameters", parameters);
            return this;
        }
        /**
         * Optional parameters to the java.sql.Statement. For example to set
         * maxRows, fetchSize etc.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder parameters(String parameters) {
            doSetProperty("parameters", parameters);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder readSize(int readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * The default maximum number of rows that can be read by a polling
         * query. The default value is 0.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder readSize(String readSize) {
            doSetProperty("readSize", readSize);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder resetAutoCommit(boolean resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Camel will set the autoCommit on the JDBC connection to be false,
         * commit the change after executed the statement and reset the
         * autoCommit flag of the connection at the end, if the resetAutoCommit
         * is true. If the JDBC connection doesn't support to reset the
         * autoCommit flag, you can set the resetAutoCommit flag to be false,
         * and Camel will not try to reset the autoCommit flag. When used with
         * XA transactions you most likely need to set it to false so that the
         * transaction manager is in charge of committing this tx.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder resetAutoCommit(String resetAutoCommit) {
            doSetProperty("resetAutoCommit", resetAutoCommit);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder transacted(boolean transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * Whether transactions are in use.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder transacted(String transacted) {
            doSetProperty("transacted", transacted);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useGetBytesForBlob(
                boolean useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * To read BLOB columns as bytes instead of string data. This may be
         * needed for certain databases such as Oracle where you must read BLOB
         * columns as bytes.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useGetBytesForBlob(String useGetBytesForBlob) {
            doSetProperty("useGetBytesForBlob", useGetBytesForBlob);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useHeadersAsParameters(
                boolean useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Set this option to true to use the prepareStatementStrategy with
         * named parameters. This allows to define queries with named
         * placeholders, and use headers with the dynamic values for the query
         * placeholders.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useHeadersAsParameters(
                String useHeadersAsParameters) {
            doSetProperty("useHeadersAsParameters", useHeadersAsParameters);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                boolean useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
        /**
         * Sets whether to use JDBC 4 or JDBC 3.0 or older semantic when
         * retrieving column name. JDBC 4.0 uses columnLabel to get the column
         * name where as JDBC 3.0 uses both columnName or columnLabel.
         * Unfortunately JDBC drivers behave differently so you can use this
         * option to work out issues around your JDBC driver if you get problem
         * using this component This option is default true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default JdbcEndpointBuilder useJDBC4ColumnNameAndLabelSemantics(
                String useJDBC4ColumnNameAndLabelSemantics) {
            doSetProperty("useJDBC4ColumnNameAndLabelSemantics", useJDBC4ColumnNameAndLabelSemantics);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the JDBC component.
     */
    public interface AdvancedJdbcEndpointBuilder
            extends
                EndpointProducerBuilder {
        default JdbcEndpointBuilder basic() {
            return (JdbcEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJdbcEndpointBuilder basicPropertyBinding(
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
        default AdvancedJdbcEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jdbc.BeanRowMapper</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJdbcEndpointBuilder beanRowMapper(Object beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jdbc.BeanRowMapper when
         * using outputClass. The default implementation will lower case the row
         * names and skip underscores, and dashes. For example CUST_ID is mapped
         * as custId.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jdbc.BeanRowMapper</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJdbcEndpointBuilder beanRowMapper(String beanRowMapper) {
            doSetProperty("beanRowMapper", beanRowMapper);
            return this;
        }
        /**
         * Allows to plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option is a:
         * <code>org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJdbcEndpointBuilder prepareStatementStrategy(
                Object prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
            return this;
        }
        /**
         * Allows to plugin to use a custom
         * org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy to
         * control preparation of the query and prepared statement.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.jdbc.JdbcPrepareStatementStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedJdbcEndpointBuilder prepareStatementStrategy(
                String prepareStatementStrategy) {
            doSetProperty("prepareStatementStrategy", prepareStatementStrategy);
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
        default AdvancedJdbcEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedJdbcEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.jdbc.JdbcOutputType</code> enum.
     */
    enum JdbcOutputType {
        SelectOne,
        SelectList,
        StreamList;
    }
    /**
     * JDBC (camel-jdbc)
     * The jdbc component enables you to access databases through JDBC, where
     * SQL queries are sent in the message body.
     * 
     * Category: database,sql
     * Available as of version: 1.2
     * Maven coordinates: org.apache.camel:camel-jdbc
     * 
     * Syntax: <code>jdbc:dataSourceName</code>
     * 
     * Path parameter: dataSourceName (required)
     * Name of DataSource to lookup in the Registry. If the name is dataSource
     * or default, then Camel will attempt to lookup a default DataSource from
     * the registry, meaning if there is a only one instance of DataSource
     * found, then this DataSource will be used.
     */
    default JdbcEndpointBuilder jdbc(String path) {
        class JdbcEndpointBuilderImpl extends AbstractEndpointBuilder implements JdbcEndpointBuilder, AdvancedJdbcEndpointBuilder {
            public JdbcEndpointBuilderImpl(String path) {
                super("jdbc", path);
            }
        }
        return new JdbcEndpointBuilderImpl(path);
    }
}