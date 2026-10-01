package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.ads.zziea;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AFk1pSDK;
import o.AppLovinSdkSettings;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.OkHttpClientCompanion;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.access15300;
import o.clearProcessUptime;
import o.clearSelinuxLabel;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.eExternalSyntheticLambda0;
import o.ensureCausesIsMutable;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.setMethodokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Core;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsSegmentedControlV1View extends ConstraintLayout {
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final List<Integer> IAuthTabCallbackStub;
    private Rally IAuthTabCallbackStubProxy;
    private onExtraCallback IAuthTabCallback_Parcel;
    private ViewPager2 access000;
    private final List<Integer> access100;
    private final List<Integer> asBinder;
    private final List<onExtraCallbackWithResult> asInterface;
    private int getInterfaceDescriptor;
    private onWarmupCompleted onExtraCallback;
    private final List<Integer> onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final AFk1pSDK onTransact;
    private final Lazy onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.FIXED.ordinal()] = 1;
                int i = onExtraCallback + 81;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onWarmupCompleted.FLUID_WIDTH.ordinal()] = 2;
                int i4 = onExtraCallback + 99;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public interface onExtraCallbackWithResult {
        void onWarmupCompleted(@NotNull View view, int i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSegmentedControlV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSegmentedControlV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        boolean z;
        int i7 = ~i6;
        int i8 = ~((~i4) | i7 | i);
        int i9 = (~(i7 | (~i))) | (~(i | i4));
        int i10 = (~(i4 | i6)) | i;
        int i11 = i + i6 + i3 + ((-407681510) * i5) + ((-298114539) * i2);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i) + 672923648 + (2103481690 * i6) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i3) + ((-328728576) * i5) + ((-2108424192) * i2) + ((-1296629760) * i12);
        int i14 = ((i * 57881544) - 1472685786) + (i6 * 57881954) + (i8 * Core.StsUnmatchedFormats) + (i9 * Core.StsUnmatchedFormats) + (i10 * 205) + (i3 * 57881749) + (i5 * 289608994) + (i2 * 969284153) + (i12 * 813891584);
        switch (i13 + (i14 * i14 * 454098944)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                int i15 = 2 % 2;
                LinearLayoutCompat linearLayoutCompatAsBinder = ((TdsSegmentedControlV1View) objArr[0]).asBinder();
                if (linearLayoutCompatAsBinder == null) {
                    return null;
                }
                int i16 = readTypedObject + 49;
                extraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                linearLayoutCompatAsBinder.removeAllViews();
                int i18 = extraCallbackWithResult + 37;
                readTypedObject = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 4:
                TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
                Typography5 typography5 = (TdsSegmentedControlV1ItemView) objArr[1];
                int i20 = 2 % 2;
                int i21 = readTypedObject + 93;
                extraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                LinearLayoutCompat linearLayoutCompatAsBinder2 = tdsSegmentedControlV1View.asBinder();
                if (linearLayoutCompatAsBinder2 == null) {
                    return null;
                }
                int iIndexOfChild = linearLayoutCompatAsBinder2.indexOfChild(typography5);
                if (tdsSegmentedControlV1View.access000 == null) {
                    int i23 = extraCallbackWithResult + 73;
                    readTypedObject = i23 % 128;
                    int i24 = i23 % 2;
                    z = true;
                } else {
                    z = false;
                }
                onExtraCallback(tdsSegmentedControlV1View, iIndexOfChild, false, z, 2, (Object) null);
                int i25 = readTypedObject + 29;
                extraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View, int i, TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, TdsRoundLayout tdsRoundLayout, boolean z) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 15;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tdsSegmentedControlV1View, i, tdsSegmentedControlV1ItemView, tdsRoundLayout, z);
        int i5 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = extraCallbackWithResult + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = extraCallbackWithResult + 57;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(tdsSegmentedControlV1View, view, i, i2, i3, i4);
        if (i7 == 0) {
            int i8 = 77 / 0;
        }
        int i9 = readTypedObject + 39;
        extraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Rally onNavigationEvent(TdsSegmentedControlV1View tdsSegmentedControlV1View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyOnExtraCallback = onExtraCallback(tdsSegmentedControlV1View);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = readTypedObject + 39;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return rallyOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(tdsSegmentedControlV1View, view);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Rally onWarmupCompleted(TdsSegmentedControlV1View tdsSegmentedControlV1View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rally rallyIAuthTabCallback = IAuthTabCallback(tdsSegmentedControlV1View);
        int i4 = readTypedObject + 39;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return rallyIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsSegmentedControlV1View, view);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public IAuthTabCallbackStub() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                view.removeOnLayoutChangeListener(this);
                TdsSegmentedControlV1View tdsSegmentedControlV1View = TdsSegmentedControlV1View.this;
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                tdsSegmentedControlV1View.onWarmupCompleted(((Integer) TdsSegmentedControlV1View.IAuthTabCallback(-1965629107, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View}, 1965629114)).intValue(), false, true);
            } else {
                view.removeOnLayoutChangeListener(this);
                TdsSegmentedControlV1View tdsSegmentedControlV1View2 = TdsSegmentedControlV1View.this;
                int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                int iIAuthTabCallback5 = zziea.IAuthTabCallback();
                int iIAuthTabCallback6 = zziea.IAuthTabCallback();
                tdsSegmentedControlV1View2.onWarmupCompleted(((Integer) TdsSegmentedControlV1View.IAuthTabCallback(-1965629107, zziea.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4, iIAuthTabCallback6, new Object[]{tdsSegmentedControlV1View2}, 1965629114)).intValue(), false, false);
            }
            int i11 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsSegmentedControlV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(4, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.access100 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent), Integer.valueOf(varyMatches.onNavigationEvent(3, displayMetrics2))});
        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(40.0f), displayMetrics3);
        DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        this.IAuthTabCallbackStub = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent2), Integer.valueOf(varyMatches.onNavigationEvent(Float.valueOf(32.0f), displayMetrics4))});
        Float fValueOf = Float.valueOf(10.0f);
        DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(fValueOf, displayMetrics5);
        DisplayMetrics displayMetrics6 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        this.asBinder = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics6))});
        DisplayMetrics displayMetrics7 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(Float.valueOf(14.0f), displayMetrics7);
        DisplayMetrics displayMetrics8 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
        this.onExtraCallbackWithResult = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iOnNavigationEvent4), Integer.valueOf(varyMatches.onNavigationEvent(fValueOf, displayMetrics8))});
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    TdsSegmentedControlV1View.onNavigationEvent(this.f$0);
                    throw null;
                }
                Rally rallyOnNavigationEvent = TdsSegmentedControlV1View.onNavigationEvent(this.f$0);
                int i4 = onExtraCallback + 67;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return rallyOnNavigationEvent;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Rally rallyOnWarmupCompleted = TdsSegmentedControlV1View.onWarmupCompleted(this.f$0);
                int i5 = onWarmupCompleted + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return rallyOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.asInterface = new ArrayList();
        AFk1pSDK aFk1pSDKOnExtraCallbackWithResult = AFk1pSDK.onExtraCallbackWithResult(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(aFk1pSDKOnExtraCallbackWithResult, "");
        this.onTransact = aFk1pSDKOnExtraCallbackWithResult;
        this.IAuthTabCallback_Parcel = onExtraCallback.LARGE;
        this.onExtraCallback = onWarmupCompleted.FIXED;
        this.IAuthTabCallback = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TdsSegmentedControlV1View);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsSegmentedControlV1View_segmentedControlLabel) {
                    setLabel(typedArrayObtainStyledAttributes.getString(index));
                } else if (index == R.styleable.TdsSegmentedControlV1View_segmentedControlMessage) {
                    int i3 = extraCallbackWithResult + 45;
                    readTypedObject = i3 % 128;
                    if (i3 % 2 == 0) {
                        setMessage(typedArrayObtainStyledAttributes.getString(index));
                        throw null;
                    }
                    setMessage(typedArrayObtainStyledAttributes.getString(index));
                    int i4 = extraCallbackWithResult + 113;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    continue;
                }
                int i6 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i7 = 2 % 2;
        }
        setImportantForAccessibility(1);
        setClipChildren(false);
        IAuthTabCallback_Parcel();
        setAlignment(this.onExtraCallback);
        this.onTransact.onExtraCallback.setCardBackgroundColor(OkHttpClientCompanion.onWarmupCompleted(this, eExternalSyntheticLambda0.SegmentedControlArrowButtonFill));
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tdsSegmentedControlV1View.getInterfaceDescriptor;
        if (i3 != 0) {
            return Integer.valueOf(i4);
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsSegmentedControlV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject + 105;
            int i4 = i3 % 128;
            extraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 53;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = readTypedObject + 65;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        public static final onExtraCallback LARGE = new onExtraCallback("LARGE", 0);
        public static final onExtraCallback SMALL = new onExtraCallback("SMALL", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                onExtraCallback onextracallback = LARGE;
                onExtraCallback onextracallback2 = SMALL;
                onextracallbackArr = new onExtraCallback[5];
                onextracallbackArr[1] = onextracallback;
                onextracallbackArr[1] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{LARGE, SMALL};
            }
            int i4 = i3 + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            EnumEntries<onExtraCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 26 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 == 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 37;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted FIXED = new onWarmupCompleted("FIXED", 0);
        public static final onWarmupCompleted FLUID_WIDTH = new onWarmupCompleted("FLUID_WIDTH", 1);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted = FIXED;
                onWarmupCompleted onwarmupcompleted2 = FLUID_WIDTH;
                onwarmupcompletedArr = new onWarmupCompleted[2];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{FIXED, FLUID_WIDTH};
            }
            int i4 = i3 + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 47 / 0;
            }
        }
    }

    private final Rally IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) this.onNavigationEvent.getValue();
        int i4 = extraCallbackWithResult + 113;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return rally;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Rally onExtraCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CardView cardView = tdsSegmentedControlV1View.onTransact.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{cardView, isMuted.onNavigationEvent(isMuted.onExtraCallbackWithResult(appLovinSdkSettings, (Integer) null, Integer.valueOf(-varyMatches.onNavigationEvent(8, displayMetrics)), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = extraCallbackWithResult + 41;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return rally;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = (Rally) tdsSegmentedControlV1View.onWarmupCompleted.getValue();
        int i4 = readTypedObject + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return rally;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Rally IAuthTabCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CardView cardView = tdsSegmentedControlV1View.onTransact.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        DisplayMetrics displayMetrics = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{cardView, isMuted.onNavigationEvent(isMuted.onExtraCallbackWithResult(appLovinSdkSettings, (Integer) null, Integer.valueOf(-varyMatches.onNavigationEvent(16, displayMetrics)), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return rally;
    }

    private final LinearLayoutCompat asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LinearLayoutCompat linearLayoutCompatFindViewById = this.onTransact.getRoot().findViewById(im.toss.uikit.R.id.tabContainer);
        int i4 = readTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return linearLayoutCompatFindViewById;
    }

    private final TdsRoundLayout IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View root = this.onTransact.getRoot();
        if (i3 == 0) {
            return root.findViewById(im.toss.uikit.R.id.tabCursor);
        }
        int i4 = 48 / 0;
        return root.findViewById(im.toss.uikit.R.id.tabCursor);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) tdsSegmentedControlV1View.onTransact.getRoot().findViewById(im.toss.uikit.R.id.tabScrollView);
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return horizontalScrollView;
    }

    public final void setTab(boolean z) {
        Sequence sequenceOnExtraCallback;
        Sequence sequenceOnExtraCallback2;
        int i = 2 % 2;
        this.IAuthTabCallbackDefault = z;
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null || (sequenceOnExtraCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayoutCompatAsBinder)) == null || (sequenceOnExtraCallback2 = clearProcessUptime.onExtraCallback((Sequence<?>) sequenceOnExtraCallback, TdsSegmentedControlV1ItemView.class)) == null) {
            return;
        }
        int i2 = readTypedObject + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Iterator itIAuthTabCallback = sequenceOnExtraCallback2.IAuthTabCallback();
        int i4 = readTypedObject + 73;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        while (itIAuthTabCallback.hasNext()) {
            int i6 = extraCallbackWithResult + 67;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                ((TdsSegmentedControlV1ItemView) itIAuthTabCallback.next()).setTab(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((TdsSegmentedControlV1ItemView) itIAuthTabCallback.next()).setTab(z);
        }
    }

    public final void setSize(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallback_Parcel = onextracallback;
            onWarmupCompleted(onextracallback);
            int i3 = 73 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallback_Parcel = onextracallback;
            onWarmupCompleted(onextracallback);
        }
        int i4 = readTypedObject + 123;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAlignment(@NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (this.onExtraCallback != onwarmupcompleted) {
            int i2 = extraCallbackWithResult + 29;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback = onwarmupcompleted;
            IAuthTabCallbackStubProxy();
            onTransact();
            onExtraCallbackWithResult();
            requestLayout();
            int i4 = readTypedObject + 115;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setAnimateCursor(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{tdsSegmentedControlV1View}, 1489414222);
        if (horizontalScrollView != null) {
            int i3 = extraCallbackWithResult + 51;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            horizontalScrollView.smoothScrollTo(i4, i4);
        }
        int i5 = readTypedObject + 51;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        setWillNotDraw(false);
        this.onTransact.onExtraCallback.setAlpha(0.0f);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        eExternalSyntheticLambda0 eexternalsyntheticlambda0 = eExternalSyntheticLambda0.SegmentedControlGradientLayerFillGradientStart;
        int iOnWarmupCompleted = OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda0);
        eExternalSyntheticLambda0 eexternalsyntheticlambda02 = eExternalSyntheticLambda0.SegmentedControlGradientLayerFillGradientEnd;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iOnWarmupCompleted, OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda02)});
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda0), OkHttpClientCompanion.onWarmupCompleted(this, eexternalsyntheticlambda02)});
        this.onTransact.onExtraCallbackWithResult.setBackground(gradientDrawable);
        this.onTransact.onTransact.setBackground(gradientDrawable2);
        this.onTransact.onWarmupCompleted.setImageResource(im.toss.tds.R.drawable.icon_arrow_left_small);
        this.onTransact.onExtraCallback.setOnClickListener(new View.OnClickListener() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, view};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                if (i4 != 0) {
                    TdsSegmentedControlV1View.IAuthTabCallback(-290008853, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, objArr, 290008855);
                    return;
                }
                TdsSegmentedControlV1View.IAuthTabCallback(-290008853, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, objArr, 290008855);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onTransact();
        IAuthTabCallbackStubProxy();
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[PHI: r2
      0x0061: PHI (r2v8 android.widget.HorizontalScrollView) = (r2v7 android.widget.HorizontalScrollView), (r2v14 android.widget.HorizontalScrollView) binds: [B:10:0x005f, B:7:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult() {
        HorizontalScrollView horizontalScrollView;
        int i = 2 % 2;
        if (this.onExtraCallback == onWarmupCompleted.FLUID_WIDTH) {
            int i2 = readTypedObject + 37;
            extraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this}, 1489414222);
                int i3 = 25 / 0;
                if (horizontalScrollView != null) {
                    int scrollX = horizontalScrollView.getScrollX();
                    int i4 = extraCallbackWithResult;
                    int i5 = i4 + 11;
                    readTypedObject = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 % 3;
                    }
                    if (scrollX > 0) {
                        int i7 = i4 + 107;
                        readTypedObject = i7 % 128;
                        if (i7 % 2 != 0) {
                            int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                            int iIAuthTabCallback5 = zziea.IAuthTabCallback();
                            int iIAuthTabCallback6 = zziea.IAuthTabCallback();
                            ((Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4, iIAuthTabCallback6, new Object[]{this}, -574658467)).ICustomTabsServiceStub();
                            if (IAuthTabCallbackDefault().postMessage()) {
                                return;
                            }
                            isFireOS.onExtraCallbackWithResult(IAuthTabCallbackDefault(), false, 1, (Object) null);
                            return;
                        }
                        int iIAuthTabCallback7 = zziea.IAuthTabCallback();
                        int iIAuthTabCallback8 = zziea.IAuthTabCallback();
                        int iIAuthTabCallback9 = zziea.IAuthTabCallback();
                        ((Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback8, iIAuthTabCallback7, iIAuthTabCallback9, new Object[]{this}, -574658467)).ICustomTabsServiceStub();
                        IAuthTabCallbackDefault().postMessage();
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                int iIAuthTabCallback10 = zziea.IAuthTabCallback();
                int iIAuthTabCallback11 = zziea.IAuthTabCallback();
                int iIAuthTabCallback12 = zziea.IAuthTabCallback();
                horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), iIAuthTabCallback11, iIAuthTabCallback10, iIAuthTabCallback12, new Object[]{this}, 1489414222);
                if (horizontalScrollView != null) {
                }
            }
            IAuthTabCallbackDefault().ICustomTabsServiceStub();
            int iIAuthTabCallback13 = zziea.IAuthTabCallback();
            int iIAuthTabCallback14 = zziea.IAuthTabCallback();
            int iIAuthTabCallback15 = zziea.IAuthTabCallback();
            if (((Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback14, iIAuthTabCallback13, iIAuthTabCallback15, new Object[]{this}, -574658467)).postMessage()) {
                return;
            }
            int i8 = extraCallbackWithResult + 29;
            readTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                int iIAuthTabCallback16 = zziea.IAuthTabCallback();
                int iIAuthTabCallback17 = zziea.IAuthTabCallback();
                int iIAuthTabCallback18 = zziea.IAuthTabCallback();
                isFireOS.onExtraCallbackWithResult((Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback17, iIAuthTabCallback16, iIAuthTabCallback18, new Object[]{this}, -574658467), true, 0, (Object) null);
                return;
            }
            int iIAuthTabCallback19 = zziea.IAuthTabCallback();
            int iIAuthTabCallback20 = zziea.IAuthTabCallback();
            int iIAuthTabCallback21 = zziea.IAuthTabCallback();
            isFireOS.onExtraCallbackWithResult((Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback20, iIAuthTabCallback19, iIAuthTabCallback21, new Object[]{this}, -574658467), false, 1, (Object) null);
            return;
        }
        this.onTransact.onExtraCallback.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onTransact() {
        int i;
        int i2 = 2 % 2;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this}, 1489414222);
        int i3 = 8;
        if (horizontalScrollView != null) {
            int i4 = extraCallbackWithResult + 115;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (horizontalScrollView.canScrollHorizontally(-1) && this.onExtraCallback == onWarmupCompleted.FLUID_WIDTH) {
                int i6 = readTypedObject + 5;
                extraCallbackWithResult = i6 % 128;
                i = i6 % 2 != 0 ? 1 : 0;
            } else {
                i = 8;
            }
        }
        HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this}, 1489414222);
        if (horizontalScrollView2 != null) {
            int i7 = extraCallbackWithResult + 105;
            readTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                if (!horizontalScrollView2.canScrollHorizontally(1)) {
                    i3 = 46;
                } else if (this.onExtraCallback == onWarmupCompleted.FLUID_WIDTH) {
                    int i8 = extraCallbackWithResult + 59;
                    readTypedObject = i8 % 128;
                    i3 = i8 % 2 == 0 ? 1 : 0;
                }
            } else if (horizontalScrollView2.canScrollHorizontally(1)) {
            }
        }
        if (this.onTransact.onExtraCallbackWithResult.getVisibility() != i) {
            int i9 = extraCallbackWithResult + 27;
            readTypedObject = i9 % 128;
            if (i9 % 2 == 0) {
                this.onTransact.onExtraCallbackWithResult.setVisibility(i);
                int i10 = 40 / 0;
            } else {
                this.onTransact.onExtraCallbackWithResult.setVisibility(i);
            }
        }
        if (this.onTransact.onTransact.getVisibility() != i3) {
            this.onTransact.onTransact.setVisibility(i3);
        }
        int i11 = readTypedObject + 29;
        extraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {noStore.Companion};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        isOneShot.onExtraCallbackWithResult(tdsSegmentedControlV1View, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
        if (tdsSegmentedControlV1View.isEnabled()) {
            int i4 = readTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(view, "");
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            IAuthTabCallback(1162971758, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View, (TdsSegmentedControlV1ItemView) view}, -1162971754);
            int i6 = extraCallbackWithResult + 81;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r10.addView(r9, new androidx.appcompat.widget.LinearLayoutCompat.onWarmupCompleted(-2, -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        IAuthTabCallback(r9);
        im.toss.uikit.widget.TdsSegmentedControlV1ItemView.onExtraCallbackWithResult(r2, r8.onExtraCallback, r8.IAuthTabCallback_Parcel, false, 4, null);
        r9 = asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        r10 = asBinder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r10 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r11 = im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject + 57;
        im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if ((r11 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r10 = r10.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        r10.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        r10 = im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult + 101;
        im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject = r10 % 128;
        r10 = r10 % 2;
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r9.setWeightSum(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r9 = im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult + 17;
        im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        super/*android.view.ViewGroup*\/.addView(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r9 instanceof im.toss.uikit.widget.TdsSegmentedControlV1ItemView) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r9 instanceof im.toss.uikit.widget.TdsSegmentedControlV1ItemView) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = (im.toss.uikit.widget.TdsSegmentedControlV1ItemView) r9;
        r2.setTab(r8.IAuthTabCallbackDefault);
        r9.setOnClickListener(new im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda6(r8));
        r10 = asBinder();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addView(@NotNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 15;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i4 = 50 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r3.onTransact.IAuthTabCallback.setVisibility(8);
        r4 = im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject + 73;
        im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r3.onTransact.IAuthTabCallback.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r3.onTransact.IAuthTabCallback.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r3.onTransact.IAuthTabCallback.setVisibility(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact.IAuthTabCallback.setText(charSequence);
            int i3 = 52 / 0;
        } else {
            this.onTransact.IAuthTabCallback.setText(charSequence);
        }
    }

    public final void setMessage(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.asInterface.setText(charSequence);
        if (this.onTransact.asInterface.length() <= 0) {
            this.onTransact.asInterface.setVisibility(8);
            return;
        }
        this.onTransact.asInterface.setVisibility(0);
        int i4 = extraCallbackWithResult + 23;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View, int i, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 65;
        int i5 = i4 % 128;
        readTypedObject = i5;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
            z = tdsSegmentedControlV1View.IAuthTabCallback;
        }
        if ((i2 & 4) != 0) {
            int i6 = i5 + 27;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        tdsSegmentedControlV1View.onWarmupCompleted(i, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(int i, boolean z, boolean z2) {
        TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 89;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!isEnabled()) {
            int i5 = readTypedObject + 89;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (i < 0) {
                return;
            }
        }
        this.getInterfaceDescriptor = i;
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null || (tdsRoundLayoutIAuthTabCallbackStub = IAuthTabCallbackStub()) == null) {
            return;
        }
        int childCount = linearLayoutCompatAsBinder.getChildCount();
        int i7 = extraCallbackWithResult + 61;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = linearLayoutCompatAsBinder.getChildAt(i9);
            if (i9 == i) {
                int i10 = readTypedObject + 75;
                extraCallbackWithResult = i10 % 128;
                z3 = i10 % 2 == 0;
            }
            childAt.setSelected(z3);
        }
        if (z2) {
            int i11 = extraCallbackWithResult + 47;
            readTypedObject = i11 % 128;
            int i12 = i11 % 2;
            Iterator<T> it = this.asInterface.iterator();
            while (it.hasNext()) {
                ((onExtraCallbackWithResult) it.next()).onWarmupCompleted(this, i);
            }
        }
        tdsRoundLayoutIAuthTabCallbackStub.setVisibility(0);
        onExtraCallback(i, z);
    }

    private final float IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 125;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null) {
            return 0.0f;
        }
        int measuredWidth = 0;
        if (i < 0) {
            int i5 = readTypedObject;
            int i6 = i5 + 119;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 81;
            extraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 25 / 0;
            }
            return 0.0f;
        }
        Iterator it = ensureCausesIsMutable.onRelationshipValidationResult(clearProcessUptime.onExtraCallback((Sequence<?>) EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayoutCompatAsBinder), TdsSegmentedControlV1ItemView.class)).subList(0, i).iterator();
        while (it.hasNext()) {
            measuredWidth += ((TdsSegmentedControlV1ItemView) it.next()).getMeasuredWidth();
        }
        return measuredWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(TdsSegmentedControlV1View tdsSegmentedControlV1View, int i, TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, TdsRoundLayout tdsRoundLayout, boolean z) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult;
        int i4 = i3 + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        if (tdsSegmentedControlV1View.getInterfaceDescriptor == i) {
            Rally rally = tdsSegmentedControlV1View.IAuthTabCallbackStubProxy;
            if (rally != null) {
                int i6 = i3 + 113;
                readTypedObject = i6 % 128;
                if (i6 % 2 == 0) {
                    rally.ICustomTabsServiceStub();
                    int i7 = 14 / 0;
                } else {
                    rally.ICustomTabsServiceStub();
                }
            }
            if (tdsSegmentedControlV1ItemView.getMeasuredWidth() == 0) {
                tdsSegmentedControlV1ItemView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            float fIAuthTabCallback = tdsSegmentedControlV1View.IAuthTabCallback(i);
            tdsRoundLayout.layout(tdsRoundLayout.getLeft(), tdsRoundLayout.getTop(), tdsRoundLayout.getLeft() + tdsSegmentedControlV1ItemView.getMeasuredWidth(), tdsRoundLayout.getBottom());
            if (tdsSegmentedControlV1View.onExtraCallback == onWarmupCompleted.FLUID_WIDTH) {
                int i8 = readTypedObject + 65;
                extraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{tdsSegmentedControlV1View}, 1489414222);
                if (horizontalScrollView != null) {
                    horizontalScrollView.smoothScrollBy(((tdsSegmentedControlV1ItemView.getLeft() + ((tdsSegmentedControlV1ItemView.getRight() - tdsSegmentedControlV1ItemView.getLeft()) / 2)) - (horizontalScrollView.getWidth() / 2)) - horizontalScrollView.getScrollX(), 0);
                    tdsSegmentedControlV1View.IAuthTabCallbackStubProxy = isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1901736661, new Object[]{isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(1000.0d, 52.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(fIAuthTabCallback), (Function1) null, 5, (Object) null), null, Float.valueOf(tdsSegmentedControlV1ItemView.getMeasuredWidth()), null, 5, null}, -1901736628, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
                }
            } else if (z) {
                tdsSegmentedControlV1View.IAuthTabCallbackStubProxy = isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayout, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 1115090779, new Object[]{isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{new deprecated_dns(1000.0d, 52.0d)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(fIAuthTabCallback), (Function1) null, 5, (Object) null), null, Integer.valueOf(tdsSegmentedControlV1ItemView.getMeasuredWidth()), null, 5, null}, -1115090763, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null);
            } else {
                tdsRoundLayout.setTranslationX(fIAuthTabCallback);
                ViewGroup.LayoutParams layoutParams = tdsRoundLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                int i10 = extraCallbackWithResult + 109;
                readTypedObject = i10 % 128;
                if (i10 % 2 == 0) {
                    ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
                    ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).width = tdsSegmentedControlV1ItemView.getMeasuredWidth();
                    tdsRoundLayout.setLayoutParams(onextracallbackwithresult);
                    int i11 = 11 / 0;
                } else {
                    ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
                    ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = tdsSegmentedControlV1ItemView.getMeasuredWidth();
                    tdsRoundLayout.setLayoutParams(onextracallbackwithresult2);
                }
                int i12 = extraCallbackWithResult + 99;
                readTypedObject = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 21;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(final int i, final boolean z) {
        final TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemViewOnWarmupCompleted;
        int i2 = 2 % 2;
        final TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (tdsRoundLayoutIAuthTabCallbackStub == null || (tdsSegmentedControlV1ItemViewOnWarmupCompleted = onWarmupCompleted(i)) == null) {
            int i3 = extraCallbackWithResult + 41;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 51 / 0;
                return;
            }
            return;
        }
        final Function0 function0 = new Function0() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                TdsSegmentedControlV1View tdsSegmentedControlV1View = this.f$0;
                if (i7 != 0) {
                    return TdsSegmentedControlV1View.IAuthTabCallback(tdsSegmentedControlV1View, i, tdsSegmentedControlV1ItemViewOnWarmupCompleted, tdsRoundLayoutIAuthTabCallbackStub, z);
                }
                TdsSegmentedControlV1View.IAuthTabCallback(tdsSegmentedControlV1View, i, tdsSegmentedControlV1ItemViewOnWarmupCompleted, tdsRoundLayoutIAuthTabCallbackStub, z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        setMethodokhttp.IAuthTabCallback(this, new Function0() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Function0 function02 = function0;
                if (i7 != 0) {
                    return TdsSegmentedControlV1View.IAuthTabCallback(function02);
                }
                TdsSegmentedControlV1View.IAuthTabCallback(function02);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ViewPager2 viewPager2 = this.access000;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i);
            int i5 = readTypedObject + 71;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = readTypedObject + 23;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null) {
            return -1;
        }
        int i4 = readTypedObject + 67;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int childCount = linearLayoutCompatAsBinder.getChildCount();
        while (i6 < childCount) {
            if (!(!linearLayoutCompatAsBinder.getChildAt(i6).isSelected())) {
                int i7 = extraCallbackWithResult + 101;
                readTypedObject = i7 % 128;
                if (i7 % 2 != 0) {
                    return i6;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i6++;
            int i8 = extraCallbackWithResult + 111;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
        }
        return -1;
    }

    public final void onWarmupCompleted(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            onExtraCallbackWithResult(charSequence, -1);
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            onExtraCallbackWithResult(charSequence, -1);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(@NotNull CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Typography5 tdsSegmentedControlV1ItemView = new TdsSegmentedControlV1ItemView(context, null, 0, 6, null);
        tdsSegmentedControlV1ItemView.setText(charSequence);
        addView(tdsSegmentedControlV1ItemView, i);
        int i3 = extraCallbackWithResult + 29;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
    }

    public final TdsSegmentedControlV1ItemView onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null) {
            int i3 = readTypedObject + 107;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        if (i >= linearLayoutCompatAsBinder.getChildCount()) {
            return null;
        }
        Object childAt = linearLayoutCompatAsBinder.getChildAt(i);
        if (childAt instanceof TdsSegmentedControlV1ItemView) {
            int i5 = extraCallbackWithResult + 65;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return (TdsSegmentedControlV1ItemView) childAt;
        }
        int i7 = extraCallbackWithResult + 15;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final int onExtraCallbackWithResult(@NotNull Function1<? super TdsSegmentedControlV1ItemView, Boolean> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null) {
            int i2 = extraCallbackWithResult + 69;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        int childCount = linearLayoutCompatAsBinder.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            int i5 = readTypedObject + 95;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            View childAt = linearLayoutCompatAsBinder.getChildAt(i4);
            if ((childAt instanceof TdsSegmentedControlV1ItemView) && function1.invoke(childAt).booleanValue()) {
                return i4;
            }
            i4++;
            int i7 = extraCallbackWithResult + 75;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEnabled(boolean z) {
        TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub;
        int childCount;
        int i;
        int i2 = 2 % 2;
        super/*android.view.View*/.setEnabled(z);
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder == null || (tdsRoundLayoutIAuthTabCallbackStub = IAuthTabCallbackStub()) == null) {
            return;
        }
        int i3 = extraCallbackWithResult + 103;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            childCount = linearLayoutCompatAsBinder.getChildCount();
            i = 1;
        } else {
            childCount = linearLayoutCompatAsBinder.getChildCount();
            i = 0;
        }
        while (i < childCount) {
            linearLayoutCompatAsBinder.getChildAt(i).setEnabled(z);
            i++;
            int i4 = readTypedObject + 57;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!isEnabled()) {
            tdsRoundLayoutIAuthTabCallbackStub.setVisibility(4);
        } else if (onWarmupCompleted() >= 0) {
            onExtraCallback(this, onWarmupCompleted(), false, false, 2, (Object) null);
        }
    }

    public static final class onNavigationEvent implements onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function2<View, Integer, Unit> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Function2<? super View, ? super Integer, Unit> function2) {
            this.IAuthTabCallback = function2;
        }

        @Override // im.toss.uikit.widget.TdsSegmentedControlV1View.onExtraCallbackWithResult
        public void onWarmupCompleted(View view, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallback.invoke(view, Integer.valueOf(i));
            int i5 = onExtraCallbackWithResult + 79;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void IAuthTabCallback(@NotNull Function2<? super View, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        this.asInterface.add(new onNavigationEvent(function2));
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsSegmentedControlV1View tdsSegmentedControlV1View = (TdsSegmentedControlV1View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsSegmentedControlV1View.asInterface.clear();
        if (i3 != 0) {
            return null;
        }
        int i4 = 42 / 0;
        return null;
    }

    public static final class onTransact extends ViewPager2.OnPageChangeCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onTransact() {
        }

        public void onPageSelected(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                TdsSegmentedControlV1View.onExtraCallback(TdsSegmentedControlV1View.this, i, false, false, 125, (Object) null);
            } else {
                TdsSegmentedControlV1View.onExtraCallback(TdsSegmentedControlV1View.this, i, false, false, 6, (Object) null);
            }
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setupWithViewPager2(@NotNull ViewPager2 viewPager2, @NotNull Function1<? super Integer, ? extends CharSequence> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        RecyclerView.Adapter adapterOnWarmupCompleted = viewPager2.onWarmupCompleted();
        if (adapterOnWarmupCompleted == null) {
            return;
        }
        this.access000 = viewPager2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        IAuthTabCallback(959335738, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, -959335735);
        int itemCount = adapterOnWarmupCompleted.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            CharSequence charSequenceInvoke = function1.invoke(Integer.valueOf(i2));
            Typography5 typography5OnWarmupCompleted = onWarmupCompleted(i2);
            if (typography5OnWarmupCompleted == null) {
                int i3 = extraCallbackWithResult + 109;
                readTypedObject = i3 % 128;
                if (i3 % 2 == 0) {
                    onWarmupCompleted(charSequenceInvoke);
                    int i4 = 63 / 0;
                } else {
                    onWarmupCompleted(charSequenceInvoke);
                }
                int i5 = extraCallbackWithResult + 43;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
            } else {
                typography5OnWarmupCompleted.setText(charSequenceInvoke);
            }
        }
        viewPager2.onExtraCallbackWithResult(new onTransact());
        onWarmupCompleted(viewPager2.onNavigationEvent(), false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder != null) {
            SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo).onWarmupCompleted(SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult.IAuthTabCallback(1, linearLayoutCompatAsBinder.getChildCount(), false, 1));
            return;
        }
        int i3 = extraCallbackWithResult + 111;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        ViewPager2 viewPager2 = this.access000;
        if (viewPager2 != null) {
            int i6 = readTypedObject + 83;
            extraCallbackWithResult = i6 % 128;
            onExtraCallback(i6 % 2 != 0 ? viewPager2.onNavigationEvent() : viewPager2.onNavigationEvent(), true);
        }
        int i7 = readTypedObject + 37;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
    }

    private static final void IAuthTabCallback(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = extraCallbackWithResult + 53;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        tdsSegmentedControlV1View.onTransact();
        tdsSegmentedControlV1View.onExtraCallbackWithResult();
        int i8 = readTypedObject + 39;
        extraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = this.IAuthTabCallbackStub.get(onextracallback.ordinal()).intValue() + (this.access100.get(onextracallback.ordinal()).intValue() << 1);
        this.onTransact.onExtraCallbackWithResult.setTranslationX(-this.access100.get(onextracallback.ordinal()).floatValue());
        this.onTransact.onTransact.setTranslationX(this.access100.get(onextracallback.ordinal()).intValue());
        this.onTransact.IAuthTabCallbackStub.setMinimumHeight(iIntValue);
        ConstraintLayout constraintLayoutFindViewById = findViewById(im.toss.uikit.R.id.segmentedControlContainer);
        if (constraintLayoutFindViewById != null) {
            int i4 = readTypedObject + 107;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                constraintLayoutFindViewById.setMinimumHeight(iIntValue);
                int i5 = 83 / 0;
            } else {
                constraintLayoutFindViewById.setMinimumHeight(iIntValue);
            }
        }
        LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
        if (linearLayoutCompatAsBinder != null) {
            int i6 = extraCallbackWithResult + 65;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                linearLayoutCompatAsBinder.setMinimumHeight(iIntValue);
                int i7 = 81 / 0;
            } else {
                linearLayoutCompatAsBinder.setMinimumHeight(iIntValue);
            }
        }
        LinearLayoutCompat linearLayoutCompatAsBinder2 = asBinder();
        if (linearLayoutCompatAsBinder2 != null) {
            linearLayoutCompatAsBinder2.setPadding(this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue());
        }
        TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (tdsRoundLayoutIAuthTabCallbackStub != null) {
            setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsRoundLayoutIAuthTabCallbackStub, this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue(), this.access100.get(onextracallback.ordinal()).intValue());
        }
        this.onTransact.IAuthTabCallbackStub.setRadius(this.onExtraCallbackWithResult.get(onextracallback.ordinal()).intValue());
        TdsRoundLayout tdsRoundLayoutIAuthTabCallbackStub2 = IAuthTabCallbackStub();
        if (tdsRoundLayoutIAuthTabCallbackStub2 != null) {
            tdsRoundLayoutIAuthTabCallbackStub2.setRadius(this.asBinder.get(onextracallback.ordinal()).intValue());
            int i8 = readTypedObject + 111;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        LinearLayoutCompat linearLayoutCompatAsBinder3 = asBinder();
        if (linearLayoutCompatAsBinder3 != null) {
            int i10 = readTypedObject + 91;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            Sequence sequenceOnExtraCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayoutCompatAsBinder3);
            if (sequenceOnExtraCallback != null) {
                Iterator itIAuthTabCallback = sequenceOnExtraCallback.IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    Object obj = (View) itIAuthTabCallback.next();
                    if (obj instanceof TdsSegmentedControlV1ItemView) {
                        TdsSegmentedControlV1ItemView.onExtraCallbackWithResult((TdsSegmentedControlV1ItemView) obj, null, onextracallback, false, 5, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return r1.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject + 77;
        im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = im.toss.uikit.widget.TdsSegmentedControlV1View.readTypedObject + 11;
        im.toss.uikit.widget.TdsSegmentedControlV1View.extraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int IAuthTabCallback() {
        LinearLayoutCompat linearLayoutCompatAsBinder;
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            linearLayoutCompatAsBinder = asBinder();
            int i3 = 41 / 0;
        } else {
            linearLayoutCompatAsBinder = asBinder();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackStubProxy() {
        Sequence sequenceOnExtraCallback;
        int i = 2 % 2;
        LinearLayoutCompat linearLayoutCompatFindViewById = findViewById(im.toss.uikit.R.id.tabContainer);
        if (linearLayoutCompatFindViewById != null) {
            int i2 = extraCallbackWithResult + 71;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            sequenceOnExtraCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayoutCompatFindViewById);
            if (sequenceOnExtraCallback == null) {
                sequenceOnExtraCallback = clearSelinuxLabel.onExtraCallback();
            }
        }
        View viewInflate = (ConstraintLayout) findViewById(im.toss.uikit.R.id.segmentedControlContainer);
        if (viewInflate == null) {
            viewInflate = LayoutInflater.from(getContext()).inflate(im.toss.uikit.R.layout.tds_segmented_control_v1_tab_container, (ViewGroup) null, false);
        }
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback, zziea.IAuthTabCallback(), new Object[]{this}, 1489414222);
        if (horizontalScrollView != null) {
            horizontalScrollView.removeAllViews();
        }
        this.onTransact.onNavigationEvent.removeAllViews();
        int i4 = IAuthTabCallback.onNavigationEvent[this.onExtraCallback.ordinal()];
        Class cls = Integer.TYPE;
        if (i4 == 1) {
            FrameLayout frameLayout = this.onTransact.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            Intrinsics.checkNotNull(viewInflate);
            setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout, viewInflate);
            LinearLayoutCompat linearLayoutCompatAsBinder = asBinder();
            if (linearLayoutCompatAsBinder != null) {
                int i5 = extraCallbackWithResult + 87;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                linearLayoutCompatAsBinder.setWeightSum(ensureCausesIsMutable.extraCallbackWithResult(sequenceOnExtraCallback));
            }
            LinearLayoutCompat linearLayoutCompatAsBinder2 = asBinder();
            if (linearLayoutCompatAsBinder2 != null) {
                int i7 = extraCallbackWithResult + 77;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(onextracallbackwithresult);
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -1;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -1;
                linearLayoutCompatAsBinder2.setLayoutParams(onextracallbackwithresult);
            }
            Iterator itIAuthTabCallback = sequenceOnExtraCallback.IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                View view = (View) itIAuthTabCallback.next();
                IAuthTabCallback(view);
                if (view instanceof TdsSegmentedControlV1ItemView) {
                    TdsSegmentedControlV1ItemView.onExtraCallbackWithResult((TdsSegmentedControlV1ItemView) view, this.onExtraCallback, this.IAuthTabCallback_Parcel, false, 4, null);
                }
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(getContext());
            horizontalScrollView2.setClipChildren(false);
            horizontalScrollView2.setId(im.toss.uikit.R.id.tabScrollView);
            horizontalScrollView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: im.toss.uikit.widget.TdsSegmentedControlV1View$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i9, int i10, int i11, int i12) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 33;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    TdsSegmentedControlV1View.onExtraCallback(this.f$0, view2, i9, i10, i11, i12);
                    int i16 = onWarmupCompleted + 47;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                }
            });
            horizontalScrollView2.setHorizontalScrollBarEnabled(false);
            FrameLayout frameLayout2 = this.onTransact.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            setProxySelectorokhttp.onExtraCallbackWithResult(frameLayout2, horizontalScrollView2);
            Intrinsics.checkNotNull(viewInflate);
            setProxySelectorokhttp.onExtraCallbackWithResult(horizontalScrollView2, viewInflate);
            LinearLayoutCompat linearLayoutCompatAsBinder3 = asBinder();
            if (linearLayoutCompatAsBinder3 != null) {
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(onextracallbackwithresult3);
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = -2;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = -1;
                linearLayoutCompatAsBinder3.setLayoutParams(onextracallbackwithresult3);
            }
            Iterator itIAuthTabCallback2 = sequenceOnExtraCallback.IAuthTabCallback();
            while (itIAuthTabCallback2.hasNext()) {
                View view2 = (View) itIAuthTabCallback2.next();
                IAuthTabCallback(view2);
                if (view2 instanceof TdsSegmentedControlV1ItemView) {
                    TdsSegmentedControlV1ItemView.onExtraCallbackWithResult((TdsSegmentedControlV1ItemView) view2, this.onExtraCallback, this.IAuthTabCallback_Parcel, false, 4, null);
                }
            }
        }
        onWarmupCompleted(this.IAuthTabCallback_Parcel);
        LinearLayoutCompat linearLayoutCompatAsBinder4 = asBinder();
        if (linearLayoutCompatAsBinder4 != null) {
            if (!linearLayoutCompatAsBinder4.isLaidOut() || linearLayoutCompatAsBinder4.isLayoutRequested()) {
                linearLayoutCompatAsBinder4.addOnLayoutChangeListener(new IAuthTabCallbackStub());
                return;
            }
            int i9 = readTypedObject + 47;
            extraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            onWarmupCompleted(((Integer) IAuthTabCallback(-1965629107, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback2, zziea.IAuthTabCallback(), new Object[]{this}, 1965629114)).intValue(), false, false);
        }
    }

    private final void IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (view.getLayoutParams() == null) {
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayoutCompat.onWarmupCompleted.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            LinearLayoutCompat.onWarmupCompleted onwarmupcompleted = (LinearLayoutCompat.onWarmupCompleted) layoutParams;
            int i4 = IAuthTabCallback.onNavigationEvent[this.onExtraCallback.ordinal()];
            if (i4 == 1) {
                ((LinearLayout.LayoutParams) onwarmupcompleted).weight = 1.0f;
                ((LinearLayout.LayoutParams) onwarmupcompleted).width = 0;
                ((LinearLayout.LayoutParams) onwarmupcompleted).height = -1;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ((LinearLayout.LayoutParams) onwarmupcompleted).width = -2;
                ((LinearLayout.LayoutParams) onwarmupcompleted).height = -1;
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
        }
        int i5 = extraCallbackWithResult + 31;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        LinearLayoutCompat.onWarmupCompleted onwarmupcompleted2 = (LinearLayoutCompat.onWarmupCompleted) layoutParams2;
        int i7 = IAuthTabCallback.onNavigationEvent[this.onExtraCallback.ordinal()];
        if (i7 == 1) {
            ((LinearLayout.LayoutParams) onwarmupcompleted2).weight = 1.0f;
            ((LinearLayout.LayoutParams) onwarmupcompleted2).width = 0;
            ((LinearLayout.LayoutParams) onwarmupcompleted2).height = -1;
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = extraCallbackWithResult + 79;
            readTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                ((LinearLayout.LayoutParams) onwarmupcompleted2).width = Imgproc.COLOR_YUV2BGRA_YVYU;
            } else {
                ((LinearLayout.LayoutParams) onwarmupcompleted2).width = -2;
            }
            ((LinearLayout.LayoutParams) onwarmupcompleted2).height = -1;
        }
        view.setLayoutParams(onwarmupcompleted2);
        int i9 = readTypedObject + 37;
        extraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        IAuthTabCallback(1143171694, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View, view}, -1143171688);
    }

    public static /* synthetic */ void onWarmupCompleted(TdsSegmentedControlV1View tdsSegmentedControlV1View, View view) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        IAuthTabCallback(-290008853, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View, view}, 290008855);
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(TdsSegmentedControlV1View tdsSegmentedControlV1View) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return ((Integer) IAuthTabCallback(-1965629107, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{tdsSegmentedControlV1View}, 1965629114)).intValue();
    }

    private final Rally asInterface() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Rally) IAuthTabCallback(574658467, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this}, -574658467);
    }

    private final HorizontalScrollView access100() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (HorizontalScrollView) IAuthTabCallback(-1489414217, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this}, 1489414222);
    }

    private final void onNavigationEvent(TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        IAuthTabCallback(1162971758, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this, tdsSegmentedControlV1ItemView}, -1162971754);
    }

    public final void onExtraCallback() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        IAuthTabCallback(568430046, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this}, -568430045);
    }

    public final void onNavigationEvent() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        IAuthTabCallback(959335738, zziea.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this}, -959335735);
    }
}
