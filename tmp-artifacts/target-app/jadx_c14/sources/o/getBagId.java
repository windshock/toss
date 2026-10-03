package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.crosscert.android.core.Cert;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CheckMask;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getBagId {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 50617;
    private static int IAuthTabCallbackDefault = 0;
    private static char onExtraCallback = 16930;
    private static char[] onExtraCallbackWithResult = {27222, 27233, 27262, 27262, 27263, 27260, 27262, 27233, 27262, 27263, 27262, 27262, 27262, 27260, 27263, 27233, 27233, 27233, 27233, 27263, 27222, 27233, 27262, 27262, 27263, 27260, 27262, 27233, 27262, 27263, 27262, 27262, 27262, 27260, 27263, 27233, 27233, 27233, 27233, 27262, 2542, 42026, 154, 13332, 43080, 27136, 27348, 27349, 27349, 27346, 27347, 27349, 27348, 27349, 27346, 27349, 27349, 27349, 27347, 27346, 27348, 27348, 27348, 27348, 27348, 2330, 2346, 15440, 54148, 43080, 27222, 27262, 27233, 27262, 27262, 27263, 27260, 27262, 27233, 27262, 27263, 27262, 27262, 27262, 27260, 27263, 27263, 27263, 27233, 27233, 27233, 27233, 27233, 27244, 27148, 27146, 27146, 27146, 27146, 27146, 27147, 27149, 27149, 27149, 27146, 27149, 27148, 27149, 27147, 27146, 27149, 27149, 27148, 27146, 27149, 27325, 27325, 27326, 27325, 27326, 27320, 27326, 27321, 27326, 27320, 27324, 27324, 27324, 27324, 27322, 27326, 27324, 27325, 27320, 27326, 27322, 27326, 27222, 27233, 27262, 27262, 27263, 27260, 27262, 27233, 27262, 27263, 27262, 27262, 27262, 27260, 27263, 27263, 27263, 27262, 27262, 27233, 27233, 27262, 27222, 12511, 56115, 15706, 15440, 54148, 27169, 27280, 27280, 27310, 27281, 27281, 27281, 27280, 27280, 27283, 27283, 27283, 27281, 27283, 27280, 27280, 27281, 27310, 27280, 27283, 27280, 27281, 27222, 12511, 56115, 15706, 13332, 43080, 27263, 27155, 27156, 27156, 27156, 27156, 27154, 27154, 27154, 27155, 27157, 27157, 27157, 27154, 27157, 27156, 27157, 27155, 27154, 27157, 27157, 27156, 27222, 27262, 27262, 27233, 27233, 27233, 27233, 27233, 27262, 27263, 27262, 27262, 27262, 27263, 27262, 27233, 27262, 27260, 27263, 27262, 27262, 27233, 2546, 41668, 44818, 27257, 27172, 27174, 27168, 27172, 27180, 27174, 3730, 41704, 44526, 44456, 53402, 43982, 27341, 27470, 27318, 27313, 27469, 27315, 27313, 27471, 27468, 2844, 41650, 3568, 2594, 44564, 53382, 53722, 3756, 3464, 27343, 27312, 27314, 27468, 27470, 27318, 27320, 27315, 27465, 27259, 27172, 27176, 27180, 3775, 42383, 44007, 53576, 43143, 43061, 27255, 27197, 27168, 27174, 27172, 27197, 27169, 2342, 44344, 53288, 54204, 53456, 27226, 27151, 27152, 27145, 27165, 27155, 27257, 27149, 27157, 27149, 27239, 27236, 27139, 27160};
    private static char onNavigationEvent = 35158;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 51467;

    public static final RSASSAPSSparams onExtraCallbackWithResult(@NotNull Cert cert) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(cert, "");
        String subjectDN = cert.getSubjectDN();
        Intrinsics.checkNotNullExpressionValue(subjectDN, "");
        int iIAuthTabCallback = IAuthTabCallback(subjectDN);
        String subjectDN2 = cert.getSubjectDN();
        Intrinsics.checkNotNullExpressionValue(subjectDN2, "");
        String strOnWarmupCompleted = onWarmupCompleted(subjectDN2);
        String certPolicy = cert.getCertPolicy();
        Intrinsics.checkNotNullExpressionValue(certPolicy, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(certPolicy);
        String subjectDN3 = cert.getSubjectDN();
        Intrinsics.checkNotNullExpressionValue(subjectDN3, "");
        String strOnNavigationEvent = onNavigationEvent(onExtraCallback(subjectDN3));
        String filePath = cert.getFilePath();
        String str = File.separator;
        String str2 = filePath + str + cert.getSignCertFilename();
        String str3 = cert.getFilePath() + str + cert.getSignPrikeyFilename();
        String certValidityNotAfter = cert.getCertValidityNotAfter();
        Intrinsics.checkNotNullExpressionValue(certValidityNotAfter, "");
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(certValidityNotAfter);
        String certPolicy2 = cert.getCertPolicy();
        Intrinsics.checkNotNullExpressionValue(certPolicy2, "");
        RSASSAPSSparams rSASSAPSSparams = new RSASSAPSSparams(iIAuthTabCallback, strOnWarmupCompleted, strOnExtraCallbackWithResult, strOnNavigationEvent, str2, str3, strIAuthTabCallbackStub, certPolicy2);
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return rSASSAPSSparams;
    }

    private static final int IAuthTabCallback(String str) throws Throwable {
        String strIntern;
        String str2;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        char[] cArr = {56379, 59088};
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(cArr, 1 >>> TextUtils.getTrimmedLength(""), objArr);
            strIntern = ((String) objArr[0]).intern();
            str2 = "";
            z = true;
        } else {
            Object[] objArr2 = new Object[1];
            a(cArr, TextUtils.getTrimmedLength("") + 1, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            str2 = "";
            z = false;
        }
        String lowerCase = StringsKt.replace$default(str, strIntern, str2, z, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase.hashCode();
    }

    public static final String onExtraCallback(@NotNull java.security.cert.X509Certificate x509Certificate) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        String name = x509Certificate.getSubjectDN().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        String strOnWarmupCompleted = onWarmupCompleted(name);
        int i4 = IAuthTabCallbackDefault + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 121;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(i3, i3);
                        int i12 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveOpacity, i12, trimmedLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Process.getGidForName("") + 11, 12434 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $11 + 121;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 % 5;
                    }
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 19901 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[PHI: r1
      0x00b1: PHI (r1v9 java.util.regex.Matcher) = (r1v8 java.util.regex.Matcher), (r1v14 java.util.regex.Matcher) binds: [B:19:0x00af, B:16:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String onWarmupCompleted(java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 40
            char[] r2 = new char[r1]
            r2 = {x00ba: FILL_ARRAY_DATA , data: [-15017, -7951, 21978, 4533, -3126, -14735, -6186, -5001, -1120, 253, 26434, -30887, -7182, 30572, -22341, -11062, -6555, -27572, 12078, 27711, 5399, -17738, -19716, 9235, 20354, 31586, 12231, 3630, -981, 11060, -19140, 4939, 26434, -30887, 30428, -17920, 5705, -15596, 20354, 31586} // fill-array
            r3 = 0
            int r3 = android.widget.ExpandableListView.getPackedPositionGroup(r3)
            int r1 = r1 - r3
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            a(r2, r1, r4)
            r1 = 0
            r2 = r4[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r6)
            boolean r4 = r2.find()
            if (r4 == 0) goto Lb8
            int r4 = o.getBagId.onTransact
            int r4 = r4 + 115
            int r5 = r4 % 128
            o.getBagId.IAuthTabCallbackDefault = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L41
            r4 = 4
            java.lang.String r2 = r2.group(r4)
            if (r2 == 0) goto Lb8
            goto L47
        L41:
            java.lang.String r2 = r2.group(r0)
            if (r2 == 0) goto Lb8
        L47:
            int r4 = r2.length()
            if (r4 != 0) goto Lb7
            int r2 = o.getBagId.IAuthTabCallbackDefault
            int r2 = r2 + 25
            int r4 = r2 % 128
            o.getBagId.onTransact = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L85
            r2 = 18
            char[] r2 = new char[r2]
            r2 = {x00e6: FILL_ARRAY_DATA , data: [-15017, -7951, 21978, 4533, -3126, -14735, -6186, -5001, -1120, 253, 26434, -30887, 32740, 21387, 24821, -26626, 18156, -13924} // fill-array
            java.lang.String r4 = ""
            r5 = 123(0x7b, float:1.72E-43)
            int r4 = android.text.TextUtils.lastIndexOf(r4, r5, r3, r3)
            int r4 = r4 * 97
            java.lang.Object[] r3 = new java.lang.Object[r3]
            a(r2, r4, r3)
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r6)
            boolean r2 = r1.find()
            if (r2 == 0) goto Lb8
            goto Lb1
        L85:
            r2 = 18
            char[] r2 = new char[r2]
            r2 = {x00fc: FILL_ARRAY_DATA , data: [-15017, -7951, 21978, 4533, -3126, -14735, -6186, -5001, -1120, 253, 26434, -30887, 32740, 21387, 24821, -26626, 18156, -13924} // fill-array
            java.lang.String r4 = ""
            r5 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r4, r5, r1, r1)
            int r4 = 16 - r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            a(r2, r4, r3)
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r6)
            boolean r2 = r1.find()
            if (r2 == 0) goto Lb8
        Lb1:
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto Lb8
        Lb7:
            return r2
        Lb8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBagId.onWarmupCompleted(java.lang.String):java.lang.String");
    }

    private static final String onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -627633686:
                Object[] objArr = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 27146, 11464, 19341, 13916, 10771, 26781, 28807, 11185, 28807, 11185, 32927, 64088}, 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{49099, 50801}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2, objArr2);
                    return ((String) objArr2[0]).intern();
                }
                break;
            case -169665796:
                Object[] objArr3 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 63955, 55454, 28807, 11185, 28807, 11185, 28807, 11185}, MotionEvent.axisFromString("") + 21, objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    Object[] objArr4 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 0, 0}, new int[]{65, 5, 0, 4}, objArr4);
                    return ((String) objArr4[0]).intern();
                }
                break;
            case -169665794:
                Object[] objArr5 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 63955, 55454, 28807, 11185, 28807, 11185, 63613, 5944}, 20 - Color.blue(0), objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    int i2 = IAuthTabCallbackDefault + 49;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object[] objArr6 = new Object[1];
                        a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, 4 << (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1)), objArr6);
                        return ((String) objArr6[0]).intern();
                    }
                    Object[] objArr7 = new Object[1];
                    a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
                    return ((String) objArr7[0]).intern();
                }
                break;
            case 159928829:
                Object[] objArr8 = new Object[1];
                b(true, new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, new int[]{215, 22, 0, 0}, objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    Object[] objArr9 = new Object[1];
                    a(new char[]{49099, 50801}, 2 - Color.argb(0, 0, 0, 0), objArr9);
                    return ((String) objArr9[0]).intern();
                }
                break;
            case 291548076:
                b(true, new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1}, new int[]{193, 22, 43, 0}, new Object[1]);
                if (!(!str.equals(((String) r2[0]).intern()))) {
                    Object[] objArr10 = new Object[1];
                    a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, TextUtils.indexOf((CharSequence) "", '0', 0) + 6, objArr10);
                    return ((String) objArr10[0]).intern();
                }
                break;
            case 291548078:
                Object[] objArr11 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 27146, 11464, 19341, 13916, 28807, 11185, 28807, 11185, 7463, 33912}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr11);
                if (str.equals(((String) objArr11[0]).intern())) {
                    Object[] objArr12 = new Object[1];
                    a(new char[]{59565, 31603, 24066, 58717, 60931, 63702}, 5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                    return ((String) objArr12[0]).intern();
                }
                break;
            case 292471591:
                Object[] objArr13 = new Object[1];
                b(false, new byte[]{0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0}, new int[]{165, 22, 174, 12}, objArr13);
                if (str.equals(((String) objArr13[0]).intern())) {
                    Object[] objArr14 = new Object[1];
                    b(false, new byte[]{1, 0, 0, 1, 1, 1}, new int[]{187, 6, 0, 0}, objArr14);
                    return ((String) objArr14[0]).intern();
                }
                break;
            case 292471592:
                Object[] objArr15 = new Object[1];
                b(false, new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0}, new int[]{137, 22, 0, 0}, objArr15);
                if (str.equals(((String) objArr15[0]).intern())) {
                    int i3 = onTransact + 119;
                    IAuthTabCallbackDefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr16 = new Object[1];
                        b(false, new byte[]{1, 0, 0, 1, 0, 0}, new int[]{159, 6, 0, 0}, objArr16);
                        return ((String) objArr16[0]).intern();
                    }
                    Object[] objArr17 = new Object[1];
                    b(false, new byte[]{1, 0, 0, 1, 0, 0}, new int[]{159, 6, 0, 0}, objArr17);
                    return ((String) objArr17[0]).intern();
                }
                break;
            case 294318633:
                Object[] objArr18 = new Object[1];
                b(true, null, new int[]{115, 22, 194, 1}, objArr18);
                if (str.equals(((String) objArr18[0]).intern())) {
                    Object[] objArr19 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 0, 0}, new int[]{65, 5, 0, 4}, objArr19);
                    return ((String) objArr19[0]).intern();
                }
                break;
            case 294318634:
                Object[] objArr20 = new Object[1];
                b(true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0}, new int[]{93, 22, 19, 20}, objArr20);
                if (str.equals(((String) objArr20[0]).intern())) {
                    Object[] objArr21 = new Object[1];
                    a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, 5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr21);
                    String strIntern = ((String) objArr21[0]).intern();
                    int i4 = onTransact + 67;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return strIntern;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                break;
            case 448055626:
                Object[] objArr22 = new Object[1];
                b(false, new byte[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, new int[]{70, 23, 0, 1}, objArr22);
                if (str.equals(((String) objArr22[0]).intern())) {
                    Object[] objArr23 = new Object[1];
                    a(new char[]{59565, 31603, 24066, 58717, 60931, 63702}, 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr23);
                    return ((String) objArr23[0]).intern();
                }
                break;
            case 750034912:
                Object[] objArr24 = new Object[1];
                b(false, new byte[]{0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, new int[]{45, 20, 107, 0}, objArr24);
                if (str.equals(((String) objArr24[0]).intern())) {
                    int i5 = IAuthTabCallbackDefault + 115;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr25 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 0, 0}, new int[]{65, 5, 0, 4}, objArr25);
                    return ((String) objArr25[0]).intern();
                }
                break;
            case 750034913:
                Object[] objArr26 = new Object[1];
                b(false, new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{20, 20, 0, 0}, objArr26);
                if (str.equals(((String) objArr26[0]).intern())) {
                    Object[] objArr27 = new Object[1];
                    b(false, new byte[]{0, 1, 1, 1, 1}, new int[]{40, 5, 0, 0}, objArr27);
                    return ((String) objArr27[0]).intern();
                }
                break;
            case 750034915:
                Object[] objArr28 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 41237, 24508, 28807, 11185, 28807, 11185, 10771, 26781}, TextUtils.getOffsetAfter("", 0) + 20, objArr28);
                if (str.equals(((String) objArr28[0]).intern())) {
                    Object[] objArr29 = new Object[1];
                    a(new char[]{49099, 50801, 24066, 58717, 60931, 63702}, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr29);
                    return ((String) objArr29[0]).intern();
                }
                break;
            case 750034916:
                Object[] objArr30 = new Object[1];
                b(false, new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, new int[]{0, 20, 0, 0}, objArr30);
                if (str.equals(((String) objArr30[0]).intern())) {
                    int i7 = onTransact + 41;
                    IAuthTabCallbackDefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        Object[] objArr31 = new Object[1];
                        a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, objArr31);
                        return ((String) objArr31[0]).intern();
                    }
                    Object[] objArr32 = new Object[1];
                    a(new char[]{52184, 37291, 60056, 53773, 60931, 63702}, 5 % (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 0.0d ? 0 : -1)), objArr32);
                    return ((String) objArr32[0]).intern();
                }
                break;
            case 1084728461:
                Object[] objArr33 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 27146, 11464, 19341, 13916, 28807, 11185, 28807, 11185, 28807, 11185, 23087, 5535, 21142, 60453}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25, objArr33);
                if (str.equals(((String) objArr33[0]).intern())) {
                    int i8 = onTransact + 125;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr34 = new Object[1];
                        a(new char[]{49099, 50801, 24066, 58717, 60931, 63702}, (ViewConfiguration.getKeyRepeatDelay() >> 20) * 5, objArr34);
                        return ((String) objArr34[0]).intern();
                    }
                    Object[] objArr35 = new Object[1];
                    a(new char[]{49099, 50801, 24066, 58717, 60931, 63702}, 5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr35);
                    return ((String) objArr35[0]).intern();
                }
                break;
            case 1892331952:
                Object[] objArr36 = new Object[1];
                a(new char[]{12493, 42377, 40057, 65304, 18378, 65011, 23087, 5535, 12309, 40428, 30995, 55855, 27146, 11464, 19341, 13916, 14460, 45498, 28807, 11185, 18595, 17541, 28807, 11185}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, objArr36);
                if (str.equals(((String) objArr36[0]).intern())) {
                    Object[] objArr37 = new Object[1];
                    a(new char[]{49099, 50801}, Color.blue(0) + 2, objArr37);
                    return ((String) objArr37[0]).intern();
                }
                break;
        }
        Object[] objArr38 = new Object[1];
        b(false, new byte[]{0, 1, 1}, new int[]{237, 3, 0, 0}, objArr38);
        return ((String) objArr38[0]).intern();
    }

    private static final String onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b(false, new byte[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{302, 14, 0, 11}, objArr);
        Pattern patternCompile = Pattern.compile(((String) objArr[0]).intern());
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Matcher matcher = patternCompile.matcher(lowerCase);
        if (!matcher.find()) {
            return "";
        }
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            return strGroup;
        }
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            str.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -1279924956:
                Object[] objArr = new Object[1];
                b(false, new byte[]{1, 0, 0, 0, 1, 1, 0}, new int[]{290, 7, 0, 5}, objArr);
                if (!str.equals(((String) objArr[0]).intern())) {
                    return str;
                }
                Object[] objArr2 = new Object[1];
                b(true, new byte[]{0, 0, 0, 1, 1}, new int[]{297, 5, 0, 0}, objArr2);
                return ((String) objArr2[0]).intern();
            case 3291708:
                Object[] objArr3 = new Object[1];
                b(false, new byte[]{1, 0, 0, 0}, new int[]{280, 4, 0, 0}, objArr3);
                if (!str.equals(((String) objArr3[0]).intern())) {
                    return str;
                }
                int i3 = IAuthTabCallbackDefault + 103;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    b(true, new byte[]{0, 1, 1, 0, 1, 0}, new int[]{284, 6, 69, 1}, objArr4);
                    return ((String) objArr4[0]).intern();
                }
                Object[] objArr5 = new Object[1];
                b(false, new byte[]{0, 1, 1, 0, 1, 0}, new int[]{284, 6, 69, 1}, objArr5);
                return ((String) objArr5[0]).intern();
            case 753827105:
                Object[] objArr6 = new Object[1];
                b(true, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0}, new int[]{271, 9, 148, 0}, objArr6);
                if (!str.equals(((String) objArr6[0]).intern())) {
                    return str;
                }
                Object[] objArr7 = new Object[1];
                a(new char[]{55466, 7002, 55257, 43921, 9184, 54281, 29975, 7029}, TextUtils.getCapsMode("", 0, 0) + 8, objArr7);
                return ((String) objArr7[0]).intern();
            case 1082667277:
                Object[] objArr8 = new Object[1];
                b(false, new byte[]{1, 1, 0, 0, 0, 0, 1, 1, 0}, new int[]{253, 9, 149, 3}, objArr8);
                if (!str.equals(((String) objArr8[0]).intern())) {
                    return str;
                }
                Object[] objArr9 = new Object[1];
                b(true, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0}, new int[]{262, 9, 0, 2}, objArr9);
                return ((String) objArr9[0]).intern();
            case 1397817956:
                a(new char[]{39527, 64835, 45762, 42039, 22846, 56901, 42555, 59920, 31584, 42624}, 9 - View.MeasureSpec.makeMeasureSpec(0, 0), new Object[1]);
                if (!str.equals(((String) r1[0]).intern())) {
                    return str;
                }
                Object[] objArr10 = new Object[1];
                b(true, new byte[]{1, 1, 0, 0, 1, 1}, new int[]{247, 6, 28, 0}, objArr10);
                return ((String) objArr10[0]).intern();
            case 1768554761:
                Object[] objArr11 = new Object[1];
                b(true, new byte[]{0, 1, 0, 0, 0, 0, 1}, new int[]{240, 7, 0, 0}, objArr11);
                if (!str.equals(((String) objArr11[0]).intern())) {
                    return str;
                }
                int i4 = onTransact + 93;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr12 = new Object[1];
                a(new char[]{55466, 7002, 43733, 1173, 61011, 3938}, Color.alpha(0) + 5, objArr12);
                return ((String) objArr12[0]).intern();
            default:
                return str;
        }
    }

    private static final String IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            ResetInputBGRLivenessChecker resetInputBGRLivenessCheckerOnNavigationEvent = CheckMask.onExtraCallbackWithResult.onWarmupCompleted.onNavigationEvent();
            Date date = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().parse(str);
            Object[] objArr = {followRedirects.onExtraCallbackWithResult};
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            str = ResetInputBGRLivenessChecker.onExtraCallback(resetInputBGRLivenessCheckerOnNavigationEvent, date, (Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), (TimeZone) null, 4, (Object) null);
        } catch (Exception unused) {
        }
        int i4 = onTransact + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 79;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "", 0)), 36 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 14239 - KeyEvent.keyCodeFromString(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 35283), 'S' - AndroidCharacter.getMirror('0'), 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 29 - (ViewConfiguration.getTapTimeout() >> 16), 17657 - Color.alpha(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "", 0, 0) + 70, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $11 + 5;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
            int i15 = $10 + 123;
            $11 = i15 % 128;
            int i16 = i15 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
