package im.toss.features.credit.data.response;

import im.toss.features.credit.data.response.PackageSubmitResponse;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PackageSubmitResponse$$serializer implements aeu2<PackageSubmitResponse> {
    private static int IAuthTabCallback = 1;
    public static final PackageSubmitResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        PackageSubmitResponse$$serializer packageSubmitResponse$$serializer = new PackageSubmitResponse$$serializer();
        INSTANCE = packageSubmitResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.PackageSubmitResponse", packageSubmitResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("kcbRaisedScore", true);
        setanimationsloop.onWarmupCompleted("niceRaisedScore", true);
        setanimationsloop.onWarmupCompleted("completeBannerScheme", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 27;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }

    private PackageSubmitResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            kSerializerArr = new KSerializer[3];
            PackageSubmitResponse$SubmitResultResponse$$serializer packageSubmitResponse$SubmitResultResponse$$serializer = PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE;
            kSerializerArr[0] = packageSubmitResponse$SubmitResultResponse$$serializer;
            kSerializerArr[0] = packageSubmitResponse$SubmitResultResponse$$serializer;
            kSerializerArr[4] = kSerializerIAuthTabCallback;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
            PackageSubmitResponse$SubmitResultResponse$$serializer packageSubmitResponse$SubmitResultResponse$$serializer2 = PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE;
            kSerializerArr = new KSerializer[]{packageSubmitResponse$SubmitResultResponse$$serializer2, packageSubmitResponse$SubmitResultResponse$$serializer2, kSerializerIAuthTabCallback2};
        }
        int i3 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PackageSubmitResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        PackageSubmitResponse.SubmitResultResponse submitResultResponse;
        String str;
        PackageSubmitResponse.SubmitResultResponse submitResultResponse2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        PackageSubmitResponse.SubmitResultResponse submitResultResponse3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            PackageSubmitResponse$SubmitResultResponse$$serializer packageSubmitResponse$SubmitResultResponse$$serializer = PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE;
            PackageSubmitResponse.SubmitResultResponse submitResultResponse4 = (PackageSubmitResponse.SubmitResultResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, packageSubmitResponse$SubmitResultResponse$$serializer, (Object) null);
            PackageSubmitResponse.SubmitResultResponse submitResultResponse5 = (PackageSubmitResponse.SubmitResultResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, packageSubmitResponse$SubmitResultResponse$$serializer, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            submitResultResponse = submitResultResponse5;
            submitResultResponse2 = submitResultResponse4;
            i = 7;
        } else {
            int i3 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            boolean z = true;
            String str2 = null;
            PackageSubmitResponse.SubmitResultResponse submitResultResponse6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 13;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        if (iOnNavigationEvent == 0) {
                            submitResultResponse3 = (PackageSubmitResponse.SubmitResultResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE, submitResultResponse3);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i8 = i6 + 83;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                            str2 = (String) (i9 == 0 ? ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, str2) : ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, str2));
                            i5 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        submitResultResponse3 = (PackageSubmitResponse.SubmitResultResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE, submitResultResponse3);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    submitResultResponse6 = (PackageSubmitResponse.SubmitResultResponse) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, PackageSubmitResponse$SubmitResultResponse$$serializer.INSTANCE, submitResultResponse6);
                    i5 |= 1;
                    int i10 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            i = i5;
            submitResultResponse = submitResultResponse3;
            str = str2;
            submitResultResponse2 = submitResultResponse6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PackageSubmitResponse(i, submitResultResponse2, submitResultResponse, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m184deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PackageSubmitResponse packageSubmitResponseDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return packageSubmitResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PackageSubmitResponse packageSubmitResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(packageSubmitResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PackageSubmitResponse.onWarmupCompleted(packageSubmitResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(packageSubmitResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PackageSubmitResponse.onWarmupCompleted(packageSubmitResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PackageSubmitResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 8 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
