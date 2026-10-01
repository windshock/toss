package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFace {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String onExtraCallback;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 79;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public setFace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
    }

    public final boolean onNavigationEvent(@NotNull String str, double d) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (0.0d > d || d > 100.0d) {
            throw new IllegalArgumentException(("Percentage must be between 0 and 100 (input : " + d + ")").toString());
        }
        if (d == 100.0d) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
            return true;
        }
        if (d == 0.0d) {
            return false;
        }
        if (IAuthTabCallback(onExtraCallbackWithResult(this.onExtraCallback + "_" + str)) >= d / 100.0d) {
            return false;
        }
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final byte[] onExtraCallbackWithResult(String str) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNull(bArrDigest);
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return bArrDigest;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            throw new RuntimeException("Hash generation failed", e);
        }
    }

    public final double IAuthTabCallback(@NotNull byte[] bArr) {
        List listTake;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            listTake = ArraysKt.take(bArr, 2);
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            listTake = ArraysKt.take(bArr, 4);
        }
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            i3 = UInt.constructor-impl(UInt.constructor-impl(i3 << 8) + UInt.constructor-impl(UInt.constructor-impl(((Number) it.next()).byteValue()) & 255));
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return access6100.onNavigationEvent(i3) / 4.294967295E9d;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
