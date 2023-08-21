# STOMP Environment
- SpringBoot + Front 환경에서 STOMP 프로토콜을 구축하는 것은 상당히 간단하다.
  1. 기존 API의 엔드포인트와 같이 `Socket Connection`에 관한 엔드포인트를 `MessageBroker`를 통해 지정해준다.
  2. 기본적으로 `STOMP`는 `구독/발행` 패턴을 가지고 있기에 이에 관한 **구독(subscribe)와 발행(publishing)**의 엔드포인트를 별도로 지정해주어야한다.
  3. 이를 Controller Layer에서 기존 Restful한 API를 구축하면 간단히 클라이언트와 JSON 형태의 Message를 송수신 할 수 있다.
     - 이때 Method Option으로는 `@MessageMapping`을 이용한다.