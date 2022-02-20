package com.sugo.resident.task.service;

import com.sugo.resident.task.model.RsaDTO;

/**
 * RSA业务接口
 */
public interface RRsaService {
    /**
     * 创建密钥对
     */
    public void createRsaKeyPairs(RsaDTO rsaDTO) throws Exception;
}
