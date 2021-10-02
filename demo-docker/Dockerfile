# 基础镜像
FROM openjdk:8-jdk-alpine
# 作者信息
MAINTAINER "liu1142865396@gmail.com"
# 添加一个存储空间
VOLUME /tmp
# 暴露8080端口
EXPOSE 8080
# 添加变量，如果使用 dockerfile-maven-plugin，则会自动替换这里的变量内容
ARG JAR_FILE=target/*.jar
# 往容器中添加 jar 包
ADD ${JAR_FILE} app.jar
# 启动镜像自动运行程序
ENTRYPOINT ["java","-jar","/app.jar"]
