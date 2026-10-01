package o;

import android.content.Context;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.safetynet.HarmfulAppsData;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.EngineConfig1;
import o.s5a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s6 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static long onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    public static final s6 onWarmupCompleted;

    static final class onExtraCallback extends ContinuationImpl {
        static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallback.class);
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 & Integer.MIN_VALUE) | (i2 ^ Integer.MIN_VALUE);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
            Object objOnExtraCallbackWithResult = s6.this.onExtraCallbackWithResult((Context) null, false, (access13800<? super List<? extends HarmfulAppsData>>) this);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onExtraCallbackWithResult.class);
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 21) & 1;
            Object obj2 = null;
            this.result = obj;
            if (i3 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i4 = this.label;
            int i5 = (Integer.MAX_VALUE & i4) | ((~i4) & Integer.MIN_VALUE);
            int i6 = i4 & Integer.MIN_VALUE;
            this.label = (i6 & i5) | (i5 ^ i6);
            Object objOnWarmupCompleted = s6.onWarmupCompleted(s6.this, null, this);
            int i7 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
            int i8 = (~iOnWarmupCompleted2) & i7;
            int i9 = (~i7) & iOnWarmupCompleted2;
            if (((((i9 & i8) | (i8 ^ i9)) >> 15) & 1) != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 5) & 1;
            Object obj2 = null;
            this.result = obj;
            int i4 = this.label;
            if (i3 == 0) {
                this.label = (i4 & Integer.MIN_VALUE) | (i4 ^ Integer.MIN_VALUE);
                obj2.hashCode();
                throw null;
            }
            this.label = (i4 & Integer.MIN_VALUE) | (i4 ^ Integer.MIN_VALUE);
            Object objOnExtraCallbackWithResult = s6.onExtraCallbackWithResult(s6.this, (Context) null, (access13800) this);
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
            if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 4) & 1) == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getEdgeSlop() >> 16, 9 - KeyEvent.getDeadChar(0, 0), (char) (27621 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        onWarmupCompleted = new s6();
        int i = asInterface + 87;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private s6() {
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(s6 s6Var, Context context, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = s6Var.onNavigationEvent(context, access13800Var);
        int i4 = IAuthTabCallbackStub + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onWarmupCompleted(s6 s6Var, Context context, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = s6Var.onExtraCallback(context, access13800Var);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = asBinder + 121;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r5 r9
      0x003b: PHI (r5v10 o.s6$onExtraCallback) = (r5v9 o.s6$onExtraCallback), (r5v12 o.s6$onExtraCallback) binds: [B:10:0x0039, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r9v16 int) = (r9v15 int), (r9v18 int) binds: [B:10:0x0039, B:7:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2 A[Catch: Exception -> 0x01a9, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a9, blocks: (B:19:0x006a, B:43:0x019d, B:45:0x01a2, B:24:0x0095, B:29:0x00b0, B:34:0x00c6, B:35:0x017e, B:39:0x0187, B:27:0x00a2), top: B:51:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull android.content.Context r25, boolean r26, @org.jetbrains.annotations.NotNull o.access13800<? super java.util.List<? extends com.google.android.gms.safetynet.HarmfulAppsData>> r27) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s6.onExtraCallbackWithResult(android.content.Context, boolean, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(android.content.Context r8, o.access13800<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof o.s6.onNavigationEvent
            r2 = 0
            if (r1 == 0) goto L2a
            int r1 = o.s6.IAuthTabCallbackStub
            int r1 = r1 + 41
            int r3 = r1 % 128
            o.s6.asBinder = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            r1 = r9
            o.s6$onNavigationEvent r1 = (o.s6.onNavigationEvent) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2a
            int r3 = r3 + r4
            r1.label = r3
            goto L2f
        L22:
            o.s6$onNavigationEvent r9 = (o.s6.onNavigationEvent) r9
            int r8 = r9.label
            r2.hashCode()
            throw r2
        L2a:
            o.s6$onNavigationEvent r1 = new o.s6$onNavigationEvent
            r1.<init>(r9)
        L2f:
            java.lang.Object r9 = r1.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L65
            if (r4 != r6) goto L45
            java.lang.Object r8 = r1.L$0
            android.content.Context r8 = (android.content.Context) r8
            kotlin.ResultKt.onNavigationEvent(r9)
            goto L91
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 47
            byte[] r0 = new byte[r9]
            r0 = {x00a8: FILL_ARRAY_DATA , data: [0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1} // fill-array
            r1 = 85
            int[] r9 = new int[]{r5, r9, r1, r9}
            java.lang.Object[] r1 = new java.lang.Object[r6]
            b(r5, r0, r9, r1)
            r9 = r1[r5]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r8.<init>(r9)
            throw r8
        L65:
            kotlin.ResultKt.onNavigationEvent(r9)
            com.google.android.gms.safetynet.SafetyNetClient r9 = com.google.android.gms.safetynet.SafetyNet.getClient(r8)
            com.google.android.gms.tasks.Task r9 = r9.isVerifyAppsEnabled()
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            java.lang.Object r8 = o.access15400.onNavigationEvent(r8)
            r1.L$0 = r8
            r1.label = r6
            java.lang.Object r9 = o.jni_YGNodeStyleGetMaxWidthJNI.onNavigationEvent(r9, r1)
            if (r9 != r3) goto L91
            int r8 = o.s6.IAuthTabCallbackStub
            int r8 = r8 + 19
            int r9 = r8 % 128
            o.s6.asBinder = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L90
            r8 = 7
            int r8 = r8 / r5
        L90:
            return r3
        L91:
            com.google.android.gms.safetynet.SafetyNetApi$VerifyAppsUserResponse r9 = (com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse) r9
            boolean r8 = r9.isVerifyAppsEnabled()
            java.lang.Boolean r8 = o.access14000.onNavigationEvent(r8)
            int r9 = o.s6.IAuthTabCallbackStub
            int r9 = r9 + 89
            int r1 = r9 % 128
            o.s6.asBinder = r1
            int r9 = r9 % r0
            if (r9 == 0) goto La7
            return r8
        La7:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s6.onNavigationEvent(android.content.Context, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v12 o.s6$onExtraCallbackWithResult) = (r1v11 o.s6$onExtraCallbackWithResult), (r1v14 o.s6$onExtraCallbackWithResult) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(android.content.Context r8, o.access13800<? super java.util.List<? extends com.google.android.gms.safetynet.HarmfulAppsData>> r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof o.s6.onExtraCallbackWithResult
            r2 = 0
            if (r1 == 0) goto L38
            int r1 = o.s6.IAuthTabCallbackStub
            int r1 = r1 + 97
            int r3 = r1 % 128
            o.s6.asBinder = r3
            int r1 = r1 % r0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L22
            r1 = r9
            o.s6$onExtraCallbackWithResult r1 = (o.s6.onExtraCallbackWithResult) r1
            int r4 = r1.label
            r5 = r4 & r3
            r6 = 64
            int r6 = r6 / r2
            if (r5 == 0) goto L38
            goto L2b
        L22:
            r1 = r9
            o.s6$onExtraCallbackWithResult r1 = (o.s6.onExtraCallbackWithResult) r1
            int r4 = r1.label
            r5 = r4 & r3
            if (r5 == 0) goto L38
        L2b:
            int r4 = r4 + r3
            r1.label = r4
            int r9 = o.s6.asBinder
            int r9 = r9 + 115
        L32:
            int r3 = r9 % 128
            o.s6.IAuthTabCallbackStub = r3
            int r9 = r9 % r0
            goto L42
        L38:
            o.s6$onExtraCallbackWithResult r1 = new o.s6$onExtraCallbackWithResult
            r1.<init>(r9)
            int r9 = o.s6.asBinder
            int r9 = r9 + 99
            goto L32
        L42:
            java.lang.Object r9 = r1.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L80
            if (r4 != r5) goto L60
            java.lang.Object r8 = r1.L$0
            android.content.Context r8 = (android.content.Context) r8
            kotlin.ResultKt.onNavigationEvent(r9)
            int r8 = o.s6.IAuthTabCallbackStub
            int r8 = r8 + 65
            int r1 = r8 % 128
            o.s6.asBinder = r1
            int r8 = r8 % r0
            goto Laf
        L60:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r9 = 47
            byte[] r0 = new byte[r9]
            r0 = {x00bc: FILL_ARRAY_DATA , data: [0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1} // fill-array
            r1 = 85
            int[] r9 = new int[]{r2, r9, r1, r9}
            java.lang.Object[] r1 = new java.lang.Object[r5]
            b(r2, r0, r9, r1)
            r9 = r1[r2]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.intern()
            r8.<init>(r9)
            throw r8
        L80:
            kotlin.ResultKt.onNavigationEvent(r9)
            com.google.android.gms.safetynet.SafetyNetClient r9 = com.google.android.gms.safetynet.SafetyNet.getClient(r8)
            com.google.android.gms.tasks.Task r9 = r9.listHarmfulApps()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.Object r8 = o.access15400.onNavigationEvent(r8)
            r1.L$0 = r8
            r1.label = r5
            java.lang.Object r9 = o.jni_YGNodeStyleGetMaxWidthJNI.onNavigationEvent(r9, r1)
            if (r9 != r3) goto Laf
            int r8 = o.s6.asBinder
            int r8 = r8 + 53
            int r9 = r8 % 128
            o.s6.IAuthTabCallbackStub = r9
            int r8 = r8 % r0
            if (r8 != 0) goto Laa
            return r3
        Laa:
            r8 = 0
            r8.hashCode()
            throw r8
        Laf:
            com.google.android.gms.safetynet.SafetyNetApi$HarmfulAppsResponse r9 = (com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResponse) r9
            java.util.List r8 = r9.getHarmfulAppsList()
            if (r8 != 0) goto Lbb
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        Lbb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s6.onExtraCallback(android.content.Context, o.access13800):java.lang.Object");
    }

    private final void onNavigationEvent(List<? extends HarmfulAppsData> list) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size();
        for (HarmfulAppsData harmfulAppsData : list) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getLongPressTimeout() >> 16) + 9, 21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 12650), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(size);
            String string = sb.toString();
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1}, new int[]{47, 14, 0, 0}, objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), harmfulAppsData.apkPackageName);
            Object[] objArr3 = new Object[1];
            a(30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - TextUtils.getTrimmedLength(""), (char) (49092 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr3);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), harmfulAppsData.apkSha256);
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, new int[]{61, 11, 0, 0}, objArr4);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), Integer.valueOf(harmfulAppsData.apkCategory))});
            Object[] objArr5 = new Object[1];
            a(View.resolveSize(0, 0), 9 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.getOffsetAfter("", 0) + 27620), objArr5);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, ((String) objArr5[0]).intern(), string, mapOnWarmupCompleted, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i4 = asBinder + 103;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 3;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(IAuthTabCallback[i + i6]), i6, onExtraCallback, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        String str = new String(cArr);
        int i7 = $10 + 59;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i8 = 62 / 0;
            objArr[0] = str;
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                cArr3[i7] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr2[i7]);
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i9 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i9, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            int i10 = $11 + 65;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[4]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{34403, 15433, 62054, 43037, 28196, 9265, 56046, 37117, 22148, 56570, 26307, 43258, 62099, 13501, 32434, 32782, 51838, 3103, 22036, 38947, 9168, 26091, 45034, 61902, 15287, 32078, 34646, 51581, 4940, 21886, 21110, 59519, 9804, 31756, 47647, 61454, 3765, 17546, 33505, 60861, 22463, 39346, 50169, 1478, 20421, 45346, 64261, 15701, 26492, 43348, 4783, 21681, 40578, 49381, 2782, 19512, 46633, 63488, 44510, 6133, 55754, 33705, 17806, 3977, 61752, 47969, 32056, 10016, 59659, 21152, 5326, 57045, 32953, 19092, 3197, 63074, 47197, 25184, 9217, 60931, 21432, 5572, 57249, 33187, 19353, 3426, 63300, 47445, 25404, 9550};
        onExtraCallback = 6673084723959650252L;
        onNavigationEvent = new char[]{27154, 27385, 27381, 27279, 27349, 27345, 27272, 27346, 27190, 27375, 27278, 27279, 27271, 27272, 27376, 27349, 27190, 27352, 27382, 27380, 27377, 27275, 27278, 27353, 27190, 27347, 27278, 27273, 27273, 27276, 27379, 27349, 27190, 27374, 27275, 27277, 27277, 27351, 27352, 27376, 27275, 27275, 27273, 27271, 27277, 27278, 27376, 27260, 27175, 27177, 27161, 27159, 27176, 27178, 27176, 27177, 27180, 27158, 27155, 27171, 27174, 27262, 27174, 27171, 27161, 27164, 27172, 27170, 27176, 27173, 27198, 27195, 27244, 27157, 27196, 27198, 27198, 27143, 27141, 27169, 27174, 27172, 27174, 27148, 27148, 27178, 27170, 27170, 27178, 27173, 27152, 27162, 27175, 27169, 27175, 27171, 27198, 27160, 27158, 27198, 27199, 27139, 27238};
    }
}
