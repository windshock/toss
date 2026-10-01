package o;

import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.TombstoneProtosMemoryDumpMetadataCase;
import o.access23100$asBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23100$asBinder extends SuspendLambda implements Function2<ok<? super access23300<DynamicRealmObject>>, access13800<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ access23100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    access23100$asBinder(DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration, access23100 access23100Var, access13800<? super access23100$asBinder> access13800Var) {
        super(2, access13800Var);
        this.$dynamicRealmObject = dynamicRealmObject;
        this.$config = realmConfiguration;
        this.this$0 = access23100Var;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull ok<? super access23300<DynamicRealmObject>> okVar, @Nullable access13800<? super Unit> access13800Var) {
        return create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        access23100$asBinder access23100_asbinder = new access23100$asBinder(this.$dynamicRealmObject, this.$config, this.this$0, access13800Var);
        access23100_asbinder.L$0 = obj;
        return access23100_asbinder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (o.jw.onWarmupCompleted(r8, r1, r7) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (o.jw.onWarmupCompleted(r8, r4, r7) == r0) goto L24;
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
        if (!RealmObject.onTransact(this.$dynamicRealmObject)) {
            AnonymousClass5 anonymousClass5 = new Function0<Unit>() { // from class: o.access23100$asBinder.5
                public /* synthetic */ Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
        } else {
            final Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$config);
            final access23100 access23100Var = this.this$0;
            final RealmObjectChangeListener realmObjectChangeListener = new RealmObjectChangeListener() { // from class: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$$ExternalSyntheticLambda0
                public final void onChange(RealmModel realmModel, TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
                    access23100$asBinder.onExtraCallbackWithResult(okVar, access23100Var, (DynamicRealmObject) realmModel, tombstoneProtosMemoryDumpMetadataCase);
                }
            };
            RealmObject.onNavigationEvent(this.$dynamicRealmObject, realmObjectChangeListener);
            if (RealmObject.onExtraCallbackWithResult(this.$dynamicRealmObject)) {
                if (access23100.onNavigationEvent(this.this$0)) {
                    okVar.IAuthTabCallback(new access23300(RealmObject.onNavigationEvent(this.$dynamicRealmObject), null));
                } else {
                    okVar.IAuthTabCallback(new access23300(this.$dynamicRealmObject, null));
                }
            }
            final DynamicRealmObject dynamicRealmObject = this.$dynamicRealmObject;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.access23100$asBinder.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    RealmObject.onExtraCallback(dynamicRealmObject, realmObjectChangeListener);
                    realmOnNavigationEvent.close();
                }
            };
            this.label = 2;
        }
        return objOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(ok okVar, access23100 access23100Var, DynamicRealmObject dynamicRealmObject, TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
        if (findRes.onWarmupCompleted(okVar)) {
            if (access23100.onNavigationEvent(access23100Var)) {
                okVar.IAuthTabCallback(new access23300(RealmObject.onNavigationEvent(dynamicRealmObject), tombstoneProtosMemoryDumpMetadataCase));
            } else {
                okVar.IAuthTabCallback(new access23300(dynamicRealmObject, tombstoneProtosMemoryDumpMetadataCase));
            }
        }
    }
}
