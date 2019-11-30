/*
 * The MIT License (MIT)
 * Copyright © 2019 <sky>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.sky.framework.provider.service;

import com.sky.framework.rpc.api.ExampleApi;
import com.sky.framework.rpc.api.dto.UserDTO;
import com.sky.framework.rpc.invoker.annotation.Provider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author
 */
@Slf4j
@Provider(group = "example")
public class ExampleApiImpl implements ExampleApi {

    @Override
    public String hello(String msg) {
        log.info("msg:{}" + msg);
        return msg + "[response]";
    }

    @Override
    public void hello() {
        log.info("no msg:{}");
    }

    @Override
    public UserDTO getUser(UserDTO user) {
        log.info("msg:{}" + user);
        user.setName(user.getName() + "response");
        return user;
    }
}
