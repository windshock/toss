package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerShakeListener extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int asInterface = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final boolean asBinder;
    private final String onExtraCallback;
    private final List<String> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Integer onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerShakeListener)) {
            return false;
        }
        registerShakeListener registershakelistener = (registerShakeListener) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, registershakelistener.IAuthTabCallbackStub) || (!Intrinsics.areEqual(this.IAuthTabCallback, registershakelistener.IAuthTabCallback)) || !Intrinsics.areEqual(this.onExtraCallback, registershakelistener.onExtraCallback)) {
            return false;
        }
        if (this.asBinder != registershakelistener.asBinder) {
            int i2 = onTransact + 67;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.IAuthTabCallbackDefault != registershakelistener.IAuthTabCallbackDefault) {
            int i4 = onTransact + 103;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, registershakelistener.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, registershakelistener.onWarmupCompleted)) {
            int i6 = asInterface + 1;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, registershakelistener.onExtraCallbackWithResult)) {
            return true;
        }
        int i8 = asInterface + 115;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.IAuthTabCallbackStub.hashCode();
        int iHashCode4 = this.IAuthTabCallback.hashCode();
        String str = this.onExtraCallback;
        int iHashCode5 = 0;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Boolean.hashCode(this.asBinder);
        int iHashCode8 = Integer.hashCode(this.IAuthTabCallbackDefault);
        String str2 = this.onNavigationEvent;
        if (str2 == null) {
            int i2 = asInterface + 99;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Integer num = this.onWarmupCompleted;
        if (num == null) {
            int i4 = asInterface + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        List<String> list = this.onExtraCallbackWithResult;
        if (list != null) {
            int i6 = asInterface + 119;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            iHashCode5 = list.hashCode();
        }
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SectionTitleItem(title=" + this.IAuthTabCallbackStub + ", subtitle=" + this.IAuthTabCallback + ", right=" + this.onExtraCallback + ", titleLower=" + this.asBinder + ", topMarginDp=" + this.IAuthTabCallbackDefault + ", sectionType=" + this.onNavigationEvent + ", order=" + this.onWarmupCompleted + ", idList=" + this.onExtraCallbackWithResult + ")";
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public registerShakeListener(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z, int i, @Nullable String str4, @Nullable Integer num, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallback = str3;
        this.asBinder = z;
        this.IAuthTabCallbackDefault = i;
        this.onNavigationEvent = str4;
        this.onWarmupCompleted = num;
        this.onExtraCallbackWithResult = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ registerShakeListener(String str, String str2, String str3, boolean z, int i, String str4, Integer num, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        int i3;
        String str6;
        if ((i2 & 2) != 0) {
            int i4 = asInterface + 109;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        List list2 = null;
        String str7 = (i2 & 4) != 0 ? null : str3;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            int i7 = asInterface + 29;
            onTransact = i7 % 128;
            i3 = i7 % 2 != 0 ? 26 : 12;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            int i8 = onTransact + 61;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 43 / 0;
            }
            int i10 = 2 % 2;
            str6 = null;
        } else {
            str6 = str4;
        }
        Integer num2 = (i2 & 64) != 0 ? null : num;
        if ((i2 & 128) != 0) {
            int i11 = asInterface + 99;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        } else {
            list2 = list;
        }
        this(str, str5, str7, z2, i3, str6, num2, list2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 33;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackStub;
        int i5 = i2 + 43;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 27;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 31;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asBinder;
        int i5 = i2 + 37;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallbackDefault;
        int i6 = i2 + 87;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
