package com.netease.mc.authlib;

import java.util.UUID;

/**
 * 玩家档案信息容器类 - 编译时存根
 *
 * <p>包含从令牌链中解析出的玩家身份信息。</p>
 * <p>运行时会被 AuthLibPackage 插件提供的真实实现覆盖。</p>
 *
 * @author EaseCation
 */
public class Profile {

    /**
     * 玩家的 Xbox UID
     */
    public String XUID;

    /**
     * 玩家的客户端 UUID（身份标识）
     */
    public UUID identity;

    /**
     * 玩家的显示名称
     */
    public String displayName;

    /**
     * 默认构造函数
     */
    public Profile() {
        this.XUID = "";
        this.identity = new UUID(0L, 0L);
        this.displayName = "";
    }
}
