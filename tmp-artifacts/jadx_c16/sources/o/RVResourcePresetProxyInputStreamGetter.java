package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVResourcePresetProxyInputStreamGetter implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RVResourcePresetProxyInputStreamGetter[] $VALUES;
    public static final Parcelable.Creator<RVResourcePresetProxyInputStreamGetter> CREATOR;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final RVResourcePresetProxyInputStreamGetter ONGOING = new RVResourcePresetProxyInputStreamGetter("ONGOING", 0);
    public static final RVResourcePresetProxyInputStreamGetter COMPLETED = new RVResourcePresetProxyInputStreamGetter("COMPLETED", 1);

    private static final /* synthetic */ RVResourcePresetProxyInputStreamGetter[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RVResourcePresetProxyInputStreamGetter[] rVResourcePresetProxyInputStreamGetterArr = {ONGOING, COMPLETED};
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return rVResourcePresetProxyInputStreamGetterArr;
    }

    public static EnumEntries<RVResourcePresetProxyInputStreamGetter> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static RVResourcePresetProxyInputStreamGetter valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RVResourcePresetProxyInputStreamGetter rVResourcePresetProxyInputStreamGetter = (RVResourcePresetProxyInputStreamGetter) Enum.valueOf(RVResourcePresetProxyInputStreamGetter.class, str);
        if (i3 != 0) {
            return rVResourcePresetProxyInputStreamGetter;
        }
        throw null;
    }

    public static RVResourcePresetProxyInputStreamGetter[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RVResourcePresetProxyInputStreamGetter[] rVResourcePresetProxyInputStreamGetterArr = (RVResourcePresetProxyInputStreamGetter[]) $VALUES.clone();
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return rVResourcePresetProxyInputStreamGetterArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
        int i5 = onExtraCallback + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RVResourcePresetProxyInputStreamGetter(String str, int i) {
    }

    static {
        RVResourcePresetProxyInputStreamGetter[] rVResourcePresetProxyInputStreamGetterArr$values = $values();
        $VALUES = rVResourcePresetProxyInputStreamGetterArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(rVResourcePresetProxyInputStreamGetterArr$values);
        CREATOR = new onNavigationEvent();
        int i = IAuthTabCallback + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
