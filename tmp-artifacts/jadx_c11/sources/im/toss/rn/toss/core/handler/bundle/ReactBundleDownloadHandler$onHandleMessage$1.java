package im.toss.rn.toss.core.handler.bundle;

import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleDownloadHandler$onHandleMessage$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ String $company;
    final /* synthetic */ ReactBundleRepository $reactBundleRepository;
    final /* synthetic */ String $region;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleDownloadHandler$onHandleMessage$1(ReactBundleRepository reactBundleRepository, String str, String str2, String str3, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super ReactBundleDownloadHandler$onHandleMessage$1> access13800Var) {
        super(2, access13800Var);
        this.$reactBundleRepository = reactBundleRepository;
        this.$bundleName = str;
        this.$region = str2;
        this.$company = str3;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactBundleDownloadHandler$onHandleMessage$1 reactBundleDownloadHandler$onHandleMessage$1 = new ReactBundleDownloadHandler$onHandleMessage$1(this.$reactBundleRepository, this.$bundleName, this.$region, this.$company, this.$callbackProxy, access13800Var);
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return reactBundleDownloadHandler$onHandleMessage$1;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactBundleDownloadHandler$onHandleMessage$1 reactBundleDownloadHandler$onHandleMessage$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            reactBundleDownloadHandler$onHandleMessage$1Create.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = reactBundleDownloadHandler$onHandleMessage$1Create.invokeSuspend(unit);
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            ReactBundleRepository reactBundleRepository = this.$reactBundleRepository;
            String str = this.$bundleName;
            String str2 = this.$region;
            String str3 = this.$company;
            this.label = 1;
            if (ReactBundleRepository.onNavigationEvent(reactBundleRepository, str, false, null, null, str2, str3, this, 12, null) == objOnWarmupCompleted) {
                int i4 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(this.$callbackProxy, (Function1) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
