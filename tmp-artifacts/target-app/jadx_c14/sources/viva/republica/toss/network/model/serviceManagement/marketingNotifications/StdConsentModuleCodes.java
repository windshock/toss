package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class StdConsentModuleCodes {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String email;
    private final String integrated;
    private final String push;
    private final String sms;

    static {
        int i = IAuthTabCallback + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public StdConsentModuleCodes() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StdConsentModuleCodes)) {
            return false;
        }
        StdConsentModuleCodes stdConsentModuleCodes = (StdConsentModuleCodes) obj;
        if (!Intrinsics.areEqual(this.push, stdConsentModuleCodes.push) || !Intrinsics.areEqual(this.sms, stdConsentModuleCodes.sms)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.email, stdConsentModuleCodes.email)) {
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.integrated, stdConsentModuleCodes.integrated)) {
            return false;
        }
        int i3 = onExtraCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.push;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.sms;
        if (str2 == null) {
            int i3 = onExtraCallbackWithResult + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.email;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.integrated;
        if (str4 != null) {
            iHashCode3 = str4.hashCode();
            int i5 = onExtraCallbackWithResult + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StdConsentModuleCodes(push=" + this.push + ", sms=" + this.sms + ", email=" + this.email + ", integrated=" + this.integrated + ")";
        int i2 = onExtraCallbackWithResult + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StdConsentModuleCodes> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            StdConsentModuleCodes$$serializer stdConsentModuleCodes$$serializer = StdConsentModuleCodes$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return stdConsentModuleCodes$$serializer;
        }
    }

    public /* synthetic */ StdConsentModuleCodes(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.push = null;
            int i2 = onExtraCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 3;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.push = str;
        }
        if ((i & 2) == 0) {
            this.sms = null;
        } else {
            this.sms = str2;
            int i5 = onExtraCallback + 53;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.email = null;
        } else {
            this.email = str3;
        }
        if ((i & 8) == 0) {
            this.integrated = null;
        } else {
            this.integrated = str4;
        }
    }

    public StdConsentModuleCodes(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.push = str;
        this.sms = str2;
        this.email = str3;
        this.integrated = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 == 0) goto Lb
            goto Lf
        Lb:
            java.lang.String r2 = r5.push
            if (r2 == 0) goto L16
        Lf:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.push
            r6.onExtraCallbackWithResult(r7, r1, r2, r3)
        L16:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L2a
            int r3 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallback
            int r3 = r3 + 113
            int r4 = r3 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            java.lang.String r3 = r5.sms
            if (r3 == 0) goto L31
        L2a:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.sms
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L31:
            boolean r3 = r6.onWarmupCompleted(r7, r0)
            if (r3 != 0) goto L4e
            int r3 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallback
            int r3 = r3 + 75
            int r4 = r3 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L4a
            java.lang.String r3 = r5.email
            r4 = 72
            int r4 = r4 / r1
            if (r3 == 0) goto L55
            goto L4e
        L4a:
            java.lang.String r1 = r5.email
            if (r1 == 0) goto L55
        L4e:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.email
            r6.onExtraCallbackWithResult(r7, r0, r1, r3)
        L55:
            r1 = 3
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L61
            java.lang.String r2 = r5.integrated
            if (r2 == 0) goto L68
        L61:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.integrated
            r6.onExtraCallbackWithResult(r7, r1, r2, r5)
        L68:
            int r5 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallback
            int r5 = r5 + 11
            int r6 = r5 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L74
            return
        L74:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes.IAuthTabCallback(viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StdConsentModuleCodes(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
            str = null;
        }
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i4 = onExtraCallbackWithResult + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i6 = 2 % 2;
            str4 = null;
        }
        this(str, str2, str3, str4);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.push;
        int i5 = i2 + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.sms;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.integrated;
        int i4 = i3 + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return str;
    }
}
