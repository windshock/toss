package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.dj3;
import o.getBgColor;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.AppliedLoan;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class AppliedLoan$$serializer implements aeu2<AppliedLoan> {
    public static final AppliedLoan$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] $$a = {68, -127, 122, -15};
    private static final int $$b = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r0 = viva.republica.toss.network.model.loan.AppliedLoan$$serializer.$$a
            int r7 = r7 * 4
            int r7 = 97 - r7
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan$$serializer.$$c(short, short, int):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback = 1;
        onNavigationEvent();
        AppliedLoan$$serializer appliedLoan$$serializer = new AppliedLoan$$serializer();
        INSTANCE = appliedLoan$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.AppliedLoan", appliedLoan$$serializer, 15);
        setanimationsloop.onWarmupCompleted("productId", true);
        setanimationsloop.onWarmupCompleted("companyName", false);
        setanimationsloop.onWarmupCompleted("productName", false);
        setanimationsloop.onWarmupCompleted("companyIconUrl", false);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("statusMessage", false);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollBarFadeDuration() >> 16, KeyEvent.getDeadChar(0, 0) + 6, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44983), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("loanAmount", false);
        setanimationsloop.onWarmupCompleted("interest", false);
        setanimationsloop.onWarmupCompleted("cta", true);
        setanimationsloop.onWarmupCompleted("rightText", true);
        setanimationsloop.onWarmupCompleted("loanAppliedTs", true);
        setanimationsloop.onWarmupCompleted("groupName", true);
        setanimationsloop.onWarmupCompleted("tracked", true);
        setanimationsloop.onWarmupCompleted("badgeText", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 93;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private AppliedLoan$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer, oty1.onExtraCallback, dj3.onWarmupCompleted, sp.IAuthTabCallback(AppliedLoan$LoanReviewButtonText$$serializer.INSTANCE), sp.IAuthTabCallback(AppliedLoan$LoanText$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(kSerializer)};
        int i4 = onTransact + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return m21deserialize(decoder);
        }
        m21deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final AppliedLoan m21deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        float f;
        boolean z;
        long j;
        AppliedLoan.LoanText loanText;
        String str7;
        AppliedLoan.LoanReviewButtonText loanReviewButtonText;
        String str8;
        int i;
        String str9;
        String str10;
        int i2;
        String str11;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 6;
        String str12 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 7);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 8);
            AppliedLoan.LoanReviewButtonText loanReviewButtonText2 = (AppliedLoan.LoanReviewButtonText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, AppliedLoan$LoanReviewButtonText$$serializer.INSTANCE, (Object) null);
            AppliedLoan.LoanText loanText2 = (AppliedLoan.LoanText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, AppliedLoan$LoanText$$serializer.INSTANCE, (Object) null);
            String str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, (Object) null);
            String str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getwrigglelayout, (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13);
            String str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getwrigglelayout, (Object) null);
            int i9 = onWarmupCompleted + 35;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 2;
            }
            str7 = str17;
            str6 = strAsInterface;
            str2 = str15;
            loanText = loanText2;
            loanReviewButtonText = loanReviewButtonText2;
            f = fOnWarmupCompleted;
            str = str16;
            z = zOnExtraCallbackWithResult;
            str5 = strAsInterface2;
            str9 = strAsInterface3;
            j = jIAuthTabCallbackDefault;
            str10 = str13;
            str4 = strAsInterface5;
            str3 = str14;
            str8 = strAsInterface4;
            i = 32767;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            boolean z2 = true;
            int i11 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            String str18 = null;
            AppliedLoan.LoanText loanText3 = null;
            String str19 = null;
            AppliedLoan.LoanReviewButtonText loanReviewButtonText3 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String str20 = null;
            String str21 = null;
            long jIAuthTabCallbackDefault2 = 0;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        i7 = i7;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 0:
                        i2 = i7;
                        str11 = str21;
                        str20 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str20);
                        i11 |= 1;
                        str21 = str11;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        i2 = i7;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i11 |= 2;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 2:
                        i2 = i7;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i11 |= 4;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 3:
                        i2 = i7;
                        str11 = str21;
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i11 |= 8;
                        str21 = str11;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 4:
                        i2 = i7;
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i11 |= 16;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 5:
                        i2 = i7;
                        String str22 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str21);
                        i11 |= 32;
                        int i12 = onTransact + 53;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        str21 = str22;
                        i7 = i2;
                        i4 = 11;
                        i5 = 10;
                        i6 = 9;
                        i8 = 6;
                    case 6:
                        int i14 = i8;
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i14);
                        i11 |= 64;
                        i7 = i7;
                        i8 = i14;
                        i4 = 11;
                    case 7:
                        int i15 = i7;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i15);
                        i11 |= 128;
                        i7 = i15;
                        i8 = 6;
                    case 8:
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 8);
                        i11 |= 256;
                        i7 = 7;
                        i8 = 6;
                    case 9:
                        loanReviewButtonText3 = (AppliedLoan.LoanReviewButtonText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, AppliedLoan$LoanReviewButtonText$$serializer.INSTANCE, loanReviewButtonText3);
                        i11 |= 512;
                        i7 = 7;
                        i8 = 6;
                    case 10:
                        loanText3 = (AppliedLoan.LoanText) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, AppliedLoan$LoanText$$serializer.INSTANCE, loanText3);
                        i11 |= 1024;
                        i7 = 7;
                        i8 = 6;
                    case 11:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, getWriggleLayout.onNavigationEvent, str19);
                        i11 |= 2048;
                        i7 = 7;
                        i8 = 6;
                    case 12:
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, str18);
                        i11 |= 4096;
                        i7 = 7;
                        i8 = 6;
                    case 13:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 13);
                        i11 |= 8192;
                        i8 = 6;
                    case 14:
                        str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 14, getWriggleLayout.onNavigationEvent, str12);
                        i11 |= 16384;
                        i8 = 6;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            String str23 = str20;
            String str24 = str21;
            str = str18;
            str2 = str19;
            str3 = str24;
            str4 = strAsInterface10;
            str5 = strAsInterface7;
            str6 = strAsInterface8;
            f = fOnWarmupCompleted2;
            z = zOnExtraCallbackWithResult2;
            j = jIAuthTabCallbackDefault2;
            loanText = loanText3;
            str7 = str12;
            loanReviewButtonText = loanReviewButtonText3;
            str8 = strAsInterface9;
            i = i11;
            str9 = strAsInterface6;
            str10 = str23;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AppliedLoan(i, str10, str6, str5, str9, str8, str3, str4, j, f, loanReviewButtonText, loanText, str2, str, z, str7, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppliedLoan) obj);
        int i4 = onTransact + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppliedLoan appliedLoan) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appliedLoan, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        int iOnExtraCallback = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        int iOnExtraCallback2 = CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback();
        AppliedLoan.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1257416267, iOnExtraCallback2, iOnExtraCallback, -1257416267, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{appliedLoan, vylVarOnExtraCallback, serialDescriptor});
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 25;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 29;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 59649), 16 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 31, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49123), (ViewConfiguration.getWindowTouchSlop() >> 8) + 44, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $10 + 77;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 44, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i10 = 41 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.alpha(0)), 44 - TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{16912, 5041, 57705, 46869, 1226, 55923};
        onExtraCallbackWithResult = 4477238313255156837L;
    }
}
