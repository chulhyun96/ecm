# 개요

간단한 이커머스 프로젝트를 기반으로 JPA, Redis, Docker, AWS에 대한 기술 이해하기

Use : Spring, JPA, Mariadb, Redis, Docker, AWS

## 회원 서버

### 공통
- [ ]  이메일을 통해서 인증번호를 통한 회원가입

### 고객
- [ ] 회원가입
- [ ] 인증 (이메일)
- [ ] 로그인 토큰 발행
- [ ] 로그인 토큰을 통한 제어 확인(JWT)
- [ ] 예치금 관리


### 셀러
- [ ] 회원가입


## 주문 서버

### 셀러
- [ ] 상품 등록, 수정
- [ ] 상품 삭제

### 구매자
- [ ] 장바구니를 위한 Redis 연동
- [ ] 상품 검색 & 상세 페이지
- [ ] 장바구니에 물건 추가
- [ ] 장바구니 확인
- [ ] 주문하기
- [ ] 주문내역 이메일로 발송하기

