package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeWindowLayoutComponentProviderExternalSyntheticLambda6 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallback;

    public SafeWindowLayoutComponentProviderExternalSyntheticLambda6(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onNavigationEvent(SafeWindowLayoutComponentProviderExternalSyntheticLambda6 safeWindowLayoutComponentProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43 = safeWindowLayoutComponentProviderExternalSyntheticLambda6.onExtraCallback;
        if (i3 != 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super JsonObject>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $countryCode;
        final /* synthetic */ WindowInfoTrackerCompanionExternalSyntheticLambda0 $miniAppInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$miniAppInfo = windowInfoTrackerCompanionExternalSyntheticLambda0;
            this.$countryCode = str;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super JsonObject> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 41 / 0;
            }
            int i5 = IAuthTabCallback + 57;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = SafeWindowLayoutComponentProviderExternalSyntheticLambda6.this.new onExtraCallbackWithResult(this.$miniAppInfo, this.$countryCode, access13800Var);
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super JsonObject> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43OnNavigationEvent = SafeWindowLayoutComponentProviderExternalSyntheticLambda6.onNavigationEvent(SafeWindowLayoutComponentProviderExternalSyntheticLambda6.this);
                WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = this.$miniAppInfo;
                String str = this.$countryCode;
                this.label = 1;
                Object objOnExtraCallbackWithResult = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43OnNavigationEvent.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                int i5 = IAuthTabCallback + 35;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return objOnExtraCallbackWithResult;
                }
                obj2.hashCode();
                throw null;
            }
            int i6 = onWarmupCompleted;
            int i7 = i6 + 91;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0 ? i4 != 1 : i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i6 + 77;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            obj2.hashCode();
            throw null;
        }
    }

    public final Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, null), access13800Var);
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }
}
