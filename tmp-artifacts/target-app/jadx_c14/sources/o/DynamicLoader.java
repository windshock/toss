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
public final class DynamicLoader implements Parcelable {
    public static final Parcelable.Creator<DynamicLoader> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final createAdSizeApi action;
    private final List<FBLoginASID> conditionalActions;
    private final String text;
    private final String value;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<DynamicLoader> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final DynamicLoader[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            DynamicLoader[] dynamicLoaderArr = new DynamicLoader[i];
            int i6 = i3 + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return dynamicLoaderArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoader dynamicLoaderOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return dynamicLoaderOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 55;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                obj.hashCode();
                throw null;
            }
            DynamicLoader[] dynamicLoaderArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return dynamicLoaderArrIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final DynamicLoader onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(DynamicLoader.class.getClassLoader());
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = IAuthTabCallback + 103;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(FBLoginASID.CREATOR.createFromParcel(parcel));
                    i5 += 27;
                } else {
                    arrayList.add(FBLoginASID.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new DynamicLoader(string, createadsizeapi, string2, arrayList);
        }
    }

    static {
        int i = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.value);
        List<FBLoginASID> list = this.conditionalActions;
        parcel.writeInt(list.size());
        Iterator<FBLoginASID> it = list.iterator();
        int i5 = IAuthTabCallback + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public DynamicLoader(@NotNull String str, @Nullable createAdSizeApi createadsizeapi, @NotNull String str2, @NotNull List<FBLoginASID> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.text = str;
        this.action = createadsizeapi;
        this.value = str2;
        this.conditionalActions = list;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.text;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final createAdSizeApi onWarmupCompleted() {
        createAdSizeApi createadsizeapi;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            createadsizeapi = this.action;
            int i4 = 41 / 0;
        } else {
            createadsizeapi = this.action;
        }
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return createadsizeapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FBLoginASID> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.conditionalActions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
