package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.membership.InsuranceStatusSection;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InsuranceStatusSection$Progress$$serializer implements aeu2<InsuranceStatusSection.Progress> {
    private static int IAuthTabCallback = 0;
    public static final InsuranceStatusSection$Progress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        InsuranceStatusSection$Progress$$serializer insuranceStatusSection$Progress$$serializer = new InsuranceStatusSection$Progress$$serializer();
        INSTANCE = insuranceStatusSection$Progress$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.InsuranceStatusSection.Progress", insuranceStatusSection$Progress$$serializer, 4);
        setanimationsloop.onWarmupCompleted("statusText", true);
        setanimationsloop.onWarmupCompleted("extraText", true);
        setanimationsloop.onWarmupCompleted("percent500", true);
        setanimationsloop.onWarmupCompleted("percent1000", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 17;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private InsuranceStatusSection$Progress$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            return new KSerializer[]{kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, getdynamicheight, getdynamicheight};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(getwrigglelayout2);
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = sp.IAuthTabCallback(getwrigglelayout2);
        kSerializerArr[1] = kSerializerIAuthTabCallback3;
        getDynamicHeight getdynamicheight2 = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[5] = getdynamicheight2;
        kSerializerArr[4] = getdynamicheight2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057 A[PHI: r0 r2
      0x0057: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r0 r2
      0x0038: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0038: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InsuranceStatusSection.Progress deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        int iOnTransact;
        int i;
        int i2;
        String str;
        String str2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i5 = 69 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
                int iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                i = 15;
                i2 = iOnTransact2;
                str = str4;
                str2 = str3;
            } else {
                String str5 = null;
                String str6 = null;
                boolean z = true;
                int iOnTransact3 = 0;
                int iOnTransact4 = 0;
                i = 0;
                while (z) {
                    int i6 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i8 = IAuthTabCallback + 7;
                        int i9 = i8 % 128;
                        onExtraCallbackWithResult = i9;
                        int i10 = i8 % 2;
                        if (iOnNavigationEvent != 0) {
                            int i11 = i9 + 71;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (iOnNavigationEvent == 0) {
                                    str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                                    i |= 2;
                                } else if (iOnNavigationEvent != 2) {
                                    iOnTransact3 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                                    i |= 4;
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i12 = i9 + 63;
                                    IAuthTabCallback = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 5);
                                        i |= 66;
                                    } else {
                                        iOnTransact4 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 3);
                                        i |= 8;
                                    }
                                }
                            } else if (iOnNavigationEvent == 1) {
                                str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                                i |= 2;
                            } else if (iOnNavigationEvent != 2) {
                            }
                        } else {
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                            i |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                iOnTransact = iOnTransact4;
                str = str5;
                i2 = iOnTransact3;
                str2 = str6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new InsuranceStatusSection.Progress(i, str2, str, i2, iOnTransact, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m224deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        InsuranceStatusSection.Progress progressDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return progressDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull InsuranceStatusSection.Progress progress) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(progress, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            InsuranceStatusSection.Progress.onExtraCallback(progress, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(progress, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        InsuranceStatusSection.Progress.onExtraCallback(progress, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (InsuranceStatusSection.Progress) obj);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
