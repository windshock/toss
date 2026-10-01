package o;

import android.content.Context;
import im.toss.ads_sdk.admob.AdMobEnablementResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getBillingPeriod;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTrimPathOffset {
    private static volatile pauseMyRequest<setFillColor> IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;
    public static final getTrimPathOffset onWarmupCompleted = new getTrimPathOffset();
    private static final jni_YGNodeStyleGetFlexBasisJNI onNavigationEvent = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, (Object) null);
    private static volatile setFillColor onExtraCallbackWithResult = setFillColor.UNKNOWN;
    public static final int onExtraCallback = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws TossApiCallException.ApiError {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getTrimPathOffset gettrimpathoffset = getTrimPathOffset.this;
            if (i3 == 0) {
                return getTrimPathOffset.onNavigationEvent(gettrimpathoffset, null, this);
            }
            getTrimPathOffset.onNavigationEvent(gettrimpathoffset, null, this);
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getTrimPathOffset.this.onExtraCallbackWithResult(null, this);
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    private getTrimPathOffset() {
    }

    public static final /* synthetic */ Object onNavigationEvent(getTrimPathOffset gettrimpathoffset, Context context, access13800 access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = gettrimpathoffset.IAuthTabCallback(context, access13800Var);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return objIAuthTabCallback;
    }

    static {
        int i = IAuthTabCallbackDefault + 37;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public final setFillColor onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!onNavigationEvent(context)) {
            return setFillColor.NOT_REQUIRED;
        }
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        setFillColor setfillcolor = onExtraCallbackWithResult;
        int i5 = asBinder + 67;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return setfillcolor;
    }

    private final boolean onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getBillingPeriod.onNavigationEvent onnavigationevent = getBillingPeriod.Companion;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int i3 = 22 / 0;
            if (onnavigationevent.IAuthTabCallback(applicationContext).onExtraCallbackWithResult() == getPricingPhaseList.EU) {
                return true;
            }
        } else {
            getBillingPeriod.onNavigationEvent onnavigationevent2 = getBillingPeriod.Companion;
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            if (onnavigationevent2.IAuthTabCallback(applicationContext2).onExtraCallbackWithResult() == getPricingPhaseList.EU) {
                return true;
            }
        }
        int i4 = asBinder + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d1 A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:94:0x01cd, B:96:0x01d1, B:97:0x01d3), top: B:110:0x01cd }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull Context context, @NotNull access13800<? super setFillColor> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Context context2;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        Exception e;
        pauseMyRequest pausemyrequest;
        Context context3;
        boolean z;
        Object obj;
        boolean z2;
        pauseMyRequest pausemyrequest2;
        Throwable e2;
        pauseMyRequest pausemyrequest3;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2;
        boolean zBooleanValue;
        setFillColor setfillcolor;
        Pair pairIAuthTabCallback;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
            if (access13800Var instanceof onExtraCallbackWithResult) {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                int i4 = onextracallbackwithresult.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    onextracallbackwithresult.label = i4 - 2147483648;
                } else {
                    onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                }
            }
        } else if (access13800Var instanceof onExtraCallbackWithResult) {
        }
        Object obj2 = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        Object obj3 = null;
        try {
            try {
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    if (!onNavigationEvent(context)) {
                        setFillColor setfillcolor2 = setFillColor.NOT_REQUIRED;
                        int i6 = asBinder + 7;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 == 0) {
                            return setfillcolor2;
                        }
                        throw null;
                    }
                    if (onExtraCallbackWithResult != setFillColor.UNKNOWN) {
                        return onExtraCallbackWithResult;
                    }
                    jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni3 = onNavigationEvent;
                    onextracallbackwithresult.L$0 = context;
                    onextracallbackwithresult.L$1 = jni_ygnodestylegetflexbasisjni3;
                    onextracallbackwithresult.I$0 = 0;
                    onextracallbackwithresult.label = 1;
                    if (jni_ygnodestylegetflexbasisjni3.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        context2 = context;
                        jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni3;
                    }
                }
                int i7 = asBinder + 115;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0 ? i5 != 1 : i5 != 0) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj2);
                            return obj2;
                        }
                        z2 = onextracallbackwithresult.Z$0;
                        jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$3;
                        pausemyrequest3 = (pauseMyRequest) onextracallbackwithresult.L$1;
                        context2 = (Context) onextracallbackwithresult.L$0;
                        ResultKt.onNavigationEvent(obj2);
                        try {
                            if (IAuthTabCallback == pausemyrequest3) {
                                IAuthTabCallback = null;
                            }
                            Unit unit = Unit.INSTANCE;
                            jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                            zBooleanValue = z2;
                            pausemyrequest = pausemyrequest3;
                            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context2);
                            onextracallbackwithresult.L$1 = access15400.onNavigationEvent(pausemyrequest);
                            onextracallbackwithresult.L$2 = null;
                            onextracallbackwithresult.L$3 = null;
                            onextracallbackwithresult.Z$0 = zBooleanValue;
                            onextracallbackwithresult.label = 4;
                            Object objIAuthTabCallback = pausemyrequest.IAuthTabCallback(onextracallbackwithresult);
                            return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
                        } finally {
                        }
                    }
                    z2 = onextracallbackwithresult.Z$0;
                    pausemyrequest2 = (pauseMyRequest) onextracallbackwithresult.L$1;
                    context3 = (Context) onextracallbackwithresult.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj2);
                        obj = kotlin.Result.constructor-impl(obj2);
                    } catch (WebResourceResponseModel e3) {
                        e2 = e3;
                        pauseMyRequest pausemyrequest4 = pausemyrequest2;
                        z = z2;
                        pausemyrequest = pausemyrequest4;
                        Result.Companion companion = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
                        boolean z3 = z;
                        pausemyrequest2 = pausemyrequest;
                        z2 = z3;
                        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        }
                        setfillcolor = (setFillColor) obj;
                        if (setfillcolor != setFillColor.UNKNOWN) {
                        }
                        pausemyrequest2.IAuthTabCallback(setfillcolor);
                        jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                        onextracallbackwithresult.L$1 = pausemyrequest2;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                        onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                        onextracallbackwithresult.Z$0 = z2;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.label = 3;
                        if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                        pauseMyRequest pausemyrequest5 = pausemyrequest2;
                        z = z2;
                        pausemyrequest = pausemyrequest5;
                        Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        boolean z32 = z;
                        pausemyrequest2 = pausemyrequest;
                        z2 = z32;
                        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        }
                        setfillcolor = (setFillColor) obj;
                        if (setfillcolor != setFillColor.UNKNOWN) {
                        }
                        pausemyrequest2.IAuthTabCallback(setfillcolor);
                        jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                        onextracallbackwithresult.L$1 = pausemyrequest2;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                        onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                        onextracallbackwithresult.Z$0 = z2;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.label = 3;
                        if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        }
                    }
                    if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        int i8 = IAuthTabCallbackStub + 85;
                        asBinder = i8 % 128;
                        if (i8 % 2 == 0) {
                            setFillColor setfillcolor3 = setFillColor.UNKNOWN;
                            obj3.hashCode();
                            throw null;
                        }
                        obj = setFillColor.UNKNOWN;
                    }
                    setfillcolor = (setFillColor) obj;
                    if (setfillcolor != setFillColor.UNKNOWN) {
                        onExtraCallbackWithResult = setfillcolor;
                    }
                    pausemyrequest2.IAuthTabCallback(setfillcolor);
                    jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                    onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                    onextracallbackwithresult.L$1 = pausemyrequest2;
                    onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                    onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                    onextracallbackwithresult.Z$0 = z2;
                    onextracallbackwithresult.I$0 = 0;
                    onextracallbackwithresult.label = 3;
                    if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        pausemyrequest3 = pausemyrequest2;
                        context2 = context3;
                        if (IAuthTabCallback == pausemyrequest3) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                        zBooleanValue = z2;
                        pausemyrequest = pausemyrequest3;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context2);
                        onextracallbackwithresult.L$1 = access15400.onNavigationEvent(pausemyrequest);
                        onextracallbackwithresult.L$2 = null;
                        onextracallbackwithresult.L$3 = null;
                        onextracallbackwithresult.Z$0 = zBooleanValue;
                        onextracallbackwithresult.label = 4;
                        Object objIAuthTabCallback2 = pausemyrequest.IAuthTabCallback(onextracallbackwithresult);
                        if (objIAuthTabCallback2 == objOnWarmupCompleted) {
                        }
                    }
                }
                jni_ygnodestylegetflexbasisjni = (jni_YGNodeStyleGetFlexBasisJNI) onextracallbackwithresult.L$1;
                context2 = (Context) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj2);
                setFillColor setfillcolor4 = onExtraCallbackWithResult;
                if (setfillcolor4 == setFillColor.UNKNOWN) {
                    int i9 = IAuthTabCallbackStub + 49;
                    asBinder = i9 % 128;
                    int i10 = i9 % 2;
                    setfillcolor4 = null;
                }
                if (setfillcolor4 != null) {
                    return setfillcolor4;
                }
                pauseMyRequest<setFillColor> pausemyrequest6 = IAuthTabCallback;
                if (pausemyrequest6 != null) {
                    int i11 = IAuthTabCallbackStub + 115;
                    asBinder = i11 % 128;
                    pairIAuthTabCallback = i11 % 2 == 0 ? getWrite.IAuthTabCallback(pausemyrequest6, access14000.onNavigationEvent(true)) : getWrite.IAuthTabCallback(pausemyrequest6, access14000.onNavigationEvent(false));
                } else {
                    pauseMyRequest<setFillColor> pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
                    IAuthTabCallback = pausemyrequestOnExtraCallback;
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(pausemyrequestOnExtraCallback, access14000.onNavigationEvent(true));
                }
                jni_ygnodestylegetflexbasisjni2.onWarmupCompleted((Object) null);
                pausemyrequest = (pauseMyRequest) pairIAuthTabCallback.onExtraCallbackWithResult();
                zBooleanValue = ((Boolean) pairIAuthTabCallback.IAuthTabCallback()).booleanValue();
                if (zBooleanValue) {
                    try {
                        Result.Companion companion3 = kotlin.Result.Companion;
                        getTrimPathOffset gettrimpathoffset = onWarmupCompleted;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context2);
                        onextracallbackwithresult.L$1 = pausemyrequest;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(onextracallbackwithresult);
                        onextracallbackwithresult.Z$0 = zBooleanValue;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.I$1 = 0;
                        onextracallbackwithresult.label = 2;
                        objOnNavigationEvent = onNavigationEvent(gettrimpathoffset, context2, onextracallbackwithresult);
                    } catch (WebResourceResponseModel e5) {
                        Context context4 = context2;
                        z = zBooleanValue;
                        e2 = e5;
                        context3 = context4;
                        Result.Companion companion4 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
                        boolean z322 = z;
                        pausemyrequest2 = pausemyrequest;
                        z2 = z322;
                        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        }
                        setfillcolor = (setFillColor) obj;
                        if (setfillcolor != setFillColor.UNKNOWN) {
                        }
                        pausemyrequest2.IAuthTabCallback(setfillcolor);
                        jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                        onextracallbackwithresult.L$1 = pausemyrequest2;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                        onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                        onextracallbackwithresult.Z$0 = z2;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.label = 3;
                        if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        }
                    } catch (Exception e6) {
                        Context context5 = context2;
                        z = zBooleanValue;
                        e = e6;
                        context3 = context5;
                        Result.Companion companion22 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                        boolean z3222 = z;
                        pausemyrequest2 = pausemyrequest;
                        z2 = z3222;
                        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        }
                        setfillcolor = (setFillColor) obj;
                        if (setfillcolor != setFillColor.UNKNOWN) {
                        }
                        pausemyrequest2.IAuthTabCallback(setfillcolor);
                        jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                        onextracallbackwithresult.L$1 = pausemyrequest2;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                        onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                        onextracallbackwithresult.Z$0 = z2;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.label = 3;
                        if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        }
                    }
                    if (objOnNavigationEvent != objOnWarmupCompleted) {
                        Context context6 = context2;
                        pausemyrequest2 = pausemyrequest;
                        z2 = zBooleanValue;
                        obj2 = objOnNavigationEvent;
                        context3 = context6;
                        obj = kotlin.Result.constructor-impl(obj2);
                        if (kotlin.Result.exceptionOrNull-impl(obj) != null) {
                        }
                        setfillcolor = (setFillColor) obj;
                        if (setfillcolor != setFillColor.UNKNOWN) {
                        }
                        pausemyrequest2.IAuthTabCallback(setfillcolor);
                        jni_ygnodestylegetflexbasisjni2 = onNavigationEvent;
                        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context3);
                        onextracallbackwithresult.L$1 = pausemyrequest2;
                        onextracallbackwithresult.L$2 = access15400.onNavigationEvent(setfillcolor);
                        onextracallbackwithresult.L$3 = jni_ygnodestylegetflexbasisjni2;
                        onextracallbackwithresult.Z$0 = z2;
                        onextracallbackwithresult.I$0 = 0;
                        onextracallbackwithresult.label = 3;
                        if (jni_ygnodestylegetflexbasisjni2.IAuthTabCallback((Object) null, onextracallbackwithresult) != objOnWarmupCompleted) {
                        }
                    }
                } else {
                    onextracallbackwithresult.L$0 = access15400.onNavigationEvent(context2);
                    onextracallbackwithresult.L$1 = access15400.onNavigationEvent(pausemyrequest);
                    onextracallbackwithresult.L$2 = null;
                    onextracallbackwithresult.L$3 = null;
                    onextracallbackwithresult.Z$0 = zBooleanValue;
                    onextracallbackwithresult.label = 4;
                    Object objIAuthTabCallback22 = pausemyrequest.IAuthTabCallback(onextracallbackwithresult);
                    if (objIAuthTabCallback22 == objOnWarmupCompleted) {
                    }
                }
            } finally {
            }
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(Context context, access13800<? super setFillColor> access13800Var) throws TossApiCallException.ApiError {
        IAuthTabCallback iAuthTabCallback;
        AdMobEnablementResponse adMobEnablementResponse;
        Object objOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof IAuthTabCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            int i4 = i3 + 53;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i6 = iAuthTabCallback.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i6 - 2147483648;
                int i7 = asBinder + 31;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = iAuthTabCallback.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            Response response = Response.onNavigationEvent;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            g1 savedStateRegistry = ((b3) Response.onExtraCallback(applicationContext, b3.class)).getSavedStateRegistry();
            getTrimPathEnd gettrimpathend = (getTrimPathEnd) g1.onExtraCallback(savedStateRegistry, getTrimPathEnd.class, zzaj.onNavigationEvent().IAuthTabCallbackStub(), (Long) null, access14000.onExtraCallback(5L), (Function1) null, 20, (Object) null);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(context);
            iAuthTabCallback.L$1 = access15400.onNavigationEvent(savedStateRegistry);
            iAuthTabCallback.L$2 = access15400.onNavigationEvent(gettrimpathend);
            iAuthTabCallback.label = 1;
            objOnExtraCallbackWithResult = gettrimpathend.onExtraCallbackWithResult(iAuthTabCallback);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) objOnExtraCallbackWithResult;
        if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
        try {
            objOnTransact = baseApiResponse.onTransact();
        } catch (NullPointerException e) {
            if (!Intrinsics.areEqual(AdMobEnablementResponse.class, Object.class) && (!Intrinsics.areEqual(AdMobEnablementResponse.class, Unit.class))) {
                TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                throw apiErrorOnExtraCallbackWithResult;
            }
            adMobEnablementResponse = Unit.INSTANCE;
        }
        if (objOnTransact == null) {
            throw new NullPointerException("null cannot be cast to non-null type im.toss.ads_sdk.admob.AdMobEnablementResponse");
        }
        adMobEnablementResponse = (AdMobEnablementResponse) objOnTransact;
        return adMobEnablementResponse.onExtraCallback() ? setFillColor.ENABLED : setFillColor.DISABLED;
    }
}
