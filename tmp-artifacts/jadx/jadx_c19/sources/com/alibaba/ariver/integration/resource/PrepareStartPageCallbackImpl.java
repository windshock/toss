package com.alibaba.ariver.integration.resource;

import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareStartPageCallbackImpl extends PrepareCallbackImpl {
    @Override // com.alibaba.ariver.integration.resource.PrepareCallbackImpl, com.alibaba.ariver.resource.api.prepare.PrepareCallback
    public void showLoading(boolean z, EntryInfo entryInfo) {
    }

    public PrepareStartPageCallbackImpl(RVAppRecord rVAppRecord, PrepareContext prepareContext) {
        super(rVAppRecord, prepareContext);
    }
}
