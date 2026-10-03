package viva.republica.toss.guest.certify.guardian;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.StringCompanionObject;
import o.APImageInfo;
import o.AdSettingsIntegrationErrorMode;
import o.AppLovinError;
import o.AppLovinSdkSettings;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.CertPathValidator;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.IconRoundCornerProgressBarSavedState;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.RotationProvider1;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.UtilsKtExternalSyntheticLambda17$run;
import o.VideoConfig;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addAllCommandLine;
import o.authenticate;
import o.clearTid;
import o.createPaints;
import o.dangerouslyForceOverride;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeLongCollection;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.fileSRect;
import o.findResAndMsg;
import o.getAdService;
import o.getByteBuffer;
import o.getExtraParameters;
import o.getJavaScriptContext;
import o.getNameFromAnnotation;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTurboModuleRegistry;
import o.getUrlokhttp;
import o.getWrite;
import o.handleMemoryPressure;
import o.initMiniApp;
import o.isFireOS;
import o.jniCallJSCallback;
import o.jniSetSourceURL;
import o.lambdadestroy1;
import o.lambdadestroy2;
import o.loadScriptFromAssets;
import o.maybeUpdateAnimatable;
import o.preFillDefault;
import o.putChannelInfo;
import o.pxToDp;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.readIntokhttp;
import o.refreshRequiredTiles;
import o.runOnUiThreadDelayed;
import o.sWidth;
import o.setRandomHost;
import o.shouldAllowBackgroundPlayback;
import o.sourceToViewX;
import o.vTranslateForSCenter;
import o.varyMatches;
import o.writeRaw;
import o.zzad;
import o.zzag;
import o.zzbr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;
import viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenAgreementCountRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianSmsResponse;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSessionRequest;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenSignUpFailReasonRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuardianPendingCertifyFragment extends Hilt_GuardianPendingCertifyFragment {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback;
    private static int access100;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private static int readTypedObject;
    private int IAuthTabCallbackDefault;
    private deserializeUriNullableCollection IAuthTabCallbackStub;
    private deserializeUriNullableCollection access000;

    @Inject
    public AppLovinError applicationProcessManager;
    private int asBinder;
    private boolean asInterface;

    @Inject
    public zzad environments;
    private String onExtraCallback;
    private Long onTransact;

    @Inject
    public zzag tossClock;
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 113;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;
    private final PageContext onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onNavigationEvent);
    private getNameFromAnnotation IAuthTabCallbackStubProxy = getNameFromAnnotation.IN_PROGRESS;
    private Pair<Integer, Integer> onExtraCallbackWithResult = new Pair<>(0, 0);

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[getNameFromAnnotation.values().length];
            try {
                iArr[getNameFromAnnotation.BEFORE_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getNameFromAnnotation.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getNameFromAnnotation.RESET_PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getNameFromAnnotation.ISSUANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[lambdadestroy2.onExtraCallback.values().length];
            try {
                iArr2[lambdadestroy2.onExtraCallback.HOUSEHOLD_REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lambdadestroy2.onExtraCallback.CERTIFICATE_OF_FAMILY_RELATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r0 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.$$c(byte, byte, int):java.lang.String");
    }

    static {
        readTypedObject = 1;
        onWarmupCompleted();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(GuardianPendingCertifyFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentGuardianCertifyPendingBinding;", 0)};
        Companion = new onExtraCallback(null);
        IAuthTabCallback = 8;
        int i = writeTypedObject + 77;
        readTypedObject = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(guardianPendingCertifyFragment, th);
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(guardianPendingCertifyFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(guardianPendingCertifyFragment);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        extraCallback(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 71;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        access100(guardianPendingCertifyFragment);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(function1, obj);
        int i4 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        int i4 = getInterfaceDescriptor + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1336851095, 1336851102, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 273784525, -273784521, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            access000(guardianPendingCertifyFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(guardianPendingCertifyFragment);
        int i3 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess000;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onMinimized(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 1;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(view);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i3 = getInterfaceDescriptor + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setDetectableSize);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 23;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guardianPendingCertifyFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, lambdadestroy2 lambdadestroy2Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1701843806, -1701843804, new Object[]{guardianPendingCertifyFragment, lambdadestroy2Var}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean typedObject = readTypedObject(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, guardianPendingCertifyFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = getInterfaceDescriptor + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianPendingCertifyFragment guardianPendingCertifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(guardianPendingCertifyFragment, dialogInterface);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(guardianPendingCertifyFragment, dialogInterface);
        int i3 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1565429920, 1565429936, new Object[]{guardianPendingCertifyFragment, l}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1119681184, 1119681193, new Object[]{str, setDetectableSize}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1719102788, -1719102778, new Object[]{guardianPendingCertifyFragment, th}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, getJavaScriptContext getjavascriptcontext) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 524360414, -524360394, new Object[]{guardianPendingCertifyFragment, getjavascriptcontext}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            int i3 = 59 / 0;
        } else {
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 524360414, -524360394, new Object[]{guardianPendingCertifyFragment, getjavascriptcontext}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int i4 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, getTurboModuleRegistry getturbomoduleregistry) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(guardianPendingCertifyFragment, getturbomoduleregistry);
        }
        IAuthTabCallback(guardianPendingCertifyFragment, getturbomoduleregistry);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback = IAuthTabCallback(jsonReaderUnknownNumberParsing);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback;
    }

    public static /* synthetic */ boolean onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, jniCallJSCallback jnicalljscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(guardianPendingCertifyFragment, jnicalljscallback);
        int i4 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskICustomTabsCallback = ICustomTabsCallback(function1, obj);
        int i4 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskICustomTabsCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i6);
        int i11 = ~i6;
        int i12 = (~(i7 | i2)) | (~(i8 | i11)) | (~(i8 | i3));
        int i13 = ~(i11 | i9);
        int i14 = i3 + i2 + i + (1938118820 * i5) + ((-1869228383) * i4);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i) + ((-1907359744) * i5) + (1374945280 * i4) + (1516044288 * i15);
        int i17 = ((i3 * 647972376) - 1941852458) + (i2 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i * 647973227) + (i5 * (-1260466036)) + (i4 * 1557372491) + (i15 * 1239351296);
        Long lValueOf = null;
        switch (i16 + (i17 * i17 * 490405888)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
                int i18 = 2 % 2;
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = guardianPendingCertifyFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, guardianPendingCertifyFragment.new onExtraCallbackWithResult(null), 3, (Object) null);
                int i19 = getInterfaceDescriptor + 91;
                IAuthTabCallback_Parcel = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                GuardianPendingCertifyFragment guardianPendingCertifyFragment2 = (GuardianPendingCertifyFragment) objArr[0];
                int i21 = 2 % 2;
                int i22 = IAuthTabCallback_Parcel + 79;
                getInterfaceDescriptor = i22 % 128;
                int i23 = i22 % 2;
                guardianPendingCertifyFragment2.onExtraCallbackWithResult(guardianPendingCertifyFragment2.onTransact);
                Long l = guardianPendingCertifyFragment2.onTransact;
                if (l != null) {
                    lValueOf = Long.valueOf(l.longValue() - 1000);
                    int i24 = IAuthTabCallback_Parcel + 101;
                    getInterfaceDescriptor = i24 % 128;
                    int i25 = i24 % 2;
                }
                guardianPendingCertifyFragment2.onTransact = lValueOf;
                return Unit.INSTANCE;
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                GuardianPendingCertifyFragment guardianPendingCertifyFragment3 = (GuardianPendingCertifyFragment) objArr[0];
                int i26 = 2 % 2;
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = guardianPendingCertifyFragment3.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, guardianPendingCertifyFragment3.new asBinder(null), 3, (Object) null);
                int i27 = IAuthTabCallback_Parcel + 5;
                getInterfaceDescriptor = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 19:
                return extraCallback(objArr);
            case 20:
                GuardianPendingCertifyFragment guardianPendingCertifyFragment4 = (GuardianPendingCertifyFragment) objArr[0];
                getJavaScriptContext getjavascriptcontext = (getJavaScriptContext) objArr[1];
                int i29 = 2 % 2;
                int i30 = IAuthTabCallback_Parcel + 37;
                getInterfaceDescriptor = i30 % 128;
                int i31 = i30 % 2;
                guardianPendingCertifyFragment4.onTransact = Long.valueOf((getjavascriptcontext.onExtraCallbackWithResult() * 86400000) + (getjavascriptcontext.onWarmupCompleted() * 3600000) + (getjavascriptcontext.onNavigationEvent() * 60000) + (getjavascriptcontext.IAuthTabCallback() * 1000));
                guardianPendingCertifyFragment4.onTrackView();
                guardianPendingCertifyFragment4.extraCallback();
                Unit unit = Unit.INSTANCE;
                int i32 = getInterfaceDescriptor + 39;
                IAuthTabCallback_Parcel = i32 % 128;
                int i33 = i32 % 2;
                return unit;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1880842441, 1880842442, new Object[]{view}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(guardianPendingCertifyFragment, str, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(guardianPendingCertifyFragment, th);
        int i4 = getInterfaceDescriptor + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(guardianPendingCertifyFragment, pair);
        int i4 = getInterfaceDescriptor + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(guardianPendingCertifyFragment, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, jniCallJSCallback jnicalljscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 755522625, -755522612, new Object[]{guardianPendingCertifyFragment, jnicalljscallback}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i3 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onNavigationEvent;

        public IAuthTabCallback_Parcel(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<getTurboModuleRegistry> apply(writeRaw<BaseApiResponse<getTurboModuleRegistry>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$run(new Function1<BaseApiResponse<getTurboModuleRegistry>, deserializeIp<? extends getTurboModuleRegistry>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel.5
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getTurboModuleRegistry> invoke(BaseApiResponse<getTurboModuleRegistry> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getTurboModuleRegistry.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class asInterface<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asInterface(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<jniCallJSCallback> apply(writeRaw<BaseApiResponse<jniCallJSCallback>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$run(new Function1<BaseApiResponse<jniCallJSCallback>, deserializeIp<? extends jniCallJSCallback>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.asInterface.5
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends jniCallJSCallback> invoke(BaseApiResponse<jniCallJSCallback> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = jniCallJSCallback.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<lambdadestroy2> apply(writeRaw<BaseApiResponse<lambdadestroy2>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$run(new Function1<BaseApiResponse<lambdadestroy2>, deserializeIp<? extends lambdadestroy2>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.onNavigationEvent.5
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends lambdadestroy2> invoke(BaseApiResponse<lambdadestroy2> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = lambdadestroy2.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onTransact<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onTransact(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<getJavaScriptContext> apply(writeRaw<BaseApiResponse<getJavaScriptContext>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$run(new Function1<BaseApiResponse<getJavaScriptContext>, deserializeIp<? extends getJavaScriptContext>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.onTransact.5
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getJavaScriptContext> invoke(BaseApiResponse<getJavaScriptContext> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getJavaScriptContext.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        guardianPendingCertifyFragment.asBinder = i;
        if (i4 == 0) {
            int i5 = 57 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        guardianPendingCertifyFragment.readTypedObject();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int IAuthTabCallbackStub(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = guardianPendingCertifyFragment.IAuthTabCallbackDefault;
        int i6 = i2 + 119;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        Pair<Integer, Integer> pair = (Pair) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        guardianPendingCertifyFragment.onExtraCallbackWithResult = pair;
        if (i3 != 0) {
            return null;
        }
        int i4 = 73 / 0;
        return null;
    }

    public static final /* synthetic */ void asBinder(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 627913606, -627913588, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ CertifyGuestViewModel asInterface(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CertifyGuestViewModel certifyGuestViewModelOnUnminimized = guardianPendingCertifyFragment.onUnminimized();
        int i4 = getInterfaceDescriptor + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return certifyGuestViewModelOnUnminimized;
    }

    public static final /* synthetic */ Pair onExtraCallbackWithResult(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, Integer> pair = guardianPendingCertifyFragment.onExtraCallbackWithResult;
        int i5 = i2 + 43;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public static final /* synthetic */ CertPathValidator onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {guardianPendingCertifyFragment};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        CertPathValidator certPathValidator = (CertPathValidator) onWarmupCompleted(iOnExtraCallbackWithResult2, -1802144978, 1802144978, objArr, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return certPathValidator;
    }

    public static final /* synthetic */ void onTransact(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        guardianPendingCertifyFragment.writeTypedObject();
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 107;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        guardianPendingCertifyFragment.IAuthTabCallbackDefault = iIntValue;
        int i5 = i3 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        guardianPendingCertifyFragment.onExtraCallback = str;
        int i5 = i3 + 103;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onTransact == null) {
            return -1L;
        }
        int i4 = i2 + 121;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return 1224535L;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        Long l = this.onTransact;
        if (l == null) {
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        Intrinsics.checkNotNull(l);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("time_limit", Long.valueOf(l.longValue() / 1000)), getWrite.IAuthTabCallback("verification_token", createPaints.IAuthTabCallback.IAuthTabCallback_Parcel())});
        int i7 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        return mapIAuthTabCallback;
    }

    public final AppLovinError onNavigationEvent() {
        int i = 2 % 2;
        AppLovinError appLovinError = this.applicationProcessManager;
        if (appLovinError == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = getInterfaceDescriptor + 75;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return appLovinError;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ sWidth $data;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        private static final byte[] $$a = {119, -40, 16, 123};
        private static final int $$b = 166;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onExtraCallbackWithResult = {60851, 46512, 23955, 58772, 36324, 21982, 64961, 34246, 11567, 62782, 40215, 9472, 52598, 38230, 15699, 50511, 33614, 56136, 13183, 35708, 58135, 15111};
        private static long onExtraCallback = 3155842520722093509L;

        private static String $$c(short s, short s2, byte b) {
            int i = 4 - (b * 4);
            byte[] bArr = $$a;
            int i2 = (s * 3) + 97;
            int i3 = s2 * 3;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 += i3;
                i++;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i2;
                if (i4 == i3) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i];
                i++;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(sWidth swidth, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$data = swidth;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = GuardianPendingCertifyFragment.this.new access100(this.$data, access13800Var);
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return access100Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 17;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 43 - ExpandableListView.getPackedPositionChild(0L), 1494 - TextUtils.getOffsetAfter("", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i7 = $11 + 27;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
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
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1494 - (Process.myTid() >> 22), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr);
        }

        public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            final /* synthetic */ sWidth $data$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ GuardianPendingCertifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(access13800 access13800Var, GuardianPendingCertifyFragment guardianPendingCertifyFragment, sWidth swidth) {
                super(2, access13800Var);
                this.this$0 = guardianPendingCertifyFragment;
                this.$data$inlined = swidth;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onWarmupCompleted(access13800Var, this.this$0, this.$data$inlined);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    shouldAllowBackgroundPlayback shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras();
                    long jAccess100 = GuardianPendingCertifyFragment.asInterface(this.this$0).access100();
                    String strOnNavigationEvent = this.$data$inlined.onNavigationEvent();
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = "";
                    }
                    GuestUnderFourteenSignUpFailReasonRequest guestUnderFourteenSignUpFailReasonRequest = new GuestUnderFourteenSignUpFailReasonRequest(jAccess100, strOnNavigationEvent);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras.onExtraCallbackWithResult(guestUnderFourteenSignUpFailReasonRequest, (access13800<? super BaseApiResponse<Object>>) this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr = new Object[1];
                    a('0' - AndroidCharacter.getMirror('0'), 16 - (ViewConfiguration.getTapTimeout() >> 16), (char) KeyEvent.getDeadChar(0, 0), objArr);
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), access14000.onExtraCallback(GuardianPendingCertifyFragment.asInterface(GuardianPendingCertifyFragment.this).access100()));
                    String strOnNavigationEvent = this.$data.onNavigationEvent();
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = "";
                    }
                    Object[] objArr2 = new Object[1];
                    a(TextUtils.lastIndexOf("", '0') + 17, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, (char) (View.MeasureSpec.getSize(0) + 28392), objArr2);
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "GuardianPendingCertifyFragment", "Sign-up failed for under-14 user", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), strOnNavigationEvent)}), (String) null, false, (String) null, 56, (Object) null);
                    GuardianPendingCertifyFragment guardianPendingCertifyFragment = GuardianPendingCertifyFragment.this;
                    sWidth swidth = this.$data;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null, guardianPendingCertifyFragment, swidth);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, this);
                    if (obj == objOnWarmupCompleted) {
                        int i3 = onWarmupCompleted + 117;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = IAuthTabCallback + 111;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 % 3;
                    }
                }
                obj2 = Result.constructor-impl(obj);
                int i7 = IAuthTabCallback + 109;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } catch (Exception e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            Result.onExtraCallback(obj2);
            return Unit.INSTANCE;
        }
    }

    public final zzad onExtraCallback() {
        int i = 2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = getInterfaceDescriptor + 35;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, CertPathValidator> {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, CertPathValidator.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentGuardianCertifyPendingBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CertPathValidator invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return CertPathValidator.onNavigationEvent(view);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = i2 % 2 != 0 ? guardianPendingCertifyFragment.onNavigationEvent.onExtraCallbackWithResult(guardianPendingCertifyFragment, onWarmupCompleted[1]) : guardianPendingCertifyFragment.onNavigationEvent.onExtraCallbackWithResult(guardianPendingCertifyFragment, onWarmupCompleted[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        CertPathValidator certPathValidator = (CertPathValidator) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i3 = IAuthTabCallback_Parcel + 123;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return certPathValidator;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault extends OnBackPressedCallback {
        IAuthTabCallbackDefault() {
            super(true);
        }

        public void handleOnBackPressed() {
            ConstraintLayout root = GuardianPendingCertifyFragment.onNavigationEvent(GuardianPendingCertifyFragment.this).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            String string = GuardianPendingCertifyFragment.this.getString(R.string.guardian_pending_certify_toast);
            Intrinsics.checkNotNullExpressionValue(string, "");
            new TdsToastV1.onNavigationEvent(root, string).onNavigationEvent();
        }
    }

    @Override // viva.republica.toss.guest.certify.guardian.Hilt_GuardianPendingCertifyFragment
    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new IAuthTabCallbackDefault());
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 35125), Color.red(0) + 23, 10279 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.resolveSize(0, 0)), 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $10 + 1;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 65;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12842), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r5 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r5 = getArguments();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel + 71;
        viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
        r5 = r5.getBoolean("EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r5 = r4.asInterface;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r4.asInterface = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r4.asInterface = r5.getBoolean("EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT");
        r5 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel + 45;
        viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            java.lang.String r2 = "EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT"
            if (r1 == 0) goto L18
            super.onCreate(r5)
            int r1 = r0 / 0
            if (r5 == 0) goto L31
            goto L1d
        L18:
            super.onCreate(r5)
            if (r5 == 0) goto L31
        L1d:
            boolean r5 = r5.getBoolean(r2)
            r4.asInterface = r5
            int r5 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel
            int r5 = r5 + 45
            int r1 = r5 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L2f
            return
        L2f:
            r5 = 0
            throw r5
        L31:
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L45
            int r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel
            int r1 = r1 + 71
            int r3 = r1 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r3
            int r1 = r1 % r0
            boolean r5 = r5.getBoolean(r2)
            goto L47
        L45:
            boolean r5 = r4.asInterface
        L47:
            r4.asInterface = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
            bundle.putBoolean("EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT", this.asInterface);
        } else {
            Intrinsics.checkNotNullParameter(bundle, "");
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
            bundle.putBoolean("EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT", this.asInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menu, "");
            Intrinsics.checkNotNullParameter(menuInflater, "");
            menuInflater.inflate(R.menu.menu_cancel_request, menu);
            menu.findItem(R.id.reset).setVisible(onExtraCallback().RemoteActionCompatParcelizer());
            return;
        }
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        menuInflater.inflate(R.menu.menu_cancel_request, menu);
        menu.findItem(R.id.reset).setVisible(onExtraCallback().RemoteActionCompatParcelizer());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(guardianPendingCertifyFragment.getString(R.string.guardian_pending_certify_cancel_dialog_title, new Object[]{guardianPendingCertifyFragment.onExtraCallbackWithResult.getFirst()}));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(guardianPendingCertifyFragment.getString(R.string.guardian_pending_certify_cancel_dialog_message));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Pair pair) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        guardianPendingCertifyFragment.onExtraCallbackWithResult((Pair<Boolean, Boolean>) pair);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            menuItem.getItemId();
            int i3 = R.id.cancel;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.cancel) {
            ConvertByteArrayToFloatArray.onExtraCallback(1226873L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            if (this.asBinder > 0) {
                extraCallbackWithResult();
            } else {
                ConvertByteArrayToFloatArray.onExtraCallback(1226869L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda22
                    public final Object invoke(Object obj2) {
                        return GuardianPendingCertifyFragment.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    }
                });
                int i4 = getInterfaceDescriptor + 77;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
            return true;
        }
        if (itemId != R.id.reset) {
            return super.onOptionsItemSelected(menuItem);
        }
        refreshRequiredTiles refreshrequiredtiles = refreshRequiredTiles.IAuthTabCallback;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        refreshrequiredtiles.onExtraCallbackWithResult(contextRequireContext2, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda23
            public final Object invoke(Object obj2) {
                return GuardianPendingCertifyFragment.onWarmupCompleted(this.f$0, (Pair) obj2);
            }
        });
        int i6 = getInterfaceDescriptor + 29;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            i = R.layout.fragment_guardian_certify_pending;
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            i = R.layout.fragment_guardian_certify_pending;
            z = false;
        }
        return layoutInflater.inflate(i, viewGroup, z);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            setHasOptionsMenu(false);
            access100();
            getInterfaceDescriptor();
            IAuthTabCallbackStubProxy();
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 627913606, -627913588, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            setHasOptionsMenu(true);
            access100();
            getInterfaceDescriptor();
            IAuthTabCallbackStubProxy();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 627913606, -627913588, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int i3 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        IAuthTabCallback_Parcel();
        ICustomTabsCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (onActivityResized() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (onActivityResized() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor + 39;
        viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel
            int r1 = r1 + 55
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1c
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume()
            boolean r1 = r3.onActivityResized()
            r2 = 52
            int r2 = r2 / 0
            if (r1 != 0) goto L2f
            goto L25
        L1c:
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume()
            boolean r1 = r3.onActivityResized()
            if (r1 != 0) goto L2f
        L25:
            int r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor
            int r1 = r1 + 39
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            return
        L2f:
            r3.IAuthTabCallback_Parcel()
            r3.ICustomTabsCallback()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.onResume():void");
    }

    public void onPause() {
        int i = 2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onPause();
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
        Object obj = null;
        if (deserializeurinullablecollection != null) {
            int i2 = IAuthTabCallback_Parcel + 113;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            } else {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
                obj.hashCode();
                throw null;
            }
        }
        deserializeUriNullableCollection deserializeurinullablecollection2 = this.access000;
        if (deserializeurinullablecollection2 != null) {
            int i3 = IAuthTabCallback_Parcel + 47;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            zzbr.onWarmupCompleted(deserializeurinullablecollection2);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i5 = IAuthTabCallback_Parcel + 51;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            i = 0;
        }
        view.setVisibility(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
        view.setVisibility(0);
        return Unit.INSTANCE;
    }

    private static final Unit access000(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (guardianPendingCertifyFragment.getActivity() != null && (!r1.isFinishing())) {
            int i4 = getInterfaceDescriptor + 95;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            ConstraintLayout constraintLayout = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 7;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).IAuthTabCallbackStub.removeAllViews();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        LinearLayout linearLayout = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).IAuthTabCallbackStub;
        refreshRequiredTiles refreshrequiredtiles = refreshRequiredTiles.IAuthTabCallback;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        linearLayout.addView(refreshrequiredtiles.onExtraCallbackWithResult(contextRequireContext, createPaints.IAuthTabCallback.asBinder(), APImageInfo.onNavigationEvent.asBinder()));
        int i4 = getInterfaceDescriptor + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuardianPendingCertifyFragment.this.new asBinder(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super GuestUnderFourteenGuardianAgreementCountResponse>, Object> {
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ GuardianPendingCertifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
                super(2, access13800Var);
                this.this$0 = guardianPendingCertifyFragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(access13800Var, this.this$0);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super GuestUnderFourteenGuardianAgreementCountResponse> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    shouldAllowBackgroundPlayback shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras();
                    GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest = new GuestUnderFourteenSessionRequest(GuardianPendingCertifyFragment.asInterface(this.this$0).access100());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras.onWarmupCompleted(guestUnderFourteenSessionRequest, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (GuestUnderFourteenGuardianAgreementCountResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(GuestUnderFourteenGuardianAgreementCountResponse.class, Object.class) || Intrinsics.areEqual(GuestUnderFourteenGuardianAgreementCountResponse.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    GuardianPendingCertifyFragment guardianPendingCertifyFragment = GuardianPendingCertifyFragment.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null, guardianPendingCertifyFragment);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            GuestUnderFourteenGuardianAgreementCountResponse guestUnderFourteenGuardianAgreementCountResponse = (GuestUnderFourteenGuardianAgreementCountResponse) (Result.onExtraCallback(obj2) ? null : obj2);
            if (guestUnderFourteenGuardianAgreementCountResponse != null) {
                GuardianPendingCertifyFragment.IAuthTabCallback(GuardianPendingCertifyFragment.this, guestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback());
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 188169234, -188169231, new Object[]{GuardianPendingCertifyFragment.this, Integer.valueOf(guestUnderFourteenGuardianAgreementCountResponse.onExtraCallbackWithResult())}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1645867181, 1645867195, new Object[]{GuardianPendingCertifyFragment.this, new Pair(access14000.onNavigationEvent(guestUnderFourteenGuardianAgreementCountResponse.onWarmupCompleted()), access14000.onNavigationEvent(guestUnderFourteenGuardianAgreementCountResponse.onExtraCallback()))}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            }
            TdsBottomCtaV1View tdsBottomCtaV1View = GuardianPendingCertifyFragment.onNavigationEvent(GuardianPendingCertifyFragment.this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            String string = GuardianPendingCertifyFragment.this.getString(R.string.app_guardian_pending_certify_bottom_cta);
            Intrinsics.checkNotNullExpressionValue(string, "");
            final GuardianPendingCertifyFragment guardianPendingCertifyFragment2 = GuardianPendingCertifyFragment.this;
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$initCta$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj3) {
                    return GuardianPendingCertifyFragment.asBinder.onWarmupCompleted(guardianPendingCertifyFragment2, (View) obj3);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            TdsBottomCtaV1View tdsBottomCtaV1View2 = GuardianPendingCertifyFragment.onNavigationEvent(GuardianPendingCertifyFragment.this).onNavigationEvent;
            String string2 = GuardianPendingCertifyFragment.this.getString(R.string.app_guardian_pending_certify_bottom_description, new Object[]{APImageInfo.onNavigationEvent.asBinder()});
            final GuardianPendingCertifyFragment guardianPendingCertifyFragment3 = GuardianPendingCertifyFragment.this;
            tdsBottomCtaV1View2.setBottomButton(string2, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$initCta$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj3) {
                    return GuardianPendingCertifyFragment.asBinder.IAuthTabCallback(guardianPendingCertifyFragment3, (View) obj3);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, View view) {
            ConvertByteArrayToFloatArray.onExtraCallback(1455447L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            if (GuardianPendingCertifyFragment.IAuthTabCallbackStub(guardianPendingCertifyFragment) > 0) {
                GuardianPendingCertifyFragment.onNavigationEvent(guardianPendingCertifyFragment).onNavigationEvent.asInterface().setLoading(true);
                GuardianPendingCertifyFragment.onTransact(guardianPendingCertifyFragment);
            } else {
                ConstraintLayout root = GuardianPendingCertifyFragment.onNavigationEvent(guardianPendingCertifyFragment).getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                String string = guardianPendingCertifyFragment.getString(R.string.app_guardian_pending_certify_sms_block_toast, new Object[]{GuardianPendingCertifyFragment.onExtraCallbackWithResult(guardianPendingCertifyFragment).getSecond()});
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(root, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, View view) {
            ConvertByteArrayToFloatArray.onExtraCallback(1382316L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            GuardianPendingCertifyFragment.IAuthTabCallbackDefault(guardianPendingCertifyFragment);
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
        writeRaw<BaseApiResponse<jniCallJSCallback>> writerawOnNavigationEvent = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onNavigationEvent(new lambdadestroy1(onUnminimized().access100()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new asInterface(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda14
            public final Object invoke(Object obj2) {
                return GuardianPendingCertifyFragment.onNavigationEvent((JsonReaderUnknownNumberParsing) obj2);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackDefault = writerawIAuthTabCallback.IAuthTabCallbackDefault(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda15
            public final Object apply(Object obj2) {
                return GuardianPendingCertifyFragment.onTransact(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda16
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(GuardianPendingCertifyFragment.onNavigationEvent(this.f$0, (jniCallJSCallback) obj2));
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingIAuthTabCallbackDefault.IAuthTabCallback(new deserializeLongCollection() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda17
            public final boolean test(Object obj2) {
                return GuardianPendingCertifyFragment.onExtraCallback(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda18
            public final Object invoke(Object obj2) {
                return GuardianPendingCertifyFragment.onWarmupCompleted(this.f$0, (jniCallJSCallback) obj2);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda19
            public final void accept(Object obj2) {
                Object[] objArr = {function13, obj2};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -238550911, 238550917, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        };
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda20
            public final Object invoke(Object obj2) {
                return GuardianPendingCertifyFragment.onExtraCallbackWithResult((Throwable) obj2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda21
            public final void accept(Object obj2) {
                Object[] objArr = {function14, obj2};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -716532646, 716532661, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        this.IAuthTabCallbackStub = IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, this);
        int i3 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
            jsonReaderUnknownNumberParsing.onExtraCallback(5L, TimeUnit.SECONDS);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = jsonReaderUnknownNumberParsing.onExtraCallback(5L, TimeUnit.SECONDS);
        int i3 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return jsonReaderUnknownNumberParsingOnExtraCallback;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i3 = IAuthTabCallback_Parcel + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final boolean onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, jniCallJSCallback jnicalljscallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jnicalljscallback, "");
        if (guardianPendingCertifyFragment.IAuthTabCallbackStubProxy != getNameFromAnnotation.IN_PROGRESS) {
            return true;
        }
        int i4 = IAuthTabCallback_Parcel + 113;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (!AppStateManager.onExtraCallbackWithResult.onPostMessage()) {
            return true;
        }
        int i6 = IAuthTabCallback_Parcel;
        int i7 = i6 + 7;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 41;
        getInterfaceDescriptor = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 27 / 0;
        }
        return false;
    }

    private static final boolean readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        int i = 2 % 2;
        getNameFromAnnotation getnamefromannotationOnExtraCallbackWithResult = ((jniCallJSCallback) objArr[1]).onExtraCallbackWithResult();
        int i2 = getnamefromannotationOnExtraCallbackWithResult == null ? -1 : IAuthTabCallback.onExtraCallbackWithResult[getnamefromannotationOnExtraCallbackWithResult.ordinal()];
        if (i2 == -1 || i2 == 1) {
            guardianPendingCertifyFragment.onNavigationEvent().IAuthTabCallback(true);
        } else if (i2 != 2) {
            int i3 = IAuthTabCallback_Parcel + 91;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                guardianPendingCertifyFragment.asBinder();
                deserializeUriNullableCollection deserializeurinullablecollection = guardianPendingCertifyFragment.IAuthTabCallbackStub;
                if (deserializeurinullablecollection != null) {
                    zzbr.onWarmupCompleted(deserializeurinullablecollection);
                    int i5 = getInterfaceDescriptor + 55;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                }
                deserializeUriNullableCollection deserializeurinullablecollection2 = guardianPendingCertifyFragment.access000;
                if (deserializeurinullablecollection2 != null) {
                    zzbr.onWarmupCompleted(deserializeurinullablecollection2);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback_Parcel + 69;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 62 / 0;
        }
        return unit;
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = getInterfaceDescriptor + 51;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        lambdadestroy2 lambdadestroy2Var = (lambdadestroy2) objArr[1];
        int i2 = 2 % 2;
        lambdadestroy2.onExtraCallback onextracallbackOnWarmupCompleted = lambdadestroy2Var.onWarmupCompleted();
        Object obj = null;
        if (onextracallbackOnWarmupCompleted != null) {
            i = IAuthTabCallback.onExtraCallback[onextracallbackOnWarmupCompleted.ordinal()];
        } else {
            int i3 = IAuthTabCallback_Parcel + 73;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            i = -1;
        }
        if (i != -1) {
            if (i == 1) {
                handleMemoryPressure handlememorypressureOnNavigationEvent = lambdadestroy2Var.onNavigationEvent();
                if (handlememorypressureOnNavigationEvent != null) {
                    guardianPendingCertifyFragment.onNavigationEvent(handlememorypressureOnNavigationEvent);
                    int i4 = IAuthTabCallback_Parcel + 103;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = getInterfaceDescriptor + 115;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 != 0) {
                    lambdadestroy2Var.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                loadScriptFromAssets loadscriptfromassetsOnExtraCallback = lambdadestroy2Var.onExtraCallback();
                if (loadscriptfromassetsOnExtraCallback != null) {
                    guardianPendingCertifyFragment.onExtraCallbackWithResult(loadscriptfromassetsOnExtraCallback);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        GuardianPendingCertifyFragment guardianPendingCertifyFragment = (GuardianPendingCertifyFragment) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, guardianPendingCertifyFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<lambdadestroy2>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onWarmupCompleted(new lambdadestroy1(onUnminimized().access100()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onExtraCallback(this.f$0, (lambdadestroy2) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda11
            public final void accept(Object obj) {
                GuardianPendingCertifyFragment.access100(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onNavigationEvent(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda13
            public final void accept(Object obj) {
                Object[] objArr = {function12, obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 177222122, -177222105, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult(loadScriptFromAssets loadscriptfromassets) {
        int i = 2 % 2;
        vTranslateForSCenter vtranslateforscenter = vTranslateForSCenter.onExtraCallbackWithResult;
        vtranslateforscenter.onExtraCallbackWithResult(loadscriptfromassets);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i2 = getInterfaceDescriptor + 23;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            AppBarLayout appBarLayoutFindViewById = activity.findViewById(R.id.appbarLayout);
            if (appBarLayoutFindViewById != null) {
                appBarLayoutFindViewById.setVisibility(0);
            }
        }
        if (onExtraCallback().RemoteActionCompatParcelizer()) {
            int i4 = IAuthTabCallback_Parcel + 77;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 5, null);
                return;
            } else {
                GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 2, null);
                return;
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        sWidth swidthOnExtraCallback = vtranslateforscenter.onExtraCallback(contextRequireContext, loadscriptfromassets);
        if (swidthOnExtraCallback.IAuthTabCallback() == sourceToViewX.CERTIFY_SUCCESS) {
            int i5 = getInterfaceDescriptor + 79;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 2, null);
            return;
        }
        onExtraCallbackWithResult(swidthOnExtraCallback);
        asInterface();
        sourceToViewX.IAuthTabCallback iAuthTabCallback = sourceToViewX.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        onWarmupCompleted(iAuthTabCallback.onNavigationEvent(fragmentActivityRequireActivity, swidthOnExtraCallback.IAuthTabCallback()));
    }

    private final void onNavigationEvent(handleMemoryPressure handlememorypressure) throws NoWhenBranchMatchedException {
        sourceToViewX sourcetoviewxIAuthTabCallback;
        String strOnNavigationEvent;
        AppBarLayout appBarLayoutFindViewById;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        vTranslateForSCenter vtranslateforscenter = vTranslateForSCenter.onExtraCallbackWithResult;
        vtranslateforscenter.onWarmupCompleted(handlememorypressure.IAuthTabCallback());
        FragmentActivity activity = getActivity();
        if (activity != null && (appBarLayoutFindViewById = activity.findViewById(R.id.appbarLayout)) != null) {
            appBarLayoutFindViewById.setVisibility(0);
        }
        if (!onExtraCallback().RemoteActionCompatParcelizer()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            sWidth swidth = (sWidth) vTranslateForSCenter.onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -842940236, new Object[]{vtranslateforscenter, contextRequireContext, handlememorypressure.IAuthTabCallback()}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 842940237, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
            if (swidth != null) {
                int i4 = IAuthTabCallback_Parcel + 43;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 == 0) {
                    swidth.IAuthTabCallback();
                    throw null;
                }
                sourcetoviewxIAuthTabCallback = swidth.IAuthTabCallback();
            } else {
                sourcetoviewxIAuthTabCallback = null;
            }
            if (sourcetoviewxIAuthTabCallback == sourceToViewX.CERTIFY_SUCCESS) {
                int i5 = getInterfaceDescriptor + 87;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 != 0) {
                    GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 3, null);
                    return;
                } else {
                    GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 2, null);
                    return;
                }
            }
            asInterface();
            if (swidth != null) {
                onExtraCallbackWithResult(swidth);
                sourceToViewX.IAuthTabCallback iAuthTabCallback = sourceToViewX.Companion;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                strOnNavigationEvent = iAuthTabCallback.onNavigationEvent(fragmentActivityRequireActivity, swidth.IAuthTabCallback());
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R.string.guardian_pending_certify_bad_info_dialog_message);
                Intrinsics.checkNotNullExpressionValue(string, "");
                strOnNavigationEvent = String.format(string, Arrays.copyOf(new Object[]{createPaints.IAuthTabCallback.asBinder()}, 1));
                Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent, "");
            }
            onWarmupCompleted(strOnNavigationEvent);
            return;
        }
        int i6 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        GuestBaseFragment.IAuthTabCallback(this, R.id.action_guardianCertifyWaitingFragment_to_guardianAgreementCompleteFragment, null, 2, null);
    }

    private final void onExtraCallbackWithResult(sWidth swidth) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new access100(swidth, null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 6 / 0;
        return null;
    }

    private static final Unit onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            BaseFragment.showProgressDialog$default(guardianPendingCertifyFragment, (String) null, true, 2, (Object) null);
        } else {
            BaseFragment.showProgressDialog$default(guardianPendingCertifyFragment, (String) null, false, 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final void access100(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        guardianPendingCertifyFragment.dismissProgressDialog();
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        this.onTransact = null;
        writeRaw<BaseApiResponse<getJavaScriptContext>> writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().IAuthTabCallback(new lambdadestroy1(onUnminimized().access100()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onTransact(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                GuardianPendingCertifyFragment.access000(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda4
            public final void run() {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 986476458, -986476447, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onNavigationEvent(this.f$0, (getJavaScriptContext) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                GuardianPendingCertifyFragment.asBinder(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onWarmupCompleted(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda8
            public final void accept(Object obj) {
                GuardianPendingCertifyFragment.asInterface(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment r8, java.lang.Throwable r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r9 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            r2 = 24
            int r2 = r2 / 0
            if (r1 == 0) goto L42
            goto L1b
        L17:
            boolean r1 = r9 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            if (r1 == 0) goto L42
        L1b:
            r1 = r9
            im.toss.network.throwable.TossApiCallException$ApiError r1 = (im.toss.network.throwable.TossApiCallException.ApiError) r1
            java.lang.String r1 = r1.asBinder()
            java.lang.String r2 = "TV4002"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L42
            int r8 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor
            int r8 = r8 + 63
            int r9 = r8 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel = r9
            int r8 = r8 % r0
            o.fileSRect r8 = o.fileSRect.onNavigationEvent
            r8.onNavigationEvent()
            int r8 = viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.IAuthTabCallback_Parcel
            int r8 = r8 + 21
            int r9 = r8 % 128
            viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.getInterfaceDescriptor = r9
            int r8 = r8 % r0
            goto L54
        L42:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            android.content.Context r1 = r8.requireContext()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r9
            o.getParamImp.onWarmupCompleted(r0, r1, r2, r3, r4, r5, r6, r7)
        L54:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment.onExtraCallback(viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment, java.lang.Throwable):kotlin.Unit");
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallback != null) {
            dismissProgressDialog();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", this.onExtraCallback);
            startActivity(Intent.createChooser(intent, this.onExtraCallback));
            return;
        }
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1107336658, 1107336666, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuardianPendingCertifyFragment.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0026onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super GuestUnderFourteenGuardianSmsResponse>, Object> {
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ GuardianPendingCertifyFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0026onExtraCallbackWithResult(access13800 access13800Var, GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
                super(2, access13800Var);
                this.this$0 = guardianPendingCertifyFragment;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super GuestUnderFourteenGuardianSmsResponse> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new C0026onExtraCallbackWithResult(access13800Var, this.this$0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    shouldAllowBackgroundPlayback shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras();
                    GuestUnderFourteenSessionRequest guestUnderFourteenSessionRequest = new GuestUnderFourteenSessionRequest(GuardianPendingCertifyFragment.asInterface(this.this$0).access100());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = shouldallowbackgroundplaybackRequestPostMessageChannelWithExtras.IAuthTabCallback(guestUnderFourteenSessionRequest, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (GuestUnderFourteenGuardianSmsResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianSmsResponse");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(GuestUnderFourteenGuardianSmsResponse.class, Object.class) || Intrinsics.areEqual(GuestUnderFourteenGuardianSmsResponse.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    BaseFragment.showProgressDialog$default(GuardianPendingCertifyFragment.this, (String) null, false, 3, (Object) null);
                    GuardianPendingCertifyFragment guardianPendingCertifyFragment = GuardianPendingCertifyFragment.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    C0026onExtraCallbackWithResult c0026onExtraCallbackWithResult = new C0026onExtraCallbackWithResult(null, guardianPendingCertifyFragment);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0026onExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            GuardianPendingCertifyFragment guardianPendingCertifyFragment2 = GuardianPendingCertifyFragment.this;
            if (Result.onNavigationEvent(obj2)) {
                GuardianPendingCertifyFragment.onWarmupCompleted(guardianPendingCertifyFragment2, ((GuestUnderFourteenGuardianSmsResponse) obj2).onExtraCallback());
                GuardianPendingCertifyFragment.IAuthTabCallbackDefault(guardianPendingCertifyFragment2);
            }
            GuardianPendingCertifyFragment guardianPendingCertifyFragment3 = GuardianPendingCertifyFragment.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                guardianPendingCertifyFragment3.dismissProgressDialog();
                getParamImp.onWarmupCompleted(th, guardianPendingCertifyFragment3.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void IAuthTabCallbackStubProxy(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).onNavigationEvent.asInterface().setLoading(false);
        int i4 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, getTurboModuleRegistry getturbomoduleregistry) {
        int i = 2 % 2;
        guardianPendingCertifyFragment.IAuthTabCallbackDefault--;
        ConstraintLayout root = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        String string = guardianPendingCertifyFragment.getString(R.string.app_guardian_pending_certify_sms_toast);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(root, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit asBinder(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if ((th instanceof TossApiCallException.ApiError) && Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), "TV8204")) {
            Unit unit = Unit.INSTANCE;
            int i4 = getInterfaceDescriptor + 119;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return unit;
        }
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, guardianPendingCertifyFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<getTurboModuleRegistry>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onWarmupCompleted(new jniSetSourceURL(onUnminimized().access100(), false));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new IAuthTabCallback_Parcel(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda30
            public final void run() {
                GuardianPendingCertifyFragment.IAuthTabCallback(this.f$0);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onNavigationEvent(this.f$0, (getTurboModuleRegistry) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda32
            public final void accept(Object obj) {
                Object[] objArr = {function1, obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1593426483, 1593426488, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda34
            public final void accept(Object obj) {
                GuardianPendingCertifyFragment.IAuthTabCallbackStub(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = IAuthTabCallback_Parcel + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ GuestUnderFourteenAgreementCountRequest $req;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        final /* synthetic */ GuardianPendingCertifyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(GuestUnderFourteenAgreementCountRequest guestUnderFourteenAgreementCountRequest, GuardianPendingCertifyFragment guardianPendingCertifyFragment, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$req = guestUnderFourteenAgreementCountRequest;
            this.this$0 = guardianPendingCertifyFragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStubProxy(this.$req, this.this$0, access13800Var);
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            final /* synthetic */ GuestUnderFourteenAgreementCountRequest $req$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, GuestUnderFourteenAgreementCountRequest guestUnderFourteenAgreementCountRequest) {
                super(2, access13800Var);
                this.$req$inlined = guestUnderFourteenAgreementCountRequest;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(access13800Var, this.$req$inlined);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    if (objOnWarmupCompleted == null) {
                        return objOnWarmupCompleted;
                    }
                    obj = null;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    GuestUnderFourteenAgreementCountRequest guestUnderFourteenAgreementCountRequest = this.$req;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, guestUnderFourteenAgreementCountRequest);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            GuardianPendingCertifyFragment guardianPendingCertifyFragment = this.this$0;
            if (Result.onNavigationEvent(obj2)) {
                ConstraintLayout root = GuardianPendingCertifyFragment.onNavigationEvent(guardianPendingCertifyFragment).getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                String string = guardianPendingCertifyFragment.getString(R.string.app_guardian_pending_certify_sms_reset_toast);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(root, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
                GuardianPendingCertifyFragment.asBinder(guardianPendingCertifyFragment);
            }
            GuardianPendingCertifyFragment guardianPendingCertifyFragment2 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, guardianPendingCertifyFragment2.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallbackWithResult(Pair<Boolean, Boolean> pair) {
        int i = 2 % 2;
        GuestUnderFourteenAgreementCountRequest guestUnderFourteenAgreementCountRequest = new GuestUnderFourteenAgreementCountRequest(onUnminimized().access100(), ((Boolean) pair.getFirst()).booleanValue(), ((Boolean) pair.getSecond()).booleanValue());
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStubProxy(guestUnderFourteenAgreementCountRequest, this, null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    private final void extraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = this.access000;
        if (deserializeurinullablecollection != null) {
            int i5 = i2 + 65;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
                throw null;
            }
            zzbr.onWarmupCompleted(deserializeurinullablecollection);
        }
        getByteBuffer getbytebufferOnNavigationEvent = getByteBuffer.onNavigationEvent(0L, 1000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnNavigationEvent, "");
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnNavigationEvent.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda27
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onExtraCallbackWithResult(this.f$0, (Long) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnExtraCallback.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda28
            public final void accept(Object obj) {
                Object[] objArr = {function1, obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -831923428, 831923440, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
            }
        });
        Intrinsics.checkNotNull(deserializeurinullablecollectionIAuthTabCallback);
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        this.access000 = deserializeurinullablecollectionIAuthTabCallback;
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    private final void onExtraCallbackWithResult(Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (l != null) {
            int i4 = i2 + 81;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int iLongValue = (int) (l.longValue() / 1000);
            int iLongValue2 = (int) ((l.longValue() / 60000) % 60);
            int iLongValue3 = (int) ((l.longValue() / 3600000) % 24);
            int iLongValue4 = (int) ((l.longValue() / 3600000) / 24);
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).IAuthTabCallbackStubProxy.setText(onExtraCallbackWithResult(iLongValue4, iLongValue3, iLongValue2, iLongValue % 60));
            if (l.longValue() == 0) {
                deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
                if (deserializeurinullablecollection != null) {
                    zzbr.onWarmupCompleted(deserializeurinullablecollection);
                }
                deserializeUriNullableCollection deserializeurinullablecollection2 = this.access000;
                if (deserializeurinullablecollection2 != null) {
                    zzbr.onWarmupCompleted(deserializeurinullablecollection2);
                }
                IAuthTabCallback_Parcel();
                int i6 = getInterfaceDescriptor + 103;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private final void extraCallbackWithResult() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1226871L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda29
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onExtraCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1226875L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        fileSRect.onNavigationEvent.onNavigationEvent();
        guardianPendingCertifyFragment.onNavigationEvent().IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 23;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(guardianPendingCertifyFragment.getString(R.string.guardian_pending_certify_request_cancel_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(guardianPendingCertifyFragment.getString(R.string.guardian_pending_certify_request_cancel_dialog_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.close, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.guardian_pending_certify_request_cancel_dialog_positive_button_title, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DANGER, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        }, 4, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_title", str);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    private final void onWarmupCompleted(final String str) {
        int i = 2 % 2;
        final String string = getString(R.string.guardian_pending_certify_bad_info_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1235609L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda35
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onExtraCallback(string, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Context context = getContext();
        if (context != null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda36
                public final Object invoke(Object obj) {
                    return GuardianPendingCertifyFragment.onExtraCallbackWithResult(string, str, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
            int i2 = IAuthTabCallback_Parcel + 7;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_title", str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, final String str, DialogInterface dialogInterface) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1235615L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onNavigationEvent(str, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Object[] objArr = {guardianPendingCertifyFragment.onUnminimized(), true};
        CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, -1338242766, 1338242768, ICustomTabsCallbackStubProxy.onExtraCallback());
        GuestBaseFragment.IAuthTabCallback(guardianPendingCertifyFragment, R.id.action_guardianCertifyWaitingFragment_to_userInfoDummyFragment, null, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(final String str, String str2, final GuardianPendingCertifyFragment guardianPendingCertifyFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        if (str2 == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = guardianPendingCertifyFragment.getString(R.string.guardian_pending_certify_bad_info_dialog_message);
            Intrinsics.checkNotNullExpressionValue(string, "");
            str2 = String.format(string, Arrays.copyOf(new Object[]{createPaints.IAuthTabCallback.asBinder()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int i4 = IAuthTabCallback_Parcel + 85;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return GuardianPendingCertifyFragment.onWarmupCompleted(this.f$0, str, (DialogInterface) obj);
            }
        });
        return Unit.INSTANCE;
    }

    private final void asInterface() {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallbackStub;
        if (deserializeurinullablecollection != null) {
            int i2 = getInterfaceDescriptor + 15;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            zzbr.onWarmupCompleted(deserializeurinullablecollection);
            int i4 = getInterfaceDescriptor + 81;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        deserializeUriNullableCollection deserializeurinullablecollection2 = this.access000;
        if (deserializeurinullablecollection2 != null) {
            int i6 = getInterfaceDescriptor + 51;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            zzbr.onWarmupCompleted(deserializeurinullablecollection2);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final Bundle onExtraCallback(boolean z) {
            return RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_SHOW_PERMISSION_REQUESTED_LAYOUT", Boolean.valueOf(z))});
        }
    }

    private final void access100() throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this.asInterface) {
            ConstraintLayout constraintLayout = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(4);
            SubTypography5 subTypography5 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(subTypography5, "");
            subTypography5.setVisibility(4);
            TdsImageView tdsImageView = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(4);
            SubTypography5 subTypography52 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).IAuthTabCallback_Parcel;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(R.string.guardian_pending_certify_request_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = String.format(string, Arrays.copyOf(new Object[]{APImageInfo.onNavigationEvent.asBinder()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            subTypography52.setText(str);
            TdsImageView tdsImageView2 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
            Object[] objArr = new Object[1];
            a(Color.green(0) + 55, AndroidCharacter.getMirror('0') - 20, new char[]{65495, 27, 65493, '\n', 65497, 65493, 19, 15, 65492, 25, 25, 21, 26, 65492, '\t', 15, 26, 7, 26, 25, 65493, 65493, 65504, 25, 22, 26, 26, 14, '\r', 20, 22, 65492, '\r', 20, 22, 7, 65491, 25, 25, 11, 24, 22, 19, 21, '\t', 65491, 65496, 26, 18, 7, 65491, 65513, 65502, 65498, 65516}, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 193, objArr);
            TdsImageView.setImage$default(tdsImageView2, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
            this.asInterface = false;
            TdsImageView tdsImageView3 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            dangerouslyForceOverride dangerouslyforceoverride = dangerouslyForceOverride.onExtraCallbackWithResult;
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(tdsImageView3, 0.0f, 1.0f, 50L, 0L, dangerouslyforceoverride.onWarmupCompleted(), false, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda24
                public final Object invoke(Object obj) {
                    return GuardianPendingCertifyFragment.onExtraCallback((View) obj);
                }
            }, (Function1) null, 160, (Object) null);
            TdsImageView tdsImageView4 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(tdsImageView4, varyMatches.onNavigationEvent(40, displayMetrics), 300L, 0L, dangerouslyforceoverride.onExtraCallback(), (Function1) null, (Function1) null, 48, (Object) null);
            SubTypography5 subTypography53 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(subTypography53, "");
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(subTypography53, 0.0f, 1.0f, 200L, 0L, dangerouslyforceoverride.onWarmupCompleted(), false, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda25
                public final Object invoke(Object obj) {
                    return GuardianPendingCertifyFragment.onWarmupCompleted((View) obj);
                }
            }, (Function1) null, 160, (Object) null);
            SubTypography5 subTypography54 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).IAuthTabCallback_Parcel;
            Intrinsics.checkNotNullExpressionValue(subTypography54, "");
            DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(subTypography54, varyMatches.onNavigationEvent(20, displayMetrics2), 500L, 0L, dangerouslyforceoverride.onExtraCallback(), (Function1) null, (Function1) null, 48, (Object) null);
            ConstraintLayout root = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).getRoot();
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            ConstraintLayout constraintLayout3 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, Cache.DOWN, AuthenticatorCompanionAuthenticatorNone.SLOW, false, (Function1) null, 24, (Object) null);
            Boolean bool = Boolean.FALSE;
            isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted(root, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{constraintLayout3, appLovinSdkSettingsIAuthTabCallback, 0, null, 0, null, null, bool, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 2000, 0L, false, 3320, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.guest.certify.guardian.GuardianPendingCertifyFragment$$ExternalSyntheticLambda26
                public final Object invoke() {
                    Object[] objArr2 = {this.f$0};
                    int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                    return (Unit) GuardianPendingCertifyFragment.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 116269994, -116269975, objArr2, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                }
            }, 1, (Object) null), false, 1, (Object) null);
            return;
        }
        ConstraintLayout constraintLayout4 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        constraintLayout4.setVisibility(8);
        ConstraintLayout constraintLayout5 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult())).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        constraintLayout5.setVisibility(0);
        int i4 = getInterfaceDescriptor + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        TdsTopV2View tdsTopV2View = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).getInterfaceDescriptor;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String string = getString(viva.republica.toss.R.string.guardian_certify_pending_top_1, new Object[]{APImageInfo.onNavigationEvent.asBinder()});
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setTitleText(string);
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        Typography6 typography6 = ((CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).IAuthTabCallbackStubProxy;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        typography6.setVisibility(0);
        int i4 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final SpannedString onExtraCallbackWithResult(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (((Object) VideoConfig.onWarmupCompleted(APImageInfo.onNavigationEvent.IAuthTabCallback(), (String) null, 1, (Object) null)) + "\n"));
        spannableStringBuilder.append((CharSequence) getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_prefix));
        spannableStringBuilder.append((CharSequence) " ");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Configuration configuration = contextRequireContext.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallbackStub(configuration)).ICustomTabsServiceStubProxy());
        int length = spannableStringBuilder.length();
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_days);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " ");
        }
        if (i2 > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_hours);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) " ");
        }
        if (i3 > 0) {
            int i6 = getInterfaceDescriptor + 91;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_mins);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            spannableStringBuilder.append((CharSequence) str3);
            spannableStringBuilder.append((CharSequence) " ");
        }
        if (i4 > 0) {
            int i8 = IAuthTabCallback_Parcel + 75;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String string4 = getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_seconds);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String str4 = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) getString(viva.republica.toss.R.string.guardian_pending_certify_remaining_time_postfix));
        return new SpannedString(spannableStringBuilder);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -831923428, 831923440, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 177222122, -177222105, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 116269994, -116269975, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1593426483, 1593426488, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -716532646, 716532661, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -238550911, 238550917, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 986476458, -986476447, new Object[]{guardianPendingCertifyFragment}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Pair pair) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1645867181, 1645867195, new Object[]{guardianPendingCertifyFragment, pair}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ void onExtraCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, int i) {
        Object[] objArr = {guardianPendingCertifyFragment, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 188169234, -188169231, objArr, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private final void IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1107336658, 1107336666, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private final CertPathValidator onTransact() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (CertPathValidator) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1802144978, 1802144978, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(GuardianPendingCertifyFragment guardianPendingCertifyFragment, lambdadestroy2 lambdadestroy2Var) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1701843806, -1701843804, new Object[]{guardianPendingCertifyFragment, lambdadestroy2Var}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Throwable th) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 1719102788, -1719102778, new Object[]{guardianPendingCertifyFragment, th}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1336851095, 1336851102, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, getJavaScriptContext getjavascriptcontext) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 524360414, -524360394, new Object[]{guardianPendingCertifyFragment, getjavascriptcontext}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 273784525, -273784521, new Object[]{function1, obj}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private final void access000() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 627913606, -627913588, new Object[]{this}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onNavigationEvent(View view) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1880842441, 1880842442, new Object[]{view}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(GuardianPendingCertifyFragment guardianPendingCertifyFragment, jniCallJSCallback jnicalljscallback) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), 755522625, -755522612, new Object[]{guardianPendingCertifyFragment, jnicalljscallback}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1119681184, 1119681193, new Object[]{str, setDetectableSize}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onNavigationEvent(GuardianPendingCertifyFragment guardianPendingCertifyFragment, Long l) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), -1565429920, 1565429936, new Object[]{guardianPendingCertifyFragment, l}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    static void onWarmupCompleted() {
        access100 = 478308929;
    }
}
