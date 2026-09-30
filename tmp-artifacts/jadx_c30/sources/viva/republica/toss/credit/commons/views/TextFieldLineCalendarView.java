package viva.republica.toss.credit.commons.views;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import im.toss.tds.R;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.M_;
import o.UST_CRYPT_VerifySignatureValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TextFieldLineCalendarView extends TextFieldLine {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallback = 8;
    private Function1<? super Triple<Integer, Integer, Integer>, Unit> IAuthTabCallback;
    private UST_CRYPT_VerifySignatureValue onNavigationEvent;

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[UST_CRYPT_VerifySignatureValue.values().length];
            try {
                iArr[UST_CRYPT_VerifySignatureValue.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UST_CRYPT_VerifySignatureValue.YEAR_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineCalendarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldLineCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldLineCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onNavigationEvent = UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY;
    }

    public /* synthetic */ TextFieldLineCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onExtraCallbackWithResult(context, attributeSet);
        setOnClickListener(null);
        setArrow(true);
        EditText editText = getEditText();
        if (editText != null) {
            editText.setLines(1);
            setErrorEnabled(true);
            editText.setInputType(0);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineCalendarView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    TextFieldLineCalendarView.onExtraCallbackWithResult(view, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(View view, boolean z) {
        if (z) {
            M_.onExtraCallback.onExtraCallback(view);
            view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis() + 100, 1, 0.0f, 0.0f, 0));
        }
    }

    public final void setArrow(boolean z) {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, z ? R.drawable.icn_arrow_downwards : 0, 0);
        }
    }

    public final void setType(@NotNull UST_CRYPT_VerifySignatureValue uST_CRYPT_VerifySignatureValue) {
        Intrinsics.checkNotNullParameter(uST_CRYPT_VerifySignatureValue, BuildConfig.FLAVOR);
        this.onNavigationEvent = uST_CRYPT_VerifySignatureValue;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull Calendar calendar, @NotNull Calendar calendar2, @NotNull Triple<Integer, Integer, Integer> triple, @NotNull String str) throws NoWhenBranchMatchedException {
        DatePickerDialog2 datePickerDialog2;
        Intrinsics.checkNotNullParameter(calendar, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(calendar2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(triple, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        EditText editText = getEditText();
        if (editText != null) {
            int i = IAuthTabCallback.onWarmupCompleted[this.onNavigationEvent.ordinal()];
            if (i == 1) {
                if (str.length() == 0) {
                    str = getContext().getString(viva.republica.toss.R.string.app_credit_commons_views___850ef3d506);
                }
                String str2 = str;
                Intrinsics.checkNotNull(str2);
                datePickerDialog2 = new DatePickerDialog2(getContext(), UST_CRYPT_VerifySignatureValue.YEAR, str2, calendar, calendar2, editText, new Function1() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineCalendarView$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return TextFieldLineCalendarView.onExtraCallbackWithResult(this.f$0, (Triple) obj);
                    }
                }, triple);
            } else if (i == 2) {
                if (str.length() == 0) {
                    str = getContext().getString(viva.republica.toss.R.string.app_credit_commons_views___048eb28c65);
                }
                String str3 = str;
                Intrinsics.checkNotNull(str3);
                datePickerDialog2 = new DatePickerDialog2(getContext(), UST_CRYPT_VerifySignatureValue.YEAR_MONTH, str3, calendar, calendar2, editText, new Function1() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineCalendarView$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return TextFieldLineCalendarView.IAuthTabCallback(this.f$0, (Triple) obj);
                    }
                }, triple);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str.length() == 0) {
                    str = getContext().getString(viva.republica.toss.R.string.app_credit_commons_views___048eb28c65);
                }
                String str4 = str;
                Intrinsics.checkNotNull(str4);
                datePickerDialog2 = new DatePickerDialog2(getContext(), UST_CRYPT_VerifySignatureValue.YEAR_MONTH_DAY, str4, calendar, calendar2, editText, new Function1() { // from class: viva.republica.toss.credit.commons.views.TextFieldLineCalendarView$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return TextFieldLineCalendarView.onTransact(this.f$0, (Triple) obj);
                    }
                }, triple);
            }
        } else {
            datePickerDialog2 = null;
        }
        if (datePickerDialog2 != null) {
            datePickerDialog2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TextFieldLineCalendarView textFieldLineCalendarView, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, BuildConfig.FLAVOR);
        Function1<? super Triple<Integer, Integer, Integer>, Unit> function1 = textFieldLineCalendarView.IAuthTabCallback;
        if (function1 != null) {
            function1.invoke(triple);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(TextFieldLineCalendarView textFieldLineCalendarView, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, BuildConfig.FLAVOR);
        Function1<? super Triple<Integer, Integer, Integer>, Unit> function1 = textFieldLineCalendarView.IAuthTabCallback;
        if (function1 != null) {
            function1.invoke(triple);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(TextFieldLineCalendarView textFieldLineCalendarView, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, BuildConfig.FLAVOR);
        Function1<? super Triple<Integer, Integer, Integer>, Unit> function1 = textFieldLineCalendarView.IAuthTabCallback;
        if (function1 != null) {
            function1.invoke(triple);
        }
        return Unit.INSTANCE;
    }

    public final void setOnValueChanged(@NotNull Function1<? super Triple<Integer, Integer, Integer>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        this.IAuthTabCallback = function1;
    }
}
