package com.toyproject.user.service;

import com.toyproject.user.dto.response.StatusEnum;
import com.toyproject.user.dto.response.result.CommonResult;
import com.toyproject.user.dto.response.result.ListResult;
import com.toyproject.user.dto.response.result.SingleResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {
    // 참고: https://pepega.tistory.com/m/26

    // 단일건 결과를 처리하는 메소드
    public <T> SingleResult<T> getSingleResult(T data) {
        SingleResult<T> result = new SingleResult<>();
        result.setData(data);
        setSuccessResult(result);
        return result;
    }

    // 다중건 결과를 처리하는 메소드
    public <T> ListResult<T> getListResult(List<T> list) {
        ListResult<T> result = new ListResult<>();
        result.setList(list);
        setSuccessResult(result);
        return result;
    }

    // 성공 결과만 처리하는 메소드
    public CommonResult getSuccessResult() { // CommonResult 응답 결과를 알려주는 클래스
        CommonResult result = new CommonResult();
        setSuccessResult(result);
        return result;
    }

    // 실패 결과만 처리하는 메소드
    public CommonResult getFailResult() {
        CommonResult result = new CommonResult();
        result.setSuccess(false); // setSuccess : 응답 성공 여부 (true/false)
        result.setCode(StatusEnum.FAIL.getCode()); // setCode : 응답 코드 번호 >= 0 정상, < 0 비정상
        result.setMsg(StatusEnum.FAIL.getMsg()); // setMsg 응답 메시지
        return result;
    }

    // 결과 모델에 API 요청 성공 데이터를 세팅해주는 메소드
    private void setSuccessResult(CommonResult result) {
        result.setSuccess(true);
        result.setCode(StatusEnum.SUCCESS.getCode());
        result.setMsg(StatusEnum.SUCCESS.getMsg());
    }

    public CommonResult getFailResult(String defaultMessage) {
        CommonResult result = new CommonResult();
        result.setSuccess(false); // setSuccess : 응답 성공 여부 (true/false)
        result.setCode(StatusEnum.FAIL.getCode()); // setCode : 응답 코드 번호 >= 0 정상, < 0 비정상
        result.setMsg(defaultMessage); // setMsg 응답 메시지
        return result;
    }
}