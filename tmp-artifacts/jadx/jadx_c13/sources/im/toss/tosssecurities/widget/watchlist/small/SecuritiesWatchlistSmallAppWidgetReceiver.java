package im.toss.tosssecurities.widget.watchlist.small;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallWidgetWorker;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFj1mSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.access8000;
import o.getKekid;
import o.getWrite;
import o.notify;
import o.q8a;
import o.setProgressAsync;
import o.wie2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesWatchlistSmallAppWidgetReceiver extends AppWidgetProvider {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 77;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, SecuritiesWatchlistSmallAppWidgetReceiver.class)) {
            int i4 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
            WatchlistSmallWidgetWorker.Companion.onExtraCallback(context);
            return;
        }
        for (int i6 : iArr) {
            if (!WatchlistSmallWidgetWorker.onWarmupCompleted.onNavigationEvent(WatchlistSmallWidgetWorker.Companion, context, i6, false, 4, null)) {
                int i7 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Companion.onNavigationEvent(context, i6);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            q8a.onNavigationEvent.onTransact(context, iArr[i2]);
            i2++;
            int i5 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        WatchlistSmallWidgetWorker.Companion.onExtraCallback(context);
        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        String action = intent.getAction();
        if (action != null) {
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
                if (action.hashCode() == 542102142) {
                    if (action.equals("im.toss.securities.widget.watchlist.ACTION_REFRESH_SMALL")) {
                        onExtraCallbackWithResult(context, intent);
                        return;
                    }
                }
            } else if (action.hashCode() == 542102142) {
            }
        }
        super.onReceive(context, intent);
        int i6 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onExtraCallbackWithResult(Context context, Intent intent) {
        int i = 2 % 2;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        if (intExtra != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            String className = null;
            if (appWidgetInfo != null) {
                int i4 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                ComponentName componentName = appWidgetInfo.provider;
                if (componentName != null) {
                    int i6 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        componentName.getClassName();
                        className.hashCode();
                        throw null;
                    }
                    className = componentName.getClassName();
                }
            }
            if (Intrinsics.areEqual(className, SecuritiesWatchlistSmallAppWidgetReceiver.class.getName())) {
                WatchlistSmallWidgetWorker.Companion.IAuthTabCallback(context, intExtra, true);
                Object[] objArr = {q8a.onNavigationEvent, Integer.valueOf(intExtra), "리프레시아이콘", true};
                int iOnExtraCallback = getKekid.onExtraCallback();
                int iOnExtraCallback2 = getKekid.onExtraCallback();
                q8a.onWarmupCompleted(getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback, objArr, 111645652, iOnExtraCallback2, -111645643);
            }
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private static char[] onNavigationEvent = {64988, 64990, 64964, 64991, 64976, 64989, 64966, 64977, 64984};
        private static char onExtraCallback = 51242;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onWarmupCompleted(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            if (!(watchlistWidgetState instanceof WatchlistWidgetState.Loading)) {
                int i3 = IAuthTabCallback + 43;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean z = watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress;
                    throw null;
                }
                if (!(watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress)) {
                    onNavigationEvent(context, i, watchlistWidgetState);
                }
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i, AFj1mSDK.onExtraCallback(AFj1mSDK.IAuthTabCallback, context, i, watchlistWidgetState, false, 8, null));
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "SecuritiesWatchlistSmallAppWidgetReceiver.updateWidget"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("state", Reflection.getOrCreateKotlinClass(watchlistWidgetState.getClass()).getSimpleName())));
            q8aVar.onNavigationEvent(context, i, "위젯사용현황", "stocks", "small");
            int i4 = onWarmupCompleted + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onNavigationEvent(@NotNull Context context, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                onExtraCallbackWithResult(context, i);
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            WatchlistWidgetState watchlistWidgetStateOnExtraCallbackWithResult = onExtraCallbackWithResult(context, i);
            if (watchlistWidgetStateOnExtraCallbackWithResult == null) {
                return;
            }
            onWarmupCompleted(context, i, watchlistWidgetStateOnExtraCallbackWithResult);
            int i4 = IAuthTabCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        private final void onNavigationEvent(Context context, int i, WatchlistWidgetState watchlistWidgetState) throws Throwable {
            Object objM31constructorimpl;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("watchlist_small_widget_state", 0);
                wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                String strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(WatchlistWidgetState.Companion.serializer(), watchlistWidgetState);
                sharedPreferences.edit().putString("state_" + i, strOnWarmupCompleted).apply();
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                int i3 = onWarmupCompleted + 53;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    q8a q8aVar = q8a.onNavigationEvent;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "WatchlistSmall.saveState");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                    String message = thM32exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        Object[] objArr = new Object[1];
                        a(new char[]{'\b', 3, 2, '\b', 1, 0, 13880}, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 68), 7 - Color.red(0), objArr);
                        message = ((String) objArr[0]).intern();
                        int i4 = IAuthTabCallback + 51;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
                    return;
                }
                q8a q8aVar2 = q8a.onNavigationEvent;
                getWrite.IAuthTabCallback("function", "WatchlistSmall.saveState");
                getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                thM32exceptionOrNullimpl.getMessage();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private final WatchlistWidgetState onExtraCallbackWithResult(Context context, int i) throws Throwable {
            Object objM31constructorimpl;
            String string;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                string = context.getSharedPreferences("watchlist_small_widget_state", 0).getString("state_" + i, null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            if (string == null) {
                int i3 = IAuthTabCallback + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            objM31constructorimpl = Result.m31constructorimpl((WatchlistWidgetState) wie2VarOnExtraCallback.onExtraCallback(WatchlistWidgetState.Companion.serializer(), string));
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "WatchlistSmall.loadState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = thM32exceptionOrNullimpl.getMessage();
                if (message == null) {
                    int i5 = onWarmupCompleted + 23;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{'\b', 3, 2, '\b', 1, 0, 13880}, (byte) (59 >> Color.blue(0)), Color.alpha(1) * 18, objArr);
                        message = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{'\b', 3, 2, '\b', 1, 0, 13880}, (byte) (Color.blue(0) + 68), 7 - Color.alpha(0), objArr2);
                        message = ((String) objArr2[0]).intern();
                    }
                }
                q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
            }
            WatchlistWidgetState watchlistWidgetState = (WatchlistWidgetState) (!Result.onExtraCallback(objM31constructorimpl) ? objM31constructorimpl : null);
            int i6 = onWarmupCompleted + 69;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return watchlistWidgetState;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), AndroidCharacter.getMirror('0') - 22, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 24825), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, 8088 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                try {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 30, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i6 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i6];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i7 = $11 + 33;
                                    $10 = i7 % 128;
                                    int i8 = i7 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                } else {
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                    int i13 = $10 + 41;
                                    $11 = i13 % 128;
                                    i3 = 2;
                                    int i14 = i13 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                                    obj2 = obj;
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i3 = 2;
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                    obj2 = obj;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = $10 + 45;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }
}
