package com.sugo.resident.task.service.impl;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.task.business.process.RsaKeyPairCreateProcess;
import com.sugo.resident.task.model.RsaDTO;
import com.sugo.resident.task.service.RRsaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class RRsaServiceImpl implements RRsaService {
    @Override
    public void createRsaKeyPairs(RsaDTO rsaDTO) throws Exception {
        AbstractBusinessProcess process = new RsaKeyPairCreateProcess(rsaDTO);
        process.execute();
    }
}
