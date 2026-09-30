package im.toss.core.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.widget.TransparentAppBarLayout$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.CameraControllerExternalSyntheticLambda9;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.manualPushStack;
import o.readIntokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TransparentAppBarLayout extends AppBarLayout {
    private static int ICustomTabsCallback = 0;
    private static int readTypedObject = 1;
    private final Lazy IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean access000;
    private boolean access100;
    private final Lazy asBinder;
    private final DecelerateInterpolator asInterface;
    private Toolbar extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private View onExtraCallback;
    private final ArgbEvaluator onExtraCallbackWithResult;
    private int onNavigationEvent;
    private float onTransact;
    private manualPushStack onWarmupCompleted;
    private boolean writeTypedObject;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[manualPushStack.values().length];
            try {
                iArr[manualPushStack.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[manualPushStack.DARK.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 121;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 4 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[manualPushStack.NONE.ordinal()] = 3;
                int i4 = onExtraCallbackWithResult + 103;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransparentAppBarLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransparentAppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ onNavigationEvent IAuthTabCallback(TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(transparentAppBarLayout);
        int i4 = ICustomTabsCallback + 57;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, im.toss.core.widget.TransparentAppBarLayout] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int iIntValue;
        int i7 = ~i4;
        int i8 = ~((~i5) | i7 | i2);
        int i9 = (~i2) | i7;
        int i10 = i8 | (~(i9 | i5)) | (~(i4 | i5 | i2));
        int i11 = ~i9;
        int i12 = (~(i2 | i4)) | i5 | i11;
        int i13 = (~(i7 | i5)) | i11;
        int i14 = i4 + i5 + i6 + (933655473 * i) + ((-1037598838) * i3);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i4) - 925892608) + (470833381 * i5) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i6) + ((-1691877376) * i) + ((-393216000) * i3) + ((-1633878016) * i15);
        int i17 = ((i4 * (-727610197)) - 1081761860) + (i5 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i6 * (-727609241)) + (i * 1532828727) + (i3 * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            TransparentAppBarLayout transparentAppBarLayout = (TransparentAppBarLayout) objArr[0];
            int i19 = 2 % 2;
            int i20 = ICustomTabsCallback + 123;
            readTypedObject = i20 % 128;
            int i21 = i20 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) transparentAppBarLayout.IAuthTabCallbackStubProxy.getValue();
            int i22 = readTypedObject + 75;
            ICustomTabsCallback = i22 % 128;
            int i23 = i22 % 2;
            return onnavigationevent;
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            return onExtraCallback(objArr);
        }
        ?? r9 = (TransparentAppBarLayout) objArr[0];
        int i24 = 2 % 2;
        int i25 = onExtraCallbackWithResult.IAuthTabCallback[((TransparentAppBarLayout) r9).onWarmupCompleted.ordinal()];
        if (i25 == 1) {
            Context context = r9.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            if (i25 != 2) {
                int i26 = ICustomTabsCallback + 61;
                int i27 = i26 % 128;
                readTypedObject = i27;
                int i28 = i26 % 2;
                if (i25 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int i29 = i27 + 7;
                ICustomTabsCallback = i29 % 128;
                return i29 % 2 != 0 ? 0 : 0;
            }
            Context context2 = r9.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIntValue = new getUrlokhttp(new onExtraCallback(configuration2)).requestPostMessageChannel().ICustomTabsCallbackDefault();
        }
        return Integer.valueOf(iIntValue);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(onWarmupCompleted(context));
        }
        onWarmupCompleted(context);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(ScrollView scrollView, TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(scrollView, transparentAppBarLayout);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 117;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ IAuthTabCallback onExtraCallbackWithResult(TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(transparentAppBarLayout);
        }
        onNavigationEvent(transparentAppBarLayout);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransparentAppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback_Parcel = true;
        this.onWarmupCompleted = manualPushStack.LIGHT;
        this.asBinder = LazyKt.onExtraCallbackWithResult(new TransparentAppBarLayout$.ExternalSyntheticLambda1(context));
        this.onNavigationEvent = asBinder();
        this.onExtraCallbackWithResult = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.getInterfaceDescriptor = dimensionPixelSize;
        this.asInterface = new DecelerateInterpolator(1.2f);
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new TransparentAppBarLayout$.ExternalSyntheticLambda2(this));
        this.IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new TransparentAppBarLayout$.ExternalSyntheticLambda3(this));
        LayoutInflater.from(context).inflate(im.toss.core.R.layout.view_transparent_appbar, (ViewGroup) this, true);
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2113330625, 2113330628, iOnExtraCallback2);
        ViewCompat.onExtraCallbackWithResult(this, 0.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, im.toss.uikit.R.styleable.TransparentAppBarLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        setShowBorder(typedArrayObtainStyledAttributes2.getBoolean(im.toss.uikit.R.styleable.TransparentAppBarLayout_showBorder, false));
        this.IAuthTabCallbackStub = typedArrayObtainStyledAttributes2.getBoolean(im.toss.uikit.R.styleable.TransparentAppBarLayout_fixedIconColor, false);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransparentAppBarLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject + 121;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = readTypedObject + 13;
            ICustomTabsCallback = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TransparentAppBarLayout transparentAppBarLayout = (TransparentAppBarLayout) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        transparentAppBarLayout.onExtraCallbackWithResult(zBooleanValue);
        int i4 = ICustomTabsCallback + 81;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public final void setShowBorder(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        readTypedObject = i4;
        if (i3 % 2 == 0) {
            this.access000 = z;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.access000 = z;
        if (!z) {
            View view = this.onExtraCallback;
            if (view != null) {
                int i5 = i4 + 115;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                view.setVisibility(4);
                return;
            }
            return;
        }
        int i7 = i2 + 89;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        View view2 = this.onExtraCallback;
        if (view2 != null) {
            int i9 = i2 + 77;
            readTypedObject = i9 % 128;
            int i10 = i9 % 2;
            view2.setVisibility(0);
        }
    }

    public final boolean onExtraCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            z = this.IAuthTabCallback_Parcel;
            int i4 = 13 / 0;
        } else {
            z = this.IAuthTabCallback_Parcel;
        }
        int i5 = i3 + 7;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setTransitionEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (z == this.IAuthTabCallback_Parcel) {
            return;
        }
        this.IAuthTabCallback_Parcel = z;
        if (z) {
            onWarmupCompleted(this, false, 1, null);
            int i3 = readTypedObject + 5;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onExtraCallbackWithResult(true);
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onWarmupCompleted))) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i4 = onExtraCallback + 43;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i6 = onExtraCallback + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = onWarmupCompleted + 87;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                int i5 = onNavigationEvent + 109;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setAppBarMode(@NotNull manualPushStack manualpushstack) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(manualpushstack, "");
        if (this.onWarmupCompleted != manualpushstack) {
            int i4 = ICustomTabsCallback + 89;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted = manualpushstack;
            onExtraCallbackWithResult(true);
        }
    }

    public final void setFixedIconColor(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = z;
        int i5 = i3 + 1;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setIxFixedBackgroundColor(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        this.access100 = z;
        int i5 = i3 + 89;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.asBinder.getValue()).intValue();
        int i4 = ICustomTabsCallback + 67;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final int onWarmupCompleted(Context context) {
        int i = 2 % 2;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
        int color = ContextCompat.getColor(context, typedValue.resourceId);
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return color;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 117;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.getInterfaceDescriptor;
        int i5 = i2 + 51;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static final class IAuthTabCallback implements ViewGroup.OnHierarchyChangeListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            if (view2 instanceof ViewGroup) {
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                ((ViewGroup) view2).setOnHierarchyChangeListener(this);
            }
            Object[] objArr = {TransparentAppBarLayout.this, true};
            TransparentAppBarLayout.IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1853701750, -1853701746, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(view2, "");
                boolean z = view2 instanceof ViewGroup;
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            if (view2 instanceof ViewGroup) {
                ((ViewGroup) view2).setOnHierarchyChangeListener(null);
            }
            int i3 = onExtraCallback + 45;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final IAuthTabCallback asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) this.IAuthTabCallbackDefault.getValue();
        int i3 = ICustomTabsCallback + 97;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return iAuthTabCallback;
    }

    private static final IAuthTabCallback onNavigationEvent(TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = transparentAppBarLayout.new IAuthTabCallback();
        int i2 = ICustomTabsCallback + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    public static final class onNavigationEvent implements TossBridgeWebView.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onNavigationEvent() {
        }

        @Override // im.toss.core.webkit.TossBridgeWebView.onExtraCallback
        public void onWarmupCompleted(int i, int i2, int i3, int i4, boolean z) {
            int i5 = 2 % 2;
            int i6 = onExtraCallback + 123;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            TransparentAppBarLayout.this.setScrollProgress(i2 / r3.IAuthTabCallback());
            int i8 = onExtraCallbackWithResult + 97;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final onNavigationEvent onExtraCallback(TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = transparentAppBarLayout.new onNavigationEvent();
        int i2 = readTypedObject + 31;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.view.View, im.toss.core.widget.TransparentAppBarLayout, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ?? r9 = (TransparentAppBarLayout) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Toolbar toolbarFindViewById = r9.findViewById(im.toss.core.R.id.toolbar);
            toolbarFindViewById.setOnHierarchyChangeListener(r9.asInterface());
            ((TransparentAppBarLayout) r9).extraCallbackWithResult = toolbarFindViewById;
            ((TransparentAppBarLayout) r9).onExtraCallback = r9.findViewById(im.toss.core.R.id.border);
            r9.onExtraCallbackWithResult(false);
            if (((TransparentAppBarLayout) r9).IAuthTabCallbackStub) {
                int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
                r9.IAuthTabCallback(((Integer) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{r9}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 810610427, -810610427, iOnExtraCallback2)).intValue());
            }
        } else {
            Toolbar toolbarFindViewById2 = r9.findViewById(im.toss.core.R.id.toolbar);
            toolbarFindViewById2.setOnHierarchyChangeListener(r9.asInterface());
            ((TransparentAppBarLayout) r9).extraCallbackWithResult = toolbarFindViewById2;
            ((TransparentAppBarLayout) r9).onExtraCallback = r9.findViewById(im.toss.core.R.id.border);
            r9.onExtraCallbackWithResult(true);
            if (!(true ^ ((TransparentAppBarLayout) r9).IAuthTabCallbackStub)) {
            }
        }
        int i3 = ICustomTabsCallback + 55;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setScrollProgress(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = Math.max(Math.min(1.0f, f), 0.0f);
        onWarmupCompleted(this, false, 1, null);
        int i4 = readTypedObject + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void onWarmupCompleted(TransparentAppBarLayout transparentAppBarLayout, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 13;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 13;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        transparentAppBarLayout.onExtraCallbackWithResult(z);
    }

    private final void onExtraCallbackWithResult(boolean z) {
        float interpolation;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 33;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.IAuthTabCallback_Parcel;
        if (((!z2) && !z) || this.writeTypedObject) {
            return;
        }
        float f = z2 ? this.onTransact : 1.0f;
        if (!this.access100) {
            interpolation = this.asInterface.getInterpolation(f);
        } else {
            int i5 = i2 + 79;
            int i6 = i5 % 128;
            readTypedObject = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 43;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            interpolation = 0.0f;
        }
        setBackgroundAlpha(interpolation, z);
        int i10 = readTypedObject + 25;
        ICustomTabsCallback = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void setBackgroundAlpha$default(TransparentAppBarLayout transparentAppBarLayout, float f, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = readTypedObject;
            int i4 = i3 + 49;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 51;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        transparentAppBarLayout.setBackgroundAlpha(f, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundAlpha(float f, boolean z) {
        int i = 2 % 2;
        if (!this.access100) {
            Drawable background = getBackground();
            Intrinsics.checkNotNullExpressionValue(background, "");
            onWarmupCompleted(background, VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(onExtraCallbackWithResult(), (int) (255.0f * f)));
            View view = this.onExtraCallback;
            if (view != null) {
                int i2 = ICustomTabsCallback + 9;
                readTypedObject = i2 % 128;
                if (i2 % 2 == 0) {
                    view.setAlpha(f);
                    throw null;
                }
                view.setAlpha(f);
            }
            Toolbar toolbar = this.extraCallbackWithResult;
            if (toolbar != null) {
                int i3 = readTypedObject + 99;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(toolbar);
                    throw null;
                }
                Sequence sequenceOnExtraCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(toolbar);
                if (sequenceOnExtraCallback != null) {
                    Iterator itIAuthTabCallback = sequenceOnExtraCallback.IAuthTabCallback();
                    while (itIAuthTabCallback.hasNext()) {
                        int i4 = readTypedObject + 89;
                        ICustomTabsCallback = i4 % 128;
                        int i5 = i4 % 2;
                        View view2 = (View) itIAuthTabCallback.next();
                        if (!(!(view2 instanceof TextView))) {
                            ((TextView) view2).setAlpha(f);
                        }
                    }
                }
            }
        }
        if (this.IAuthTabCallbackStub) {
            return;
        }
        int i6 = readTypedObject + 93;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        Object objEvaluate = this.onExtraCallbackWithResult.evaluate(f, Integer.valueOf(((Integer) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 810610427, -810610427, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback())).intValue()), Integer.valueOf(asBinder()));
        Intrinsics.checkNotNull(objEvaluate, "");
        int iIntValue = ((Integer) objEvaluate).intValue();
        if (!z) {
            int i8 = readTypedObject + 95;
            ICustomTabsCallback = i8 % 128;
            int i9 = i8 % 2;
            if (this.onNavigationEvent == iIntValue) {
                return;
            }
        }
        IAuthTabCallback(iIntValue);
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 39;
        int i4 = i3 % 128;
        readTypedObject = i4;
        int i5 = i3 % 2;
        Toolbar toolbar = this.extraCallbackWithResult;
        if (toolbar != null) {
            int i6 = i4 + 31;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                onExtraCallbackWithResult(toolbar, i);
                int i7 = 79 / 0;
            } else {
                onExtraCallbackWithResult(toolbar, i);
            }
        }
        this.onNavigationEvent = i;
        int i8 = ICustomTabsCallback + 125;
        readTypedObject = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(ViewGroup viewGroup, int i) {
        Drawable drawable;
        int i2 = 2 % 2;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (!(!(childAt instanceof ViewGroup))) {
                onExtraCallbackWithResult((ViewGroup) childAt, i);
            } else if (!(childAt instanceof TextView)) {
                if ((childAt instanceof ImageView) && (drawable = ((ImageView) childAt).getDrawable()) != null) {
                    int i4 = ICustomTabsCallback + 37;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    onWarmupCompleted(drawable, i);
                    if (i5 == 0) {
                        throw null;
                    }
                    int i6 = ICustomTabsCallback + 9;
                    readTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                int i8 = ICustomTabsCallback + 89;
                readTypedObject = i8 % 128;
                int i9 = i8 % 2;
                ((TextView) childAt).setTextColor(i);
            }
        }
    }

    private final void onWarmupCompleted(Drawable drawable, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 57;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        CameraControllerExternalSyntheticLambda9.IAuthTabCallback(drawable, i);
        int i5 = readTypedObject + 13;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        MaterialShapeDrawable background = getBackground();
        Object obj = null;
        if (!(!(background instanceof ColorDrawable))) {
            int color = ((ColorDrawable) background).getColor();
            int i2 = readTypedObject + 19;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return color;
            }
            obj.hashCode();
            throw null;
        }
        if (!(!(background instanceof MaterialShapeDrawable))) {
            int i3 = readTypedObject + 61;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            ColorStateList fillColor = background.getFillColor();
            if (fillColor != null) {
                int i5 = readTypedObject + 67;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    fillColor.getDefaultColor();
                    obj.hashCode();
                    throw null;
                }
                int defaultColor = fillColor.getDefaultColor();
                int i6 = readTypedObject + 49;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                return defaultColor;
            }
        }
        int i8 = ICustomTabsCallback + 57;
        readTypedObject = i8 % 128;
        if (i8 % 2 != 0) {
            return 255;
        }
        throw null;
    }

    public final Toolbar onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        Toolbar toolbar = this.extraCallbackWithResult;
        int i5 = i3 + 75;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return toolbar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        tossCoreWebView.onWarmupCompleted((onNavigationEvent) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 681975045, -681975043, iOnExtraCallback2));
        int i4 = ICustomTabsCallback + 105;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossCoreWebView, "");
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            tossCoreWebView.onNavigationEvent((onNavigationEvent) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 681975045, -681975043, iOnExtraCallback2));
            return;
        }
        Intrinsics.checkNotNullParameter(tossCoreWebView, "");
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        tossCoreWebView.onNavigationEvent((onNavigationEvent) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 681975045, -681975043, iOnExtraCallback4));
        int i3 = 10 / 0;
    }

    private static final void onWarmupCompleted(ScrollView scrollView, TransparentAppBarLayout transparentAppBarLayout) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        transparentAppBarLayout.setScrollProgress(Math.max(Math.min(transparentAppBarLayout.getInterfaceDescriptor, scrollView.getScrollY()), 0) / transparentAppBarLayout.getInterfaceDescriptor);
        int i4 = ICustomTabsCallback + 53;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setScrollProgress(this.onTransact);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public void setBackgroundProgress(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setBackgroundAlpha$default(this, f, false, 2, null);
        int i4 = readTypedObject + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onDetachedFromWindow() {
        int i = 2 % 2;
        super/*com.google.android.material.appbar.AppBarLayout*/.onDetachedFromWindow();
        Toolbar toolbar = this.extraCallbackWithResult;
        if (toolbar != null) {
            int i2 = readTypedObject + 21;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            toolbar.setOnHierarchyChangeListener(null);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = readTypedObject + 125;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ int onExtraCallbackWithResult(Context context) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Integer) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{context}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1833472264, -1833472263, iOnExtraCallback2)).intValue();
    }

    public static final /* synthetic */ void onExtraCallback(TransparentAppBarLayout transparentAppBarLayout, boolean z) throws NoWhenBranchMatchedException {
        Object[] objArr = {transparentAppBarLayout, Boolean.valueOf(z)};
        IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1853701750, -1853701746, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private final int IAuthTabCallbackDefault() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Integer) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 810610427, -810610427, iOnExtraCallback2)).intValue();
    }

    private final onNavigationEvent IAuthTabCallbackStub() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (onNavigationEvent) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 681975045, -681975043, iOnExtraCallback2);
    }

    private final void onTransact() throws NoWhenBranchMatchedException {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{this}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2113330625, 2113330628, iOnExtraCallback2);
    }
}
