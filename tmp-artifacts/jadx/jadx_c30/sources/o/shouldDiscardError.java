package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class shouldDiscardError implements getUnhandledRejections {

    @Nullable
    private String IAuthTabCallback;
    private final getSessionApiDeliveryParams IAuthTabCallbackDefault;
    private final getPackageInfo IAuthTabCallbackStub;
    private long access000;
    private getFeatureFlags asBinder = getFeatureFlags.UNDEFINED_SEVERITY_NUMBER;

    @Nullable
    private String asInterface;

    @Nullable
    private component13 onExtraCallback;

    @Nullable
    private trimMetadataStringsTo onExtraCallbackWithResult;
    private final TombstoneParserCompanion onNavigationEvent;
    private long onTransact;

    @Nullable
    private retrieveTotalDeviceMemorylambda9<?> onWarmupCompleted;

    shouldDiscardError(getPackageInfo getpackageinfo, TombstoneParserCompanion tombstoneParserCompanion) {
        this.IAuthTabCallbackStub = getpackageinfo;
        this.IAuthTabCallbackDefault = getpackageinfo.IAuthTabCallback();
        this.onNavigationEvent = tombstoneParserCompanion;
    }

    shouldDiscardError IAuthTabCallback(String str) {
        this.IAuthTabCallback = str;
        return this;
    }

    @Override // 
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public <T> shouldDiscardError onExtraCallbackWithResult(getLocationStatus<T> getlocationstatus, T t) {
        if (getlocationstatus != null && !getlocationstatus.IAuthTabCallback().isEmpty() && t != null) {
            if (this.onExtraCallback == null) {
                this.onExtraCallback = component13.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallbackWithResult(), this.IAuthTabCallbackDefault.onNavigationEvent());
            }
            this.onExtraCallback.onNavigationEvent(getlocationstatus, t);
        }
        return this;
    }

    public void onExtraCallbackWithResult() {
        if (this.IAuthTabCallbackStub.onExtraCallback()) {
            return;
        }
        trimMetadataStringsTo trimmetadatastringstoOnExtraCallback = this.onExtraCallbackWithResult;
        if (trimmetadatastringstoOnExtraCallback == null) {
            trimmetadatastringstoOnExtraCallback = trimMetadataStringsTo.onExtraCallback();
        }
        long jOnNavigationEvent = this.onTransact;
        if (jOnNavigationEvent == 0) {
            jOnNavigationEvent = this.IAuthTabCallbackStub.onExtraCallbackWithResult().onNavigationEvent();
        }
        this.IAuthTabCallbackStub.onNavigationEvent().onNavigationEvent(trimmetadatastringstoOnExtraCallback, sanitiseConfiguration.onExtraCallback(this.IAuthTabCallbackStub.IAuthTabCallback(), this.IAuthTabCallbackStub.onWarmupCompleted(), this.onNavigationEvent, this.IAuthTabCallback, this.access000, jOnNavigationEvent, getUnhandled.IAuthTabCallback(trimmetadatastringstoOnExtraCallback).onExtraCallback(), this.asBinder, this.asInterface, this.onWarmupCompleted, this.onExtraCallback));
    }
}
