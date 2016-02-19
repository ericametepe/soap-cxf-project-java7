1. CXF deployment in Jboss : skip Jboss-WS service : 
http://cxf.apache.org/docs/application-server-specific-configuration-guide.html#ApplicationServerSpecificConfigurationGuide-JBossApplicationServer
Deploy  jboss-deployment-structure.xml 

Must read : https://access.redhat.com/documentation/en-US/Red_Hat_JBoss_Fuse/6.0/html/Configuring_Web_Service_Endpoints/files/CXFDeployHAIntro.html

2. Config Jboss
Spring as Jboss module : TAF
Config Postgres DS for Jboss : TAF


Historisation : test ? [Hibernate-Envers]


 mvn install:install-file -Dfile=<path-to-file> -DgroupId=<group-id> \
    -DartifactId=<artifact-id> -Dversion=<version> -Dpackaging=<packaging>
    
    
   =========================================== 
 Not installing optional component org.springframework.http.server.ServletServerHttpAsyncRequestControl : KO
 Define standalone.xml
 Add 
  <filter>
   <not>
   <match pattern="JBAS011054"/>
   </not>
   </filter>
 ===================  ==================
 
 Installing dataSource to Jboss
 ============================================
 SOAP Fault
 http://docs.oracle.com/cd/E24329_01/web.1211/e24965/faults.htm#WSADV650
 Protocol Transport:
 SOAP12
 ========================= Scripts DB ===============
 
 Execute psql <script>
 Migration : Flyway
 
 
 ================================
 http://confluence.highsource.org/display/HJ3/Apache+CXF+Tutorial+-+Building+JAX-WS%2C+JAXB+and+JPA-based+web+service+with+Apache+CXF%2C+Spring+and+Hyperjaxb3
 
 ===============================   
 wsdl first way: you can add elements to the message in the wsdl and then mark them as soap:headers in the soap:binding section of the wsdl. 
 The wsdl2java tool will generate the @WebParam(header = true) annotations as above.
 With CXF, you can also put the headers in their own message (not the same message as the request/response) and mark them as headers in the soap:binding, 
 but you will need to pass the -exsh true flag to wsdl2java to get the paramters generated. 
 This is not portable to other jax-ws providers. Processing headers from other messages it optional in the jaxws spec.
 
 
========================================================
http://10.99.14.8:10010/console/App.html#datasources




