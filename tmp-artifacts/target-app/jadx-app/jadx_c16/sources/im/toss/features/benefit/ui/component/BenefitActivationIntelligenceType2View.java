package im.toss.features.benefit.ui.component;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.collect.Synchronized;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View$;
import im.toss.features.tosscert.ui.R;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.HtmlTextView;
import im.toss.tds.view.component.atom.text.SubTypography12;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Address;
import o.AppLovinPostbackService;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselKtExternalSyntheticLambda8;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RecomposerErrorInformation;
import o.RecomposerawaitIdle2;
import o.ScreenBrightnessBridgeExtension1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access13800;
import o.access14000;
import o.access14300;
import o.attachTimestamp;
import o.authenticate;
import o.bindChildren;
import o.component5;
import o.createContact;
import o.deprecated_certificatePinner;
import o.findResAndMsg;
import o.flipHorizontally;
import o.formatMsgs;
import o.getAdService;
import o.getAwbState;
import o.getHumanReadableName;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutions;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.isRepeatingEnabled;
import o.isZslDisabledByByUserCaseConfig;
import o.mExternalSyntheticApiModelOutline1;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI;
import o.readIntokhttp;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.setVisitUrl;
import o.toPreviewOnlyRange;
import o.use;
import o.varyMatches;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BenefitActivationIntelligenceType2View extends FrameLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int extraCallbackWithResult = 1;
    private int IAuthTabCallback;
    private Rally IAuthTabCallbackDefault;
    private Rally IAuthTabCallbackStub;
    private getPackageType IAuthTabCallbackStubProxy;
    private Function0<Unit> access000;
    private Function0<Unit> access100;
    private boolean asBinder;
    private BenefitActivationIntelligence.Type2 asInterface;
    private Function1<? super BenefitActivationIntelligence.Type2, Unit> getInterfaceDescriptor;
    private final createContact onExtraCallback;
    private findResAndMsg onExtraCallbackWithResult;
    private Rally onNavigationEvent;
    private boolean onTransact;
    private Rally onWarmupCompleted;
    private static char[] IAuthTabCallback_Parcel = {32621, 32409, 32613, 32410, 32595, 32550, 32628, 32620, 32618, 32551, 32614, 32608, 32609, 32616, 32619, 32408, 32544, 32617, 32615, 32622, 32549, 32548, 32611, 32411, 32610};
    private static int readTypedObject = -1184334059;
    private static boolean extraCallback = true;
    private static boolean writeTypedObject = true;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -589640928, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{benefitActivationIntelligenceType2View}, 589640932);
        int i4 = ICustomTabsCallback + 89;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, fliphorizontally);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return unitOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7;
        int i8;
        String strIAuthTabCallback;
        Configuration configuration;
        Object obj;
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = ~(i3 | i6);
        int i13 = i11 | i12;
        int i14 = ~i5;
        int i15 = (~(i14 | i6)) | (~(i14 | i3)) | i12;
        int i16 = (~(i9 | i6)) | (~(i10 | i3));
        int i17 = i3 + i6 + i2 + (1040777104 * i) + ((-1861505373) * i4);
        int i18 = i17 * i17;
        int i19 = ((-1036928585) * i3) + 527892480 + ((-1036928585) * i6) + ((-562525036) * i13) + (562525036 * i15) + ((-281262518) * i16) + ((-1318191104) * i2) + (1608515584 * i) + ((-1123418112) * i4) + ((-2114519040) * i18);
        int i20 = (i3 * 1703033811) + 1712528133 + (i6 * 1703033811) + (i13 * 1508) + (i15 * (-1508)) + (i16 * 754) + (i2 * 1703034565) + (i * (-2114876976)) + (i4 * 1880022383) + (i18 * (-720175104));
        switch (i19 + (i20 * i20 * (-739180544))) {
            case 1:
                BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = (BenefitActivationIntelligenceType2View) objArr[0];
                BenefitActivationIntelligence.Type2 type2 = (BenefitActivationIntelligence.Type2) objArr[1];
                int i21 = 2 % 2;
                Intrinsics.checkNotNullParameter(type2, "");
                BenefitActivationIntelligence.Type2 type22 = benefitActivationIntelligenceType2View.asInterface;
                if (!Intrinsics.areEqual(type22 != null ? type22.onWarmupCompleted() : null, type2.onWarmupCompleted())) {
                    int i22 = ICustomTabsCallback + 61;
                    extraCallbackWithResult = i22 % 128;
                    if (i22 % 2 == 0) {
                        benefitActivationIntelligenceType2View.asBinder = false;
                        benefitActivationIntelligenceType2View.onTransact = true;
                    } else {
                        benefitActivationIntelligenceType2View.asBinder = false;
                        benefitActivationIntelligenceType2View.onTransact = false;
                    }
                }
                benefitActivationIntelligenceType2View.asInterface = type2;
                if (benefitActivationIntelligenceType2View.onTransact) {
                    benefitActivationIntelligenceType2View.onExtraCallbackWithResult();
                } else {
                    benefitActivationIntelligenceType2View.IAuthTabCallback++;
                    onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1922873281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{benefitActivationIntelligenceType2View}, -1922873279);
                    SubTypography12 subTypography12 = benefitActivationIntelligenceType2View.onExtraCallback.onNavigationEvent;
                    Intrinsics.checkNotNullExpressionValue(subTypography12, "");
                    if (type2.asBinder()) {
                        i7 = 0;
                    } else {
                        int i23 = extraCallbackWithResult + 17;
                        ICustomTabsCallback = i23 % 128;
                        int i24 = i23 % 2;
                        i7 = 8;
                    }
                    subTypography12.setVisibility(i7);
                    Typography6 typography6 = benefitActivationIntelligenceType2View.onExtraCallback.IAuthTabCallback_Parcel;
                    String strIAuthTabCallback2 = type2.IAuthTabCallback();
                    if (strIAuthTabCallback2 != null) {
                        int i25 = ICustomTabsCallback + 103;
                        extraCallbackWithResult = i25 % 128;
                        if (i25 % 2 == 0) {
                            i8 = StringsKt.isBlank(strIAuthTabCallback2) ? 8 : 1;
                            typography6.setVisibility(i8);
                            Typography6 typography62 = benefitActivationIntelligenceType2View.onExtraCallback.IAuthTabCallback_Parcel;
                            strIAuthTabCallback = type2.IAuthTabCallback();
                            if (strIAuthTabCallback == null) {
                                int i26 = ICustomTabsCallback + 5;
                                extraCallbackWithResult = i26 % 128;
                                int i27 = i26 % 2;
                                strIAuthTabCallback = "";
                            }
                            typography62.setHtml(strIAuthTabCallback);
                            TdsImageView tdsImageView = benefitActivationIntelligenceType2View.onExtraCallback.access100;
                            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                            Context context = benefitActivationIntelligenceType2View.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "");
                            configuration = resources.getConfiguration();
                            Intrinsics.checkNotNullExpressionValue(configuration, "");
                            if (readIntokhttp.onExtraCallback(configuration)) {
                                Object[] objArr2 = new Object[1];
                                a(null, null, new byte[]{-108, -109, -125, -118, -126, -127, -108, -120, -115, -111, -126, -117, -110, -122, -124, -126, -124, -112, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, objArr2);
                                obj = objArr2[0];
                            } else {
                                int i28 = extraCallbackWithResult + 1;
                                ICustomTabsCallback = i28 % 128;
                                if (i28 % 2 != 0) {
                                    Object[] objArr3 = new Object[1];
                                    a(null, null, new byte[]{-108, -109, -125, -118, -103, -104, -121, -110, -111, -126, -117, -110, -122, -124, -126, -124, -112, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 41 - KeyEvent.normalizeMetaState(1), objArr3);
                                    obj = objArr3[0];
                                } else {
                                    Object[] objArr4 = new Object[1];
                                    a(null, null, new byte[]{-108, -109, -125, -118, -103, -104, -121, -110, -111, -126, -117, -110, -122, -124, -126, -124, -112, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, KeyEvent.normalizeMetaState(0) + 127, objArr4);
                                    obj = objArr4[0];
                                }
                            }
                            TdsImageView.setImage$default(tdsImageView, ((String) obj).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                            TdsImageView tdsImageView2 = benefitActivationIntelligenceType2View.onExtraCallback.getInterfaceDescriptor;
                            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                            Object[] objArr5 = new Object[1];
                            a(null, null, new byte[]{-108, -109, -125, -118, -126, -109, -114, -120, -110, -121, -104, -108, -111, -114, -115, -125, -125, -120, -104, -122, -124, -126, -124, -112, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
                            TdsImageView.setImage$default(tdsImageView2, ((String) objArr5[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                            BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnTransact = type2.onTransact();
                            Typography4 typography4 = benefitActivationIntelligenceType2View.onExtraCallback.onActivityResized;
                            Intrinsics.checkNotNullExpressionValue(typography4, "");
                            benefitActivationIntelligenceType2View.onNavigationEvent(paragraphBlockOnTransact, typography4, benefitActivationIntelligenceType2View.IAuthTabCallback);
                            BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnExtraCallbackWithResult = type2.onExtraCallbackWithResult();
                            Typography4 typography42 = benefitActivationIntelligenceType2View.onExtraCallback.asBinder;
                            Intrinsics.checkNotNullExpressionValue(typography42, "");
                            benefitActivationIntelligenceType2View.onNavigationEvent(paragraphBlockOnExtraCallbackWithResult, typography42, benefitActivationIntelligenceType2View.IAuthTabCallback);
                            benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setText(type2.onNavigationEvent());
                            benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setOnClickListener(new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda2(benefitActivationIntelligenceType2View, type2));
                            benefitActivationIntelligenceType2View.onExtraCallbackWithResult(type2, !benefitActivationIntelligenceType2View.asBinder);
                        } else {
                            if (!StringsKt.isBlank(strIAuthTabCallback2)) {
                                i8 = 0;
                            }
                            typography6.setVisibility(i8);
                            Typography6 typography622 = benefitActivationIntelligenceType2View.onExtraCallback.IAuthTabCallback_Parcel;
                            strIAuthTabCallback = type2.IAuthTabCallback();
                            if (strIAuthTabCallback == null) {
                            }
                            typography622.setHtml(strIAuthTabCallback);
                            TdsImageView tdsImageView3 = benefitActivationIntelligenceType2View.onExtraCallback.access100;
                            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
                            Context context2 = benefitActivationIntelligenceType2View.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            Resources resources2 = context2.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources2, "");
                            configuration = resources2.getConfiguration();
                            Intrinsics.checkNotNullExpressionValue(configuration, "");
                            if (readIntokhttp.onExtraCallback(configuration)) {
                            }
                            TdsImageView.setImage$default(tdsImageView3, ((String) obj).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                            TdsImageView tdsImageView22 = benefitActivationIntelligenceType2View.onExtraCallback.getInterfaceDescriptor;
                            Intrinsics.checkNotNullExpressionValue(tdsImageView22, "");
                            Object[] objArr52 = new Object[1];
                            a(null, null, new byte[]{-108, -109, -125, -118, -126, -109, -114, -120, -110, -121, -104, -108, -111, -114, -115, -125, -125, -120, -104, -122, -124, -126, -124, -112, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr52);
                            TdsImageView.setImage$default(tdsImageView22, ((String) objArr52[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
                            BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnTransact2 = type2.onTransact();
                            Typography4 typography43 = benefitActivationIntelligenceType2View.onExtraCallback.onActivityResized;
                            Intrinsics.checkNotNullExpressionValue(typography43, "");
                            benefitActivationIntelligenceType2View.onNavigationEvent(paragraphBlockOnTransact2, typography43, benefitActivationIntelligenceType2View.IAuthTabCallback);
                            BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnExtraCallbackWithResult2 = type2.onExtraCallbackWithResult();
                            Typography4 typography422 = benefitActivationIntelligenceType2View.onExtraCallback.asBinder;
                            Intrinsics.checkNotNullExpressionValue(typography422, "");
                            benefitActivationIntelligenceType2View.onNavigationEvent(paragraphBlockOnExtraCallbackWithResult2, typography422, benefitActivationIntelligenceType2View.IAuthTabCallback);
                            benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setText(type2.onNavigationEvent());
                            benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setOnClickListener(new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda2(benefitActivationIntelligenceType2View, type2));
                            benefitActivationIntelligenceType2View.onExtraCallbackWithResult(type2, !benefitActivationIntelligenceType2View.asBinder);
                        }
                    }
                }
                return null;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(benefitActivationIntelligenceType2View);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = ICustomTabsCallback + 119;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i3 % 128;
        Object obj = null;
        Object[] objArr = new Object[4];
        if (i3 % 2 == 0) {
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = str;
            objArr[2] = cameraCaptureResultEmptyCameraCaptureResult;
            objArr[3] = Integer.valueOf(i);
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            throw null;
        }
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = str;
        objArr[2] = cameraCaptureResultEmptyCameraCaptureResult;
        objArr[3] = Integer.valueOf(i);
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 5213141, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, objArr, -5213136);
        int i4 = ICustomTabsCallback + 47;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = (BenefitActivationIntelligenceType2View) objArr[0];
        BenefitActivationIntelligence.Type2 type2 = (BenefitActivationIntelligence.Type2) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(benefitActivationIntelligenceType2View, type2, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 71;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asInterface(benefitActivationIntelligenceType2View);
        int i4 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallbackDefault implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public IAuthTabCallbackDefault() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                view.removeOnLayoutChangeListener(this);
                BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onWarmupCompleted.getWidth();
                BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onWarmupCompleted.getHeight();
                throw null;
            }
            view.removeOnLayoutChangeListener(this);
            int width = BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onWarmupCompleted.getWidth();
            int height = BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onWarmupCompleted.getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            int i11 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = (int) (width * 1.9f);
            int[] iArr = new int[2];
            BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onWarmupCompleted.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onExtraCallbackWithResult().getLocationInWindow(iArr2);
            int height2 = ((iArr2[1] + BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(BenefitActivationIntelligenceType2View.this).onExtraCallbackWithResult().getHeight()) - iArr[1]) - (width / 2);
            int iIAuthTabCallback = varyMatches.IAuthTabCallback(BenefitActivationIntelligenceType2View.this, 50);
            BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = BenefitActivationIntelligenceType2View.this;
            TdsImageView tdsImageView = BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(benefitActivationIntelligenceType2View).getInterfaceDescriptor;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            BenefitActivationIntelligenceType2View.onNavigationEvent(benefitActivationIntelligenceType2View, tdsImageView, i13, i13, height2 - iIAuthTabCallback);
            BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View2 = BenefitActivationIntelligenceType2View.this;
            TdsImageView tdsImageView2 = BenefitActivationIntelligenceType2View.onExtraCallbackWithResult(benefitActivationIntelligenceType2View2).access100;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            BenefitActivationIntelligenceType2View.onNavigationEvent(benefitActivationIntelligenceType2View2, tdsImageView2, width, width, height2);
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onNavigationEvent + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i2 = onWarmupCompleted + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitActivationIntelligenceType2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        createContact createcontactOnExtraCallbackWithResult = createContact.onExtraCallbackWithResult(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(createcontactOnExtraCallbackWithResult, "");
        this.onExtraCallback = createcontactOnExtraCallbackWithResult;
        createcontactOnExtraCallbackWithResult.onExtraCallbackWithResult.setTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.LARGE, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
        TdsRoundLayout tdsRoundLayout = createcontactOnExtraCallbackWithResult.onTransact;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            Configuration configuration2 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iIntValue = new getUrlokhttp(new onWarmupCompleted(configuration2)).onSessionEnded();
            int i2 = extraCallbackWithResult + 85;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            Configuration configuration3 = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr = {new getUrlokhttp(new onExtraCallback(configuration3))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        tdsRoundLayout.setStrokeColor(iIntValue);
        int i5 = ICustomTabsCallback + 21;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BenefitActivationIntelligenceType2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = extraCallbackWithResult + 15;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = extraCallbackWithResult + 125;
            ICustomTabsCallback = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ String IAuthTabCallback(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, BenefitActivationIntelligence.ParagraphBlock paragraphBlock) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = benefitActivationIntelligenceType2View.onWarmupCompleted(paragraphBlock);
        int i4 = ICustomTabsCallback + 1;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public static final /* synthetic */ createContact onExtraCallbackWithResult(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 27;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        createContact createcontact = benefitActivationIntelligenceType2View.onExtraCallback;
        int i5 = i2 + 41;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return createcontact;
    }

    public static final /* synthetic */ int onNavigationEvent(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = benefitActivationIntelligenceType2View.IAuthTabCallback;
        int i6 = i3 + 7;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, String str, HtmlTextView htmlTextView, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        Object objOnExtraCallback = onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -41559167, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{benefitActivationIntelligenceType2View, str, htmlTextView, access13800Var}, 41559170);
        int i4 = extraCallbackWithResult + 117;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, View view, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 55;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        benefitActivationIntelligenceType2View.onExtraCallbackWithResult(view, i, i2, i3);
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, BenefitActivationIntelligence.Type2 type2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType2View.onExtraCallback(type2);
        int i4 = extraCallbackWithResult + 55;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ CharSequence onWarmupCompleted(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, Spanned spanned, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnWarmupCompleted = benefitActivationIntelligenceType2View.onWarmupCompleted(spanned, bitmapDrawable, bitmapDrawable2);
        int i4 = ICustomTabsCallback + 79;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return charSequenceOnWarmupCompleted;
    }

    public static final /* synthetic */ String onWarmupCompleted(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, BenefitActivationIntelligence.ParagraphBlock paragraphBlock) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return benefitActivationIntelligenceType2View.onExtraCallbackWithResult(paragraphBlock);
        }
        benefitActivationIntelligenceType2View.onExtraCallbackWithResult(paragraphBlock);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 87;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        benefitActivationIntelligenceType2View.onTransact = z;
        int i5 = i2 + 115;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(getsupportedhighspeedresolutions, f);
        int i4 = extraCallbackWithResult + 51;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCoroutineScope(@Nullable findResAndMsg findresandmsg) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = findresandmsg;
        int i5 = i3 + 75;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setOnCtaClick(@Nullable Function1<? super BenefitActivationIntelligence.Type2, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 81;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.getInterfaceDescriptor = function1;
        int i5 = i3 + 5;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnCardShown(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.access000 = function0;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOnImpression(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.access100 = function0;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 43;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onWarmupCompleted(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, BenefitActivationIntelligence.Type2 type2, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function1<? super BenefitActivationIntelligence.Type2, Unit> function1 = benefitActivationIntelligenceType2View.getInterfaceDescriptor;
        if (function1 != null) {
            function1.invoke(type2);
            int i4 = ICustomTabsCallback + 99;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, 1922873281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -1922873279);
            super.onDetachedFromWindow();
            return;
        }
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent4, 1922873281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent3, new Object[]{this}, -1922873279);
        super.onDetachedFromWindow();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        super.onAttachedToWindow();
        BenefitActivationIntelligence.Type2 type2 = this.asInterface;
        if (type2 != null) {
            int i2 = extraCallbackWithResult + 83;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 86 / 0;
                if (this.onTransact) {
                    return;
                }
            } else if (this.onTransact) {
                return;
            }
            int i5 = i3 + 45;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
                if (this.IAuthTabCallbackStubProxy != null) {
                    return;
                }
            } else if (this.IAuthTabCallbackStubProxy != null) {
                return;
            }
            this.onTransact = true;
            onExtraCallbackWithResult(type2);
            onExtraCallbackWithResult();
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback_Parcel;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 121;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 78, View.resolveSize(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 76 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 20952 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                f = 0.0f;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(readTypedObject)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 74 - Process.getGidForName(""), View.getDefaultSize(0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (writeTypedObject) {
            int i6 = $11 + 61;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] % iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 63 - (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                int i9 = $10 + 107;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!extraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 93;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] << iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 27;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] % iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 63 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr8 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback7 == null) {
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), 12214 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r2
      0x0022: PHI (r2v5 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock) = 
      (r2v4 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock)
      (r2v27 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock)
     binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(BenefitActivationIntelligence.Type2 type2, boolean z) throws Throwable {
        BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnTransact;
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            paragraphBlockOnTransact = type2.onTransact();
            int i3 = 65 / 0;
            strOnExtraCallback = paragraphBlockOnTransact != null ? paragraphBlockOnTransact.onExtraCallback() : null;
        } else {
            paragraphBlockOnTransact = type2.onTransact();
            if (paragraphBlockOnTransact != null) {
            }
        }
        if (strOnExtraCallback == null) {
            int i4 = extraCallbackWithResult + 47;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            strOnExtraCallback = "";
        }
        onExtraCallback(strOnExtraCallback, true);
        onWarmupCompleted();
        onExtraCallbackWithResult();
        TdsImageView tdsImageView = this.onExtraCallback.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, isMuted.asBinder(isMuted.onNavigationEvent(new AppLovinSdkSettings(), Float.valueOf(0.0f), Float.valueOf(0.3f), (Function1) null, 4, (Object) null), Float.valueOf(0.8f), Float.valueOf(1.3f), (Function1) null, 4, (Object) null), 0, null, 0, Address.onNavigationEvent.onWarmupCompleted(), 2000, null, 0, 0L, false, 1948, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        this.IAuthTabCallbackStub = rally;
        if (rally != null) {
            int i6 = ICustomTabsCallback + 25;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
        }
        if (z) {
            this.asBinder = true;
            Function0<Unit> function0 = this.access100;
            if (function0 != null) {
                int i8 = extraCallbackWithResult + 103;
                ICustomTabsCallback = i8 % 128;
                int i9 = i8 % 2;
                function0.invoke();
            }
        }
        findResAndMsg findresandmsg = this.onExtraCallbackWithResult;
        this.IAuthTabCallbackStubProxy = findresandmsg != null ? maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new asBinder(type2, null), 3, (Object) null) : null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ BenefitActivationIntelligence.Type2 $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(BenefitActivationIntelligence.Type2 type2, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$data = type2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = BenefitActivationIntelligenceType2View.this.new asBinder(this.$data, access13800Var);
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 85;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallback + 109;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 33;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            }
            BenefitActivationIntelligenceType2View.onWarmupCompleted(BenefitActivationIntelligenceType2View.this, true);
            BenefitActivationIntelligenceType2View.onNavigationEvent(BenefitActivationIntelligenceType2View.this, this.$data);
            Unit unit = Unit.INSTANCE;
            int i11 = onWarmupCompleted + 113;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return unit;
        }
    }

    private final void onExtraCallbackWithResult(BenefitActivationIntelligence.Type2 type2) {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 49;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            type2.onTransact();
            obj.hashCode();
            throw null;
        }
        BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnTransact = type2.onTransact();
        if (paragraphBlockOnTransact != null) {
            int i3 = ICustomTabsCallback + 97;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            strOnExtraCallback = paragraphBlockOnTransact.onExtraCallback();
        } else {
            strOnExtraCallback = null;
        }
        if (strOnExtraCallback == null) {
            int i5 = ICustomTabsCallback + 3;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            strOnExtraCallback = "";
        }
        onExtraCallback(strOnExtraCallback, false);
        this.onExtraCallback.readTypedObject.setAlpha(1.0f);
        this.onExtraCallback.onMinimized.setVisibility(0);
        this.onExtraCallback.onMinimized.setAlpha(0.0f);
        this.onExtraCallback.IAuthTabCallbackStub.setVisibility(0);
        this.onExtraCallback.IAuthTabCallbackStub.setAlpha(1.0f);
        this.onExtraCallback.onExtraCallbackWithResult.setVisibility(0);
        this.onExtraCallback.onExtraCallbackWithResult.setAlpha(1.0f);
        this.onExtraCallback.onExtraCallbackWithResult.setScaleX(1.0f);
        this.onExtraCallback.onExtraCallbackWithResult.setScaleY(1.0f);
        this.onExtraCallback.extraCallback.cancelAnimation();
        this.onExtraCallback.extraCallback.setAlpha(0.0f);
        this.onExtraCallback.extraCallback.setVisibility(4);
        this.onExtraCallback.getInterfaceDescriptor.setAlpha(0.2f);
        this.onExtraCallback.getInterfaceDescriptor.setScaleX(1.0f);
        this.onExtraCallback.getInterfaceDescriptor.setScaleY(1.0f);
        Function0<Unit> function0 = this.access000;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(String str, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
            if (getContext().getResources().getConfiguration().fontScale >= 1.2f) {
                str = StringsKt.replace$default(str, "\n", " ", false, 4, (Object) null);
                int i4 = extraCallbackWithResult + 97;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (getContext().getResources().getConfiguration().fontScale >= 1.2f) {
        }
        String string = StringsKt.trim(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.IAuthTabCallback(str, 0).toString()).toString();
        ComposeView composeView = this.onExtraCallback.IAuthTabCallbackStubProxy;
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1452879635, true, new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda4(z, string))));
        int i6 = ICustomTabsCallback + 45;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $animated;
        final /* synthetic */ getSupportedHighSpeedResolutions $baseTextAlpha$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$animated = z;
            this.$baseTextAlpha$delegate = getsupportedhighspeedresolutions;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$animated, this.$baseTextAlpha$delegate, access13800Var);
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackwithresultCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 34 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 109;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (!this.$animated) {
                    BenefitActivationIntelligenceType2View.onWarmupCompleted(this.$baseTextAlpha$delegate, 1.0f);
                    int i5 = onExtraCallback + 25;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return Unit.INSTANCE;
                }
                int i7 = onExtraCallback + 43;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1990L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            BenefitActivationIntelligenceType2View.onWarmupCompleted(this.$baseTextAlpha$delegate, 1.0f);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        fliphorizontally.IAuthTabCallbackStub(((Float) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -1806325356, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{getsupportedhighspeedresolutions}, 1806325362)).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 3;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        long jNewAuthTabSession;
        long jNewAuthTabSession2;
        long jReceiveFile;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i2 = extraCallbackWithResult + 49;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = ICustomTabsCallback + 123;
            extraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1452879635, iIntValue, -1, "im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.renderTopParagraphText.<anonymous>.<anonymous> (BenefitActivationIntelligenceType2View.kt:227)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(zBooleanValue);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(zBooleanValue ? 0.0f : 1.0f);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(zBooleanValue);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutions);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if ((zOnExtraCallback2 | zOnNavigationEvent2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(zBooleanValue, getsupportedhighspeedresolutions, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(Boolean.valueOf(zBooleanValue), str, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
            mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback onextracallback2 = mExternalSyntheticApiModelOutline1.asInterface.Companion;
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onextracallback2.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i5 = extraCallbackWithResult + 31;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390622375);
                    jNewAuthTabSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 108).receiveFile();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390622375);
                    jNewAuthTabSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).receiveFile();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390623559);
                jNewAuthTabSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newAuthTabSession();
            }
            long j = jNewAuthTabSession;
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390626343);
                jNewAuthTabSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).receiveFile();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390627527);
                jNewAuthTabSession2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newAuthTabSession();
            }
            long j2 = jNewAuthTabSession2;
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            int i6 = ICustomTabsCallback + 55;
            extraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted(j, j2);
                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutions);
                cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                throw null;
            }
            mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStubOnWarmupCompleted = onwarmupcompletedOnExtraCallbackWithResult.onWarmupCompleted(j, j2);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutions);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!zOnNavigationEvent3) {
                int i7 = ICustomTabsCallback + 71;
                extraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda5(getsupportedhighspeedresolutions);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized3), 0.0f, 1, (Object) null);
                AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                getHumanReadableName gethumanreadablenameAccess100 = appLovinPostbackService.access100();
                if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390641159);
                    jReceiveFile = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newAuthTabSession();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1390639975);
                    jReceiveFile = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).receiveFile();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                int i8 = extraCallbackWithResult + 27;
                ICustomTabsCallback = i8 % 128;
                int i9 = i8 % 2;
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                mexternalsyntheticapimodeloutline1.onWarmupCompleted(str, iAuthTabCallbackStubOnWarmupCompleted, quirksExternalSyntheticBackport0OnExtraCallback2, 0, true, gethumanreadablenameAccess100, jReceiveFile, 0L, 0L, fIAuthTabCallback, (bindChildren) null, (use) null, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) null, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, 805330944, 100666368, 253320);
                if (zBooleanValue) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(160439966);
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                    mexternalsyntheticapimodeloutline1.onWarmupCompleted(str, onextracallback2.IAuthTabCallback().onExtraCallbackWithResult(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 0, false, appLovinPostbackService.access100(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable(), 0L, 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), (bindChildren) null, (use) null, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) null, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 805306752, 100666368, 253336);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(160942569);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = extraCallbackWithResult + 81;
                    ICustomTabsCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void asInterface(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.clearAnimation();
        benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setAlpha(0.0f);
        benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setScaleX(0.9f);
        benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setScaleY(0.9f);
        int i4 = extraCallbackWithResult + 11;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        this.onExtraCallback.readTypedObject.setVisibility(0);
        this.onExtraCallback.readTypedObject.setAlpha(1.0f);
        LottieAnimationView lottieAnimationView = this.onExtraCallback.extraCallback;
        lottieAnimationView.setAlpha(1.0f);
        lottieAnimationView.setVisibility(0);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-109, -117, -124, -105, -118, -106, -107, -111, -108, -109, -120, -110, -121, -117, -115, -111, -114, -115, -113, -113, -112, -113, -122, -124, -114, -120, -126, -126, -117, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, View.resolveSizeAndState(0, 0, 0) + 127, objArr);
        lottieAnimationView.setAnimationFromUrl(((String) objArr[0]).intern());
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        this.onExtraCallback.onMinimized.setVisibility(0);
        this.onExtraCallback.onMinimized.setAlpha(0.0f);
        this.onExtraCallback.IAuthTabCallbackStub.setVisibility(0);
        this.onExtraCallback.IAuthTabCallbackStub.setAlpha(0.0f);
        this.onExtraCallback.onExtraCallbackWithResult.post(new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda3(this));
        this.onExtraCallback.getInterfaceDescriptor.setAlpha(0.0f);
        this.onExtraCallback.getInterfaceDescriptor.setScaleX(0.8f);
        this.onExtraCallback.getInterfaceDescriptor.setScaleY(0.8f);
        int i2 = extraCallbackWithResult + 43;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType2View.onExtraCallback.IAuthTabCallbackStub.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 17;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = (BenefitActivationIntelligenceType2View) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult.setAlpha(0.0f);
        TdsButtonV1View tdsButtonV1View = benefitActivationIntelligenceType2View.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        tdsButtonV1View.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 63;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r2
      0x002d: PHI (r2v22 java.lang.Float) = (r2v4 java.lang.Float), (r2v23 java.lang.Float) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r2 r5
      0x0028: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v23 java.lang.Float) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r5v1 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock) = 
      (r5v0 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock)
      (r5v31 im.toss.features.benefit.dto.BenefitActivationIntelligence$ParagraphBlock)
     binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(BenefitActivationIntelligence.Type2 type2) {
        Float fValueOf;
        BenefitActivationIntelligence.ParagraphBlock paragraphBlockOnTransact;
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(1.0f);
            paragraphBlockOnTransact = type2.onTransact();
            strOnExtraCallback = paragraphBlockOnTransact != null ? paragraphBlockOnTransact.onExtraCallback() : null;
        } else {
            fValueOf = Float.valueOf(1.0f);
            paragraphBlockOnTransact = type2.onTransact();
            if (paragraphBlockOnTransact != null) {
            }
        }
        if (strOnExtraCallback == null) {
            int i3 = ICustomTabsCallback + 121;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            strOnExtraCallback = "";
        }
        onExtraCallback(strOnExtraCallback, false);
        Rally rally = this.IAuthTabCallbackStub;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        this.IAuthTabCallbackStub = null;
        this.onExtraCallback.readTypedObject.setAlpha(1.0f);
        this.onExtraCallback.extraCallback.cancelAnimation();
        this.onExtraCallback.extraCallback.setAlpha(0.0f);
        this.onExtraCallback.extraCallback.setVisibility(4);
        this.onExtraCallback.onMinimized.setVisibility(0);
        this.onExtraCallback.onMinimized.setAlpha(0.0f);
        float alpha = this.onExtraCallback.getInterfaceDescriptor.getAlpha();
        float scaleX = this.onExtraCallback.getInterfaceDescriptor.getScaleX();
        TdsImageView tdsImageView = this.onExtraCallback.getInterfaceDescriptor;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = isMuted.asBinder(isMuted.onNavigationEvent(new AppLovinSdkSettings(), Float.valueOf(alpha), Float.valueOf(0.2f), (Function1) null, 4, (Object) null), Float.valueOf(scaleX), fValueOf, (Function1) null, 4, (Object) null);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = (Rally) RallysKt.onWarmupCompleted(new Object[]{tdsImageView, appLovinSdkSettingsAsBinder, 0, null, 0, deprecated_certificatepinner.onExtraCallback(), null, null, 0, 0L, false, 2012, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        LinearLayout linearLayout = this.onExtraCallback.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        this.onNavigationEvent = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayout, AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.SLOW), 0, null, 0, null, null, null, 100, 0L, false, 1788, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda0(this), 1, (Object) null);
        TdsButtonV1View tdsButtonV1View = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        Float f = fValueOf;
        this.onWarmupCompleted = Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsButtonV1View, isMuted.asBinder(isMuted.onNavigationEvent(new AppLovinSdkSettings(), Float.valueOf(0.0f), f, (Function1) null, 4, (Object) null), Float.valueOf(0.9f), f, (Function1) null, 4, (Object) null), 0, null, 0, deprecated_certificatepinner.onExtraCallback(), null, null, 180, 0L, false, 1756, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new BenefitActivationIntelligenceType2View$.ExternalSyntheticLambda1(this), 1, (Object) null);
        Rally rally2 = this.IAuthTabCallbackDefault;
        if (rally2 != null) {
            isFireOS.onExtraCallbackWithResult(rally2, false, 1, (Object) null);
        }
        Rally rally3 = this.onNavigationEvent;
        if (rally3 != null) {
            isFireOS.onExtraCallbackWithResult(rally3, false, 1, (Object) null);
            int i5 = extraCallbackWithResult + 1;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        Rally rally4 = this.onWarmupCompleted;
        if (rally4 != null) {
            isFireOS.onExtraCallbackWithResult(rally4, false, 1, (Object) null);
        }
        Function0<Unit> function0 = this.access000;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r13 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r3 = r12.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return o.maybeUpdateAnimatable.onNavigationEvent(r3, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.onNavigationEvent(r12, r13, r14, r15, (o.access13800) null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r13 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r14.setText("");
        r13 = im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.extraCallbackWithResult + 99;
        im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.ICustomTabsCallback = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if ((r13 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getPackageType onNavigationEvent(BenefitActivationIntelligence.ParagraphBlock paragraphBlock, HtmlTextView htmlTextView, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 27;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = (BenefitActivationIntelligenceType2View) objArr[0];
        String str = (String) objArr[1];
        HtmlTextView htmlTextView = (HtmlTextView) objArr[2];
        access13800 access13800Var = (access13800) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && !StringsKt.isBlank(str)) {
            return maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), benefitActivationIntelligenceType2View.new IAuthTabCallback(str, Math.min(htmlTextView.getTextSize(), htmlTextView.getLineHeight()) + varyMatches.IAuthTabCallback(benefitActivationIntelligenceType2View, access14000.onNavigationEvent(2)), null), access13800Var);
        }
        int i4 = extraCallbackWithResult + 91;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super BitmapDrawable>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $iconUrl;
        final /* synthetic */ float $maxIconHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, float f, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$iconUrl = str;
            this.$maxIconHeight = f;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super BitmapDrawable> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = BenefitActivationIntelligenceType2View.this.new IAuthTabCallback(this.$iconUrl, this.$maxIconHeight, access13800Var);
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[PHI: r1
          0x0035: PHI (r1v10 java.lang.Object) = (r1v4 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r6
          0x0027: PHI (r6v1 int) = (r6v0 int), (r6v7 int) binds: [B:8:0x0025, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 70 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Context context = BenefitActivationIntelligenceType2View.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
                    Context context2 = BenefitActivationIntelligenceType2View.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(this.$iconUrl).onExtraCallbackWithResult();
                    this.label = 1;
                    obj = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = ((RecomposerErrorInformation) obj).onExtraCallbackWithResult();
            if (carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult != null) {
                int i6 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Bitmap bitmapOnExtraCallbackWithResult = CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, 0, 0, 3, (Object) null);
                if (bitmapOnExtraCallbackWithResult != null) {
                    float width = bitmapOnExtraCallbackWithResult.getWidth();
                    float height = this.$maxIconHeight / bitmapOnExtraCallbackWithResult.getHeight();
                    Resources resources = BenefitActivationIntelligenceType2View.this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapOnExtraCallbackWithResult);
                    bitmapDrawable.setBounds(0, 0, (int) (width * height), (int) this.$maxIconHeight);
                    return bitmapDrawable;
                }
            }
            return null;
        }
    }

    private final CharSequence onWarmupCompleted(Spanned spanned, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        int i = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (bitmapDrawable != null) {
            int i2 = ICustomTabsCallback + 95;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(spannableStringBuilder, bitmapDrawable);
                spannableStringBuilder.append(" ");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult(spannableStringBuilder, bitmapDrawable);
            spannableStringBuilder.append(" ");
        }
        spannableStringBuilder.append((CharSequence) spanned);
        if (bitmapDrawable2 != null) {
            int i3 = ICustomTabsCallback + 103;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            spannableStringBuilder.append(" ");
            onExtraCallbackWithResult(spannableStringBuilder, bitmapDrawable2);
        }
        return spannableStringBuilder;
    }

    private final void onExtraCallbackWithResult(SpannableStringBuilder spannableStringBuilder, BitmapDrawable bitmapDrawable) {
        int i = 2 % 2;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("￼");
        spannableStringBuilder.setSpan(new ScreenBrightnessBridgeExtension1(bitmapDrawable), length, length + 1, 33);
        int i2 = extraCallbackWithResult + 107;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View = (BenefitActivationIntelligenceType2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 95;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = benefitActivationIntelligenceType2View.IAuthTabCallbackStubProxy;
        if (getpackagetype != null) {
            int i5 = i2 + 37;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        benefitActivationIntelligenceType2View.IAuthTabCallbackStubProxy = null;
        Rally rally = benefitActivationIntelligenceType2View.IAuthTabCallbackStub;
        if (rally != null) {
            int i7 = extraCallbackWithResult + 125;
            ICustomTabsCallback = i7 % 128;
            int i8 = i7 % 2;
            rally.ICustomTabsServiceStub();
        }
        Rally rally2 = benefitActivationIntelligenceType2View.onNavigationEvent;
        if (rally2 != null) {
            int i9 = extraCallbackWithResult + 115;
            ICustomTabsCallback = i9 % 128;
            if (i9 % 2 != 0) {
                rally2.ICustomTabsServiceStub();
                throw null;
            }
            rally2.ICustomTabsServiceStub();
        }
        Rally rally3 = benefitActivationIntelligenceType2View.onWarmupCompleted;
        if (rally3 != null) {
            int i10 = ICustomTabsCallback + 27;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            rally3.ICustomTabsServiceStub();
            if (i11 == 0) {
                throw null;
            }
        }
        Rally rally4 = benefitActivationIntelligenceType2View.IAuthTabCallbackDefault;
        if (rally4 != null) {
            int i12 = ICustomTabsCallback + 35;
            extraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                rally4.ICustomTabsServiceStub();
                int i13 = 26 / 0;
            } else {
                rally4.ICustomTabsServiceStub();
            }
        }
        benefitActivationIntelligenceType2View.IAuthTabCallbackStub = null;
        benefitActivationIntelligenceType2View.onNavigationEvent = null;
        benefitActivationIntelligenceType2View.onWarmupCompleted = null;
        benefitActivationIntelligenceType2View.IAuthTabCallbackDefault = null;
        benefitActivationIntelligenceType2View.onExtraCallback.extraCallback.cancelAnimation();
        int i14 = ICustomTabsCallback + 87;
        extraCallbackWithResult = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 34 / 0;
        }
        return null;
    }

    private final String onWarmupCompleted(BenefitActivationIntelligence.ParagraphBlock paragraphBlock) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            return paragraphBlock.onExtraCallbackWithResult();
        }
        int i4 = extraCallbackWithResult + 115;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            paragraphBlock.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = paragraphBlock.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            return strIAuthTabCallback;
        }
        int i5 = extraCallbackWithResult + 111;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return paragraphBlock.onExtraCallbackWithResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.ICustomTabsCallback + 121;
        im.toss.features.benefit.ui.component.BenefitActivationIntelligenceType2View.extraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r4.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r4.onWarmupCompleted();
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallbackWithResult(BenefitActivationIntelligence.ParagraphBlock paragraphBlock) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (!readIntokhttp.onExtraCallback(configuration)) {
            String strOnWarmupCompleted = paragraphBlock.onWarmupCompleted();
            int i2 = extraCallbackWithResult + 57;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return strOnWarmupCompleted;
        }
        int i4 = extraCallbackWithResult + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            strOnNavigationEvent = paragraphBlock.onNavigationEvent();
            int i5 = 48 / 0;
        } else {
            strOnNavigationEvent = paragraphBlock.onNavigationEvent();
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        FrameLayout frameLayout = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        if (!(!frameLayout.isLaidOut())) {
            int i2 = extraCallbackWithResult + 117;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!frameLayout.isLayoutRequested()) {
                int width = onExtraCallbackWithResult(this).onWarmupCompleted.getWidth();
                int height = onExtraCallbackWithResult(this).onWarmupCompleted.getHeight();
                if (width != 0 && height != 0) {
                    int i4 = (int) (width * 1.9f);
                    int[] iArr = new int[2];
                    onExtraCallbackWithResult(this).onWarmupCompleted.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    onExtraCallbackWithResult(this).onExtraCallbackWithResult().getLocationInWindow(iArr2);
                    int height2 = ((iArr2[1] + onExtraCallbackWithResult(this).onExtraCallbackWithResult().getHeight()) - iArr[1]) - (width / 2);
                    int iIAuthTabCallback = varyMatches.IAuthTabCallback(this, 50);
                    TdsImageView tdsImageView = onExtraCallbackWithResult(this).getInterfaceDescriptor;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                    onNavigationEvent(this, tdsImageView, i4, i4, height2 - iIAuthTabCallback);
                    TdsImageView tdsImageView2 = onExtraCallbackWithResult(this).access100;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                    onNavigationEvent(this, tdsImageView2, width, width, height2);
                }
                int i5 = extraCallbackWithResult + 15;
                ICustomTabsCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        frameLayout.addOnLayoutChangeListener(new IAuthTabCallbackDefault());
    }

    private final void onExtraCallbackWithResult(View view, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = ICustomTabsCallback + 123;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i7 = ICustomTabsCallback + 77;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            view.setX((this.onExtraCallback.onWarmupCompleted.getWidth() - i) / 2.0f);
            view.setY(i3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = extraCallbackWithResult + 31;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fOnNavigationEvent);
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = extraCallbackWithResult + 25;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View, BenefitActivationIntelligence.Type2 type2, View view) throws Throwable {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, 1457731829, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{benefitActivationIntelligenceType2View, type2, view}, -1457731829);
    }

    private final void onExtraCallback() throws Throwable {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, 1922873281, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{this}, -1922873279);
    }

    private final Object onExtraCallback(String str, HtmlTextView htmlTextView, access13800<? super BitmapDrawable> access13800Var) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -41559167, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, str, htmlTextView, access13800Var}, 41559170);
    }

    private static final Unit onTransact(BenefitActivationIntelligenceType2View benefitActivationIntelligenceType2View) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -589640928, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{benefitActivationIntelligenceType2View}, 589640932);
    }

    private static final Unit onExtraCallbackWithResult(boolean z, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 5213141, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, objArr, -5213136);
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return ((Float) onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -1806325356, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{getsupportedhighspeedresolutions}, 1806325362)).floatValue();
    }

    public final void onWarmupCompleted(@NotNull BenefitActivationIntelligence.Type2 type2) throws Throwable {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onExtraCallback(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent2, -1913386974, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, type2}, 1913386975);
    }
}
