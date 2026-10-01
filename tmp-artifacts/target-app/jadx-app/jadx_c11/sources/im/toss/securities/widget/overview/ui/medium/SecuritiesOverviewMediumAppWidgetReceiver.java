package im.toss.securities.widget.overview.ui.medium;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access8100;
import o.findRes;
import o.findResAndMsg;
import o.getFullPackage;
import o.getPackageType;
import o.getWrite;
import o.isNeedUnzip;
import o.notify;
import o.putChannelInfo;
import o.q8ExternalSyntheticLambda4;
import o.q8a;
import o.r5a;
import o.r6;
import o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks;
import o.setProgressAsync;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class SecuritiesOverviewMediumAppWidgetReceiver extends AppWidgetProvider {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private static final findResAndMsg onExtraCallbackWithResult = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r12 = new java.util.ArrayList();
        r1 = r13.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r2 >= r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r9 = r13[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetWorker.onWarmupCompleted.onWarmupCompleted(im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetWorker.Companion, r11, r9, false, 4, null) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r12.add(java.lang.Integer.valueOf(r9));
        r3 = im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallbackDefault + 111;
        im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.onExtraCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r12.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        o.maybeUpdateAnimatable.onNavigationEvent(im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.onExtraCallbackWithResult, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.onWarmupCompleted(goAsync(), r12, r11, (o.access13800) null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r1.onExtraCallback(r11, im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.class) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r1.onExtraCallback(r11, im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver.class) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r1.onNavigationEvent(r11, r12, r13);
        im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetWorker.Companion.onNavigationEvent(r11);
     */
    @Override // android.appwidget.AppWidgetProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        setProgressAsync setprogressasync;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(appWidgetManager, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            setprogressasync = setProgressAsync.onExtraCallback;
            int i4 = 70 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(appWidgetManager, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            setprogressasync = setProgressAsync.onExtraCallback;
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
            int i3 = IAuthTabCallbackDefault + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = iArr[i2];
                r6.Companion.onExtraCallback(context, i4);
                q8a.onNavigationEvent.onExtraCallback(context, i4);
                i2 += 64;
            } else {
                int i5 = iArr[i2];
                r6.Companion.onExtraCallback(context, i5);
                q8a.onNavigationEvent.onExtraCallback(context, i5);
                i2++;
            }
        }
        int i6 = onExtraCallback + 49;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        OverviewMediumWidgetWorker.Companion.onNavigationEvent(context);
        getFullPackage.onWarmupCompleted(onExtraCallbackWithResult.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        int i4 = onExtraCallback + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        String action = intent.getAction();
        if (action != null) {
            int i2 = IAuthTabCallbackDefault + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
                if (action.hashCode() == -165459728) {
                    if (action.equals("im.toss.securities.widget.overview.ACTION_REFRESH_MEDIUM")) {
                        int i4 = onExtraCallback + 63;
                        IAuthTabCallbackDefault = i4 % 128;
                        if (i4 % 2 != 0) {
                            IAuthTabCallback(context, intent);
                            return;
                        }
                        IAuthTabCallback(context, intent);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            } else if (action.hashCode() == -165459728) {
            }
        }
        super.onReceive(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(Context context, Intent intent) {
        String className;
        int i = 2 % 2;
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        if (intExtra != 0) {
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(intExtra);
            if (appWidgetInfo != null) {
                int i2 = IAuthTabCallbackDefault + 109;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                ComponentName componentName = appWidgetInfo.provider;
                if (componentName != null) {
                    int i4 = onExtraCallback + 103;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    className = componentName.getClassName();
                    int i6 = onExtraCallback + 9;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    className = null;
                }
            }
            if (Intrinsics.areEqual(className, SecuritiesOverviewMediumAppWidgetReceiver.class.getName())) {
                OverviewMediumWidgetWorker.Companion.onExtraCallback(context, intExtra, true);
                q8a.onNavigationEvent.IAuthTabCallback(intExtra, "리프레시아이콘", true);
            }
        }
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        private static char[] onExtraCallbackWithResult = {32424, 32439, 32434, 32438, 32430};
        private static int onWarmupCompleted = -1184334043;
        private static boolean IAuthTabCallback = true;
        private static boolean onNavigationEvent = true;

        static final class onExtraCallbackWithResult extends ContinuationImpl {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            int I$0;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(access13800Var);
            }

            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                Object objOnExtraCallback = IAuthTabCallback.this.onExtraCallback((Context) null, 0, (access13800<? super Unit>) this);
                int i4 = onExtraCallbackWithResult + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ void onExtraCallback(IAuthTabCallback iAuthTabCallback, Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState, r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent onnavigationevent, int i2, Object obj) throws Throwable {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 27;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 8) != 0) {
                Map map = null;
                onnavigationevent = new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, map, 3, map);
            }
            iAuthTabCallback.onExtraCallback(context, i, overviewMediumWidgetState, onnavigationevent);
            int i6 = onExtraCallback + 79;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }

        public final void onExtraCallback(@NotNull Context context, int i, @NotNull OverviewMediumWidgetState overviewMediumWidgetState, @NotNull r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent onnavigationevent) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 109;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(overviewMediumWidgetState, "");
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                boolean z = overviewMediumWidgetState instanceof OverviewMediumWidgetState.Loading;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(overviewMediumWidgetState, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            if (!(overviewMediumWidgetState instanceof OverviewMediumWidgetState.Loading)) {
                int i4 = IAuthTabCallbackStub + 43;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onExtraCallback(context, i, overviewMediumWidgetState);
                    obj.hashCode();
                    throw null;
                }
                onExtraCallback(context, i, overviewMediumWidgetState);
            }
            AppWidgetManager.getInstance(context).updateAppWidget(i, r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.IAuthTabCallback(r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent, context, i, overviewMediumWidgetState, false, onnavigationevent, 8, null));
            q8a q8aVar = q8a.onNavigationEvent;
            q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("function", "SecuritiesOverviewMediumAppWidgetReceiver.updateWidget"), getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("state", Reflection.getOrCreateKotlinClass(overviewMediumWidgetState.getClass()).getSimpleName())}));
            q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = q8aVar.onWarmupCompleted(i);
            if (q8externalsyntheticlambda4OnWarmupCompleted == null) {
                q8externalsyntheticlambda4OnWarmupCompleted = q8ExternalSyntheticLambda4.medium;
                int i5 = IAuthTabCallbackStub + 1;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            q8aVar.onNavigationEvent(context, i, "위젯사용현황", "myAsset", q8externalsyntheticlambda4OnWarmupCompleted.name());
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int i4 = $11 + 25;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 107;
                    $11 = i7 % 128;
                    int i8 = i7 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), Color.argb(0, 0, 0, 0) + 77, View.resolveSizeAndState(0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        i2 = 2;
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
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 75, MotionEvent.axisFromString("") + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i9 = 1052772399;
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i9 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i10 = $10 + 83;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 63 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
        /* JADX WARN: Type inference failed for: r14v12, types: [int] */
        /* JADX WARN: Type inference failed for: r1v32 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v4, types: [im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver$IAuthTabCallback$onExtraCallbackWithResult, o.access13800] */
        /* JADX WARN: Type inference failed for: r6v3, types: [o.r5a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object onExtraCallback(@NotNull Context context, int i, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
            int i2;
            ?? r1;
            OverviewMediumWidgetState overviewMediumWidgetStateIAuthTabCallback;
            r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent onnavigationevent;
            Object objOnNavigationEvent;
            Exception e;
            String message;
            int i3 = 2 % 2;
            Map map = null;
            if (!(access13800Var instanceof onExtraCallbackWithResult)) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                i2 = IAuthTabCallbackStub + 49;
                r1 = onextracallbackwithresult;
            } else {
                int i4 = IAuthTabCallbackStub + 41;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = ((onExtraCallbackWithResult) access13800Var).label;
                    throw null;
                }
                onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) access13800Var;
                int i6 = onextracallbackwithresult2.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    int i7 = onExtraCallback + 117;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    onextracallbackwithresult2.label = i6 - 2147483648;
                    i2 = IAuthTabCallbackStub + 61;
                    r1 = onextracallbackwithresult2;
                }
            }
            onExtraCallback = i2 % 128;
            int i9 = i2 % 2;
            Object obj = r1.result;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i10 = r1.label;
            int i11 = 3;
            try {
                if (i10 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    overviewMediumWidgetStateIAuthTabCallback = IAuthTabCallback(context, i);
                    if (overviewMediumWidgetStateIAuthTabCallback == null) {
                        int i12 = onExtraCallback + 101;
                        IAuthTabCallbackStub = i12 % 128;
                        int i13 = i12 % 2;
                        return Unit.INSTANCE;
                    }
                    if (!(overviewMediumWidgetStateIAuthTabCallback instanceof OverviewMediumWidgetState.Success) || Build.VERSION.SDK_INT < 31) {
                        onnavigationevent = new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, map, i11, map);
                        onExtraCallback(context, i, overviewMediumWidgetStateIAuthTabCallback, onnavigationevent);
                        return Unit.INSTANCE;
                    }
                    try {
                        ?? r6 = r5a.onExtraCallback;
                        List<OverviewItemInfo> listIAuthTabCallbackStub = ((OverviewMediumWidgetState.Success) overviewMediumWidgetStateIAuthTabCallback).ICustomTabsCallback().IAuthTabCallbackStub();
                        r1.L$0 = context;
                        r1.L$1 = overviewMediumWidgetStateIAuthTabCallback;
                        r1.I$0 = i;
                        r1.label = 1;
                        objOnNavigationEvent = r6.onNavigationEvent(context, listIAuthTabCallbackStub, true, r1);
                        if (objOnNavigationEvent == objOnWarmupCompleted) {
                            int i14 = IAuthTabCallbackStub + 43;
                            int i15 = i14 % 128;
                            onExtraCallback = i15;
                            int i16 = i14 % 2;
                            int i17 = i15 + 87;
                            IAuthTabCallbackStub = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 41 / 0;
                            }
                            return objOnWarmupCompleted;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        overviewMediumWidgetStateIAuthTabCallback = overviewMediumWidgetStateIAuthTabCallback;
                        i = i;
                        q8a q8aVar = q8a.onNavigationEvent;
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewMedium.restoreLastState.preload");
                        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i));
                        message = e.getMessage();
                        if (message == null) {
                        }
                        q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
                        onnavigationevent = new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, map, i11, map);
                        onExtraCallback(context, i, overviewMediumWidgetStateIAuthTabCallback, onnavigationevent);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i19 = onExtraCallback + 117;
                    ?? r14 = i19 % 128;
                    IAuthTabCallbackStub = r14;
                    int i20 = i19 % 2;
                    try {
                        if (i20 == 0) {
                            int i21 = r1.I$0;
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        int i22 = r1.I$0;
                        OverviewMediumWidgetState overviewMediumWidgetState = (OverviewMediumWidgetState) r1.L$1;
                        Context context2 = (Context) r1.L$0;
                        ResultKt.onNavigationEvent(obj);
                        i = i22;
                        context = context2;
                        objOnNavigationEvent = obj;
                        overviewMediumWidgetStateIAuthTabCallback = overviewMediumWidgetState;
                    } catch (Exception e3) {
                        i = i20;
                        context = r1;
                        e = e3;
                        overviewMediumWidgetStateIAuthTabCallback = r14;
                        q8a q8aVar2 = q8a.onNavigationEvent;
                        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("function", "OverviewMedium.restoreLastState.preload");
                        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i));
                        message = e.getMessage();
                        if (message == null) {
                            Object[] objArr = new Object[1];
                            a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (KeyEvent.getMaxKeyCode() >> 16) + 127, objArr);
                            message = ((String) objArr[0]).intern();
                        }
                        q8aVar2.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback3, pairIAuthTabCallback22, getWrite.IAuthTabCallback("error", message)}));
                        onnavigationevent = new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, map, i11, map);
                        onExtraCallback(context, i, overviewMediumWidgetStateIAuthTabCallback, onnavigationevent);
                        return Unit.INSTANCE;
                    }
                }
                onnavigationevent = (r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent) objOnNavigationEvent;
                onExtraCallback(context, i, overviewMediumWidgetStateIAuthTabCallback, onnavigationevent);
                return Unit.INSTANCE;
            } catch (CancellationException e4) {
                throw e4;
            }
        }

        private final void onExtraCallback(Context context, int i, OverviewMediumWidgetState overviewMediumWidgetState) throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                SharedPreferences sharedPreferences = context.getSharedPreferences("overview_medium_widget_state", 0);
                wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                String strOnWarmupCompleted = wie2VarOnExtraCallback.onWarmupCompleted(OverviewMediumWidgetState.Companion.serializer(), overviewMediumWidgetState);
                sharedPreferences.edit().putString("state_" + i, strOnWarmupCompleted).apply();
                obj = Result.constructor-impl(Unit.INSTANCE);
                int i3 = onExtraCallback + 73;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                int i5 = IAuthTabCallbackStub + 107;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    q8a q8aVar = q8a.onNavigationEvent;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewMedium.saveState");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                    String message = th2.getMessage();
                    if (message == null) {
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                        message = ((String) objArr[0]).intern();
                    }
                    q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
                    return;
                }
                q8a q8aVar2 = q8a.onNavigationEvent;
                getWrite.IAuthTabCallback("function", "OverviewMedium.saveState");
                getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                th2.getMessage();
                throw null;
            }
        }

        private final OverviewMediumWidgetState IAuthTabCallback(Context context, int i) throws Throwable {
            Object obj;
            String string;
            int i2 = 2 % 2;
            try {
                Result.Companion companion = Result.Companion;
                string = context.getSharedPreferences("overview_medium_widget_state", 0).getString("state_" + i, null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (string == null) {
                return null;
            }
            wie2 wie2VarOnExtraCallback = notify.onExtraCallback();
            wie2VarOnExtraCallback.onExtraCallback();
            obj = Result.constructor-impl((OverviewMediumWidgetState) wie2VarOnExtraCallback.onExtraCallback(OverviewMediumWidgetState.Companion.serializer(), string));
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                q8a q8aVar = q8a.onNavigationEvent;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "OverviewMedium.loadState");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
                String message = th2.getMessage();
                if (message == null) {
                    int i3 = onExtraCallback + 123;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, objArr);
                    message = ((String) objArr[0]).intern();
                    int i5 = onExtraCallback + 77;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                }
                q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)}));
            }
            return (OverviewMediumWidgetState) (Result.onExtraCallback(obj) ^ true ? obj : null);
        }
    }

    static {
        int i = onNavigationEvent + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
