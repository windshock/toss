package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RetainingDataSourceSupplierIA extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RetainingDataSourceSupplierIA> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final String color;
    private final boolean directIssueCard;
    private final boolean isPayAccountHana;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final boolean traffic;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RetainingDataSourceSupplierIA> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierIA createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            RetainingDataSourceSupplierIA retainingDataSourceSupplierIAOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return retainingDataSourceSupplierIAOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RetainingDataSourceSupplierIA[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            RetainingDataSourceSupplierIA[] retainingDataSourceSupplierIAArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return retainingDataSourceSupplierIAArrOnExtraCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[PHI: r2 r3 r7
          0x005e: PHI (r2v13 java.lang.String) = (r2v4 java.lang.String), (r2v14 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005e: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005e: PHI (r7v5 o.RCTCodelessLoggingEventListener) = (r7v3 o.RCTCodelessLoggingEventListener), (r7v9 o.RCTCodelessLoggingEventListener) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[PHI: r2 r3 r7
          0x0050: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v14 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r7v4 o.RCTCodelessLoggingEventListener) = (r7v3 o.RCTCodelessLoggingEventListener), (r7v9 o.RCTCodelessLoggingEventListener) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.RetainingDataSourceSupplierIA onExtraCallback(android.os.Parcel r21) {
            /*
                r20 = this;
                r0 = r21
                r1 = 2
                int r2 = r1 % r1
                int r2 = o.RetainingDataSourceSupplierIA.onNavigationEvent.onExtraCallbackWithResult
                int r2 = r2 + 3
                int r3 = r2 % 128
                o.RetainingDataSourceSupplierIA.onNavigationEvent.onNavigationEvent = r3
                int r2 = r2 % r1
                java.lang.String r3 = ""
                r4 = 0
                r5 = 1
                r6 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
                if (r2 != 0) goto L36
                java.lang.String r2 = r21.readString()
                java.lang.String r3 = r21.readString()
                java.lang.Class<o.RetainingDataSourceSupplierIA> r7 = o.RetainingDataSourceSupplierIA.class
                java.lang.ClassLoader r7 = r7.getClassLoader()
                android.os.Parcelable r7 = r0.readParcelable(r7)
                o.RCTCodelessLoggingEventListener r7 = (o.RCTCodelessLoggingEventListener) r7
                int r8 = r21.readInt()
                r9 = 72
                int r9 = r9 / r6
                if (r8 != 0) goto L5e
                goto L50
            L36:
                java.lang.String r2 = r21.readString()
                java.lang.String r3 = r21.readString()
                java.lang.Class<o.RetainingDataSourceSupplierIA> r7 = o.RetainingDataSourceSupplierIA.class
                java.lang.ClassLoader r7 = r7.getClassLoader()
                android.os.Parcelable r7 = r0.readParcelable(r7)
                o.RCTCodelessLoggingEventListener r7 = (o.RCTCodelessLoggingEventListener) r7
                int r8 = r21.readInt()
                if (r8 != 0) goto L5e
            L50:
                int r8 = o.RetainingDataSourceSupplierIA.onNavigationEvent.onNavigationEvent
                int r8 = r8 + 11
                int r9 = r8 % 128
                o.RetainingDataSourceSupplierIA.onNavigationEvent.onExtraCallbackWithResult = r9
                int r8 = r8 % r1
                r10 = r2
                r11 = r3
                r13 = r4
                r12 = r7
                goto L6f
            L5e:
                int r8 = r21.readInt()
                if (r8 == 0) goto L66
                r8 = r5
                goto L67
            L66:
                r8 = r6
            L67:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r10 = r2
                r11 = r3
                r12 = r7
                r13 = r8
            L6f:
                int r2 = r21.readInt()
                if (r2 == 0) goto L7b
                android.os.Parcelable$Creator<o.DynamicLoader> r2 = o.DynamicLoader.CREATOR
                java.lang.Object r4 = r2.createFromParcel(r0)
            L7b:
                r14 = r4
                o.DynamicLoader r14 = (o.DynamicLoader) r14
                o.Preconditions r2 = o.Preconditions.INSTANCE
                java.util.Map r15 = r2.onNavigationEvent(r0)
                int r2 = r21.readInt()
                if (r2 == 0) goto L96
                int r2 = o.RetainingDataSourceSupplierIA.onNavigationEvent.onExtraCallbackWithResult
                int r2 = r2 + 113
                int r3 = r2 % 128
                o.RetainingDataSourceSupplierIA.onNavigationEvent.onNavigationEvent = r3
                int r2 = r2 % r1
                r16 = r5
                goto L98
            L96:
                r16 = r6
            L98:
                java.lang.String r17 = r21.readString()
                int r1 = r21.readInt()
                if (r1 == 0) goto La5
                r18 = r5
                goto La7
            La5:
                r18 = r6
            La7:
                int r0 = r21.readInt()
                if (r0 != 0) goto Lb0
                r19 = r6
                goto Lb2
            Lb0:
                r19 = r5
            Lb2:
                o.RetainingDataSourceSupplierIA r0 = new o.RetainingDataSourceSupplierIA
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.RetainingDataSourceSupplierIA.onNavigationEvent.onExtraCallback(android.os.Parcel):o.RetainingDataSourceSupplierIA");
        }

        public final RetainingDataSourceSupplierIA[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 79;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            Object obj = null;
            RetainingDataSourceSupplierIA[] retainingDataSourceSupplierIAArr = new RetainingDataSourceSupplierIA[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return retainingDataSourceSupplierIAArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RetainingDataSourceSupplierIA)) {
            return false;
        }
        RetainingDataSourceSupplierIA retainingDataSourceSupplierIA = (RetainingDataSourceSupplierIA) obj;
        if (!Intrinsics.areEqual(this.type, retainingDataSourceSupplierIA.type) || (!Intrinsics.areEqual(this.key, retainingDataSourceSupplierIA.key)) || !Intrinsics.areEqual(this.onBack, retainingDataSourceSupplierIA.onBack) || !Intrinsics.areEqual(this.clearPreviousLayouts, retainingDataSourceSupplierIA.clearPreviousLayouts)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.navigationRightButton, retainingDataSourceSupplierIA.navigationRightButton)) {
            int i4 = onExtraCallback + 87;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.logParam, retainingDataSourceSupplierIA.logParam) || this.directIssueCard != retainingDataSourceSupplierIA.directIssueCard || !Intrinsics.areEqual(this.color, retainingDataSourceSupplierIA.color)) {
            return false;
        }
        if (this.traffic == retainingDataSourceSupplierIA.traffic) {
            return this.isPayAccountHana == retainingDataSourceSupplierIA.isPayAccountHana;
        }
        int i5 = onNavigationEvent + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode4 = 0;
        int iHashCode5 = rCTCodelessLoggingEventListener == null ? 0 : rCTCodelessLoggingEventListener.hashCode();
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i4 = onNavigationEvent + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int iHashCode6 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.logParam;
        if (map != null) {
            int i6 = onExtraCallback + 7;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                map.hashCode();
                throw null;
            }
            iHashCode4 = map.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + Boolean.hashCode(this.directIssueCard)) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.traffic)) * 31) + Boolean.hashCode(this.isPayAccountHana);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossHanaPlccCompleteLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", directIssueCard=" + this.directIssueCard + ", color=" + this.color + ", traffic=" + this.traffic + ", isPayAccountHana=" + this.isPayAccountHana + ")";
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 3;
            }
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
            int i5 = onNavigationEvent + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeInt(this.directIssueCard ? 1 : 0);
        parcel.writeString(this.color);
        parcel.writeInt(this.traffic ? 1 : 0);
        parcel.writeInt(this.isPayAccountHana ? 1 : 0);
    }

    public RetainingDataSourceSupplierIA(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull String str3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.directIssueCard = z;
        this.color = str3;
        this.traffic = z2;
        this.isPayAccountHana = z3;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i4 = i3 + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return rCTCodelessLoggingEventListener;
        }
        obj.hashCode();
        throw null;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i2 + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public DynamicLoader IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i2 + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallback() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            map = this.logParam;
            int i4 = 77 / 0;
        } else {
            map = this.logParam;
        }
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return map;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.directIssueCard;
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.color;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.traffic;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isPayAccountHana;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
