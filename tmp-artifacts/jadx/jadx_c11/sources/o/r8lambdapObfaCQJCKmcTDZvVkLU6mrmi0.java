package o;

import android.content.Context;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final playerBufferingEnd IAuthTabCallback;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onNavigationEvent = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        long J$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.this.onNavigationEvent(0L, (access13800<? super Result<Boolean>>) this);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                return objOnNavigationEvent;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = onWarmupCompleted + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    public interface onNavigationEvent {
        r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 SystemBarStyleCompanionExternalSyntheticLambda0();
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0 = r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0.this;
            if (i3 != 0) {
                r8lambdapobfacqjckmctdzvvklu6mrmi0.onNavigationEvent((List<Long>) null, (access13800<? super Result<Boolean>>) this);
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = r8lambdapobfacqjckmctdzvvklu6mrmi0.onNavigationEvent((List<Long>) null, (access13800<? super Result<Boolean>>) this);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                return objOnNavigationEvent;
            }
            Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnNavigationEvent);
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    static {
        int i = onExtraCallback + 45;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    @Inject
    public r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0(@NotNull playerBufferingEnd playerbufferingend) {
        Intrinsics.checkNotNullParameter(playerbufferingend, "");
        this.IAuthTabCallback = playerbufferingend;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull List<Long> list, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallbackWithResult + 1;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 != 0) {
            int i6 = onExtraCallbackWithResult + 103;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        playerBufferingEnd playerbufferingend = this.IAuthTabCallback;
        onwarmupcompleted.L$0 = access15400.onNavigationEvent(list);
        onwarmupcompleted.label = 1;
        Object objOnExtraCallbackWithResult = playerbufferingend.onExtraCallbackWithResult(list, onwarmupcompleted);
        if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        int i7 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(long j, @NotNull access13800<? super Result<Boolean>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        List<Long> listListOf = CollectionsKt.listOf(access14000.onExtraCallback(j));
        iAuthTabCallback.J$0 = j;
        iAuthTabCallback.label = 1;
        Object objOnNavigationEvent = onNavigationEvent(listListOf, (access13800<? super Result<Boolean>>) iAuthTabCallback);
        if (objOnNavigationEvent != objOnWarmupCompleted) {
            return objOnNavigationEvent;
        }
        int i6 = IAuthTabCallbackStub + 81;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            r8lambdapObfaCQJCKmcTDZvVkLU6mrmi0 r8lambdapobfacqjckmctdzvvklu6mrmi0SystemBarStyleCompanionExternalSyntheticLambda0 = ((onNavigationEvent) Response.onExtraCallback(context, onNavigationEvent.class)).SystemBarStyleCompanionExternalSyntheticLambda0();
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdapobfacqjckmctdzvvklu6mrmi0SystemBarStyleCompanionExternalSyntheticLambda0;
        }
    }
}
