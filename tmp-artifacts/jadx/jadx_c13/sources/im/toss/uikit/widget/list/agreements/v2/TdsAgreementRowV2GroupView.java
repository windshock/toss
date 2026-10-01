package im.toss.uikit.widget.list.agreements.v2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AFj1zSDKAFa1ySDK;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.M_;
import o.TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0;
import o.UpdatableAnimationStateExternalSyntheticLambda0;
import o.UpdatableAnimationStateExternalSyntheticLambda1;
import o.ensureCausesIsMutable;
import o.r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
import o.setReferrerCustomerId;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsAgreementRowV2GroupView extends ConstraintLayout {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final boolean IAuthTabCallback;
    private TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private boolean asInterface;
    private ValueAnimator onExtraCallback;
    private final AFj1zSDKAFa1ySDK onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2GroupView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2GroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(IAuthTabCallbackDefault(view));
        }
        IAuthTabCallbackDefault(view);
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(IAuthTabCallbackStub(view));
        }
        IAuthTabCallbackStub(view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -334119443, 334119445, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView, view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        int i4 = asBinder + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = asBinder + 101;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, view);
        int i4 = onTransact + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    public static /* synthetic */ int onNavigationEvent(boolean z, TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(z, tdsAgreementRowV2GroupView);
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback = onExtraCallback(z, tdsAgreementRowV2GroupView);
        int i3 = asBinder + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return iOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(tdsAgreementRowV2GroupView, view);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(tdsAgreementRowV2GroupView, view);
        int i3 = onTransact + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(tdsAgreementRowV2GroupView, valueAnimator);
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, boolean z, UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsAgreementRowV2GroupView, z, updatableAnimationStateExternalSyntheticLambda1, f, f2);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = asBinder + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView] */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i2;
        int i9 = ~(i8 | i6);
        int i10 = (~i6) | (~((~i2) | i3));
        int i11 = (~(i6 | i2)) | (~(i7 | i6)) | (~i8);
        int i12 = i3 + i2 + i + ((-953487067) * i4) + ((-1992133889) * i5);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i2) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i4) + (1961361408 * i5) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i2 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i4 * 2077717299) + (i5 * 1957688713) + (i13 * 166854656);
        switch (i14 + (i15 * i15 * (-213778432))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                ?? r8 = (TdsAgreementRowV2GroupView) objArr[0];
                final Function1 function1 = (Function1) objArr[1];
                int i16 = 2 % 2;
                int i17 = asBinder + 123;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                if (function1 != null) {
                    ((TdsAgreementRowV2GroupView) r8).onExtraCallbackWithResult.IAuthTabCallbackStub.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i19 = 2 % 2;
                            int i20 = onWarmupCompleted + 85;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 == 0) {
                                TdsAgreementRowV2GroupView.onWarmupCompleted(function1, view);
                                int i21 = 27 / 0;
                            } else {
                                TdsAgreementRowV2GroupView.onWarmupCompleted(function1, view);
                            }
                            int i22 = onExtraCallback + 45;
                            onWarmupCompleted = i22 % 128;
                            int i23 = i22 % 2;
                        }
                    });
                    ConstraintLayout constraintLayout = ((TdsAgreementRowV2GroupView) r8).onExtraCallbackWithResult.IAuthTabCallbackStub;
                    M_ m_ = M_.onExtraCallback;
                    Context context = r8.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    constraintLayout.setBackgroundResource(m_.onTransact(context));
                    int i19 = asBinder + 9;
                    onTransact = i19 % 128;
                    int i20 = i19 % 2;
                } else {
                    ((TdsAgreementRowV2GroupView) r8).onExtraCallbackWithResult.IAuthTabCallbackStub.setOnClickListener(null);
                    ((TdsAgreementRowV2GroupView) r8).onExtraCallbackWithResult.IAuthTabCallbackStub.setBackgroundResource(0);
                }
                return null;
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, view);
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public abstract BaseTextView IAuthTabCallback();

    public abstract int onExtraCallback();

    public abstract int onExtraCallbackWithResult();

    public abstract int onNavigationEvent();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsAgreementRowV2GroupView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super(context, attributeSet, i);
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(context, "");
        AFj1zSDKAFa1ySDK aFj1zSDKAFa1ySDKIAuthTabCallback = AFj1zSDKAFa1ySDK.IAuthTabCallback(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFj1zSDKAFa1ySDKIAuthTabCallback, "");
        this.onExtraCallbackWithResult = aFj1zSDKAFa1ySDKIAuthTabCallback;
        if (getId() == -1) {
            setId(R.id.tds_agreement_row_v2_group);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementRowV2Group, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = asBinder + 7;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
            z2 = true;
            z3 = false;
            z4 = false;
            int i5 = 0;
            while (i5 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.TdsAgreementRowV2Group_title) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        int i6 = onTransact + 9;
                        asBinder = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 34 / 0;
                        }
                    } else {
                        str = string;
                    }
                } else if (index == R.styleable.TdsAgreementRowV2Group_collapsable) {
                    z3 = typedArrayObtainStyledAttributes.getBoolean(index, z3);
                } else if (index == R.styleable.TdsAgreementRowV2Group_collapsed) {
                    z4 = typedArrayObtainStyledAttributes.getBoolean(index, z4);
                } else if (index == R.styleable.TdsAgreementRowV2Group_checkable) {
                    z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                } else if (index == R.styleable.TdsAgreementRowV2Group_arrow) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                }
                i5++;
                int i8 = onTransact + 107;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            int i10 = 2 % 2;
            z = true;
            z2 = true;
            z3 = false;
            z4 = false;
        }
        this.asInterface = (z3 && (z4 ^ true)) ? false : true;
        this.onWarmupCompleted = z3 && z;
        this.onNavigationEvent = z2;
        this.IAuthTabCallback = z;
        access100();
        IAuthTabCallback(str);
        onNavigationEvent(this.onWarmupCompleted);
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2037625482, -2037625477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(this.onNavigationEvent)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        onExtraCallback(z);
        IAuthTabCallback((Function1<? super View, Unit>) new Function1() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 15;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                Unit unitOnNavigationEvent = TdsAgreementRowV2GroupView.onNavigationEvent(this.f$0, (View) obj);
                if (i13 != 0) {
                    int i14 = 32 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV2GroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 107;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 39;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ int IAuthTabCallback(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tdsAgreementRowV2GroupView.getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int interfaceDescriptor = tdsAgreementRowV2GroupView.getInterfaceDescriptor();
        int i3 = onTransact + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static final /* synthetic */ void onExtraCallback(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        tdsAgreementRowV2GroupView.onExtraCallbackWithResult(i, z);
        int i5 = asBinder + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        tdsAgreementRowV2GroupView.IAuthTabCallbackStub = i;
        int i6 = i3 + 73;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 64 / 0;
        }
    }

    public static final class onNavigationEvent implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onNavigationEvent(Function0 function0, boolean z) {
            this.onWarmupCompleted = function0;
            this.onExtraCallback = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            TdsAgreementRowV2GroupView.onExtraCallback(TdsAgreementRowV2GroupView.this, ((Number) this.onWarmupCompleted.invoke()).intValue(), this.onExtraCallback);
            int i12 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public static final class onWarmupCompleted implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public onWarmupCompleted() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onNavigationEvent + 73;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                view.removeOnLayoutChangeListener(this);
                TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = TdsAgreementRowV2GroupView.this;
                TdsAgreementRowV2GroupView.onNavigationEvent(tdsAgreementRowV2GroupView, TdsAgreementRowV2GroupView.IAuthTabCallback(tdsAgreementRowV2GroupView));
                int i11 = 31 / 0;
            } else {
                view.removeOnLayoutChangeListener(this);
                TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView2 = TdsAgreementRowV2GroupView.this;
                TdsAgreementRowV2GroupView.onNavigationEvent(tdsAgreementRowV2GroupView2, TdsAgreementRowV2GroupView.IAuthTabCallback(tdsAgreementRowV2GroupView2));
            }
            int i12 = onNavigationEvent + 105;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static final Unit IAuthTabCallback(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object obj = null;
        if (tdsAgreementRowV2GroupView.onNavigationEvent) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            if (tdsCheckBoxV2View != null) {
                int i2 = asBinder + 81;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    tdsCheckBoxV2View.toggle();
                    throw null;
                }
                tdsCheckBoxV2View.toggle();
            }
        } else if (tdsAgreementRowV2GroupView.onWarmupCompleted) {
            int i3 = onTransact + 49;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                tdsAgreementRowV2GroupView.access000();
                obj.hashCode();
                throw null;
            }
            tdsAgreementRowV2GroupView.access000();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 81;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unit;
    }

    private final void access100() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            throw null;
        }
        BaseTextView baseTextViewIAuthTabCallback = IAuthTabCallback();
        if (baseTextViewIAuthTabCallback != null) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1001729207, -1001729206, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, baseTextViewIAuthTabCallback}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            int i3 = onTransact + 81;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final boolean IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        boolean z2 = view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[PHI: r6
      0x003f: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v9 java.lang.Object) binds: [B:11:0x003d, B:8:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStubProxy() {
        Object next;
        int id;
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        Sequence sequenceAccess100 = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this), new Function1() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean boolValueOf;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {(View) obj};
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                if (i4 == 0) {
                    boolValueOf = Boolean.valueOf(((Boolean) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -911850595, 911850603, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue());
                    int i5 = 15 / 0;
                } else {
                    boolValueOf = Boolean.valueOf(((Boolean) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -911850595, 911850603, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue());
                }
                int i6 = onExtraCallbackWithResult + 97;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 84 / 0;
                }
                return boolValueOf;
            }
        });
        Iterator itIAuthTabCallback = sequenceAccess100.IAuthTabCallback();
        int i2 = 0;
        while (itIAuthTabCallback.hasNext()) {
            int i3 = asBinder + 49;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                next = itIAuthTabCallback.next();
                int i4 = 29 / 0;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
            } else {
                next = itIAuthTabCallback.next();
                if (i2 < 0) {
                }
            }
            View view = (View) next;
            view.setPadding(view.getPaddingLeft(), onNavigationEvent(), view.getPaddingRight(), view.getPaddingBottom());
            if (i2 == 0) {
                id = R.id.touchAreaCenter;
                int i5 = asBinder + 111;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            } else {
                id = ((View) ensureCausesIsMutable.onNavigationEvent(sequenceAccess100, i2 - 1)).getId();
            }
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(view.getId(), 3, id, 4);
            i2++;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
    }

    private static final boolean onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        boolean z = view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        Iterator itIAuthTabCallback = ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this), new Function1() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(TdsAgreementRowV2GroupView.onExtraCallback((View) obj));
                if (i4 == 0) {
                    int i5 = 9 / 0;
                }
                return boolValueOf;
            }
        }).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i2 = onTransact + 43;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            ((View) itIAuthTabCallback.next()).measure(0, 0);
        }
        int i4 = asBinder + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = (TdsAgreementRowV2GroupView) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        tdsAgreementRowV2GroupView.access000();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = z;
            if (z) {
                onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, new Function1() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 99;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnExtraCallback = TdsAgreementRowV2GroupView.onExtraCallback(this.f$0, (View) obj2);
                        int i6 = IAuthTabCallback + 55;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnExtraCallback;
                    }
                }}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                int i3 = asBinder + 35;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            onExtraCallback(true, true);
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, null}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            return;
        }
        this.onWarmupCompleted = z;
        obj.hashCode();
        throw null;
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(this, this.asInterface, true, 4, (Object) null);
        } else {
            onWarmupCompleted(this, !this.asInterface, false, 2, (Object) null);
        }
        int i3 = asBinder + 7;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCollapsed");
        }
        int i3 = asBinder;
        int i4 = i3 + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 125;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        }
        tdsAgreementRowV2GroupView.onExtraCallback(z, z2);
        int i8 = onTransact + 99;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallbackStub(View view) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            return view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
        }
        Intrinsics.checkNotNullParameter(view, "");
        int i3 = 77 / 0;
        return view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        if (asBinder() == 0) {
            int i2 = asBinder;
            int i3 = i2 + 15;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!z) {
                int i5 = i2 + 9;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                onExtraCallback(true, z2);
                return;
            }
        }
        this.asInterface = z;
        if (ensureCausesIsMutable.writeTypedObject(ensureCausesIsMutable.access100(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this), new Function1() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 83;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1509143398, -1509143391, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{(View) obj}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue());
                int i10 = IAuthTabCallback + 43;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                return boolValueOf;
            }
        }))) {
            int i7 = onTransact + 109;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (z && this.onWarmupCompleted) {
                onWarmupCompleted(true, z2);
                int i9 = onTransact + 33;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
            } else {
                onWarmupCompleted(false, z2);
            }
        }
        onExtraCallback(z ? 0.0f : 90.0f, z2);
    }

    public final void IAuthTabCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        BaseTextView baseTextView = (BaseTextView) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 671659157, -671659153, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        if (baseTextView != null) {
            baseTextView.setText(charSequence);
            int i3 = onTransact + 37;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onFinishInflate() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted();
        super/*android.view.View*/.onFinishInflate();
        int i4 = onTransact + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
            onWarmupCompleted();
            int i4 = 77 / 0;
        } else {
            super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
            onWarmupCompleted();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeView(@Nullable View view) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.ViewGroup*/.removeView(view);
        onWarmupCompleted();
        int i4 = onTransact + 109;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final void onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onExtraCallbackWithResult.asInterface.addView(view);
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = (TdsAgreementRowV2GroupView) objArr[0];
        View view = (View) objArr[1];
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tdsAgreementRowV2GroupView.onExtraCallbackWithResult.asInterface.addView(view, layoutParams);
            int i3 = 61 / 0;
        } else {
            tdsAgreementRowV2GroupView.onExtraCallbackWithResult.asInterface.addView(view, layoutParams);
        }
        int i4 = onTransact + 13;
        asBinder = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        if (tdsCheckBoxV2View == null || !tdsCheckBoxV2View.isChecked()) {
            int i2 = asBinder + 55;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = onTransact + 21;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 0;
        TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = (TdsAgreementRowV2GroupView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        tdsAgreementRowV2GroupView.onNavigationEvent = zBooleanValue;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        if (tdsCheckBoxV2View != null) {
            if (!zBooleanValue) {
                i = 8;
            } else {
                int i3 = asBinder + 95;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            tdsCheckBoxV2View.setVisibility(i);
        }
        int i5 = onTransact + 3;
        asBinder = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback(@Nullable final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        if (function1 != null) {
            this.onExtraCallbackWithResult.asInterface.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 83;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        TdsAgreementRowV2GroupView.onExtraCallbackWithResult(function1, view);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    TdsAgreementRowV2GroupView.onExtraCallbackWithResult(function1, view);
                    int i4 = onExtraCallback + 83;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            });
            int i2 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.onExtraCallbackWithResult.asInterface.setOnClickListener(null);
        int i4 = onTransact + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = onTransact + 41;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (z) {
            this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(0);
            return;
        }
        this.onExtraCallbackWithResult.IAuthTabCallbackStub.setVisibility(8);
        int i3 = asBinder + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v15 android.animation.ValueAnimator) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(float f, boolean z) {
        ValueAnimator valueAnimator;
        float rotation;
        long j;
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            valueAnimator = this.onExtraCallback;
            int i3 = 39 / 0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            valueAnimator = this.onExtraCallback;
            if (valueAnimator != null) {
            }
        }
        View viewOnTransact = onTransact();
        if (viewOnTransact != null) {
            int i4 = onTransact + 37;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            rotation = viewOnTransact.getRotation();
        } else {
            rotation = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(rotation, f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    TdsAgreementRowV2GroupView.onNavigationEvent(this.f$0, valueAnimator2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TdsAgreementRowV2GroupView.onNavigationEvent(this.f$0, valueAnimator2);
                int i8 = onExtraCallbackWithResult + 59;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        if (z) {
            int i6 = onTransact;
            int i7 = i6 + 95;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 51;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            j = 1;
        } else {
            j = 200;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.start();
        this.onExtraCallback = valueAnimatorOfFloat;
    }

    private static final void IAuthTabCallback(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        View viewOnTransact = tdsAgreementRowV2GroupView.onTransact();
        if (viewOnTransact != null) {
            viewOnTransact.setRotation(fFloatValue);
        }
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private static final int onExtraCallback(boolean z, TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!z) {
            int height = tdsAgreementRowV2GroupView.onExtraCallbackWithResult.asInterface.getHeight() + tdsAgreementRowV2GroupView.IAuthTabCallbackStub;
            int i5 = onTransact + 81;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return height;
        }
        int i7 = i2 + 81;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        int height2 = tdsAgreementRowV2GroupView.onExtraCallbackWithResult.asInterface.getHeight();
        if (i8 == 0) {
            int i9 = 68 / 0;
        }
        return height2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(final boolean z, boolean z2) {
        int i = 2 % 2;
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            if (((View) itIAuthTabCallback.next()) instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM) {
                int i2 = asBinder + 43;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
                if (transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 != null) {
                    transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.onExtraCallback();
                }
                Function0 function0 = new Function0() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 81;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Integer numValueOf = Integer.valueOf(TdsAgreementRowV2GroupView.onNavigationEvent(z, this));
                        int i6 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            return numValueOf;
                        }
                        throw null;
                    }
                };
                if (!z2) {
                    TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda02 = new TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0(new UpdatableAnimationStateExternalSyntheticLambda0());
                    transformableStateKtanimateZoomBy3ExternalSyntheticLambda02.onExtraCallbackWithResult(setReferrerCustomerId.onExtraCallbackWithResult.onExtraCallbackWithResult());
                    transformableStateKtanimateZoomBy3ExternalSyntheticLambda02.IAuthTabCallback(new UpdatableAnimationStateExternalSyntheticLambda1.onExtraCallbackWithResult() { // from class: im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final void onAnimationUpdate(UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
                            int i3 = 2 % 2;
                            int i4 = onWarmupCompleted + 19;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = this.f$0;
                            if (i5 == 0) {
                                TdsAgreementRowV2GroupView.onNavigationEvent(tdsAgreementRowV2GroupView, z, updatableAnimationStateExternalSyntheticLambda1, f, f2);
                            } else {
                                TdsAgreementRowV2GroupView.onNavigationEvent(tdsAgreementRowV2GroupView, z, updatableAnimationStateExternalSyntheticLambda1, f, f2);
                                int i6 = 42 / 0;
                            }
                        }
                    });
                    transformableStateKtanimateZoomBy3ExternalSyntheticLambda02.onWarmupCompleted(getMeasuredHeight());
                    transformableStateKtanimateZoomBy3ExternalSyntheticLambda02.asInterface(((Number) function0.invoke()).intValue());
                    this.IAuthTabCallbackDefault = transformableStateKtanimateZoomBy3ExternalSyntheticLambda02;
                    int i3 = onTransact + 63;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                if (isLaidOut()) {
                    int i5 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    if (!isLayoutRequested()) {
                        onExtraCallback(this, ((Number) function0.invoke()).intValue(), z);
                        return;
                    }
                }
                addOnLayoutChangeListener(new onNavigationEvent(function0, z));
                int i7 = asBinder + 87;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
        }
    }

    private static final void onWarmupCompleted(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, boolean z, UpdatableAnimationStateExternalSyntheticLambda1 updatableAnimationStateExternalSyntheticLambda1, float f, float f2) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        tdsAgreementRowV2GroupView.onExtraCallbackWithResult((int) f, z);
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getInterfaceDescriptor() {
        int i = 2 % 2;
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        int height = 0;
        while (itIAuthTabCallback.hasNext()) {
            View view = (View) itIAuthTabCallback.next();
            if (!(view instanceof TdsAgreementRowV2GroupView)) {
                if (view instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM) {
                    int i2 = onTransact + 19;
                    asBinder = i2 % 128;
                    height = i2 % 2 != 0 ? height / (view.getMeasuredHeight() / ((view.getPaddingTop() >>> view.getPaddingBottom()) >> 5)) : height + view.getMeasuredHeight() + ((view.getPaddingTop() + view.getPaddingBottom()) / 2);
                }
            } else {
                int i3 = asBinder + 37;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = (TdsAgreementRowV2GroupView) view;
                height += tdsAgreementRowV2GroupView.onExtraCallbackWithResult.asInterface.getHeight() + onNavigationEvent();
                if (!tdsAgreementRowV2GroupView.onWarmupCompleted || !tdsAgreementRowV2GroupView.asInterface) {
                    height += tdsAgreementRowV2GroupView.getInterfaceDescriptor();
                }
            }
        }
        int i5 = onTransact + 115;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return height;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ConstraintLayout constraintLayout = (TdsAgreementRowV2GroupView) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = constraintLayout.findViewById(R.id.agreement_row_left_check_box);
        if (i3 != 0) {
            return tdsCheckBoxV2ViewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            findViewById(R.id.agreement_row_right_arrow);
            throw null;
        }
        View viewFindViewById = findViewById(R.id.agreement_row_right_arrow);
        int i3 = asBinder + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return viewFindViewById;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ConstraintLayout constraintLayout = (TdsAgreementRowV2GroupView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return constraintLayout.findViewById(R.id.tds_agreement_row_v2_center_text);
        }
        int i3 = 54 / 0;
        return constraintLayout.findViewById(R.id.tds_agreement_row_v2_center_text);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView, java.lang.Object] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r1 = (TdsAgreementRowV2GroupView) objArr[0];
        BaseTextView baseTextView = (BaseTextView) objArr[1];
        int i = 2 % 2;
        int i2 = R.id.tds_agreement_row_v2_center_text;
        baseTextView.setId(i2);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
        DisplayMetrics displayMetrics = r1.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = varyMatches.onNavigationEvent(Float.valueOf(12.0f), displayMetrics);
        Float fValueOf = Float.valueOf(0.0f);
        DisplayMetrics displayMetrics2 = r1.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        onextracallbackwithresult.onMessageChannelReady = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        DisplayMetrics displayMetrics3 = r1.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).rightMargin = varyMatches.onNavigationEvent(fValueOf, displayMetrics3);
        DisplayMetrics displayMetrics4 = r1.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        onextracallbackwithresult.onActivityLayout = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics4);
        Unit unit = Unit.INSTANCE;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -466186312, 466186312, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{r1, baseTextView, onextracallbackwithresult}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
        ConstraintLayout constraintLayout = ((TdsAgreementRowV2GroupView) r1).onExtraCallbackWithResult.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i3 = asBinder + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        layoutParams.width = r1.onExtraCallback();
        constraintLayout.setLayoutParams(layoutParams);
        Space space = ((TdsAgreementRowV2GroupView) r1).onExtraCallbackWithResult.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(space, "");
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i5 = onTransact + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        layoutParams2.height = r1.onExtraCallbackWithResult();
        space.setLayoutParams(layoutParams2);
        Space space2 = ((TdsAgreementRowV2GroupView) r1).onExtraCallbackWithResult.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(space2, "");
        ViewGroup.LayoutParams layoutParams3 = space2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.height = r1.onExtraCallbackWithResult();
        space2.setLayoutParams(layoutParams3);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(((TdsAgreementRowV2GroupView) r1).onExtraCallbackWithResult.asInterface);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 1, R.id.agreement_row_left_check_box, 2);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 2, R.id.touchAreaRight, 1);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 3, R.id.spaceTop, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 4, R.id.spaceBottom, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(((TdsAgreementRowV2GroupView) r1).onExtraCallbackWithResult.asInterface);
        int i7 = asBinder + 19;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (isLayoutRequested() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView.onTransact + 53;
        im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView.asBinder = r1 % 128;
        r1 = r1 % 2;
        onNavigationEvent(r3, IAuthTabCallback(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (isLayoutRequested() != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted() {
        int i = 2 % 2;
        IAuthTabCallbackStubProxy();
        IAuthTabCallback_Parcel();
        onExtraCallback(this.asInterface, true);
        if (isLaidOut()) {
            int i2 = asBinder + 65;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
        }
        addOnLayoutChangeListener(new onWarmupCompleted());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this).IAuthTabCallback();
        int i4 = 0;
        while (itIAuthTabCallback.hasNext()) {
            int i5 = asBinder + 9;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if ((((View) itIAuthTabCallback.next()) instanceof r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM) && (i4 = i4 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        int i7 = onTransact + 31;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = asBinder + 59;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getLayoutParams();
            obj.hashCode();
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i;
        setLayoutParams(layoutParams);
        if (!z) {
            int i4 = asBinder + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                IAuthTabCallbackStubProxy();
                throw null;
            }
            IAuthTabCallbackStubProxy();
        }
        int i5 = asBinder + 51;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -911850595, 911850603, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ boolean IAuthTabCallback(View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1509143398, -1509143391, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback)).booleanValue();
    }

    private final void onNavigationEvent(BaseTextView baseTextView) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1001729207, -1001729206, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, baseTextView}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private final void IAuthTabCallback(View view, ViewGroup.LayoutParams layoutParams) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -466186312, 466186312, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, view, layoutParams}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onWarmupCompleted(TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView, View view) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -334119443, 334119445, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView, view}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final BaseTextView IAuthTabCallbackStub() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (BaseTextView) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 671659157, -671659153, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final TdsCheckBoxV2View IAuthTabCallbackDefault() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (TdsCheckBoxV2View) onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 2037625482, -2037625477, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(z)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public final void onExtraCallback(@Nullable Function1<? super View, Unit> function1) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this, function1}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
    }
}
