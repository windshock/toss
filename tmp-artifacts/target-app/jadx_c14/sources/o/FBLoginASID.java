package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class FBLoginASID implements Parcelable {
    public static final Parcelable.Creator<FBLoginASID> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAdSizeApi action;
    private final Map<String, String> condition;

    public static final class IAuthTabCallback implements Parcelable.Creator<FBLoginASID> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FBLoginASID createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            FBLoginASID fBLoginASIDOnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            return fBLoginASIDOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FBLoginASID[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            FBLoginASID[] fBLoginASIDArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
            return fBLoginASIDArrOnNavigationEvent;
        }

        public final FBLoginASID onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onNavigationEvent + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i3 += 54;
                } else {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i3++;
                }
            }
            FBLoginASID fBLoginASID = new FBLoginASID(linkedHashMap, (createAdSizeApi) parcel.readParcelable(FBLoginASID.class.getClassLoader()));
            int i5 = onNavigationEvent + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fBLoginASID;
        }

        public final FBLoginASID[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            FBLoginASID[] fBLoginASIDArr = new FBLoginASID[i];
            int i6 = i3 + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 9 / 0;
            }
            return fBLoginASIDArr;
        }
    }

    static {
        int i = onExtraCallback + 93;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FBLoginASID() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FBLoginASID)) {
            return false;
        }
        FBLoginASID fBLoginASID = (FBLoginASID) obj;
        if (!Intrinsics.areEqual(this.condition, fBLoginASID.condition)) {
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.action, fBLoginASID.action)) {
            return true;
        }
        int i3 = onNavigationEvent + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.condition.hashCode();
        createAdSizeApi createadsizeapi = this.action;
        if (createadsizeapi == null) {
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = createadsizeapi.hashCode();
            int i5 = onNavigationEvent + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConditionalAction(condition=" + this.condition + ", action=" + this.action + ")";
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            Map<String, String> map = this.condition;
            parcel.writeInt(map.size());
            map.entrySet().iterator();
            obj.hashCode();
            throw null;
        }
        Map<String, String> map2 = this.condition;
        parcel.writeInt(map2.size());
        Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                Map.Entry<String, String> next = it.next();
                parcel.writeString(next.getKey());
                parcel.writeString(next.getValue());
                obj.hashCode();
                throw null;
            }
            Map.Entry<String, String> next2 = it.next();
            parcel.writeString(next2.getKey());
            parcel.writeString(next2.getValue());
        }
        parcel.writeParcelable(this.action, i);
    }

    public FBLoginASID(@NotNull Map<String, String> map, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(map, "");
        this.condition = map;
        this.action = createadsizeapi;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FBLoginASID(Map map, createAdSizeApi createadsizeapi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                map = access8100.onNavigationEvent();
                int i3 = 26 / 0;
            } else {
                map = access8100.onNavigationEvent();
            }
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            createadsizeapi = null;
        }
        this(map, createadsizeapi);
    }

    public final Map<String, String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.condition;
        }
        throw null;
    }

    public final createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.action;
        }
        throw null;
    }
}
