package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzid extends ThreadLocal<Cipher> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = -7684134477483268861L;
    private static int onNavigationEvent;

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() throws Throwable {
        Cipher cipherZza;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            cipherZza = zza();
            int i4 = 43 / 0;
        } else {
            cipherZza = zza();
        }
        int i5 = onExtraCallback + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return cipherZza;
    }

    private static Cipher zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            zzwr<zzxc, Cipher> zzwrVar = zzwr.zza;
            Object[] objArr = new Object[1];
            a(new char[]{36867, 8565, 42505, 23487, 36930, 32575, 6724, 16829, 59512, 63357, 37406, 51707, 24616, 28603, 2761, 20789, 63737, 59353, 33419, 55615, 28823, 8174, 15214, 41164, 51528}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            Cipher cipherZza = zzwrVar.zza(((String) objArr[0]).intern());
            if (zzia.zza(cipherZza)) {
                return cipherZza;
            }
            int i5 = onExtraCallback + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzid() {
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i4 = $11 + 87;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 45813), TextUtils.getOffsetAfter("", 0) + 84, TextUtils.lastIndexOf("", '0', 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - MotionEvent.axisFromString("")), 18 - TextUtils.lastIndexOf("", '0', 0), 8856 - AndroidCharacter.getMirror('0'), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $11 + 105;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }
}
