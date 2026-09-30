package im.toss.features.mobileid.impl;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.R;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.Enable;
import o.interceptNativeApiDispatch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RrnWidget extends FrameLayout {
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private boolean IAuthTabCallback;
    private final interceptNativeApiDispatch onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RrnWidget(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RrnWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RrnWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        interceptNativeApiDispatch interceptnativeapidispatchIAuthTabCallback = interceptNativeApiDispatch.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(interceptnativeapidispatchIAuthTabCallback, "");
        this.onExtraCallback = interceptnativeapidispatchIAuthTabCallback;
        EditText editText = onExtraCallback().getEditText();
        if (editText != null) {
            editText.setSaveEnabled(false);
            editText.setImeOptions(5);
            editText.setInputType(2);
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(6)});
            int i3 = onTransact + 3;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            } else {
                int i5 = 2 % 2;
            }
        }
        EditText editText2 = IAuthTabCallback().getEditText();
        if (editText2 != null) {
            editText2.setInputType(18);
            editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
            Enable.onWarmupCompleted$166805f2(editText2);
        }
        TextFieldLine textFieldLineOnExtraCallback = onExtraCallback();
        Intrinsics.checkNotNull(textFieldLineOnExtraCallback, "");
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(textFieldLineOnExtraCallback).IAuthTabCallback();
        int i6 = 2 % 2;
        loop0: while (true) {
            i2 = 0;
            while (itIAuthTabCallback.hasNext()) {
                View view = (View) itIAuthTabCallback.next();
                if (view instanceof FrameLayout) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        int i7 = onWarmupCompleted + 53;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null && marginLayoutParams.topMargin != 0) {
                        int i9 = onTransact + 111;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        }
                        if (marginLayoutParams2 != null) {
                            int i11 = onTransact + 11;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            i2 = marginLayoutParams2.topMargin;
                        }
                    }
                }
            }
        }
        TextFieldLine textFieldLineIAuthTabCallback = IAuthTabCallback();
        ViewGroup.LayoutParams layoutParams3 = textFieldLineIAuthTabCallback.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i13 = onWarmupCompleted + 101;
        onTransact = i13 % 128;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (i13 % 2 != 0) {
            marginLayoutParams3.topMargin = i2;
            textFieldLineIAuthTabCallback.setLayoutParams(marginLayoutParams3);
        } else {
            marginLayoutParams3.topMargin = i2;
            textFieldLineIAuthTabCallback.setLayoutParams(marginLayoutParams3);
            int i14 = 82 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RrnWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 121;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 7;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = onTransact + 23;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ interceptNativeApiDispatch onWarmupCompleted(RrnWidget rrnWidget) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        interceptNativeApiDispatch interceptnativeapidispatch = rrnWidget.onExtraCallback;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return interceptnativeapidispatch;
        }
        throw null;
    }

    public final TextFieldLine onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.IAuthTabCallback, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextFieldLine textFieldLine = this.onExtraCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(textFieldLine, "");
        int i3 = onWarmupCompleted + 63;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
        return textFieldLine;
    }

    public final TextFieldLine IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLine = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(textFieldLine, "");
        int i4 = onTransact + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return textFieldLine;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted() {
        int i = 2 % 2;
        if (!(!this.IAuthTabCallback)) {
            return;
        }
        int i2 = onTransact + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = true;
        final View viewFindViewById = onExtraCallback().findViewById(R.id.textinput_error);
        FrameLayout frameLayoutIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(frameLayoutIAuthTabCallback, "");
        if (!frameLayoutIAuthTabCallback.isLaidOut()) {
            frameLayoutIAuthTabCallback.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: im.toss.features.mobileid.impl.RrnWidget$initErrorIfNeed$$inlined$doOnLayout$1
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12 = 2 % 2;
                    view.removeOnLayoutChangeListener(this);
                    View view2 = viewFindViewById;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        int i13 = IAuthTabCallback + 11;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        layoutParams.width = RrnWidget.onWarmupCompleted(this).IAuthTabCallback().getWidth();
                        view2.setLayoutParams(layoutParams);
                        int i15 = onNavigationEvent + 5;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                    }
                }
            });
        } else {
            int i4 = onTransact + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (true ^ frameLayoutIAuthTabCallback.isLayoutRequested()) {
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    int i6 = onTransact + 7;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    layoutParams.width = onWarmupCompleted(this).IAuthTabCallback().getWidth();
                    viewFindViewById.setLayoutParams(layoutParams);
                }
            }
        }
        ViewParent parent = viewFindViewById.getParent();
        while (parent != null) {
            int i8 = onWarmupCompleted + 55;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                int i10 = onTransact + 123;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            if (Intrinsics.areEqual(parent, this.onExtraCallback.IAuthTabCallback())) {
                return;
            }
            parent = parent.getParent();
            int i12 = onTransact + 5;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 / 3;
            }
        }
    }

    public final void setRrn7error(@Nullable String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            int i4 = onTransact + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        this.onNavigationEvent = true ^ z;
        onNavigationEvent(str);
        int i6 = onWarmupCompleted + 49;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
    }

    public final void setBirthdayError(@Nullable String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            int i4 = onWarmupCompleted + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        this.onExtraCallbackWithResult = !z;
        onNavigationEvent(str);
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted();
        boolean z = this.onExtraCallbackWithResult;
        if ((z || this.onNavigationEvent) && str == null) {
            return;
        }
        if (z || this.onNavigationEvent) {
            onExtraCallback().setError(str);
        } else {
            int i4 = onTransact + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback().setError((CharSequence) null);
        }
        EditText editText = onExtraCallback().getEditText();
        if (editText != null) {
            editText.setSelected(this.onExtraCallbackWithResult);
            int i6 = onWarmupCompleted + 63;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        EditText editText2 = IAuthTabCallback().getEditText();
        if (editText2 != null) {
            editText2.setSelected(this.onNavigationEvent);
        }
    }
}
