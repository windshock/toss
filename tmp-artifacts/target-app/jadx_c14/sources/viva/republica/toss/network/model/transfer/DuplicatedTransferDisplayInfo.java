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
import viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DuplicatedTransferDisplayInfo implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String displayMessage;
    private final String displayTitle;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DuplicatedTransferDisplayInfo> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<DuplicatedTransferDisplayInfo> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final DuplicatedTransferDisplayInfo IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo = new DuplicatedTransferDisplayInfo(parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return duplicatedTransferDisplayInfo;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DuplicatedTransferDisplayInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfoIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = IAuthTabCallback + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return duplicatedTransferDisplayInfoIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DuplicatedTransferDisplayInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            DuplicatedTransferDisplayInfo[] duplicatedTransferDisplayInfoArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return duplicatedTransferDisplayInfoArrOnWarmupCompleted;
        }

        public final DuplicatedTransferDisplayInfo[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            DuplicatedTransferDisplayInfo[] duplicatedTransferDisplayInfoArr = new DuplicatedTransferDisplayInfo[i];
            int i6 = i3 + 73;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return duplicatedTransferDisplayInfoArr;
        }
    }

    static {
        int i = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DuplicatedTransferDisplayInfo() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof DuplicatedTransferDisplayInfo) {
            DuplicatedTransferDisplayInfo duplicatedTransferDisplayInfo = (DuplicatedTransferDisplayInfo) obj;
            return Intrinsics.areEqual(this.displayTitle, duplicatedTransferDisplayInfo.displayTitle) && Intrinsics.areEqual(this.displayMessage, duplicatedTransferDisplayInfo.displayMessage);
        }
        int i8 = i2 + 103;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.displayTitle.hashCode();
        return i3 != 0 ? (iHashCode >> 35) >> this.displayMessage.hashCode() : (iHashCode * 31) + this.displayMessage.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DuplicatedTransferDisplayInfo(displayTitle=" + this.displayTitle + ", displayMessage=" + this.displayMessage + ")";
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.displayTitle);
            parcel.writeString(this.displayMessage);
            throw null;
        }
        parcel.writeString(this.displayTitle);
        parcel.writeString(this.displayMessage);
        int i5 = onNavigationEvent + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DuplicatedTransferDisplayInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            DuplicatedTransferDisplayInfo$.serializer serializerVar = DuplicatedTransferDisplayInfo$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ DuplicatedTransferDisplayInfo(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.displayTitle = "";
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.displayTitle = str;
        }
        if ((i & 2) == 0) {
            int i5 = onNavigationEvent + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.displayMessage = "";
            return;
        }
        this.displayMessage = str2;
        int i7 = onNavigationEvent + 65;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 67 / 0;
        }
    }

    public DuplicatedTransferDisplayInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.displayTitle = str;
        this.displayMessage = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo.onNavigationEvent
            int r1 = r1 + 101
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo.onWarmupCompleted = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L18
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L26
            goto L1e
        L18:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L26
        L1e:
            java.lang.String r1 = r5.displayTitle
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L2b
        L26:
            java.lang.String r1 = r5.displayTitle
            r6.onExtraCallback(r7, r3, r1)
        L2b:
            r1 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r1)
            r3 = r3 ^ r1
            if (r3 == 0) goto L4e
            int r3 = viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo.onNavigationEvent
            int r3 = r3 + 13
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo.onWarmupCompleted = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L47
            java.lang.String r0 = r5.displayMessage
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto L53
            goto L4e
        L47:
            java.lang.String r5 = r5.displayMessage
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            r5 = 0
            throw r5
        L4e:
            java.lang.String r5 = r5.displayMessage
            r6.onExtraCallback(r7, r1, r5)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo.onWarmupCompleted(viva.republica.toss.network.model.transfer.DuplicatedTransferDisplayInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DuplicatedTransferDisplayInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.displayTitle;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.displayMessage;
        int i4 = i3 + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
