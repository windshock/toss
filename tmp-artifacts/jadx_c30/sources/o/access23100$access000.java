package o;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access23100$access000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$access000<T> extends SuspendLambda implements Function2<ok<? super T>, access13800<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ Realm $realm;

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ RealmModel $realmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lo/access23100;Lo/access13800<-Lo/access23100$access000;>;)V */
    access23100$access000(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, access23100 access23100Var, access13800 access13800Var) {
        super(2, access13800Var);
        this.$realm = realm;
        this.$config = realmConfiguration;
        this.$realmObject = realmModel;
        this.this$0 = access23100Var;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super T> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$access000 access23100_access000 = new access23100$access000(this.$realm, this.$config, this.$realmObject, this.this$0, access13800Var);
        access23100_access000.L$0 = obj;
        return access23100_access000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (o.jw.onWarmupCompleted(r7, r1, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (o.jw.onWarmupCompleted(r7, r4, r6) == r0) goto L24;
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
        if (this.$realm.extraCallbackWithResult()) {
            AnonymousClass3 anonymousClass3 = new Function0<Unit>() { // from class: o.access23100$access000.3
                public /* synthetic */ Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
        } else {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$config);
            final access23100 access23100Var = this.this$0;
            final RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$7$$ExternalSyntheticLambda0
                public final void onChange(Object obj2) {
                    access23100$access000.IAuthTabCallback(okVar, access23100Var, (RealmModel) obj2);
                }
            };
            RealmObject.IAuthTabCallback(this.$realmObject, realmChangeListener);
            if (RealmObject.onExtraCallbackWithResult(this.$realmObject)) {
                if (access23100.onNavigationEvent(this.this$0)) {
                    RealmModel realmModelOnNavigationEvent = RealmObject.onNavigationEvent(this.$realmObject);
                    Intrinsics.checkNotNullExpressionValue(realmModelOnNavigationEvent, BuildConfig.FLAVOR);
                    okVar.IAuthTabCallback(realmModelOnNavigationEvent);
                } else {
                    okVar.IAuthTabCallback(this.$realmObject);
                }
            }
            final RealmModel realmModel = this.$realmObject;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$access000.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;TT;Lio/realm/RealmChangeListener<TT;>;)V */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    IAuthTabCallback();
                    return Unit.INSTANCE;
                }

                public final void IAuthTabCallback() {
                    if (realmOnNavigationEvent.extraCallbackWithResult()) {
                        return;
                    }
                    RealmObject.onNavigationEvent(realmModel, realmChangeListener);
                    realmOnNavigationEvent.close();
                }
            };
            this.label = 2;
        }
        return objOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ok okVar, access23100 access23100Var, RealmModel realmModel) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (access23100.onNavigationEvent(access23100Var)) {
                RealmModel realmModelOnNavigationEvent = RealmObject.onNavigationEvent(realmModel);
                if (realmModelOnNavigationEvent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
                }
                okVar.IAuthTabCallback(realmModelOnNavigationEvent);
                return;
            }
            okVar.IAuthTabCallback(realmModel);
        }
    }
}
