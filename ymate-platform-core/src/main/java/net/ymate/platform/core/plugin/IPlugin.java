/*
 * Copyright 2007-2107 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.core.plugin;

/**
 * 插件启动器接口类，任何插件的启动器类都必须实现该接口
 *
 * @author 刘镇 (suninformation@163.com) on 2011-10-17 下午04:44:06
 * @version 1.0
 */
public interface IPlugin {

    /**
     * 插件初始化
     *
     * @param context
     * @throws Exception
     */
    public void init(IPluginContext context) throws Exception;

    /**
     * @return 返回插件环境上下文对象
     */
    public IPluginContext getPluginContext();

    /**
     * @return 返回插件是否已初始化
     */
    public boolean isInited();

    /**
     * @return 返回插件是否已启动
     */
    public boolean isStarted();

    /**
     * 启动插件
     *
     * @throws Exception
     */
    public void startup() throws Exception;

    /**
     * 停止插件
     *
     * @throws Exception
     */
    public void shutdown() throws Exception;

    /**
     * 销毁插件对象
     *
     * @throws Exception
     */
    public void destroy() throws Exception;
}