package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DiffUtilCallback extends UnPressableLinearLayout<ProfileInstallerExternalSyntheticLambda0> {
    private final TextView onWarmupCompleted;

    public DiffUtilCallback(@NotNull TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "");
        this.onWarmupCompleted = textView;
    }

    public void onNavigationEvent(@NotNull writeQuoted<? super ProfileInstallerExternalSyntheticLambda0> writequoted) {
        Intrinsics.checkParameterIsNotNull(writequoted, "");
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.onWarmupCompleted, writequoted);
        writequoted.IAuthTabCallback(onextracallbackwithresult);
        this.onWarmupCompleted.addTextChangedListener(onextracallbackwithresult);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ProfileInstallerExternalSyntheticLambda0 onNavigationEvent() {
        TextView textView = this.onWarmupCompleted;
        return new ProfileInstallerExternalSyntheticLambda0(textView, textView.getEditableText());
    }

    static final class onExtraCallbackWithResult extends deserializeIpCollection implements TextWatcher {
        private final TextView onExtraCallback;
        private final writeQuoted<? super ProfileInstallerExternalSyntheticLambda0> onExtraCallbackWithResult;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence charSequence, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, "");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence charSequence, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, "");
        }

        public onExtraCallbackWithResult(@NotNull TextView textView, @NotNull writeQuoted<? super ProfileInstallerExternalSyntheticLambda0> writequoted) {
            Intrinsics.checkParameterIsNotNull(textView, "");
            Intrinsics.checkParameterIsNotNull(writequoted, "");
            this.onExtraCallback = textView;
            this.onExtraCallbackWithResult = writequoted;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "");
            this.onExtraCallbackWithResult.onExtraCallback(new ProfileInstallerExternalSyntheticLambda0(this.onExtraCallback, editable));
        }

        public void IAuthTabCallback() {
            this.onExtraCallback.removeTextChangedListener(this);
        }
    }
}
