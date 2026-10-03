package viva.republica.toss.network.model.transfer;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.GetOcrResultResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetOcrResultResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("model")
    private final String model;

    @SerializedName("rawText")
    private final String rawText;

    static {
        int i = onNavigationEvent + 81;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetOcrResultResp() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GetOcrResultResp)) {
            return false;
        }
        GetOcrResultResp getOcrResultResp = (GetOcrResultResp) obj;
        if (!Intrinsics.areEqual(this.rawText, getOcrResultResp.rawText)) {
            return false;
        }
        if (Intrinsics.areEqual(this.model, getOcrResultResp.model)) {
            return true;
        }
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.rawText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.model;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetOcrResultResp(rawText=" + this.rawText + ", model=" + this.model + ")";
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetOcrResultResp> serializer() {
            GetOcrResultResp$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = GetOcrResultResp$.serializer.INSTANCE;
                int i3 = 14 / 0;
            } else {
                serializerVar = GetOcrResultResp$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ GetOcrResultResp(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.rawText = null;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.rawText = str;
        }
        if ((i & 2) != 0) {
            this.model = str2;
            return;
        }
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.model = null;
    }

    public GetOcrResultResp(@Nullable String str, @Nullable String str2) {
        this.rawText = str;
        this.model = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.GetOcrResultResp r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.GetOcrResultResp.IAuthTabCallback
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.GetOcrResultResp.onExtraCallback = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L2a
            int r2 = viva.republica.toss.network.model.transfer.GetOcrResultResp.onExtraCallback
            int r2 = r2 + 51
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.GetOcrResultResp.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            java.lang.String r2 = r4.rawText
            if (r2 == 0) goto L31
            goto L2a
        L23:
            java.lang.String r4 = r4.rawText
            r4 = 0
            r4.hashCode()
            throw r4
        L2a:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.rawText
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
        L31:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L45
            int r2 = viva.republica.toss.network.model.transfer.GetOcrResultResp.IAuthTabCallback
            int r2 = r2 + 71
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.GetOcrResultResp.onExtraCallback = r3
            int r2 = r2 % r0
            java.lang.String r0 = r4.model
            if (r0 == 0) goto L4c
        L45:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.model
            r5.onExtraCallbackWithResult(r6, r1, r0, r4)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.GetOcrResultResp.IAuthTabCallback(viva.republica.toss.network.model.transfer.GetOcrResultResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetOcrResultResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rawText;
        int i5 = i2 + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }
}
