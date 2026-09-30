package com.iap.android.mppclient.mpm.model;

import com.iap.android.mppclient.basic.model.inner.BaseResult;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareAuthResult extends BaseResult {
    public String acquirerId;
    public String authClientId;
    public String authRedirectUrl;
    public String pspId;
    public List<String> scopes;
}
