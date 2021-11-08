package com.sugo.resident.common.business.process;

import com.sugo.resident.common.business.base.BusinessBase;


public abstract class AbstractBusinessProcess <T>{
    protected BusinessBase<T> busi;

    public AbstractBusinessProcess(BusinessBase<T> busi) throws Exception{
        this.busi = busi;
        createProcess();
    }

    /**
     * 创建业务流程，一般包含Action和Function
     * @throws Exception
     */
    protected abstract void createProcess() throws Exception;

    /**
     * 执行业务流程并返回数据
     * @return
     * @throws Exception
     */
    public final T executeWithResp() throws Exception{
        this.busi.execute();
        return this.busi.data();
    }
    /**
     * 执行业务流程,无数据返回
     * @return
     * @throws Exception
     */
    public final void execute() throws Exception{
        this.busi.execute();
    }
}
