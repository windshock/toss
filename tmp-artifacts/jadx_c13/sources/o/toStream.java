package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.uikit.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toStream;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class toStream implements ViewPager.asBinder, ViewPager2.onExtraCallbackWithResult {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int getInterfaceDescriptor = 1;
    private final Lazy IAuthTabCallback;
    private final Map<View, Drawable> IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final View access100;
    private final Lazy asBinder;
    private final Map<View, ViewOutlineProvider> asInterface;
    private final ViewOutlineProvider onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Map<View, Boolean> onTransact;
    private float onWarmupCompleted;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallback = 8;

    static {
        int i = access000 + 31;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ toStream(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public static /* synthetic */ onExtraCallback IAuthTabCallback(toStream tostream) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(tostream);
        }
        IAuthTabCallbackDefault(tostream);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(toStream tostream) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iAsBinder = asBinder(tostream);
        int i4 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return iAsBinder;
    }

    public static /* synthetic */ int onNavigationEvent(toStream tostream) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = onTransact(tostream);
        int i4 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return iOnTransact;
    }

    public static /* synthetic */ int onWarmupCompleted(toStream tostream) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = asInterface(tostream);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return iAsInterface;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i3 | i5;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = i10 | (~(i11 | i6));
        int i13 = ~(i9 | i3);
        int i14 = i12 | i13;
        int i15 = (~(i6 | i11 | i5)) | i13;
        int i16 = i3 + i5 + i4 + (1881146393 * i) + ((-1035018111) * i2);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1924067824)) - 304087040) + ((-1924067824) * i5) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i4) + (1612709888 * i) + ((-182452224) * i2) + ((-1611137024) * i17);
        int i19 = (i3 * (-928100048)) + 945860906 + (i5 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i4 * (-928100237)) + (i * (-1331189957)) + (i2 * 1329932787) + (i17 * 1550319616);
        int i20 = i18 + (i19 * i19 * 1690828800);
        return i20 != 1 ? i20 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private toStream(View view) {
        this.access100 = view;
        this.IAuthTabCallbackDefault = new LinkedHashMap();
        this.onTransact = new LinkedHashMap();
        this.asInterface = new LinkedHashMap();
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.tab.ArcPageTransformer$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Resources.NotFoundException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = toStream.onExtraCallbackWithResult(this.f$0);
                if (i3 == 0) {
                    return Integer.valueOf(iOnExtraCallbackWithResult);
                }
                int i4 = 82 / 0;
                return Integer.valueOf(iOnExtraCallbackWithResult);
            }
        });
        this.onExtraCallbackWithResult = ViewOutlineProvider.BACKGROUND;
        this.asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.tab.ArcPageTransformer$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                toStream.onExtraCallback onextracallbackIAuthTabCallback = toStream.IAuthTabCallback(this.f$0);
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 9 / 0;
                }
                return onextracallbackIAuthTabCallback;
            }
        });
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.tab.ArcPageTransformer$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Integer numValueOf = Integer.valueOf(toStream.onWarmupCompleted(this.f$0));
                int i4 = IAuthTabCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf;
            }
        });
        this.IAuthTabCallbackStub = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.tab.ArcPageTransformer$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnNavigationEvent = toStream.onNavigationEvent(this.f$0);
                if (i3 == 0) {
                    return Integer.valueOf(iOnNavigationEvent);
                }
                Integer.valueOf(iOnNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        view.setBackgroundColor(onExtraCallback().onWarmupCompleted());
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        toStream tostream = (toStream) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float f = tostream.onWarmupCompleted;
        if (i3 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onWarmupCompleted() {
        int iIntValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            iIntValue = ((Number) this.IAuthTabCallback.getValue()).intValue();
            int i3 = 87 / 0;
        } else {
            iIntValue = ((Number) this.IAuthTabCallback.getValue()).intValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int asBinder(toStream tostream) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = tostream.access100.getContext().getResources().getDimensionPixelSize(R.dimen.arc_page_transformer_radius);
        int i4 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return dimensionPixelSize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends ViewOutlineProvider {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onExtraCallback() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int measuredWidth;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 45;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (outline != null) {
                int measuredHeight = 0;
                if (view != null) {
                    int i5 = i2 + 75;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        view.getMeasuredWidth();
                        obj.hashCode();
                        throw null;
                    }
                    measuredWidth = view.getMeasuredWidth();
                } else {
                    int i6 = i4 + 3;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    measuredWidth = 0;
                }
                if (view != null) {
                    int i8 = onExtraCallbackWithResult + 27;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    measuredHeight = view.getMeasuredHeight();
                }
                Object[] objArr = {toStream.this};
                outline.setRoundRect(0, 0, measuredWidth, measuredHeight, ((Float) toStream.onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1857215967, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1857215967, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr)).floatValue());
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        toStream tostream = (toStream) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = (onExtraCallback) tostream.asBinder.getValue();
        if (i3 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final onExtraCallback IAuthTabCallbackDefault(toStream tostream) {
        int i = 2 % 2;
        onExtraCallback onextracallback = tostream.new onExtraCallback();
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) this.onNavigationEvent.getValue()).intValue();
            throw null;
        }
        int iIntValue = ((Number) this.onNavigationEvent.getValue()).intValue();
        int i3 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return iIntValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final int asInterface(toStream tostream) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Context context = tostream.access100.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context2 = tostream.access100.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            return Color.parseColor("#07FFFFFF");
        }
        int color = Color.parseColor("#26FFFFFF");
        int i3 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return color;
    }

    private final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = ((Number) this.IAuthTabCallbackStub.getValue()).intValue();
        int i3 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return iIntValue;
    }

    private static final int onTransact(toStream tostream) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Context context = tostream.access100.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
            obj.hashCode();
            throw null;
        }
        Context context2 = tostream.access100.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            return Color.parseColor("#E8000000");
        }
        int color = Color.parseColor("#2E001D3A");
        int i3 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return color;
        }
        obj.hashCode();
        throw null;
    }

    public void transformPage(@NotNull View view, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (f > -1.0f) {
            int i2 = getInterfaceDescriptor + 55;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0 ? f < 1.0f : f < 2.0f) {
                float fAbs = Math.abs(f);
                onNavigationEvent(view, fAbs);
                Object[] objArr = {this, view, Float.valueOf(fAbs)};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -397022302, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 397022303, iIAuthTabCallback, objArr);
                onWarmupCompleted(view, fAbs);
                int i3 = getInterfaceDescriptor + 111;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setElevation(0.0f);
        onExtraCallbackWithResult(view);
        int i5 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        Boolean bool = this.onTransact.get(view);
        if (bool != null) {
            int i2 = IAuthTabCallbackStubProxy + 79;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                view.setClipToOutline(bool.booleanValue());
                this.onTransact.put(view, null);
                int i3 = 59 / 0;
            } else {
                view.setClipToOutline(bool.booleanValue());
                this.onTransact.put(view, null);
            }
        }
        ViewOutlineProvider viewOutlineProvider = this.asInterface.get(view);
        if (viewOutlineProvider != null) {
            view.setOutlineProvider(viewOutlineProvider);
            this.asInterface.put(view, null);
        }
        Drawable drawable = this.IAuthTabCallbackDefault.get(view);
        if (drawable != null) {
            int i4 = IAuthTabCallbackStubProxy + 1;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            view.setBackground(drawable);
            this.IAuthTabCallbackDefault.put(view, null);
        }
        int i6 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void onNavigationEvent(View view, float f) {
        int color;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(0.0d);
        if (Build.VERSION.SDK_INT >= 28) {
            view.setOutlineSpotShadowColor(onNavigationEvent());
        }
        if (this.onTransact.get(view) == null) {
            this.onTransact.put(view, Boolean.valueOf(view.getClipToOutline()));
        }
        view.setClipToOutline(true);
        float fFloatValue = deprecated_immutable.onWarmupCompleted(Float.valueOf(f), new Number[]{dValueOf, Double.valueOf(0.5d), Double.valueOf(1.0d)}, new Number[]{dValueOf, Integer.valueOf(onWarmupCompleted()), dValueOf}).floatValue();
        this.onWarmupCompleted = fFloatValue;
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if (Intrinsics.areEqual(outlineProvider, (onExtraCallback) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 213758560, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -213758558, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}))) {
            view.invalidateOutline();
        } else {
            Map<View, ViewOutlineProvider> map = this.asInterface;
            if (Intrinsics.areEqual(outlineProvider, this.onExtraCallbackWithResult)) {
                outlineProvider = this.onExtraCallbackWithResult;
            }
            map.put(view, outlineProvider);
            view.setOutlineProvider((onExtraCallback) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 213758560, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -213758558, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this}));
        }
        Drawable drawable = this.IAuthTabCallbackDefault.get(view);
        Drawable background = view.getBackground();
        if (drawable != null) {
            int i4 = getInterfaceDescriptor + 53;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable == null) {
                return;
            }
            gradientDrawable.setCornerRadius(fFloatValue);
            view.invalidateDrawable(gradientDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(fFloatValue);
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        gradientDrawable2.setStroke(varyMatches.onNavigationEvent(1, displayMetrics), IAuthTabCallback());
        if (background instanceof ColorDrawable) {
            int i6 = IAuthTabCallbackStubProxy + 71;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            color = ((ColorDrawable) background).getColor();
        } else {
            int iOnWarmupCompleted = onExtraCallback().onWarmupCompleted();
            int i8 = IAuthTabCallbackStubProxy + 87;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            color = iOnWarmupCompleted;
        }
        gradientDrawable2.setColor(color);
        Map<View, Drawable> map2 = this.IAuthTabCallbackDefault;
        if (background == null) {
            background = new GradientDrawable();
        }
        map2.put(view, background);
        view.setBackground(gradientDrawable2);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(1.0d);
        float fFloatValue2 = deprecated_immutable.onWarmupCompleted(Float.valueOf(fFloatValue), new Number[]{Double.valueOf(0.0d), Double.valueOf(0.5d), dValueOf}, new Number[]{dValueOf, Double.valueOf(0.95d), dValueOf}).floatValue();
        view.setScaleX(fFloatValue2);
        view.setScaleY(fFloatValue2);
        int i4 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onWarmupCompleted(View view, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(0.0d);
        Number[] numberArr = {dValueOf, Double.valueOf(0.5d), Double.valueOf(1.0d)};
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        view.setElevation(deprecated_immutable.onWarmupCompleted(Float.valueOf(f), numberArr, new Number[]{dValueOf, Integer.valueOf(varyMatches.onNavigationEvent(100, displayMetrics)), dValueOf}).floatValue());
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final void onWarmupCompleted(@NotNull ViewPager viewPager) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(viewPager, "");
            viewPager.setPageTransformer(false, new toStream(viewPager, null), 2);
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public final void onExtraCallback(@NotNull ViewPager2 viewPager2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(viewPager2, "");
            viewPager2.setPageTransformer(new toStream(viewPager2, null));
            viewPager2.onExtraCallbackWithResult(new onExtraCallback(viewPager2));
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
        }
    }

    private final getDEFAULT_CONNECTION_SPECSokhttp onExtraCallback() {
        int i = 2 % 2;
        Context context = this.access100.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getDEFAULT_CONNECTION_SPECSokhttp getdefault_connection_specsokhttp = new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration));
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return getdefault_connection_specsokhttp;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(toStream tostream) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Float) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1857215967, iIAuthTabCallback2, -1857215967, iIAuthTabCallback, new Object[]{tostream})).floatValue();
    }

    private final onExtraCallback onExtraCallbackWithResult() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (onExtraCallback) onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 213758560, iIAuthTabCallback2, -213758558, iIAuthTabCallback, new Object[]{this});
    }

    private final void onExtraCallbackWithResult(View view, float f) {
        Object[] objArr = {this, view, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onWarmupCompleted(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -397022302, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 397022303, iIAuthTabCallback, objArr);
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                int i2 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }
}
