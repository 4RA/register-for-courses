package com.toyproject.user.dto.response.result;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResult<T> extends CommonResult {
    // 참고: https://pepega.tistory.com/m/26
    /*
        API 결과가 다중 건인 경우에 대한 데이터 모델
        결과 필드를 List 형태로 선언하고
        Generic Interface에 <T>를 지정하여
        어떤 형태의 List 값도 넣을 수 있도록 구현한다.
        또한, CommonResult를 상속받아 API 요청 결과도 같이 출력한다.
    */

    private List<T> list;
}
