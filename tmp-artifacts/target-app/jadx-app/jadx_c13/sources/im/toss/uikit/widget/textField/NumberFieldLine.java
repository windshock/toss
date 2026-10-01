package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.B_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberFieldLine extends ConstraintLayout {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final B_ onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberFieldLine(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberFieldLine(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NumberFieldLine(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        B_ b_OnNavigationEvent = B_.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b_OnNavigationEvent, "");
        this.onExtraCallback = b_OnNavigationEvent;
        if (attributeSet != null) {
            int i2 = 0;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.NumberFieldLine, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i3 = IAuthTabCallback + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.NumberFieldLine_numberFieldLineLabel) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    setLabel(string == null ? _UrlKt.FRAGMENT_ENCODE_SET : string);
                } else if (index == R.styleable.NumberFieldLine_numberFieldLineHint) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 != null) {
                        int i6 = IAuthTabCallback + 83;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 5 / 4;
                        }
                    } else {
                        string2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setHint(string2);
                } else if (index == R.styleable.NumberFieldLine_numberFieldLineText) {
                    String string3 = typedArrayObtainStyledAttributes.getString(index);
                    setText(string3 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string3);
                } else if (index == R.styleable.NumberFieldLine_numberFieldLineSubtext) {
                    String string4 = typedArrayObtainStyledAttributes.getString(index);
                    if (string4 != null) {
                        int i8 = IAuthTabCallback + 69;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        string4 = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    setSubtext(string4);
                } else if (index == R.styleable.NumberFieldLine_numberFieldLineMessage) {
                    String string5 = typedArrayObtainStyledAttributes.getString(index);
                    setMessage(string5 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string5);
                    int i9 = IAuthTabCallback + 111;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                } else if (index == R.styleable.NumberFieldLine_numberFieldLineError) {
                    int i11 = IAuthTabCallback + 99;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    String string6 = typedArrayObtainStyledAttributes.getString(index);
                    setError(string6 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string6);
                }
                i2++;
                int i13 = onNavigationEvent + 55;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NumberFieldLine(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void childDrawableStateChanged(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.areEqual(view, onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (Intrinsics.areEqual(view, onExtraCallback())) {
            refreshDrawableState();
        }
        int i3 = onNavigationEvent + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int[] onCreateDrawableState(int i) {
        int[] iArrMergeDrawableStates;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            iArrMergeDrawableStates = View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i >>> onExtraCallback().getDrawableState().length), onExtraCallback().getDrawableState());
            Intrinsics.checkNotNullExpressionValue(iArrMergeDrawableStates, "");
        } else {
            iArrMergeDrawableStates = View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + onExtraCallback().getDrawableState().length), onExtraCallback().getDrawableState());
            Intrinsics.checkNotNullExpressionValue(iArrMergeDrawableStates, "");
        }
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iArrMergeDrawableStates;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        boolean zDispatchTouchEvent = onExtraCallback().dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), Math.min(onExtraCallback().getRight(), motionEvent.getX()), Math.max(onExtraCallback().getTop(), motionEvent.getY()), motionEvent.getMetaState()));
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return zDispatchTouchEvent;
    }

    public final void setLabel(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback().setText(str);
            onExtraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback().setText(str);
        onExtraCallbackWithResult();
        int i3 = IAuthTabCallback + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setLabel(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setLabel(string);
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setLabel(string2);
            int i4 = 80 / 0;
        }
    }

    public final void setHint(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback().setHint(str);
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback().setHint(str);
        }
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHint(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setHint(string);
        int i5 = IAuthTabCallback + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback().setText(str);
        onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setText(string);
            int i4 = 44 / 0;
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setText(string2);
        }
        int i5 = IAuthTabCallback + 99;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSubtext(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().setText(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().setText(str);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSubtext(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setSubtext(string);
            int i4 = 52 / 0;
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setSubtext(string2);
        }
        int i5 = onNavigationEvent + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setMessage(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onWarmupCompleted().setText(str);
        onWarmupCompleted().setTag(str);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMessage(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setMessage(string);
        } else {
            String string2 = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setMessage(string2);
            int i4 = 53 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str2 = null;
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (i3 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str.length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0) {
            onWarmupCompleted().setText(str);
            setSelected(true);
            return;
        }
        Typography7 typography7OnWarmupCompleted = onWarmupCompleted();
        Object tag = onWarmupCompleted().getTag();
        if (tag instanceof String) {
            int i4 = onNavigationEvent + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str2 = (String) tag;
        }
        if (str2 != null) {
            str3 = str2;
        }
        typography7OnWarmupCompleted.setText(str3);
        setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setError(string);
        int i5 = IAuthTabCallback + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback().length() != 0) {
            IAuthTabCallback().setVisibility(0);
            onNavigationEvent().setVisibility(0);
            return;
        }
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback().setVisibility(4);
            onNavigationEvent().setVisibility(3);
        } else {
            IAuthTabCallback().setVisibility(4);
            onNavigationEvent().setVisibility(4);
        }
    }

    public final Typography7 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = this.onExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return typography7;
    }

    public final NumberEditText onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NumberEditText numberEditText = this.onExtraCallback.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(numberEditText, "");
            return numberEditText;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.onExtraCallbackWithResult, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Typography7 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Typography7 typography7 = this.onExtraCallback.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(typography7, "");
            return typography7;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.onWarmupCompleted, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Typography7 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return typography7;
    }
}
