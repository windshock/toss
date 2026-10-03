package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.NetworkStatusSubscriptionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getStartDate implements ALCFaceQuality {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static char asBinder;
    private static char[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static final ConcurrentHashMap<String, getPackageType> onWarmupCompleted;
    private static final byte[] $$a = {68, -59, -116, 119};
    private static final int $$b = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            byte[] r0 = o.getStartDate.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 + 109
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStartDate.$$c(int, byte, short):java.lang.String");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str, th);
        }
        onNavigationEvent(str, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackDefault + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackDefault + 63;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 78 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onNavigationEvent();
        }
        super/*o.drawTextBox*/.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            int i6 = 43 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{42667, 16284, 11933, 26672, 64962, 22208, 53051, 35344, 24164, 46170, 1486, 32134, 55369, 64731, 7261, 2349, 5013, 51232, 36839, 10231, 4209, 51891}, new char[]{19181, 65229, 58492, 32782}, new char[]{44974, 40564, 44950, 12596}, objArr);
        Object obj = null;
        if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            int i4 = onTransact + 53;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback);
                return;
            } else {
                onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback);
                throw null;
            }
        }
        Object[] objArr2 = new Object[1];
        b((byte) (50 - ExpandableListView.getPackedPositionGroup(0L)), Color.blue(0) + 24, new char[]{0, 22, 0, 3, 24, 2, '\n', 6, 20, 23, '\b', 3, 0, 18, 11, '\n', '\t', 15, 5, 20, '\n', 17, 3, 0}, objArr2);
        if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
            IAuthTabCallback(jsonObject, setonoutofmemeryerrorcallback);
        }
        int i5 = onTransact + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<String, access13800<? super Boolean>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static long onNavigationEvent = -479006279568393583L;
        final /* synthetic */ String $currentStatus;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$currentStatus = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$currentStatus, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = IAuthTabCallback + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((String) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(String str, access13800<? super Boolean> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(str, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 13 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 125;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 75;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 45812), Gravity.getAbsoluteGravity(0, 0) + 84, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 14185), 19 - View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            return o.access14000.onNavigationEvent(kotlin.jvm.internal.Intrinsics.areEqual(r1, r6.$currentStatus));
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r2 = new java.lang.Object[1];
            a(new char[]{22811, 22904, 47612, 6069, 52584, 14336, 5347, 18899, 24399, 12697, 7796, 17923, 21972, 14091, 2034, 23716, 18994, 11624, 326, 21884, 16619, 8947, 2778, 21417, 31024, 6255, 13486, 26707, 32644, 4544, 15913, 26257, 29784, 5982, 10166, 32588, 27291, 3254, 8454, 30059, 25447, 621, 10904, 29676, 6625, 31670, 21506, 2115, 8078, 28939, 24038}, 1 - android.view.View.getDefaultSize(0, 0), r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        
            throw new java.lang.IllegalStateException(((java.lang.String) r2[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r2 = r2 + 71;
            o.getStartDate.onWarmupCompleted.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r7);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.getStartDate.onWarmupCompleted.onExtraCallback
                int r1 = r1 + 9
                int r2 = r1 % 128
                o.getStartDate.onWarmupCompleted.IAuthTabCallback = r2
                int r1 = r1 % r0
                r3 = 0
                if (r1 != 0) goto L1b
                java.lang.Object r1 = r6.L$0
                java.lang.String r1 = (java.lang.String) r1
                int r4 = r6.label
                r5 = 90
                int r5 = r5 / r3
                if (r4 != 0) goto L38
                goto L23
            L1b:
                java.lang.Object r1 = r6.L$0
                java.lang.String r1 = (java.lang.String) r1
                int r4 = r6.label
                if (r4 != 0) goto L38
            L23:
                int r2 = r2 + 71
                int r3 = r2 % 128
                o.getStartDate.onWarmupCompleted.onExtraCallback = r3
                int r2 = r2 % r0
                kotlin.ResultKt.onNavigationEvent(r7)
                java.lang.String r7 = r6.$currentStatus
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
                java.lang.Boolean r7 = o.access14000.onNavigationEvent(r7)
                return r7
            L38:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r0 = 51
                char[] r0 = new char[r0]
                r0 = {x005a: FILL_ARRAY_DATA , data: [22811, 22904, -17924, 6069, -12952, 14336, 5347, 18899, 24399, 12697, 7796, 17923, 21972, 14091, 2034, 23716, 18994, 11624, 326, 21884, 16619, 8947, 2778, 21417, 31024, 6255, 13486, 26707, 32644, 4544, 15913, 26257, 29784, 5982, 10166, 32588, 27291, 3254, 8454, 30059, 25447, 621, 10904, 29676, 6625, 31670, 21506, 2115, 8078, 28939, 24038} // fill-array
                int r1 = android.view.View.getDefaultSize(r3, r3)
                r2 = 1
                int r1 = 1 - r1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                a(r0, r1, r2)
                r0 = r2[r3]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getStartDate.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            if (context == null) {
                Object[] objArr = new Object[1];
                a((char) (51936 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 1173524897, new char[]{59757, 33050, 49980, 524, 23524, 26076, 38495, 44178, 13585, 4768, 18141, 2131, 10349, 40982, 2632}, new char[]{19181, 65229, 58492, 32782}, new char[]{41329, 62097, 57157, 26058}, objArr);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
                return;
            }
            setText settext = new setText(jsonObject);
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{11951, 9220, 24014, 31513, 16289, 58989, 54768, 43496}, new char[]{19181, 65229, 58492, 32782}, new char[]{35086, 8403, 43261, 36586}, objArr2);
            String strOnWarmupCompleted = settext.onWarmupCompleted(((String) objArr2[0]).intern());
            if (strOnWarmupCompleted != null) {
                int i3 = onTransact + 89;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (!StringsKt.isBlank(strOnWarmupCompleted)) {
                    String string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
                    String strOnWarmupCompleted2 = ontextviewsizechanged.onWarmupCompleted(context);
                    getPackageType getpackagetypeOnWarmupCompleted = ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda8.onWarmupCompleted(ycxycx.onExtraCallback(ontextviewsizechanged.IAuthTabCallbackDefault(context), new onWarmupCompleted(strOnWarmupCompleted2, null)), r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle(), TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED), new onExtraCallback(setonoutofmemeryerrorcallback, null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq));
                    onWarmupCompleted.put(string, getpackagetypeOnWarmupCompleted);
                    getpackagetypeOnWarmupCompleted.onExtraCallback(new NetworkStatusSubscriptionHandler$.ExternalSyntheticLambda0(string));
                    PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
                    Object[] objArr3 = new Object[1];
                    b((byte) (86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 15, new char[]{0, 3, 24, 2, '\n', 6, 4, 14, 19, 20, '\n', 24, 16, 3}, objArr3);
                    dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr3[0]).intern(), string);
                    Object[] objArr4 = new Object[1];
                    b((byte) (ImageFormat.getBitsPerPixel(0) + 54), 6 - Color.alpha(0), new char[]{0, 19, '\n', 17, 3, 0}, objArr4);
                    dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr4[0]).intern(), strOnWarmupCompleted2);
                    Object[] objArr5 = {setonoutofmemeryerrorcallback, pangleEncryptManager.onExtraCallbackWithResult()};
                    int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    ALCFaceBox.onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr5, iIAuthTabCallback2, -291820715);
                    return;
                }
            }
            Object[] objArr6 = new Object[1];
            b((byte) (Drawable.resolveOpacity(0, 0) + 22), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{'\n', 24, 18, '\r', '\n', 22, '\b', 2, 1, 16, 17, 22, 22, 2, '\r', '\f', 16, 24, 4, '\t', 20, 6, 1, 18, 4, 22, '\b', 0, 13844}, objArr6);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr6[0]).intern(), (String) null, (Map) null, 6, (Object) null);
            return;
        }
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<String, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] onExtraCallback = {27336, 27459, 27487, 27456, 27461, 27314, 27313, 27483, 27263, 27180, 27176, 27170, 27144, 27140, 27199, 27145, 27245, 27138, 27173, 27170, 27194, 27199, 27175, 27144, 27245, 27151, 27181, 27179, 27172, 27198, 27173, 27148, 27245, 27142, 27173, 27196, 27196, 27171, 27174, 27144, 27245, 27141, 27198, 27168, 27168, 27146, 27151, 27175, 27198, 27198, 27196, 27194, 27168, 27173, 27175};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$callbackProxy, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            String str = (String) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(str, access13800Var);
            }
            onWarmupCompleted(str, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(String str, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(str, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) this.L$0;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{8, 47, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 8, 167, 0}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 1}, objArr2);
            ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr2[0]).intern(), str);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallback;
            if (cArr != null) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 35283), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14239 - ((Process.getThreadPriority(0) + 20) >> 6), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
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
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 10936), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i11 = $10 + 43;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 5 / 4;
                        }
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    try {
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49467), KeyEvent.keyCodeFromString("") + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
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
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i13, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i13);
            }
            if (z) {
                int i14 = $10 + 37;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                int i16 = $10 + 117;
                $11 = i16 % 128;
                char c2 = 2;
                int i17 = i16 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i18 = $10 + 37;
                    $11 = i18 % 128;
                    c2 = 2;
                    int i19 = i18 % 2;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private static final Unit onNavigationEvent(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted.remove(str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallback(JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        String str;
        Map map;
        int i;
        int i2 = 2 % 2;
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 85), (-16777202) - Color.rgb(0, 0, 0), new char[]{0, 3, 24, 2, '\n', 6, 4, 14, 19, 20, '\n', 24, 16, 3}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() != 0) {
            getPackageType getpackagetypeRemove = onWarmupCompleted.remove(strOnNavigationEvent);
            if (getpackagetypeRemove != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeRemove, (CancellationException) null, 1, (Object) null);
                int i3 = onTransact + 115;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 3;
                }
            }
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            return;
        }
        int i5 = IAuthTabCallbackDefault + 117;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a((char) (34179 % MotionEvent.axisFromString("")), TextUtils.getOffsetBefore("", 0), new char[]{9766, 47520, 29691, 12145, 28740, 20689, 2343, 62473, 22096, 50115, 31197, 23138, 6516, 54783, 52169, 44632, 30819, 32181, 17529, 44795, 61982, 32097, 9676, 4278, 21973, 40210}, new char[]{19181, 65229, 58492, 32782}, new char[]{19255, 55171, 33997, 16005}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            str = null;
            map = null;
            i = 8;
        } else {
            Object[] objArr3 = new Object[1];
            a((char) (34179 - MotionEvent.axisFromString("")), TextUtils.getOffsetBefore("", 0), new char[]{9766, 47520, 29691, 12145, 28740, 20689, 2343, 62473, 22096, 50115, 31197, 23138, 6516, 54783, 52169, 44632, 30819, 32181, 17529, 44795, 61982, 32097, 9676, 4278, 21973, 40210}, new char[]{19181, 65229, 58492, 32782}, new char[]{19255, 55171, 33997, 16005}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            str = null;
            map = null;
            i = 6;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, str, map, i, (Object) null);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        onWarmupCompleted = new ConcurrentHashMap<>();
        int i = asInterface + 65;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 9;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 43, 1451 - (KeyEvent.getMaxKeyCode() >> 16), 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0')), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 1495, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22939 - (ViewConfiguration.getScrollBarSize() >> 8), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getScrollBarSize() >> 8)), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 99;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r31, int r32, char[] r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStartDate.b(byte, int, char[], java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onNavigationEvent = -1426259775684075242L;
        IAuthTabCallback = -1776194565;
        onExtraCallbackWithResult = (char) 27643;
        onExtraCallback = new char[]{64992, 64983, 64966, 64982, 64960, 64961, 64995, 64980, 64987, 64963, 64964, 64976, 64978, 65008, 64988, 64967, 64962, 64991, 65018, 64984, 64989, 64915, 64977, 65021, 64986};
        asBinder = (char) 51244;
    }
}
