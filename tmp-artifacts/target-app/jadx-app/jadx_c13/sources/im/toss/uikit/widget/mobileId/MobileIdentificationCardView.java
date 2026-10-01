package im.toss.uikit.widget.mobileId;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.gradient.TdsAngularGradientView;
import im.toss.uikit.widget.mobileId.MobileIdentificationCardView$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1zSDK;
import o.Address;
import o.AnrPluginExternalSyntheticLambda1;
import o.deprecated_directory;
import o.generateLink;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.noCache;
import o.readIntokhttp;
import o.setSubtitleTextColor;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdentificationCardView extends TdsRoundLayout {
    private static int ICustomTabsCallback = 1;
    private static int extraCallback;
    private ValueAnimator IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private final Paint IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private MobileIdBaseView IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final List<RectF> access100;
    private final float asBinder;
    private final Lazy asInterface;
    private AnrPluginExternalSyntheticLambda1 extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private final Lazy onExtraCallback;
    private RenderEffect onExtraCallbackWithResult;
    private final AFk1zSDK onNavigationEvent;
    private final Paint onTransact;
    private RenderNode onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobileIdentificationCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobileIdentificationCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(MobileIdentificationCardView mobileIdentificationCardView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(mobileIdentificationCardView, valueAnimator);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 43;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(MobileIdentificationCardView mobileIdentificationCardView) {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {mobileIdentificationCardView};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i3 == 0) {
            ((Boolean) onWarmupCompleted(-1851398357, 1851398358, objArr, iIAuthTabCallback2, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3)).booleanValue();
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(-1851398357, 1851398358, objArr, iIAuthTabCallback2, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3)).booleanValue();
        int i4 = extraCallback + 45;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Interpolator onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy();
        }
        IAuthTabCallbackStubProxy();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(MobileIdentificationCardView mobileIdentificationCardView, MobileIdBaseView mobileIdBaseView, List list, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-898931794, 898931796, new Object[]{mobileIdentificationCardView, mobileIdBaseView, list, view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i3 = ICustomTabsCallback + 91;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(MobileIdentificationCardView mobileIdentificationCardView) {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(mobileIdentificationCardView);
            throw null;
        }
        float fOnNavigationEvent = onNavigationEvent(mobileIdentificationCardView);
        int i3 = ICustomTabsCallback + 31;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function0, view);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted(MobileIdentificationCardView mobileIdentificationCardView) {
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(mobileIdentificationCardView);
            throw null;
        }
        float fOnExtraCallback = onExtraCallback(mobileIdentificationCardView);
        int i3 = extraCallback + 57;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return fOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~((~i5) | i8 | i2);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i2);
        int i13 = (~(i5 | i7)) | (~(i7 | i)) | i10;
        int i14 = i2 + i + i3 + (1787548100 * i6) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i2) - 623378432) + (561581232 * i) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i3) + ((-778043392) * i6) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i2 * (-930662234)) + 656878810 + (i * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i3 * (-930661477)) + (i6 * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? IAuthTabCallback(objArr) : onTransact(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(MobileIdentificationCardView mobileIdentificationCardView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(mobileIdentificationCardView, valueAnimator);
        int i4 = extraCallback + 31;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MobileIdentificationCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        RenderEffect renderEffectCreateBlurEffect;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AFk1zSDK aFk1zSDKOnExtraCallback = AFk1zSDK.onExtraCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1zSDKOnExtraCallback, "");
        this.onNavigationEvent = aFk1zSDKOnExtraCallback;
        this.access100 = new ArrayList();
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCardView$.ExternalSyntheticLambda4());
        this.asInterface = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCardView$.ExternalSyntheticLambda5(this));
        this.getInterfaceDescriptor = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCardView$.ExternalSyntheticLambda6(this));
        this.access000 = LazyKt__LazyJVMKt.lazy(new MobileIdentificationCardView$.ExternalSyntheticLambda7(this));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.onTransact = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.IAuthTabCallbackStub = paint2;
        this.asBinder = deprecated_directory.Medium.getRadius();
        int i2 = Build.VERSION.SDK_INT;
        RenderNode renderNodeEt_ = null;
        if (i2 >= 31) {
            float f = this.IAuthTabCallbackDefault;
            if (f > 0.0f) {
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
            } else {
                int i3 = extraCallback + 33;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                renderEffectCreateBlurEffect = null;
            }
        }
        this.onExtraCallbackWithResult = renderEffectCreateBlurEffect;
        if (i2 >= 31) {
            int i6 = extraCallback + 23;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                renderNodeEt_.hashCode();
                throw null;
            }
            if (renderEffectCreateBlurEffect != null) {
                renderNodeEt_ = setSubtitleTextColor.et_("blur-node");
                renderNodeEt_.setRenderEffect(this.onExtraCallbackWithResult);
            }
        }
        this.onWarmupCompleted = renderNodeEt_;
        this.IAuthTabCallbackStubProxy = true;
        getInterfaceDescriptor();
        setRadius(((Float) onWarmupCompleted(-134386353, 134386358, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdentificationCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallback + 9;
            ICustomTabsCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallback + 47;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final Interpolator IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.onExtraCallback.getValue();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return interpolator;
    }

    private static final Interpolator IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Address address = Address.onNavigationEvent;
        if (i3 == 0) {
            return address.asBinder();
        }
        address.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MobileIdentificationCardView mobileIdentificationCardView = (MobileIdentificationCardView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Number number = (Number) mobileIdentificationCardView.asInterface.getValue();
        if (i3 != 0) {
            number.floatValue();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = extraCallback + 29;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fFloatValue);
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final float onExtraCallback(MobileIdentificationCardView mobileIdentificationCardView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        extraCallback = i2 % 128;
        float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(mobileIdentificationCardView, i2 % 2 != 0 ? 123 : 16);
        int i3 = extraCallback + 33;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return fOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        MobileIdentificationCardView mobileIdentificationCardView = (MobileIdentificationCardView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) mobileIdentificationCardView.getInterfaceDescriptor.getValue()).floatValue();
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final float onNavigationEvent(MobileIdentificationCardView mobileIdentificationCardView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        extraCallback = i2 % 128;
        return setTagsokhttp.onExtraCallbackWithResult(mobileIdentificationCardView, Integer.valueOf(i2 % 2 != 0 ? 87 : 16));
    }

    private final boolean extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.access000.getValue()).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.access000.getValue()).booleanValue();
        int i3 = ICustomTabsCallback + 63;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsRoundLayout tdsRoundLayout = (MobileIdentificationCardView) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = tdsRoundLayout.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 == 0) {
            generateLink.IAuthTabCallback(resources);
            throw null;
        }
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = extraCallback + 1;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBlurRadius(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = f;
        if (Build.VERSION.SDK_INT >= 31 && f > 0.0f) {
            int i4 = ICustomTabsCallback + 99;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            float f2 = f * this.asBinder;
            this.onExtraCallbackWithResult = RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.CLAMP);
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = setSubtitleTextColor.et_("blur-node");
            }
            RenderNode renderNode = this.onWarmupCompleted;
            if (renderNode != null) {
                renderNode.setRenderEffect(this.onExtraCallbackWithResult);
                int i6 = extraCallback + 33;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        invalidate();
    }

    public final MobileIdBaseView asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 19;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        MobileIdBaseView mobileIdBaseView = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 57;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return mobileIdBaseView;
    }

    public final void setCurrentCardView(@Nullable MobileIdBaseView mobileIdBaseView) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel = mobileIdBaseView;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        int i6 = i2 + 85;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final AnrPluginExternalSyntheticLambda1 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 41;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1 = this.extraCallbackWithResult;
        int i5 = i2 + 11;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return anrPluginExternalSyntheticLambda1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setType(@Nullable AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1) {
        int i = 2 % 2;
        this.extraCallbackWithResult = anrPluginExternalSyntheticLambda1;
        if (anrPluginExternalSyntheticLambda1 != null) {
            List<Pair<String, Float>> listOnExtraCallback = anrPluginExternalSyntheticLambda1.onExtraCallback();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnExtraCallback, 10));
            Iterator<T> it = listOnExtraCallback.iterator();
            while (!(!it.hasNext())) {
                int i2 = extraCallback + 23;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(Integer.valueOf(Color.parseColor((String) ((Pair) it.next()).getFirst())));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnExtraCallback, 10));
            Iterator<T> it2 = listOnExtraCallback.iterator();
            int i4 = ICustomTabsCallback + 87;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Number) ((Pair) it2.next()).getSecond()).floatValue()));
                int i6 = extraCallback + 83;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            TdsAngularGradientView tdsAngularGradientView = this.onNavigationEvent.IAuthTabCallback;
            tdsAngularGradientView.setCornerRadius(((Float) onWarmupCompleted(-134386353, 134386358, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue());
            Intrinsics.checkNotNull(tdsAngularGradientView);
            TdsAngularGradientView.onWarmupCompleted(tdsAngularGradientView, CollectionsKt___CollectionsKt.toIntArray(arrayList), CollectionsKt___CollectionsKt.toFloatArray(arrayList2), 0.0f, 4, null);
            invalidate();
        }
    }

    public final TdsImageView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = extraCallback + 65;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    public final LottieAnimationView asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        LottieAnimationView lottieAnimationView = this.onNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        int i4 = extraCallback + 13;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return lottieAnimationView;
    }

    public final View onTransact() {
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onNavigationEvent.onWarmupCompleted, "");
            throw null;
        }
        View view = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int i3 = extraCallback + 31;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }

    public final View onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(this.onNavigationEvent.onExtraCallbackWithResult, "");
            throw null;
        }
        ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i3 = extraCallback + 113;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return constraintLayout;
    }

    public final View IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdBaseView mobileIdBaseView = this.IAuthTabCallback_Parcel;
        if (mobileIdBaseView == null) {
            return null;
        }
        MobileIdCardHologramMaskView mobileIdCardHologramMaskViewOnExtraCallback = mobileIdBaseView.onExtraCallback();
        int i4 = ICustomTabsCallback + 33;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return mobileIdCardHologramMaskViewOnExtraCallback;
    }

    public final TdsAngularGradientView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsAngularGradientView tdsAngularGradientView = this.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsAngularGradientView, "");
        int i4 = extraCallback + 41;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsAngularGradientView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getInterfaceDescriptor() {
        noCache nocache;
        int i = 2 % 2;
        AFk1zSDK aFk1zSDK = this.onNavigationEvent;
        View view = aFk1zSDK.onWarmupCompleted;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(((Integer) getDEFAULT_CONNECTION_SPECSokhttp.onExtraCallbackWithResult(312726448, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration))}, R.drawable.IAuthTabCallback(), -312726447)).intValue());
        aFk1zSDK.onNavigationEvent.setNightMode(false);
        ConstraintLayout constraintLayout = aFk1zSDK.onExtraCallback;
        if (!extraCallback()) {
            int iArgb = Color.argb(0, 255, 255, 255);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources2 = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            Configuration configuration2 = resources2.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            nocache = new noCache(0.0d, new int[]{iArgb, new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallbackWithResult(configuration2)).onExtraCallback()}, new float[]{0.0f, 1.0f}, (Float) null, (Float) null, (Float) null, (Float) null, 120, (DefaultConstructorMarker) null);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            nocache = new noCache(0.0d, new int[]{new getUrlokhttp(new onWarmupCompleted(configuration3)).isEngagementSignalsApiAvailable(), Color.argb(255, 229, 232, 235)}, new float[]{0.0f, 1.0f}, (Float) null, (Float) null, (Float) null, (Float) null, 120, (DefaultConstructorMarker) null);
            int i2 = ICustomTabsCallback + 125;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        constraintLayout.setBackground(nocache);
        setUseNativeRoundRect(true);
        aFk1zSDK.IAuthTabCallback.setUseNativePath(true);
        int i4 = extraCallback + 125;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int childCount = this.onNavigationEvent.onExtraCallbackWithResult.getChildCount();
        if (childCount > 1) {
            this.onNavigationEvent.onExtraCallbackWithResult.removeViews(1, childCount - 1);
        }
        ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        this.IAuthTabCallback_Parcel = null;
        int i4 = ICustomTabsCallback + 123;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setDisabledViewVisible(@NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent.onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationCardView$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 43;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {function0, view};
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    MobileIdentificationCardView.onWarmupCompleted(-584793397, 584793401, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    int i4 = 94 / 0;
                } else {
                    Object[] objArr2 = {function0, view};
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    MobileIdentificationCardView.onWarmupCompleted(-584793397, 584793401, objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                }
                int i5 = IAuthTabCallback + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = extraCallback + 119;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function0 function0, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = extraCallback + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 im.toss.uikit.widget.mobileId.MobileIdBaseView) = (r1v4 im.toss.uikit.widget.mobileId.MobileIdBaseView), (r1v7 im.toss.uikit.widget.mobileId.MobileIdBaseView) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(float f) {
        MobileIdBaseView mobileIdBaseView;
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            mobileIdBaseView = this.IAuthTabCallback_Parcel;
            int i3 = 82 / 0;
            if (mobileIdBaseView != null) {
                mobileIdBaseView.onExtraCallbackWithResult(f);
            }
        } else {
            mobileIdBaseView = this.IAuthTabCallback_Parcel;
            if (mobileIdBaseView != null) {
            }
        }
        int i4 = extraCallback + 113;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(float f, float f2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MobileIdBaseView mobileIdBaseView = this.IAuthTabCallback_Parcel;
        if (mobileIdBaseView != null) {
            mobileIdBaseView.onWarmupCompleted(f, f2);
        }
        int i3 = ICustomTabsCallback + 9;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, im.toss.uikit.widget.mobileId.MobileIdBaseView, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final MobileIdentificationCardView mobileIdentificationCardView = (MobileIdentificationCardView) objArr[0];
        final ?? r4 = (MobileIdBaseView) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r4, "");
        mobileIdentificationCardView.IAuthTabCallback_Parcel = r4;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult.ITrustedWebActivityCallback = 0;
        onextracallbackwithresult.ICustomTabsCallback = 0;
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        mobileIdentificationCardView.onNavigationEvent.onExtraCallbackWithResult.addView(r4, onextracallbackwithresult);
        r4.onWarmupCompleted(new Function2() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationCardView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = MobileIdentificationCardView.onExtraCallback(this.f$0, r4, (List) obj, (View) obj2);
                int i5 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        int i2 = extraCallback + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onExtraCallback + 79;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                int i5 = onExtraCallback + 39;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                if (i6 != 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(MobileIdentificationCardView mobileIdentificationCardView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            mobileIdentificationCardView.setBlurRadius(((Float) animatedValue).floatValue());
            mobileIdentificationCardView.invalidate();
            return;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        mobileIdentificationCardView.setBlurRadius(((Float) animatedValue2).floatValue());
        mobileIdentificationCardView.invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, im.toss.uikit.widget.mobileId.MobileIdentificationCardView] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iOnNavigationEvent;
        int iIAuthTabCallback;
        final ?? r1 = (MobileIdentificationCardView) objArr[0];
        ConstraintLayout constraintLayout = (MobileIdBaseView) objArr[1];
        List list = (List) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Paint paint = ((MobileIdentificationCardView) r1).onTransact;
        AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1 = ((MobileIdentificationCardView) r1).extraCallbackWithResult;
        if (anrPluginExternalSyntheticLambda1 != null) {
            int i4 = ICustomTabsCallback + 65;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                anrPluginExternalSyntheticLambda1.onNavigationEvent();
                throw null;
            }
            iOnNavigationEvent = anrPluginExternalSyntheticLambda1.onNavigationEvent();
        } else {
            iOnNavigationEvent = 0;
        }
        paint.setColor(iOnNavigationEvent);
        Paint paint2 = ((MobileIdentificationCardView) r1).IAuthTabCallbackStub;
        AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda12 = ((MobileIdentificationCardView) r1).extraCallbackWithResult;
        if (anrPluginExternalSyntheticLambda12 != null) {
            iIAuthTabCallback = anrPluginExternalSyntheticLambda12.IAuthTabCallback();
            int i5 = extraCallback + 77;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iIAuthTabCallback = 0;
        }
        paint2.setColor(iIAuthTabCallback);
        Matrix matrix = new Matrix();
        constraintLayout.transformMatrixToGlobal(matrix);
        r1.transformMatrixToLocal(matrix);
        RectF rectFOnExtraCallback = view != null ? r1.onExtraCallback(view) : null;
        if (rectFOnExtraCallback != null) {
            matrix.mapRect(rectFOnExtraCallback);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RectF rectFOnExtraCallback2 = r1.onExtraCallback((View) it.next());
            matrix.mapRect(rectFOnExtraCallback2);
            if (rectFOnExtraCallback != null) {
                ((MobileIdentificationCardView) r1).access100.add(new RectF((rectFOnExtraCallback.left + rectFOnExtraCallback2.left) - r5.getLeft(), (rectFOnExtraCallback.top + rectFOnExtraCallback2.top) - r5.getTop(), (rectFOnExtraCallback.left + rectFOnExtraCallback2.right) - r5.getLeft(), (rectFOnExtraCallback.top + rectFOnExtraCallback2.bottom) - r5.getTop()));
                it = it;
            } else {
                ((MobileIdentificationCardView) r1).access100.add(rectFOnExtraCallback2);
            }
        }
        ValueAnimator valueAnimator = ((MobileIdentificationCardView) r1).IAuthTabCallback;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((MobileIdentificationCardView) r1).IAuthTabCallbackDefault, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(r1.IAuthTabCallback_Parcel());
        valueAnimatorOfFloat.setStartDelay(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.mobileId.MobileIdentificationCardView$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 63;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                MobileIdentificationCardView.onWarmupCompleted(this.f$0, valueAnimator2);
                int i10 = onExtraCallback + 79;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
        });
        valueAnimatorOfFloat.start();
        ((MobileIdentificationCardView) r1).IAuthTabCallback = valueAnimatorOfFloat;
        return Unit.INSTANCE;
    }

    private final RectF onExtraCallback(View view) {
        int i = 2 % 2;
        RectF rectF = new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        int i2 = extraCallback + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return rectF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(MobileIdentificationCardView mobileIdentificationCardView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            mobileIdentificationCardView.setBlurRadius(((Float) animatedValue).floatValue());
            mobileIdentificationCardView.invalidate();
            int i3 = 16 / 0;
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            mobileIdentificationCardView.setBlurRadius(((Float) animatedValue2).floatValue());
            mobileIdentificationCardView.invalidate();
        }
        int i4 = ICustomTabsCallback + 123;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        RenderNode renderNode = this.onWarmupCompleted;
        if (Build.VERSION.SDK_INT >= 31 && !this.access100.isEmpty()) {
            int i4 = ICustomTabsCallback;
            int i5 = i4 + 63;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (renderNode != null && this.IAuthTabCallbackDefault > 0.0f) {
                int i7 = i4 + 81;
                extraCallback = i7 % 128;
                int i8 = i7 % 2;
                super.dispatchDraw(canvas);
                int i9 = 0;
                renderNode.setPosition(0, 0, getWidth(), getHeight());
                RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording(getWidth(), getHeight());
                Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "");
                super.dispatchDraw(recordingCanvasBeginRecording);
                renderNode.endRecording();
                Iterator<T> it = this.access100.iterator();
                while (it.hasNext()) {
                    int i10 = ICustomTabsCallback + 29;
                    extraCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object next = it.next();
                    if (i9 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    RectF rectF = (RectF) next;
                    canvas.save();
                    Path path = new Path();
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    float fFloatValue = ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue() * this.asBinder;
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    path.addRoundRect(rectF, fFloatValue, ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue() * this.asBinder, Path.Direction.CW);
                    canvas.clipPath(path);
                    canvas.drawRenderNode(renderNode);
                    canvas.saveLayerAlpha(rectF, (int) (this.IAuthTabCallbackDefault * 255.0f));
                    int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    float fFloatValue2 = ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
                    int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    canvas.drawRoundRect(rectF, fFloatValue2, ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue(), this.onTransact);
                    int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    float fFloatValue3 = ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
                    int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    canvas.drawRoundRect(rectF, fFloatValue3, ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback6, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue(), this.IAuthTabCallbackStub);
                    canvas.restore();
                    canvas.restore();
                    i9++;
                }
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public void onDetachedFromWindow() {
        int i = 2 % 2;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.IAuthTabCallback;
        if (valueAnimator != null) {
            int i2 = extraCallback + 35;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            valueAnimator.cancel();
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = ICustomTabsCallback + 113;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setValidId(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStubProxy = z;
            Intrinsics.checkNotNullExpressionValue(this.onNavigationEvent.onExtraCallbackWithResult, "");
            throw null;
        }
        this.IAuthTabCallbackStubProxy = z;
        ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i3 = 0;
        constraintLayout.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (z) {
            i3 = 8;
        } else {
            int i4 = ICustomTabsCallback + 81;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        constraintLayout2.setVisibility(i3);
        int i6 = ICustomTabsCallback + 77;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ICustomTabsCallback + 73;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        ConstraintLayout constraintLayout = this.onNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i8 = ICustomTabsCallback + 119;
        extraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            layoutParams.height = i;
            layoutParams.width = i2;
            constraintLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.height = i;
            layoutParams.width = i2;
            constraintLayout.setLayoutParams(layoutParams);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function0 function0, View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(-584793397, 584793401, new Object[]{function0, view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(MobileIdentificationCardView mobileIdentificationCardView, MobileIdBaseView mobileIdBaseView, List list, View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-898931794, 898931796, new Object[]{mobileIdentificationCardView, mobileIdBaseView, list, view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private final float access000() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Float) onWarmupCompleted(406952422, -406952419, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
    }

    private final float access100() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Float) onWarmupCompleted(-134386353, 134386358, new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).floatValue();
    }

    private static final boolean IAuthTabCallbackDefault(MobileIdentificationCardView mobileIdentificationCardView) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(-1851398357, 1851398358, new Object[]{mobileIdentificationCardView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull MobileIdBaseView mobileIdBaseView) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(-1809197087, 1809197087, new Object[]{this, mobileIdBaseView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }
}
