package viva.republica.toss.network.model.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.common.StickyTimezoneResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class StickyTimezoneResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String lastUpdatedAt;
    private final String stickyTimezone;

    static {
        int i = onExtraCallback + 35;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StickyTimezoneResponse() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickyTimezoneResponse)) {
            return false;
        }
        StickyTimezoneResponse stickyTimezoneResponse = (StickyTimezoneResponse) obj;
        if (!Intrinsics.areEqual(this.stickyTimezone, stickyTimezoneResponse.stickyTimezone)) {
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.lastUpdatedAt, stickyTimezoneResponse.lastUpdatedAt))) {
            return true;
        }
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.stickyTimezone.hashCode() * 31) + this.lastUpdatedAt.hashCode();
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StickyTimezoneResponse(stickyTimezone=" + this.stickyTimezone + ", lastUpdatedAt=" + this.lastUpdatedAt + ")";
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StickyTimezoneResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            StickyTimezoneResponse$.serializer serializerVar = StickyTimezoneResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ StickyTimezoneResponse(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.stickyTimezone = "";
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.stickyTimezone = str;
        }
        if ((i & 2) != 0) {
            this.lastUpdatedAt = str2;
            return;
        }
        int i4 = onWarmupCompleted;
        int i5 = i4 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.lastUpdatedAt = "";
        if (i6 != 0) {
            int i7 = 30 / 0;
        }
        int i8 = i4 + 113;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    public StickyTimezoneResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.stickyTimezone = str;
        this.lastUpdatedAt = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.common.StickyTimezoneResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            java.lang.String r3 = ""
            if (r2 != 0) goto L1d
            int r2 = viva.republica.toss.network.model.common.StickyTimezoneResponse.onNavigationEvent
            int r2 = r2 + 55
            int r4 = r2 % 128
            viva.republica.toss.network.model.common.StickyTimezoneResponse.onWarmupCompleted = r4
            int r2 = r2 % r0
            java.lang.String r2 = r5.stickyTimezone
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L22
        L1d:
            java.lang.String r2 = r5.stickyTimezone
            r6.onExtraCallback(r7, r1, r2)
        L22:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L3c
            int r2 = viva.republica.toss.network.model.common.StickyTimezoneResponse.onNavigationEvent
            int r2 = r2 + 51
            int r4 = r2 % 128
            viva.republica.toss.network.model.common.StickyTimezoneResponse.onWarmupCompleted = r4
            int r2 = r2 % r0
            java.lang.String r0 = r5.lastUpdatedAt
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            r0 = r0 ^ r1
            if (r0 == r1) goto L3c
            goto L41
        L3c:
            java.lang.String r5 = r5.lastUpdatedAt
            r6.onExtraCallback(r7, r1, r5)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.common.StickyTimezoneResponse.onNavigationEvent(viva.republica.toss.network.model.common.StickyTimezoneResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StickyTimezoneResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 55;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i7 = i6 + 81;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 3;
            } else {
                int i9 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.stickyTimezone;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
