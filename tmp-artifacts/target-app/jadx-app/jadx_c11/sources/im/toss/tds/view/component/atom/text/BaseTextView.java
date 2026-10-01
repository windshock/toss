package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.view.R;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CipherSuiteCompanionORDER_BY_NAME1;
import o.ConnectionPool;
import o.ConnectionSpec;
import o.InterfaceC0083handshake;
import o.RequestBodyCompanionasRequestBody1;
import o.connectionCount;
import o.deprecated_cacheResponse;
import o.deprecated_code;
import o.deprecated_priorResponse;
import o.getDelegateokhttp;
import o.getUrlokhttp;
import o.headerdefault;
import o.response;
import o.setBodyokhttp;
import o.setConnectTimeoutokhttp;
import o.setDnsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class BaseTextView extends HtmlTextView {
    private static int access100 = 1;
    private static int asInterface;
    private float IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private CharSequence asBinder;
    private boolean onExtraCallback;
    private float onExtraCallbackWithResult;
    private getDelegateokhttp onNavigationEvent;
    private InterfaceC0083handshake onTransact;
    private setDnsokhttp onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = (~(i7 | i8 | (~i))) | (~(i2 | i6 | i));
        int i10 = (~(i8 | i)) | (~(i8 | i2));
        int i11 = (~(i | i6)) | i2;
        int i12 = i2 + i6 + i4 + (1661237432 * i5) + (961048624 * i3);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i2) - 281083904) + ((-1329838950) * i6) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i4) + ((-1559232512) * i5) + (1553989632 * i3) + (2020540416 * i13);
        int i15 = (i2 * (-2040814728)) + 92927091 + (i6 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i4 * (-2040814133)) + (i5 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
        return i14 + ((i15 * i15) * 1800994816) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public abstract int bv_();

    public abstract int bw_();

    protected response onPostMessage() {
        int i = 2 % 2;
        int i2 = access100 + 33;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback(context, attributeSet);
        this.onTransact = InterfaceC0083handshake.Companion.IAuthTabCallback();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BaseTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access100 + 89;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = asInterface + 45;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final setDnsokhttp IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setDnsokhttp setdnsokhttpOnExtraCallback = this.onWarmupCompleted;
        if (setdnsokhttpOnExtraCallback == null) {
            int i4 = i3 + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            setdnsokhttpOnExtraCallback = setDnsokhttp.Companion.onExtraCallback();
            if (i5 != 0) {
                int i6 = 97 / 0;
            }
        }
        return setdnsokhttpOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        InterfaceC0083handshake interfaceC0083handshake;
        float f;
        boolean z;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        int i3;
        InterfaceC0083handshake interfaceC0083handshakeOnWarmupCompleted;
        int i4 = 2 % 2;
        int resId = response.Regular.getResId();
        TypedValue typedValue = new TypedValue();
        getResources().getValue(bw_(), typedValue, true);
        float dimension = getResources().getDimension(bv_());
        int dimension2 = (int) getResources().getDimension(extraCallbackWithResult());
        int dimension3 = (int) getResources().getDimension(writeTypedObject());
        int dimension4 = (int) getResources().getDimension(ICustomTabsCallback());
        int dimension5 = (int) getResources().getDimension(readTypedObject());
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
        if (attributeSet != null) {
            int i5 = R.attr.maxTextSize;
            int[] iArr = {android.R.attr.textColor, android.R.attr.textStyle, android.R.attr.textSize, android.R.attr.breakStrategy, android.R.attr.lineSpacingExtra, android.R.attr.fontFamily, android.R.attr.paddingTop, android.R.attr.paddingBottom, android.R.attr.paddingLeft, android.R.attr.paddingRight, android.R.attr.padding, i5, R.attr.monospace, R.attr.tdsLineHeight, R.attr.sensitive, R.attr.singleLineWithFading, androidx.appcompat.R.attr.lineHeight};
            ArraysKt.sort(iArr);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(ArraysKt.indexOf(iArr, android.R.attr.fontFamily), resId);
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(ArraysKt.indexOf(iArr, android.R.attr.textColor));
            this.onExtraCallbackWithResult = typedArrayObtainStyledAttributes.getDimension(ArraysKt.indexOf(iArr, i5), this.onExtraCallbackWithResult);
            try {
                typedArrayObtainStyledAttributes.getValue(ArraysKt.indexOf(iArr, android.R.attr.textSize), typedValue);
                int i6 = access100 + 117;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } catch (Resources.NotFoundException unused) {
            }
            i2 = typedArrayObtainStyledAttributes.getInt(ArraysKt.indexOf(iArr, android.R.attr.breakStrategy), 0);
            float dimension6 = typedArrayObtainStyledAttributes.getDimension(ArraysKt.indexOf(iArr, android.R.attr.lineSpacingExtra), 0.0f);
            typedArrayObtainStyledAttributes.getDimension(ArraysKt.indexOf(iArr, androidx.appcompat.R.attr.lineHeight), dimension);
            dimension2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ArraysKt.indexOf(iArr, android.R.attr.paddingTop), dimension2);
            dimension3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ArraysKt.indexOf(iArr, android.R.attr.paddingBottom), dimension3);
            dimension4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ArraysKt.indexOf(iArr, android.R.attr.paddingLeft), dimension4);
            dimension5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ArraysKt.indexOf(iArr, android.R.attr.paddingRight), dimension5);
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ArraysKt.indexOf(iArr, android.R.attr.padding), -1);
            z = typedArrayObtainStyledAttributes.getBoolean(ArraysKt.indexOf(iArr, R.attr.monospace), false);
            int i8 = typedArrayObtainStyledAttributes.getInt(ArraysKt.indexOf(iArr, R.attr.tdsLineHeight), -1);
            if (i8 == 0) {
                i3 = resourceId;
                interfaceC0083handshakeOnWarmupCompleted = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
            } else if (i8 != 1) {
                int i9 = access100 + 103;
                i3 = resourceId;
                asInterface = i9 % 128;
                interfaceC0083handshakeOnWarmupCompleted = (i9 % 2 == 0 ? i8 == 2 : i8 == 4) ? ConnectionPool.onWarmupCompleted.IAuthTabCallback() : InterfaceC0083handshake.Companion.IAuthTabCallback();
            } else {
                i3 = resourceId;
                interfaceC0083handshakeOnWarmupCompleted = ConnectionPool.onWarmupCompleted.onNavigationEvent();
            }
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(ArraysKt.indexOf(iArr, R.attr.singleLineWithFading), false);
            InterfaceC0083handshake interfaceC0083handshake2 = interfaceC0083handshakeOnWarmupCompleted;
            setTag(R.id.tracking_exclude, Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(ArraysKt.indexOf(iArr, R.attr.sensitive), false)));
            typedArrayObtainStyledAttributes.recycle();
            i = dimensionPixelOffset;
            z2 = z3;
            f = dimension6;
            interfaceC0083handshake = interfaceC0083handshake2;
            resId = i3;
        } else {
            i = -1;
            interfaceC0083handshake = interfaceC0083handshakeIAuthTabCallback;
            f = 0.0f;
            z = false;
            i2 = 0;
            z2 = false;
            colorStateList = null;
        }
        if (colorStateList == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onUnminimized());
        } else {
            setTextColor(colorStateList);
        }
        setBreakStrategy(i2);
        setTextSize(typedValue.getComplexUnit(), TypedValue.complexToFloat(typedValue.data));
        if (f > 0.0f) {
            setLineSpacing(f, 1.0f);
        }
        if (i > 0) {
            int i10 = access100 + 79;
            asInterface = i10 % 128;
            if (i10 % 2 != 0) {
                setPadding(i, i, i, i);
                setPaddingRelative(i, i, i, i);
                int i11 = 80 / 0;
            } else {
                setPadding(i, i, i, i);
                setPaddingRelative(i, i, i, i);
            }
        } else {
            setPadding(dimension4, dimension2, dimension5, dimension3);
            setPaddingRelative(dimension4, dimension2, dimension5, dimension3);
        }
        IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, Boolean.valueOf(z)}, 231375474, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -231375474);
        onExtraCallbackWithResult(interfaceC0083handshake);
        IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, Boolean.valueOf(z2)}, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
        response responseVarOnPostMessage = onPostMessage();
        if (responseVarOnPostMessage != null) {
            int i12 = access100 + 55;
            asInterface = i12 % 128;
            if (i12 % 2 != 0) {
                onNavigationEvent(responseVarOnPostMessage);
                throw null;
            }
            onNavigationEvent(responseVarOnPostMessage);
        } else {
            onWarmupCompleted(resId);
        }
        setHyphenationFrequency(1);
    }

    public final void onNavigationEvent(@NotNull setDnsokhttp setdnsokhttp) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setdnsokhttp, "");
            this.onWarmupCompleted = setdnsokhttp;
            onMinimized();
            int i3 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setdnsokhttp, "");
            this.onWarmupCompleted = setdnsokhttp;
            onMinimized();
        }
        int i4 = access100 + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onMinimized() {
        CharSequence charSequenceOnExtraCallbackWithResult;
        int i = 2 % 2;
        setDnsokhttp setdnsokhttpIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        getDelegateokhttp getdelegateokhttpResolve = setdnsokhttpIAuthTabCallbackDefault.resolve(context, varyMatches.onWarmupCompleted((View) this, (Number) Float.valueOf(getTextSize())));
        if (Intrinsics.areEqual(this.onNavigationEvent, getdelegateokhttpResolve)) {
            return;
        }
        this.onNavigationEvent = getdelegateokhttpResolve;
        CharSequence charSequence = this.asBinder;
        if (charSequence != null) {
            int i2 = access100 + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            charSequenceOnExtraCallbackWithResult = ConnectionSpec.onExtraCallbackWithResult(charSequence, getdelegateokhttpResolve);
        } else {
            charSequenceOnExtraCallbackWithResult = null;
        }
        if (!(!Intrinsics.areEqual(charSequenceOnExtraCallbackWithResult, getText()))) {
            return;
        }
        this.onExtraCallback = true;
        setText(charSequenceOnExtraCallbackWithResult);
        this.onExtraCallback = false;
        int i4 = asInterface + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = f;
        onNavigationEvent(this.IAuthTabCallbackDefault, f);
        int i4 = asInterface + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float asInterface() {
        float f;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 89;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            f = this.onExtraCallbackWithResult;
            int i4 = 89 / 0;
        } else {
            f = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tds.view.component.atom.text.LineHeightBasedTextView
    public void setTextSize(int i, float f) {
        float fApplyDimension;
        float fIntValue;
        int i2 = 2 % 2;
        int i3 = access100 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (i == 2) {
            Float fValueOf = Float.valueOf(this.onExtraCallbackWithResult);
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf == null) {
                fIntValue = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(f).intValue();
            } else {
                fIntValue = fValueOf.floatValue();
                int i5 = access100 + 39;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            fApplyDimension = TypedValue.applyDimension(1, deprecated_cacheResponse.onExtraCallbackWithResult(this, new connectionCount(f, fIntValue), 0.0f, 2, (Object) null), getResources().getDisplayMetrics());
        } else {
            fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
        }
        this.IAuthTabCallbackDefault = fApplyDimension;
        onNavigationEvent(fApplyDimension, this.onExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(float f, float f2) {
        int i = 2 % 2;
        if (f2 != 0.0f) {
            int i2 = access100 + 111;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (f2 > f) {
                int i4 = asInterface + 79;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                f2 = Float.MAX_VALUE;
            }
        }
        super.setTextSize(0, Math.min(f, f2));
        onMessageChannelReady();
        onMinimized();
    }

    protected int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 49;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.dimen.top_top_padding_0;
            throw null;
        }
        int i4 = R.dimen.top_top_padding_0;
        int i5 = access100 + 21;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    protected int writeTypedObject() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_bottom_padding_0;
        int i5 = access100 + 107;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    protected int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_left_padding_0;
        int i5 = access100 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    protected int readTypedObject() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_right_padding_0;
        int i5 = asInterface + 35;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return i4;
    }

    protected deprecated_code onActivityResized() {
        int i = 2 % 2;
        int i2 = access100 + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        deprecated_code deprecated_codeVar = deprecated_code.DESCRIPTION;
        if (i3 == 0) {
            return deprecated_codeVar;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = access100 + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setTypeface(response.toTypeface$default(responseVar, context, null, 2, null));
        int i4 = asInterface + 25;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        if (i != 0) {
            int i6 = i3 + 73;
            access100 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 56 / 0;
                if (!isInEditMode()) {
                    onNavigationEvent(response.Companion.onExtraCallback(i));
                    int i8 = asInterface + 57;
                    access100 = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (!isInEditMode()) {
            }
        }
        int i10 = asInterface + 119;
        access100 = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull InterfaceC0083handshake interfaceC0083handshake) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        this.onTransact = interfaceC0083handshake;
        onMessageChannelReady();
        int i4 = access100 + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onMessageChannelReady() {
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access100 + 23;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            interfaceC0083handshakeIAuthTabCallback = this.onTransact;
            int i3 = 20 / 0;
            if (interfaceC0083handshakeIAuthTabCallback == null) {
                interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
            }
        } else {
            interfaceC0083handshakeIAuthTabCallback = this.onTransact;
            if (interfaceC0083handshakeIAuthTabCallback == null) {
            }
        }
        Object[] objArr = {this, Float.valueOf(getTextSize())};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        setLineHeight(varyMatches.onNavigationEvent((View) this, (Number) Float.valueOf(interfaceC0083handshakeIAuthTabCallback.onExtraCallbackWithResult(((Float) varyMatches.onNavigationEvent(-1183862482, 1183862482, objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue()))));
        int i4 = asInterface + 113;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, im.toss.tds.view.component.atom.text.BaseTextView] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ?? r0 = (BaseTextView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        if (((BaseTextView) r0).IAuthTabCallbackStub == zBooleanValue) {
            return null;
        }
        int i2 = asInterface + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ((BaseTextView) r0).IAuthTabCallbackStub = zBooleanValue;
        r0.setText(r0.getText());
        int i4 = access100 + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        access100 = i2 % 128;
        return i2 % 2 == 0 ? deprecated_cacheResponse.onExtraCallback(this, headerdefault.onNavigationEvent(RequestBodyCompanionasRequestBody1.IAuthTabCallback(this), f, 0.0f, 3, (Object) null), 2.0f, 3, (Object) null) : deprecated_cacheResponse.onExtraCallback(this, headerdefault.onNavigationEvent(RequestBodyCompanionasRequestBody1.IAuthTabCallback(this), f, 0.0f, 2, (Object) null), 0.0f, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r0 = (BaseTextView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 21;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (zBooleanValue) {
            int i4 = i2 + 9;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            r0.setSingleLine(true);
            int i6 = asInterface + 9;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }
        r0.setHorizontalFadingEdgeEnabled(zBooleanValue);
        r0.setHorizontallyScrolling(zBooleanValue);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSingleLine(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*android.widget.TextView*/.setSingleLine(z);
        if (z) {
            return;
        }
        int i4 = access100 + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, true}, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
            return;
        }
        IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, false}, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxLines(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        super/*android.widget.TextView*/.setMaxLines(i);
        if (i > 1) {
            IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, false}, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
        }
        int i5 = access100 + 103;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tds.view.component.atom.text.LineHeightBasedTextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        int i = 2 % 2;
        if (!this.onExtraCallback) {
            this.asBinder = charSequence;
            getDelegateokhttp getdelegateokhttpResolve = this.onNavigationEvent;
            if (getdelegateokhttpResolve == null) {
                setDnsokhttp setdnsokhttpIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                getdelegateokhttpResolve = setdnsokhttpIAuthTabCallbackDefault.resolve(context, varyMatches.onWarmupCompleted((View) this, (Number) Float.valueOf(getTextSize())));
                this.onNavigationEvent = getdelegateokhttpResolve;
            }
            if (charSequence != null) {
                int i2 = asInterface + 95;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                charSequence = ConnectionSpec.onExtraCallbackWithResult(charSequence, getdelegateokhttpResolve);
            } else {
                charSequence = null;
            }
        }
        if (this.IAuthTabCallbackStub) {
            int i4 = asInterface + 9;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            SpannableString spannableString = new SpannableString(charSequence != null ? charSequence : "");
            spannableString.setSpan(new setConnectTimeoutokhttp(), 0, charSequence != null ? charSequence.length() : 0, 0);
            super.setText(spannableString, bufferType);
            return;
        }
        deprecated_priorResponse deprecated_priorresponse = deprecated_priorResponse.onNavigationEvent;
        if (!deprecated_priorresponse.onExtraCallback()) {
            super.setText(charSequence, bufferType);
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        super.setText(deprecated_priorresponse.onNavigationEvent(context2, charSequence, onActivityResized()), bufferType);
        int i5 = access100 + 77;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 231375474, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -231375474);
    }

    public final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 160681464, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -160681463);
    }
}
