package com.sugo.resident.common.utils;

import com.sugo.resident.common.exception.BusinessException;
import com.sugo.resident.common.enumInfo.ResultCodeInterface;

import java.util.UUID;


/**
 * 通用工具类
 */
public class BusinessUtil {
    public static void stopBusiProcess(ResultCodeInterface errorCodes) throws BusinessException {
        throw new BusinessException(errorCodes);
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid;
    }

}
