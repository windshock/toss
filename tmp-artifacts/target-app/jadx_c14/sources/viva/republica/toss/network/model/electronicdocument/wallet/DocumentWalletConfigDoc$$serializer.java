package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.jp;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DocumentWalletConfigDoc$$serializer implements aeu2<DocumentWalletConfigDoc> {
    public static final DocumentWalletConfigDoc$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DocumentWalletConfigDoc$$serializer documentWalletConfigDoc$$serializer = new DocumentWalletConfigDoc$$serializer();
        INSTANCE = documentWalletConfigDoc$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc", documentWalletConfigDoc$$serializer, 7);
        setanimationsloop.onWarmupCompleted("docCode", true);
        setanimationsloop.onWarmupCompleted("docName", true);
        setanimationsloop.onWarmupCompleted("existDocId", true);
        setanimationsloop.onWarmupCompleted("isPrepare", true);
        setanimationsloop.onWarmupCompleted("applyType", true);
        setanimationsloop.onWarmupCompleted("hidden", true);
        setanimationsloop.onWarmupCompleted("rank", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 1;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private DocumentWalletConfigDoc$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = DocumentWalletConfigDoc.onWarmupCompleted();
        KSerializer<?> kSerializer = oty1.onExtraCallback;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[4].getValue());
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, getbgcolor, kSerializerIAuthTabCallback3, getbgcolor, getDynamicHeight.onWarmupCompleted};
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletConfigDoc documentWalletConfigDocM11deserialize = m11deserialize(decoder);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return documentWalletConfigDocM11deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DocumentWalletConfigDoc m11deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        EDocIssuableCandidate.onNavigationEvent onnavigationevent;
        int i;
        Long l;
        boolean z;
        String str;
        int iOnTransact;
        boolean z2;
        long j;
        char c;
        boolean z3;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = DocumentWalletConfigDoc.onWarmupCompleted();
        int i3 = 6;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
            EDocIssuableCandidate.onNavigationEvent onnavigationevent2 = (EDocIssuableCandidate.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnWarmupCompleted[4].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
            l = l2;
            onnavigationevent = onnavigationevent2;
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 6);
            z2 = zOnExtraCallbackWithResult2;
            z = zOnExtraCallbackWithResult;
            i = 127;
            j = jIAuthTabCallbackDefault;
            str = str2;
        } else {
            boolean z4 = true;
            Long l3 = null;
            onnavigationevent = null;
            int iOnTransact2 = 0;
            long jIAuthTabCallbackDefault2 = 0;
            boolean zOnExtraCallbackWithResult3 = false;
            int i6 = 0;
            boolean zOnExtraCallbackWithResult4 = false;
            String str3 = null;
            while (z4) {
                int i7 = onExtraCallback + 25;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 3;
                        z4 = false;
                        i3 = 6;
                    case 0:
                        z3 = true;
                        c2 = 3;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 6;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        c2 = 3;
                        z3 = true;
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                        i6 |= 2;
                        i3 = 6;
                    case 2:
                        c = 3;
                        l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l3);
                        i6 |= 4;
                        int i9 = onExtraCallbackWithResult + 105;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        i3 = 6;
                    case 3:
                        zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                        i6 |= 8;
                    case 4:
                        onnavigationevent = (EDocIssuableCandidate.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnWarmupCompleted[4].getValue(), onnavigationevent);
                        i6 |= 16;
                    case 5:
                        zOnExtraCallbackWithResult4 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5);
                        i6 |= 32;
                    case 6:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, i3);
                        i6 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i6;
            l = l3;
            z = zOnExtraCallbackWithResult3;
            str = str3;
            long j2 = jIAuthTabCallbackDefault2;
            iOnTransact = iOnTransact2;
            z2 = zOnExtraCallbackWithResult4;
            j = j2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DocumentWalletConfigDoc(i, j, str, l, z, onnavigationevent, z2, iOnTransact, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DocumentWalletConfigDoc) obj);
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DocumentWalletConfigDoc documentWalletConfigDoc) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(documentWalletConfigDoc, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DocumentWalletConfigDoc.onWarmupCompleted(documentWalletConfigDoc, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(documentWalletConfigDoc, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DocumentWalletConfigDoc.onWarmupCompleted(documentWalletConfigDoc, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
