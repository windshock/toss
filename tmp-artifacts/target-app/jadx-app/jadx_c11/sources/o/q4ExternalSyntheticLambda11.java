package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import o.q4ExternalSyntheticLambda11;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda11 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 58919;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 63009;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 55352;
    private static char onWarmupCompleted = 56629;

    public static /* synthetic */ Throwable onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(th);
        }
        onExtraCallbackWithResult(th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r1 = onWarmupCompleted(r6, 0, 1, null);
        r4 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r4.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if ((((java.lang.Throwable) r4.next()) instanceof java.util.concurrent.TimeoutException) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r2 = new java.lang.Object[1];
        a(new char[]{41262, 51167, 18427, 17199, 35021, 30537, 16029, 33937}, 6 - android.view.MotionEvent.axisFromString(""), r2);
        r6 = ((java.lang.String) r2[0]).intern();
        r1 = o.q4ExternalSyntheticLambda11.onExtraCallbackWithResult + 103;
        o.q4ExternalSyntheticLambda11.IAuthTabCallbackStub = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r3 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r3.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r4 = o.q4ExternalSyntheticLambda11.onExtraCallbackWithResult + 109;
        o.q4ExternalSyntheticLambda11.IAuthTabCallbackStub = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (IAuthTabCallback((java.lang.Throwable) r3.next()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r6 = o.q4ExternalSyntheticLambda11.IAuthTabCallbackStub + 1;
        o.q4ExternalSyntheticLambda11.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        return "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r2 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r2.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if ((((java.lang.Throwable) r2.next()) instanceof java.lang.SecurityException) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        return "security";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        r1 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r1.hasNext() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if ((((java.lang.Throwable) r1.next()) instanceof java.lang.IllegalStateException) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        r6 = o.q4ExternalSyntheticLambda11.onExtraCallbackWithResult + 29;
        o.q4ExternalSyntheticLambda11.IAuthTabCallbackStub = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        return "illegal_state";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        return onWarmupCompleted(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r6.getClass()).getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = new java.lang.Object[1];
        a(new char[]{42385, 35914, 60882, 13496}, android.graphics.Color.rgb(0, 0, 0) + 16777220, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return ((java.lang.String) r0[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onExtraCallback(@Nullable Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
    }

    static /* synthetic */ Sequence onWarmupCompleted(Throwable th, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub;
        int i5 = i4 + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0 && (i2 & 1) != 0) {
            int i6 = i4 + 59;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = 10;
        }
        return IAuthTabCallback(th, i);
    }

    private static final Throwable onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            th.getCause();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Throwable cause = th.getCause();
        int i3 = IAuthTabCallbackStub + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return cause;
        }
        obj.hashCode();
        throw null;
    }

    private static final Sequence<Throwable> IAuthTabCallback(Throwable th, int i) {
        int i2 = 2 % 2;
        Sequence<Throwable> sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(clearRevision.onExtraCallbackWithResult(th, new Function1() { // from class: im.toss.securities.libs.performance.tracker.domain.monitoring.MonitoringErrorCategoryKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 71;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Throwable thOnNavigationEvent = q4ExternalSyntheticLambda11.onNavigationEvent((Throwable) obj);
                int i6 = onWarmupCompleted + 31;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return thOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), RangesKt.coerceAtLeast(i, 1));
        int i3 = IAuthTabCallbackStub + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return sequenceOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        String name = th.getClass().getName();
        Intrinsics.checkNotNull(name);
        if (!StringsKt.startsWith$default(name, "java.net.", false, 2, (Object) null) && (!StringsKt.startsWith$default(name, "javax.net.", false, 2, (Object) null)) && !StringsKt.startsWith$default(name, "java.io.", false, 2, (Object) null) && !(th instanceof IOException) && !Intrinsics.areEqual(name, "retrofit2.HttpException")) {
            int i2 = IAuthTabCallbackStub + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(name, "coil3.network.HttpException")) {
                int i4 = IAuthTabCallbackStub + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = IAuthTabCallbackStub + 81;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 != 0 ? q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 1, 3, null) : q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 2, null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 43;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        int i12 = 12435 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(deadChar, absoluteGravity, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "") + 10, 12433 - TextUtils.lastIndexOf("", '0', 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    int i14 = $11 + 89;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 14 - (KeyEvent.getMaxKeyCode() >> 16), Color.rgb(0, 0, 0) + 16797117, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
