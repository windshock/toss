package viva.republica.toss.network.model.transfer;

import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DepositTarget$Share$$serializer implements aeu2<DepositTarget.Share> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final DepositTarget$Share$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r8 = r8 * 2
            int r8 = 105 - r8
            byte[] r0 = viva.republica.toss.network.model.transfer.DepositTarget$Share$$serializer.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + 1
            int r8 = r8 + r9
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Share$$serializer.$$c(int, int, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 0;
        IAuthTabCallback();
        DepositTarget$Share$$serializer depositTarget$Share$$serializer = new DepositTarget$Share$$serializer();
        INSTANCE = depositTarget$Share$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("SHARE", depositTarget$Share$$serializer, 2);
        setanimationsloop.onWarmupCompleted("receiverName", false);
        setanimationsloop.onWarmupCompleted("reserveKey", true);
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 5, View.resolveSize(0, 0) + 2, new char[]{0, 65525, 4, '\t'}, false, 173 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(new DepositTarget$Account$$serializer.IAuthTabCallback(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = onExtraCallback + 1;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    private DepositTarget$Share$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Share shareM82deserialize = m82deserialize(decoder);
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return shareM82deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DepositTarget.Share m82deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 5;
            } else {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 3;
            }
        } else {
            int i4 = 0;
            String strAsInterface2 = null;
            String str2 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                        int i7 = onNavigationEvent + 73;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            str = str2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DepositTarget.Share(i, strAsInterface, str, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTarget.Share) obj);
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTarget.Share share) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(share, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTarget.Share.onExtraCallback(share, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r20, int r21, char[] r22, boolean r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Share$$serializer.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = 478308884;
    }
}
