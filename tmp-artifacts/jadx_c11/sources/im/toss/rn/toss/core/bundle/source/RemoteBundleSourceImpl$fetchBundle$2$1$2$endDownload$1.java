package im.toss.rn.toss.core.bundle.source;

import im.toss.observability.instrumentation.rn.RnBundleInfo;
import im.toss.observability.instrumentation.rn.RnCause;
import im.toss.rn.toss.core.observability.RnBundleResponseParser;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access13800;
import o.access14000;
import o.access14300;
import okhttp3.Response;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ String $bundleURL;
    final /* synthetic */ Response $response;
    final /* synthetic */ RnBundleResponseParser.ServerTiming $serverTiming;
    final /* synthetic */ Long $transferredBytes;
    int label;
    final /* synthetic */ RemoteBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1(RemoteBundleSourceImpl remoteBundleSourceImpl, String str, Response response, Long l, RnBundleResponseParser.ServerTiming serverTiming, access13800<? super RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1> access13800Var) {
        super(1, access13800Var);
        this.this$0 = remoteBundleSourceImpl;
        this.$bundleURL = str;
        this.$response = response;
        this.$transferredBytes = l;
        this.$serverTiming = serverTiming;
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1 = new RemoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1(this.this$0, this.$bundleURL, this.$response, this.$transferredBytes, this.$serverTiming, access13800Var);
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return remoteBundleSourceImpl$fetchBundle$2$1$2$endDownload$1;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((access13800) obj);
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            RnPhaseObserver rnPhaseObserverIAuthTabCallbackDefault = RemoteBundleSourceImpl.IAuthTabCallbackDefault(this.this$0);
            String str = this.$bundleURL;
            String str2 = this.$response.headers().get("x-toss-deployment-id");
            Response responseNetworkResponse = this.$response.networkResponse();
            if (responseNetworkResponse == null) {
                responseNetworkResponse = this.$response;
            }
            RnBundleInfo rnBundleInfo = new RnBundleInfo((RnBundleInfo.Source) null, (String) null, (String) null, (String) null, str, str2, access14000.onNavigationEvent(responseNetworkResponse.code()), (Long) null, this.$transferredBytes, (RnCause) null, (RnBundleInfo.Role) null, this.$serverTiming.IAuthTabCallback(), this.$serverTiming.onExtraCallbackWithResult(), 1679, (DefaultConstructorMarker) null);
            this.label = 1;
            if (RnPhaseObserver.IAuthTabCallback(rnPhaseObserverIAuthTabCallbackDefault, rnBundleInfo, (String) null, false, (access13800) this, 6, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = onNavigationEvent + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
