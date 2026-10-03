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
public final class unwrap extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<unwrap> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final List<getProcessNameAPI28> options;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<unwrap> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ unwrap createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            unwrap unwrapVarOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            return unwrapVarOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ unwrap[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            unwrap[] unwrapVarArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return unwrapVarArrOnNavigationEvent;
        }

        public final unwrap[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 93;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            unwrap[] unwrapVarArr = new unwrap[i];
            if (i3 % 2 == 0) {
                int i5 = 35 / 0;
            }
            int i6 = i4 + 23;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 43 / 0;
            }
            return unwrapVarArr;
        }

        public final unwrap onWarmupCompleted(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(unwrap.class.getClassLoader());
            int i4 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            reportDexLoadingIssue reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            while (i4 != i5) {
                int i6 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(getProcessNameAPI28.CREATOR.createFromParcel(parcel));
                    i4 += 39;
                } else {
                    arrayList.add(getProcessNameAPI28.CREATOR.createFromParcel(parcel));
                    i4++;
                }
            }
            return new unwrap(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, string3, string4, reportdexloadingissueCreateFromParcel, arrayList);
        }
    }

    static {
        int i = onExtraCallback + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
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
            int i3 = onWarmupCompleted + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.cta.writeToParcel(parcel, i);
        List<getProcessNameAPI28> list = this.options;
        parcel.writeInt(list.size());
        Iterator<getProcessNameAPI28> it = list.iterator();
        int i5 = IAuthTabCallback + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            int i7 = onWarmupCompleted + 27;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
    }

    public unwrap(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull reportDexLoadingIssue reportdexloadingissue, @NotNull List<getProcessNameAPI28> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.cta = reportdexloadingissue;
        this.options = list;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i2 + 43;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        throw null;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.clearPreviousLayouts;
        }
        throw null;
    }

    public DynamicLoader IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 91;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.title;
            int i4 = 48 / 0;
        } else {
            str = this.title;
        }
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.subTitle;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<getProcessNameAPI28> onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<getProcessNameAPI28> list = this.options;
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
