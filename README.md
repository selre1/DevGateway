### 서버운용
- spring boot (gateway)
- spring boot (app1 - service)
- spring boot (app2 - service)

### 공통
  - spring boot 3.3.5
  - java version 19
  - docker 설치

### 실행
  - docker-compose up -d

### 접속이슈
   - docker container는 실행되나 내부 애플리케이션들이 실행되지는 않는다
   - 따라서 내부 앱들을 실행해주는 dockerfile 작성 필요