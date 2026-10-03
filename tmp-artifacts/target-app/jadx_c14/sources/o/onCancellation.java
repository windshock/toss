package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onCancellation extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<onCancellation> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Boolean clearPreviousLayouts;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String standardTermsCode;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<onCancellation> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final onCancellation[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 117;
            onExtraCallback = i3 % 128;
            onCancellation[] oncancellationArr = new onCancellation[i];
            if (i3 % 2 == 0) {
                return oncancellationArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onCancellation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ onCancellation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onCancellation[] oncancellationArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallback + 125;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return oncancellationArrIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.onCancellation onWarmupCompleted(android.os.Parcel r11) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
                java.lang.String r3 = r11.readString()
                java.lang.String r4 = r11.readString()
                java.lang.Class<o.onCancellation> r1 = o.onCancellation.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r11.readParcelable(r1)
                r5 = r1
                o.RCTCodelessLoggingEventListener r5 = (o.RCTCodelessLoggingEventListener) r5
                int r1 = r11.readInt()
                r2 = 0
                r6 = 0
                if (r1 != 0) goto L27
                r1 = r2
                goto L40
            L27:
                int r1 = r11.readInt()
                if (r1 == 0) goto L3b
                int r1 = o.onCancellation.onWarmupCompleted.onExtraCallback
                int r1 = r1 + 59
                int r7 = r1 % 128
                o.onCancellation.onWarmupCompleted.onExtraCallbackWithResult = r7
                int r1 = r1 % r0
                if (r1 != 0) goto L39
                goto L3b
            L39:
                r1 = 1
                goto L3c
            L3b:
                r1 = r6
            L3c:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L40:
                int r7 = r11.readInt()
                if (r7 == 0) goto L6a
                int r2 = o.onCancellation.onWarmupCompleted.onExtraCallback
                int r2 = r2 + 123
                int r7 = r2 % 128
                o.onCancellation.onWarmupCompleted.onExtraCallbackWithResult = r7
                int r2 = r2 % r0
                if (r2 != 0) goto L5b
                android.os.Parcelable$Creator<o.DynamicLoader> r2 = o.DynamicLoader.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r11)
                r7 = 39
                int r7 = r7 / r6
                goto L61
            L5b:
                android.os.Parcelable$Creator<o.DynamicLoader> r2 = o.DynamicLoader.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r11)
            L61:
                int r6 = o.onCancellation.onWarmupCompleted.onExtraCallback
                int r6 = r6 + 77
                int r7 = r6 % 128
                o.onCancellation.onWarmupCompleted.onExtraCallbackWithResult = r7
                int r6 = r6 % r0
            L6a:
                o.onCancellation r0 = new o.onCancellation
                r7 = r2
                o.DynamicLoader r7 = (o.DynamicLoader) r7
                o.Preconditions r2 = o.Preconditions.INSTANCE
                java.util.Map r8 = r2.onNavigationEvent(r11)
                java.lang.String r9 = r11.readString()
                r2 = r0
                r6 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onCancellation.onWarmupCompleted.onWarmupCompleted(android.os.Parcel):o.onCancellation");
        }
    }

    static {
        int i = onNavigationEvent + 37;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
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
            int i5 = onExtraCallbackWithResult + 117;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            }
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i7 = onExtraCallbackWithResult + 3;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.standardTermsCode);
        int i9 = onExtraCallback + 21;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public onCancellation(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.standardTermsCode = str3;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i2 + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return bool;
    }

    public DynamicLoader onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i2 + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.logParam;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return map;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.standardTermsCode;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }
}
