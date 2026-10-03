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
public final class maybeInitInternally implements doCallInitialize {
    public static final Parcelable.Creator<maybeInitInternally> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String backgroundColor;
    private final List<makeLoaderUnsafe> contents;
    private final doMakeLoader title;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<maybeInitInternally> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ maybeInitInternally createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            maybeInitInternally maybeinitinternallyOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return maybeinitinternallyOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ maybeInitInternally[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            maybeInitInternally[] maybeinitinternallyArrOnExtraCallback = onExtraCallback(i);
            int i5 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return maybeinitinternallyArrOnExtraCallback;
        }

        public final maybeInitInternally[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            maybeInitInternally[] maybeinitinternallyArr = new maybeInitInternally[i];
            if (i3 % 2 == 0) {
                return maybeinitinternallyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final maybeInitInternally onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            doMakeLoader domakeloaderCreateFromParcel = doMakeLoader.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(parcel.readParcelable(maybeInitInternally.class.getClassLoader()));
            }
            maybeInitInternally maybeinitinternally = new maybeInitInternally(string, domakeloaderCreateFromParcel, arrayList, parcel.readString());
            int i6 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return maybeinitinternally;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeInitInternally)) {
            int i4 = i3 + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        maybeInitInternally maybeinitinternally = (maybeInitInternally) obj;
        if (!Intrinsics.areEqual(this.type, maybeinitinternally.type)) {
            int i6 = IAuthTabCallback + 109;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, maybeinitinternally.title) || !Intrinsics.areEqual(this.contents, maybeinitinternally.contents)) {
            return false;
        }
        if (Intrinsics.areEqual(this.backgroundColor, maybeinitinternally.backgroundColor)) {
            return true;
        }
        int i8 = IAuthTabCallback + 75;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.contents.hashCode()) * 31) + this.backgroundColor.hashCode();
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqBoxContent(type=" + this.type + ", title=" + this.title + ", contents=" + this.contents + ", backgroundColor=" + this.backgroundColor + ")";
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        this.title.writeToParcel(parcel, i);
        List<makeLoaderUnsafe> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<makeLoaderUnsafe> it = list.iterator();
        while (it.hasNext()) {
            int i3 = onNavigationEvent + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.backgroundColor);
        int i5 = onNavigationEvent + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public maybeInitInternally(@NotNull String str, @NotNull doMakeLoader domakeloader, @NotNull List<? extends makeLoaderUnsafe> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(domakeloader, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.title = domakeloader;
        this.contents = list;
        this.backgroundColor = str2;
    }

    public final List<makeLoaderUnsafe> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<makeLoaderUnsafe> list = this.contents;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.backgroundColor;
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
