# store

文件结构：
config文件夹放配置文件
config.SysDefine 放系统级全局变量
controller文件夹放controller文件
dao放dao文件（组织不同mapper完成持久层的操作，多个非select操作的函数应设置事务）
dao.mapper放mapper文件（mybatis）
manager放manager文件（后期添加需要的）
service业务处理层，应先创建接口，再实现接口（实现类放impl文件夹）
util放工具类

resources中为配置文件
mybatis依赖的实体及mapper应借助generatorConfig逆向工程来创建
