package com.sugo.resident.common.utils;

import com.sugo.resident.common.enumInfo.ResultCodeInfo;
import com.sugo.resident.common.enumInfo.ResultCodeInterface;
import com.sugo.resident.common.model.response.ObjectResponse;
import com.sugo.resident.common.model.response.TableResponse;

import java.util.List;

public class ResponseUtils {
    public static <T> ObjectResponse<T> objectSuccess(){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message());
    }

    public static <T> ObjectResponse<T> objectSuccess(T data){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message(),data);
    }

    public static <T> TableResponse<T> tableSuccess(ResultCodeInterface errorCodes, List<T> list){
        PageUtils<T> pu = new PageUtils<>();
        return pu.right(list);
    }
}
