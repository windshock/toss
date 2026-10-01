package im.toss.tds.view.component.compound.bottomcta;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tds.view.component.widget.TdsScrollView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import o.Address;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.Cache;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.ICrashCallback;
import o.RequestBodyCompanion;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.access15300;
import o.authParams;
import o.authenticate;
import o.clearRevision;
import o.deprecated_cacheControl;
import o.deprecated_certificatePinner;
import o.getExtraParameters;
import o.initSDK;
import o.isFireOS;
import o.isMuted;
import o.noCache;
import o.pxToDp;
import o.registerCrashCallback;
import o.runOnUiThreadDelayed;
import o.setBodyokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsBottomCtaV1View extends LinearLayout implements ICrashCallback {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private runOnUiThreadDelayed onNavigationEvent;
    private onExtraCallback onWarmupCompleted;

    public interface onExtraCallback {
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.FADE.ordinal()] = 2;
                int i = onExtraCallback + 27;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAuthTabCallback.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[onWarmupCompleted.values().length];
            try {
                iArr2[onWarmupCompleted.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[onWarmupCompleted.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            IAuthTabCallback = iArr2;
            int i3 = onExtraCallback + 59;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = asInterface + 97;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, onWarmupCompleted onwarmupcompleted, TdsBottomCtaV1View tdsBottomCtaV1View, Ref.BooleanRef booleanRef, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 33;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {Integer.valueOf(i), onwarmupcompleted, tdsBottomCtaV1View, booleanRef, Integer.valueOf(i2), Integer.valueOf(i3)};
        Unit unit = (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -1321752672, 1321752692, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i7 = IAuthTabCallbackStub + 75;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, view);
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, view);
        int i4 = onTransact + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(tdsBottomCtaV1View);
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(tdsBottomCtaV1View);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(tdsBottomCtaV1View);
        int i3 = IAuthTabCallbackStub + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Sequence sequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(tdsBottomCtaV1View, view);
        int i4 = onTransact + 29;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return sequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void asBinder(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, view);
        int i4 = onTransact + 55;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, view);
        int i4 = onTransact + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~((~i3) | i8 | i5);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i5);
        int i13 = (~(i3 | i7)) | (~(i7 | i4)) | i10;
        int i14 = i5 + i4 + i2 + (1787548100 * i) + (1101416392 * i6);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i5) - 623378432) + (561581232 * i4) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i2) + ((-778043392) * i) + ((-46137344) * i6) + (324403200 * i15);
        int i17 = (i5 * (-930662234)) + 656878810 + (i4 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i2 * (-930661477)) + (i * 2052861356) + (i6 * 749768216) + (i15 * (-2028863488));
        switch (i16 + (i17 * i17 * (-1850081280))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                int i18 = 2 % 2;
                int i19 = onTransact + 51;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
                int i21 = 2 % 2;
                int i22 = onTransact + 31;
                IAuthTabCallbackStub = i22 % 128;
                int i23 = i22 % 2;
                BaseTextView baseTextView = (BaseTextView) tdsBottomCtaV1View.findViewById(R.id.tds_bottom_cta_v1_info_title);
                int i24 = onTransact + 97;
                IAuthTabCallbackStub = i24 % 128;
                int i25 = i24 % 2;
                return baseTextView;
            case 12:
                return access000(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return extraCallbackWithResult(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return writeTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return ICustomTabsCallback(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {tdsBottomCtaV1View, Boolean.valueOf(zBooleanValue)};
            return onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, 48678613, -48678598, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        Object[] objArr3 = {tdsBottomCtaV1View, Boolean.valueOf(zBooleanValue)};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr3, 48678613, -48678598, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, view);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallbackStub + 15;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(View view, View view2) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(view, view2);
        int i4 = IAuthTabCallbackStub + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(tdsBottomCtaV1View);
        int i4 = IAuthTabCallbackStub + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View, function0}, -118090303, 118090313, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i4 = IAuthTabCallbackStub + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallbackStubProxy(function1, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View, view}, 1359477685, -1359477684, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue();
        int i4 = IAuthTabCallbackStub + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(tdsBottomCtaV1View);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = onTransact + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsBottomCtaV1View, zBooleanValue);
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -453019408, 453019420, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i4 = IAuthTabCallbackStub + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tdsBottomCtaV1View, f);
        int i4 = onTransact + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{function1, view}, -1983229441, 1983229460, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            return;
        }
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{function1, view}, -1983229441, 1983229460, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function2 function2, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 63;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(function2, view, i, i2, i3, i4);
        int i8 = IAuthTabCallbackStub + 105;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public IAuthTabCallbackStub() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 17;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (!(!TdsBottomCtaV1View.IAuthTabCallbackStub(TdsBottomCtaV1View.this))) {
                TdsBottomCtaV1View.this.onExtraCallbackWithResult(false);
                int i12 = onExtraCallback + 67;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = onExtraCallback + 113;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 onExtraCallback;

        public IAuthTabCallbackStubProxy(Function0 function0) {
            this.onExtraCallback = function0;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            this.onExtraCallback.invoke();
            int i12 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 60 / 0;
            }
        }
    }

    public static final class asBinder implements View.OnLayoutChangeListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public asBinder() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TdsBottomCtaV1View tdsBottomCtaV1View;
            boolean z;
            int i9 = 2 % 2;
            int i10 = onWarmupCompleted + 47;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            if (TdsBottomCtaV1View.IAuthTabCallbackStub(TdsBottomCtaV1View.this)) {
                int i12 = onExtraCallback + 67;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    tdsBottomCtaV1View = TdsBottomCtaV1View.this;
                    z = true;
                } else {
                    tdsBottomCtaV1View = TdsBottomCtaV1View.this;
                    z = false;
                }
                tdsBottomCtaV1View.onExtraCallbackWithResult(z);
            }
        }
    }

    public static final class asInterface implements View.OnLayoutChangeListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public asInterface() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            registerCrashCallback registercrashcallbackAsInterface;
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            TextPaint paint = TdsBottomCtaV1View.this.asInterface().getPaint();
            int length = TdsBottomCtaV1View.this.asInterface().length();
            Object[] objArr = {TdsBottomCtaV1View.this};
            if (length > ((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).length()) {
                registercrashcallbackAsInterface = TdsBottomCtaV1View.this.asInterface();
            } else {
                Object[] objArr2 = {TdsBottomCtaV1View.this};
                registercrashcallbackAsInterface = (TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i10 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            if (TdsBottomCtaV1View.this.asInterface().getMeasuredWidth() - (TdsBottomCtaV1View.this.asInterface().getPaddingLeft() + TdsBottomCtaV1View.this.asInterface().getPaddingRight()) >= paint.measureText(registercrashcallbackAsInterface.getText().toString())) {
                TdsBottomCtaV1View.asInterface(TdsBottomCtaV1View.this);
                int i12 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            TdsBottomCtaV1View.onTransact(TdsBottomCtaV1View.this);
            int i14 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStub(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = tdsBottomCtaV1View.onExtraCallbackWithResult;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void asInterface(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        tdsBottomCtaV1View.ICustomTabsCallbackDefault();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onTransact(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        tdsBottomCtaV1View.ICustomTabsCallbackStubProxy();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = onTransact + 11;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBottomCtaV1View(@NotNull Context context) throws Resources.NotFoundException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = true;
        onWarmupCompleted(this, (AttributeSet) null, 1, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBottomCtaV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = true;
        onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsBottomCtaV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = true;
        onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback SLIDE = new IAuthTabCallback("SLIDE", 0);
        public static final IAuthTabCallback FADE = new IAuthTabCallback("FADE", 1);
        public static final IAuthTabCallback SCALE = new IAuthTabCallback("SCALE", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 55;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback = SLIDE;
                IAuthTabCallback iAuthTabCallback2 = FADE;
                IAuthTabCallback iAuthTabCallback3 = SCALE;
                iAuthTabCallbackArr = new IAuthTabCallback[4];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[1] = iAuthTabCallback2;
                iAuthTabCallbackArr[4] = iAuthTabCallback3;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{SLIDE, FADE, SCALE};
            }
            int i4 = i2 + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 79;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onWarmupCompleted HIDE = new onWarmupCompleted("HIDE", 0);
        public static final onWarmupCompleted SHOW = new onWarmupCompleted("SHOW", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = HIDE;
            if (i3 == 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, SHOW};
            }
            onWarmupCompleted onwarmupcompleted2 = SHOW;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[4];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[1] = onwarmupcompleted2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 55;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 86 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackDefault implements View.OnAttachStateChangeListener {
        private static int asBinder = 1;
        private static int onTransact;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ int onExtraCallback;
        final /* synthetic */ TdsBottomCtaV1View onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;
        final /* synthetic */ int onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 77;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public IAuthTabCallbackDefault(View view, TdsBottomCtaV1View tdsBottomCtaV1View, int i, boolean z, int i2) {
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult = tdsBottomCtaV1View;
            this.onExtraCallback = i;
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = i2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            ViewParent parent = this.onExtraCallbackWithResult.getParent();
            Intrinsics.checkNotNull(parent, "");
            RecyclerView recyclerViewFindViewById = ((ViewGroup) parent).findViewById(this.onExtraCallback);
            Object obj = null;
            if (recyclerViewFindViewById instanceof RecyclerView) {
                int i2 = onTransact + 101;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    this.onExtraCallbackWithResult.onExtraCallback(recyclerViewFindViewById, this.IAuthTabCallback, this.onWarmupCompleted);
                    return;
                } else {
                    this.onExtraCallbackWithResult.onExtraCallback(recyclerViewFindViewById, this.IAuthTabCallback, this.onWarmupCompleted);
                    obj.hashCode();
                    throw null;
                }
            }
            if (recyclerViewFindViewById instanceof NestedScrollView) {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult((NestedScrollView) recyclerViewFindViewById, this.IAuthTabCallback, this.onWarmupCompleted);
                int i3 = asBinder + 115;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (recyclerViewFindViewById instanceof ScrollView) {
                int i4 = onTransact + 17;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                this.onExtraCallbackWithResult.onWarmupCompleted((ScrollView) recyclerViewFindViewById, this.IAuthTabCallback, this.onWarmupCompleted);
            }
        }
    }

    private final View onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        View view = (View) clearRevision.IAuthTabCallbackDefault(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(this));
        int i3 = IAuthTabCallbackStub + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return view;
    }

    static /* synthetic */ void onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, AttributeSet attributeSet, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 51;
            IAuthTabCallbackStub = i6 % 128;
            attributeSet = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        tdsBottomCtaV1View.onWarmupCompleted(attributeSet);
        int i7 = IAuthTabCallbackStub + 11;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 6 / 0;
        }
    }

    private final void onWarmupCompleted(AttributeSet attributeSet) throws Resources.NotFoundException {
        TdsCheckBoxV1View.onNavigationEvent onnavigationevent;
        TdsCheckBoxV1View.onNavigationEvent onnavigationevent2;
        boolean z;
        boolean z2;
        TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback;
        TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback2;
        String string;
        int i;
        EnumEntries<TdsCheckBoxV1View.onNavigationEvent> entries;
        int i2 = 2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.tds_bottom_cta_v1, (ViewGroup) this, true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsBottomCtaV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = TdsButtonV1View.IAuthTabCallbackDefault.WEAK;
            TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback3 = TdsTextButtonV0View.IAuthTabCallback.PRIMARY;
            TdsCheckBoxV1View.onNavigationEvent onnavigationevent3 = TdsCheckBoxV1View.onNavigationEvent.CIRCLE_BIG_PRIMARY;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            String str = "";
            String string2 = str;
            String string3 = string2;
            String string4 = string3;
            String string5 = string4;
            String str2 = string5;
            String string6 = str2;
            String string7 = string6;
            String string8 = string7;
            String string9 = string8;
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub3 = iAuthTabCallbackStub2;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault3 = iAuthTabCallbackDefault;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault4 = iAuthTabCallbackDefault2;
            TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
            TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback4;
            TdsCheckBoxV1View.onNavigationEvent onnavigationevent4 = onnavigationevent3;
            TdsCheckBoxV1View.onNavigationEvent onnavigationevent5 = onnavigationevent4;
            boolean z3 = true;
            int i3 = 0;
            boolean z4 = false;
            boolean z5 = false;
            int resourceId = 0;
            int color = 0;
            deprecated_cacheControl deprecated_cachecontrol = null;
            deprecated_cacheControl deprecated_cachecontrol2 = null;
            View.OnClickListener deprecated_cachecontrol3 = null;
            View.OnClickListener deprecated_cachecontrol4 = null;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsBottomCtaV1_ctaTitle) {
                    string3 = typedArrayObtainStyledAttributes.getString(index);
                    if (string3 == null) {
                        string3 = "";
                    }
                } else if (index == R.styleable.TdsBottomCtaV1_ctaType) {
                    iAuthTabCallbackStub2 = (TdsButtonV1View.IAuthTabCallbackStub) TdsButtonV1View.IAuthTabCallbackStub.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex()));
                } else if (index == R.styleable.TdsBottomCtaV1_ctaStyle) {
                    iAuthTabCallbackDefault3 = (TdsButtonV1View.IAuthTabCallbackDefault) TdsButtonV1View.IAuthTabCallbackDefault.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex()));
                } else if (index == R.styleable.TdsBottomCtaV1_onCtaClick) {
                    int i4 = IAuthTabCallbackStub + 33;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    String string10 = typedArrayObtainStyledAttributes.getString(index);
                    if (string10 == null) {
                        string10 = "";
                    }
                    deprecated_cachecontrol = new deprecated_cacheControl(this, string10);
                } else if (index == R.styleable.TdsBottomCtaV1_secondaryTitle) {
                    string4 = typedArrayObtainStyledAttributes.getString(index);
                    if (string4 == null) {
                        string4 = "";
                    }
                } else if (index == R.styleable.TdsBottomCtaV1_secondaryType) {
                    iAuthTabCallbackStub3 = (TdsButtonV1View.IAuthTabCallbackStub) TdsButtonV1View.IAuthTabCallbackStub.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackStub.PRIMARY.getIndex()));
                } else if (index == R.styleable.TdsBottomCtaV1_secondaryStyle) {
                    int i6 = IAuthTabCallbackStub + 99;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    iAuthTabCallbackDefault4 = (TdsButtonV1View.IAuthTabCallbackDefault) TdsButtonV1View.IAuthTabCallbackDefault.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, TdsButtonV1View.IAuthTabCallbackDefault.FILL.getIndex()));
                } else if (index == R.styleable.TdsBottomCtaV1_onSecondaryClick) {
                    String string11 = typedArrayObtainStyledAttributes.getString(index);
                    if (string11 == null) {
                        string11 = "";
                    }
                    deprecated_cachecontrol2 = new deprecated_cacheControl(this, string11);
                } else if (index == R.styleable.TdsBottomCtaV1_infoTitle) {
                    string5 = typedArrayObtainStyledAttributes.getString(index);
                    if (string5 == null) {
                        string5 = "";
                    }
                } else if (index == R.styleable.TdsBottomCtaV1_infoMessage) {
                    string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 == null) {
                        string2 = "";
                    }
                } else {
                    if (index == R.styleable.TdsBottomCtaV1_topButtonTitle) {
                        string = typedArrayObtainStyledAttributes.getString(index);
                        if (string == null) {
                            string = "";
                        }
                    } else if (index == R.styleable.TdsBottomCtaV1_topButtonType) {
                        iAuthTabCallback4 = (TdsTextButtonV0View.IAuthTabCallback) TdsTextButtonV0View.IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                    } else {
                        if (index == R.styleable.TdsBottomCtaV1_topDescription) {
                            String string12 = typedArrayObtainStyledAttributes.getString(index);
                            str2 = string12 == null ? "" : string12;
                        } else if (index == R.styleable.TdsBottomCtaV1_topCheckBoxType) {
                            int i8 = IAuthTabCallbackStub + 43;
                            onTransact = i8 % 128;
                            if (i8 % 2 == 0) {
                                entries = TdsCheckBoxV1View.onNavigationEvent.getEntries();
                                i = 0;
                            } else {
                                i = 0;
                                entries = TdsCheckBoxV1View.onNavigationEvent.getEntries();
                            }
                            onnavigationevent5 = (TdsCheckBoxV1View.onNavigationEvent) entries.get(typedArrayObtainStyledAttributes.getInt(index, i));
                        } else if (index == R.styleable.TdsBottomCtaV1_topCheckBoxLabel) {
                            string6 = typedArrayObtainStyledAttributes.getString(index);
                            if (string6 == null) {
                                string = str;
                                string6 = "";
                            }
                        } else if (index == R.styleable.TdsBottomCtaV1_topCheckBoxChecked) {
                            z5 = typedArrayObtainStyledAttributes.getBoolean(index, z5);
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomButtonTitle) {
                            string7 = typedArrayObtainStyledAttributes.getString(index);
                            if (string7 == null) {
                                int i9 = IAuthTabCallbackStub + 101;
                                onTransact = i9 % 128;
                                if (i9 % 2 == 0) {
                                    throw null;
                                }
                                string = str;
                                string7 = "";
                            }
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomButtonType) {
                            iAuthTabCallback5 = (TdsTextButtonV0View.IAuthTabCallback) TdsTextButtonV0View.IAuthTabCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomDescription) {
                            string8 = typedArrayObtainStyledAttributes.getString(index);
                            if (string8 == null) {
                                string = str;
                                string8 = "";
                            }
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomCheckBoxType) {
                            onnavigationevent4 = (TdsCheckBoxV1View.onNavigationEvent) TdsCheckBoxV1View.onNavigationEvent.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomCheckBoxLabel) {
                            string9 = typedArrayObtainStyledAttributes.getString(index);
                            if (string9 == null) {
                                string = str;
                                string9 = "";
                            }
                        } else if (index == R.styleable.TdsBottomCtaV1_bottomCheckBoxChecked) {
                            int i10 = onTransact + 117;
                            IAuthTabCallbackStub = i10 % 128;
                            int i11 = i10 % 2;
                            z4 = typedArrayObtainStyledAttributes.getBoolean(index, z4);
                        } else if (index == R.styleable.TdsBottomCtaV1_onTopButtonClick) {
                            int i12 = IAuthTabCallbackStub + 17;
                            onTransact = i12 % 128;
                            if (i12 % 2 == 0) {
                                typedArrayObtainStyledAttributes.getString(index);
                                throw null;
                            }
                            String string13 = typedArrayObtainStyledAttributes.getString(index);
                            if (string13 == null) {
                                string13 = "";
                            }
                            deprecated_cachecontrol3 = new deprecated_cacheControl(this, string13);
                        } else if (index == R.styleable.TdsBottomCtaV1_onBottomButtonClick) {
                            String string14 = typedArrayObtainStyledAttributes.getString(index);
                            if (string14 == null) {
                                string14 = "";
                            }
                            deprecated_cachecontrol4 = new deprecated_cacheControl(this, string14);
                        } else if (index == R.styleable.TdsBottomCtaV1_attachWithId) {
                            resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                        } else if (index == R.styleable.TdsBottomCtaV1_accessibilityEnabled) {
                            z3 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                        } else if (index == R.styleable.TdsBottomCtaV1_backgroundColor) {
                            color = typedArrayObtainStyledAttributes.getColor(index, 255);
                        }
                        string = str;
                    }
                    i3++;
                    str = string;
                }
                int i13 = IAuthTabCallbackStub + 79;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                string = str;
                i3++;
                str = string;
            }
            onWarmupCompleted(z3);
            if (string3.length() > 0) {
                deprecated_cacheControl deprecated_cachecontrol5 = deprecated_cachecontrol == null ? new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda13
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallback + 11;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        TdsBottomCtaV1View.onWarmupCompleted(view);
                        if (i17 == 0) {
                            int i18 = 36 / 0;
                        }
                        int i19 = onExtraCallback + 123;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                    }
                } : deprecated_cachecontrol;
                TdsButtonV1View.asInterface asinterface = new TdsButtonV1View.asInterface(iAuthTabCallbackStub2, iAuthTabCallbackDefault3, null, null, 12, null);
                onnavigationevent = onnavigationevent4;
                onnavigationevent2 = onnavigationevent5;
                z = z4;
                iAuthTabCallback2 = iAuthTabCallback5;
                z2 = z5;
                iAuthTabCallback = iAuthTabCallback4;
                setCta$default(this, (CharSequence) string3, (View.OnClickListener) deprecated_cachecontrol5, asinterface, false, 8, (Object) null);
            } else {
                onnavigationevent = onnavigationevent4;
                onnavigationevent2 = onnavigationevent5;
                z = z4;
                z2 = z5;
                iAuthTabCallback = iAuthTabCallback4;
                iAuthTabCallback2 = iAuthTabCallback5;
            }
            if (string4.length() > 0) {
                setSecondary$default(this, string4, deprecated_cachecontrol2 == null ? new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = 2 % 2;
                        int i16 = IAuthTabCallback + 23;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 != 0) {
                            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                            TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{view}, 1621274916, -1621274908, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                            return;
                        }
                        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{view}, 1621274916, -1621274908, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                } : deprecated_cachecontrol2, new TdsButtonV1View.asInterface(iAuthTabCallbackStub3, iAuthTabCallbackDefault4, null, null, 12, null), false, 8, null);
            }
            if (string5.length() > 0) {
                setInfo$default(this, string5, string2, false, 4, null);
            }
            if (str.length() > 0) {
                int i15 = onTransact + 27;
                IAuthTabCallbackStub = i15 % 128;
                int i16 = i15 % 2;
                if (deprecated_cachecontrol3 == null) {
                    deprecated_cachecontrol3 = new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda15
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i17 = 2 % 2;
                            int i18 = onExtraCallbackWithResult + 121;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            TdsBottomCtaV1View.IAuthTabCallback(view);
                            int i20 = onExtraCallbackWithResult + 29;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 != 0) {
                                throw null;
                            }
                        }
                    };
                }
                setTopButton(str, deprecated_cachecontrol3);
                setTopButtonType(iAuthTabCallback);
            } else if (str2.length() > 0) {
                int i17 = IAuthTabCallbackStub + 69;
                onTransact = i17 % 128;
                if (i17 % 2 == 0) {
                    setTopDescription(str2);
                    throw null;
                }
                setTopDescription(str2);
            } else if (string6.length() > 0) {
                setTopCheckBoxType(onnavigationevent2);
                setTopCheckBoxLabel(string6);
                setTopCheckBoxChecked(z2);
            }
            if (string7.length() > 0) {
                if (deprecated_cachecontrol4 == null) {
                    deprecated_cachecontrol4 = new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i18 = 2 % 2;
                            int i19 = IAuthTabCallback + 93;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            TdsBottomCtaV1View.onExtraCallbackWithResult(view);
                            if (i20 != 0) {
                                int i21 = 69 / 0;
                            }
                        }
                    };
                }
                setBottomButton(string7, deprecated_cachecontrol4);
                setBottomButtonType(iAuthTabCallback2);
            } else if (string8.length() > 0) {
                int i18 = onTransact + 57;
                IAuthTabCallbackStub = i18 % 128;
                if (i18 % 2 != 0) {
                    setBottomDescription(string8);
                    int i19 = 71 / 0;
                } else {
                    setBottomDescription(string8);
                }
            } else if (string9.length() > 0) {
                setBottomCheckBoxType(onnavigationevent);
                setBottomCheckBoxLabel(string9);
                setBottomCheckBoxChecked(z);
            }
            if (resourceId > 0) {
                onExtraCallbackWithResult(this, resourceId, false, 0, 6, null);
            }
            if (isInEditMode() && string3.length() == 0 && string4.length() == 0 && string5.length() == 0) {
                setCta$default(this, (CharSequence) "CTA", new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i20 = 2 % 2;
                        int i21 = onWarmupCompleted + 17;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        TdsBottomCtaV1View.asInterface(view);
                        if (i22 == 0) {
                            int i23 = 19 / 0;
                        }
                        int i24 = IAuthTabCallback + 91;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 != 0) {
                            int i25 = 30 / 0;
                        }
                    }
                }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                setSecondary$default(this, "Secondary", new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda18
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 39;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        TdsBottomCtaV1View.onNavigationEvent(view);
                        int i23 = IAuthTabCallback + 27;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                    }
                }, null, false, 12, null);
            }
            int i20 = color;
            if (i20 != 0) {
                setBottomCtaBackgroundColor(i20);
            }
        }
        onWarmupCompleted().setClickable(true);
        IAuthTabCallbackStubProxy().setClickable(true);
        IAuthTabCallbackStubProxy().setImportantForAccessibility(2);
        View viewOnRelationshipValidationResult = onRelationshipValidationResult();
        ViewGroup.LayoutParams layoutParams = onRelationshipValidationResult().getLayoutParams();
        layoutParams.height = -2;
        viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
        this.onExtraCallbackWithResult = true;
    }

    public final void setBottomCtaBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = true;
        IAuthTabCallbackStub().setBackground(Companion.onExtraCallback(i));
        onWarmupCompleted().setBackgroundColor(i);
        IAuthTabCallbackStubProxy().setBackgroundColor(i);
        int i5 = onTransact + 17;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setCurrentTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = runonuithreaddelayed;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, int i, IAuthTabCallback iAuthTabCallback, int i2, Object obj) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = 2000;
        }
        if ((i2 & 2) != 0) {
            iAuthTabCallback = IAuthTabCallback.SLIDE;
        }
        tdsBottomCtaV1View.onExtraCallbackWithResult(i, iAuthTabCallback);
        int i5 = IAuthTabCallbackStub + 3;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (f == 1000.0f) {
            int i4 = i2 + 31;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            View viewOnRelationshipValidationResult = tdsBottomCtaV1View.onRelationshipValidationResult();
            ViewGroup.LayoutParams layoutParams = tdsBottomCtaV1View.onRelationshipValidationResult().getLayoutParams();
            layoutParams.height = -2;
            viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r6 = im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.IAuthTabCallbackStub + 111;
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.onTransact = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r6.getId() != r1.IAuthTabCallbackStub().getId()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r6.getId() != r1.IAuthTabCallbackStub().getId()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 49 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onExtraCallbackWithResult(int i, @NotNull IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = onNavigationEvent.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i3 == 1) {
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{onRelationshipValidationResult(), isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(ICustomTabsCallbackStub()), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            arrayList2.add(AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, null, 24, null));
        } else if (i3 == 2) {
            arrayList2.add((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{RallysKt.onExtraCallback(Address.onNavigationEvent.onExtraCallbackWithResult(), 3), Float.valueOf(0.0f), Float.valueOf(1000.0f), new TdsBottomCtaV1View$.ExternalSyntheticLambda7(this), null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()));
            arrayList2.add(AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST));
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST));
            arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{onRelationshipValidationResult(), isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(ICustomTabsCallbackStub()), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
        }
        arrayList.add(RallysKt.onWarmupCompleted(onRelationshipValidationResult(), (List) arrayList2, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null));
        View viewOnRelationshipValidationResult = onRelationshipValidationResult();
        ViewGroup.LayoutParams layoutParams = onRelationshipValidationResult().getLayoutParams();
        layoutParams.height = 0;
        viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
        if (iAuthTabCallback == IAuthTabCallback.SCALE) {
            Iterator itIAuthTabCallback = clearRevision.onWarmupCompleted(IAuthTabCallbackStub((View) this), new TdsBottomCtaV1View$.ExternalSyntheticLambda8(this)).IAuthTabCallback();
            int i4 = IAuthTabCallbackStub + 43;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
            while (itIAuthTabCallback.hasNext()) {
                int i6 = IAuthTabCallbackStub + 63;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) itIAuthTabCallback.next(), AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, null, 4, null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
            }
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted(this, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, null, 0, null, null, Boolean.FALSE, i, 0L, false, 3320, null);
        this.onNavigationEvent = runonuithreaddelayedOnWarmupCompleted;
        if (runonuithreaddelayedOnWarmupCompleted != null) {
            int i8 = onTransact + 89;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.onExtraCallbackWithResult = z;
    }

    private final Sequence<View> IAuthTabCallbackStub(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = view instanceof ViewGroup;
            obj.hashCode();
            throw null;
        }
        if (!(view instanceof ViewGroup)) {
            return clearRevision.onNavigationEvent(view);
        }
        Sequence<View> sequenceOnExtraCallbackWithResult = clearRevision.onExtraCallbackWithResult(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback((ViewGroup) view), new Function1() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = {this.f$0, (View) obj2};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                Sequence sequence = (Sequence) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1778738886, 1778738893, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i6 = IAuthTabCallback + 87;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return sequence;
            }
        });
        int i3 = IAuthTabCallbackStub + 93;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return sequenceOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static final Sequence onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Sequence<View> sequenceIAuthTabCallbackStub = tdsBottomCtaV1View.IAuthTabCallbackStub(view);
        int i4 = onTransact + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return sequenceIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 33;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 11;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        tdsBottomCtaV1View.onExtraCallbackWithResult(z);
        int i7 = IAuthTabCallbackStub + 47;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(final boolean z) {
        int i = 2 % 2;
        post(new Runnable() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 125;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                TdsBottomCtaV1View tdsBottomCtaV1View = this.f$0;
                if (i4 == 0) {
                    Object[] objArr = {tdsBottomCtaV1View, Boolean.valueOf(z)};
                    int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 1683737835, -1683737832, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                    return;
                }
                Object[] objArr2 = {tdsBottomCtaV1View, Boolean.valueOf(z)};
                int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, objArr2, 1683737835, -1683737832, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            if (tdsBottomCtaV1View.isAttachedToWindow()) {
                tdsBottomCtaV1View.IAuthTabCallback(z);
                int i3 = onTransact + 79;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 28 / 0;
                    return;
                }
                return;
            }
            return;
        }
        tdsBottomCtaV1View.isAttachedToWindow();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        final TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        tdsBottomCtaV1View.onExtraCallbackWithResult = true;
        runOnUiThreadDelayed runonuithreaddelayed = tdsBottomCtaV1View.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        if (zBooleanValue) {
            int i2 = IAuthTabCallbackStub + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(1.0f), (Function1) null, 5, (Object) null), null, Float.valueOf(0.0f), null, 5, null);
            runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(tdsBottomCtaV1View, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBottomCtaV1View.onRelationshipValidationResult(), tdsBottomCtaV1View.getParent() instanceof LinearLayout ? isMuted.onExtraCallbackWithResult(interfaceDescriptor, (Float) null, Float.valueOf(tdsBottomCtaV1View.ICustomTabsCallbackStub()), (Function1) null, 5, (Object) null) : interfaceDescriptor, 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null), null, new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda23
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 3;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnNavigationEvent = TdsBottomCtaV1View.onNavigationEvent(this.f$0);
                    int i7 = IAuthTabCallback + 29;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnNavigationEvent;
                }
            }, 1, null), null, new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda24
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 7;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        Object[] objArr2 = {this.f$0};
                        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object[] objArr3 = {this.f$0};
                    int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    Unit unit = (Unit) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, objArr3, 2023811764, -2023811759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                    int i6 = onWarmupCompleted + 19;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 52 / 0;
                    }
                    return unit;
                }
            }, 1, null);
            tdsBottomCtaV1View.onNavigationEvent = runonuithreaddelayedOnWarmupCompleted;
            if (runonuithreaddelayedOnWarmupCompleted != null) {
                return (runOnUiThreadDelayed) isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, null);
            }
            int i4 = IAuthTabCallbackStub + 3;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        tdsBottomCtaV1View.onRelationshipValidationResult().setAlpha(1.0f);
        if (tdsBottomCtaV1View.onRelationshipValidationResult().getLayoutParams() != null) {
            View viewOnRelationshipValidationResult = tdsBottomCtaV1View.onRelationshipValidationResult();
            ViewGroup.LayoutParams layoutParams = viewOnRelationshipValidationResult.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i5 = IAuthTabCallbackStub + 63;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                layoutParams.height = tdsBottomCtaV1View.ICustomTabsCallbackStub();
                viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
                throw null;
            }
            layoutParams.height = tdsBottomCtaV1View.ICustomTabsCallbackStub();
            viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
        } else {
            View viewOnRelationshipValidationResult2 = tdsBottomCtaV1View.onRelationshipValidationResult();
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams2);
            layoutParams2.height = tdsBottomCtaV1View.ICustomTabsCallbackStub();
            viewOnRelationshipValidationResult2.setLayoutParams(layoutParams2);
        }
        tdsBottomCtaV1View.onRelationshipValidationResult().setTranslationY(0.0f);
        return Unit.INSTANCE;
    }

    private static final Unit access100(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (tdsBottomCtaV1View.onRelationshipValidationResult().getLayoutParams() != null) {
            View viewOnRelationshipValidationResult = tdsBottomCtaV1View.onRelationshipValidationResult();
            ViewGroup.LayoutParams layoutParams = viewOnRelationshipValidationResult.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i4 = onTransact + 3;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            layoutParams.height = tdsBottomCtaV1View.ICustomTabsCallbackStub();
            viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
            int i6 = onTransact + 15;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } else {
            View viewOnRelationshipValidationResult2 = tdsBottomCtaV1View.onRelationshipValidationResult();
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams2);
            layoutParams2.height = tdsBottomCtaV1View.ICustomTabsCallbackStub();
            viewOnRelationshipValidationResult2.setLayoutParams(layoutParams2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedObject(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (tdsBottomCtaV1View.onExtraCallbackWithResult) {
            onExtraCallback onextracallback = tdsBottomCtaV1View.onWarmupCompleted;
            int i5 = i2 + 71;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(final boolean z) {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult) {
            int i2 = onTransact + 101;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (z) {
                return;
            }
        }
        Function0 function0 = new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = {this.f$0, Boolean.valueOf(z)};
                    return TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -490805565, 490805569, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                }
                Object[] objArr2 = {this.f$0, Boolean.valueOf(z)};
                TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, -490805565, 490805569, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                throw null;
            }
        };
        if (onMinimized().isLaidOut() || (!z)) {
            function0.invoke();
            return;
        }
        if ((!isLaidOut()) || isLayoutRequested()) {
            addOnLayoutChangeListener(new IAuthTabCallbackStubProxy(function0));
            return;
        }
        int i4 = IAuthTabCallbackStub + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        function0.invoke();
    }

    public static /* synthetic */ void onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 81;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Object[] objArr = {tdsBottomCtaV1View, Boolean.valueOf(z), function0};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 1176392495, -1176392489, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[PHI: r3 r5
      0x004f: PHI (r3v17 java.lang.Integer) = (r3v6 int), (r3v7 java.lang.Integer), (r3v19 int) binds: [B:8:0x0045, B:10:0x004d, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r5v5 java.lang.Float) = (r5v0 java.lang.Float), (r5v1 java.lang.Float), (r5v7 java.lang.Float) binds: [B:8:0x0045, B:10:0x004d, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r3 r5
      0x0047: PHI (r3v7 java.lang.Integer) = (r3v6 int), (r3v19 int) binds: [B:8:0x0045, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r5v1 java.lang.Float) = (r5v0 java.lang.Float), (r5v7 java.lang.Float) binds: [B:8:0x0045, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i;
        Float fValueOf;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult;
        final TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final Function0 function0 = (Function0) objArr[2];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 55;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            i = 42;
            fValueOf = Float.valueOf(2.0f);
            if (tdsBottomCtaV1View.onExtraCallbackWithResult) {
                if (tdsBottomCtaV1View.getVisibility() == 8) {
                    if (zBooleanValue) {
                        return null;
                    }
                }
            }
        } else {
            i = 50;
            fValueOf = Float.valueOf(0.0f);
            if (tdsBottomCtaV1View.onExtraCallbackWithResult) {
            }
        }
        tdsBottomCtaV1View.onExtraCallbackWithResult = false;
        runOnUiThreadDelayed runonuithreaddelayed = tdsBottomCtaV1View.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        if (!zBooleanValue) {
            tdsBottomCtaV1View.onRelationshipValidationResult().setAlpha(0.0f);
            tdsBottomCtaV1View.onRelationshipValidationResult().setTranslationY(setTagsokhttp.onExtraCallbackWithResult(tdsBottomCtaV1View, i));
            View viewOnRelationshipValidationResult = tdsBottomCtaV1View.onRelationshipValidationResult();
            ViewGroup.LayoutParams layoutParams = viewOnRelationshipValidationResult.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = 0;
            viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
            if (function0 != null) {
                int i4 = IAuthTabCallbackStub + 125;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                function0.invoke();
            }
            return null;
        }
        int i6 = IAuthTabCallbackStub + 73;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(isMuted.onNavigationEvent((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, fValueOf, (Function1) null, 5, (Object) null), null, Float.valueOf(setTagsokhttp.onExtraCallbackWithResult(tdsBottomCtaV1View, i)), null, 5, null);
        if (!(tdsBottomCtaV1View.getParent() instanceof LinearLayout)) {
            appLovinSdkSettingsOnExtraCallbackWithResult = interfaceDescriptor;
        } else {
            int i8 = onTransact + 101;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            appLovinSdkSettingsOnExtraCallbackWithResult = isMuted.onExtraCallbackWithResult(interfaceDescriptor, (Float) null, fValueOf, (Function1) null, 5, (Object) null);
        }
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted(tdsBottomCtaV1View, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsBottomCtaV1View.onRelationshipValidationResult(), appLovinSdkSettingsOnExtraCallbackWithResult, 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 3832, null), null, new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i10 = 2 % 2;
                int i11 = onExtraCallback + 47;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnNavigationEvent = TdsBottomCtaV1View.onNavigationEvent(this.f$0, function0);
                int i13 = IAuthTabCallback + 75;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, null);
        tdsBottomCtaV1View.onNavigationEvent = runonuithreaddelayedOnWarmupCompleted;
        if (runonuithreaddelayedOnWarmupCompleted == null) {
            return null;
        }
        return null;
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = z;
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            int i3 = 55 / 0;
            return;
        }
        this.onExtraCallback = z;
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ void setCta$default(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onTransact + 1;
            IAuthTabCallbackStub = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            asinterface = null;
        }
        if ((i & 8) != 0) {
            int i4 = onTransact + 101;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        tdsBottomCtaV1View.setCta(charSequence, onClickListener, asinterface, z);
    }

    public final void setCta(@NotNull CharSequence charSequence, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        onNavigationEvent((initSDK) asInterface());
        asInterface().setText(charSequence);
        asInterface().setOnClickListener(onClickListener);
        if (asinterface != null) {
            int i4 = onTransact + 39;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            asinterface.onNavigationEvent(asInterface());
            int i6 = IAuthTabCallbackStub + 125;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        asInterface().setVisibility(0);
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        onExtraCallbackWithResult(z);
    }

    public static /* synthetic */ void setCta$default(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, Function1 function1, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            asinterface = null;
        }
        if ((i & 8) != 0) {
            int i6 = i3 + 9;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        tdsBottomCtaV1View.setCta(charSequence, (Function1<? super View, Unit>) function1, asinterface, z);
    }

    private static final void access100(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = IAuthTabCallbackStub + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setCta(@NotNull CharSequence charSequence, @NotNull final Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        setCta(charSequence, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda27
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                TdsBottomCtaV1View.IAuthTabCallback(function1, view);
                int i5 = IAuthTabCallback + 13;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        }, asinterface, z);
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void setCta$default(TdsBottomCtaV1View tdsBottomCtaV1View, int i, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub;
        int i5 = i4 + 109;
        onTransact = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
            asinterface = null;
        }
        if ((i2 & 8) != 0) {
            int i6 = i4 + 109;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        tdsBottomCtaV1View.setCta(i, onClickListener, asinterface, z);
    }

    public final void setCta(int i, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            String string = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setCta(string, onClickListener, asinterface, z);
            return;
        }
        Intrinsics.checkNotNullParameter(onClickListener, "");
        String string2 = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        setCta(string2, onClickListener, asinterface, z);
        int i4 = 22 / 0;
    }

    public static /* synthetic */ void setCta$default(TdsBottomCtaV1View tdsBottomCtaV1View, int i, Function1 function1, TdsButtonV1View.asInterface asinterface, boolean z, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            asinterface = null;
        }
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallbackStub + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        tdsBottomCtaV1View.setCta(i, (Function1<? super View, Unit>) function1, asinterface, z);
        int i6 = IAuthTabCallbackStub + 61;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
    }

    private static final void access000(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = onTransact + 59;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void setCta(int i, @NotNull final Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setCta(i, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda21
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                TdsBottomCtaV1View.IAuthTabCallbackDefault(function1, view);
                int i6 = onWarmupCompleted + 69;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, asinterface, z);
        int i3 = onTransact + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
    }

    private static final void asBinder(TdsBottomCtaV1View tdsBottomCtaV1View) {
        registerCrashCallback registercrashcallbackAsInterface;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            tdsBottomCtaV1View.asInterface().setText("");
            tdsBottomCtaV1View.asInterface().setOnClickListener(null);
            registercrashcallbackAsInterface = tdsBottomCtaV1View.asInterface();
            i = 24;
        } else {
            tdsBottomCtaV1View.asInterface().setText("");
            tdsBottomCtaV1View.asInterface().setOnClickListener(null);
            registercrashcallbackAsInterface = tdsBottomCtaV1View.asInterface();
            i = 8;
        }
        registercrashcallbackAsInterface.setVisibility(i);
    }

    private static final Unit IAuthTabCallbackDefault(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asBinder(tdsBottomCtaV1View);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!tdsBottomCtaV1View.IAuthTabCallbackDefault((View) tdsBottomCtaV1View.asInterface())) {
                asBinder(tdsBottomCtaV1View);
                return null;
            }
            Object[] objArr2 = {tdsBottomCtaV1View, true, new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr3 = {this.f$0};
                    int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    Unit unit = (Unit) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr3, -1062539217, 1062539233, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                    int i6 = IAuthTabCallback + 123;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 61 / 0;
                    }
                    return unit;
                }
            }};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr2, 1176392495, -1176392489, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            int i3 = IAuthTabCallbackStub + 3;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        tdsBottomCtaV1View.IAuthTabCallbackDefault((View) tdsBottomCtaV1View.asInterface());
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void setSecondary$default(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, boolean z, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 19;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
            asinterface = null;
        }
        if ((i & 8) != 0) {
            int i8 = onTransact + 25;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        tdsBottomCtaV1View.setSecondary(charSequence, onClickListener, asinterface, z);
        int i10 = onTransact + 97;
        IAuthTabCallbackStub = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void setSecondary(@NotNull CharSequence charSequence, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface, boolean z) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(onClickListener, "");
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onNavigationEvent((initSDK) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()));
            int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setText(charSequence);
            int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setOnClickListener(onClickListener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        int iIAuthTabCallback7 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback8 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent((initSDK) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback8, iIAuthTabCallback7, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()));
        int iIAuthTabCallback9 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback10 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback10, iIAuthTabCallback9, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setText(charSequence);
        int iIAuthTabCallback11 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback12 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback12, iIAuthTabCallback11, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setOnClickListener(onClickListener);
        if (asinterface != null) {
            int iIAuthTabCallback13 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback14 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            asinterface.onNavigationEvent((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback14, iIAuthTabCallback13, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()));
            int i3 = IAuthTabCallbackStub + 71;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        int iIAuthTabCallback15 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback16 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback16, iIAuthTabCallback15, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setVisibility(0);
        int iIAuthTabCallback17 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback18 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback18, iIAuthTabCallback17, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        onExtraCallbackWithResult(z);
    }

    public static /* synthetic */ void setSecondary$default(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, Function1 function1, TdsButtonV1View.asInterface asinterface, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onTransact;
            int i4 = i3 + 79;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 69;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            asinterface = null;
        }
        tdsBottomCtaV1View.setSecondary(charSequence, (Function1<? super View, Unit>) function1, asinterface);
    }

    private static final void getInterfaceDescriptor(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = IAuthTabCallbackStub + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSecondary(@NotNull CharSequence charSequence, @NotNull final Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        setSecondary$default(this, charSequence, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                TdsBottomCtaV1View.onExtraCallbackWithResult(function1, view);
                int i5 = onExtraCallback + 117;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 43 / 0;
                }
            }
        }, asinterface, false, 8, null);
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void setSecondary$default(TdsBottomCtaV1View tdsBottomCtaV1View, int i, View.OnClickListener onClickListener, TdsButtonV1View.asInterface asinterface, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
            asinterface = null;
        }
        tdsBottomCtaV1View.setSecondary(i, onClickListener, asinterface);
        int i5 = onTransact + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setSecondary(int i, @NotNull View.OnClickListener onClickListener, @Nullable TdsButtonV1View.asInterface asinterface) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        String string = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setSecondary$default(this, string, onClickListener, asinterface, false, 8, null);
        int i5 = onTransact + 3;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setSecondary$default(TdsBottomCtaV1View tdsBottomCtaV1View, int i, Function1 function1, TdsButtonV1View.asInterface asinterface, int i2, Object obj) throws Resources.NotFoundException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub;
        int i5 = i4 + 125;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 31;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i8 = i4 + 93;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 4;
            }
            asinterface = null;
        }
        tdsBottomCtaV1View.setSecondary(i, (Function1<? super View, Unit>) function1, asinterface);
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = onTransact + 7;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setSecondary(int i, @NotNull final Function1<? super View, Unit> function1, @Nullable TdsButtonV1View.asInterface asinterface) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setSecondary(i, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                TdsBottomCtaV1View.onNavigationEvent(function1, view);
                int i6 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 0;
                }
            }
        }, asinterface);
        int i3 = IAuthTabCallbackStub + 13;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void access000(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setText("");
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object obj = null;
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setOnClickListener(null);
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).setVisibility(8);
        int i4 = IAuthTabCallbackStub + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        access000(tdsBottomCtaV1View);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (IAuthTabCallbackDefault((View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()))) {
                Object[] objArr = {this, true, new Function0() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 69;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnWarmupCompleted = TdsBottomCtaV1View.onWarmupCompleted(this.f$0);
                        int i6 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 91 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }};
                int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, objArr, 1176392495, -1176392489, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i3 = onTransact + 3;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            access000(this);
            return;
        }
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallbackDefault((View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback5, iIAuthTabCallback4, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()));
        throw null;
    }

    public static /* synthetic */ void setInfo$default(TdsBottomCtaV1View tdsBottomCtaV1View, CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 43;
        onTransact = i3 % 128;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
            z = false;
        }
        tdsBottomCtaV1View.setInfo(charSequence, charSequence2, z);
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setInfo(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        AppCompatTextView appCompatTextView = (BaseTextView) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, 1988589279, -1988589268, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        if (appCompatTextView != null) {
            int i4 = onTransact + 89;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            appCompatTextView.setText(charSequence);
            int i6 = onTransact + 69;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        AppCompatTextView appCompatTextViewAsBinder = asBinder();
        if (appCompatTextViewAsBinder != null) {
            int i8 = onTransact + 11;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 != 0) {
                appCompatTextViewAsBinder.setText(charSequence2);
                throw null;
            }
            appCompatTextViewAsBinder.setText(charSequence2);
        }
        onPostMessage().setVisibility(0);
        onWarmupCompleted().setPadding(setTagsokhttp.onExtraCallbackWithResult(this, 20), 0, setTagsokhttp.onExtraCallbackWithResult(this, 20), 0);
        TdsButtonV1View tdsButtonV1ViewAsInterface = asInterface();
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.LARGE;
        TdsButtonV1View.setTheme$default(tdsButtonV1ViewAsInterface, null, null, onwarmupcompleted, null, 11, null);
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        TdsButtonV1View.setTheme$default((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), null, null, onwarmupcompleted, null, 11, null);
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        onExtraCallbackWithResult(z);
        int i9 = IAuthTabCallbackStub + 99;
        onTransact = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public final void setInfo(int i, int i2) throws Resources.NotFoundException {
        String string;
        String string2;
        int i3 = 2 % 2;
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            string = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            string2 = getResources().getString(i2);
        } else {
            string = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            string2 = getResources().getString(i2);
        }
        Intrinsics.checkNotNullExpressionValue(string2, "");
        setInfo$default(this, string, string2, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTopButton(@Nullable CharSequence charSequence, @NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        if (access100() == null) {
            int i2 = IAuthTabCallbackStub + 7;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                writeTypedObject();
                int i3 = 5 / 0;
            } else {
                writeTypedObject();
            }
        }
        if (charSequence != null) {
            int i4 = IAuthTabCallbackStub + 13;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (charSequence.length() != 0) {
                AppCompatTextView appCompatTextViewAccess100 = access100();
                if (appCompatTextViewAccess100 != null) {
                    appCompatTextViewAccess100.setText(charSequence);
                    int i6 = IAuthTabCallbackStub + 3;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                }
                AppCompatTextView appCompatTextViewAccess1002 = access100();
                if (appCompatTextViewAccess1002 != null) {
                    appCompatTextViewAccess1002.setOnClickListener(onClickListener);
                }
                AppCompatTextView appCompatTextViewAccess1003 = access100();
                if (appCompatTextViewAccess1003 != null) {
                    int i8 = IAuthTabCallbackStub + 87;
                    onTransact = i8 % 128;
                    if (i8 % 2 == 0) {
                        appCompatTextViewAccess1003.setVisibility(1);
                    } else {
                        appCompatTextViewAccess1003.setVisibility(0);
                    }
                }
            } else {
                AppCompatTextView appCompatTextViewAccess1004 = access100();
                if (appCompatTextViewAccess1004 != null) {
                    appCompatTextViewAccess1004.setVisibility(8);
                }
            }
        }
        onExtraCallbackWithResult(false);
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = onTransact + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTopButton(@Nullable CharSequence charSequence, @NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setTopButton(charSequence, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                TdsBottomCtaV1View.onExtraCallback(function1, view);
                if (i4 != 0) {
                    int i5 = 75 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setTopButton(int i, @NotNull View.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        setTopButton(getResources().getString(i), onClickListener);
        int i5 = onTransact + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void extraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
    }

    public final void setTopButton(int i, @NotNull Function1<? super View, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setTopButton(i, (View.OnClickListener) new TdsBottomCtaV1View$.ExternalSyntheticLambda25(function1));
        int i3 = IAuthTabCallbackStub + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setTopButtonType(@NotNull TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (access100() == null) {
            int i2 = onTransact + 39;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                writeTypedObject();
                int i3 = 99 / 0;
            } else {
                writeTypedObject();
            }
        }
        TdsTextButtonV0View tdsTextButtonV0ViewAccess100 = access100();
        if (tdsTextButtonV0ViewAccess100 != null) {
            tdsTextButtonV0ViewAccess100.setType(iAuthTabCallback);
            int i4 = onTransact + 21;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setTopButtonArrow(boolean z) {
        int i = 2 % 2;
        if (access100() == null) {
            writeTypedObject();
            int i2 = IAuthTabCallbackStub + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        TdsTextButtonV0View tdsTextButtonV0ViewAccess100 = access100();
        if (tdsTextButtonV0ViewAccess100 != null) {
            int i4 = IAuthTabCallbackStub + 5;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            tdsTextButtonV0ViewAccess100.setArrow(z);
            if (i5 == 0) {
                int i6 = 0 / 0;
            }
        }
        int i7 = onTransact + 71;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 62 / 0;
        }
    }

    public final void setTopDescription(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (extraCallbackWithResult() == null) {
            onMessageChannelReady();
            int i2 = onTransact + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        AppCompatTextView appCompatTextViewExtraCallbackWithResult = extraCallbackWithResult();
        if (appCompatTextViewExtraCallbackWithResult != null) {
            int i4 = onTransact + 79;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                appCompatTextViewExtraCallbackWithResult.setText(charSequence);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            appCompatTextViewExtraCallbackWithResult.setText(charSequence);
        }
        AppCompatTextView appCompatTextViewExtraCallbackWithResult2 = extraCallbackWithResult();
        if (appCompatTextViewExtraCallbackWithResult2 != null) {
            int i5 = IAuthTabCallbackStub + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            appCompatTextViewExtraCallbackWithResult2.setVisibility(0);
        }
    }

    public final void setTopDescription(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setTopDescription(string);
        } else {
            String string2 = getResources().getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setTopDescription(string2);
            int i4 = 33 / 0;
        }
    }

    public final void setTopCheckBoxType(@NotNull TdsCheckBoxV1View.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Object obj = null;
        if (access000() == null) {
            int i2 = IAuthTabCallbackStub + 1;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                onActivityResized();
                throw null;
            }
            onActivityResized();
            int i3 = IAuthTabCallbackStub + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        TdsCheckBoxV1View tdsCheckBoxV1ViewAccess000 = access000();
        if (tdsCheckBoxV1ViewAccess000 != null) {
            int i5 = onTransact + 29;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            tdsCheckBoxV1ViewAccess000.setType(onnavigationevent);
            if (i6 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTopCheckBoxLabel(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        if (access000() == null) {
            int i2 = onTransact + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onActivityResized();
            int i4 = IAuthTabCallbackStub + 17;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        TdsCheckBoxV1View tdsCheckBoxV1ViewAccess000 = access000();
        if (tdsCheckBoxV1ViewAccess000 != null) {
            int i6 = onTransact + 9;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                tdsCheckBoxV1ViewAccess000.setLabel(charSequence);
                int i7 = 13 / 0;
            } else {
                tdsCheckBoxV1ViewAccess000.setLabel(charSequence);
            }
        }
        if (charSequence != null) {
            int i8 = onTransact + 83;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            if (charSequence.length() != 0) {
                ConstraintLayout constraintLayoutAccess000 = access000();
                if (constraintLayoutAccess000 != null) {
                    constraintLayoutAccess000.setVisibility(0);
                }
            } else {
                ConstraintLayout constraintLayoutAccess0002 = access000();
                if (constraintLayoutAccess0002 != null) {
                    constraintLayoutAccess0002.setVisibility(8);
                }
            }
        }
        onExtraCallbackWithResult(false);
    }

    public final void setTopCheckBoxLabel(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        setTopCheckBoxLabel(getResources().getString(i));
        int i5 = IAuthTabCallbackStub + 111;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTopCheckBoxChecked(boolean z) {
        int i = 2 % 2;
        TdsCheckBoxV1View tdsCheckBoxV1ViewAccess000 = access000();
        if (tdsCheckBoxV1ViewAccess000 != null) {
            int i2 = onTransact + 33;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            tdsCheckBoxV1ViewAccess000.setChecked(z);
        }
        int i4 = IAuthTabCallbackStub + 99;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v5 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View) = 
      (r1v4 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View)
      (r1v7 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View)
     binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setOnTopCheckBoxCheckedChangeListener(@NotNull Function2<? super TdsCheckBoxV1View, ? super Boolean, Unit> function2) {
        TdsCheckBoxV1View tdsCheckBoxV1ViewAccess000;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            tdsCheckBoxV1ViewAccess000 = access000();
            int i3 = 98 / 0;
            if (tdsCheckBoxV1ViewAccess000 != null) {
                tdsCheckBoxV1ViewAccess000.setOnCheckedChangeListener(function2);
            }
        } else {
            Intrinsics.checkNotNullParameter(function2, "");
            tdsCheckBoxV1ViewAccess000 = access000();
            if (tdsCheckBoxV1ViewAccess000 != null) {
            }
        }
        int i4 = onTransact + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnTopCheckBoxCheckedChangeListener(@Nullable TdsCheckBoxV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        TdsCheckBoxV1View tdsCheckBoxV1ViewAccess000 = access000();
        if (tdsCheckBoxV1ViewAccess000 != null) {
            int i2 = IAuthTabCallbackStub + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            tdsCheckBoxV1ViewAccess000.setOnCheckedChangeListener(onextracallbackwithresult);
            int i4 = onTransact + 35;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setBottomButton(@Nullable CharSequence charSequence, @NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        if (onExtraCallbackWithResult() == null) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -1951974745, 1951974759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        if (charSequence == null || charSequence.length() == 0) {
            AppCompatTextView appCompatTextViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (appCompatTextViewOnExtraCallbackWithResult != null) {
                int i2 = IAuthTabCallbackStub + 43;
                onTransact = i2 % 128;
                appCompatTextViewOnExtraCallbackWithResult.setVisibility(i2 % 2 == 0 ? 113 : 8);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextViewOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
        if (appCompatTextViewOnExtraCallbackWithResult2 != null) {
            int i3 = IAuthTabCallbackStub + 27;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            appCompatTextViewOnExtraCallbackWithResult2.setText(charSequence);
            int i5 = onTransact + 101;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        AppCompatTextView appCompatTextViewOnExtraCallbackWithResult3 = onExtraCallbackWithResult();
        if (appCompatTextViewOnExtraCallbackWithResult3 != null) {
            appCompatTextViewOnExtraCallbackWithResult3.setOnClickListener(onClickListener);
        }
        AppCompatTextView appCompatTextViewOnExtraCallbackWithResult4 = onExtraCallbackWithResult();
        if (appCompatTextViewOnExtraCallbackWithResult4 != null) {
            appCompatTextViewOnExtraCallbackWithResult4.setVisibility(0);
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = IAuthTabCallbackStub + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public final void setBottomButton(@Nullable CharSequence charSequence, @NotNull final Function1<? super View, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setBottomButton(charSequence, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                TdsBottomCtaV1View.onWarmupCompleted(function1, view);
                int i5 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 7 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setBottomButton(int i, @NotNull View.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        int i3 = onTransact + 71;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            setBottomButton(getResources().getString(i), onClickListener);
        } else {
            Intrinsics.checkNotNullParameter(onClickListener, "");
            setBottomButton(getResources().getString(i), onClickListener);
            int i4 = 98 / 0;
        }
    }

    private static final void asInterface(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void setBottomButton(int i, @NotNull final Function1<? super View, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setBottomButton(i, new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda22
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 51;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                TdsBottomCtaV1View.IAuthTabCallbackStub(function1, view);
                int i6 = onExtraCallback + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = IAuthTabCallbackStub + 117;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setBottomButtonType(@NotNull TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (onExtraCallbackWithResult() == null) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1951974745, 1951974759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            int i4 = IAuthTabCallbackStub + 89;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        TdsTextButtonV0View tdsTextButtonV0ViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tdsTextButtonV0ViewOnExtraCallbackWithResult != null) {
            tdsTextButtonV0ViewOnExtraCallbackWithResult.setType(iAuthTabCallback);
        }
        int i6 = IAuthTabCallbackStub + 111;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 26 / 0;
        }
    }

    public final void setBottomButtonArrow(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult() == null) {
            int i4 = IAuthTabCallbackStub + 57;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1951974745, 1951974759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                int i5 = 66 / 0;
            } else {
                int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{this}, -1951974745, 1951974759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            }
        }
        TdsTextButtonV0View tdsTextButtonV0ViewOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (tdsTextButtonV0ViewOnExtraCallbackWithResult != null) {
            int i6 = onTransact + 109;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            tdsTextButtonV0ViewOnExtraCallbackWithResult.setArrow(z);
        }
    }

    public final void setBottomDescription(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Object obj = null;
        if (IAuthTabCallbackDefault() == null) {
            int i4 = IAuthTabCallbackStub + 21;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                ICustomTabsCallback();
                obj.hashCode();
                throw null;
            }
            ICustomTabsCallback();
        }
        AppCompatTextView appCompatTextViewIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (appCompatTextViewIAuthTabCallbackDefault != null) {
            appCompatTextViewIAuthTabCallbackDefault.setText(charSequence);
        }
        AppCompatTextView appCompatTextViewIAuthTabCallbackDefault2 = IAuthTabCallbackDefault();
        if (appCompatTextViewIAuthTabCallbackDefault2 != null) {
            int i5 = onTransact + 15;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            appCompatTextViewIAuthTabCallbackDefault2.setVisibility(0);
        }
        int i7 = IAuthTabCallbackStub + 35;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void setBottomDescription(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String string = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setBottomDescription(string);
        int i5 = onTransact + 69;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    public final void setBottomCheckBoxType(@NotNull TdsCheckBoxV1View.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (IAuthTabCallbackDefault() == null) {
            extraCallback();
        }
        TdsCheckBoxV1View tdsCheckBoxV1ViewIAuthTabCallback = IAuthTabCallback();
        if (tdsCheckBoxV1ViewIAuthTabCallback != null) {
            tdsCheckBoxV1ViewIAuthTabCallback.setType(onnavigationevent);
            int i4 = IAuthTabCallbackStub + 123;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setBottomCheckBoxLabel(@Nullable CharSequence charSequence) {
        ConstraintLayout constraintLayoutIAuthTabCallback;
        int i = 2 % 2;
        if (IAuthTabCallback() == null) {
            int i2 = IAuthTabCallbackStub + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            extraCallback();
        }
        TdsCheckBoxV1View tdsCheckBoxV1ViewIAuthTabCallback = IAuthTabCallback();
        if (tdsCheckBoxV1ViewIAuthTabCallback != null) {
            tdsCheckBoxV1ViewIAuthTabCallback.setLabel(charSequence);
            int i4 = IAuthTabCallbackStub + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (charSequence != null) {
            int i6 = IAuthTabCallbackStub + 63;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (charSequence.length() != 0) {
                int i8 = onTransact + 61;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    constraintLayoutIAuthTabCallback = IAuthTabCallback();
                    int i9 = 68 / 0;
                    if (constraintLayoutIAuthTabCallback == null) {
                        return;
                    }
                } else {
                    constraintLayoutIAuthTabCallback = IAuthTabCallback();
                    if (constraintLayoutIAuthTabCallback == null) {
                        return;
                    }
                }
                constraintLayoutIAuthTabCallback.setVisibility(0);
                return;
            }
        }
        ConstraintLayout constraintLayoutIAuthTabCallback2 = IAuthTabCallback();
        if (constraintLayoutIAuthTabCallback2 != null) {
            int i10 = onTransact + 73;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 != 0) {
                constraintLayoutIAuthTabCallback2.setVisibility(124);
            } else {
                constraintLayoutIAuthTabCallback2.setVisibility(8);
            }
        }
    }

    public final void setBottomCheckBoxLabel(int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String string = getResources().getString(i);
        if (i4 != 0) {
            setBottomCheckBoxLabel(string);
        } else {
            setBottomCheckBoxLabel(string);
            int i5 = 85 / 0;
        }
    }

    public final void setBottomCheckBoxChecked(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsCheckBoxV1View tdsCheckBoxV1ViewIAuthTabCallback = IAuthTabCallback();
        if (tdsCheckBoxV1ViewIAuthTabCallback != null) {
            tdsCheckBoxV1ViewIAuthTabCallback.setChecked(z);
        }
        int i3 = onTransact + 3;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setOnBottomCheckBoxCheckedChangeListener(@NotNull Function2<? super TdsCheckBoxV1View, ? super Boolean, Unit> function2) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        TdsCheckBoxV1View tdsCheckBoxV1ViewIAuthTabCallback = IAuthTabCallback();
        if (tdsCheckBoxV1ViewIAuthTabCallback != null) {
            int i4 = IAuthTabCallbackStub + 61;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            tdsCheckBoxV1ViewIAuthTabCallback.setOnCheckedChangeListener(function2);
        }
    }

    public final void setOnBottomCheckBoxCheckedChangeListener(@Nullable TdsCheckBoxV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        TdsCheckBoxV1View tdsCheckBoxV1ViewIAuthTabCallback = IAuthTabCallback();
        if (tdsCheckBoxV1ViewIAuthTabCallback != null) {
            int i2 = onTransact + 91;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            tdsCheckBoxV1ViewIAuthTabCallback.setOnCheckedChangeListener(onextracallbackwithresult);
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
        }
        int i5 = IAuthTabCallbackStub + 81;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setOnAnimateVisibilityChangeListener(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onWarmupCompleted = onextracallback;
        int i4 = IAuthTabCallbackStub + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (extraCallbackWithResult() != null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatTextView typography6 = new Typography6(context, null, im.toss.tds.R.style.TdsFont_Medium);
        typography6.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_description);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.gravity = 1;
        typography6.setLayoutParams(layoutParams);
        typography6.setGravity(17);
        typography6.setTextColor(RequestBodyCompanion.onNavigationEvent(typography6, authParams.TextTertiary));
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(typography6, setTagsokhttp.onExtraCallbackWithResult(typography6, 16));
        Object[] objArr = {typography6, Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(typography6, 8))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(typography6, setTagsokhttp.onExtraCallbackWithResult(typography6, 8));
        onWarmupCompleted().addView((View) typography6, 0);
        int i4 = onTransact + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void writeTypedObject() {
        int i;
        int i2 = 2 % 2;
        if (access100() != null) {
            return;
        }
        if (extraCallbackWithResult() == null) {
            int i3 = IAuthTabCallbackStub;
            int i4 = i3 + 13;
            onTransact = i4 % 128;
            i = i4 % 2 == 0 ? 1 : 0;
            int i5 = i3 + 19;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onTransact + 13;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i = 1;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        initSDK tdsTextButtonV0View = new TdsTextButtonV0View(context, null, 0, 6, null);
        tdsTextButtonV0View.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_button);
        VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(tdsTextButtonV0View, im.toss.tds.R.style.TdsFont_SemiBold);
        tdsTextButtonV0View.setType(TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
        tdsTextButtonV0View.setGravity(17);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.gravity = 1;
        tdsTextButtonV0View.setLayoutParams(layoutParams);
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsTextButtonV0View, setTagsokhttp.onExtraCallbackWithResult(tdsTextButtonV0View, 20));
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsTextButtonV0View, Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(tdsTextButtonV0View, 10))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsTextButtonV0View, setTagsokhttp.onExtraCallbackWithResult(tdsTextButtonV0View, 10));
        onNavigationEvent(tdsTextButtonV0View);
        onWarmupCompleted().addView((View) tdsTextButtonV0View, i);
        int i9 = onTransact + 125;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onActivityResized() {
        int i = 2 % 2;
        if (access000() != null) {
            return;
        }
        int i2 = 0;
        List listListOf = CollectionsKt.listOf(new BaseTextView[]{extraCallbackWithResult(), access100()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                int i3 = onTransact + 125;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                if (((BaseTextView) it.next()) != null && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                    int i5 = IAuthTabCallbackStub + 59;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ConstraintLayout tdsCheckBoxV1View = new TdsCheckBoxV1View(context, null, 0, 6, null);
        tdsCheckBoxV1View.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_check_box);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        tdsCheckBoxV1View.setLayoutParams(layoutParams);
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(tdsCheckBoxV1View, setTagsokhttp.onExtraCallbackWithResult(tdsCheckBoxV1View, 20));
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsCheckBoxV1View, Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(tdsCheckBoxV1View, 8))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsCheckBoxV1View, setTagsokhttp.onExtraCallbackWithResult(tdsCheckBoxV1View, 8));
        onWarmupCompleted().addView((View) tdsCheckBoxV1View, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 77;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            i = 16;
            if (IAuthTabCallbackDefault() != null) {
                return;
            }
        } else {
            i = 8;
            if (IAuthTabCallbackDefault() != null) {
                return;
            }
        }
        int i4 = 0;
        List listListOf = CollectionsKt.listOf(new View[]{onExtraCallbackWithResult(), IAuthTabCallback()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((View) it.next()) != null) {
                    int i5 = IAuthTabCallbackStub + 57;
                    onTransact = i5 % 128;
                    if (i5 % 2 == 0) {
                        i4++;
                        if (i4 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    } else {
                        i4++;
                        if (i4 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatTextView typography6 = new Typography6(context, null, im.toss.tds.R.style.TdsFont_Medium);
        typography6.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_description);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.gravity = 1;
        typography6.setLayoutParams(layoutParams);
        typography6.setGravity(17);
        typography6.setTextColor(RequestBodyCompanion.onNavigationEvent(typography6, authParams.TextTertiary));
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(typography6, setTagsokhttp.onExtraCallbackWithResult(typography6, 16));
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{typography6, Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult(typography6, i))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(typography6, setTagsokhttp.onExtraCallbackWithResult(typography6, i));
        onWarmupCompleted().addView((View) typography6, onWarmupCompleted().getChildCount() - i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View, java.lang.Object] */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        int i = 0;
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        if (tdsBottomCtaV1View.onExtraCallbackWithResult() != null) {
            int i3 = IAuthTabCallbackStub + 67;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        if (tdsBottomCtaV1View.IAuthTabCallback() == null) {
            int i4 = IAuthTabCallbackStub + 81;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i = 1;
        }
        Context context = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? tdsTextButtonV0View = new TdsTextButtonV0View(context, null, 0, 6, null);
        tdsTextButtonV0View.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_button);
        VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback((TextView) tdsTextButtonV0View, im.toss.tds.R.style.TdsFont_SemiBold);
        tdsTextButtonV0View.setType(TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
        tdsTextButtonV0View.setGravity(17);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.gravity = 1;
        tdsTextButtonV0View.setLayoutParams(layoutParams);
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback((View) tdsTextButtonV0View, setTagsokhttp.onExtraCallbackWithResult((View) tdsTextButtonV0View, 20));
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{tdsTextButtonV0View, Integer.valueOf(setTagsokhttp.onExtraCallbackWithResult((View) tdsTextButtonV0View, 10))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult((View) tdsTextButtonV0View, setTagsokhttp.onExtraCallbackWithResult((View) tdsTextButtonV0View, 10));
        tdsTextButtonV0View.setAsCtaButton();
        tdsBottomCtaV1View.onWarmupCompleted().addView((View) tdsTextButtonV0View, tdsBottomCtaV1View.onWarmupCompleted().getChildCount() - i);
        return null;
    }

    private final void onNavigationEvent(initSDK initsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        initsdk.setAsCtaButton();
        int i4 = IAuthTabCallbackStub + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r3 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "");
        r0 = new im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View(r3, null, 0, 6, null);
        r0.setId(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_check_box);
        r2 = java.lang.Integer.TYPE;
        r2 = (android.view.ViewGroup.LayoutParams) android.widget.LinearLayout.LayoutParams.class.getDeclaredConstructor(r2, r2).newInstance(-1, -2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r4 = (android.widget.LinearLayout.LayoutParams) r2;
        r4.width = -1;
        r4.height = -2;
        r0.setLayoutParams(r2);
        o.setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(r0, o.setTagsokhttp.onExtraCallbackWithResult(r0, 20));
        o.setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new java.lang.Object[]{r0, java.lang.Integer.valueOf(o.setTagsokhttp.onExtraCallbackWithResult(r0, r1))}, im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        o.setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(r0, o.setTagsokhttp.onExtraCallbackWithResult(r0, r1));
        onWarmupCompleted().addView(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (IAuthTabCallback() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (IAuthTabCallback() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.IAuthTabCallbackStub + 77;
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.onTransact = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2 != 0 ? 126 : 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[PHI: r3 r5
      0x0066: PHI (r3v6 java.lang.Integer) = (r3v5 int), (r3v10 int) binds: [B:8:0x0064, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r5v3 androidx.appcompat.widget.AppCompatTextView) = (r5v2 androidx.appcompat.widget.AppCompatTextView), (r5v8 androidx.appcompat.widget.AppCompatTextView) binds: [B:8:0x0064, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Resources.NotFoundException {
        int i;
        AppCompatTextView appCompatTextView;
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 103;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            i = 50;
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            appCompatTextView = (BaseTextView) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, 1988589279, -1988589268, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            if (appCompatTextView != null) {
                appCompatTextView.setText("");
            }
        } else {
            i = 16;
            int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            appCompatTextView = (BaseTextView) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{tdsBottomCtaV1View}, 1988589279, -1988589268, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            if (appCompatTextView != null) {
            }
        }
        AppCompatTextView appCompatTextViewAsBinder = tdsBottomCtaV1View.asBinder();
        if (appCompatTextViewAsBinder != null) {
            int i4 = IAuthTabCallbackStub + 3;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            appCompatTextViewAsBinder.setText("");
        }
        tdsBottomCtaV1View.onPostMessage().setVisibility(8);
        tdsBottomCtaV1View.onWarmupCompleted().setPadding(setTagsokhttp.onExtraCallbackWithResult(tdsBottomCtaV1View, i), 0, setTagsokhttp.onExtraCallbackWithResult(tdsBottomCtaV1View, i), 0);
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1View.asInterface();
        TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
        TdsButtonV1View.setTheme$default(tdsButtonV1ViewAsInterface, null, null, onwarmupcompleted, null, 11, null);
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        TdsButtonV1View.setTheme$default((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), null, null, onwarmupcompleted, null, 11, null);
        return null;
    }

    private static final Unit IAuthTabCallbackStubProxy(TdsBottomCtaV1View tdsBottomCtaV1View) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tdsBottomCtaV1View};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 1418748516, -1418748495, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            unit = Unit.INSTANCE;
            int i4 = 2 / 0;
        } else {
            onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 1418748516, -1418748495, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            unit = Unit.INSTANCE;
        }
        int i5 = IAuthTabCallbackStub + 99;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View, int i, boolean z, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            int i5 = onTransact + 15;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            i2 = 0;
        }
        Object[] objArr = {tdsBottomCtaV1View, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2)};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, 2051192410, -2051192408, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i7 = onTransact + 29;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            tdsBottomCtaV1View.isAttachedToWindow();
            throw null;
        }
        if (!tdsBottomCtaV1View.isAttachedToWindow()) {
            tdsBottomCtaV1View.addOnAttachStateChangeListener(new IAuthTabCallbackDefault(tdsBottomCtaV1View, tdsBottomCtaV1View, iIntValue, zBooleanValue, iIntValue2));
        } else {
            ViewParent parent = tdsBottomCtaV1View.getParent();
            Intrinsics.checkNotNull(parent, "");
            View viewFindViewById = ((ViewGroup) parent).findViewById(iIntValue);
            if (viewFindViewById instanceof RecyclerView) {
                int i3 = IAuthTabCallbackStub + 9;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    tdsBottomCtaV1View.onExtraCallback((RecyclerView) viewFindViewById, zBooleanValue, iIntValue2);
                    obj.hashCode();
                    throw null;
                }
                tdsBottomCtaV1View.onExtraCallback((RecyclerView) viewFindViewById, zBooleanValue, iIntValue2);
            } else if (viewFindViewById instanceof NestedScrollView) {
                int i4 = IAuthTabCallbackStub + 59;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                tdsBottomCtaV1View.onExtraCallbackWithResult((NestedScrollView) viewFindViewById, zBooleanValue, iIntValue2);
            } else if (viewFindViewById instanceof ScrollView) {
                tdsBottomCtaV1View.onWarmupCompleted((ScrollView) viewFindViewById, zBooleanValue, iIntValue2);
            }
        }
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r3 instanceof android.widget.ScrollView) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r3 instanceof androidx.recyclerview.widget.RecyclerView) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        ((androidx.recyclerview.widget.RecyclerView) r3).addOnScrollListener(new im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.onTransact(r4));
        r3 = im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.IAuthTabCallbackStub + 47;
        im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View.onTransact = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if ((r3 instanceof android.widget.ScrollView) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(View view, final Function2<? super Integer, ? super Integer, Unit> function2) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (!(view instanceof NestedScrollView)) {
            int i5 = i3 + 77;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 53 / 0;
            }
        }
        view.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i7, int i8, int i9, int i10) {
                int i11 = 2 % 2;
                int i12 = IAuthTabCallback + 99;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                Object obj = null;
                TdsBottomCtaV1View.onWarmupCompleted(function2, view2, i7, i8, i9, i10);
                if (i13 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i14 = IAuthTabCallback + 57;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
    }

    private static final void onExtraCallback(Function2 function2, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 125;
        onTransact = i6 % 128;
        function2.invoke(Integer.valueOf(i6 % 2 == 0 ? i4 * i2 : i4 - i2), Integer.valueOf(i2));
    }

    public static final class onTransact extends RecyclerView.OnScrollListener {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2<Integer, Integer, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onTransact(Function2<? super Integer, ? super Integer, Unit> function2) {
            this.onNavigationEvent = function2;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            this.onNavigationEvent.invoke(Integer.valueOf(i2), Integer.valueOf(recyclerView.computeVerticalScrollOffset()));
            int i6 = onWarmupCompleted + 79;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
    }

    public final void onNavigationEvent(@NotNull View view, @Nullable final onWarmupCompleted onwarmupcompleted, final int i) {
        TdsScrollView tdsScrollView;
        Integer numIAuthTabCallback;
        int iIntValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        IAuthTabCallbackStub().setVisibility(8);
        view.setVerticalFadingEdgeEnabled(true);
        view.setFadingEdgeLength(setTagsokhttp.onExtraCallbackWithResult(view, 34));
        int iIntValue2 = 0;
        if (view instanceof TdsNestedScrollView) {
            TdsNestedScrollView tdsNestedScrollView = (TdsNestedScrollView) view;
            Integer numOnExtraCallback = tdsNestedScrollView.onExtraCallback();
            if (numOnExtraCallback != null) {
                int i3 = IAuthTabCallbackStub + 119;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                iIntValue = numOnExtraCallback.intValue();
            } else {
                iIntValue = 0;
            }
            tdsNestedScrollView.setFadingEdgeType(Integer.valueOf(iIntValue | 2));
        }
        if (view instanceof TdsRecyclerView) {
            TdsRecyclerView tdsRecyclerView = (TdsRecyclerView) view;
            Integer numAccess100 = tdsRecyclerView.access100();
            tdsRecyclerView.setFadingEdgeType(Integer.valueOf((numAccess100 != null ? numAccess100.intValue() : 0) | 2));
        }
        if (view instanceof TdsScrollView) {
            int i5 = IAuthTabCallbackStub + 61;
            onTransact = i5 % 128;
            if (i5 % 2 != 0 ? (numIAuthTabCallback = (tdsScrollView = (TdsScrollView) view).IAuthTabCallback()) != null : (numIAuthTabCallback = (tdsScrollView = (TdsScrollView) view).IAuthTabCallback()) != null) {
                int i6 = onTransact + 85;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    numIAuthTabCallback.intValue();
                    throw null;
                }
                iIntValue2 = numIAuthTabCallback.intValue();
            }
            tdsScrollView.setFadingEdgeType(Integer.valueOf(2 | iIntValue2));
        }
        if (onwarmupcompleted != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            onNavigationEvent(view, (Function2<? super Integer, ? super Integer, Unit>) new Function2() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda20
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitIAuthTabCallback;
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 33;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        unitIAuthTabCallback = TdsBottomCtaV1View.IAuthTabCallback(i, onwarmupcompleted, this, booleanRef, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        int i9 = 84 / 0;
                    } else {
                        unitIAuthTabCallback = TdsBottomCtaV1View.IAuthTabCallback(i, onwarmupcompleted, this, booleanRef, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                    int i10 = onExtraCallback + 15;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object extraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int iIntValue = ((Number) objArr[0]).intValue();
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[1];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[2];
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        if (((Number) objArr[5]).intValue() < iIntValue || (iIntValue2 < 0 && onwarmupcompleted == onWarmupCompleted.HIDE)) {
            int i2 = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()];
            if (i2 != 1) {
                int i3 = onTransact + 85;
                int i4 = i3 % 128;
                IAuthTabCallbackStub = i4;
                int i5 = i3 % 2;
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(!tdsBottomCtaV1View.onExtraCallbackWithResult)) {
                    int i6 = i4 + 13;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        onExtraCallback(tdsBottomCtaV1View, booleanRef.element, null, 2, null);
                    } else {
                        onExtraCallback(tdsBottomCtaV1View, booleanRef.element, null, 2, null);
                    }
                }
            } else if (!tdsBottomCtaV1View.onExtraCallbackWithResult) {
                int i7 = onTransact + 15;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                tdsBottomCtaV1View.onExtraCallbackWithResult(booleanRef.element);
            }
        } else {
            int i9 = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!tdsBottomCtaV1View.onExtraCallbackWithResult) {
                    tdsBottomCtaV1View.onExtraCallbackWithResult(booleanRef.element);
                }
            } else if (tdsBottomCtaV1View.onExtraCallbackWithResult) {
                onExtraCallback(tdsBottomCtaV1View, booleanRef.element, null, 2, null);
            }
        }
        booleanRef.element = true;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, ScrollView scrollView, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onTransact;
        int i5 = i4 + 75;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            int i7 = i4 + 119;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        tdsBottomCtaV1View.onWarmupCompleted(scrollView, z, i);
        int i9 = onTransact + 85;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void onWarmupCompleted(@NotNull ScrollView scrollView, boolean z, int i) {
        onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(scrollView, "");
        if (z) {
            int i3 = onTransact + 45;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            onwarmupcompleted = onWarmupCompleted.HIDE;
        } else {
            onwarmupcompleted = null;
        }
        onNavigationEvent(scrollView, onwarmupcompleted, i);
        int i5 = onTransact + 1;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, NestedScrollView nestedScrollView, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallbackStub + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if ((i2 & 4) != 0) {
            int i6 = onTransact + 103;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        tdsBottomCtaV1View.onExtraCallbackWithResult(nestedScrollView, z, i);
    }

    public final void onExtraCallbackWithResult(@NotNull NestedScrollView nestedScrollView, boolean z, int i) {
        onWarmupCompleted onwarmupcompleted;
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(nestedScrollView, "");
        if (z) {
            onwarmupcompleted = onWarmupCompleted.HIDE;
        } else {
            int i5 = IAuthTabCallbackStub + 79;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            onwarmupcompleted = null;
        }
        onNavigationEvent(nestedScrollView, onwarmupcompleted, i);
    }

    public static /* synthetic */ void IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, RecyclerView recyclerView, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onTransact + 15;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 53;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if ((i2 & 4) != 0) {
            int i9 = onTransact + 75;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        tdsBottomCtaV1View.onExtraCallback(recyclerView, z, i);
    }

    public final void onExtraCallback(@NotNull RecyclerView recyclerView, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        onWarmupCompleted onwarmupcompleted = null;
        if (z) {
            int i5 = onTransact + 63;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                onWarmupCompleted onwarmupcompleted2 = onWarmupCompleted.HIDE;
                throw null;
            }
            onwarmupcompleted = onWarmupCompleted.HIDE;
            int i6 = onTransact + 41;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        onNavigationEvent(recyclerView, onwarmupcompleted, i);
    }

    public final void setEnabledCta(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        asInterface().setEnabled(z);
        int i4 = IAuthTabCallbackStub + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean onWarmupCompleted(View view, View view2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view2, "");
            return Intrinsics.areEqual(view2, view);
        }
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.areEqual(view2, view);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean IAuthTabCallbackDefault(final View view) {
        int i = 2 % 2;
        TdsButtonV1View tdsButtonV1ViewAsInterface = asInterface();
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Iterator itIAuthTabCallback = clearRevision.onNavigationEvent(clearRevision.onExtraCallbackWithResult(new View[]{tdsButtonV1ViewAsInterface, (TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), onPostMessage()}), new Function1() { // from class: im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 83;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Boolean.valueOf(TdsBottomCtaV1View.onExtraCallbackWithResult(view, (View) obj));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(TdsBottomCtaV1View.onExtraCallbackWithResult(view, (View) obj));
                int i4 = onNavigationEvent + 75;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return boolValueOf;
            }
        }).IAuthTabCallback();
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        while (itIAuthTabCallback.hasNext()) {
            int i4 = IAuthTabCallbackStub + 103;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                if (((View) itIAuthTabCallback.next()).getVisibility() != 49) {
                    return false;
                }
            } else if (((View) itIAuthTabCallback.next()).getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int ICustomTabsCallbackStub() {
        int measuredWidth;
        int i;
        int i2 = 2 % 2;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            int measuredWidth2 = view.getMeasuredWidth();
            int i3 = onTransact + 83;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 4;
            }
            if (measuredWidth2 > 0) {
                Object parent2 = getParent();
                Intrinsics.checkNotNull(parent2, "");
                measuredWidth = ((View) parent2).getMeasuredWidth();
                int i5 = onTransact + 81;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 2;
                }
            }
            i = onRelationshipValidationResult().getLayoutParams().height;
            onRelationshipValidationResult().getLayoutParams().height = -2;
            onRelationshipValidationResult().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = onRelationshipValidationResult().getMeasuredHeight();
            onRelationshipValidationResult().getLayoutParams().height = i;
            if (i > 0) {
                onRelationshipValidationResult().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
            }
            onMinimized().requestLayout();
            return measuredHeight;
        }
        int i7 = onTransact + 89;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        measuredWidth = context.getResources().getConfiguration().screenWidthDp;
        i = onRelationshipValidationResult().getLayoutParams().height;
        onRelationshipValidationResult().getLayoutParams().height = -2;
        onRelationshipValidationResult().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight2 = onRelationshipValidationResult().getMeasuredHeight();
        onRelationshipValidationResult().getLayoutParams().height = i;
        if (i > 0) {
        }
        onMinimized().requestLayout();
        return measuredHeight2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r0.onPostMessage().getVisibility() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        registerCrashCallback registercrashcallbackAsInterface;
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (!(!tdsBottomCtaV1View.onExtraCallback)) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            if (((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getVisibility() != 0) {
                int i2 = onTransact + 121;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
            }
            registerCrashCallback registercrashcallbackAsInterface2 = tdsBottomCtaV1View.asInterface();
            if (registercrashcallbackAsInterface2.isLaidOut()) {
                int i4 = IAuthTabCallbackStub + 73;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                if (!registercrashcallbackAsInterface2.isLayoutRequested()) {
                    TextPaint paint = tdsBottomCtaV1View.asInterface().getPaint();
                    int length = tdsBottomCtaV1View.asInterface().length();
                    int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                    if (length > ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).length()) {
                        int i6 = onTransact + 45;
                        IAuthTabCallbackStub = i6 % 128;
                        if (i6 % 2 != 0) {
                            tdsBottomCtaV1View.asInterface();
                            obj.hashCode();
                            throw null;
                        }
                        registercrashcallbackAsInterface = tdsBottomCtaV1View.asInterface();
                    } else {
                        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        registercrashcallbackAsInterface = (TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                    }
                    if (tdsBottomCtaV1View.asInterface().getMeasuredWidth() - (tdsBottomCtaV1View.asInterface().getPaddingLeft() + tdsBottomCtaV1View.asInterface().getPaddingRight()) < paint.measureText(registercrashcallbackAsInterface.getText().toString())) {
                        onTransact(tdsBottomCtaV1View);
                        return null;
                    }
                    asInterface(tdsBottomCtaV1View);
                    return null;
                }
            }
            registercrashcallbackAsInterface2.addOnLayoutChangeListener(tdsBottomCtaV1View.new asInterface());
            return null;
        }
        tdsBottomCtaV1View.ICustomTabsCallbackDefault();
        return null;
    }

    public final void setGradientVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStub().setVisibility(i);
        int i5 = IAuthTabCallbackStub + 107;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
    }

    public final int onTransact() {
        int measuredHeight;
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            measuredHeight = IAuthTabCallbackStub().getMeasuredHeight();
            int i3 = 7 / 0;
        } else {
            measuredHeight = IAuthTabCallbackStub().getMeasuredHeight();
        }
        int i4 = onTransact + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return measuredHeight;
    }

    public final void setSpaceBottomVisibility(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStubProxy().setVisibility(i);
        if (i4 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void onExtraCallbackWithResult(DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk, TdsBottomCtaV1View tdsBottomCtaV1View, int i, int i2, Integer num, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 16) != 0) {
            int i5 = IAuthTabCallbackStub;
            int i6 = i5 + 61;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 57;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            num = null;
        }
        Object[] objArr = {deactivateEncoderSurfaceBeforeStopEncoderQuirk, tdsBottomCtaV1View, Integer.valueOf(i), Integer.valueOf(i2), num};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1142164512, 1142164530, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) objArr[0];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Integer num = (Integer) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(iIntValue, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallback(iIntValue, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(iIntValue, 3, iIntValue2, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(iIntValue, 1, 0, 1);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(iIntValue, 2, 0, 2);
        Object obj = null;
        if (num != null) {
            int i4 = IAuthTabCallbackStub + 105;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(iIntValue, 4, num.intValue(), 3);
            deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(iIntValue, 4, setTagsokhttp.onExtraCallbackWithResult(tdsBottomCtaV1View, 8));
            return null;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(iIntValue, 4, 0, 4);
        int i6 = onTransact + 73;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        mayLaunchUrl();
        int i4 = IAuthTabCallbackStub + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (this.IAuthTabCallback) {
                return;
            }
            int i4 = i3 + 23;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                if (onUnminimized()) {
                    setBottomCtaBackgroundColor(RequestBodyCompanion.onNavigationEvent(this, authParams.BackgroundFloated100));
                    int i5 = IAuthTabCallbackStub + 33;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            onUnminimized();
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onUnminimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getParent();
            obj.hashCode();
            throw null;
        }
        ViewParent parent = getParent();
        while (parent != null) {
            int i3 = onTransact + 63;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                String name = parent.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (StringsKt.contains$default(name, "BottomSheetV2Content", true, 4, (Object) null)) {
                    int i4 = onTransact + 117;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
                parent = parent.getParent();
                int i6 = onTransact + 101;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            } else {
                String name2 = parent.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                if (StringsKt.contains$default(name2, "BottomSheetV2Content", false, 2, (Object) null)) {
                    int i42 = onTransact + 117;
                    IAuthTabCallbackStub = i42 % 128;
                    int i52 = i42 % 2;
                    return true;
                }
                parent = parent.getParent();
                int i62 = onTransact + 101;
                IAuthTabCallbackStub = i62 % 128;
                int i72 = i62 % 2;
            }
        }
        return false;
    }

    public final BaseTextView asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextView = (BaseTextView) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_info_message);
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return baseTextView;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object objFindViewById = tdsBottomCtaV1View.findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_secondary);
            Intrinsics.checkNotNullExpressionValue(objFindViewById, "");
            return (TdsButtonV1View) objFindViewById;
        }
        Object objFindViewById2 = tdsBottomCtaV1View.findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_secondary);
        Intrinsics.checkNotNullExpressionValue(objFindViewById2, "");
        int i3 = 54 / 0;
        return (TdsButtonV1View) objFindViewById2;
    }

    public final TdsButtonV1View asInterface() {
        TdsButtonV1View tdsButtonV1View;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object objFindViewById = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_cta);
            Intrinsics.checkNotNullExpressionValue(objFindViewById, "");
            tdsButtonV1View = (TdsButtonV1View) objFindViewById;
            int i3 = 87 / 0;
        } else {
            Object objFindViewById2 = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_cta);
            Intrinsics.checkNotNullExpressionValue(objFindViewById2, "");
            tdsButtonV1View = (TdsButtonV1View) objFindViewById2;
        }
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsButtonV1View;
    }

    public final TdsTextButtonV0View access100() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsTextButtonV0View tdsTextButtonV0View = (TdsTextButtonV0View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_button);
        int i3 = onTransact + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return tdsTextButtonV0View;
    }

    public final BaseTextView extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        BaseTextView baseTextView = (BaseTextView) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_description);
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return baseTextView;
    }

    public final TdsCheckBoxV1View access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsCheckBoxV1View tdsCheckBoxV1View = (TdsCheckBoxV1View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_top_check_box);
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return tdsCheckBoxV1View;
    }

    public final TdsTextButtonV0View onExtraCallbackWithResult() {
        TdsTextButtonV0View tdsTextButtonV0View;
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            tdsTextButtonV0View = (TdsTextButtonV0View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_button);
            int i3 = 73 / 0;
        } else {
            tdsTextButtonV0View = (TdsTextButtonV0View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_button);
        }
        int i4 = IAuthTabCallbackStub + 77;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return tdsTextButtonV0View;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseTextView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        BaseTextView baseTextView = (BaseTextView) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_description);
        int i3 = onTransact + 9;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return baseTextView;
    }

    public final TdsCheckBoxV1View IAuthTabCallback() {
        TdsCheckBoxV1View tdsCheckBoxV1View;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            tdsCheckBoxV1View = (TdsCheckBoxV1View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_check_box);
            int i3 = 40 / 0;
        } else {
            tdsCheckBoxV1View = (TdsCheckBoxV1View) findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_bottom_check_box);
        }
        int i4 = onTransact + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsCheckBoxV1View;
    }

    private final LinearLayout onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        int i4 = IAuthTabCallbackStub + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private final ConstraintLayout onMinimized() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            ConstraintLayout constraintLayoutFindViewById = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_button_body);
            Intrinsics.checkNotNullExpressionValue(constraintLayoutFindViewById, "");
            return constraintLayoutFindViewById;
        }
        ConstraintLayout constraintLayoutFindViewById2 = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_button_body);
        Intrinsics.checkNotNullExpressionValue(constraintLayoutFindViewById2, "");
        int i3 = 36 / 0;
        return constraintLayoutFindViewById2;
    }

    public final LinearLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.tds_bottom_cta_v1_cta_body);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        int i4 = onTransact + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return linearLayout;
    }

    public final View IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(findViewById(im.toss.tds.view.R.id.gradient), "");
            throw null;
        }
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.gradient);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(im.toss.tds.view.R.id.spaceBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    public boolean onWarmupCompleted(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            IAuthTabCallbackStub().getVisibility();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        int iOnTransact = IAuthTabCallbackStub().getVisibility() == 0 ? onTransact() : 0;
        boolean globalVisibleRect = onRelationshipValidationResult().getGlobalVisibleRect(rect);
        rect.top += iOnTransact;
        int i3 = onTransact + 39;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return globalVisibleRect;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Drawable onExtraCallback(int i) {
            int i2 = 2 % 2;
            noCache nocache = new noCache(0.0d, new int[]{setBodyokhttp.onNavigationEvent(i, 0.0f), i}, new float[]{0.25f, 1.0f}, null, null, null, null, 120, null);
            int i3 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return nocache;
        }
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(onMinimized());
        int id = onPostMessage().getId();
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object[] objArr = {deactivateEncoderSurfaceBeforeStopEncoderQuirk, this, Integer.valueOf(id), 0, Integer.valueOf(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId())};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -1142164512, 1142164530, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int id2 = asInterface().getId();
        int id3 = onPostMessage().getId();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object[] objArr2 = {deactivateEncoderSurfaceBeforeStopEncoderQuirk, this, Integer.valueOf(id2), Integer.valueOf(id3), Integer.valueOf(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId())};
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, -1142164512, 1142164530, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(deactivateEncoderSurfaceBeforeStopEncoderQuirk, this, ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), asInterface().getId(), (Integer) null, 16, (Object) null);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(onMinimized());
        ConstraintLayout constraintLayoutOnMinimized = onMinimized();
        if (!(!constraintLayoutOnMinimized.isLaidOut())) {
            int i2 = IAuthTabCallbackStub + 23;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!constraintLayoutOnMinimized.isLayoutRequested()) {
                int i4 = IAuthTabCallbackStub + 67;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 40 / 0;
                    if (!IAuthTabCallbackStub(this)) {
                        return;
                    }
                } else if (!IAuthTabCallbackStub(this)) {
                    return;
                }
                onExtraCallbackWithResult(false);
                return;
            }
        }
        constraintLayoutOnMinimized.addOnLayoutChangeListener(new asBinder());
        int i6 = onTransact + 119;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(onMinimized());
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(onPostMessage().getId(), 3, 0, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(onPostMessage().getId(), 4, 0, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(onPostMessage().getId(), 1, 0, 1);
        int id = onPostMessage().getId();
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(id, 2, ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 1);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(onPostMessage().getId(), 4, setTagsokhttp.onExtraCallbackWithResult(this, 0));
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 3, 0, 3);
        int iIAuthTabCallback5 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 4, 0, 4);
        int iIAuthTabCallback7 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback8 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback8, iIAuthTabCallback7, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 1, onPostMessage().getId(), 2);
        int iIAuthTabCallback9 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback10 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback10, iIAuthTabCallback9, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 2, asInterface().getId(), 1);
        int iIAuthTabCallback11 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback12 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback12, iIAuthTabCallback11, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 4, setTagsokhttp.onExtraCallbackWithResult(this, 0));
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(asInterface().getId(), 3, 0, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(asInterface().getId(), 4, 0, 4);
        int id2 = asInterface().getId();
        int iIAuthTabCallback13 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback14 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(id2, 1, ((TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback14, iIAuthTabCallback13, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getId(), 2);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(asInterface().getId(), 2, 0, 2);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(onMinimized());
        ConstraintLayout constraintLayoutOnMinimized = onMinimized();
        if (constraintLayoutOnMinimized.isLaidOut() && !constraintLayoutOnMinimized.isLayoutRequested()) {
            if (IAuthTabCallbackStub(this)) {
                int i2 = IAuthTabCallbackStub + 39;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult(false);
            }
            int i4 = onTransact + 73;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        constraintLayoutOnMinimized.addOnLayoutChangeListener(new IAuthTabCallbackStub());
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        if (!tdsBottomCtaV1View.onExtraCallbackWithResult) {
            int i2 = IAuthTabCallbackStub + 51;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (function0 != null) {
                function0.invoke();
                int i3 = onTransact + 41;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            onExtraCallback onextracallback = tdsBottomCtaV1View.onWarmupCompleted;
        }
        View viewOnRelationshipValidationResult = tdsBottomCtaV1View.onRelationshipValidationResult();
        ViewGroup.LayoutParams layoutParams = viewOnRelationshipValidationResult.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        viewOnRelationshipValidationResult.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onNavigationEvent(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z) {
        Object[] objArr = {tdsBottomCtaV1View, Boolean.valueOf(z)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 1683737835, -1683737832, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Object onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z) {
        Object[] objArr = {tdsBottomCtaV1View, Boolean.valueOf(z)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -490805565, 490805569, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Sequence onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Sequence) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View, view}, -1778738886, 1778738893, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, 2023811764, -2023811759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ void onExtraCallback(View view) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{view}, 1621274916, -1621274908, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1062539217, 1062539233, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, 476262778, -476262765, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private final void readTypedObject() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1951974745, 1951974759, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private final void onActivityLayout() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -817727305, 817727314, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(int i, onWarmupCompleted onwarmupcompleted, TdsBottomCtaV1View tdsBottomCtaV1View, Ref.BooleanRef booleanRef, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), onwarmupcompleted, tdsBottomCtaV1View, booleanRef, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1321752672, 1321752692, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final void IAuthTabCallback_Parcel(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, 1418748516, -1418748495, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit getInterfaceDescriptor(TdsBottomCtaV1View tdsBottomCtaV1View) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -453019408, 453019420, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, Function0 function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View, function0}, -118090303, 118090313, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final void onTransact(Function1 function1, View view) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{function1, view}, -1983229441, 1983229460, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final void onNavigationEvent(DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk, TdsBottomCtaV1View tdsBottomCtaV1View, int i, int i2, Integer num) {
        Object[] objArr = {deactivateEncoderSurfaceBeforeStopEncoderQuirk, tdsBottomCtaV1View, Integer.valueOf(i), Integer.valueOf(i2), num};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, -1142164512, 1142164530, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final boolean onWarmupCompleted(TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View, view}, 1359477685, -1359477684, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).booleanValue();
    }

    private static final Object onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, boolean z) {
        Object[] objArr = {tdsBottomCtaV1View, Boolean.valueOf(z)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 48678613, -48678598, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void IAuthTabCallback(int i, boolean z, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 2051192410, -2051192408, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void onExtraCallback() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, 743388870, -743388870, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final BaseTextView IAuthTabCallback_Parcel() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (BaseTextView) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, 1988589279, -1988589268, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final TdsButtonV1View getInterfaceDescriptor() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (TdsButtonV1View) onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{this}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void IAuthTabCallback(boolean z, @Nullable Function0<Unit> function0) {
        Object[] objArr = {this, Boolean.valueOf(z), function0};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr, 1176392495, -1176392489, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }
}
