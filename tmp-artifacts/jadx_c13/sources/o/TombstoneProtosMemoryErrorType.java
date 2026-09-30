package o;

import im.toss.features.bankinfo.impl.model.BankAttribute;
import io.realm.RealmList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TombstoneProtosMemoryErrorType {
    void IAuthTabCallback(int i);

    void IAuthTabCallback(String str);

    void IAuthTabCallback(boolean z);

    void IAuthTabCallbackDefault(boolean z);

    void IAuthTabCallbackStub(boolean z);

    void IAuthTabCallbackStubProxy(boolean z);

    RealmList<String> ICustomTabsServiceDefault();

    String ICustomTabsServiceStub();

    int ICustomTabsServiceStubProxy();

    boolean ICustomTabsService_Parcel();

    boolean IEngagementSignalsCallback();

    boolean IEngagementSignalsCallbackDefault();

    boolean IEngagementSignalsCallbackStub();

    String access200();

    void asBinder(boolean z);

    void asInterface(boolean z);

    void getInterfaceDescriptor(boolean z);

    boolean newSession();

    boolean newSessionWithExtras();

    void onExtraCallback(int i);

    void onExtraCallback(BankAttribute bankAttribute);

    void onExtraCallback(String str);

    void onExtraCallback(boolean z);

    void onExtraCallbackWithResult(int i);

    void onExtraCallbackWithResult(RealmList<String> realmList);

    void onExtraCallbackWithResult(String str);

    void onExtraCallbackWithResult(boolean z);

    boolean onGreatestScrollPercentageIncreased();

    void onNavigationEvent(int i);

    void onNavigationEvent(String str);

    void onNavigationEvent(boolean z);

    int onSessionEnded();

    void onTransact(boolean z);

    int onVerticalScrollEvent();

    void onWarmupCompleted(int i);

    void onWarmupCompleted(String str);

    void onWarmupCompleted(boolean z);

    BankAttribute postMessage();

    String prefetch();

    boolean prefetchWithMultipleUrls();

    boolean receiveFile();

    int requestPostMessageChannel();

    boolean requestPostMessageChannelWithExtras();

    int setEngagementSignalsCallback();

    String updateVisuals();

    boolean validateRelationship();

    boolean warmup();

    String writeTypedList();
}
