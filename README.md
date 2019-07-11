# SpringBoot-demo
搭建一个简单的微服务项目
此项目为使用SpringBoot+Maven+Eureka+Ribbon实现的简单微服务架构代码。
详细的搭建过程请到本人csdn博客查看：https://blog.csdn.net/fhy569039351/article/details/95509907
sd-Eureka-Server  为：Eureka 注册中心服务器
provider-user1    为：服务提供者1
provider-user2    为：服务提供者2   通过Ribbon实现服务提供者1和服务提供者1之间的轮询
customer-client   为：消费者
