package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1vSDK;
import o.readIntokhttp;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TextValueLine extends ConstraintLayout {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final AFk1vSDK onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextValueLine(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextValueLine(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextValueLine(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1vSDK aFk1vSDKOnExtraCallbackWithResult = AFk1vSDK.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1vSDKOnExtraCallbackWithResult, "");
        this.onExtraCallbackWithResult = aFk1vSDKOnExtraCallbackWithResult;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TextValueLine, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 2 % 2;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TextValueLine_textValueLineLabel) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string != null) {
                        int i4 = onExtraCallback + 101;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 28 / 0;
                        }
                    } else {
                        string = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setLabel(string);
                } else if (index == R.styleable.TextValueLine_textValueLineHint) {
                    int i6 = onExtraCallback + 31;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 != null) {
                        int i8 = onExtraCallback + 1;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 2 / 3;
                        }
                    } else {
                        string2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setHint(string2);
                } else if (index == R.styleable.TextValueLine_textValueLineText) {
                    String string3 = typedArrayObtainStyledAttributes.getString(index);
                    if (string3 != null) {
                        int i10 = onNavigationEvent + 123;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        string3 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setText(string3);
                } else if (index == R.styleable.TextValueLine_textValueLineSubtext) {
                    int i12 = onExtraCallback + 35;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        typedArrayObtainStyledAttributes.getString(index);
                        throw null;
                    }
                    String string4 = typedArrayObtainStyledAttributes.getString(index);
                    if (string4 != null) {
                        int i13 = onExtraCallback + 27;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        string4 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setSubtext(string4);
                } else if (index == R.styleable.TextValueLine_textValueLineMessage) {
                    String string5 = typedArrayObtainStyledAttributes.getString(index);
                    if (string5 != null) {
                        int i15 = onNavigationEvent + 41;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        string5 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setMessage(string5);
                } else if (index == R.styleable.TextValueLine_textValueLineError) {
                    int i17 = onExtraCallback + 53;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    String string6 = typedArrayObtainStyledAttributes.getString(index);
                    setError(string6 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string6);
                } else if (index == R.styleable.TextValueLine_textValueLineArrow) {
                    setArrow(typedArrayObtainStyledAttributes.getBoolean(index, false));
                }
            }
        }
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault.setBackgroundResource(readIntokhttp.onWarmupCompleted(configuration) ? R.drawable.text_field_underline_normal_selector_accessibility : R.drawable.text_field_underline_normal_selector);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextValueLine(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 113;
            onExtraCallback = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 17;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setLabel(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onWarmupCompleted().setText(str);
            onExtraCallback();
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onWarmupCompleted().setText(str);
            onExtraCallback();
            int i3 = 58 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabel(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setLabel(string);
            int i4 = 1 / 0;
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setLabel(string2);
        }
        int i5 = onNavigationEvent + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setHint(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent().setHint(str);
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHint(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setHint(string);
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setHint(string2);
            int i4 = 74 / 0;
        }
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().setText(str);
            onExtraCallback();
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().setText(str);
            onExtraCallback();
            int i3 = 51 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setText(string);
        int i5 = onNavigationEvent + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setSubtext(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback().setText(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback().setText(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSubtext(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setSubtext(string);
        int i5 = onNavigationEvent + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMessage(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult().setText(str);
            onExtraCallbackWithResult().setTag(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult().setText(str);
        onExtraCallbackWithResult().setTag(str);
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMessage(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setMessage(string);
            throw null;
        }
        String string2 = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        setMessage(string2);
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(@NotNull String str) {
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0) {
            onExtraCallbackWithResult().setText(str);
            setSelected(true);
            return;
        }
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            boolean z = onExtraCallbackWithResult().getTag() instanceof String;
            obj.hashCode();
            throw null;
        }
        Typography7 typography7OnExtraCallbackWithResult = onExtraCallbackWithResult();
        Object tag = onExtraCallbackWithResult().getTag();
        String str3 = !(tag instanceof String) ? null : (String) tag;
        if (str3 == null) {
            int i3 = onNavigationEvent + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } else {
            str2 = str3;
        }
        typography7OnExtraCallbackWithResult.setText(str2);
        setSelected(false);
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setError(string);
        int i5 = onExtraCallback + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (onNavigationEvent().length() != 0) {
                onWarmupCompleted().setVisibility(0);
                IAuthTabCallback().setVisibility(0);
                return;
            }
            int i3 = onNavigationEvent + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted().setVisibility(4);
            IAuthTabCallback().setVisibility(4);
            return;
        }
        onNavigationEvent().length();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Typography7 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = this.onExtraCallbackWithResult.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return typography7;
    }

    public final Typography3 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Typography3 typography3 = this.onExtraCallbackWithResult.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(typography3, "");
            return typography3;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallbackWithResult.onExtraCallbackWithResult, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Typography7 IAuthTabCallback() {
        Typography7 typography7;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            typography7 = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            int i3 = 46 / 0;
        } else {
            typography7 = this.onExtraCallbackWithResult.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
        }
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return typography7;
    }

    public final Typography7 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = this.onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return typography7;
    }

    public final void setArrow(boolean z) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TdsImageView tdsImageView = this.onExtraCallbackWithResult.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        if (!z) {
            i = 8;
        } else {
            int i5 = onNavigationEvent + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        tdsImageView.setVisibility(i);
    }
}
