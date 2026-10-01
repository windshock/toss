package im.toss.tosssecurities.widget.watchlist.data;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.TimelineExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.access8000;
import o.doGet;
import o.findResAndMsg;
import o.getWrite;
import o.onVisit;
import o.q8ExternalSyntheticLambda4;
import o.q8a;
import o.r0e;
import o.registerClient;
import o.sp;
import o.x_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class WatchlistWidgetWorker extends CoroutineWorker {
    private final x_ onExtraCallback;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback onExtraCallbackWithResult;
    private final registerClient onNavigationEvent;
    private static final byte[] $$a = {1, ByteCompanionObject.MIN_VALUE, 109, ByteCompanionObject.MIN_VALUE};
    private static final int $$b = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char[] IAuthTabCallback = {6861, 14681, 24063, 28795};
    private static long onWarmupCompleted = -6912706837153526203L;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        float F$0;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            WatchlistWidgetWorker watchlistWidgetWorker = WatchlistWidgetWorker.this;
            if (i3 != 0) {
                WatchlistWidgetWorker.onExtraCallbackWithResult(watchlistWidgetWorker, this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = WatchlistWidgetWorker.onExtraCallbackWithResult(watchlistWidgetWorker, this);
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    private static String $$c(int i, byte b, int i2) {
        int i3 = (i2 * 4) + 97;
        int i4 = (i * 4) + 4;
        int i5 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i5);
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            int i8 = i4 + 1;
            i3 = i7 + (-bArr[i4]);
            i4 = i8;
        }
    }

    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(this, access13800Var);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = IAuthTabCallbackStub + 41;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    protected Object onExtraCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(this, context, i, watchlistWidgetState, access13800Var);
        int i5 = onTransact + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return objOnWarmupCompleted;
    }

    protected abstract void onExtraCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState);

    protected abstract q8ExternalSyntheticLambda4 onWarmupCompleted();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull x_ x_Var, @NotNull registerClient registerclient) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(x_Var, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.onExtraCallback = x_Var;
        this.onNavigationEvent = registerclient;
        this.onExtraCallbackWithResult = diskLruCacheEntry.IAuthTabCallback();
    }

    public static final /* synthetic */ void IAuthTabCallback(WatchlistWidgetWorker watchlistWidgetWorker, int i, WatchlistWidgetState watchlistWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        watchlistWidgetWorker.IAuthTabCallback(i, watchlistWidgetState);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ x_ onExtraCallbackWithResult(WatchlistWidgetWorker watchlistWidgetWorker) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        x_ x_Var = watchlistWidgetWorker.onExtraCallback;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return x_Var;
    }

    static /* synthetic */ Object onWarmupCompleted(WatchlistWidgetWorker watchlistWidgetWorker, Context context, int i, WatchlistWidgetState watchlistWidgetState, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        watchlistWidgetWorker.onExtraCallback(context, i, watchlistWidgetState);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 67;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super WatchlistWidgetState>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $appWidgetId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(int i, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$appWidgetId = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super WatchlistWidgetState> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = WatchlistWidgetWorker.this.new onExtraCallbackWithResult(this.$appWidgetId, access13800Var);
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 8 / 0;
            }
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super WatchlistWidgetState> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super WatchlistWidgetState> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg2, access13800Var2);
                obj.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg2, access13800Var2);
            int i3 = onWarmupCompleted + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 57;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            x_ x_VarOnExtraCallbackWithResult = WatchlistWidgetWorker.onExtraCallbackWithResult(WatchlistWidgetWorker.this);
            Context applicationContext = WatchlistWidgetWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int i7 = this.$appWidgetId;
            q8ExternalSyntheticLambda4 q8externalsyntheticlambda4OnWarmupCompleted = WatchlistWidgetWorker.this.onWarmupCompleted();
            this.label = 1;
            Object objOnExtraCallback2 = x_VarOnExtraCallbackWithResult.onExtraCallback(applicationContext, i7, q8externalsyntheticlambda4OnWarmupCompleted, this);
            if (objOnExtraCallback2 != objOnExtraCallback) {
                int i8 = IAuthTabCallback + 3;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return objOnExtraCallback2;
            }
            int i10 = onWarmupCompleted + 57;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4 A[Catch: CancellationException -> 0x00a0, Exception -> 0x0247, WebResourceResponseModel -> 0x0255, TryCatch #0 {CancellationException -> 0x00a0, blocks: (B:16:0x0066, B:69:0x022e, B:25:0x0093, B:65:0x01f2, B:59:0x01a0, B:61:0x01a4, B:62:0x01b3), top: B:93:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onExtraCallbackWithResult(WatchlistWidgetWorker watchlistWidgetWorker, access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        int iOnNavigationEvent;
        String strOnExtraCallbackWithResult;
        Object objOnExtraCallback;
        WatchlistWidgetWorker watchlistWidgetWorker2;
        String str;
        DisplaySetting displaySetting;
        int i;
        Float f;
        float fFloatValue;
        float f2;
        boolean zOnNavigationEvent;
        float f3;
        Object objOnNavigationEvent;
        access13800 access13800Var2;
        int i2;
        WatchlistWidgetState watchlistWidgetState;
        Context applicationContext;
        boolean z;
        float f4;
        int i3;
        DisplaySetting displaySetting2;
        WatchlistWidgetWorker watchlistWidgetWorker3;
        Object objM31constructorimpl;
        float f5;
        DisplaySetting displaySetting3;
        WatchlistWidgetWorker watchlistWidgetWorker4 = watchlistWidgetWorker;
        int i4 = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i5 = onwarmupcompleted.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                onwarmupcompleted.label = i5 - 2147483648;
            } else {
                onwarmupcompleted = watchlistWidgetWorker4.new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i8 = onwarmupcompleted.label;
        Object obj2 = null;
        int i9 = 0;
        try {
            if (i8 == 0) {
                ResultKt.onNavigationEvent(obj);
                iOnNavigationEvent = watchlistWidgetWorker.getInputData().onNavigationEvent("appWidgetId", 0);
                strOnExtraCallbackWithResult = watchlistWidgetWorker.getInputData().onExtraCallbackWithResult("tag");
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
                Context applicationContext2 = watchlistWidgetWorker.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                r0eVar.onExtraCallback(applicationContext2, strOnExtraCallbackWithResult, iOnNavigationEvent);
                KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
                onwarmupcompleted.L$0 = watchlistWidgetWorker4;
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                onwarmupcompleted.I$0 = iOnNavigationEvent;
                onwarmupcompleted.label = 1;
                objOnExtraCallback = watchlistWidgetWorker4.onExtraCallbackWithResult.onExtraCallback("display_setting_" + iOnNavigationEvent, kSerializerSerializer, onwarmupcompleted);
                if (objOnExtraCallback != objOnExtraCallback2) {
                }
                return objOnExtraCallback2;
            }
            if (i8 != 1) {
                if (i8 == 2) {
                    int i10 = onwarmupcompleted.I$0;
                    DisplaySetting displaySetting4 = (DisplaySetting) onwarmupcompleted.L$2;
                    String str2 = (String) onwarmupcompleted.L$1;
                    WatchlistWidgetWorker watchlistWidgetWorker5 = (WatchlistWidgetWorker) onwarmupcompleted.L$0;
                    ResultKt.onNavigationEvent(obj);
                    displaySetting = displaySetting4;
                    str = str2;
                    watchlistWidgetWorker2 = watchlistWidgetWorker5;
                    i = i10;
                    f = (Float) obj;
                    if (f == null) {
                        int i11 = onTransact + 17;
                        IAuthTabCallbackStub = i11 % 128;
                        if (i11 % 2 == 0) {
                            f.floatValue();
                            throw null;
                        }
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    f2 = fFloatValue;
                    r0e r0eVar2 = r0e.onExtraCallbackWithResult;
                    Context applicationContext3 = watchlistWidgetWorker2.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
                    zOnNavigationEvent = r0eVar2.onNavigationEvent(applicationContext3);
                    try {
                        Result.Companion companion = Result.Companion;
                        if (zOnNavigationEvent) {
                            WatchlistWidgetState.Loading loading = new WatchlistWidgetState.Loading(displaySetting, f2);
                            Context applicationContext4 = watchlistWidgetWorker2.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
                            watchlistWidgetWorker2.onExtraCallback(applicationContext4, i, loading);
                        }
                        q8a q8aVar = q8a.onNavigationEvent;
                        Context applicationContext5 = watchlistWidgetWorker2.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext5, "");
                        q8aVar.onWarmupCompleted(applicationContext5, "WatchlistRepository.loadWatchlist", access14000.onNavigationEvent(i));
                        onExtraCallbackWithResult onextracallbackwithresult = watchlistWidgetWorker2.new onExtraCallbackWithResult(i, null);
                        onwarmupcompleted.L$0 = watchlistWidgetWorker2;
                        onwarmupcompleted.L$1 = access15400.onNavigationEvent(str);
                        onwarmupcompleted.L$2 = displaySetting;
                        onwarmupcompleted.L$3 = access15400.onNavigationEvent(onwarmupcompleted);
                        onwarmupcompleted.I$0 = i;
                        onwarmupcompleted.F$0 = f2;
                        onwarmupcompleted.Z$0 = zOnNavigationEvent;
                        onwarmupcompleted.I$1 = 0;
                        onwarmupcompleted.I$2 = 0;
                        onwarmupcompleted.label = 3;
                        objOnNavigationEvent = doGet.onNavigationEvent(10000L, onextracallbackwithresult, onwarmupcompleted);
                        if (objOnNavigationEvent != objOnExtraCallback2) {
                            f3 = f2;
                            access13800Var2 = onwarmupcompleted;
                            obj = objOnNavigationEvent;
                            i2 = 0;
                            watchlistWidgetState = (WatchlistWidgetState) obj;
                            IAuthTabCallback(watchlistWidgetWorker2, i, watchlistWidgetState);
                            applicationContext = watchlistWidgetWorker2.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                            onwarmupcompleted.L$0 = watchlistWidgetWorker2;
                            onwarmupcompleted.L$1 = access15400.onNavigationEvent(str);
                            onwarmupcompleted.L$2 = displaySetting;
                            onwarmupcompleted.L$3 = access15400.onNavigationEvent(access13800Var2);
                            onwarmupcompleted.L$4 = access15400.onNavigationEvent(watchlistWidgetState);
                            onwarmupcompleted.I$0 = i;
                            onwarmupcompleted.F$0 = f3;
                            onwarmupcompleted.Z$0 = zOnNavigationEvent;
                            onwarmupcompleted.I$1 = i9;
                            onwarmupcompleted.I$2 = i2;
                            onwarmupcompleted.label = 4;
                            if (watchlistWidgetWorker2.onExtraCallback(applicationContext, i, watchlistWidgetState, onwarmupcompleted) != objOnExtraCallback2) {
                            }
                        }
                        return objOnExtraCallback2;
                    } catch (WebResourceResponseModel e) {
                        e = e;
                        f3 = f2;
                        Result.Companion companion2 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        z = zOnNavigationEvent;
                        f5 = f3;
                        i3 = i;
                        displaySetting3 = displaySetting;
                        watchlistWidgetWorker3 = watchlistWidgetWorker2;
                        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                        return objM31constructorimpl;
                    } catch (Exception e2) {
                        e = e2;
                        f3 = f2;
                        Result.Companion companion3 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        z = zOnNavigationEvent;
                        f5 = f3;
                        i3 = i;
                        displaySetting3 = displaySetting;
                        watchlistWidgetWorker3 = watchlistWidgetWorker2;
                        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                        return objM31constructorimpl;
                    }
                }
                if (i8 == 3) {
                    int i12 = onwarmupcompleted.I$2;
                    int i13 = onwarmupcompleted.I$1;
                    zOnNavigationEvent = onwarmupcompleted.Z$0;
                    f3 = onwarmupcompleted.F$0;
                    i = onwarmupcompleted.I$0;
                    access13800Var2 = (access13800) onwarmupcompleted.L$3;
                    displaySetting = (DisplaySetting) onwarmupcompleted.L$2;
                    str = (String) onwarmupcompleted.L$1;
                    watchlistWidgetWorker2 = (WatchlistWidgetWorker) onwarmupcompleted.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                        i9 = i13;
                        i2 = i12;
                        watchlistWidgetState = (WatchlistWidgetState) obj;
                        IAuthTabCallback(watchlistWidgetWorker2, i, watchlistWidgetState);
                        applicationContext = watchlistWidgetWorker2.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        onwarmupcompleted.L$0 = watchlistWidgetWorker2;
                        onwarmupcompleted.L$1 = access15400.onNavigationEvent(str);
                        onwarmupcompleted.L$2 = displaySetting;
                        onwarmupcompleted.L$3 = access15400.onNavigationEvent(access13800Var2);
                        onwarmupcompleted.L$4 = access15400.onNavigationEvent(watchlistWidgetState);
                        onwarmupcompleted.I$0 = i;
                        onwarmupcompleted.F$0 = f3;
                        onwarmupcompleted.Z$0 = zOnNavigationEvent;
                        onwarmupcompleted.I$1 = i9;
                        onwarmupcompleted.I$2 = i2;
                        onwarmupcompleted.label = 4;
                    } catch (WebResourceResponseModel e3) {
                        e = e3;
                        Result.Companion companion22 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        z = zOnNavigationEvent;
                        f5 = f3;
                        i3 = i;
                        displaySetting3 = displaySetting;
                        watchlistWidgetWorker3 = watchlistWidgetWorker2;
                        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                        return objM31constructorimpl;
                    } catch (Exception e4) {
                        e = e4;
                        Result.Companion companion32 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                        z = zOnNavigationEvent;
                        f5 = f3;
                        i3 = i;
                        displaySetting3 = displaySetting;
                        watchlistWidgetWorker3 = watchlistWidgetWorker2;
                        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                        return objM31constructorimpl;
                    }
                    if (watchlistWidgetWorker2.onExtraCallback(applicationContext, i, watchlistWidgetState, onwarmupcompleted) != objOnExtraCallback2) {
                        z = zOnNavigationEvent;
                        f4 = f3;
                        i3 = i;
                        displaySetting2 = displaySetting;
                        watchlistWidgetWorker3 = watchlistWidgetWorker2;
                        objM31constructorimpl = Result.m31constructorimpl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                        f5 = f4;
                        displaySetting3 = displaySetting2;
                        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                        return objM31constructorimpl;
                    }
                    return objOnExtraCallback2;
                }
                int i14 = IAuthTabCallbackStub + 103;
                onTransact = i14 % 128;
                int i15 = i14 % 2;
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = onwarmupcompleted.Z$0;
                f4 = onwarmupcompleted.F$0;
                i3 = onwarmupcompleted.I$0;
                displaySetting2 = (DisplaySetting) onwarmupcompleted.L$2;
                watchlistWidgetWorker3 = (WatchlistWidgetWorker) onwarmupcompleted.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    objM31constructorimpl = Result.m31constructorimpl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
                    f5 = f4;
                    displaySetting3 = displaySetting2;
                } catch (WebResourceResponseModel e5) {
                    e = e5;
                    watchlistWidgetWorker2 = watchlistWidgetWorker3;
                    i = i3;
                    displaySetting = displaySetting2;
                    f3 = f4;
                    zOnNavigationEvent = z;
                    Result.Companion companion222 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    z = zOnNavigationEvent;
                    f5 = f3;
                    i3 = i;
                    displaySetting3 = displaySetting;
                    watchlistWidgetWorker3 = watchlistWidgetWorker2;
                    if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                    return objM31constructorimpl;
                } catch (Exception e6) {
                    e = e6;
                    watchlistWidgetWorker2 = watchlistWidgetWorker3;
                    i = i3;
                    displaySetting = displaySetting2;
                    f3 = f4;
                    zOnNavigationEvent = z;
                    Result.Companion companion322 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    z = zOnNavigationEvent;
                    f5 = f3;
                    i3 = i;
                    displaySetting3 = displaySetting;
                    watchlistWidgetWorker3 = watchlistWidgetWorker2;
                    if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                    return objM31constructorimpl;
                }
                if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
                    int i16 = IAuthTabCallbackStub + 69;
                    onTransact = i16 % 128;
                    if (i16 % 2 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    if (z) {
                        WatchlistWidgetState.Error error = new WatchlistWidgetState.Error(displaySetting3, f5, (String) null, 4, (DefaultConstructorMarker) null);
                        Context applicationContext6 = watchlistWidgetWorker3.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext6, "");
                        watchlistWidgetWorker3.onExtraCallback(applicationContext6, i3, error);
                    }
                    objM31constructorimpl = ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
                }
                Intrinsics.checkNotNullExpressionValue(objM31constructorimpl, "");
                return objM31constructorimpl;
            }
            int i17 = onwarmupcompleted.I$0;
            strOnExtraCallbackWithResult = (String) onwarmupcompleted.L$1;
            WatchlistWidgetWorker watchlistWidgetWorker6 = (WatchlistWidgetWorker) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            iOnNavigationEvent = i17;
            watchlistWidgetWorker4 = watchlistWidgetWorker6;
            objOnExtraCallback = obj;
            DisplaySetting displaySettingOnNavigationEvent = (DisplaySetting) objOnExtraCallback;
            if (displaySettingOnNavigationEvent == null) {
                displaySettingOnNavigationEvent = watchlistWidgetWorker4.onNavigationEvent.onNavigationEvent();
            }
            KSerializer<Float> kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
            onwarmupcompleted.L$0 = watchlistWidgetWorker4;
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
            onwarmupcompleted.L$2 = displaySettingOnNavigationEvent;
            onwarmupcompleted.I$0 = iOnNavigationEvent;
            onwarmupcompleted.label = 2;
            Object objOnExtraCallback3 = watchlistWidgetWorker4.onExtraCallbackWithResult.onExtraCallback("alpha_" + iOnNavigationEvent, kSerializerOnWarmupCompleted, onwarmupcompleted);
            if (objOnExtraCallback3 != objOnExtraCallback2) {
                int i18 = onTransact + 107;
                IAuthTabCallbackStub = i18 % 128;
                int i19 = i18 % 2;
                watchlistWidgetWorker2 = watchlistWidgetWorker4;
                str = strOnExtraCallbackWithResult;
                displaySetting = displaySettingOnNavigationEvent;
                i = iOnNavigationEvent;
                obj = objOnExtraCallback3;
                f = (Float) obj;
                if (f == null) {
                }
                f2 = fFloatValue;
                r0e r0eVar22 = r0e.onExtraCallbackWithResult;
                Context applicationContext32 = watchlistWidgetWorker2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext32, "");
                zOnNavigationEvent = r0eVar22.onNavigationEvent(applicationContext32);
                Result.Companion companion4 = Result.Companion;
                if (zOnNavigationEvent) {
                }
                q8a q8aVar2 = q8a.onNavigationEvent;
                Context applicationContext52 = watchlistWidgetWorker2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext52, "");
                q8aVar2.onWarmupCompleted(applicationContext52, "WatchlistRepository.loadWatchlist", access14000.onNavigationEvent(i));
                onExtraCallbackWithResult onextracallbackwithresult2 = watchlistWidgetWorker2.new onExtraCallbackWithResult(i, null);
                onwarmupcompleted.L$0 = watchlistWidgetWorker2;
                onwarmupcompleted.L$1 = access15400.onNavigationEvent(str);
                onwarmupcompleted.L$2 = displaySetting;
                onwarmupcompleted.L$3 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = i;
                onwarmupcompleted.F$0 = f2;
                onwarmupcompleted.Z$0 = zOnNavigationEvent;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.I$2 = 0;
                onwarmupcompleted.label = 3;
                objOnNavigationEvent = doGet.onNavigationEvent(10000L, onextracallbackwithresult2, onwarmupcompleted);
                if (objOnNavigationEvent != objOnExtraCallback2) {
                }
            }
            return objOnExtraCallback2;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    private final void IAuthTabCallback(int i, WatchlistWidgetState watchlistWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 5;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        q8a q8aVar = q8a.onNavigationEvent;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "doWork");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getEdgeSlop() >> 16, MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 5, (char) (63357 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), objArr);
        q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onVisit.IAuthTabCallback(watchlistWidgetState))));
        int i5 = onTransact + 87;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 59697), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 18, 10973 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 46135), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0));
                    int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i5 = 1495 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iMakeMeasureSpec, i5, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $11 + 89;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $10 + 49;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char edgeSlop = (char) (49123 - (ViewConfiguration.getEdgeSlop() >> 16));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1494;
                byte b3 = (byte) ($$a[0] - 1);
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, doubleTapTimeout, jumpTapTimeout, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
