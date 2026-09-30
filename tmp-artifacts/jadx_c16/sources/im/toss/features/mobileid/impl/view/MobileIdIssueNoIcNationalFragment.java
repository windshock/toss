package im.toss.features.mobileid.impl.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.view.MobileIdIssueNoIcNationalFragment$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RulerAlignmentKtExternalSyntheticLambda5;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.ToggleableKtExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.component5;
import o.deepScan;
import o.getAwbState;
import o.getBacktraceNote;
import o.oExternalSyntheticLambda0;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u3;
import o.u4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdIssueNoIcNationalFragment extends Hilt_MobileIdIssueNoIcNationalFragment {

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {84, -122, 19, 43};
    private static final int $$b = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private static int IAuthTabCallback = 478308995;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = (s2 * 2) + 105;
        int i3 = s3 + 4;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 += i5;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i++;
            i5 = bArr[i3];
            i2 += i5;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i3++;
            if (i == i4) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(composeView, mobileIdIssueNoIcNationalFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(composeView, mobileIdIssueNoIcNationalFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~((~i) | i4)) | i3;
        int i8 = ~i3;
        int i9 = (~(i8 | i4)) | (~(i8 | i)) | (~(i4 | i));
        int i10 = (~(i | (~i4))) | i8;
        int i11 = i3 + i4 + i2 + ((-2137991558) * i5) + (111092868 * i6);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i3) - 566755328) + (427185167 * i4) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i2) + ((-1247805440) * i5) + ((-1807745024) * i6) + ((-591921152) * i12);
        int i14 = (i3 * (-1469267343)) + 1003592187 + (i4 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i2 * (-1469268067)) + (i5 * 1951436498) + (i6 * (-746069772)) + (i12 * (-1529348096));
        return i13 + ((i14 * i14) * 1762131968) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -305918263, 305918264, new Object[]{mobileIdIssueNoIcNationalFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(composeView, mobileIdIssueNoIcNationalFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(composeView, mobileIdIssueNoIcNationalFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mobileIdIssueNoIcNationalFragment);
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ComposeView composeView = (ComposeView) objArr[0];
        MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment = (MobileIdIssueNoIcNationalFragment) objArr[1];
        u3 u3Var = (u3) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(composeView, mobileIdIssueNoIcNationalFragment, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onWarmupCompleted(composeView, mobileIdIssueNoIcNationalFragment, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return -1L;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-617347752, true, new MobileIdIssueNoIcNationalFragment$.ExternalSyntheticLambda0(composeView, this))));
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return composeView;
    }

    private static final Unit IAuthTabCallback(MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47, 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{20, '\b', 65492, 6, 27, 21, 18, 65492, 23, 16, 65491, 20, '\f', 65491, 6, 27, 21, 18, 65491, 28, 28, 28, 65492, 65492, 65503, 24, 21, 25, 25, '\r', 65499, 65501, 65500, 65494, 65506, 30, '\n', 16, 65508, 20, '\t', 65491, 24, 25, 19, '\n', 25, 19}, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 260, objArr);
        mobileIdIssueNoIcNationalFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) objArr[0]).intern())));
        FragmentActivity activity = mobileIdIssueNoIcNationalFragment.getActivity();
        if (activity != null) {
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            activity.finish();
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 2;
            } else {
                int i5 = onExtraCallback + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i | i3;
            int i7 = onExtraCallback + 91;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onWarmupCompleted + 105;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(309486693, i2, -1, "im.toss.features.mobileid.impl.view.MobileIdIssueNoIcNationalFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileIdIssueNoIcNationalFragment.kt:95)");
            }
            String string = composeView.getContext().getString(R.string.mobileid_impl_no_ic_national_cta);
            Intrinsics.checkNotNullExpressionValue(string, "");
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(mobileIdIssueNoIcNationalFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback)) {
                objOnMinimized = new MobileIdIssueNoIcNationalFragment$.ExternalSyntheticLambda1(mobileIdIssueNoIcNationalFragment);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                u4Var.onNavigationEvent(string, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i11 = onExtraCallback + 97;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                u4Var.onNavigationEvent(string, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) objOnMinimized, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MobileIdIssueActivity mobileIdIssueActivity;
        MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment = (MobileIdIssueNoIcNationalFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MobileIdIssueActivity activity = mobileIdIssueNoIcNationalFragment.getActivity();
        if (Class.forName("im.toss.features.mobileid.impl.view.MobileIdIssueActivity").isInstance(activity)) {
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                mobileIdIssueActivity = activity;
                int i5 = 95 / 0;
            } else {
                mobileIdIssueActivity = activity;
            }
        } else {
            mobileIdIssueActivity = null;
        }
        if (mobileIdIssueActivity == null) {
            return Unit.INSTANCE;
        }
        mobileIdIssueNoIcNationalFragment.startActivity(mobileIdIssueActivity.getIntent());
        mobileIdIssueActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onWarmupCompleted + 81;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1372395070, i2, -1, "im.toss.features.mobileid.impl.view.MobileIdIssueNoIcNationalFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MobileIdIssueNoIcNationalFragment.kt:109)");
            }
            String string = composeView.getContext().getString(R.string.mobileid_impl_no_ic_national_cta_bottom);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(mobileIdIssueNoIcNationalFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i8 = onExtraCallback + 93;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 95 / 0;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new MobileIdIssueNoIcNationalFragment$.ExternalSyntheticLambda4(mobileIdIssueNoIcNationalFragment);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    u3Var.IAuthTabCallback(string, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 3072, 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    u3Var.IAuthTabCallback(string, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 3072, 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-617347752, i, -1, "im.toss.features.mobileid.impl.view.MobileIdIssueNoIcNationalFragment.onCreateView.<anonymous>.<anonymous> (MobileIdIssueNoIcNationalFragment.kt:46)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = onWarmupCompleted + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                getAwbState.onExtraCallback();
                int i7 = onExtraCallback + 111;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i9 = onWarmupCompleted + 79;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            ToggleableKtExternalSyntheticLambda1.onExtraCallback((RulerAlignmentKtExternalSyntheticLambda5) null, 0, 0, deepScan.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 3072, 7);
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(309486693, true, new MobileIdIssueNoIcNationalFragment$.ExternalSyntheticLambda2(composeView, mobileIdIssueNoIcNationalFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(1372395070, true, new MobileIdIssueNoIcNationalFragment$.ExternalSyntheticLambda3(composeView, mobileIdIssueNoIcNationalFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 12583296, 0, 3962);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 125;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.indexOf("", "", 0)), 23 - (Process.myPid() >> 22), 10278 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 55, 2167 - Drawable.resolveOpacity(0, 0), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i9 = $11 + 123;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i) % 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getSize(0)), ImageFormat.getBitsPerPixel(0) + 56, 2167 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ExpandableListView.getPackedPositionChild(0L)), 54 - TextUtils.lastIndexOf("", '0', 0), 2166 - ((byte) KeyEvent.getModifierMetaStateMask()), 1298711993, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ComposeView composeView, MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 2013058401, -2013058401, new Object[]{composeView, mobileIdIssueNoIcNationalFragment, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onNavigationEvent(MobileIdIssueNoIcNationalFragment mobileIdIssueNoIcNationalFragment) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -305918263, 305918264, new Object[]{mobileIdIssueNoIcNationalFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }
}
