package o;

import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class component28 extends collectBuildUuid {

    @Nullable
    private final retrieveTotalDeviceMemorylambda9<?> IAuthTabCallback;
    private final getSeverityReasonbugsnag_android_core_release IAuthTabCallbackDefault;

    @Nullable
    private final String IAuthTabCallbackStub;
    private final int access100;
    private final long asBinder;
    private final getFeatureFlags asInterface;
    private final long onExtraCallback;
    private final getScreenDensityDpi onExtraCallbackWithResult;
    private final TombstoneParserCompanion onNavigationEvent;
    private final Resource onTransact;

    @Nullable
    private final String onWarmupCompleted;

    component28(Resource resource, TombstoneParserCompanion tombstoneParserCompanion, long j, long j2, getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release, getFeatureFlags getfeatureflags, @Nullable String str, getScreenDensityDpi getscreendensitydpi, int i, @Nullable retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9, @Nullable String str2) {
        if (resource == null) {
            throw new NullPointerException("Null resource");
        }
        this.onTransact = resource;
        if (tombstoneParserCompanion == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.onNavigationEvent = tombstoneParserCompanion;
        this.asBinder = j;
        this.onExtraCallback = j2;
        if (getseverityreasonbugsnag_android_core_release == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.IAuthTabCallbackDefault = getseverityreasonbugsnag_android_core_release;
        if (getfeatureflags == null) {
            throw new NullPointerException("Null severity");
        }
        this.asInterface = getfeatureflags;
        this.IAuthTabCallbackStub = str;
        if (getscreendensitydpi == null) {
            throw new NullPointerException("Null attributes");
        }
        this.onExtraCallbackWithResult = getscreendensitydpi;
        this.access100 = i;
        this.IAuthTabCallback = retrievetotaldevicememorylambda9;
        this.onWarmupCompleted = str2;
    }

    public Resource IAuthTabCallback() {
        return this.onTransact;
    }

    public TombstoneParserCompanion onExtraCallback() {
        return this.onNavigationEvent;
    }

    public long IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public long onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public getSeverityReasonbugsnag_android_core_release asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public getFeatureFlags asBinder() {
        return this.asInterface;
    }

    @Nullable
    public String onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public getScreenDensityDpi onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public int IAuthTabCallbackDefault() {
        return this.access100;
    }

    @Override // o.collectBuildUuid
    @Nullable
    public retrieveTotalDeviceMemorylambda9<?> onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.collectBuildUuid, o.ImmutableConfigKtsanitiseConfiguration1
    @Nullable
    public String access000() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "SdkLogRecordData{resource=" + this.onTransact + ", instrumentationScopeInfo=" + this.onNavigationEvent + ", timestampEpochNanos=" + this.asBinder + ", observedTimestampEpochNanos=" + this.onExtraCallback + ", spanContext=" + this.IAuthTabCallbackDefault + ", severity=" + this.asInterface + ", severityText=" + this.IAuthTabCallbackStub + ", attributes=" + this.onExtraCallbackWithResult + ", totalAttributeCount=" + this.access100 + ", bodyValue=" + this.IAuthTabCallback + ", eventName=" + this.onWarmupCompleted + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof collectBuildUuid)) {
            return false;
        }
        collectBuildUuid collectbuilduuid = (collectBuildUuid) obj;
        if (!this.onTransact.equals(collectbuilduuid.IAuthTabCallback()) || !this.onNavigationEvent.equals(collectbuilduuid.onExtraCallback()) || this.asBinder != collectbuilduuid.IAuthTabCallbackStub() || this.onExtraCallback != collectbuilduuid.onExtraCallbackWithResult() || !this.IAuthTabCallbackDefault.equals(collectbuilduuid.asInterface()) || !this.asInterface.equals(collectbuilduuid.asBinder())) {
            return false;
        }
        String str = this.IAuthTabCallbackStub;
        if (str == null) {
            if (collectbuilduuid.onTransact() != null) {
                return false;
            }
        } else if (!str.equals(collectbuilduuid.onTransact())) {
            return false;
        }
        if (!this.onExtraCallbackWithResult.equals(collectbuilduuid.onNavigationEvent()) || this.access100 != collectbuilduuid.IAuthTabCallbackDefault()) {
            return false;
        }
        retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9 = this.IAuthTabCallback;
        if (retrievetotaldevicememorylambda9 == null) {
            if (collectbuilduuid.onWarmupCompleted() != null) {
                return false;
            }
        } else if (!retrievetotaldevicememorylambda9.equals(collectbuilduuid.onWarmupCompleted())) {
            return false;
        }
        String str2 = this.onWarmupCompleted;
        if (str2 == null) {
            if (collectbuilduuid.access000() != null) {
                return false;
            }
        } else if (!str2.equals(collectbuilduuid.access000())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = this.onTransact.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        long j = this.asBinder;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.onExtraCallback;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode3 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        String str = this.IAuthTabCallbackStub;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        int i3 = this.access100;
        retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9 = this.IAuthTabCallback;
        int iHashCode7 = retrievetotaldevicememorylambda9 == null ? 0 : retrievetotaldevicememorylambda9.hashCode();
        String str2 = this.onWarmupCompleted;
        return ((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ i3) * 1000003) ^ iHashCode7) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
