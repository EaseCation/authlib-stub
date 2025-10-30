# NetEase AuthLib Stub

[![](https://jitpack.io/v/EaseCation/authlib-stub.svg)](https://jitpack.io/#EaseCation/authlib-stub)

**编译时存根项目** - 用于 SynapseAPI 等项目的编译依赖。

## ⚠️ 重要说明

这是一个**仅供编译使用**的存根实现：

- ✅ 提供类定义和方法签名供编译
- ❌ 不包含真实的网易认证逻辑
- 🔄 运行时会被 AuthLibPackage 插件提供的真实实现覆盖

## 包含的类

- `TokenChain` - Protocol 12 令牌链验证
- `Profile` - 玩家档案信息
- `TokenChainEC` - Protocol 14+ 加密令牌链验证

## 依赖引入

### Gradle (Kotlin DSL)

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    compileOnly("com.github.EaseCation:authlib-stub:1.0.0-stub")
}
```

### Gradle (Groovy)

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compileOnly 'com.github.EaseCation:authlib-stub:1.0.0-stub'
}
```

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.EaseCation</groupId>
        <artifactId>authlib-stub</artifactId>
        <version>1.0.0-stub</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## 运行时要求

使用依赖此 stub 的项目（如 SynapseAPI）时，如果需要网易版客户端支持，必须同时部署：

1. **主项目插件** - 如 SynapseAPI
2. **AuthLibPackage 插件** - 提供真实的 authlib 实现（私有，联系 EaseCation 获取）

仅使用国际版客户端的服务器无需 AuthLibPackage 插件。

## 技术原理

运行时，Nukkit 加载 AuthLibPackage 插件时，其 JAR 中的真实 authlib 类会覆盖此 stub 中的空实现（插件类加载器优先级更高）。

## 构建说明

本项目使用 Gradle 9.1.0 和 Java 21 构建。

```bash
# 构建项目
./gradlew build

# 发布到本地 Maven
./gradlew publishToMavenLocal
```

## 许可证

本项目基于 [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.html) 开源。

## 相关项目

- [SynapseAPI](https://github.com/EaseCation/SynapseAPI) - Synapse 协议 API
- [Nukkit](https://github.com/EaseCation/Nukkit) - Minecraft 基岩版服务器核心
