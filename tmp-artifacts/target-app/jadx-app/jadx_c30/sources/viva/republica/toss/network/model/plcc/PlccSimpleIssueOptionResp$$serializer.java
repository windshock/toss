package viva.republica.toss.network.model.plcc;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PlccSimpleIssueOptionResp$$serializer implements aeu2<PlccSimpleIssueOptionResp> {
    private static int IAuthTabCallback = 1;
    public static final PlccSimpleIssueOptionResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        PlccSimpleIssueOptionResp$$serializer plccSimpleIssueOptionResp$$serializer = new PlccSimpleIssueOptionResp$$serializer();
        INSTANCE = plccSimpleIssueOptionResp$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.plcc.PlccSimpleIssueOptionResp", plccSimpleIssueOptionResp$$serializer, 2);
        setanimationsloop.onWarmupCompleted("annualIncomeOptions", true);
        setanimationsloop.onWarmupCompleted("creditScoreOptions", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 123;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private PlccSimpleIssueOptionResp$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrIAuthTabCallback = PlccSimpleIssueOptionResp.IAuthTabCallback();
            ?? r5 = new KSerializer[5];
            r5[1] = lazyArrIAuthTabCallback[1].getValue();
            r5[1] = lazyArrIAuthTabCallback[1].getValue();
            kSerializerArr = r5;
        } else {
            Lazy[] lazyArrIAuthTabCallback2 = PlccSimpleIssueOptionResp.IAuthTabCallback();
            kSerializerArr = new KSerializer[]{lazyArrIAuthTabCallback2[0].getValue(), lazyArrIAuthTabCallback2[1].getValue()};
        }
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 24 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PlccSimpleIssueOptionResp plccSimpleIssueOptionRespM75deserialize = m75deserialize(decoder);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return plccSimpleIssueOptionRespM75deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PlccSimpleIssueOptionResp m75deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = PlccSimpleIssueOptionResp.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallback + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            List list3 = null;
            List list4 = null;
            int i7 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback;
                    int i9 = i8 + 119;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i11 = i8 + 37;
                        onWarmupCompleted = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i8 + 15;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list4);
                            i7 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i122 = i8 + 15;
                            onWarmupCompleted = i122 % 128;
                            int i132 = i122 % 2;
                            list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), list4);
                            i7 |= 2;
                        }
                    } else {
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list3);
                        i7 |= 1;
                        int i14 = IAuthTabCallback + 61;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                    }
                } else {
                    z = false;
                }
            }
            list = list3;
            list2 = list4;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PlccSimpleIssueOptionResp(i, list, list2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PlccSimpleIssueOptionResp) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PlccSimpleIssueOptionResp plccSimpleIssueOptionResp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(plccSimpleIssueOptionResp, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PlccSimpleIssueOptionResp.onExtraCallback(plccSimpleIssueOptionResp, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
