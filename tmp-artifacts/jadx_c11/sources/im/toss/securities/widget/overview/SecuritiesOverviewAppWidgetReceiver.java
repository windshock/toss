package im.toss.securities.widget.overview;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.RemoteViews;
import im.toss.securities.widget.overview.ui.small.OverviewSmallWidgetWorker;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;
import o.notify;
import o.q8a;
import o.r8lambdavx37qOxdHlJJsTutexd9f4l1qvw;
import o.setApTextSize;
import o.setProgressAsync;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SecuritiesOverviewAppWidgetReceiver extends AppWidgetProvider {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 117;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, SecuritiesOverviewAppWidgetReceiver.class)) {
            setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
            OverviewSmallWidgetWorker.Companion.onWarmupCompleted(context);
            return;
        }
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 : iArr) {
            if (!OverviewSmallWidgetWorker.IAuthTabCallback.IAuthTabCallback(OverviewSmallWidgetWorker.Companion, context, i6, false, 4, null)) {
                Companion.onExtraCallback(context, i6);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = onExtraCallback + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                q8a.onNavigationEvent.IAuthTabCallback(context, iArr[i4]);
                i4 += 69;
            } else {
                q8a.onNavigationEvent.IAuthTabCallback(context, iArr[i4]);
                i4++;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            OverviewSmallWidgetWorker.Companion.onWarmupCompleted(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            OverviewSmallWidgetWorker.Companion.onWarmupCompleted(context);
            int i3 = 53 / 0;
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        String action = intent.getAction();
        if (action != null && action.hashCode() == -2077770740) {
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (action.equals("im.toss.securities.widget.overview.ACTION_REFRESH_SMALL")) {
                int i4 = onWarmupCompleted + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallbackWithResult(context, intent);
                int i6 = onExtraCallback + 97;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        super.onReceive(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Context context, Intent intent) {
        String className;
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        if (intExtra != 0) {
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            if (appWidgetInfo != null) {
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                ComponentName componentName = appWidgetInfo.provider;
                className = componentName != null ? componentName.getClassName() : null;
            }
            if (Intrinsics.areEqual(className, SecuritiesOverviewAppWidgetReceiver.class.getName())) {
                OverviewSmallWidgetWorker.Companion.onExtraCallback(context, intExtra, true);
                q8a.onNavigationEvent.onNavigationEvent(intExtra, "리프레시아이콘", true);
                int i6 = onWarmupCompleted + 55;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 50 / 0;
                }
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 27067;
        private static char onExtraCallback = 45414;
        private static int onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 29247;
        private static int onTransact = 1;
        private static char onWarmupCompleted = 52427;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallback(@NotNull Context context, int i, @NotNull OverviewSmallWidgetState overviewSmallWidgetState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(overviewSmallWidgetState, "");
            if (!(overviewSmallWidgetState instanceof OverviewSmallWidgetState.Loading)) {
                int i3 = onTransact + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onWarmupCompleted(context, i, overviewSmallWidgetState);
            }
            Object obj = null;
            AppWidgetManager.getInstance(context).updateAppWidget(i, (RemoteViews) r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.IAuthTabCallback(new Object[]{r8lambdavx37qOxdHlJJsTutexd9f4l1qvw.onNavigationEvent, context, Integer.valueOf(i), overviewSmallWidgetState, false, 8, null}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -852670813, 852670813, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent()));
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("function", "SecuritiesOverviewAppWidgetReceiver.updateWidget"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("state", Reflection.getOrCreateKotlinClass(overviewSmallWidgetState.getClass()).getSimpleName())}));
            q8aVar.onNavigationEvent(context, i, "위젯사용현황", "myAsset", "small");
            int i5 = onTransact + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 9;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                char c = 1;
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(i8);
                        objArr2[0] = Integer.valueOf(c2);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                            int maxKeyCode = 12434 - (KeyEvent.getMaxKeyCode() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, i10, maxKeyCode, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        int i11 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, 12434 - View.MeasureSpec.getSize(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i11 + 1;
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
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 16014), 14 - Color.red(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = $11 + 119;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 % 3;
                }
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public final void onExtraCallback(@NotNull Context context, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onTransact + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            OverviewSmallWidgetState overviewSmallWidgetStateOnNavigationEvent = onNavigationEvent(context, i);
            if (overviewSmallWidgetStateOnNavigationEvent == null) {
                return;
            }
            onExtraCallback(context, i, overviewSmallWidgetStateOnNavigationEvent);
            int i5 = onTransact + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final void onWarmupCompleted(Context context, int i, OverviewSmallWidgetState overviewSmallWidgetState) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("overview_small_widget_state", 0);
                wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                String strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(OverviewSmallWidgetState.Companion.serializer(), overviewSmallWidgetState);
                sharedPreferences.edit().putString("state_" + i, strOnWarmupCompleted).apply();
                obj = Result.constructor-impl(Unit.INSTANCE);
                int i3 = onExtraCallbackWithResult + 31;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i5 = onTransact + 93;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewSmall.saveState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = th2.getMessage();
                if (message == null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{62966, 19292, 31248, 23849, 9713, 13862, 62707, 17487}, 7 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                    message = ((String) objArr[0]).intern();
                }
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
            }
        }

        private final OverviewSmallWidgetState onNavigationEvent(Context context, int i) throws Throwable {
            Object obj;
            String string;
            int i2 = 2 % 2;
            Object obj2 = null;
            try {
                Result.Companion companion = Result.Companion;
                string = context.getSharedPreferences("overview_small_widget_state", 0).getString("state_" + i, null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (string == null) {
                int i3 = onExtraCallbackWithResult + 25;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl((OverviewSmallWidgetState) wie2VarOnExtraCallback.onExtraCallback(OverviewSmallWidgetState.Companion.serializer(), string));
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewSmall.loadState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = th2.getMessage();
                if (message == null) {
                    int i5 = onExtraCallbackWithResult + 13;
                    onTransact = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{62966, 19292, 31248, 23849, 9713, 13862, 62707, 17487}, 63 >> KeyEvent.getDeadChar(1, 1), objArr);
                        message = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{62966, 19292, 31248, 23849, 9713, 13862, 62707, 17487}, 7 - KeyEvent.getDeadChar(0, 0), objArr2);
                        message = ((String) objArr2[0]).intern();
                    }
                }
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
            }
            if (Result.onExtraCallback(obj)) {
                int i6 = onExtraCallbackWithResult + 9;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            } else {
                obj2 = obj;
            }
            return (OverviewSmallWidgetState) obj2;
        }
    }
}
