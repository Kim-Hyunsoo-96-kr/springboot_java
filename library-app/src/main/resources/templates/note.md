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
* 