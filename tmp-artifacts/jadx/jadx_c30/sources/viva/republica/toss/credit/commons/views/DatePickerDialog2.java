package viva.republica.toss.credit.commons.views;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.UST_CRYPT_VerifySignatureValue;
import o.enableIOSViewClipToPaddingBox;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DatePickerDialog2 extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final UST_CRYPT_VerifySignatureValue IAuthTabCallbackStubProxy;
    private final Calendar IAuthTabCallback_Parcel;
    private final String access000;
    private final Calendar access100;
    private final Lazy asBinder;
    private final EditText asInterface;
    private final Function1<Triple<Integer, Integer, Integer>, Unit> getInterfaceDescriptor;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Triple<Integer, Integer, Integer> onNavigationEvent;
    private final Lazy onTransact;

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

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
            onExtraCallbackWithResult = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDialog2(@NotNull Context context, @NotNull UST_CRYPT_VerifySignatureValue uST_CRYPT_VerifySignatureValue, @NotNull String str, @NotNull Calendar calendar, @NotNull Calendar calendar2, @NotNull EditText editText, @NotNull Function1<? super Triple<Integer, Integer, Integer>, Unit> function1, @NotNull Triple<Integer, Integer, Integer> triple) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(uST_CRYPT_VerifySignatureValue, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(calendar, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(calendar2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(editText, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(triple, BuildConfig.FLAVOR);
        this.IAuthTabCallbackStubProxy = uST_CRYPT_VerifySignatureValue;
        this.access000 = str;
        this.access100 = calendar;
        this.IAuthTabCallback_Parcel = calendar2;
        this.asInterface = editText;
        this.getInterfaceDescriptor = function1;
        this.onNavigationEvent = triple;
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda0
            public final Object invoke() {
                return DatePickerDialog2.getInterfaceDescriptor(this.f$0);
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda1
            public final Object invoke() {
                return DatePickerDialog2.asBinder(this.f$0);
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda2
            public final Object invoke() {
                return DatePickerDialog2.IAuthTabCallbackStub(this.f$0);
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda3
            public final Object invoke() {
                return DatePickerDialog2.access100(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda4
            public final Object invoke() {
                return DatePickerDialog2.IAuthTabCallbackDefault(this.f$0);
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda5
            public final Object invoke() {
                return DatePickerDialog2.onTransact(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseTextView getInterfaceDescriptor(DatePickerDialog2 datePickerDialog2) {
        BaseTextView baseTextViewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerTitle);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        return baseTextViewFindViewById;
    }

    private final BaseTextView onActivityLayout() {
        return (BaseTextView) this.asBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TdsImageView asBinder(DatePickerDialog2 datePickerDialog2) {
        TdsImageView tdsImageViewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerClose);
        Intrinsics.checkNotNull(tdsImageViewFindViewById);
        return tdsImageViewFindViewById;
    }

    private final TdsImageView readTypedObject() {
        return (TdsImageView) this.IAuthTabCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TdsBottomCtaV1View IAuthTabCallbackStub(DatePickerDialog2 datePickerDialog2) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerButton);
        Intrinsics.checkNotNull(tdsBottomCtaV1ViewFindViewById);
        return tdsBottomCtaV1ViewFindViewById;
    }

    private final TdsBottomCtaV1View onExtraCallbackWithResult() {
        return (TdsBottomCtaV1View) this.onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberPicker access100(DatePickerDialog2 datePickerDialog2) {
        View viewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerYear);
        Intrinsics.checkNotNull(viewFindViewById);
        return (NumberPicker) viewFindViewById;
    }

    private final NumberPicker onMinimized() {
        return (NumberPicker) this.onTransact.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberPicker IAuthTabCallbackDefault(DatePickerDialog2 datePickerDialog2) {
        View viewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerMonth);
        Intrinsics.checkNotNull(viewFindViewById);
        return (NumberPicker) viewFindViewById;
    }

    private final NumberPicker extraCallbackWithResult() {
        return (NumberPicker) this.IAuthTabCallbackDefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NumberPicker onTransact(DatePickerDialog2 datePickerDialog2) {
        View viewFindViewById = datePickerDialog2.findViewById(R.id.dialogLoanComparisonCalendarPickerDate);
        Intrinsics.checkNotNull(viewFindViewById);
        return (NumberPicker) viewFindViewById;
    }

    private final NumberPicker writeTypedObject() {
        return (NumberPicker) this.onExtraCallbackWithResult.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.dialog_loan_comparison_calendar_picker);
        onActivityLayout().setText(this.access000);
        readTypedObject().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerDialog2.onNavigationEvent(this.f$0, view);
            }
        });
        TdsBottomCtaV1View.setCta$default(onExtraCallbackWithResult(), im.toss.uikit.R.string.uikit_confirm, new View.OnClickListener() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NumberFormatException {
                DatePickerDialog2.onExtraCallback(this.f$0, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        onMinimized().setWrapSelectorWheel(false);
        extraCallbackWithResult().setWrapSelectorWheel(false);
        writeTypedObject().setWrapSelectorWheel(false);
        EditText editTextOnWarmupCompleted = onWarmupCompleted(onMinimized());
        if (editTextOnWarmupCompleted != null) {
            enableIOSViewClipToPaddingBox.IAuthTabCallback.onWarmupCompleted(new EditText[]{editTextOnWarmupCompleted});
        }
        EditText editTextOnWarmupCompleted2 = onWarmupCompleted(extraCallbackWithResult());
        if (editTextOnWarmupCompleted2 != null) {
            enableIOSViewClipToPaddingBox.IAuthTabCallback.onWarmupCompleted(new EditText[]{editTextOnWarmupCompleted2});
        }
        EditText editTextOnWarmupCompleted3 = onWarmupCompleted(writeTypedObject());
        if (editTextOnWarmupCompleted3 != null) {
            enableIOSViewClipToPaddingBox.IAuthTabCallback.onWarmupCompleted(new EditText[]{editTextOnWarmupCompleted3});
        }
        final int i = this.access100.get(1);
        int iIntValue = ((Number) this.onNavigationEvent.getFirst()).intValue();
        int iIntValue2 = ((Number) this.onNavigationEvent.getSecond()).intValue();
        int iIntValue3 = ((Number) this.onNavigationEvent.getThird()).intValue();
        int i2 = iIntValue - i;
        onMinimized().setValue(i2);
        extraCallbackWithResult().setValue(iIntValue2);
        writeTypedObject().setValue(iIntValue3);
        onMinimized().setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda8
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                DatePickerDialog2.onExtraCallback(i, this, numberPicker, i3, i4);
            }
        });
        extraCallbackWithResult().setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: viva.republica.toss.credit.commons.views.DatePickerDialog2$$ExternalSyntheticLambda9
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                DatePickerDialog2.onWarmupCompleted(i, this, numberPicker, i3, i4);
            }
        });
        IAuthTabCallback(this.access100, this.IAuthTabCallback_Parcel);
        onNavigationEvent(this.access100, this.IAuthTabCallback_Parcel, iIntValue);
        IAuthTabCallback(this.access100, this.IAuthTabCallback_Parcel, iIntValue, iIntValue2);
        onMinimized().setValue(i2);
        extraCallbackWithResult().setValue(iIntValue2);
        writeTypedObject().setValue(iIntValue3);
        int i3 = onExtraCallback.onExtraCallbackWithResult[this.IAuthTabCallbackStubProxy.ordinal()];
        if (i3 == 1) {
            onMinimized().setVisibility(0);
            extraCallbackWithResult().setVisibility(8);
            writeTypedObject().setVisibility(8);
        } else if (i3 == 2) {
            onMinimized().setVisibility(0);
            extraCallbackWithResult().setVisibility(0);
            writeTypedObject().setVisibility(8);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            onMinimized().setVisibility(0);
            extraCallbackWithResult().setVisibility(0);
            writeTypedObject().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(DatePickerDialog2 datePickerDialog2, View view) {
        datePickerDialog2.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallback(DatePickerDialog2 datePickerDialog2, View view) throws NumberFormatException {
        int i = onExtraCallback.onExtraCallbackWithResult[datePickerDialog2.IAuthTabCallbackStubProxy.ordinal()];
        if (i == 1) {
            String strSubstring = datePickerDialog2.onWarmupCompleted().substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
            int i2 = Integer.parseInt(strSubstring);
            datePickerDialog2.asInterface.setText(String.valueOf(i2));
            datePickerDialog2.getInterfaceDescriptor.invoke(new Triple(Integer.valueOf(i2), 1, 1));
        } else if (i == 2) {
            String strSubstring2 = datePickerDialog2.onWarmupCompleted().substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, BuildConfig.FLAVOR);
            int i3 = Integer.parseInt(strSubstring2);
            String strSubstring3 = datePickerDialog2.onWarmupCompleted().substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, BuildConfig.FLAVOR);
            int i4 = Integer.parseInt(strSubstring3);
            datePickerDialog2.asInterface.setText(datePickerDialog2.getContext().getString(R.string.calender_view_year_month, Integer.valueOf(i3), Integer.valueOf(i4)));
            datePickerDialog2.getInterfaceDescriptor.invoke(new Triple(Integer.valueOf(i3), Integer.valueOf(i4), 1));
        } else {
            String strSubstring4 = datePickerDialog2.onWarmupCompleted().substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, BuildConfig.FLAVOR);
            int i5 = Integer.parseInt(strSubstring4);
            String strSubstring5 = datePickerDialog2.onWarmupCompleted().substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring5, BuildConfig.FLAVOR);
            int i6 = Integer.parseInt(strSubstring5);
            String strSubstring6 = datePickerDialog2.onWarmupCompleted().substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, BuildConfig.FLAVOR);
            int i7 = Integer.parseInt(strSubstring6);
            datePickerDialog2.asInterface.setText(datePickerDialog2.getContext().getString(R.string.calender_view_year_month_day, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
            datePickerDialog2.getInterfaceDescriptor.invoke(new Triple(Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        datePickerDialog2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(int i, DatePickerDialog2 datePickerDialog2, NumberPicker numberPicker, int i2, int i3) {
        int i4 = i + i3;
        datePickerDialog2.onNavigationEvent(datePickerDialog2.access100, datePickerDialog2.IAuthTabCallback_Parcel, i4);
        datePickerDialog2.IAuthTabCallback(datePickerDialog2.access100, datePickerDialog2.IAuthTabCallback_Parcel, i4, datePickerDialog2.extraCallbackWithResult().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(int i, DatePickerDialog2 datePickerDialog2, NumberPicker numberPicker, int i2, int i3) {
        datePickerDialog2.IAuthTabCallback(datePickerDialog2.access100, datePickerDialog2.IAuthTabCallback_Parcel, i + datePickerDialog2.onMinimized().getValue(), i3);
    }

    private final void IAuthTabCallback(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(1);
        int i2 = calendar2.get(1) - i;
        int value = onMinimized().getValue();
        onMinimized().setDisplayedValues(null);
        onMinimized().setMinValue(0);
        onMinimized().setMaxValue(Math.max(0, i2));
        NumberPicker numberPickerOnMinimized = onMinimized();
        IntRange intRange = new IntRange(0, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add((it.nextInt() + i) + "년");
        }
        numberPickerOnMinimized.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        onMinimized().setValue(value + i);
    }

    private final void onNavigationEvent(Calendar calendar, Calendar calendar2, int i) {
        int i2 = calendar2.get(1);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(2);
        int i5 = calendar.get(2);
        if (i != i3) {
            i5 = 0;
        }
        if (i != i2) {
            i4 = 11;
        }
        int iCoerceIn = RangesKt.coerceIn(extraCallbackWithResult().getValue(), i5, i4);
        extraCallbackWithResult().setDisplayedValues(null);
        extraCallbackWithResult().setMinValue(i5);
        extraCallbackWithResult().setMaxValue(i4);
        NumberPicker numberPickerExtraCallbackWithResult = extraCallbackWithResult();
        IntRange intRange = new IntRange(i5, i4);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add((it.nextInt() + 1) + "월");
        }
        numberPickerExtraCallbackWithResult.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
        extraCallbackWithResult().setValue(iCoerceIn);
    }

    private final void IAuthTabCallback(Calendar calendar, Calendar calendar2, int i, int i2) {
        int i3 = calendar2.get(1);
        int i4 = calendar.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar.get(2);
        int actualMaximum = calendar2.get(5);
        int i7 = calendar.get(5);
        if (i4 != i || i6 != i2) {
            i7 = 1;
        }
        int i8 = i7 - 1;
        if (i3 != i || i5 != i2) {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(1, i);
            calendar3.set(2, i2);
            calendar3.set(5, 1);
            actualMaximum = calendar3.getActualMaximum(5);
        }
        int i9 = actualMaximum - 1;
        int iCoerceIn = RangesKt.coerceIn(writeTypedObject().getValue(), i8, i9);
        writeTypedObject().setDisplayedValues(null);
        writeTypedObject().setMinValue(i8);
        writeTypedObject().setMaxValue(i9);
        writeTypedObject().setValue(iCoerceIn);
        NumberPicker numberPickerWriteTypedObject = writeTypedObject();
        IntRange intRange = new IntRange(i8, i9);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add((it.nextInt() + 1) + "일");
        }
        numberPickerWriteTypedObject.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private final EditText onWarmupCompleted(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return (EditText) view;
            }
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, BuildConfig.FLAVOR);
            EditText editTextOnWarmupCompleted = onWarmupCompleted(childAt);
            if (editTextOnWarmupCompleted != null) {
                return editTextOnWarmupCompleted;
            }
        }
        return null;
    }

    public final String onWarmupCompleted() {
        int value = onMinimized().getValue();
        int i = this.access100.get(1);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(extraCallbackWithResult().getValue() + 1)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, BuildConfig.FLAVOR);
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(writeTypedObject().getValue() + 1)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, BuildConfig.FLAVOR);
        return (value + i) + str + str2;
    }
}
