package o;

import androidx.annotation.Nullable;
import com.google.common.primitives.ImmutableIntArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda13 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda1 {
    public final int IAuthTabCallback;
    public final ImmutableIntArray onExtraCallback;

    public ProgressIndicatorKtExternalSyntheticLambda13(int i2, @Nullable int[] iArr) {
        ImmutableIntArray immutableIntArrayOf;
        this.IAuthTabCallback = i2;
        if (iArr != null) {
            immutableIntArrayOf = ImmutableIntArray.copyOf(iArr);
        } else {
            immutableIntArrayOf = ImmutableIntArray.of();
        }
        this.onExtraCallback = immutableIntArrayOf;
    }
}
