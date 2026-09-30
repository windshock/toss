package o;

import im.toss.features.account.impl.model.BankAccountInquiryInfo;
import im.toss.features.account.impl.model.ExtraInfoItem;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getLocationCase {
    void IAuthTabCallback(int i);

    void IAuthTabCallback(long j);

    void IAuthTabCallback(boolean z);

    void IAuthTabCallbackDefault(String str);

    void IAuthTabCallbackStub(String str);

    void IAuthTabCallbackStubProxy(String str);

    void IAuthTabCallback_Parcel(String str);

    void ICustomTabsCallback(String str);

    String ICustomTabsServiceDefault();

    Long ICustomTabsServiceStub();

    String ICustomTabsServiceStubProxy();

    String ICustomTabsService_Parcel();

    String IEngagementSignalsCallback();

    String IEngagementSignalsCallbackDefault();

    BankAccountInquiryInfo IEngagementSignalsCallbackStub();

    int IEngagementSignalsCallbackStubProxy();

    String IEngagementSignalsCallback_Parcel();

    String IPostMessageService();

    long IPostMessageServiceDefault();

    boolean IPostMessageServiceStub();

    String IPostMessageServiceStubProxy();

    String IPostMessageService_Parcel();

    String ITrustedWebActivityCallback();

    String ITrustedWebActivityCallbackDefault();

    int ITrustedWebActivityCallbackStub();

    String ITrustedWebActivityCallbackStubProxy();

    Long ITrustedWebActivityCallback_Parcel();

    long ITrustedWebActivityService();

    void access000(String str);

    void access100(String str);

    boolean access200();

    void asInterface(String str);

    void extraCallback(String str);

    void extraCallbackWithResult(String str);

    void getInterfaceDescriptor(String str);

    void onExtraCallback(long j);

    void onExtraCallback(BankAccountInquiryInfo bankAccountInquiryInfo);

    void onExtraCallback(Long l);

    void onExtraCallbackWithResult(int i);

    void onExtraCallbackWithResult(Long l);

    void onExtraCallbackWithResult(boolean z);

    boolean onGreatestScrollPercentageIncreased();

    void onNavigationEvent(boolean z);

    boolean onSessionEnded();

    void onTransact(long j);

    void onTransact(String str);

    ExtraInfoItem onVerticalScrollEvent();

    void onWarmupCompleted(ExtraInfoItem extraInfoItem);

    void onWarmupCompleted(boolean z);

    String warmup();

    long writeTypedList();

    void writeTypedObject(String str);
}
