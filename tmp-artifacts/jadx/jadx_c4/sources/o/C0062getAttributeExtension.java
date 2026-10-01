package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.getAttributeExtension, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0062getAttributeExtension {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("mutedUntil")
    private final long onExtraCallbackWithResult;

    @SerializedName("groupId")
    private final String onWarmupCompleted;

    public static /* synthetic */ C0062getAttributeExtension onWarmupCompleted(C0062getAttributeExtension c0062getAttributeExtension, String str, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallback + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                String str2 = c0062getAttributeExtension.onWarmupCompleted;
                throw null;
            }
            str = c0062getAttributeExtension.onWarmupCompleted;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            j = c0062getAttributeExtension.onExtraCallbackWithResult;
        }
        return c0062getAttributeExtension.onExtraCallback(str, j);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof C0062getAttributeExtension)) {
            int i3 = onNavigationEvent + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        C0062getAttributeExtension c0062getAttributeExtension = (C0062getAttributeExtension) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, c0062getAttributeExtension.onWarmupCompleted)) {
            int i5 = onNavigationEvent + 121;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (this.onExtraCallbackWithResult == c0062getAttributeExtension.onExtraCallbackWithResult) {
            return true;
        }
        int i6 = onNavigationEvent + 43;
        onExtraCallback = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.onWarmupCompleted.hashCode() >>> 11) << Long.hashCode(this.onExtraCallbackWithResult) : (this.onWarmupCompleted.hashCode() * 31) + Long.hashCode(this.onExtraCallbackWithResult);
        int i3 = onNavigationEvent + 63;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final C0062getAttributeExtension onExtraCallback(@NotNull String str, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        C0062getAttributeExtension c0062getAttributeExtension = new C0062getAttributeExtension(str, j);
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return c0062getAttributeExtension;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TriggerGroupPlayInfo(groupId=" + this.onWarmupCompleted + ", mutedUntil=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public C0062getAttributeExtension(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0062getAttributeExtension(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            j = 0;
        }
        this(str, j);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i2 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final boolean onExtraCallback(@NotNull Date date) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(date, "");
            return ALCFaceSDKExternalSyntheticLambda2.IAuthTabCallback(this.onExtraCallbackWithResult, date);
        }
        Intrinsics.checkNotNullParameter(date, "");
        int i3 = 45 / 0;
        return ALCFaceSDKExternalSyntheticLambda2.IAuthTabCallback(this.onExtraCallbackWithResult, date);
    }

    public final C0062getAttributeExtension onNavigationEvent(@NotNull Date date, int i, @NotNull TimeUnit timeUnit) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (i > 0) {
            return onWarmupCompleted(this, null, ALCFaceSDKExternalSyntheticLambda2.onWarmupCompleted(date, i, timeUnit), 1, null);
        }
        int i5 = onExtraCallback + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }
}
