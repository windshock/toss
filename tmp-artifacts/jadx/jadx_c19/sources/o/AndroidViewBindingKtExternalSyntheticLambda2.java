package o;

import androidx.annotation.NonNull;
import o.SaversKtExternalSyntheticLambda35;
import o.ShaderBrushSpanExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda2<Model> implements ShaderBrushSpanExternalSyntheticLambda0<Model, Model> {
    private static final AndroidViewBindingKtExternalSyntheticLambda2<?> onWarmupCompleted = new AndroidViewBindingKtExternalSyntheticLambda2<>();

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public boolean onNavigationEvent(@NonNull Model model) {
        return true;
    }

    public static <T> AndroidViewBindingKtExternalSyntheticLambda2<T> onNavigationEvent() {
        return (AndroidViewBindingKtExternalSyntheticLambda2<T>) onWarmupCompleted;
    }

    @Deprecated
    public AndroidViewBindingKtExternalSyntheticLambda2() {
    }

    @Override // o.ShaderBrushSpanExternalSyntheticLambda0
    public ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<Model> onNavigationEvent(@NonNull Model model, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ShaderBrushSpanExternalSyntheticLambda0.onExtraCallbackWithResult<>(new setDpMargin(model), new onWarmupCompleted(model));
    }

    static class onWarmupCompleted<Model> implements SaversKtExternalSyntheticLambda35<Model> {
        private final Model onWarmupCompleted;

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback() {
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallbackWithResult() {
        }

        onWarmupCompleted(Model model) {
            this.onWarmupCompleted = model;
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Model> onnavigationevent) {
            onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super Model>) this.onWarmupCompleted);
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public Class<Model> onNavigationEvent() {
            return (Class<Model>) this.onWarmupCompleted.getClass();
        }

        @Override // o.SaversKtExternalSyntheticLambda35
        public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
            return SaversKtExternalSyntheticLambda21.LOCAL;
        }
    }

    public static class onExtraCallbackWithResult<Model> implements ResolvedTextDirection<Model, Model> {
        private static final onExtraCallbackWithResult<?> onWarmupCompleted = new onExtraCallbackWithResult<>();

        public static <T> onExtraCallbackWithResult<T> onWarmupCompleted() {
            return (onExtraCallbackWithResult<T>) onWarmupCompleted;
        }

        @Deprecated
        public onExtraCallbackWithResult() {
        }

        @Override // o.ResolvedTextDirection
        public ShaderBrushSpanExternalSyntheticLambda0<Model, Model> IAuthTabCallback(AndroidViewBindingKtExternalSyntheticLambda3 androidViewBindingKtExternalSyntheticLambda3) {
            return AndroidViewBindingKtExternalSyntheticLambda2.onNavigationEvent();
        }
    }
}
