package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asBoolean extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<asBoolean> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final Boolean disableAccountChange;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final createRewardedVideoAd paymentAccount;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<asBoolean> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final asBoolean[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 81;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            asBoolean[] asbooleanArr = new asBoolean[i];
            int i6 = i4 + 81;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return asbooleanArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ asBoolean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asBoolean asbooleanOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
            return asbooleanOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ asBoolean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            asBoolean[] asbooleanArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 != 0) {
                int i5 = 20 / 0;
            }
            return asbooleanArrIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.asBoolean onNavigationEvent(android.os.Parcel r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.asBoolean.IAuthTabCallback.onNavigationEvent
                int r1 = r1 + 109
                int r2 = r1 % 128
                o.asBoolean.IAuthTabCallback.IAuthTabCallback = r2
                int r1 = r1 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
                java.lang.String r3 = r12.readString()
                java.lang.String r4 = r12.readString()
                java.lang.Class<o.asBoolean> r1 = o.asBoolean.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r12.readParcelable(r1)
                r5 = r1
                o.RCTCodelessLoggingEventListener r5 = (o.RCTCodelessLoggingEventListener) r5
                int r1 = r12.readInt()
                r2 = 1
                r6 = 0
                r7 = 0
                if (r1 != 0) goto L3f
                int r1 = o.asBoolean.IAuthTabCallback.IAuthTabCallback
                int r1 = r1 + 95
                int r8 = r1 % 128
                o.asBoolean.IAuthTabCallback.onNavigationEvent = r8
                int r1 = r1 % r0
                if (r1 == 0) goto L3d
                r0 = 24
                int r0 = r0 / r7
            L3d:
                r0 = r6
                goto L58
            L3f:
                int r1 = r12.readInt()
                if (r1 == 0) goto L53
                int r1 = o.asBoolean.IAuthTabCallback.onNavigationEvent
                int r1 = r1 + 29
                int r8 = r1 % 128
                o.asBoolean.IAuthTabCallback.IAuthTabCallback = r8
                int r1 = r1 % r0
                if (r1 != 0) goto L51
                goto L53
            L51:
                r0 = r2
                goto L54
            L53:
                r0 = r7
            L54:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L58:
                int r1 = r12.readInt()
                if (r1 != 0) goto L60
                r1 = r6
                goto L66
            L60:
                android.os.Parcelable$Creator<o.DynamicLoader> r1 = o.DynamicLoader.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r12)
            L66:
                o.DynamicLoader r1 = (o.DynamicLoader) r1
                o.Preconditions r8 = o.Preconditions.INSTANCE
                java.util.Map r8 = r8.onNavigationEvent(r12)
                android.os.Parcelable$Creator<o.createRewardedVideoAd> r9 = o.createRewardedVideoAd.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r12)
                o.createRewardedVideoAd r9 = (o.createRewardedVideoAd) r9
                int r10 = r12.readInt()
                if (r10 != 0) goto L7e
                r10 = r6
                goto L8b
            L7e:
                int r12 = r12.readInt()
                if (r12 == 0) goto L85
                goto L86
            L85:
                r2 = r7
            L86:
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
                r10 = r12
            L8b:
                o.asBoolean r12 = new o.asBoolean
                r2 = r12
                r6 = r0
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.asBoolean.IAuthTabCallback.onNavigationEvent(android.os.Parcel):o.asBoolean");
        }
    }

    static {
        int i = onNavigationEvent + 81;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
            int i3 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        this.paymentAccount.writeToParcel(parcel, i);
        Boolean bool2 = this.disableAccountChange;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            return;
        }
        int i6 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(0);
        }
    }

    public asBoolean(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createRewardedVideoAd createrewardedvideoad, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.paymentAccount = createrewardedvideoad;
        this.disableAccountChange = bool2;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.navigationRightButton;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i2 + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final createRewardedVideoAd onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paymentAccount;
        }
        throw null;
    }

    public final Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Boolean bool = this.disableAccountChange;
        int i5 = i3 + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }
}
