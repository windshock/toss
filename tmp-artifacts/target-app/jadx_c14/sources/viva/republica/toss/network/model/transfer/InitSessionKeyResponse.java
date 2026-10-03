package viva.republica.toss.network.model.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InitSessionKeyResponse implements Parcelable {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String sessionKey;
    private final String startedAt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InitSessionKeyResponse> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<InitSessionKeyResponse> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final InitSessionKeyResponse IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            InitSessionKeyResponse initSessionKeyResponse = new InitSessionKeyResponse(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
            return initSessionKeyResponse;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InitSessionKeyResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            InitSessionKeyResponse initSessionKeyResponseIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            return initSessionKeyResponseIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ InitSessionKeyResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            InitSessionKeyResponse[] initSessionKeyResponseArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return initSessionKeyResponseArrOnExtraCallback;
        }

        public final InitSessionKeyResponse[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 27;
            onNavigationEvent = i3 % 128;
            InitSessionKeyResponse[] initSessionKeyResponseArr = new InitSessionKeyResponse[i];
            if (i3 % 2 != 0) {
                return initSessionKeyResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InitSessionKeyResponse() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof InitSessionKeyResponse)) {
            int i2 = onNavigationEvent + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        InitSessionKeyResponse initSessionKeyResponse = (InitSessionKeyResponse) obj;
        if (Intrinsics.areEqual(this.sessionKey, initSessionKeyResponse.sessionKey)) {
            return Intrinsics.areEqual(this.startedAt, initSessionKeyResponse.startedAt);
        }
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.sessionKey;
        if (str == null) {
            int i2 = onNavigationEvent + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.startedAt;
        if (str2 != null) {
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                str2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i5 = (iHashCode * 31) + iHashCode2;
        int i6 = onNavigationEvent + 119;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 78 / 0;
        }
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InitSessionKeyResponse(sessionKey=" + this.sessionKey + ", startedAt=" + this.startedAt + ")";
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sessionKey);
        parcel.writeString(this.startedAt);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitSessionKeyResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            InitSessionKeyResponse$.serializer serializerVar = InitSessionKeyResponse$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ InitSessionKeyResponse(int i, String str, String str2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.sessionKey = null;
            int i2 = 2 % 2;
        } else {
            this.sessionKey = str;
        }
        if ((i & 2) != 0) {
            this.startedAt = str2;
            int i3 = onExtraCallback + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.startedAt = null;
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public InitSessionKeyResponse(@Nullable String str, @Nullable String str2) {
        this.sessionKey = str;
        this.startedAt = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.InitSessionKeyResponse r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 == 0) goto Lb
            goto L22
        Lb:
            int r2 = viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onExtraCallback
            int r2 = r2 + 17
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1e
            java.lang.String r2 = r4.sessionKey
            r3 = 59
            int r3 = r3 / r1
            if (r2 == 0) goto L32
            goto L22
        L1e:
            java.lang.String r2 = r4.sessionKey
            if (r2 == 0) goto L32
        L22:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r4.sessionKey
            r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            int r1 = viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onNavigationEvent
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onExtraCallback = r2
            int r1 = r1 % r0
        L32:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L3d
            java.lang.String r2 = r4.startedAt
            if (r2 == 0) goto L52
        L3d:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.startedAt
            r5.onExtraCallbackWithResult(r6, r1, r2, r4)
            int r4 = viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onNavigationEvent
            int r4 = r4 + 51
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyResponse.onExtraCallback = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L52
            r4 = 3
            int r4 = r4 % 4
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.InitSessionKeyResponse.IAuthTabCallback(viva.republica.toss.network.model.transfer.InitSessionKeyResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitSessionKeyResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 105;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sessionKey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startedAt;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
