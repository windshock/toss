package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.standardtermsv2.param.StandardTermsV2LocalizedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getOriginalFullResponse implements Parcelable {
    public static final Parcelable.Creator<getOriginalFullResponse> CREATOR = new onNavigationEvent();
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;
    public static final int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent;
    private final StandardTermsV2LocalizedString IAuthTabCallback;
    private final StandardTermsV2LocalizedString onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<getOriginalFullResponse> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getOriginalFullResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getOriginalFullResponse getoriginalfullresponseOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getoriginalfullresponseOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getOriginalFullResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 49;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            getOriginalFullResponse[] getoriginalfullresponseArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 11;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return getoriginalfullresponseArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getOriginalFullResponse onExtraCallback(Parcel parcel) {
            StandardTermsV2LocalizedString standardTermsV2LocalizedStringCreateFromParcel;
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            StandardTermsV2LocalizedString standardTermsV2LocalizedStringCreateFromParcel2 = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 7;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                standardTermsV2LocalizedStringCreateFromParcel = null;
            } else {
                standardTermsV2LocalizedStringCreateFromParcel = StandardTermsV2LocalizedString.CREATOR.createFromParcel(parcel);
            }
            StandardTermsV2LocalizedString standardTermsV2LocalizedString = standardTermsV2LocalizedStringCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i6 = onNavigationEvent + 119;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                standardTermsV2LocalizedStringCreateFromParcel2 = StandardTermsV2LocalizedString.CREATOR.createFromParcel(parcel);
            }
            getOriginalFullResponse getoriginalfullresponse = new getOriginalFullResponse(standardTermsV2LocalizedString, standardTermsV2LocalizedStringCreateFromParcel2);
            int i8 = onExtraCallback + 69;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return getoriginalfullresponse;
        }

        public final getOriginalFullResponse[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            getOriginalFullResponse[] getoriginalfullresponseArr = new getOriginalFullResponse[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return getoriginalfullresponseArr;
        }
    }

    static {
        int i = onNavigationEvent + 23;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getOriginalFullResponse() {
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = null;
        this(standardTermsV2LocalizedString, standardTermsV2LocalizedString, 3, standardTermsV2LocalizedString);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOriginalFullResponse)) {
            int i2 = asBinder + 43;
            asInterface = i2 % 128;
            return i2 % 2 == 0;
        }
        getOriginalFullResponse getoriginalfullresponse = (getOriginalFullResponse) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, getoriginalfullresponse.IAuthTabCallback)) {
            int i3 = asBinder + 109;
            asInterface = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, getoriginalfullresponse.onWarmupCompleted)) {
            return true;
        }
        int i4 = asBinder + 17;
        int i5 = i4 % 128;
        asInterface = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 125;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = this.IAuthTabCallback;
        int iHashCode = 0;
        int iHashCode2 = standardTermsV2LocalizedString == null ? 0 : standardTermsV2LocalizedString.hashCode();
        StandardTermsV2LocalizedString standardTermsV2LocalizedString2 = this.onWarmupCompleted;
        if (standardTermsV2LocalizedString2 != null) {
            iHashCode = standardTermsV2LocalizedString2.hashCode();
            int i4 = asBinder + 33;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = asBinder + 19;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2ButtonTitleOverride(approveButtonTitle=" + this.IAuthTabCallback + ", rejectButtonTitle=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = this.IAuthTabCallback;
        if (standardTermsV2LocalizedString == null) {
            int i4 = asBinder + 35;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            standardTermsV2LocalizedString.writeToParcel(parcel, i);
        }
        StandardTermsV2LocalizedString standardTermsV2LocalizedString2 = this.onWarmupCompleted;
        if (standardTermsV2LocalizedString2 != null) {
            parcel.writeInt(1);
            standardTermsV2LocalizedString2.writeToParcel(parcel, i);
        } else {
            int i5 = asInterface + 49;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        }
    }

    public getOriginalFullResponse(@Nullable StandardTermsV2LocalizedString standardTermsV2LocalizedString, @Nullable StandardTermsV2LocalizedString standardTermsV2LocalizedString2) {
        this.IAuthTabCallback = standardTermsV2LocalizedString;
        this.onWarmupCompleted = standardTermsV2LocalizedString2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getOriginalFullResponse(StandardTermsV2LocalizedString standardTermsV2LocalizedString, StandardTermsV2LocalizedString standardTermsV2LocalizedString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asBinder + 109;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            standardTermsV2LocalizedString = null;
        }
        if ((i & 2) != 0) {
            int i3 = asInterface + 95;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 75;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            standardTermsV2LocalizedString2 = null;
        }
        this(standardTermsV2LocalizedString, standardTermsV2LocalizedString2);
    }

    public final StandardTermsV2LocalizedString onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = this.IAuthTabCallback;
        int i5 = i2 + 33;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return standardTermsV2LocalizedString;
    }

    public final StandardTermsV2LocalizedString onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 23;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        StandardTermsV2LocalizedString standardTermsV2LocalizedString = this.onWarmupCompleted;
        int i5 = i2 + 59;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return standardTermsV2LocalizedString;
        }
        throw null;
    }
}
