package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoteServiceWrapperEventType extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RemoteServiceWrapperEventType> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<RemoteServiceWrapperEventType> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperEventType createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RemoteServiceWrapperEventType remoteServiceWrapperEventTypeOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return remoteServiceWrapperEventTypeOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperEventType[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted(i);
                throw null;
            }
            RemoteServiceWrapperEventType[] remoteServiceWrapperEventTypeArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return remoteServiceWrapperEventTypeArrOnWarmupCompleted;
        }

        public final RemoteServiceWrapperEventType onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                dynamicLoaderCreateFromParcel.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RemoteServiceWrapperEventType.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                int i6 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            return new RemoteServiceWrapperEventType(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel));
        }

        public final RemoteServiceWrapperEventType[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i3 % 128;
            RemoteServiceWrapperEventType[] remoteServiceWrapperEventTypeArr = new RemoteServiceWrapperEventType[i];
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            return remoteServiceWrapperEventTypeArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteServiceWrapperEventType)) {
            int i4 = i3 + 47;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        RemoteServiceWrapperEventType remoteServiceWrapperEventType = (RemoteServiceWrapperEventType) obj;
        if (!Intrinsics.areEqual(this.type, remoteServiceWrapperEventType.type)) {
            return false;
        }
        if (Intrinsics.areEqual(this.key, remoteServiceWrapperEventType.key)) {
            return Intrinsics.areEqual(this.onBack, remoteServiceWrapperEventType.onBack) && Intrinsics.areEqual(this.clearPreviousLayouts, remoteServiceWrapperEventType.clearPreviousLayouts) && Intrinsics.areEqual(this.navigationRightButton, remoteServiceWrapperEventType.navigationRightButton) && Intrinsics.areEqual(this.logParam, remoteServiceWrapperEventType.logParam);
        }
        int i5 = IAuthTabCallback + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.type.hashCode();
        int iHashCode5 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        if (rCTCodelessLoggingEventListener == null) {
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = rCTCodelessLoggingEventListener.hashCode();
        }
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i3 = onNavigationEvent + 11;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 2;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = onNavigationEvent + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = dynamicLoader.hashCode();
        }
        Map<String, Object> map = this.logParam;
        return (((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DccGuideLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ")";
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[PHI: r1
      0x004b: PHI (r1v12 java.lang.Boolean) = (r1v7 java.lang.Boolean), (r1v16 java.lang.Boolean) binds: [B:8:0x003c, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.RemoteServiceWrapperEventType.IAuthTabCallback
            int r1 = r1 + 29
            int r2 = r1 % 128
            o.RemoteServiceWrapperEventType.onNavigationEvent = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            o.RCTCodelessLoggingEventListener r1 = r5.onBack
            r6.writeParcelable(r1, r7)
            java.lang.Boolean r1 = r5.clearPreviousLayouts
            r3 = 7
            int r3 = r3 / r4
            if (r1 != 0) goto L4b
            goto L3e
        L2b:
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            o.RCTCodelessLoggingEventListener r1 = r5.onBack
            r6.writeParcelable(r1, r7)
            java.lang.Boolean r1 = r5.clearPreviousLayouts
            if (r1 != 0) goto L4b
        L3e:
            r6.writeInt(r4)
            int r1 = o.RemoteServiceWrapperEventType.IAuthTabCallback
            int r1 = r1 + 91
            int r3 = r1 % 128
            o.RemoteServiceWrapperEventType.onNavigationEvent = r3
            int r1 = r1 % r0
            goto L55
        L4b:
            r6.writeInt(r2)
            boolean r0 = r1.booleanValue()
            r6.writeInt(r0)
        L55:
            o.DynamicLoader r0 = r5.navigationRightButton
            if (r0 != 0) goto L5d
            r6.writeInt(r4)
            goto L63
        L5d:
            r6.writeInt(r2)
            r0.writeToParcel(r6, r7)
        L63:
            o.Preconditions r0 = o.Preconditions.INSTANCE
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.logParam
            r0.onExtraCallbackWithResult(r1, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RemoteServiceWrapperEventType.writeToParcel(android.os.Parcel, int):void");
    }

    public RemoteServiceWrapperEventType(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i4 = i3 + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i2 + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }
}
