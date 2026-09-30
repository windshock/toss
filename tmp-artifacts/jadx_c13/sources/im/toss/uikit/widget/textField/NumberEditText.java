package im.toss.uikit.widget.textField;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.uikit.R;
import im.toss.uikit.widget.textField.NumberEditText$;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CertificatePinnerBuilder;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.getBacktraceNote;
import o.response;
import o.setDone;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberEditText extends AppCompatEditText {
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private CharSequence IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private Drawable IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private float ICustomTabsCallback;
    private int access000;
    private String access100;
    private String asBinder;
    private ArrayList<onExtraCallbackWithResult> asInterface;
    private final onTransact extraCallback;
    private int getInterfaceDescriptor;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private onWarmupCompleted onNavigationEvent;
    private onExtraCallback onTransact;
    private boolean onWarmupCompleted;
    private Drawable writeTypedObject;

    public static /* synthetic */ void onNavigationEvent(NumberEditText numberEditText) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(numberEditText);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = readTypedObject + 41;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i6;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i5 | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i6 + i4 + i3 + (762713021 * i2) + (1579510587 * i);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-1846875272)) - 1480523776) + ((-1846875272) * i4) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i3) + ((-750387200) * i2) + ((-523632640) * i) + ((-1971257344) * i15);
        int i17 = ((i6 * (-1364308824)) - 1074288667) + (i4 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i3 * (-1364308165)) + (i2 * (-893132913)) + (i * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static final /* synthetic */ onWarmupCompleted IAuthTabCallback(NumberEditText numberEditText) {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = numberEditText.onNavigationEvent;
        int i5 = i3 + 49;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NumberEditText numberEditText = (NumberEditText) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        numberEditText.IAuthTabCallbackStub = zBooleanValue;
        int i5 = i3 + 105;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallback(NumberEditText numberEditText) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 37;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z = numberEditText.IAuthTabCallbackStub;
        int i5 = i2 + 61;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NumberEditText numberEditText, String str, Number number) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{numberEditText, str, number}, 1005254589, iOnNavigationEvent, -1005254587);
        int i4 = extraCallbackWithResult + 3;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NumberEditText numberEditText, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {numberEditText, Boolean.valueOf(z)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        if (i3 == 0) {
            onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1813168930, iOnNavigationEvent, 1813168930);
        } else {
            onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1813168930, iOnNavigationEvent, 1813168930);
            int i4 = 19 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setEditable(boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            setTextIsSelectable(z);
            setFocusable(z);
            setFocusableInTouchMode(z);
            setLongClickable(z);
            int i3 = extraCallbackWithResult + 23;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        setTextIsSelectable(z);
        setFocusable(z);
        setFocusableInTouchMode(z);
        setLongClickable(z);
        throw null;
    }

    public static final class onTransact implements TextWatcher {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            int i7 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }

        onTransact() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(editable, "");
            if (NumberEditText.IAuthTabCallback(NumberEditText.this) == null) {
                return;
            }
            NumberEditText.this.removeTextChangedListener(this);
            onNavigationEvent onnavigationevent = new onNavigationEvent();
            onWarmupCompleted onwarmupcompletedIAuthTabCallback = NumberEditText.IAuthTabCallback(NumberEditText.this);
            Intrinsics.checkNotNull(onwarmupcompletedIAuthTabCallback);
            onwarmupcompletedIAuthTabCallback.IAuthTabCallback(editable, onnavigationevent);
            editable.replace(0, editable.length(), onnavigationevent.onExtraCallbackWithResult());
            if (NumberEditText.onExtraCallback(NumberEditText.this)) {
                try {
                    NumberEditText.this.setSelection(editable.length());
                    int i4 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Exception unused) {
                }
                Object[] objArr = {NumberEditText.this, false};
                int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
                int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
                NumberEditText.onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1486476969, iOnNavigationEvent, 1486476972);
            }
            NumberEditText.onExtraCallbackWithResult(NumberEditText.this, TextUtils.isEmpty(onnavigationevent.onExtraCallbackWithResult()));
            NumberEditText.this.addTextChangedListener(this);
            NumberEditText.onExtraCallbackWithResult(NumberEditText.this, onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.onWarmupCompleted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsInLayout = isInLayout();
        int i4 = readTypedObject + 67;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zIsInLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onTransact() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = this.getInterfaceDescriptor;
        if (i5 != -1) {
            return i5;
        }
        int i6 = i3 + 9;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return getCurrentTextColor();
        }
        getCurrentTextColor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int currentTextColor = this.access000;
        if (currentTextColor == -1) {
            currentTextColor = getCurrentTextColor();
            int i4 = extraCallbackWithResult + 61;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 2;
            }
        }
        int i6 = extraCallbackWithResult + 9;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
        return currentTextColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float onExtraCallbackWithResult() {
        float textSize;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 21;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallback_Parcel;
        if (f != -1.0f) {
            return f;
        }
        int i5 = i2 + 123;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            textSize = getPaint().getTextSize();
            int i6 = 61 / 0;
        } else {
            textSize = getPaint().getTextSize();
        }
        float f2 = textSize;
        int i7 = extraCallbackWithResult + 123;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float f = this.ICustomTabsCallback;
        if (f != -1.0f) {
            return f;
        }
        float textSize = getPaint().getTextSize();
        int i4 = extraCallbackWithResult + 125;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return textSize;
    }

    public final Number onWarmupCompleted() {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent();
        onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
        Intrinsics.checkNotNull(onwarmupcompleted);
        onwarmupcompleted.IAuthTabCallback(getText(), onnavigationevent);
        Number numberOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return numberOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNumber(@NotNull Number number) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(number, "");
        setText(number.toString());
        int i4 = extraCallbackWithResult + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.access100 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.asBinder = _UrlKt.FRAGMENT_ENCODE_SET;
        this.getInterfaceDescriptor = -1;
        this.access000 = -1;
        this.ICustomTabsCallback = -1.0f;
        this.IAuthTabCallback_Parcel = -1.0f;
        this.onExtraCallback = true;
        this.IAuthTabCallbackDefault = true;
        this.extraCallback = new onTransact();
        onWarmupCompleted((AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEditText(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.access100 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.asBinder = _UrlKt.FRAGMENT_ENCODE_SET;
        this.getInterfaceDescriptor = -1;
        this.access000 = -1;
        this.ICustomTabsCallback = -1.0f;
        this.IAuthTabCallback_Parcel = -1.0f;
        this.onExtraCallback = true;
        this.IAuthTabCallbackDefault = true;
        this.extraCallback = new onTransact();
        onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberEditText(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.access100 = _UrlKt.FRAGMENT_ENCODE_SET;
        this.asBinder = _UrlKt.FRAGMENT_ENCODE_SET;
        this.getInterfaceDescriptor = -1;
        this.access000 = -1;
        this.ICustomTabsCallback = -1.0f;
        this.IAuthTabCallback_Parcel = -1.0f;
        this.onExtraCallback = true;
        this.IAuthTabCallbackDefault = true;
        this.extraCallback = new onTransact();
        onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.NumberEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.NumberEditText_prefix);
            if (string == null) {
                int i4 = extraCallbackWithResult + 11;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            this.asBinder = string;
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.NumberEditText_suffix);
            if (string2 == null) {
                string2 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            this.access100 = string2;
            this.access000 = typedArrayObtainStyledAttributes.getColor(R.styleable.NumberEditText_prefixColor, -1);
            this.getInterfaceDescriptor = typedArrayObtainStyledAttributes.getColor(R.styleable.NumberEditText_suffixColor, -1);
            this.IAuthTabCallback_Parcel = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberEditText_prefixSize, -1);
            this.ICustomTabsCallback = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NumberEditText_suffixSize, -1);
            this.onExtraCallback = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberEditText_editable, true);
            this.onWarmupCompleted = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberEditText_hideSuffixOnEmptyText, false);
            this.onExtraCallbackWithResult = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NumberEditText_hidePrefixOnEmptyText, false);
            typedArrayObtainStyledAttributes.recycle();
            this.asInterface = new ArrayList<>();
            setEmojiCompatEnabled(false);
            addTextChangedListener(this.extraCallback);
            setInputType(2);
            setMaxLines(1);
            this.IAuthTabCallback = getHint();
            setFormatter(new IAuthTabCallback());
            if (!this.onExtraCallback) {
                setEditable(false);
            }
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            setMinWidth(varyMatches.onNavigationEvent(Float.valueOf(2.0f), displayMetrics));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStub() {
        int max;
        InputFilter inputFilter;
        int i;
        int i2 = 2 % 2;
        InputFilter[] filters = getFilters();
        if (filters != null) {
            int i3 = readTypedObject + 85;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int length = filters.length;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = extraCallbackWithResult + 63;
                int i7 = i6 % 128;
                readTypedObject = i7;
                if (i6 % 2 != 0) {
                    inputFilter = filters[i5];
                    int i8 = 84 / 0;
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        i = i7 + 93;
                        extraCallbackWithResult = i % 128;
                        if (i % 2 != 0) {
                            ((InputFilter.LengthFilter) inputFilter).getMax();
                            throw null;
                        }
                        max = ((InputFilter.LengthFilter) inputFilter).getMax();
                    }
                } else {
                    inputFilter = filters[i5];
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        i = i7 + 93;
                        extraCallbackWithResult = i % 128;
                        if (i % 2 != 0) {
                        }
                    }
                }
            }
            max = 0;
        } else {
            max = 0;
        }
        if (max > 0) {
            onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
            Intrinsics.checkNotNull(onwarmupcompleted);
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(onwarmupcompleted.onExtraCallback(max));
            ArrayList arrayList = new ArrayList();
            arrayList.add(lengthFilter);
            Intrinsics.checkNotNull(filters);
            for (InputFilter inputFilter2 : filters) {
                if (!(inputFilter2 instanceof InputFilter.LengthFilter)) {
                    arrayList.add(inputFilter2);
                }
            }
            setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFormatter(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onNavigationEvent = onwarmupcompleted;
            IAuthTabCallbackStub();
            onWarmupCompleted onwarmupcompleted2 = this.onNavigationEvent;
            Intrinsics.checkNotNull(onwarmupcompleted2);
            setKeyListener(DigitsKeyListener.getInstance(onwarmupcompleted2.IAuthTabCallback()));
            setText(getText());
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onNavigationEvent = onwarmupcompleted;
        IAuthTabCallbackStub();
        onWarmupCompleted onwarmupcompleted3 = this.onNavigationEvent;
        Intrinsics.checkNotNull(onwarmupcompleted3);
        setKeyListener(DigitsKeyListener.getInstance(onwarmupcompleted3.IAuthTabCallback()));
        setText(getText());
        int i3 = extraCallbackWithResult + 41;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getBacktraceNote<NumberEditText, String, Number, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(getBacktraceNote<? super NumberEditText, ? super String, ? super Number, Unit> getbacktracenote) {
            this.onWarmupCompleted = getbacktracenote;
        }

        public void onNavigationEvent(NumberEditText numberEditText, String str, Number number) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(numberEditText, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(number, "");
            this.onWarmupCompleted.invoke(numberEditText, str, number);
            int i4 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void IAuthTabCallback(@NotNull getBacktraceNote<? super NumberEditText, ? super String, ? super Number, Unit> getbacktracenote) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        onExtraCallbackWithResult(new IAuthTabCallbackStub(getbacktracenote));
        int i2 = readTypedObject + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        ArrayList<onExtraCallbackWithResult> arrayList = this.asInterface;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.contains(onextracallbackwithresult)) {
            return;
        }
        int i4 = readTypedObject + 23;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        ArrayList<onExtraCallbackWithResult> arrayList2 = this.asInterface;
        Intrinsics.checkNotNull(arrayList2);
        if (i5 != 0) {
            arrayList2.add(onextracallbackwithresult);
            return;
        }
        arrayList2.add(onextracallbackwithresult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NumberEditText numberEditText = (NumberEditText) objArr[0];
        String str = (String) objArr[1];
        Number number = (Number) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<onExtraCallbackWithResult> arrayList = numberEditText.asInterface;
        Intrinsics.checkNotNull(arrayList);
        Iterator<onExtraCallbackWithResult> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            int i4 = extraCallbackWithResult + 65;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.onNavigationEvent(numberEditText, str, number);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSupportHint(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.IAuthTabCallback = charSequence;
        boolean z = false;
        if (length() == 0) {
            int i4 = readTypedObject + 31;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
        }
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1813168930, iOnNavigationEvent, 1813168930);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.TextView, im.toss.uikit.widget.textField.NumberEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r1 = (NumberEditText) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        if (zBooleanValue != ((NumberEditText) r1).IAuthTabCallbackDefault) {
            int i2 = extraCallbackWithResult + 99;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            ((NumberEditText) r1).IAuthTabCallbackDefault = zBooleanValue;
            if (((NumberEditText) r1).onWarmupCompleted || ((NumberEditText) r1).onExtraCallbackWithResult) {
                r1.IAuthTabCallback();
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(((NumberEditText) r1).IAuthTabCallback);
        CharSequence charSequenceOnNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            super/*android.widget.TextView*/.setHint(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i4 = extraCallbackWithResult + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
            if (!(!zBooleanValue)) {
                CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
                Context context = r1.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                charSequenceOnNavigationEvent = onwarmupcompleted.onNavigationEvent(context, ((NumberEditText) r1).IAuthTabCallback);
            }
        } else if (zBooleanValue) {
        }
        super/*android.widget.TextView*/.setHint(charSequenceOnNavigationEvent);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(@NotNull CharSequence charSequence, @NotNull TextView.BufferType bufferType) {
        boolean z;
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(bufferType, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(bufferType, "");
            z = true;
        }
        this.IAuthTabCallbackStub = z;
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.widget.TextView, im.toss.uikit.widget.textField.NumberEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        ?? r7 = (NumberEditText) objArr[0];
        int i = 2 % 2;
        if (((NumberEditText) r7).writeTypedObject == null) {
            int i2 = extraCallbackWithResult + 85;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
                if (!TextUtils.isEmpty(((NumberEditText) r7).access100)) {
                    if (((NumberEditText) r7).IAuthTabCallbackDefault) {
                        int i4 = extraCallbackWithResult + 87;
                        readTypedObject = i4 % 128;
                        int i5 = i4 % 2;
                        if (!(!((NumberEditText) r7).onWarmupCompleted)) {
                            z = false;
                        }
                    }
                    Drawable drawableOnExtraCallback = r7.onExtraCallback(((NumberEditText) r7).access100, r7.IAuthTabCallbackDefault(), r7.onTransact(), false);
                    ((NumberEditText) r7).writeTypedObject = drawableOnExtraCallback;
                    if (drawableOnExtraCallback != null) {
                        int i6 = readTypedObject + 103;
                        extraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Intrinsics.checkNotNull(drawableOnExtraCallback);
                        drawableOnExtraCallback.setAlpha(0);
                    }
                    z = true;
                }
            } else if (!TextUtils.isEmpty(((NumberEditText) r7).access100)) {
            }
        }
        if (((NumberEditText) r7).IAuthTabCallbackStubProxy == null) {
            int i8 = readTypedObject + 3;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (!TextUtils.isEmpty(((NumberEditText) r7).asBinder)) {
                int i10 = readTypedObject + 65;
                int i11 = i10 % 128;
                extraCallbackWithResult = i11;
                int i12 = i10 % 2;
                if (((NumberEditText) r7).IAuthTabCallbackDefault) {
                    int i13 = i11 + 85;
                    readTypedObject = i13 % 128;
                    int i14 = i13 % 2;
                    if (((NumberEditText) r7).onExtraCallbackWithResult) {
                        if (z) {
                        }
                    }
                    r7.setCompoundDrawablesWithIntrinsicBounds(((NumberEditText) r7).IAuthTabCallbackStubProxy, null, ((NumberEditText) r7).writeTypedObject, null);
                    r7.post(new NumberEditText$.ExternalSyntheticLambda0((NumberEditText) r7));
                }
                Drawable drawableOnExtraCallback2 = r7.onExtraCallback(((NumberEditText) r7).asBinder, r7.onExtraCallbackWithResult(), r7.onNavigationEvent(), true);
                ((NumberEditText) r7).IAuthTabCallbackStubProxy = drawableOnExtraCallback2;
                if (drawableOnExtraCallback2 != null) {
                    Intrinsics.checkNotNull(drawableOnExtraCallback2);
                    drawableOnExtraCallback2.setAlpha(0);
                }
                r7.setCompoundDrawablesWithIntrinsicBounds(((NumberEditText) r7).IAuthTabCallbackStubProxy, null, ((NumberEditText) r7).writeTypedObject, null);
                r7.post(new NumberEditText$.ExternalSyntheticLambda0((NumberEditText) r7));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(NumberEditText numberEditText) {
        int i = 2 % 2;
        Drawable drawable = numberEditText.writeTypedObject;
        if (drawable != null) {
            int i2 = readTypedObject + 103;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNull(drawable);
                drawable.setAlpha(11534);
            } else {
                Intrinsics.checkNotNull(drawable);
                drawable.setAlpha(255);
            }
        }
        Drawable drawable2 = numberEditText.IAuthTabCallbackStubProxy;
        if (drawable2 != null) {
            int i3 = extraCallbackWithResult + 109;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNull(drawable2);
            drawable2.setAlpha(255);
        }
        numberEditText.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Drawable onExtraCallback(String str, float f, int i, boolean z) {
        Layout layout;
        float fHeight;
        int iHeight;
        int i2;
        int i3;
        int gravity;
        int i4 = 2 % 2;
        if (asBinder() || (layout = getLayout()) == null) {
            return null;
        }
        float measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredHeight <= 0.0f || measuredHeight >= 1.6777215E7f) {
            return null;
        }
        Paint paint = new Paint(getPaint());
        if (isInEditMode()) {
            int i5 = extraCallbackWithResult + 9;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            measuredHeight /= getResources().getDisplayMetrics().density;
            f /= getResources().getDisplayMetrics().density;
        }
        paint.setTextSize(f);
        paint.setColor(i);
        response responseVar = response.Medium;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i7 = (int) (f / 10.0f);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        int iWidth = rect.width();
        int i8 = rect.left;
        float f2 = z ? 0 : i7;
        if (f <= getTextSize()) {
            int i9 = extraCallbackWithResult + 67;
            readTypedObject = i9 % 128;
            if (i9 % 2 == 0 ? (gravity = getGravity() & 112) == 48 : (gravity = getGravity() & 3) == 16) {
                fHeight = rect.height() - (layout.getLineBaseline(0) + fontMetrics.top);
            } else if (gravity != 80) {
                int i10 = readTypedObject + 87;
                extraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                fHeight = rect.height();
                iHeight = rect.height();
                i2 = rect.bottom;
                int i12 = readTypedObject + 53;
                extraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            } else {
                fHeight = layout.getLineBaseline(0);
            }
            i3 = (int) measuredHeight;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth + i8 + i7, i3, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            new Canvas(bitmapCreateBitmap).drawText(str, f2, fHeight, paint);
            return new BitmapDrawable(getResources(), bitmapCreateBitmap);
        }
        fHeight = rect.height();
        iHeight = rect.height();
        i2 = rect.bottom;
        i3 = iHeight + i2;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iWidth + i8 + i7, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
        new Canvas(bitmapCreateBitmap2).drawText(str, f2, fHeight, paint);
        return new BitmapDrawable(getResources(), bitmapCreateBitmap2);
    }

    public final void setSuffix(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.access100 = str;
            onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.access100 = str;
        onExtraCallback();
        int i3 = extraCallbackWithResult + 97;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPrefix(@NotNull String str) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.asBinder = str;
            onExtraCallback();
            int i3 = 49 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.asBinder = str;
            onExtraCallback();
        }
        int i4 = readTypedObject + 97;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy = null;
        this.writeTypedObject = null;
        setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        int i4 = extraCallbackWithResult + 67;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            invalidate();
            int i3 = 93 / 0;
        } else {
            IAuthTabCallback();
            invalidate();
        }
        int i4 = readTypedObject + 111;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(canvas, "");
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1971418639, iOnNavigationEvent, -1971418638);
            super/*android.view.View*/.onDraw(canvas);
            return;
        }
        Intrinsics.checkNotNullParameter(canvas, "");
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent6, iOnNavigationEvent5, new Object[]{this}, 1971418639, iOnNavigationEvent4, -1971418638);
        super/*android.view.View*/.onDraw(canvas);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 125;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1971418639, iOnNavigationEvent, -1971418638);
        super/*android.view.View*/.onMeasure(i, i2);
        int i6 = extraCallbackWithResult + 71;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        super/*android.widget.TextView*/.setTextSize(f);
        int i4 = readTypedObject + 35;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextSize(int i, float f) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 107;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTextSize(i, f);
            int i4 = readTypedObject + 107;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        IAuthTabCallback();
        super/*android.widget.TextView*/.setTextSize(i, f);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 115;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTextColor(i);
        } else {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTextColor(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextColor(@NotNull ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(colorStateList, "");
        IAuthTabCallback();
        super/*android.widget.TextView*/.setTextColor(colorStateList);
        int i4 = extraCallbackWithResult + 89;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(@Nullable Typeface typeface) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTypeface(typeface);
        } else {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTypeface(typeface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(@Nullable Typeface typeface, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 55;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTypeface(typeface, i);
        } else {
            IAuthTabCallback();
            super/*android.widget.TextView*/.setTypeface(typeface, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSelectionChanged(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 109;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super/*android.widget.TextView*/.onSelectionChanged(i, i2);
            throw null;
        }
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
        if (onwarmupcompleted != null) {
            Intrinsics.checkNotNull(onwarmupcompleted);
            if (onwarmupcompleted.onNavigationEvent()) {
                return;
            }
            int i5 = readTypedObject + 13;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i == i2 && i2 == length()) {
                return;
            }
            setSelection(length());
            int i6 = extraCallbackWithResult + 101;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    protected boolean getDefaultEditable() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 83;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 71;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            int i3 = 61 / 0;
            if (this.asBinder.length() <= 0) {
                int i4 = extraCallbackWithResult + 69;
                readTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 70 / 0;
                    if (this.access100.length() <= 0) {
                        return;
                    }
                } else if (this.access100.length() <= 0) {
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.asBinder.length() <= 0) {
            }
        }
        SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult = SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo);
        String str = this.asBinder;
        CharSequence typedObject = suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.readTypedObject();
        suspendAnimationKtExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallbackDefault(str + " " + ((Object) typedObject) + " " + this.access100);
        int i6 = extraCallbackWithResult + 29;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setOnKeyPreImeListener(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onTransact = onextracallback;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onTransact = onextracallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, @NotNull KeyEvent keyEvent) {
        onExtraCallback onextracallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(keyEvent, "");
        if (keyEvent.getKeyCode() == 4) {
            int i3 = extraCallbackWithResult + 91;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            if (keyEvent.getAction() == 1 && (onextracallback = this.onTransact) != null) {
                int i5 = extraCallbackWithResult + 39;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNull(onextracallback);
                if (onextracallback.onExtraCallback()) {
                    return true;
                }
            }
        }
        return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
    }

    public static final /* synthetic */ void onWarmupCompleted(NumberEditText numberEditText, boolean z) {
        Object[] objArr = {numberEditText, Boolean.valueOf(z)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1486476969, iOnNavigationEvent, 1486476972);
    }

    private final void onExtraCallbackWithResult(String str, Number number) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this, str, number}, 1005254589, iOnNavigationEvent, -1005254587);
    }

    private final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent2, objArr, -1813168930, iOnNavigationEvent, 1813168930);
    }

    private final void asInterface() {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onWarmupCompleted(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, 1971418639, iOnNavigationEvent, -1971418638);
    }
}
