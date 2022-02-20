package com.sugo.resident.task.business.process;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.commonapi.utils.RSAUtils;
import com.sugo.resident.task.business.actions.dbase.RsaBasicInfoDeleteDbAction;
import com.sugo.resident.task.business.actions.dbase.RsaBasicInfoToDbAction;
import com.sugo.resident.task.business.actions.packs.RsaBasicInfoPackAction;
import com.sugo.resident.task.business.actions.redis.RsaBasicInfoToRedisAction;
import com.sugo.resident.task.business.functions.RsaBasicInfoDbOprFunction;
import com.sugo.resident.task.model.RsaDTO;
import org.apache.tomcat.util.codec.binary.Base64;

import java.security.KeyPair;

public class RsaKeyPairCreateProcess extends AbstractBusinessProcess<RsaDTO> {

    public RsaKeyPairCreateProcess(RsaDTO o) throws Exception {
        super(o);
    }

    @Override
    protected void createProcess() throws Exception {
        //生成封装rsa基础信息：密钥对及创建日期
        this.busi = new RsaBasicInfoPackAction(this.busi);
        //rsa信息数据库操作
        this.busi = new RsaBasicInfoDbOprFunction(this.busi);
        //rsa信息redis操作
        this.busi = new RsaBasicInfoToRedisAction(this.busi);

    }
}
