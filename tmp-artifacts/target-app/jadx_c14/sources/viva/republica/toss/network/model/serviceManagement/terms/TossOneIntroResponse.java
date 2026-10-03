package viva.republica.toss.network.model.serviceManagement.terms;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.serviceManagement.terms.TossOneIntroResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossOneIntroResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean existConnectableAffiliate;
    private final String introUrl;

    static {
        int i = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossOneIntroResponse)) {
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TossOneIntroResponse tossOneIntroResponse = (TossOneIntroResponse) obj;
        if (!(!Intrinsics.areEqual(this.introUrl, tossOneIntroResponse.introUrl))) {
            return this.existConnectableAffiliate == tossOneIntroResponse.existConnectableAffiliate;
        }
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.introUrl.hashCode() * 31) + Boolean.hashCode(this.existConnectableAffiliate);
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossOneIntroResponse(introUrl=" + this.introUrl + ", existConnectableAffiliate=" + this.existConnectableAffiliate + ")";
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossOneIntroResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TossOneIntroResponse$.serializer serializerVar = TossOneIntroResponse$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 97 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ TossOneIntroResponse(int i, String str, boolean z, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = IAuthTabCallback + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, TossOneIntroResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.introUrl = str;
        this.existConnectableAffiliate = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TossOneIntroResponse tossOneIntroResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, tossOneIntroResponse.introUrl);
        vylVar.onNavigationEvent(serialDescriptor, 1, tossOneIntroResponse.existConnectableAffiliate);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.introUrl;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.existConnectableAffiliate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
