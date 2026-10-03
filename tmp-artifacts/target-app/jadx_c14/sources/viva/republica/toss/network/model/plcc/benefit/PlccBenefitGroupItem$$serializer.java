package viva.republica.toss.network.model.plcc.benefit;

import android.text.TextUtils;
import android.view.View;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PlccBenefitGroupItem$$serializer implements aeu2<PlccBenefitGroupItem> {
    private static int IAuthTabCallback;
    public static final PlccBenefitGroupItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r7 = r7 * 4
            int r7 = r7 + 105
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L29:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.$$c(int, short, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 0;
        onWarmupCompleted();
        PlccBenefitGroupItem$$serializer plccBenefitGroupItem$$serializer = new PlccBenefitGroupItem$$serializer();
        INSTANCE = plccBenefitGroupItem$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem", plccBenefitGroupItem$$serializer, 4);
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 5, 2 - View.getDefaultSize(0, 0), new char[]{65535, 65528, 7, 65532, 7}, false, TextUtils.indexOf("", "", 0) + 206, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("subTitle", false);
        setanimationsloop.onWarmupCompleted("detail", false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    private PlccBenefitGroupItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        kSerializerArr[3] = getwrigglelayout2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PlccBenefitGroupItem plccBenefitGroupItemM67deserialize = m67deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return plccBenefitGroupItemM67deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem m67deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r20) throws kotlinx.serialization.UnknownFieldException {
        /*
            r19 = this;
            r0 = r20
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3c
            int r3 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallbackWithResult
            int r3 = r3 + r4
            int r7 = r3 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallback = r7
            int r3 = r3 % r1
            java.lang.String r3 = r0.asInterface(r2, r5)
            java.lang.String r5 = r0.asInterface(r2, r6)
            java.lang.String r1 = r0.asInterface(r2, r1)
            java.lang.String r4 = r0.asInterface(r2, r4)
            r6 = 15
            r16 = r1
            r14 = r3
            r17 = r4
            r15 = r5
            r13 = r6
            goto Lb3
        L3c:
            r3 = 0
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r5
            r11 = r6
        L42:
            if (r11 == 0) goto Lac
            int r12 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallback
            int r12 = r12 + 79
            int r13 = r12 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallbackWithResult = r13
            int r12 = r12 % 2
            r13 = -1
            if (r12 != 0) goto L5b
            int r12 = r0.onNavigationEvent(r2)
            r14 = 90
            int r14 = r14 / r5
            if (r12 == r13) goto Laa
            goto L61
        L5b:
            int r12 = r0.onNavigationEvent(r2)
            if (r12 == r13) goto Laa
        L61:
            if (r12 == 0) goto La3
            int r13 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallback
            int r13 = r13 + 79
            int r14 = r13 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallbackWithResult = r14
            int r13 = r13 % 2
            if (r13 != 0) goto L72
            if (r12 == r6) goto L9c
            goto L74
        L72:
            if (r12 == r6) goto L9c
        L74:
            if (r12 == r1) goto L95
            if (r12 != r4) goto L8f
            int r14 = r14 + 19
            int r8 = r14 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.onExtraCallback = r8
            int r14 = r14 % r1
            if (r14 == 0) goto L88
            java.lang.String r8 = r0.asInterface(r2, r1)
            r10 = r10 | 19
            goto L42
        L88:
            java.lang.String r8 = r0.asInterface(r2, r4)
            r10 = r10 | 8
            goto L42
        L8f:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L95:
            java.lang.String r3 = r0.asInterface(r2, r1)
            r10 = r10 | 4
            goto L42
        L9c:
            java.lang.String r9 = r0.asInterface(r2, r6)
            r10 = r10 | 2
            goto L42
        La3:
            java.lang.String r7 = r0.asInterface(r2, r5)
            r10 = r10 | 1
            goto L42
        Laa:
            r11 = r5
            goto L42
        Lac:
            r16 = r3
            r14 = r7
            r17 = r8
            r15 = r9
            r13 = r10
        Lb3:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem r0 = new viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.m67deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PlccBenefitGroupItem) obj);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PlccBenefitGroupItem plccBenefitGroupItem) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(plccBenefitGroupItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PlccBenefitGroupItem.onExtraCallbackWithResult(plccBenefitGroupItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitGroupItem$$serializer.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478308936;
    }
}
