package io.realm.kotlin;

import io.realm.Realm;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findRes;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RealmExtensionsKt$executeTransactionAwait$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ Realm $this_executeTransactionAwait;
    final /* synthetic */ Function1<Realm, Unit> $transaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealmExtensionsKt$executeTransactionAwait$2(Realm realm, Function1<? super Realm, Unit> function1, access13800<? super RealmExtensionsKt$executeTransactionAwait$2> access13800Var) {
        super(2, access13800Var);
        this.$this_executeTransactionAwait = realm;
        this.$transaction = function1;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        RealmExtensionsKt$executeTransactionAwait$2 realmExtensionsKt$executeTransactionAwait$2 = new RealmExtensionsKt$executeTransactionAwait$2(this.$this_executeTransactionAwait, this.$transaction, access13800Var);
        realmExtensionsKt$executeTransactionAwait$2.L$0 = obj;
        return realmExtensionsKt$executeTransactionAwait$2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        if (this.label == 0) {
            ResultKt.onNavigationEvent(obj);
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Realm realmOnNavigationEvent = Realm.onNavigationEvent(this.$this_executeTransactionAwait.access100());
            final Function1<Realm, Unit> function1 = this.$transaction;
            try {
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    realmOnNavigationEvent.IAuthTabCallback(new Realm.Transaction() { // from class: io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2$$ExternalSyntheticLambda0
                        public final void execute(Realm realm) {
                            RealmExtensionsKt$executeTransactionAwait$2.onExtraCallbackWithResult(function1, realm);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(realmOnNavigationEvent, (Throwable) null);
                return unit;
            } finally {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Function1 function1, Realm realm) {
        function1.invoke(realm);
    }
}
