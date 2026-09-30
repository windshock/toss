package o;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface certGetCertPolicy {
    <R> Object onNavigationEvent(@NotNull Function1<? super access13800<? super R>, ? extends Object> function1, @NotNull access13800<? super R> access13800Var);

    <R> R onWarmupCompleted(@NotNull Function1<? super access13800<? super R>, ? extends Object> function1);
}
