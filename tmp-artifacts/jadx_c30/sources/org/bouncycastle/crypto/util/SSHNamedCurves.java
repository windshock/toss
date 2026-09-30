package org.bouncycastle.crypto.util;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SSHNamedCurves {
    private static final Map<String, ASN1ObjectIdentifier> oidMap = Collections.unmodifiableMap(new HashMap<String, ASN1ObjectIdentifier>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.1
        {
            put("nistp256", SECObjectIdentifiers.secp256r1);
            put("nistp384", SECObjectIdentifiers.secp384r1);
            put("nistp521", SECObjectIdentifiers.secp521r1);
            put("nistk163", SECObjectIdentifiers.sect163k1);
            put("nistp192", SECObjectIdentifiers.secp192r1);
            put("nistp224", SECObjectIdentifiers.secp224r1);
            put("nistk233", SECObjectIdentifiers.sect233k1);
            put("nistb233", SECObjectIdentifiers.sect233r1);
            put("nistk283", SECObjectIdentifiers.sect283k1);
            put("nistk409", SECObjectIdentifiers.sect409k1);
            put("nistb409", SECObjectIdentifiers.sect409r1);
            put("nistt571", SECObjectIdentifiers.sect571k1);
        }
    });
    private static final Map<String, String> curveNameToSSHName = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.2
        private static final byte[] $$a = {ISO7816.INS_MSE, -66, 77, 18};
        private static final int $$b = 116;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] IAuthTabCallback = {8541, 61637, 33361, 22004, 26404, 14045, 51276, 39870, 44399};
        private static long onWarmupCompleted = -3707448389109531558L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, short s2) {
            int i2;
            int i3;
            int i4 = (s2 * 4) + 4;
            byte[] bArr = $$a;
            int i5 = (i * 3) + 1;
            int i6 = (s * 2) + 97;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                i6 = i5;
                int i7 = i4;
                i3 = 0;
                i4++;
                i6 += i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i4];
                i4++;
                i6 += i7;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i6;
                if (i3 == i5) {
                }
            }
        }

        {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, (char) (Drawable.resolveOpacity(0, 0) + 52474), objArr);
            String[][] strArr = {new String[]{((String) objArr[0]).intern(), "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
            int i = 0;
            while (i != 12) {
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    String str = strArr[i][0];
                    put(str, str);
                    i += 107;
                } else {
                    String[] strArr2 = strArr[i];
                    put(strArr2[0], strArr2[1]);
                    i++;
                }
                int i3 = 2 % 2;
            }
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            long j;
            CharSequence charSequence;
            Throwable cause;
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (true) {
                j = 0;
                if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                    break;
                }
                int i4 = $10 + 17;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 59697), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ExpandableListView.getPackedPositionType(0L)), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20221 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 43 - Process.getGidForName(BuildConfig.FLAVOR), 1494 - Color.red(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            CharSequence charSequence2 = BuildConfig.FLAVOR;
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $11 + 13;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    charSequence = charSequence2;
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 49123), 45 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 1494 - TextUtils.indexOf(charSequence, charSequence, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                } else {
                    charSequence = charSequence2;
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                charSequence2 = charSequence;
                j = 0;
            }
            objArr[0] = new String(cArr);
        }
    });
    private static HashMap<ECCurve, String> curveMap = new HashMap<ECCurve, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.3
        {
            Enumeration names = CustomNamedCurves.getNames();
            while (names.hasMoreElements()) {
                String str = (String) names.nextElement();
                put(CustomNamedCurves.getByName(str).getCurve(), str);
            }
        }
    };
    private static final Map<ASN1ObjectIdentifier, String> oidToName = Collections.unmodifiableMap(new HashMap<ASN1ObjectIdentifier, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.4
        {
            for (String str : SSHNamedCurves.oidMap.keySet()) {
                put(SSHNamedCurves.oidMap.get(str), str);
            }
        }
    });

    public static ASN1ObjectIdentifier getByName(String str) {
        return oidMap.get(str);
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return oidToName.get(aSN1ObjectIdentifier);
    }

    public static String getNameForParameters(ECDomainParameters eCDomainParameters) {
        return eCDomainParameters instanceof ECNamedDomainParameters ? getName(((ECNamedDomainParameters) eCDomainParameters).getName()) : getNameForParameters(eCDomainParameters.getCurve());
    }

    public static String getNameForParameters(ECCurve eCCurve) {
        return curveNameToSSHName.get(curveMap.get(eCCurve));
    }

    public static X9ECParameters getParameters(String str) {
        return NISTNamedCurves.getByOID(oidMap.get(Strings.toLowerCase(str)));
    }

    public static X9ECParameters getParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
    }
}
