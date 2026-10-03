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
public final class asBooleanObject extends RCTCodelessLoggingEventListener {
    public static final Parcelable.Creator<asBooleanObject> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Boolean clearPreviousLayouts;
    private final DynamicLoader cta;
    private final String key;
    private final Map<String, Object> logParam;
    private final DynamicLoader navigationRightButton;
    private final RCTCodelessLoggingEventListener onBack;
    private final List<Benchmark> steps;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<asBooleanObject> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ asBooleanObject createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asBooleanObject asbooleanobjectOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 98 / 0;
            }
            int i5 = onWarmupCompleted + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return asbooleanobjectOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ asBooleanObject[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            asBooleanObject[] asbooleanobjectArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return asbooleanobjectArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final asBooleanObject onNavigationEvent(Parcel parcel) {
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = (RCTCodelessLoggingEventListener) parcel.readParcelable(asBooleanObject.class.getClassLoader());
            int i2 = 0;
            DynamicLoader dynamicLoaderCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i3 = onExtraCallback + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i5 = onExtraCallback + 91;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    DynamicLoader.CREATOR.createFromParcel(parcel);
                    throw null;
                }
                dynamicLoaderCreateFromParcel = DynamicLoader.CREATOR.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            DynamicLoader dynamicLoaderCreateFromParcel2 = DynamicLoader.CREATOR.createFromParcel(parcel);
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            while (i2 != i6) {
                int i7 = onWarmupCompleted + 27;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    arrayList.add(Benchmark.CREATOR.createFromParcel(parcel));
                    i2 += 63;
                } else {
                    arrayList.add(Benchmark.CREATOR.createFromParcel(parcel));
                    i2++;
                }
                int i8 = onWarmupCompleted + 55;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            return new asBooleanObject(string, string2, rCTCodelessLoggingEventListener, boolValueOf, dynamicLoader, mapOnNavigationEvent, dynamicLoaderCreateFromParcel2, arrayList);
        }

        public final asBooleanObject[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            asBooleanObject[] asbooleanobjectArr = new asBooleanObject[i];
            if (i3 % 2 != 0) {
                int i4 = 46 / 0;
            }
            return asbooleanobjectArr;
        }
    }

    static {
        int i = onNavigationEvent + 109;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.onBack, i);
        Boolean bool = this.clearPreviousLayouts;
        if (bool == null) {
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
        this.cta.writeToParcel(parcel, i);
        List<Benchmark> list = this.steps;
        parcel.writeInt(list.size());
        Iterator<Benchmark> it = list.iterator();
        while (!(!it.hasNext())) {
            int i5 = IAuthTabCallback + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
    }

    public asBooleanObject(@NotNull String str, @NotNull String str2, @Nullable RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull DynamicLoader dynamicLoader2, @NotNull List<Benchmark> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.type = str2;
        this.onBack = rCTCodelessLoggingEventListener;
        this.clearPreviousLayouts = bool;
        this.navigationRightButton = dynamicLoader;
        this.logParam = map;
        this.cta = dynamicLoader2;
        this.steps = list;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public RCTCodelessLoggingEventListener IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = this.onBack;
        int i4 = i2 + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return rCTCodelessLoggingEventListener;
    }

    public Boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.clearPreviousLayouts;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return bool;
    }

    public DynamicLoader onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DynamicLoader dynamicLoader = this.navigationRightButton;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return dynamicLoader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicLoader onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.cta;
        int i5 = i2 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public final List<Benchmark> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.steps;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
