package im.toss.securities.widget.calendar;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.securities.widget.calendar.ui.model.CalendarWidgetState;
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
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
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
import o.r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CalendarWidgetWorker extends CoroutineWorker {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    public static final int onWarmupCompleted;
    private final Context onExtraCallback;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = CalendarWidgetWorker.this.doWork(this);
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return objDoWork;
        }
    }

    static {
        onWarmupCompleted();
        Companion = new onNavigationEvent(null);
        onWarmupCompleted = 8;
        int i = asInterface + 61;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        this.onExtraCallback = context;
    }

    public static final /* synthetic */ Context IAuthTabCallback(CalendarWidgetWorker calendarWidgetWorker) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context context = calendarWidgetWorker.onExtraCallback;
        if (i3 == 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(CalendarWidgetWorker calendarWidgetWorker, int i, CalendarWidgetState calendarWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        calendarWidgetWorker.onNavigationEvent(i, calendarWidgetState);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(CalendarWidgetWorker calendarWidgetWorker, int i, CalendarWidgetState calendarWidgetState) {
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        calendarWidgetWorker.onExtraCallback(i, calendarWidgetState);
        int i5 = onTransact + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super CalendarWidgetState>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super CalendarWidgetState> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super CalendarWidgetState> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE r8lambda7quzeazocj_1ysh8lcjyruilhje = r8lambda7qUzEAzocj_1ySH8LcjYRUiLhJE.onExtraCallback;
            this.label = 1;
            Object objIAuthTabCallback = r8lambda7quzeazocj_1ysh8lcjyruilhje.IAuthTabCallback((access13800<? super CalendarWidgetState>) this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i6 = onExtraCallbackWithResult + 19;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        boolean zOnNavigationEvent;
        int i;
        Exception e;
        WebResourceResponseModel e2;
        boolean z;
        Object objOnWarmupCompleted;
        Throwable th;
        int i2 = 2 % 2;
        int i3 = asBinder + 69;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            int i6 = i4 + 77;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = ((onExtraCallbackWithResult) access13800Var).label;
                throw null;
            }
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i8 = onextracallbackwithresult.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                int i9 = onTransact + 49;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                onextracallbackwithresult.label = i8 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i11 = onextracallbackwithresult.label;
        try {
            if (i11 == 0) {
                ResultKt.onNavigationEvent(obj);
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
                r0eVar.onExtraCallback(this.onExtraCallback, strOnExtraCallbackWithResult, iOnNavigationEvent);
                zOnNavigationEvent = r0eVar.onNavigationEvent(this.onExtraCallback);
                try {
                    Result.Companion companion = Result.Companion;
                    if (zOnNavigationEvent) {
                        int i12 = asBinder + 83;
                        onTransact = i12 % 128;
                        int i13 = i12 % 2;
                        onWarmupCompleted(this, iOnNavigationEvent, CalendarWidgetState.Loading.INSTANCE);
                    }
                    q8a.onNavigationEvent.onWarmupCompleted(IAuthTabCallback(this), "CalendarRepo.loadCalendarData", access14000.onNavigationEvent(iOnNavigationEvent));
                    onExtraCallback onextracallback = new onExtraCallback(null);
                    onextracallbackwithresult.L$0 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                    onextracallbackwithresult.L$1 = access15400.onNavigationEvent(onextracallbackwithresult);
                    onextracallbackwithresult.I$0 = iOnNavigationEvent;
                    onextracallbackwithresult.Z$0 = zOnNavigationEvent;
                    onextracallbackwithresult.I$1 = 0;
                    onextracallbackwithresult.I$2 = 0;
                    onextracallbackwithresult.label = 1;
                    Object objOnNavigationEvent = doGet.onNavigationEvent(10000L, onextracallback, onextracallbackwithresult);
                    if (objOnNavigationEvent == objOnWarmupCompleted2) {
                        return objOnWarmupCompleted2;
                    }
                    i = iOnNavigationEvent;
                    obj = objOnNavigationEvent;
                    z = zOnNavigationEvent;
                } catch (WebResourceResponseModel e3) {
                    i = iOnNavigationEvent;
                    e2 = e3;
                    Result.Companion companion2 = Result.Companion;
                    objOnWarmupCompleted = Result.constructor-impl(ResultKt.createFailure(e2));
                    z = zOnNavigationEvent;
                    th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
                    return objOnWarmupCompleted;
                } catch (Exception e4) {
                    i = iOnNavigationEvent;
                    e = e4;
                    Result.Companion companion3 = Result.Companion;
                    objOnWarmupCompleted = Result.constructor-impl(ResultKt.createFailure(e));
                    z = zOnNavigationEvent;
                    th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
                    return objOnWarmupCompleted;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = onextracallbackwithresult.Z$0;
                i = onextracallbackwithresult.I$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (Exception e5) {
                    e = e5;
                    zOnNavigationEvent = z;
                    Result.Companion companion32 = Result.Companion;
                    objOnWarmupCompleted = Result.constructor-impl(ResultKt.createFailure(e));
                    z = zOnNavigationEvent;
                    th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
                    return objOnWarmupCompleted;
                } catch (WebResourceResponseModel e6) {
                    e2 = e6;
                    zOnNavigationEvent = z;
                    Result.Companion companion22 = Result.Companion;
                    objOnWarmupCompleted = Result.constructor-impl(ResultKt.createFailure(e2));
                    z = zOnNavigationEvent;
                    th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
                    if (th != null) {
                    }
                    Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
                    return objOnWarmupCompleted;
                }
            }
            CalendarWidgetState calendarWidgetState = (CalendarWidgetState) obj;
            onWarmupCompleted(this, i, calendarWidgetState);
            IAuthTabCallback(this, i, calendarWidgetState);
            objOnWarmupCompleted = Result.constructor-impl(ListenableWorker.onExtraCallbackWithResult.onExtraCallback());
            th = Result.exceptionOrNull-impl(objOnWarmupCompleted);
            if (th != null) {
                int i14 = asBinder + 53;
                onTransact = i14 % 128;
                int i15 = i14 % 2;
                if (z) {
                    onExtraCallback(i, new CalendarWidgetState.Error(th.getMessage()));
                    int i16 = onTransact + 69;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                }
                objOnWarmupCompleted = getRunAttemptCount() < 5 ? ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted() : ListenableWorker.onExtraCallbackWithResult.onExtraCallbackWithResult();
            }
            Intrinsics.checkNotNullExpressionValue(objOnWarmupCompleted, "");
            return objOnWarmupCompleted;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    private final void onExtraCallback(int i, CalendarWidgetState calendarWidgetState) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SecuritiesCalendarAppWidgetReceiver.Companion.onExtraCallback(this.onExtraCallback, i, calendarWidgetState);
        int i5 = onTransact + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(int i, CalendarWidgetState calendarWidgetState) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 85;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        q8a q8aVar = q8a.onNavigationEvent;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "CalendarWidgetWorker.doWork");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i));
        Object[] objArr = new Object[1];
        a(new char[]{31496, 8212, 11294, 19912}, 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        q8aVar.onExtraCallbackWithResult(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onVisit.IAuthTabCallback(calendarWidgetState))}));
        int i5 = asBinder + 7;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Context context, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 73;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
                int i6 = i5 + 111;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return onnavigationevent.IAuthTabCallback(context, i, z);
        }

        public final void onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "CALENDAR_");
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallback(@NotNull Context context, int i, boolean z) {
            TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e r0eVar = r0e.onExtraCallbackWithResult;
            int i3 = 0;
            if (!z && r0eVar.IAuthTabCallback(context, "CALENDAR_", i)) {
                int i4 = onWarmupCompleted + 31;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            String str = "CALENDAR_" + i;
            if (z) {
                int i6 = onWarmupCompleted + 93;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                    int i7 = 14 / 0;
                } else {
                    tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                }
            } else {
                tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.KEEP;
                int i8 = onWarmupCompleted + 53;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(CalendarWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("tag", "CALENDAR_")};
            TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
            while (i3 < 2) {
                int i10 = onNavigationEvent + 109;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    Pair pair = pairArr[i3];
                    onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                    i3 += 108;
                } else {
                    Pair pair2 = pairArr[i3];
                    onextracallback.onExtraCallbackWithResult((String) pair2.getFirst(), pair2.getSecond());
                    i3++;
                }
            }
            TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("CALENDAR_").asBinder());
            return true;
        }

        public final void IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "CALENDAR_");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SecuritiesCalendarAppWidgetReceiver.class));
            Intrinsics.checkNotNull(appWidgetIds);
            for (int i2 : appWidgetIds) {
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                String str = "CALENDAR_" + i2;
                TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(CalendarWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
                Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i2)), getWrite.IAuthTabCallback("tag", "CALENDAR_")};
                TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
                for (int i3 = 0; i3 < 2; i3++) {
                    int i4 = onNavigationEvent + 19;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Pair pair = pairArr[i3];
                    onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                }
                TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
                TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("CALENDAR_").asBinder());
            }
            int i6 = onWarmupCompleted + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            int i4 = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = i3;
            while (i6 < 16) {
                char c = cArr3[i4];
                char c2 = cArr3[i3];
                int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[i4] = Integer.valueOf(i7);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i3, i3) + i4);
                        int gidForName = 9 - Process.getGidForName("");
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, gidForName, iNormalizeMetaState, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[i4] = cCharValue;
                    int i9 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), View.combineMeasuredStates(0, 0) + 10, (ViewConfiguration.getTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    int i10 = $11 + 65;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 5 / 3;
                    }
                    i3 = 0;
                    i4 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ExpandableListView.getPackedPositionGroup(0L)), View.MeasureSpec.getMode(0) + 14, 19901 - (Process.myPid() >> 22), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 123;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = (char) 3190;
        onExtraCallbackWithResult = (char) 47138;
        IAuthTabCallback = (char) 62195;
        IAuthTabCallbackStub = (char) 43856;
    }
}
