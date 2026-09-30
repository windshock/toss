package im.toss.features.home.core.local.model.dst.element;

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
public final /* synthetic */ class BarAssetRowLocal$$serializer implements aeu2<BarAssetRowLocal> {
    private static int IAuthTabCallback = 0;
    public static final BarAssetRowLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        BarAssetRowLocal$$serializer barAssetRowLocal$$serializer = new BarAssetRowLocal$$serializer();
        INSTANCE = barAssetRowLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BarAssetRowLocal", barAssetRowLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("assetRow", false);
        setanimationsloop.onWarmupCompleted("showTopBar", false);
        setanimationsloop.onWarmupCompleted("showBottomBar", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 5;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private BarAssetRowLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getBgColor getbgcolor = getBgColor.IAuthTabCallback;
            return new KSerializer[]{ExperimentHomeOverviewAssetRowALocal$$serializer.INSTANCE, getbgcolor, getbgcolor};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[0] = ExperimentHomeOverviewAssetRowALocal$$serializer.INSTANCE;
        getBgColor getbgcolor2 = getBgColor.IAuthTabCallback;
        kSerializerArr[0] = getbgcolor2;
        kSerializerArr[4] = getbgcolor2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r15
      0x0049: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r15
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BarAssetRowLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        ExperimentHomeOverviewAssetRowALocal experimentHomeOverviewAssetRowALocal;
        boolean zOnExtraCallbackWithResult;
        int i;
        boolean zOnExtraCallbackWithResult2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 37 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                experimentHomeOverviewAssetRowALocal = (ExperimentHomeOverviewAssetRowALocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetRowALocal$$serializer.INSTANCE, (Object) null);
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                i = 7;
                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            } else {
                ExperimentHomeOverviewAssetRowALocal experimentHomeOverviewAssetRowALocal2 = null;
                boolean z = true;
                boolean zOnExtraCallbackWithResult3 = false;
                boolean zOnExtraCallbackWithResult4 = false;
                i = 0;
                while (z) {
                    int i5 = onExtraCallbackWithResult + 31;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i7 = IAuthTabCallback;
                        int i8 = i7 + 11;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                        if (iOnNavigationEvent == 0) {
                            experimentHomeOverviewAssetRowALocal2 = (ExperimentHomeOverviewAssetRowALocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, ExperimentHomeOverviewAssetRowALocal$$serializer.INSTANCE, experimentHomeOverviewAssetRowALocal2);
                            i |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            int i9 = i7 + 27;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i |= 4;
                        } else {
                            zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i |= 2;
                        }
                    } else {
                        z = false;
                    }
                }
                zOnExtraCallbackWithResult2 = zOnExtraCallbackWithResult3;
                experimentHomeOverviewAssetRowALocal = experimentHomeOverviewAssetRowALocal2;
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BarAssetRowLocal(i, experimentHomeOverviewAssetRowALocal, zOnExtraCallbackWithResult, zOnExtraCallbackWithResult2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m284deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BarAssetRowLocal barAssetRowLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return barAssetRowLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BarAssetRowLocal barAssetRowLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(barAssetRowLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BarAssetRowLocal.onNavigationEvent(barAssetRowLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(barAssetRowLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        BarAssetRowLocal.onNavigationEvent(barAssetRowLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BarAssetRowLocal) obj);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
