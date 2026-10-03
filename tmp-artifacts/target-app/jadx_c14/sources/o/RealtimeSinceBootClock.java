package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RealtimeSinceBootClock extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RealtimeSinceBootClock> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final List<makeFallbackLoader> contents;
    private final reportDexLoadingIssue cta;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subtitle;
    private final String title;
    private final onNewResult titleButton;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<RealtimeSinceBootClock> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RealtimeSinceBootClock createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RealtimeSinceBootClock realtimeSinceBootClockOnExtraCallback = onExtraCallback(parcel);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            return realtimeSinceBootClockOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RealtimeSinceBootClock[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            RealtimeSinceBootClock[] realtimeSinceBootClockArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 43;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return realtimeSinceBootClockArrOnNavigationEvent;
        }

        public final RealtimeSinceBootClock onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            onNewResult onnewresultCreateFromParcel;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RealtimeSinceBootClock.class.getClassLoader());
            int i4 = 0;
            reportDexLoadingIssue reportdexloadingissueCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i5 = onWarmupCompleted + 55;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                int i7 = IAuthTabCallback + 9;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 12 / 0;
                }
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i9 = IAuthTabCallback + 61;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                onnewresultCreateFromParcel = null;
            } else {
                onnewresultCreateFromParcel = onNewResult.CREATOR.createFromParcel(parcel);
            }
            onNewResult onnewresult = onnewresultCreateFromParcel;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i11 = onWarmupCompleted + 19;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
                    int i12 = 66 / 0;
                } else {
                    reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
                }
            }
            reportDexLoadingIssue reportdexloadingissue = reportdexloadingissueCreateFromParcel;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (i4 != i13) {
                int i14 = onWarmupCompleted + 121;
                int i15 = i13;
                IAuthTabCallback = i14 % 128;
                int i16 = i14 % 2;
                arrayList.add(parcel.readParcelable(RealtimeSinceBootClock.class.getClassLoader()));
                i4 = i16 != 0 ? i4 + 102 : i4 + 1;
                i13 = i15;
            }
            return new RealtimeSinceBootClock(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, onnewresult, string4, reportdexloadingissue, arrayList);
        }

        public final RealtimeSinceBootClock[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            RealtimeSinceBootClock[] realtimeSinceBootClockArr = new RealtimeSinceBootClock[i];
            int i6 = i3 + 115;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return realtimeSinceBootClockArr;
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
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
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i3 = onNavigationEvent + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        onNewResult onnewresult = this.titleButton;
        if (onnewresult == null) {
            int i5 = onNavigationEvent + 109;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            onnewresult.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        if (reportdexloadingissue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reportdexloadingissue.writeToParcel(parcel, i);
        }
        List<makeFallbackLoader> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<makeFallbackLoader> it = list.iterator();
        while (it.hasNext()) {
            int i6 = IAuthTabCallback + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealtimeSinceBootClock(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @Nullable onNewResult onnewresult, @Nullable String str4, @Nullable reportDexLoadingIssue reportdexloadingissue, @NotNull List<? extends makeFallbackLoader> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.titleButton = onnewresult;
        this.subtitle = str4;
        this.cta = reportdexloadingissue;
        this.contents = list;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DynamicLoader IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i3 + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return map;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final onNewResult onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onNewResult onnewresult = this.titleButton;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return onnewresult;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.subtitle;
            int i4 = 85 / 0;
        } else {
            str = this.subtitle;
        }
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return reportdexloadingissue;
    }

    public final List<makeFallbackLoader> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<makeFallbackLoader> list = this.contents;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
