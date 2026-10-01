package im.toss.uikit.widget.textField;

import android.R;
import android.animation.Animator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.tds.foundation.graphics.drawable.RoundDrawable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1rSDK;
import o.access15300;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.setBodyokhttp;
import o.setHeadersokhttp;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TextFieldSpinner extends ConstraintLayout {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private CharSequence IAuthTabCallback;
    private onExtraCallbackWithResult onExtraCallback;
    private CharSequence onExtraCallbackWithResult;
    private CharSequence onNavigationEvent;
    private final AFk1rSDK onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.MEDIUM.ordinal()] = 2;
                int i = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.BIG.ordinal()] = 3;
                int i4 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldSpinner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldSpinner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i)) | i2;
        int i9 = ~i;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i6;
        int i12 = (~(i2 | i9 | i6)) | (~(i7 | i9 | i10)) | (~(i10 | i | i6));
        int i13 = i + i6 + i5 + ((-104759182) * i3) + ((-453318476) * i4);
        int i14 = i13 * i13;
        int i15 = (i * 1504131295) + 1805123584 + (1504131295 * i6) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i5) + (711983104 * i3) + (1180696576 * i4) + (1022754816 * i14);
        int i16 = ((i * (-1431886989)) - 1507491630) + (i6 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * Imgproc.COLOR_YUV2BGRA_YVYU) + (i5 * (-1431886867)) + (i3 * 722567050) + (i4 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 != 1) {
            return i17 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        TextFieldSpinner textFieldSpinner = (TextFieldSpinner) objArr[0];
        int i18 = 2 % 2;
        int i19 = onTransact + 1;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        if (textFieldSpinner.onExtraCallback != onExtraCallbackWithResult.MEDIUM) {
            return false;
        }
        int i21 = onTransact + 29;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSpinner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1rSDK aFk1rSDKOnNavigationEvent = AFk1rSDK.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1rSDKOnNavigationEvent, "");
        this.onWarmupCompleted = aFk1rSDKOnNavigationEvent;
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.NORMAL;
        this.onExtraCallback = onextracallbackwithresult;
        StateListAnimator stateListAnimator = new StateListAnimator();
        onNavigationEvent(stateListAnimator, -16842910);
        onNavigationEvent(stateListAnimator, R.attr.state_selected);
        onNavigationEvent(stateListAnimator, -16842908);
        onNavigationEvent(stateListAnimator, R.attr.state_focused);
        setStateListAnimator(stateListAnimator);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.TextFieldSpinner, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 2 % 2;
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerType) {
                    onextracallbackwithresult = onExtraCallbackWithResult.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                    int i4 = asInterface + 13;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                } else if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerTitle) {
                    setTextFieldSpinnerTitle(typedArrayObtainStyledAttributes.getString(index));
                } else if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerTitleColor) {
                    setTextFieldSpinnerTitleColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                } else if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerLabel) {
                    setTextFieldSpinnerLabel(typedArrayObtainStyledAttributes.getString(index));
                } else if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerMessage) {
                    setTextFieldSpinnerMessage(typedArrayObtainStyledAttributes.getString(index));
                } else if (index == im.toss.uikit.R.styleable.TextFieldSpinner_textFieldSpinnerHint) {
                    setTextFieldSpinnerHint(typedArrayObtainStyledAttributes.getString(index));
                }
                i3++;
                int i6 = asInterface + 21;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        setTextFieldSpinnerType(onextracallbackwithresult);
        setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.textField.TextFieldSpinner$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 53;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                TextFieldSpinner.onExtraCallback(view);
                if (i10 != 0) {
                    throw null;
                }
            }
        });
        asBinder();
        asInterface();
        int i8 = onTransact + 75;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TextFieldSpinner textFieldSpinner = (TextFieldSpinner) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        textFieldSpinner.asInterface();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onNavigationEvent(TextFieldSpinner textFieldSpinner) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        textFieldSpinner.IAuthTabCallbackStub();
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asInterface + 103;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = asInterface + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onExtraCallbackWithResult NORMAL = new onExtraCallbackWithResult("NORMAL", 0, 0);
        public static final onExtraCallbackWithResult MEDIUM = new onExtraCallbackWithResult("MEDIUM", 1, 1);
        public static final onExtraCallbackWithResult BIG = new onExtraCallbackWithResult("BIG", 2, 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {NORMAL, MEDIUM, BIG};
            int i5 = i3 + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i2 + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            int i5 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallbackWithResult[]) onextracallbackwithresultArr.clone();
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i, int i2) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 61;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public static final class asBinder implements TextWatcher {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
        }

        public asBinder() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {TextFieldSpinner.this};
            TextFieldSpinner.onWarmupCompleted(-199628334, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 199628336);
            int i4 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onExtraCallback + 27;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        return getspecialfeatureoptinstatus;
                    }
                    obj.hashCode();
                    throw null;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i4 = onWarmupCompleted + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onNavigationEvent);
            throw null;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class access000 implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public access000(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class access100 implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onWarmupCompleted;

        public access100(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onNavigationEvent))) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onExtraCallback + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onExtraCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.uikit.widget.textField.TextFieldSpinner.onExtraCallback.onExtraCallbackWithResult + 15;
            im.toss.uikit.widget.textField.TextFieldSpinner.onExtraCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.widget.textField.TextFieldSpinner.onExtraCallback.onExtraCallbackWithResult + 53;
            im.toss.uikit.widget.textField.TextFieldSpinner.onExtraCallback.onExtraCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class writeTypedObject implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public writeTypedObject(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallback + 45;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onNavigationEvent(StateListAnimator stateListAnimator, int i) {
        int i2 = 2 % 2;
        int[] iArr = {i};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addListener(new onWarmupCompleted(i));
        Unit unit = Unit.INSTANCE;
        stateListAnimator.addState(iArr, valueAnimatorOfFloat);
        int i3 = onTransact + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackStub() {
        int iICustomTabsCallbackStubProxy;
        int iOnMinimized;
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewOnExtraCallback = onExtraCallback();
        if (isSelected()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new onTransact(configuration)).requestPostMessageChannel().ICustomTabsService_Parcel();
            int i4 = onTransact + 85;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        } else if (isFocused()) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iICustomTabsCallbackStubProxy = ((Integer) setHeadersokhttp.onExtraCallbackWithResult(494643487, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), -494643478, matches.onExtraCallback())).intValue();
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iICustomTabsCallbackStubProxy = new getUrlokhttp(new IAuthTabCallbackStub(configuration3)).ICustomTabsCallbackStubProxy();
        }
        baseTextViewOnExtraCallback.setTextColor(iICustomTabsCallbackStubProxy);
        BaseTextView baseTextViewIAuthTabCallback = IAuthTabCallback();
        if (isSelected()) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            iOnMinimized = new getUrlokhttp(new access000(configuration4)).requestPostMessageChannel().ICustomTabsService_Parcel();
        } else {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            iOnMinimized = new getUrlokhttp(new access100(configuration5)).requestPostMessageChannel().onMinimized();
        }
        baseTextViewIAuthTabCallback.setTextColor(iOnMinimized);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextFieldSpinnerType(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i;
        int i2;
        int i3 = 2 % 2;
        Float fValueOf = Float.valueOf(4.0f);
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallback = onextracallbackwithresult;
        int i4 = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            this.onWarmupCompleted.onTransact.setBackground(onWarmupCompleted(isEnabled()));
            onExtraCallback().setTextSize(2, 13.0f);
            BaseTextView baseTextViewOnExtraCallback = onExtraCallback();
            int paddingLeft = onExtraCallback().getPaddingLeft();
            int paddingTop = onExtraCallback().getPaddingTop();
            int paddingTop2 = onExtraCallback().getPaddingTop();
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            baseTextViewOnExtraCallback.setPadding(paddingLeft, paddingTop, paddingTop2, varyMatches.onNavigationEvent(Float.valueOf(6.0f), displayMetrics));
            BaseTextView[] baseTextViewArr = {(BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137), IAuthTabCallbackDefault()};
            for (int i5 = 0; i5 < 2; i5++) {
                BaseTextView baseTextView = baseTextViewArr[i5];
                baseTextView.setTextSize(2, 17.0f);
                DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(12.0f), displayMetrics2);
                DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                baseTextView.setPadding(iOnNavigationEvent, varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics3), ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).getPaddingRight(), ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).getPaddingBottom());
            }
            TdsImageView tdsImageViewOnWarmupCompleted = onWarmupCompleted();
            ViewGroup.LayoutParams layoutParams = onWarmupCompleted().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Resources resources = getResources();
            int i6 = im.toss.tds.view.R.dimen.list_row_padding_right_16;
            marginLayoutParams.rightMargin = resources.getDimensionPixelSize(i6);
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(i6));
            tdsImageViewOnWarmupCompleted.setLayoutParams(marginLayoutParams);
            return;
        }
        if (i4 == 2) {
            TdsRoundLayout tdsRoundLayout = this.onWarmupCompleted.onExtraCallbackWithResult;
            tdsRoundLayout.setStrokeWidth(0.0f);
            tdsRoundLayout.setRadius(0.0f);
            tdsRoundLayout.setBackgroundColor(0);
            View view = this.onWarmupCompleted.onTransact;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            view.setBackgroundResource(readIntokhttp.onWarmupCompleted(configuration) ? im.toss.uikit.R.drawable.text_field_underline_big_selector_accessibility : im.toss.uikit.R.drawable.text_field_underline_big_selector);
            onExtraCallback().setTextSize(2, 13.0f);
            onExtraCallback().setPadding(onExtraCallback().getPaddingLeft(), onExtraCallback().getPaddingTop(), onExtraCallback().getPaddingTop(), 0);
            BaseTextView[] baseTextViewArr2 = {(BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137), IAuthTabCallbackDefault()};
            int i7 = 0;
            while (i7 < 2) {
                int i8 = asInterface + 125;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
                    BaseTextView baseTextView2 = baseTextViewArr2[i7];
                    baseTextView2.setTextSize(2, 22.0f);
                    baseTextView2.setPadding(0, 0, 0, 0);
                    i7 += 73;
                } else {
                    BaseTextView baseTextView3 = baseTextViewArr2[i7];
                    baseTextView3.setTextSize(2, 22.0f);
                    baseTextView3.setPadding(0, 0, 0, 0);
                    i7++;
                }
            }
            TdsImageView tdsImageViewOnWarmupCompleted2 = onWarmupCompleted();
            ViewGroup.LayoutParams layoutParams2 = onWarmupCompleted().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            DisplayMetrics displayMetrics4 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            marginLayoutParams2.rightMargin = varyMatches.onNavigationEvent(fValueOf, displayMetrics4);
            DisplayMetrics displayMetrics5 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            marginLayoutParams2.setMarginEnd(varyMatches.onNavigationEvent(fValueOf, displayMetrics5));
            tdsImageViewOnWarmupCompleted2.setLayoutParams(marginLayoutParams2);
            return;
        }
        int i9 = asInterface;
        int i10 = i9 + 75;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i12 = i9 + 11;
        onTransact = i12 % 128;
        int i13 = i12 % 2;
        TdsRoundLayout tdsRoundLayout2 = this.onWarmupCompleted.onExtraCallbackWithResult;
        tdsRoundLayout2.setStrokeWidth(0.0f);
        tdsRoundLayout2.setRadius(0.0f);
        tdsRoundLayout2.setBackgroundColor(0);
        View view2 = this.onWarmupCompleted.onTransact;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onWarmupCompleted(configuration2)) {
            i = im.toss.uikit.R.drawable.text_field_underline_big_selector_accessibility;
            i2 = onTransact + 55;
        } else {
            i = im.toss.uikit.R.drawable.text_field_underline_big_selector;
            i2 = onTransact + 35;
        }
        asInterface = i2 % 128;
        int i14 = i2 % 2;
        view2.setBackgroundResource(i);
        onExtraCallback().setTextSize(2, 16.0f);
        onExtraCallback().setPadding(onExtraCallback().getPaddingLeft(), onExtraCallback().getPaddingTop(), onExtraCallback().getPaddingTop(), 0);
        BaseTextView[] baseTextViewArr3 = {(BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137), IAuthTabCallbackDefault()};
        for (int i15 = 0; i15 < 2; i15++) {
            BaseTextView baseTextView4 = baseTextViewArr3[i15];
            baseTextView4.setTextSize(2, 34.0f);
            DisplayMetrics displayMetrics6 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            baseTextView4.setPadding(0, varyMatches.onNavigationEvent(fValueOf, displayMetrics6), ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).getPaddingRight(), ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).getPaddingBottom());
        }
        TdsImageView tdsImageViewOnWarmupCompleted3 = onWarmupCompleted();
        ViewGroup.LayoutParams layoutParams3 = onWarmupCompleted().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.rightMargin = getResources().getDimensionPixelSize(im.toss.tds.view.R.dimen.list_row_padding_right_8);
        tdsImageViewOnWarmupCompleted3.setLayoutParams(marginLayoutParams3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Drawable onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(this, Float.valueOf(14.0f));
        if (z) {
            ColorDrawable colorDrawable = new ColorDrawable(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Drawable roundDrawable = new RoundDrawable(setBodyokhttp.onNavigationEvent(new getUrlokhttp(new onExtraCallback(configuration)).requestPostMessageChannel().IAuthTabCallbackDefault(), 0.05f), fIAuthTabCallback, 0, false, 12, (DefaultConstructorMarker) null);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            Drawable roundDrawable2 = new RoundDrawable(setBodyokhttp.onNavigationEvent(new getUrlokhttp(new IAuthTabCallback(configuration2)).requestPostMessageChannel().writeTypedList(), 0.05f), fIAuthTabCallback, 0, false, 12, (DefaultConstructorMarker) null);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_focused}, roundDrawable);
            stateListDrawable.addState(new int[]{R.attr.state_selected}, roundDrawable2);
            stateListDrawable.addState(new int[0], colorDrawable);
            int i4 = onTransact + 109;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 57 / 0;
            }
            return stateListDrawable;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration3 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        return new RoundDrawable(new getUrlokhttp(new asInterface(configuration3)).onMessageChannelReady(), fIAuthTabCallback, 0, false, 12, (DefaultConstructorMarker) null);
    }

    public final void setTextFieldSpinnerTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {this};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        if (i3 != 0) {
            ((BaseTextView) onWarmupCompleted(498106137, iOnNavigationEvent, objArr, iOnNavigationEvent3, iOnNavigationEvent4, iOnNavigationEvent2, -498106137)).setText(charSequence);
            obj.hashCode();
            throw null;
        }
        ((BaseTextView) onWarmupCompleted(498106137, iOnNavigationEvent, objArr, iOnNavigationEvent3, iOnNavigationEvent4, iOnNavigationEvent2, -498106137)).setText(charSequence);
        int i4 = onTransact + 17;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setTextFieldSpinnerTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 99;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).setTextColor(i);
        int i5 = onTransact + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTextFieldSpinnerTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).setTextColor(colorStateList);
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setTextFieldSpinnerLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback().setText(charSequence);
            this.IAuthTabCallback = onExtraCallback().getText();
            onExtraCallback().length();
            throw null;
        }
        onExtraCallback().setText(charSequence);
        this.IAuthTabCallback = onExtraCallback().getText();
        if (onExtraCallback().length() <= 0) {
            onExtraCallback().setVisibility(8);
            int i3 = onTransact + 33;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = onTransact + 65;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback().setVisibility(1);
        } else {
            onExtraCallback().setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextFieldSpinnerMessage(@Nullable CharSequence charSequence) {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback().setText(charSequence);
            this.onNavigationEvent = IAuthTabCallback().getText();
            onTransact();
            z = true;
        } else {
            IAuthTabCallback().setText(charSequence);
            this.onNavigationEvent = IAuthTabCallback().getText();
            onTransact();
            z = false;
        }
        setSelected(z);
    }

    public final void setTextFieldSpinnerHint(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult = charSequence;
            asInterface();
            int i3 = asInterface + 49;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallbackWithResult = charSequence;
        asInterface();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r2
      0x006f: PHI (r2v5 java.lang.CharSequence) = (r2v4 java.lang.CharSequence), (r2v6 java.lang.CharSequence) binds: [B:21:0x00a4, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void asInterface() {
        int i;
        int i2 = 2 % 2;
        CharSequence text = ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).getText();
        CharSequence charSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullExpressionValue(text, "");
        if (text.length() != 0) {
            onExtraCallback().setText(this.IAuthTabCallback);
            IAuthTabCallbackDefault().setText(_UrlKt.FRAGMENT_ENCODE_SET);
            IAuthTabCallbackDefault().setVisibility(8);
            return;
        }
        int i3 = asInterface + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextViewOnExtraCallback = onExtraCallback();
        CharSequence charSequence2 = this.onExtraCallbackWithResult;
        if (charSequence2 != null) {
            if (charSequence2.length() == 0) {
                i = asInterface + 15;
            } else {
                charSequence = this.IAuthTabCallback;
                i = asInterface + 7;
            }
            onTransact = i % 128;
            int i5 = i % 2;
        }
        baseTextViewOnExtraCallback.setText(charSequence);
        BaseTextView baseTextViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        CharSequence charSequence3 = this.onExtraCallbackWithResult;
        CharSequence charSequence4 = null;
        if (charSequence3 == null) {
            charSequence3 = this.IAuthTabCallback;
            if (charSequence3 != null) {
                int i6 = asInterface + 49;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                if (!(!((Boolean) onWarmupCompleted(1656550438, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1656550437)).booleanValue())) {
                    charSequence4 = charSequence3;
                }
            }
        } else {
            if (charSequence3.length() <= 0) {
                charSequence3 = null;
            }
            if (charSequence3 != null) {
            }
        }
        baseTextViewIAuthTabCallbackDefault.setText(charSequence4);
        IAuthTabCallbackDefault().setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!(!TextUtils.isEmpty(charSequence))) {
            setTextFieldSpinnerMessage(this.onNavigationEvent);
            int i4 = asInterface + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.onWarmupCompleted.onWarmupCompleted.setText(charSequence);
            setSelected(true);
        }
        onTransact();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setError(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            setError(getResources().getString(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setError(getResources().getString(i));
        int i4 = onTransact + 55;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextFieldSpinnerEnabled(boolean z) {
        int iOnMessageChannelReady;
        int iIntValue;
        int i = 2 % 2;
        if (this.onExtraCallback == onExtraCallbackWithResult.NORMAL) {
            int i2 = asInterface + 75;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TdsRoundLayout tdsRoundLayout = this.onWarmupCompleted.onExtraCallbackWithResult;
            if (z) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iOnMessageChannelReady = new getUrlokhttp(new IAuthTabCallback_Parcel(configuration)).mayLaunchUrl();
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                iOnMessageChannelReady = new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration2)).onMessageChannelReady();
            }
            tdsRoundLayout.setBackgroundColor(iOnMessageChannelReady);
            Typography7 typography7 = this.onWarmupCompleted.IAuthTabCallback;
            if (z) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration3 = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                iIntValue = new getUrlokhttp(new getInterfaceDescriptor(configuration3)).onRelationshipValidationResult();
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration4 = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration4, "");
                Object[] objArr = {new getUrlokhttp(new writeTypedObject(configuration4))};
                int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
            }
            typography7.setTextColor(iIntValue);
        }
        int i4 = asInterface + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        int i = 2 % 2;
        super/*android.view.View*/.setEnabled(z);
        if (this.onExtraCallback == onExtraCallbackWithResult.NORMAL) {
            this.onWarmupCompleted.onTransact.setBackground(onWarmupCompleted(z));
            setTextFieldSpinnerEnabled(z);
            int i2 = onTransact + 69;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onTransact + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            if (IAuthTabCallback().getVisibility() == 44) {
                return;
            }
        } else if (IAuthTabCallback().getVisibility() == 8) {
            return;
        }
        if (IAuthTabCallback().length() == 0) {
            int i3 = asInterface + 75;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback().setVisibility(4);
            return;
        }
        IAuthTabCallback().setVisibility(0);
        int i5 = onTransact + 55;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ConstraintLayout constraintLayout = (TextFieldSpinner) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = constraintLayout.findViewById(im.toss.uikit.R.id.title);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return baseTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(im.toss.uikit.R.id.label);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        if (i3 == 0) {
            return baseTextView;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(im.toss.uikit.R.id.message);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        if (i3 != 0) {
            return baseTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsImageView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = findViewById(im.toss.uikit.R.id.arrow);
        Intrinsics.checkNotNull(tdsImageViewFindViewById);
        TdsImageView tdsImageView = tdsImageViewFindViewById;
        int i4 = onTransact + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BaseTextView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(im.toss.uikit.R.id.hint);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        if (i3 == 0) {
            return baseTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final class onWarmupCompleted implements Animator.AnimatorListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final int IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (i3 != 0) {
                throw null;
            }
            int i4 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            int i4 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
        }

        public onWarmupCompleted(int i) {
            this.IAuthTabCallback = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                TextFieldSpinner.onNavigationEvent(TextFieldSpinner.this);
                int i3 = 18 / 0;
            } else {
                Intrinsics.checkNotNullParameter(animator, "");
                TextFieldSpinner.onNavigationEvent(TextFieldSpinner.this);
            }
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void asBinder() {
        int i = 2 % 2;
        ((BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137)).addTextChangedListener(new asBinder());
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final boolean onNavigationEvent() {
        return ((Boolean) onWarmupCompleted(1656550438, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1656550437)).booleanValue();
    }

    public final BaseTextView onExtraCallbackWithResult() {
        return (BaseTextView) onWarmupCompleted(498106137, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -498106137);
    }
}
