package im.toss.securities.widget.overview.ui.small;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.securities.widget.overview.SecuritiesOverviewAppWidgetReceiver;
import im.toss.securities.widget.overview.ui.small.model.OverviewSmallWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.lang.reflect.Method;
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
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda10;
import o.TooltipKtExternalSyntheticLambda3;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
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
import o.registerClient;
import o.sp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewSmallWidgetWorker extends CoroutineWorker {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    public static final int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onTransact;
    private final registerClient IAuthTabCallback;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback onNavigationEvent;
    private final r4 onWarmupCompleted;
    private static final byte[] $$a = {62, 54, 60, 44};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = OverviewSmallWidgetWorker.this.doWork(this);
            int i4 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objDoWork;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4;
        int i5 = i + 4;
        int i6 = b + 109;
        byte[] bArr = $$a;
        int i7 = 1 - (s * 2);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i5 += -i6;
            i3 = i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i9 = i3 + 1;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i6 = bArr[i9];
            i5 += -i6;
            i3 = i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i92 = i3 + 1;
            if (i4 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i6;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            int i922 = i3 + 1;
            if (i4 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        onExtraCallback = 8;
        int i = asBinder + 5;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewSmallWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull r4 r4Var, @NotNull registerClient registerclient) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(r4Var, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.onWarmupCompleted = r4Var;
        this.IAuthTabCallback = registerclient;
        this.onNavigationEvent = diskLruCacheEntry.IAuthTabCallback();
    }

    public static final /* synthetic */ r4 IAuthTabCallback(OverviewSmallWidgetWorker overviewSmallWidgetWorker) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        r4 r4Var = overviewSmallWidgetWorker.onWarmupCompleted;
        int i5 = i2 + 57;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return r4Var;
    }

    public static final /* synthetic */ void IAuthTabCallback(OverviewSmallWidgetWorker overviewSmallWidgetWorker, int i, OverviewSmallWidgetState overviewSmallWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 95;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        overviewSmallWidgetWorker.onExtraCallbackWithResult(i, overviewSmallWidgetState);
        int i5 = IAuthTabCallback_Parcel + 125;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super OverviewSmallWidgetState>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = OverviewSmallWidgetWorker.this.new onExtraCallbackWithResult(this.$appWidgetId, access13800Var);
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super OverviewSmallWidgetState> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r4 r4VarIAuthTabCallback = OverviewSmallWidgetWorker.IAuthTabCallback(OverviewSmallWidgetWorker.this);
            Context applicationContext = OverviewSmallWidgetWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int i7 = this.$appWidgetId;
            this.label = 1;
            Object objOnNavigationEvent = r4VarIAuthTabCallback.onNavigationEvent(applicationContext, i7, (access13800<? super OverviewSmallWidgetState>) this);
            if (objOnNavigationEvent != objOnWarmupCompleted) {
                return objOnNavigationEvent;
            }
            int i8 = onNavigationEvent + 83;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153 A[Catch: Exception -> 0x01c9, CancellationException -> 0x01d5, WebResourceResponseModel -> 0x01d7, TryCatch #4 {CancellationException -> 0x01d5, blocks: (B:52:0x014f, B:54:0x0153, B:55:0x0164, B:59:0x01a3, B:20:0x0060), top: B:80:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i;
        String str;
        boolean zOnNavigationEvent;
        float fFloatValue;
        DisplaySetting displaySetting;
        int i2;
        WebResourceResponseModel e;
        Object objOnExtraCallbackWithResult;
        DisplaySetting displaySetting2;
        int i3;
        float f;
        boolean z;
        float f2;
        DisplaySetting displaySetting3;
        Exception e2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback_Parcel + 59;
        asInterface = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            boolean z2 = access13800Var instanceof onExtraCallback;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i6 = onextracallback.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i6 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                int iOnNavigationEvent = getInputData().onNavigationEvent("appWidgetId", 0);
                String strOnExtraCallbackWithResult = getInputData().onExtraCallbackWithResult("tag");
                if (strOnExtraCallbackWithResult == null) {
                    ListenableWorker.onExtraCallbackWithResult onExtraCallbackWithResult2 = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(onExtraCallbackWithResult2, "");
                    return onExtraCallbackWithResult2;
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
                onextracallback.L$0 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                onextracallback.I$0 = iOnNavigationEvent;
                onextracallback.label = 1;
                Object objOnExtraCallback = this.onNavigationEvent.onExtraCallback("display_setting_" + iOnNavigationEvent, kSerializerSerializer, onextracallback);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    i = iOnNavigationEvent;
                    objOnNavigationEvent = objOnExtraCallback;
                    str = strOnExtraCallbackWithResult;
                }
                return objOnWarmupCompleted;
            }
            int i8 = asInterface + 33;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = onextracallback.Z$0;
                    f = onextracallback.F$0;
                    i3 = onextracallback.I$0;
                    displaySetting2 = (DisplaySetting) onextracallback.L$1;
                    try {
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                        int i9 = asInterface + 1;
                        IAuthTabCallback_Parcel = i9 % 128;
                        int i10 = i9 % 2;
                        OverviewSmallWidgetState overviewSmallWidgetState = (OverviewSmallWidgetState) objOnNavigationEvent;
                        IAuthTabCallback(this, i3, overviewSmallWidgetState);
                        SecuritiesOverviewAppWidgetReceiver.onExtraCallbackWithResult onextracallbackwithresult = SecuritiesOverviewAppWidgetReceiver.Companion;
                        Context applicationContext2 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                        onextracallbackwithresult.onExtraCallback(applicationContext2, i3, overviewSmallWidgetState);
                        objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                        f2 = f;
                        displaySetting3 = displaySetting2;
                    } catch (Exception e3) {
                        e2 = e3;
                        zOnNavigationEvent = z;
                        fFloatValue = f;
                        i2 = i3;
                        displaySetting = displaySetting2;
                        Result.Companion companion = Result.Companion;
                        objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e2));
                        f2 = fFloatValue;
                        z = zOnNavigationEvent;
                        displaySetting3 = displaySetting;
                        i3 = i2;
                        if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                        return objOnExtraCallbackWithResult;
                    } catch (WebResourceResponseModel e4) {
                        e = e4;
                        zOnNavigationEvent = z;
                        fFloatValue = f;
                        i2 = i3;
                        displaySetting = displaySetting2;
                        Result.Companion companion2 = Result.Companion;
                        objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                        f2 = fFloatValue;
                        z = zOnNavigationEvent;
                        displaySetting3 = displaySetting;
                        i3 = i2;
                        if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                        return objOnExtraCallbackWithResult;
                    }
                    if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                        if (z) {
                            OverviewSmallWidgetState.Error error = new OverviewSmallWidgetState.Error(displaySetting3, f2, (String) null, 4, (DefaultConstructorMarker) null);
                            SecuritiesOverviewAppWidgetReceiver.onExtraCallbackWithResult onextracallbackwithresult2 = SecuritiesOverviewAppWidgetReceiver.Companion;
                            Context applicationContext3 = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
                            onextracallbackwithresult2.onExtraCallback(applicationContext3, i3, error);
                        }
                        objOnExtraCallbackWithResult = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                    return objOnExtraCallbackWithResult;
                }
                i2 = onextracallback.I$0;
                displaySetting = (DisplaySetting) onextracallback.L$1;
                str = (String) onextracallback.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Float f3 = (Float) objOnNavigationEvent;
                fFloatValue = f3 == null ? f3.floatValue() : 1.0f;
                r0e r0eVar2 = r0e.onExtraCallbackWithResult;
                Context applicationContext4 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
                zOnNavigationEvent = r0eVar2.onNavigationEvent(applicationContext4);
                try {
                    Result.Companion companion3 = Result.Companion;
                    if (zOnNavigationEvent) {
                        OverviewSmallWidgetState.Loading loading = new OverviewSmallWidgetState.Loading(displaySetting, fFloatValue);
                        SecuritiesOverviewAppWidgetReceiver.onExtraCallbackWithResult onextracallbackwithresult3 = SecuritiesOverviewAppWidgetReceiver.Companion;
                        Context applicationContext5 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext5, "");
                        onextracallbackwithresult3.onExtraCallback(applicationContext5, i2, loading);
                    }
                    q8a q8aVar = q8a.onNavigationEvent;
                    Context applicationContext6 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext6, "");
                    q8aVar.onWarmupCompleted(applicationContext6, "OverviewRepository.loadOverviewSmallData", access14000.onNavigationEvent(i2));
                    onExtraCallbackWithResult onextracallbackwithresult4 = new onExtraCallbackWithResult(i2, null);
                    onextracallback.L$0 = access15400.onNavigationEvent(str);
                    onextracallback.L$1 = displaySetting;
                    onextracallback.L$2 = access15400.onNavigationEvent(onextracallback);
                    onextracallback.I$0 = i2;
                    onextracallback.F$0 = fFloatValue;
                    onextracallback.Z$0 = zOnNavigationEvent;
                    onextracallback.I$1 = 0;
                    onextracallback.I$2 = 0;
                    onextracallback.label = 3;
                    objOnNavigationEvent = doGet.onNavigationEvent(10000L, onextracallbackwithresult4, onextracallback);
                } catch (Exception e5) {
                    e2 = e5;
                    Result.Companion companion4 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e2));
                    f2 = fFloatValue;
                    z = zOnNavigationEvent;
                    displaySetting3 = displaySetting;
                    i3 = i2;
                    if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                    return objOnExtraCallbackWithResult;
                } catch (WebResourceResponseModel e6) {
                    e = e6;
                    Result.Companion companion22 = Result.Companion;
                    objOnExtraCallbackWithResult = Result.constructor-impl(ResultKt.createFailure(e));
                    f2 = fFloatValue;
                    z = zOnNavigationEvent;
                    displaySetting3 = displaySetting;
                    i3 = i2;
                    if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                    return objOnExtraCallbackWithResult;
                }
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    displaySetting2 = displaySetting;
                    f = fFloatValue;
                    z = zOnNavigationEvent;
                    i3 = i2;
                    OverviewSmallWidgetState overviewSmallWidgetState2 = (OverviewSmallWidgetState) objOnNavigationEvent;
                    IAuthTabCallback(this, i3, overviewSmallWidgetState2);
                    SecuritiesOverviewAppWidgetReceiver.onExtraCallbackWithResult onextracallbackwithresult5 = SecuritiesOverviewAppWidgetReceiver.Companion;
                    Context applicationContext22 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext22, "");
                    onextracallbackwithresult5.onExtraCallback(applicationContext22, i3, overviewSmallWidgetState2);
                    objOnExtraCallbackWithResult = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                    f2 = f;
                    displaySetting3 = displaySetting2;
                    if (Result.exceptionOrNull-impl(objOnExtraCallbackWithResult) != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
                    return objOnExtraCallbackWithResult;
                }
                return objOnWarmupCompleted;
            }
            i = onextracallback.I$0;
            str = (String) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            DisplaySetting displaySettingOnNavigationEvent = (DisplaySetting) objOnNavigationEvent;
            if (displaySettingOnNavigationEvent == null) {
                displaySettingOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            }
            KSerializer kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
            onextracallback.L$0 = access15400.onNavigationEvent(str);
            onextracallback.L$1 = displaySettingOnNavigationEvent;
            onextracallback.I$0 = i;
            onextracallback.label = 2;
            Object objOnExtraCallback2 = this.onNavigationEvent.onExtraCallback("alpha_" + i, kSerializerOnWarmupCompleted, onextracallback);
            if (objOnExtraCallback2 != objOnWarmupCompleted) {
                int i11 = i;
                displaySetting = displaySettingOnNavigationEvent;
                objOnNavigationEvent = objOnExtraCallback2;
                i2 = i11;
                Float f32 = (Float) objOnNavigationEvent;
                fFloatValue = f32 == null ? f32.floatValue() : 1.0f;
                r0e r0eVar22 = r0e.onExtraCallbackWithResult;
                Context applicationContext42 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext42, "");
                zOnNavigationEvent = r0eVar22.onNavigationEvent(applicationContext42);
                Result.Companion companion32 = Result.Companion;
                if (zOnNavigationEvent) {
                }
                q8a q8aVar2 = q8a.onNavigationEvent;
                Context applicationContext62 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext62, "");
                q8aVar2.onWarmupCompleted(applicationContext62, "OverviewRepository.loadOverviewSmallData", access14000.onNavigationEvent(i2));
                onExtraCallbackWithResult onextracallbackwithresult42 = new onExtraCallbackWithResult(i2, null);
                onextracallback.L$0 = access15400.onNavigationEvent(str);
                onextracallback.L$1 = displaySetting;
                onextracallback.L$2 = access15400.onNavigationEvent(onextracallback);
                onextracallback.I$0 = i2;
                onextracallback.F$0 = fFloatValue;
                onextracallback.Z$0 = zOnNavigationEvent;
                onextracallback.I$1 = 0;
                onextracallback.I$2 = 0;
                onextracallback.label = 3;
                objOnNavigationEvent = doGet.onNavigationEvent(10000L, onextracallbackwithresult42, onextracallback);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                }
            }
            return objOnWarmupCompleted;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    private final void onExtraCallbackWithResult(int i, OverviewSmallWidgetState overviewSmallWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        q8a q8aVar = q8a.onNavigationEvent;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "doWork");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 20373), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{8633, 39303, 47148, 30456}, new char[]{0, 0, 0, 0}, new char[]{56329, 39535, 38213, 21327}, objArr);
        q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onVisit.IAuthTabCallback(overviewSmallWidgetState))}));
        int i5 = asInterface + 59;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ boolean IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 55;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
                int i6 = i5 + 71;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return iAuthTabCallback.onExtraCallback(context, i, z);
        }

        public final void onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "OVERVIEW_SMALL_");
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final boolean onExtraCallback(@NotNull Context context, int i, boolean z) {
            TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            r0e r0eVar2 = r0e.onExtraCallbackWithResult;
            if ((!z) && r0eVar2.IAuthTabCallback(context, "OVERVIEW_SMALL_", i)) {
                int i4 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            String str = "OVERVIEW_SMALL_" + i;
            if (z) {
                int i6 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
            } else {
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.KEEP;
            }
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(OverviewSmallWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("tag", "OVERVIEW_SMALL_")};
            TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
            for (int i8 = 0; i8 < 2; i8++) {
                Pair pair = pairArr[i8];
                onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
            }
            TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("OVERVIEW_SMALL_").asBinder());
            return true;
        }

        public final void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "OVERVIEW_SMALL_");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SecuritiesOverviewAppWidgetReceiver.class));
            Intrinsics.checkNotNull(appWidgetIds);
            int length = appWidgetIds.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = appWidgetIds[i2];
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                String str = "OVERVIEW_SMALL_" + i3;
                TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(OverviewSmallWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
                Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i3)), getWrite.IAuthTabCallback("tag", "OVERVIEW_SMALL_")};
                TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
                for (int i4 = 0; i4 < 2; i4++) {
                    Pair pair = pairArr[i4];
                    onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                }
                TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
                TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("OVERVIEW_SMALL_").asBinder());
                i2++;
                int i5 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 9;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 4;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 43;
                    int iMyTid = (Process.myTid() >> 22) + 1451;
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, fadingEdgeLength, iMyTid, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char scrollBarFadeDuration = (char) (49123 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int defaultSize = 44 - View.getDefaultSize(i3, i3);
                    int iRgb = (-16775722) - Color.rgb(i3, i3, i3);
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, defaultSize, iRgb, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i6 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i6);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 23972);
                    int bitsPerPixel = 49 - ImageFormat.getBitsPerPixel(i3);
                    int iGreen = Color.green(i3) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(fadingEdgeLength2, bitsPerPixel, iGreen, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i7);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45848);
                    int fadingEdgeLength3 = 29 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 12577;
                    c2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, fadingEdgeLength3, scrollBarSize, 1401536470, false, "l", clsArr4);
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i8 = $11 + 55;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 7798559133331975163L;
        IAuthTabCallbackStub = -1776194565;
        onTransact = (char) 16159;
    }
}
