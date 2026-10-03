package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeComponentTagApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeComponentTagApi> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String description;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final boolean optional;
    private final List<createInMemoryClassLoader> termsList;
    private final String title;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<createNativeComponentTagApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeComponentTagApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallback(parcel);
                obj.hashCode();
                throw null;
            }
            createNativeComponentTagApi createnativecomponenttagapiOnExtraCallback = onExtraCallback(parcel);
            int i3 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return createnativecomponenttagapiOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeComponentTagApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeComponentTagApi[] createnativecomponenttagapiArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return createnativecomponenttagapiArrOnExtraCallback;
            }
            throw null;
        }

        public final createNativeComponentTagApi onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel = parcel.readInt() == 0 ? null : createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            int i2 = 0;
            boolean z = parcel.readInt() != 0;
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createNativeComponentTagApi.class.getClassLoader());
            boolean z2 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            while (i2 != i3) {
                int i4 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(createInMemoryClassLoader.CREATOR.createFromParcel(parcel));
                i2++;
                int i6 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 3;
                }
            }
            return new createNativeComponentTagApi(string, string2, string3, createnativebanneradviewapiCreateFromParcel, string4, z, createadsizeapi, z2, arrayList);
        }

        public final createNativeComponentTagApi[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            createNativeComponentTagApi[] createnativecomponenttagapiArr = new createNativeComponentTagApi[i];
            int i6 = i4 + 59;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return createnativecomponenttagapiArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 105;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createNativeComponentTagApi)) {
            return false;
        }
        createNativeComponentTagApi createnativecomponenttagapi = (createNativeComponentTagApi) obj;
        if (!Intrinsics.areEqual(this.type, createnativecomponenttagapi.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.key, createnativecomponenttagapi.key)) {
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, createnativecomponenttagapi.title) || !Intrinsics.areEqual(this.helpArea, createnativecomponenttagapi.helpArea) || !Intrinsics.areEqual(this.description, createnativecomponenttagapi.description)) {
            return false;
        }
        if (this.disabled != createnativecomponenttagapi.disabled) {
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.disabledAction, createnativecomponenttagapi.disabledAction)) {
            return false;
        }
        if (this.optional == createnativecomponenttagapi.optional) {
            return Intrinsics.areEqual(this.termsList, createnativecomponenttagapi.termsList);
        }
        int i6 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.key.hashCode();
        int iHashCode5 = this.title.hashCode();
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i4 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createnativebanneradviewapi.hashCode();
        }
        String str = this.description;
        if (str == null) {
            int i6 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        int iHashCode6 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi = this.disabledAction;
        int iHashCode7 = (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + (createadsizeapi != null ? createadsizeapi.hashCode() : 0)) * 31) + Boolean.hashCode(this.optional)) * 31) + this.termsList.hashCode();
        int i8 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsField(type=" + this.type + ", key=" + this.key + ", title=" + this.title + ", helpArea=" + this.helpArea + ", description=" + this.description + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", optional=" + this.optional + ", termsList=" + this.termsList + ")";
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        parcel.writeInt(this.optional ? 1 : 0);
        List<createInMemoryClassLoader> list = this.termsList;
        parcel.writeInt(list.size());
        Iterator<createInMemoryClassLoader> it = list.iterator();
        while (it.hasNext()) {
            int i3 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                it.next().writeToParcel(parcel, i);
                int i4 = 45 / 0;
            } else {
                it.next().writeToParcel(parcel, i);
            }
            int i5 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public createNativeComponentTagApi(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable String str4, boolean z, @Nullable createAdSizeApi createadsizeapi, boolean z2, @NotNull List<createInMemoryClassLoader> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.title = str3;
        this.helpArea = createnativebanneradviewapi;
        this.description = str4;
        this.disabled = z;
        this.disabledAction = createadsizeapi;
        this.optional = z2;
        this.termsList = list;
    }

    public String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.key;
            int i4 = 70 / 0;
        } else {
            str = this.key;
        }
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final createNativeBannerAdViewApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.helpArea;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.disabled;
        }
        throw null;
    }

    public final createAdSizeApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return createadsizeapi;
        }
        throw null;
    }

    public final List<createInMemoryClassLoader> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<createInMemoryClassLoader> list = this.termsList;
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
