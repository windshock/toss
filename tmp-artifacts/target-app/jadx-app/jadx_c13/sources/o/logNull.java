package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logNull {
    private static int asInterface = 1;
    private static int onTransact;
    private final List<String> IAuthTabCallback;
    private final boolean onExtraCallback;
    private final Set<String> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Regex onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 87;
            int i6 = i5 % 128;
            asInterface = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 75;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(obj instanceof logNull)) {
            return false;
        }
        logNull lognull = (logNull) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, lognull.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, lognull.IAuthTabCallback)) {
            int i10 = asInterface + 49;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, lognull.onExtraCallbackWithResult)) {
            int i12 = asInterface + 51;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.onNavigationEvent == lognull.onNavigationEvent) {
            return this.onExtraCallback == lognull.onExtraCallback;
        }
        int i14 = asInterface + 61;
        int i15 = i14 % 128;
        onTransact = i15;
        boolean z = i14 % 2 != 0;
        int i16 = i15 + 93;
        asInterface = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 9 / 0;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CompiledPattern(regex=" + this.onWarmupCompleted + ", captureNames=" + this.IAuthTabCallback + ", multiSegmentCaptureNames=" + this.onExtraCallbackWithResult + ", literalSegmentCount=" + this.onNavigationEvent + ", hasMultiSegmentWildcard=" + this.onExtraCallback + ")";
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public logNull(@NotNull Regex regex, @NotNull List<String> list, @NotNull Set<String> set, int i, boolean z) {
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = regex;
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = set;
        this.onNavigationEvent = i;
        this.onExtraCallback = z;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 49;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final trimMetadataStringsTobugsnag_android_core_release onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(str);
        if (matchResultOnNavigationEvent == null) {
            int i2 = onTransact + 43;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        for (Object obj : this.IAuthTabCallback) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            MatchGroup matchGroupOnExtraCallbackWithResult = matchResultOnNavigationEvent.IAuthTabCallback().onExtraCallbackWithResult(i5);
            if (matchGroupOnExtraCallbackWithResult != null) {
                int i6 = asInterface + 5;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                linkedHashMap.put(str2, matchGroupOnExtraCallbackWithResult.onNavigationEvent());
            } else if (this.onExtraCallbackWithResult.contains(str2)) {
                linkedHashMap.put(str2, _UrlKt.FRAGMENT_ENCODE_SET);
            }
            i4 = i5;
        }
        return new trimMetadataStringsTobugsnag_android_core_release(linkedHashMap);
    }
}
