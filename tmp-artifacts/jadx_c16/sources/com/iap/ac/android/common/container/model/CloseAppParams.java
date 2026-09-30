package com.iap.ac.android.common.container.model;

import com.iap.ac.android.common.a.a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CloseAppParams {
    public boolean animated;
    public String appId;
    public String closeActionType;

    public String toString() {
        StringBuilder sbA = a.a("CloseAppParams{appId='");
        sbA.append(this.appId);
        sbA.append('\'');
        sbA.append(", closeActionType='");
        sbA.append(this.closeActionType);
        sbA.append('\'');
        sbA.append(", animated=");
        sbA.append(this.animated);
        sbA.append('}');
        return sbA.toString();
    }
}
