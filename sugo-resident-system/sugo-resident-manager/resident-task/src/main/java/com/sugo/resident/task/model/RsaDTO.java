package com.sugo.resident.task.model;

import lombok.Data;

@Data
public class RsaDTO {
    /**
     * 密钥对生成日期
     */
    private String createDate ;
    /**
     * 公钥字符串
     */
    private String publicKey  ;
    /**
     * 私钥字符串
     */
    private String privateKey ;
}
