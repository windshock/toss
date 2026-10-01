package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicSecureTextFieldKtExternalSyntheticLambda5 implements BasicTextFieldKtExternalSyntheticLambda0 {
    private final Map<BasicSecureTextFieldKtExternalSyntheticLambda6<?>, Object> onNavigationEvent = new LinkedHashMap();

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onWarmupCompleted<T> extends Lambda implements Function0<T> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(0);
        }

        public final T invoke() {
            return null;
        }
    }

    @Override // o.BasicTextFieldKtExternalSyntheticLambda0
    public <T> void onWarmupCompleted(@NotNull BasicSecureTextFieldKtExternalSyntheticLambda6<T> basicSecureTextFieldKtExternalSyntheticLambda6, T t) {
        this.onNavigationEvent.put(basicSecureTextFieldKtExternalSyntheticLambda6, t);
    }

    public final <T> T onNavigationEvent(@NotNull BasicSecureTextFieldKtExternalSyntheticLambda6<T> basicSecureTextFieldKtExternalSyntheticLambda6, @NotNull Function0<? extends T> function0) {
        T t = (T) this.onNavigationEvent.get(basicSecureTextFieldKtExternalSyntheticLambda6);
        return t == null ? (T) function0.invoke() : t;
    }

    public final <T> T onNavigationEvent(@NotNull BasicSecureTextFieldKtExternalSyntheticLambda6<T> basicSecureTextFieldKtExternalSyntheticLambda6) {
        return (T) onNavigationEvent(basicSecureTextFieldKtExternalSyntheticLambda6, onWarmupCompleted.onWarmupCompleted);
    }
}
