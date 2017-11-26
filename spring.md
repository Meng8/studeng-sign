**家里需要把nexus换成direct**
在cmd里跳到工作空间项目路径下

导入Stringboot 的所需jar包
mvn -Pnexus dependency:tree

打包带走
mvn -Pnexus package -DskipTests//-DskipTests：跳过测试

运行所在项目程序
mvn -Pnexus spring-boot:run

tomcat只能运行war包

eclipse导入Git Hub上的项目时import->Git->Projects from Git->CloneURL->一路next
传上来的项目没有项目属性，要右击项目Configure->然后选取自己需要转换生成的项目属性

target 文件下放