package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.sourceToViewX;
import o.unregisterFromInspector;
import o.vTranslateForSCenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.util.RRNUtils;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class vTranslateForSCenter {
    private static List<unregisterFromInspector> IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static int asInterface;
    public static final int onExtraCallback;
    public static final vTranslateForSCenter onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static loadScriptFromAssets onWarmupCompleted;
    private static final byte[] $$a = {70, -47, -65, 52};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = o.vTranslateForSCenter.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = r5 * 4
            int r5 = r5 + 97
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vTranslateForSCenter.$$c(int, byte, short):java.lang.String");
    }

    static {
        asInterface = 0;
        IAuthTabCallback();
        onExtraCallbackWithResult = new vTranslateForSCenter();
        onExtraCallback = 8;
        int i = asBinder + 37;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i4));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i4));
        int i13 = i2 + i4 + i3 + (1112421973 * i5) + ((-1897213938) * i);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i4) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i3) + ((-1446510592) * i5) + (892338176 * i) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i4 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i3 * 2010091741) + (i5 * (-1378896031)) + (i * 856652822) + (i14 * 563281920);
        if (i15 + (i16 * i16 * (-1077346304)) == 1) {
            return onNavigationEvent(objArr);
        }
        unregisterFromInspector unregisterfrominspector = (unregisterFromInspector) objArr[0];
        int i17 = 2 % 2;
        int i18 = onTransact + 5;
        IAuthTabCallbackStub = i18 % 128;
        int i19 = i18 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(unregisterfrominspector);
        int i20 = onTransact + 95;
        IAuthTabCallbackStub = i20 % 128;
        int i21 = i20 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    private vTranslateForSCenter() {
    }

    public final void onExtraCallbackWithResult(@Nullable loadScriptFromAssets loadscriptfromassets) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 87;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted = loadscriptfromassets;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final loadScriptFromAssets onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public final List<unregisterFromInspector> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        List<unregisterFromInspector> list = IAuthTabCallback;
        int i5 = i2 + 67;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void onWarmupCompleted(@Nullable List<unregisterFromInspector> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback = list;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }

    public final boolean onNavigationEvent() {
        boolean z;
        int i = 2 % 2;
        boolean z2 = IAuthTabCallback != null;
        if (onWarmupCompleted != null) {
            int i2 = IAuthTabCallbackStub + 121;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z2) {
            int i4 = onTransact + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (!z) {
                return false;
            }
        }
        int i6 = IAuthTabCallbackStub + 97;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 44 / 0;
        }
        return true;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        IAuthTabCallback = null;
        onWarmupCompleted = null;
        int i5 = i3 + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final sWidth onExtraCallback(@NotNull Context context, @NotNull loadScriptFromAssets loadscriptfromassets) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(loadscriptfromassets, "");
        RRNUtils rRNUtils = RRNUtils.onExtraCallback;
        createPaints createpaints = createPaints.IAuthTabCallback;
        String strOnNavigationEvent = rRNUtils.onNavigationEvent(createpaints.onNavigationEvent(), createpaints.onTransact());
        if (!onWarmupCompleted(createpaints.asBinder(), loadscriptfromassets.IAuthTabCallback().IAuthTabCallback())) {
            sourceToViewX.IAuthTabCallback iAuthTabCallback = sourceToViewX.Companion;
            sourceToViewX sourcetoviewx = sourceToViewX.FAMILY_RELATIONS_NAME_MATCH_FAILED;
            return new sWidth(sourcetoviewx, iAuthTabCallback.onExtraCallbackWithResult(context, sourcetoviewx, loadscriptfromassets));
        }
        if (!Intrinsics.areEqual(loadscriptfromassets.IAuthTabCallback().onExtraCallback(), strOnNavigationEvent)) {
            sourceToViewX.IAuthTabCallback iAuthTabCallback2 = sourceToViewX.Companion;
            sourceToViewX sourcetoviewx2 = sourceToViewX.FAMILY_RELATIONS_BIRTHDAY_MATCH_FAILED;
            return new sWidth(sourcetoviewx2, iAuthTabCallback2.onExtraCallbackWithResult(context, sourcetoviewx2, loadscriptfromassets));
        }
        Object obj = null;
        if (Intrinsics.areEqual(loadscriptfromassets.IAuthTabCallback().onNavigationEvent(), IAuthTabCallbackStub())) {
            sWidth swidth = new sWidth(sourceToViewX.CERTIFY_SUCCESS, null);
            int i2 = onTransact + 101;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return swidth;
        }
        sourceToViewX.IAuthTabCallback iAuthTabCallback3 = sourceToViewX.Companion;
        sourceToViewX sourcetoviewx3 = sourceToViewX.FAMILY_RELATIONS_GENDER_MATCH_FAILED;
        sWidth swidth2 = new sWidth(sourcetoviewx3, iAuthTabCallback3.onExtraCallbackWithResult(context, sourcetoviewx3, loadscriptfromassets));
        int i4 = onTransact + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return swidth2;
        }
        obj.hashCode();
        throw null;
    }

    private static final CharSequence onExtraCallbackWithResult(unregisterFromInspector unregisterfrominspector) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(unregisterfrominspector, "");
            unregisterfrominspector.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(unregisterfrominspector, "");
        String strOnExtraCallback = unregisterfrominspector.onExtraCallback();
        int i3 = IAuthTabCallbackStub + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallback;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 29;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59698), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - View.MeasureSpec.getSize(0)), 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20221 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.keyCodeFromString("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, View.MeasureSpec.getSize(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
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
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.getMode(0)), 16 - TextUtils.lastIndexOf("", '0', 0), 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16823350), TextUtils.getCapsMode("", 0, 0) + 31, 20220 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49123), (KeyEvent.getMaxKeyCode() >> 16) + 44, 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i8 = 44 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1493 - ImageFormat.getBitsPerPixel(0), -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        Object next;
        vTranslateForSCenter vtranslateforscenter = (vTranslateForSCenter) objArr[0];
        Context context = (Context) objArr[1];
        List list = (List) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        RRNUtils rRNUtils = RRNUtils.onExtraCallback;
        createPaints createpaints = createPaints.IAuthTabCallback;
        String strOnNavigationEvent = rRNUtils.onNavigationEvent(createpaints.onNavigationEvent(), createpaints.onTransact());
        List<unregisterFromInspector> list2 = list;
        for (unregisterFromInspector unregisterfrominspector : list2) {
            vTranslateForSCenter vtranslateforscenter2 = onExtraCallbackWithResult;
            if (vtranslateforscenter2.onWarmupCompleted(unregisterfrominspector.onExtraCallback(), createPaints.IAuthTabCallback.asBinder()) && Intrinsics.areEqual(unregisterfrominspector.onWarmupCompleted(), strOnNavigationEvent)) {
                int i4 = IAuthTabCallbackStub + 83;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                if (Intrinsics.areEqual(unregisterfrominspector.onExtraCallbackWithResult(), vtranslateforscenter2.IAuthTabCallbackStub()) && unregisterfrominspector.onNavigationEvent() == lambdadestroy0.CHILDREN) {
                    return new sWidth(sourceToViewX.CERTIFY_SUCCESS, null);
                }
            }
        }
        Iterator it = list2.iterator();
        int i6 = onTransact + 11;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (onExtraCallbackWithResult.onWarmupCompleted(((unregisterFromInspector) next).onExtraCallback(), createPaints.IAuthTabCallback.asBinder())) {
                break;
            }
        }
        unregisterFromInspector unregisterfrominspector2 = (unregisterFromInspector) next;
        if (unregisterfrominspector2 == null) {
            return new sWidth(sourceToViewX.HOUSE_HOLD_NAME_MATCH_FAILED, "주민등록등본의 이름 " + CollectionsKt.joinToString$default(list2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.UssGuestGuardianCertificateHelper$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                    return (CharSequence) vTranslateForSCenter.onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -175545159, new Object[]{(unregisterFromInspector) obj}, iOnExtraCallbackWithResult2, 175545159, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
                }
            }, 31, (Object) null) + "와 사용자가 입력한 이름 " + createPaints.IAuthTabCallback.asBinder() + "이 불일치합니다.");
        }
        if (!Intrinsics.areEqual(unregisterfrominspector2.onWarmupCompleted(), strOnNavigationEvent)) {
            sourceToViewX.IAuthTabCallback iAuthTabCallback = sourceToViewX.Companion;
            sourceToViewX sourcetoviewx = sourceToViewX.HOUSE_HOLD_BIRTHDAY_MATCH_FAILED;
            return new sWidth(sourcetoviewx, iAuthTabCallback.IAuthTabCallback(context, sourcetoviewx, unregisterfrominspector2));
        }
        if (!Intrinsics.areEqual(unregisterfrominspector2.onExtraCallbackWithResult(), vtranslateforscenter.IAuthTabCallbackStub())) {
            return new sWidth(sourceToViewX.HOUSE_HOLD_GENDER_MATCH_FAILED, sourceToViewX.Companion.IAuthTabCallback(context, sourceToViewX.HOUSE_HOLD_BIRTHDAY_MATCH_FAILED, unregisterfrominspector2));
        }
        if (unregisterfrominspector2.onNavigationEvent() != lambdadestroy0.CHILDREN) {
            return null;
        }
        sourceToViewX.IAuthTabCallback iAuthTabCallback2 = sourceToViewX.Companion;
        sourceToViewX sourcetoviewx2 = sourceToViewX.HOUSE_HOLD_NOT_CHILDREN;
        return new sWidth(sourcetoviewx2, iAuthTabCallback2.IAuthTabCallback(context, sourcetoviewx2, unregisterfrominspector2));
    }

    private final boolean onWarmupCompleted(String str, String str2) {
        boolean z;
        int i;
        Object obj;
        String strReplace$default;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            strReplace$default = StringsKt.replace$default(str, " ", "", false, 5, (Object) null);
            str3 = " ";
            str4 = "";
            z = true;
            i = 5;
            obj = null;
        } else {
            z = false;
            i = 4;
            obj = null;
            strReplace$default = StringsKt.replace$default(str, " ", "", false, 4, (Object) null);
            str3 = " ";
            str4 = "";
        }
        boolean zAreEqual = Intrinsics.areEqual(strReplace$default, StringsKt.replace$default(str2, str3, str4, z, i, obj));
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1.equals("4") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r1.equals(((java.lang.String) r5[0]).intern()) != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1.equals("8") == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String IAuthTabCallbackStub() throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            o.createPaints r1 = o.createPaints.IAuthTabCallback
            java.lang.String r1 = r1.onTransact()
            int r2 = r1.hashCode()
            r3 = 48
            r4 = 0
            java.lang.String r6 = ""
            r7 = 1
            r8 = 0
            switch(r2) {
                case 49: goto L96;
                case 50: goto L5d;
                case 51: goto L54;
                case 52: goto L4b;
                case 53: goto L41;
                case 54: goto L2e;
                case 55: goto L24;
                case 56: goto L1a;
                default: goto L18;
            }
        L18:
            goto Lbf
        L1a:
            java.lang.String r2 = "8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L85
            goto Lbf
        L24:
            java.lang.String r2 = "7"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbc
            goto Lbf
        L2e:
            java.lang.String r2 = "6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L85
            int r1 = o.vTranslateForSCenter.onTransact
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.vTranslateForSCenter.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            goto Lbf
        L41:
            java.lang.String r2 = "5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbc
            goto Lbf
        L4b:
            java.lang.String r2 = "4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L85
            goto Lbf
        L54:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbc
            goto Lbf
        L5d:
            int r2 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r2 = r2 >> 16
            int r3 = android.text.TextUtils.lastIndexOf(r6, r3, r8, r8)
            int r3 = -r3
            long r9 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            int r4 = r4 + 30790
            char r4 = (char) r4
            java.lang.Object[] r5 = new java.lang.Object[r7]
            a(r2, r3, r4, r5)
            r2 = r5[r8]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            boolean r1 = r1.equals(r2)
            if (r1 == r7) goto L85
            goto Lbf
        L85:
            int r1 = o.vTranslateForSCenter.IAuthTabCallbackStub
            int r1 = r1 + 45
            int r2 = r1 % 128
            o.vTranslateForSCenter.onTransact = r2
            int r1 = r1 % r0
            java.lang.String r0 = "FEMALE"
            if (r1 != 0) goto L95
            r1 = 80
            int r1 = r1 / r8
        L95:
            return r0
        L96:
            int r2 = android.graphics.drawable.Drawable.resolveOpacity(r8, r8)
            int r2 = r2 + r7
            long r9 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            int r3 = android.text.TextUtils.lastIndexOf(r6, r3, r8)
            int r3 = 15477 - r3
            char r3 = (char) r3
            java.lang.Object[] r5 = new java.lang.Object[r7]
            a(r2, r4, r3, r5)
            r2 = r5[r8]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbc
            goto Lbf
        Lbc:
            java.lang.String r0 = "MALE"
            return r0
        Lbf:
            int r1 = o.vTranslateForSCenter.onTransact
            int r1 = r1 + 95
            int r2 = r1 % 128
            o.vTranslateForSCenter.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vTranslateForSCenter.IAuthTabCallbackStub():java.lang.String");
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(unregisterFromInspector unregisterfrominspector) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (CharSequence) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -175545159, new Object[]{unregisterfrominspector}, iOnExtraCallbackWithResult2, 175545159, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    public final sWidth IAuthTabCallback(@NotNull Context context, @NotNull List<unregisterFromInspector> list) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (sWidth) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -842940236, new Object[]{this, context, list}, iOnExtraCallbackWithResult2, 842940237, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new char[]{38305, 53651};
        IAuthTabCallbackDefault = -365301544946305688L;
    }
}
