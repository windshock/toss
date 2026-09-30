package im.toss.features.home.core.remote.model;

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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IncludeAssetRequest$$serializer implements aeu2<IncludeAssetRequest> {
    private static int IAuthTabCallback = 0;
    public static final IncludeAssetRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        IncludeAssetRequest$$serializer includeAssetRequest$$serializer = new IncludeAssetRequest$$serializer();
        INSTANCE = includeAssetRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.IncludeAssetRequest", includeAssetRequest$$serializer, 10);
        setanimationsloop.onWarmupCompleted("account", false);
        setanimationsloop.onWarmupCompleted("saving", false);
        setanimationsloop.onWarmupCompleted("loan", false);
        setanimationsloop.onWarmupCompleted("invest", false);
        setanimationsloop.onWarmupCompleted("pension", false);
        setanimationsloop.onWarmupCompleted("point", false);
        setanimationsloop.onWarmupCompleted("estate", false);
        setanimationsloop.onWarmupCompleted("car", false);
        setanimationsloop.onWarmupCompleted("cash", false);
        setanimationsloop.onWarmupCompleted("includeMinusAccountToLoan", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 23;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private IncludeAssetRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final IncludeAssetRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean z;
        Boolean bool;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 9;
        int i4 = 7;
        boolean z10 = true;
        int i5 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = IAuthTabCallback + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            boolean zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            boolean zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            boolean zOnExtraCallbackWithResult5 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            boolean zOnExtraCallbackWithResult6 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            boolean zOnExtraCallbackWithResult7 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
            boolean zOnExtraCallbackWithResult8 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7);
            boolean zOnExtraCallbackWithResult9 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
            z = zOnExtraCallbackWithResult3;
            z2 = zOnExtraCallbackWithResult;
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getBgColor.IAuthTabCallback, (Object) null);
            z3 = zOnExtraCallbackWithResult8;
            z4 = zOnExtraCallbackWithResult7;
            z5 = zOnExtraCallbackWithResult6;
            z6 = zOnExtraCallbackWithResult4;
            i = 1023;
            z7 = zOnExtraCallbackWithResult9;
            z8 = zOnExtraCallbackWithResult5;
            z9 = zOnExtraCallbackWithResult2;
        } else {
            Boolean bool2 = null;
            boolean z11 = true;
            boolean zOnExtraCallbackWithResult10 = false;
            boolean zOnExtraCallbackWithResult11 = false;
            boolean zOnExtraCallbackWithResult12 = false;
            boolean zOnExtraCallbackWithResult13 = false;
            boolean zOnExtraCallbackWithResult14 = false;
            boolean zOnExtraCallbackWithResult15 = false;
            boolean zOnExtraCallbackWithResult16 = false;
            boolean zOnExtraCallbackWithResult17 = false;
            boolean zOnExtraCallbackWithResult18 = false;
            while (z11 == z10) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z11 = false;
                        int i8 = IAuthTabCallback + 45;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 9;
                        i4 = 7;
                        z10 = true;
                    case 0:
                        i5 |= 1;
                        z10 = true;
                        zOnExtraCallbackWithResult11 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                        i3 = 9;
                    case 1:
                        zOnExtraCallbackWithResult18 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i5 |= 2;
                        z10 = true;
                        i3 = 9;
                    case 2:
                        zOnExtraCallbackWithResult10 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = 9;
                        z10 = true;
                    case 3:
                        zOnExtraCallbackWithResult15 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = 9;
                        z10 = true;
                    case 4:
                        zOnExtraCallbackWithResult17 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = 9;
                        z10 = true;
                    case 5:
                        zOnExtraCallbackWithResult14 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i5 |= 32;
                        i3 = 9;
                        z10 = true;
                    case 6:
                        zOnExtraCallbackWithResult13 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6);
                        i5 |= 64;
                        int i10 = onWarmupCompleted + 15;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 9;
                        z10 = true;
                    case 7:
                        zOnExtraCallbackWithResult12 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4);
                        i5 |= 128;
                        z10 = true;
                    case 8:
                        zOnExtraCallbackWithResult16 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8);
                        i5 |= 256;
                        z10 = true;
                    case 9:
                        bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getBgColor.IAuthTabCallback, bool2);
                        i5 |= 512;
                        z10 = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            z = zOnExtraCallbackWithResult10;
            bool = bool2;
            z2 = zOnExtraCallbackWithResult11;
            i = i5;
            z3 = zOnExtraCallbackWithResult12;
            z4 = zOnExtraCallbackWithResult13;
            z5 = zOnExtraCallbackWithResult14;
            z6 = zOnExtraCallbackWithResult15;
            z7 = zOnExtraCallbackWithResult16;
            z8 = zOnExtraCallbackWithResult17;
            z9 = zOnExtraCallbackWithResult18;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new IncludeAssetRequest(i, z2, z9, z, z6, z8, z5, z4, z3, z7, bool, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m543deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IncludeAssetRequest includeAssetRequestDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return includeAssetRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull IncludeAssetRequest includeAssetRequest) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(includeAssetRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        IncludeAssetRequest.onExtraCallback(includeAssetRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (IncludeAssetRequest) obj);
        int i4 = IAuthTabCallback + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
