## 简介
练习用的springcloud项目。

学习过程参照尚硅谷springcloud学习视频。

这个pom父工程中引入了一些常用的依赖，具体可以查看[POM](pom.xml)文件，有注释。

## 模块
这个大的工程，目前有以下模块：  
1. 用于提用数据模型等的[API模块](./micro-service-api)
2. 用于提供服务的[服务提供者模块](./micro-service-provider-8001)
3. 用户消费服务的[服务消费模块](./micro-service-consumer-80)
4. 用于服务注册和发现的[eureka模块](./micro-service-eureka-7001)

> 本工程使用H2内存数据库

## 注意事项

### 浏览器调用REST问题
工程全部使用**RESTful**风格，没有web页面，返回值为字符串、布尔型或Object。在某些返回值不能转换为json对象时候，可能会出现浏览器访问两次RestController的情况，该问题可能是由于浏览器的json格式化插件造成的，可以尝试关闭浏览器的json格式化。
（我在谷歌浏览器下测试时，遇到过这种情况——console会报一个错 Unchecked runtime.lastError: The message port closed before a response was received，其他浏览器未知）

## 更新记录

2019-09-02-PM  
1. consumer80使用Feign替代Ribbon做负载均衡
2. 更改H2数据库的数据文件，使负载均衡的效果更容易看到

