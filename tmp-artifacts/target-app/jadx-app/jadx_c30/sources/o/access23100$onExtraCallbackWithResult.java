package o;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access11100;
import o.access23100$onExtraCallbackWithResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$onExtraCallbackWithResult<T> extends SuspendLambda implements Function2<ok<? super access23200<RealmResults<T>>>, access13800<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmResults<T> $results;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    access23100$onExtraCallbackWithResult(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, access23100 access23100Var, access13800<? super access23100$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.$results = realmResults;
        this.$config = realmConfiguration;
        this.this$0 = access23100Var;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$onExtraCallbackWithResult access23100_onextracallbackwithresult = new access23100$onExtraCallbackWithResult(this.$results, this.$config, this.this$0, access13800Var);
        access23100_onextracallbackwithresult.L$0 = obj;
        return access23100_onextracallbackwithresult;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super access23200<RealmResults<T>>> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (o.jw.onWarmupCompleted(r8, r1, r7) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (o.jw.onWarmupCompleted(r8, r4, r7) == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        final ok okVar = (ok) this.L$0;
        if (!this.$results.onExtraCallback()) {
            AnonymousClass2 anonymousClass2 = new Function0<Unit>() { // from class: o.access23100$onExtraCallbackWithResult.2
                public /* synthetic */ Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
        } else {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$config);
            final access23100 access23100Var = this.this$0;
            final access11000 access11000Var = new access11000() { // from class: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$1$$ExternalSyntheticLambda0
                public final void onChange(Object obj2, access11100 access11100Var) {
                    access23100$onExtraCallbackWithResult.IAuthTabCallback(okVar, access23100Var, (RealmResults) obj2, access11100Var);
                }
            };
            this.$results.onNavigationEvent(access11000Var);
            if (access23100.onNavigationEvent(this.this$0)) {
                okVar.IAuthTabCallback(new access23200(this.$results.IAuthTabCallbackStub(), null));
            } else {
                okVar.IAuthTabCallback(new access23200(this.$results, null));
            }
            final RealmResults<T> realmResults = this.$results;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$onExtraCallbackWithResult.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    onExtraCallbackWithResult();
                    return Unit.INSTANCE;
                }

                public final void onExtraCallbackWithResult() {
                    if (realmOnNavigationEvent.extraCallbackWithResult()) {
                        return;
                    }
                    realmResults.IAuthTabCallback(access11000Var);
                    realmOnNavigationEvent.close();
                }
            };
            this.label = 2;
        }
        return objOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ok okVar, access23100 access23100Var, RealmResults realmResults, access11100 access11100Var) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (access23100.onNavigationEvent(access23100Var)) {
                okVar.IAuthTabCallback(new access23200(realmResults.IAuthTabCallbackStub(), access11100Var));
            } else {
                okVar.IAuthTabCallback(new access23200(realmResults, access11100Var));
            }
        }
    }
}
