package viva.republica.toss.send;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.RemoteViews;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.UST_CERT_GetPublicKey;
import o.addExtra;
import o.getJSQueueThread;
import o.getModules;
import o.getStartTimeMillis;
import o.setProgressAsync;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.entity.TransferSource;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TransferMediumWidgetProvider extends AppWidgetProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onNavigationEvent = 10965468110055780L;

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setDetectableSize);
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @Nullable AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iArr, BuildConfig.FLAVOR);
        super.onUpdate(context, appWidgetManager, iArr);
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, TransferMediumWidgetProvider.class)) {
            if (appWidgetManager != null) {
                setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
                int i2 = IAuthTabCallback + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            return;
        }
        Context contextIAuthTabCallback = getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_transfer_medium);
        int i4 = R.id.widget_transfer;
        remoteViews.setTextViewText(i4, contextIAuthTabCallback.getString(R.string.app_widget_transfer_medium___175734d408));
        int i5 = R.id.widget_balance;
        remoteViews.setTextViewText(i5, contextIAuthTabCallback.getString(R.string.app_widget_transfer_medium___de33624b3e));
        int i6 = R.id.widget_dutch;
        remoteViews.setTextViewText(i6, contextIAuthTabCallback.getString(R.string.dutch_pay));
        remoteViews.setOnClickPendingIntent(i4, IAuthTabCallback(context));
        remoteViews.setOnClickPendingIntent(i5, onNavigationEvent(context));
        remoteViews.setOnClickPendingIntent(i6, onWarmupCompleted(context));
        if (appWidgetManager != null) {
            int i7 = IAuthTabCallback + 1;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        }
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{53939, 60423, 9836, 53959, 789, 32278, 716, 46152}, 0 % TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, 'A', 1), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{53939, 60423, 9836, 53959, 789, 32278, 716, 46152}, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1, objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), "medium");
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onEnabled(context);
        ConvertByteArrayToFloatArray.onExtraCallback(1005906L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.TransferMediumWidgetProvider$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TransferMediumWidgetProvider.IAuthTabCallback((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        getModules.onExtraCallbackWithResult.onExtraCallbackWithResult("medium", true);
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onDisabled(context);
        getModules.onExtraCallbackWithResult.onExtraCallbackWithResult("medium", false);
        int i4 = onExtraCallback + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final PendingIntent IAuthTabCallback(Context context) throws Throwable {
        int i = 2 % 2;
        String value = TransferSource.WIDGET_MEDIUM.getValue();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{54180, 10438, 59524, 54231, 20229, 47835, 52260, 63576, 39542, 62650, 34459, 20398, 16535, 3412, 20667, 1362, 3895, 18411, 59738, 56185, 62747, 36957, 41915, 37576, 41974, 10797, 31761, 26720}, ExpandableListView.getPackedPositionChild(0L) + 1, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(value);
        PendingIntent pendingIntentOnExtraCallbackWithResult = onExtraCallbackWithResult(context, sb.toString(), "transfer_medium");
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return pendingIntentOnExtraCallbackWithResult;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45812), Color.rgb(0, 0, 0) + 16777300, 21233 - Gravity.getAbsoluteGravity(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.normalizeMetaState(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private final PendingIntent onWarmupCompleted(Context context) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{54437, 34779, 18486, 54486, 59674, 5574, 27798, 24135, 40311, 23463, 9769, 59825, 18326, 41545, 61449, 41805, 2081, 59622, 18930, 32097, 62029, 16227, 775, 13531, 42154, 34080, 56483, 52790, 27921, 52122, 38600, 39301}, KeyEvent.getMaxKeyCode() >>> 122, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{54437, 34779, 18486, 54486, 59674, 5574, 27798, 24135, 40311, 23463, 9769, 59825, 18326, 41545, 61449, 41805, 2081, 59622, 18930, 32097, 62029, 16227, 775, 13531, 42154, 34080, 56483, 52790, 27921, 52122, 38600, 39301}, KeyEvent.getMaxKeyCode() >> 16, objArr2);
            obj = objArr2[0];
        }
        return onExtraCallbackWithResult(context, ((String) obj).intern(), "dutch_pay");
    }

    private final PendingIntent onNavigationEvent(Context context) throws Throwable {
        int i = 2 % 2;
        if (!(!addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted))) {
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{63166, 43560, 38201, 63181, 39726, 14389, 45465, 11379, 49004, 30292, 64294, 39813, 25997, 36794, 11526, 53625, 10815, 50435, 38122, 3929, 53323, 4782, 56861, 18105, 34538, 43215, 442, 48133}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
            PendingIntent pendingIntentOnExtraCallbackWithResult = onExtraCallbackWithResult(context, ((String) objArr[0]).intern(), "balance");
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return pendingIntentOnExtraCallbackWithResult;
            }
            throw null;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{39219, 50268, 55226, 39232, 55699, 22081, 62234, 28366, 53473, 6176, 47525, 55608, 2560, 57806, 28549, 37828, 17847, 43893, 54905, 19939, 49105, 31963, 40075, 1113, 59767, 50939, 17195, 65192, 8336, 34843, 2399, 43269, 39463}, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        return onExtraCallbackWithResult(context, ((String) objArr2[0]).intern(), "balance");
    }

    private final PendingIntent onExtraCallbackWithResult(Context context, String str, String str2) {
        int i;
        int i2 = 2 % 2;
        Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, new UST_CERT_GetPublicKey(str).IAuthTabCallback(), false, new getJSQueueThread(str2, (String) null, (String) null, 6, (DefaultConstructorMarker) null), 4, (Object) null);
        intentOnExtraCallbackWithResult.setFlags(335544320);
        intentOnExtraCallbackWithResult.putExtra("appOpenTrigger", "widget");
        if (Build.VERSION.SDK_INT >= 31) {
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            i = 167772160;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
        } else {
            int i5 = IAuthTabCallback + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentOnExtraCallbackWithResult, i);
        Intrinsics.checkNotNullExpressionValue(activity, BuildConfig.FLAVOR);
        return activity;
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onReceive(context, intent);
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
