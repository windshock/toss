package im.toss.features.benefit.ui.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.iap.ac.config.lite.preset.PresetParser;
import com.initech.pkix.cmp.client.CMPException;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType1View$;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography12;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Address;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulesListExternalSyntheticLambda0;
import o.Cacheurls1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.GraphicDeviceInfo;
import o.MiscObjectIdentifiers;
import o.QuirksExternalSyntheticBackport0;
import o.ScreenBrightnessBridgeExtension11;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.addFixedPosition;
import o.attachAppLovinSdk;
import o.bindChildren;
import o.filePathToByteArray;
import o.getAdService;
import o.getExtraParameters;
import o.getHumanReadableName;
import o.getKekid;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.isRepeatingEnabled;
import o.mExternalSyntheticApiModelOutline1;
import o.pxToDp;
import o.readIntokhttp;
import o.runOnUiThreadDelayed;
import o.setVisitUrl;
import o.use;
import o.varyMatches;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitActivationIntelligenceType1View extends FrameLayout {
    private BenefitActivationIntelligence.Type1 IAuthTabCallback;
    private Function1<? super BenefitActivationIntelligence.Type1, Unit> IAuthTabCallbackDefault;
    private Function0<Unit> IAuthTabCallbackStub;
    private runOnUiThreadDelayed IAuthTabCallbackStubProxy;
    private Function0<Unit> IAuthTabCallback_Parcel;
    private Runnable access100;
    private Rally asBinder;
    private boolean asInterface;
    private ValueAnimator onExtraCallback;
    private Rally onExtraCallbackWithResult;
    private Rally onNavigationEvent;
    private TdsListHeaderV3View onTransact;
    private final filePathToByteArray onWarmupCompleted;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 0;
    private static int writeTypedObject = 1;
    private static long access000 = 7343853330303687289L;
    private static int getInterfaceDescriptor = -1776194565;
    private static char readTypedObject = 27643;

    private static String $$c(byte b, short s, short s2) {
        byte[] bArr = $$a;
        int i = s2 + CMPException.METHOD_checkPKIStatusInfo;
        int i2 = b * 2;
        int i3 = (s * 4) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i = i3 + i;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i3];
            i3++;
            i += b2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(benefitActivationIntelligenceType1View, f);
        }
        onNavigationEvent(benefitActivationIntelligenceType1View, f);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitActivationIntelligence.Type1 type1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 35;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(type1, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallback + 37;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(attachapplovinsdk);
        int i4 = extraCallback + 87;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View) {
        Unit unit;
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {benefitActivationIntelligenceType1View};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        if (i3 == 0) {
            unit = (Unit) onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4, objArr, 2034909856, iOnExtraCallback3, -2034909853);
            int i4 = 78 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback4, objArr, 2034909856, iOnExtraCallback3, -2034909853);
        }
        int i5 = extraCallback + 55;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(attachapplovinsdk);
        int i4 = extraCallback + 67;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, BenefitActivationIntelligence.Type1 type1, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(benefitActivationIntelligenceType1View, type1, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 103;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        LinearLayout linearLayout;
        int i7;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i2;
        int i11 = ~(i6 | i4);
        int i12 = i10 | i11;
        int i13 = ~i2;
        int i14 = (~(i13 | i4)) | (~(i13 | i6)) | i11;
        int i15 = (~(i8 | i4)) | (~(i9 | i6));
        int i16 = i6 + i4 + i + (1040777104 * i5) + ((-1861505373) * i3);
        int i17 = i16 * i16;
        int i18 = (i6 * (-1036928585)) + 527892480 + ((-1036928585) * i4) + ((-562525036) * i12) + (562525036 * i14) + ((-281262518) * i15) + ((-1318191104) * i) + (1608515584 * i5) + ((-1123418112) * i3) + ((-2114519040) * i17);
        int i19 = (i6 * 1703033811) + 1712528133 + (i4 * 1703033811) + (i12 * 1508) + (i14 * (-1508)) + (i15 * 754) + (i * 1703034565) + (i5 * (-2114876976)) + (i3 * 1880022383) + (i17 * (-720175104));
        int i20 = i18 + (i19 * i19 * (-739180544));
        if (i20 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i20 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i20 != 3) {
            return onExtraCallbackWithResult(objArr);
        }
        BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View = (BenefitActivationIntelligenceType1View) objArr[0];
        int i21 = 2 % 2;
        int i22 = writeTypedObject + 91;
        extraCallback = i22 % 128;
        if (i22 % 2 != 0) {
            linearLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            i7 = 24;
        } else {
            linearLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            i7 = 8;
        }
        linearLayout.setVisibility(i7);
        benefitActivationIntelligenceType1View.onWarmupCompleted.access000.cancelAnimation();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onWarmupCompleted(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(benefitActivationIntelligenceType1View, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitActivationIntelligenceType1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iIntValue;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        filePathToByteArray filepathtobytearrayOnWarmupCompleted = filePathToByteArray.onWarmupCompleted(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(filepathtobytearrayOnWarmupCompleted, "");
        this.onWarmupCompleted = filepathtobytearrayOnWarmupCompleted;
        filepathtobytearrayOnWarmupCompleted.asBinder.setTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.LARGE, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
        filepathtobytearrayOnWarmupCompleted.onWarmupCompleted.setStrokeColor(TdsBorderRoundLayout.Companion.onExtraCallback(context));
        TdsRoundLayout tdsRoundLayout = filepathtobytearrayOnWarmupCompleted.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new onExtraCallbackWithResult(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        TdsRoundLayout.setShadow$default(tdsRoundLayout, new Cacheurls1.onExtraCallback(10, -2, ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue(), 0, 8, (DefaultConstructorMarker) null), (AppLovinSdkSettings) null, 2, (Object) null);
        TdsRoundLayout tdsRoundLayout2 = filepathtobytearrayOnWarmupCompleted.onWarmupCompleted;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            Configuration configuration3 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iIntValue = new getUrlokhttp(new onNavigationEvent(configuration3)).onSessionEnded();
        } else {
            Configuration configuration4 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            Object[] objArr2 = {new getUrlokhttp(new onExtraCallback(configuration4))};
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr2, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue();
            int i3 = writeTypedObject + 31;
            extraCallback = i3 % 128;
            if (i3 % 2 == 0) {
            }
            tdsRoundLayout2.setStrokeColor(iIntValue);
            onExtraCallback();
            i2 = extraCallback + 67;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = 2 % 2;
        tdsRoundLayout2.setStrokeColor(iIntValue);
        onExtraCallback();
        i2 = extraCallback + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitActivationIntelligenceType1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = writeTypedObject + 39;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = extraCallback + 49;
            int i7 = i6 % 128;
            writeTypedObject = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 9;
            extraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 3;
            } else {
                int i11 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setOnCtaClick(@Nullable Function1<? super BenefitActivationIntelligence.Type1, Unit> function1) {
        int i = 2 % 2;
        int i2 = extraCallback + 87;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = function1;
        int i5 = i3 + 67;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnCardShown(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = function0;
        int i5 = i3 + 59;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i4 = onExtraCallback + 67;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 38 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i6 = onExtraCallbackWithResult + 3;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 57 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallback))) {
                int i2 = IAuthTabCallback + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public final void setOnImpression(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 117;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback_Parcel = function0;
        int i5 = i2 + 81;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallback() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        ConstraintLayout parent = this.onWarmupCompleted.IAuthTabCallbackStubProxy.getParent();
        if (parent instanceof ConstraintLayout) {
            int i2 = extraCallback + 83;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            constraintLayout = parent;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            int i4 = writeTypedObject + 21;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int iIndexOfChild = constraintLayout.indexOfChild(this.onWarmupCompleted.IAuthTabCallbackStubProxy);
        ViewGroup.LayoutParams layoutParams = this.onWarmupCompleted.IAuthTabCallbackStubProxy.getLayoutParams();
        int id = this.onWarmupCompleted.IAuthTabCallbackStubProxy.getId();
        constraintLayout.removeView(this.onWarmupCompleted.IAuthTabCallbackStubProxy);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        View tdsListHeaderV3View = new TdsListHeaderV3View(ScreenBrightnessBridgeExtension11.onWarmupCompleted(context, 1.6f), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsListHeaderV3View.setId(id);
        tdsListHeaderV3View.setLayoutParams(layoutParams);
        this.onTransact = tdsListHeaderV3View;
        constraintLayout.addView(tdsListHeaderV3View, iIndexOfChild);
    }

    private static final void IAuthTabCallback(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, BenefitActivationIntelligence.Type1 type1, View view) {
        int i = 2 % 2;
        Function1<? super BenefitActivationIntelligence.Type1, Unit> function1 = benefitActivationIntelligenceType1View.IAuthTabCallbackDefault;
        if (function1 != null) {
            int i2 = writeTypedObject + 117;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(type1);
        }
        int i4 = extraCallback + 89;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 33;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 43 - TextUtils.indexOf("", "", 0, 0), 1451 - (ViewConfiguration.getEdgeSlop() >> 16), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - MotionEvent.axisFromString("")), KeyEvent.normalizeMetaState(0) + 44, View.MeasureSpec.getMode(0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 23972), 51 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22939 - View.MeasureSpec.makeMeasureSpec(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 45848), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, View.resolveSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (access000 ^ 7798559133331975163L)) ^ ((int) (getInterfaceDescriptor ^ 7798559133331975163L))) ^ ((char) (readTypedObject ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i5 = $11 + 47;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(BenefitActivationIntelligence.Type1 type1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 15;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = writeTypedObject + 3;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-800106392, i, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType1View.bind.<anonymous>.<anonymous>.<anonymous> (BenefitActivationIntelligenceType1View.kt:167)");
                }
                mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                String str = (String) BenefitActivationIntelligence.Type1.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1650269117, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{type1}, -1650269117);
                mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStubOnExtraCallbackWithResult = mExternalSyntheticApiModelOutline1.asInterface.Companion.IAuthTabCallback().onExtraCallbackWithResult();
                long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                if (z) {
                    onextracallbackwithresult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft;
                } else {
                    int i7 = writeTypedObject + 1;
                    extraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    onextracallbackwithresult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center;
                }
                mexternalsyntheticapimodeloutline1.onWarmupCompleted(str, iAuthTabCallbackStubOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, 0, true, (getHumanReadableName) null, jLongValue, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult, onextracallbackwithresult, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 100666368, 237484);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline12 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                String str2 = (String) BenefitActivationIntelligence.Type1.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1650269117, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{type1}, -1650269117);
                mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStubOnExtraCallbackWithResult2 = mExternalSyntheticApiModelOutline1.asInterface.Companion.IAuthTabCallback().onExtraCallbackWithResult();
                long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult2 = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
                if (z) {
                }
                mexternalsyntheticapimodeloutline12.onWarmupCompleted(str2, iAuthTabCallbackStubOnExtraCallbackWithResult2, (QuirksExternalSyntheticBackport0) null, 0, true, (getHumanReadableName) null, jLongValue2, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult2, onextracallbackwithresult, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 100666368, 237484);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            super.onDetachedFromWindow();
            int i3 = extraCallback + 35;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onExtraCallbackWithResult();
        super.onDetachedFromWindow();
        throw null;
    }

    private static final Unit onNavigationEvent(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setShadowAlpha(f);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = writeTypedObject + 19;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zEndsWith = StringsKt.endsWith(str, PresetParser.FILE_EXT, true);
        int i4 = extraCallback + 35;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zEndsWith;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(0.3f);
        Float fValueOf2 = Float.valueOf(0.0f);
        FrameLayout frameLayout = this.onWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        if (frameLayout.getVisibility() != 0) {
            this.onWarmupCompleted.ICustomTabsCallback.setAlpha(0.0f);
            int i2 = extraCallback + 55;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = writeTypedObject + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStubProxy;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
            int i6 = writeTypedObject + 119;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        this.onWarmupCompleted.ICustomTabsCallback.setAlpha(0.0f);
        this.onWarmupCompleted.ICustomTabsCallback.setScaleX(1.0f);
        this.onWarmupCompleted.ICustomTabsCallback.setScaleY(1.0f);
        pxToDp.onWarmupCompleted onwarmupcompleted = pxToDp.onWarmupCompleted.IAuthTabCallback;
        TdsImageView tdsImageView = this.onWarmupCompleted.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.onExtraCallback(new AppLovinSdkSettings(), fValueOf2, fValueOf, new BenefitActivationIntelligenceType1View$.ExternalSyntheticLambda0()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        TdsImageView tdsImageView2 = this.onWarmupCompleted.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        isFireOS isfireosOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, onwarmupcompleted, CollectionsKt.listOf(new Rally[]{rally, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView2, isMuted.onExtraCallback(new AppLovinSdkSettings(), fValueOf, fValueOf2, new BenefitActivationIntelligenceType1View$.ExternalSyntheticLambda1()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null);
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TdsImageView tdsImageView3 = this.onWarmupCompleted.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf(new isFireOS[]{isfireosOnWarmupCompleted, (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView3, (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{isMuted.asBinder(new AppLovinSdkSettings(), Float.valueOf(1.0f), Float.valueOf(3.0f), (Function1) null, 4, (Object) null), 2000}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), -1, getExtraParameters.Normal, 200, Address.onNavigationEvent.asInterface(), (Integer) null, (Boolean) null, 0, 0L, false, 3969, (Object) null);
        isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnWarmupCompleted, false, 1, (Object) null);
        this.IAuthTabCallbackStubProxy = runonuithreaddelayedOnWarmupCompleted;
        int i8 = writeTypedObject + 89;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 25;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(7091);
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            attachapplovinsdk.IAuthTabCallback(400);
            i = 0;
        }
        attachapplovinsdk.onExtraCallback(i);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1600);
        attachapplovinsdk.onExtraCallback(0);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 53;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        Runnable runnable = this.access100;
        if (runnable != null) {
            FrameLayout frameLayoutOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(frameLayoutOnExtraCallback, "");
            frameLayoutOnExtraCallback.removeCallbacks(runnable);
        }
        this.access100 = null;
        Rally rally = this.asBinder;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        this.asBinder = null;
        Rally rally2 = this.onNavigationEvent;
        if (rally2 != null) {
            int i2 = extraCallback + 91;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            rally2.ICustomTabsServiceStub();
        }
        this.onNavigationEvent = null;
        Rally rally3 = this.onExtraCallbackWithResult;
        if (rally3 != null) {
            rally3.ICustomTabsServiceStub();
            int i4 = writeTypedObject + 67;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        this.onExtraCallbackWithResult = null;
        runOnUiThreadDelayed runonuithreaddelayed = this.IAuthTabCallbackStubProxy;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        this.IAuthTabCallbackStubProxy = null;
        ValueAnimator valueAnimator = this.onExtraCallback;
        if (valueAnimator != null) {
            int i6 = extraCallback + 103;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                valueAnimator.cancel();
                throw null;
            }
            valueAnimator.cancel();
        }
        this.onExtraCallback = null;
        this.onWarmupCompleted.access000.cancelAnimation();
        this.onWarmupCompleted.IAuthTabCallbackDefault.cancelAnimation();
        this.onWarmupCompleted.access100.animate().cancel();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View = (BenefitActivationIntelligenceType1View) objArr[0];
        BenefitActivationIntelligence.Type1 type1 = (BenefitActivationIntelligence.Type1) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type1, "");
        BenefitActivationIntelligence.Type1 type12 = benefitActivationIntelligenceType1View.IAuthTabCallback;
        Object obj = null;
        if (!Intrinsics.areEqual(type12 != null ? type12.IAuthTabCallback() : null, type1.IAuthTabCallback())) {
            benefitActivationIntelligenceType1View.asInterface = false;
        }
        benefitActivationIntelligenceType1View.IAuthTabCallback = type1;
        benefitActivationIntelligenceType1View.onExtraCallbackWithResult();
        int iOnExtraCallback = getKekid.onExtraCallback();
        onWarmupCompleted(getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), new Object[]{benefitActivationIntelligenceType1View}, -690453788, getKekid.onExtraCallback(), 690453790);
        benefitActivationIntelligenceType1View.onExtraCallbackWithResult(type1);
        benefitActivationIntelligenceType1View.onWarmupCompleted.asBinder.setText(type1.onExtraCallback());
        benefitActivationIntelligenceType1View.onWarmupCompleted.asBinder.setOnClickListener(new BenefitActivationIntelligenceType1View$.ExternalSyntheticLambda6(benefitActivationIntelligenceType1View, type1));
        LinearLayout linearLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        FrameLayout frameLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = benefitActivationIntelligenceType1View.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = writeTypedObject + 49;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        layoutParams.height = -2;
        frameLayout2.setLayoutParams(layoutParams);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setAlpha(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setScaleX(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setScaleY(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setShadowAlpha(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.onWarmupCompleted.setAlpha(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted();
        Function0<Unit> function0 = benefitActivationIntelligenceType1View.IAuthTabCallbackStub;
        if (function0 != null) {
            function0.invoke();
        }
        if (!benefitActivationIntelligenceType1View.asInterface) {
            benefitActivationIntelligenceType1View.asInterface = true;
            Function0<Unit> function02 = benefitActivationIntelligenceType1View.IAuthTabCallback_Parcel;
            if (function02 != null) {
                int i4 = extraCallback + 51;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                function02.invoke();
            }
        }
        int i6 = extraCallback + 15;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(BenefitActivationIntelligence.Type1 type1) throws Throwable {
        Object obj;
        int i;
        TdsListHeaderV3View.onWarmupCompleted onwarmupcompleted;
        String strReplace$default;
        String strAsBinder;
        Object objOnWarmupCompleted;
        int i2 = 2 % 2;
        TdsImageView tdsImageView = this.onWarmupCompleted.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            int i3 = writeTypedObject + 39;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a((char) (55826 - TextUtils.lastIndexOf("", '0')), (-158553809) - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{18807, 50442, 61266, 41504, 31467, 7894, 5306, 22535, 44052, 34930, 22745, 47987, 42109, 2025, 41503, 46620, 58261, 35501, 58102, 26316, 47288, 10950, 35269, 43608, 39621, 11736, 17355, 62199, 59610, 53045, 43499, 2834, 12211, 2867, 59736, 23900, 29136, 27340, 59043, 45869, 41926, 52928, 32869}, new char[]{29058, 23923, 38791, 2512}, new char[]{12226, 36009, 5110, 53210}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (50644 - MotionEvent.axisFromString("")), ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{47818, 61208, 41358, 17212, 57011, 26549, 3540, 62723, 9252, 47095, 4768, 21650, 2318, 2227, 22097, 8409, 60634, 28953, 30746, 23578, 35393, 37477, 22551, 10888, 26265, 7627, 13332, 31423, 46484, 31156, 30667, 22573, 40359, 21671, 7927, 9050, 11335, 40888, 25897, 27444, 58252, 56057, 15252, 47349}, new char[]{29058, 23923, 38791, 2512}, new char[]{52790, 62377, 54558, 30917}, objArr2);
            obj = objArr2[0];
        }
        TdsImageView.setImage$default(tdsImageView, ((String) obj).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        TdsImageView tdsImageView2 = this.onWarmupCompleted.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
        Object[] objArr3 = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), (-1) - Process.getGidForName(""), new char[]{20397, 24941, 39267, 60922, 60853, 55202, 44338, 19828, 24142, 21741, 32527, 50011, 'J', 17616, 29788, 65357, 57794, 25376, 28859, 53359, 21055, 31171, 13244, 25332, 52688, 47714, 41062, 52008, 56359, 10681, 46376, 15717, 15008, 42779, 44230, 8931, 27106, 11889, 44498, 14467, 60949, 34518, 3578, 3622, 10591, 41868, 14034, 59056, 64740, 10424}, new char[]{29058, 23923, 38791, 2512}, new char[]{34884, 19900, 42177, 12570}, objArr3);
        TdsImageView.setImage$default(tdsImageView2, ((String) objArr3[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        SubTypography12 subTypography12 = this.onWarmupCompleted.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(subTypography12, "");
        if (type1.IAuthTabCallbackDefault()) {
            int i5 = writeTypedObject + 123;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            i = 8;
        }
        subTypography12.setVisibility(i);
        TdsListHeaderV3View tdsListHeaderV3View = this.onTransact;
        if (tdsListHeaderV3View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsListHeaderV3View = null;
        }
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        if (Intrinsics.areEqual(type1.access000(), Boolean.TRUE)) {
            int i7 = writeTypedObject + 55;
            extraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                TdsListHeaderV3View.onWarmupCompleted onwarmupcompleted2 = TdsListHeaderV3View.onWarmupCompleted.TOP;
                numValueOf.hashCode();
                throw null;
            }
            onwarmupcompleted = TdsListHeaderV3View.onWarmupCompleted.TOP;
        } else {
            onwarmupcompleted = TdsListHeaderV3View.onWarmupCompleted.BOTTOM;
        }
        tdsListHeaderV3View.setDescriptionPosition(onwarmupcompleted);
        tdsListHeaderV3View.setRightType((TdsListHeaderV3View.onExtraCallback) null);
        if (tdsListHeaderV3View.getContext().getResources().getConfiguration().fontScale >= 1.2f) {
            int i8 = writeTypedObject + 99;
            extraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                objOnWarmupCompleted = BenefitActivationIntelligence.Type1.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -99900871, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{type1}, 99900872);
            } else {
                objOnWarmupCompleted = BenefitActivationIntelligence.Type1.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -99900871, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{type1}, 99900872);
            }
            strReplace$default = StringsKt.replace$default((String) objOnWarmupCompleted, "\n", " ", false, 4, (Object) null);
        } else {
            strReplace$default = (String) BenefitActivationIntelligence.Type1.onWarmupCompleted(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -99900871, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{type1}, 99900872);
        }
        tdsListHeaderV3View.setTitleText(MiscObjectIdentifiers.onNavigationEvent(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strReplace$default, false, 1, (Object) null)));
        String strAccess100 = type1.access100();
        if (strAccess100 != null) {
            int i9 = writeTypedObject + 17;
            extraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (StringsKt.isBlank(strAccess100)) {
                tdsListHeaderV3View.setDescriptionType((TdsListHeaderV3View.IAuthTabCallback) null);
            } else {
                int i11 = extraCallback + 19;
                writeTypedObject = i11 % 128;
                int i12 = i11 % 2;
                tdsListHeaderV3View.setDescriptionPosition(TdsListHeaderV3View.onWarmupCompleted.BOTTOM);
                tdsListHeaderV3View.setDescriptionType(TdsListHeaderV3View.IAuthTabCallback.TEXT);
                tdsListHeaderV3View.setDescription(type1.access100());
            }
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        Configuration configuration2 = resources2.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        if (readIntokhttp.onExtraCallback(configuration2)) {
            strAsBinder = type1.onExtraCallbackWithResult();
            if (strAsBinder == null) {
                int i13 = writeTypedObject + 53;
                extraCallback = i13 % 128;
                int i14 = i13 % 2;
                strAsBinder = type1.asBinder();
            }
        } else {
            strAsBinder = type1.asBinder();
        }
        String str = strAsBinder;
        if (str == null) {
            FrameLayout frameLayout = this.onWarmupCompleted.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = this.onWarmupCompleted.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
            TdsImageView tdsImageView3 = this.onWarmupCompleted.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            tdsImageView3.setVisibility(8);
            LottieAnimationView lottieAnimationView = this.onWarmupCompleted.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(8);
            this.onWarmupCompleted.IAuthTabCallbackDefault.cancelAnimation();
            TdsImageView tdsImageView4 = this.onWarmupCompleted.getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            tdsImageView4.setVisibility(8);
            TdsImageView tdsImageView5 = this.onWarmupCompleted.ICustomTabsCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView5, "");
            tdsImageView5.setVisibility(8);
            return;
        }
        FrameLayout frameLayout3 = this.onWarmupCompleted.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        frameLayout3.setVisibility(0);
        FrameLayout frameLayout4 = this.onWarmupCompleted.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
        frameLayout4.setVisibility(0);
        TdsImageView tdsImageView6 = this.onWarmupCompleted.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsImageView6, "");
        tdsImageView6.setVisibility(0);
        TdsImageView tdsImageView7 = this.onWarmupCompleted.ICustomTabsCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView7, "");
        tdsImageView7.setVisibility(0);
        boolean zOnExtraCallback = onExtraCallback(str);
        if (zOnExtraCallback) {
            int i15 = extraCallback + 87;
            writeTypedObject = i15 % 128;
            int i16 = i15 % 2;
            this.onWarmupCompleted.asInterface.setVisibility(4);
        } else {
            this.onWarmupCompleted.asInterface.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.onWarmupCompleted.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
        lottieAnimationView2.setVisibility(zOnExtraCallback ? 0 : 8);
        if (zOnExtraCallback) {
            int i17 = extraCallback + 67;
            writeTypedObject = i17 % 128;
            int i18 = i17 % 2;
            LottieAnimationView lottieAnimationView3 = this.onWarmupCompleted.IAuthTabCallbackDefault;
            lottieAnimationView3.setRepeatCount(-1);
            lottieAnimationView3.setAnimationFromUrl(str);
            lottieAnimationView3.playAnimation();
            Intrinsics.checkNotNull(lottieAnimationView3);
        } else {
            this.onWarmupCompleted.IAuthTabCallbackDefault.cancelAnimation();
            TdsImageView tdsImageView8 = this.onWarmupCompleted.asInterface;
            Intrinsics.checkNotNullExpressionValue(tdsImageView8, "");
            TdsImageView.setImage$default(tdsImageView8, str, (Function1) null, (Function1) null, 6, (Object) null);
        }
        Float fIAuthTabCallbackStub = type1.IAuthTabCallbackStub();
        Integer numValueOf = fIAuthTabCallbackStub != null ? Integer.valueOf((int) fIAuthTabCallbackStub.floatValue()) : null;
        Float fOnWarmupCompleted = type1.onWarmupCompleted();
        numValueOf = fOnWarmupCompleted != null ? Integer.valueOf((int) fOnWarmupCompleted.floatValue()) : null;
        if (numValueOf == null || numValueOf == null) {
            return;
        }
        TdsImageView tdsImageView9 = this.onWarmupCompleted.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsImageView9, "");
        ViewGroup.LayoutParams layoutParams = tdsImageView9.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams.width = varyMatches.IAuthTabCallback(numValueOf, context3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        layoutParams.height = varyMatches.IAuthTabCallback(numValueOf, context4);
        tdsImageView9.setLayoutParams(layoutParams);
        LottieAnimationView lottieAnimationView4 = this.onWarmupCompleted.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView4, "");
        ViewGroup.LayoutParams layoutParams2 = lottieAnimationView4.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        layoutParams2.width = varyMatches.IAuthTabCallback(numValueOf, context5);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        layoutParams2.height = varyMatches.IAuthTabCallback(numValueOf, context6);
        lottieAnimationView4.setLayoutParams(layoutParams2);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View = (BenefitActivationIntelligenceType1View) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallback_Parcel.setAlpha(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.access100.setAlpha(1.0f);
        FrameLayout frameLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = benefitActivationIntelligenceType1View.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i4 = extraCallback + 35;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        layoutParams.height = -2;
        frameLayout2.setLayoutParams(layoutParams);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setScaleX(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setScaleY(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.IAuthTabCallbackStub.setShadowAlpha(0.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.onWarmupCompleted.setAlpha(0.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.ICustomTabsCallback.setAlpha(0.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.ICustomTabsCallback.setScaleX(1.0f);
        benefitActivationIntelligenceType1View.onWarmupCompleted.ICustomTabsCallback.setScaleY(1.0f);
        int i6 = writeTypedObject + 73;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static final void onNavigationEvent(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        FrameLayout frameLayout = benefitActivationIntelligenceType1View.onWarmupCompleted.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i4 = extraCallback + 51;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            layoutParams.height = ((Integer) animatedValue).intValue();
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        layoutParams.height = ((Integer) animatedValue2).intValue();
        frameLayout.setLayoutParams(layoutParams);
        int i5 = 12 / 0;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (Unit) onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback(), new Object[]{attachapplovinsdk}, 1692709832, iOnExtraCallback3, -1692709832);
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback(), new Object[]{this}, -690453788, iOnExtraCallback3, 690453790);
    }

    private static final Unit onNavigationEvent(BenefitActivationIntelligenceType1View benefitActivationIntelligenceType1View) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        return (Unit) onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback(), new Object[]{benefitActivationIntelligenceType1View}, 2034909856, iOnExtraCallback3, -2034909853);
    }

    public final void onWarmupCompleted(@NotNull BenefitActivationIntelligence.Type1 type1) {
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, getKekid.onExtraCallback(), new Object[]{this, type1}, 1799294920, iOnExtraCallback3, -1799294919);
    }
}
