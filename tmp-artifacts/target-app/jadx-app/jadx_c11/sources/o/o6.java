package o;

import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o6 implements o7 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final afErrorLogForExcManagerOnly onExtraCallback;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            o6 o6Var = o6.this;
            if (i3 == 0) {
                o6Var.onWarmupCompleted(this);
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = o6Var.onWarmupCompleted(this);
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                return objOnWarmupCompleted;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnWarmupCompleted);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = o6.onExtraCallbackWithResult(o6.this, this);
            int i4 = IAuthTabCallback + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = o6.this.onExtraCallbackWithResult(this);
            if (objOnExtraCallbackWithResult == access14300.onWarmupCompleted()) {
                int i2 = onExtraCallback + 43;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnExtraCallbackWithResult);
            int i3 = onNavigationEvent + 47;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return resultIAuthTabCallback;
            }
            throw null;
        }
    }

    @Inject
    public o6(@NotNull afErrorLogForExcManagerOnly aferrorlogforexcmanageronly) {
        Intrinsics.checkNotNullParameter(aferrorlogforexcmanageronly, "");
        this.onExtraCallback = aferrorlogforexcmanageronly;
    }

    public static final /* synthetic */ afErrorLogForExcManagerOnly IAuthTabCallback(o6 o6Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        afErrorLogForExcManagerOnly aferrorlogforexcmanageronly = o6Var.onExtraCallback;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return aferrorlogforexcmanageronly;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(o6 o6Var, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return o6Var.onExtraCallback(access13800Var);
        }
        o6Var.onExtraCallback(access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(access13800<? super o7c> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        String str;
        long j;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onWarmupCompleted + 83;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnWarmupCompleted = onextracallbackwithresult.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            afErrorLogForExcManagerOnly aferrorlogforexcmanageronly = this.onExtraCallback;
            onextracallbackwithresult.label = 1;
            objOnWarmupCompleted = aferrorlogforexcmanageronly.onWarmupCompleted(onextracallbackwithresult);
            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
            }
            return objOnWarmupCompleted2;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = onextracallbackwithresult.J$0;
            str = (String) onextracallbackwithresult.L$1;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            return new o7c(str, j, !Intrinsics.areEqual(objOnWarmupCompleted, "NONE"));
        }
        ResultKt.onNavigationEvent(objOnWarmupCompleted);
        int i6 = onWarmupCompleted + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        X509Certificate x509Certificate = (X509Certificate) objOnWarmupCompleted;
        if (x509Certificate == null) {
            return null;
        }
        int i8 = onWarmupCompleted + 55;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        String strOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(x509Certificate);
        long jLongValue = x509Certificate.getSerialNumber().longValue();
        afErrorLogForExcManagerOnly aferrorlogforexcmanageronly2 = this.onExtraCallback;
        onextracallbackwithresult.L$0 = access15400.onNavigationEvent(x509Certificate);
        onextracallbackwithresult.L$1 = strOnWarmupCompleted;
        onextracallbackwithresult.J$0 = jLongValue;
        onextracallbackwithresult.label = 2;
        objOnWarmupCompleted = aferrorlogforexcmanageronly2.onExtraCallback("CERT_USE", onextracallbackwithresult);
        if (objOnWarmupCompleted != objOnWarmupCompleted2) {
            int i10 = onWarmupCompleted + 57;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            str = strOnWarmupCompleted;
            j = jLongValue;
            return new o7c(str, j, !Intrinsics.areEqual(objOnWarmupCompleted, "NONE"));
        }
        return objOnWarmupCompleted2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull access13800<? super Result<o7c>> access13800Var) {
        onExtraCallback onextracallback;
        int i;
        onExtraCallback onextracallback2;
        int i2;
        int i3 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                Result.Companion companion = Result.Companion;
                afErrorLogForExcManagerOnly aferrorlogforexcmanageronlyIAuthTabCallback = IAuthTabCallback(this);
                onextracallback.L$0 = access15400.onNavigationEvent(onextracallback);
                i = 0;
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objOnNavigationEvent = aferrorlogforexcmanageronlyIAuthTabCallback.onNavigationEvent(3000L, onextracallback);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    int i6 = onNavigationEvent + 43;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    onextracallback2 = onextracallback;
                    i2 = 0;
                }
                return objOnWarmupCompleted;
            }
            if (i5 != 1) {
                int i8 = onWarmupCompleted + 115;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0 ? i5 != 2 : i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                return Result.constructor-impl(objOnNavigationEvent);
            }
            i = onextracallback.I$1;
            i2 = onextracallback.I$0;
            onextracallback2 = (access13800) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            boolean zBooleanValue = ((Boolean) objOnNavigationEvent).booleanValue();
            if (zBooleanValue) {
                onextracallback.L$0 = access15400.onNavigationEvent(onextracallback2);
                onextracallback.I$0 = i2;
                onextracallback.I$1 = i;
                onextracallback.Z$0 = zBooleanValue;
                onextracallback.label = 2;
                objOnNavigationEvent = onExtraCallbackWithResult(this, onextracallback);
                if (objOnNavigationEvent == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                objOnNavigationEvent = null;
            }
            return Result.constructor-impl(objOnNavigationEvent);
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r4
      0x002b: PHI (r1v10 o.o6$onWarmupCompleted) = (r1v9 o.o6$onWarmupCompleted), (r1v12 o.o6$onWarmupCompleted) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // o.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Result<? extends X509Certificate>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i3 = onNavigationEvent + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                i = onwarmupcompleted.label;
                int i4 = 73 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            } else {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                i = onwarmupcompleted.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnWarmupCompleted = onwarmupcompleted.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                Result.Companion companion = Result.Companion;
                afErrorLogForExcManagerOnly aferrorlogforexcmanageronlyIAuthTabCallback = IAuthTabCallback(this);
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                objOnWarmupCompleted = aferrorlogforexcmanageronlyIAuthTabCallback.onWarmupCompleted(onwarmupcompleted);
                if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                    int i6 = onWarmupCompleted + 95;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted2;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
            }
            return Result.constructor-impl(objOnWarmupCompleted);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e3));
        }
    }
}
