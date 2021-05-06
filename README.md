# yml to Object  기능
spring 에서 properties 파일을 로딩하는 것은 @PropertySoruce 를 통해서 쉽게 가능하다. 하지만 yml 파일에 대해서는 default 가 아니다. 
이를 위해서 별도 factory 함수가 필요하다. 

## 실행 및 검증
mvn spring-boot
> 검증은 실행 콘솔에 출력 결과로 확인. 