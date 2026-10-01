package o;

import com.google.common.collect.ImmutableList;
import java.util.Objects;
import o.RadioButtonDefaults;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RippleKtExternalSyntheticLambda0 {

    public interface onExtraCallback {
        public static final onExtraCallback onExtraCallback = new onExtraCallback() { // from class: o.RippleKtExternalSyntheticLambda0.onExtraCallback.4
            @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
            public boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
                return false;
            }

            @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
            public int onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
                return 1;
            }

            @Override // o.RippleKtExternalSyntheticLambda0.onExtraCallback
            public RippleKtExternalSyntheticLambda0 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        RippleKtExternalSyntheticLambda0 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

        boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);

        int onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    void IAuthTabCallback(byte[] bArr, int i2, int i3, onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10);

    int onExtraCallback();

    default void onNavigationEvent() {
    }

    public static class onNavigationEvent {
        private static final onNavigationEvent onExtraCallback = new onNavigationEvent(-9223372036854775807L, false);
        public final long IAuthTabCallback;
        public final boolean onNavigationEvent;

        private onNavigationEvent(long j, boolean z) {
            this.IAuthTabCallback = j;
            this.onNavigationEvent = z;
        }

        public static onNavigationEvent onWarmupCompleted() {
            return onExtraCallback;
        }

        public static onNavigationEvent onExtraCallback(long j) {
            return new onNavigationEvent(j, true);
        }
    }

    default RadioButtonKt onNavigationEvent(byte[] bArr, int i2, int i3) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        onNavigationEvent onnavigationevent = onNavigationEvent.onExtraCallback;
        Objects.requireNonNull(builder);
        IAuthTabCallback(bArr, i2, i3, onnavigationevent, new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.extractor.text.SubtitleParser$$ExternalSyntheticLambda0
            public final void accept(Object obj) {
                builder.add((RadioButtonDefaults) obj);
            }
        });
        return new ProgressIndicatorKtExternalSyntheticLambda9(builder.build());
    }
}
