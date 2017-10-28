# BookSystem
基于ssm+bootstrsp简单极易上手的小型图书系统
#搭建过程：

一般idea创建工程的过程

打开idea ---> File ---> new ---> project ---> maven --->

create from archetype ---> maven-archetype-webapp ---> 接下来一般默认即可
项目结构图
├── java
│   └── cn
│       └── com
│           ├── dao
│           │   └── BookDao.java
│           ├── entity
│           │   └── Book.java
│           ├── service
│           │   ├── BookService.java
│           │   └── impl
│           │       └── BookServiceImpl.java
│           └── web
│               └── BookController.java
|               └── Usercontroller.java
├── resources
│   ├── jdbc.properties
│   ├── logback.xml
│   ├── mapper
│   │   └── BookMapper.xml
│   ├── mybatis-config.xml
│   └── spring
│       ├── spring-dao.xml
│       ├── spring-service.xml
│       └── spring-web.xml
└── webapp
    ├── index.jsp
    └── WEB-INF
        └── index.jsp
        ├── jsp
        │   ├── detail.jsp
        │   └── list.jsp
        └── web.xml
#第一步，下载项目或者根据我的博客一步步搭建好项目，然后创建mysql数据库：
create database booksystem;
use booksystem;
CREATE TABLE `book` (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '图书数量',
  `detail` varchar(200) NOT NULL COMMENT '图书描述',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='图书表';

#第二步，运行BookDaoTest的addBook()方法添加图书数据
#第三步，配置tomcat运行项目，访问(http://localhost:8080/)就到登录页面了，帐号随便输入，密码123，可以在后台修改。
