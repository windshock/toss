package org.apache.commons.compress.java.util.jar;

import java.security.PrivilegedAction;
import o.PAGInterstitialAdLoadListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Pack200$$ExternalSyntheticLambda0 implements PrivilegedAction {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ Pack200$$ExternalSyntheticLambda0(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return PAGInterstitialAdLoadListener.onWarmupCompleted(this.f$0, this.f$1);
    }
}
