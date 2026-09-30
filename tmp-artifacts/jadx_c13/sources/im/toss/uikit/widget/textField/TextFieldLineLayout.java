package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CertificatePinnerBuilder;
import o.M_;
import o.response;
import o.setDone;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TextFieldLineLayout extends TextInputLayout {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private CharSequence onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onExtraCallback(TextFieldLineLayout textFieldLineLayout) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(textFieldLineLayout);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextFieldLineLayout textFieldLineLayout, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(textFieldLineLayout, view);
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldLineLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        onExtraCallbackWithResult(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldLineLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = onWarmupCompleted + 45;
            onNavigationEvent = i8 % 128;
            i = i8 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public void addView(@NotNull View view, int i, @NotNull ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(layoutParams, "");
        super.addView(view, i, layoutParams);
        if (view instanceof EditText) {
            int i5 = onNavigationEvent + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CertificatePinnerBuilder.Companion.onNavigationEvent((EditText) view);
        }
    }

    public static final class onWarmupCompleted implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Typeface onWarmupCompleted;

        public onWarmupCompleted(Typeface typeface) {
            this.onWarmupCompleted = typeface;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                view.removeOnLayoutChangeListener(this);
                TextFieldLineLayout.this.setTypeface(this.onWarmupCompleted);
                int i11 = 97 / 0;
            } else {
                view.removeOnLayoutChangeListener(this);
                TextFieldLineLayout.this.setTypeface(this.onWarmupCompleted);
            }
        }
    }

    private static final void onExtraCallback(TextFieldLineLayout textFieldLineLayout, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {M_.onExtraCallback, textFieldLineLayout.getEditText()};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        if (i3 == 0) {
            M_.onNavigationEvent(1312897292, objArr, iOnNavigationEvent4, iOnNavigationEvent, -1312897289, iOnNavigationEvent3, iOnNavigationEvent2);
        } else {
            M_.onNavigationEvent(1312897292, objArr, iOnNavigationEvent4, iOnNavigationEvent, -1312897289, iOnNavigationEvent3, iOnNavigationEvent2);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onExtraCallbackWithResult(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int resId = response.Medium.getResId();
        if (attributeSet != null) {
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextFieldLineLayout);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int i5 = onWarmupCompleted + 83;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    typedArrayObtainStyledAttributes.getIndex(i4);
                    int i6 = R.styleable.TextFieldLineLayout_android_fontFamily;
                    throw null;
                }
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == R.styleable.TextFieldLineLayout_android_fontFamily) {
                    int i7 = onNavigationEvent + 71;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    resId = typedArrayObtainStyledAttributes.getResourceId(index, resId);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setFont(resId);
        setAddStatesFromChildren(true);
        setHintTextAppearance(R.style.TextFieldLine_Hint);
        setErrorTextAppearance(R.style.TextFieldLine_Message);
        setPlaceholderTextAppearance(R.style.TextFieldLine_PlaceHolder);
        setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.textField.TextFieldLineLayout$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                TextFieldLineLayout.onExtraCallbackWithResult(this.f$0, view);
                int i12 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        post(new Runnable() { // from class: im.toss.uikit.widget.textField.TextFieldLineLayout$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 3;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                TextFieldLineLayout.onExtraCallback(this.f$0);
                int i12 = IAuthTabCallback + 113;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(TextFieldLineLayout textFieldLineLayout) {
        String string;
        int i = 2 % 2;
        EditText editText = textFieldLineLayout.getEditText();
        if (editText != null) {
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TextPaint paint = editText.getPaint();
            CharSequence hint = textFieldLineLayout.getHint();
            if (hint != null) {
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    hint.toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                string = hint.toString();
                if (string == null) {
                    string = _UrlKt.FRAGMENT_ENCODE_SET;
                }
            }
            editText.setMinWidth((int) paint.measureText(string));
            int i5 = onNavigationEvent + 85;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TextUtils.isEmpty(charSequence))) {
            int i4 = onWarmupCompleted + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                setMessage(this.onExtraCallbackWithResult);
                return;
            }
            setMessage(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted(charSequence);
    }

    private final void onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            setHintTextAppearance(R.style.TextFieldLine_Hint_Error);
            setErrorTextAppearance(R.style.TextFieldLine_Message_Error);
            super.setError(charSequence);
            EditText editText = getEditText();
            if (editText != null) {
                editText.setSelected(true);
            }
            int i3 = onWarmupCompleted + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        setHintTextAppearance(R.style.TextFieldLine_Hint_Error);
        setErrorTextAppearance(R.style.TextFieldLine_Message_Error);
        super.setError(charSequence);
        getEditText();
        throw null;
    }

    public final void setMessage(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setHintTextAppearance(R.style.TextFieldLine_Hint);
        setErrorTextAppearance(R.style.TextFieldLine_Message);
        this.onExtraCallbackWithResult = charSequence;
        super.setError(charSequence);
        EditText editText = getEditText();
        if (editText != null) {
            int i4 = onWarmupCompleted + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            editText.setSelected(false);
            int i6 = onNavigationEvent + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMessage(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        setMessage(getResources().getString(i));
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFont(int i) {
        int i2 = 2 % 2;
        if (i != 0) {
            int i3 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!isInEditMode()) {
                int i5 = onNavigationEvent + 81;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    setFont(response.Companion.onExtraCallback(i));
                    int i6 = 79 / 0;
                } else {
                    setFont(response.Companion.onExtraCallback(i));
                }
            }
        }
        int i7 = onWarmupCompleted + 49;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public EditText extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = getEditText();
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return editText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setError(charSequence);
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Object obj = null;
        Typeface typeface$default = response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null);
        EditText editText = getEditText();
        if (editText != null) {
            editText.setTypeface(typeface$default);
        }
        if (isLaidOut() && !isLayoutRequested()) {
            setTypeface(typeface$default);
            int i4 = onWarmupCompleted + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        addOnLayoutChangeListener(new onWarmupCompleted(typeface$default));
        int i6 = onWarmupCompleted + 89;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
