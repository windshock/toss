package im.toss.features.home.core.remote.model.asset.home;

import im.toss.features.home.core.remote.model.asset.home.AssetOtherHome;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherHome$BottomButton$$serializer implements aeu2<AssetOtherHome.BottomButton> {
    private static int IAuthTabCallback = 0;
    public static final AssetOtherHome$BottomButton$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AssetOtherHome$BottomButton$$serializer assetOtherHome$BottomButton$$serializer = new AssetOtherHome$BottomButton$$serializer();
        INSTANCE = assetOtherHome$BottomButton$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.asset.home.AssetOtherHome.BottomButton", assetOtherHome$BottomButton$$serializer, 2);
        setanimationsloop.onWarmupCompleted("leftButton", false);
        setanimationsloop.onWarmupCompleted("rightButton", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 49;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
    }

    private AssetOtherHome$BottomButton$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetOtherHome$BottomButton$Button$$serializer assetOtherHome$BottomButton$Button$$serializer = AssetOtherHome$BottomButton$Button$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(assetOtherHome$BottomButton$Button$$serializer), sp.IAuthTabCallback(assetOtherHome$BottomButton$Button$$serializer)};
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AssetOtherHome.BottomButton deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        AssetOtherHome.BottomButton.Button button;
        AssetOtherHome.BottomButton.Button button2;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i6 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            AssetOtherHome$BottomButton$Button$$serializer assetOtherHome$BottomButton$Button$$serializer = AssetOtherHome$BottomButton$Button$$serializer.INSTANCE;
            if (i7 != 0) {
                button2 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, assetOtherHome$BottomButton$Button$$serializer, (Object) null);
                button = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, assetOtherHome$BottomButton$Button$$serializer, (Object) null);
                i = 5;
            } else {
                button2 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, assetOtherHome$BottomButton$Button$$serializer, (Object) null);
                button = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, assetOtherHome$BottomButton$Button$$serializer, (Object) null);
                i = 3;
            }
        } else {
            int i8 = 0;
            boolean z = true;
            AssetOtherHome.BottomButton.Button button3 = null;
            AssetOtherHome.BottomButton.Button button4 = null;
            while (z) {
                int i9 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i10 = onWarmupCompleted;
                    int i11 = i10 + 27;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 52 / 0;
                        if (iOnNavigationEvent != 0) {
                            i2 = i10 + 5;
                            onExtraCallbackWithResult = i2 % 128;
                            if (i2 % 2 == 0) {
                                if (iOnNavigationEvent != 0) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                button3 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, AssetOtherHome$BottomButton$Button$$serializer.INSTANCE, button3);
                                i8 |= 2;
                            } else {
                                if (iOnNavigationEvent != 1) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                button3 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, AssetOtherHome$BottomButton$Button$$serializer.INSTANCE, button3);
                                i8 |= 2;
                            }
                        } else {
                            button4 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, AssetOtherHome$BottomButton$Button$$serializer.INSTANCE, button4);
                            i8 |= 1;
                        }
                    } else if (iOnNavigationEvent != 0) {
                        i2 = i10 + 5;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else {
                        button4 = (AssetOtherHome.BottomButton.Button) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, AssetOtherHome$BottomButton$Button$$serializer.INSTANCE, button4);
                        i8 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            button = button3;
            button2 = button4;
            i = i8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AssetOtherHome.BottomButton(i, button2, button, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m556deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AssetOtherHome.BottomButton bottomButtonDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return bottomButtonDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AssetOtherHome.BottomButton bottomButton) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomButton, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AssetOtherHome.BottomButton.onExtraCallback(bottomButton, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AssetOtherHome.BottomButton) obj);
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
