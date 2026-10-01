package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ArgumentsWhenMappings implements fromJavaArgs, Parcelable {
    public static final Parcelable.Creator<ArgumentsWhenMappings> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String id;
    private final fromJavaArgs nextAction;
    private final String title;
    private final makeNativeArray type;

    public static final class onNavigationEvent implements Parcelable.Creator<ArgumentsWhenMappings> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ArgumentsWhenMappings createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ArgumentsWhenMappings[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ArgumentsWhenMappings[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            ArgumentsWhenMappings[] argumentsWhenMappingsArr = new ArgumentsWhenMappings[i];
            if (i3 % 2 != 0) {
                return argumentsWhenMappingsArr;
            }
            throw null;
        }

        public final ArgumentsWhenMappings onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            ArgumentsWhenMappings argumentsWhenMappings = new ArgumentsWhenMappings(makeNativeArray.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (fromJavaArgs) parcel.readParcelable(ArgumentsWhenMappings.class.getClassLoader()));
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return argumentsWhenMappings;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    public ArgumentsWhenMappings() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArgumentsWhenMappings)) {
            int i5 = i2 + 29;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }
        ArgumentsWhenMappings argumentsWhenMappings = (ArgumentsWhenMappings) obj;
        if (this.type != argumentsWhenMappings.type) {
            int i6 = i4 + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.id, argumentsWhenMappings.id)) {
            int i8 = onWarmupCompleted + 45;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, argumentsWhenMappings.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.nextAction, argumentsWhenMappings.nextAction)) {
            return true;
        }
        int i10 = onExtraCallback + 73;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.nextAction.hashCode();
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowWriteAction(type=" + this.type + ", id=" + this.id + ", title=" + this.title + ", nextAction=" + this.nextAction + ")";
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.type.name());
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.nextAction, i);
        int i5 = onExtraCallback + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public ArgumentsWhenMappings(@NotNull makeNativeArray makenativearray, @NotNull String str, @NotNull String str2, @NotNull fromJavaArgs fromjavaargs) {
        Intrinsics.checkNotNullParameter(makenativearray, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(fromjavaargs, BuildConfig.FLAVOR);
        this.type = makenativearray;
        this.id = str;
        this.title = str2;
        this.nextAction = fromjavaargs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ArgumentsWhenMappings(makeNativeArray makenativearray, String str, String str2, fromJavaArgs fromjavaargs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                makenativearray = makeNativeArray.SHOW_WRITE;
                int i3 = 62 / 0;
            } else {
                makenativearray = makeNativeArray.SHOW_WRITE;
            }
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        this(makenativearray, str, (i & 4) != 0 ? BuildConfig.FLAVOR : str2, (i & 8) != 0 ? new fromList(null, null, null, 7, null) : fromjavaargs);
    }
}
