package com.iap.ac.config.lite.i;

import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.IUserInfoManager;
import com.iap.ac.config.lite.ConfigCenterContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class a implements IUserInfoManager {
    ConfigCenterContext a;
    ACUserInfo b;

    public a(ConfigCenterContext configCenterContext) {
        this.a = configCenterContext;
    }

    public String getOpenId() {
        return this.a.getIdentifierProvider().getConfigUserId(this.a.getContext());
    }

    public ACUserInfo getUserInfo() {
        if (this.b == null) {
            ACUserInfo aCUserInfo = new ACUserInfo();
            this.b = aCUserInfo;
            aCUserInfo.openId = getOpenId();
        }
        return this.b;
    }

    public boolean setUserInfo(ACUserInfo aCUserInfo) {
        return false;
    }
}
