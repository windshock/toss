package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class FetchStageInfoRequest extends BaseRpcRequest {
    public String queryScope;
    public List<String> stageCodeList;
}
