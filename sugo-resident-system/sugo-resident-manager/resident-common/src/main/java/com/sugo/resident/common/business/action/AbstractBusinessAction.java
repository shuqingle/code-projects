package com.sugo.resident.common.business.action;


import com.sugo.resident.common.business.base.BusinessBase;


/**
 * @see
 * @description 最小逻辑执行单元，一般是实际执行的逻辑，同时可以认为是最小的且不可拆分的方法
 * @author shuqingle
 */
public abstract class AbstractBusinessAction<T> extends BusinessBase<T> {
    public AbstractBusinessAction(BusinessBase<T> busi) throws Exception{
        this.busi = busi;
    }

    @Override
    protected void core() throws Exception {
        createAction();
    }

    /**
     * 创建最小逻辑单元
     * @throws Exception
     */
    protected abstract void createAction ()throws Exception;
}
