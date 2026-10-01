package im.toss.uikit.widget.textField;

import android.R;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.widget.textField.TextFieldV2$;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AFk1qSDK;
import o.Address;
import o.AppLovinSdkSettings;
import o.CertificatePinnerBuilder;
import o.TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0;
import o.TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0;
import o.TransitionKtExternalSyntheticLambda2;
import o.UpdatableAnimationStateExternalSyntheticLambda0;
import o.UpdatableAnimationStateExternalSyntheticLambda1;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.matches;
import o.readIntokhttp;
import o.registerCrashCallback;
import o.response;
import o.setCodeBundleId;
import o.setHeadersokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TextFieldV2 extends ConstraintLayout {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private Rally IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private onWarmupCompleted IAuthTabCallbackStub;
    private CharSequence asBinder;
    private Rally asInterface;
    private boolean getInterfaceDescriptor;
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private int onNavigationEvent;
    private boolean onTransact;
    private final AFk1qSDK onWarmupCompleted;

    public interface IAuthTabCallback {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(view);
        }
        asInterface(view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TextFieldV2 textFieldV2, UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {textFieldV2, updatableAnimationStateExternalSyntheticLambda1, Float.valueOf(f), Float.valueOf(f2)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        if (i3 != 0) {
            onWarmupCompleted(iOnExtraCallbackWithResult3, objArr, -1546212912, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1546212917);
            throw null;
        }
        onWarmupCompleted(iOnExtraCallbackWithResult3, objArr, -1546212912, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1546212917);
        int i4 = access100 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(textFieldV2, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(textFieldV2, view);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(textFieldV2, view);
        int i4 = IAuthTabCallback_Parcel + 67;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i5)) | i8 | (~(i6 | i5));
        int i10 = (~((~i6) | i2)) | (~(i2 | i5));
        int i11 = (~((~i5) | i7)) | i8;
        int i12 = i2 + i6 + i4 + (1821889583 * i) + ((-349070011) * i3);
        int i13 = i12 * i12;
        int i14 = (575745661 * i2) + 325058560 + (1920428227 * i6) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i4) + (473956352 * i) + (1723858944 * i3) + ((-1436549120) * i13);
        int i15 = (i2 * 921699331) + 387174459 + (i6 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i4 * 921699455) + (i * 347275089) + (i3 * 1925323067) + (i13 * 94371840);
        switch (i14 + (i15 * i15 * (-174063616))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(view);
        int i3 = IAuthTabCallback_Parcel + 89;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        Drawable drawable;
        CharSequence string;
        CharSequence string2;
        CharSequence string3;
        boolean z;
        boolean z2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1qSDK aFk1qSDKIAuthTabCallback = AFk1qSDK.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1qSDKIAuthTabCallback, "");
        this.onWarmupCompleted = aFk1qSDKIAuthTabCallback;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnPostMessage = new getUrlokhttp(new onExtraCallback(configuration)).onPostMessage();
        this.onExtraCallback = iOnPostMessage;
        this.IAuthTabCallbackDefault = iOnPostMessage;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        this.onNavigationEvent = new getUrlokhttp(new asInterface(configuration2)).requestPostMessageChannel().ICustomTabsService_Parcel();
        registerCrashCallback registercrashcallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
        StateListAnimator stateListAnimator = new StateListAnimator();
        onExtraCallbackWithResult(stateListAnimator, -16842910);
        onExtraCallbackWithResult(stateListAnimator, R.attr.state_selected);
        onExtraCallbackWithResult(stateListAnimator, -16842908);
        onExtraCallbackWithResult(stateListAnimator, R.attr.state_focused);
        registercrashcallbackOnExtraCallbackWithResult.setStateListAnimator(stateListAnimator);
        onExtraCallbackWithResult().addTextChangedListener(new TextWatcher() { // from class: im.toss.uikit.widget.textField.TextFieldV2.1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 97;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 71;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 15;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {TextFieldV2.this};
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                if (i4 != 0) {
                    TextFieldV2.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, -30214396, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 30214399);
                    return;
                }
                TextFieldV2.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, -30214396, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 30214399);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onWarmupCompleted().setOnClickListener(new TextFieldV2$.ExternalSyntheticLambda3(this));
        IAuthTabCallbackStub().setOnClickListener(new TextFieldV2$.ExternalSyntheticLambda4(this));
        onNavigationEvent().setOnClickListener(new TextFieldV2$.ExternalSyntheticLambda5(this));
        int i2 = 1;
        CharSequence charSequence = null;
        Drawable drawableOnExtraCallback = null;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.TextFieldV2, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            TypedValue typedValue3 = new TypedValue();
            TypedValue typedValue4 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextFieldV2_textFieldMessage, typedValue);
            CharSequence string4 = typedValue.type == 1 ? getResources().getString(typedValue.resourceId) : typedValue.string;
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextFieldV2_textFieldHint, typedValue2);
            if (typedValue2.type == 1) {
                string = getResources().getString(typedValue2.resourceId);
                int i4 = IAuthTabCallback_Parcel + 37;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } else {
                string = typedValue2.string;
            }
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextFieldV2_textFieldText, typedValue3);
            if (typedValue3.type == 1) {
                string2 = getResources().getString(typedValue3.resourceId);
            } else {
                string2 = typedValue3.string;
                int i6 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.getValue(im.toss.uikit.R.styleable.TextFieldV2_textFieldSuffix, typedValue4);
            if (typedValue4.type == 1) {
                int i7 = access100 + 15;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    getResources().getString(typedValue4.resourceId);
                    throw null;
                }
                string3 = getResources().getString(typedValue4.resourceId);
            } else {
                string3 = typedValue4.string;
                int i8 = IAuthTabCallback_Parcel + 5;
                access100 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            try {
                drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getResources(), typedArrayObtainStyledAttributes.getResourceId(im.toss.uikit.R.styleable.TextFieldV2_textFieldIcon, 0), (Resources.Theme) null);
            } catch (Resources.NotFoundException | NullPointerException unused) {
            }
            int color = typedArrayObtainStyledAttributes.getColor(im.toss.uikit.R.styleable.TextFieldV2_textFieldIconColor, 0);
            z2 = typedArrayObtainStyledAttributes.getBoolean(im.toss.uikit.R.styleable.TextFieldV2_textFieldClearable, false);
            int i11 = typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextFieldV2_textFieldInputType, 1);
            int i12 = typedArrayObtainStyledAttributes.getInt(im.toss.uikit.R.styleable.TextFieldV2_textFieldMaxLength, -1);
            if (i12 >= 0) {
                onExtraCallbackWithResult().setFilters(new InputFilter[]{new InputFilter.LengthFilter(i12)});
            }
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(im.toss.uikit.R.styleable.TextFieldV2_textFieldShowPasswordToggle, false);
            typedArrayObtainStyledAttributes.recycle();
            int i13 = access100 + 113;
            IAuthTabCallback_Parcel = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 % 3;
            } else {
                int i15 = 2 % 2;
            }
            drawable = drawableOnExtraCallback;
            i2 = i11;
            charSequence = string4;
            z = z3;
            i3 = color;
        } else {
            drawable = null;
            string = null;
            string2 = null;
            string3 = null;
            z = false;
            z2 = false;
        }
        setInputType(i2);
        setMessage(charSequence);
        setHint(string);
        setText(string2);
        setSuffix(string3);
        setIcon(drawable, i3);
        setShowPasswordToggle(z);
        setClearable(z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access100 + 103;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback_Parcel + 87;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onNavigationEvent(TextFieldV2 textFieldV2) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{textFieldV2}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1904429731);
        int i4 = IAuthTabCallback_Parcel + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TextFieldV2 textFieldV2 = (TextFieldV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        textFieldV2.access100();
        int i4 = IAuthTabCallback_Parcel + 37;
        access100 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final BaseEditText onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        BaseEditText baseEditText = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(baseEditText, "");
        int i4 = access100 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return baseEditText;
        }
        throw null;
    }

    private final View onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.onWarmupCompleted.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i4 = IAuthTabCallback_Parcel + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    private final TdsImageView onWarmupCompleted() {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            tdsImageView = this.onWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            int i3 = 0 / 0;
        } else {
            tdsImageView = this.onWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        }
        int i4 = access100 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private final TdsImageView asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.onWarmupCompleted.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = IAuthTabCallback_Parcel + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return tdsImageView;
    }

    private final TdsImageView IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onWarmupCompleted.IAuthTabCallbackDefault, "");
            throw null;
        }
        TdsImageView tdsImageView = this.onWarmupCompleted.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        return tdsImageView;
    }

    private final View onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        View view = this.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int i4 = IAuthTabCallback_Parcel + 83;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = IAuthTabCallback + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onWarmupCompleted;

        public asInterface(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = IAuthTabCallback + 107;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i5 = onExtraCallback + 87;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 == 0) {
                    int i7 = 12 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            if (r1 != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r2 = 79 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = im.toss.uikit.widget.textField.TextFieldV2.onExtraCallback.IAuthTabCallback + 79;
            im.toss.uikit.widget.textField.TextFieldV2.onExtraCallback.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
        }
    }

    private final BaseTextView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Typography7 typography7 = this.onWarmupCompleted.asBinder;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        int i4 = access100 + 111;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return typography7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final BaseTextView asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Typography1 typography1 = this.onWarmupCompleted.access100;
            Intrinsics.checkNotNullExpressionValue(typography1, "");
            return typography1;
        }
        Typography1 typography12 = this.onWarmupCompleted.access100;
        Intrinsics.checkNotNullExpressionValue(typography12, "");
        int i3 = 34 / 0;
        return typography12;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult().length();
            throw null;
        }
        int length = onExtraCallbackWithResult().length();
        int i3 = IAuthTabCallback_Parcel + 109;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
        return length;
    }

    public final void setOnClearListener(@Nullable onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = onwarmupcompleted;
        int i5 = i2 + 15;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onWarmupCompleted(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            textFieldV2.setText((CharSequence) null);
            onWarmupCompleted onwarmupcompleted = textFieldV2.IAuthTabCallbackStub;
            int i3 = IAuthTabCallback_Parcel + 25;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        textFieldV2.setText((CharSequence) null);
        onWarmupCompleted onwarmupcompleted2 = textFieldV2.IAuthTabCallbackStub;
        throw null;
    }

    private static final void IAuthTabCallback(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        textFieldV2.onNavigationEvent(!textFieldV2.onTransact);
        int i4 = IAuthTabCallback_Parcel + 125;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void onExtraCallback(ValueAnimator valueAnimator, TextFieldV2 textFieldV2, ValueAnimator valueAnimator2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        Intrinsics.checkNotNull(valueAnimator.getAnimatedValue(), "");
        View viewOnTransact = textFieldV2.onTransact();
        Intrinsics.checkNotNullExpressionValue(textFieldV2.getResources().getDisplayMetrics(), "");
        viewOnTransact.setTranslationX(varyMatches.onNavigationEvent((Float) r3, r4));
        int i4 = access100 + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(TextFieldV2 textFieldV2, View view) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(2.0f, -2.0f, 2.0f, -2.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new TextFieldV2$.ExternalSyntheticLambda6(valueAnimatorOfFloat, textFieldV2));
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        int i2 = access100 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        onExtraCallbackWithResult().setFont(responseVar);
        int i4 = IAuthTabCallback_Parcel + 33;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setFont(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult().setFont(i);
            throw null;
        }
        onExtraCallbackWithResult().setFont(i);
        int i4 = access100 + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(StateListAnimator stateListAnimator, int i) {
        int i2 = 2 % 2;
        int[] iArr = {i};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addListener(new onNavigationEvent(this, i));
        Unit unit = Unit.INSTANCE;
        stateListAnimator.addState(iArr, valueAnimatorOfFloat);
        int i3 = IAuthTabCallback_Parcel + 41;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        TextFieldV2 textFieldV2 = (TextFieldV2) objArr[0];
        int i2 = 2 % 2;
        int i3 = access100 + 35;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        textFieldV2.onExtraCallbackWithResult().isEnabled();
        boolean zIsSelected = textFieldV2.onExtraCallbackWithResult().isSelected();
        boolean zIsFocused = textFieldV2.onExtraCallbackWithResult().isFocused();
        BaseTextView baseTextViewIAuthTabCallbackDefault = textFieldV2.IAuthTabCallbackDefault();
        if (!(!zIsSelected)) {
            i = textFieldV2.onNavigationEvent;
        } else if (zIsFocused) {
            int i5 = textFieldV2.IAuthTabCallbackDefault;
            int i6 = IAuthTabCallback_Parcel + 1;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            i = i5;
        } else {
            i = textFieldV2.onExtraCallback;
        }
        baseTextViewIAuthTabCallbackDefault.setTextColor(i);
        textFieldV2.access100();
        return null;
    }

    public final void setMessageColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 21;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            this.onExtraCallback = i;
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1904429731);
            int i4 = 59 / 0;
            return;
        }
        this.onExtraCallback = i;
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1904429731);
    }

    public final void setMessageFocusedColor(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallbackDefault = i;
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1904429731);
            int i4 = 23 / 0;
        } else {
            this.IAuthTabCallbackDefault = i;
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, -1904429731);
        }
        int i5 = IAuthTabCallback_Parcel + 103;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setMessageErrorColor(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = i;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1904429731);
        int i5 = IAuthTabCallback_Parcel + 31;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult().setText(charSequence);
        onExtraCallbackWithResult().setSelection(onExtraCallback());
        int i4 = IAuthTabCallback_Parcel + 71;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        setText(getResources().getString(i));
        int i5 = IAuthTabCallback_Parcel + 23;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        onTransact().setContentDescription(String.valueOf(onExtraCallbackWithResult().getHint()));
        onWarmupCompleted().setContentDescription(((Object) onExtraCallbackWithResult().getHint()) + " 삭제");
        int i2 = IAuthTabCallback_Parcel + 61;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    public final void setInputType(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 9;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int selectionEnd = onExtraCallbackWithResult().getSelectionEnd();
        onExtraCallbackWithResult().setInputType(i);
        int i5 = 0;
        Integer[] numArr = {128, 16};
        while (true) {
            Object obj = null;
            if (i5 >= 2) {
                onExtraCallbackWithResult().setTransformationMethod(null);
                break;
            }
            int i6 = access100 + 105;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                int iIntValue = numArr[i5].intValue();
                if ((i & iIntValue) == iIntValue) {
                    onExtraCallbackWithResult().setTransformationMethod(new setCodeBundleId());
                    break;
                }
                i5++;
            } else {
                numArr[i5].intValue();
                obj.hashCode();
                throw null;
            }
        }
        onExtraCallbackWithResult().setFont(response.Medium);
        onExtraCallbackWithResult().setSelection(selectionEnd);
    }

    public final void setMessage(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault().setText(charSequence);
        this.asBinder = IAuthTabCallbackDefault().getText();
        ICustomTabsCallback();
        onExtraCallbackWithResult().setSelected(false);
        int i4 = IAuthTabCallback_Parcel + 1;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMessage(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 61;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            setMessage(getResources().getString(i));
            throw null;
        }
        setMessage(getResources().getString(i));
        int i4 = IAuthTabCallback_Parcel + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setError(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            if (TextUtils.isEmpty(charSequence)) {
                setMessage(this.asBinder);
                int i3 = IAuthTabCallback_Parcel + 31;
                access100 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                onWarmupCompleted(!Intrinsics.areEqual(IAuthTabCallbackDefault().getText().toString(), String.valueOf(charSequence)));
                IAuthTabCallbackDefault().setText(charSequence);
                onExtraCallbackWithResult().setSelected(true);
            }
            ICustomTabsCallback();
            return;
        }
        TextUtils.isEmpty(charSequence);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TextFieldV2 textFieldV2 = (TextFieldV2) objArr[0];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        textFieldV2.onTransact().setTranslationX(fFloatValue);
        int i4 = access100 + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Object obj = null;
        if (z) {
            BaseTextView baseTextViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.25f, 1.0f, 0.5f, 1.0f);
            Intrinsics.checkNotNullExpressionValue(interpolatorIAuthTabCallback, "");
            AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(interpolatorIAuthTabCallback, 600);
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{baseTextViewIAuthTabCallbackDefault, isMuted.onNavigationEvent(isMuted.IAuthTabCallback_Parcel(appLovinSdkSettingsOnExtraCallback, Float.valueOf(varyMatches.onNavigationEvent(-5, r3)), fValueOf, (Function1) null, 4, (Object) null), fValueOf, Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = new TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0(new UpdatableAnimationStateExternalSyntheticLambda0(varyMatches.onNavigationEvent(-16, r2)));
        TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0 = new TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0();
        transformableStateKtanimateRotateBy2ExternalSyntheticLambda0.onExtraCallbackWithResult(1500.0f);
        transformableStateKtanimateRotateBy2ExternalSyntheticLambda0.onWarmupCompleted(0.2f);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.onExtraCallbackWithResult(transformableStateKtanimateRotateBy2ExternalSyntheticLambda0);
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.IAuthTabCallback(new UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallbackWithResult() { // from class: im.toss.uikit.widget.textField.TextFieldV2$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void onAnimationUpdate(UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 101;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                TextFieldV2.IAuthTabCallback(this.f$0, updatableAnimationStateExternalSyntheticLambda1, f, f2);
                int i7 = onExtraCallbackWithResult + 99;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.asInterface(0.0f);
        int i4 = IAuthTabCallback_Parcel + 95;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 51;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        setError(getResources().getString(i));
        int i5 = access100 + 75;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            if (IAuthTabCallbackDefault().length() != 0) {
                IAuthTabCallbackDefault().setVisibility(0);
                return;
            }
            IAuthTabCallbackDefault().setVisibility(8);
            int i3 = access100 + 95;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallbackDefault().length();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSuffix(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        asInterface().setText(charSequence);
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, -1788258781, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1788258782);
        int i4 = IAuthTabCallback_Parcel + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSuffix(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            setSuffix(getResources().getString(i));
            throw null;
        }
        setSuffix(getResources().getString(i));
        int i4 = IAuthTabCallback_Parcel + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TextFieldV2 textFieldV2 = (TextFieldV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        textFieldV2.access100();
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        int i5 = access100 + 33;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ void setIcon$default(TextFieldV2 textFieldV2, Drawable drawable, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback_Parcel + 107;
            access100 = i4 % 128;
            i = i4 % 2 == 0 ? 1 : 0;
        }
        textFieldV2.setIcon(drawable, i);
        int i5 = access100 + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
    }

    public final void setIcon(@Nullable Drawable drawable, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 17;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        asBinder().setImageDrawable(drawable);
        if (i != 0) {
            asBinder().setColorFilter(i);
        } else {
            int i5 = access100 + 45;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            asBinder().setColorFilter(null);
        }
        writeTypedObject();
    }

    public static /* synthetic */ void setIcon$default(TextFieldV2 textFieldV2, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = access100 + 47;
            IAuthTabCallback_Parcel = i5 % 128;
            i2 = i5 % 2 != 0 ? 1 : 0;
        }
        textFieldV2.setIcon(i, i2);
        int i6 = IAuthTabCallback_Parcel + 87;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIcon(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        setIcon(ResourcesCompat.onExtraCallback(getResources(), i, (Resources.Theme) null), i2);
        int i6 = IAuthTabCallback_Parcel + 53;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        asBinder().setVisibility(0);
        r1 = im.toss.uikit.widget.textField.TextFieldV2.IAuthTabCallback_Parcel + 43;
        im.toss.uikit.widget.textField.TextFieldV2.access100 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (asBinder().getDrawable() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (asBinder().getDrawable() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = im.toss.uikit.widget.textField.TextFieldV2.IAuthTabCallback_Parcel + 63;
        im.toss.uikit.widget.textField.TextFieldV2.access100 = r1 % 128;
        r1 = r1 % 2;
        asBinder().setVisibility(8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    public final void setShowPasswordToggle(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = z;
        access100();
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1960739029, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1960739029);
        int i4 = access100 + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, im.toss.uikit.widget.textField.TextFieldV2] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iOnActivityResized;
        int i = 0;
        ?? r8 = (TextFieldV2) objArr[0];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 51;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        TdsImageView tdsImageViewIAuthTabCallbackStub = r8.IAuthTabCallbackStub();
        if (!((TextFieldV2) r8).getInterfaceDescriptor) {
            i = 8;
        } else {
            int i5 = IAuthTabCallback_Parcel + 31;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        tdsImageViewIAuthTabCallbackStub.setVisibility(i);
        r8.IAuthTabCallbackStub().setImageResource(!((TextFieldV2) r8).onTransact ? im.toss.uikit.R.drawable.icon_eye_off_mono : im.toss.uikit.R.drawable.icon_eye_on_mono);
        TdsImageView tdsImageViewIAuthTabCallbackStub2 = r8.IAuthTabCallbackStub();
        if (((TextFieldV2) r8).onTransact) {
            Context context = r8.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnActivityResized = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        } else {
            Context context2 = r8.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnActivityResized = new getUrlokhttp(new asBinder(configuration2)).onActivityResized();
        }
        tdsImageViewIAuthTabCallbackStub2.setColorFilter(iOnActivityResized);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if (r13 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(boolean z) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 33;
        access100 = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            i = 114;
            i2 = 8008;
            this.onTransact = z;
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1960739029, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1960739029);
            if (z) {
                i5 = 1;
                int i6 = IAuthTabCallback_Parcel + 123;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                Integer[] numArr = {i2, i};
                while (i5 < 2) {
                    int iIntValue = numArr[i5].intValue();
                    if ((onExtraCallbackWithResult().getInputType() & iIntValue) == iIntValue) {
                        setInputType(onExtraCallbackWithResult().getInputType() - iIntValue);
                    }
                    i5++;
                }
                return;
            }
            Pair[] pairArr = {new Pair(1, i2), new Pair(2, i)};
            while (i5 < 2) {
                Pair pair = pairArr[i5];
                if ((onExtraCallbackWithResult().getInputType() & ((Number) pair.getFirst()).intValue()) == ((Number) pair.getFirst()).intValue()) {
                    int i8 = IAuthTabCallback_Parcel + 17;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                    setInputType(onExtraCallbackWithResult().getInputType() + ((Number) pair.getSecond()).intValue());
                }
                i5++;
            }
            return;
        }
        i = 16;
        i2 = 128;
        this.onTransact = z;
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1960739029, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1960739029);
    }

    public final void setClearable(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = z;
        access100();
        int i4 = IAuthTabCallback_Parcel + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (onExtraCallbackWithResult().isFocused() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if ((!onExtraCallbackWithResult().isFocused()) != true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        access000();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (!this.onExtraCallbackWithResult || this.getInterfaceDescriptor) {
            IAuthTabCallback_Parcel();
            return;
        }
        int i5 = i3 + 51;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        if (onExtraCallback() > 0) {
            int i7 = access100 + 69;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 44 / 0;
            }
        }
        IAuthTabCallback_Parcel();
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, onWarmupCompleted()};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, 2102561342, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2102561340);
        if (asInterface().length() > 0) {
            int i4 = access100 + 35;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback((View) asInterface());
        }
        int i6 = access100 + 13;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        if (asInterface().length() <= 0) {
            IAuthTabCallback((View) asInterface());
        } else {
            int i2 = access100 + 23;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this, asInterface()};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, 2102561342, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2102561340);
        }
        IAuthTabCallback((View) onWarmupCompleted());
        int i4 = IAuthTabCallback_Parcel + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float scaleX;
        TextFieldV2 textFieldV2 = (TextFieldV2) objArr[0];
        final View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Rally rally = textFieldV2.asInterface;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(Address.onNavigationEvent.IAuthTabCallback(), 300);
        float alpha = 0.0f;
        if (view.getVisibility() == 0) {
            scaleX = view.getScaleX();
            int i4 = IAuthTabCallback_Parcel + 35;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 3;
            }
        } else {
            scaleX = 0.0f;
        }
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(appLovinSdkSettingsOnExtraCallback, Float.valueOf(scaleX), fValueOf, (Function1) null, 4, (Object) null);
        if (view.getVisibility() == 0) {
            int i6 = access100 + 111;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                alpha = view.getAlpha();
                int i7 = 69 / 0;
            } else {
                alpha = view.getAlpha();
            }
        }
        Rally rallyOnTransact = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(appLovinSdkSettingsAsBinder, Float.valueOf(alpha), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new Function0() { // from class: im.toss.uikit.widget.textField.TextFieldV2$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 19;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr2 = {view};
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                Unit unit = (Unit) TextFieldV2.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr2, -1918951975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1918951979);
                int i11 = IAuthTabCallback + 69;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return unit;
            }
        }, 1, (Object) null);
        isFireOS.onExtraCallbackWithResult(rallyOnTransact, false, 1, (Object) null);
        textFieldV2.asInterface = rallyOnTransact;
        return null;
    }

    private static final Unit asInterface(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(final View view) {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        Rally rally = this.IAuthTabCallback;
        if (rally != null) {
            int i2 = IAuthTabCallback_Parcel + 51;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            rally.ICustomTabsServiceStub();
            int i4 = IAuthTabCallback_Parcel + 97;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.onNavigationEvent(isMuted.asBinder(RallysKt.onExtraCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), 300), Float.valueOf(view.getScaleX()), fValueOf, (Function1) null, 4, (Object) null), Float.valueOf(view.getAlpha()), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.uikit.widget.textField.TextFieldV2$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnWarmupCompleted;
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    unitOnWarmupCompleted = TextFieldV2.onWarmupCompleted(view);
                    int i8 = 50 / 0;
                } else {
                    unitOnWarmupCompleted = TextFieldV2.onWarmupCompleted(view);
                }
                int i9 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Rally rally2 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226);
        isFireOS.onExtraCallbackWithResult(rally2, false, 1, (Object) null);
        this.IAuthTabCallback = rally2;
    }

    private static final Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 57;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHint(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        registerCrashCallback registercrashcallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
        CertificatePinnerBuilder.onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        registercrashcallbackOnExtraCallbackWithResult.setHint(onwarmupcompleted.onNavigationEvent(context, charSequence));
        onExtraCallbackWithResult().setSelection(onExtraCallback());
        getInterfaceDescriptor();
        int i4 = IAuthTabCallback_Parcel + 61;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHint(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 91;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        setHint(getResources().getString(i));
        int i5 = access100 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setImeOptions(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult().setImeOptions(i);
        if (i4 != 0) {
            throw null;
        }
    }

    public final void setSelection(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult().setSelection(i);
            throw null;
        }
        onExtraCallbackWithResult().setSelection(i);
        int i4 = IAuthTabCallback_Parcel + 83;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setSelection(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult().setSelection(i, i2);
        int i6 = IAuthTabCallback_Parcel + 113;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void setNumberFormat$default(TextFieldV2 textFieldV2, int i, IAuthTabCallback iAuthTabCallback, int i2, Object obj) {
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback_Parcel + 3;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            i = -1;
        }
        if ((i2 & 2) != 0) {
            int i5 = IAuthTabCallback_Parcel + 33;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallback = null;
        }
        textFieldV2.setNumberFormat(i, iAuthTabCallback);
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        private String IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
        private int asBinder;
        final /* synthetic */ IAuthTabCallback onExtraCallback;
        final /* synthetic */ int onNavigationEvent;
        final /* synthetic */ DecimalFormat onWarmupCompleted;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackDefault + 27;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            int i7 = asInterface + 9;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, int i, DecimalFormat decimalFormat) {
            this.onExtraCallback = iAuthTabCallback;
            this.onNavigationEvent = i;
            this.onWarmupCompleted = decimalFormat;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(editable, "");
            TextFieldV2.this.onExtraCallbackWithResult().removeTextChangedListener(this);
            InputFilter[] filters = editable.getFilters();
            editable.setFilters(new InputFilter[0]);
            editable.replace(0, editable.length(), this.IAuthTabCallback);
            editable.setFilters(filters);
            TextFieldV2.this.onExtraCallbackWithResult().setSelection(Math.max(0, Math.min(this.asBinder, TextFieldV2.this.onExtraCallbackWithResult().length())));
            TextFieldV2.this.onExtraCallbackWithResult().addTextChangedListener(this);
            if (this.onExtraCallback != null) {
                TextFieldV2.this.onExtraCallbackWithResult().getText();
                TextFieldV2.this.IAuthTabCallback();
                int i4 = asInterface + 119;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = IAuthTabCallbackDefault + 71;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 44 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            int i4;
            long jLongValue;
            int i5 = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            String strReplace = new Regex("[^0-9-]").replace(charSequence, _UrlKt.FRAGMENT_ENCODE_SET);
            if (strReplace.length() == 0) {
                this.IAuthTabCallback = _UrlKt.FRAGMENT_ENCODE_SET;
                this.asBinder = 0;
                return;
            }
            int length = i - new Regex("[^,]").replace(charSequence.subSequence(0, i), _UrlKt.FRAGMENT_ENCODE_SET).length();
            int length2 = new Regex("[^0-9-]").replace(charSequence.subSequence(i, i3 + i).toString(), _UrlKt.FRAGMENT_ENCODE_SET).length();
            Object obj = null;
            if (StringsKt__StringsJVMKt.startsWith$default(strReplace, "-", false, 2, null)) {
                int i6 = IAuthTabCallbackDefault + 23;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str = "-";
            } else {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (this.onNavigationEvent > 0) {
                int i7 = IAuthTabCallbackDefault + 111;
                asInterface = i7 % 128;
                if (i7 % 2 == 0 ? strReplace.length() - str.length() > this.onNavigationEvent : strReplace.length() * str.length() > this.onNavigationEvent) {
                    String strSubstring = strReplace.substring(0, length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    String strSubstring2 = strReplace.substring(length + length2, strReplace.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    String strSubstring3 = strReplace.substring(length, Math.min(length2, (this.onNavigationEvent - (strSubstring.length() - str.length())) - strSubstring2.length()) + length);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    strReplace = strSubstring + strSubstring3 + strSubstring2;
                    length2 = strSubstring3.length();
                }
            }
            int i8 = length + length2;
            int length3 = strReplace.length() - i8;
            int i9 = length3 / 3;
            if (i8 - str.length() == 0) {
                int i10 = asInterface + 65;
                IAuthTabCallbackDefault = i10 % 128;
                i4 = (i10 % 2 != 0 ? length3 % 3 != 0 : length3 % 3 != 0) ? 0 : 1;
            }
            int iMax = Math.max(0, i9 - i4);
            if (!Intrinsics.areEqual(strReplace, "-")) {
                DecimalFormat decimalFormat = this.onWarmupCompleted;
                Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(strReplace);
                if (longOrNull != null) {
                    jLongValue = longOrNull.longValue();
                } else {
                    int i11 = asInterface + 27;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    jLongValue = 0;
                }
                strReplace = decimalFormat.format(jLongValue);
                Intrinsics.checkNotNullExpressionValue(strReplace, "");
                int i13 = IAuthTabCallbackDefault + 83;
                asInterface = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 3;
                }
            }
            this.IAuthTabCallback = strReplace;
            this.asBinder = (strReplace.length() - length3) - iMax;
        }
    }

    public final void setNumberFormat(int i, @Nullable IAuthTabCallback iAuthTabCallback) {
        int i2 = 2 % 2;
        onExtraCallbackWithResult().setText(_UrlKt.FRAGMENT_ENCODE_SET);
        onExtraCallbackWithResult().setInputType(4098);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setNegativePrefix("-");
        onExtraCallbackWithResult().addTextChangedListener(new onExtraCallbackWithResult(iAuthTabCallback, i, decimalFormat));
        int i3 = IAuthTabCallback_Parcel + 41;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void setPhoneFormat() {
        int i = 2 % 2;
        onExtraCallbackWithResult().addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        int i2 = IAuthTabCallback_Parcel + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(new Regex("[^0-9-]").replace(String.valueOf(onExtraCallbackWithResult().getText()), _UrlKt.FRAGMENT_ENCODE_SET));
        if (longOrNull == null) {
            return 0L;
        }
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = longOrNull.longValue();
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return jLongValue;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{view}, -1918951975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1918951979);
    }

    public static final /* synthetic */ void onWarmupCompleted(TextFieldV2 textFieldV2) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{textFieldV2}, -30214396, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 30214399);
    }

    private static final void onExtraCallbackWithResult(TextFieldV2 textFieldV2, UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
        Object[] objArr = {textFieldV2, updatableAnimationStateExternalSyntheticLambda1, Float.valueOf(f), Float.valueOf(f2)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, -1546212912, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1546212917);
    }

    private final void IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1904429737, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1904429731);
    }

    private final void onNavigationEvent(View view) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this, view}, 2102561342, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -2102561340);
    }

    private final void readTypedObject() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1960739029, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1960739029);
    }

    private final void extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, -1788258781, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1788258782);
    }
}
