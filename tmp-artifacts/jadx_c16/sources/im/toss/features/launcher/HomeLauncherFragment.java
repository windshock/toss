package im.toss.features.launcher;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.base.BaseActivity;
import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.features.home.core.ui.R;
import im.toss.features.launcher.HomeLauncherFragment$;
import im.toss.features.launcher.view.HomeLauncherContentComposeView;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.state.spec.SessionState;
import im.toss.uikit.widget.PillarSwipeRefreshLayout;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BaseEmbedView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERString;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.IAnimation;
import o.QuirksExternalSyntheticBackport0;
import o.RVManifestBridgeExtensionManifest;
import o.RVManifestIProxyManifest;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.ZslRingBuffer;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access5300;
import o.decodeRegion;
import o.fillData;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.getAdService;
import o.getBacktraceNote;
import o.getByteBuffer;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getOuterPage;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.moveToNext;
import o.readIntokhttp;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.setSyncFromOutOfReqRate;
import o.y1hExternalSyntheticLambda0;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.StatusManager;

@DERString
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeLauncherFragment extends Hilt_HomeLauncherFragment implements decodeRegion, StatusManager.onExtraCallback {
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 478308912;
    private boolean IAuthTabCallback;

    @Inject
    public RVManifestIProxyManifest homeLogManager;
    private final LinkedHashMap<String, Function0<Unit>> onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;

    @Inject
    public RunDevToolActionUseCase runDevToolAction;

    @Inject
    public SessionTrackerb tossRouter;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = 4 - (b2 * 2);
        int i5 = (i * 2) + 1;
        byte[] bArr = $$a;
        int i6 = (b * 3) + 105;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i6 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Map map = (Map) objArr[0];
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(map, homeLauncherFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(HomeLauncherFragment homeLauncherFragment, setSyncFromOutOfReqRate setsyncfromoutofreqrate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(homeLauncherFragment, setsyncfromoutofreqrate);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(homeLauncherFragment, setsyncfromoutofreqrate);
        int i3 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setSyncFromOutOfReqRate setsyncfromoutofreqrate, HomeLauncherFragment homeLauncherFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setsyncfromoutofreqrate, homeLauncherFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, HomeLauncherFragment homeLauncherFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(pillarSwipeRefreshLayout, homeLauncherFragment);
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(homeLauncherFragment);
        }
        onExtraCallbackWithResult(homeLauncherFragment);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i2)) | i9;
        int i11 = (~((~i2) | i7 | i3)) | (~(i8 | i5));
        int i12 = i5 + i3 + i6 + (531708263 * i4) + ((-608630064) * i);
        int i13 = i12 * i12;
        int i14 = (i5 * (-228234701)) + 730857472 + ((-228234701) * i3) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i6) + ((-45088768) * i4) + ((-419430400) * i) + ((-1471938560) * i13);
        int i15 = ((i5 * (-1679524527)) - 150938974) + (i3 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i6 * (-1679524245)) + (i4 * (-166744051)) + (i * 2062148848) + (i13 * (-865337344));
        switch (i14 + (i15 * i15 * (-1617166336))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
                int i16 = 2 % 2;
                int i17 = IAuthTabCallbackDefault + 69;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(ExpandableListView.getPackedPositionType(0L) + 8, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, new char[]{65531, 65530, 7, 7, 65530, 7, 7, 65530}, true, ((Process.getThreadPriority(0) + 20) >> 6) + 132, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "launcher.logo");
                Unit unit = Unit.INSTANCE;
                int i19 = IAuthTabCallbackDefault + 101;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            return (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1469692030, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1469692032, iOnWarmupCompleted2);
        }
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackDefault(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(homeLauncherFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(new Object[0], DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -740497601, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 740497602, iOnWarmupCompleted2)).booleanValue();
        int i4 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return 5201526L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isMainTabBarCurrentlyVisible() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    public static final class IAuthTabCallbackStub implements View.OnLayoutChangeListener {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        final /* synthetic */ PillarSwipeRefreshLayout IAuthTabCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ HomeLauncherFragment onNavigationEvent;
        final /* synthetic */ HomeLauncherContentComposeView onWarmupCompleted;

        public IAuthTabCallbackStub(HomeLauncherContentComposeView homeLauncherContentComposeView, HomeLauncherFragment homeLauncherFragment, PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view) {
            this.onWarmupCompleted = homeLauncherContentComposeView;
            this.onNavigationEvent = homeLauncherFragment;
            this.IAuthTabCallback = pillarSwipeRefreshLayout;
            this.onExtraCallbackWithResult = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            view.removeOnLayoutChangeListener(this);
            Intrinsics.checkNotNull(this.onWarmupCompleted);
            HomeLauncherContentComposeView homeLauncherContentComposeView = this.onWarmupCompleted;
            homeLauncherContentComposeView.setPadding(homeLauncherContentComposeView.getPaddingLeft(), view.getHeight(), homeLauncherContentComposeView.getPaddingRight(), homeLauncherContentComposeView.getPaddingBottom());
            view.post(this.onNavigationEvent.new asBinder(this.IAuthTabCallback, view, this.onExtraCallbackWithResult, this.onWarmupCompleted));
            int i10 = IAuthTabCallbackDefault + 97;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 10 / 0;
            }
        }
    }

    public HomeLauncherFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new getInterfaceDescriptor(new IAuthTabCallback_Parcel(this)));
        this.onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(HomeLauncherViewModel.class), new readTypedObject(lazyOnNavigationEvent), new ICustomTabsCallback(null, lazyOnNavigationEvent), new extraCallbackWithResult(this, lazyOnNavigationEvent));
        this.onExtraCallback = new LinkedHashMap<>();
    }

    public static final /* synthetic */ boolean IAuthTabCallback(HomeLauncherFragment homeLauncherFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = homeLauncherFragment.onExtraCallbackWithResult;
        int i5 = i2 + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[0];
        setSyncFromOutOfReqRate setsyncfromoutofreqrate = (setSyncFromOutOfReqRate) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        homeLauncherFragment.onExtraCallbackWithResult(setsyncfromoutofreqrate);
        int i4 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ HomeLauncherViewModel onExtraCallback(HomeLauncherFragment homeLauncherFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return homeLauncherFragment.asBinder();
        }
        homeLauncherFragment.asBinder();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(HomeLauncherFragment homeLauncherFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        homeLauncherFragment.onExtraCallbackWithResult = z;
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        LinkedHashMap<String, Function0<Unit>> linkedHashMap = homeLauncherFragment.onExtraCallback;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return linkedHashMap;
    }

    public /* bridge */ boolean isTabBarAlwaysOpaque() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.isTabBarAlwaysOpaque();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsTabBarAlwaysOpaque = super.isTabBarAlwaysOpaque();
        int i3 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zIsTabBarAlwaysOpaque;
    }

    public /* bridge */ void onMainTabBarVisibilityChanged(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onMainTabBarVisibilityChanged(z);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean shouldAnimateMainTabBarVisibility() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zShouldAnimateMainTabBarVisibility = super.shouldAnimateMainTabBarVisibility();
        int i4 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zShouldAnimateMainTabBarVisibility;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RunDevToolActionUseCase IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        RunDevToolActionUseCase runDevToolActionUseCase = this.runDevToolAction;
        if (runDevToolActionUseCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return runDevToolActionUseCase;
        }
        throw null;
    }

    public static final class asInterface implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ View onExtraCallback;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public asInterface(View view) {
            this.onExtraCallback = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.removeOnAttachStateChangeListener(this);
                ViewCompat.extraCommand(view);
            } else {
                this.onExtraCallback.removeOnAttachStateChangeListener(this);
                ViewCompat.extraCommand(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public final RVManifestIProxyManifest onExtraCallback() {
        int i = 2 % 2;
        RVManifestIProxyManifest rVManifestIProxyManifest = this.homeLogManager;
        if (rVManifestIProxyManifest != null) {
            int i2 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return rVManifestIProxyManifest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 79;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    private final HomeLauncherViewModel asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeLauncherViewModel homeLauncherViewModel = (HomeLauncherViewModel) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return homeLauncherViewModel;
    }

    public static final class IAuthTabCallback_Parcel extends Lambda implements Function0<Fragment> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback_Parcel(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentOnExtraCallback = onExtraCallback();
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
            return fragmentOnExtraCallback;
        }

        public final Fragment onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.$this_viewModels;
            }
            throw null;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.launcher_home_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        int i4 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    public static final class getInterfaceDescriptor extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public getInterfaceDescriptor(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnNavigationEvent;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvoke = this.$ownerProducer.invoke();
            if (i3 != 0) {
                return (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) objInvoke;
            }
            int i4 = 62 / 0;
            return (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) objInvoke;
        }
    }

    public static final class ICustomTabsCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallback(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i2 = onNavigationEvent + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
                int i4 = onWarmupCompleted + 125;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class extraCallbackWithResult extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallbackWithResult(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r1 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            if (r1 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            r2 = im.toss.features.launcher.HomeLauncherFragment.extraCallbackWithResult.onExtraCallback + 119;
            im.toss.features.launcher.HomeLauncherFragment.extraCallbackWithResult.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            Object obj = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            } else {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null) {
                int i5 = IAuthTabCallback + 1;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                    int i6 = 58 / 0;
                } else {
                    defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory();
                }
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            int i7 = onExtraCallback + 45;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return defaultViewModelProviderFactory2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class readTypedObject extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public readTypedObject(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
                int i3 = 3 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            }
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i4 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 35125), (Process.myTid() >> 22) + 23, Color.red(0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12843), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2167 - Color.green(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 71;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    int i10 = i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr4[i9] = cArr2[0];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 12844), TextUtils.indexOf("", "", 0, 0) + 55, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 56, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            int i11 = $10 + 97;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static final /* synthetic */ class access100 extends FunctionReferenceImpl implements Function1<setSyncFromOutOfReqRate, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        access100(Object obj) {
            super(1, obj, HomeLauncherFragment.class, "handleAction", "handleAction(Lim/toss/features/launcher/model/HomeLauncherAction;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((setSyncFromOutOfReqRate) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onWarmupCompleted(setSyncFromOutOfReqRate setsyncfromoutofreqrate) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setsyncfromoutofreqrate, "");
            Object[] objArr = {(HomeLauncherFragment) ((CallableReference) this).receiver, setsyncfromoutofreqrate};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            HomeLauncherFragment.onExtraCallbackWithResult(objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1752334441, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1752334435, iOnWarmupCompleted2);
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final Unit asBinder(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackDefault + 65;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1527159585, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (HomeLauncherFragment.kt:139)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeLauncherFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new access100(homeLauncherFragment);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i5 = IAuthTabCallbackStub + 117;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
            moveToNext.onExtraCallbackWithResult((access5300) objOnMinimized, (QuirksExternalSyntheticBackport0) null, (HomeLauncherViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 31;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 97;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackDefault + 59;
            IAuthTabCallbackStub = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 1;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2025572985, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous> (HomeLauncherFragment.kt:138)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2025572985, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous> (HomeLauncherFragment.kt:138)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1527159585, true, new HomeLauncherFragment$.ExternalSyntheticLambda4(homeLauncherFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class IAuthTabCallbackStubProxy extends FunctionReferenceImpl implements Function1<setSyncFromOutOfReqRate, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        IAuthTabCallbackStubProxy(Object obj) {
            super(1, obj, HomeLauncherFragment.class, "handleAction", "handleAction(Lim/toss/features/launcher/model/HomeLauncherAction;)V", 0);
        }

        public final void IAuthTabCallback(setSyncFromOutOfReqRate setsyncfromoutofreqrate) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setsyncfromoutofreqrate, "");
            Object[] objArr = {(HomeLauncherFragment) ((CallableReference) this).receiver, setsyncfromoutofreqrate};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            HomeLauncherFragment.onExtraCallbackWithResult(objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1752334441, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1752334435, iOnWarmupCompleted2);
            int i4 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((setSyncFromOutOfReqRate) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackStub(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackDefault + 77;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 5;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015068863, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (HomeLauncherFragment.kt:148)");
                    int i6 = 24 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015068863, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (HomeLauncherFragment.kt:148)");
                }
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(homeLauncherFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallbackStubProxy(homeLauncherFragment);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            moveToNext.onExtraCallback((access5300) objOnMinimized, (QuirksExternalSyntheticBackport0) null, (HomeLauncherViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(HomeLauncherFragment homeLauncherFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 25;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 89;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1321126503, i, -1, "im.toss.features.launcher.HomeLauncherFragment.onViewCreated.<anonymous>.<anonymous> (HomeLauncherFragment.kt:147)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-2015068863, true, new HomeLauncherFragment$.ExternalSyntheticLambda3(homeLauncherFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallbackDefault + 3;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, HomeLauncherFragment homeLauncherFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201712L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pillarSwipeRefreshLayout.announceForAccessibility(homeLauncherFragment.getString(R.string.home_v2_core_ui_refresh_list));
        homeLauncherFragment.asBinder().onExtraCallback();
        int i4 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class asBinder implements Runnable {
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ HomeLauncherContentComposeView onExtraCallback;
        final /* synthetic */ PillarSwipeRefreshLayout onExtraCallbackWithResult;
        final /* synthetic */ View onWarmupCompleted;

        asBinder(PillarSwipeRefreshLayout pillarSwipeRefreshLayout, View view, View view2, HomeLauncherContentComposeView homeLauncherContentComposeView) {
            this.onExtraCallbackWithResult = pillarSwipeRefreshLayout;
            this.IAuthTabCallback = view;
            this.onWarmupCompleted = view2;
            this.onExtraCallback = homeLauncherContentComposeView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = asBinder + 57;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (HomeLauncherFragment.this.isAdded()) {
                int i4 = asBinder + 73;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    HomeLauncherFragment.this.getView();
                    throw null;
                }
                if (HomeLauncherFragment.this.getView() != null) {
                    PillarSwipeRefreshLayout pillarSwipeRefreshLayout = this.onExtraCallbackWithResult;
                    View view = this.IAuthTabCallback;
                    View view2 = this.onWarmupCompleted;
                    HomeLauncherContentComposeView homeLauncherContentComposeView = this.onExtraCallback;
                    pillarSwipeRefreshLayout.setUseTdsPullToRefresh(true);
                    pillarSwipeRefreshLayout.setProgressViewOffset(false, 0, 0);
                    pillarSwipeRefreshLayout.setCoordinateViews(new View[]{view});
                    pillarSwipeRefreshLayout.setTopOffsetView(view, true);
                    View viewFindViewById = view2.findViewById(R.id.contentContainer);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                    Intrinsics.checkNotNull(homeLauncherContentComposeView);
                    pillarSwipeRefreshLayout.setTargetView(viewFindViewById, homeLauncherContentComposeView);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallbackWithResult(new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1289098885, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1289098882, iOnWarmupCompleted2);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onTransact(this, (access13800) null), 3, (Object) null);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackDefault(configuration)).onExtraCallbackWithResult());
        if (view.isAttachedToWindow()) {
            ViewCompat.extraCommand(view);
            int i2 = IAuthTabCallbackStub + 105;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            view.addOnAttachStateChangeListener(new asInterface(view));
        }
        ComposeView composeViewFindViewById = view.findViewById(R.id.topBarComposeView);
        ZslRingBuffer.onNavigationEvent onnavigationevent = ZslRingBuffer.onNavigationEvent.IAuthTabCallback;
        composeViewFindViewById.onNavigationEvent(onnavigationevent);
        composeViewFindViewById.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-2025572985, true, new HomeLauncherFragment$.ExternalSyntheticLambda0(this))));
        HomeLauncherContentComposeView homeLauncherContentComposeViewFindViewById = view.findViewById(R.id.composeView);
        homeLauncherContentComposeViewFindViewById.onNavigationEvent(onnavigationevent);
        homeLauncherContentComposeViewFindViewById.setContent(ForwardingCameraControl.onExtraCallbackWithResult(-1321126503, true, new HomeLauncherFragment$.ExternalSyntheticLambda1(this)));
        PillarSwipeRefreshLayout pillarSwipeRefreshLayoutFindViewById = view.findViewById(R.id.swipeRefreshLayout);
        pillarSwipeRefreshLayoutFindViewById.setOnRefreshListener(new HomeLauncherFragment$.ExternalSyntheticLambda2(pillarSwipeRefreshLayoutFindViewById, this));
        Intrinsics.checkNotNull(composeViewFindViewById);
        if (composeViewFindViewById.isLaidOut()) {
            int i4 = IAuthTabCallbackStub + 3;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (composeViewFindViewById.isLayoutRequested()) {
                composeViewFindViewById.addOnLayoutChangeListener(new IAuthTabCallbackStub(homeLauncherContentComposeViewFindViewById, this, pillarSwipeRefreshLayoutFindViewById, view));
            } else {
                Intrinsics.checkNotNull(homeLauncherContentComposeViewFindViewById);
                homeLauncherContentComposeViewFindViewById.setPadding(homeLauncherContentComposeViewFindViewById.getPaddingLeft(), composeViewFindViewById.getHeight(), homeLauncherContentComposeViewFindViewById.getPaddingRight(), homeLauncherContentComposeViewFindViewById.getPaddingBottom());
                composeViewFindViewById.post(new asBinder(pillarSwipeRefreshLayoutFindViewById, composeViewFindViewById, view, homeLauncherContentComposeViewFindViewById));
            }
        }
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), (CoroutineContext) null, (setRandomHost) null, new access000(this, pillarSwipeRefreshLayoutFindViewById, (access13800) null), 3, (Object) null);
    }

    public void onDestroyView() {
        PillarSwipeRefreshLayout pillarSwipeRefreshLayoutFindViewById;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback().IAuthTabCallback();
        View view = getView();
        if (view != null && (pillarSwipeRefreshLayoutFindViewById = view.findViewById(R.id.swipeRefreshLayout)) != null) {
            int i4 = IAuthTabCallbackStub + 59;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            pillarSwipeRefreshLayoutFindViewById.setOnRefreshListener((SwipeRefreshLayout.IAuthTabCallback) null);
            int i6 = IAuthTabCallbackStub + 107;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 2;
            }
        }
        super.onDestroyView();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e5 A[PHI: r1 r3 r5 r7
      0x01e5: PHI (r1v6 o.setSyncFromOutOfReqRate$IAuthTabCallback) = (r1v5 o.setSyncFromOutOfReqRate$IAuthTabCallback), (r1v17 o.setSyncFromOutOfReqRate$IAuthTabCallback) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r3v18 o.RVManifestIProxyManifest) = (r3v17 o.RVManifestIProxyManifest), (r3v22 o.RVManifestIProxyManifest) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r5v5 o.RVManifestBridgeExtensionManifest) = (r5v4 o.RVManifestBridgeExtensionManifest), (r5v7 o.RVManifestBridgeExtensionManifest) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v4 o.fillData) = (r7v3 o.fillData), (r7v9 o.fillData) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed A[PHI: r1 r3 r5
      0x01ed: PHI (r1v16 o.setSyncFromOutOfReqRate$IAuthTabCallback) = (r1v5 o.setSyncFromOutOfReqRate$IAuthTabCallback), (r1v17 o.setSyncFromOutOfReqRate$IAuthTabCallback) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r3v21 o.RVManifestIProxyManifest) = (r3v17 o.RVManifestIProxyManifest), (r3v22 o.RVManifestIProxyManifest) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r5v6 o.RVManifestBridgeExtensionManifest) = (r5v4 o.RVManifestBridgeExtensionManifest), (r5v7 o.RVManifestBridgeExtensionManifest) binds: [B:40:0x01e3, B:37:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(setSyncFromOutOfReqRate setsyncfromoutofreqrate) throws Throwable {
        RVManifestIProxyManifest rVManifestIProxyManifestOnExtraCallback;
        setSyncFromOutOfReqRate.IAuthTabCallback iAuthTabCallback;
        RVManifestBridgeExtensionManifest rVManifestBridgeExtensionManifestOnExtraCallback;
        fillData filldataOnWarmupCompleted;
        RVManifestBridgeExtensionManifest rVManifestBridgeExtensionManifest;
        getOuterPage getouterpageIAuthTabCallback;
        RVManifestIProxyManifest rVManifestIProxyManifest;
        int i = 2 % 2;
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.onTransact) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 5201528L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "launcher_visit__home::click__tossbank_logo", false, "bank", (List) null, (Map) null, new HomeLauncherFragment$.ExternalSyntheticLambda6(), 26, (Object) null);
            ((Boolean) onExtraCallbackWithResult(new Object[]{this, ((setSyncFromOutOfReqRate.onTransact) setsyncfromoutofreqrate).IAuthTabCallback()}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).booleanValue();
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.onExtraCallback) {
            int i2 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201530L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48, new char[]{14, 65533, 65534, 65531, '\n', 11, 5, 16, 65533, 3, 5, 18, 65533, '\n', 65482, 14, 1, 4, 65535, '\n', 17, 65533, '\b', 65497, 14, 1, 14, 14, 1, 2, 1, 14, 65499, 0, 1, 1, 2, 65483, 65483, 65494, 15, 15, 11, 16, 14, 1, '\f', 17, 15}, true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 125, objArr);
            ((Boolean) onExtraCallbackWithResult(new Object[]{this, ((String) objArr[0]).intern()}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).booleanValue();
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.IAuthTabCallbackStub) {
            int i4 = IAuthTabCallbackDefault + 87;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201532L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            Object[] objArr2 = new Object[1];
            a(155 - AndroidCharacter.getMirror('0'), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31, new char[]{1, 65533, 14, 65535, 4, 65531, 65534, 65533, 14, 65474, 15, 16, 65533, 16, 17, 15, 65534, 65533, 14, 65531, '\f', 65533, 0, 0, 5, '\n', 3, 65497, 16, 14, 17, 1, 15, 17, '\f', 1, 14, 16, 11, 15, 15, 65494, 65483, 65483, 15, 1, 65533, 14, 65535, 4, 65499, 14, 1, 2, 1, 14, 14, 1, 14, 65497, '\b', 65533, 17, '\n', 65535, 4, 1, 14, 65482, 15, 1, 65533, 14, 65535, 4, 65531, 65534, 65533, 14, 65474, 15, 1, 14, 18, 5, 65535, 1, 65531, 14, 1, 2, 1, 14, 14, 1, 14, 65497, '\b', 65533, 17, '\n', 65535, 4, 1, 14, 65482, 15}, false, 126 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            ((Boolean) onExtraCallbackWithResult(new Object[]{this, ((String) objArr2[0]).intern()}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).booleanValue();
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.IAuthTabCallbackDefault) {
            int i6 = IAuthTabCallbackStub + 35;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            ((Boolean) onExtraCallbackWithResult(new Object[]{this, ((setSyncFromOutOfReqRate.IAuthTabCallbackDefault) setsyncfromoutofreqrate).onNavigationEvent()}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).booleanValue();
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.onExtraCallbackWithResult) {
            setSyncFromOutOfReqRate.onExtraCallbackWithResult onextracallbackwithresult = (setSyncFromOutOfReqRate.onExtraCallbackWithResult) setsyncfromoutofreqrate;
            if (Intrinsics.areEqual(onextracallbackwithresult.onNavigationEvent(), "launcher-devtool://quick-action")) {
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
                return;
            } else {
                onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201548L, false, (String) null, (Map) null, new HomeLauncherFragment$.ExternalSyntheticLambda7(setsyncfromoutofreqrate, this), 14, (Object) null);
                onExtraCallbackWithResult(onextracallbackwithresult);
                return;
            }
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.asInterface) {
            getInterfaceDescriptor();
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.asBinder) {
            onExtraCallbackWithResult("todo", new HomeLauncherFragment$.ExternalSyntheticLambda8(this));
            return;
        }
        if (setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.onNavigationEvent) {
            onExtraCallbackWithResult("item:" + IAuthTabCallback(((setSyncFromOutOfReqRate.onNavigationEvent) setsyncfromoutofreqrate).onNavigationEvent()), new HomeLauncherFragment$.ExternalSyntheticLambda9(this, setsyncfromoutofreqrate));
            return;
        }
        if (!(setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.IAuthTabCallback)) {
            if (!(setsyncfromoutofreqrate instanceof setSyncFromOutOfReqRate.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            RVManifestIProxyManifest rVManifestIProxyManifestOnExtraCallback2 = onExtraCallback();
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            RVManifestIProxyManifest.onWarmupCompleted(rVManifestIProxyManifestOnExtraCallback2, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner2), ((setSyncFromOutOfReqRate.onWarmupCompleted) setsyncfromoutofreqrate).onExtraCallbackWithResult(), new HomeLauncherFragment$.ExternalSyntheticLambda11(), new IAuthTabCallback(asBinder()), false, (Map) null, 48, (Object) null);
            return;
        }
        int i8 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            rVManifestIProxyManifestOnExtraCallback = onExtraCallback();
            iAuthTabCallback = (setSyncFromOutOfReqRate.IAuthTabCallback) setsyncfromoutofreqrate;
            rVManifestBridgeExtensionManifestOnExtraCallback = iAuthTabCallback.onExtraCallback();
            filldataOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            int i9 = 77 / 0;
            if (filldataOnWarmupCompleted != null) {
                rVManifestBridgeExtensionManifest = rVManifestBridgeExtensionManifestOnExtraCallback;
                getouterpageIAuthTabCallback = filldataOnWarmupCompleted.IAuthTabCallback();
                rVManifestIProxyManifest = rVManifestIProxyManifestOnExtraCallback;
            } else {
                rVManifestIProxyManifest = rVManifestIProxyManifestOnExtraCallback;
                rVManifestBridgeExtensionManifest = rVManifestBridgeExtensionManifestOnExtraCallback;
                getouterpageIAuthTabCallback = null;
            }
        } else {
            rVManifestIProxyManifestOnExtraCallback = onExtraCallback();
            iAuthTabCallback = (setSyncFromOutOfReqRate.IAuthTabCallback) setsyncfromoutofreqrate;
            rVManifestBridgeExtensionManifestOnExtraCallback = iAuthTabCallback.onExtraCallback();
            filldataOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            if (filldataOnWarmupCompleted != null) {
            }
        }
        RVManifestIProxyManifest.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1160441491, 1160441491, new Object[]{rVManifestIProxyManifest, rVManifestBridgeExtensionManifest, getouterpageIAuthTabCallback, new BaseEmbedView.onNavigationEvent(iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onWarmupCompleted(), (DefaultConstructorMarker) null), new onWarmupCompleted(asBinder()), new HomeLauncherFragment$.ExternalSyntheticLambda10(), null, 32, null}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i10 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i2 = IAuthTabCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = HomeLauncherFragment.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 39;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onNavigationEvent + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                RunDevToolActionUseCase runDevToolActionUseCaseIAuthTabCallbackStub = HomeLauncherFragment.this.IAuthTabCallbackStub();
                this.label = 1;
                if (RunDevToolActionUseCase.IAuthTabCallback(runDevToolActionUseCaseIAuthTabCallbackStub, "SHOW_QUICK_ACTION", (Map) null, this, 2, (Object) null) == objOnWarmupCompleted) {
                    int i6 = onNavigationEvent + 67;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallback + 3;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    private static final Unit onWarmupCompleted(setSyncFromOutOfReqRate setsyncfromoutofreqrate, HomeLauncherFragment homeLauncherFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        for (Map.Entry entry : ((setSyncFromOutOfReqRate.onExtraCallbackWithResult) setsyncfromoutofreqrate).onExtraCallbackWithResult().entrySet()) {
            setDetectableSize.onExtraCallback((String) entry.getKey(), (String) entry.getValue());
        }
        String strAsInterface = homeLauncherFragment.asInterface();
        Object obj = null;
        if (strAsInterface.length() == 0) {
            strAsInterface = null;
        }
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 8, Color.rgb(0, 0, 0) + 16777219, new char[]{65531, 65530, 7, 7, 65530, 7, 7, 65530}, true, View.MeasureSpec.getSize(0) + 132, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strAsInterface);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(HomeLauncherFragment homeLauncherFragment) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            homeLauncherFragment.onWarmupCompleted(5201550L);
            unit = Unit.INSTANCE;
            int i3 = 1 / 0;
        } else {
            homeLauncherFragment.onWarmupCompleted(5201550L);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(HomeLauncherFragment homeLauncherFragment, setSyncFromOutOfReqRate setsyncfromoutofreqrate) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            homeLauncherFragment.onNavigationEvent(((setSyncFromOutOfReqRate.onNavigationEvent) setsyncfromoutofreqrate).onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackDefault + 37;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        homeLauncherFragment.onNavigationEvent(((setSyncFromOutOfReqRate.onNavigationEvent) setsyncfromoutofreqrate).onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onWarmupCompleted(Object obj) {
            super(0, obj, HomeLauncherViewModel.class, "refresh", "refresh()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                ((HomeLauncherViewModel) ((CallableReference) this).receiver).onExtraCallback();
                obj.hashCode();
                throw null;
            }
            ((HomeLauncherViewModel) ((CallableReference) this).receiver).onExtraCallback();
            int i3 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("HomeLauncherFragment::assetClickLog", new IllegalStateException(str));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallback(Object obj) {
            super(0, obj, HomeLauncherViewModel.class, "refresh", "refresh()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 95 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((HomeLauncherViewModel) ((CallableReference) this).receiver).onExtraCallback();
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = SessionTrackerb.onExtraCallbackWithResult(homeLauncherFragment.IAuthTabCallbackDefault(), homeLauncherFragment.requireContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i4 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        int i5 = 24 / 0;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    private final String IAuthTabCallback(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = map.get("service_type");
        String str2 = map.get("display_order");
        if (str2 == null) {
            str2 = "";
            int i4 = IAuthTabCallbackStub + 1;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return ((Object) str) + ":" + str2;
    }

    private final void onWarmupCompleted(long j) {
        boolean z;
        String str;
        Map map;
        Function1 function1;
        int i;
        int i2 = 2 % 2;
        if (asBinder().onExtraCallbackWithResult(j)) {
            int i3 = IAuthTabCallbackDefault + 37;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            if (i4 == 0) {
                z = true;
                str = null;
                map = null;
                function1 = null;
                i = 46;
            } else {
                z = false;
                str = null;
                map = null;
                function1 = null;
                i = 30;
            }
            ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, j, z, str, map, function1, i, (Object) null);
        }
        int i5 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String asInterface() throws Throwable {
        String string;
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 9, (Process.myPid() >> 22) + 3, new char[]{65531, 65530, 7, 7, 65530, 7, 7, 65530}, true, View.combineMeasuredStates(0, 0) + 132, objArr);
            string = arguments.getString(((String) objArr[0]).intern());
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private final void onNavigationEvent(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (map.get("service_type") != null) {
            int i4 = IAuthTabCallbackStub + 5;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (asBinder().onExtraCallback(5201546L, IAuthTabCallback(map))) {
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5201546L, false, (String) null, (Map) null, new HomeLauncherFragment$.ExternalSyntheticLambda5(map, this), 14, (Object) null);
            }
        }
    }

    private static final Unit onNavigationEvent(Map map, HomeLauncherFragment homeLauncherFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            map.entrySet().iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        for (Map.Entry entry : map.entrySet()) {
            setDetectableSize.onExtraCallback((String) entry.getKey(), (String) entry.getValue());
        }
        String strAsInterface = homeLauncherFragment.asInterface();
        if (strAsInterface.length() == 0) {
            int i3 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str = strAsInterface;
        }
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 8, 3 - KeyEvent.normalizeMetaState(0), new char[]{65531, 65530, 7, 7, 65530, 7, 7, 65530}, true, (Process.myTid() >> 22) + 132, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private final void onExtraCallbackWithResult(String str, Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (((Boolean) onExtraCallback().onExtraCallback().IAuthTabCallback()).booleanValue()) {
            int i4 = IAuthTabCallbackStub + 99;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
            return;
        }
        this.onExtraCallback.put(str, function0);
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        this.IAuthTabCallback = false;
        int i4 = IAuthTabCallbackStub + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements getBacktraceNote<Boolean, Boolean, access13800<? super Boolean>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(3, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            if (i2 % 2 == 0) {
                return onNavigationEvent(bool, bool2, (access13800) obj3);
            }
            Object objOnNavigationEvent = onNavigationEvent(bool, bool2, (access13800) obj3);
            int i3 = 34 / 0;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(Boolean bool, Boolean bool2, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(access13800Var);
            onextracallback.L$0 = bool;
            onextracallback.L$1 = bool2;
            Object objInvokeSuspend = onextracallback.invokeSuspend(Unit.INSTANCE);
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i = 2 % 2;
            Boolean bool = (Boolean) this.L$0;
            Boolean bool2 = (Boolean) this.L$1;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (bool.booleanValue()) {
                int i2 = onWarmupCompleted + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (bool2.booleanValue()) {
                    int i4 = onNavigationEvent + 71;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
            }
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
            int i6 = onWarmupCompleted + 113;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 62 / 0;
            }
            return boolOnNavigationEvent;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        /* synthetic */ boolean Z$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = HomeLauncherFragment.this.new onNavigationEvent(access13800Var);
            onnavigationevent.Z$0 = ((Boolean) obj).booleanValue();
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 != 0) {
                onExtraCallback(zBooleanValue, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(zBooleanValue, access13800Var);
            int i4 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(boolean z, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(Boolean.valueOf(z), access13800Var);
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 5 / 0;
            return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (z) {
                RVManifestIProxyManifest rVManifestIProxyManifestOnExtraCallback = HomeLauncherFragment.this.onExtraCallback();
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = HomeLauncherFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                rVManifestIProxyManifestOnExtraCallback.onExtraCallbackWithResult(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (String) null);
                if (HomeLauncherFragment.IAuthTabCallback(HomeLauncherFragment.this)) {
                    HomeLauncherFragment.onNavigationEvent(HomeLauncherFragment.this, false);
                    HomeLauncherFragment.onExtraCallback(HomeLauncherFragment.this).IAuthTabCallback();
                    int i3 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 5 % 2;
                    }
                }
            } else {
                HomeLauncherFragment.this.onExtraCallback().IAuthTabCallback();
                Object[] objArr = {HomeLauncherFragment.this};
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                ((LinkedHashMap) HomeLauncherFragment.onExtraCallbackWithResult(objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -729346960, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 729346965, iOnWarmupCompleted2)).clear();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        IAnimation iAnimationIAuthTabCallback;
        HomeLauncherFragment homeLauncherFragment = (HomeLauncherFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivity = homeLauncherFragment.getBaseActivity();
        if (baseActivity != null) {
            int i4 = IAuthTabCallbackDefault + 105;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0 ? baseActivity.extraCallbackWithResult() : baseActivity.extraCallbackWithResult()) {
                iAnimationIAuthTabCallback = RxConvertKt.IAuthTabCallback(SessionState.Companion.onExtraCallback().IAuthTabCallback());
            } else {
                iAnimationIAuthTabCallback = ycxycx.IAuthTabCallback(Boolean.TRUE);
            }
        }
        IAnimation iAnimationIAuthTabCallback2 = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted(iAnimationIAuthTabCallback, RxConvertKt.IAuthTabCallback(homeLauncherFragment.getVisibleState()), new onExtraCallback(null))), homeLauncherFragment.new onNavigationEvent(null));
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = homeLauncherFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        ycxycx.onWarmupCompleted(iAnimationIAuthTabCallback2, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner));
        return null;
    }

    public void onStop() {
        int i = 2 % 2;
        if (!requireActivity().isChangingConfigurations()) {
            int i2 = IAuthTabCallbackDefault + 119;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = true;
        }
        super.onStop();
        int i4 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(setSyncFromOutOfReqRate.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(getWrite.IAuthTabCallback("from_home_launcher", "true"));
            String str = (String) onextracallbackwithresult.onExtraCallbackWithResult().get("service_type");
            if (str != null) {
                int i3 = IAuthTabCallbackDefault + 105;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                listCreateListBuilder.add(getWrite.IAuthTabCallback("launcher_service_type", str));
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            Uri uri = Uri.parse(onextracallbackwithresult.onNavigationEvent());
            Pair[] pairArr = (Pair[]) listBuild.toArray(new Pair[0]);
            Object[] objArr = {this, filterCreatePageParams.onNavigationEvent(uri, (Pair[]) Arrays.copyOf(pairArr, pairArr.length))};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (((Boolean) onExtraCallbackWithResult(objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, iOnWarmupCompleted2)).booleanValue()) {
                return;
            }
            this.IAuthTabCallback = false;
            getInterfaceDescriptor();
            return;
        }
        throw null;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(requireContext(), getString(R.string.launcher_route_fallback_message), 0).show();
        int i4 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }

    public getByteBuffer<Boolean> getMainTabBarVisibleState() {
        getByteBuffer<Boolean> getbytebufferOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
            int i3 = 82 / 0;
        } else {
            getbytebufferOnWarmupCompleted = getByteBuffer.onWarmupCompleted(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
        }
        int i4 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferOnWarmupCompleted;
    }

    public void onRetry() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder().onExtraCallback();
            int i3 = 71 / 0;
        } else {
            asBinder().onExtraCallback();
        }
        int i4 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Map map, HomeLauncherFragment homeLauncherFragment, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{map, homeLauncherFragment, setDetectableSize}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1521818735, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1521818739, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onNavigationEvent(HomeLauncherFragment homeLauncherFragment) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{homeLauncherFragment}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1119256135, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1119256128, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ LinkedHashMap onWarmupCompleted(HomeLauncherFragment homeLauncherFragment) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (LinkedHashMap) onExtraCallbackWithResult(new Object[]{homeLauncherFragment}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -729346960, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 729346965, iOnWarmupCompleted2);
    }

    public static final /* synthetic */ void onNavigationEvent(HomeLauncherFragment homeLauncherFragment, setSyncFromOutOfReqRate setsyncfromoutofreqrate) throws Throwable {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallbackWithResult(new Object[]{homeLauncherFragment, setsyncfromoutofreqrate}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1752334441, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1752334435, iOnWarmupCompleted2);
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{setDetectableSize}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1469692030, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1469692032, iOnWarmupCompleted2);
    }

    private static final boolean onTransact() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(new Object[0], DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -740497601, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 740497602, iOnWarmupCompleted2)).booleanValue();
    }

    private final void access000() throws Throwable {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        onExtraCallbackWithResult(new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1289098885, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1289098882, iOnWarmupCompleted2);
    }

    private final boolean IAuthTabCallback(String str) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{this, str}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 901015527, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -901015527, iOnWarmupCompleted2)).booleanValue();
    }
}
