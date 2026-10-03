package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoteServiceWrapper extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RemoteServiceWrapper> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String cardName;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final List<String> items;
    private final String key;
    private final Map<String, Object> logParam;
    private final String logoUrl;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<RemoteServiceWrapper> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final RemoteServiceWrapper[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 81;
            onNavigationEvent = i3 % 128;
            RemoteServiceWrapper[] remoteServiceWrapperArr = new RemoteServiceWrapper[i];
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
            }
            return remoteServiceWrapperArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            RemoteServiceWrapper remoteServiceWrapperOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return remoteServiceWrapperOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            RemoteServiceWrapper[] remoteServiceWrapperArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return remoteServiceWrapperArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RemoteServiceWrapper onExtraCallback(Parcel parcel) {
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RemoteServiceWrapper.class.getClassLoader());
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i4 = onWarmupCompleted + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i6 = onWarmupCompleted + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            } else {
                dynamicLoaderCreateFromParcel = null;
            }
            RemoteServiceWrapper remoteServiceWrapper = new RemoteServiceWrapper(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), reportDexLoadingIssue.CREATOR.createFromParcel(parcel));
            int i8 = onNavigationEvent + 75;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                return remoteServiceWrapper;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 109;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onNavigationEvent + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i7 = IAuthTabCallback + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.cardName);
        parcel.writeStringList(this.items);
        this.cta.writeToParcel(parcel, i);
    }

    public RemoteServiceWrapper(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull List<String> list, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.logoUrl = str3;
        this.title = str4;
        this.subTitle = str5;
        this.cardName = str6;
        this.items = list;
        this.cta = reportdexloadingissue;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public DynamicLoader onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            str = this.logoUrl;
            int i4 = 42 / 0;
        } else {
            str = this.logoUrl;
        }
        int i5 = i3 + 109;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.subTitle;
            int i4 = 61 / 0;
        } else {
            str = this.subTitle;
        }
        int i5 = i2 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cardName;
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> onExtraCallback() {
        List<String> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.items;
            int i4 = 30 / 0;
        } else {
            list = this.items;
        }
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        reportDexLoadingIssue reportdexloadingissue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            reportdexloadingissue = this.cta;
            int i4 = 87 / 0;
        } else {
            reportdexloadingissue = this.cta;
        }
        int i5 = i3 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return reportdexloadingissue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
