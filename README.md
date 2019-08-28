## 简介
练习用的springcloud项目。

学习过程参照尚硅谷springcloud学习视频。

这个pom父工程中引入了一些常用的依赖，具体可以查看[POM](pom.xml)文件，有注释。

## 模块
这个大的工程，目前有以下模块：  
1. 用于提用数据模型等的[API模块](./micro-service-api)
2. 用于提供服务的[服务提供者模块8001](./micro-service-provider-8001)
3. 用户消费服务的[服务消费模块](./micro-service-consumer-80)
4. 用于服务注册和发现的[eureka模块](./micro-service-eureka-7001)