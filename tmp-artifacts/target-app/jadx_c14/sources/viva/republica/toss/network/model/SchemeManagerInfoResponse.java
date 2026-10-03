package viva.republica.toss.network.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SchemeManagerInfoResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeManagerInfoResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String managementTeam;
    private final String managerName;

    static {
        int i = onExtraCallback + 71;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SchemeManagerInfoResponse() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SchemeManagerInfoResponse)) {
            return false;
        }
        SchemeManagerInfoResponse schemeManagerInfoResponse = (SchemeManagerInfoResponse) obj;
        if (!Intrinsics.areEqual(this.managementTeam, schemeManagerInfoResponse.managementTeam)) {
            return false;
        }
        if (Intrinsics.areEqual(this.managerName, schemeManagerInfoResponse.managerName)) {
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback;
        int i6 = i5 + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 41;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.managementTeam;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.managerName;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SchemeManagerInfoResponse(managementTeam=" + this.managementTeam + ", managerName=" + this.managerName + ")";
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SchemeManagerInfoResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                SchemeManagerInfoResponse$.serializer serializerVar = SchemeManagerInfoResponse$.serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            SchemeManagerInfoResponse$.serializer serializerVar2 = SchemeManagerInfoResponse$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return serializerVar2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ SchemeManagerInfoResponse(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.managementTeam = null;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.managementTeam = str;
        }
        if ((i & 2) != 0) {
            this.managerName = str2;
            return;
        }
        this.managerName = null;
        int i5 = onNavigationEvent + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
    }

    public SchemeManagerInfoResponse(@Nullable String str, @Nullable String str2) {
        this.managementTeam = str;
        this.managerName = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.SchemeManagerInfoResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.SchemeManagerInfoResponse.IAuthTabCallback
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.network.model.SchemeManagerInfoResponse.onNavigationEvent = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L2a
            int r2 = viva.republica.toss.network.model.SchemeManagerInfoResponse.onNavigationEvent
            int r2 = r2 + 63
            int r3 = r2 % 128
            viva.republica.toss.network.model.SchemeManagerInfoResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            java.lang.String r2 = r5.managementTeam
            if (r2 == 0) goto L31
            goto L2a
        L23:
            java.lang.String r5 = r5.managementTeam
            r5 = 0
            r5.hashCode()
            throw r5
        L2a:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r5.managementTeam
            r6.onExtraCallbackWithResult(r7, r1, r2, r3)
        L31:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L4d
            int r3 = viva.republica.toss.network.model.SchemeManagerInfoResponse.IAuthTabCallback
            int r3 = r3 + 87
            int r4 = r3 % 128
            viva.republica.toss.network.model.SchemeManagerInfoResponse.onNavigationEvent = r4
            int r3 = r3 % r0
            java.lang.String r0 = r5.managerName
            if (r3 != 0) goto L4b
            r3 = 98
            int r3 = r3 / r1
            if (r0 == 0) goto L54
            goto L4d
        L4b:
            if (r0 == 0) goto L54
        L4d:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.managerName
            r6.onExtraCallbackWithResult(r7, r2, r0, r5)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.SchemeManagerInfoResponse.onExtraCallback(viva.republica.toss.network.model.SchemeManagerInfoResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SchemeManagerInfoResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 26 / 0;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.managementTeam;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.managerName;
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
