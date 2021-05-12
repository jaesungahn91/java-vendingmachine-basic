# 자동판매기 잔돈 계산 모듈

그저 반환되는 동전이 최소한이 되는 잔돈모듈 잔돈 계산 모듈을 구현해서 제공하면 충분하다.  

- 최소 개수의 동전으로 잔돈을 돌려준다.
    예) 1000원 넣고 650원짜리 음료를 선택했다면, 잔돈은 100, 100, 100, 50원으로 반환한다.
- 지폐를 잔돈으로 반환하는 경우는 없다고 가정한다.

---

## 기능 요구 사항

- [x] 잔돈 모듈에 동전을 넣으면 얼마가 들었는지 알 수 있다.
- [x] 잔돈 모듈에 든 금액을 차감할 수 있다.
- [x] VendingMachine을 ChangesModule로 변경한다.
- [x] 동전은 500원, 100원, 50원, 10원이 있다.
- [x] 없는 금액의 동전의 경우
- [x] 최소 개수의 동전으로 잔돈을 돌려준다.
    - [x] 10원이 남아 있다면 10원 동전 1개를 돌려준다.
    - [x] 50원이 남아 있다면 50원 동전 1개를 돌려준다.
    - [x] 1000원이 남아 있다면 500원 동전 2개를 돌려준다.
    - [x] 20원이 남아 있다면 10원 동전 2개를 돌려준다.
    - [x] 600원이 남아 있다면 500원 동전 1개와 100원 동전 1개를 돌려준다.
    - [x] 650원이 남아 있다면 500원 동전 1개와 100원 동전 1개와 50원 동전 1개를 돌려준다.
    - [x] 1원 남아 있다면 동전을 돌려주지 않는다.
    - [x] 동전으로 잔돈을 거슬러 줄 수 없는 경우에도 최소 개수의 동전을 잔돈으로 돌려준다.
- [ ] 반환 요청을 하는 경우 잔돈이 반환된다.
- [ ] 최소 구입 금액 미만인 경우 잔돈이 반환된다.

- [ ] 새로운 동전으로 반환해야 한다. 

---

- ChangesModule
- ChangesModule#withDraw(Money)
- Coin(500원, 100원, 50원, 10원)
- Changes(잔돈) // Changes(10).coins() = Coins(Coin._10_COIN)