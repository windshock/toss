package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextContextMenuModifierKtExternalSyntheticLambda0 {
    public final float IAuthTabCallback;
    public final int onNavigationEvent;

    public TextContextMenuModifierKtExternalSyntheticLambda0(int i2, float f) {
        this.onNavigationEvent = i2;
        this.IAuthTabCallback = f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextContextMenuModifierKtExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        TextContextMenuModifierKtExternalSyntheticLambda0 textContextMenuModifierKtExternalSyntheticLambda0 = (TextContextMenuModifierKtExternalSyntheticLambda0) obj;
        return this.onNavigationEvent == textContextMenuModifierKtExternalSyntheticLambda0.onNavigationEvent && Float.compare(textContextMenuModifierKtExternalSyntheticLambda0.IAuthTabCallback, this.IAuthTabCallback) == 0;
    }

    public int hashCode() {
        return ((this.onNavigationEvent + 527) * 31) + Float.floatToIntBits(this.IAuthTabCallback);
    }
}
