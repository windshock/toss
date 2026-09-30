package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetCertNum {
    GetPassword onExtraCallback;
    String onNavigationEvent;
    int onWarmupCompleted;

    GetCertNum(GetPassword getPassword, int i, String str) {
        this.onExtraCallback = getPassword;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = str;
    }

    void onWarmupCompleted(GetKMPrikey getKMPrikey) {
        getKMPrikey.onExtraCallbackWithResult(this.onExtraCallback, this.onWarmupCompleted, this.onNavigationEvent);
    }
}
