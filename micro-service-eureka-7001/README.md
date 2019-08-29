## 简介
eureka
本模块提供服务注册和发现

## 集群
1. 复制两个7001项目，分别为7002和7003，修改其端口号
2. 修改eureka.instance.hostname[^1]
3. 把其他的eureka服务地址放入到eureka.client.service-url.defaultZone中
4. 在服务注册方的配置文件中的eureka.client.service-url.defaultZone加入所有的eureka服务地址


---
[^1]本地测试可以通过修改hosts文件的方式实现
```shell
127.0.0.1    eureka7001.com
127.0.0.1    eureka7002.com
127.0.0.1    eureka7003.com
```