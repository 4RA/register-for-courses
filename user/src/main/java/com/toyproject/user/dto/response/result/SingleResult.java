package com.toyproject.user.dto.response.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult {
    // 참고: https://pepega.tistory.com/m/26
    /*
        결과가 단일 건인 API를 담는 모델
        Generic Interface에 <T>를 지정하여

        어떤 형태의 값도 넣을 수 있도록 구현한다.

        또한, CommonResult를 상속받아 API 요청 결과도 같이 출력된다.
    */

    private T data;
}
