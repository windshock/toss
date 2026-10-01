package im.toss.features.credit.data.response;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeHeaderResponse$$serializer implements aeu2<CreditHomeHeaderResponse> {
    private static int IAuthTabCallback = 1;
    public static final CreditHomeHeaderResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        CreditHomeHeaderResponse$$serializer creditHomeHeaderResponse$$serializer = new CreditHomeHeaderResponse$$serializer();
        INSTANCE = creditHomeHeaderResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeHeaderResponse", creditHomeHeaderResponse$$serializer, 3);
        setanimationsloop.onWarmupCompleted("scoreDeltaInfo", true);
        setanimationsloop.onWarmupCompleted("items", true);
        setanimationsloop.onWarmupCompleted("hasLoan", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 33;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    private CreditHomeHeaderResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnExtraCallback = CreditHomeHeaderResponse.onExtraCallback();
            ?? r2 = new KSerializer[2];
            r2[1] = sp.IAuthTabCallback(ScoreDeltaInfo$$serializer.INSTANCE);
            r2[0] = lazyArrOnExtraCallback[0].getValue();
            r2[2] = getBgColor.IAuthTabCallback;
            kSerializerArr = r2;
        } else {
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(ScoreDeltaInfo$$serializer.INSTANCE), CreditHomeHeaderResponse.onExtraCallback()[1].getValue(), getBgColor.IAuthTabCallback};
        }
        int i3 = IAuthTabCallback + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005d A[PHI: r1 r2 r13
      0x005d: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r2v11 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v13 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r13
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v13 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditHomeHeaderResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        int i;
        List list;
        ScoreDeltaInfo scoreDeltaInfo;
        boolean zOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CreditHomeHeaderResponse.onExtraCallback();
            int i4 = 94 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                ScoreDeltaInfo scoreDeltaInfo2 = (ScoreDeltaInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ScoreDeltaInfo$$serializer.INSTANCE, (Object) null);
                i = 7;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
                scoreDeltaInfo = scoreDeltaInfo2;
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            } else {
                list = null;
                ScoreDeltaInfo scoreDeltaInfo3 = null;
                boolean zOnExtraCallbackWithResult2 = false;
                int i5 = 0;
                boolean z = true;
                while (z) {
                    int i6 = onNavigationEvent + 21;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        scoreDeltaInfo3 = (ScoreDeltaInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, ScoreDeltaInfo$$serializer.INSTANCE, scoreDeltaInfo3);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list);
                        i5 |= 2;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = IAuthTabCallback + 21;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i5 |= 5;
                        } else {
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i5 |= 4;
                        }
                        int i9 = onNavigationEvent + 45;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
                i = i5;
                scoreDeltaInfo = scoreDeltaInfo3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = CreditHomeHeaderResponse.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHomeHeaderResponse(i, scoreDeltaInfo, list, zOnExtraCallbackWithResult, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m154deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeHeaderResponse creditHomeHeaderResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return creditHomeHeaderResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeHeaderResponse creditHomeHeaderResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditHomeHeaderResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditHomeHeaderResponse.IAuthTabCallback(creditHomeHeaderResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditHomeHeaderResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditHomeHeaderResponse.IAuthTabCallback(creditHomeHeaderResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeHeaderResponse) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
