package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.R;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkSettings;
import o.M_;
import o.UtilsKtExternalSyntheticLambda17;
import o.access15300;
import o.generateLink;
import o.isFireOS;
import o.isMuted;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsSkeletonV1View extends View {
    private static int access000 = 1;
    private static int access100;
    private boolean IAuthTabCallback;
    private Rally IAuthTabCallbackDefault;
    private onWarmupCompleted IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private IAuthTabCallback IAuthTabCallback_Parcel;
    private int asBinder;
    private final Paint asInterface;
    private final List<Rally> getInterfaceDescriptor;
    private final float onExtraCallback;
    private float onExtraCallbackWithResult;
    private final RectF onNavigationEvent;
    private final List<onExtraCallbackWithResult> onTransact;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSkeletonV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsSkeletonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsSkeletonV1View tdsSkeletonV1View) throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        int i2 = access000 + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tdsSkeletonV1View);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = access000 + 27;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, TdsSkeletonV1View tdsSkeletonV1View, float f) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, tdsSkeletonV1View, f);
        int i4 = access000 + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i4) | i6);
        int i8 = ~((~i) | i6);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i6) | i4)) | i7;
        int i11 = i6 + i4 + i2 + ((-1814252664) * i5) + (2073254503 * i3);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i6) + 1943797760 + (1745420935 * i4) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i2) + ((-1631584256) * i5) + ((-1368915968) * i3) + ((-1053032448) * i12);
        int i14 = (i6 * (-1919122223)) + 1408767311 + (i4 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i2 * (-1919121629)) + (i5 * (-390511720)) + (i3 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        return i15 != 1 ? i15 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TdsSkeletonV1View tdsSkeletonV1View = (TdsSkeletonV1View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = access100 + 41;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(tdsSkeletonV1View, fFloatValue);
        }
        onExtraCallbackWithResult(tdsSkeletonV1View, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, TdsSkeletonV1View tdsSkeletonV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 119;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1248918472, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{onextracallbackwithresult, tdsSkeletonV1View, Float.valueOf(f)}, 1248918474);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c1 A[PHI: r18
      0x01c1: PHI (r18v3 int) = (r18v2 int), (r18v4 int) binds: [B:48:0x01bf, B:45:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TdsSkeletonV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws IllegalAccessException, InstantiationException {
        Integer num;
        boolean z;
        Integer num2;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        int i2;
        int iIntValue;
        int iIntValue2;
        boolean z2;
        int i3;
        boolean z3;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        boolean z4 = true;
        paint.setAntiAlias(true);
        this.asInterface = paint;
        this.asBinder = 255;
        this.onTransact = new ArrayList();
        this.getInterfaceDescriptor = new ArrayList();
        this.onWarmupCompleted = true;
        this.IAuthTabCallback_Parcel = IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted;
        this.IAuthTabCallbackStub = onWarmupCompleted.Grey;
        this.onNavigationEvent = new RectF();
        this.onExtraCallbackWithResult = 1.0f;
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallbackStub;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        int i4 = 2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsSkeletonV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z5 = true;
            int i5 = 0;
            boolean z6 = false;
            num2 = null;
            Integer numValueOf4 = null;
            numValueOf = null;
            numValueOf2 = null;
            numValueOf3 = null;
            while (i5 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.TdsSkeletonV1_skeletonType) {
                    int i6 = access000 + 15;
                    access100 = i6 % 128;
                    int i7 = i6 % i4;
                    IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[9];
                    iAuthTabCallbackArr[0] = IAuthTabCallback.getInterfaceDescriptor.IAuthTabCallback;
                    z2 = true;
                    iAuthTabCallbackArr[1] = IAuthTabCallback.onTransact.onNavigationEvent;
                    iAuthTabCallbackArr[i4] = IAuthTabCallback.onNavigationEvent.onExtraCallback;
                    iAuthTabCallbackArr[3] = IAuthTabCallback.asBinder.onExtraCallback;
                    iAuthTabCallbackArr[4] = IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted;
                    iAuthTabCallbackArr[5] = IAuthTabCallback.onWarmupCompleted.onWarmupCompleted;
                    iAuthTabCallbackArr[6] = IAuthTabCallback.access100.onExtraCallback;
                    iAuthTabCallbackArr[7] = IAuthTabCallback.access000.IAuthTabCallback;
                    iAuthTabCallbackArr[8] = IAuthTabCallback.asInterface.onExtraCallback;
                    iAuthTabCallback = iAuthTabCallbackArr[typedArrayObtainStyledAttributes.getInt(index, 0)];
                    int i8 = access000 + 113;
                    access100 = i8 % 128;
                    int i9 = i8 % i4;
                    int i10 = i4 % i4;
                    i3 = indexCount;
                } else {
                    z2 = true;
                    if (index == R.styleable.TdsSkeletonV1_skeletonOverflow) {
                        int i11 = access100 + 27;
                        i3 = indexCount;
                        access000 = i11 % 128;
                        if (i11 % i4 == 0) {
                            typedArrayObtainStyledAttributes.getBoolean(index, z5);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        z5 = typedArrayObtainStyledAttributes.getBoolean(index, z5);
                    } else {
                        i3 = indexCount;
                        if (index == R.styleable.TdsSkeletonV1_skeletonColor) {
                            int i12 = access100 + 75;
                            access000 = i12 % 128;
                            int i13 = i12 % i4;
                            int i14 = i4 % i4;
                            onwarmupcompleted = onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R.styleable.TdsSkeletonV1_skeletonSkipIntro) {
                            int i15 = access000 + 57;
                            access100 = i15 % 128;
                            int i16 = i15 % i4;
                            z6 = typedArrayObtainStyledAttributes.getBoolean(index, z6);
                            int i17 = i4 % i4;
                        } else {
                            z3 = z6;
                            if (index == R.styleable.TdsSkeletonV1_android_paddingTop) {
                                numValueOf3 = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                            } else if (index == R.styleable.TdsSkeletonV1_android_paddingStart) {
                                numValueOf2 = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                            } else if (index == R.styleable.TdsSkeletonV1_android_paddingLeft) {
                                int i18 = 2 % 2;
                                numValueOf4 = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                            } else if (index == R.styleable.TdsSkeletonV1_android_paddingEnd) {
                                Integer numValueOf5 = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                int i19 = 2 % 2;
                                num2 = numValueOf5;
                            } else if (index == R.styleable.TdsSkeletonV1_android_paddingRight) {
                                int i20 = access000 + 41;
                                access100 = i20 % 128;
                                int i21 = i20 % 2;
                                numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                            }
                            i5++;
                            indexCount = i3;
                            z6 = z3;
                            i4 = 2;
                        }
                    }
                }
                z3 = z6;
                i5++;
                indexCount = i3;
                z6 = z3;
                i4 = 2;
            }
            z = z6;
            typedArrayObtainStyledAttributes.recycle();
            z4 = z5;
            num = numValueOf4;
        } else {
            num = null;
            z = false;
            num2 = null;
            numValueOf = null;
            numValueOf2 = null;
            numValueOf3 = null;
        }
        if (num == null) {
            int i22 = access100 + 119;
            int i23 = i22 % 128;
            access000 = i23;
            if (i22 % 2 == 0) {
                i2 = 0;
                int i24 = 86 / 0;
                if (numValueOf == null) {
                    int i25 = i23 + 27;
                    access100 = i25 % 128;
                    int i26 = i25 % 2;
                    iOnNavigationEvent = numValueOf3 != null ? numValueOf3.intValue() : iOnNavigationEvent;
                    if (numValueOf2 != null) {
                        int i27 = access000 + 59;
                        access100 = i27 % 128;
                        int i28 = i27 % 2;
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = i2;
                    }
                    setPaddingRelative(iIntValue2, iOnNavigationEvent, num2 != null ? num2.intValue() : i2, getPaddingBottom());
                }
            } else {
                i2 = 0;
                if (numValueOf == null) {
                }
            }
            setSkeletonType(iAuthTabCallback);
            setOverflow(z4);
            setSkeletonColor(onwarmupcompleted);
            this.IAuthTabCallbackStubProxy = z;
            this.onExtraCallback = getResources().getConfiguration().fontScale;
        }
        i2 = 0;
        iOnNavigationEvent = numValueOf3 != null ? numValueOf3.intValue() : iOnNavigationEvent;
        if (num != null) {
            int i29 = access100 + 83;
            access000 = i29 % 128;
            int i30 = i29 % 2;
            iIntValue = num.intValue();
        } else {
            iIntValue = i2;
        }
        setPadding(iIntValue, iOnNavigationEvent, numValueOf != null ? numValueOf.intValue() : i2, getPaddingBottom());
        setSkeletonType(iAuthTabCallback);
        setOverflow(z4);
        setSkeletonColor(onwarmupcompleted);
        this.IAuthTabCallbackStubProxy = z;
        this.onExtraCallback = getResources().getConfiguration().fontScale;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsSkeletonV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = access000 + 29;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = access000 + 39;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setSkipIntro(boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public final void setOverflow(boolean z) throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        int i2 = access000 + 53;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted = z;
            onExtraCallback();
            int i3 = 91 / 0;
        } else {
            this.onWarmupCompleted = z;
            onExtraCallback();
        }
    }

    public final IAuthTabCallback IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 79;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return iAuthTabCallback;
    }

    public final void setSkeletonType(@NotNull IAuthTabCallback iAuthTabCallback) throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        int i2 = access100 + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback_Parcel = iAuthTabCallback;
        onExtraCallback();
        int i4 = access100 + 43;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSkeletonColor(@NotNull onWarmupCompleted onwarmupcompleted) {
        int dayColorResId;
        int i = 2 % 2;
        int i2 = access100 + 79;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.IAuthTabCallbackStub = onwarmupcompleted;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.IAuthTabCallbackStub = onwarmupcompleted;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context2}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i3 = access000 + 97;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            dayColorResId = this.IAuthTabCallbackStub.getNightColorResId();
            int i5 = access000 + 9;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            dayColorResId = this.IAuthTabCallbackStub.getDayColorResId();
        }
        this.asInterface.setColor(ResourcesCompat.onExtraCallbackWithResult(getResources(), dayColorResId, getContext().getTheme()));
        this.asBinder = this.asInterface.getAlpha();
        setBackgroundColor(ResourcesCompat.onExtraCallbackWithResult(getResources(), this.IAuthTabCallbackStub.getBackgroundColorResId(), getContext().getTheme()));
    }

    private final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int measuredHeight = getMeasuredHeight();
        return i3 != 0 ? (measuredHeight >>> getPaddingTop()) / getPaddingBottom() : (measuredHeight - getPaddingTop()) - getPaddingBottom();
    }

    private final void onExtraCallback() throws IllegalAccessException, InstantiationException {
        int i = 2 % 2;
        onWarmupCompleted();
        this.onTransact.clear();
        Object obj = null;
        if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, IAuthTabCallback.IAuthTabCallbackStub.onWarmupCompleted)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 <= onNavigationEvent()) {
                int i4 = access100 + 49;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    if (this.IAuthTabCallback_Parcel.IAuthTabCallback() > 0 && (this.IAuthTabCallback_Parcel.onNavigationEvent().size() + this.IAuthTabCallback_Parcel.IAuthTabCallback()) - 1 <= i3) {
                        break;
                    }
                    onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = this.IAuthTabCallback_Parcel.onNavigationEvent(i3);
                    int iOnExtraCallback = onextracallbackwithresultOnNavigationEvent.onExtraCallback();
                    DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallback), displayMetrics);
                    int iOnExtraCallbackWithResult = onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult();
                    DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult), displayMetrics2);
                    if (i2 + iOnNavigationEvent > onNavigationEvent()) {
                        if (!this.onWarmupCompleted) {
                            break;
                        }
                        int i5 = access000 + 111;
                        access100 = i5 % 128;
                        if (i5 % 2 != 0) {
                            this.onTransact.add(onextracallbackwithresultOnNavigationEvent);
                            throw null;
                        }
                        this.onTransact.add(onextracallbackwithresultOnNavigationEvent);
                    } else {
                        this.onTransact.add(onextracallbackwithresultOnNavigationEvent);
                    }
                    i2 += iOnNavigationEvent + iOnNavigationEvent2;
                    i3++;
                } else {
                    this.IAuthTabCallback_Parcel.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
            }
            IAuthTabCallbackStub();
            return;
        }
        int i6 = access000 + 23;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            invalidate();
        } else {
            invalidate();
            throw null;
        }
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.getInterfaceDescriptor.iterator();
            throw null;
        }
        Iterator<T> it = this.getInterfaceDescriptor.iterator();
        int i3 = access100 + 93;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            ((Rally) it.next()).ICustomTabsServiceStub();
        }
        this.getInterfaceDescriptor.clear();
        int i5 = access000 + 63;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    private final void IAuthTabCallbackStub() {
        final TdsSkeletonV1View tdsSkeletonV1View = this;
        int i = 2;
        int i2 = 2 % 2;
        List<onExtraCallbackWithResult> list = tdsSkeletonV1View.onTransact;
        ArrayList arrayList = new ArrayList();
        int i3 = access100 + 11;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        for (Object obj : list) {
            if (!(!((onExtraCallbackWithResult) obj).IAuthTabCallbackDefault())) {
                int i5 = access000 + 83;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        ?? r12 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            int i8 = access000 + 33;
            access100 = i8 % 128;
            Object obj2 = null;
            if (i8 % i != 0) {
                it.next();
                obj2.hashCode();
                throw null;
            }
            Object next = it.next();
            if (i7 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) next;
            List<Rally> list2 = tdsSkeletonV1View.getInterfaceDescriptor;
            Object[] objArr = {(AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.onWarmupCompleted(), 600), Float.valueOf(0.2f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.TdsSkeletonV1View$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 93;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        unitOnExtraCallbackWithResult = TdsSkeletonV1View.onExtraCallbackWithResult(onextracallbackwithresult, tdsSkeletonV1View, ((Float) obj3).floatValue());
                        int i11 = 89 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = TdsSkeletonV1View.onExtraCallbackWithResult(onextracallbackwithresult, tdsSkeletonV1View, ((Float) obj3).floatValue());
                    }
                    int i12 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), Float.valueOf(0.96f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.uikit.widget.TdsSkeletonV1View$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 25;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    TdsSkeletonV1View.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                    if (i11 != 0) {
                        return TdsSkeletonV1View.onWarmupCompleted(onextracallbackwithresult2, tdsSkeletonV1View, ((Float) obj3).floatValue());
                    }
                    TdsSkeletonV1View.onWarmupCompleted(onextracallbackwithresult2, tdsSkeletonV1View, ((Float) obj3).floatValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, null, 8, null};
            boolean z = r12;
            list2.add(isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{this, (AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, objArr, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()), -1, null, Integer.valueOf((int) r12), null, null, Boolean.FALSE, Integer.valueOf(i7 * 100), 0L, Boolean.valueOf((boolean) r12), 1656, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), z, 1, (Object) null));
            i7++;
            int i9 = access100 + 111;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            i = 2;
            r12 = z;
            tdsSkeletonV1View = this;
        }
    }

    private static final Unit IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, TdsSkeletonV1View tdsSkeletonV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onextracallbackwithresult.onExtraCallback(f);
        tdsSkeletonV1View.postInvalidateOnAnimation();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 65;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
        TdsSkeletonV1View tdsSkeletonV1View = (TdsSkeletonV1View) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = access000 + 105;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onextracallbackwithresult.IAuthTabCallback(fFloatValue);
            tdsSkeletonV1View.postInvalidateOnAnimation();
            int i3 = 73 / 0;
            return Unit.INSTANCE;
        }
        onextracallbackwithresult.IAuthTabCallback(fFloatValue);
        tdsSkeletonV1View.postInvalidateOnAnimation();
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(TdsSkeletonV1View tdsSkeletonV1View) throws IllegalAccessException, InstantiationException {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 113;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            tdsSkeletonV1View.IAuthTabCallback = false;
            i = 5;
        } else {
            tdsSkeletonV1View.IAuthTabCallback = false;
            i = 4;
        }
        tdsSkeletonV1View.setVisibility(i);
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        Rally rally = this.IAuthTabCallbackDefault;
        if (rally != null) {
            int i2 = access100 + 119;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                int i3 = 38 / 0;
            } else {
                rally.ICustomTabsServiceStub();
            }
        }
        if ((!this.IAuthTabCallback) && getVisibility() == 0) {
            this.IAuthTabCallback = true;
            Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{this, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), 400), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.uikit.widget.TdsSkeletonV1View$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws IllegalAccessException, InstantiationException {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 115;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitIAuthTabCallback = TdsSkeletonV1View.IAuthTabCallback(this.f$0);
                    int i7 = onNavigationEvent + 25;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 40 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }, 1, null};
            isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226), false, 1, (Object) null);
            int i4 = access000 + 7;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = access000 + 39;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setVisibility(int i) throws IllegalAccessException, InstantiationException {
        int i2 = 2 % 2;
        int i3 = access000 + 39;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int visibility = getVisibility();
            super.setVisibility(i);
            int i4 = 69 / 0;
            if (visibility != 0) {
                if (i == 0) {
                    int i5 = access100 + 85;
                    access000 = i5 % 128;
                    if (i5 % 2 == 0) {
                        onExtraCallback();
                        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                        onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1572717814, iIAuthTabCallback3, new Object[]{this}, -1572717813);
                        int i6 = 28 / 0;
                        return;
                    }
                    onExtraCallback();
                    int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    int iIAuthTabCallback5 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    int iIAuthTabCallback6 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                    onNavigationEvent(iIAuthTabCallback4, iIAuthTabCallback5, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1572717814, iIAuthTabCallback6, new Object[]{this}, -1572717813);
                    return;
                }
            }
        } else {
            int visibility2 = getVisibility();
            super.setVisibility(i);
            if (visibility2 != 0) {
            }
        }
        onWarmupCompleted();
        int i7 = access100 + 65;
        access000 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            super.onDetachedFromWindow();
        } else {
            onWarmupCompleted();
            super.onDetachedFromWindow();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) throws IllegalAccessException, InstantiationException {
        int i5 = 2 % 2;
        int i6 = access000 + 55;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            super.onSizeChanged(i, i2, i3, i4);
            onExtraCallback();
        } else {
            super.onSizeChanged(i, i2, i3, i4);
            onExtraCallback();
            throw null;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1572717814, iIAuthTabCallback3, new Object[]{this}, -1572717813);
            int i4 = access000 + 59;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = access000 + 5;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r4 = r2.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r4.ICustomTabsServiceStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r2.IAuthTabCallbackDefault = o.isFireOS.onExtraCallbackWithResult((im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r2, (o.AppLovinSdkSettings) o.isMuted.onWarmupCompleted(com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), 757421567, new java.lang.Object[]{im.toss.tds.foundation.anim.rally.RallysKt.onExtraCallback(o.Address.onNavigationEvent.asBinder(), 1000), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f), new im.toss.uikit.widget.TdsSkeletonV1View$$ExternalSyntheticLambda0(r2), null, 8, null}, -757421537, com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult(), com.iap.android.mppclient.container.constant.JsParamKeys.onExtraCallbackWithResult()), 0, null, 0, null, null, java.lang.Boolean.FALSE, 0, 0L, false, 1916, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025), false, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r2.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r2.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5 = r5 + 79;
        im.toss.uikit.widget.TdsSkeletonV1View.access000 = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final TdsSkeletonV1View tdsSkeletonV1View = (TdsSkeletonV1View) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 75;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            int i4 = 7 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(TdsSkeletonV1View tdsSkeletonV1View, float f) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            tdsSkeletonV1View.onExtraCallbackWithResult = f;
            tdsSkeletonV1View.postInvalidateOnAnimation();
            Unit unit = Unit.INSTANCE;
            int i3 = access000 + 45;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        tdsSkeletonV1View.onExtraCallbackWithResult = f;
        tdsSkeletonV1View.postInvalidateOnAnimation();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        float measuredWidth;
        float fAsInterface;
        float f;
        float f2;
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float paddingTop = getPaddingTop();
        float paddingStart = getPaddingStart();
        float measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        for (onExtraCallbackWithResult onextracallbackwithresult : this.onTransact) {
            int iOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
            float fOnNavigationEvent = paddingStart + varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent), r7);
            int iOnNavigationEvent2 = onextracallbackwithresult.onNavigationEvent();
            Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
            float fOnNavigationEvent2 = measuredWidth2 - varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent2), r7);
            int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(this.onExtraCallback);
            int iOnExtraCallback = onextracallbackwithresult.onExtraCallback(iOnExtraCallbackWithResult);
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult), displayMetrics);
            int iOnExtraCallbackWithResult2 = onextracallbackwithresult.onExtraCallbackWithResult();
            DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent4 = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult2), displayMetrics2);
            DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            float fOnNavigationEvent3 = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallback), displayMetrics3);
            if (onextracallbackwithresult.IAuthTabCallbackStub() == 1.0f) {
                int i3 = access100 + 15;
                access000 = i3 % 128;
                if (i3 % i == 0) {
                    throw null;
                }
                measuredWidth = fOnNavigationEvent2;
            } else {
                measuredWidth = (((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) * onextracallbackwithresult.IAuthTabCallbackStub()) + fOnNavigationEvent;
            }
            float f3 = iOnNavigationEvent3;
            float f4 = paddingTop + f3;
            float f5 = measuredWidth - fOnNavigationEvent;
            float fAsInterface2 = ((1.0f - (onextracallbackwithresult.IAuthTabCallback() ? 1.0f : onextracallbackwithresult.asInterface())) * f5) / 2.0f;
            if (onextracallbackwithresult.IAuthTabCallback()) {
                int i4 = access000 + 119;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    fAsInterface = 2.0f;
                } else {
                    f = 1.0f;
                    fAsInterface = 1.0f;
                    float f6 = (f5 * (f - fAsInterface)) / 2.0f;
                    if (onextracallbackwithresult.IAuthTabCallback()) {
                        float fAsInterface3 = onextracallbackwithresult.asInterface();
                        int i5 = access100 + Imgproc.COLOR_YUV2RGB_YVYU;
                        access000 = i5 % 128;
                        int i6 = i5 % 2;
                        f2 = fAsInterface3;
                    } else {
                        f2 = 1.0f;
                    }
                    this.onNavigationEvent.set(fOnNavigationEvent + fAsInterface2, (((1.0f - f2) * f3) / 2.0f) + paddingTop, measuredWidth - f6, f4 - ((f3 * (1.0f - (!onextracallbackwithresult.IAuthTabCallback() ? 1.0f : onextracallbackwithresult.asInterface()))) / 2.0f));
                    this.asInterface.setAlpha(!onextracallbackwithresult.IAuthTabCallbackDefault() ? (int) (this.asBinder * onextracallbackwithresult.onWarmupCompleted() * this.onExtraCallbackWithResult) : 0);
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    Paint paint = this.asInterface;
                    float paddingTop2 = (paddingTop - getPaddingTop()) * 0.45f;
                    paint.setShader(new LinearGradient(fOnNavigationEvent, getPaddingTop() + paddingTop2, fOnNavigationEvent2, paddingTop - paddingTop2, this.asInterface.getColor(), 0, Shader.TileMode.CLAMP));
                    Unit unit = Unit.INSTANCE;
                    onextracallbackwithresult.onExtraCallback(context, canvas, paint, this.onNavigationEvent, fOnNavigationEvent3);
                    paddingTop = f4 + iOnNavigationEvent4;
                    i = 2;
                }
            } else {
                fAsInterface = onextracallbackwithresult.asInterface();
            }
            f = 1.0f;
            float f62 = (f5 * (f - fAsInterface)) / 2.0f;
            if (onextracallbackwithresult.IAuthTabCallback()) {
            }
            this.onNavigationEvent.set(fOnNavigationEvent + fAsInterface2, (((1.0f - f2) * f3) / 2.0f) + paddingTop, measuredWidth - f62, f4 - ((f3 * (1.0f - (!onextracallbackwithresult.IAuthTabCallback() ? 1.0f : onextracallbackwithresult.asInterface()))) / 2.0f));
            this.asInterface.setAlpha(!onextracallbackwithresult.IAuthTabCallbackDefault() ? (int) (this.asBinder * onextracallbackwithresult.onWarmupCompleted() * this.onExtraCallbackWithResult) : 0);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Paint paint2 = this.asInterface;
            float paddingTop22 = (paddingTop - getPaddingTop()) * 0.45f;
            paint2.setShader(new LinearGradient(fOnNavigationEvent, getPaddingTop() + paddingTop22, fOnNavigationEvent2, paddingTop - paddingTop22, this.asInterface.getColor(), 0, Shader.TileMode.CLAMP));
            Unit unit2 = Unit.INSTANCE;
            onextracallbackwithresult.onExtraCallback(context2, canvas, paint2, this.onNavigationEvent, fOnNavigationEvent3);
            paddingTop = f4 + iOnNavigationEvent4;
            i = 2;
        }
        int i7 = access000 + 115;
        access100 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 17 / 0;
        }
    }

    public static abstract class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallback;
        private static int onWarmupCompleted;
        private int onNavigationEvent;
        public static final C0004IAuthTabCallback Companion = new C0004IAuthTabCallback(null);
        public static final int onExtraCallbackWithResult = 8;

        static {
            int i = onWarmupCompleted + 67;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract List<onExtraCallbackWithResult> onNavigationEvent();

        private IAuthTabCallback() {
            this.onNavigationEvent = 3;
        }

        /* renamed from: im.toss.uikit.widget.TdsSkeletonV1View$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0004IAuthTabCallback {
            public /* synthetic */ C0004IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0004IAuthTabCallback() {
            }
        }

        public int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public void onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = i;
            if (i4 == 0) {
                int i5 = 22 / 0;
            }
        }

        public final onExtraCallbackWithResult onNavigationEvent(int i) throws IllegalAccessException, InstantiationException {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (i > CollectionsKt__CollectionsKt.getLastIndex(onNavigationEvent())) {
                Object objNewInstance = CollectionsKt___CollectionsKt.last((List) onNavigationEvent()).getClass().newInstance();
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objNewInstance;
                onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) CollectionsKt___CollectionsKt.last((List) onNavigationEvent());
                onextracallbackwithresult.onWarmupCompleted(onextracallbackwithresult2.IAuthTabCallbackStub());
                onextracallbackwithresult.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback());
                Object[] objArr = {onextracallbackwithresult, Integer.valueOf(onextracallbackwithresult2.asBinder())};
                int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                onExtraCallbackWithResult.onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -357759551, iOnExtraCallbackWithResult, objArr, 357759552, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
                Object[] objArr2 = {onextracallbackwithresult, Integer.valueOf(onextracallbackwithresult2.onExtraCallbackWithResult())};
                int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                onExtraCallbackWithResult.onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 250836180, iOnExtraCallbackWithResult2, objArr2, -250836180, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
                return onextracallbackwithresult;
            }
            onExtraCallbackWithResult onextracallbackwithresult3 = onNavigationEvent().get(i);
            int i5 = onExtraCallback + 23;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult3;
        }

        public static final class IAuthTabCallbackStub extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackStub = 0;
            private static int onNavigationEvent = 1;
            private static int onTransact = 1;
            public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();
            public static final int onExtraCallback = 8;

            static {
                int i = onNavigationEvent + 1;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStub() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 15;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                List<onExtraCallbackWithResult> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                int i4 = onTransact + 15;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return listEmptyList;
                }
                throw null;
            }
        }

        public static final class getInterfaceDescriptor extends IAuthTabCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            public static final getInterfaceDescriptor IAuthTabCallback = new getInterfaceDescriptor();
            public static final int onNavigationEvent = 8;

            static {
                int i = onExtraCallback + 25;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private getInterfaceDescriptor() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.onTransact(), new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onNavigationEvent()});
                int i2 = asBinder + 11;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    return listListOf;
                }
                throw null;
            }
        }

        public static final class onTransact extends IAuthTabCallback {
            private static int asBinder = 1;
            private static int onExtraCallback = 1;
            private static int onTransact;
            private static int onWarmupCompleted;
            public static final onTransact onNavigationEvent = new onTransact();
            public static final int IAuthTabCallback = 8;

            static {
                int i = onWarmupCompleted + 5;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onTransact() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new onExtraCallbackWithResult.onNavigationEvent());
                int i2 = onTransact + 3;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class onNavigationEvent extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackStub = 1;
            private static int asBinder = 0;
            private static int onTransact = 1;
            public static final onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onNavigationEvent = -1;
            public static final int onWarmupCompleted = 8;

            private onNavigationEvent() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new onExtraCallbackWithResult.onExtraCallback());
                int i2 = IAuthTabCallbackStub + 5;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }

            static {
                int i = IAuthTabCallback + 119;
                onTransact = i % 128;
                int i2 = i % 2;
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public int IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 21;
                int i3 = i2 % 128;
                asBinder = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = onNavigationEvent;
                int i5 = i3 + 17;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return i4;
                }
                obj.hashCode();
                throw null;
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public void onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                int i4 = i3 % 128;
                asBinder = i4;
                int i5 = i3 % 2;
                onNavigationEvent = i;
                if (i5 != 0) {
                    int i6 = 21 / 0;
                }
                int i7 = i4 + 87;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 43 / 0;
                }
            }
        }

        public static final class asBinder extends IAuthTabCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int onNavigationEvent = 1;
            private static int onTransact = 1;
            private static int onWarmupCompleted;
            public static final asBinder onExtraCallback = new asBinder();
            public static final int IAuthTabCallback = 8;

            static {
                int i = onWarmupCompleted + 47;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private asBinder() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onNavigationEvent()});
                int i2 = IAuthTabCallbackStub + 37;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallback {
            private static int IAuthTabCallbackDefault = 1;
            private static int asBinder = 0;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();
            public static final int IAuthTabCallback = 8;

            static {
                int i = onExtraCallback + 19;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onExtraCallbackWithResult() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(48), new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.onTransact(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(40), new onExtraCallbackWithResult.onNavigationEvent()});
                int i2 = asBinder + 105;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class onWarmupCompleted extends IAuthTabCallback {
            private static int asInterface = 0;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            private static int onTransact = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();
            public static final int IAuthTabCallback = 8;

            static {
                int i = onNavigationEvent + 79;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private onWarmupCompleted() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(48), new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.onTransact(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(40), new onExtraCallbackWithResult.onWarmupCompleted()});
                int i2 = asInterface + 43;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class access100 extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int IAuthTabCallbackDefault = 0;
            private static int asBinder = 1;
            private static int onNavigationEvent;
            public static final access100 onExtraCallback = new access100();
            public static final int onWarmupCompleted = 8;

            static {
                int i = IAuthTabCallback + 61;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private access100() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.onTransact(), new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onWarmupCompleted()});
                int i2 = IAuthTabCallbackDefault + 43;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class access000 extends IAuthTabCallback {
            private static int IAuthTabCallbackStub = 1;
            private static int asBinder = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            public static final access000 IAuthTabCallback = new access000();
            public static final int onExtraCallback = 8;

            static {
                int i = onNavigationEvent + 15;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private access000() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onWarmupCompleted()});
                int i2 = asBinder + 49;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return listListOf;
            }
        }

        public static final class asInterface extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int asBinder = 0;
            private static int asInterface = 1;
            private static int onNavigationEvent = 1;
            public static final asInterface onExtraCallback = new asInterface();
            public static final int onWarmupCompleted = 8;

            static {
                int i = IAuthTabCallback + 43;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            private asInterface() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new onExtraCallbackWithResult.onWarmupCompleted());
                int i2 = asInterface + 25;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 46 / 0;
                }
                return listListOf;
            }
        }

        public static final class IAuthTabCallbackDefault extends IAuthTabCallback {
            private static int IAuthTabCallbackDefault = 1;
            private static int asBinder = 0;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final IAuthTabCallbackDefault onWarmupCompleted = new IAuthTabCallbackDefault();
            public static final int IAuthTabCallback = 8;

            static {
                int i = onNavigationEvent + 29;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            private IAuthTabCallbackDefault() {
                super(null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                int i = 2 % 2;
                List<onExtraCallbackWithResult> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new onExtraCallbackWithResult[]{new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(55), new onExtraCallbackWithResult.IAuthTabCallback(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onTransact(), new onExtraCallbackWithResult.asBinder(), new onExtraCallbackWithResult.C0005onExtraCallbackWithResult(24), new onExtraCallbackWithResult.onNavigationEvent()});
                int i2 = asBinder + 13;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return listListOf;
                }
                throw null;
            }
        }

        public static final class onExtraCallback extends IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final int onNavigationEvent = 8;
            private final List<onExtraCallbackWithResult> onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public onExtraCallback(@NotNull List<? extends onExtraCallbackWithResult> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.onWarmupCompleted = list;
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.IAuthTabCallback
            public List<onExtraCallbackWithResult> onNavigationEvent() {
                List<onExtraCallbackWithResult> list;
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 85;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    list = this.onWarmupCompleted;
                    int i4 = 77 / 0;
                } else {
                    list = this.onWarmupCompleted;
                }
                int i5 = i2 + 87;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return list;
            }
        }
    }

    public static abstract class onExtraCallbackWithResult {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private int IAuthTabCallback;
        private final boolean IAuthTabCallbackStub;
        private float asBinder;
        private float asInterface;
        private int onExtraCallback;
        private float onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private int onTransact;
        private final int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(float f, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, i, i2, i3, i4);
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~(i7 | i5);
            int i9 = ~(i3 | i5);
            int i10 = i7 | (~i5);
            int i11 = i9 | (~(i10 | i4));
            int i12 = (~i4) | i10;
            int i13 = i3 + i5 + i2 + (770105990 * i) + ((-157043368) * i6);
            int i14 = i13 * i13;
            int i15 = ((315592168 * i3) - 1432092672) + ((-1000312294) * i5) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i2) + ((-2121269248) * i) + (1950351360 * i6) + ((-66846720) * i14);
            int i16 = (i3 * 105828664) + 1394048361 + (i5 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i2 * 105828275) + (i * (-227623502)) + (i6 * 619312264) + (i14 * 1925971968);
            return i15 + ((i16 * i16) * 261881856) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }

        public int onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel;
            int i4 = i3 + 7;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = (int) ((i / 10.0f) * 2.2f);
            int i6 = i4 % 2 != 0 ? i5 - 2 : i5 + 4;
            int i7 = i3 + 19;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            throw null;
        }

        private onExtraCallbackWithResult(float f, int i, int i2, int i3, int i4) {
            this.asBinder = f;
            this.IAuthTabCallback = i;
            this.onTransact = i2;
            this.onExtraCallback = i3;
            this.onWarmupCompleted = i4;
            this.asInterface = 1.0f;
            this.IAuthTabCallbackStub = true;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(float f, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i5 & 16) != 0) {
                int i6 = IAuthTabCallback_Parcel + 17;
                int i7 = i6 % 128;
                IAuthTabCallbackDefault = i7;
                i4 = i6 % 2 != 0 ? 90 : 24;
                int i8 = i7 + 105;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            this(f, i, i2, i3, i4, null);
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asBinder;
            int i5 = i2 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 77;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder = f;
            if (i3 != 0) {
                int i4 = 77 / 0;
            }
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 27;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.IAuthTabCallback;
            if (i3 != 0) {
                int i5 = 24 / 0;
            }
            return i4;
        }

        public final void onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 73;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallback = i;
            if (i4 == 0) {
                int i5 = 33 / 0;
            }
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 71;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            Object obj = null;
            onextracallbackwithresult.onTransact = iIntValue;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        public final int asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 71;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onTransact;
            int i6 = i2 + 7;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 87;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult.onExtraCallback = iIntValue;
            if (i3 != 0) {
                return null;
            }
            int i4 = 60 / 0;
            return null;
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.onExtraCallback;
            int i5 = i3 + 21;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.onWarmupCompleted;
            int i5 = i3 + 19;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            throw null;
        }

        public final void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 63;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallbackWithResult = f;
            int i5 = i2 + 67;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 45;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i3 + 119;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 91;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            this.asInterface = f;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 67;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asInterface;
            }
            throw null;
        }

        public boolean IAuthTabCallbackDefault() {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 5;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                z = this.IAuthTabCallbackStub;
                int i4 = 93 / 0;
            } else {
                z = this.IAuthTabCallbackStub;
            }
            int i5 = i3 + 107;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 93;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public void onExtraCallback(@NotNull Context context, @NotNull Canvas canvas, @NotNull Paint paint, @NotNull RectF rectF, float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(canvas, "");
                Intrinsics.checkNotNullParameter(paint, "");
                Intrinsics.checkNotNullParameter(rectF, "");
                canvas.drawRoundRect(rectF, f, f, paint);
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(rectF, "");
            canvas.drawRoundRect(rectF, f, f, paint);
            int i3 = IAuthTabCallbackDefault + 95;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }

        public int onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 55;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = this.IAuthTabCallback;
            int i5 = i3 + 87;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final void onExtraCallbackWithResult(int i) {
            Object[] objArr = {this, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 250836180, iOnExtraCallbackWithResult, objArr, -250836180, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
        }

        public final void onNavigationEvent(int i) {
            Object[] objArr = {this, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            onNavigationEvent(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -357759551, iOnExtraCallbackWithResult, objArr, 357759552, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult());
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public onNavigationEvent() {
                super(1.0f, 64, 18, 16, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public int onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = onExtraCallback() + ((int) ((f - 1.0f) * 70.0f));
                int i4 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return iOnExtraCallback;
            }
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public onWarmupCompleted() {
                super(1.0f, 42, 13, 32, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public void onExtraCallback(@NotNull Context context, @NotNull Canvas canvas, @NotNull Paint paint, @NotNull RectF rectF, float f) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(canvas, "");
                Intrinsics.checkNotNullParameter(paint, "");
                Intrinsics.checkNotNullParameter(rectF, "");
                Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
                float fOnNavigationEvent = varyMatches.onNavigationEvent(40, r4) / 2.0f;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(1, displayMetrics);
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(14, displayMetrics2);
                canvas.drawCircle(rectF.left + fOnNavigationEvent, rectF.top + iOnNavigationEvent + fOnNavigationEvent, fOnNavigationEvent, paint);
                canvas.drawRoundRect(rectF.left + (fOnNavigationEvent * 2.0f) + iOnNavigationEvent2, rectF.top, rectF.right, rectF.bottom, f, f, paint);
                int i4 = onNavigationEvent + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public static final class IAuthTabCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final boolean onWarmupCompleted;

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public int onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return 0;
            }

            public IAuthTabCallback() {
                super(1.0f, (int) M_.onExtraCallback.asBinder(), 0, 0, 0, null);
                this.onWarmupCompleted = true;
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public boolean IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean z = this.onWarmupCompleted;
                int i5 = i2 + 71;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
        }

        public static final class onTransact extends onExtraCallbackWithResult {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public onTransact() {
                super(0.5f, 30, 11, 12, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public int onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = onExtraCallback() + ((int) ((f - 1.0f) * 30.0f));
                int i4 = onNavigationEvent + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return iOnExtraCallback;
                }
                throw null;
            }
        }

        public static final class asBinder extends onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public asBinder() {
                super(0.33f, 22, 9, 12, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public int onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallback = onExtraCallback() + ((int) ((f - 1.0f) * 20.0f));
                int i4 = onExtraCallback + 79;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return iOnExtraCallback;
                }
                throw null;
            }
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public onExtraCallback() {
                super(1.0f, 240, 38, 20, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public int onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iAsBinder = asBinder();
                int i5 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return iAsBinder;
                }
                throw null;
            }
        }

        /* renamed from: im.toss.uikit.widget.TdsSkeletonV1View$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0005onExtraCallbackWithResult extends onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private final boolean IAuthTabCallback;

            public C0005onExtraCallbackWithResult(int i) {
                super(1.0f, i, 0, 0, 0, 16, null);
            }

            @Override // im.toss.uikit.widget.TdsSkeletonV1View.onExtraCallbackWithResult
            public boolean IAuthTabCallbackDefault() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                boolean z = this.IAuthTabCallback;
                int i5 = i2 + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return z;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted Dark;
        public static final onWarmupCompleted Grey;
        public static final onWarmupCompleted GreyOpacity100;
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted White;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final int backgroundColorResId;
        private final int dayColorResId;
        private final int nightColorResId;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = Grey;
            if (i3 != 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, White, GreyOpacity100, Dark};
            }
            onWarmupCompleted onwarmupcompleted2 = White;
            onWarmupCompleted onwarmupcompleted3 = GreyOpacity100;
            onWarmupCompleted onwarmupcompleted4 = Dark;
            onWarmupCompleted[] onwarmupcompletedArr = {onwarmupcompleted2, onwarmupcompleted};
            onwarmupcompletedArr[3] = onwarmupcompleted3;
            onwarmupcompletedArr[3] = onwarmupcompleted4;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i4 = i3 + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 36 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i, int i2, int i3, int i4) {
            this.dayColorResId = i2;
            this.nightColorResId = i3;
            this.backgroundColorResId = i4;
        }

        public final int getDayColorResId() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.dayColorResId;
            int i6 = i3 + 91;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getNightColorResId() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.nightColorResId;
            if (i3 == 0) {
                int i5 = 54 / 0;
            }
            return i4;
        }

        public final int getBackgroundColorResId() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.backgroundColorResId;
            int i6 = i3 + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = im.toss.tds.R.color.grey_100;
            int i2 = im.toss.tds.R.color.grey_050;
            int i3 = im.toss.tds.R.color.background_default;
            Grey = new onWarmupCompleted("Grey", 0, i, i2, i3);
            White = new onWarmupCompleted("White", 1, i3, i3, i3);
            GreyOpacity100 = new onWarmupCompleted("GreyOpacity100", 2, im.toss.uikit.R.color.skeleton_grey_opacity_100_day, im.toss.uikit.R.color.skeleton_grey_opacity_100_night, im.toss.tds.R.color.background_lower);
            int i4 = im.toss.tds.R.color.dark_theme_grey_100;
            Dark = new onWarmupCompleted("Dark", 3, i4, i4, im.toss.tds.R.color.static_black);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i5 = onNavigationEvent + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsSkeletonV1View tdsSkeletonV1View, float f) {
        Object[] objArr = {tdsSkeletonV1View, Float.valueOf(f)};
        return (Unit) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -197938019, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, 197938019);
    }

    private final void asInterface() {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback, iIAuthTabCallback2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 1572717814, iIAuthTabCallback3, new Object[]{this}, -1572717813);
    }

    private static final Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, TdsSkeletonV1View tdsSkeletonV1View, float f) {
        Object[] objArr = {onextracallbackwithresult, tdsSkeletonV1View, Float.valueOf(f)};
        return (Unit) onNavigationEvent(ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1248918472, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, 1248918474);
    }
}
