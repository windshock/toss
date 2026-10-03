package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefCountCloseableReference extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<RefCountCloseableReference> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final onNavigationEvent bottomButton;
    private final Boolean clearPreviousLayouts;
    private final setCTABackgroundColor ecc;
    private final NativeAdsManagerApi encrypt;
    private final String headerSubTitle;
    private final String headerTitle;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final boolean serverVerificationRequired;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<RefCountCloseableReference> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final RefCountCloseableReference IAuthTabCallback(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            setCTABackgroundColor setctabackgroundcolorCreateFromParcel;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(RefCountCloseableReference.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            DynamicLoader dynamicLoaderCreateFromParcel = parcel.readInt() == 0 ? null : DynamicLoader.CREATOR.createFromParcel(parcel);
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                setctabackgroundcolorCreateFromParcel = null;
            } else {
                setctabackgroundcolorCreateFromParcel = setCTABackgroundColor.CREATOR.createFromParcel(parcel);
                int i8 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            setCTABackgroundColor setctabackgroundcolor = setctabackgroundcolorCreateFromParcel;
            NativeAdsManagerApi nativeAdsManagerApiCreateFromParcel = parcel.readInt() == 0 ? null : NativeAdsManagerApi.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i10 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            return new RefCountCloseableReference(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoaderCreateFromParcel, mapOnNavigationEvent, string3, setctabackgroundcolor, nativeAdsManagerApiCreateFromParcel, z2, parcel.readString(), parcel.readInt() != 0 ? onNavigationEvent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefCountCloseableReference createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RefCountCloseableReference refCountCloseableReferenceIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            return refCountCloseableReferenceIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefCountCloseableReference[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            RefCountCloseableReference[] refCountCloseableReferenceArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return refCountCloseableReferenceArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RefCountCloseableReference[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i3 % 128;
            RefCountCloseableReference[] refCountCloseableReferenceArr = new RefCountCloseableReference[i];
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return refCountCloseableReferenceArr;
        }
    }

    static {
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
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
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(0);
            }
            int i4 = onWarmupCompleted + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
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
        setCTABackgroundColor setctabackgroundcolor = this.ecc;
        if (setctabackgroundcolor == null) {
            int i6 = onWarmupCompleted + 109;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            setctabackgroundcolor.writeToParcel(parcel, i);
        }
        NativeAdsManagerApi nativeAdsManagerApi = this.encrypt;
        if (nativeAdsManagerApi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nativeAdsManagerApi.writeToParcel(parcel, i);
            int i8 = IAuthTabCallback + 111;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 2;
            }
        }
        parcel.writeInt(this.serverVerificationRequired ? 1 : 0);
        parcel.writeString(this.headerSubTitle);
        onNavigationEvent onnavigationevent = this.bottomButton;
        if (onnavigationevent != null) {
            parcel.writeInt(1);
            onnavigationevent.writeToParcel(parcel, i);
            return;
        }
        int i10 = onWarmupCompleted + 47;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public RefCountCloseableReference(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable setCTABackgroundColor setctabackgroundcolor, @Nullable NativeAdsManagerApi nativeAdsManagerApi, boolean z, @Nullable String str4, @Nullable onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.headerTitle = str3;
        this.ecc = setctabackgroundcolor;
        this.encrypt = nativeAdsManagerApi;
        this.serverVerificationRequired = z;
        this.headerSubTitle = str4;
        this.bottomButton = onnavigationevent;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i5 = i3 + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return rCTCodelessLoggingEventListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public DynamicLoader IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i4 = i2 + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return dynamicLoader;
    }

    public Map<String, Object> asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.logParam;
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.headerTitle;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final setCTABackgroundColor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        setCTABackgroundColor setctabackgroundcolor = this.ecc;
        int i4 = i2 + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return setctabackgroundcolor;
        }
        obj.hashCode();
        throw null;
    }

    public final NativeAdsManagerApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.encrypt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.serverVerificationRequired;
        int i4 = i3 + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.headerSubTitle;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onNavigationEvent IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent onnavigationevent = this.bottomButton;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    public static final class onNavigationEvent implements Parcelable {
        public static final Parcelable.Creator<onNavigationEvent> CREATOR = new onExtraCallbackWithResult();
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final createAdSizeApi action;
        private final String title;

        public static final class onExtraCallbackWithResult implements Parcelable.Creator<onNavigationEvent> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final onNavigationEvent[] IAuthTabCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                int i5 = i3 % 2;
                onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[i];
                int i6 = i4 + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return onnavigationeventArr;
                }
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    onExtraCallback(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(parcel);
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return onnavigationeventOnExtraCallback;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onNavigationEvent[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 5;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent[] onnavigationeventArrIAuthTabCallback = IAuthTabCallback(i);
                int i5 = onNavigationEvent + 51;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventArrIAuthTabCallback;
            }

            public final onNavigationEvent onExtraCallback(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onNavigationEvent onnavigationevent = new onNavigationEvent(parcel.readString(), (createAdSizeApi) parcel.readParcelable(onNavigationEvent.class.getClassLoader()));
                int i2 = onExtraCallback + 81;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return onnavigationevent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onNavigationEvent + 45;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = IAuthTabCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.title, onnavigationevent.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.action, onnavigationevent.action)) {
                return true;
            }
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.title;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = IAuthTabCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            createAdSizeApi createadsizeapi = this.action;
            if (createadsizeapi != null) {
                int i4 = IAuthTabCallback + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 54 / 0;
                    iHashCode2 = createadsizeapi.hashCode();
                } else {
                    iHashCode2 = createadsizeapi.hashCode();
                }
            }
            int i6 = (iHashCode * 31) + iHashCode2;
            int i7 = onWarmupCompleted + 69;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomButton(title=" + this.title + ", action=" + this.action + ")";
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.title);
            parcel.writeParcelable(this.action, i);
            int i5 = IAuthTabCallback + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }

        public onNavigationEvent(@Nullable String str, @Nullable createAdSizeApi createadsizeapi) {
            this.title = str;
            this.action = createadsizeapi;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(String str, createAdSizeApi createadsizeapi, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = IAuthTabCallback + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 3;
                } else {
                    int i6 = 2 % 2;
                }
                createadsizeapi = null;
            }
            this(str, createadsizeapi);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return str;
        }

        public final createAdSizeApi onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            createAdSizeApi createadsizeapi = this.action;
            int i4 = i3 + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return createadsizeapi;
            }
            throw null;
        }
    }
}
