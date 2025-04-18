/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.plugin.spring.cloud.gateway.v412x;

import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.cookie.Cookie;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClientResponse;
import reactor.util.context.Context;
import reactor.util.context.ContextView;

import java.util.Map;
import java.util.Set;

public class MockClientResponse implements HttpClientResponse {

    @Override
    public HttpHeaders responseHeaders() {
        return null;
    }

    @Override
    public HttpResponseStatus status() {
        return HttpResponseStatus.OK;
    }

    @Override
    public Mono<HttpHeaders> trailerHeaders() {
        return null;
    }

    @Override
    public Context currentContext() {
        return null;
    }

    @Override
    public ContextView currentContextView() {
        return null;
    }

    @Override
    public String[] redirectedFrom() {
        return new String[0];
    }

    @Override
    public HttpHeaders requestHeaders() {
        return null;
    }

    @Override
    public String resourceUrl() {
        return null;
    }

    @Override
    public Map<CharSequence, Set<Cookie>> cookies() {
        return null;
    }

    @Override
    public boolean isKeepAlive() {
        return false;
    }

    @Override
    public boolean isWebsocket() {
        return false;
    }

    @Override
    public HttpMethod method() {
        return null;
    }

    @Override
    public String path() {
        return HttpClientResponse.super.path();
    }

    @Override
    public String fullPath() {
        return null;
    }

    @Override
    public String requestId() {
        return null;
    }

    @Override
    public String uri() {
        return null;
    }

    @Override
    public HttpVersion version() {
        return null;
    }
}
