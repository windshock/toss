package im.toss.tosssecurities.widget.watchlist.medium;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.RemoteViews;
import im.toss.securities.widget.watchlist.R;
import im.toss.tosssecurities.widget.watchlist.medium.WatchlistMediumWidgetWorker;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFi1uSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8000;
import o.getWrite;
import o.notify;
import o.onLost;
import o.q8ExternalSyntheticLambda4;
import o.q8a;
import o.setProgressAsync;
import o.wie2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesWatchlistMediumAppWidgetReceiver extends AppWidgetProvider {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onNavigationEvent + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appWidgetManager, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        setProgressAsync setprogressasync = setProgressAsync.onExtraCallback;
        if (!setprogressasync.onExtraCallback(context, SecuritiesWatchlistMediumAppWidgetReceiver.class)) {
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setprogressasync.onNavigationEvent(context, appWidgetManager, iArr);
            WatchlistMediumWidgetWorker.Companion.onNavigationEvent(context);
            return;
        }
        for (int i4 : iArr) {
            if (!WatchlistMediumWidgetWorker.IAuthTabCallback.IAuthTabCallback(WatchlistMediumWidgetWorker.Companion, context, i4, false, 4, null)) {
                int i5 = onExtraCallback + 41;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    Companion.onExtraCallback(context, i4);
                    throw null;
                }
                Companion.onExtraCallback(context, i4);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onNavigationEvent(context, i5);
            q8aVar.onExtraCallbackWithResult(context, i5);
            AFi1uSDK.Companion.onNavigationEvent(context, i5);
            i4++;
            int i6 = onExtraCallback + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            WatchlistMediumWidgetWorker.Companion.onNavigationEvent(context);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            WatchlistMediumWidgetWorker.Companion.onNavigationEvent(context);
            throw null;
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            intent.getAction();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        String action = intent.getAction();
        if (action != null) {
            int i3 = onExtraCallbackWithResult + 21;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                action.hashCode();
                throw null;
            }
            if (action.hashCode() == -581056724 && action.equals("im.toss.tosssecurities.widget.watchlist.medium.ACTION_REFRESH")) {
                int i4 = onExtraCallback + 109;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(context, intent);
                int i6 = onExtraCallbackWithResult + 93;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        super.onReceive(context, intent);
    }

    private final void onNavigationEvent(Context context, Intent intent) {
        String className;
        ComponentName componentName;
        int i = 2 % 2;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        if (intExtra != 0) {
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null) {
                int i2 = onExtraCallbackWithResult + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                className = null;
            } else {
                int i4 = onExtraCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                className = componentName.getClassName();
            }
            if (Intrinsics.areEqual(className, SecuritiesWatchlistMediumAppWidgetReceiver.class.getName())) {
                WatchlistMediumWidgetWorker.Companion.onExtraCallbackWithResult(context, intExtra, true);
                q8a.onNavigationEvent.onWarmupCompleted(intExtra, "리프레시아이콘", true);
                int i6 = onExtraCallbackWithResult + 65;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 70 / 0;
                }
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int onWarmupCompleted;
        private static char[] onExtraCallback = {32521, 32528, 32531, 32535, 32527};
        private static int IAuthTabCallback = -1184333946;
        private static boolean onExtraCallbackWithResult = true;
        private static boolean onNavigationEvent = true;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, int i, WatchlistWidgetState watchlistWidgetState, onLost.onWarmupCompleted onwarmupcompleted, boolean z, int i2, Object obj) throws Throwable {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 25;
            asBinder = i4 % 128;
            if (i4 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 125) != 0) {
                onwarmupcompleted = new onLost.onWarmupCompleted(null, 1, 0 == true ? 1 : 0);
            }
            onLost.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
            if ((i2 & 16) != 0) {
                int i5 = onWarmupCompleted + 111;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            iAuthTabCallback.IAuthTabCallback(context, i, watchlistWidgetState, onwarmupcompleted2, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState, @NotNull onLost.onWarmupCompleted onwarmupcompleted, boolean z) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object obj = null;
            if (!(watchlistWidgetState instanceof WatchlistWidgetState.Loading)) {
                int i3 = onWarmupCompleted + 113;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z2 = watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress;
                    obj.hashCode();
                    throw null;
                }
                if (!(watchlistWidgetState instanceof WatchlistWidgetState.SettingInProgress)) {
                    onWarmupCompleted(context, i, watchlistWidgetState);
                }
            }
            RemoteViews remoteViewsIAuthTabCallback = onLost.IAuthTabCallback(onLost.onExtraCallbackWithResult, context, i, watchlistWidgetState, false, onwarmupcompleted, 8, null);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            appWidgetManager.updateAppWidget(i, remoteViewsIAuthTabCallback);
            if (!z && Build.VERSION.SDK_INT < 31) {
                int i4 = asBinder + 7;
                int i5 = i4 % 128;
                onWarmupCompleted = i5;
                if (i4 % 2 != 0) {
                    boolean z3 = watchlistWidgetState instanceof WatchlistWidgetState.ProductSuccess;
                    throw null;
                }
                if (!(watchlistWidgetState instanceof WatchlistWidgetState.ProductSuccess)) {
                    int i6 = i5 + 115;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    if (!(!(watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess))) {
                        appWidgetManager.notifyAppWidgetViewDataChanged(i, R.id.item_container);
                    }
                }
            }
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("function", "SecuritiesWatchlistMediumAppWidgetReceiver.updateWidget"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("state", Reflection.getOrCreateKotlinClass(watchlistWidgetState.getClass()).getSimpleName())));
            q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = q8aVar.onWarmupCompleted(i);
            if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
                int i8 = onWarmupCompleted + 47;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    q8ExternalSyntheticLambda4 q8externalsyntheticlambda4 = q8ExternalSyntheticLambda4.medium;
                    throw null;
                }
                q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
            }
            q8aVar.onNavigationEvent(context, i, "위젯사용현황", "stocks", q8externalsyntheticlambda4OnWarmupCompleted.name());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            r9 = im.toss.tosssecurities.widget.watchlist.medium.SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.onWarmupCompleted + 101;
            im.toss.tosssecurities.widget.watchlist.medium.SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.asBinder = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if ((r9 % 2) == 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        
            IAuthTabCallback(r8, r9, r10, r1, null, false, 24, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r1 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if (r1 == null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(@NotNull Context context, int i) throws Throwable {
            WatchlistWidgetState watchlistWidgetStateOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            int i3 = asBinder + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                watchlistWidgetStateOnExtraCallbackWithResult = onExtraCallbackWithResult(context, i);
                int i4 = 92 / 0;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                watchlistWidgetStateOnExtraCallbackWithResult = onExtraCallbackWithResult(context, i);
            }
        }

        private final void onWarmupCompleted(Context context, int i, WatchlistWidgetState watchlistWidgetState) throws Throwable {
            Object objM31constructorimpl;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("watchlist_medium_widget_state", 0);
                wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                String strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(WatchlistWidgetState.Companion.serializer(), watchlistWidgetState);
                sharedPreferences.edit().putString("state_" + i, strOnWarmupCompleted).apply();
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                int i3 = onWarmupCompleted + 103;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                int i5 = onWarmupCompleted + 109;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "saveState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = thM32exceptionOrNullimpl.getMessage();
                if (message == null) {
                    int i7 = onWarmupCompleted + 63;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
                    message = ((String) objArr[0]).intern();
                    int i9 = onWarmupCompleted + 9;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                }
                q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
            }
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            Object obj = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), 77 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            float f = 0.0f;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 75 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 16037 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onNavigationEvent) {
                int i5 = $11 + 25;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 64, 12213 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    f = 0.0f;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $11 + 11;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] << iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                String str = new String(cArr5);
                int i10 = $11 + 101;
                $10 = i10 % 128;
                if (i10 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            int i11 = $11 + 103;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12214 - KeyEvent.normalizeMetaState(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str2 = new String(cArr6);
            int i13 = $11 + 19;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private final WatchlistWidgetState onExtraCallbackWithResult(Context context, int i) throws Throwable {
            Object objM31constructorimpl;
            String string;
            int i2 = 2 % 2;
            Object obj = null;
            try {
                Result.Companion companion = Result.Companion;
                string = context.getSharedPreferences("watchlist_medium_widget_state", 0).getString("state_" + i, null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            if (string == null) {
                int i3 = onWarmupCompleted + 37;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            objM31constructorimpl = Result.m31constructorimpl((WatchlistWidgetState) wie2VarOnExtraCallback.onExtraCallback(WatchlistWidgetState.Companion.serializer(), string));
            int i5 = onWarmupCompleted + 9;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                int i7 = asBinder + 59;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "loadState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = thM32exceptionOrNullimpl.getMessage();
                if (message == null) {
                    int i9 = onWarmupCompleted + 91;
                    asBinder = i9 % 128;
                    if (i9 % 2 == 0) {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 15 << (ViewConfiguration.getPressedStateDuration() * 106), objArr);
                        message = ((String) objArr[0]).intern();
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr2);
                        message = ((String) objArr2[0]).intern();
                    }
                }
                q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
            }
            if (Result.onExtraCallback(objM31constructorimpl)) {
                int i10 = asBinder + 39;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            } else {
                obj = objM31constructorimpl;
            }
            return (WatchlistWidgetState) obj;
        }
    }
}
