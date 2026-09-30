package im.toss.securities.widget.overview.ui.medium;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.overview.R;
import im.toss.securities.widget.overview.ui.medium.SecuritiesOverviewMediumAppWidgetReceiver;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda10;
import o.TooltipKtExternalSyntheticLambda3;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.doGet;
import o.findResAndMsg;
import o.getWrite;
import o.onVisit;
import o.q8a;
import o.r0e;
import o.r4;
import o.r5a;
import o.r6;
import o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks;
import o.registerClient;
import o.sp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewMediumWidgetWorker extends CoroutineWorker {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static boolean IAuthTabCallbackDefault = false;
    private static boolean IAuthTabCallbackStub = false;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static int onTransact;
    public static final int onWarmupCompleted;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback;
    private final r4 onExtraCallbackWithResult;
    private final registerClient onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            OverviewMediumWidgetWorker overviewMediumWidgetWorker = OverviewMediumWidgetWorker.this;
            if (i3 == 0) {
                overviewMediumWidgetWorker.doWork(this);
                throw null;
            }
            Object objDoWork = overviewMediumWidgetWorker.doWork(this);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objDoWork;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        onWarmupCompleted = 8;
        int i = asInterface + 5;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewMediumWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull r4 r4Var, @NotNull registerClient registerclient) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(r4Var, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.onExtraCallbackWithResult = r4Var;
        this.onNavigationEvent = registerclient;
        this.IAuthTabCallback = diskLruCacheEntry.IAuthTabCallback();
    }

    public static final /* synthetic */ r4 IAuthTabCallback(OverviewMediumWidgetWorker overviewMediumWidgetWorker) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        r4 r4Var = overviewMediumWidgetWorker.onExtraCallbackWithResult;
        int i5 = i3 + 61;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return r4Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(OverviewMediumWidgetWorker overviewMediumWidgetWorker, int i, OverviewMediumWidgetState overviewMediumWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 27;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        overviewMediumWidgetWorker.onExtraCallback(i, overviewMediumWidgetState);
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super OverviewMediumWidgetState>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = OverviewMediumWidgetWorker.this.new onExtraCallbackWithResult(this.$appWidgetId, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super OverviewMediumWidgetState> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super OverviewMediumWidgetState> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4VarIAuthTabCallback = OverviewMediumWidgetWorker.IAuthTabCallback(OverviewMediumWidgetWorker.this);
            Context applicationContext = OverviewMediumWidgetWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int i5 = this.$appWidgetId;
            this.label = 1;
            Object objIAuthTabCallback = r4VarIAuthTabCallback.IAuthTabCallback(applicationContext, i5, (access13800<? super OverviewMediumWidgetState>) this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i6 = IAuthTabCallback + 123;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0231, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af A[Catch: CancellationException -> 0x00b7, Exception -> 0x0327, WebResourceResponseModel -> 0x032a, TryCatch #6 {CancellationException -> 0x00b7, blocks: (B:29:0x00a1, B:69:0x0212, B:74:0x0226, B:79:0x0233, B:81:0x0275, B:85:0x0283, B:99:0x02f5, B:96:0x02a1, B:77:0x022d, B:97:0x02d6, B:20:0x006f, B:61:0x01ab, B:63:0x01af, B:64:0x01cc, B:66:0x0201), top: B:140:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6 A[Catch: CancellationException -> 0x00b7, Exception -> 0x0298, WebResourceResponseModel -> 0x029b, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x00b7, blocks: (B:29:0x00a1, B:69:0x0212, B:74:0x0226, B:79:0x0233, B:81:0x0275, B:85:0x0283, B:99:0x02f5, B:96:0x02a1, B:77:0x022d, B:97:0x02d6, B:20:0x006f, B:61:0x01ab, B:63:0x01af, B:64:0x01cc, B:66:0x0201), top: B:140:0x003b }] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        String str;
        char c;
        String str2;
        boolean zOnNavigationEvent;
        Object objOnExtraCallbackWithResult;
        DisplaySetting displaySetting;
        String str3;
        int i;
        boolean z;
        float f;
        DisplaySetting displaySetting2;
        String str4;
        Throwable th;
        int iOnNavigationEvent;
        String strOnExtraCallbackWithResult;
        DisplaySetting displaySetting3;
        String str5;
        int i2;
        IAuthTabCallback iAuthTabCallback2;
        int i3;
        int i4;
        boolean z2;
        String str6;
        DisplaySetting displaySetting4;
        float f2;
        DisplaySetting displaySetting5;
        float f3;
        String str7;
        OverviewMediumWidgetState overviewMediumWidgetState;
        OverviewMediumWidgetState overviewMediumWidgetState2;
        String str8;
        OverviewMediumWidgetWorker overviewMediumWidgetWorker = this;
        int i5 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i6 = access000 + 93;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i8 = iAuthTabCallback.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i8 - 2147483648;
            } else {
                iAuthTabCallback = overviewMediumWidgetWorker.new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
        Object objOnExtraCallback = iAuthTabCallback3.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallback3.label;
        int i10 = 31;
        float fFloatValue = 5.6E-45f;
        ?? r14 = 1;
        ?? r142 = 1;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
            c = 0;
        } catch (WebResourceResponseModel e3) {
            e = e3;
            str = "";
            c = 0;
        }
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            iOnNavigationEvent = getInputData().onNavigationEvent("appWidgetId", 0);
            strOnExtraCallbackWithResult = getInputData().onExtraCallbackWithResult("tag");
            if (strOnExtraCallbackWithResult == null) {
                int i11 = access100 + 37;
                access000 = i11 % 128;
                if (i11 % 2 == 0) {
                    ListenableWorker.onExtraCallbackWithResult onExtraCallbackWithResult2 = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult2, "");
                    return onExtraCallbackWithResult2;
                }
                Intrinsics.checkNotNullExpressionValue(ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult(), "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iOnNavigationEvent == 0) {
                ListenableWorker.onExtraCallbackWithResult onExtraCallbackWithResult3 = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult3, "");
                return onExtraCallbackWithResult3;
            }
            r0e r0eVar = r0e.onExtraCallbackWithResult;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            r0eVar.onExtraCallback(applicationContext, strOnExtraCallbackWithResult, iOnNavigationEvent);
            KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
            iAuthTabCallback3.L$0 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
            iAuthTabCallback3.I$0 = iOnNavigationEvent;
            iAuthTabCallback3.label = 1;
            objOnExtraCallback = overviewMediumWidgetWorker.IAuthTabCallback.onExtraCallback("display_setting_" + iOnNavigationEvent, kSerializerSerializer, iAuthTabCallback3);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i9 != 1) {
            int i12 = access000 + 31;
            int i13 = i12 % 128;
            access100 = i13;
            int i14 = i12 % 2;
            if (i9 == 2) {
                iOnNavigationEvent = iAuthTabCallback3.I$0;
                DisplaySetting displaySetting6 = (DisplaySetting) iAuthTabCallback3.L$1;
                String str9 = (String) iAuthTabCallback3.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                displaySetting3 = displaySetting6;
                str5 = str9;
                i10 = iOnNavigationEvent;
                Float f4 = (Float) objOnExtraCallback;
                fFloatValue = f4 == null ? f4.floatValue() : 1.0f;
                r0e r0eVar2 = r0e.onExtraCallbackWithResult;
                Context applicationContext2 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                zOnNavigationEvent = r0eVar2.onNavigationEvent(applicationContext2);
                Result.Companion companion = Result.Companion;
                if (zOnNavigationEvent) {
                    OverviewMediumWidgetState.Loading loading = new OverviewMediumWidgetState.Loading(displaySetting3, fFloatValue);
                    SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback4 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
                    Context applicationContext3 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
                    SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback.onExtraCallback(iAuthTabCallback4, applicationContext3, i10, loading, null, 8, null);
                }
                q8a q8aVar = q8a.onNavigationEvent;
                Context applicationContext4 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
                q8aVar.onWarmupCompleted(applicationContext4, "OverviewRepository.loadOverviewMediumData", access14000.onNavigationEvent(i10));
                onExtraCallbackWithResult onextracallbackwithresult = overviewMediumWidgetWorker.new onExtraCallbackWithResult(i10, null);
                iAuthTabCallback3.L$0 = access15400.onNavigationEvent(str5);
                iAuthTabCallback3.L$1 = displaySetting3;
                iAuthTabCallback3.L$2 = access15400.onNavigationEvent(iAuthTabCallback3);
                iAuthTabCallback3.I$0 = i10;
                iAuthTabCallback3.F$0 = fFloatValue;
                iAuthTabCallback3.Z$0 = zOnNavigationEvent;
                iAuthTabCallback3.I$1 = 0;
                iAuthTabCallback3.I$2 = 0;
                iAuthTabCallback3.label = 3;
                try {
                    objOnExtraCallback = doGet.onNavigationEvent(10000L, onextracallbackwithresult, iAuthTabCallback3);
                } catch (Exception e4) {
                    e = e4;
                    str2 = "";
                    c = 0;
                    r142 = displaySetting3;
                    Result.Companion companion2 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str2;
                    displaySetting = r142;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                } catch (WebResourceResponseModel e5) {
                    e = e5;
                    str = "";
                    c = 0;
                    r14 = displaySetting3;
                    Result.Companion companion3 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str;
                    displaySetting = r14;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                }
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    i2 = i10;
                    iAuthTabCallback2 = iAuthTabCallback3;
                    i3 = 0;
                    i4 = 0;
                    z2 = zOnNavigationEvent;
                    str6 = str5;
                    displaySetting4 = displaySetting3;
                    f2 = fFloatValue;
                    overviewMediumWidgetState2 = (OverviewMediumWidgetState) objOnExtraCallback;
                    onNavigationEvent(overviewMediumWidgetWorker, i2, overviewMediumWidgetState2);
                    if (!(overviewMediumWidgetState2 instanceof OverviewMediumWidgetState.Success)) {
                    }
                    i10 = i2;
                    z = z2;
                    f3 = f2;
                    displaySetting5 = displaySetting4;
                    str7 = str8;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                    f = f3;
                    i = i10;
                    displaySetting2 = displaySetting5;
                    str4 = str7;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                }
                return objOnWarmupCompleted;
            }
            int i15 = i13 + 35;
            access000 = i15 % 128;
            if (i15 % 2 == 0 ? i9 != 3 : i9 != 4) {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = iAuthTabCallback3.Z$0;
                f3 = iAuthTabCallback3.F$0;
                i10 = iAuthTabCallback3.I$0;
                overviewMediumWidgetState = (OverviewMediumWidgetState) iAuthTabCallback3.L$3;
                displaySetting5 = (DisplaySetting) iAuthTabCallback3.L$1;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    str7 = "";
                    c = 0;
                    SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback5 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
                    Context applicationContext5 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext5, str7);
                    iAuthTabCallback5.onExtraCallback(applicationContext5, i10, overviewMediumWidgetState, (r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent) objOnExtraCallback);
                    str7 = str7;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                    f = f3;
                    i = i10;
                    displaySetting2 = displaySetting5;
                    str4 = str7;
                } catch (WebResourceResponseModel e6) {
                    e = e6;
                    str7 = "";
                    c = 0;
                    fFloatValue = f3;
                    r14 = displaySetting5;
                    zOnNavigationEvent = z;
                    str = str7;
                    Result.Companion companion32 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str;
                    displaySetting = r14;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                } catch (Exception e7) {
                    e = e7;
                    str7 = "";
                    c = 0;
                    fFloatValue = f3;
                    r142 = displaySetting5;
                    zOnNavigationEvent = z;
                    str2 = str7;
                    Result.Companion companion22 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str2;
                    displaySetting = r142;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                }
                th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                if (th != null) {
                }
                Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                return objOnExtraCallbackWithResult;
            }
            i3 = iAuthTabCallback3.I$2;
            i4 = iAuthTabCallback3.I$1;
            boolean z3 = iAuthTabCallback3.Z$0;
            float f5 = iAuthTabCallback3.F$0;
            int i16 = iAuthTabCallback3.I$0;
            IAuthTabCallback iAuthTabCallback6 = (access13800) iAuthTabCallback3.L$2;
            DisplaySetting displaySetting7 = (DisplaySetting) iAuthTabCallback3.L$1;
            String str10 = (String) iAuthTabCallback3.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            i2 = i16;
            iAuthTabCallback2 = iAuthTabCallback6;
            z2 = z3;
            str6 = str10;
            displaySetting4 = displaySetting7;
            f2 = f5;
            try {
                overviewMediumWidgetState2 = (OverviewMediumWidgetState) objOnExtraCallback;
                onNavigationEvent(overviewMediumWidgetWorker, i2, overviewMediumWidgetState2);
                try {
                } catch (WebResourceResponseModel e8) {
                    e = e8;
                    i10 = i2;
                    zOnNavigationEvent = z2;
                    fFloatValue = f2;
                    r14 = displaySetting4;
                    str = overviewMediumWidgetWorker;
                    Result.Companion companion322 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str;
                    displaySetting = r14;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                } catch (Exception e9) {
                    e = e9;
                    i10 = i2;
                    zOnNavigationEvent = z2;
                    fFloatValue = f2;
                    r142 = displaySetting4;
                    str2 = overviewMediumWidgetWorker;
                    Result.Companion companion222 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    str3 = str2;
                    displaySetting = r142;
                    i = i10;
                    z = zOnNavigationEvent;
                    f = fFloatValue;
                    displaySetting2 = displaySetting;
                    str4 = str3;
                    th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                    return objOnExtraCallbackWithResult;
                }
            } catch (Exception e10) {
                e = e10;
                overviewMediumWidgetWorker = "";
                c = 0;
            } catch (WebResourceResponseModel e11) {
                e = e11;
                overviewMediumWidgetWorker = "";
                c = 0;
            }
            if (!(overviewMediumWidgetState2 instanceof OverviewMediumWidgetState.Success)) {
                int i17 = access100 + 25;
                access000 = i17 % 128;
                if (i17 % 2 != 0) {
                    if (Build.VERSION.SDK_INT >= 110) {
                        r5a r5aVar = r5a.onExtraCallback;
                        Context applicationContext6 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext6, "");
                        List<OverviewItemInfo> listIAuthTabCallbackStub = ((OverviewMediumWidgetState.Success) overviewMediumWidgetState2).ICustomTabsCallback().IAuthTabCallbackStub();
                        iAuthTabCallback3.L$0 = access15400.onNavigationEvent(str6);
                        iAuthTabCallback3.L$1 = displaySetting4;
                        iAuthTabCallback3.L$2 = access15400.onNavigationEvent(iAuthTabCallback2);
                        iAuthTabCallback3.L$3 = overviewMediumWidgetState2;
                        iAuthTabCallback3.I$0 = i2;
                        iAuthTabCallback3.F$0 = f2;
                        iAuthTabCallback3.Z$0 = z2;
                        iAuthTabCallback3.I$1 = i4;
                        iAuthTabCallback3.I$2 = i3;
                        iAuthTabCallback3.label = 4;
                        str7 = "";
                        c = 0;
                        Object objOnWarmupCompleted2 = r5a.onWarmupCompleted(r5aVar, applicationContext6, listIAuthTabCallbackStub, false, iAuthTabCallback3, 4, null);
                        if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                            overviewMediumWidgetState = overviewMediumWidgetState2;
                            objOnExtraCallback = objOnWarmupCompleted2;
                            i10 = i2;
                            z = z2;
                            f3 = f2;
                            displaySetting5 = displaySetting4;
                            try {
                                SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback52 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
                                Context applicationContext52 = getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext52, str7);
                                iAuthTabCallback52.onExtraCallback(applicationContext52, i10, overviewMediumWidgetState, (r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent) objOnExtraCallback);
                                str7 = str7;
                            } catch (WebResourceResponseModel e12) {
                                e = e12;
                                fFloatValue = f3;
                                r14 = displaySetting5;
                                zOnNavigationEvent = z;
                                str = str7;
                                Result.Companion companion3222 = Result.Companion;
                                objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                                str3 = str;
                                displaySetting = r14;
                                i = i10;
                                z = zOnNavigationEvent;
                                f = fFloatValue;
                                displaySetting2 = displaySetting;
                                str4 = str3;
                                th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                                if (th != null) {
                                }
                                Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                                return objOnExtraCallbackWithResult;
                            } catch (Exception e13) {
                                e = e13;
                                fFloatValue = f3;
                                r142 = displaySetting5;
                                zOnNavigationEvent = z;
                                str2 = str7;
                                Result.Companion companion2222 = Result.Companion;
                                objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                                str3 = str2;
                                displaySetting = r142;
                                i = i10;
                                z = zOnNavigationEvent;
                                f = fFloatValue;
                                displaySetting2 = displaySetting;
                                str4 = str3;
                                th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                                if (th != null) {
                                }
                                Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                                return objOnExtraCallbackWithResult;
                            }
                        }
                        return objOnWarmupCompleted;
                    }
                    String str11 = "";
                    c = 0;
                    r6.onWarmupCompleted onwarmupcompleted = r6.Companion;
                    Context applicationContext7 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext7, str11);
                    onwarmupcompleted.onNavigationEvent(applicationContext7, i2, (OverviewMediumWidgetState.Success) overviewMediumWidgetState2);
                    SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback7 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
                    Context applicationContext8 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext8, str11);
                    SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback.onExtraCallback(iAuthTabCallback7, applicationContext8, i2, overviewMediumWidgetState2, null, 8, null);
                    AppWidgetManager.getInstance(getApplicationContext()).notifyAppWidgetViewDataChanged(i2, R.id.stock_list);
                    str8 = str11;
                }
                objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                f = f3;
                i = i10;
                displaySetting2 = displaySetting5;
                str4 = str7;
                th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
                if (th != null) {
                    int i18 = access100 + 67;
                    access000 = i18 % 128;
                    if (i18 % 2 != 0) {
                        q8a q8aVar2 = q8a.onNavigationEvent;
                        getWrite.IAuthTabCallback("function", "doWork");
                        getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i));
                        th.getMessage();
                        throw null;
                    }
                    q8a q8aVar3 = q8a.onNavigationEvent;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "doWork");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", access14000.onNavigationEvent(i));
                    String message = th.getMessage();
                    if (message == null) {
                        int i19 = access000 + 21;
                        access100 = i19 % 128;
                        if (i19 % 2 == 0) {
                            Object[] objArr = new Object[1];
                            a(null, null, new byte[]{-123, -120, -121, -123, -122, -123, -124}, 4818 << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                            message = ((String) objArr[c]).intern();
                        } else {
                            Object[] objArr2 = new Object[1];
                            a(null, null, new byte[]{-123, -120, -121, -123, -122, -123, -124}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                            message = ((String) objArr2[c]).intern();
                        }
                    }
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("error", message);
                    Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("errorType", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName());
                    Pair[] pairArr = new Pair[4];
                    pairArr[c] = pairIAuthTabCallback;
                    pairArr[1] = pairIAuthTabCallback2;
                    pairArr[2] = pairIAuthTabCallback3;
                    pairArr[3] = pairIAuthTabCallback4;
                    q8aVar3.onExtraCallbackWithResult(access8100.onWarmupCompleted(pairArr));
                    if (z) {
                        OverviewMediumWidgetState.Error error = new OverviewMediumWidgetState.Error(displaySetting2, f, (String) null, 4, (DefaultConstructorMarker) null);
                        SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback8 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
                        Context applicationContext9 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext9, str4);
                        SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback.onExtraCallback(iAuthTabCallback8, applicationContext9, i, error, null, 8, null);
                    }
                    objOnExtraCallbackWithResult = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    int i20 = access100 + 87;
                    access000 = i20 % 128;
                    int i21 = i20 % 2;
                }
                Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
                return objOnExtraCallbackWithResult;
            }
            String str12 = "";
            c = 0;
            SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback9 = SecuritiesOverviewMediumAppWidgetReceiver.Companion;
            Context applicationContext10 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext10, str12);
            SecuritiesOverviewMediumAppWidgetReceiver.IAuthTabCallback.onExtraCallback(iAuthTabCallback9, applicationContext10, i2, overviewMediumWidgetState2, null, 8, null);
            str8 = str12;
            i10 = i2;
            z = z2;
            f3 = f2;
            displaySetting5 = displaySetting4;
            str7 = str8;
            objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
            f = f3;
            i = i10;
            displaySetting2 = displaySetting5;
            str4 = str7;
            th = Result.exceptionOrNull-impl(objOnExtraCallbackWithResult);
            if (th != null) {
            }
            Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, str4);
            return objOnExtraCallbackWithResult;
        }
        iOnNavigationEvent = iAuthTabCallback3.I$0;
        strOnExtraCallbackWithResult = (String) iAuthTabCallback3.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        DisplaySetting displaySettingOnNavigationEvent = (DisplaySetting) objOnExtraCallback;
        if (displaySettingOnNavigationEvent == null) {
            int i22 = access000 + 93;
            access100 = i22 % 128;
            int i23 = i22 % 2;
            displaySettingOnNavigationEvent = overviewMediumWidgetWorker.onNavigationEvent.onNavigationEvent();
        }
        KSerializer kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
        iAuthTabCallback3.L$0 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
        iAuthTabCallback3.L$1 = displaySettingOnNavigationEvent;
        iAuthTabCallback3.I$0 = iOnNavigationEvent;
        iAuthTabCallback3.label = 2;
        Object objOnExtraCallback2 = overviewMediumWidgetWorker.IAuthTabCallback.onExtraCallback("alpha_" + iOnNavigationEvent, kSerializerOnWarmupCompleted, iAuthTabCallback3);
        if (objOnExtraCallback2 != objOnWarmupCompleted) {
            displaySetting3 = displaySettingOnNavigationEvent;
            str5 = strOnExtraCallbackWithResult;
            objOnExtraCallback = objOnExtraCallback2;
            i10 = iOnNavigationEvent;
            Float f42 = (Float) objOnExtraCallback;
            fFloatValue = f42 == null ? f42.floatValue() : 1.0f;
            r0e r0eVar22 = r0e.onExtraCallbackWithResult;
            Context applicationContext22 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext22, "");
            zOnNavigationEvent = r0eVar22.onNavigationEvent(applicationContext22);
            Result.Companion companion4 = Result.Companion;
            if (zOnNavigationEvent) {
            }
            q8a q8aVar4 = q8a.onNavigationEvent;
            Context applicationContext42 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext42, "");
            q8aVar4.onWarmupCompleted(applicationContext42, "OverviewRepository.loadOverviewMediumData", access14000.onNavigationEvent(i10));
            onExtraCallbackWithResult onextracallbackwithresult2 = overviewMediumWidgetWorker.new onExtraCallbackWithResult(i10, null);
            iAuthTabCallback3.L$0 = access15400.onNavigationEvent(str5);
            iAuthTabCallback3.L$1 = displaySetting3;
            iAuthTabCallback3.L$2 = access15400.onNavigationEvent(iAuthTabCallback3);
            iAuthTabCallback3.I$0 = i10;
            iAuthTabCallback3.F$0 = fFloatValue;
            iAuthTabCallback3.Z$0 = zOnNavigationEvent;
            iAuthTabCallback3.I$1 = 0;
            iAuthTabCallback3.I$2 = 0;
            iAuthTabCallback3.label = 3;
            objOnExtraCallback = doGet.onNavigationEvent(10000L, onextracallbackwithresult2, iAuthTabCallback3);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
        }
        return objOnWarmupCompleted;
    }

    private final void onExtraCallback(int i, OverviewMediumWidgetState overviewMediumWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 115;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        q8a q8aVar = q8a.onNavigationEvent;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "doWork");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -125, -126, -127}, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onVisit.IAuthTabCallback(overviewMediumWidgetState))}));
        int i5 = access000 + 47;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static /* synthetic */ boolean onWarmupCompleted(onWarmupCompleted onwarmupcompleted, Context context, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 4) != 0) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 13;
                onExtraCallbackWithResult = i5 % 128;
                boolean z2 = i5 % 2 == 0;
                int i6 = i4 + 77;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = z2;
            }
            return onwarmupcompleted.onExtraCallback(context, i, z);
        }

        public final void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "OVERVIEW_MEDIUM_");
            int i4 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallback(@NotNull Context context, int i, boolean z) {
            TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e r0eVar = r0e.onExtraCallbackWithResult;
            if (!z) {
                int i5 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    r0eVar.IAuthTabCallback(context, "OVERVIEW_MEDIUM_", i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (r0eVar.IAuthTabCallback(context, "OVERVIEW_MEDIUM_", i)) {
                    return false;
                }
            }
            String str = "OVERVIEW_MEDIUM_" + i;
            if (z) {
                int i6 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
            } else {
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.KEEP;
            }
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(OverviewMediumWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("tag", "OVERVIEW_MEDIUM_")};
            TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
            for (int i8 = 0; i8 < 2; i8++) {
                Pair pair = pairArr[i8];
                onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
            }
            TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("OVERVIEW_MEDIUM_").asBinder());
            return true;
        }

        public final void onExtraCallbackWithResult(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "OVERVIEW_MEDIUM_");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SecuritiesOverviewMediumAppWidgetReceiver.class));
            Intrinsics.checkNotNull(appWidgetIds);
            for (int i2 : appWidgetIds) {
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                String str = "OVERVIEW_MEDIUM_" + i2;
                TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(OverviewMediumWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
                Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i2)), getWrite.IAuthTabCallback("tag", "OVERVIEW_MEDIUM_")};
                TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
                int i3 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 0;
                while (i5 < 2) {
                    int i6 = onExtraCallbackWithResult + 53;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        Pair pair = pairArr[i5];
                        onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                        i5 += 113;
                    } else {
                        Pair pair2 = pairArr[i5];
                        onextracallback.onExtraCallbackWithResult((String) pair2.getFirst(), pair2.getSecond());
                        i5++;
                    }
                }
                TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
                TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("OVERVIEW_MEDIUM_").asBinder());
            }
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int i4 = $10 + 111;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 87;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 76, Process.getGidForName("") + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 78 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0, 0) + 75, 16037 - (ViewConfiguration.getLongPressTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 63, TextUtils.lastIndexOf("", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr4);
            int i7 = $11 + 85;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
            return;
        }
        if (!IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 63 - (ViewConfiguration.getScrollBarSize() >> 8), 12214 - Color.argb(0, 0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{32462, 32457, 32510, 32509, 32452, 32455, 32507, 32499};
        asBinder = -1184333974;
        IAuthTabCallbackStub = true;
        IAuthTabCallbackDefault = true;
    }
}
