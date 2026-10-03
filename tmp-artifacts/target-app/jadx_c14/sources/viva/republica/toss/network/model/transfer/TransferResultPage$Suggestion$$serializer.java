package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
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
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$Suggestion$$serializer implements aeu2<TransferResultPage.Suggestion> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final TransferResultPage$Suggestion$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static final byte[] $$a = {62, 54, 60, 44};
    private static final int $$b = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = 105 - r8
            byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$$serializer.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$$serializer.$$c(int, short, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 1 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r20, int r21, char[] r22, boolean r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$$serializer.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static {
        onNavigationEvent = 1;
        onExtraCallbackWithResult();
        TransferResultPage$Suggestion$$serializer transferResultPage$Suggestion$$serializer = new TransferResultPage$Suggestion$$serializer();
        INSTANCE = transferResultPage$Suggestion$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion", transferResultPage$Suggestion$$serializer, 3);
        setanimationsloop.onWarmupCompleted("titlePrefix", true);
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 5, 4 - TextUtils.indexOf("", ""), new char[]{65532, 7, 65535, 65528, 7}, false, 119 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("meta", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 111;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferResultPage$Suggestion$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(TransferResultPage$Suggestion$Meta$$serializer.INSTANCE)};
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.Suggestion suggestionM123deserialize = m123deserialize(decoder);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return suggestionM123deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TransferResultPage.Suggestion m123deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TransferResultPage.Suggestion.Meta meta;
        String str;
        int i;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i3 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            meta = (TransferResultPage.Suggestion.Meta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferResultPage$Suggestion$Meta$$serializer.INSTANCE, (Object) null);
            str = str4;
            i = 7;
            str2 = str3;
        } else {
            boolean z = true;
            int i5 = 0;
            TransferResultPage.Suggestion.Meta meta2 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted + 103;
                    int i7 = i6 % 128;
                    onExtraCallbackWithResult = i7;
                    if (i6 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i8 = i7 + 81;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        meta2 = (TransferResultPage.Suggestion.Meta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TransferResultPage$Suggestion$Meta$$serializer.INSTANCE, meta2);
                        i5 |= 4;
                    } else {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                        i5 |= 2;
                    }
                } else {
                    int i10 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    z = false;
                }
            }
            meta = meta2;
            str = str5;
            i = i5;
            str2 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferResultPage.Suggestion(i, str2, str, meta, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.Suggestion) obj);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.Suggestion suggestion) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(suggestion, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.Suggestion.IAuthTabCallback(suggestion, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = 478308896;
    }
}
