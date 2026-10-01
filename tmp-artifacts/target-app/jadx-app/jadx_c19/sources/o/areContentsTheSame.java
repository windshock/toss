package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class areContentsTheSame extends UnPressableLinearLayout<ProfileInstallerInitializerExternalSyntheticLambda2> {
    private final TextView onNavigationEvent;

    public areContentsTheSame(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        this.onNavigationEvent = textView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ProfileInstallerInitializerExternalSyntheticLambda2 onNavigationEvent() {
        TextView textView = this.onNavigationEvent;
        CharSequence text = textView.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "");
        return new ProfileInstallerInitializerExternalSyntheticLambda2(textView, text, 0, 0, 0);
    }

    public void onNavigationEvent(@NotNull writeQuoted<? super ProfileInstallerInitializerExternalSyntheticLambda2> writequoted) {
        Intrinsics.checkParameterIsNotNull(writequoted, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.onNavigationEvent, writequoted);
        writequoted.IAuthTabCallback(onwarmupcompleted);
        this.onNavigationEvent.addTextChangedListener(onwarmupcompleted);
    }

    static final class onWarmupCompleted extends deserializeIpCollection implements TextWatcher {
        private final TextView IAuthTabCallback;
        private final writeQuoted<? super ProfileInstallerInitializerExternalSyntheticLambda2> onWarmupCompleted;

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence charSequence, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, "");
        }

        public onWarmupCompleted(@NotNull TextView textView, @NotNull writeQuoted<? super ProfileInstallerInitializerExternalSyntheticLambda2> writequoted) {
            Intrinsics.checkParameterIsNotNull(textView, "");
            Intrinsics.checkParameterIsNotNull(writequoted, "");
            this.IAuthTabCallback = textView;
            this.onWarmupCompleted = writequoted;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence charSequence, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, "");
            if (isDisposed()) {
                return;
            }
            this.onWarmupCompleted.onExtraCallback(new ProfileInstallerInitializerExternalSyntheticLambda2(this.IAuthTabCallback, charSequence, i2, i3, i4));
        }

        public void IAuthTabCallback() {
            this.IAuthTabCallback.removeTextChangedListener(this);
        }
    }
}
