package viva.republica.toss.network.model.user;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.user.PasswordMatchLogRes$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordMatchLogRes {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_CODE_BLOCKED = "TC2102";
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int failCount;
    private final String timestamp;

    static {
        int i = onExtraCallbackWithResult + 117;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof PasswordMatchLogRes)) {
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.failCount != ((PasswordMatchLogRes) obj).failCount) {
            int i5 = IAuthTabCallback + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.timestamp, r6.timestamp))) {
            return true;
        }
        int i7 = onWarmupCompleted + 113;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.failCount) * 31) + this.timestamp.hashCode();
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PasswordMatchLogRes(failCount=" + this.failCount + ", timestamp=" + this.timestamp + ")";
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ PasswordMatchLogRes(int i, int i2, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i3 = IAuthTabCallback + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 3, PasswordMatchLogRes$.serializer.INSTANCE.getDescriptor());
            int i5 = 2 % 2;
        }
        this.failCount = i2;
        this.timestamp = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(PasswordMatchLogRes passwordMatchLogRes, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, passwordMatchLogRes.failCount);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, passwordMatchLogRes.failCount);
            i3 = 1;
        }
        vylVar.onExtraCallback(serialDescriptor, i3, passwordMatchLogRes.timestamp);
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.failCount;
        int i5 = i2 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PasswordMatchLogRes> serializer() {
            PasswordMatchLogRes$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = PasswordMatchLogRes$.serializer.INSTANCE;
                int i3 = 31 / 0;
            } else {
                serializerVar = PasswordMatchLogRes$.serializer.INSTANCE;
            }
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }
}
