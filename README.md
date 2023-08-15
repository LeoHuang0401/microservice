# microservice
微服務架構搭配``swagger-ui``來呈現api資訊

# 功能說明:
``leo-config-service`` - 使用Spring Cloud Config配置服務器

``leo-eureka-service`` - 使用 Spring Cloud Netflix Eureka 發現服務器

``leo-test1-service``、``leo-test2-service`` - 使用 Spring Boot 3 和 Spring Cloud 構建應用程序

``leo-gateway-service`` - 使用 Spring Cloud Gateway 的 API 網關、搭配swagger-ui

# API URL：
## leo-test1-service
- 查詢所有product資料
```
/test1/orcl
```
- leo-test1-service 關聯 leo-test2-service 的 id查詢
```
/test2/{productCategoryId}
```


啟動方式：Spring Boot啟動、部署到docker啟動(docker-compose.yml)
