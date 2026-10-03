package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubContent implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final long clickLogId;
    private final long impressionLogId;
    private final String scheme;
    private final String textColor;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SubContent> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<SubContent> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SubContent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            SubContent subContentOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 54 / 0;
            }
            return subContentOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ SubContent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            SubContent[] subContentArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return subContentArrOnExtraCallbackWithResult;
        }

        public final SubContent[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            SubContent[] subContentArr = new SubContent[i];
            int i6 = i3 + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return subContentArr;
        }

        public final SubContent onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SubContent subContent = new SubContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            int i2 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return subContent;
        }
    }

    static {
        int i = onExtraCallback + 87;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubContent)) {
            return false;
        }
        SubContent subContent = (SubContent) obj;
        if (!Intrinsics.areEqual(this.title, subContent.title)) {
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textColor, subContent.textColor)) {
            int i7 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.scheme, subContent.scheme) || this.impressionLogId != subContent.impressionLogId) {
            return false;
        }
        if (this.clickLogId == subContent.clickLogId) {
            return true;
        }
        int i8 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        String str = this.textColor;
        if (str == null) {
            int i2 = onNavigationEvent + 25;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.scheme;
        int iHashCode3 = (((((((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.impressionLogId)) * 31) + Long.hashCode(this.clickLogId);
        int i7 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubContent(title=" + this.title + ", textColor=" + this.textColor + ", scheme=" + this.scheme + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ")";
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.textColor);
            parcel.writeString(this.scheme);
            parcel.writeLong(this.impressionLogId);
            parcel.writeLong(this.clickLogId);
            throw null;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.textColor);
        parcel.writeString(this.scheme);
        parcel.writeLong(this.impressionLogId);
        parcel.writeLong(this.clickLogId);
        int i5 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubContent> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SubContent$$serializer subContent$$serializer = SubContent$$serializer.INSTANCE;
            if (i3 != 0) {
                return subContent$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ SubContent(int i, String str, String str2, String str3, long j, long j2, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, SubContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.textColor = null;
            int i2 = 2 % 2;
        } else {
            this.textColor = str2;
        }
        if ((i & 4) == 0) {
            int i3 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.scheme = null;
        } else {
            this.scheme = str3;
        }
        if ((i & 8) == 0) {
            int i5 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.impressionLogId = -1L;
            if (i6 == 0) {
                throw null;
            }
        } else {
            this.impressionLogId = j;
        }
        int i7 = 2 % 2;
        if ((i & 16) != 0) {
            this.clickLogId = j2;
            return;
        }
        int i8 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        this.clickLogId = -1L;
        if (i9 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public SubContent(@NotNull String str, @Nullable String str2, @Nullable String str3, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.textColor = str2;
        this.scheme = str3;
        this.impressionLogId = j;
        this.clickLogId = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.SubContent r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.SubContent.onExtraCallbackWithResult
            int r1 = r1 + 85
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.SubContent.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1c
            java.lang.String r1 = r7.title
            r8.onExtraCallback(r9, r3, r1)
            boolean r1 = r8.onWarmupCompleted(r9, r2)
            if (r1 != 0) goto L2b
            goto L27
        L1c:
            java.lang.String r1 = r7.title
            r8.onExtraCallback(r9, r2, r1)
            boolean r1 = r8.onWarmupCompleted(r9, r3)
            if (r1 != 0) goto L2b
        L27:
            java.lang.String r1 = r7.textColor
            if (r1 == 0) goto L32
        L2b:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r7.textColor
            r8.onExtraCallbackWithResult(r9, r3, r1, r2)
        L32:
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L3c
            java.lang.String r1 = r7.scheme
            if (r1 == 0) goto L43
        L3c:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r2 = r7.scheme
            r8.onExtraCallbackWithResult(r9, r0, r1, r2)
        L43:
            r1 = 3
            boolean r2 = r8.onWarmupCompleted(r9, r1)
            r3 = -1
            if (r2 != 0) goto L5b
            int r2 = viva.republica.toss.network.model.loan.SubContent.onNavigationEvent
            int r2 = r2 + 113
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.SubContent.onExtraCallbackWithResult = r5
            int r2 = r2 % r0
            long r5 = r7.impressionLogId
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L60
        L5b:
            long r5 = r7.impressionLogId
            r8.onExtraCallback(r9, r1, r5)
        L60:
            r0 = 4
            boolean r1 = r8.onWarmupCompleted(r9, r0)
            if (r1 != 0) goto L6d
            long r1 = r7.clickLogId
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L72
        L6d:
            long r1 = r7.clickLogId
            r8.onExtraCallback(r9, r0, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.SubContent.onExtraCallback(viva.republica.toss.network.model.loan.SubContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.textColor;
            int i4 = 12 / 0;
        } else {
            str = this.textColor;
        }
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.clickLogId;
        }
        throw null;
    }
}
