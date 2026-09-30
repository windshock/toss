package viva.republica.toss.send;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.UST_CERT_GetPublicKey;
import o.getJSQueueThread;
import o.getModules;
import o.getStartTimeMillis;
import o.setProgressAsync;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.entity.TransferSource;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TransferSmallWidgetProvider extends AppWidgetProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted = {64963, 64961, 64989, 64962, 64976, 64982, 64988, 64910, 64960, 64924, 64966, 64908, 64983, 64970, 64905, 64967};
    private static char onExtraCallback = 51245;

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
        int i3 = onNavigationEvent + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(appWidgetManager, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iArr, BuildConfig.FLAVOR);
        super.onUpdate(context, appWidgetManager, iArr);
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (setprogressasync.onExtraCallback(context, TransferSmallWidgetProvider.class)) {
            Context contextIAuthTabCallback = getStartTimeMillis.Companion.onExtraCallback().IAuthTabCallback(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_transfer_small);
            int i2 = R.id.widget_transfer;
            remoteViews.setTextViewText(i2, contextIAuthTabCallback.getResources().getString(R.string.app_widget_transfer_small___175734d408));
            remoteViews.setOnClickPendingIntent(i2, onNavigationEvent(context));
            appWidgetManager.updateAppWidget(iArr, remoteViews);
            return;
        }
        int i3 = IAuthTabCallback + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
        int i5 = onNavigationEvent + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        Map mapOnExtraCallback;
        Object obj;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr = new Object[1];
            a(new char[]{'\f', 14, 1, 4}, (byte) (121 - (ViewConfiguration.getKeyRepeatDelay() / 121)), 2 % (ViewConfiguration.getDoubleTapTimeout() >> 90), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            mapOnExtraCallback = setDetectableSize.onExtraCallback();
            Object[] objArr2 = new Object[1];
            a(new char[]{'\f', 14, 1, 4}, (byte) (106 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr2);
            obj = objArr2[0];
        }
        mapOnExtraCallback.put(((String) obj).intern(), "small");
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return unit;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onEnabled(context);
        ConvertByteArrayToFloatArray.onExtraCallback(1005906L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.TransferSmallWidgetProvider$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TransferSmallWidgetProvider.onNavigationEvent((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        getModules.onExtraCallbackWithResult.onExtraCallbackWithResult("small", true);
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onDisabled(context);
        getModules.onExtraCallbackWithResult.onExtraCallbackWithResult("small", false);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    private final PendingIntent onNavigationEvent(Context context) throws Throwable {
        int i;
        int i2 = 2 % 2;
        SplashSchemeActivity.onNavigationEvent onnavigationevent = SplashSchemeActivity.Companion;
        String value = TransferSource.WIDGET_SMALL.getValue();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 11, 1, 4, 3, '\r', 4, '\n', '\n', '\f', 13775, 13775, '\t', 4, 0, 14, '\b', '\t', '\n', 14, 0, 5, 6, 4}, (byte) (26 - KeyEvent.getDeadChar(0, 0)), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(value);
        Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, context, new UST_CERT_GetPublicKey(sb.toString()).IAuthTabCallback(), false, new getJSQueueThread("transfer_small", (String) null, (String) null, 6, (DefaultConstructorMarker) null), 4, (Object) null);
        intentOnExtraCallbackWithResult.setFlags(335544320);
        intentOnExtraCallbackWithResult.putExtra("appOpenTrigger", "widget");
        if (Build.VERSION.SDK_INT >= 31) {
            int i3 = IAuthTabCallback + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = 167772160;
        } else {
            int i5 = onNavigationEvent + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intentOnExtraCallbackWithResult, i);
        Intrinsics.checkNotNullExpressionValue(activity, BuildConfig.FLAVOR);
        return activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 69;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 27 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 23139 - (ViewConfiguration.getLongPressTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23138 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 26 - Color.alpha(0), 23139 - ExpandableListView.getPackedPositionGroup(0L), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 73;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $10 + 61;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - KeyEvent.getDeadChar(0, 0)), 73 - ImageFormat.getBitsPerPixel(0), View.MeasureSpec.getMode(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $10 + 5;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19487, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i13 = $11 + 57;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        } else {
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        super.onReceive(context, intent);
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
