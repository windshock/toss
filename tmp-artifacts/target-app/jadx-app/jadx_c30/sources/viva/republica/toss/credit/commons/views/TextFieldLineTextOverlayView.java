package viva.republica.toss.credit.commons.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.uikit.widget.textField.TextFieldLine;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.onJsBridgeReady;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TextFieldLineTextOverlayView extends FrameLayout {
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineTextOverlayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineTextOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldLineTextOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineTextOverlayView$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TextFieldLineTextOverlayView.IAuthTabCallback(this.f$0);
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineTextOverlayView$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TextFieldLineTextOverlayView.onNavigationEvent(this.f$0);
            }
        });
        onJsBridgeReady.onWarmupCompleted(context, R.layout.view_text_field_line_text_overlay, this, true);
        onExtraCallback().setErrorEnabled(true);
        EditText editText = onExtraCallback().getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
        }
        EditText editText2 = onExtraCallback().getEditText();
        if (editText2 != null) {
            editText2.setLines(1);
        }
        EditText editText3 = onExtraCallback().getEditText();
        if (editText3 != null) {
            editText3.setInputType(2);
        }
    }

    public /* synthetic */ TextFieldLineTextOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldLine IAuthTabCallback(TextFieldLineTextOverlayView textFieldLineTextOverlayView) {
        return textFieldLineTextOverlayView.findViewById(R.id.viewTextFieldLineTextOverlayTextFieldLine);
    }

    private final TextFieldLine onExtraCallback() {
        Object value = this.onNavigationEvent.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (TextFieldLine) value;
    }

    private final Typography3 onNavigationEvent() {
        Object value = this.onExtraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (Typography3) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typography3 onNavigationEvent(TextFieldLineTextOverlayView textFieldLineTextOverlayView) {
        return textFieldLineTextOverlayView.findViewById(R.id.viewTextFieldLineTextOverlayLabel);
    }

    public final TextFieldLine IAuthTabCallback() {
        return onExtraCallback();
    }

    public final EditText onWarmupCompleted() {
        return IAuthTabCallback().getEditText();
    }

    public final void setLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onNavigationEvent().setText(str);
    }
}
