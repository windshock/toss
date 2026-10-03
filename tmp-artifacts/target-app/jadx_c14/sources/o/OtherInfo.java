package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OtherInfo implements ALCFaceQuality {
    public /* bridge */ onOutOfMemory onExtraCallback() {
        return super/*o.drawTextBox*/.onExtraCallback();
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        return super/*o.drawTextBox*/.onExtraCallbackWithResult();
    }

    public /* bridge */ boolean onNavigationEvent() {
        return super/*o.drawTextBox*/.onNavigationEvent();
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        return super/*o.drawTextBox*/.onWarmupCompleted(str);
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(setonoutofmemeryerrorcallback, this, activity, null), 3, (Object) null);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        Object L$0;
        int label;
        final /* synthetic */ OtherInfo this$0;
        private static final byte[] $$a = {66, 42, 112, 97};
        private static final int $$b = 199;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {53816, 48064, 451, 61401, 30099, 50125, 43496, 14253, 40364, 27619, 61946, 24470, 9622, 45956, 6546, 59354, 19931, 56227, 41386, 4019, 38332, 25515, 51522, 22285, 15628, 35672, 4433, 65395, 17772, 54114, 47474, 1850, 60731, 31510, 49414, 44801, 13595, 33625, 26916, 63266, 23865, 11070, 45354, 7889, 58570, 29383, 55506};
        private static long IAuthTabCallback = -3711259061103852498L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, short r8) {
            /*
                int r7 = r7 * 4
                int r0 = r7 + 1
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r8 = r8 + 97
                byte[] r1 = o.OtherInfo.onExtraCallbackWithResult.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2b:
                int r6 = -r6
                int r8 = r8 + 1
                int r6 = r6 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.OtherInfo.onExtraCallbackWithResult.$$c(short, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, OtherInfo otherInfo, FragmentActivity fragmentActivity, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$callbackProxy = setonoutofmemeryerrorcallback;
            this.this$0 = otherInfo;
            this.$activity = fragmentActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$callbackProxy, this.this$0, this.$activity, access13800Var);
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
                ExtHubEventManager extHubEventManagerOnExtraCallback = this.this$0.onExtraCallback(this.$activity);
                this.L$0 = setonoutofmemeryerrorcallback2;
                this.label = 1;
                Object objOnNavigationEvent = extHubEventManagerOnExtraCallback.onNavigationEvent(this);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
                setonoutofmemeryerrorcallback = setonoutofmemeryerrorcallback2;
                obj = objOnNavigationEvent;
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a((Process.getThreadPriority(0) + 20) >> 6, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47, (char) (MotionEvent.axisFromString("") + 16272), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            ALCFaceBox.onWarmupCompleted(-2103726265, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, (Boolean) obj}, iIAuthTabCallback2, 2103726265);
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 43;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getEdgeSlop() >> 16)), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10973 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), 31 - Drawable.resolveOpacity(0, 0), 20220 - View.resolveSizeAndState(0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), 44 - Color.green(0), ExpandableListView.getPackedPositionType(0L) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i7 = $11 + 29;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
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
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf("", "") + 44, 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExtHubEventManager onExtraCallback(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return ((BigDataLiteService) Response.onExtraCallback(applicationContext, BigDataLiteService.class)).getSmallIconBitmap();
    }
}
