# 说明
## [mybatis_mysql_springweb](mybatis_mysql_springweb): 学习Mybatis+Mysql+Spring Boot的启动项目。
### 步骤
1. 配置文件 application.yaml，除了传统的properties文件，用yaml文件也可以，他的格式是层次的，比起平面的properties文件更加利于管理。
    ~~~
    spring:
        application:
            name: mybatis_mysql_springweb
        datasource:
            driver-class-name: com.mysql.cj.jdbc.Driver
            password: root
            url: jdbc:mysql://localhost:3380/project
            username: root
    ~~~
2. 配置文件中的主要确定了mysql的驱动，地址与database的选择
3. 文件结构
    - 主要用了POJO，mapper，server，server/impl，controller 5个文件结构，对应数据持久化层，访问，服务，服务的实现类，控制器几个层次，其中mapper主要是对sql语句的映射。
4. 注释的学习可以边学项目边查网站
    - 在controller中，对于serverImpl的注释有的地方有@Autowired，有的地方用@Resource，他们的效果是一样的，不同在于一个是按照Type，一个是按照Name的对应。
5. 在运行时，要注意，在本地的数据库中注入对应的初始数据数据，可以使用Navicat直接生成，也可以写Sql文件来生成相应的库与数据。
    - 这里我用的是navicat直接生成，如果要使用sql文件，可以在resource目录下或者自己确定的目录下写sql文件中写语句来建立，这里提供一个生成示例
    - ~~~
      drop table if exists user_info;
      create table user_info(
        id bigint primary key auto_increment,
        name varchar(255) not null default ''
      );

      insert into user_info values ('', 'asouwn'), ('', 'skdga');
      ~~~
---
## [highConcurrency](highConcurrency): 基于redis的高并发项目
---
- [jsp开发](https://www.liaoxuefeng.com/wiki/1252599548343744/1266262958498784)
- [目录没有web的解决办法](https://blog.csdn.net/qq_39997939/article/details/121845891)
- [IntelliJ Idea中的 Facets 与 Artifacts](https://blog.csdn.net/qcjustone/article/details/109405067)
---
### 计划
用redis来缓存用户点赞的行为，来避免对数据库进行频繁操作造成的访问忙

---

## [mood](mood): vue.js 项目学习（未起步）