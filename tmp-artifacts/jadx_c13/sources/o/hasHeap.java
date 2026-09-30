package o;

import im.toss.features.account.impl.model.AutomaticTransfer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface hasHeap {
    void IAuthTabCallbackDefault(String str);

    void IAuthTabCallbackStub(String str);

    Long ICustomTabsCallback_Parcel();

    String ICustomTabsService();

    void asBinder(String str);

    String isEngagementSignalsApiAvailable();

    boolean newAuthTabSession();

    AutomaticTransfer newSession();

    long newSessionWithExtras();

    void onExtraCallback(String str);

    void onExtraCallbackWithResult(AutomaticTransfer automaticTransfer);

    void onNavigationEvent(int i);

    void onNavigationEvent(Long l);

    void onNavigationEvent(boolean z);

    void onTransact(String str);

    void onWarmupCompleted(int i);

    void onWarmupCompleted(long j);

    void onWarmupCompleted(String str);

    String postMessage();

    int prefetch();

    int receiveFile();

    String requestPostMessageChannel();

    String requestPostMessageChannelWithExtras();

    String setEngagementSignalsCallback();
}
