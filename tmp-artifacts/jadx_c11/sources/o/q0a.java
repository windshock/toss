package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q0a implements r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI {
    private static int IAuthTabCallbackStub = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final q0a IAuthTabCallback = new q0a();
    private static final findResAndMsg onExtraCallback = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback().plus(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null)));
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("CoposableTracker");

    private q0a() {
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    static {
        Object obj = null;
        int i = onWarmupCompleted + 75;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI
    public findResAndMsg IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        findResAndMsg findresandmsg = onExtraCallback;
        int i5 = i2 + 85;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return findresandmsg;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$data = r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$data, access13800Var);
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            q0a.onExtraCallbackWithResult();
            r8lambdaI_riJwGSTfIBpj9mrqkT4n4SVDY.onNavigationEvent(this.$data);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    @Override // o.r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI
    public Object onNavigationEvent(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, null), access13800Var);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i2 = onTransact + 69;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return objOnExtraCallback;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return unit;
    }
}
