package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Typography extends BaseTextView {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typography(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback;
            int i4 = i3 + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 51;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onExtraCallback + 97;
            onWarmupCompleted = i9 % 128;
            i = i9 % 2 != 0 ? 1 : 0;
            int i10 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_typography_7;
        int i5 = onWarmupCompleted + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_typography_7;
        int i5 = onWarmupCompleted + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IAuthTabCallback(int i) throws Resources.NotFoundException {
        int i2;
        int i3 = 2 % 2;
        switch (i) {
            case 1:
                i2 = R.dimen.text_typography_1;
                break;
            case 2:
                i2 = R.dimen.text_typography_2;
                int i4 = onWarmupCompleted + 107;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 4;
                    break;
                }
                break;
            case 3:
                i2 = R.dimen.text_typography_3;
                break;
            case 4:
                i2 = R.dimen.text_typography_4;
                break;
            case 5:
                i2 = R.dimen.text_typography_5;
                int i6 = onExtraCallback + 33;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 3;
                    break;
                }
                break;
            case 6:
                i2 = R.dimen.text_typography_6;
                break;
            case 7:
                i2 = R.dimen.text_typography_7;
                break;
            default:
                i2 = R.dimen.text_typography_7;
                break;
        }
        try {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(i2, typedValue, true);
            setTextSize(typedValue.getComplexUnit(), TypedValue.complexToFloat(typedValue.data));
        } catch (Resources.NotFoundException unused) {
        }
    }
}
