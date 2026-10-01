package o;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt21 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<setLottieClicklistener<T>> IAuthTabCallback(getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes) {
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        onWarmupCompleted(listCreateListBuilder, getplaydelayedelexpresstimes);
        return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
    }

    private static final <T> void onWarmupCompleted(List<setLottieClicklistener<T>> list, getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes) {
        if (getplaydelayedelexpresstimes instanceof jw5) {
            list.add(((jw5) getplaydelayedelexpresstimes).onNavigationEvent());
            return;
        }
        if (!(getplaydelayedelexpresstimes instanceof jw6)) {
            if (getplaydelayedelexpresstimes instanceof jw8) {
                return;
            }
            if (getplaydelayedelexpresstimes instanceof lt7) {
                onWarmupCompleted(list, ((lt7) getplaydelayedelexpresstimes).IAuthTabCallback());
                return;
            }
            if (getplaydelayedelexpresstimes instanceof jw13) {
                jw13 jw13Var = (jw13) getplaydelayedelexpresstimes;
                onWarmupCompleted(list, jw13Var.onNavigationEvent());
                Iterator<T> it = jw13Var.onWarmupCompleted().iterator();
                while (it.hasNext()) {
                    onWarmupCompleted(list, (getPlayDelayedELExpressTimeS) it.next());
                }
                return;
            }
            if (!(getplaydelayedelexpresstimes instanceof lt11)) {
                throw new NoWhenBranchMatchedException();
            }
            onWarmupCompleted(list, ((lt11) getplaydelayedelexpresstimes).IAuthTabCallback());
            return;
        }
        Iterator<T> it2 = ((jw6) getplaydelayedelexpresstimes).onWarmupCompleted().iterator();
        while (it2.hasNext()) {
            onWarmupCompleted(list, (lt1) it2.next());
        }
    }
}
