package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_code;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class Typography3 extends BaseTextView {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typography3(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 13;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 59;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i7 = onNavigationEvent + 113;
            onExtraCallback = i7 % 128;
            i = i7 % 2 == 0 ? 1 : 0;
            int i8 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_typography_3;
        int i5 = onNavigationEvent + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_typography_3;
        int i5 = onNavigationEvent + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    protected deprecated_code onActivityResized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_code deprecated_codeVar = deprecated_code.TITLE;
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_codeVar;
        }
        throw null;
    }
}
