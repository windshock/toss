package o;

import im.toss.state.spec.SessionState;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getThresholdValueFromConfig {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final enableVoiceRecordPluginRegisterInSession onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            getThresholdValueFromConfig getthresholdvaluefromconfig = getThresholdValueFromConfig.this;
            if (i3 == 0) {
                getthresholdvaluefromconfig.IAuthTabCallback(null, null, null, this);
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objIAuthTabCallback = getthresholdvaluefromconfig.IAuthTabCallback(null, null, null, this);
            if (objIAuthTabCallback == access14300.onWarmupCompleted()) {
                return objIAuthTabCallback;
            }
            kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(objIAuthTabCallback);
            int i4 = onExtraCallbackWithResult + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return resultIAuthTabCallback;
        }
    }

    @Inject
    public getThresholdValueFromConfig(@NotNull enableVoiceRecordPluginRegisterInSession enablevoicerecordpluginregisterinsession) {
        Intrinsics.checkNotNullParameter(enablevoicerecordpluginregisterinsession, "");
        this.onWarmupCompleted = enablevoicerecordpluginregisterinsession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
    
        if (r1 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull UTF8Decoder uTF8Decoder, @Nullable TypeUtils1 typeUtils1, @NotNull access13800<? super kotlin.Result<Unit>> access13800Var) {
        onNavigationEvent onnavigationevent;
        TypeUtils1 typeUtils12;
        boolean z;
        UTF8Decoder uTF8Decoder2;
        Object obj;
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12;
        Object objOnNavigationEvent;
        int i = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i2 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj2 = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onnavigationevent.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj2);
            boolean zOnTransact = SessionState.Companion.onExtraCallback().onTransact();
            enableVoiceRecordPluginRegisterInSession enablevoicerecordpluginregisterinsession = this.onWarmupCompleted;
            onnavigationevent.L$0 = rememberLottieCompositionKtlottieComposition1;
            onnavigationevent.L$1 = uTF8Decoder;
            onnavigationevent.L$2 = typeUtils1;
            onnavigationevent.Z$0 = zOnTransact;
            onnavigationevent.label = 1;
            Object objOnExtraCallback = enablevoicerecordpluginregisterinsession.onExtraCallback(onnavigationevent);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                typeUtils12 = typeUtils1;
                z = zOnTransact;
                uTF8Decoder2 = uTF8Decoder;
                obj = objOnExtraCallback;
                rememberLottieCompositionKtlottieComposition12 = rememberLottieCompositionKtlottieComposition1;
            }
            return objOnWarmupCompleted;
        }
        int i4 = onExtraCallback + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj2);
            objOnNavigationEvent = ((kotlin.Result) obj2).onNavigationEvent();
            if (!kotlin.Result.onNavigationEvent(objOnNavigationEvent)) {
                return kotlin.Result.constructor-impl(objOnNavigationEvent);
            }
            int i6 = onExtraCallback + 109;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            Result.Companion companion = kotlin.Result.Companion;
            Unit unit = Unit.INSTANCE;
            if (i7 != 0) {
                return kotlin.Result.constructor-impl(unit);
            }
            kotlin.Result.constructor-impl(unit);
            throw null;
        }
        boolean z2 = onnavigationevent.Z$0;
        TypeUtils1 typeUtils13 = (TypeUtils1) onnavigationevent.L$2;
        UTF8Decoder uTF8Decoder3 = (UTF8Decoder) onnavigationevent.L$1;
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition13 = (RememberLottieCompositionKtlottieComposition1) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(obj2);
        typeUtils12 = typeUtils13;
        obj = obj2;
        rememberLottieCompositionKtlottieComposition12 = rememberLottieCompositionKtlottieComposition13;
        z = z2;
        uTF8Decoder2 = uTF8Decoder3;
        if (!((Boolean) obj).booleanValue() && z) {
            Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(Unit.INSTANCE);
        }
        getByteBuffer getbytebufferIAuthTabCallback = shortValue.IAuthTabCallback(shortValue.Companion, rememberLottieCompositionKtlottieComposition12, uTF8Decoder2, 28L, false, false, true, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, typeUtils12, false, (String) null, (Function1) null, 30680, (Object) null);
        onnavigationevent.L$0 = access15400.onNavigationEvent(rememberLottieCompositionKtlottieComposition12);
        onnavigationevent.L$1 = access15400.onNavigationEvent(uTF8Decoder2);
        onnavigationevent.L$2 = access15400.onNavigationEvent(typeUtils12);
        onnavigationevent.Z$0 = z;
        onnavigationevent.label = 2;
        objOnNavigationEvent = RealImageLoaderKtExternalSyntheticLambda1.onNavigationEvent(getbytebufferIAuthTabCallback, onnavigationevent);
    }
}
