package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MonotonicClockMonotonicClockWrapper extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<MonotonicClockMonotonicClockWrapper> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Boolean clearPreviousLayouts;
    private final reportDexLoadingIssue cta;
    private final List<String> defaultValues;
    private final String description;
    private final createNativeBannerAdViewApi headerHelpArea;
    private final String headerSubTitle;
    private final String headerTitle;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final Map<String, Object> logParam;
    private final int max;
    private final int min;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final List<DynamicLoaderFactory> options;

    /* renamed from: static, reason: not valid java name */
    private final boolean f0static;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<MonotonicClockMonotonicClockWrapper> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final MonotonicClockMonotonicClockWrapper[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 1;
            IAuthTabCallback = i3 % 128;
            MonotonicClockMonotonicClockWrapper[] monotonicClockMonotonicClockWrapperArr = new MonotonicClockMonotonicClockWrapper[i];
            if (i3 % 2 != 0) {
                return monotonicClockMonotonicClockWrapperArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MonotonicClockMonotonicClockWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                throw null;
            }
            MonotonicClockMonotonicClockWrapper monotonicClockMonotonicClockWrapperOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = IAuthTabCallback + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return monotonicClockMonotonicClockWrapperOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ MonotonicClockMonotonicClockWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback(i);
                throw null;
            }
            MonotonicClockMonotonicClockWrapper[] monotonicClockMonotonicClockWrapperArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = IAuthTabCallback + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return monotonicClockMonotonicClockWrapperArrIAuthTabCallback;
        }

        public final MonotonicClockMonotonicClockWrapper onNavigationEvent(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            DynamicLoader dynamicLoaderCreateFromParcel;
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(MonotonicClockMonotonicClockWrapper.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 67;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i3 = IAuthTabCallback + 103;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    int i5 = onWarmupCompleted + 103;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
                int i7 = onWarmupCompleted + 19;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList.add(DynamicLoaderFactory.CREATOR.createFromParcel(parcel));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            reportDexLoadingIssue reportdexloadingissueCreateFromParcel = reportDexLoadingIssue.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
                int i13 = onWarmupCompleted + 45;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            }
            return new MonotonicClockMonotonicClockWrapper(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, arrayList, arrayListCreateStringArrayList, i11, i12, reportdexloadingissueCreateFromParcel, string5, createnativebanneradviewapiCreateFromParcel, parcel.readInt() != 0 ? createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }
    }

    static {
        int i = onExtraCallback + 35;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i + i2 + i6 + ((-112346298) * i3) + (505796074 * i4);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i) - 1525940224) + (1734765094 * i2) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i6) + (859308032 * i3) + (310902784 * i4) + (417529856 * i13);
        int i15 = (i * (-1233303660)) + 1670658458 + (i2 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i6 * (-1233302909)) + (i3 * 1075253458) + (i4 * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
            int i5 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
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
        }
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.logParam, parcel, i);
        parcel.writeString(this.headerTitle);
        parcel.writeString(this.headerSubTitle);
        List<DynamicLoaderFactory> list = this.options;
        parcel.writeInt(list.size());
        Iterator<DynamicLoaderFactory> it = list.iterator();
        while (it.hasNext()) {
            int i7 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                int i8 = 55 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.defaultValues);
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        this.cta.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i9 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        createNativeBannerAdViewApi createnativebanneradviewapi2 = this.headerHelpArea;
        if (createnativebanneradviewapi2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f0static ? 1 : 0);
        int i11 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
    }

    public MonotonicClockMonotonicClockWrapper(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull List<DynamicLoaderFactory> list, @Nullable List<String> list2, int i, int i2, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable String str5, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.headerTitle = str3;
        this.headerSubTitle = str4;
        this.options = list;
        this.defaultValues = list2;
        this.min = i;
        this.max = i2;
        this.cta = reportdexloadingissue;
        this.description = str5;
        this.helpArea = createnativebanneradviewapi;
        this.headerHelpArea = createnativebanneradviewapi2;
        this.f0static = z;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public String readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onBack;
        }
        throw null;
    }

    public Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.clearPreviousLayouts;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return bool;
    }

    public DynamicLoader IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return dynamicLoader;
    }

    public Map<String, Object> onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.headerTitle;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.headerSubTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DynamicLoaderFactory> access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.options;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<String> list = this.defaultValues;
        int i4 = i3 + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.min;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MonotonicClockMonotonicClockWrapper monotonicClockMonotonicClockWrapper = (MonotonicClockMonotonicClockWrapper) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = monotonicClockMonotonicClockWrapper.max;
        int i6 = i2 + 123;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        reportDexLoadingIssue reportdexloadingissue = this.cta;
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return reportdexloadingissue;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createNativeBannerAdViewApi IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int i5 = i2 + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return createnativebanneradviewapi;
    }

    public final createNativeBannerAdViewApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        createNativeBannerAdViewApi createnativebanneradviewapi = this.headerHelpArea;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return createnativebanneradviewapi;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MonotonicClockMonotonicClockWrapper monotonicClockMonotonicClockWrapper = (MonotonicClockMonotonicClockWrapper) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = monotonicClockMonotonicClockWrapper.f0static;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = i3 + 65;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i7 = 47 / 0;
        return Boolean.valueOf(z);
    }

    public final int access000() {
        return ((Integer) onExtraCallbackWithResult(new Object[]{this}, -998637220, 998637220, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).intValue();
    }

    public final boolean extraCallbackWithResult() {
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this}, -888924746, 888924747, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue();
    }
}
