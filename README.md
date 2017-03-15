# MicroServiceDemo

### 依据汪云飞老师《SpringBoot实战》12章完成


- ```config``` 配置服务器，本例为person-service和some-service提供外部配置
- ```discovery``` Eureka Server为微服务提供注册
- ```person``` 为UI模块提供保存person的REST服务
- ```some``` 为UI模块返回一段字符串
- ```ui``` 作为应用网关，提供外部访问的唯一入口。使用Feign消费person服务、Ribbon消息some服务，且都提供断路器服务。
- ```monitor``` 监控UI模块中的断路器
