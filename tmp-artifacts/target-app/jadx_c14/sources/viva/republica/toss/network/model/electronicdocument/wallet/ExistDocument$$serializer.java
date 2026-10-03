package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.readAsText;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class ExistDocument$$serializer implements aeu2<ExistDocument> {
    private static int IAuthTabCallback = 1;
    public static final ExistDocument$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return serialDescriptor;
    }

    static {
        ExistDocument$$serializer existDocument$$serializer = new ExistDocument$$serializer();
        INSTANCE = existDocument$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.ExistDocument", existDocument$$serializer, 5);
        setanimationsloop.onWarmupCompleted("docCode", false);
        setanimationsloop.onWarmupCompleted("docName", false);
        setanimationsloop.onWarmupCompleted("docStatus", false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        setanimationsloop.onWarmupCompleted("existDocId", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExistDocument$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = ExistDocument.IAuthTabCallback();
        oty1 oty1Var = oty1.onExtraCallback;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {oty1Var, getwrigglelayout, lazyArrIAuthTabCallback[2].getValue(), getwrigglelayout, sp.IAuthTabCallback(oty1Var)};
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ExistDocument existDocumentM20deserialize = m20deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return existDocumentM20deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final ExistDocument m20deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Long l;
        readAsText readastext;
        String strAsInterface;
        String str;
        long j;
        char c;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ExistDocument.IAuthTabCallback();
        char c2 = 3;
        Long l2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            readastext = (readAsText) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str = strAsInterface2;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, (Object) null);
            i = 31;
            j = jIAuthTabCallbackDefault;
        } else {
            int i4 = 0;
            String strAsInterface3 = null;
            boolean z = true;
            long jIAuthTabCallbackDefault2 = 0;
            readAsText readastext2 = null;
            String strAsInterface4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    if (iOnNavigationEvent != 0) {
                        int i5 = onExtraCallbackWithResult + 1;
                        int i6 = i5 % 128;
                        onNavigationEvent = i6;
                        if (i5 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 1) {
                            c = 3;
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i4 |= 2;
                        } else {
                            c = 3;
                            if (iOnNavigationEvent == 2) {
                                readastext2 = (readAsText) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), readastext2);
                                i4 |= 4;
                            } else if (iOnNavigationEvent != 3) {
                                int i7 = i6 + 53;
                                onExtraCallbackWithResult = i7 % 128;
                                if (i7 % 2 != 0) {
                                    i2 = 4;
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, oty1.onExtraCallback, l2);
                                    i4 |= 16;
                                    c2 = 3;
                                } else {
                                    if (iOnNavigationEvent != 2) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    i2 = 4;
                                    l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, oty1.onExtraCallback, l2);
                                    i4 |= 16;
                                    c2 = 3;
                                }
                            } else {
                                strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i4 |= 8;
                                int i8 = onExtraCallbackWithResult + 87;
                                onNavigationEvent = i8 % 128;
                                int i9 = i8 % 2;
                            }
                        }
                    } else {
                        c = c2;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i4 |= 1;
                        int i10 = onNavigationEvent + 115;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    c2 = c;
                } else {
                    z = false;
                }
            }
            i = i4;
            l = l2;
            readastext = readastext2;
            strAsInterface = strAsInterface4;
            str = strAsInterface3;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExistDocument(i, j, str, readastext, strAsInterface, l, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExistDocument) obj);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExistDocument existDocument) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(existDocument, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExistDocument.onWarmupCompleted(existDocument, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(existDocument, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExistDocument.onWarmupCompleted(existDocument, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
