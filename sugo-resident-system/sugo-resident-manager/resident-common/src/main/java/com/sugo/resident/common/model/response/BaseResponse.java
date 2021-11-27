package com.sugo.resident.common.model.response;

import com.sugo.resident.common.constants.CommonConst;
import com.sugo.resident.common.enumInfo.ResultCodeInfo;
import lombok.Data;

@Data
public class BaseResponse {
	// 返回码
	private String code = CommonConst.SUCCESS;
	// 返回消息
	private String msg;

	// 设置返回码和消息String做参数
	public void setCodeMsg(String code, String message) {
		this.code = code;
		this.msg = message;
	}

	// 设置返回码和消息String做参数
	public void setCodeMsg(ResultCodeInfo resultCode) {
		this.code = resultCode.getCode();
		this.msg = resultCode.getMsg();
	}

	public BaseResponse(String code, String message) {
		this.code = code;
		this.msg = message;
	}


	public BaseResponse() {
	}
}
