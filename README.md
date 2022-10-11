# pt-ticket-service
패캠 백엔드 프로젝트 파트5


### 배경
헬스장에 가서 PT를 등록하려고 한다.
직원분이 여러 프로그램들을 소개시켜줬는데, 각각 유효기간과 횟수가 다르다.
그래서 그 중 **2개월 10회 PT 이용권**을 선택하였고, 추가로 오픈 기념으로 **3개월 헬스 이용권**도 받을 수 있게 되었다.
이용권에서 수강 시간 전에 알림을 받고, 수강을 마쳤을 때 이용권에서 횟수를 자동으로 차감하게 된다.
이용하다가 통크신 관장님이 이용자 전원에게 **1회 필라테스 이용권**을 뿌리기도 하였다.
우리는 이런 이용권 시스템을 Spring으로 구축을 진행해본다.


### 요구사항

#### 이용권
- 사용자는 N개의 이용권을 가질 수 있음.
- 이용권은 횟수가 모두 소진되거나 이용기간이 지나면 만료된다.
- 이용권 만료 전 사용자에게 알림을 준다.
- 업체에서 원하는 시간을 설정하여 일괄로 사용자에게 이용권을 지급할 수 있음.

#### 수업
- 예약된 수업 10분 전 출석 안내 알람을 준다.
- 수업 종료 시간 시점 수업을 예약한 학생의 이용권 횟수를 일괄로 차감(-1)

#### 통계
- 사용자의 수업 예약, 출석, 이용권 횟수 등의 데이터로 유의미한 통계 데이터를 만든다.

#### Feature
- **Batch** : 이용권 만료, 이용권 일괄 지금, 수업 전 알림, 수업 후 이용권 차감, 통계 데이터 구축
- **View** : 사용자 이용권 조회 페이지, 관리자 이용권 등록 페이지, 관리자 통계 조회 페이지
- **API** : 사용자 이용권 조회 API, 관리자 이용권 등록 API, 관리자 통계 조회 API

### Stack
- Spring Batch
- Spring JPA
- QueryDSL
- Gradle
- Docker
- Thymeleaf
- Lombok