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
public final class isRemoteRenderingProcess extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<isRemoteRenderingProcess> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final List<createNativeAdRatingApi> fields;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<isRemoteRenderingProcess> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isRemoteRenderingProcess createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            isRemoteRenderingProcess isremoterenderingprocessOnExtraCallback = onExtraCallback(parcel);
            int i4 = IAuthTabCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return isremoterenderingprocessOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isRemoteRenderingProcess[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            isRemoteRenderingProcess[] isremoterenderingprocessArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return isremoterenderingprocessArrOnExtraCallback;
        }

        public final isRemoteRenderingProcess onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(isRemoteRenderingProcess.class.getClassLoader());
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i4 = onNavigationEvent + 63;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    DynamicLoader.CREATOR.createFromParcel(parcel);
                    dynamicLoaderCreateFromParcel.hashCode();
                    throw null;
                }
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            int i6 = IAuthTabCallback + 69;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 != i5; i8++) {
                arrayList.add(parcel.readParcelable(isRemoteRenderingProcess.class.getClassLoader()));
            }
            return new isRemoteRenderingProcess(string, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string2, string3, arrayList, reportDexLoadingIssue.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final isRemoteRenderingProcess[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 5;
            onNavigationEvent = i3 % 128;
            isRemoteRenderingProcess[] isremoterenderingprocessArr = new isRemoteRenderingProcess[i];
            if (i3 % 2 != 0) {
                return isremoterenderingprocessArr;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
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
            int i5 = onExtraCallbackWithResult + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
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
        List<createNativeAdRatingApi> list = this.fields;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            int i6 = onExtraCallback + 101;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                parcel.writeParcelable(it.next(), i);
                int i7 = 18 / 0;
            } else {
                parcel.writeParcelable(it.next(), i);
            }
        }
        this.cta.writeToParcel(parcel, i);
        parcel.writeString(this.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isRemoteRenderingProcess(@NotNull String str, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str2, @Nullable String str3, @NotNull List<? extends createNativeAdRatingApi> list, @NotNull reportDexLoadingIssue reportdexloadingissue, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.key = str;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.title = str2;
        this.subTitle = str3;
        this.fields = list;
        this.cta = reportdexloadingissue;
        this.type = str4;
    }

    public String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            str = this.key;
            int i4 = 40 / 0;
        } else {
            str = this.key;
        }
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RCTCodelessLoggingEventListener asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i3 + 63;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i3 + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.subTitle;
        int i5 = i3 + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<createNativeAdRatingApi> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }
}
