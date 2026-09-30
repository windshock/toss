package io.realm.kotlin;

import io.realm.Realm;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import o.access13800;
import o.access14300;
import o.maybeUpdateAnimatable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RealmExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull Realm realm, @NotNull CoroutineContext coroutineContext, @NotNull Function1<? super Realm, Unit> function1, @NotNull access13800<? super Unit> access13800Var) {
        RealmExtensionsKt$executeTransactionAwait$1 realmExtensionsKt$executeTransactionAwait$1;
        if (access13800Var instanceof RealmExtensionsKt$executeTransactionAwait$1) {
            realmExtensionsKt$executeTransactionAwait$1 = (RealmExtensionsKt$executeTransactionAwait$1) access13800Var;
            int i = realmExtensionsKt$executeTransactionAwait$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                realmExtensionsKt$executeTransactionAwait$1.label = i + PKIFailureInfo.systemUnavail;
            } else {
                realmExtensionsKt$executeTransactionAwait$1 = new RealmExtensionsKt$executeTransactionAwait$1(access13800Var);
            }
        }
        Object obj = realmExtensionsKt$executeTransactionAwait$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = realmExtensionsKt$executeTransactionAwait$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            RealmExtensionsKt$executeTransactionAwait$2 realmExtensionsKt$executeTransactionAwait$2 = new RealmExtensionsKt$executeTransactionAwait$2(realm, function1, null);
            realmExtensionsKt$executeTransactionAwait$1.L$0 = realm;
            realmExtensionsKt$executeTransactionAwait$1.label = 1;
            if (maybeUpdateAnimatable.onExtraCallback(coroutineContext, realmExtensionsKt$executeTransactionAwait$2, realmExtensionsKt$executeTransactionAwait$1) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            realm = (Realm) realmExtensionsKt$executeTransactionAwait$1.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        realm.writeTypedObject();
        return Unit.INSTANCE;
    }
}
