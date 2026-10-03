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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.user.LogoutReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LogoutReq {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String reason;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 25;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoutReq)) {
            int i5 = i2 + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.reason, ((LogoutReq) obj).reason)) {
            return false;
        }
        int i7 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 49 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.reason;
        if (i3 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LogoutReq(reason=" + this.reason + ")";
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LogoutReq> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LogoutReq$.serializer serializerVar = LogoutReq$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ LogoutReq(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, LogoutReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.reason = str;
    }

    public LogoutReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reason = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(LogoutReq logoutReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        vylVar.onExtraCallback(serialDescriptor, i2 % 2 != 0 ? 1 : 0, logoutReq.reason);
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
