# WebStack-JDR-Nav

一个开源的网址导航网站项目，具备完整的前后台，您可以拿来制作自己的网址导航。

![首页](screen/1.png)


## 说明
后台代码基于：[**WebStack-Guns**](https://github.com/jsnjfz/WebStack-Guns)

修改点：
图片存储修改为阿里云OSS，在application.yml中配置即可


## 运行

克隆代码：

```shell
git clone https://github.com/Grt1228/WebStack-JDR-Nav.git
```

导入IDE，建议用IDEA打开项目目录，待maven下载完jar包


编辑配置：

```
application.yml
```
```
阿里云OSS
aliyun:
  oss:
    assess-key: 
    secret-key: 
    bucket-name: 
    end-point: 
```

```
...
数据库连接，用户名密码：
url
username
password
...
```

新建数据库(utf8mb4)，导入数据：

```shell
sql\nav.sql
```

maven打包或者IDE启动服务：

```shell
$ java -jar WebStack-JDR-Nav-1.0.jar
```

启动完成：http://127.0.0.1:8000



## 使用

后台地址：http://127.0.0.1/admin

默认用户：admin

默认密码：111111

在线demo: http://117.78.18.7:8000/

![主页](screen/2.png)

![分类](screen/3.png)

![网站](screen/4.png)



## 感谢

前端设计：[**WebStackPage**](https://github.com/WebStackPage/WebStackPage.github.io)

后台框架：[**Guns**](https://github.com/stylefeng/Guns)

后台代码基于：[**WebStack-Guns**](https://github.com/jsnjfz/WebStack-Guns)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Springboot**


## License

MIT