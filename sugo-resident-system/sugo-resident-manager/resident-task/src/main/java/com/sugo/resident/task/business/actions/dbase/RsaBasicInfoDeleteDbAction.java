package com.sugo.resident.task.business.actions.dbase;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.annot.BusiAutoWired;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.business.utils.SpringContextUtil;
import com.sugo.resident.task.dao.RRsaMapper;
import com.sugo.resident.task.model.RsaDTO;

public class RsaBasicInfoDeleteDbAction extends AbstractBusinessAction<RsaDTO> {
//    @BusiAutoWired
    private RRsaMapper rsaMapper = SpringContextUtil.getBean(RRsaMapper.class);

    public RsaBasicInfoDeleteDbAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        rsaMapper.deleteRsa(this.busi.data());
    }
}
