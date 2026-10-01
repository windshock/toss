package com.alipay.plus.security.lite.utils;

import android.content.Context;
import com.alipay.plus.security.lite.b.a;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SecurityGuardLiteSecretInfo$b implements SecurityGuardLiteSecretInfo$ISecurityGuardLiteSecretInfo {
    public SecurityGuardLiteSecretInfo$b() {
    }

    @Override // com.alipay.plus.security.lite.utils.SecurityGuardLiteSecretInfo$ISecurityGuardLiteSecretInfo
    public String getSecretInfo(Context context, String str) {
        return a.a(context, str, null);
    }
}
