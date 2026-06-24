plugins {
    `java-library`
    `maven-publish`
}

group = "com.netease.mc"
version = "1.0.0-stub"
description = "NetEase AuthLib Stub - Compile-time only"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // 仅需要 Gson（用于 TokenChainEC 的返回类型）
    compileOnly(libs.gson)
}

// 配置编译选项
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

// 配置 Javadoc（忽略错误）
tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
    (options as StandardJavadocDocletOptions).apply {
        addStringOption("Xdoclint:none", "-quiet")
        addStringOption("encoding", "UTF-8")
        addStringOption("charSet", "UTF-8")
    }
    isFailOnError = false
}

// 创建源码 JAR
tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}

// 创建 Javadoc JAR
tasks.register<Jar>("javadocJar") {
    archiveClassifier.set("javadoc")
    from(tasks.javadoc.get().destinationDir)
    dependsOn(tasks.javadoc)
}

// Maven 发布配置
publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])

        // 添加源码和文档 artifact
        artifact(tasks["sourcesJar"])
        artifact(tasks["javadocJar"])

        // 设置 Maven 坐标
        groupId = project.group.toString()
        artifactId = project.name
        version = project.version.toString()

        // 配置 POM 元数据
        pom {
            name = "NetEase AuthLib Stub"
            description = "Compile-time stub for NetEase Minecraft authentication library (runtime replacement required)"
            url = "https://github.com/EaseCation/authlib-stub"

            licenses {
                license {
                    name = "GNU General Public License v3.0"
                    url = "https://www.gnu.org/licenses/gpl-3.0.html"
                }
            }

            developers {
                developer {
                    id = "easecation"
                    name = "EaseCation Team"
                    url = "https://github.com/EaseCation"
                }
            }

            scm {
                connection = "scm:git:git://github.com/EaseCation/authlib-stub.git"
                developerConnection = "scm:git:ssh://github.com/EaseCation/authlib-stub.git"
                url = "https://github.com/EaseCation/authlib-stub"
            }
        }
    }
}
