package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.PreviousPreScreenDataRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PreviousPreScreenDataRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final String agreeTermsTime;
    private final String authSmsTime;
    private final String rrn;

    static {
        int i = onExtraCallbackWithResult + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousPreScreenDataRequest)) {
            return false;
        }
        PreviousPreScreenDataRequest previousPreScreenDataRequest = (PreviousPreScreenDataRequest) obj;
        if (!Intrinsics.areEqual(this.agreeTermsTime, previousPreScreenDataRequest.agreeTermsTime)) {
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.authSmsTime, previousPreScreenDataRequest.authSmsTime)) {
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.rrn, previousPreScreenDataRequest.rrn)) {
            int i6 = IAuthTabCallback + 103;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = IAuthTabCallback + 75;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.agreeTermsTime.hashCode();
        if (i3 != 0) {
            iHashCode = ((iHashCode2 + 98) >> this.authSmsTime.hashCode()) >>> 82;
            str = this.rrn;
        } else {
            iHashCode = ((iHashCode2 * 31) + this.authSmsTime.hashCode()) * 31;
            str = this.rrn;
        }
        return iHashCode + str.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreviousPreScreenDataRequest(agreeTermsTime=" + this.agreeTermsTime + ", authSmsTime=" + this.authSmsTime + ", rrn=" + this.rrn + ")";
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreviousPreScreenDataRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                PreviousPreScreenDataRequest$.serializer serializerVar = PreviousPreScreenDataRequest$.serializer.INSTANCE;
                throw null;
            }
            PreviousPreScreenDataRequest$.serializer serializerVar2 = PreviousPreScreenDataRequest$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ PreviousPreScreenDataRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = IAuthTabCallback + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = PreviousPreScreenDataRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 16;
            } else {
                descriptor = PreviousPreScreenDataRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.agreeTermsTime = str;
        this.authSmsTime = str2;
        this.rrn = str3;
    }

    public PreviousPreScreenDataRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.agreeTermsTime = str;
        this.authSmsTime = str2;
        this.rrn = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PreviousPreScreenDataRequest previousPreScreenDataRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, previousPreScreenDataRequest.agreeTermsTime);
            vylVar.onExtraCallback(serialDescriptor, 0, previousPreScreenDataRequest.authSmsTime);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, previousPreScreenDataRequest.agreeTermsTime);
            vylVar.onExtraCallback(serialDescriptor, 1, previousPreScreenDataRequest.authSmsTime);
        }
        vylVar.onExtraCallback(serialDescriptor, 2, previousPreScreenDataRequest.rrn);
        int i3 = IAuthTabCallback + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
