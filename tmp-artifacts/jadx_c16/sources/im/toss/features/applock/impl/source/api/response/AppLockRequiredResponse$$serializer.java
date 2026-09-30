package im.toss.features.applock.impl.source.api.response;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockRequiredResponse$$serializer implements aeu2<AppLockRequiredResponse> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AppLockRequiredResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        AppLockRequiredResponse$$serializer appLockRequiredResponse$$serializer = new AppLockRequiredResponse$$serializer();
        INSTANCE = appLockRequiredResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.applock.impl.source.api.response.AppLockRequiredResponse", appLockRequiredResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("shouldExposureAppLockScreen", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AppLockRequiredResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getBgColor.IAuthTabCallback};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[0];
        kSerializerArr[1] = getBgColor.IAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r1 r9
      0x0037: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r9v5 o.yw) = (r9v1 o.yw), (r9v7 o.yw) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r9
      0x0032: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r9v2 o.yw) = (r9v1 o.yw), (r9v7 o.yw) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLockRequiredResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = 1;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            } else {
                int i4 = onWarmupCompleted + 43;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
                zOnExtraCallbackWithResult = false;
                int i6 = 0;
                boolean z = true;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i7 = onExtraCallback + 81;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        int i9 = onWarmupCompleted + 31;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = 1;
                    } else {
                        z = false;
                    }
                }
                i3 = i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppLockRequiredResponse(i3, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m72deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppLockRequiredResponse appLockRequiredResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appLockRequiredResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppLockRequiredResponse appLockRequiredResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appLockRequiredResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AppLockRequiredResponse.IAuthTabCallback(appLockRequiredResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (AppLockRequiredResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
