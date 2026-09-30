package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.R;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class M_ {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static Integer onExtraCallbackWithResult = null;
    private static int onTransact = 1;
    private static Integer onWarmupCompleted;
    public static final M_ onExtraCallback = new M_();
    public static final int onNavigationEvent = 8;

    static {
        int i = asBinder + 111;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = (~(i | i3)) | i8;
        int i10 = (~(i3 | (~i4))) | (~((~i) | i7)) | i8;
        int i11 = i7 | i | i4;
        int i12 = i + i4 + i6 + (1050315579 * i5) + (2086215248 * i2);
        int i13 = i12 * i12;
        int i14 = (i * (-1156115713)) + 1671168000 + ((-1156115713) * i4) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i6) + ((-1303117824) * i5) + (314572800 * i2) + (431423488 * i13);
        int i15 = ((i * (-961373039)) - 1316831794) + (i4 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i6 * (-961372049)) + (i5 * 755842709) + (i2 * (-1858722640)) + (i13 * (-2040987648));
        switch (i14 + (i15 * i15 * 1361641472)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                EditText editText = (EditText) objArr[1];
                int i16 = 2 % 2;
                int i17 = IAuthTabCallbackDefault + 39;
                int i18 = i17 % 128;
                onTransact = i18;
                int i19 = i17 % 2;
                if (editText != null) {
                    int i20 = i18 + 53;
                    IAuthTabCallbackDefault = i20 % 128;
                    int i21 = i20 % 2;
                    setMethodokhttp.onExtraCallback(editText);
                }
                int i22 = onTransact + 41;
                IAuthTabCallbackDefault = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                Number number = (Number) objArr[1];
                Context context = (Context) objArr[2];
                int i24 = 2 % 2;
                int i25 = IAuthTabCallbackDefault + 59;
                onTransact = i25 % 128;
                if (i25 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(number, "");
                    Intrinsics.checkNotNullParameter(context, "");
                } else {
                    Intrinsics.checkNotNullParameter(number, "");
                    Intrinsics.checkNotNullParameter(context, "");
                }
                return Integer.valueOf((int) (number.floatValue() / context.getResources().getDisplayMetrics().scaledDensity));
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private M_() {
    }

    private final Resources getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 == 0) {
            return (Resources) followRedirects.IAuthTabCallback(1316113812, iOnWarmupCompleted4, objArr, -1316113811, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int asInterface() {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = getInterfaceDescriptor().getDisplayMetrics().widthPixels;
            int i4 = 35 / 0;
        } else {
            i = getInterfaceDescriptor().getDisplayMetrics().widthPixels;
        }
        int i5 = IAuthTabCallbackDefault + 93;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            i = context.getResources().getDisplayMetrics().widthPixels;
            int i4 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            i = context.getResources().getDisplayMetrics().widthPixels;
        }
        int i5 = IAuthTabCallbackDefault + 63;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(i);
        }
        int i6 = 12 / 0;
        return Integer.valueOf(i);
    }

    public final float asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = asInterface();
        DisplayMetrics displayMetrics = getInterfaceDescriptor().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Object[] objArr = {Integer.valueOf(iAsInterface), displayMetrics};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        float fFloatValue = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
        int i4 = onTransact + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getInterfaceDescriptor().getDisplayMetrics().heightPixels;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i4 = context.getResources().getDisplayMetrics().heightPixels;
        int i5 = IAuthTabCallbackDefault + 119;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            DisplayMetrics displayMetrics = getInterfaceDescriptor().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            Object[] objArr = {Integer.valueOf(iIAuthTabCallbackDefault), displayMetrics};
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            return ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, objArr, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
        }
        int iIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
        DisplayMetrics displayMetrics2 = getInterfaceDescriptor().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        Object[] objArr2 = {Integer.valueOf(iIAuthTabCallbackDefault2), displayMetrics2};
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, objArr2, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2)).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int access000() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int identifier = getInterfaceDescriptor().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int i4 = IAuthTabCallbackDefault + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        int dimensionPixelSize = getInterfaceDescriptor().getDimensionPixelSize(identifier);
        if (i5 == 0) {
            int i6 = 99 / 0;
        }
        return dimensionPixelSize;
    }

    @Deprecated
    public final int IAuthTabCallbackStub(@NotNull Context context) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return dimensionPixelSize;
    }

    public final int onExtraCallbackWithResult() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int identifier = getInterfaceDescriptor().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int i3 = IAuthTabCallbackDefault + 9;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Resources interfaceDescriptor = getInterfaceDescriptor();
            if (i4 != 0) {
                return interfaceDescriptor.getDimensionPixelSize(identifier);
            }
            interfaceDescriptor.getDimensionPixelSize(identifier);
            obj.hashCode();
            throw null;
        }
        getInterfaceDescriptor().getIdentifier("navigation_bar_height", "dimen", "android");
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
            return getInterfaceDescriptor().getBoolean(getInterfaceDescriptor().getIdentifier("config_showNavigationBar", "bool", "android"));
        }
        return getInterfaceDescriptor().getBoolean(getInterfaceDescriptor().getIdentifier("config_showNavigationBar", "bool", "android"));
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int iIAuthTabCallbackDefault = (i2 % 2 == 0 ? IAuthTabCallbackDefault() : IAuthTabCallbackDefault()) - access000();
        int i3 = IAuthTabCallbackDefault + 9;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return iIAuthTabCallbackDefault;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this, null, 1, null);
        DisplayMetrics displayMetrics = getInterfaceDescriptor().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(iOnExtraCallbackWithResult), displayMetrics);
        int i4 = onTransact + 27;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return iOnNavigationEvent;
    }

    public final int onExtraCallbackWithResult(int i, @NotNull Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i3 = 31;
        if (i > 10) {
            if (i < 31) {
                switch (i) {
                    case 11:
                        break;
                    case 12:
                        int i4 = onTransact + 25;
                        IAuthTabCallbackDefault = i4 % 128;
                        int i5 = i4 % 2;
                        i3 = 32;
                        break;
                    case 13:
                        i3 = 34;
                        break;
                    case 14:
                        i3 = 36;
                        break;
                    case 15:
                        i3 = 37;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i3 = 39;
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        i3 = 40;
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        int i6 = onTransact + 93;
                        IAuthTabCallbackDefault = i6 % 128;
                        int i7 = i6 % 2;
                        i3 = 41;
                        break;
                    default:
                        int i8 = IAuthTabCallbackDefault + 105;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 42;
                        break;
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
                return ((Integer) onNavigationEvent(-1590362228, new Object[]{this, Float.valueOf(varyMatches.onNavigationEvent(Integer.valueOf(i), r0)), context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1590362234, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
            }
        }
        return Math.min(i3, (int) (i * context.getResources().getConfiguration().fontScale));
    }

    public static /* synthetic */ int onWarmupCompleted(M_ m_, Number number, Context context, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onTransact + 99;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                AFj1rSDK.onExtraCallback.onNavigationEvent();
                throw null;
            }
            context = AFj1rSDK.onExtraCallback.onNavigationEvent();
        }
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iIntValue = ((Integer) onNavigationEvent(-1590362228, new Object[]{m_, number, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 1590362234, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
        int i4 = onTransact + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        deprecated_minFreshSeconds deprecated_minfreshsecondsOnWarmupCompleted = deprecated_onlyIfCached.onWarmupCompleted(context, fFloatValue);
        int i4 = IAuthTabCallbackDefault + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_minfreshsecondsOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(M_ m_, Context context, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 69;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            context = AFj1rSDK.onExtraCallback.onNavigationEvent();
            if (i6 != 0) {
                int i7 = 43 / 0;
            }
            int i8 = IAuthTabCallbackDefault + 11;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        }
        return m_.onExtraCallbackWithResult(context);
    }

    public final int onExtraCallbackWithResult(@Nullable Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (context == null) {
            int i5 = i2 + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (int) (dimensionPixelSize / context.getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ Drawable onExtraCallbackWithResult(M_ m_, Drawable drawable, int i, PorterDuff.Mode mode, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 89;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 53;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            mode = PorterDuff.Mode.SRC_IN;
        }
        Drawable drawableIAuthTabCallback = m_.IAuthTabCallback(drawable, i, mode);
        int i8 = IAuthTabCallbackDefault + 73;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 2 / 0;
        }
        return drawableIAuthTabCallback;
    }

    public final Drawable IAuthTabCallback(@NotNull Drawable drawable, int i, @NotNull PorterDuff.Mode mode) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 101;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(mode, "");
            Drawable drawableMutate = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable).mutate();
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
            CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableMutate, ColorStateList.valueOf(i));
            CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableMutate, mode);
            return drawableMutate;
        }
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(mode, "");
        Drawable drawableMutate2 = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate2, "");
        CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableMutate2, ColorStateList.valueOf(i));
        CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableMutate2, mode);
        int i4 = 52 / 0;
        return drawableMutate2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        M_ m_ = (M_) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        ColorStateList colorStateList = (ColorStateList) objArr[2];
        PorterDuff.Mode mode = (PorterDuff.Mode) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 99;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (4 & iIntValue) != 0 : (iIntValue & 2) != 0) {
            int i4 = i2 + 33;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            mode = PorterDuff.Mode.SRC_IN;
            int i6 = IAuthTabCallbackDefault + 79;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        Drawable drawable2 = (Drawable) onNavigationEvent(1811986266, new Object[]{m_, drawable, colorStateList, mode}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1811986262, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
        int i8 = IAuthTabCallbackDefault + 15;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return drawable2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Drawable drawable = (Drawable) objArr[1];
        ColorStateList colorStateList = (ColorStateList) objArr[2];
        PorterDuff.Mode mode = (PorterDuff.Mode) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(mode, "");
            Drawable drawableMutate = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable).mutate();
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
            CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableMutate, colorStateList);
            CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableMutate, mode);
            throw null;
        }
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(mode, "");
        Drawable drawableMutate2 = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate2, "");
        CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableMutate2, colorStateList);
        CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableMutate2, mode);
        int i3 = IAuthTabCallbackDefault + 9;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return drawableMutate2;
        }
        throw null;
    }

    public final void onWarmupCompleted(@NotNull EditText... editTextArr) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(editTextArr, "");
        for (EditText editText : editTextArr) {
            int i4 = IAuthTabCallbackDefault + 31;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            if (editText != null) {
                int i7 = i5 + 9;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                setMethodokhttp.onExtraCallback(editText);
                int i9 = onTransact + 115;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    public final void onExtraCallback(@Nullable View view) {
        int i = 2 % 2;
        if (view != null) {
            int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            setMethodokhttp.onWarmupCompleted(view);
        }
        int i4 = onTransact + 9;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(M_ m_, View view, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 19;
            int i7 = i6 % 128;
            IAuthTabCallbackDefault = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 53;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            j = 350;
        }
        m_.IAuthTabCallback(view, j);
    }

    public final void IAuthTabCallback(@Nullable View view, long j) {
        int i = 2 % 2;
        if (view != null) {
            int i2 = IAuthTabCallbackDefault + 81;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            setMethodokhttp.onExtraCallback(view, j);
        }
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (view != null) {
            int i5 = i3 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            setMethodokhttp.onExtraCallbackWithResult(view);
            if (i6 != 0) {
                throw null;
            }
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final Integer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return num;
    }

    public final void onWarmupCompleted(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult = num;
        int i5 = i2 + 3;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        onWarmupCompleted = num;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int IAuthTabCallbackStub() throws Resources.NotFoundException {
        int i = 2 % 2;
        Integer num = onWarmupCompleted;
        if (num == null || (num != null && num.intValue() == 0)) {
            int iAccess000 = access000();
            int i2 = IAuthTabCallbackDefault + 105;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 28 / 0;
            }
            return iAccess000;
        }
        Integer num2 = onWarmupCompleted;
        Intrinsics.checkNotNull(num2);
        int iIntValue = num2.intValue();
        int i4 = onTransact + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r2.intValue() != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onWarmupCompleted() throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = onExtraCallbackWithResult;
        if (num != null) {
            if (num != null) {
                int i4 = i2 + 29;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    num.intValue();
                    obj.hashCode();
                    throw null;
                }
            }
            Integer num2 = onExtraCallbackWithResult;
            Intrinsics.checkNotNull(num2);
            return num2.intValue();
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i5 = IAuthTabCallbackDefault + 97;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[PHI: r5
      0x009b: PHI (r5v12 android.view.RoundedCorner) = (r5v11 android.view.RoundedCorner), (r5v20 android.view.RoundedCorner) binds: [B:19:0x0099, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Rect onExtraCallback(@NotNull Context context) {
        RoundedCorner roundedCorner;
        int radius;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT < 31) {
            int i2 = onTransact + 93;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        Activity activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
        if (activityOnExtraCallback != null) {
            int i4 = IAuthTabCallbackDefault + 47;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            WindowManager windowManager = activityOnExtraCallback.getWindowManager();
            if (windowManager != null) {
                WindowInsets windowInsets = windowManager.getCurrentWindowMetrics().getWindowInsets();
                Intrinsics.checkNotNullExpressionValue(windowInsets, "");
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 3});
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
                Iterator it = listListOf.iterator();
                while (!(!it.hasNext())) {
                    int i6 = IAuthTabCallbackDefault + 37;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        roundedCorner = windowInsets.getRoundedCorner(((Number) it.next()).intValue());
                        int i7 = 14 / 0;
                        radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                    } else {
                        roundedCorner = windowInsets.getRoundedCorner(((Number) it.next()).intValue());
                        if (roundedCorner != null) {
                        }
                    }
                    arrayList.add(Integer.valueOf(radius));
                }
                return new Rect(((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue(), ((Number) arrayList.get(3)).intValue());
            }
        }
        return null;
    }

    public final int onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return resourceId;
    }

    public final int onTransact(@NotNull Context context) {
        TypedArray typedArrayObtainStyledAttributes;
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int[] iArr = new int[0];
            iArr[1] = R.attr.selectableItemBackgroundBorderless;
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        }
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ Drawable onExtraCallbackWithResult(M_ m_, Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, int i, Object obj) {
        Object[] objArr = {m_, drawable, colorStateList, mode, Integer.valueOf(i), obj};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Drawable) onNavigationEvent(532468797, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -532468797, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final int onExtraCallback(@NotNull Number number, @NotNull Context context) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Integer) onNavigationEvent(-1590362228, new Object[]{this, number, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 1590362234, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
    }

    public final deprecated_minFreshSeconds onNavigationEvent(@NotNull Context context, float f) {
        Object[] objArr = {this, context, Float.valueOf(f)};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (deprecated_minFreshSeconds) onNavigationEvent(-556734050, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final int onNavigationEvent(@NotNull Context context) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return ((Integer) onNavigationEvent(-2118175014, new Object[]{this, context}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
    }

    public final void onExtraCallback(@Nullable EditText editText) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onNavigationEvent(1483765845, new Object[]{this, editText}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1483765843, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final void IAuthTabCallback(@Nullable View view) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        onNavigationEvent(1312897292, new Object[]{this, view}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final Drawable onExtraCallbackWithResult(@NotNull Drawable drawable, @Nullable ColorStateList colorStateList, @NotNull PorterDuff.Mode mode) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Drawable) onNavigationEvent(1811986266, new Object[]{this, drawable, colorStateList, mode}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1811986262, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
    }
}
