package o;

import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class collectBuildUuid implements ImmutableConfigKtsanitiseConfiguration1 {
    @Override // o.ImmutableConfigKtsanitiseConfiguration1
    @Nullable
    public abstract String access000();

    @Nullable
    public abstract retrieveTotalDeviceMemorylambda9<?> onWarmupCompleted();

    collectBuildUuid() {
    }

    static collectBuildUuid onNavigationEvent(Resource resource, TombstoneParserCompanion tombstoneParserCompanion, @Nullable String str, long j, long j2, getSeverityReasonbugsnag_android_core_release getseverityreasonbugsnag_android_core_release, getFeatureFlags getfeatureflags, @Nullable String str2, @Nullable retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9, getScreenDensityDpi getscreendensitydpi, int i) {
        return new component28(resource, tombstoneParserCompanion, j, j2, getseverityreasonbugsnag_android_core_release, getfeatureflags, str2, getscreendensitydpi, i, retrievetotaldevicememorylambda9, str);
    }

    public isInvalidApiKey IAuthTabCallback_Parcel() {
        retrieveTotalDeviceMemorylambda9<?> retrievetotaldevicememorylambda9OnWarmupCompleted = onWarmupCompleted();
        if (retrievetotaldevicememorylambda9OnWarmupCompleted == null) {
            return isInvalidApiKey.onWarmupCompleted();
        }
        return isInvalidApiKey.onExtraCallback(retrievetotaldevicememorylambda9OnWarmupCompleted.onExtraCallback());
    }
}
