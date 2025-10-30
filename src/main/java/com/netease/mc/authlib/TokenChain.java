package com.netease.mc.authlib;

/**
 * 网易版令牌链验证类 (Protocol 12 版本) - 编译时存根
 *
 * <p>这是一个仅用于编译的存根实现。运行时会被 AuthLibPackage 插件提供的真实实现覆盖。</p>
 *
 * @author EaseCation
 */
public class TokenChain {

    /**
     * 验证令牌链并返回玩家档案信息
     *
     * <p>注意：这是存根方法，实际运行时会被 AuthLibPackage 插件覆盖。</p>
     *
     * @param chainArr 令牌链数组（不包含第一个元素）
     * @return 玩家档案对象，包含 XUID、identity 和 displayName
     * @throws Exception 验证失败时抛出异常
     */
    public static Profile check(String[] chainArr) throws Exception {
        // 编译时存根实现
        // 运行时会被 AuthLibPackage 插件中的真实实现覆盖
        Profile profile = new Profile();
        profile.XUID = "";
        profile.identity = new java.util.UUID(0L, 0L);
        profile.displayName = "";
        return profile;
    }
}
