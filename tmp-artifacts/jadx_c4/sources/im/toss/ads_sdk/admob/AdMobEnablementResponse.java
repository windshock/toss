package im.toss.ads_sdk.admob;

import im.toss.ads_sdk.admob.AdMobEnablementResponse$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdMobEnablementResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean admobEnabled;

    static {
        int i = onExtraCallback + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdMobEnablementResponse)) {
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.admobEnabled != ((AdMobEnablementResponse) obj).admobEnabled) {
            int i4 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.admobEnabled;
        if (i3 == 0) {
            return Boolean.hashCode(z);
        }
        Boolean.hashCode(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobEnablementResponse(admobEnabled=" + this.admobEnabled + ")";
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdMobEnablementResponse> serializer() {
            AdMobEnablementResponse$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = AdMobEnablementResponse$.serializer.INSTANCE;
                int i3 = 82 / 0;
            } else {
                serializerVar = AdMobEnablementResponse$.serializer.INSTANCE;
            }
            int i4 = onWarmupCompleted + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 84 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ AdMobEnablementResponse(int i, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = AdMobEnablementResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = AdMobEnablementResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.admobEnabled = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AdMobEnablementResponse adMobEnablementResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, i2 % 2 != 0 ? 1 : 0, adMobEnablementResponse.admobEnabled);
        int i3 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.admobEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
