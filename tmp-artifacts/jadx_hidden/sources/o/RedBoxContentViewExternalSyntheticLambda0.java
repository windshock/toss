package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.PKCS58;
import o.bindContext;
import o.s3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class RedBoxContentViewExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final RedBoxContentViewExternalSyntheticLambda0 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static char[] onExtraCallback = null;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 12, ((Process.getThreadPriority(0) + 20) >> 6) + 2, new char[]{'\f', 65534, 65531, 14, 6, '\t', 65531, 65526, 65531, 65532, 65529}, false, 267 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        IAuthTabCallback = new RedBoxContentViewExternalSyntheticLambda0();
        int i = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = ~i3;
        int i12 = i9 | (~(i11 | i));
        int i13 = (~(i4 | i7 | i3)) | (~(i8 | i11 | i7));
        int i14 = i + i3 + i5 + ((-619979367) * i6) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = (i * 561304900) + 382271488 + (561304900 * i3) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i5) + (1615200256 * i6) + ((-1821507584) * i2) + (428933120 * i15);
        int i17 = ((i * (-96142684)) - 56799437) + (i3 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i5 * (-96141863)) + (i6 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
        return i16 + ((i17 * i17) * (-1369505792)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private RedBoxContentViewExternalSyntheticLambda0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(RedBoxContentViewExternalSyntheticLambda0 redBoxContentViewExternalSyntheticLambda0, Context context, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 79;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                access8100.onNavigationEvent();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            map = access8100.onNavigationEvent();
        }
        redBoxContentViewExternalSyntheticLambda0.onExtraCallback(context, str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallback(@org.jetbrains.annotations.Nullable android.content.Context r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r23) {
        /*
            r20 = this;
            r10 = r22
            r0 = r23
            r11 = 2
            int r1 = r11 % r11
            int r1 = o.RedBoxContentViewExternalSyntheticLambda0.onTransact
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.RedBoxContentViewExternalSyntheticLambda0.asBinder = r2
            int r1 = r1 % r11
            r12 = 0
            java.lang.String r2 = ""
            if (r1 != 0) goto La8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r1 = r20.onNavigationEvent()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L27
            r13 = r20
            goto La7
        L27:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L7a
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult     // Catch: java.lang.Throwable -> L7a
            r13 = r20
            r3 = r21
            java.util.Map r4 = r13.onExtraCallback(r3, r0)     // Catch: java.lang.Throwable -> L78
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch: java.lang.Throwable -> L78
            int r0 = r0 >> 16
            r3 = 11
            int r14 = 11 - r0
            r5 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionChild(r5)     // Catch: java.lang.Throwable -> L78
            int r15 = r0 + 3
            char[] r0 = new char[r3]     // Catch: java.lang.Throwable -> L78
            r0 = {x00b8: FILL_ARRAY_DATA , data: [12, -2, -5, 14, 6, 9, -5, -10, -5, -4, -7} // fill-array     // Catch: java.lang.Throwable -> L78
            r17 = 0
            r3 = 0
            int r5 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)     // Catch: java.lang.Throwable -> L78
            int r5 = r5 + 268
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L78
            r16 = r0
            r18 = r5
            r19 = r2
            a(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L78
            r0 = r2[r3]     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r0.intern()     // Catch: java.lang.Throwable -> L78
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 56
            r9 = 0
            r3 = r22
            o.ConvertFloatArrayToByteArray.onExtraCallback(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L78
            goto L87
        L78:
            r0 = move-exception
            goto L7d
        L7a:
            r0 = move-exception
            r13 = r20
        L7d:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        L87:
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            if (r0 == 0) goto La7
            int r1 = o.RedBoxContentViewExternalSyntheticLambda0.onTransact
            int r1 = r1 + 75
            int r2 = r1 % 128
            o.RedBoxContentViewExternalSyntheticLambda0.asBinder = r2
            int r1 = r1 % r11
            if (r1 != 0) goto L9e
            o.RedBoxContentViewExternalSyntheticLambda0 r1 = o.RedBoxContentViewExternalSyntheticLambda0.IAuthTabCallback
            r1.IAuthTabCallback(r10, r0)
            goto La7
        L9e:
            o.RedBoxContentViewExternalSyntheticLambda0 r1 = o.RedBoxContentViewExternalSyntheticLambda0.IAuthTabCallback
            r1.IAuthTabCallback(r10, r0)
            r12.hashCode()
            throw r12
        La7:
            return
        La8:
            r13 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r20.onNavigationEvent()
            r12.hashCode()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RedBoxContentViewExternalSyntheticLambda0.onExtraCallback(android.content.Context, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWarmupCompleted(RedBoxContentViewExternalSyntheticLambda0 redBoxContentViewExternalSyntheticLambda0, Context context, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onTransact + 119;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                map = access8100.onNavigationEvent();
                int i4 = 84 / 0;
            } else {
                map = access8100.onNavigationEvent();
            }
            int i5 = onTransact + 83;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        redBoxContentViewExternalSyntheticLambda0.onExtraCallbackWithResult(context, str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable android.content.Context r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r21) {
        /*
            r18 = this;
            r8 = r20
            r0 = r21
            r9 = 2
            int r1 = r9 % r9
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r18.onNavigationEvent()
            r10 = 1
            if (r1 == r10) goto L1a
            r11 = r18
            goto L90
        L1a:
            int r1 = o.RedBoxContentViewExternalSyntheticLambda0.asBinder
            int r1 = r1 + 55
            int r2 = r1 % 128
            o.RedBoxContentViewExternalSyntheticLambda0.onTransact = r2
            int r1 = r1 % r9
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L70
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult     // Catch: java.lang.Throwable -> L70
            r11 = r18
            r2 = r19
            java.util.Map r5 = r11.onExtraCallback(r2, r0)     // Catch: java.lang.Throwable -> L6e
            r0 = 0
            int r2 = android.view.View.getDefaultSize(r0, r0)     // Catch: java.lang.Throwable -> L6e
            r3 = 11
            int r12 = r2 + 11
            int r2 = android.graphics.Color.red(r0)     // Catch: java.lang.Throwable -> L6e
            int r13 = 2 - r2
            char[] r14 = new char[r3]     // Catch: java.lang.Throwable -> L6e
            r14 = {x0092: FILL_ARRAY_DATA , data: [12, -2, -5, 14, 6, 9, -5, -10, -5, -4, -7} // fill-array     // Catch: java.lang.Throwable -> L6e
            r15 = 0
            long r2 = android.widget.ExpandableListView.getPackedPositionForChild(r0, r0)     // Catch: java.lang.Throwable -> L6e
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            int r2 = 267 - r2
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L6e
            r16 = r2
            r17 = r3
            a(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L6e
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r0.intern()     // Catch: java.lang.Throwable -> L6e
            r4 = 0
            r6 = 4
            r7 = 0
            r3 = r20
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L6e
            goto L85
        L6e:
            r0 = move-exception
            goto L73
        L70:
            r0 = move-exception
            r11 = r18
        L73:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            int r1 = o.RedBoxContentViewExternalSyntheticLambda0.asBinder
            int r1 = r1 + r10
            int r2 = r1 % 128
            o.RedBoxContentViewExternalSyntheticLambda0.onTransact = r2
            int r1 = r1 % r9
        L85:
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            if (r0 == 0) goto L90
            o.RedBoxContentViewExternalSyntheticLambda0 r1 = o.RedBoxContentViewExternalSyntheticLambda0.IAuthTabCallback
            r1.IAuthTabCallback(r8, r0)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RedBoxContentViewExternalSyntheticLambda0.onExtraCallbackWithResult(android.content.Context, java.lang.String, java.util.Map):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RedBoxContentViewExternalSyntheticLambda0 redBoxContentViewExternalSyntheticLambda0 = (RedBoxContentViewExternalSyntheticLambda0) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Object[] objArr2 = new Object[1];
        a(15 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 11 - Color.blue(0), new char[]{3, 65498, 5, 6, 0, 11, 7, 65532, 65530, 15, 65532, '\n', '\n', 65528}, true, KeyEvent.normalizeMetaState(0) + 268, objArr2);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), th.getClass().getSimpleName());
        Object[] objArr3 = new Object[1];
        b((byte) (KeyEvent.normalizeMetaState(0) + 100), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\t', 25, 19, '\r', 30, 19, '\"', 17, 20, 7, 6, 24, '\b', '\n', '\r', 4, 13895}, objArr3);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), redBoxContentViewExternalSyntheticLambda0.onWarmupCompleted(th))});
        int i4 = onTransact + 111;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return mapOnWarmupCompleted;
    }

    public final String onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        if (j <= 0) {
            int i2 = onTransact + 1;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((byte) (Color.red(0) + 66), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, new char[]{'\t', 25, ' ', 30, 7, '\r', 13888}, objArr);
            return ((String) objArr[0]).intern();
        }
        if (j < 60000) {
            int i4 = asBinder + 25;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr2 = new Object[1];
            b((byte) (33 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 4 - View.getDefaultSize(0, 0), new char[]{'\b', 30, 29, 14}, objArr2);
            return ((String) objArr2[0]).intern();
        }
        if (j < 300000) {
            Object[] objArr3 = new Object[1];
            b((byte) (9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, new char[]{' ', 2, 29, 23}, objArr3);
            return ((String) objArr3[0]).intern();
        }
        Object[] objArr4 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 4, 2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{')', 65511, 65521}, false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 230, objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        int i6 = onTransact + 123;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Map<String, String> onExtraCallback(Context context, Map<String, ? extends Object> map) {
        Map.Entry<String, ? extends Object> next;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ? extends Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = onTransact + 31;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                int i3 = 16 / 0;
                if (next.getValue() != null) {
                    int i4 = onTransact + 51;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            } else {
                next = it.next();
                if (next.getValue() != null) {
                    int i42 = onTransact + 51;
                    asBinder = i42 % 128;
                    int i52 = i42 % 2;
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(access8100.IAuthTabCallback(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(linkedHashMap2);
        Object[] objArr = new Object[1];
        a(11 - Color.alpha(0), (-16777215) - Color.rgb(0, 0, 0), new char[]{65530, 5, 7, 4, 65528, 65530, '\b', '\b', 65513, 14, 5}, false, 270 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        mapOnWarmupCompleted.putIfAbsent(((String) objArr[0]).intern(), IAuthTabCallback(context));
        return mapOnWarmupCompleted;
    }

    private final String IAuthTabCallback(Context context) {
        Context applicationContext;
        RememberLottieCompositionKtloadFontsFromAssets2 rememberLottieCompositionKtloadFontsFromAssets2;
        String str;
        int i = 2 % 2;
        if (context != null) {
            int i2 = asBinder + 9;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                context.getApplicationContext();
                throw null;
            }
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        if (applicationContext instanceof RememberLottieCompositionKtloadFontsFromAssets2) {
            int i3 = asBinder + 123;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                rememberLottieCompositionKtloadFontsFromAssets2 = (RememberLottieCompositionKtloadFontsFromAssets2) applicationContext;
                int i4 = 71 / 0;
            } else {
                rememberLottieCompositionKtloadFontsFromAssets2 = (RememberLottieCompositionKtloadFontsFromAssets2) applicationContext;
            }
        } else {
            rememberLottieCompositionKtloadFontsFromAssets2 = null;
        }
        if (rememberLottieCompositionKtloadFontsFromAssets2 != null) {
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            str = (String) RememberLottieCompositionKtloadFontsFromAssets2.onExtraCallbackWithResult(-1556913437, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1556913438, new Object[]{rememberLottieCompositionKtloadFontsFromAssets2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), iIAuthTabCallback);
        } else {
            str = null;
        }
        if (rememberLottieCompositionKtloadFontsFromAssets2 != null && rememberLottieCompositionKtloadFontsFromAssets2.ITrustedWebActivityCallbackStub()) {
            Object[] objArr = new Object[1];
            b((byte) (MotionEvent.axisFromString("") + 105), ExpandableListView.getPackedPositionGroup(0L) + 4, new char[]{'\f', 5, 31, 23}, objArr);
            return ((String) objArr[0]).intern();
        }
        if (str != null) {
            int i5 = onTransact + 69;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            a((Process.myPid() >> 22) + 10, 3 - (Process.myTid() >> 22), new char[]{'\t', 14, 65535, 65492, '\f', '\b', 65529, '\f', 65535, 7}, false, TextUtils.lastIndexOf("", '0', 0, 0) + 266, objArr2);
            if (StringsKt.endsWith$default(str, ((String) objArr2[0]).intern(), false, 2, (Object) null)) {
                int i7 = asBinder + 87;
                onTransact = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    b((byte) (16 % (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 54 % (ViewConfiguration.getTouchSlop() >>> 24), new char[]{7, 25, 3, 2, 11, '\r', '\f', 22, 13947}, objArr3);
                    return ((String) objArr3[0]).intern();
                }
                Object[] objArr4 = new Object[1];
                b((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 123), (ViewConfiguration.getTouchSlop() >> 8) + 9, new char[]{7, 25, 3, 2, 11, '\r', '\f', 22, 13947}, objArr4);
                return ((String) objArr4[0]).intern();
            }
        }
        if (str != null) {
            int i8 = onTransact + 89;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            if (!StringsKt.isBlank(str)) {
                Object[] objArr5 = new Object[1];
                a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, new char[]{2, 5, 65528, 65531, 7}, true, Color.blue(0) + 272, objArr5);
                return ((String) objArr5[0]).intern();
            }
        }
        Object[] objArr6 = new Object[1];
        b((byte) (45 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 7 - KeyEvent.getDeadChar(0, 0), new char[]{1, 21, '\r', 20, 15, '\"', 13857}, objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        int i10 = asBinder + 125;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        return ((java.lang.String) r15[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if ((r15 instanceof java.lang.SecurityException) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (android.widget.ExpandableListView.getPackedPositionChild(0) + 21), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, new char[]{1, '\n', 15, 1, 5, 31, 19, 24}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
        r10 = new java.lang.Object[1];
        b((byte) (android.widget.ExpandableListView.getPackedPositionGroup(0) + 14), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, new char[]{31, 6, 21, 30, '\r', 4, 13823}, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        if (kotlin.text.StringsKt.contains(r3, ((java.lang.String) r10[0]).intern(), true) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        r15 = o.RedBoxContentViewExternalSyntheticLambda0.asBinder + 65;
        o.RedBoxContentViewExternalSyntheticLambda0.onTransact = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if ((r15 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (101 - android.graphics.Color.green(1)), 111 - android.os.Process.getGidForName(""), new char[]{25, '\r', 21, 30, '\r', 4, 13822}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ec, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (13 - android.graphics.Color.green(0)), 6 - android.os.Process.getGidForName(""), new char[]{25, '\r', 21, 30, '\r', 4, 13822}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010b, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010c, code lost:
    
        r15 = new java.lang.Object[1];
        a(4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2 - android.text.TextUtils.lastIndexOf("", '0'), new char[]{'\f', '\f', 65504, '\b'}, true, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 267, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x013c, code lost:
    
        if (kotlin.text.StringsKt.contains(r3, ((java.lang.String) r15[0]).intern(), true) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013e, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (14 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 7 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{25, '\r', 21, 30, '\r', 4, 13822}, r1);
        r15 = ((java.lang.String) r1[0]).intern();
        r0 = o.RedBoxContentViewExternalSyntheticLambda0.onTransact + 47;
        o.RedBoxContentViewExternalSyntheticLambda0.asBinder = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x016b, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016c, code lost:
    
        r15 = new java.lang.Object[1];
        a(android.graphics.Color.rgb(0, 0, 0) + 16777227, android.widget.ExpandableListView.getPackedPositionGroup(0) + 3, new char[]{65506, 65516, 65510, 11, '\f', 6, 17, '\r', 2, 0, 21}, true, 262 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019d, code lost:
    
        if (kotlin.text.StringsKt.contains(r3, ((java.lang.String) r15[0]).intern(), true) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x019f, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (android.widget.ExpandableListView.getPackedPositionType(0) + 13), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7, new char[]{25, '\r', 21, 30, '\r', 4, 13822}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01c1, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c2, code lost:
    
        r1 = new java.lang.Object[1];
        b((byte) (44 - android.graphics.ImageFormat.getBitsPerPixel(0)), android.graphics.Color.rgb(0, 0, 0) + 16777223, new char[]{1, 21, '\r', 20, 15, '\"', 13857}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e3, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if ((r15 instanceof viva.republica.toss.tossjni.dword.DwordException) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if ((r15 instanceof viva.republica.toss.tossjni.dword.DwordException) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r15 = o.RedBoxContentViewExternalSyntheticLambda0.onTransact + 125;
        o.RedBoxContentViewExternalSyntheticLambda0.asBinder = r15 % 128;
        r15 = r15 % 2;
        r15 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 5, 4 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{11, 3, 6, 65528, 65528}, false, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 271, r15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RedBoxContentViewExternalSyntheticLambda0.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    private final boolean onNavigationEvent() {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(DERSet.onExtraCallback.ICustomTabsCallback_Parcel()));
            int i2 = asBinder + 55;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 5;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            int i4 = onTransact + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }

    private final void IAuthTabCallback(String str, Throwable th) {
        int i = 2 % 2;
        RedBoxContentViewreportCompletedListener1.IAuthTabCallback();
        th.getClass().getSimpleName();
        Object[] objArr = new Object[1];
        b((byte) (34 - ((byte) KeyEvent.getModifierMetaStateMask())), ((byte) KeyEvent.getModifierMetaStateMask()) + 42, new char[]{18, 2, 30, 29, '\t', '\r', 24, 22, 22, '\"', 31, 3, 30, 23, '\n', 25, 21, 3, '\r', 4, 16, 27, '\r', '\t', '\t', 5, '\n', 27, 28, '\f', 15, 27, 29, 16, '\n', 1, 5, 1, '\n', '\b', 13770}, objArr);
        ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, AndroidCharacter.getMirror('0') - ',', new char[]{'\"', ' ', 18, 65514, 65497, 65485, 16, 14}, false, 246 - View.MeasureSpec.getSize(0), objArr2);
        ((String) objArr2[0]).intern();
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i7] = bindContext.access000.g(cArr2[i7], onNavigationEvent);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i8 = $10 + 93;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr3;
        int length;
        char[] cArr4;
        int i6;
        int i7 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr5 = onExtraCallback;
        int i8 = 0;
        int i9 = 1;
        if (cArr5 != null) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 1;
            } else {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 0;
            }
            while (i6 < length) {
                cArr4[i6] = PKCS58.onNavigationEvent.z(cArr5[i6]);
                i6++;
                int i11 = $11 + 21;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = $10 + 77;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        } else {
            cArr2 = cArr5;
        }
        char cZ = PKCS58.onNavigationEvent.z(onExtraCallbackWithResult);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i15 = i - 1;
            cArr6[i15] = (char) (cArr[i15] - b);
            i2 = i15;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i9] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i9;
                    i5 = i8;
                } else {
                    i3 = i2;
                    char[] cArr7 = cArr6;
                    i4 = i9;
                    i5 = i8;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i16 = $11 + 87;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3 = cArr7;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                    } else {
                        cArr3 = cArr7;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i19 = $11 + 81;
                            $10 = i19 % 128;
                            int i20 = i19 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i22 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i21];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i22];
                        } else {
                            int i23 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i24 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i23];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i24];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i2 = i3;
                i9 = i4;
                i8 = i5;
            }
        }
        char[] cArr8 = cArr6;
        int i25 = i8;
        int i26 = i25;
        while (i26 < i) {
            int i27 = $11 + 35;
            $10 = i27 % 128;
            if (i27 % 2 != 0) {
                cArr8[i26] = (char) (cArr8[i26] ^ 30663);
                i26 += 125;
            } else {
                cArr8[i26] = (char) (cArr8[i26] ^ 13722);
                i26++;
            }
        }
        objArr[i25] = new String(cArr8);
    }

    private final String onWarmupCompleted(Throwable th) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onNavigationEvent(-1726847659, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, th}, 1726847659, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    public final Map<String, Object> onExtraCallbackWithResult(@NotNull Throwable th) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Map) onNavigationEvent(-1924238647, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, th}, 1924238648, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = 478309002;
        onExtraCallback = new char[]{64978, 64961, 65004, 64966, 64960, 65067, 64899, 64982, 65008, 64980, 65069, 64977, 65066, 64976, 64984, 64983, 64988, 64990, 64967, 64989, 64981, 64925, 65065, 64902, 64991, 64970, 64898, 64971, 64915, 65064, 65021, 64963, 64926, 64964, 64910, 64986};
        onExtraCallbackWithResult = (char) 51247;
    }
}
