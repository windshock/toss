package viva.republica.toss.tossfeed.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.RemoteViews;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.TooltipKtExternalSyntheticLambda11;
import o.TopAppBarDefaultsExternalSyntheticLambda3;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.UST_CERT_GetPublicKey;
import o.getJSQueueThread;
import o.setProgressAsync;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossFeedWidgetProvider extends AppWidgetProvider {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] onExtraCallback = {27330, 27476, 27478, 27456};
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str, str2, str3, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, str2, str3, setDetectableSize);
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(setDetectableSize);
        }
        onNavigationEvent(setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, String str2, String str3, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback("clicked_article_id", str);
        setDetectableSize.onExtraCallback("impressed_first_article_id", str2);
        setDetectableSize.onExtraCallback("impressed_second_article_id", str3);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[PHI: r1
      0x006f: PHI (r1v16 java.lang.String) = (r1v9 java.lang.String), (r1v17 java.lang.String) binds: [B:16:0x006c, B:13:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        String stringExtra;
        int i = 2 % 2;
        String str = BuildConfig.FLAVOR;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(intent, BuildConfig.FLAVOR);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TOSS_FEED_WIDGET", "onReceive: " + intent.getAction(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -308681731) {
                if (iHashCode == 558103338 && action.equals("viva.republica.toss.action.CLICK")) {
                    int i2 = onExtraCallbackWithResult + 105;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        stringExtra = intent.getStringExtra("EXTRA_APP_SCHEME");
                        int i3 = 47 / 0;
                        if (stringExtra != null) {
                            str = stringExtra;
                        }
                        final String stringExtra2 = intent.getStringExtra("EXTRA_CLICKED_SCHEMA_ID");
                        final String stringExtra3 = intent.getStringExtra("EXTRA_FIRST_SCHEMA_ID");
                        final String stringExtra4 = intent.getStringExtra("EXTRA_SECOND_SCHEMA_ID");
                        ConvertByteArrayToFloatArray.onExtraCallback(1227297L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.tossfeed.widget.TossFeedWidgetProvider$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj) {
                                return TossFeedWidgetProvider.IAuthTabCallback(stringExtra2, stringExtra3, stringExtra4, (SetDetectableSize) obj);
                            }
                        }, 14, (Object) null);
                        Intent intentOnExtraCallbackWithResult = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, new UST_CERT_GetPublicKey(str).IAuthTabCallback(), false, new getJSQueueThread("today_money_tip", (String) null, (String) null, 6, (DefaultConstructorMarker) null), 4, (Object) null);
                        intentOnExtraCallbackWithResult.setFlags(335544320);
                        intentOnExtraCallbackWithResult.putExtra("appOpenTrigger", "widget");
                        context.startActivity(intentOnExtraCallbackWithResult);
                    } else {
                        stringExtra = intent.getStringExtra("EXTRA_APP_SCHEME");
                        if (stringExtra != null) {
                        }
                        final String stringExtra22 = intent.getStringExtra("EXTRA_CLICKED_SCHEMA_ID");
                        final String stringExtra32 = intent.getStringExtra("EXTRA_FIRST_SCHEMA_ID");
                        final String stringExtra42 = intent.getStringExtra("EXTRA_SECOND_SCHEMA_ID");
                        ConvertByteArrayToFloatArray.onExtraCallback(1227297L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.tossfeed.widget.TossFeedWidgetProvider$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj) {
                                return TossFeedWidgetProvider.IAuthTabCallback(stringExtra22, stringExtra32, stringExtra42, (SetDetectableSize) obj);
                            }
                        }, 14, (Object) null);
                        Intent intentOnExtraCallbackWithResult2 = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, new UST_CERT_GetPublicKey(str).IAuthTabCallback(), false, new getJSQueueThread("today_money_tip", (String) null, (String) null, 6, (DefaultConstructorMarker) null), 4, (Object) null);
                        intentOnExtraCallbackWithResult2.setFlags(335544320);
                        intentOnExtraCallbackWithResult2.putExtra("appOpenTrigger", "widget");
                        context.startActivity(intentOnExtraCallbackWithResult2);
                    }
                }
            } else if (action.equals("viva.republica.toss.action.REFRESH")) {
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) TossFeedWidgetProvider.class)), R.id.list_view);
            }
        }
        super.onReceive(context, intent);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(appWidgetManager, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iArr, BuildConfig.FLAVOR);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TOSS_FEED_WIDGET", "onUpdate", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, TossFeedWidgetProvider.class)) {
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onExtraCallback("TOSS_FEED_UPDATE_WORK");
            return;
        }
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", i5);
            Intent intent = new Intent(context, (Class<?>) PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda0.class);
            intent.putExtras(bundle);
            intent.setData(Uri.parse(intent.toUri(1)));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_toss_feed);
            int i6 = R.id.list_view;
            remoteViews.setRemoteAdapter(i6, intent);
            int i7 = R.id.empty_view;
            remoteViews.setEmptyView(i6, i7);
            remoteViews.setPendingIntentTemplate(i6, IAuthTabCallback(this, context, "viva.republica.toss.action.CLICK", null, 4, null));
            remoteViews.setOnClickPendingIntent(i7, IAuthTabCallback(this, context, "viva.republica.toss.action.REFRESH", null, 4, null));
            appWidgetManager.updateAppWidget(i5, remoteViews);
            i4++;
            int i8 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }

    static /* synthetic */ PendingIntent IAuthTabCallback(TossFeedWidgetProvider tossFeedWidgetProvider, Context context, String str, Bundle bundle, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 125;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 5;
            }
            bundle = null;
        }
        return tossFeedWidgetProvider.onNavigationEvent(context, str, bundle);
    }

    private final PendingIntent onNavigationEvent(Context context, String str, Bundle bundle) {
        PendingIntent broadcast;
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) TossFeedWidgetProvider.class);
        intent.setAction(str);
        if (bundle != null) {
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                intent.putExtras(bundle);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            intent.putExtras(bundle);
            int i3 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        intent.setData(Uri.parse(intent.toUri(1)));
        if (Build.VERSION.SDK_INT >= 31) {
            int i5 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            broadcast = PendingIntent.getBroadcast(context, 0, intent, 167772160);
        } else {
            broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        }
        Intrinsics.checkNotNullExpressionValue(broadcast, BuildConfig.FLAVOR);
        return broadcast;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 164, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "install");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1227293L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.tossfeed.widget.TossFeedWidgetProvider$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TossFeedWidgetProvider.onWarmupCompleted((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onExtraCallback("TOSS_FEED_UPDATE_WORK", TooltipKtExternalSyntheticLambda11.REPLACE, new TopAppBarDefaultsExternalSyntheticLambda3.onExtraCallback(TossFeedWidgetWorker.class, 6L, TimeUnit.HOURS, 5L, TimeUnit.MINUTES).asBinder());
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 164, 0}, true, new byte[]{0, 1, 1, 1}, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 4, 164, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), "uninstall");
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return unit;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1227293L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.tossfeed.widget.TossFeedWidgetProvider$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return TossFeedWidgetProvider.IAuthTabCallback((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onExtraCallback("TOSS_FEED_UPDATE_WORK");
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Color.blue(0)), 35 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
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
            int i7 = $10 + 97;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.blue(0)), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16718 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 70 - Color.red(0), 12486 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i12 = $10 + 21;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
