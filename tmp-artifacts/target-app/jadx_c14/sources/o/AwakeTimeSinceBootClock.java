package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AwakeTimeSinceBootClock extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<AwakeTimeSinceBootClock> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final String ctaTextRemainingScroll;
    private final String description;
    private final List<getProcessNameViaReflection> files;
    private final String fullFileUrl;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final boolean requiresScrollToBottom;
    private final String title;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<AwakeTimeSinceBootClock> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AwakeTimeSinceBootClock createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(parcel);
                throw null;
            }
            AwakeTimeSinceBootClock awakeTimeSinceBootClockOnWarmupCompleted = onWarmupCompleted(parcel);
            int i3 = onExtraCallback + 51;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
            return awakeTimeSinceBootClockOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AwakeTimeSinceBootClock[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            AwakeTimeSinceBootClock[] awakeTimeSinceBootClockArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallback + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return awakeTimeSinceBootClockArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AwakeTimeSinceBootClock[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            onExtraCallback = i3 % 128;
            AwakeTimeSinceBootClock[] awakeTimeSinceBootClockArr = new AwakeTimeSinceBootClock[i];
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return awakeTimeSinceBootClockArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[PHI: r2 r3 r7
          0x005e: PHI (r2v16 java.lang.String) = (r2v4 java.lang.String), (r2v17 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005e: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x005e: PHI (r7v12 o.RCTCodelessLoggingEventListener) = (r7v3 o.RCTCodelessLoggingEventListener), (r7v16 o.RCTCodelessLoggingEventListener) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[PHI: r2 r3 r7
          0x0050: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v17 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0050: PHI (r7v4 o.RCTCodelessLoggingEventListener) = (r7v3 o.RCTCodelessLoggingEventListener), (r7v16 o.RCTCodelessLoggingEventListener) binds: [B:8:0x004e, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.AwakeTimeSinceBootClock onWarmupCompleted(android.os.Parcel r24) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AwakeTimeSinceBootClock.onExtraCallbackWithResult.onWarmupCompleted(android.os.Parcel):o.AwakeTimeSinceBootClock");
        }
    }

    static {
        int i = IAuthTabCallback + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
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
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i3 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i5 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        List<getProcessNameViaReflection> list = this.files;
        parcel.writeInt(list.size());
        Iterator<getProcessNameViaReflection> it = list.iterator();
        while (it.hasNext()) {
            int i7 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                int i8 = 8 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.fullFileUrl);
        this.cta.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.requiresScrollToBottom ? 1 : 0);
        parcel.writeString(this.ctaTextRemainingScroll);
    }

    public AwakeTimeSinceBootClock(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull List<getProcessNameViaReflection> list, @NotNull String str4, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable String str5, boolean z, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.files = list;
        this.fullFileUrl = str4;
        this.cta = reportdexloadingissue;
        this.description = str5;
        this.requiresScrollToBottom = z;
        this.ctaTextRemainingScroll = str6;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        throw null;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i2 + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public DynamicLoader onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i2 + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<getProcessNameViaReflection> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<getProcessNameViaReflection> list = this.files;
        int i4 = i3 + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fullFileUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final reportDexLoadingIssue onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i5 = i2 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return reportdexloadingissue;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.requiresScrollToBottom;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.ctaTextRemainingScroll;
            int i4 = 3 / 0;
        } else {
            str = this.ctaTextRemainingScroll;
        }
        int i5 = i2 + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
