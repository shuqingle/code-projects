package com.sugo.resident.common.utils;

import com.sugo.resident.common.exception.BusiException;
import com.sugo.resident.common.exception.ResultCodes;

import java.util.UUID;


/**
 * 通用工具类
 */
public class CommonUtils {
    public static void stopBusiProcess(ResultCodes errorCodes) throws BusiException{
        throw new BusiException(errorCodes);
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid;
    }

}
