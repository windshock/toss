package o;

import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableGetSortedAppVersionsOpt {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final getHeaders onExtraCallbackWithResult;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            enableGetSortedAppVersionsOpt enablegetsortedappversionsopt = enableGetSortedAppVersionsOpt.this;
            if (i3 == 0) {
                return enablegetsortedappversionsopt.onNavigationEvent(null, this);
            }
            enablegetsortedappversionsopt.onNavigationEvent(null, this);
            throw null;
        }
    }

    @Inject
    public enableGetSortedAppVersionsOpt(@NotNull getHeaders getheaders) {
        Intrinsics.checkNotNullParameter(getheaders, "");
        this.onExtraCallbackWithResult = getheaders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super String> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onwarmupcompleted.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            getHeaders getheaders = this.onExtraCallbackWithResult;
            onwarmupcompleted.L$0 = str;
            onwarmupcompleted.label = 1;
            objOnNavigationEvent = getheaders.onNavigationEvent(onwarmupcompleted);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((kotlin.Result) obj).onNavigationEvent();
        }
        Object obj2 = null;
        if (!(!kotlin.Result.onExtraCallback(objOnNavigationEvent))) {
            objOnNavigationEvent = null;
        }
        getDataMap getdatamap = (getDataMap) objOnNavigationEvent;
        if (getdatamap == null) {
            return null;
        }
        String strOnWarmupCompleted = getdatamap.onWarmupCompleted();
        if (getdatamap.onExtraCallback() && strOnWarmupCompleted != null) {
            int i4 = onWarmupCompleted + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                StringsKt.isBlank(strOnWarmupCompleted);
                obj2.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(strOnWarmupCompleted)) {
                String strOnWarmupCompleted2 = isUcInitOpt.onWarmupCompleted(strOnWarmupCompleted, str);
                int i5 = onWarmupCompleted + 87;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return strOnWarmupCompleted2;
                }
                throw null;
            }
        }
        return null;
    }
}
