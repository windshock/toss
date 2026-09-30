package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getMaxCornerRadius<T> extends setTileModeX<getRubIn> implements getBorderRadius<T>, rmf<T>, syalt<T> {
    private Object[] IAuthTabCallback;
    private long IAuthTabCallbackStub;
    private final int asInterface;
    private final int onExtraCallback;
    private int onExtraCallbackWithResult;
    private final CloseableUtils onNavigationEvent;
    private int onTransact;
    private long onWarmupCompleted;

    public final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[CloseableUtils.values().length];
            try {
                iArr[CloseableUtils.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloseableUtils.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloseableUtils.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static final class onExtraCallbackWithResult<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getMaxCornerRadius<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getMaxCornerRadius<T> getmaxcornerradius, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
            this.this$0 = getmaxcornerradius;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getMaxCornerRadius.IAuthTabCallback(this.this$0, null, this);
        }
    }

    @Override // o.getTileModeX, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<?> access13800Var) {
        return IAuthTabCallback(this, setripple, access13800Var);
    }

    @Override // o.getBorderRadius, o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, t, access13800Var);
    }

    public getMaxCornerRadius(int i, int i2, @NotNull CloseableUtils closeableUtils) {
        this.asInterface = i;
        this.onExtraCallback = i2;
        this.onNavigationEvent = closeableUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long IAuthTabCallbackStubProxy() {
        return Math.min(this.onWarmupCompleted, this.IAuthTabCallbackStub);
    }

    private final int ICustomTabsCallback() {
        return (int) ((IAuthTabCallbackStubProxy() + this.onExtraCallbackWithResult) - this.IAuthTabCallbackStub);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int extraCallbackWithResult() {
        return this.onExtraCallbackWithResult + this.onTransact;
    }

    private final long access100() {
        return IAuthTabCallbackStubProxy() + this.onExtraCallbackWithResult;
    }

    private final long getInterfaceDescriptor() {
        return IAuthTabCallbackStubProxy() + this.onExtraCallbackWithResult + this.onTransact;
    }

    public final T asInterface() {
        Object[] objArr = this.IAuthTabCallback;
        Intrinsics.checkNotNull(objArr);
        return (T) getShine.onExtraCallbackWithResult(objArr, (this.IAuthTabCallbackStub + ICustomTabsCallback()) - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (((o.setEraseRadius) r9).onNavigationEvent(r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o.setRipple] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, o.getMaxCornerRadius] */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.getMaxCornerRadius] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> Object IAuthTabCallback(getMaxCornerRadius<T> getmaxcornerradius, setRipple<? super T> setripple, access13800<?> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        getRubIn getrubinIAuthTabCallbackDefault;
        setRipple<? super T> setripple2;
        getRubIn getrubin;
        ?? r5;
        Throwable th;
        getPackageType getpackagetype;
        ?? r2;
        Object objOnWarmupCompleted;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(getmaxcornerradius, access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            getrubinIAuthTabCallbackDefault = getmaxcornerradius.IAuthTabCallbackDefault();
            try {
                if (setripple instanceof setEraseRadius) {
                    onextracallbackwithresult.L$0 = getmaxcornerradius;
                    onextracallbackwithresult.L$1 = setripple;
                    onextracallbackwithresult.L$2 = getrubinIAuthTabCallbackDefault;
                    onextracallbackwithresult.label = 1;
                }
                setripple2 = setripple;
                getrubin = getrubinIAuthTabCallbackDefault;
                r5 = getmaxcornerradius;
                getpackagetype = (getPackageType) onextracallbackwithresult.getContext().get(getPackageType.onNavigationEvent);
                r2 = setripple2;
                while (true) {
                    objOnWarmupCompleted = r5.onWarmupCompleted(getrubin);
                    if (objOnWarmupCompleted == getShine.onWarmupCompleted) {
                    }
                }
                return objOnExtraCallback;
            } catch (Throwable th2) {
                th = th2;
                getmaxcornerradius.onWarmupCompleted((getMaxCornerRadius<T>) getrubinIAuthTabCallbackDefault);
                throw th;
            }
        }
        if (i2 == 1) {
            getrubin = (getRubIn) onextracallbackwithresult.L$2;
            setRipple<? super T> setripple3 = (setRipple) onextracallbackwithresult.L$1;
            getMaxCornerRadius<T> getmaxcornerradius2 = (getMaxCornerRadius) onextracallbackwithresult.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                setripple2 = setripple3;
                getmaxcornerradius = getmaxcornerradius2;
            } catch (Throwable th3) {
                getrubinIAuthTabCallbackDefault = getrubin;
                th = th3;
                getmaxcornerradius = getmaxcornerradius2;
                getmaxcornerradius.onWarmupCompleted((getMaxCornerRadius<T>) getrubinIAuthTabCallbackDefault);
                throw th;
            }
            try {
                r5 = getmaxcornerradius;
                getpackagetype = (getPackageType) onextracallbackwithresult.getContext().get(getPackageType.onNavigationEvent);
                r2 = setripple2;
                while (true) {
                    objOnWarmupCompleted = r5.onWarmupCompleted(getrubin);
                    if (objOnWarmupCompleted == getShine.onWarmupCompleted) {
                    }
                }
                return objOnExtraCallback;
            } catch (Throwable th4) {
                r5 = getmaxcornerradius;
                th = th4;
                getrubinIAuthTabCallbackDefault = getrubin;
                th = th;
                getmaxcornerradius = r5;
                getmaxcornerradius.onWarmupCompleted((getMaxCornerRadius<T>) getrubinIAuthTabCallbackDefault);
                throw th;
            }
        }
        if (i2 != 2 && i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        getpackagetype = (getPackageType) onextracallbackwithresult.L$3;
        getrubin = (getRubIn) onextracallbackwithresult.L$2;
        setRipple setripple4 = (setRipple) onextracallbackwithresult.L$1;
        r5 = (getMaxCornerRadius) onextracallbackwithresult.L$0;
        try {
            ResultKt.onNavigationEvent(obj);
            r2 = setripple4;
            r5 = r5;
            while (true) {
                objOnWarmupCompleted = r5.onWarmupCompleted(getrubin);
                if (objOnWarmupCompleted == getShine.onWarmupCompleted) {
                    onextracallbackwithresult.L$0 = r5;
                    onextracallbackwithresult.L$1 = r2;
                    onextracallbackwithresult.L$2 = getrubin;
                    onextracallbackwithresult.L$3 = getpackagetype;
                    onextracallbackwithresult.label = 2;
                    if (r5.onExtraCallback(getrubin, onextracallbackwithresult) == objOnExtraCallback) {
                        break;
                    }
                } else {
                    if (getpackagetype != null) {
                        getFullPackage.IAuthTabCallback(getpackagetype);
                    }
                    onextracallbackwithresult.L$0 = r5;
                    onextracallbackwithresult.L$1 = r2;
                    onextracallbackwithresult.L$2 = getrubin;
                    onextracallbackwithresult.L$3 = getpackagetype;
                    onextracallbackwithresult.label = 3;
                    if (r2.emit(objOnWarmupCompleted, onextracallbackwithresult) == objOnExtraCallback) {
                        break;
                    }
                }
            }
            return objOnExtraCallback;
        } catch (Throwable th5) {
            th = th5;
            getrubinIAuthTabCallbackDefault = getrubin;
            th = th;
            getmaxcornerradius = r5;
            getmaxcornerradius.onWarmupCompleted((getMaxCornerRadius<T>) getrubinIAuthTabCallbackDefault);
            throw th;
        }
    }

    @Override // o.getBorderRadius
    public boolean onNavigationEvent(T t) {
        int i;
        boolean z;
        access13800<Unit>[] access13800VarArrIAuthTabCallback = setTileModeY.onWarmupCompleted;
        synchronized (this) {
            if (onExtraCallback((getMaxCornerRadius<T>) t)) {
                access13800VarArrIAuthTabCallback = IAuthTabCallback(access13800VarArrIAuthTabCallback);
                z = true;
            } else {
                z = false;
            }
        }
        for (access13800<Unit> access13800Var : access13800VarArrIAuthTabCallback) {
            if (access13800Var != null) {
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    static /* synthetic */ <T> Object onWarmupCompleted(getMaxCornerRadius<T> getmaxcornerradius, T t, access13800<? super Unit> access13800Var) {
        Object objOnNavigationEvent;
        return (!getmaxcornerradius.onNavigationEvent((getMaxCornerRadius<T>) t) && (objOnNavigationEvent = getmaxcornerradius.onNavigationEvent((getMaxCornerRadius<T>) t, access13800Var)) == access14100.onExtraCallback()) ? objOnNavigationEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onExtraCallback(T t) {
        if (IAuthTabCallbackStub() == 0) {
            return onExtraCallbackWithResult((getMaxCornerRadius<T>) t);
        }
        if (this.onExtraCallbackWithResult >= this.onExtraCallback && this.onWarmupCompleted <= this.IAuthTabCallbackStub) {
            int i = onExtraCallback.IAuthTabCallback[this.onNavigationEvent.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        onWarmupCompleted(t);
        int i2 = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i2;
        if (i2 > this.onExtraCallback) {
            access000();
        }
        if (ICustomTabsCallback() > this.asInterface) {
            onExtraCallbackWithResult(this.IAuthTabCallbackStub + 1, this.onWarmupCompleted, access100(), getInterfaceDescriptor());
        }
        return true;
    }

    private final boolean onExtraCallbackWithResult(T t) {
        if (this.asInterface == 0) {
            return true;
        }
        onWarmupCompleted(t);
        int i = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i;
        if (i > this.asInterface) {
            access000();
        }
        this.onWarmupCompleted = IAuthTabCallbackStubProxy() + this.onExtraCallbackWithResult;
        return true;
    }

    private final void access000() {
        Object[] objArr = this.IAuthTabCallback;
        Intrinsics.checkNotNull(objArr);
        getShine.onExtraCallbackWithResult(objArr, IAuthTabCallbackStubProxy(), null);
        this.onExtraCallbackWithResult--;
        long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy() + 1;
        if (this.IAuthTabCallbackStub < jIAuthTabCallbackStubProxy) {
            this.IAuthTabCallbackStub = jIAuthTabCallbackStubProxy;
        }
        if (this.onWarmupCompleted < jIAuthTabCallbackStubProxy) {
            onWarmupCompleted(jIAuthTabCallbackStubProxy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(Object obj) {
        int iExtraCallbackWithResult = extraCallbackWithResult();
        Object[] objArrOnExtraCallback = this.IAuthTabCallback;
        if (objArrOnExtraCallback == null) {
            objArrOnExtraCallback = onExtraCallback((Object[]) null, 0, 2);
        } else if (iExtraCallbackWithResult >= objArrOnExtraCallback.length) {
            objArrOnExtraCallback = onExtraCallback(objArrOnExtraCallback, iExtraCallbackWithResult, objArrOnExtraCallback.length << 1);
        }
        getShine.onExtraCallbackWithResult(objArrOnExtraCallback, IAuthTabCallbackStubProxy() + iExtraCallbackWithResult, obj);
    }

    private final Object[] onExtraCallback(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.IAuthTabCallback = objArr2;
        if (objArr != null) {
            long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jIAuthTabCallbackStubProxy;
                getShine.onExtraCallbackWithResult(objArr2, j, getShine.onExtraCallbackWithResult(objArr, j));
            }
        }
        return objArr2;
    }

    public final long onTransact() {
        long j = this.IAuthTabCallbackStub;
        if (j < this.onWarmupCompleted) {
            this.onWarmupCompleted = j;
        }
        return j;
    }

    public final access13800<Unit>[] IAuthTabCallback(long j) {
        int iMin;
        long j2;
        long j3;
        long j4;
        long j5;
        getStarImageView[] getstarimageviewArr;
        if (j > this.onWarmupCompleted) {
            return setTileModeY.onWarmupCompleted;
        }
        long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        long j6 = this.onExtraCallbackWithResult + jIAuthTabCallbackStubProxy;
        if (this.onExtraCallback == 0 && this.onTransact > 0) {
            j6++;
        }
        int i = 0;
        if (super.onNavigationEvent != 0 && (getstarimageviewArr = super.IAuthTabCallback) != null) {
            for (getStarImageView getstarimageview : getstarimageviewArr) {
                if (getstarimageview != null) {
                    long j7 = ((getRubIn) getstarimageview).onWarmupCompleted;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.onWarmupCompleted) {
            return setTileModeY.onWarmupCompleted;
        }
        long jAccess100 = access100();
        if (IAuthTabCallbackStub() > 0) {
            iMin = Math.min(this.onTransact, this.onExtraCallback - ((int) (jAccess100 - j6)));
        } else {
            iMin = this.onTransact;
        }
        access13800<Unit>[] access13800VarArr = setTileModeY.onWarmupCompleted;
        long j8 = this.onTransact + jAccess100;
        if (iMin > 0) {
            access13800VarArr = new access13800[iMin];
            Object[] objArr = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr);
            j4 = jAccess100;
            while (true) {
                if (jAccess100 >= j8) {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
                Object objOnExtraCallbackWithResult = getShine.onExtraCallbackWithResult(objArr, jAccess100);
                j2 = j6;
                djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = getShine.onWarmupCompleted;
                if (objOnExtraCallbackWithResult != djexternalsyntheticapimodeloutline0) {
                    Intrinsics.checkNotNull(objOnExtraCallbackWithResult, "");
                    IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objOnExtraCallbackWithResult;
                    int i2 = i + 1;
                    j3 = j8;
                    access13800VarArr[i] = iAuthTabCallback.onExtraCallback;
                    getShine.onExtraCallbackWithResult(objArr, jAccess100, djexternalsyntheticapimodeloutline0);
                    getShine.onExtraCallbackWithResult(objArr, j4, iAuthTabCallback.IAuthTabCallback);
                    j5 = 1;
                    j4++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = j8;
                    j5 = 1;
                }
                jAccess100 += j5;
                j6 = j2;
                j8 = j3;
            }
        } else {
            j2 = j6;
            j3 = j8;
            j4 = jAccess100;
        }
        access13800<Unit>[] access13800VarArr2 = access13800VarArr;
        int i3 = (int) (j4 - jIAuthTabCallbackStubProxy);
        long j9 = IAuthTabCallbackStub() == 0 ? j4 : j2;
        long jMax = Math.max(this.IAuthTabCallbackStub, j4 - Math.min(this.asInterface, i3));
        if (this.onExtraCallback == 0 && jMax < j3) {
            Object[] objArr2 = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(getShine.onExtraCallbackWithResult(objArr2, jMax), getShine.onWarmupCompleted)) {
                j4++;
                jMax++;
            }
        }
        onExtraCallbackWithResult(jMax, j9, j4, j3);
        IAuthTabCallback();
        return access13800VarArr2.length == 0 ? access13800VarArr2 : IAuthTabCallback(access13800VarArr2);
    }

    private final void onExtraCallbackWithResult(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(); jIAuthTabCallbackStubProxy < jMin; jIAuthTabCallbackStubProxy++) {
            Object[] objArr = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr);
            getShine.onExtraCallbackWithResult(objArr, jIAuthTabCallbackStubProxy, null);
        }
        this.IAuthTabCallbackStub = j;
        this.onWarmupCompleted = j2;
        this.onExtraCallbackWithResult = (int) (j3 - jMin);
        this.onTransact = (int) (j4 - j3);
    }

    private final void IAuthTabCallback() {
        if (this.onExtraCallback != 0 || this.onTransact > 1) {
            Object[] objArr = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr);
            while (this.onTransact > 0 && getShine.onExtraCallbackWithResult(objArr, (IAuthTabCallbackStubProxy() + extraCallbackWithResult()) - 1) == getShine.onWarmupCompleted) {
                this.onTransact--;
                getShine.onExtraCallbackWithResult(objArr, IAuthTabCallbackStubProxy() + extraCallbackWithResult(), null);
            }
        }
    }

    private final Object onWarmupCompleted(getRubIn getrubin) {
        Object obj;
        access13800<Unit>[] access13800VarArrIAuthTabCallback = setTileModeY.onWarmupCompleted;
        synchronized (this) {
            long jIAuthTabCallback = IAuthTabCallback(getrubin);
            if (jIAuthTabCallback < 0) {
                obj = getShine.onWarmupCompleted;
            } else {
                long j = getrubin.onWarmupCompleted;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(jIAuthTabCallback);
                getrubin.onWarmupCompleted = jIAuthTabCallback + 1;
                access13800VarArrIAuthTabCallback = IAuthTabCallback(j);
                obj = objOnExtraCallbackWithResult;
            }
        }
        for (access13800<Unit> access13800Var : access13800VarArrIAuthTabCallback) {
            if (access13800Var != null) {
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long IAuthTabCallback(getRubIn getrubin) {
        long j = getrubin.onWarmupCompleted;
        if (j < access100() || (this.onExtraCallback <= 0 && j <= IAuthTabCallbackStubProxy() && this.onTransact != 0)) {
            return j;
        }
        return -1L;
    }

    private final Object onExtraCallbackWithResult(long j) {
        Object[] objArr = this.IAuthTabCallback;
        Intrinsics.checkNotNull(objArr);
        Object objOnExtraCallbackWithResult = getShine.onExtraCallbackWithResult(objArr, j);
        return objOnExtraCallbackWithResult instanceof IAuthTabCallback ? ((IAuthTabCallback) objOnExtraCallbackWithResult).IAuthTabCallback : objOnExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final access13800<Unit>[] IAuthTabCallback(access13800<Unit>[] access13800VarArr) {
        getStarImageView[] getstarimageviewArr;
        getRubIn getrubin;
        access13800<? super Unit> access13800Var;
        int length = access13800VarArr.length;
        if (super.onNavigationEvent != 0 && (getstarimageviewArr = super.IAuthTabCallback) != null) {
            int length2 = getstarimageviewArr.length;
            int i = 0;
            access13800VarArr = access13800VarArr;
            while (i < length2) {
                getStarImageView getstarimageview = getstarimageviewArr[i];
                if (getstarimageview != null && (access13800Var = (getrubin = (getRubIn) getstarimageview).onExtraCallbackWithResult) != null && IAuthTabCallback(getrubin) >= 0) {
                    int length3 = access13800VarArr.length;
                    access13800VarArr = access13800VarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(access13800VarArr, Math.max(2, access13800VarArr.length << 1));
                        Intrinsics.checkNotNullExpressionValue(CopyOf, "");
                        access13800VarArr = CopyOf;
                    }
                    access13800VarArr[length] = access13800Var;
                    getrubin.onExtraCallbackWithResult = null;
                    length++;
                }
                i++;
                access13800VarArr = access13800VarArr;
            }
        }
        return access13800VarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTileModeX
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getRubIn asBinder() {
        return new getRubIn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTileModeX
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getRubIn[] onExtraCallback(int i) {
        return new getRubIn[i];
    }

    @Override // o.syalt
    public IAnimation<T> onExtraCallback(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return getShine.onWarmupCompleted(this, coroutineContext, i, closeableUtils);
    }

    static final class IAuthTabCallback implements setDeployments {
        public final Object IAuthTabCallback;
        public final access13800<Unit> onExtraCallback;
        public long onExtraCallbackWithResult;
        public final getMaxCornerRadius<?> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(@NotNull getMaxCornerRadius<?> getmaxcornerradius, long j, @Nullable Object obj, @NotNull access13800<? super Unit> access13800Var) {
            this.onWarmupCompleted = getmaxcornerradius;
            this.onExtraCallbackWithResult = j;
            this.IAuthTabCallback = obj;
            this.onExtraCallback = access13800Var;
        }

        @Override // o.setDeployments
        public void dispose() {
            this.onWarmupCompleted.IAuthTabCallback(this);
        }
    }

    @Override // o.getTileModeX
    public List<T> onExtraCallback() {
        synchronized (this) {
            int iICustomTabsCallback = ICustomTabsCallback();
            if (iICustomTabsCallback == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(iICustomTabsCallback);
            Object[] objArr = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < iICustomTabsCallback; i++) {
                arrayList.add(getShine.onExtraCallbackWithResult(objArr, this.IAuthTabCallbackStub + i));
            }
            return arrayList;
        }
    }

    private final void onWarmupCompleted(long j) {
        getStarImageView[] getstarimageviewArr;
        if (super.onNavigationEvent != 0 && (getstarimageviewArr = super.IAuthTabCallback) != null) {
            for (getStarImageView getstarimageview : getstarimageviewArr) {
                if (getstarimageview != null) {
                    getRubIn getrubin = (getRubIn) getstarimageview;
                    long j2 = getrubin.onWarmupCompleted;
                    if (j2 >= 0 && j2 < j) {
                        getrubin.onWarmupCompleted = j;
                    }
                }
            }
        }
        this.onWarmupCompleted = j;
    }

    private final Object onNavigationEvent(T t, access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        access13800<Unit>[] access13800VarArrIAuthTabCallback = setTileModeY.onWarmupCompleted;
        synchronized (this) {
            try {
                if (onExtraCallback((getMaxCornerRadius<T>) t)) {
                    Result.Companion companion = Result.Companion;
                    setresourceinternal.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
                    access13800VarArrIAuthTabCallback = IAuthTabCallback(access13800VarArrIAuthTabCallback);
                    iAuthTabCallback = null;
                } else {
                    IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback(this, extraCallbackWithResult() + IAuthTabCallbackStubProxy(), t, setresourceinternal);
                    onWarmupCompleted(iAuthTabCallback2);
                    this.onTransact++;
                    if (this.onExtraCallback == 0) {
                        access13800VarArrIAuthTabCallback = IAuthTabCallback(access13800VarArrIAuthTabCallback);
                    }
                    iAuthTabCallback = iAuthTabCallback2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iAuthTabCallback != null) {
            maybeAddAttachStateListener.onExtraCallbackWithResult(setresourceinternal, iAuthTabCallback);
        }
        for (access13800<Unit> access13800Var2 : access13800VarArrIAuthTabCallback) {
            if (access13800Var2 != null) {
                Result.Companion companion2 = Result.Companion;
                access13800Var2.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        synchronized (this) {
            if (iAuthTabCallback.onExtraCallbackWithResult < IAuthTabCallbackStubProxy()) {
                return;
            }
            Object[] objArr = this.IAuthTabCallback;
            Intrinsics.checkNotNull(objArr);
            if (getShine.onExtraCallbackWithResult(objArr, iAuthTabCallback.onExtraCallbackWithResult) != iAuthTabCallback) {
                return;
            }
            getShine.onExtraCallbackWithResult(objArr, iAuthTabCallback.onExtraCallbackWithResult, getShine.onWarmupCompleted);
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Object onExtraCallback(getRubIn getrubin, access13800<? super Unit> access13800Var) {
        Unit unit;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        synchronized (this) {
            if (IAuthTabCallback(getrubin) >= 0) {
                Result.Companion companion = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            } else {
                getrubin.onExtraCallbackWithResult = setresourceinternal;
            }
            unit = Unit.INSTANCE;
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : unit;
    }

    @Override // o.getBorderRadius
    public void onNavigationEvent() {
        synchronized (this) {
            onExtraCallbackWithResult(access100(), this.onWarmupCompleted, access100(), getInterfaceDescriptor());
            Unit unit = Unit.INSTANCE;
        }
    }
}
