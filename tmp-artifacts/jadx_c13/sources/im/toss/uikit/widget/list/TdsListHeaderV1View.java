package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.deprecated_cacheControl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsListHeaderV1View extends ListCell {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public View onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    protected abstract int onExtraCallbackWithResult();

    protected void setArrow(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setButtonLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    protected void setButtonTheme(@NotNull TdsButtonV1View.asInterface asinterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asinterface, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void setButtonsDisplay(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setButtonsEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setButtonsSize(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setButtonsStyle(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setButtonsType(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setDescription(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setDescriptionColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setDescriptionColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setIcon(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
    }

    protected void setIcon(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected void setIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setImageButton(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setImageButton(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setImageButtonColor(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setOnButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
    }

    protected void setOnImageButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void setSubtitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setSubtitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
    }

    protected void setSubtitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    protected void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    protected void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHeaderV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 125;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 119;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 111;
        im.toss.uikit.widget.list.TdsListHeaderV1View.IAuthTabCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onExtraCallback() {
        View view;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            view = this.onExtraCallback;
            int i4 = 67 / 0;
        } else {
            view = this.onExtraCallback;
        }
    }

    public final void onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onExtraCallback = view;
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.ListCell
    protected void asInterface() {
        int i = 2 % 2;
        super.asInterface();
        View viewInflate = LayoutInflater.from(getContext()).inflate(onExtraCallbackWithResult(), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        onExtraCallback(viewInflate);
        View viewOnExtraCallback = onExtraCallback();
        int i2 = R.id.list_row;
        viewOnExtraCallback.setId(i2);
        addView(onExtraCallback(), new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 3, R.id.topDivider, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 4, R.id.bottomDivider, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        int i3 = IAuthTabCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.ListCell
    protected void IAuthTabCallback(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.IAuthTabCallback(context, attributeSet);
        if (isInEditMode()) {
            charSequence = "TITLE";
        } else {
            int i5 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str = isInEditMode() ^ true ? _UrlKt.FRAGMENT_ENCODE_SET : "SUBTITLE";
        if (isInEditMode()) {
            charSequence2 = "DESCRIPTION";
            int i7 = onWarmupCompleted + 53;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        isInEditMode();
        isInEditMode();
        int index = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex();
        int index2 = TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex();
        int index3 = TdsButtonV1View.onWarmupCompleted.MEDIUM.getIndex();
        int index4 = TdsButtonV1View.IAuthTabCallback.INLINE.getIndex();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsListHeaderV1, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.TdsListHeaderV1_icon);
        Object obj = null;
        if (drawable == null) {
            int i9 = IAuthTabCallback + 123;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 66 / 0;
            }
            drawable = null;
        }
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.TdsListHeaderV1_iconColor, -1);
        CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_title);
        if (text != null) {
            int i11 = IAuthTabCallback + 69;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            charSequence = text;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.TdsListHeaderV1_titleColor);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_subtitle);
        if (text2 != null) {
            str = text2;
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.TdsListHeaderV1_subtitleColor);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_description);
        if (text3 != null) {
            charSequence2 = text3;
        }
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.TdsListHeaderV1_descriptionColor);
        typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_subdescription);
        typedArrayObtainStyledAttributes.getColorStateList(R.styleable.TdsListHeaderV1_subdescriptionColor);
        typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_value);
        typedArrayObtainStyledAttributes.getColorStateList(R.styleable.TdsListHeaderV1_valueColor);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TdsListHeaderV1_arrow, false);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.TdsListHeaderV1_imageButtonSrc);
        Drawable drawable3 = drawable2 == null ? null : drawable2;
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.TdsListHeaderV1_imageButtonColor, -1);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_onImageButtonClick);
        CharSequence charSequence5 = text4 == null ? _UrlKt.FRAGMENT_ENCODE_SET : text4;
        CharSequence text5 = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_buttonLabel);
        if (text5 == null) {
            int i12 = IAuthTabCallback + 53;
            i = color2;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            text5 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            i = color2;
        }
        CharSequence text6 = typedArrayObtainStyledAttributes.getText(R.styleable.TdsListHeaderV1_onButtonClick);
        if (text6 != null) {
            int i14 = onWarmupCompleted + 31;
            charSequence3 = text5;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            charSequence4 = text6;
        } else {
            charSequence3 = text5;
            charSequence4 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        CharSequence charSequence6 = charSequence4;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TdsListHeaderV1_buttonsEnabled, true);
        int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.TdsListHeaderV1_buttonsType, index);
        int i17 = typedArrayObtainStyledAttributes.getInt(R.styleable.TdsListHeaderV1_buttonsStyle, index2);
        int i18 = typedArrayObtainStyledAttributes.getInt(R.styleable.TdsListHeaderV1_buttonsSize, index3);
        int i19 = typedArrayObtainStyledAttributes.getInt(R.styleable.TdsListHeaderV1_buttonsDisplay, index4);
        setIcon(drawable);
        setIconColor(color);
        setTitle(charSequence);
        setTitleColor(colorStateList);
        setSubtitle(str);
        setSubtitleColor(colorStateList2);
        setDescription(charSequence2);
        setDescriptionColor(colorStateList3);
        setArrow(z);
        setImageButton(drawable3);
        setImageButtonColor(i);
        if (charSequence5.length() != 0) {
            setOnImageButtonClickListener(new deprecated_cacheControl(this, charSequence5.toString()));
        }
        setButtonLabel(charSequence3);
        if (charSequence6.length() != 0) {
            setOnButtonClickListener(new deprecated_cacheControl(this, charSequence6.toString()));
        }
        setButtonsEnabled(z2);
        setButtonsType(i16);
        setButtonsStyle(i17);
        setButtonsSize(i18);
        setButtonsDisplay(i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTextView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.title);
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return baseTextViewFindViewById;
    }
}
