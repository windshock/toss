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
public final class setRemoteRenderingProcess extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<setRemoteRenderingProcess> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final List<DexLoadErrorReporter> failureMessages;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String titleImageUrl;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<setRemoteRenderingProcess> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final setRemoteRenderingProcess[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            setRemoteRenderingProcess[] setremoterenderingprocessArr = new setRemoteRenderingProcess[i];
            int i6 = i4 + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return setremoterenderingprocessArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setRemoteRenderingProcess createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setRemoteRenderingProcess setremoterenderingprocessOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setremoterenderingprocessOnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setRemoteRenderingProcess[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            setRemoteRenderingProcess[] setremoterenderingprocessArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return setremoterenderingprocessArrIAuthTabCallback;
        }

        public final setRemoteRenderingProcess onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(setRemoteRenderingProcess.class.getClassLoader());
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = IAuthTabCallback + 45;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    int i6 = IAuthTabCallback + 35;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 % 5;
                    }
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() == 0 ? null : DynamicLoader.CREATOR.createFromParcel(parcel);
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            reportDexLoadingIssue reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i8 = parcel.readInt();
                arrayList = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList.add(DexLoadErrorReporter.CREATOR.createFromParcel(parcel));
                }
            }
            return new setRemoteRenderingProcess(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, string3, string4, reportdexloadingissueCreateFromParcel, string5, arrayList);
        }
    }

    static {
        int i = onExtraCallback + 59;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
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
            int i3 = IAuthTabCallback + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        this.cta.writeToParcel(parcel, i);
        parcel.writeString(this.titleImageUrl);
        List<DexLoadErrorReporter> list = this.failureMessages;
        if (list == null) {
            parcel.writeInt(0);
            int i4 = IAuthTabCallback + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DexLoadErrorReporter> it = list.iterator();
        while (!(!it.hasNext())) {
            int i6 = onNavigationEvent + 83;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
    }

    public setRemoteRenderingProcess(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull reportDexLoadingIssue reportdexloadingissue, @NotNull String str5, @Nullable List<DexLoadErrorReporter> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str3;
        this.subTitle = str4;
        this.cta = reportdexloadingissue;
        this.titleImageUrl = str5;
        this.failureMessages = list;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.type;
        int i4 = i2 + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onBack;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onExtraCallback() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            bool = this.clearPreviousLayouts;
            int i4 = 78 / 0;
        } else {
            bool = this.clearPreviousLayouts;
        }
        int i5 = i2 + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<String, Object> map = this.logParam;
        int i4 = i3 + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.subTitle;
        int i4 = i2 + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return reportdexloadingissue;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.titleImageUrl;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final List<DexLoadErrorReporter> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<DexLoadErrorReporter> list = this.failureMessages;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
