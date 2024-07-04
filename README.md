# Demo 

REST API developed with Java Spring boot and JWT. 

## 실행

### DB 설정

`application-{profile}.properties`에 DB 설정 
`spring.jpa.hibernate.ddl-auto`은 첫 실행이면 'create'로 DB 엔터티 생성, 이후에는 'update'로 수정해서 사용.   

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dashboard
spring.datasource.username=postgres
spring.datasource.password=postgres1234

spring.jpa.hibernate.ddl-auto=update
```

