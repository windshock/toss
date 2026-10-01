package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.R;
import im.toss.tds.view.component.anim.rollingnumber.TdsRollingNumberV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.widget.AmountTop$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_cacheControl;
import o.deprecated_minFreshSeconds;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc;
import o.readIntokhttp;
import o.response;
import o.setMethodokhttp;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AmountTop extends ConstraintLayout {
    private static int asInterface = 1;
    private static int onTransact;
    private final r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private Long onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private CharSequence onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountTop(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountTop(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i4 = asInterface + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ int onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Integer) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{context}, -608952502, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 608952505)).intValue();
        }
        ((Integer) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{context}, -608952502, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 608952505)).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Resources.NotFoundException {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i6));
        int i10 = ~(i2 | i6);
        int i11 = ~i6;
        int i12 = (~(i | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i2 + i6 + i3 + ((-1570926368) * i4) + ((-1409401439) * i5);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i2) - 657981440) + (821186744 * i6) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i3) + (1124073472 * i4) + ((-332922880) * i5) + ((-1182662656) * i15);
        int i17 = (i2 * 1410161459) + 847508490 + (i6 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i3 * 1410159841) + (i4 * 1126552800) + (i5 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        if (i18 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 2) {
            return onExtraCallback(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        Context context = (Context) objArr[0];
        int i19 = 2 % 2;
        int i20 = asInterface + 71;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.inter_margin_16);
        int i22 = asInterface + 73;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        return Integer.valueOf(dimensionPixelSize);
    }

    public static /* synthetic */ Unit onExtraCallback(AmountTop amountTop, long j, boolean z, TdsRollingNumberV1View.access000 access000Var) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(amountTop, j, z, access000Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(amountTop, j, z, access000Var);
        int i3 = asInterface + 63;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = asInterface + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AmountTop amountTop = (AmountTop) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(amountTop, charSequence);
        int i4 = onTransact + 49;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AmountTop amountTop, long j, boolean z, TdsRollingNumberV1View.access000 access000Var) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(amountTop, j, z, access000Var);
        }
        IAuthTabCallback(amountTop, j, z, access000Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AmountTop amountTop, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(amountTop, charSequence);
        int i4 = asInterface + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmountTop(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        CharSequence charSequence;
        boolean z;
        boolean z2;
        String str;
        Drawable drawable;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        CharSequence charSequence2;
        boolean z3;
        CharSequence charSequence3;
        super(context, attributeSet, i);
        CharSequence charSequence4 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(context, "");
        r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc r8lambdacsgdgrhbz5hn67rytfwny1smmicOnExtraCallbackWithResult = r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(r8lambdacsgdgrhbz5hn67rytfwny1smmicOnExtraCallbackWithResult, "");
        this.IAuthTabCallback = r8lambdacsgdgrhbz5hn67rytfwny1smmicOnExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new AmountTop$.ExternalSyntheticLambda3(context));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(im.toss.uikit.R.dimen.amount_top_padding_top_80);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(im.toss.uikit.R.dimen.amount_top_padding_bottom_24);
        String str2 = isInEditMode() ? "TITLE" : _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence5 = isInEditMode() ? "SUBTITLE" : _UrlKt.FRAGMENT_ENCODE_SET;
        int index = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex();
        int index2 = TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex();
        int index3 = TdsButtonV1View.onWarmupCompleted.MEDIUM.getIndex();
        int index4 = TdsButtonV1View.IAuthTabCallback.INLINE.getIndex();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.AmountTop, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = index4;
            z = false;
            boolean z4 = true;
            String string = null;
            Drawable drawable2 = null;
            int i3 = index3;
            int i4 = index2;
            int i5 = index;
            CharSequence charSequence6 = charSequence5;
            CharSequence text = str2;
            dimensionPixelSize = dimensionPixelSize4;
            dimensionPixelSize2 = dimensionPixelSize3;
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
            for (int i6 = 0; i6 < indexCount; i6++) {
                CharSequence charSequence7 = text;
                int i7 = asInterface + 59;
                CharSequence charSequence8 = charSequence6;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                int index5 = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index5 == im.toss.uikit.R.styleable.AmountTop_android_paddingTop) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index5, dimensionPixelSize2);
                    int i9 = 2 % 2;
                } else if (index5 == im.toss.uikit.R.styleable.AmountTop_android_paddingBottom) {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index5, dimensionPixelSize);
                    int i10 = onTransact + 119;
                    asInterface = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 2 % 2;
                    }
                } else {
                    if (index5 == im.toss.uikit.R.styleable.AmountTop_title) {
                        text = typedArrayObtainStyledAttributes.getText(index5);
                        if (text != null) {
                            charSequence6 = charSequence8;
                            charSequence3 = charSequence4;
                            int i12 = 2 % 2;
                            charSequence4 = charSequence3;
                        }
                    } else {
                        if (index5 == im.toss.uikit.R.styleable.AmountTop_subtitle) {
                            CharSequence text2 = typedArrayObtainStyledAttributes.getText(index5);
                            if (text2 != null) {
                                charSequence3 = charSequence4;
                                charSequence6 = text2;
                            }
                        } else if (index5 == im.toss.uikit.R.styleable.AmountTop_subtitleUnderline) {
                            z = typedArrayObtainStyledAttributes.getBoolean(index5, z);
                            charSequence6 = charSequence8;
                            charSequence3 = charSequence4;
                        } else {
                            if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonLabel) {
                                int i13 = onTransact + 81;
                                z3 = z;
                                asInterface = i13 % 128;
                                if (i13 % 2 == 0) {
                                    typedArrayObtainStyledAttributes.getText(index5);
                                    throw null;
                                }
                                CharSequence text3 = typedArrayObtainStyledAttributes.getText(index5);
                                charSequence2 = text3 == null ? charSequence2 : text3;
                            } else {
                                z3 = z;
                                if (index5 == im.toss.uikit.R.styleable.AmountTop_onButtonClick) {
                                    CharSequence text4 = typedArrayObtainStyledAttributes.getText(index5);
                                    charSequence4 = text4 == null ? charSequence4 : text4;
                                } else if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonsEnabled) {
                                    int i14 = onTransact + 83;
                                    asInterface = i14 % 128;
                                    int i15 = i14 % 2;
                                    z4 = typedArrayObtainStyledAttributes.getBoolean(index5, z4);
                                } else if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonsType) {
                                    int i16 = onTransact + 49;
                                    asInterface = i16 % 128;
                                    int i17 = i16 % 2;
                                    i5 = typedArrayObtainStyledAttributes.getInt(index5, i5);
                                    int i18 = asInterface + 71;
                                    onTransact = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        int i19 = 4 / 4;
                                    } else {
                                        int i20 = 2 % 2;
                                    }
                                } else {
                                    if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonsStyle) {
                                        int i21 = asInterface + 25;
                                        charSequence3 = charSequence4;
                                        onTransact = i21 % 128;
                                        int i22 = i21 % 2;
                                        i4 = typedArrayObtainStyledAttributes.getInt(index5, i4);
                                    } else {
                                        charSequence3 = charSequence4;
                                        if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonsSize) {
                                            i3 = typedArrayObtainStyledAttributes.getInt(index5, i3);
                                        } else if (index5 == im.toss.uikit.R.styleable.AmountTop_buttonsDisplay) {
                                            i2 = typedArrayObtainStyledAttributes.getInt(index5, i2);
                                        } else if (index5 == im.toss.uikit.R.styleable.AmountTop_subtitleRightIcon) {
                                            drawable2 = typedArrayObtainStyledAttributes.getDrawable(index5);
                                        } else {
                                            if (index5 == im.toss.uikit.R.styleable.AmountTop_subtitleRightIconUrl) {
                                                string = typedArrayObtainStyledAttributes.getString(index5);
                                            }
                                            charSequence6 = charSequence8;
                                            z = z3;
                                        }
                                    }
                                    text = charSequence7;
                                    charSequence6 = charSequence8;
                                    z = z3;
                                    charSequence4 = charSequence3;
                                }
                            }
                            text = charSequence7;
                            charSequence6 = charSequence8;
                            z = z3;
                        }
                        text = charSequence7;
                        int i122 = 2 % 2;
                        charSequence4 = charSequence3;
                    }
                    z3 = z;
                    charSequence3 = charSequence4;
                    charSequence6 = charSequence8;
                    z = z3;
                    text = charSequence7;
                    int i1222 = 2 % 2;
                    charSequence4 = charSequence3;
                }
                text = charSequence7;
                charSequence6 = charSequence8;
            }
            charSequence = text;
            charSequence5 = charSequence6;
            index = i5;
            index2 = i4;
            index3 = i3;
            z2 = z4;
            index4 = i2;
            str = string;
            drawable = drawable2;
        } else {
            charSequence = str2;
            z = false;
            z2 = true;
            str = null;
            drawable = null;
            dimensionPixelSize = dimensionPixelSize4;
            dimensionPixelSize2 = dimensionPixelSize3;
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str3 = str;
        Drawable drawable3 = drawable;
        setPadding((int) context.getResources().getDimension(R.dimen.top_left_padding_24), dimensionPixelSize2, (int) context.getResources().getDimension(R.dimen.top_right_padding_24), dimensionPixelSize);
        setClipToPadding(false);
        asInterface();
        if (charSequence.length() > 0) {
            int i23 = onTransact + 25;
            asInterface = i23 % 128;
            if (i23 % 2 == 0) {
                setTitle(charSequence);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setTitle(charSequence);
        }
        setSubtitle(charSequence5);
        setSubtitleUnderline(z);
        setButtonLabel(charSequence2);
        if (charSequence4.length() > 0) {
            setOnButtonClickListener(new deprecated_cacheControl(this, charSequence4.toString()));
            int i24 = 2 % 2;
        }
        setButtonsEnabled(z2);
        setButtonsType(index);
        setButtonsStyle(index2);
        setButtonsSize(index3);
        setButtonsDisplay(index4);
        if (drawable3 != null) {
            setSubtitleRightIcon(drawable3);
        } else if (str3 != null) {
            setSubtitleRightIconUrl(str3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AmountTop(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 87;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = asInterface + 123;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setLoading(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult = z;
            IAuthTabCallback().setLoading(z);
            int i3 = asInterface + 7;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallbackWithResult = z;
        IAuthTabCallback().setLoading(z);
        throw null;
    }

    private final int onNavigationEvent() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
            int i3 = 60 / 0;
        } else {
            iIntValue = ((Number) this.IAuthTabCallbackDefault.getValue()).intValue();
        }
        int i4 = asInterface + 9;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return iIntValue;
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = im.toss.uikit.widget.AmountTop.onExtraCallback.IAuthTabCallback + 123;
            im.toss.uikit.widget.AmountTop.onExtraCallback.onWarmupCompleted = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onExtraCallback) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r3.onExtraCallback)) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectorType() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(getContext().getResources(), im.toss.tds.R.drawable.icn_arrow_downwards, (Resources.Theme) null);
        if (drawableOnExtraCallback != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            drawableOnExtraCallback.setTint(new getUrlokhttp(new onExtraCallback(configuration)).onPostMessage());
            int i4 = onTransact + 97;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        IAuthTabCallback().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableOnExtraCallback, false);
    }

    private final void asInterface() {
        int i = 2 % 2;
        r8lambdaCSGDgrhbz5hn67RyTFwny1sMmIc r8lambdacsgdgrhbz5hn67rytfwny1smmic = this.IAuthTabCallback;
        TdsRollingNumberV1View tdsRollingNumberV1View = r8lambdacsgdgrhbz5hn67rytfwny1smmic.IAuthTabCallback;
        View view = r8lambdacsgdgrhbz5hn67rytfwny1smmic.IAuthTabCallbackDefault;
        Intrinsics.checkNotNull(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration))}, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        Intrinsics.checkNotNullExpressionValue(view.getResources().getDisplayMetrics(), "");
        view.setBackground(new deprecated_minFreshSeconds(colorStateListValueOf, varyMatches.onNavigationEvent(12, r5)));
        Intrinsics.checkNotNullExpressionValue(view, "");
        tdsRollingNumberV1View.onWarmupCompleted(view);
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AmountTop amountTop, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            amountTop.IAuthTabCallback.IAuthTabCallback.setText(charSequence);
            return Unit.INSTANCE;
        }
        amountTop.IAuthTabCallback.IAuthTabCallback.setText(charSequence);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(final AmountTop amountTop, final CharSequence charSequence) {
        int i = 2 % 2;
        amountTop.onNavigationEvent(new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AmountTop.onWarmupCompleted(this.f$0, charSequence);
                int i5 = onNavigationEvent + 43;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 11 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(@Nullable final CharSequence charSequence) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onExtraCallback != null) {
            onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, 0L}, -864784548, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 864784550);
        }
        this.onWarmupCompleted = charSequence;
        final Function0 function0 = new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0, charSequence}, -64137416, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 64137417);
                    int i5 = 94 / 0;
                } else {
                    unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this.f$0, charSequence}, -64137416, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 64137417);
                }
                int i6 = onExtraCallback + 89;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }
        };
        setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitIAuthTabCallback;
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 125;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    unitIAuthTabCallback = AmountTop.IAuthTabCallback(function0);
                    int i5 = 79 / 0;
                } else {
                    unitIAuthTabCallback = AmountTop.IAuthTabCallback(function0);
                }
                int i6 = onExtraCallback + 7;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i3 = onTransact + 111;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void setAmount$default(AmountTop amountTop, long j, Boolean bool, TdsRollingNumberV1View.access000 access000Var, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            bool = null;
        }
        if ((i & 4) != 0) {
            access000Var = TdsRollingNumberV1View.access000.IAuthTabCallback.onExtraCallbackWithResult.onExtraCallback;
            int i4 = asInterface + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        amountTop.setAmount(j, bool, access000Var);
    }

    private static final Unit IAuthTabCallback(AmountTop amountTop, long j, boolean z, TdsRollingNumberV1View.access000 access000Var) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TdsRollingNumberV1View tdsRollingNumberV1View = amountTop.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setNumber$default(tdsRollingNumberV1View, j, z, access000Var, false, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 71;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final AmountTop amountTop, final long j, final boolean z, final TdsRollingNumberV1View.access000 access000Var) {
        int i = 2 % 2;
        amountTop.onNavigationEvent(new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = AmountTop.onWarmupCompleted(this.f$0, j, z, access000Var);
                int i5 = IAuthTabCallback + 7;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAmount(final long j, @Nullable Boolean bool, @NotNull final TdsRollingNumberV1View.access000 access000Var) throws Resources.NotFoundException {
        final boolean z;
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(access000Var, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(access000Var, "");
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (this.onExtraCallback == null) {
                z = false;
                onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, Long.valueOf(j)}, -864784548, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 864784550);
                this.onWarmupCompleted = null;
                final Function0 function0 = new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unitOnExtraCallback;
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 43;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            unitOnExtraCallback = AmountTop.onExtraCallback(this.f$0, j, z, access000Var);
                            int i5 = 12 / 0;
                        } else {
                            unitOnExtraCallback = AmountTop.onExtraCallback(this.f$0, j, z, access000Var);
                        }
                        int i6 = onWarmupCompleted + 39;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 29 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 31;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function0}, 499155843, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -499155839);
                            int i5 = 22 / 0;
                        } else {
                            unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function0}, 499155843, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -499155839);
                        }
                        int i6 = onExtraCallbackWithResult + 51;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 75 / 0;
                        }
                        return unit;
                    }
                });
            }
            int i3 = onTransact + 115;
            asInterface = i3 % 128;
            zBooleanValue = true ^ (i3 % 2 == 0);
        }
        z = zBooleanValue;
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, Long.valueOf(j)}, -864784548, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 864784550);
        this.onWarmupCompleted = null;
        final Function0 function02 = new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnExtraCallback;
                int i32 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    unitOnExtraCallback = AmountTop.onExtraCallback(this.f$0, j, z, access000Var);
                    int i5 = 12 / 0;
                } else {
                    unitOnExtraCallback = AmountTop.onExtraCallback(this.f$0, j, z, access000Var);
                }
                int i6 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 29 / 0;
                }
                return unitOnExtraCallback;
            }
        };
        setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.uikit.widget.AmountTop$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                int i32 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 31;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function02}, 499155843, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -499155839);
                    int i5 = 22 / 0;
                } else {
                    unit = (Unit) AmountTop.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function02}, 499155843, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -499155839);
                }
                int i6 = onExtraCallbackWithResult + 51;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 75 / 0;
                }
                return unit;
            }
        });
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 79;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AmountTop amountTop = (AmountTop) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        amountTop.onExtraCallback = Long.valueOf(jLongValue);
        int i4 = asInterface + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AmountTop amountTop = (AmountTop) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if ((1 & iIntValue) != 0) {
            int i5 = i2 + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            function0 = null;
        }
        amountTop.onNavigationEvent(function0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Function0<Unit> function0) {
        int i = 2 % 2;
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (!this.onNavigationEvent) {
            int i2 = onTransact + 65;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int measuredWidth = this.IAuthTabCallback.onWarmupCompleted.getMeasuredWidth();
            if (measuredWidth == 0) {
                if (this.IAuthTabCallback.onWarmupCompleted.getMeasuredWidth() == 0) {
                    this.IAuthTabCallback.onWarmupCompleted.measure(0, 0);
                }
                measuredWidth = this.IAuthTabCallback.onWarmupCompleted.getMeasuredWidth();
            }
            if (getMeasuredWidth() <= 0) {
                return;
            }
            TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            boolean z = getMeasuredWidth() - (getPaddingLeft() + getPaddingRight()) < (iIAuthTabCallbackDefault + onNavigationEvent()) + measuredWidth;
            if (!(!z) && !tdsRollingNumberV1View.onWarmupCompleted()) {
                tdsRollingNumberV1View.setCanAutoResize(true);
            }
            if (!z) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Resources resources = context.getResources();
                if (resources != null) {
                    int i4 = asInterface + 75;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        resources.getConfiguration();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Configuration configuration = resources.getConfiguration();
                    float f = configuration != null ? configuration.fontScale : 1.0f;
                    if (f < 2.0f) {
                        onTransact();
                    } else {
                        asBinder();
                    }
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final int IAuthTabCallbackDefault() {
        Float f;
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            f = (Float) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View, null, this.onExtraCallback, null, this.onWarmupCompleted, 5, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506);
        } else {
            TdsRollingNumberV1View tdsRollingNumberV1View2 = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View2, "");
            f = (Float) TdsRollingNumberV1View.onExtraCallbackWithResult(new Object[]{tdsRollingNumberV1View2, null, this.onExtraCallback, null, this.onWarmupCompleted, 5, null}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -783133487, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 783133506);
        }
        int iFloatValue = (int) f.floatValue();
        int i3 = asInterface + 109;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return iFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    public final void setAmountPrefix(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setPrefix$default(tdsRollingNumberV1View, charSequence, false, 2, (Object) null);
        int i4 = asInterface + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setAmountSuffix$default(AmountTop amountTop, CharSequence charSequence, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        amountTop.setAmountSuffix(charSequence, z);
        int i5 = asInterface + 33;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void setAmountSuffix(@NotNull CharSequence charSequence, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        TdsRollingNumberV1View tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
        TdsRollingNumberV1View.setSuffix$default(tdsRollingNumberV1View, charSequence, (response) null, (Integer) null, (Integer) null, z, 14, (Object) null);
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSubtitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onExtraCallback.setText(charSequence);
        int i4 = asInterface + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSubtitleUnderline(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            this.IAuthTabCallback.onExtraCallbackWithResult.setVisibility(0);
            return;
        }
        this.IAuthTabCallback.onExtraCallbackWithResult.setVisibility(8);
        int i3 = onTransact + 59;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setButtonLabel(@Nullable CharSequence charSequence) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.onWarmupCompleted.setText(charSequence);
            int i3 = 47 / 0;
            if (this.IAuthTabCallback.onWarmupCompleted.length() != 0) {
                this.IAuthTabCallback.onWarmupCompleted.setVisibility(0);
            } else {
                int i4 = asInterface + 85;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                this.IAuthTabCallback.onWarmupCompleted.setVisibility(8);
            }
        } else {
            this.IAuthTabCallback.onWarmupCompleted.setText(charSequence);
            if (this.IAuthTabCallback.onWarmupCompleted.length() == 0) {
            }
        }
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, null, 1, null}, 1441487882, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1441487882);
    }

    public final void setOnButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.IAuthTabCallback.onWarmupCompleted.setOnClickListener(onClickListener);
        int i4 = onTransact + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setButtonsEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.onWarmupCompleted.setEnabled(z);
        int i4 = asInterface + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setButtonsType(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        setButtonTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.values()[i], (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null));
        int i3 = asInterface + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setButtonsStyle(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        setButtonTheme(new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, TdsButtonV1View.IAuthTabCallbackDefault.values()[i], (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 13, (DefaultConstructorMarker) null));
        int i3 = asInterface + 21;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setButtonsSize(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        setButtonTheme(new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, TdsButtonV1View.onWarmupCompleted.values()[i], (TdsButtonV1View.IAuthTabCallback) null, 11, (DefaultConstructorMarker) null));
        int i3 = asInterface + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setButtonsDisplay(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        setButtonTheme(new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, TdsButtonV1View.IAuthTabCallback.values()[i], 7, (DefaultConstructorMarker) null));
        int i3 = asInterface + 87;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setButtonTheme(@NotNull TdsButtonV1View.asInterface asinterface) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(asinterface, "");
            this.IAuthTabCallback.onWarmupCompleted.setTheme(asinterface);
            onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, null, 1, null}, 1441487882, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1441487882);
            return;
        }
        Intrinsics.checkNotNullParameter(asinterface, "");
        this.IAuthTabCallback.onWarmupCompleted.setTheme(asinterface);
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, null, 1, null}, 1441487882, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1441487882);
    }

    public final void setSubtitleRightIcon(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback().setImageResource(i);
        onExtraCallback().setVisibility(0);
        int i5 = onTransact + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setSubtitleRightIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        onExtraCallback().setImageDrawable(drawable);
        if (drawable != null) {
            onExtraCallback().setVisibility(0);
            int i2 = onTransact + 71;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 35 / 0;
                return;
            }
            return;
        }
        onExtraCallback().setVisibility(8);
        int i4 = asInterface + 105;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public final void setSubtitleRightIconUrl(@Nullable String str) {
        int i = 2 % 2;
        TdsImageView.setImage$default(onExtraCallback(), str, (Function1) null, (Function1) null, 6, (Object) null);
        if (str == null || str.length() <= 0) {
            onExtraCallback().setVisibility(8);
            int i2 = asInterface + 15;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = asInterface + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback().setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsRollingNumberV1View IAuthTabCallback() {
        TdsRollingNumberV1View tdsRollingNumberV1View;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            View viewFindViewById = findViewById(im.toss.uikit.R.id.title);
            Intrinsics.checkNotNull(viewFindViewById);
            tdsRollingNumberV1View = (TdsRollingNumberV1View) viewFindViewById;
            int i3 = 23 / 0;
        } else {
            TdsRollingNumberV1View tdsRollingNumberV1ViewFindViewById = findViewById(im.toss.uikit.R.id.title);
            Intrinsics.checkNotNull(tdsRollingNumberV1ViewFindViewById);
            tdsRollingNumberV1View = tdsRollingNumberV1ViewFindViewById;
        }
        int i4 = asInterface + 23;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsRollingNumberV1View;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(findViewById(im.toss.uikit.R.id.subtitle));
            obj.hashCode();
            throw null;
        }
        BaseTextView baseTextViewFindViewById = findViewById(im.toss.uikit.R.id.subtitle);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i3 = onTransact + 115;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return baseTextView;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsButtonV1View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TdsButtonV1View tdsButtonV1ViewFindViewById = findViewById(im.toss.uikit.R.id.button);
        Intrinsics.checkNotNull(tdsButtonV1ViewFindViewById);
        TdsButtonV1View tdsButtonV1View = tdsButtonV1ViewFindViewById;
        int i4 = onTransact + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsImageView onExtraCallback() {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            View viewFindViewById = findViewById(im.toss.uikit.R.id.subtitleRightIcon);
            Intrinsics.checkNotNull(viewFindViewById);
            tdsImageView = (TdsImageView) viewFindViewById;
            int i3 = 45 / 0;
        } else {
            TdsImageView tdsImageViewFindViewById = findViewById(im.toss.uikit.R.id.subtitleRightIcon);
            Intrinsics.checkNotNull(tdsImageViewFindViewById);
            tdsImageView = tdsImageViewFindViewById;
        }
        int i4 = asInterface + 1;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsImageView;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r3 = (androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) r3;
        ((android.view.ViewGroup.MarginLayoutParams) r3).width = -1;
        r3.IPostMessageServiceStubProxy = -1;
        r3.ITrustedWebActivityCallbackDefault = im.toss.uikit.R.id.title;
        r3.IAuthTabCallback = 0;
        r3.setEngagementSignalsCallback = 0;
        r3.IEngagementSignalsCallbackStubProxy = -1;
        ((android.view.ViewGroup.MarginLayoutParams) r3).topMargin = getContext().getResources().getDimensionPixelSize(im.toss.tds.view.R.dimen.top_top_padding_8);
        r1.setLayoutParams(r3);
        r1 = im.toss.uikit.widget.AmountTop.asInterface + 119;
        im.toss.uikit.widget.AmountTop.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r4 = (androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) r4;
        ((android.view.ViewGroup.MarginLayoutParams) r4).width = -1;
        r4.IPostMessageService = -1;
        r4.IEngagementSignalsCallbackStubProxy = 0;
        ((android.view.ViewGroup.MarginLayoutParams) r4).rightMargin = 0;
        r1.setLayoutParams(r4);
        r1 = r7.IAuthTabCallback.onWarmupCompleted;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = r1.getLayoutParams();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void asBinder() {
        TdsRollingNumberV1View tdsRollingNumberV1View;
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent = true;
            this.IAuthTabCallback.IAuthTabCallback.setCanAutoResize(false);
            tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            layoutParams = tdsRollingNumberV1View.getLayoutParams();
        } else {
            this.onNavigationEvent = true;
            this.IAuthTabCallback.IAuthTabCallback.setCanAutoResize(true);
            tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            layoutParams = tdsRollingNumberV1View.getLayoutParams();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        r2 = im.toss.uikit.widget.AmountTop.onTransact + 87;
        im.toss.uikit.widget.AmountTop.asInterface = r2 % 128;
        r2 = r2 % 2;
        r3 = (androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) r3;
        r3.ITrustedWebActivityCallbackDefault = -1;
        ((android.view.ViewGroup.MarginLayoutParams) r3).width = -2;
        r0 = im.toss.uikit.R.id.title;
        r3.IPostMessageServiceStubProxy = r0;
        r3.IAuthTabCallback = r0;
        r3.setEngagementSignalsCallback = -1;
        r3.IEngagementSignalsCallbackStubProxy = 0;
        ((android.view.ViewGroup.MarginLayoutParams) r3).topMargin = 0;
        r1.setLayoutParams(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r5 = (androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) r5;
        ((android.view.ViewGroup.MarginLayoutParams) r5).width = 0;
        r5.IPostMessageService = im.toss.uikit.R.id.button;
        r5.IEngagementSignalsCallbackStubProxy = -1;
        ((android.view.ViewGroup.MarginLayoutParams) r5).rightMargin = onNavigationEvent();
        r1.setLayoutParams(r5);
        r1 = r8.IAuthTabCallback.onWarmupCompleted;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r3 = r1.getLayoutParams();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onTransact() {
        TdsRollingNumberV1View tdsRollingNumberV1View;
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.IAuthTabCallback.setCanAutoResize(false);
            tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            layoutParams = tdsRollingNumberV1View.getLayoutParams();
        } else {
            this.IAuthTabCallback.IAuthTabCallback.setCanAutoResize(false);
            tdsRollingNumberV1View = this.IAuthTabCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsRollingNumberV1View, "");
            layoutParams = tdsRollingNumberV1View.getLayoutParams();
        }
    }

    public static /* synthetic */ Unit onExtraCallback(AmountTop amountTop, CharSequence charSequence) {
        return (Unit) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{amountTop, charSequence}, -64137416, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 64137417);
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        return (Unit) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function0}, 499155843, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -499155839);
    }

    private final void onExtraCallback(long j) throws Resources.NotFoundException {
        onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, Long.valueOf(j)}, -864784548, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 864784550);
    }

    private static final int onWarmupCompleted(Context context) {
        return ((Integer) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{context}, -608952502, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 608952505)).intValue();
    }
}
