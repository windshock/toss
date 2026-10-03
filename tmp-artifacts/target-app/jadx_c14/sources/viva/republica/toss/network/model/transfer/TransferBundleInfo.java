package viva.republica.toss.network.model.transfer;

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
import viva.republica.toss.network.model.transfer.TransferBundleInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferBundleInfo {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String key;
    private final int step;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 21;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof TransferBundleInfo)) {
            int i6 = i2 + 45;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        TransferBundleInfo transferBundleInfo = (TransferBundleInfo) obj;
        if (!Intrinsics.areEqual(this.key, transferBundleInfo.key)) {
            int i7 = onNavigationEvent + 49;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.step == transferBundleInfo.step) {
            return true;
        }
        int i9 = onExtraCallback + 51;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.key.hashCode() * 31) + Integer.hashCode(this.step);
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferBundleInfo(key=" + this.key + ", step=" + this.step + ")";
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferBundleInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                TransferBundleInfo$.serializer serializerVar = TransferBundleInfo$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TransferBundleInfo$.serializer serializerVar2 = TransferBundleInfo$.serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ TransferBundleInfo(int i, String str, int i2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i3 = onExtraCallback + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 3, TransferBundleInfo$.serializer.INSTANCE.getDescriptor());
            int i5 = onExtraCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this.key = str;
        this.step = i2;
    }

    public TransferBundleInfo(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.step = i;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferBundleInfo transferBundleInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, transferBundleInfo.key);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, transferBundleInfo.key);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, transferBundleInfo.step);
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
