package viva.republica.toss.guest;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.base.BaseActivity;
import im.toss.core.R;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState1;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addPolicy;
import o.asset;
import o.calcThumbnailOptions;
import o.clearWrite;
import o.findResAndMsg;
import o.getParamImp;
import o.getSWidth;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.notifyVerticalEdgeReached;
import o.onAdViewAdDisplayFailed;
import o.setRandomHost;
import o.tiling;
import o.wasLastName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.guest.DevSupportSuperLoginActivity$;
import viva.republica.toss.guest.DevSupportSuperLoginActivity$restartOnboarding$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DevSupportSuperLoginActivity extends Hilt_DevSupportSuperLoginActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static int[] asBinder = null;
    private static int asInterface = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallbackStub = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(DevSupportSuperLoginViewModel.class), new IAuthTabCallbackDefault(this), new onNavigationEvent(this), new onTransact(null, this));

    @Inject
    public notifyVerticalEdgeReached guestLoginManager;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public calcThumbnailOptions userOnboardingLogManager;

    static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }

    static {
        ICustomTabsServiceStub();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        IAuthTabCallbackDefault = 8;
        int i = access100 + 15;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(DevSupportSuperLoginActivity devSupportSuperLoginActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(devSupportSuperLoginActivity, dialogInterface, i);
        int i5 = onTransact + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        DevSupportSuperLoginActivity devSupportSuperLoginActivity = (DevSupportSuperLoginActivity) objArr[0];
        asset assetVar = (asset) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(devSupportSuperLoginActivity, assetVar);
        }
        IAuthTabCallback(devSupportSuperLoginActivity, assetVar);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i2 | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i2 + i6 + i + ((-1585779005) * i3) + (640148872 * i4);
        int i17 = i16 * i16;
        int i18 = (i2 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i) + (1159200768 * i3) + ((-734003200) * i4) + (2089549824 * i17);
        int i19 = (i2 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i * (-1291221671)) + (i3 * (-1079815989)) + (i4 * 669414472) + (i17 * 145489920);
        return i18 + ((i19 * i19) * (-1699479552)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 91;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return -1L;
        }
        obj.hashCode();
        throw null;
    }

    public boolean postMessage() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(DevSupportSuperLoginActivity devSupportSuperLoginActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        devSupportSuperLoginActivity.validateRelationship();
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = onTransact + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ DevSupportSuperLoginViewModel onWarmupCompleted(DevSupportSuperLoginActivity devSupportSuperLoginActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DevSupportSuperLoginViewModel devSupportSuperLoginViewModelICustomTabsServiceDefault = devSupportSuperLoginActivity.ICustomTabsServiceDefault();
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return devSupportSuperLoginViewModelICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r1 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact + 59;
        viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r4 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r3 = r3 + 125;
        viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if ((r3 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            viva.republica.toss.guest.DevSupportSuperLoginActivity r4 = (viva.republica.toss.guest.DevSupportSuperLoginActivity) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface
            int r2 = r2 + 89
            int r3 = r2 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact = r3
            int r2 = r2 % r1
            o.notifyVerticalEdgeReached r4 = r4.guestLoginManager
            if (r2 == 0) goto L1b
            r2 = 14
            int r2 = r2 / r0
            if (r4 == 0) goto L2a
            goto L1d
        L1b:
            if (r4 == 0) goto L2a
        L1d:
            int r3 = r3 + 125
            int r2 = r3 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r2
            int r3 = r3 % r1
            if (r3 != 0) goto L29
            r1 = 44
            int r1 = r1 / r0
        L29:
            return r4
        L2a:
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact
            int r4 = r4 + 59
            int r0 = r4 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r0
            int r4 = r4 % r1
            r0 = 0
            if (r4 == 0) goto L3c
            return r0
        L3c:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginActivity.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public final calcThumbnailOptions setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        calcThumbnailOptions calcthumbnailoptions = this.userOnboardingLogManager;
        if (calcthumbnailoptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 79;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return calcthumbnailoptions;
    }

    private final DevSupportSuperLoginViewModel ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        DevSupportSuperLoginViewModel devSupportSuperLoginViewModel = (DevSupportSuperLoginViewModel) this.IAuthTabCallbackStub.getValue();
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return devSupportSuperLoginViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (o.onReady.onExtraCallback(r9) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        setEngagementSignalsCallback().onWarmupCompleted();
        o.requestPostMessageChannelWithExtras.onExtraCallback(r8, (o.CameraConfigBuilder) null, o.setAdVideoPlaybackListener.onWarmupCompleted(o.BufferedEncoder.onWarmupCompleted.onWarmupCompleted()), 1, (java.lang.Object) null);
        r6 = new java.lang.Object[]{ICustomTabsServiceDefault()};
        r5 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        ((o.Rmipmap) viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(516619973, -516619973, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), r5, r6, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult())).observe(r8, new viva.republica.toss.guest.DevSupportSuperLoginActivity.onExtraCallback(new viva.republica.toss.guest.DevSupportSuperLoginActivity$.ExternalSyntheticLambda1(r8)));
        r9 = viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact + 103;
        viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (o.onReady.onExtraCallback(r9) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface
            int r1 = r1 + 77
            int r2 = r1 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact = r2
            int r1 = r1 % r0
            super.onCreate(r9)
            android.content.Intent r9 = r8.getIntent()
            android.net.Uri r9 = r9.getData()
            if (r9 == 0) goto L85
            int r1 = viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact
            int r1 = r1 + 95
            int r2 = r1 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            boolean r9 = o.onReady.onExtraCallback(r9)
            r1 = 7
            int r1 = r1 / 0
            if (r9 == 0) goto L85
            goto L34
        L2e:
            boolean r9 = o.onReady.onExtraCallback(r9)
            if (r9 == 0) goto L85
        L34:
            o.calcThumbnailOptions r9 = r8.setEngagementSignalsCallback()
            r9.onWarmupCompleted()
            o.BufferedEncoder r9 = o.BufferedEncoder.onWarmupCompleted
            kotlin.jvm.functions.Function2 r9 = r9.onWarmupCompleted()
            kotlin.jvm.functions.Function2 r9 = o.setAdVideoPlaybackListener.onWarmupCompleted(r9)
            r1 = 1
            r2 = 0
            o.requestPostMessageChannelWithExtras.onExtraCallback(r8, r2, r9, r1, r2)
            viva.republica.toss.guest.DevSupportSuperLoginViewModel r9 = r8.ICustomTabsServiceDefault()
            java.lang.Object[] r6 = new java.lang.Object[]{r9}
            int r5 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
            int r4 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
            int r3 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
            int r7 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
            r1 = 516619973(0x1ecafec5, float:2.1492952E-20)
            r2 = -516619973(0xffffffffe135013b, float:-2.0868433E20)
            java.lang.Object r9 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(r1, r2, r3, r4, r5, r6, r7)
            o.Rmipmap r9 = (o.Rmipmap) r9
            viva.republica.toss.guest.DevSupportSuperLoginActivity$onExtraCallback r1 = new viva.republica.toss.guest.DevSupportSuperLoginActivity$onExtraCallback
            viva.republica.toss.guest.DevSupportSuperLoginActivity$$ExternalSyntheticLambda1 r2 = new viva.republica.toss.guest.DevSupportSuperLoginActivity$$ExternalSyntheticLambda1
            r2.<init>(r8)
            r1.<init>(r2)
            r9.observe(r8, r1)
            int r9 = viva.republica.toss.guest.DevSupportSuperLoginActivity.onTransact
            int r9 = r9 + 103
            int r1 = r9 % 128
            viva.republica.toss.guest.DevSupportSuperLoginActivity.asInterface = r1
            int r9 = r9 % r0
            return
        L85:
            r8.updateVisuals()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginActivity.onCreate(android.os.Bundle):void");
    }

    public static final class onNavigationEvent implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallback.getDefaultViewModelProviderFactory();
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(DevSupportSuperLoginActivity devSupportSuperLoginActivity, asset assetVar) throws Throwable {
        SessionTrackerb sessionTrackerbIAuthTabCallback;
        String strIntern;
        boolean z;
        Function1 function1;
        Bundle bundle;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        if (!(!(assetVar instanceof asset.onNavigationEvent))) {
            int i3 = asInterface + 47;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                devSupportSuperLoginActivity.onExtraCallback((asset.onNavigationEvent) assetVar);
                int i4 = 55 / 0;
            } else {
                devSupportSuperLoginActivity.onExtraCallback((asset.onNavigationEvent) assetVar);
            }
        } else if (Intrinsics.areEqual(assetVar, asset.onExtraCallbackWithResult.onNavigationEvent)) {
            int i5 = asInterface + 49;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                sessionTrackerbIAuthTabCallback = devSupportSuperLoginActivity.IAuthTabCallback();
                Object[] objArr = new Object[1];
                a(new int[]{-570971036, 584251116, -1965198247, 175225884, 1591273530, 982796498, 1109203085, 549447230}, 2 / TextUtils.getOffsetBefore("", 0), objArr);
                strIntern = ((String) objArr[0]).intern();
                z = false;
                function1 = null;
                bundle = null;
                z2 = false;
                i = 73;
            } else {
                sessionTrackerbIAuthTabCallback = devSupportSuperLoginActivity.IAuthTabCallback();
                Object[] objArr2 = new Object[1];
                a(new int[]{-570971036, 584251116, -1965198247, 175225884, 1591273530, 982796498, 1109203085, 549447230}, 16 - TextUtils.getOffsetBefore("", 0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                z = false;
                function1 = null;
                bundle = null;
                z2 = false;
                i = 60;
            }
            SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, devSupportSuperLoginActivity, strIntern, z, function1, bundle, z2, i, (Object) null);
            devSupportSuperLoginActivity.finish();
        } else if (Intrinsics.areEqual(assetVar, asset.IAuthTabCallback.onExtraCallback)) {
            devSupportSuperLoginActivity.updateVisuals();
        } else {
            if (!Intrinsics.areEqual(assetVar, asset.onWarmupCompleted.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, new Object[]{(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -963962278, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 963962280, new Object[]{TdsDialogV1.Companion.onExtraCallback(devSupportSuperLoginActivity), Integer.valueOf(R.drawable.img_popup_warning)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), Integer.valueOf(viva.republica.toss.R.string.error_retry_message)}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), im.toss.uikit.R.string.uikit_ok, new DevSupportSuperLoginActivity$.ExternalSyntheticLambda0(devSupportSuperLoginActivity), (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onNavigationEvent(false)).readTypedObject();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onWarmupCompleted(DevSupportSuperLoginActivity devSupportSuperLoginActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        devSupportSuperLoginActivity.finishAffinity();
        int i5 = asInterface + 19;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ asset.onNavigationEvent $event;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        final /* synthetic */ DevSupportSuperLoginActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(asset.onNavigationEvent onnavigationevent, DevSupportSuperLoginActivity devSupportSuperLoginActivity, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$event = onnavigationevent;
            this.this$0 = devSupportSuperLoginActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$event, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    asset.onNavigationEvent onnavigationevent = this.$event;
                    BaseActivity baseActivity = this.this$0;
                    Result.Companion companion = Result.Companion;
                    wasLastName waslastnameIAuthTabCallback = tiling.onNavigationEvent.IAuthTabCallback(onnavigationevent.onNavigationEvent(), (Context) baseActivity, onnavigationevent.onExtraCallback(), onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.onWarmupCompleted());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (RxAwaitKt.onWarmupCompleted(waslastnameIAuthTabCallback, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            DevSupportSuperLoginActivity devSupportSuperLoginActivity = this.this$0;
            if (Result.onNavigationEvent(obj2)) {
                DevSupportSuperLoginActivity.onExtraCallback(devSupportSuperLoginActivity);
                Object[] objArr = {DevSupportSuperLoginActivity.onWarmupCompleted(devSupportSuperLoginActivity)};
                int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                DevSupportSuperLoginViewModel.IAuthTabCallback(636410288, -636410287, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult());
            }
            DevSupportSuperLoginActivity devSupportSuperLoginActivity2 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                DevSupportSuperLoginActivity.onWarmupCompleted(devSupportSuperLoginActivity2).onNavigationEvent(th);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(asset.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(onnavigationevent, this, null), 3, (Object) null);
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 30, KeyEvent.getDeadChar(0, 0) + 24887, -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(256741507);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), ImageFormat.getBitsPerPixel(0) + 31, 24887 - KeyEvent.keyCodeFromString(""), 1041067539, false, "onExtraCallbackWithResult", new Class[0]);
            }
            ((Method) objOnExtraCallback2).invoke(obj, null);
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new int[]{-177213777, 718643870, -544196252, -1377506441, -964586816, -566038520, -2040180414, -21127602, -1633490969, -1412322181, 2013319784, 873337636, 356542573, -1567964663, -1336612039, 1750652476}, 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onTransact(((String) objArr[0]).intern());
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2 = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a(new int[]{-1559139055, -427200193, 1327887944, 999492452, -1345390831, 1790410557, -946804107, 300311641, 1416855377, 249388435, -1140044883, -1908698801}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr2);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub2.onTransact(((String) objArr2[0]).intern());
            int i4 = onTransact + 51;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return DevSupportSuperLoginActivity.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context, viva.republica.toss.guest.DevSupportSuperLoginActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {DevSupportSuperLoginActivity.this};
                notifyVerticalEdgeReached notifyverticaledgereached = (notifyVerticalEdgeReached) DevSupportSuperLoginActivity.onNavigationEvent(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1407302159, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1407302159, objArr);
                this.label = 1;
                Object objOnNavigationEvent2 = notifyverticaledgereached.onNavigationEvent(this);
                if (objOnNavigationEvent2 == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                objOnNavigationEvent = objOnNavigationEvent2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            DevSupportSuperLoginActivity devSupportSuperLoginActivity = DevSupportSuperLoginActivity.this;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                long jLongValue = ((Number) objOnNavigationEvent).longValue();
                getSWidth.onExtraCallback(1010941694, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1010941691, new Object[]{getSWidth.onExtraCallback, devSupportSuperLoginActivity, Long.valueOf(jLongValue), null, false, null, null, false, null, null, null, false, devSupportSuperLoginActivity.setEngagementSignalsCallback().onExtraCallbackWithResult(), 2044, null}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            }
            ?? r3 = DevSupportSuperLoginActivity.this;
            Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                getParamImp.onWarmupCompleted(th, (Context) r3, false, (initMiniApp) null, (Function0) null, new DevSupportSuperLoginActivity$restartOnboarding$1$.ExternalSyntheticLambda0((DevSupportSuperLoginActivity) r3), 14, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(DevSupportSuperLoginActivity devSupportSuperLoginActivity, DialogInterface dialogInterface) {
            devSupportSuperLoginActivity.finish();
            return Unit.INSTANCE;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = asBinder;
        long j = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 97;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i7 = $10 + 35;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72, 8848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i2++;
                    int i9 = $10 + 99;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = asBinder;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 13;
                $11 = i12 % 128;
                int i13 = i12 % i3;
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i5, i5), TextUtils.lastIndexOf("", '0') + 73, 8848 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i3 = 2;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i5;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i14] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 57;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 22252), TextUtils.getCapsMode("", 0, 0) + 39, 10301 - (ViewConfiguration.getPressedStateDuration() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15 += 112;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 10301 - KeyEvent.keyCodeFromString(""), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i15++;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 78, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i21 = $11 + 99;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (!setEngagementSignalsCallback().IAuthTabCallback()) {
            setEngagementSignalsCallback().onWarmupCompleted();
            int i4 = asInterface + 43;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) DevSupportSuperLoginActivity.class).setData(uri).putExtra("EXTRA_URI", uri.toString());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DevSupportSuperLoginActivity devSupportSuperLoginActivity, asset assetVar) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onNavigationEvent(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -1430706749, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, 1430706750, new Object[]{devSupportSuperLoginActivity, assetVar});
    }

    public final notifyVerticalEdgeReached onNavigationEvent() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (notifyVerticalEdgeReached) onNavigationEvent(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1407302159, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, -1407302159, new Object[]{this});
    }

    @Override // viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.Hilt_DevSupportSuperLoginActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
    }

    static void ICustomTabsServiceStub() {
        asBinder = new int[]{465585083, -364703363, -56502736, -1795565767, 1704228364, 221372993, 146786886, -1865620390, -1918438238, 1184038189, -2139087627, 369585926, 106519688, -1661103486, 1091041068, -751284162, -1581001869, 1877013555};
    }
}
