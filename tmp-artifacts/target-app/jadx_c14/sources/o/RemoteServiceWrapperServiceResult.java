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
public final class RemoteServiceWrapperServiceResult extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RemoteServiceWrapperServiceResult> CREATOR = new onWarmupCompleted();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<doCallInitialize> cardDescriptionList;
    private final Boolean clearPreviousLayouts;
    private final DynamicLoader cta;
    private final List<doCallInitialize> faqList;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<RemoteServiceWrapperServiceResult> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final RemoteServiceWrapperServiceResult[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 81;
            onExtraCallback = i4 % 128;
            RemoteServiceWrapperServiceResult[] remoteServiceWrapperServiceResultArr = new RemoteServiceWrapperServiceResult[i];
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            int i6 = i3 + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return remoteServiceWrapperServiceResultArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperServiceResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            RemoteServiceWrapperServiceResult remoteServiceWrapperServiceResultOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onNavigationEvent + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return remoteServiceWrapperServiceResultOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperServiceResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 121;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RemoteServiceWrapperServiceResult[] remoteServiceWrapperServiceResultArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 == 0) {
                int i5 = 90 / 0;
            }
            return remoteServiceWrapperServiceResultArrIAuthTabCallback;
        }

        public final RemoteServiceWrapperServiceResult onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RemoteServiceWrapperServiceResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 103;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 74 / 0;
                }
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = onNavigationEvent + 3;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() != 0 ? DynamicLoader.CREATOR.createFromParcel(parcel) : null;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(parcel.readParcelable(RemoteServiceWrapperServiceResult.class.getClassLoader()));
            }
            int i8 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList2.add(parcel.readParcelable(RemoteServiceWrapperServiceResult.class.getClassLoader()));
            }
            return new RemoteServiceWrapperServiceResult(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, arrayList, arrayList2, DynamicLoader.CREATOR.createFromParcel(parcel));
        }
    }

    static {
        int i = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteServiceWrapperServiceResult)) {
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RemoteServiceWrapperServiceResult remoteServiceWrapperServiceResult = (RemoteServiceWrapperServiceResult) obj;
        if (!Intrinsics.areEqual(this.type, remoteServiceWrapperServiceResult.type)) {
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, remoteServiceWrapperServiceResult.key) || !Intrinsics.areEqual(this.onBack, remoteServiceWrapperServiceResult.onBack) || !Intrinsics.areEqual(this.clearPreviousLayouts, remoteServiceWrapperServiceResult.clearPreviousLayouts) || !Intrinsics.areEqual(this.navigationRightButton, remoteServiceWrapperServiceResult.navigationRightButton) || !Intrinsics.areEqual(this.logParam, remoteServiceWrapperServiceResult.logParam)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.faqList, remoteServiceWrapperServiceResult.faqList)) {
            int i6 = onExtraCallback + 53;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.cardDescriptionList, remoteServiceWrapperServiceResult.cardDescriptionList)) {
            int i7 = onNavigationEvent + 51;
            onExtraCallback = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.cta, remoteServiceWrapperServiceResult.cta)) {
            return true;
        }
        int i8 = onExtraCallback + 3;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.key.hashCode();
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int iHashCode5 = rCTCodelessLoggingEventListener == null ? 0 : rCTCodelessLoggingEventListener.hashCode();
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i2 = onExtraCallback + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = dynamicLoader.hashCode();
        }
        Map<String, Object> map = this.logParam;
        return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.faqList.hashCode()) * 31) + this.cardDescriptionList.hashCode()) * 31) + this.cta.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqLayoutDto(type=" + this.type + ", key=" + this.key + ", onBack=" + this.onBack + ", clearPreviousLayouts=" + this.clearPreviousLayouts + ", navigationRightButton=" + this.navigationRightButton + ", logParam=" + this.logParam + ", faqList=" + this.faqList + ", cardDescriptionList=" + this.cardDescriptionList + ", cta=" + this.cta + ")";
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
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
            int i3 = onExtraCallback + 35;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 4;
            }
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (dynamicLoader == null) {
            int i6 = onNavigationEvent + 121;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
            int i7 = onExtraCallback + 67;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 2;
            }
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        List<doCallInitialize> list = this.faqList;
        parcel.writeInt(list.size());
        Iterator<doCallInitialize> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<doCallInitialize> list2 = this.cardDescriptionList;
        parcel.writeInt(list2.size());
        Iterator<doCallInitialize> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        this.cta.writeToParcel(parcel, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteServiceWrapperServiceResult(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull List<? extends doCallInitialize> list, @NotNull List<? extends doCallInitialize> list2, @NotNull DynamicLoader dynamicLoader2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.type = str;
        this.key = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.faqList = list;
        this.cardDescriptionList = list2;
        this.cta = dynamicLoader2;
    }

    public String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.clearPreviousLayouts;
        int i4 = i2 + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return bool;
    }

    public DynamicLoader asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.logParam;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return map;
    }

    public final List<doCallInitialize> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List<doCallInitialize> list = this.faqList;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return list;
    }

    public final List<doCallInitialize> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<doCallInitialize> list = this.cardDescriptionList;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cta;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
