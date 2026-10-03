package viva.republica.toss.network.model.common;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.common.ServerTime$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ServerTime {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String serverTime;

    static {
        int i = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ServerTime() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ServerTime)) {
            int i7 = onExtraCallback + 79;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.serverTime, ((ServerTime) obj).serverTime)) {
            return true;
        }
        int i9 = onExtraCallback + 83;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serverTime;
        if (str == null) {
            int i5 = i2 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i7 = onNavigationEvent + 57;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServerTime(serverTime=" + this.serverTime + ")";
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ServerTime> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                ServerTime$.serializer serializerVar = ServerTime$.serializer.INSTANCE;
                throw null;
            }
            ServerTime$.serializer serializerVar2 = ServerTime$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 56 / 0;
            }
            return serializerVar2;
        }
    }

    public /* synthetic */ ServerTime(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.serverTime = null;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.serverTime = str;
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public ServerTime(@Nullable String str) {
        this.serverTime = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ServerTime serverTime, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
                if (serverTime.serverTime == null) {
                    return;
                }
            } else if (serverTime.serverTime == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, serverTime.serverTime);
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServerTime(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 99;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serverTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
