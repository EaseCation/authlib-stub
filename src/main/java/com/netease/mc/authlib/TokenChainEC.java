package com.netease.mc.authlib;

import com.google.gson.JsonObject;

/**
 * 网易版加密令牌链验证类 (Protocol 14+ 版本) - 编译时存根
 *
 * <p>支持加密的令牌链验证和更多网易特定的信息字段。</p>
 * <p>这是一个仅用于编译的存根实现。运行时会被 AuthLibPackage 插件提供的真实实现覆盖。</p>
 *
 * @author EaseCation
 */
public class TokenChainEC {

    /**
     * 验证加密的令牌链并返回玩家档案信息（JSON 格式）
     *
     * <p>注意：这是存根方法，实际运行时会被 AuthLibPackage 插件覆盖。</p>
     *
     * <p>返回的 JsonObject 包含以下字段：</p>
     * <ul>
     *   <li>XUID: 玩家的 Xbox UID (String)</li>
     *   <li>identity: 玩家的客户端 UUID (String 格式)</li>
     *   <li>displayName: 玩家的显示名称 (String)</li>
     *   <li>uid: 网易平台 UID (String)</li>
     *   <li>netease_sid: 网易会话 ID (String)</li>
     *   <li>platform: 网易平台标识 (String)</li>
     *   <li>os_name: 客户端操作系统名称 (String)</li>
     *   <li>env: 网易环境标识 (String)</li>
     *   <li>engineVersion: 引擎版本 (String)</li>
     *   <li>patchVersion: 补丁版本 (String)</li>
     *   <li>bit: 位数标识 (String)</li>
     * </ul>
     *
     * @param chainArr 令牌链数组（不包含第一个元素）
     * @return JsonObject 包含玩家信息的 JSON 对象
     * @throws Exception 验证失败时抛出异常
     */
    public static JsonObject check(String[] chainArr) throws Exception {
        // 编译时存根实现
        // 运行时会被 AuthLibPackage 插件中的真实实现覆盖
        JsonObject result = new JsonObject();
        result.addProperty("XUID", "");
        result.addProperty("identity", "00000000-0000-0000-0000-000000000000");
        result.addProperty("displayName", "");
        result.addProperty("uid", "");
        result.addProperty("netease_sid", "");
        result.addProperty("platform", "");
        result.addProperty("os_name", "");
        result.addProperty("env", "");
        result.addProperty("engineVersion", "");
        result.addProperty("patchVersion", "");
        result.addProperty("bit", "");
        return result;
    }
}
