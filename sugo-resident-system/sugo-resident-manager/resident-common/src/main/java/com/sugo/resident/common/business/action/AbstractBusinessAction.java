package com.sugo.resident.common.business.action;


import com.sugo.resident.common.business.annot.BusiAutoWired;
import com.sugo.resident.common.business.base.BusinessBase;
import com.sugo.resident.common.enumInfo.ResultCodeInfo;
import com.sugo.resident.common.utils.BusinessUtil;
import com.sugo.resident.common.business.utils.SpringContextUtil;

import java.lang.reflect.Field;


/**
 * @see
 * @description 最小逻辑执行单元，一般是实际执行的逻辑，同时可以认为是最小的且不可拆分的方法
 * @author shuqingle
 */
public abstract class AbstractBusinessAction<T> extends BusinessBase<T> {
    public AbstractBusinessAction(BusinessBase<T> busi) throws Exception{
        this.busi = busi;
        autoWired(this);
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

    /**
     * 自动注入扫描
     * @paramtAbstractBusinessAction
     */
    private void autoWired(AbstractBusinessAction<T> abstractBusinessAction){
        Class<? extends AbstractBusinessAction> busiClass = abstractBusinessAction.getClass();
        Field[] fields = busiClass.getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(BusiAutoWired.class)){
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    field.set(type, SpringContextUtil.getBean(type));
                } catch (Exception e) {
                    BusinessUtil.stopBusiProcess(ResultCodeInfo.AUTO_SCAN_INJECT_ERROR);
                }
            }
        }
    };
}
