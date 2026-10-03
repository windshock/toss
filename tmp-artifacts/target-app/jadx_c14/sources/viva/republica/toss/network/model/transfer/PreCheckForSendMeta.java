package viva.republica.toss.network.model.transfer;

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
import viva.republica.toss.network.model.transfer.PreCheckForSendMeta$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PreCheckForSendMeta {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String redirectUrlOnComplete;

    static {
        int i = onExtraCallbackWithResult + 123;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PreCheckForSendMeta() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckForSendMeta)) {
            return false;
        }
        if (Intrinsics.areEqual(this.redirectUrlOnComplete, ((PreCheckForSendMeta) obj).redirectUrlOnComplete)) {
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.redirectUrlOnComplete;
        if (str == null) {
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreCheckForSendMeta(redirectUrlOnComplete=" + this.redirectUrlOnComplete + ")";
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreCheckForSendMeta> serializer() {
            PreCheckForSendMeta$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = PreCheckForSendMeta$.serializer.INSTANCE;
                int i3 = 50 / 0;
            } else {
                serializerVar = PreCheckForSendMeta$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ PreCheckForSendMeta(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.redirectUrlOnComplete = null;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.redirectUrlOnComplete = str;
        int i4 = IAuthTabCallback + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public PreCheckForSendMeta(@Nullable String str) {
        this.redirectUrlOnComplete = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(PreCheckForSendMeta preCheckForSendMeta, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (preCheckForSendMeta.redirectUrlOnComplete == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, preCheckForSendMeta.redirectUrlOnComplete);
        int i4 = onNavigationEvent + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreCheckForSendMeta(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                int i4 = 92 / 0;
            }
            int i5 = i3 + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            } else {
                int i7 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }
}
