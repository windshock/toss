package o;

import io.realm.RealmChangeListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access21400;
import o.access23100$IAuthTabCallbackDefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$IAuthTabCallbackDefault extends SuspendLambda implements Function2<ok<? super access21400>, access13800<? super Unit>, Object> {
    final /* synthetic */ access21400 $dynamicRealm;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    access23100$IAuthTabCallbackDefault(access21400 access21400Var, access23100 access23100Var, access13800<? super access23100$IAuthTabCallbackDefault> access13800Var) {
        super(2, access13800Var);
        this.$dynamicRealm = access21400Var;
        this.this$0 = access23100Var;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$IAuthTabCallbackDefault access23100_iauthtabcallbackdefault = new access23100$IAuthTabCallbackDefault(this.$dynamicRealm, this.this$0, access13800Var);
        access23100_iauthtabcallbackdefault.L$0 = obj;
        return access23100_iauthtabcallbackdefault;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super access21400> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            final ok okVar = (ok) this.L$0;
            final access21400 access21400VarIAuthTabCallback = access21400.IAuthTabCallback(this.$dynamicRealm.access100());
            final access23100 access23100Var = this.this$0;
            final access21400 access21400Var = this.$dynamicRealm;
            final RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$2$$ExternalSyntheticLambda0
                public final void onChange(Object obj2) {
                    access23100$IAuthTabCallbackDefault.onWarmupCompleted(okVar, access23100Var, access21400Var, (access21400) obj2);
                }
            };
            access21400VarIAuthTabCallback.onNavigationEvent(realmChangeListener);
            if (access23100.onNavigationEvent(this.this$0)) {
                access21400 access21400VarOnActivityResized = access21400VarIAuthTabCallback.onActivityResized();
                Intrinsics.checkNotNullExpressionValue(access21400VarOnActivityResized, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(access21400VarOnActivityResized);
            } else {
                Intrinsics.checkNotNullExpressionValue(access21400VarIAuthTabCallback, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(access21400VarIAuthTabCallback);
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$IAuthTabCallbackDefault.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    IAuthTabCallback();
                    return Unit.INSTANCE;
                }

                public final void IAuthTabCallback() {
                    access21400VarIAuthTabCallback.onExtraCallbackWithResult(realmChangeListener);
                    access21400VarIAuthTabCallback.close();
                }
            };
            this.label = 1;
            if (jw.onWarmupCompleted(okVar, function0, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(ok okVar, access23100 access23100Var, access21400 access21400Var, access21400 access21400Var2) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (access23100.onNavigationEvent(access23100Var)) {
                access21400 access21400VarOnActivityResized = access21400Var.onActivityResized();
                Intrinsics.checkNotNullExpressionValue(access21400VarOnActivityResized, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(access21400VarOnActivityResized);
                return;
            }
            okVar.IAuthTabCallback(access21400Var2);
        }
    }
}
