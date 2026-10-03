package viva.republica.toss.password.reset;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.define.MobileCarrier;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.state.spec.SessionState;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AdSettingsIntegrationErrorMode;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_VerifyEnvelopeVID;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ConvertByteArrayToFloatArray;
import o.DebugCorePackageExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EmbeddingAdapterExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IndicatorView;
import o.MapConverter;
import o.NetConverter3;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.addExtra;
import o.addPolicy;
import o.checkDeviceBrand;
import o.clearTid;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getTypeID;
import o.getUrlokhttp;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.notifyEdgeReached;
import o.onPageExit;
import o.overrideEventDispatcher;
import o.readIntokhttp;
import o.readTimeout;
import o.response;
import o.setAdVideoPlaybackListener;
import o.setOriginText;
import o.setRandomHost;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.network.model.verify.SessionKnownType;
import viva.republica.toss.network.model.verify.SessionType;
import viva.republica.toss.password.PasswordSettingActivity;

@EmbeddingAdapterExternalSyntheticLambda2
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordResetIntroActivity extends Hilt_PasswordResetIntroActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static final String IAuthTabCallbackStub;
    private static int[] ICustomTabsCallback = null;
    private static final String asBinder;
    private static final String asInterface;
    private static long extraCallback = 0;
    private static int onActivityLayout = 0;
    private static int onMinimized = 1;
    private static final String onTransact;
    private static int readTypedObject = 1;
    private static int writeTypedObject;
    private boolean access100;
    private getPackageType getInterfaceDescriptor;

    @Inject
    public Object mobileIdManager;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asBinder(this));
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Boolean.valueOf(PasswordResetIntroActivity.onExtraCallbackWithResult(this.f$0));
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> extraCallbackWithResult = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            return PasswordResetIntroActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback_Parcel = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            return (Unit) PasswordResetIntroActivity.IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -145054211, 145054215);
        }
    });

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[notifyEdgeReached.values().length];
            try {
                iArr[notifyEdgeReached.TELCO_SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[setOriginText.values().length];
            try {
                iArr2[setOriginText.USIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[setOriginText.ARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setOriginText.SMS_MO.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[setOriginText.SMS_MT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{-398220689, 1027021820, 1290035990, 1257265977}, View.combineMeasuredStates(0, 0) + 6, objArr);
        asBinder = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(new char[]{21635, 21719, 4970, 28399, 37350, 27239, 48876, 41867, 7042, 51003}, KeyEvent.getDeadChar(0, 0), objArr2);
        asInterface = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        c(new char[]{22050, 22134, 13134, 20171, 33906, 32755, 24870, 41256, 15285, 6385}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        onTransact = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        c(new char[]{11779, 11846, 53627, 44277, 5305, 61249, 2933, 55578, 55684, 29349, 7180, 556, 49388, 49184, 1353, 6870, 51289, 53119, 3760, 11627}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        IAuthTabCallbackStub = ((String) objArr4[0]).intern();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = onMinimized + 71;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        Pair pairIAuthTabCallback;
        Object obj;
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i5 | i6);
        int i13 = i5 + i6 + i3 + ((-2027816600) * i2) + ((-1234684791) * i4);
        int i14 = i13 * i13;
        int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i6) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i3) + (811597824 * i2) + (1100742656 * i4) + (1751056384 * i14);
        int i16 = ((i5 * 572746074) - 905264446) + (i6 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i3 * 572745585) + (i2 * 982511336) + (i4 * (-774025351)) + (i14 * 1257177088);
        switch (i15 + (i16 * i16 * 1874919424)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                PasswordResetIntroActivity passwordResetIntroActivity = (PasswordResetIntroActivity) objArr[0];
                int i17 = 2 % 2;
                int i18 = writeTypedObject + 47;
                readTypedObject = i18 % 128;
                int i19 = i18 % 2;
                passwordResetIntroActivity.updateVisuals();
                int i20 = writeTypedObject + 59;
                readTypedObject = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                PasswordResetIntroActivity passwordResetIntroActivity2 = (PasswordResetIntroActivity) objArr[0];
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
                int i22 = 2 % 2;
                Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
                int iOnNavigationEvent = iEngagementSignalsCallbackDefault.onNavigationEvent();
                if (iOnNavigationEvent == -1) {
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(passwordResetIntroActivity2), (CoroutineContext) null, (setRandomHost) null, passwordResetIntroActivity2.new IAuthTabCallbackStub(iEngagementSignalsCallbackDefault, null), 3, (Object) null);
                } else if (iOnNavigationEvent != 4) {
                    int i23 = readTypedObject + 21;
                    writeTypedObject = i23 % 128;
                    int i24 = i23 % 2;
                    if (iOnNavigationEvent != 6) {
                        passwordResetIntroActivity2.setEngagementSignalsCallback();
                    } else {
                        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
                            int i25 = writeTypedObject + 57;
                            readTypedObject = i25 % 128;
                            if (i25 % 2 == 0) {
                                Object[] objArr2 = new Object[1];
                                c(new char[]{21635, 21719, 4970, 28399, 37350, 27239, 48876, 41867, 7042, 51003}, ViewConfiguration.getJumpTapTimeout() / 90, objArr2);
                                obj = objArr2[0];
                            } else {
                                Object[] objArr3 = new Object[1];
                                c(new char[]{21635, 21719, 4970, 28399, 37350, 27239, 48876, 41867, 7042, 51003}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr3);
                                obj = objArr3[0];
                            }
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) obj).intern(), SessionKnownType.RESET_PASSWORD_UNDER_AGE);
                        } else {
                            Object[] objArr4 = new Object[1];
                            c(new char[]{22050, 22134, 13134, 20171, 33906, 32755, 24870, 41256, 15285, 6385}, View.getDefaultSize(0, 0), objArr4);
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), SessionKnownType.RESET_PASSWORD);
                        }
                        passwordResetIntroActivity2.onExtraCallbackWithResult((String) pairIAuthTabCallback.onExtraCallbackWithResult(), (SessionKnownType) pairIAuthTabCallback.IAuthTabCallback());
                        int i26 = writeTypedObject + 57;
                        readTypedObject = i26 % 128;
                        int i27 = i26 % 2;
                    }
                } else {
                    passwordResetIntroActivity2.finish();
                }
                return Unit.INSTANCE;
            case 6:
                return onNavigationEvent(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, PasswordResetIntroActivity passwordResetIntroActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, passwordResetIntroActivity);
        int i4 = writeTypedObject + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = writeTypedObject + 59;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PasswordResetIntroActivity passwordResetIntroActivity = (PasswordResetIntroActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(passwordResetIntroActivity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(passwordResetIntroActivity, iEngagementSignalsCallbackDefault);
        int i3 = writeTypedObject + 79;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, String str, SessionKnownType sessionKnownType, DebugCorePackageExternalSyntheticLambda1 debugCorePackageExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, str, sessionKnownType, debugCorePackageExternalSyntheticLambda1}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -207695290, 207695292);
        int i4 = readTypedObject + 75;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, iEngagementSignalsCallbackDefault}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176697550, 176697555);
        }
        Unit unit = (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, iEngagementSignalsCallbackDefault}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176697550, 176697555);
        int i3 = 86 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(passwordResetIntroActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(passwordResetIntroActivity, setDetectableSize);
        int i3 = writeTypedObject + 29;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, boolean z2, PasswordResetIntroActivity passwordResetIntroActivity, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 3;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, z2, passwordResetIntroActivity, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 83 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(passwordResetIntroActivity);
        int i4 = readTypedObject + 69;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = readTypedObject + 19;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PasswordResetIntroActivity passwordResetIntroActivity, String str, SessionKnownType sessionKnownType, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordResetIntroActivity, str, sessionKnownType, th);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordResetIntroActivity passwordResetIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(passwordResetIntroActivity, setDetectableSize);
        }
        onExtraCallback(passwordResetIntroActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{function1, obj}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -4052216, 4052216);
        int i4 = readTypedObject + 19;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class asBinder implements Function0<CERT_VerifyEnvelopeVID> {
        final /* synthetic */ Activity IAuthTabCallback;

        public asBinder(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_VerifyEnvelopeVID invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_VerifyEnvelopeVID.onExtraCallback(layoutInflater);
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<DebugCorePackageExternalSyntheticLambda1> apply(writeRaw<BaseApiResponse<DebugCorePackageExternalSyntheticLambda1>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass2 anonymousClass2 = new Function1<BaseApiResponse<DebugCorePackageExternalSyntheticLambda1>, deserializeIp<? extends DebugCorePackageExternalSyntheticLambda1>>() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity.asInterface.2
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends DebugCorePackageExternalSyntheticLambda1> invoke(BaseApiResponse<DebugCorePackageExternalSyntheticLambda1> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = DebugCorePackageExternalSyntheticLambda1.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass2) { // from class: o.UtilsKtExternalSyntheticLambda17$ComponentDialogExternalSyntheticLambda0
                private final /* synthetic */ Function1 onNavigationEvent;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass2, "");
                    this.onNavigationEvent = anonymousClass2;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onNavigationEvent.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PasswordResetIntroActivity passwordResetIntroActivity = (PasswordResetIntroActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        Function0<Unit> function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        passwordResetIntroActivity.onExtraCallbackWithResult(zBooleanValue, zBooleanValue2, function0);
        int i4 = writeTypedObject + 59;
        readTypedObject = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        passwordResetIntroActivity.IAuthTabCallback(intent);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        passwordResetIntroActivity.getInterfaceDescriptor = getpackagetype;
        int i5 = i3 + 117;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PasswordResetIntroActivity passwordResetIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1633902865, -1633902859);
        int i4 = readTypedObject + 9;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i2 = writeTypedObject + 81;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 36 / 0;
            }
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = readTypedObject + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final CERT_VerifyEnvelopeVID ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = this.IAuthTabCallbackStubProxy.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (CERT_VerifyEnvelopeVID) value;
        }
        Object value2 = this.IAuthTabCallbackStubProxy.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(extraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 27;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(extraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 45812), 84 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 21234 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 14185), View.MeasureSpec.getSize(0) + 19, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 3;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private final boolean ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access000.getValue();
        if (i3 == 0) {
            return ((Boolean) value).booleanValue();
        }
        ((Boolean) value).booleanValue();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallback(PasswordResetIntroActivity passwordResetIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = passwordResetIntroActivity.getIntent();
        Object[] objArr = new Object[1];
        c(new char[]{53680, 53749, 41249, 56495, 35411, 29099, 36338, 9897, 43486, 62498, 33510, 33963, 16223, 45167, 39845, 40031, 14325, 48942, 36941, 44013, 3203, 34780, 43251, 41631, 1368, 36448, 41372, 47691, 7671, 38150, 46661, 45556, 4743, 40386, 52988, 51328, 27445, 58484, 51074}, KeyEvent.getMaxKeyCode() >> 16, objArr);
        boolean booleanExtra = intent.getBooleanExtra(((String) objArr[0]).intern(), false);
        int i4 = readTypedObject + 83;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ IEngagementSignalsCallbackDefault $it;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        private static final byte[] $$a = {74, 75, -50, -9};
        private static final int $$b = 26;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {56185, 8035, 21318, 38718, 52058, 3862, 17381, 34706, 64509, 16304, 29583, 46689, 59983, 11855, 25135, 42581, 39610, 57056, 4815, 22196, 35477, 52880, 367, 17682, 47485, 64811, 12548, 30180, 43477, 60873, 8623, 26069, 22586, 40053, 53315, 5158, 18450, 35906, 49385, 1245, 30888, 48301, 61599, 11110, 28499, 41804, 59183};
        private static long onExtraCallback = -3347614714790336052L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, byte r8) {
            /*
                byte[] r0 = viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.$$a
                int r8 = r8 * 3
                int r8 = r8 + 97
                int r7 = r7 + 4
                int r6 = r6 * 2
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r7]
            L26:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.$$c(int, int, byte):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$it = iEngagementSignalsCallbackDefault;
        }

        public static /* synthetic */ Unit onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(passwordResetIntroActivity, iEngagementSignalsCallbackDefault);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordResetIntroActivity, iEngagementSignalsCallbackDefault);
            int i3 = onNavigationEvent + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 22 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = PasswordResetIntroActivity.this.new IAuthTabCallbackStub(this.$it, access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackStubCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackStubCreate.invokeSuspend(unit);
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static long onExtraCallback = -2963018772077564490L;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            int I$0;
            int I$1;
            Object L$0;
            int label;

            onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(access13800Var);
                int i2 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 1 / 0;
                }
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Boolean> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted(findresandmsg, access13800Var);
                }
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 78 / 0;
                }
                return objInvokeSuspend;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    int i3 = $11 + 101;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 19627 - View.MeasureSpec.getSize(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 59 - Color.alpha(0), Color.green(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
                while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58, (ViewConfiguration.getEdgeSlop() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i6 = $11 + 45;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                }
                objArr[0] = new String(cArr2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = onExtraCallbackWithResult + 103;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                            Object[] objArr = new Object[1];
                            a(new char[]{10466, 60245, 44935, 25586, 9845, 64124, 48848, 29010, 13582, 51630, 36342, 16437, 1160, 55517, 39682, 24381, 5105, 55270, 59998, 44680, 25290, 9514, 63850, 48610, 28766, 13381, 51341, 36064, 20258, 875, 51154, 39501, 24065, 4771, 55010, 59722, 44445, 24968, 9276, 63613, 48315, 32531, 13126, 63378, 35828, 20030, 610}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 50101, objArr);
                            throw new IllegalStateException(((String) objArr[0]).intern());
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion = Result.Companion;
                        Object obj3 = null;
                        writeRaw writerawOnExtraCallbackWithResult = getTypeID.onExtraCallbackWithResult(getTypeID.IAuthTabCallback, (Long) null, 1, (Object) null);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, this);
                        if (obj == objOnWarmupCompleted) {
                            int i4 = onExtraCallbackWithResult + 67;
                            onWarmupCompleted = i4 % 128;
                            if (i4 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            obj3.hashCode();
                            throw null;
                        }
                    }
                    obj2 = Result.constructor-impl(obj);
                    int i5 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 5;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (Result.exceptionOrNull-impl(obj2) == null) {
                    return obj2;
                }
                int i7 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i7 % 128;
                return i7 % 2 != 0 ? access14000.onNavigationEvent(true) : access14000.onNavigationEvent(false);
            }
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            int I$0;
            int I$1;
            Object L$0;
            int label;
            private static final byte[] $$a = {77, -67, -125, 9};
            private static final int $$b = 134;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private static char[] onExtraCallback = {30451, 17548, 4614, 57739, 48964, 35477, 22545, 6107, 58719, 45191, 36375, 23996, 11065, 59044, 46115, 33764, 20832, 11455, 64063, 51633, 34619, 21155, 8267, 65419, 52495, 39116, 22092, 9673, 62291, 52946, 40019, 27540, 14608, 62714, 49763, 37363, 28524, 15009, 2173, 51188, 38250, 24826, 15975, 3099, 56197, 43271, 25731};
            private static long onExtraCallbackWithResult = 8196285997401038761L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 97 - r7
                    int r6 = r6 * 3
                    int r0 = 1 - r6
                    int r8 = r8 + 4
                    byte[] r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.onWarmupCompleted.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L17
                    r4 = r6
                    r7 = r8
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r8 = r8 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L25:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2c:
                    int r4 = -r4
                    int r8 = r8 + r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.onWarmupCompleted.$$c(byte, short, byte):java.lang.String");
            }

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
                int i2 = onNavigationEvent + 111;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnNavigationEvent;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = onNavigationEvent + 27;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                            Object[] objArr = new Object[1];
                            a((-1) - TextUtils.lastIndexOf("", '0'), ExpandableListView.getPackedPositionChild(0L) + 48, (char) (39748 - ExpandableListView.getPackedPositionGroup(0L)), objArr);
                            throw new IllegalStateException(((String) objArr[0]).intern());
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion = Result.Companion;
                        getTypeID gettypeid = getTypeID.IAuthTabCallback;
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = gettypeid.onNavigationEvent(this);
                        if (obj == objOnWarmupCompleted) {
                            int i4 = onNavigationEvent + 103;
                            IAuthTabCallback = i4 % 128;
                            if (i4 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }
                    objOnNavigationEvent = Result.constructor-impl(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion2 = Result.Companion;
                    objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e2));
                    int i5 = IAuthTabCallback + 73;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception e3) {
                    Result.Companion companion3 = Result.Companion;
                    objOnNavigationEvent = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (Result.exceptionOrNull-impl(objOnNavigationEvent) != null) {
                    objOnNavigationEvent = access14000.onNavigationEvent(false);
                }
                int i7 = IAuthTabCallback + 29;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return objOnNavigationEvent;
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                long[] jArr = new long[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                    int i4 = $10 + 19;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 59697), (KeyEvent.getMaxKeyCode() >> 16) + 17, ExpandableListView.getPackedPositionGroup(0L) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 30 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), KeyEvent.getDeadChar(0, 0) + 44, 1494 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                    int i7 = $10 + 51;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49124), (ViewConfiguration.getTapTimeout() >> 16) + 44, 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i9 = $11 + 87;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                }
                String str = new String(cArr);
                int i11 = $10 + 43;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                objArr[0] = str;
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            int label;
            private static final byte[] $$a = {70, 83, 77, 1};
            private static final int $$b = 227;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static long onNavigationEvent = 7798559133331975163L;
            private static int onExtraCallback = -1776194565;
            private static char onWarmupCompleted = 53040;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(short r5, byte r6, byte r7) {
                /*
                    int r6 = r6 + 4
                    int r5 = r5 * 3
                    int r0 = r5 + 1
                    byte[] r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.onExtraCallbackWithResult.$$a
                    int r7 = 110 - r7
                    byte[] r0 = new byte[r0]
                    r2 = -1
                    if (r1 != 0) goto L12
                    r3 = r2
                    r2 = r6
                    goto L2b
                L12:
                    r4 = r7
                    r7 = r6
                    r6 = r4
                L15:
                    int r2 = r2 + 1
                    byte r3 = (byte) r6
                    int r7 = r7 + 1
                    r0[r2] = r3
                    if (r2 != r5) goto L25
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r0, r6)
                    return r5
                L25:
                    r3 = r1[r7]
                    r4 = r2
                    r2 = r7
                    r7 = r3
                    r3 = r4
                L2b:
                    int r7 = -r7
                    int r6 = r6 + r7
                    r7 = r2
                    r2 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.onExtraCallbackWithResult.$$c(short, byte, byte):java.lang.String");
            }

            onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
                int i2 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Boolean> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(findresandmsg, access13800Var);
                }
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) throws Throwable {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                    int i4 = 33 / 0;
                } else {
                    objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                boolean zOnExtraCallback = false;
                if (this.label != 0) {
                    Object[] objArr = new Object[1];
                    a((char) ExpandableListView.getPackedPositionType(0L), 103321554 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{17496, 34462, 52511, 12555, 26670, 23452, 33936, 47203, 53679, 34974, 24480, 18224, 40981, 2946, 46013, 45737, 12523, 43149, 11706, 51653, 5761, 27859, 31475, 63182, 53525, 32107, 42354, 48122, 10463, 64370, 17623, 62443, 11396, 64045, 32584, 10815, 50932, 6872, 1522, 19776, 42138, 23221, 33167, 28022, 28904, 60341, 24316}, new char[]{0, 0, 0, 0}, new char[]{53862, 10383, 54278, 62499}, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i5 = i3 + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 == 0 ? Build.VERSION.SDK_INT >= 34 : Build.VERSION.SDK_INT >= 8) {
                    TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityService = addPolicy.ITrustedWebActivityService();
                    Object[] objArr2 = new Object[1];
                    a((char) (44375 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (-1479806260) - Process.getGidForName(""), new char[]{8006, 13437, 6651, 14076, 33540, 40709, 54250, 7342, 25139, 23045, 56232, 63151, 34272, 27278, 14555, 28259, 30498}, new char[]{0, 0, 0, 0}, new char[]{52638, 52210, 22439, 173}, objArr2);
                    zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityService.onExtraCallback(((String) objArr2[0]).intern(), false);
                }
                return access14000.onNavigationEvent(zOnExtraCallback);
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                int i4 = 0;
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                int i5 = $11 + 83;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i7 = $11 + 39;
                    $10 = i7 % 128;
                    int i8 = i7 % i2;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', i4));
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 43;
                            int deadChar = 1451 - KeyEvent.getDeadChar(i4, i4);
                            byte b = $$a[3];
                            byte b2 = (byte) (b - 1);
                            byte b3 = (byte) (-b);
                            String str$$c = $$c(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[1];
                            clsArr[i4] = Object.class;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, jumpTapTimeout, deadChar, 228868077, false, str$$c, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            char c2 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122);
                            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i4) + 44;
                            int offsetBefore = TextUtils.getOffsetBefore("", i4) + 1494;
                            byte b4 = $$a[3];
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, absoluteGravity, offsetBefore, 1533236389, false, $$c((byte) (b4 - 1), (byte) (-b4), b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 50, 22939 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, View.getDefaultSize(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        i2 = 2;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArr6);
                int i9 = $11 + 95;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x02cd  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r36, int r37, char r38, java.lang.Object[] r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 727
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.a(int, int, char, java.lang.Object[]):void");
        }

        private static final Unit onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                PasswordResetIntroActivity.onExtraCallback(passwordResetIntroActivity, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i3 = IAuthTabCallback + 45;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            PasswordResetIntroActivity.onExtraCallback(passwordResetIntroActivity, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            Unit unit2 = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
        
            if (r2 != r10) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallbackStub.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.password.reset.PasswordResetIntroActivity r4, o.IEngagementSignalsCallbackDefault r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject
            int r1 = r1 + 111
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = -1
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            int r5 = r5.onNavigationEvent()
            r1 = 8
            int r1 = r1 / 0
            if (r5 != r3) goto L34
            goto L28
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            int r5 = r5.onNavigationEvent()
            if (r5 != r3) goto L34
        L28:
            r4.setResult(r3)
            int r5 = viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject
            int r5 = r5 + 67
            int r1 = r5 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject = r1
            int r5 = r5 % r0
        L34:
            r4.finish()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallback(viva.republica.toss.password.reset.PasswordResetIntroActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ICustomTabsCallback;
        float f = 0.0f;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 72, 8848 - (ViewConfiguration.getTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 49;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    f = 0.0f;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 33;
                $10 = i11 % 128;
                if (i11 % i3 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 71 - MotionEvent.axisFromString(""), 8848 - TextUtils.indexOf("", "", i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 8847 - TextUtils.indexOf((CharSequence) "", '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $11 + 75;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39, 10301 - (ViewConfiguration.getEdgeSlop() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i12 += 124;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 22252), 39 - View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i12++;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 79, AndroidCharacter.getMirror('0') + 7350, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.getScreenParams():java.util.Map");
    }

    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static char[] onWarmupCompleted = {32398, 32435, 32447, 32441, 32394, 32436, 32386, 32440, 32397, 32388, 32390, 32443, 32444, 32399, 32392, 32387};
        private static int onExtraCallbackWithResult = -1184334005;
        private static boolean onExtraCallback = true;
        private static boolean onNavigationEvent = true;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            long j = 0;
            if (cArr2 != null) {
                int i4 = $11 + 53;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 109;
                    $10 = i7 % 128;
                    if (i7 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 78 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 20952 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i6 >>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 77 - (ViewConfiguration.getLongPressTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    }
                    int i8 = $10 + 79;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                    j = 0;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 75 - KeyEvent.getDeadChar(0, 0), 16038 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            int i10 = 1052772399;
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $11 + 123;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] << iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62, TextUtils.indexOf((CharSequence) "", '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - ExpandableListView.getPackedPositionGroup(0L), 12213 - ExpandableListView.getPackedPositionChild(0L), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i12 = $10 + 65;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i10);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62, 12214 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
                i10 = 1052772399;
            }
            objArr[0] = new String(cArr6);
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent onNavigationEvent(IAuthTabCallback iAuthTabCallback, Context context, boolean z, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            int i4 = i3 % 128;
            IAuthTabCallbackDefault = i4;
            int i5 = i3 % 2;
            if ((i & 2) != 0) {
                int i6 = i4 + 105;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            Intent intentOnExtraCallback = iAuthTabCallback.onExtraCallback(context, z);
            int i8 = IAuthTabCallback + 37;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return intentOnExtraCallback;
        }

        public final Intent onExtraCallback(@NotNull Context context, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) PasswordResetIntroActivity.class);
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -117, -127, -112, -113, -120, -122, -114, -124, -118, -115, -120, -120, -123, -116, -122, -125, -127, -120, -127, -124, -122, -117, -118, -124, -119, -122, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = IAuthTabCallback + 3;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return intentPutExtra;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r3
      0x0040: PHI (r3v7 o.IPostMessageServiceStubProxy) = (r3v6 o.IPostMessageServiceStubProxy), (r3v15 o.IPostMessageServiceStubProxy) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetIntroActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final PasswordResetIntroActivity passwordResetIntroActivity = (PasswordResetIntroActivity) objArr[0];
        int i = 2 % 2;
        AnimateText animateText = passwordResetIntroActivity.ICustomTabsServiceDefault().IAuthTabCallback;
        animateText.setTypography(3);
        animateText.setFont(response.Bold);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onRelationshipValidationResult());
        String string = animateText.getContext().getString(R.string.app_password_reset_guide_title, PlayerErrorCode.onPostMessage());
        Intrinsics.checkNotNullExpressionValue(string, "");
        AnimateText.onExtraCallback(animateText, string, readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        ConstraintLayout constraintLayout = passwordResetIntroActivity.ICustomTabsServiceDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        ConvertByteArrayToFloatArray.onExtraCallback(1222273L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return PasswordResetIntroActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(PasswordResetIntroActivity passwordResetIntroActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 55;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(passwordResetIntroActivity.getScreenParams());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(passwordResetIntroActivity.getScreenParams());
        Unit unit2 = Unit.INSTANCE;
        int i3 = writeTypedObject + 103;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        IndicatorView indicatorView = IndicatorView.RESET_PASSWORD;
        Object[] objArr = new Object[1];
        c(new char[]{15308, 15269, 36750, 62006, 48269, 18247, 58223, 52475, 34671, 39553, 46108, 59951, 54533, 40640, 44414}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), indicatorView.getLogValue());
        Object[] objArr2 = new Object[1];
        a(new int[]{1849558640, -620235713, -1950211015, -252374715}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), indicatorView.getLoginYN());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(final boolean z, final boolean z2, final Function0<Unit> function0) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1376136L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PasswordResetIntroActivity.onNavigationEvent((SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        ComposeView composeView = ICustomTabsServiceDefault().asBinder;
        Intrinsics.checkNotNull(composeView);
        composeView.setVisibility(0);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1153350253, true, new Function2() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2) {
                return PasswordResetIntroActivity.onExtraCallbackWithResult(z, z2, this, function0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{513912980, -1800214942, -1414016188, 1657469749, -315611974, 2046197717}, 11 - ImageFormat.getBitsPerPixel(0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), passwordResetIntroActivity.getString(R.string.app_password_reset_intro_cta));
        IndicatorView indicatorView = IndicatorView.RESET_PASSWORD;
        Object[] objArr2 = new Object[1];
        c(new char[]{15308, 15269, 36750, 62006, 48269, 18247, 58223, 52475, 34671, 39553, 46108, 59951, 54533, 40640, 44414}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), indicatorView.getLogValue());
        Object[] objArr3 = new Object[1];
        a(new int[]{1849558640, -620235713, -1950211015, -252374715}, MotionEvent.axisFromString("") + 9, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), indicatorView.getLoginYN());
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Function0 function0, final PasswordResetIntroActivity passwordResetIntroActivity) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1376138L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return PasswordResetIntroActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(boolean r15, boolean r16, final viva.republica.toss.password.reset.PasswordResetIntroActivity r17, final kotlin.jvm.functions.Function0 r18, o.CameraCaptureResultEmptyCameraCaptureResult r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallback(boolean, boolean, viva.republica.toss.password.reset.PasswordResetIntroActivity, kotlin.jvm.functions.Function0, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r14) throws java.lang.Throwable {
        /*
            r0 = 0
            r0 = r14[r0]
            viva.republica.toss.password.reset.PasswordResetIntroActivity r0 = (viva.republica.toss.password.reset.PasswordResetIntroActivity) r0
            r1 = 1
            r2 = r14[r1]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            r4 = r14[r3]
            viva.republica.toss.network.model.verify.SessionKnownType r4 = (viva.republica.toss.network.model.verify.SessionKnownType) r4
            r5 = 3
            r14 = r14[r5]
            o.DebugCorePackageExternalSyntheticLambda1 r14 = (o.DebugCorePackageExternalSyntheticLambda1) r14
            int r5 = r3 % r3
            int r5 = viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject
            int r5 = r5 + 53
            int r6 = r5 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject = r6
            int r5 = r5 % r3
            r6 = 0
            if (r5 == 0) goto L9d
            o.getNativeProtocolAudience r14 = r14.IAuthTabCallback()
            if (r14 == 0) goto L97
            int r5 = viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject
            int r5 = r5 + 87
            int r7 = r5 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject = r7
            int r5 = r5 % r3
            if (r5 != 0) goto L76
            java.lang.Object[] r13 = new java.lang.Object[]{r14}
            int r10 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r8 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r9 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r11 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            r12 = 681842183(0x28a41607, float:1.821721E-14)
            r7 = -681842182(0xffffffffd75be9fa, float:-2.4179797E14)
            java.lang.Object r5 = o.getNativeProtocolAudience.onExtraCallback(r7, r8, r9, r10, r11, r12, r13)
            o.ReactPackageHelpergetNativeModuleIterator11 r5 = (o.ReactPackageHelpergetNativeModuleIterator11) r5
            if (r5 == 0) goto L97
            boolean r5 = r5.haveUssCard()
            if (r5 != r1) goto L97
            int r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject = r2
            int r1 = r1 % r3
            if (r1 != 0) goto L6e
            long r1 = r14.onNavigationEvent()
            r0.onExtraCallbackWithResult(r1)
            goto L9a
        L6e:
            long r1 = r14.onNavigationEvent()
            r0.onExtraCallbackWithResult(r1)
            throw r6
        L76:
            java.lang.Object[] r13 = new java.lang.Object[]{r14}
            int r10 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r8 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r9 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            int r11 = com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()
            r12 = 681842183(0x28a41607, float:1.821721E-14)
            r7 = -681842182(0xffffffffd75be9fa, float:-2.4179797E14)
            java.lang.Object r14 = o.getNativeProtocolAudience.onExtraCallback(r7, r8, r9, r10, r11, r12, r13)
            o.ReactPackageHelpergetNativeModuleIterator11 r14 = (o.ReactPackageHelpergetNativeModuleIterator11) r14
            throw r6
        L97:
            r0.onExtraCallbackWithResult(r2, r4)
        L9a:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L9d:
            r14.IAuthTabCallback()
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, String str, SessionKnownType sessionKnownType, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        passwordResetIntroActivity.onExtraCallbackWithResult(str, sessionKnownType);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 79;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void updateVisuals() throws Throwable {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        int i2 = writeTypedObject + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (this.access100) {
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1009623L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (addExtra.writeTypedObject(playerErrorCode)) {
            Object[] objArr = new Object[1];
            c(new char[]{21635, 21719, 4970, 28399, 37350, 27239, 48876, 41867, 7042, 51003}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), SessionKnownType.RESET_PASSWORD_UNDER_AGE);
            int i4 = writeTypedObject + 35;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr2 = new Object[1];
            c(new char[]{22050, 22134, 13134, 20171, 33906, 32755, 24870, 41256, 15285, 6385}, Process.myTid() >> 22, objArr2);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), SessionKnownType.RESET_PASSWORD);
        }
        final String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        final SessionKnownType sessionKnownType = (SessionKnownType) pairIAuthTabCallback.IAuthTabCallback();
        if (addExtra.IAuthTabCallback(playerErrorCode)) {
            onExtraCallbackWithResult(str, sessionKnownType);
        } else {
            writeRaw<BaseApiResponse<DebugCorePackageExternalSyntheticLambda1>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.onActivityResized().onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda6
                public final Object invoke(Object obj) {
                    return PasswordResetIntroActivity.onExtraCallbackWithResult(this.f$0, str, sessionKnownType, (DebugCorePackageExternalSyntheticLambda1) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda7
                public final void accept(Object obj) {
                    PasswordResetIntroActivity.IAuthTabCallbackStub(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda8
                public final Object invoke(Object obj) {
                    return PasswordResetIntroActivity.onNavigationEvent(this.f$0, str, sessionKnownType, (Throwable) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.password.reset.PasswordResetIntroActivity$$ExternalSyntheticLambda9
                public final void accept(Object obj) throws Throwable {
                    PasswordResetIntroActivity.onWarmupCompleted(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        }
        this.access100 = true;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;
        private static char[] onWarmupCompleted = {64976, 64967, 64981, 64978, 64965, 64916, 64988, 65065, 64966, 64990, 64987, 64977, 64915, 64964, 64961, 64986, 64983, 64991, 64980, 64984, 65064, 64989, 64979, 64982, 64960};
        private static char onExtraCallback = 51244;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = PasswordResetIntroActivity.this.new onExtraCallback(access13800Var);
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(unit);
            }
            onextracallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onWarmupCompleted;
            int i4 = -1310771303;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $10 + 101;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 83;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, View.combineMeasuredStates(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i4 = -1310771303;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i10 = $11 + 5;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 26, 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i12 = $10 + 55;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i14 = $11 + 63;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24824), TextUtils.getTrimmedLength("") + 74, Color.red(0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 30 - (ViewConfiguration.getTouchSlop() >> 8), 19488 - (ViewConfiguration.getScrollBarSize() >> 8), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i16 = $10 + 45;
                                $11 = i16 % 128;
                                int i17 = i16 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                            } else {
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                                int i22 = $11 + 123;
                                $10 = i22 % 128;
                                int i23 = i22 % 2;
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i24 = 0; i24 < i; i24++) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 51;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{1, 4, 13929, 13929, 11, 2, 7, 11, '\t', '\n', 24, 20, '\t', 5, 20, '\b', '\r', '\f', 22, 3, '\t', 11, 22, '\r', '\n', 20, 24, 1, '\t', 16, 20, '\b', '\r', 14, 16, 0, 11, '\r', 1, 5, 11, '\t', 6, 3, 16, 20, 13938}, (byte) (View.combineMeasuredStates(0, 0) + 115), 48 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i7 = i6 + 119;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Object[] objArr2 = {PasswordResetIntroActivity.this};
            PasswordResetIntroActivity.IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -493158998, 493159001);
            return Unit.INSTANCE;
        }
    }

    public boolean bg_() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        setEngagementSignalsCallback();
        boolean z = i3 != 0;
        int i4 = readTypedObject + 71;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setEngagementSignalsCallback() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject
            int r1 = r1 + 9
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r4.ICustomTabsServiceStub()
            r2 = 41
            int r2 = r2 / 0
            if (r1 == 0) goto L5c
            goto L1f
        L19:
            boolean r1 = r4.ICustomTabsServiceStub()
            if (r1 == 0) goto L5c
        L1f:
            int r1 = viva.republica.toss.password.reset.PasswordResetIntroActivity.readTypedObject
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.password.reset.PasswordResetIntroActivity.writeTypedObject = r2
            int r1 = r1 % r0
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2 = 32768(0x8000, float:4.5918E-41)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 != 0) goto L46
            o.SessionTrackerb r1 = r4.onNavigationEvent()
            android.content.Intent r1 = r1.onExtraCallbackWithResult(r4)
            r1.addFlags(r3)
            r1.addFlags(r2)
            r1.addFlags(r0)
            o.getNavigationBar.IAuthTabCallback(r1, r4)
            goto L5c
        L46:
            o.SessionTrackerb r1 = r4.onNavigationEvent()
            android.content.Intent r1 = r1.onExtraCallbackWithResult(r4)
            r1.addFlags(r3)
            r1.addFlags(r2)
            r1.addFlags(r0)
            o.getNavigationBar.IAuthTabCallback(r1, r4)
            r0 = 0
            throw r0
        L5c:
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordResetIntroActivity.setEngagementSignalsCallback():void");
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetIntroActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onResume();
            ConstraintLayout constraintLayout = ICustomTabsServiceDefault().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            if (constraintLayout.getVisibility() == 0) {
                getPackageType getpackagetype = this.getInterfaceDescriptor;
                if (getpackagetype != null && getpackagetype.onExtraCallback()) {
                    return;
                } else {
                    this.getInterfaceDescriptor = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
                }
            }
            int i3 = readTypedObject + 119;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onResume();
        ConstraintLayout constraintLayout2 = ICustomTabsServiceDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.getVisibility();
        obj.hashCode();
        throw null;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Object[] objArr = new Object[1];
        c(new char[]{11779, 11846, 53627, 44277, 5305, 61249, 2933, 55578, 55684, 29349, 7180, 556, 49388, 49184, 1353, 6870, 51289, 53119, 3760, 11627}, Process.myTid() >> 22, objArr);
        bundle.putBoolean(((String) objArr[0]).intern(), this.access100);
        super.onSaveInstanceState(bundle);
        int i4 = readTypedObject + 85;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(Intent intent) throws Throwable {
        long longExtra;
        Serializable serializableExtra;
        notifyEdgeReached notifyedgereached;
        int i;
        String strIntern;
        Serializable serializableExtra2;
        String strIntern2;
        Object obj;
        int i2 = 2 % 2;
        if (intent != null) {
            int i3 = writeTypedObject + 123;
            readTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                c(new char[]{40573, 40504, 42721, 56175, 33843, 32715, 13243, 26980, 44574, 19051, 35996, 15092, 28830, 47034, 38366, 8726, 30779, 47342, 40502, 5541}, 1 / (ExpandableListView.getPackedPositionForChild(0, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 1) == 0L ? 0 : -1)), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                c(new char[]{40573, 40504, 42721, 56175, 33843, 32715, 13243, 26980, 44574, 19051, 35996, 15092, 28830, 47034, 38366, 8726, 30779, 47342, 40502, 5541}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr2);
                obj = objArr2[0];
            }
            longExtra = intent.getLongExtra(((String) obj).intern(), 0L);
        } else {
            longExtra = 0;
        }
        setOriginText setorigintext = null;
        if (intent != null) {
            Object[] objArr3 = new Object[1];
            a(new int[]{-596296230, 1058170333, 1833798539, -1092444973, 1118527077, -1946165686, 1951197852, 1875376587, -65773438, 315557863, 1365527701, 1171917622}, KeyEvent.getDeadChar(0, 0) + 21, objArr3);
            serializableExtra = intent.getSerializableExtra(((String) objArr3[0]).intern());
        } else {
            serializableExtra = null;
        }
        if (serializableExtra instanceof notifyEdgeReached) {
            int i4 = readTypedObject + 73;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                setorigintext.hashCode();
                throw null;
            }
            notifyedgereached = (notifyEdgeReached) serializableExtra;
        } else {
            notifyedgereached = null;
        }
        if (notifyedgereached == null) {
            int i5 = writeTypedObject + 125;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        } else {
            i = onExtraCallbackWithResult.onExtraCallback[notifyedgereached.ordinal()];
        }
        if (i != -1) {
            int i7 = writeTypedObject + 67;
            readTypedObject = i7 % 128;
            if (i7 % 2 != 0 ? i != 1 : i != 0) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr4 = new Object[1];
            a(new int[]{-1477743904, -426112458}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, objArr4);
            strIntern = ((String) objArr4[0]).intern();
        } else {
            strIntern = "";
        }
        String str = strIntern;
        if (intent != null) {
            Object[] objArr5 = new Object[1];
            a(new int[]{-596296230, 1058170333, -892127024, -1926610706, -157307000, -1881110155, 1785376145, 554589371, 875293393, 1473150697, 1808751747, -1818731700}, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr5);
            serializableExtra2 = intent.getSerializableExtra(((String) objArr5[0]).intern());
        } else {
            serializableExtra2 = null;
        }
        if (serializableExtra2 instanceof setOriginText) {
            int i8 = readTypedObject;
            int i9 = i8 + 1;
            writeTypedObject = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            setorigintext = (setOriginText) serializableExtra2;
            int i10 = i8 + 35;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = setorigintext == null ? -1 : onExtraCallbackWithResult.onExtraCallbackWithResult[setorigintext.ordinal()];
        if (i12 == -1) {
            strIntern2 = "";
        } else if (i12 != 1) {
            int i13 = readTypedObject + 59;
            int i14 = i13 % 128;
            writeTypedObject = i14;
            if (i13 % 2 == 0 ? i12 == 2 : i12 == 5) {
                Object[] objArr6 = new Object[1];
                a(new int[]{1255251793, -98751419}, 3 - (Process.myPid() >> 22), objArr6);
                strIntern2 = ((String) objArr6[0]).intern();
                int i15 = writeTypedObject + 57;
                readTypedObject = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = i14 + 93;
                int i18 = i17 % 128;
                readTypedObject = i18;
                if (i17 % 2 != 0 ? i12 == 3 : i12 == 2) {
                    Object[] objArr7 = new Object[1];
                    a(new int[]{-1268114796, 574257471}, Gravity.getAbsoluteGravity(0, 0) + 2, objArr7);
                    strIntern2 = ((String) objArr7[0]).intern();
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i19 = i18 + 89;
                    writeTypedObject = i19 % 128;
                    int i20 = i19 % 2;
                    Object[] objArr8 = new Object[1];
                    c(new char[]{7354, 7383, 30165, 2167, 19915, 5170}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
                    strIntern2 = ((String) objArr8[0]).intern();
                }
            }
        } else {
            Object[] objArr9 = new Object[1];
            a(new int[]{-1709701370, 2058600062}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, objArr9);
            strIntern2 = ((String) objArr9[0]).intern();
        }
        SessionState.Companion.onExtraCallback().IAuthTabCallback_Parcel();
        this.IAuthTabCallback_Parcel.onNavigationEvent(PasswordSettingActivity.Companion.onExtraCallback((Context) this, longExtra, str, strIntern2, ICustomTabsServiceStub()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, SessionType sessionType) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.extraCallbackWithResult;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String name = sessionType.getName();
        checkDeviceBrand checkdevicebrand = checkDeviceBrand.EXCLUDE_TOSS_FAMILY;
        updateRuntimeShadowNodeReferencesOnCommit updateruntimeshadownodereferencesoncommit = updateRuntimeShadowNodeReferencesOnCommit.TOP;
        Object[] objArr = new Object[1];
        c(new char[]{49919, 49807, 18090, 15133, 54108, 10371, 64578, 13776, 20060, 34227, 56309, 62733, 11280, 22505, 49850, 60914, 9362, 22711}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, name, str, checkdevicebrand, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, ((String) objArr[0]).intern(), (String) null, (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, updateruntimeshadownodereferencesoncommit, 0L, 0L, false, true, false, false, false, (String) null, (String) null, -536889360, 125, (Object) null));
        ConstraintLayout constraintLayout = ICustomTabsServiceDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        TdsBottomCtaV1View tdsBottomCtaV1View = ICustomTabsServiceDefault().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(8);
        ComposeView composeView = ICustomTabsServiceDefault().asBinder;
        Intrinsics.checkNotNullExpressionValue(composeView, "");
        composeView.setVisibility(8);
        int i4 = readTypedObject + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(long j) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.extraCallbackWithResult;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        String strName = SessionKnownType.RESET_PASSWORD_BY_USS_CARD.name();
        checkDeviceBrand checkdevicebrand = checkDeviceBrand.EXCLUDE_TOSS_FAMILY;
        updateRuntimeShadowNodeReferencesOnCommit updateruntimeshadownodereferencesoncommit = updateRuntimeShadowNodeReferencesOnCommit.TOP;
        Object[] objArr = new Object[1];
        a(new int[]{-398220689, 1027021820, 1290035990, 1257265977}, 6 - TextUtils.getTrimmedLength(""), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(new char[]{49919, 49807, 18090, 15133, 54108, 10371, 64578, 13776, 20060, 34227, 56309, 62733, 11280, 22505, 49850, 60914, 9362, 22711}, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        iEngagementSignalsCallback_Parcel.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, this, strName, strIntern, checkdevicebrand, (String) null, false, (String) null, (String) null, (MobileCarrier) null, (String) null, (String) null, false, false, false, ((String) objArr2[0]).intern(), (String) null, (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, updateruntimeshadownodereferencesoncommit, j, 0L, false, false, false, false, false, (String) null, (String) null, -1610631184, 127, (Object) null));
        ConstraintLayout constraintLayout = ICustomTabsServiceDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        TdsBottomCtaV1View tdsBottomCtaV1View = ICustomTabsServiceDefault().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        tdsBottomCtaV1View.setVisibility(8);
        ComposeView composeView = ICustomTabsServiceDefault().asBinder;
        Intrinsics.checkNotNullExpressionValue(composeView, "");
        composeView.setVisibility(8);
        int i4 = readTypedObject + 69;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PasswordResetIntroActivity passwordResetIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        return (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, iEngagementSignalsCallbackDefault}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -145054211, 145054215);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PasswordResetIntroActivity passwordResetIntroActivity, boolean z, boolean z2, Function0 function0) throws Throwable {
        Object[] objArr = {passwordResetIntroActivity, Boolean.valueOf(z), Boolean.valueOf(z2), function0};
        IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1986355186, -1986355185);
    }

    private final void validateRelationship() throws Throwable {
        IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{this}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1633902865, -1633902859);
    }

    private static final Unit onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, String str, SessionKnownType sessionKnownType, DebugCorePackageExternalSyntheticLambda1 debugCorePackageExternalSyntheticLambda1) {
        return (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, str, sessionKnownType, debugCorePackageExternalSyntheticLambda1}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -207695290, 207695292);
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{function1, obj}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -4052216, 4052216);
    }

    private static final Unit onExtraCallback(PasswordResetIntroActivity passwordResetIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        return (Unit) IAuthTabCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), new Object[]{passwordResetIntroActivity, iEngagementSignalsCallbackDefault}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -176697550, 176697555);
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetIntroActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetIntroActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = readTypedObject + 97;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordResetIntroActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = writeTypedObject + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    static void IAuthTabCallback() {
        ICustomTabsCallback = new int[]{834347904, 1031300107, -1086303258, -57842637, -2084578746, 1092598310, 810436604, -1593182657, -1193899121, 1564330428, -387195870, 1664173374, 1366313757, 428601124, -1006066274, -143867469, 26632405, -1419638099};
        extraCallback = -5927338100080638246L;
    }
}
