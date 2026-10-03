package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.PageAnimStore;
import o.TimelineExternalSyntheticLambda1;
import o.filterCreatePageParams;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestPedometerPermissionHandler implements ALCFaceQuality {
    public static final Companion Companion;
    private static char IAuthTabCallback;
    private static char IAuthTabCallbackStub;
    private static int asInterface;
    private static final String onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static char onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {115, -125, 45, -41};
    private static final int $$b = 189;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 97
            byte[] r1 = viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler.$$c(short, int, byte):java.lang.String");
    }

    static {
        asInterface = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollDefaultDelay() >> 16, 39 - View.resolveSizeAndState(0, 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 32095), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new Companion(null);
        int i = getInterfaceDescriptor + 75;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2054581487, new Object[]{function1, obj}, iOnNavigationEvent, -2054581486, iOnNavigationEvent3);
            throw null;
        }
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent5 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent6 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent5, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2054581487, new Object[]{function1, obj}, iOnNavigationEvent4, -2054581486, iOnNavigationEvent6);
        int i3 = asBinder + 41;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 758182560, new Object[]{dialogInterface}, iOnNavigationEvent, -758182560, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackDefault + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, dialogInterface);
        int i4 = asBinder + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, String str4, FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, str3, str4, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestPedometerPermissionHandler requestPedometerPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(requestPedometerPermissionHandler, setonoutofmemeryerrorcallback, th);
        }
        onNavigationEvent(requestPedometerPermissionHandler, setonoutofmemeryerrorcallback, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i7 | i3;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i3));
        int i11 = (~(i4 | i3)) | (~(i7 | i4));
        int i12 = i9 | i8;
        int i13 = i3 + i5 + i + (988256597 * i6) + ((-695401848) * i2);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i3) - 1270611968) + ((-1462879173) * i5) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i) + (479985664 * i6) + (1063256064 * i2) + (1273561088 * i14);
        int i16 = (i3 * (-1367684995)) + 376186498 + (i5 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i * (-1367684709)) + (i6 * 1512018807) + (i2 * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function0, dialogInterface};
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent2, iOnNavigationEvent4, -988340230, objArr, iOnNavigationEvent, 988340233, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackDefault + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i3 = IAuthTabCallbackDefault + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = asBinder + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(RequestPedometerPermissionHandler requestPedometerPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(requestPedometerPermissionHandler, setonoutofmemeryerrorcallback);
        int i4 = IAuthTabCallbackDefault + 125;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, RequestPedometerPermissionHandler requestPedometerPermissionHandler, boolean z2, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, String str3, String str4, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, setonoutofmemeryerrorcallback, requestPedometerPermissionHandler, z2, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, str2, str3, str4, shouldbekeptaschild);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return unitOnExtraCallback;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackDefault + 65;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = asBinder + 83;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new RequestPedometerPermissionHandler$.ExternalSyntheticLambda0());
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zIAuthTabCallback = filterCreatePageParams.IAuthTabCallback(Uri.parse(str));
        int i4 = asBinder + 85;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 113;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            i3 = -1401950695;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i9])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 59698), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, 10973 - (ViewConfiguration.getJumpTapTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 46134), 31 - (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49122), 44 - TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i3 = -1401950695;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i12 = $10 + 87;
        $11 = i12 % 128;
        if (i12 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onNavigationEvent(RequestPedometerPermissionHandler requestPedometerPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        requestPedometerPermissionHandler.onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r5
      0x0033: PHI (r5v23 o.ConvertFloatArrayToByteArray) = (r5v5 o.ConvertFloatArrayToByteArray), (r5v24 o.ConvertFloatArrayToByteArray) binds: [B:10:0x0031, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[PHI: r5
      0x004f: PHI (r5v6 o.ConvertFloatArrayToByteArray) = (r5v5 o.ConvertFloatArrayToByteArray), (r5v24 o.ConvertFloatArrayToByteArray) binds: [B:10:0x0031, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(boolean r21, o.setOnOutOfMemeryErrorCallback r22, viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler r23, boolean r24, o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, o.shouldBeKeptAsChild r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler.onExtraCallback(boolean, o.setOnOutOfMemeryErrorCallback, viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler, boolean, o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.shouldBeKeptAsChild):kotlin.Unit");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onNavigationEvent(RequestPedometerPermissionHandler requestPedometerPermissionHandler, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            requestPedometerPermissionHandler.onExtraCallback(setonoutofmemeryerrorcallback);
            return Unit.INSTANCE;
        }
        requestPedometerPermissionHandler.onExtraCallback(setonoutofmemeryerrorcallback);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r23, @org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r25, @org.jetbrains.annotations.NotNull o.setOnOutOfMemeryErrorCallback r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestPedometerPermissionHandler.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.lang.String, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $11 + 7;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 11;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                        int iRgb = Color.rgb(0, 0, 0) + 16789650;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, touchSlop, iRgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 9 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    int i13 = $10 + 47;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 3;
                    }
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 16015), 14 - TextUtils.getOffsetBefore("", 0), 19901 - TextUtils.indexOf("", "", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, String str, String str2, String str3, String str4, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            return;
        }
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(activity, new RequestPedometerPermissionHandler$.ExternalSyntheticLambda8(str, str2, str4, str3, activity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, function0));
        int i4 = IAuthTabCallbackDefault + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        b(new char[]{34420, 59100, 41659, 29016, 39232, 19758, 7721, 35617, 19808, 31460, 22702, 19374, 40362, 35279, 9773, 59224, 13731, 1525, 18441, 40961, 46215, 18768, 18904, 50008, 25577, 25523, 26192, 14776, 31849, 43996, 58359, 34203, 56543, 34444, 21666, 33215, 4450, 18794, 58359, 34203, 25577, 25523, 44622, 60833, 51575, 57505}, 45 - View.MeasureSpec.getSize(0), objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = fragmentActivity.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 88, 9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 7001, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        int i3 = 95 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, String str3, String str4, FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str3, (TdsButtonV1View.asInterface) null, false, new RequestPedometerPermissionHandler$.ExternalSyntheticLambda5(fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str4, (TdsButtonV1View.asInterface) null, false, new RequestPedometerPermissionHandler$.ExternalSyntheticLambda6(), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new RequestPedometerPermissionHandler$.ExternalSyntheticLambda7(function0));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return unit;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        Context context;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i != 7001 || (context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext()) == null) {
            return;
        }
        int i4 = asBinder + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        if (!((Boolean) onExtraCallbackWithResult(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 392700889, new Object[]{this, context}, iOnNavigationEvent, -392700887, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent())).booleanValue()) {
            onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
            return;
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        int i6 = IAuthTabCallbackDefault + 101;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(new char[]{1147, 45586, 18885, 24125, 59959, 12464}, TextUtils.indexOf("", "", 0, 0) + 6, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = asBinder + 111;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    private final void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(78 - (ViewConfiguration.getLongPressTimeout() >> 16), 10 - View.MeasureSpec.getMode(0), (char) Gravity.getAbsoluteGravity(0, 0), objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        int i4 = IAuthTabCallbackDefault + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(ViewConfiguration.getTapTimeout() >> 16, 39 - View.MeasureSpec.getSize(0), (char) (32094 - View.resolveSizeAndState(0, 0, 0)), objArr2);
        if (ContextCompat.checkSelfPermission(context, ((String) objArr2[0]).intern()) != 0) {
            return false;
        }
        int i4 = asBinder + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean IAuthTabCallback(Context context) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return ((Boolean) onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 392700889, new Object[]{this, context}, iOnNavigationEvent, -392700887, iOnNavigationEvent3)).booleanValue();
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 2054581487, new Object[]{function1, obj}, iOnNavigationEvent, -2054581486, iOnNavigationEvent3);
    }

    private static final Unit onNavigationEvent(DialogInterface dialogInterface) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 758182560, new Object[]{dialogInterface}, iOnNavigationEvent, -758182560, iOnNavigationEvent3);
    }

    private static final Unit onWarmupCompleted(Function0 function0, DialogInterface dialogInterface) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -988340230, new Object[]{function0, dialogInterface}, iOnNavigationEvent, 988340233, iOnNavigationEvent3);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{37099, 45385, 54196, 62975, 5713, 14466, 23264, 31519, 40338, 49146, 49210, 57992, 1279, 9520, 18319, 27072, 35381, 44185, 52878, 61212, 12621, 21487, 29725, 38487, 47355, 55611, 64321, 7658, 15924, 16470, 25231, 33590, 42349, 51081, 59449, 2681, 11415, 20164, 28522, 51550, 59623, 35345, 44112, 20452, 24876, 856, 8958, 50226, 58958, 60850, 52240, 44794, 35005, 27397, 17862, 10153, 1615, 57565, 49826, 48501, 40926, 31163, 22638, 14978, 5253, 63329, 53720, 45963, 37478, 19491, 11921, 2346, 60205, 50569, 42050, 34355, 24711, 17228, 60838, 52252, 44797, 34983, 27410, 17884, 10169, 1563, 57561, 49829, 60836, 52248, 44781, 35000, 27393, 17874, 10175, 1621, 46145, 38395, 63257, 53617, 13055, 7223, 32320, 24572};
        onWarmupCompleted = -6666946020839076743L;
        onExtraCallbackWithResult = (char) 46337;
        IAuthTabCallback = (char) 41615;
        onTransact = (char) 52312;
        IAuthTabCallbackStub = (char) 63566;
    }
}
