package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.verify.response.PublicKeyResponse;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.genSignatureValueWithDigest;
import viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PersonalData extends getSemanticsIdentifier {
    private static final byte[] $$a = {52, -107, 59, -11};
    private static final int $$b = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int postMessage = 0;
    private static int newSession = 1;
    private static char[] extraCommand = {60821, 62634, 57329, 60905, 62674, 57247, 42584, 35077, 37838, 31371, 23924, 9265, 3834, 4519, 63584, 49965, 43542, 36051, 38812, 60849, 62593, 57281, 42550, 35153, 37780, 31448, 23833, 9339, 24557, 18141, 28061, 5240, 15105, 8668, 51363, 61283};
    private static long newSessionWithExtras = -4635858995566086929L;
    private static char[] newAuthTabSession = {64961, 64980, 64991, 64985, 65015, 64986, 64962, 65010, 64964, 64990, 64924, 65016, 64987, 64984, 64978, 64970, 64989, 65020, 64966, 64967, 65009, 64963, 64995, 64982, 64960, 64992, 65008, 64983, 64971, 64988, 65014, 64977, 64993, 65018, 64976, 64965};
    private static char prefetch = 51247;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = o.PersonalData.$$a
            int r5 = r5 * 4
            int r5 = r5 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r5
            r5 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L29:
            r3 = r1[r6]
        L2b:
            int r5 = r5 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PersonalData.$$c(int, short, byte):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 97;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Pair pairIAuthTabCallbackStub = IAuthTabCallbackStub(function1, obj);
        int i3 = postMessage + 47;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = postMessage + 113;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(context, settopguidebackgroundcolor, str, pair);
        }
        onExtraCallbackWithResult(context, settopguidebackgroundcolor, str, pair);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RSASSAPSSparams IAuthTabCallback(String str, List list) {
        int i = 2 % 2;
        int i2 = postMessage + 113;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        RSASSAPSSparams rSASSAPSSparamsOnExtraCallback = onExtraCallback(str, list);
        int i4 = postMessage + 63;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return rSASSAPSSparamsOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 99;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = newSession + 109;
        postMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 99;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = postMessage + 117;
        newSession = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ RSASSAPSSparams onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 27;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) onWarmupCompleted(638658926, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -638658926, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{function1, obj});
        int i4 = postMessage + 53;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            return rSASSAPSSparams;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i4 | i;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i4);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i4) | (~i)));
        int i13 = i4 + i + i3 + (1699743442 * i5) + (2071835342 * i6);
        int i14 = i13 * i13;
        int i15 = ((i4 * (-557635572)) - 1375207424) + ((-557635572) * i) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i3) + ((-648019968) * i5) + ((-1801453568) * i6) + (1296564224 * i14);
        int i16 = ((i4 * (-355764420)) - 259725689) + (i * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i3 * (-355763899)) + (i5 * 2119243930) + (i6 * (-943812730)) + (i14 * (-597164032));
        int i17 = i15 + (i16 * i16 * 58195968);
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Pair onWarmupCompleted(String str, PublicKeyResponse publicKeyResponse) {
        int i = 2 % 2;
        int i2 = postMessage + 43;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = IAuthTabCallback(str, publicKeyResponse);
        int i4 = postMessage + 39;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-2065247673, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2065247674, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{settopguidebackgroundcolor, th});
        int i4 = newSession + 43;
        postMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Pair IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 7;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i4 = newSession + 17;
        postMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return pair;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = postMessage + 103;
        newSession = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) function1.invoke(obj);
        int i3 = newSession + 109;
        postMessage = i3 % 128;
        if (i3 % 2 == 0) {
            return rSASSAPSSparams;
        }
        throw null;
    }

    private static final Pair IAuthTabCallback(String str, PublicKeyResponse publicKeyResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(publicKeyResponse, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(publicKeyResponse.onExtraCallbackWithResult(), (RSASSAPSSparams) genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback().onWarmupCompleted(new EncryptCertificateMessageHandler$.ExternalSyntheticLambda1(new EncryptCertificateMessageHandler$.ExternalSyntheticLambda0(str))).onNavigationEvent());
        int i2 = newSession + 75;
        postMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return pairIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 67;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r1 = new o.setText(r19);
        r10 = new java.lang.Object[1];
        d((byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 60), new char[]{'#', 22, 1, 18, 3, '!'}, 6 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), r10);
        r2 = r1.onNavigationEvent(((java.lang.String) r10[0]).intern(), "");
        r9 = new java.lang.Object[1];
        d((byte) (106 - android.text.TextUtils.getTrimmedLength("")), new char[]{29, 0, 4, '\r', 20, '\n'}, 6 - android.view.View.MeasureSpec.getSize(0), r9);
        r1 = r1.onNavigationEvent(((java.lang.String) r9[0]).intern(), "");
        r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a2, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - android.view.KeyEvent.getDeadChar(0, 0)), 21 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), android.text.TextUtils.getOffsetBefore("", 0) + 24734, -842029757, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c4, code lost:
    
        r4 = ((java.lang.reflect.Field) r4).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
    
        r8 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
    
        r8 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - android.view.KeyEvent.normalizeMetaState(0)), 22 - android.text.TextUtils.indexOf("", ""), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fb, code lost:
    
        r4 = ((o.onExitFullscreen) ((java.lang.reflect.Method) r8).invoke(r4, null)).onTransact();
        r5 = o.clearTid.onExtraCallback();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r4 = r4.IAuthTabCallback(new o.PersonalData.onNavigationEvent(r5, o.NetConverter3.onExtraCallback()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
        r4.onWarmupCompleted(new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda3(new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda2(r2))).onNavigationEvent(new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda5(new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda4(r0, r20, r1)), new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda7(new viva.republica.toss.common.web.message.handlers.cascraping.EncryptCertificateMessageHandler$.ExternalSyntheticLambda6(r20)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0141, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0143, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0144, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r0 = o.PersonalData.postMessage + 37;
        o.PersonalData.newSession = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r19, @org.jetbrains.annotations.NotNull o.setTopGuideBackgroundColor r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PersonalData.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor):void");
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = postMessage + 119;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = postMessage + 113;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(android.content.Context r26, o.setTopGuideBackgroundColor r27, java.lang.String r28, kotlin.Pair r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PersonalData.onExtraCallbackWithResult(android.content.Context, o.setTopGuideBackgroundColor, java.lang.String, kotlin.Pair):kotlin.Unit");
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 19;
        postMessage = i2 % 128;
        int i3 = i2 % 2;
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            int i4 = newSession + 17;
            postMessage = i4 % 128;
            int i5 = i4 % 2;
            localizedMessage = "";
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, localizedMessage, (String) null, (Map) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    private static final RSASSAPSSparams onExtraCallback(String str, List list) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        int i2 = postMessage + 97;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((RSASSAPSSparams) next).IAuthTabCallback(), str)) {
                int i4 = postMessage + 75;
                int i5 = i4 % 128;
                newSession = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 121;
                postMessage = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 / 5;
                }
            }
        }
        return (RSASSAPSSparams) next;
    }

    private static void c(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(extraCommand[i2 + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 59698), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10974 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(newSessionWithExtras), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - KeyEvent.keyCodeFromString("")), TextUtils.lastIndexOf("", '0') + 32, 20220 - Color.blue(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), TextUtils.getOffsetAfter("", 0) + 44, 1494 - TextUtils.getOffsetAfter("", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 29;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 4 % 4;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.green(0)), View.getDefaultSize(0, 0) + 44, 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i9 = $10 + 77;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static void d(byte b, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = newAuthTabSession;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 23139 - KeyEvent.getDeadChar(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(prefetch)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 26, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 23;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 91;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 7;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24823), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 74, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i13 = $10 + 107;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.getOffsetAfter("", 0) + 30, ((Process.getThreadPriority(0) + 20) >> 6) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        int i16 = $11 + 3;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        } else {
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Pair IAuthTabCallback(Function1 function1, Object obj) {
        return (Pair) onWarmupCompleted(-855253274, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 855253276, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{function1, obj});
    }

    private static final RSASSAPSSparams onWarmupCompleted(Function1 function1, Object obj) {
        return (RSASSAPSSparams) onWarmupCompleted(638658926, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -638658926, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{function1, obj});
    }

    private static final Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        return (Unit) onWarmupCompleted(-2065247673, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 2065247674, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{settopguidebackgroundcolor, th});
    }
}
