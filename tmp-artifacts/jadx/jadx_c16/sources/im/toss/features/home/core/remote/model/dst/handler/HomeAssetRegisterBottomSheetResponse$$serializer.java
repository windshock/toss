package im.toss.features.home.core.remote.model.dst.handler;

import im.toss.features.home.core.remote.model.dst.widget.BottomSheetResponse;
import im.toss.features.home.core.remote.model.dst.widget.BottomSheetResponse$;
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
public final /* synthetic */ class HomeAssetRegisterBottomSheetResponse$$serializer implements aeu2<HomeAssetRegisterBottomSheetResponse> {
    private static int IAuthTabCallback = 0;
    public static final HomeAssetRegisterBottomSheetResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return serialDescriptor;
    }

    static {
        HomeAssetRegisterBottomSheetResponse$$serializer homeAssetRegisterBottomSheetResponse$$serializer = new HomeAssetRegisterBottomSheetResponse$$serializer();
        INSTANCE = homeAssetRegisterBottomSheetResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.dst.handler.HomeAssetRegisterBottomSheetResponse", homeAssetRegisterBottomSheetResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("bottomSheet", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    private HomeAssetRegisterBottomSheetResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{sp.IAuthTabCallback(BottomSheetResponse$.serializer.INSTANCE)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = sp.IAuthTabCallback(BottomSheetResponse$.serializer.INSTANCE);
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeAssetRegisterBottomSheetResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int i;
        BottomSheetResponse bottomSheetResponse;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
                i = 0;
                int i4 = onWarmupCompleted + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                BottomSheetResponse$.serializer serializerVar = BottomSheetResponse$.serializer.INSTANCE;
                bottomSheetResponse = (BottomSheetResponse) (i5 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null));
            }
            bottomSheetResponse = null;
            z = true;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    bottomSheetResponse = (BottomSheetResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, BottomSheetResponse$.serializer.INSTANCE, bottomSheetResponse);
                    i = 1;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                i = 1;
                int i42 = onWarmupCompleted + 13;
                IAuthTabCallback = i42 % 128;
                int i52 = i42 % 2;
                BottomSheetResponse$.serializer serializerVar2 = BottomSheetResponse$.serializer.INSTANCE;
                bottomSheetResponse = (BottomSheetResponse) (i52 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar2, (Object) null) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar2, (Object) null));
            }
            bottomSheetResponse = null;
            z = true;
            i = 0;
            while (z) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeAssetRegisterBottomSheetResponse(i, bottomSheetResponse, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m594deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        HomeAssetRegisterBottomSheetResponse homeAssetRegisterBottomSheetResponseDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return homeAssetRegisterBottomSheetResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeAssetRegisterBottomSheetResponse homeAssetRegisterBottomSheetResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeAssetRegisterBottomSheetResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeAssetRegisterBottomSheetResponse.onNavigationEvent(homeAssetRegisterBottomSheetResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeAssetRegisterBottomSheetResponse) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
