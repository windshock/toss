package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs;
import o.setAdReviewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n6d implements o2ExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final onExtraCallback Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static char asBinder = 0;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private final logApiCall onNavigationEvent;
    private final n6c onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallback = n6d.this.onExtraCallback((o3) null, (access13800<? super r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs>) this);
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            n6d n6dVar = n6d.this;
            if (i3 != 0) {
                return n6d.onExtraCallbackWithResult(n6dVar, null, this);
            }
            n6d.onExtraCallbackWithResult(n6dVar, null, this);
            obj2.hashCode();
            throw null;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 29;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public n6d(@NotNull logApiCall logapicall, @NotNull n6c n6cVar) {
        Intrinsics.checkNotNullParameter(logapicall, "");
        Intrinsics.checkNotNullParameter(n6cVar, "");
        this.onNavigationEvent = logapicall;
        this.onWarmupCompleted = n6cVar;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(n6d n6dVar, n7 n7Var, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            n6dVar.onExtraCallback(n7Var, (access13800<? super onExtraCallbackWithResult>) access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = n6dVar.onExtraCallback(n7Var, (access13800<? super onExtraCallbackWithResult>) access13800Var);
        int i3 = onTransact + 33;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    @Override // o.o2ExternalSyntheticLambda0
    public o3 onNavigationEvent(@NotNull n3 n3Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(n3Var, "");
        o3 o3VarOnExtraCallback = this.onWarmupCompleted.onExtraCallback(n3Var);
        int i4 = IAuthTabCallbackStub + 17;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return o3VarOnExtraCallback;
        }
        throw null;
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
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $11 + 63;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 7;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char defaultSize = (char) View.getDefaultSize(i3, i3);
                        int iIndexOf = TextUtils.indexOf("", "", i3, i3) + 10;
                        int scrollBarSize = 12434 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iIndexOf, scrollBarSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 12434 - TextUtils.getOffsetBefore("", 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16014), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 19901 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[Catch: all -> 0x0058, CancellationException -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0058, blocks: (B:15:0x0053, B:37:0x00d9, B:40:0x00df, B:44:0x00f7, B:46:0x0111, B:47:0x0116), top: B:71:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // o.o2ExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull o3 o3Var, @NotNull access13800<? super r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i;
        o3 o3Var2;
        onExtraCallbackWithResult onextracallbackwithresult;
        o3 o3Var3;
        o4 o4Var;
        n7 n7Var;
        onExtraCallbackWithResult onextracallbackwithresult2;
        int i2 = 2 % 2;
        int i3 = onTransact + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = access13800Var instanceof IAuthTabCallback;
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        o3 o3Var4 = iAuthTabCallback.label;
        try {
            try {
                if (o3Var4 == 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    try {
                        onWarmupCompleted(o3Var);
                        n7 n7VarOnWarmupCompleted = o3Var.onWarmupCompleted();
                        o3Var2 = o3Var;
                        iAuthTabCallback.L$0 = o3Var2;
                        iAuthTabCallback.label = 1;
                        objOnExtraCallback = onExtraCallback(n7VarOnWarmupCompleted, (access13800<? super onExtraCallbackWithResult>) iAuthTabCallback);
                        if (objOnExtraCallback != objOnWarmupCompleted) {
                            onextracallbackwithresult = (onExtraCallbackWithResult) objOnExtraCallback;
                            if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onNavigationEvent) {
                            }
                        }
                        return objOnWarmupCompleted;
                    } catch (Throwable th) {
                        th = th;
                        o3Var4 = o3Var;
                        r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback2 = new r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback(o3Var4, o0a.Service, th);
                        onWarmupCompleted(o3Var4.onWarmupCompleted(), "bundle_load_error", th);
                        i = onTransact + 79;
                        IAuthTabCallbackStub = i % 128;
                        if (i % 2 != 0) {
                            return iAuthTabCallback2;
                        }
                        throw null;
                    }
                }
                if (o3Var4 == 1) {
                    o3Var2 = (o3) iAuthTabCallback.L$0;
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    onextracallbackwithresult = (onExtraCallbackWithResult) objOnExtraCallback;
                    if (onextracallbackwithresult instanceof onExtraCallbackWithResult.onNavigationEvent) {
                        if (!(onextracallbackwithresult instanceof onExtraCallbackWithResult.onWarmupCompleted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback3 = new r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback(o3Var2, o0a.Service, ((onExtraCallbackWithResult.onWarmupCompleted) onextracallbackwithresult).onNavigationEvent());
                        onWarmupCompleted(o3Var2.onWarmupCompleted(), "service_bundle_load_failed", ((onExtraCallbackWithResult.onWarmupCompleted) onextracallbackwithresult).onNavigationEvent());
                        return iAuthTabCallback3;
                    }
                    int i5 = onTransact + 53;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    o4 o4VarOnWarmupCompleted = ((onExtraCallbackWithResult.onNavigationEvent) onextracallbackwithresult).onWarmupCompleted();
                    onWarmupCompleted("service_bundle_loaded", o4VarOnWarmupCompleted);
                    n7 n7VarIAuthTabCallback = n7.IAuthTabCallback(o3Var2.IAuthTabCallback(), null, null, null, null, null, null, onExtraCallback(o4VarOnWarmupCompleted.asInterface()), false, false, false, 415, null);
                    o3 o3VarOnNavigationEvent = o3.onNavigationEvent(o3Var2, null, n7VarIAuthTabCallback, 1, null);
                    IAuthTabCallback(o4VarOnWarmupCompleted, n7VarIAuthTabCallback);
                    iAuthTabCallback.L$0 = o3Var2;
                    iAuthTabCallback.L$1 = o4VarOnWarmupCompleted;
                    iAuthTabCallback.L$2 = n7VarIAuthTabCallback;
                    iAuthTabCallback.L$3 = o3VarOnNavigationEvent;
                    iAuthTabCallback.label = 2;
                    Object objOnExtraCallback2 = onExtraCallback(n7VarIAuthTabCallback, (access13800<? super onExtraCallbackWithResult>) iAuthTabCallback);
                    if (objOnExtraCallback2 != objOnWarmupCompleted) {
                        o3Var3 = o3VarOnNavigationEvent;
                        o4Var = o4VarOnWarmupCompleted;
                        objOnExtraCallback = objOnExtraCallback2;
                        n7Var = n7VarIAuthTabCallback;
                        onextracallbackwithresult2 = (onExtraCallbackWithResult) objOnExtraCallback;
                        if (onextracallbackwithresult2 instanceof onExtraCallbackWithResult.onNavigationEvent) {
                        }
                    }
                    return objOnWarmupCompleted;
                }
                if (o3Var4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = IAuthTabCallbackStub + 43;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                o3Var3 = (o3) iAuthTabCallback.L$3;
                n7Var = (n7) iAuthTabCallback.L$2;
                o4Var = (o4) iAuthTabCallback.L$1;
                try {
                    ResultKt.onNavigationEvent(objOnExtraCallback);
                    onextracallbackwithresult2 = (onExtraCallbackWithResult) objOnExtraCallback;
                    if (onextracallbackwithresult2 instanceof onExtraCallbackWithResult.onNavigationEvent) {
                        if (!(onextracallbackwithresult2 instanceof onExtraCallbackWithResult.onWarmupCompleted)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback4 = new r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback(o3Var3, o0a.Shared, ((onExtraCallbackWithResult.onWarmupCompleted) onextracallbackwithresult2).onNavigationEvent());
                        onWarmupCompleted(n7Var, "shared_bundle_load_failed", ((onExtraCallbackWithResult.onWarmupCompleted) onextracallbackwithresult2).onNavigationEvent());
                        return iAuthTabCallback4;
                    }
                    o4 o4VarOnWarmupCompleted2 = ((onExtraCallbackWithResult.onNavigationEvent) onextracallbackwithresult2).onWarmupCompleted();
                    onWarmupCompleted("shared_bundle_loaded", o4VarOnWarmupCompleted2);
                    r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted onwarmupcompleted = new r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted(o3Var3, o4Var, o4VarOnWarmupCompleted2);
                    onWarmupCompleted(onwarmupcompleted);
                    return onwarmupcompleted;
                } catch (Throwable th2) {
                    th = th2;
                    o3Var4 = (o3) iAuthTabCallback.L$0;
                    r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback iAuthTabCallback22 = new r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.IAuthTabCallback(o3Var4, o0a.Service, th);
                    onWarmupCompleted(o3Var4.onWarmupCompleted(), "bundle_load_error", th);
                    i = onTransact + 79;
                    IAuthTabCallbackStub = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(n7 n7Var, access13800<? super onExtraCallbackWithResult> access13800Var) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        n7 n7Var2;
        Object objOnExtraCallback;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            int i2 = IAuthTabCallbackStub + 7;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onNavigationEvent) access13800Var).label;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i4 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj2 = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        if (i5 != 0) {
            int i6 = IAuthTabCallbackStub + 93;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n7 n7Var3 = (n7) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj2);
            objOnExtraCallback = obj2;
            n7Var2 = n7Var3;
        } else {
            ResultKt.onNavigationEvent(obj2);
            logApiCall logapicall = this.onNavigationEvent;
            String strIAuthTabCallback = n7Var.IAuthTabCallback();
            String str = (String) n7.IAuthTabCallback(new Object[]{n7Var}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
            String str2 = (String) n7.IAuthTabCallback(new Object[]{n7Var}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2122339782, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2122339783);
            String strOnNavigationEvent = n7Var.onNavigationEvent();
            boolean zIAuthTabCallbackDefault = n7Var.IAuthTabCallbackDefault();
            boolean zAsInterface = n7Var.asInterface();
            boolean zOnTransact = n7Var.onTransact();
            Long lOnExtraCallbackWithResult = n7Var.onExtraCallbackWithResult();
            Date dateAsBinder = n7Var.asBinder();
            n7Var2 = n7Var;
            onnavigationevent.L$0 = n7Var2;
            onnavigationevent.label = 1;
            objOnExtraCallback = logApiCall.onExtraCallback(logapicall, strIAuthTabCallback, str, str2, strOnNavigationEvent, zIAuthTabCallbackDefault, zAsInterface, false, zOnTransact, lOnExtraCallbackWithResult, dateAsBinder, false, null, false, onnavigationevent, 7232, null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        setAdReviewListener setadreviewlistener = (setAdReviewListener) objOnExtraCallback;
        if (setadreviewlistener instanceof setAdReviewListener.IAuthTabCallback) {
            return new onExtraCallbackWithResult.onNavigationEvent(r8lambdazHtRG_L3e9EUlKNiS_FUXM65OBo.IAuthTabCallback(((setAdReviewListener.IAuthTabCallback) setadreviewlistener).IAuthTabCallback(), n7Var2));
        }
        if (setadreviewlistener instanceof setAdReviewListener.onExtraCallback) {
            setAdReviewListener.onExtraCallback onextracallback = (setAdReviewListener.onExtraCallback) setadreviewlistener;
            o4 o4Var = new o4(n7Var2, n6b.Metro, null, null, null, null, null, null, null, false, onextracallback.onExtraCallbackWithResult(), access14000.onNavigationEvent(onextracallback.onNavigationEvent()), 1016, null);
            onExtraCallback(n7Var2, onextracallback.onExtraCallbackWithResult(), onextracallback.onNavigationEvent());
            return new onExtraCallbackWithResult.onNavigationEvent(o4Var);
        }
        if (setadreviewlistener instanceof setAdReviewListener.onNavigationEvent) {
            return new onExtraCallbackWithResult.onWarmupCompleted(((setAdReviewListener.onNavigationEvent) setadreviewlistener).onExtraCallbackWithResult());
        }
        if (!(setadreviewlistener instanceof setAdReviewListener.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        return new onExtraCallbackWithResult.onWarmupCompleted(new IllegalStateException(n7Var2.IAuthTabCallback() + " bundle version mismatch: " + ((setAdReviewListener.onWarmupCompleted) setadreviewlistener).onNavigationEvent()));
    }

    private final Date onExtraCallback(String str) {
        Object obj;
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        if (StringsKt.isBlank(str)) {
            int i2 = IAuthTabCallbackStub + 85;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            int i3 = 5 % 2;
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            Object[] objArr = new Object[1];
            a(new char[]{9029, 60993, 9029, 60993, 35901, 46611, 12133, 33399, 35492, 51165, 56571, 58085, 21639, 39218}, 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            obj = Result.constructor-impl(new SimpleDateFormat(((String) objArr[0]).intern(), Locale.US).parse(str));
            int i4 = onTransact + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return (Date) (Result.onExtraCallback(obj) ^ true ? obj : null);
    }

    static abstract class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final o4 onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 95;
                    onWarmupCompleted = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    int i3 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i3 % 128;
                    return !(i3 % 2 == 0);
                }
                if (Intrinsics.areEqual(this.onNavigationEvent, ((onNavigationEvent) obj).onNavigationEvent)) {
                    return true;
                }
                int i4 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    iHashCode = this.onNavigationEvent.hashCode();
                    int i3 = 84 / 0;
                } else {
                    iHashCode = this.onNavigationEvent.hashCode();
                }
                int i4 = onWarmupCompleted + 63;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Loaded(bundle=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull o4 o4Var) {
                super(null);
                Intrinsics.checkNotNullParameter(o4Var, "");
                this.onNavigationEvent = o4Var;
            }

            public final o4 onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                o4 o4Var = this.onNavigationEvent;
                int i5 = i2 + 87;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return o4Var;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private final Throwable onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 29;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i4 = onExtraCallbackWithResult + 27;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.onExtraCallback, ((onWarmupCompleted) obj).onExtraCallback)) {
                    return false;
                }
                int i6 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Throwable th = this.onExtraCallback;
                if (i3 != 0) {
                    return th.hashCode();
                }
                th.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Failed(throwable=" + this.onExtraCallback + ")";
                int i2 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.onExtraCallback = th;
            }

            public final Throwable onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Throwable th = this.onExtraCallback;
                int i5 = i2 + 25;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return th;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private final void onWarmupCompleted(o3 o3Var) {
        String strValueOf;
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ShoppingTabRnBundlePairLoader");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceBundleName", o3Var.onWarmupCompleted().IAuthTabCallback());
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("sharedBundleName", o3Var.IAuthTabCallback().IAuthTabCallback());
        Long lOnExtraCallbackWithResult = o3Var.onWarmupCompleted().onExtraCallbackWithResult();
        String string2 = null;
        if (lOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallbackStub + 11;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                String.valueOf(lOnExtraCallbackWithResult.longValue());
                string2.hashCode();
                throw null;
            }
            strValueOf = String.valueOf(lOnExtraCallbackWithResult.longValue());
        } else {
            strValueOf = null;
        }
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("serviceMaxAge", strValueOf);
        Long lOnExtraCallbackWithResult2 = o3Var.IAuthTabCallback().onExtraCallbackWithResult();
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sharedMaxAge", lOnExtraCallbackWithResult2 != null ? String.valueOf(lOnExtraCallbackWithResult2.longValue()) : null);
        Date dateAsBinder = o3Var.onWarmupCompleted().asBinder();
        if (dateAsBinder != null) {
            int i5 = onTransact + 1;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                string = dateAsBinder.toString();
                int i6 = 52 / 0;
            } else {
                string = dateAsBinder.toString();
            }
        } else {
            string = null;
        }
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("serviceMinDeployedAt", string);
        Date dateAsBinder2 = o3Var.IAuthTabCallback().asBinder();
        if (dateAsBinder2 != null) {
            string2 = dateAsBinder2.toString();
            int i7 = onTransact + 27;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 4;
            }
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_load_start", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback("sharedMinDeployedAt", string2), getWrite.IAuthTabCallback("region", (String) n7.IAuthTabCallback(new Object[]{o3Var.onWarmupCompleted()}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2122339782, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2122339783)), getWrite.IAuthTabCallback("company", o3Var.onWarmupCompleted().onNavigationEvent()), getWrite.IAuthTabCallback("groupId", o3Var.onWarmupCompleted().onWarmupCompleted())}), (String) null, false, (String) null, 56, (Object) null);
    }

    private final void IAuthTabCallback(o4 o4Var, n7 n7Var) {
        String string;
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ShoppingTabRnBundlePairLoader");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceBundleName", o4Var.IAuthTabCallbackDefault().IAuthTabCallback());
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        String str = (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1806201271, new Object[]{o4Var}, iIAuthTabCallback, iIAuthTabCallback2);
        String str2 = "";
        if (str == null) {
            int i2 = IAuthTabCallbackStub + 95;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
            str = "";
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("serviceDeploymentId", str);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("sharedBundleName", n7Var.IAuthTabCallback());
        String strAsInterface = o4Var.asInterface();
        if (strAsInterface == null) {
            int i4 = IAuthTabCallbackStub + 17;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str2 = strAsInterface;
        }
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sharedMinDeployedAt", str2);
        Date dateAsBinder = n7Var.asBinder();
        if (dateAsBinder != null) {
            int i6 = IAuthTabCallbackStub + 101;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                string = dateAsBinder.toString();
                int i7 = 31 / 0;
            } else {
                string = dateAsBinder.toString();
            }
        } else {
            int i8 = IAuthTabCallbackStub + 55;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            string = null;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "shared_bundle_min_deployed_at", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("parsedMinDeployedAt", string)}), (String) null, false, (String) null, 56, (Object) null);
    }

    private final void onWarmupCompleted(String str, o4 o4Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("from", "ShoppingTabRnBundlePairLoader");
        mapOnExtraCallback.put("bundleName", o4Var.IAuthTabCallbackDefault().IAuthTabCallback());
        mapOnExtraCallback.put("filePath", o4Var.IAuthTabCallback());
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        String str2 = (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback3, 1806201271, new Object[]{o4Var}, iIAuthTabCallback, iIAuthTabCallback2);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        mapOnExtraCallback.put("deploymentId", str2);
        int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback5 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback6 = OverseasRrnInputTextField.IAuthTabCallback();
        mapOnExtraCallback.put("deployedAt", (String) o4.onWarmupCompleted(1338810367, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback6, -1338810367, new Object[]{o4Var}, iIAuthTabCallback4, iIAuthTabCallback5));
        String strAsInterface = o4Var.asInterface();
        Object obj = null;
        if (strAsInterface == null) {
            int i4 = onTransact + 113;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str3 = strAsInterface;
        }
        mapOnExtraCallback.put("sharedMinDeployedAt", str3);
        mapOnExtraCallback.put("source", o4Var.asBinder().name());
        mapOnExtraCallback.put("cacheHit", String.valueOf(o4Var.access100()));
        mapOnExtraCallback.put("groupId", o4Var.IAuthTabCallbackDefault().onWarmupCompleted());
        String strOnNavigationEvent = o4Var.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            int i5 = onTransact + 35;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                mapOnExtraCallback.put("metroHost", strOnNavigationEvent);
                throw null;
            }
            mapOnExtraCallback.put("metroHost", strOnNavigationEvent);
        }
        Integer numOnExtraCallbackWithResult = o4Var.onExtraCallbackWithResult();
        if (numOnExtraCallbackWithResult != null) {
            mapOnExtraCallback.put("metroPort", String.valueOf(numOnExtraCallbackWithResult.intValue()));
        }
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", str, access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
    }

    private final void onWarmupCompleted(r8lambdaKxM8Vml8AyVtEmvtK3WJEVwFnzs.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ShoppingTabRnBundlePairLoader");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("serviceBundleName", onwarmupcompleted.onNavigationEvent().IAuthTabCallbackDefault().IAuthTabCallback());
        String str = (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1806201271, new Object[]{onwarmupcompleted.onNavigationEvent()}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
        String str2 = "";
        if (str == null) {
            int i2 = onTransact + 55;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 109;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("serviceDeploymentId", str);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("serviceDeployedAt", (String) o4.onWarmupCompleted(1338810367, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1338810367, new Object[]{onwarmupcompleted.onNavigationEvent()}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback()));
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sharedBundleName", onwarmupcompleted.onWarmupCompleted().IAuthTabCallbackDefault().IAuthTabCallback());
        String str3 = (String) o4.onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1806201271, new Object[]{onwarmupcompleted.onWarmupCompleted()}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback());
        if (str3 == null) {
            int i6 = IAuthTabCallbackStub + 5;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str2 = str3;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_pair_loaded", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback("sharedDeploymentId", str2), getWrite.IAuthTabCallback("sharedDeployedAt", (String) o4.onWarmupCompleted(1338810367, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1338810367, new Object[]{onwarmupcompleted.onWarmupCompleted()}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())), getWrite.IAuthTabCallback("cacheHit", String.valueOf(onwarmupcompleted.onNavigationEvent().access100() && !(onwarmupcompleted.onWarmupCompleted().access100() ^ true))), getWrite.IAuthTabCallback("groupId", onwarmupcompleted.IAuthTabCallback().onWarmupCompleted().onWarmupCompleted())}), (String) null, false, (String) null, 56, (Object) null);
    }

    private final void onWarmupCompleted(n7 n7Var, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "ShoppingTabRnBundlePairLoader");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("bundleName", n7Var.IAuthTabCallback());
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("bundleUrl", (String) n7.IAuthTabCallback(new Object[]{n7Var}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("groupId", n7Var.onWarmupCompleted());
        String message = th.getMessage();
        if (message == null) {
            int i4 = onTransact + 69;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            message = th.toString();
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult("react_native_debug", str, th, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback("error", message), getWrite.IAuthTabCallback("errorType", th.getClass().getSimpleName())}));
    }

    private final void onExtraCallback(n7 n7Var, String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "metro_server_detected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ShoppingTabRnBundlePairLoader"), getWrite.IAuthTabCallback("bundleName", n7Var.IAuthTabCallback()), getWrite.IAuthTabCallback("host", str), getWrite.IAuthTabCallback("port", String.valueOf(i))}), (String) null, false, (String) null, 56, (Object) null);
        int i5 = onTransact + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onNavigationEvent() {
        onExtraCallback = (char) 28549;
        IAuthTabCallback = (char) 26798;
        onExtraCallbackWithResult = (char) 13983;
        asBinder = (char) 20633;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
