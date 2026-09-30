package com.tmoney.kscc.sslio.a;

import o.certGetAuthorityInformationAccess;
import o.getIv8;
import o.getSignPrikeyCCFBPHFilename;
import o.getUserCertList;
import o.initCertListOnMemory;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: com.tmoney.kscc.sslio.a.h, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface InterfaceC0047h {
    @initCertListOnMemory
    getSignPrikeyCCFBPHFilename<ResponseBody> get(@certGetAuthorityInformationAccess String str);

    @getIv8
    getSignPrikeyCCFBPHFilename<ResponseBody> post(@certGetAuthorityInformationAccess String str, @getUserCertList RequestBody requestBody);
}
