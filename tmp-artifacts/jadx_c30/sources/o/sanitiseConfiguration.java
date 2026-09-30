package o;

import io.opentelemetry.sdk.logs.ReadWriteLogRecord;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class sanitiseConfiguration implements ReadWriteLogRecord {

    @Nullable
    private component13 IAuthTabCallback;
    private final getFeatureFlags IAuthTabCallbackDefault;

    @Nullable
    private final String IAuthTabCallbackStub;
    private final long IAuthTabCallback_Parcel;
    private final getSeverityReasonbugsnag_android_core_release access100;
    private final Resource asBinder;
    private final getSessionApiDeliveryParams asInterface;
    private final TombstoneParserCompanion onExtraCallback;

    @Nullable
    private final retrieveTotalDeviceMemorylambda9<?> onExtraCallbackWithResult;
    private final Object onNavigationEvent = new Object();
    private final long onTransact;

    @Nullable
    private final String onWarmupCompleted;

    private sanitiseConfiguration(getSessionApiDeliveryParams getsessionapideliveryparams, Resource resource, TombstoneParserCompanion tombstoneParserCompanion, @Nullable String str, long j, long j2, getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release, getFeatureFlags getfeatureflags, @Nullable String str2, @Nullable retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9, @Nullable component13 component13Var) {
        this.asInterface = getsessionapideliveryparams;
        this.asBinder = resource;
        this.onExtraCallback = tombstoneParserCompanion;
        this.onWarmupCompleted = str;
        this.IAuthTabCallback_Parcel = j;
        this.onTransact = j2;
        this.access100 = getseverityreasonbugsnag_android_core_release;
        this.IAuthTabCallbackDefault = getfeatureflags;
        this.IAuthTabCallbackStub = str2;
        this.onExtraCallbackWithResult = retrievetotaldevicememorylambda9;
        this.IAuthTabCallback = component13Var;
    }

    static sanitiseConfiguration onExtraCallback(getSessionApiDeliveryParams getsessionapideliveryparams, Resource resource, TombstoneParserCompanion tombstoneParserCompanion, @Nullable String str, long j, long j2, getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release, getFeatureFlags getfeatureflags, @Nullable String str2, @Nullable retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9, @Nullable component13 component13Var) {
        return new sanitiseConfiguration(getsessionapideliveryparams, resource, tombstoneParserCompanion, str, j, j2, getseverityreasonbugsnag_android_core_release, getfeatureflags, str2, retrievetotaldevicememorylambda9, component13Var);
    }

    public <T> ReadWriteLogRecord onExtraCallback(getLocationStatus<T> getlocationstatus, T t) {
        if (getlocationstatus == null || getlocationstatus.IAuthTabCallback().isEmpty() || t == null) {
            return this;
        }
        synchronized (this.onNavigationEvent) {
            if (this.IAuthTabCallback == null) {
                this.IAuthTabCallback = component13.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(), this.asInterface.onNavigationEvent());
            }
            this.IAuthTabCallback.onNavigationEvent(getlocationstatus, t);
        }
        return this;
    }

    private getScreenDensityDpi onExtraCallback() {
        synchronized (this.onNavigationEvent) {
            component13 component13Var = this.IAuthTabCallback;
            if (component13Var != null && !component13Var.isEmpty()) {
                return this.IAuthTabCallback.onTransact();
            }
            return getScreenDensityDpi.bB_();
        }
    }

    public setBreadcrumbTrimMetrics onWarmupCompleted() {
        collectBuildUuid collectbuilduuidOnNavigationEvent;
        synchronized (this.onNavigationEvent) {
            Resource resource = this.asBinder;
            TombstoneParserCompanion tombstoneParserCompanion = this.onExtraCallback;
            String str = this.onWarmupCompleted;
            long j = this.IAuthTabCallback_Parcel;
            long j2 = this.onTransact;
            getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release = this.access100;
            getFeatureFlags getfeatureflags = this.IAuthTabCallbackDefault;
            String str2 = this.IAuthTabCallbackStub;
            retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9 = this.onExtraCallbackWithResult;
            getScreenDensityDpi getscreendensitydpiOnExtraCallback = onExtraCallback();
            component13 component13Var = this.IAuthTabCallback;
            collectbuilduuidOnNavigationEvent = collectBuildUuid.onNavigationEvent(resource, tombstoneParserCompanion, str, j, j2, getseverityreasonbugsnag_android_core_release, getfeatureflags, str2, retrievetotaldevicememorylambda9, getscreendensitydpiOnExtraCallback, component13Var == null ? 0 : component13Var.onExtraCallback());
        }
        return collectbuilduuidOnNavigationEvent;
    }
}
