package im.toss.securities.widget.calendar;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.RemoteViews;
import im.toss.securities.widget.calendar.CalendarWidgetWorker;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;
import o.notify;
import o.q5c;
import o.q8a;
import o.setProgressAsync;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SecuritiesCalendarAppWidgetReceiver extends AppWidgetProvider {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final int onExtraCallbackWithResult = 8;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onWarmupCompleted + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(appWidgetManager, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            setProgressAsync.onExtraCallback.onExtraCallback(context, SecuritiesCalendarAppWidgetReceiver.class);
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, SecuritiesCalendarAppWidgetReceiver.class)) {
            setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
            CalendarWidgetWorker.Companion.onExtraCallback(context);
            return;
        }
        int i3 = onExtraCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 : iArr) {
            int i6 = onNavigationEvent + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!CalendarWidgetWorker.onNavigationEvent.onExtraCallbackWithResult(CalendarWidgetWorker.Companion, context, i5, false, 4, null)) {
                Companion.IAuthTabCallback(context, i5);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 4;
        }
        int i4 = 0;
        while (i4 < length) {
            int i5 = onExtraCallback + 47;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                q8a.onNavigationEvent.onWarmupCompleted(context, iArr[i4]);
                i4 += 54;
            } else {
                q8a.onNavigationEvent.onWarmupCompleted(context, iArr[i4]);
                i4++;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        CalendarWidgetWorker.Companion.onExtraCallback(context);
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        String action = intent.getAction();
        if (action != null) {
            int i4 = onExtraCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (action.hashCode() == 835499711) {
                int i6 = onNavigationEvent + 93;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    action.equals("im.toss.securities.widget.calendar.ACTION_REFRESH");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (action.equals("im.toss.securities.widget.calendar.ACTION_REFRESH")) {
                    onNavigationEvent(context, intent);
                    int i7 = onNavigationEvent + 13;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 95 / 0;
                        return;
                    }
                    return;
                }
            }
        }
        super.onReceive(context, intent);
    }

    private final void onNavigationEvent(Context context, Intent intent) {
        int intExtra;
        ComponentName componentName;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            intExtra = intent.getIntExtra("appWidgetId", 0);
            if (intExtra == 0) {
                return;
            }
        } else {
            intExtra = intent.getIntExtra("appWidgetId", 0);
            if (intExtra == 0) {
                return;
            }
        }
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        String className = null;
        if (i3 % 2 == 0) {
            AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            throw null;
        }
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
        if (appWidgetInfo != null && (componentName = appWidgetInfo.provider) != null) {
            className = componentName.getClassName();
        }
        if (Intrinsics.areEqual(className, SecuritiesCalendarAppWidgetReceiver.class.getName())) {
            CalendarWidgetWorker.Companion.IAuthTabCallback(context, intExtra, true);
            q8a.onNavigationEvent.onExtraCallbackWithResult(intExtra, "리프레시아이콘", true);
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static final byte[] $$a = {70, -47, -65, 52};
        private static final int $$b = 248;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onExtraCallbackWithResult = 478308937;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, byte b, int i2) {
            int i3;
            int i4 = (i * 2) + 105;
            int i5 = b * 2;
            int i6 = (i2 * 2) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i7 = i6;
                int i8 = 0;
                i6++;
                i4 += i7;
                i3 = i8;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i6];
                i6++;
                i4 += i7;
                i3 = i8;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i5) {
                }
            }
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallback(@NotNull Context context, int i, @NotNull CalendarWidgetState calendarWidgetState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(calendarWidgetState, "");
            if (!(calendarWidgetState instanceof CalendarWidgetState.Loading)) {
                int i3 = onNavigationEvent + 17;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onNavigationEvent(context, i, calendarWidgetState);
            }
            RemoteViews remoteViewsOnWarmupCompleted = q5c.onWarmupCompleted(q5c.onExtraCallbackWithResult, context, i, calendarWidgetState, false, 8, null);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            appWidgetManager.updateAppWidget(i, remoteViewsOnWarmupCompleted);
            if (Build.VERSION.SDK_INT < 31 && (calendarWidgetState instanceof CalendarWidgetState.Success)) {
                int i5 = IAuthTabCallback + 59;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.day_sections_container);
                    throw null;
                }
                appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.day_sections_container);
            }
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("function", "SecuritiesCalendarAppWidgetReceiver.updateWidget"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("state", Reflection.getOrCreateKotlinClass(calendarWidgetState.getClass()).getSimpleName()), getWrite.IAuthTabCallback("layoutId", Integer.valueOf(remoteViewsOnWarmupCompleted.getLayoutId()))}));
            q8aVar.onNavigationEvent(context, i, "위젯사용현황", "calendar", "medium");
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, Drawable.resolveOpacity(0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0)), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2166 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            }
            if (i2 > 0) {
                int i7 = $10 + 99;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i9 = $10 + 57;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 12843), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 54, TextUtils.getOffsetBefore("", 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i11 = $11 + 37;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        i4 = 2083011369;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public final void IAuthTabCallback(@NotNull Context context, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            CalendarWidgetState calendarWidgetStateOnExtraCallback = onExtraCallback(context, i);
            if (calendarWidgetStateOnExtraCallback != null) {
                onExtraCallback(context, i, calendarWidgetStateOnExtraCallback);
                return;
            }
            int i5 = IAuthTabCallback + 59;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
        }

        private final void onNavigationEvent(Context context, int i, CalendarWidgetState calendarWidgetState) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("calendar_widget_state", 0);
                wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                String strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(CalendarWidgetState.Companion.serializer(), calendarWidgetState);
                sharedPreferences.edit().putString("state_" + i, strOnWarmupCompleted).apply();
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i3 = IAuthTabCallback + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "CalendarWidget.saveState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = th2.getMessage();
                if (message == null) {
                    int i5 = onNavigationEvent + 3;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = new Object[1];
                    a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, ((Process.getThreadPriority(0) + 20) >> 6) + 208, objArr);
                    message = ((String) objArr[0]).intern();
                }
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CalendarWidgetState onExtraCallback(@NotNull Context context, int i) throws Throwable {
            Object obj;
            Throwable th;
            String string;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("calendar_widget_state", 0);
                StringBuilder sb = new StringBuilder();
                sb.append("state_");
                try {
                    sb.append(i);
                    string = sharedPreferences.getString(sb.toString(), null);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    return (CalendarWidgetState) (Result.onExtraCallback(obj) ? null : obj);
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (string == null) {
                int i3 = onNavigationEvent + 83;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl((CalendarWidgetState) wie2VarOnExtraCallback.onExtraCallback(CalendarWidgetState.Companion.serializer(), string));
            th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "CalendarWidget.loadState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = th.getMessage();
                if (message == null) {
                    int i5 = IAuthTabCallback + 33;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = new Object[1];
                    a(TextUtils.lastIndexOf("", '0', 0) + 8, -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{5, 65534, 7, 65535, 65534, 65531, 65534}, true, 208 - TextUtils.indexOf("", "", 0), objArr);
                    message = ((String) objArr[0]).intern();
                    int i7 = IAuthTabCallback + 109;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
            }
            return (CalendarWidgetState) (Result.onExtraCallback(obj) ? null : obj);
        }
    }
}
