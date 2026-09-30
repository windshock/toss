package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setWebTouchProxy extends vy {
    private final getBeforeTimestamp onNavigationEvent;
    private final hfycx onWarmupCompleted;

    public setWebTouchProxy(@NotNull getBeforeTimestamp getbeforetimestamp, @NotNull wie2 wie2Var) {
        Intrinsics.checkNotNullParameter(getbeforetimestamp, "");
        Intrinsics.checkNotNullParameter(wie2Var, "");
        this.onNavigationEvent = getbeforetimestamp;
        this.onWarmupCompleted = wie2Var.onExtraCallback();
    }

    @Override // kotlinx.serialization.encoding.Decoder, o.yw
    public hfycx IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        throw new IllegalStateException("unsupported");
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public int asInterface() {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            return setBuildFingerprintBytes.IAuthTabCallback(strOnTransact);
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'UInt' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public long access100() {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            return setBuildFingerprintBytes.onWarmupCompleted(strOnTransact);
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'ULong' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public byte IAuthTabCallbackStub() {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            return setBuildFingerprintBytes.onNavigationEvent(strOnTransact);
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'UByte' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }

    @Override // o.vy, kotlinx.serialization.encoding.Decoder
    public short IAuthTabCallbackStubProxy() {
        getBeforeTimestamp getbeforetimestamp = this.onNavigationEvent;
        String strOnTransact = getbeforetimestamp.onTransact();
        try {
            return setBuildFingerprintBytes.asBinder(strOnTransact);
        } catch (IllegalArgumentException unused) {
            getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Failed to parse type 'UShort' for input '" + strOnTransact + '\'', 0, null, 6, null);
            throw new setWrite();
        }
    }
}
