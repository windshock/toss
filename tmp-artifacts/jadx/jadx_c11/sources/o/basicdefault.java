package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class basicdefault {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final boolean IAuthTabCallback;
    private final pathMatch onExtraCallbackWithResult;
    private final boolean onWarmupCompleted;

    public basicdefault() {
        this(null, false, false, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 97 / 0;
            }
            return true;
        }
        if (!(obj instanceof basicdefault)) {
            return false;
        }
        basicdefault basicdefaultVar = (basicdefault) obj;
        if (this.onExtraCallbackWithResult != basicdefaultVar.onExtraCallbackWithResult) {
            return false;
        }
        if (this.IAuthTabCallback == basicdefaultVar.IAuthTabCallback) {
            return this.onWarmupCompleted == basicdefaultVar.onWarmupCompleted;
        }
        int i4 = onExtraCallback + 59;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 45;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = ((this.onExtraCallbackWithResult.hashCode() << 69) - Boolean.hashCode(this.IAuthTabCallback)) % 107;
            z = this.onWarmupCompleted;
        } else {
            iHashCode = ((this.onExtraCallbackWithResult.hashCode() * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31;
            z = this.onWarmupCompleted;
        }
        int iHashCode2 = iHashCode + Boolean.hashCode(z);
        int i3 = onExtraCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FramebufferTextureSpecification(format=" + this.onExtraCallbackWithResult + ", flip=" + this.IAuthTabCallback + ", mipmapFiltering=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    public basicdefault(@NotNull pathMatch pathmatch, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pathmatch, "");
        this.onExtraCallbackWithResult = pathmatch;
        this.IAuthTabCallback = z;
        this.onWarmupCompleted = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ basicdefault(pathMatch pathmatch, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            pathmatch = pathMatch.RGBA8;
        }
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 13;
            onNavigationEvent = i4 % 128;
            z2 = !(i4 % 2 == 0);
            int i5 = 2 % 2;
        }
        this(pathmatch, z, z2);
    }

    public final pathMatch onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        pathMatch pathmatch = this.onExtraCallbackWithResult;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return pathmatch;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
