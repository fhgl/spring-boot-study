# spring-boot-study
according to fishpro's cnblogs build spring-boot demo

* ##### junit测试类里初始化controller时,如果controller里需要注入service等
	>``` Java
	>@Autowired
	>  private WebApplicationContext context;
	>
	>mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	>```
	>##### 如果不需要注入
	>``` Java
	>mockMvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
* ##### 如果是多module,打包时要先打被依赖的module,在其pom中加入
	>``` xml
	><build>
    >   <plugins>
    >        <plugin>
    >            <groupId>org.springframework.boot</groupId>
    >            <artifactId>spring-boot-maven-plugin</artifactId>
    >            <configuration>
    >                <skip>true</skip>
    >            </configuration>
    >        </plugin>
    >    </plugins>
    ></build>
	>```
	>##### 再打包主module,在target文件夹得到.jar文件
* ##### 热部署配置
    >1.pom文件修改  
    >2.idea相关设置