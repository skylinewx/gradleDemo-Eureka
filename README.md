# gradleDemo-Eureka

## 版本信息

SpringBoot版本2.6.4; springCloud版本2021.0.1; springBootAdmin版本2.6.2;

## 服务介绍

### gradleDemo-Eureka

仅作为Eureka服务，同时以url的方式手动注册到admin，访问地址http://localhost:8761

### gradleDemo-Eureka-gateway

网关服务，不能直接访问，但是作为整体服务入口，地址是http://localhost:8002

### gradleDemo-Eureka-admin

监控服务，从Eureka上拉取可监控的服务，访问地址http://localhost:8003

### gradleDemo-Eureka-serviceProvider

作为服务提供方，模拟提供服务，服务地址http://localhost:8000

### gradleDemo-Eureka-serviceConsumer

作为服务消费方，模拟消费服务，服务地址http://localhost:8001

### zipkin

官网地址：https://zipkin.io/pages/quickstart.html。
官方建议以jar包形式直接启动，访问地址http://127.0.0.1:9411/zipkin <br/>

```
java -jar zipkin.jar --zipkin.collector.rabbitmq.addresses=10.2.41.73 --zipkin.collector.rabbitmq.username=username --zipkin.collector.rabbitmq.password=password --zipkin.collector.rabbitmq.virtual-host=xxx
```

### sentinel

hystrix的替代方案，SpringCloud已经官宣不在维护hystrix了。<br/>
aliyunCloud与SpringCloud的版本关系可以参考 https://gitee.com/mirrors/Spring-Cloud-Alibaba <br/>
gitee上的sentinel镜像 https://gitee.com/mirrors/Sentinel <br/>
官网 https://sentinelguard.io/zh-cn/index.html

## 启动说明

所有的服务都可以同时启动

## 测试样例

| 请求方法 |  请求路径   | 请求参数 | 调用链路                                      |
|------|-----|------|-------------------------------------------|
| GET  |http://localhost:8000/welcome/info  |      | serviceProvider                           |
| GET  |http://localhost:8001/welcome/info  |      | serviceConsumer->serviceProvider          |
| GET  |http://localhost:8002/serviceProvider/welcome/info  |      | gateway->serviceProvider |
| GET  |http://localhost:8002/serviceConsumer/welcome/info  |      | gateway->serviceConsumer->serviceProvider |
| POST |http://localhost:8000/doCalc |   {"exp":"2-10*3+4"}   | serviceProvider                           |
| POST  |http://localhost:8001/doCalc  |  {"exp":"2-10*3+4"}    | serviceConsumer->serviceProvider          |
| POST  |http://localhost:8002/serviceProvider/doCalc  |  {"exp":"2-10*3+4"}    | gateway->serviceProvider |
| POST  |http://localhost:8002/serviceConsumer/doCalc  |  {"exp":"2-10*3+4"}    | gateway->serviceConsumer->serviceProvider |
