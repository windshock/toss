package o;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.access23100$access100;
import o.lt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$access100<T> extends SuspendLambda implements Function2<ok<? super RealmList<T>>, access13800<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmList<T> $realmList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    access23100$access100(RealmList<T> realmList, RealmConfiguration realmConfiguration, access23100 access23100Var, access13800<? super access23100$access100> access13800Var) {
        super(2, access13800Var);
        this.$realmList = realmList;
        this.$config = realmConfiguration;
        this.this$0 = access23100Var;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$access100 access23100_access100 = new access23100$access100(this.$realmList, this.$config, this.this$0, access13800Var);
        access23100_access100.L$0 = obj;
        return access23100_access100;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super RealmList<T>> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (o.jw.onWarmupCompleted(r7, r1, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (o.jw.onWarmupCompleted(r7, r4, r6) == r0) goto L22;
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
        if (!this.$realmList.onExtraCallback()) {
            AnonymousClass3 anonymousClass3 = new Function0<Unit>() { // from class: o.access23100$access100.3
                public /* synthetic */ Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
        } else {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$config);
            final access23100 access23100Var = this.this$0;
            final RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.InternalFlowFactory$from$5$$ExternalSyntheticLambda0
                public final void onChange(Object obj2) {
                    access23100$access100.onWarmupCompleted(okVar, access23100Var, (RealmList) obj2);
                }
            };
            this.$realmList.onWarmupCompleted(realmChangeListener);
            if (access23100.onNavigationEvent(this.this$0)) {
                RealmList realmListOnNavigationEvent = this.$realmList.onNavigationEvent();
                Intrinsics.checkNotNullExpressionValue(realmListOnNavigationEvent, BuildConfig.FLAVOR);
                okVar.IAuthTabCallback(realmListOnNavigationEvent);
            } else {
                okVar.IAuthTabCallback(this.$realmList);
            }
            final RealmList<T> realmList = this.$realmList;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$access100.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* synthetic */ Object invoke() {
                    onExtraCallback();
                    return Unit.INSTANCE;
                }

                public final void onExtraCallback() {
                    if (realmOnNavigationEvent.extraCallbackWithResult()) {
                        return;
                    }
                    realmList.onNavigationEvent(realmChangeListener);
                    realmOnNavigationEvent.close();
                }
            };
            this.label = 2;
        }
        return objOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(ok okVar, access23100 access23100Var, RealmList realmList) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (!realmList.onExtraCallback()) {
                lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, (Throwable) null, 1, (Object) null);
            } else {
                if (access23100.onNavigationEvent(access23100Var)) {
                    RealmList realmListOnNavigationEvent = realmList.onNavigationEvent();
                    Intrinsics.checkNotNullExpressionValue(realmListOnNavigationEvent, BuildConfig.FLAVOR);
                    okVar.IAuthTabCallback(realmListOnNavigationEvent);
                    return;
                }
                okVar.IAuthTabCallback(realmList);
            }
        }
    }
}
