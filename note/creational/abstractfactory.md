# 抽象工厂

![等级和产品族](../images/creational/abstractfactory/1.png)
![等级和产品族](../images/creational/abstractfactory/2.png)


![**等级和产品族**](../images/creational/abstractfactory/abstractfactory.png)

> java.sql.Connection 

说明：`java.sql.Connection`约束了数据库产品如`Mysql`、`Oracle`生产的产品

![Connection约束产品族要实现的接口](../images/creational/abstractfactory/Connection.png)
![Connection的Mysql产品实现](../images/creational/abstractfactory/abstractfactory-ConnectionImpl.png)

> java.sql.Statement

说明:`java.sql.Statement`约束了数据库产品的`Statement`

![Statement约束产品族要实现的接口](../images/creational/abstractfactory/Statement.png)
![Statement的Mysql产品实现](../images/creational/abstractfactory/abstractfactory-StatementImpl.png)
