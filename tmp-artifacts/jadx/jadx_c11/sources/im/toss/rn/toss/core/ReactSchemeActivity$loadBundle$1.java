package im.toss.rn.toss.core;

import com.google.android.gms.internal.ads.zzaq;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.rn.toss.core.ReactSchemeActivity;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2;
import java.util.Date;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.MaxAdViewImplb;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.hExternalSyntheticLambda15;
import o.putChannelInfo;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactSchemeActivity$loadBundle$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ boolean $isRetry;
    final /* synthetic */ String $region;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ReactSchemeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactSchemeActivity$loadBundle$1(ReactSchemeActivity reactSchemeActivity, String str, boolean z, access13800<? super ReactSchemeActivity$loadBundle$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = reactSchemeActivity;
        this.$region = str;
        this.$isRetry = z;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReactSchemeActivity$loadBundle$1 reactSchemeActivity$loadBundle$1Create = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            return reactSchemeActivity$loadBundle$1Create.invokeSuspend(Unit.INSTANCE);
        }
        reactSchemeActivity$loadBundle$1Create.invokeSuspend(Unit.INSTANCE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactSchemeActivity$loadBundle$1 reactSchemeActivity$loadBundle$1 = new ReactSchemeActivity$loadBundle$1(this.this$0, this.$region, this.$isRetry, access13800Var);
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return reactSchemeActivity$loadBundle$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        throw null;
    }

    /* renamed from: im.toss.rn.toss.core.ReactSchemeActivity$loadBundle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $isRetry;
        int label;
        final /* synthetic */ ReactSchemeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReactSchemeActivity reactSchemeActivity, boolean z, access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
            this.this$0 = reactSchemeActivity;
            this.$isRetry = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isRetry, access13800Var);
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[PHI: r1
          0x0079: PHI (r1v9 im.toss.rn.spec.base.ReactNativeContentOwner) = (r1v8 im.toss.rn.spec.base.ReactNativeContentOwner), (r1v10 im.toss.rn.spec.base.ReactNativeContentOwner) binds: [B:12:0x0077, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ReactNativeContentOwner reactNativeContentOwner;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            hExternalSyntheticLambda15 hexternalsyntheticlambda15Access000 = ReactSchemeActivity.access000(this.this$0);
            if (hexternalsyntheticlambda15Access000 != null) {
                int i4 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    reactNativeContentOwner = this.this$0;
                    boolean z = this.$isRetry;
                    Object[] objArr = {reactNativeContentOwner, hexternalsyntheticlambda15Access000, Boolean.valueOf(z)};
                    ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1087241799, 1087241820, zzaq.onNavigationEvent(), objArr, zzaq.onNavigationEvent());
                    int i5 = 81 / 0;
                    if (z) {
                        int i6 = onWarmupCompleted + 61;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            boolean z2 = hexternalsyntheticlambda15Access000 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if ((hexternalsyntheticlambda15Access000 instanceof hExternalSyntheticLambda15.onExtraCallbackWithResult) || (hexternalsyntheticlambda15Access000 instanceof hExternalSyntheticLambda15.onNavigationEvent)) {
                            reactNativeContentOwner.overridePendingTransition(0, 0);
                            reactNativeContentOwner.getIntent().addFlags(65536);
                            reactNativeContentOwner.finish();
                            reactNativeContentOwner.overridePendingTransition(0, 0);
                            reactNativeContentOwner.startActivity(reactNativeContentOwner.getIntent());
                        }
                    }
                } else {
                    reactNativeContentOwner = this.this$0;
                    boolean z3 = this.$isRetry;
                    Object[] objArr2 = {reactNativeContentOwner, hexternalsyntheticlambda15Access000, Boolean.valueOf(z3)};
                    ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1087241799, 1087241820, zzaq.onNavigationEvent(), objArr2, zzaq.onNavigationEvent());
                    if (z3) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0258, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r1, r4, r23) != r2) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent;
        ReactSchemeActivity reactSchemeActivity;
        hExternalSyntheticLambda15 hexternalsyntheticlambda15;
        Object objOnNavigationEvent;
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        ReactSchemeActivity reactSchemeActivity2;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            reactSchemeActivity2 = (ReactSchemeActivity) this.L$1;
            r8lambdadtqrzfihm2ghoddvkfg5vm2yos = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) this.L$0;
            ResultKt.onNavigationEvent(obj);
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            objOnNavigationEvent = obj;
        } else {
            ResultKt.onNavigationEvent(obj);
            r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent = MaxAdViewImplb.Companion.onNavigationEvent(((ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent())).onTransact(), ((ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent())).onNavigationEvent());
            if (r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent == null) {
                int i6 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            if (ReactSchemeActivity.writeTypedObject(this.this$0) == null) {
                int i9 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    this.this$0.onSessionEnded();
                    ReactSchemeActivity.getInterfaceDescriptor(this.this$0);
                    throw null;
                }
                ReactSchemeActivity reactSchemeActivity3 = this.this$0;
                ReactBundleLoaderV2.Factory factoryOnSessionEnded = reactSchemeActivity3.onSessionEnded();
                r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4 interfaceDescriptor = ReactSchemeActivity.getInterfaceDescriptor(this.this$0);
                if (interfaceDescriptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    interfaceDescriptor = null;
                }
                ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1826116504, -1826116480, zzaq.onNavigationEvent(), new Object[]{reactSchemeActivity3, factoryOnSessionEnded.onExtraCallback(interfaceDescriptor, ((ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent())).onNavigationEvent(), this.$region)}, zzaq.onNavigationEvent());
            }
            reactSchemeActivity = this.this$0;
            ReactBundleLoaderV2 reactBundleLoaderV2WriteTypedObject = ReactSchemeActivity.writeTypedObject(reactSchemeActivity);
            if (reactBundleLoaderV2WriteTypedObject != null) {
                ReactSchemeActivity reactSchemeActivity4 = this.this$0;
                String str = (String) ReactSchemeActivity.IntentParams.IAuthTabCallback(-1609524478, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{(ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{reactSchemeActivity4}, zzaq.onNavigationEvent())}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1609524478);
                Date dateOnExtraCallback = ((ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent())).onExtraCallback();
                Intrinsics.checkNotNull(dateOnExtraCallback);
                ReactBundleLoaderV2.LoadParams loadParams = new ReactBundleLoaderV2.LoadParams(reactSchemeActivity4, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent, str, dateOnExtraCallback, ReactSchemeActivity.IAuthTabCallbackStubProxy(this.this$0), ((ReactSchemeActivity.IntentParams) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -596671277, 596671297, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent())).IAuthTabCallback(), this.$isRetry);
                Function1 function1 = (Function1) ReactSchemeActivity.IAuthTabCallback(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 2016493034, -2016493008, zzaq.onNavigationEvent(), new Object[]{this.this$0}, zzaq.onNavigationEvent());
                Function1 function1ICustomTabsCallback = ReactSchemeActivity.ICustomTabsCallback(this.this$0);
                this.L$0 = access15400.onNavigationEvent(r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent);
                this.L$1 = reactSchemeActivity;
                this.label = 1;
                objOnNavigationEvent = ReactBundleLoaderV2.onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{reactBundleLoaderV2WriteTypedObject, loadParams, function1, function1ICustomTabsCallback, this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -554203850, 554203852);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                    r8lambdadtqrzfihm2ghoddvkfg5vm2yos = r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent;
                    reactSchemeActivity2 = reactSchemeActivity;
                }
                return objOnWarmupCompleted;
            }
            hexternalsyntheticlambda15 = null;
            ReactSchemeActivity.onExtraCallbackWithResult(reactSchemeActivity, hexternalsyntheticlambda15);
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isRetry, null);
            this.L$0 = access15400.onNavigationEvent(r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent);
            this.L$1 = null;
            this.label = 2;
        }
        hexternalsyntheticlambda15 = (hExternalSyntheticLambda15) objOnNavigationEvent;
        reactSchemeActivity = reactSchemeActivity2;
        r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
        ReactSchemeActivity.onExtraCallbackWithResult(reactSchemeActivity, hexternalsyntheticlambda15);
        setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback().onExtraCallback();
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$isRetry, null);
        this.L$0 = access15400.onNavigationEvent(r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnNavigationEvent);
        this.L$1 = null;
        this.label = 2;
    }
}
