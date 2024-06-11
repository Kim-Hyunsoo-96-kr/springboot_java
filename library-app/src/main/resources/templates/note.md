### Ch2 서버란 무엇인가?
* 기능을 제공하는 것
* 기능 : 회원가입 기능 / 정보 가져오기 기능 / 추천 기능
* 기능을 제공하기 위해서는 누군가의 요청이 있어야 한다.
* 서버에게도 요청을 해야 정해진 기능을 수행한다.

### Ch3 네트워크란 무엇인가?
* 컴퓨터별로 고유 주소(IP)가 있다.
* 인터넷을 통해 데이터 주고받을 수 있다.
* IP, port를 통해 통신할 프로그램을 지정할 수 있다.
* ex, 244.66.51.9:3000 => IP 244.66.51.9 의 3000 포트를 사용하는 프로그램
* domain name : 외우기 어려운 IP 대신 사람들이 외우기 쉬운 이름을 넣음
* ex, 244.66.51.9 = 도메인 이름 : spring.com
* 이러한 시스템을 domain name system(DNS)라 한다

### Ch4 
* 인터넷 통신을 하기위한 표준이 있다.
* Http(HyperText Transfer Protocol) 이라 한다
* ex, GET/protion?color=red&count=2 (Host: spring.com:3000)
* GET : HTTP 요청을 받는 컴퓨터에게 요청하는 행위 (데이터를 달라) - HTTP Method
* portion : path
* color=red : 쿼리
* ex, POST/oak/leather (Host : spring,com:3000)
* 행위와 자원은 HTTP 요청을 보내기 전에 약속해야 한다.
* GET : 데이터를 달라, 쿼리
* POST : 데이터를 저장하라, 바디
* PUT : 데이터를 수정하라, 바디
* DELETE : 데이터를 삭제하라, 쿼리
* API (Application Programming Interface)
* 정해진 약속을 하여, 특정 기능을 수행하는 것
* URL (Uniform Resource Locator)
* ex, http://spring.com:3000/portion?color=red&count=2
* http : 사용하고 있는 프로토콜
* spring.com:3000 : 도메인 이름:포트
* portion : 자원의 경로
* color=red&count=2 : 쿼리(추가정보)
* HTTP 응답
* 요청한 컴퓨터 : client, 제공한 컴퓨터 : server
* 200 OK
* 300 Moved Permanently
* 404 Not Found
* 500 Internal Server Error
* 요청과 응답의 구조
* 첫째줄 - 상태코드
* 여러줄 - 헤더
* 한줄 띄기
* 여러줄 - 바디
* 클아이언트와 서버는 HTTP를 주고 받으며 기능을 동작하는데, 이때 정해진 규칙을 API라고 한다.

### Ch5
* 어떻게 API를 만들것인가? -> API 명세를 정의(API 스펙)

### Ch6
* Json(JavaScript Object Notation)

### Ch7
* 도서관리 어플리케이션의 요구사항
  * <사용자>
  * 도서관의 사용자를 등록할 수 있다. (이름 필수, 나이 선택)
  * 도서관 사용자의 목록을 볼 수 있다.
  * 도서관 사용자 이름을 업데이트 할 수 있다.
  * 도서관 사용자를 삭제할 수 있다.
  * <책>
  * 도서관에 책을 등록 및 삭제할 수 있다.
  * 사용자가 책을 빌릴 수 있다.
    * 다른 사람이 그 책을 진작 빌렸다면 빌릴 수 없다.
  * 사용자가 책을 반납할 수 있다.

### Ch10
* Database란 데이터를 구조화 시켜 저장하는 도구
* RDB(Relational Database) - 데이터를 표처럼 구조화 시켜 저장하는 도구
* SQL(Structured Query Language) - 표처럼 구조화된 데이터를 조회하는 언어

### Ch11
* tinyint : 1바이트 정수 (byte)
* int : 4바이트 정수 (int)
* bigint : 8바이트 정수 (long)
* double : 8바이트 실수
* decimal(A,B) : 소수점을 B개 가지고 있는 전체 A자릿수 실수
* ex, Decimal(4,2) = 12.23
* char(A) : A 글자가 들어갈 수 있는 문자열
* varchar(A) : 최대 A 글자가 들어갈 수 있는 문자열
* data : 날짜, yyyy-MM-dd
* time : 시간, HH:mm:ss
* datetime : 날짜와 시간을 합친 타입, yyyy-MM-dd HH:mm:ss
* DDL (Data Definition Language) - 데이터를 정의하는 언어 (create table, create database, drop table ...)

### Ch12
* 디비에 데이터를 넣는다 = 생성, Create
* 디비에 데이터를 조회한다 = 읽기, Retrive or Read
* 디비에 데이터를 수정한다 = 업데이트, Update
* 디비에 데이터를 삭제한다 = 제거, Delete
* 디비의 대표적인 행위 CRUD라 한다
* 데이터 넣기 : insert into [테이블 이름] (필드1 이름, 필드2 이름, ...) values(값1, 값2, ...)
* 데이터 조회하기 : select * from [테이블 이름]
* 데이터 조회시 * 말고 찾고자하는 필드이름을 사용할 수 있다.
* 필터를 걸 수 있다.
* select * from [테이블 이름] where [조건]
* and, or을 사용하여 조건을 이어줄 수 있다.
* where절의 조건에는 : =, <=, !=, <, >, >=, between, in, not in 등이 있다.
* 데이터 업데이트하기 : update [테이블 이름] set 필드1 이름=값, 필드2 이름=값, ... where [조건];
* 조건을 붙이지 않으면 모든 데이터가 업데이트 된다. 조심!!
* 데이터 삭제하기 : delete from [테이블 이름] where [조건];
* DML(Data Manipulation Language) : 데이터를 조작하는 SQL 문들

### Ch13 - spring에서 db 사용하기
* application.yml
* datasource : springboot가 어떠한 데이터베이스를 가리키게 할것인가? 라는 의미
* url : spring이 붙을 데이터베이스의 주소 (jdbc:mysql://localhost/library) jdbc : java database connector
* username : db 계정 정보
* password : db 계정 정보
* driver-class-name : db에 접근할 때 사용할 프로그램을 의미
* 