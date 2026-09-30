package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getViewTypeCount;
import o.getWebViewType;
import o.onUnavailable;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.w3b;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getWebViewType {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted = {-766355300, 1167692164, -407844909, 1164287586, -1033833950, -1552937854, 758458502, 1001297052, -74798904, 97393376, 794289703, -1148033865, -1974662216, 1689565856, 1772546033, 1383809884, 710488765, -1336131623};

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        onUnavailable onunavailable = (onUnavailable) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, function1, onunavailable, function12, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i | i6);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i6)) | (~(i7 | i8 | i9)) | i11 | (~(i | i5));
        int i14 = i + i6 + i2 + (1272450877 * i3) + ((-51365948) * i4);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i) + 922746880 + ((-1437248296) * i6) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i2) + ((-1881145344) * i3) + ((-578813952) * i4) + ((-124846080) * i15);
        int i17 = (i * 1187242746) + 1002376400 + (i6 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i2 * 1187242569) + (i3 * (-1484311963)) + (i4 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        onUnavailable onunavailable = (onUnavailable) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(onunavailable, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(onunavailable, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, onunavailable);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(onUnavailable onunavailable, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onunavailable, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        onUnavailable onunavailable = (onUnavailable) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function1, onunavailable, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, onunavailable, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(useandconfigureprogramwithtexture);
        }
        onNavigationEvent(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onUnavailable onunavailable = (onUnavailable) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onunavailable, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, onUnavailable onunavailable, Function1 function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(function1, onunavailable, function12, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, onunavailable, function12, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onUnavailable onunavailable, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, onunavailable, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, onunavailable);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, onunavailable);
        int i3 = IAuthTabCallback + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onUnavailable onunavailable, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, onunavailable, (Function1<? super onUnavailable, Unit>) function1, (Function1<? super onUnavailable, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onWarmupCompleted(quirksExternalSyntheticBackport0, onunavailable, (Function1<? super onUnavailable, Unit>) function1, (Function1<? super onUnavailable, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(onUnavailable onunavailable, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onunavailable, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        return unitOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[PHI: r3
      0x00b1: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v17 java.lang.String) binds: [B:33:0x00ae, B:30:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(onUnavailable onunavailable, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        String str;
        int i3 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onNavigationEvent + 107;
            IAuthTabCallback = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1355057063, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:56)");
            }
            if (onunavailable != null) {
                int i6 = IAuthTabCallback + 3;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                    str = (String) onUnavailable.onExtraCallbackWithResult(-472189384, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 472189386);
                    int i7 = 37 / 0;
                    if (str == null) {
                        int i8 = IAuthTabCallback + 49;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        str2 = str;
                    }
                } else {
                    int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
                    str = (String) onUnavailable.onExtraCallbackWithResult(-472189384, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 472189386);
                    if (str == null) {
                    }
                }
                w3bVar.onExtraCallbackWithResult(str2, (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onNavigationEvent + 113;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i11 != 0) {
                        int i12 = 35 / 0;
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(onUnavailable onunavailable, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 17) != 67;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 41;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2068673320, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:61)");
            }
            if (onunavailable != null) {
                int i6 = IAuthTabCallback + 109;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    onunavailable.onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String strOnExtraCallbackWithResult = onunavailable.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                    strOnExtraCallbackWithResult = "";
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    int i7 = onNavigationEvent + 11;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-574790993);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-574790033);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallbackWithResult, null, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(onUnavailable onunavailable, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str;
        String strAccess100;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onNavigationEvent + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1039398471, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:67)");
            }
            if (onunavailable == null || (strAccess100 = onunavailable.access100()) == null) {
                int i5 = onNavigationEvent + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                str = "";
            } else {
                str = strAccess100;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final onUnavailable onunavailable, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = IAuthTabCallback + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2 == 0 ? 2 : 4;
                i |= i6;
            }
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i7 = onNavigationEvent + 97;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2126199693, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:59)");
            }
            w5aVar.IAuthTabCallbackStub(ForwardingCameraControl.onExtraCallback(2068673320, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 29;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        return (Unit) getWebViewType.onExtraCallback(-1455247203, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{onunavailable, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1455247206);
                    }
                    Object[] objArr = {onunavailable, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int i10 = 54 / 0;
                    return (Unit) getWebViewType.onExtraCallback(-1455247203, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1455247206);
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1039398471, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 73;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    onUnavailable onunavailable2 = onunavailable;
                    RowScope rowScope = (RowScope) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i10 != 0) {
                        return getWebViewType.onExtraCallback(onunavailable2, rowScope, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    }
                    getWebViewType.onExtraCallback(onunavailable2, rowScope, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
            unit = Unit.INSTANCE;
            int i3 = 57 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(onunavailable);
            return Unit.INSTANCE;
        }
        function1.invoke(onunavailable);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final Function1 function1, final onUnavailable onunavailable, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i7 = onNavigationEvent + 7;
                IAuthTabCallback = i7 % 128;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                int i8 = onNavigationEvent + 71;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1968038115, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:75)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda9
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 9;
                        onNavigationEvent = i11 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                        if (i11 % 2 != 0) {
                            getWebViewType.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = getWebViewType.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                        int i12 = onNavigationEvent + 51;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onunavailable);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i10 = onNavigationEvent + 51;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda10
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = onWarmupCompleted + 9;
                            onExtraCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                getWebViewType.onExtraCallback(function1, onunavailable);
                                throw null;
                            }
                            Unit unitOnExtraCallback = getWebViewType.onExtraCallback(function1, onunavailable);
                            int i14 = onWarmupCompleted + 25;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda2.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, 0L, (Function0) obj2, 511, (Object) null);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                    int i12 = IAuthTabCallback + 125;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr = new Object[1];
                    a(new int[]{-1638996721, -347490299, 735920783, -1753457159, 1754816089, -177331330, 615681041, 225680995, 1325229675, -172220415, -1433702426, -1677621567, 1035333290, -953504104, 668492890, 1871914538, 879847493, 1656534477, 636074877, 1955108176, 1394668733, -2046293225, -1080310467, -149448050, -1140535609, 858724585, 1969169011, 1336269961, 571723605, -1510897550, -650308425, 2106060911, -487984392, 188810894}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 67, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-1638996721, -347490299, 735920783, -1753457159, 1754816089, -177331330, 615681041, 225680995, 1325229675, -172220415, -1433702426, -1677621567, 1035333290, -953504104, 668492890, 1871914538, 879847493, 1656534477, 636074877, 1955108176, 1394668733, -2046293225, -1151426534, -425112170, 1562556751, -1487608279, -2141255235, 950674823, -1076770894, 999058894}, 59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                    obj = objArr2[0];
                }
                rightPreset.onNavigationEvent(((String) obj).intern(), quirksExternalSyntheticBackport0OnNavigationEvent, 0.0f, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.close, cameraCaptureResultEmptyCameraCaptureResult, 0), 0L, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 18) & 3670016, 52);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(onunavailable);
            return Unit.INSTANCE;
        }
        function1.invoke(onunavailable);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final Function1 function1, final onUnavailable onunavailable, final Function1 function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(479212112, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous>.<anonymous>.<anonymous> (CreditHomeIntelliSection.kt:50)");
                int i6 = onNavigationEvent + 123;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (DefaultConstructorMarker) null));
            getViewTypeCount.onTransact ontransactIAuthTabCallback = getViewTypeCount.onTransact.Companion.IAuthTabCallback();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(2126199693, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda5
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 33;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnWarmupCompleted = getWebViewType.onWarmupCompleted(onunavailable, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onWarmupCompleted + 79;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1355057063, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 95;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    Object[] objArr = {onunavailable, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    if (i10 == 0) {
                        return (Unit) getWebViewType.onExtraCallback(784518846, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback4, objArr, iIAuthTabCallback, -784518846);
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-1968038115, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda7
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unit;
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 63;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        unit = (Unit) getWebViewType.onExtraCallback(-1445444885, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{function12, onunavailable, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1445444886);
                        int i10 = 61 / 0;
                    } else {
                        unit = (Unit) getWebViewType.onExtraCallback(-1445444885, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{function12, onunavailable, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1445444886);
                    }
                    int i11 = onWarmupCompleted + 45;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unit;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onunavailable);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda8
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onWarmupCompleted + 17;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnWarmupCompleted = getWebViewType.onWarmupCompleted(function1, onunavailable);
                            int i11 = onNavigationEvent + 121;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback3, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactIAuthTabCallback, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 197046, 384, 110552);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i8 = IAuthTabCallback + 9;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = onNavigationEvent + 43;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function1 function1, final onUnavailable onunavailable, final Function1 function12, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1481816160, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection.<anonymous> (CreditHomeIntelliSection.kt:43)");
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Object obj = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i5 = IAuthTabCallback + 79;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                getAwbState.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        BlankScreenPoint.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 0, 4, 0, false, ForwardingCameraControl.onExtraCallback(479212112, true, new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 97;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Function1 function13 = function1;
                if (i8 == 0) {
                    return getWebViewType.onNavigationEvent(function13, onunavailable, function12, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                getWebViewType.onNavigationEvent(function13, onunavailable, function12, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 197046, 24);
        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable final onUnavailable onunavailable, @NotNull final Function1<? super onUnavailable, Unit> function1, @NotNull final Function1<? super onUnavailable, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1027704776);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = onNavigationEvent + 89;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i4 = 4;
            } else {
                int i10 = onNavigationEvent + 85;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 / 5;
                }
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i12 = IAuthTabCallback + 93;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onunavailable);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onunavailable) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i13 = onNavigationEvent + 117;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                i5 = 256;
            } else {
                int i14 = onNavigationEvent + 23;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = IAuthTabCallback + 111;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1027704776, i3, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSection (CreditHomeIntelliSection.kt:37)");
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            setVerticalGravity.onWarmupCompleted(onunavailable != null, (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, (QuirkSettingsLoader.onWarmupCompleted) null, false, (Function1) null, 15, (Object) null)), (String) null, ForwardingCameraControl.onExtraCallback(1481816160, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = IAuthTabCallback + 21;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unit = (Unit) getWebViewType.onExtraCallback(-1284607478, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport04, function12, onunavailable, function1, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1284607480);
                    int i21 = onNavigationEvent + 105;
                    IAuthTabCallback = i21 % 128;
                    int i22 = i21 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 200064, 18);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeIntelliSectionKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 == 0) {
                        return getWebViewType.onNavigationEvent(quirksExternalSyntheticBackport03, onunavailable, function1, function12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    getWebViewType.onNavigationEvent(quirksExternalSyntheticBackport03, onunavailable, function1, function12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i4 = -1469660336;
        char c = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.getDefaultSize(0, 0) + 72, 8848 - TextUtils.indexOf("", "", 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
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
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 61;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Integer.valueOf(iArr5[i8]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 71 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                }
                i8++;
                c = 0;
            }
            int i10 = $11 + 65;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $10 + 47;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 22252), Color.blue(0) + 39, 10302 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16773183) - Color.rgb(0, 0, 0)), 78 - Color.alpha(0), (Process.myTid() >> 22) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ Unit onExtraCallback(onUnavailable onunavailable, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(784518846, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{onunavailable, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -784518846);
    }

    public static /* synthetic */ Unit onNavigationEvent(onUnavailable onunavailable, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(-1455247203, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{onunavailable, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1455247206);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, onUnavailable onunavailable, Function1 function12, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(-1284607478, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, function1, onunavailable, function12, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1284607480);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, onUnavailable onunavailable, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(-1445444885, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{function1, onunavailable, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1445444886);
    }
}
