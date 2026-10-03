package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getAdExperienceType;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class LoanProductBadge$$serializer implements aeu2<LoanProductBadge> {
    public static final LoanProductBadge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {7, 80, 121, 38};
    private static final int $$b = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r5 = r5 + 109
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.$$c(byte, byte, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 89;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $11 + 31;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int iResolveSize = View.resolveSize(i5, i5) + 43;
                    int iNormalizeMetaState = 1451 - KeyEvent.normalizeMetaState(i5);
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, iResolveSize, iNormalizeMetaState, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123);
                    int i10 = 44 - (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1));
                    int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 1494;
                    byte b3 = (byte) i5;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, i10, threadPriority, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i11 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23971);
                    int iRgb = Color.rgb(i5, i5, i5) + 16777266;
                    int iNormalizeMetaState2 = 22939 - KeyEvent.normalizeMetaState(i5);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iRgb, iNormalizeMetaState2, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i12);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 45849);
                    int iIndexOf = 29 - TextUtils.indexOf("", "");
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12577;
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, iIndexOf, jumpTapTimeout, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i13 = $11 + 101;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static {
        onNavigationEvent = 0;
        IAuthTabCallback();
        LoanProductBadge$$serializer loanProductBadge$$serializer = new LoanProductBadge$$serializer();
        INSTANCE = loanProductBadge$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.LoanProductBadge", loanProductBadge$$serializer, 4);
        Object[] objArr = new Object[1];
        a((char) (59610 - Color.alpha(0)), KeyEvent.getDeadChar(0, 0), new char[]{42464, 46404, 15806, 15702}, new char[]{56997, 47607, 59155, 35019}, new char[]{47757, 27484, 55966, 23528}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55383), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 245334901, new char[]{62524, 64920, 36481, 56722, 1937}, new char[]{56997, 47607, 59155, 35019}, new char[]{30417, 40835, 22542, 63192}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55671), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{1343, 18871, 56186, 23069}, new char[]{56997, 47607, 59155, 35019}, new char[]{61424, 5924, 30562, 8665}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted(getAdExperienceType.QUERY_KEY, true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 11;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private LoanProductBadge$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            m51deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoanProductBadge loanProductBadgeM51deserialize = m51deserialize(decoder);
        int i3 = onTransact + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return loanProductBadgeM51deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.LoanProductBadge m51deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r20) throws kotlinx.serialization.UnknownFieldException {
        /*
            r19 = this;
            r0 = r20
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.asInterface
            int r2 = r2 + 19
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.onTransact = r3
            int r2 = r2 % r1
            java.lang.String r3 = ""
            r4 = 0
            if (r2 == 0) goto Lad
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r5 = 3
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L40
            java.lang.String r3 = r0.asInterface(r2, r6)
            java.lang.String r4 = r0.asInterface(r2, r7)
            java.lang.String r1 = r0.asInterface(r2, r1)
            java.lang.String r5 = r0.asInterface(r2, r5)
            r6 = 15
            r16 = r1
            r14 = r3
            r15 = r4
            r17 = r5
            r13 = r6
            goto La1
        L40:
            r3 = r4
            r8 = r3
            r9 = r8
            r10 = r6
            r11 = r7
        L45:
            if (r11 == 0) goto L9a
            int r12 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.asInterface
            int r12 = r12 + 123
            int r13 = r12 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.onTransact = r13
            int r12 = r12 % r1
            int r12 = r0.onNavigationEvent(r2)
            r13 = -1
            if (r12 == r13) goto L98
            int r13 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.asInterface
            int r13 = r13 + 27
            int r14 = r13 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.onTransact = r14
            int r13 = r13 % r1
            if (r12 == 0) goto L91
            if (r12 == r7) goto L8a
            int r14 = r14 + 119
            int r13 = r14 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.asInterface = r13
            int r14 = r14 % 2
            if (r14 == 0) goto L72
            r13 = 5
            if (r12 == r13) goto L83
            goto L74
        L72:
            if (r12 == r1) goto L83
        L74:
            if (r12 != r5) goto L7d
            java.lang.String r9 = r0.asInterface(r2, r5)
            r10 = r10 | 8
            goto L45
        L7d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L83:
            java.lang.String r3 = r0.asInterface(r2, r1)
            r10 = r10 | 4
            goto L45
        L8a:
            java.lang.String r4 = r0.asInterface(r2, r7)
            r10 = r10 | 2
            goto L45
        L91:
            java.lang.String r8 = r0.asInterface(r2, r6)
            r10 = r10 | 1
            goto L45
        L98:
            r11 = r6
            goto L45
        L9a:
            r16 = r3
            r15 = r4
            r14 = r8
            r17 = r9
            r13 = r10
        La1:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.loan.LoanProductBadge r0 = new viva.republica.toss.network.model.loan.LoanProductBadge
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        Lad:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r1)
            r0.extraCallbackWithResult()
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanProductBadge$$serializer.m51deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.loan.LoanProductBadge");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LoanProductBadge) obj);
        int i4 = onTransact + 125;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LoanProductBadge loanProductBadge) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanProductBadge, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        LoanProductBadge.onExtraCallback(loanProductBadge, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        onExtraCallback = -1949518618725796514L;
        onWarmupCompleted = -1776194565;
        onExtraCallbackWithResult = (char) 27643;
    }
}
