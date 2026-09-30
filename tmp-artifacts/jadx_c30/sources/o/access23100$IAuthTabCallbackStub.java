package o;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access23100$IAuthTabCallbackStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$IAuthTabCallbackStub extends SuspendLambda implements Function2<ok<? super Realm>, access13800<? super Unit>, Object> {
    final /* synthetic */ Realm $realm;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    access23100$IAuthTabCallbackStub(Realm realm, access23100 access23100Var, access13800<? super access23100$IAuthTabCallbackStub> access13800Var) {
        super(2, access13800Var);
        this.$realm = realm;
        this.this$0 = access23100Var;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super Realm> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$IAuthTabCallbackStub access23100_iauthtabcallbackstub = new access23100$IAuthTabCallbackStub(this.$realm, this.this$0, access13800Var);
        access23100_iauthtabcallbackstub.L$0 = obj;
        return access23100_iauthtabcallbackstub;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            final ok okVar = (ok) this.L$0;
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$realm.access100());
            final access23100 access23100Var = this.this$0;
            final Realm realm = this.$realm;
            final RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$1$$ExternalSyntheticLambda0
                public final void onChange(Object obj2) {
                    access23100$IAuthTabCallbackStub.onWarmupCompleted(okVar, access23100Var, realm, (Realm) obj2);
                }
            };
            realmOnNavigationEvent.onWarmupCompleted(realmChangeListener);
            if (access23100.onNavigationEvent(this.this$0)) {
                Realm realmOnMinimized = realmOnNavigationEvent.onMinimized();
                Intrinsics.checkNotNullExpressionValue(realmOnMinimized, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(realmOnMinimized);
            } else {
                Intrinsics.checkNotNullExpressionValue(realmOnNavigationEvent, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(realmOnNavigationEvent);
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$IAuthTabCallbackStub.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    IAuthTabCallback();
                    return Unit.INSTANCE;
                }

                public final void IAuthTabCallback() {
                    realmOnNavigationEvent.onExtraCallbackWithResult(realmChangeListener);
                    realmOnNavigationEvent.close();
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
    public static final void onWarmupCompleted(ok okVar, access23100 access23100Var, Realm realm, Realm realm2) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (access23100.onNavigationEvent(access23100Var)) {
                Realm realmOnMinimized = realm.onMinimized();
                Intrinsics.checkNotNullExpressionValue(realmOnMinimized, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(realmOnMinimized);
                return;
            }
            okVar.IAuthTabCallback(realm2);
        }
    }
}
