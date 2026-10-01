package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.RawRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinEventService implements getAdditionalConsentStatus {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final Bitmap IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final long asInterface;
    private final Integer onExtraCallback;
    private final Drawable onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final long onWarmupCompleted;

    public /* synthetic */ AppLovinEventService(String str, @RawRes Integer num, String str2, Drawable drawable, Bitmap bitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, str2, drawable, bitmap, j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLovinEventService)) {
            return false;
        }
        AppLovinEventService appLovinEventService = (AppLovinEventService) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, appLovinEventService.onNavigationEvent)) {
            int i2 = asBinder + 99;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.onExtraCallback, appLovinEventService.onExtraCallback)) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, appLovinEventService.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, appLovinEventService.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackDefault + 103;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, appLovinEventService.IAuthTabCallback) || !setByteOrder.onExtraCallbackWithResult(this.asInterface, appLovinEventService.asInterface)) {
            return false;
        }
        if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(this.onWarmupCompleted, appLovinEventService.onWarmupCompleted)) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 11;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        if (str == null) {
            int i5 = i2 + 53;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.onExtraCallback;
        if (num == null) {
            int i7 = asBinder + 97;
            IAuthTabCallbackDefault = i7 % 128;
            iHashCode2 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str2 = this.IAuthTabCallbackStub;
        if (str2 == null) {
            int i8 = IAuthTabCallbackDefault + 55;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 4;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        Drawable drawable = this.onExtraCallbackWithResult;
        int iHashCode4 = drawable == null ? 0 : drawable.hashCode();
        Bitmap bitmap = this.IAuthTabCallback;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + setByteOrder.onTransact(this.asInterface)) * 31) + AvoidCaptureProcessProgressAvailabilityCheckQuirk.onTransact(this.onWarmupCompleted);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InlineIcon(contentDescription=" + this.onNavigationEvent + ", res=" + this.onExtraCallback + ", url=" + this.IAuthTabCallbackStub + ", drawable=" + this.onExtraCallbackWithResult + ", bitmap=" + this.IAuthTabCallback + ", tintColor=" + setByteOrder.IAuthTabCallbackDefault(this.asInterface) + ", size=" + AvoidCaptureProcessProgressAvailabilityCheckQuirk.asInterface(this.onWarmupCompleted) + ")";
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private AppLovinEventService(String str, Integer num, String str2, Drawable drawable, Bitmap bitmap, long j, long j2) {
        this.onNavigationEvent = str;
        this.onExtraCallback = num;
        this.IAuthTabCallbackStub = str2;
        this.onExtraCallbackWithResult = drawable;
        this.IAuthTabCallback = bitmap;
        this.asInterface = j;
        this.onWarmupCompleted = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppLovinEventService(String str, Integer num, String str2, Drawable drawable, Bitmap bitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        Drawable drawable2;
        long jOnTransact;
        long jOnNavigationEvent;
        String str3 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        String str4 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i3 = asBinder + 9;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                bitmap.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        bitmap = (i & 16) == 0 ? bitmap : null;
        if ((i & 32) != 0) {
            int i5 = asBinder + 33;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i6 = 12 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
        } else {
            jOnTransact = j;
        }
        if ((i & 64) != 0) {
            int i7 = asBinder + 41;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i8 = 99 / 0;
            } else {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            }
            int i9 = asBinder + 9;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        } else {
            jOnNavigationEvent = j2;
        }
        this(str3, num2, str4, drawable2, bitmap, jOnTransact, jOnNavigationEvent, null);
    }

    @Override // o.getAdditionalConsentStatus
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i3 + 39;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.IAuthTabCallbackStub;
        int i4 = i3 + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Drawable onNavigationEvent() {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 105;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            drawable = this.onExtraCallbackWithResult;
            int i4 = 6 / 0;
        } else {
            drawable = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    public final Bitmap onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmap = this.IAuthTabCallback;
        int i5 = i2 + 43;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return bitmap;
        }
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = this.asInterface;
        int i5 = i2 + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        int i3 = 60 / 0;
        return this.onWarmupCompleted;
    }
}
