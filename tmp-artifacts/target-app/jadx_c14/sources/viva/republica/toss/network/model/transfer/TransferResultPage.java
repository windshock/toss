package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.transfer.message_card.library.model.TransferMessageCardColor;
import im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient;
import im.toss.features.transfer.share.library.data.TransferShareResultResponse;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.inventory_sdk.model.LogDto;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access15300;
import o.appInfo;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.htf31;
import o.kt;
import o.liq;
import o.nc;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.BridgeModel;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer;

@appInfo(IAuthTabCallback = "behavior")
@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class TransferResultPage {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            KSerializer kSerializerOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnExtraCallbackWithResult = TransferResultPage.onExtraCallbackWithResult();
                int i3 = 6 / 0;
            } else {
                kSerializerOnExtraCallbackWithResult = TransferResultPage.onExtraCallbackWithResult();
            }
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    public /* synthetic */ TransferResultPage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            KSerializer kSerializer = (KSerializer) TransferResultPage.onWarmupCompleted().getValue();
            int i3 = IAuthTabCallback + 121;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializer;
        }

        public final KSerializer<TransferResultPage> serializer() {
            KSerializer<TransferResultPage> kSerializerOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerOnWarmupCompleted = onWarmupCompleted();
                int i3 = 20 / 0;
            } else {
                kSerializerOnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnWarmupCompleted;
        }
    }

    static {
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private TransferResultPage() {
    }

    public /* synthetic */ TransferResultPage(int i, okycx okycxVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        kt ktVar = new kt("viva.republica.toss.network.model.transfer.TransferResultPage", Reflection.getOrCreateKotlinClass(TransferResultPage.class), new KClass[]{Reflection.getOrCreateKotlinClass(Display.class), Reflection.getOrCreateKotlinClass(MyDataSuggestion.class), Reflection.getOrCreateKotlinClass(Redirect.class), Reflection.getOrCreateKotlinClass(ShareTransfer.class)}, new KSerializer[]{TransferResultPage$Display$$serializer.INSTANCE, TransferResultPage$MyDataSuggestion$$serializer.INSTANCE, TransferResultPage$Redirect$$serializer.INSTANCE, TransferResultPage$ShareTransfer$$serializer.INSTANCE}, new Annotation[]{new TransferResultPage$Redirect$$serializer.onNavigationEvent("behavior")});
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return ktVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
        int i5 = i3 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        throw null;
    }

    @nc(IAuthTabCallback = "REDIRECT")
    @liq
    public static final class Redirect extends TransferResultPage {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        private final BottomSheetLayout bottomSheetLayout;
        private final boolean clearStack;
        private final String logStatus;
        private final String redirectScheme;
        private final ToastLayout toastLayout;

        static {
            int i = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 9 / 0;
                }
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            if (!Intrinsics.areEqual(this.redirectScheme, redirect.redirectScheme)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.toastLayout, redirect.toastLayout)) {
                int i4 = onWarmupCompleted + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.bottomSheetLayout, redirect.bottomSheetLayout)) {
                int i6 = onExtraCallback + 9;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
            if (this.clearStack == redirect.clearStack) {
                return Intrinsics.areEqual(this.logStatus, redirect.logStatus);
            }
            int i7 = onWarmupCompleted + 63;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int iHashCode3 = this.redirectScheme.hashCode();
            ToastLayout toastLayout = this.toastLayout;
            if (toastLayout == null) {
                int i2 = onExtraCallback;
                int i3 = i2 + 79;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 23;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 3;
                }
                iHashCode = 0;
            } else {
                iHashCode = toastLayout.hashCode();
            }
            BottomSheetLayout bottomSheetLayout = this.bottomSheetLayout;
            if (bottomSheetLayout == null) {
                int i7 = onExtraCallback + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = bottomSheetLayout.hashCode();
                int i9 = onWarmupCompleted + 23;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            int iHashCode4 = Boolean.hashCode(this.clearStack);
            String str = this.logStatus;
            return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Redirect(redirectScheme=" + this.redirectScheme + ", toastLayout=" + this.toastLayout + ", bottomSheetLayout=" + this.bottomSheetLayout + ", clearStack=" + this.clearStack + ", logStatus=" + this.logStatus + ")";
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Redirect> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$Redirect$$serializer transferResultPage$Redirect$$serializer = TransferResultPage$Redirect$$serializer.INSTANCE;
                if (i3 != 0) {
                    return transferResultPage$Redirect$$serializer;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Redirect(int r3, java.lang.String r4, viva.republica.toss.network.model.transfer.TransferResultPage.ToastLayout r5, viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout r6, boolean r7, java.lang.String r8, o.okycx r9) {
            /*
                r2 = this;
                r0 = r3 & 1
                r1 = 1
                if (r1 == r0) goto Le
                viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer r0 = viva.republica.toss.network.model.transfer.TransferResultPage$Redirect$$serializer.INSTANCE
                kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.getDescriptor()
                o.htf31.onExtraCallbackWithResult(r3, r1, r0)
            Le:
                r2.<init>(r3, r9)
                r2.redirectScheme = r4
                r4 = r3 & 2
                r9 = 0
                r0 = 2
                if (r4 != 0) goto L1e
                r2.toastLayout = r9
                int r4 = r0 % r0
                goto L20
            L1e:
                r2.toastLayout = r5
            L20:
                r4 = r3 & 4
                r5 = 0
                if (r4 != 0) goto L3f
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback
                int r4 = r4 + 23
                int r6 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted = r6
                int r4 = r4 % r0
                r2.bottomSheetLayout = r9
                if (r4 == 0) goto L35
                r4 = 15
                int r4 = r4 / r5
            L35:
                int r6 = r6 + 57
                int r4 = r6 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback = r4
                int r6 = r6 % r0
                if (r6 != 0) goto L4f
                goto L51
            L3f:
                r2.bottomSheetLayout = r6
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback
                int r4 = r4 + 21
                int r6 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted = r6
                int r4 = r4 % r0
                if (r4 == 0) goto L4f
                r4 = 5
                int r4 = r4 % r0
                goto L51
            L4f:
                int r4 = r0 % r0
            L51:
                r4 = r3 & 8
                if (r4 != 0) goto L5a
                r2.clearStack = r5
                int r4 = r0 % r0
                goto L5c
            L5a:
                r2.clearStack = r7
            L5c:
                r3 = r3 & 16
                if (r3 != 0) goto L6c
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback
                int r3 = r3 + 7
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted = r4
                int r3 = r3 % r0
                r2.logStatus = r9
                return
            L6c:
                r2.logStatus = r8
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted
                int r3 = r3 + 77
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback = r4
                int r3 = r3 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.<init>(int, java.lang.String, viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout, viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout, boolean, java.lang.String, o.okycx):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage.Redirect r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                java.lang.String r2 = r4.redirectScheme
                r5.onExtraCallback(r6, r1, r2)
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L24
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted
                int r2 = r2 + 15
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback = r3
                int r2 = r2 % r0
                if (r2 == 0) goto L20
                viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout r2 = r4.toastLayout
                if (r2 == 0) goto L34
                goto L24
            L20:
                viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout r4 = r4.toastLayout
                r4 = 0
                throw r4
            L24:
                viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout r3 = r4.toastLayout
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onWarmupCompleted
                int r2 = r2 + 93
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallback = r3
                int r2 = r2 % r0
            L34:
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                if (r2 != 0) goto L3e
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout r2 = r4.bottomSheetLayout
                if (r2 == 0) goto L45
            L3e:
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout r3 = r4.bottomSheetLayout
                r5.onExtraCallbackWithResult(r6, r0, r2, r3)
            L45:
                r0 = 3
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                if (r2 == 0) goto L4d
                goto L53
            L4d:
                boolean r2 = r4.IAuthTabCallback()
                if (r2 == 0) goto L5a
            L53:
                boolean r2 = r4.IAuthTabCallback()
                r5.onNavigationEvent(r6, r0, r2)
            L5a:
                r0 = 4
                boolean r2 = r5.onWarmupCompleted(r6, r0)
                r1 = r1 ^ r2
                if (r1 == 0) goto L68
                java.lang.String r1 = r4.onNavigationEvent()
                if (r1 == 0) goto L71
            L68:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r4.onNavigationEvent()
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L71:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Redirect.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage$Redirect, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.redirectScheme;
            int i4 = i3 + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final ToastLayout asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            ToastLayout toastLayout = this.toastLayout;
            int i4 = i2 + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return toastLayout;
        }

        public final BottomSheetLayout onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            BottomSheetLayout bottomSheetLayout = this.bottomSheetLayout;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return bottomSheetLayout;
        }

        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.clearStack;
            }
            throw null;
        }

        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.logStatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @nc(IAuthTabCallback = "DISPLAY_RESULT_PAGE")
    @liq
    public static final class Display extends TransferResultPage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final SchemeActionInfo backAction;
        private final BottomCTALayout bottomCTALayout;
        private final BridgeModel.Page bridgePageInfo;
        private final boolean clearStack;
        private final String description;
        private final HapticType hapticType;
        private final SchemeActionInfo impressionAction;
        private final ListRowBannerLayout listRowBannerLayout;
        private final LogInfo logInfo;
        private final String logStatus;
        private final ImageResource lottie;
        private final MemoLayout memoLayout;
        private final MessageCardInfo messageCard;
        private final ButtonLayout navBarButton;
        private final String navigationTitle;
        private final PointToast pointToast;
        private final Suggestion suggestion;
        private final String title;
        private final TitleInfo titleInfo;
        private final ImageResource webP;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Display$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[0];
                int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
                if (i3 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer = (KSerializer) TransferResultPage.Display.onExtraCallbackWithResult(iOnNavigationEvent4, -1416957343, 1416957346, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, objArr);
                int i4 = onExtraCallback + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }
        }), null, null, null, null, null, null, null, null, null, null};

        private static final /* synthetic */ KSerializer onActivityLayout() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<HapticType> kSerializerSerializer = HapticType.Companion.serializer();
            int i4 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i4;
            int i8 = i2 | i7;
            int i9 = (~(i3 | i4)) | i2;
            int i10 = ~i3;
            int i11 = (~(i4 | i3 | i2)) | (~(i7 | i10)) | (~((~i2) | i10));
            int i12 = i3 + i2 + i5 + (1609234610 * i6) + (1307081305 * i);
            int i13 = i12 * i12;
            int i14 = (((-490261092) * i3) - 1772093440) + (1576585830 * i2) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i5) + ((-2101346304) * i6) + (23068672 * i) + ((-2103967744) * i13);
            int i15 = (i3 * 273352028) + 245730370 + (i2 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i5 * 273352337) + (i6 * (-770635566)) + (i * (-73506199)) + (i13 * (-2011693056));
            int i16 = i14 + (i15 * i15 * 1080557568);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnActivityLayout = onActivityLayout();
            if (i3 != 0) {
                int i4 = 34 / 0;
            }
            return kSerializerOnActivityLayout;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return false;
            }
            Display display = (Display) obj;
            if (!Intrinsics.areEqual(this.title, display.title)) {
                int i2 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.description, display.description) || !Intrinsics.areEqual(this.lottie, display.lottie)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.webP, display.webP)) {
                int i4 = onExtraCallbackWithResult + 73;
                onWarmupCompleted = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.memoLayout, display.memoLayout)) {
                int i5 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.pointToast, display.pointToast)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.bottomCTALayout, display.bottomCTALayout)) {
                int i7 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i7 % 128;
                return i7 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.navigationTitle, display.navigationTitle)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.navBarButton, display.navBarButton)) {
                int i8 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (this.hapticType != display.hapticType) {
                int i10 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i10 % 128;
                return i10 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.titleInfo, display.titleInfo)) {
                int i11 = onExtraCallbackWithResult + 55;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.suggestion, display.suggestion) || !Intrinsics.areEqual(this.logInfo, display.logInfo) || !Intrinsics.areEqual(this.listRowBannerLayout, display.listRowBannerLayout) || !Intrinsics.areEqual(this.bridgePageInfo, display.bridgePageInfo)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.messageCard, display.messageCard)) {
                int i13 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.backAction, display.backAction)) {
                int i15 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.impressionAction, display.impressionAction)) {
                return false;
            }
            if (this.clearStack == display.clearStack) {
                return Intrinsics.areEqual(this.logStatus, display.logStatus);
            }
            int i17 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int iHashCode5;
            int i;
            int iHashCode6;
            int i2;
            int iHashCode7;
            int i3 = 2 % 2;
            int iHashCode8 = this.title.hashCode();
            int iHashCode9 = this.description.hashCode();
            int iHashCode10 = this.lottie.hashCode();
            ImageResource imageResource = this.webP;
            if (imageResource == null) {
                int i4 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = imageResource.hashCode();
            }
            MemoLayout memoLayout = this.memoLayout;
            int iHashCode11 = memoLayout == null ? 0 : memoLayout.hashCode();
            PointToast pointToast = this.pointToast;
            int iHashCode12 = pointToast == null ? 0 : pointToast.hashCode();
            BottomCTALayout bottomCTALayout = this.bottomCTALayout;
            if (bottomCTALayout == null) {
                int i6 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = bottomCTALayout.hashCode();
            }
            int iHashCode13 = this.navigationTitle.hashCode();
            ButtonLayout buttonLayout = this.navBarButton;
            if (buttonLayout == null) {
                int i8 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = buttonLayout.hashCode();
            }
            HapticType hapticType = this.hapticType;
            if (hapticType == null) {
                int i10 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = hapticType.hashCode();
            }
            TitleInfo titleInfo = this.titleInfo;
            int iHashCode14 = titleInfo == null ? 0 : titleInfo.hashCode();
            Suggestion suggestion = this.suggestion;
            if (suggestion == null) {
                int i12 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = suggestion.hashCode();
            }
            LogInfo logInfo = this.logInfo;
            int iHashCode15 = logInfo == null ? 0 : logInfo.hashCode();
            ListRowBannerLayout listRowBannerLayout = this.listRowBannerLayout;
            int iHashCode16 = listRowBannerLayout == null ? 0 : listRowBannerLayout.hashCode();
            BridgeModel.Page page = this.bridgePageInfo;
            if (page == null) {
                int i14 = onWarmupCompleted + 35;
                i = iHashCode16;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                iHashCode6 = 0;
            } else {
                i = iHashCode16;
                iHashCode6 = page.hashCode();
            }
            MessageCardInfo messageCardInfo = this.messageCard;
            int iHashCode17 = messageCardInfo == null ? 0 : messageCardInfo.hashCode();
            SchemeActionInfo schemeActionInfo = this.backAction;
            int iHashCode18 = schemeActionInfo == null ? 0 : schemeActionInfo.hashCode();
            SchemeActionInfo schemeActionInfo2 = this.impressionAction;
            int iHashCode19 = schemeActionInfo2 == null ? 0 : schemeActionInfo2.hashCode();
            int iHashCode20 = Boolean.hashCode(this.clearStack);
            String str = this.logStatus;
            if (str != null) {
                int i16 = onWarmupCompleted + 79;
                i2 = iHashCode6;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                iHashCode7 = str.hashCode();
            } else {
                i2 = iHashCode6;
                iHashCode7 = 0;
            }
            return (((((((((((((((((((((((((((((((((((((iHashCode8 * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode14) * 31) + iHashCode5) * 31) + iHashCode15) * 31) + i) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode7;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Display(title=" + this.title + ", description=" + this.description + ", lottie=" + this.lottie + ", webP=" + this.webP + ", memoLayout=" + this.memoLayout + ", pointToast=" + this.pointToast + ", bottomCTALayout=" + this.bottomCTALayout + ", navigationTitle=" + this.navigationTitle + ", navBarButton=" + this.navBarButton + ", hapticType=" + this.hapticType + ", titleInfo=" + this.titleInfo + ", suggestion=" + this.suggestion + ", logInfo=" + this.logInfo + ", listRowBannerLayout=" + this.listRowBannerLayout + ", bridgePageInfo=" + this.bridgePageInfo + ", messageCard=" + this.messageCard + ", backAction=" + this.backAction + ", impressionAction=" + this.impressionAction + ", clearStack=" + this.clearStack + ", logStatus=" + this.logStatus + ")";
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Display> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    TransferResultPage$Display$$serializer transferResultPage$Display$$serializer = TransferResultPage$Display$$serializer.INSTANCE;
                    throw null;
                }
                TransferResultPage$Display$$serializer transferResultPage$Display$$serializer2 = TransferResultPage$Display$$serializer.INSTANCE;
                int i3 = onExtraCallback + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return transferResultPage$Display$$serializer2;
            }
        }

        static {
            int i = IAuthTabCallback + 29;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Display(int i, String str, String str2, ImageResource imageResource, ImageResource imageResource2, MemoLayout memoLayout, PointToast pointToast, BottomCTALayout bottomCTALayout, String str3, ButtonLayout buttonLayout, HapticType hapticType, TitleInfo titleInfo, Suggestion suggestion, LogInfo logInfo, ListRowBannerLayout listRowBannerLayout, BridgeModel.Page page, MessageCardInfo messageCardInfo, SchemeActionInfo schemeActionInfo, SchemeActionInfo schemeActionInfo2, boolean z, String str4, okycx okycxVar) {
            boolean z2;
            super(i, okycxVar);
            if (4 != (i & 4)) {
                htf31.onExtraCallbackWithResult(i, 4, TransferResultPage$Display$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
                int i2 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 % 3;
                } else {
                    int i4 = 2 % 2;
                }
            }
            if ((i & 2) == 0) {
                int i5 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                this.description = "";
            } else {
                this.description = str2;
            }
            this.lottie = imageResource;
            Object obj = null;
            if ((i & 8) == 0) {
                int i7 = onExtraCallbackWithResult + 45;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                this.webP = null;
            } else {
                this.webP = imageResource2;
            }
            if ((i & 16) == 0) {
                this.memoLayout = null;
            } else {
                this.memoLayout = memoLayout;
                int i9 = 2 % 2;
            }
            if ((i & 32) == 0) {
                this.pointToast = null;
            } else {
                this.pointToast = pointToast;
            }
            if ((i & 64) == 0) {
                this.bottomCTALayout = null;
            } else {
                this.bottomCTALayout = bottomCTALayout;
            }
            if ((i & 128) == 0) {
                this.navigationTitle = "";
            } else {
                this.navigationTitle = str3;
            }
            if ((i & 256) == 0) {
                this.navBarButton = null;
            } else {
                this.navBarButton = buttonLayout;
            }
            if ((i & 512) == 0) {
                this.hapticType = null;
            } else {
                this.hapticType = hapticType;
            }
            if ((i & 1024) == 0) {
                int i10 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                this.titleInfo = null;
            } else {
                this.titleInfo = titleInfo;
            }
            if ((i & 2048) == 0) {
                this.suggestion = null;
            } else {
                this.suggestion = suggestion;
            }
            if ((i & 4096) == 0) {
                int i12 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                this.logInfo = null;
                if (i13 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.logInfo = logInfo;
            }
            if ((i & 8192) == 0) {
                int i14 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                this.listRowBannerLayout = null;
            } else {
                this.listRowBannerLayout = listRowBannerLayout;
            }
            if ((i & 16384) == 0) {
                this.bridgePageInfo = null;
            } else {
                this.bridgePageInfo = page;
            }
            if ((32768 & i) == 0) {
                int i16 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                this.messageCard = null;
            } else {
                this.messageCard = messageCardInfo;
            }
            if ((65536 & i) == 0) {
                this.backAction = null;
            } else {
                this.backAction = schemeActionInfo;
            }
            if ((131072 & i) == 0) {
                int i18 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                this.impressionAction = null;
                if (i19 == 0) {
                    throw null;
                }
                int i20 = 2 % 2;
            } else {
                this.impressionAction = schemeActionInfo2;
            }
            if ((262144 & i) == 0) {
                int i21 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                z2 = false;
            } else {
                int i23 = 2 % 2;
                z2 = z;
            }
            this.clearStack = z2;
            if ((i & 524288) == 0) {
                this.logStatus = null;
            } else {
                this.logStatus = str4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Display(@NotNull String str, @NotNull String str2, @NotNull ImageResource imageResource, @Nullable ImageResource imageResource2, @Nullable MemoLayout memoLayout, @Nullable PointToast pointToast, @Nullable BottomCTALayout bottomCTALayout, @NotNull String str3, @Nullable ButtonLayout buttonLayout, @Nullable HapticType hapticType, @Nullable TitleInfo titleInfo, @Nullable Suggestion suggestion, @Nullable LogInfo logInfo, @Nullable ListRowBannerLayout listRowBannerLayout, @Nullable BridgeModel.Page page, @Nullable MessageCardInfo messageCardInfo, @Nullable SchemeActionInfo schemeActionInfo, @Nullable SchemeActionInfo schemeActionInfo2, boolean z, @Nullable String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(imageResource, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.title = str;
            this.description = str2;
            this.lottie = imageResource;
            this.webP = imageResource2;
            this.memoLayout = memoLayout;
            this.pointToast = pointToast;
            this.bottomCTALayout = bottomCTALayout;
            this.navigationTitle = str3;
            this.navBarButton = buttonLayout;
            this.hapticType = hapticType;
            this.titleInfo = titleInfo;
            this.suggestion = suggestion;
            this.logInfo = logInfo;
            this.listRowBannerLayout = listRowBannerLayout;
            this.bridgePageInfo = page;
            this.messageCard = messageCardInfo;
            this.backAction = schemeActionInfo;
            this.impressionAction = schemeActionInfo2;
            this.clearStack = z;
            this.logStatus = str4;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Lazy<KSerializer<Object>>[] lazyArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                lazyArr = $childSerializers;
                int i4 = 68 / 0;
            } else {
                lazyArr = $childSerializers;
            }
            int i5 = i3 + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0180  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage.Display r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Display.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage$Display, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Display(String str, String str2, ImageResource imageResource, ImageResource imageResource2, MemoLayout memoLayout, PointToast pointToast, BottomCTALayout bottomCTALayout, String str3, ButtonLayout buttonLayout, HapticType hapticType, TitleInfo titleInfo, Suggestion suggestion, LogInfo logInfo, ListRowBannerLayout listRowBannerLayout, BridgeModel.Page page, MessageCardInfo messageCardInfo, SchemeActionInfo schemeActionInfo, SchemeActionInfo schemeActionInfo2, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str5;
            MemoLayout memoLayout2;
            String str6;
            ButtonLayout buttonLayout2;
            HapticType hapticType2;
            ListRowBannerLayout listRowBannerLayout2;
            BridgeModel.Page page2;
            SchemeActionInfo schemeActionInfo3;
            String str7;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str5 = "";
            } else {
                str5 = str;
            }
            String str8 = (i & 2) != 0 ? "" : str2;
            ImageResource imageResource3 = (i & 8) != 0 ? null : imageResource2;
            if ((i & 16) != 0) {
                int i5 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                memoLayout2 = null;
            } else {
                memoLayout2 = memoLayout;
            }
            PointToast pointToast2 = (i & 32) != 0 ? null : pointToast;
            BottomCTALayout bottomCTALayout2 = (i & 64) != 0 ? null : bottomCTALayout;
            if ((i & 128) != 0) {
                int i7 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str6 = "";
            } else {
                str6 = str3;
            }
            if ((i & 256) != 0) {
                int i10 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                buttonLayout2 = null;
            } else {
                buttonLayout2 = buttonLayout;
            }
            if ((i & 512) != 0) {
                int i11 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                hapticType2 = null;
            } else {
                hapticType2 = hapticType;
            }
            TitleInfo titleInfo2 = (i & 1024) != 0 ? null : titleInfo;
            Suggestion suggestion2 = (i & 2048) != 0 ? null : suggestion;
            LogInfo logInfo2 = (i & 4096) != 0 ? null : logInfo;
            if ((i & 8192) != 0) {
                int i12 = 2 % 2;
                listRowBannerLayout2 = null;
            } else {
                listRowBannerLayout2 = listRowBannerLayout;
            }
            if ((i & 16384) != 0) {
                int i13 = 2 % 2;
                page2 = null;
            } else {
                page2 = page;
            }
            MessageCardInfo messageCardInfo2 = (32768 & i) != 0 ? null : messageCardInfo;
            if ((65536 & i) != 0) {
                int i14 = 2 % 2;
                schemeActionInfo3 = null;
            } else {
                schemeActionInfo3 = schemeActionInfo;
            }
            SchemeActionInfo schemeActionInfo4 = (131072 & i) != 0 ? null : schemeActionInfo2;
            boolean z2 = (262144 & i) != 0 ? false : z;
            if ((i & 524288) != 0) {
                int i15 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                str7 = null;
            } else {
                str7 = str4;
            }
            this(str5, str8, imageResource, imageResource3, memoLayout2, pointToast2, bottomCTALayout2, str6, buttonLayout2, hapticType2, titleInfo2, suggestion2, logInfo2, listRowBannerLayout2, page2, messageCardInfo2, schemeActionInfo3, schemeActionInfo4, z2, str7);
        }

        public final String onActivityResized() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.title;
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.description;
            if (i3 != 0) {
                int i4 = 29 / 0;
            }
            return str;
        }

        public final ImageResource getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 31;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ImageResource imageResource = this.lottie;
            int i5 = i2 + 41;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return imageResource;
        }

        public final ImageResource onMinimized() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ImageResource imageResource = this.webP;
            int i5 = i2 + 85;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return imageResource;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final MemoLayout extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.memoLayout;
            }
            throw null;
        }

        public final PointToast readTypedObject() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            PointToast pointToast = this.pointToast;
            int i5 = i2 + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return pointToast;
        }

        public final BottomCTALayout onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            BottomCTALayout bottomCTALayout = this.bottomCTALayout;
            int i5 = i3 + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return bottomCTALayout;
            }
            throw null;
        }

        public final String writeTypedObject() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                str = this.navigationTitle;
                int i4 = 58 / 0;
            } else {
                str = this.navigationTitle;
            }
            int i5 = i3 + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            Display display = (Display) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ButtonLayout buttonLayout = display.navBarButton;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return buttonLayout;
            }
            throw null;
        }

        public final HapticType IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return this.hapticType;
            }
            throw null;
        }

        public final TitleInfo onMessageChannelReady() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            TitleInfo titleInfo = this.titleInfo;
            int i5 = i2 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return titleInfo;
        }

        public final LogInfo access000() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            LogInfo logInfo = this.logInfo;
            int i5 = i3 + 89;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return logInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ListRowBannerLayout access100() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ListRowBannerLayout listRowBannerLayout = this.listRowBannerLayout;
            int i5 = i2 + 73;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return listRowBannerLayout;
            }
            throw null;
        }

        public final BridgeModel.Page IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            BridgeModel.Page page = this.bridgePageInfo;
            int i5 = i3 + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return page;
            }
            throw null;
        }

        public final MessageCardInfo extraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MessageCardInfo messageCardInfo = this.messageCard;
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return messageCardInfo;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            Display display = (Display) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            SchemeActionInfo schemeActionInfo = display.backAction;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 57;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return schemeActionInfo;
        }

        public final SchemeActionInfo IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            SchemeActionInfo schemeActionInfo = this.impressionAction;
            int i5 = i3 + 5;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return schemeActionInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.clearStack;
            int i5 = i3 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public String IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.logStatus;
            int i4 = i3 + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (KSerializer) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1416957343, 1416957346, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, new Object[0]);
        }

        public static final /* synthetic */ Lazy[] IAuthTabCallback() {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (Lazy[]) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 351088307, -351088306, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, new Object[0]);
        }

        public final SchemeActionInfo onNavigationEvent() {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (SchemeActionInfo) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -774810747, 774810747, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this});
        }

        public final ButtonLayout ICustomTabsCallback() {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (ButtonLayout) onExtraCallbackWithResult(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1257479404, -1257479402, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, new Object[]{this});
        }
    }

    @nc(IAuthTabCallback = "MY_DATA_SUGGESTION_PAGE")
    @liq
    public static final class MyDataSuggestion extends TransferResultPage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final BottomCTALayout bottomCTALayout;
        private final BridgeModel.Page bridgePageInfo;
        private final boolean clearStack;
        private final String description;
        private final HapticType hapticType;
        private final ListRowBannerLayout listRowBannerLayout;
        private final LogInfo logInfo;
        private final String logStatus;
        private final ImageResource lottie;
        private final MemoLayout memoLayout;
        private final MessageCardInfo messageCard;
        private final ButtonLayout navBarButton;
        private final String navigationTitle;
        private final PointToast pointToast;
        private final Suggestion suggestion;
        private final String title;
        private final TitleInfo titleInfo;
        private final ImageResource webP;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$MyDataSuggestion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = TransferResultPage.MyDataSuggestion.onExtraCallback();
                    int i3 = 28 / 0;
                } else {
                    kSerializerOnExtraCallback = TransferResultPage.MyDataSuggestion.onExtraCallback();
                }
                int i4 = IAuthTabCallback + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, null, null, null, null, null, null, null};

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<HapticType> kSerializerSerializer = HapticType.Companion.serializer();
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallbackDefault();
                throw null;
            }
            KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 31 / 0;
            }
            return kSerializerIAuthTabCallbackDefault;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyDataSuggestion)) {
                return false;
            }
            MyDataSuggestion myDataSuggestion = (MyDataSuggestion) obj;
            if (!Intrinsics.areEqual(this.title, myDataSuggestion.title) || !Intrinsics.areEqual(this.description, myDataSuggestion.description) || !Intrinsics.areEqual(this.lottie, myDataSuggestion.lottie)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.webP, myDataSuggestion.webP)) {
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.memoLayout, myDataSuggestion.memoLayout)) {
                int i3 = onExtraCallback + 9;
                IAuthTabCallback = i3 % 128;
                return i3 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.pointToast, myDataSuggestion.pointToast)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.bottomCTALayout, myDataSuggestion.bottomCTALayout)) {
                int i4 = IAuthTabCallback;
                int i5 = i4 + 1;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 65;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.navigationTitle, myDataSuggestion.navigationTitle)) || !Intrinsics.areEqual(this.navBarButton, myDataSuggestion.navBarButton)) {
                return false;
            }
            if (this.hapticType != myDataSuggestion.hapticType) {
                int i9 = onExtraCallback + 93;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.titleInfo, myDataSuggestion.titleInfo) || (!Intrinsics.areEqual(this.suggestion, myDataSuggestion.suggestion)) || !Intrinsics.areEqual(this.logInfo, myDataSuggestion.logInfo) || !Intrinsics.areEqual(this.listRowBannerLayout, myDataSuggestion.listRowBannerLayout)) {
                return false;
            }
            if (Intrinsics.areEqual(this.bridgePageInfo, myDataSuggestion.bridgePageInfo)) {
                return Intrinsics.areEqual(this.messageCard, myDataSuggestion.messageCard) && this.clearStack == myDataSuggestion.clearStack && Intrinsics.areEqual(this.logStatus, myDataSuggestion.logStatus);
            }
            int i11 = onExtraCallback + 5;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i;
            int i2;
            int i3;
            int iHashCode4;
            int i4 = 2 % 2;
            int iHashCode5 = this.title.hashCode();
            int iHashCode6 = this.description.hashCode();
            int iHashCode7 = this.lottie.hashCode();
            ImageResource imageResource = this.webP;
            int iHashCode8 = imageResource == null ? 0 : imageResource.hashCode();
            MemoLayout memoLayout = this.memoLayout;
            int iHashCode9 = memoLayout == null ? 0 : memoLayout.hashCode();
            PointToast pointToast = this.pointToast;
            int iHashCode10 = pointToast == null ? 0 : pointToast.hashCode();
            int iHashCode11 = this.bottomCTALayout.hashCode();
            int iHashCode12 = this.navigationTitle.hashCode();
            ButtonLayout buttonLayout = this.navBarButton;
            if (buttonLayout == null) {
                int i5 = IAuthTabCallback + 83;
                onExtraCallback = i5 % 128;
                iHashCode = i5 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = buttonLayout.hashCode();
            }
            HapticType hapticType = this.hapticType;
            int iHashCode13 = hapticType == null ? 0 : hapticType.hashCode();
            TitleInfo titleInfo = this.titleInfo;
            if (titleInfo == null) {
                int i6 = IAuthTabCallback + 93;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = titleInfo.hashCode();
            }
            Suggestion suggestion = this.suggestion;
            if (suggestion == null) {
                int i8 = IAuthTabCallback;
                int i9 = i8 + 3;
                onExtraCallback = i9 % 128;
                iHashCode3 = i9 % 2 == 0 ? 1 : 0;
                int i10 = i8 + 109;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            } else {
                iHashCode3 = suggestion.hashCode();
            }
            LogInfo logInfo = this.logInfo;
            int iHashCode14 = logInfo == null ? 0 : logInfo.hashCode();
            ListRowBannerLayout listRowBannerLayout = this.listRowBannerLayout;
            int iHashCode15 = listRowBannerLayout == null ? 0 : listRowBannerLayout.hashCode();
            BridgeModel.Page page = this.bridgePageInfo;
            if (page == null) {
                i = iHashCode15;
                i2 = 0;
            } else {
                int iHashCode16 = page.hashCode();
                int i12 = onExtraCallback + 41;
                i = iHashCode15;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i2 = iHashCode16;
            }
            MessageCardInfo messageCardInfo = this.messageCard;
            int iHashCode17 = messageCardInfo == null ? 0 : messageCardInfo.hashCode();
            int iHashCode18 = Boolean.hashCode(this.clearStack);
            String str = this.logStatus;
            if (str != null) {
                int i14 = IAuthTabCallback + 19;
                i3 = i2;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    iHashCode4 = str.hashCode();
                    int i15 = 38 / 0;
                } else {
                    iHashCode4 = str.hashCode();
                }
            } else {
                i3 = i2;
                iHashCode4 = 0;
            }
            return (((((((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode) * 31) + iHashCode13) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode14) * 31) + i) * 31) + i3) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode4;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MyDataSuggestion(title=" + this.title + ", description=" + this.description + ", lottie=" + this.lottie + ", webP=" + this.webP + ", memoLayout=" + this.memoLayout + ", pointToast=" + this.pointToast + ", bottomCTALayout=" + this.bottomCTALayout + ", navigationTitle=" + this.navigationTitle + ", navBarButton=" + this.navBarButton + ", hapticType=" + this.hapticType + ", titleInfo=" + this.titleInfo + ", suggestion=" + this.suggestion + ", logInfo=" + this.logInfo + ", listRowBannerLayout=" + this.listRowBannerLayout + ", bridgePageInfo=" + this.bridgePageInfo + ", messageCard=" + this.messageCard + ", clearStack=" + this.clearStack + ", logStatus=" + this.logStatus + ")";
            int i2 = IAuthTabCallback + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MyDataSuggestion> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$MyDataSuggestion$$serializer transferResultPage$MyDataSuggestion$$serializer = TransferResultPage$MyDataSuggestion$$serializer.INSTANCE;
                int i4 = onWarmupCompleted + 55;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return transferResultPage$MyDataSuggestion$$serializer;
            }
        }

        static {
            int i = onNavigationEvent + 29;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MyDataSuggestion(int i, String str, String str2, ImageResource imageResource, ImageResource imageResource2, MemoLayout memoLayout, PointToast pointToast, BottomCTALayout bottomCTALayout, String str3, ButtonLayout buttonLayout, HapticType hapticType, TitleInfo titleInfo, Suggestion suggestion, LogInfo logInfo, ListRowBannerLayout listRowBannerLayout, BridgeModel.Page page, MessageCardInfo messageCardInfo, boolean z, String str4, okycx okycxVar) {
            super(i, okycxVar);
            if (32836 != (i & 32836)) {
                htf31.onExtraCallbackWithResult(i, 32836, TransferResultPage$MyDataSuggestion$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            Object obj = null;
            if ((i & 2) == 0) {
                int i2 = IAuthTabCallback + 119;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                this.description = "";
                if (i3 == 0) {
                    throw null;
                }
            } else {
                this.description = str2;
            }
            this.lottie = imageResource;
            if ((i & 8) == 0) {
                this.webP = null;
            } else {
                this.webP = imageResource2;
            }
            if ((i & 16) == 0) {
                this.memoLayout = null;
            } else {
                this.memoLayout = memoLayout;
            }
            if ((i & 32) == 0) {
                this.pointToast = null;
            } else {
                this.pointToast = pointToast;
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = 2 % 2;
            this.bottomCTALayout = bottomCTALayout;
            if ((i & 128) == 0) {
                this.navigationTitle = "";
                int i7 = 2 % 2;
            } else {
                this.navigationTitle = str3;
            }
            if ((i & 256) == 0) {
                this.navBarButton = null;
            } else {
                this.navBarButton = buttonLayout;
            }
            if ((i & 512) == 0) {
                this.hapticType = null;
            } else {
                this.hapticType = hapticType;
            }
            if ((i & 1024) == 0) {
                this.titleInfo = null;
            } else {
                this.titleInfo = titleInfo;
            }
            if ((i & 2048) == 0) {
                this.suggestion = null;
            } else {
                this.suggestion = suggestion;
            }
            if ((i & 4096) == 0) {
                int i8 = IAuthTabCallback + 15;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                this.logInfo = null;
                if (i9 == 0) {
                    int i10 = 78 / 0;
                }
            } else {
                this.logInfo = logInfo;
            }
            if ((i & 8192) == 0) {
                this.listRowBannerLayout = null;
                int i11 = 2 % 2;
            } else {
                this.listRowBannerLayout = listRowBannerLayout;
            }
            if ((i & 16384) == 0) {
                int i12 = IAuthTabCallback + 125;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                this.bridgePageInfo = null;
                if (i13 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                this.bridgePageInfo = page;
                int i14 = onExtraCallback + 35;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 3 / 5;
                } else {
                    int i16 = 2 % 2;
                }
            }
            this.messageCard = messageCardInfo;
            this.clearStack = (65536 & i) != 0 ? z : false;
            if ((i & 131072) == 0) {
                this.logStatus = null;
            } else {
                this.logStatus = str4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage.MyDataSuggestion r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
            /*
                Method dump skipped, instructions count: 403
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.MyDataSuggestion.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage$MyDataSuggestion, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 97;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i2 + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return lazyArr;
            }
            obj.hashCode();
            throw null;
        }

        public final Suggestion asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Suggestion suggestion = this.suggestion;
            int i5 = i3 + 51;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return suggestion;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.clearStack;
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            return z;
        }

        public String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.logStatus;
            int i5 = i3 + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Display asInterface() {
            int i = 2 % 2;
            Display display = new Display(this.title, this.description, this.lottie, this.webP, this.memoLayout, this.pointToast, this.bottomCTALayout, this.navigationTitle, this.navBarButton, this.hapticType, this.titleInfo, this.suggestion, this.logInfo, this.listRowBannerLayout, this.bridgePageInfo, this.messageCard, null, null, IAuthTabCallback(), onTransact());
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return display;
        }
    }

    @nc(IAuthTabCallback = "SHARE_TRANSFER_RESULT")
    @liq
    public static final class ShareTransfer extends TransferResultPage {
        public static final int $stable = 8;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean clearStack;
        private final String logStatus;
        private final TransferShareResultResponse shareTransferInfo;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onNavigationEvent + 83;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareTransfer)) {
                return false;
            }
            ShareTransfer shareTransfer = (ShareTransfer) obj;
            if (!Intrinsics.areEqual(this.shareTransferInfo, shareTransfer.shareTransferInfo)) {
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.clearStack == shareTransfer.clearStack) {
                return Intrinsics.areEqual(this.logStatus, shareTransfer.logStatus);
            }
            int i3 = onWarmupCompleted;
            int i4 = i3 + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[PHI: r1 r3 r4
          0x003d: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x003d: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x003d: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
          0x0033: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted
                int r1 = r1 + 67
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L23
                im.toss.features.transfer.share.library.data.TransferShareResultResponse r1 = r6.shareTransferInfo
                int r1 = r1.hashCode()
                boolean r3 = r6.clearStack
                int r3 = java.lang.Boolean.hashCode(r3)
                java.lang.String r4 = r6.logStatus
                r5 = 24
                int r5 = r5 / r2
                if (r4 != 0) goto L3d
                goto L33
            L23:
                im.toss.features.transfer.share.library.data.TransferShareResultResponse r1 = r6.shareTransferInfo
                int r1 = r1.hashCode()
                boolean r3 = r6.clearStack
                int r3 = java.lang.Boolean.hashCode(r3)
                java.lang.String r4 = r6.logStatus
                if (r4 != 0) goto L3d
            L33:
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback
                int r4 = r4 + 29
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted = r5
                int r4 = r4 % r0
                goto L4e
            L3d:
                int r2 = r4.hashCode()
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted
                int r4 = r4 + 77
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback = r5
                int r4 = r4 % r0
                if (r4 == 0) goto L4e
                r0 = 5
                int r0 = r0 % r0
            L4e:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShareTransfer(shareTransferInfo=" + this.shareTransferInfo + ", clearStack=" + this.clearStack + ", logStatus=" + this.logStatus + ")";
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ShareTransfer> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$ShareTransfer$$serializer transferResultPage$ShareTransfer$$serializer = TransferResultPage$ShareTransfer$$serializer.INSTANCE;
                if (i3 != 0) {
                    return transferResultPage$ShareTransfer$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ShareTransfer(int i, TransferShareResultResponse transferShareResultResponse, boolean z, String str, okycx okycxVar) {
            super(i, okycxVar);
            if (1 != (i & 1)) {
                int i2 = onExtraCallback + 111;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TransferResultPage$ShareTransfer$$serializer.INSTANCE.getDescriptor());
                int i4 = 2 % 2;
            }
            this.shareTransferInfo = transferShareResultResponse;
            if ((i & 2) == 0) {
                this.clearStack = false;
            } else {
                this.clearStack = z;
                int i5 = onExtraCallback + 89;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 5;
                } else {
                    int i7 = 2 % 2;
                }
            }
            if ((i & 4) != 0) {
                this.logStatus = str;
                return;
            }
            int i8 = onWarmupCompleted + 41;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            this.logStatus = null;
            if (i9 != 0) {
                int i10 = 5 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted
                int r1 = r1 + 37
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback = r2
                int r1 = r1 % r0
                im.toss.features.transfer.share.library.data.TransferShareResultResponse$$serializer r1 = im.toss.features.transfer.share.library.data.TransferShareResultResponse$.serializer.INSTANCE
                im.toss.features.transfer.share.library.data.TransferShareResultResponse r2 = r4.shareTransferInfo
                r3 = 0
                r5.onNavigationEvent(r6, r3, r1, r2)
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L2a
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback
                int r2 = r2 + 105
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted = r3
                int r2 = r2 % r0
                boolean r2 = r4.onExtraCallback()
                if (r2 == 0) goto L31
            L2a:
                boolean r2 = r4.onExtraCallback()
                r5.onNavigationEvent(r6, r1, r2)
            L31:
                boolean r1 = r5.onWarmupCompleted(r6, r0)
                if (r1 != 0) goto L3d
                java.lang.String r1 = r4.IAuthTabCallback()
                if (r1 == 0) goto L46
            L3d:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r4.IAuthTabCallback()
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L46:
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallback
                int r4 = r4 + 111
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onWarmupCompleted = r5
                int r4 = r4 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.ShareTransfer.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage$ShareTransfer, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final TransferShareResultResponse onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            TransferShareResultResponse transferShareResultResponse = this.shareTransferInfo;
            int i4 = i3 + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return transferShareResultResponse;
            }
            obj.hashCode();
            throw null;
        }

        public boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.clearStack;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.logStatus;
            int i5 = i3 + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    @liq
    public static final class ImageResource {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final boolean loop;
        private final String url;

        static {
            int i = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 55;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageResource)) {
                int i4 = i2 + 81;
                onExtraCallback = i4 % 128;
                return i4 % 2 == 0;
            }
            ImageResource imageResource = (ImageResource) obj;
            if (Intrinsics.areEqual(this.url, imageResource.url)) {
                return this.loop == imageResource.loop;
            }
            int i5 = onExtraCallback + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.url.hashCode() * 31) + Boolean.hashCode(this.loop);
            int i4 = onWarmupCompleted + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ImageResource(url=" + this.url + ", loop=" + this.loop + ")";
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ImageResource> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$ImageResource$$serializer transferResultPage$ImageResource$$serializer = TransferResultPage$ImageResource$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 11;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 86 / 0;
                }
                return transferResultPage$ImageResource$$serializer;
            }
        }

        public /* synthetic */ ImageResource(int i, String str, boolean z, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TransferResultPage$ImageResource$$serializer.INSTANCE.getDescriptor());
            }
            this.url = str;
            if ((i & 2) == 0) {
                this.loop = false;
                int i4 = onWarmupCompleted + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            this.loop = z;
            int i6 = onExtraCallback + 13;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public ImageResource(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.loop = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource.onWarmupCompleted
                int r1 = r1 + 27
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                java.lang.String r1 = r4.url
                r5.onExtraCallback(r6, r3, r1)
                boolean r1 = r5.onWarmupCompleted(r6, r3)
                if (r1 != 0) goto L2b
                goto L27
            L1c:
                java.lang.String r1 = r4.url
                r5.onExtraCallback(r6, r3, r1)
                boolean r1 = r5.onWarmupCompleted(r6, r2)
                if (r1 != 0) goto L2b
            L27:
                boolean r1 = r4.loop
                if (r1 == 0) goto L30
            L2b:
                boolean r4 = r4.loop
                r5.onNavigationEvent(r6, r2, r4)
            L30:
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource.onWarmupCompleted
                int r4 = r4 + 79
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource.onExtraCallback = r5
                int r4 = r4 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.ImageResource.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage$ImageResource, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.url;
            int i5 = i3 + 17;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.loop;
            int i5 = i2 + 107;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return z;
        }
    }

    @liq
    public static final class ToastLayout {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String iconUrl;
        private final String message;

        static {
            int i = onWarmupCompleted + 47;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 65;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 87;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 80 / 0;
                }
                return true;
            }
            if (!(obj instanceof ToastLayout)) {
                int i7 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            ToastLayout toastLayout = (ToastLayout) obj;
            if (!Intrinsics.areEqual(this.iconUrl, toastLayout.iconUrl)) {
                int i9 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.message, toastLayout.message)) {
                return true;
            }
            int i11 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 81;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.iconUrl;
            if (str == null) {
                int i4 = i2 + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode2 = (iHashCode * 31) + this.message.hashCode();
            int i6 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return iHashCode2;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ToastLayout(iconUrl=" + this.iconUrl + ", message=" + this.message + ")";
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ToastLayout> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$ToastLayout$$serializer transferResultPage$ToastLayout$$serializer = TransferResultPage$ToastLayout$$serializer.INSTANCE;
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$ToastLayout$$serializer;
            }
        }

        public /* synthetic */ ToastLayout(int i, String str, String str2, okycx okycxVar) {
            if (2 != (i & 2)) {
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 2, TransferResultPage$ToastLayout$$serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            if ((i & 1) == 0) {
                this.iconUrl = null;
                int i7 = 2 % 2;
            } else {
                this.iconUrl = str;
            }
            this.message = str2;
        }

        @JvmStatic
        public static final /* synthetic */ void IAuthTabCallback(ToastLayout toastLayout, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || toastLayout.iconUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, toastLayout.iconUrl);
                int i4 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            vylVar.onExtraCallback(serialDescriptor, 1, toastLayout.message);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            String str = this.iconUrl;
            int i5 = i3 + 113;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.message;
            int i5 = i2 + 121;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 43 / 0;
            }
            return str;
        }
    }

    @liq
    public static final class BottomSheetLayout {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final String buttonTitle;
        private final String description;
        private final String title;

        static {
            int i = onWarmupCompleted + 77;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof BottomSheetLayout)) {
                return false;
            }
            BottomSheetLayout bottomSheetLayout = (BottomSheetLayout) obj;
            if (!Intrinsics.areEqual(this.title, bottomSheetLayout.title)) {
                int i4 = onNavigationEvent + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.description, bottomSheetLayout.description)) {
                int i6 = onNavigationEvent + 3;
                IAuthTabCallback = i6 % 128;
                return i6 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.buttonTitle, bottomSheetLayout.buttonTitle)) {
                return true;
            }
            int i7 = onNavigationEvent + 53;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.title.hashCode();
            return i3 == 0 ? (((iHashCode >> 119) - this.description.hashCode()) / 77) * this.buttonTitle.hashCode() : (((iHashCode * 31) + this.description.hashCode()) * 31) + this.buttonTitle.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomSheetLayout(title=" + this.title + ", description=" + this.description + ", buttonTitle=" + this.buttonTitle + ")";
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BottomSheetLayout> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 27;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$BottomSheetLayout$$serializer transferResultPage$BottomSheetLayout$$serializer = TransferResultPage$BottomSheetLayout$$serializer.INSTANCE;
                int i4 = onExtraCallback + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$BottomSheetLayout$$serializer;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ BottomSheetLayout(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, o.okycx r8) {
            /*
                r3 = this;
                r8 = r4 & 4
                r0 = 4
                r1 = 2
                if (r0 == r8) goto L18
                int r8 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback
                int r8 = r8 + 85
                int r2 = r8 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.onNavigationEvent = r2
                int r8 = r8 % r1
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout$$serializer r8 = viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout$$serializer.INSTANCE
                kotlinx.serialization.descriptors.SerialDescriptor r8 = r8.getDescriptor()
                o.htf31.onExtraCallbackWithResult(r4, r0, r8)
            L18:
                r3.<init>()
                r8 = r4 & 1
                java.lang.String r0 = ""
                if (r8 != 0) goto L2f
                r3.title = r0
                int r5 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback
                int r5 = r5 + 65
                int r8 = r5 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.onNavigationEvent = r8
                int r5 = r5 % r1
                if (r5 != 0) goto L31
                goto L33
            L2f:
                r3.title = r5
            L31:
                int r5 = r1 % r1
            L33:
                r4 = r4 & r1
                if (r4 != 0) goto L42
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.onNavigationEvent
                int r4 = r4 + 1
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback = r5
                int r4 = r4 % r1
                r3.description = r0
                goto L45
            L42:
                r3.description = r6
                int r1 = r1 % r1
            L45:
                r3.buttonTitle = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.<init>(int, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                java.lang.String r3 = ""
                if (r2 != 0) goto L14
                java.lang.String r2 = r5.title
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 != 0) goto L22
            L14:
                java.lang.String r2 = r5.title
                r6.onExtraCallback(r7, r1, r2)
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.onNavigationEvent
                int r1 = r1 + 39
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback = r2
                int r1 = r1 % r0
            L22:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                if (r2 != 0) goto L44
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback
                int r2 = r2 + 41
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.onNavigationEvent = r4
                int r2 = r2 % r0
                if (r2 == 0) goto L3d
                java.lang.String r2 = r5.description
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                if (r2 == 0) goto L44
                goto L49
            L3d:
                java.lang.String r5 = r5.description
                kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
                r5 = 0
                throw r5
            L44:
                java.lang.String r2 = r5.description
                r6.onExtraCallback(r7, r1, r2)
            L49:
                java.lang.String r5 = r5.buttonTitle
                r6.onExtraCallback(r7, r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.BottomSheetLayout.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferResultPage$BottomSheetLayout, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.title;
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.description;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.buttonTitle;
            }
            throw null;
        }
    }

    @liq
    public static final class MemoLayout {
        public static final int $stable = 0;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String buttonTitle;
        private final String footerDescription;
        private final String innerMessage;
        private final String innerTitle;
        private final Integer lengthCap;
        private final onNavigationEvent memoLayoutPosition;
        public static final Companion Companion = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$MemoLayout$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = TransferResultPage.MemoLayout.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 78 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        })};

        public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = (~(i7 | i2)) | i6;
            int i9 = ~i2;
            int i10 = i7 | i6;
            int i11 = (~(i3 | i9 | i6)) | (~(i10 | i2));
            int i12 = (~i10) | (~(i9 | (~i6)));
            int i13 = i6 + i2 + i5 + (1353909401 * i4) + ((-1351514252) * i);
            int i14 = i13 * i13;
            int i15 = (1883508457 * i6) + 799145984 + ((-1483212659) * i2) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i5) + (337379328 * i4) + ((-1540358144) * i) + (669122560 * i14);
            int i16 = ((i6 * 521834465) - 1171472169) + (i2 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i5 * 521834041) + (i4 * 1123214353) + (i * (-684621612)) + (i14 * 1028784128);
            return i15 + ((i16 * i16) * 1635647488) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                asBinder();
                throw null;
            }
            KSerializer kSerializerAsBinder = asBinder();
            int i3 = onNavigationEvent + 57;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerAsBinder;
            }
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ KSerializer asBinder() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.MemoLayout.MemoLayoutPosition", onNavigationEvent.values());
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof MemoLayout)) {
                return false;
            }
            MemoLayout memoLayout = (MemoLayout) obj;
            if (!Intrinsics.areEqual(this.buttonTitle, memoLayout.buttonTitle)) {
                int i4 = onWarmupCompleted + 31;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.innerTitle, memoLayout.innerTitle)) {
                int i6 = onNavigationEvent + 91;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.innerMessage, memoLayout.innerMessage)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.footerDescription, memoLayout.footerDescription)) {
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.lengthCap, memoLayout.lengthCap)) {
                return false;
            }
            if (this.memoLayoutPosition == memoLayout.memoLayoutPosition) {
                return true;
            }
            int i9 = onNavigationEvent + 13;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.buttonTitle.hashCode();
            String str = this.innerTitle;
            int iHashCode3 = 0;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.innerMessage;
            if (str2 == null) {
                int i4 = onWarmupCompleted + 87;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            String str3 = this.footerDescription;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.lengthCap;
            if (num != null) {
                int i6 = onWarmupCompleted + 15;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    num.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode3 = num.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + this.memoLayoutPosition.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MemoLayout(buttonTitle=" + this.buttonTitle + ", innerTitle=" + this.innerTitle + ", innerMessage=" + this.innerMessage + ", footerDescription=" + this.footerDescription + ", lengthCap=" + this.lengthCap + ", memoLayoutPosition=" + this.memoLayoutPosition + ")";
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MemoLayout> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    TransferResultPage$MemoLayout$$serializer transferResultPage$MemoLayout$$serializer = TransferResultPage$MemoLayout$$serializer.INSTANCE;
                    throw null;
                }
                TransferResultPage$MemoLayout$$serializer transferResultPage$MemoLayout$$serializer2 = TransferResultPage$MemoLayout$$serializer.INSTANCE;
                int i3 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return transferResultPage$MemoLayout$$serializer2;
                }
                throw null;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 62 / 0;
            }
        }

        public /* synthetic */ MemoLayout(int i, String str, String str2, String str3, String str4, Integer num, onNavigationEvent onnavigationevent, okycx okycxVar) {
            if (1 != (i & 1)) {
                htf31.onExtraCallbackWithResult(i, 1, TransferResultPage$MemoLayout$$serializer.INSTANCE.getDescriptor());
                int i2 = 2 % 2;
            }
            this.buttonTitle = str;
            if ((i & 2) == 0) {
                this.innerTitle = null;
                int i3 = onNavigationEvent + 97;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 5;
                } else {
                    int i5 = 2 % 2;
                }
            } else {
                this.innerTitle = str2;
            }
            if ((i & 4) == 0) {
                this.innerMessage = null;
            } else {
                this.innerMessage = str3;
            }
            if ((i & 8) == 0) {
                int i6 = onNavigationEvent + 37;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                this.footerDescription = null;
            } else {
                this.footerDescription = str4;
            }
            if ((i & 16) == 0) {
                this.lengthCap = null;
            } else {
                this.lengthCap = num;
            }
            if ((i & 32) == 0) {
                this.memoLayoutPosition = onNavigationEvent.TITLE_BOTTOM;
            } else {
                this.memoLayoutPosition = onnavigationevent;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(MemoLayout memoLayout, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, memoLayout.buttonTitle);
            if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || memoLayout.innerTitle != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, memoLayout.innerTitle);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 2) || memoLayout.innerMessage != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, memoLayout.innerMessage);
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 3) || memoLayout.footerDescription != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, memoLayout.footerDescription);
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            if (vylVar.onWarmupCompleted(serialDescriptor, 4) || memoLayout.lengthCap != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getDynamicHeight.onWarmupCompleted, memoLayout.lengthCap);
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
                int i6 = onNavigationEvent + 119;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (memoLayout.memoLayoutPosition == onNavigationEvent.TITLE_BOTTOM) {
                    return;
                }
            }
            vylVar.onNavigationEvent(serialDescriptor, 5, (py) lazyArr[5].getValue(), memoLayout.memoLayoutPosition);
        }

        public static final /* synthetic */ Lazy[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i4 = i3 + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return lazyArr;
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.buttonTitle;
            int i5 = i2 + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.innerTitle;
            int i5 = i3 + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            MemoLayout memoLayout = (MemoLayout) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = memoLayout.innerMessage;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.footerDescription;
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.lengthCap;
            int i5 = i2 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            MemoLayout memoLayout = (MemoLayout) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = memoLayout.memoLayoutPosition;
            int i5 = i3 + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 13 / 0;
            }
            return onnavigationevent;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class onNavigationEvent {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ onNavigationEvent[] $VALUES;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            public static final onNavigationEvent CTA_TOP = new onNavigationEvent("CTA_TOP", 0);
            public static final onNavigationEvent TITLE_BOTTOM = new onNavigationEvent("TITLE_BOTTOM", 1);

            private static final /* synthetic */ onNavigationEvent[] $values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                onNavigationEvent[] onnavigationeventArr = {CTA_TOP, TITLE_BOTTOM};
                int i5 = i3 + 71;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return onnavigationeventArr;
                }
                throw null;
            }

            public static EnumEntries<onNavigationEvent> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return $ENTRIES;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static onNavigationEvent valueOf(String str) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
                if (i3 == 0) {
                    int i4 = 54 / 0;
                }
                return onnavigationevent;
            }

            public static onNavigationEvent[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent[] onnavigationeventArr = $VALUES;
                if (i3 == 0) {
                    return (onNavigationEvent[]) onnavigationeventArr.clone();
                }
                int i4 = 67 / 0;
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }

            private onNavigationEvent(String str, int i) {
            }

            static {
                onNavigationEvent[] onnavigationeventArr$values = $values();
                $VALUES = onnavigationeventArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
                int i = onNavigationEvent + 23;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }
        }

        public final String onWarmupCompleted() {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (String) IAuthTabCallback(new Object[]{this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -29644625, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, 29644625);
        }

        public final onNavigationEvent IAuthTabCallbackStub() {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (onNavigationEvent) IAuthTabCallback(new Object[]{this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1240163115, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, 1240163116);
        }
    }

    @liq
    public static final class MessageCardInfo {
        public static final Companion Companion;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final TransferMessageCardGradient gradient;
        private final String messageCardId;
        private final Resource resource;
        private final TransferMessageCardColor strokeColor;
        private final String text;
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    TransferResultPage.MessageCardInfo.IAuthTabCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = TransferResultPage.MessageCardInfo.IAuthTabCallback();
                int i3 = IAuthTabCallback + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return kSerializerIAuthTabCallback;
            }
        }), null, null};

        public MessageCardInfo() {
            this((String) null, (String) null, (Resource) null, (TransferMessageCardColor) null, (TransferMessageCardGradient) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ KSerializer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return kSerializerAsInterface;
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Resource> kSerializerSerializer = Resource.Companion.serializer();
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return kSerializerSerializer;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i2 + 15;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            if (!(obj instanceof MessageCardInfo)) {
                return false;
            }
            MessageCardInfo messageCardInfo = (MessageCardInfo) obj;
            if (!Intrinsics.areEqual(this.messageCardId, messageCardInfo.messageCardId)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.text, messageCardInfo.text)) {
                int i9 = onWarmupCompleted + 83;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.resource, messageCardInfo.resource)) {
                return Intrinsics.areEqual(this.strokeColor, messageCardInfo.strokeColor) && Intrinsics.areEqual(this.gradient, messageCardInfo.gradient);
            }
            int i11 = onNavigationEvent + 119;
            onWarmupCompleted = i11 % 128;
            return i11 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.messageCardId;
            if (str == null) {
                int i5 = i2 + 101;
                onNavigationEvent = i5 % 128;
                iHashCode = i5 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.text;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            Resource resource = this.resource;
            int iHashCode4 = resource == null ? 0 : resource.hashCode();
            TransferMessageCardColor transferMessageCardColor = this.strokeColor;
            if (transferMessageCardColor == null) {
                int i6 = onNavigationEvent + 109;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = transferMessageCardColor.hashCode();
            }
            TransferMessageCardGradient transferMessageCardGradient = this.gradient;
            return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (transferMessageCardGradient != null ? transferMessageCardGradient.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MessageCardInfo(messageCardId=" + this.messageCardId + ", text=" + this.text + ", resource=" + this.resource + ", strokeColor=" + this.strokeColor + ", gradient=" + this.gradient + ")";
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @appInfo(IAuthTabCallback = "type")
        @liq
        public static abstract class Resource {
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final int $stable = 0;
            public static final Companion Companion;
            private static byte[] IAuthTabCallback;
            private static int asInterface;
            private static int onExtraCallback;
            private static short[] onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            private static final byte[] $$a = {84, 79, 22, 41};
            private static final int $$b = 173;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asBinder = 1;
            private static int onTransact = 0;
            private static int IAuthTabCallbackDefault = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(short r6, int r7, short r8) {
                /*
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource.$$a
                    int r8 = r8 * 3
                    int r1 = 1 - r8
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2f
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L26:
                    r4 = r0[r7]
                    int r3 = r3 + 1
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2f:
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource.$$c(short, int, short):java.lang.String");
            }

            public /* synthetic */ Resource(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ KSerializer onExtraCallback() throws Throwable {
                int i = 2 % 2;
                int i2 = onTransact + 17;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
                int i4 = onTransact + 75;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 25 / 0;
                }
                return kSerializerIAuthTabCallback;
            }

            public abstract String onWarmupCompleted();

            private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
                int i4;
                long j;
                int length;
                byte[] bArr;
                int i5 = 2 % 2;
                TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43424), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, 22440 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i6 = $10 + 119;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if ((i4 ^ 1) != 0) {
                        j = -4629411779493505016L;
                    } else {
                        int i8 = $11 + 65;
                        int i9 = i8 % 128;
                        $10 = i9;
                        int i10 = i8 % 2;
                        byte[] bArr2 = IAuthTabCallback;
                        if (bArr2 != null) {
                            int i11 = i9 + 103;
                            $11 = i11 % 128;
                            if (i11 % 2 == 0) {
                                length = bArr2.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr2.length;
                                bArr = new byte[length];
                            }
                            int i12 = 0;
                            while (i12 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                    if (objOnExtraCallback2 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12843), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                    i12++;
                                    int i13 = $10 + 93;
                                    $11 = i13 % 128;
                                    int i14 = i13 % 2;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr2 = bArr;
                        }
                        if (bArr2 != null) {
                            byte[] bArr3 = IAuthTabCallback;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43424), 42 - (ViewConfiguration.getTouchSlop() >> 8), MotionEvent.axisFromString("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                            j = -4629411779493505016L;
                        } else {
                            j = -4629411779493505016L;
                            iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        }
                    }
                    if (iIntValue > 0) {
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + i4;
                        try {
                            Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 86 - Color.green(0), 9567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            byte[] bArr4 = IAuthTabCallback;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                int i15 = 0;
                                while (i15 < length2) {
                                    int i16 = $11 + 3;
                                    int i17 = i16 % 128;
                                    $10 = i17;
                                    if (i16 % 2 != 0) {
                                        bArr5[i15] = (byte) (bArr4[i15] - 4629411779493505016L);
                                        i15 /= 0;
                                    } else {
                                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                                        i15++;
                                    }
                                    int i18 = i17 + 41;
                                    $11 = i18 % 128;
                                    int i19 = i18 % 2;
                                }
                                bArr4 = bArr5;
                            }
                            boolean z = bArr4 != null;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                            while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                                if (z) {
                                    int i20 = $11 + 11;
                                    $10 = i20 % 128;
                                    int i21 = i20 % 2;
                                    byte[] bArr6 = IAuthTabCallback;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                } else {
                                    short[] sArr = onExtraCallbackWithResult;
                                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                                }
                                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 95;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object value = Resource.onExtraCallbackWithResult().getValue();
                    if (i3 == 0) {
                        return (KSerializer) value;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final KSerializer<Resource> serializer() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 65;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        onExtraCallbackWithResult();
                        throw null;
                    }
                    KSerializer<Resource> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    int i3 = IAuthTabCallback + 25;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 66 / 0;
                    }
                    return kSerializerOnExtraCallbackWithResult;
                }
            }

            static {
                asInterface = 0;
                onNavigationEvent();
                Companion = new Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Resource$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() throws Throwable {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 109;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 != 0) {
                            return TransferResultPage.MessageCardInfo.Resource.onExtraCallback();
                        }
                        TransferResultPage.MessageCardInfo.Resource.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
                int i = asBinder + 31;
                asInterface = i % 128;
                if (i % 2 != 0) {
                    int i2 = 76 / 0;
                }
            }

            private Resource() {
            }

            public /* synthetic */ Resource(int i, okycx okycxVar) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            private static final /* synthetic */ KSerializer IAuthTabCallback() throws Throwable {
                int i = 2 % 2;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Resource.class);
                KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(Manual.class), Reflection.getOrCreateKotlinClass(NONE.class), Reflection.getOrCreateKotlinClass(Template.class)};
                KSerializer[] kSerializerArr = {TransferResultPage$MessageCardInfo$Manual$$serializer.INSTANCE, TransferResultPage$MessageCardInfo$NONE$$serializer.INSTANCE, TransferResultPage$MessageCardInfo$Template$$serializer.INSTANCE};
                Object[] objArr = new Object[1];
                a((short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (Color.green(0) - 86), (-820112167) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1612067172) - ImageFormat.getBitsPerPixel(0), (-68) - Color.green(0), objArr);
                kt ktVar = new kt("viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource", orCreateKotlinClass, kClassArr, kSerializerArr, new Annotation[]{new TransferResultPage$Redirect$$serializer.onNavigationEvent(((String) objArr[0]).intern())});
                int i2 = onTransact + 35;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return ktVar;
            }

            public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
                Lazy<KSerializer<Object>> lazy;
                int i = 2 % 2;
                int i2 = onTransact + 93;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                if (i2 % 2 == 0) {
                    lazy = $cachedSerializer$delegate;
                    int i4 = 72 / 0;
                } else {
                    lazy = $cachedSerializer$delegate;
                }
                int i5 = i3 + 21;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return lazy;
            }

            static void onNavigationEvent() {
                onNavigationEvent = -1801047249;
                onWarmupCompleted = -1538795456;
                onExtraCallback = -1001264673;
                IAuthTabCallback = new byte[]{87, 85, -89, 8};
            }
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MessageCardInfo> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$MessageCardInfo$$serializer transferResultPage$MessageCardInfo$$serializer = TransferResultPage$MessageCardInfo$$serializer.INSTANCE;
                if (i3 == 0) {
                    return transferResultPage$MessageCardInfo$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onExtraCallback + 19;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ MessageCardInfo(int r3, java.lang.String r4, java.lang.String r5, viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource r6, im.toss.features.transfer.message_card.library.model.TransferMessageCardColor r7, im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient r8, o.okycx r9) {
            /*
                r2 = this;
                r2.<init>()
                r9 = r3 & 1
                r0 = 0
                r1 = 2
                if (r9 != 0) goto Le
                r2.messageCardId = r0
                int r4 = r1 % r1
                goto L10
            Le:
                r2.messageCardId = r4
            L10:
                r4 = r3 & 2
                if (r4 != 0) goto L17
                r2.text = r0
                goto L19
            L17:
                r2.text = r5
            L19:
                r4 = r3 & 4
                if (r4 != 0) goto L2e
                r2.resource = r0
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onNavigationEvent
                int r4 = r4 + 107
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onWarmupCompleted = r5
                int r4 = r4 % r1
                if (r4 == 0) goto L2b
                goto L30
            L2b:
                int r4 = r1 % r1
                goto L30
            L2e:
                r2.resource = r6
            L30:
                r4 = r3 & 8
                if (r4 != 0) goto L39
                r2.strokeColor = r0
            L36:
                int r4 = r1 % r1
                goto L48
            L39:
                r2.strokeColor = r7
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onWarmupCompleted
                int r4 = r4 + 113
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onNavigationEvent = r5
                int r4 = r4 % r1
                if (r4 != 0) goto L36
                r4 = 4
                int r4 = r4 % r4
            L48:
                r3 = r3 & 16
                if (r3 != 0) goto L5e
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onWarmupCompleted
                int r3 = r3 + 79
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onNavigationEvent = r4
                int r3 = r3 % r1
                r2.gradient = r0
                if (r3 == 0) goto L5a
                return
            L5a:
                r0.hashCode()
                throw r0
            L5e:
                r2.gradient = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.<init>(int, java.lang.String, java.lang.String, viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Resource, im.toss.features.transfer.message_card.library.model.TransferMessageCardColor, im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient, o.okycx):void");
        }

        public MessageCardInfo(@Nullable String str, @Nullable String str2, @Nullable Resource resource, @Nullable TransferMessageCardColor transferMessageCardColor, @Nullable TransferMessageCardGradient transferMessageCardGradient) {
            this.messageCardId = str;
            this.text = str2;
            this.resource = resource;
            this.strokeColor = transferMessageCardColor;
            this.gradient = transferMessageCardGradient;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
          0x0025: PHI (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:10:0x0023, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
          0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
          (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
          (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
         binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onNavigationEvent
                int r1 = r1 + 85
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L19
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 != 0) goto L25
                goto L21
            L19:
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.$childSerializers
                boolean r4 = r7.onWarmupCompleted(r8, r2)
                if (r4 == r3) goto L25
            L21:
                java.lang.String r4 = r6.messageCardId
                if (r4 == 0) goto L2c
            L25:
                o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r6.messageCardId
                r7.onExtraCallbackWithResult(r8, r2, r4, r5)
            L2c:
                boolean r2 = r7.onWarmupCompleted(r8, r3)
                if (r2 != 0) goto L3f
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onWarmupCompleted
                int r2 = r2 + 49
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onNavigationEvent = r4
                int r2 = r2 % r0
                java.lang.String r2 = r6.text
                if (r2 == 0) goto L46
            L3f:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r6.text
                r7.onExtraCallbackWithResult(r8, r3, r2, r4)
            L46:
                boolean r2 = r7.onWarmupCompleted(r8, r0)
                if (r2 != 0) goto L50
                viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Resource r2 = r6.resource
                if (r2 == 0) goto L5d
            L50:
                r1 = r1[r0]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Resource r2 = r6.resource
                r7.onExtraCallbackWithResult(r8, r0, r1, r2)
            L5d:
                r0 = 3
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 != 0) goto L68
                im.toss.features.transfer.message_card.library.model.TransferMessageCardColor r1 = r6.strokeColor
                if (r1 == 0) goto L6f
            L68:
                im.toss.features.transfer.message_card.library.model.TransferMessageCardColor$$serializer r1 = im.toss.features.transfer.message_card.library.model.TransferMessageCardColor$.serializer.INSTANCE
                im.toss.features.transfer.message_card.library.model.TransferMessageCardColor r2 = r6.strokeColor
                r7.onExtraCallbackWithResult(r8, r0, r1, r2)
            L6f:
                r0 = 4
                boolean r1 = r7.onWarmupCompleted(r8, r0)
                if (r1 != 0) goto L7a
                im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient r1 = r6.gradient
                if (r1 == 0) goto L81
            L7a:
                im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient$$serializer r1 = im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient$.serializer.INSTANCE
                im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient r6 = r6.gradient
                r7.onExtraCallbackWithResult(r8, r0, r1, r6)
            L81:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public static final /* synthetic */ Lazy[] onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i2 + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return lazyArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ MessageCardInfo(String str, String str2, Resource resource, TransferMessageCardColor transferMessageCardColor, TransferMessageCardGradient transferMessageCardGradient, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str3;
            Resource resource2;
            TransferMessageCardGradient transferMessageCardGradient2 = null;
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i4 = onNavigationEvent + 85;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = 2 % 2;
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i & 4) != 0) {
                int i6 = onNavigationEvent + 29;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                resource2 = null;
            } else {
                resource2 = resource;
            }
            TransferMessageCardColor transferMessageCardColor2 = (i & 8) != 0 ? null : transferMessageCardColor;
            if ((i & 16) != 0) {
                int i7 = 2 % 2;
            } else {
                transferMessageCardGradient2 = transferMessageCardGradient;
            }
            this(str, str3, resource2, transferMessageCardColor2, transferMessageCardGradient2);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.messageCardId;
            int i5 = i2 + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return str;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.text;
            int i5 = i3 + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Resource onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Resource resource = this.resource;
            int i5 = i3 + 71;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return resource;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TransferMessageCardColor IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            TransferMessageCardColor transferMessageCardColor = this.strokeColor;
            int i5 = i3 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return transferMessageCardColor;
        }

        public final TransferMessageCardGradient onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            TransferMessageCardGradient transferMessageCardGradient = this.gradient;
            int i5 = i2 + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return transferMessageCardGradient;
        }

        @nc(IAuthTabCallback = "ICON")
        @liq
        public static final class Template extends Resource {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private final String logName;
            private final String url;

            static {
                int i = onNavigationEvent + 49;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 53 / 0;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Template() {
                String str = null;
                this(str, str, 3, (DefaultConstructorMarker) str);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 47;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof Template)) {
                    int i4 = onExtraCallbackWithResult + 43;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                Template template = (Template) obj;
                if (!Intrinsics.areEqual(this.url, template.url)) {
                    int i6 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.logName, template.logName)) {
                    return false;
                }
                int i8 = onExtraCallbackWithResult + 49;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (this.url.hashCode() * 31) + this.logName.hashCode();
                int i4 = onExtraCallback + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Template(url=" + this.url + ", logName=" + this.logName + ")";
                int i2 = onExtraCallbackWithResult + 97;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Template> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 7;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    TransferResultPage$MessageCardInfo$Template$$serializer transferResultPage$MessageCardInfo$Template$$serializer = TransferResultPage$MessageCardInfo$Template$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 71;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return transferResultPage$MessageCardInfo$Template$$serializer;
                }
            }

            public /* synthetic */ Template(int i, String str, String str2, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    str = "";
                    int i2 = onExtraCallbackWithResult + 77;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                }
                this.url = str;
                if ((i & 2) == 0) {
                    int i4 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    this.logName = "TEMPLATE";
                    return;
                }
                this.logName = str2;
                int i6 = onExtraCallback + 79;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Template(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.url = str;
                this.logName = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallbackWithResult
                    int r1 = r1 + 5
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallback = r2
                    int r1 = r1 % r0
                    r1 = 0
                    boolean r2 = r6.onWarmupCompleted(r7, r1)
                    if (r2 == 0) goto L14
                    goto L27
                L14:
                    int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallback
                    int r2 = r2 + 45
                    int r3 = r2 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallbackWithResult = r3
                    int r2 = r2 % r0
                    java.lang.String r2 = r5.url
                    java.lang.String r3 = ""
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
                    if (r2 != 0) goto L2c
                L27:
                    java.lang.String r2 = r5.url
                    r6.onExtraCallback(r7, r1, r2)
                L2c:
                    r2 = 1
                    boolean r3 = r6.onWarmupCompleted(r7, r2)
                    if (r3 == r2) goto L58
                    int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallback
                    int r3 = r3 + 105
                    int r4 = r3 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallbackWithResult = r4
                    int r3 = r3 % r0
                    java.lang.String r0 = "TEMPLATE"
                    if (r3 == 0) goto L4e
                    java.lang.String r3 = r5.onWarmupCompleted()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
                    r3 = 36
                    int r3 = r3 / r1
                    if (r0 != 0) goto L5f
                    goto L58
                L4e:
                    java.lang.String r1 = r5.onWarmupCompleted()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                    if (r0 != 0) goto L5f
                L58:
                    java.lang.String r5 = r5.onWarmupCompleted()
                    r6.onExtraCallback(r7, r2, r5)
                L5f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Template.onExtraCallbackWithResult(viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$Template, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Template(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback;
                    int i3 = i2 + 111;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i2 + 73;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i7 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    str2 = "TEMPLATE";
                }
                this(str, str2);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 39;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                String str = this.url;
                int i4 = i2 + 57;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.logName;
                int i5 = i3 + 121;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
                return str;
            }
        }

        @nc(IAuthTabCallback = "EMOJI")
        @liq
        public static final class Manual extends Resource {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            private final String emoji;
            private final String logName;

            static {
                int i = onWarmupCompleted + 119;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Manual() {
                String str = null;
                this(str, str, 3, (DefaultConstructorMarker) str);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (!(obj instanceof Manual)) {
                    return false;
                }
                Manual manual = (Manual) obj;
                if (Intrinsics.areEqual(this.emoji, manual.emoji)) {
                    return Intrinsics.areEqual(this.logName, manual.logName);
                }
                int i3 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.emoji.hashCode();
                return i3 == 0 ? (iHashCode % 65) >> this.logName.hashCode() : (iHashCode * 31) + this.logName.hashCode();
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Manual(emoji=" + this.emoji + ", logName=" + this.logName + ")";
                int i2 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final class Companion {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Manual> serializer() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 115;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    TransferResultPage$MessageCardInfo$Manual$$serializer transferResultPage$MessageCardInfo$Manual$$serializer = TransferResultPage$MessageCardInfo$Manual$$serializer.INSTANCE;
                    int i4 = onExtraCallback + 71;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return transferResultPage$MessageCardInfo$Manual$$serializer;
                }
            }

            public /* synthetic */ Manual(int i, String str, String str2, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) == 0) {
                    str = "";
                    int i2 = 2 % 2;
                }
                this.emoji = str;
                if ((i & 2) == 0) {
                    int i3 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    this.logName = "CUSTOM";
                    return;
                }
                this.logName = str2;
                int i5 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Manual(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.emoji = str;
                this.logName = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void IAuthTabCallback(Manual manual, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(manual.emoji, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 0, manual.emoji);
                }
                if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i4 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.areEqual(manual.onWarmupCompleted(), "CUSTOM");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!Intrinsics.areEqual(manual.onWarmupCompleted(), "CUSTOM"))) {
                        return;
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 1, manual.onWarmupCompleted());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Manual(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 83;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    str = "";
                }
                if ((i & 2) != 0) {
                    int i3 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                    str2 = "CUSTOM";
                }
                this(str, str2);
            }

            public final String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.emoji;
                }
                throw null;
            }

            @Override // viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.logName;
                int i5 = i3 + 81;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @nc(IAuthTabCallback = "NONE")
        @liq
        public static final class NONE extends Resource {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            private final String logName;

            static {
                int i = onNavigationEvent + 101;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public NONE() {
                String str = null;
                this(str, 1, (DefaultConstructorMarker) str);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 89;
                    onWarmupCompleted = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!(obj instanceof NONE)) {
                    int i3 = onWarmupCompleted + 101;
                    IAuthTabCallback = i3 % 128;
                    return i3 % 2 == 0;
                }
                if (!(!Intrinsics.areEqual(this.logName, ((NONE) obj).logName))) {
                    return true;
                }
                int i4 = onWarmupCompleted + 35;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.logName.hashCode();
                int i4 = onWarmupCompleted + 93;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "NONE(logName=" + this.logName + ")";
                int i2 = IAuthTabCallback + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<NONE> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 117;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    TransferResultPage$MessageCardInfo$NONE$$serializer transferResultPage$MessageCardInfo$NONE$$serializer = TransferResultPage$MessageCardInfo$NONE$$serializer.INSTANCE;
                    int i4 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return transferResultPage$MessageCardInfo$NONE$$serializer;
                    }
                    throw null;
                }
            }

            public /* synthetic */ NONE(int i, String str, okycx okycxVar) {
                super(i, okycxVar);
                if ((i & 1) != 0) {
                    this.logName = str;
                    int i2 = onWarmupCompleted + 61;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 77 / 0;
                        return;
                    }
                    return;
                }
                this.logName = "NONE";
                int i4 = IAuthTabCallback + 113;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NONE(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.logName = str;
            }

            @JvmStatic
            public static final /* synthetic */ void onWarmupCompleted(NONE none, vyl vylVar, SerialDescriptor serialDescriptor) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0 ? !vylVar.onWarmupCompleted(serialDescriptor, 0) : !vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                    int i3 = onWarmupCompleted + 33;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        Intrinsics.areEqual(none.onWarmupCompleted(), "NONE");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (Intrinsics.areEqual(none.onWarmupCompleted(), "NONE")) {
                        return;
                    }
                }
                vylVar.onExtraCallback(serialDescriptor, 0, none.onWarmupCompleted());
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ NONE(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 85;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i2 + 11;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                    str = "NONE";
                }
                this(str);
            }

            @Override // viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo.Resource
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                String str = this.logName;
                int i5 = i3 + 63;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class HapticType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HapticType[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final HapticType ERROR;
        private static int IAuthTabCallback;
        private static int IAuthTabCallbackStub;
        public static final HapticType SUCCESS;
        public static final HapticType WIGGLE;
        private static short[] onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static byte[] onNavigationEvent;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {62, 54, 60, 44};
        private static final int $$b = 118;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, short r8) {
            /*
                byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage.HapticType.$$a
                int r7 = r7 * 4
                int r7 = r7 + 115
                int r8 = r8 * 2
                int r1 = r8 + 1
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                int r6 = r6 + 1
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.HapticType.$$c(short, int, short):java.lang.String");
        }

        public static /* synthetic */ KSerializer $r8$lambda$7x2khgKUzYz2Iqmnpa_WgYzto6Q() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 47;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = IAuthTabCallbackDefault + 21;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ HapticType[] $values() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 97;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            HapticType[] hapticTypeArr = {SUCCESS, ERROR, WIGGLE};
            int i5 = i2 + 81;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
            }
            return hapticTypeArr;
        }

        public static EnumEntries<HapticType> getEntries() {
            int i = 2 % 2;
            int i2 = onTransact + 39;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static HapticType valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 91;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            HapticType hapticType = (HapticType) Enum.valueOf(HapticType.class, str);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            return hapticType;
        }

        public static HapticType[] values() {
            int i = 2 % 2;
            int i2 = onTransact + 59;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            HapticType[] hapticTypeArr = $VALUES;
            if (i3 == 0) {
                return (HapticType[]) hapticTypeArr.clone();
            }
            int i4 = 7 / 0;
            return (HapticType[]) hapticTypeArr.clone();
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43424), 42 - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i6 = -1;
                if (iIntValue == -1) {
                    int i7 = $11 + 99;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                long j = 0;
                if (i4 != 0) {
                    int i9 = $10 + 59;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr = onNavigationEvent;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = 0;
                        while (i11 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = (byte) (b2 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter("", 0)), ExpandableListView.getPackedPositionType(j) + 55, 2167 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i6 = -1;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i4;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 85 - TextUtils.lastIndexOf("", '0'), 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onNavigationEvent;
                    if (bArr4 != null) {
                        int i12 = $10 + 63;
                        int i13 = i12 % 128;
                        $11 = i13;
                        int i14 = i12 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i15 = i13 + 107;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 5 % 2;
                        }
                        for (int i17 = 0; i17 < length2; i17++) {
                            int i18 = $11 + 9;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                            bArr5[i17] = (byte) (bArr4[i17] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public static final class Companion {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) HapticType.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onWarmupCompleted + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializer;
            }

            public final KSerializer<HapticType> serializer() {
                KSerializer<HapticType> kSerializerOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnWarmupCompleted = onWarmupCompleted();
                    int i3 = 94 / 0;
                } else {
                    kSerializerOnWarmupCompleted = onWarmupCompleted();
                }
                int i4 = onNavigationEvent + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }

        private HapticType(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onTransact + 57;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.HapticType", values());
            int i4 = IAuthTabCallbackDefault + 61;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 7;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            int i5 = i2 + 85;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return lazy;
        }

        static {
            IAuthTabCallbackStub = 0;
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) ((-123) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 916590493 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 945310112, (-36) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            SUCCESS = new HapticType(((String) objArr[0]).intern(), 0);
            ERROR = new HapticType("ERROR", 1);
            WIGGLE = new HapticType("WIGGLE", 2);
            HapticType[] hapticTypeArr$values = $values();
            $VALUES = hapticTypeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(hapticTypeArr$values);
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$HapticType$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        TransferResultPage.HapticType.$r8$lambda$7x2khgKUzYz2Iqmnpa_WgYzto6Q();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer kSerializer$r8$lambda$7x2khgKUzYz2Iqmnpa_WgYzto6Q = TransferResultPage.HapticType.$r8$lambda$7x2khgKUzYz2Iqmnpa_WgYzto6Q();
                    int i3 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializer$r8$lambda$7x2khgKUzYz2Iqmnpa_WgYzto6Q;
                }
            });
            int i = asBinder + 69;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        static void onNavigationEvent() {
            onExtraCallbackWithResult = 1830430828;
            onWarmupCompleted = -1538795477;
            IAuthTabCallback = 1675652795;
            onNavigationEvent = new byte[]{-20, -115, -125, -113, -115, 99, -113};
        }
    }

    @liq
    public static final class PointToast {
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final long addedPoint;
        private final long currentPoint;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 89;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public PointToast() {
            this(0L, 0L, 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof PointToast)) {
                int i4 = onExtraCallbackWithResult + 95;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            PointToast pointToast = (PointToast) obj;
            if (this.currentPoint != pointToast.currentPoint) {
                int i6 = onExtraCallbackWithResult + 33;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.addedPoint == pointToast.addedPoint) {
                return true;
            }
            int i8 = onExtraCallback + 113;
            int i9 = i8 % 128;
            onExtraCallbackWithResult = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 39;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Long.hashCode(this.currentPoint) * 31) + Long.hashCode(this.addedPoint);
            int i4 = onExtraCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PointToast(currentPoint=" + this.currentPoint + ", addedPoint=" + this.addedPoint + ")";
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PointToast> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$PointToast$$serializer transferResultPage$PointToast$$serializer = TransferResultPage$PointToast$$serializer.INSTANCE;
                if (i3 != 0) {
                    return transferResultPage$PointToast$$serializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ PointToast(int i, long j, long j2, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.currentPoint = 0L;
            } else {
                this.currentPoint = j;
            }
            Object obj = null;
            if ((i & 2) != 0) {
                this.addedPoint = j2;
                int i2 = onExtraCallbackWithResult + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = onExtraCallback;
            int i4 = i3 + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.addedPoint = 0L;
            int i6 = i3 + 19;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public PointToast(long j, long j2) {
            this.currentPoint = j;
            this.addedPoint = j2;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(PointToast pointToast, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0) || pointToast.currentPoint != 0) {
                vylVar.onExtraCallback(serialDescriptor, 0, pointToast.currentPoint);
                int i2 = onExtraCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 4;
                }
            }
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i4 = onExtraCallbackWithResult + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                long j = pointToast.addedPoint;
                if (i5 == 0) {
                    if (j == 0) {
                        return;
                    }
                } else if (j == 0) {
                    return;
                }
            }
            vylVar.onExtraCallback(serialDescriptor, 1, pointToast.addedPoint);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PointToast(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 19;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                j = 0;
            }
            if ((i & 2) != 0) {
                int i4 = onExtraCallbackWithResult + 79;
                int i5 = i4 % 128;
                onExtraCallback = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 25;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                j2 = 0;
            }
            this(j, j2);
        }

        public final long onExtraCallback() {
            long j;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                j = this.currentPoint;
                int i4 = 9 / 0;
            } else {
                j = this.currentPoint;
            }
            int i5 = i2 + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            long j = this.addedPoint;
            int i5 = i2 + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }
    }

    @liq
    public static final class BottomCTALayout {
        public static final int $stable = 8;
        public static final Companion Companion;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final ButtonLayout bottomAccessory;
        private final String bottomDescription;
        private final ButtonLayout primaryButton;
        private final ButtonLayout secondaryButton;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public BottomCTALayout() {
            this((ButtonLayout) null, (ButtonLayout) null, (ButtonLayout) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 69;
            viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.primaryButton, r6.primaryButton) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.secondaryButton, r6.secondaryButton) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.bottomAccessory, r6.bottomAccessory) != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            r6 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted + 73;
            viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            if ((r6 % 2) == 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.bottomDescription, r6.bottomDescription) == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        
            r6 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback + 91;
            viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback
                int r1 = r1 + 115
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted = r2
                int r1 = r1 % r0
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L16
                r1 = 34
                int r1 = r1 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r1 = r6 instanceof viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout
                if (r1 != 0) goto L25
                int r2 = r2 + 69
                int r6 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r6
                int r2 = r2 % r0
                return r4
            L25:
                viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout r6 = (viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout) r6
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r1 = r5.primaryButton
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r6.primaryButton
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L32
                return r4
            L32:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r1 = r5.secondaryButton
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r6.secondaryButton
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L3d
                return r4
            L3d:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r1 = r5.bottomAccessory
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r6.bottomAccessory
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L55
                int r6 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted
                int r6 = r6 + 73
                int r1 = r6 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r1
                int r6 = r6 % r0
                if (r6 == 0) goto L53
                goto L54
            L53:
                r3 = r4
            L54:
                return r3
            L55:
                java.lang.String r1 = r5.bottomDescription
                java.lang.String r6 = r6.bottomDescription
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 == 0) goto L60
                return r3
            L60:
                int r6 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback
                int r6 = r6 + 91
                int r1 = r6 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted = r1
                int r6 = r6 % r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ButtonLayout buttonLayout = this.primaryButton;
            int iHashCode3 = buttonLayout == null ? 0 : buttonLayout.hashCode();
            ButtonLayout buttonLayout2 = this.secondaryButton;
            if (buttonLayout2 == null) {
                int i4 = onWarmupCompleted + 45;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = buttonLayout2.hashCode();
            }
            ButtonLayout buttonLayout3 = this.bottomAccessory;
            if (buttonLayout3 == null) {
                int i6 = onWarmupCompleted + 123;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = buttonLayout3.hashCode();
            }
            String str = this.bottomDescription;
            return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BottomCTALayout(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", bottomAccessory=" + this.bottomAccessory + ", bottomDescription=" + this.bottomDescription + ")";
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BottomCTALayout> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    TransferResultPage$BottomCTALayout$$serializer transferResultPage$BottomCTALayout$$serializer = TransferResultPage$BottomCTALayout$$serializer.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                TransferResultPage$BottomCTALayout$$serializer transferResultPage$BottomCTALayout$$serializer2 = TransferResultPage$BottomCTALayout$$serializer.INSTANCE;
                int i3 = onExtraCallback + 101;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return transferResultPage$BottomCTALayout$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        public /* synthetic */ BottomCTALayout(int i, ButtonLayout buttonLayout, ButtonLayout buttonLayout2, ButtonLayout buttonLayout3, String str, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.primaryButton = null;
            } else {
                this.primaryButton = buttonLayout;
            }
            if ((i & 2) == 0) {
                this.secondaryButton = null;
                int i2 = onExtraCallback + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.secondaryButton = buttonLayout2;
            }
            if ((i & 4) == 0) {
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                this.bottomAccessory = null;
            } else {
                this.bottomAccessory = buttonLayout3;
                int i6 = 2 % 2;
            }
            if ((i & 8) != 0) {
                this.bottomDescription = str;
                int i7 = onWarmupCompleted + 105;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            this.bottomDescription = null;
            int i9 = onExtraCallback + 63;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 6 / 0;
            }
        }

        public BottomCTALayout(@Nullable ButtonLayout buttonLayout, @Nullable ButtonLayout buttonLayout2, @Nullable ButtonLayout buttonLayout3, @Nullable String str) {
            this.primaryButton = buttonLayout;
            this.secondaryButton = buttonLayout2;
            this.bottomAccessory = buttonLayout3;
            this.bottomDescription = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                r3 = 0
                if (r2 != 0) goto L21
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback
                int r2 = r2 + 25
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted = r4
                int r2 = r2 % r0
                if (r2 == 0) goto L1b
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r5.primaryButton
                if (r2 == 0) goto L31
                goto L21
            L1b:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r5 = r5.primaryButton
                r3.hashCode()
                throw r3
            L21:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r4 = r5.primaryButton
                r6.onExtraCallbackWithResult(r7, r1, r2, r4)
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback
                int r1 = r1 + 39
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted = r2
                int r1 = r1 % r0
            L31:
                r1 = 1
                boolean r2 = r6.onWarmupCompleted(r7, r1)
                r2 = r2 ^ r1
                if (r2 == r1) goto L3a
                goto L3e
            L3a:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r5.secondaryButton
                if (r2 == 0) goto L45
            L3e:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r4 = r5.secondaryButton
                r6.onExtraCallbackWithResult(r7, r1, r2, r4)
            L45:
                boolean r2 = r6.onWarmupCompleted(r7, r0)
                if (r2 != 0) goto L61
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted
                int r2 = r2 + 9
                int r4 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r4
                int r2 = r2 % r0
                if (r2 != 0) goto L5b
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r5.bottomAccessory
                if (r2 == 0) goto L68
                goto L61
            L5b:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r5 = r5.bottomAccessory
                r3.hashCode()
                throw r3
            L61:
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer r2 = viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r3 = r5.bottomAccessory
                r6.onExtraCallbackWithResult(r7, r0, r2, r3)
            L68:
                r2 = 3
                boolean r3 = r6.onWarmupCompleted(r7, r2)
                if (r3 == r1) goto L7c
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted
                int r1 = r1 + 73
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onExtraCallback = r3
                int r1 = r1 % r0
                java.lang.String r0 = r5.bottomDescription
                if (r0 == 0) goto L83
            L7c:
                o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.bottomDescription
                r6.onExtraCallbackWithResult(r7, r2, r0, r5)
            L83:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.BottomCTALayout.onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BottomCTALayout(ButtonLayout buttonLayout, ButtonLayout buttonLayout2, ButtonLayout buttonLayout3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted + 97;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i3 = 2 % 2;
                buttonLayout = null;
            }
            if ((i & 2) != 0) {
                int i4 = 2 % 2;
                buttonLayout2 = null;
            }
            if ((i & 4) != 0) {
                int i5 = onWarmupCompleted + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                buttonLayout3 = null;
            }
            if ((i & 8) != 0) {
                int i6 = onWarmupCompleted + 39;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                str = null;
            }
            this(buttonLayout, buttonLayout2, buttonLayout3, str);
        }

        public final ButtonLayout onWarmupCompleted() {
            ButtonLayout buttonLayout;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 109;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                buttonLayout = this.primaryButton;
                int i4 = 59 / 0;
            } else {
                buttonLayout = this.primaryButton;
            }
            int i5 = i2 + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return buttonLayout;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ButtonLayout onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ButtonLayout buttonLayout = this.secondaryButton;
            int i5 = i2 + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return buttonLayout;
        }

        public final ButtonLayout onExtraCallbackWithResult() {
            ButtonLayout buttonLayout;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                buttonLayout = this.bottomAccessory;
                int i4 = 42 / 0;
            } else {
                buttonLayout = this.bottomAccessory;
            }
            int i5 = i3 + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return buttonLayout;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.bottomDescription;
            int i4 = i2 + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    @liq
    public static final class ButtonLayout {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final ActionType actionType;
        private final AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo;
        private final BridgeModel.Page bridgePageInfo;
        private final InventoryAdDto.Dynamic dynamicIntelligencePageInfo;
        private final String nextScheme;
        private final String phoneNumber;
        private final String scheme;
        private final String shareMessage;
        private final BridgeModel.StandardTerms standardTermsBridgePageInfo;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = TransferResultPage.ButtonLayout.onWarmupCompleted();
                if (i3 != 0) {
                    int i4 = 81 / 0;
                }
                return kSerializerOnWarmupCompleted;
            }
        }), null, null, null, null, null, null};

        private static final /* synthetic */ KSerializer access000() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<ActionType> kSerializerSerializer = ActionType.Companion.serializer();
            int i4 = IAuthTabCallback + 21;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerAccess000 = access000();
            int i3 = IAuthTabCallback + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerAccess000;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof ButtonLayout)) {
                return false;
            }
            ButtonLayout buttonLayout = (ButtonLayout) obj;
            if (!Intrinsics.areEqual(this.title, buttonLayout.title)) {
                int i4 = IAuthTabCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.scheme, buttonLayout.scheme)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.nextScheme, buttonLayout.nextScheme)) {
                int i6 = onNavigationEvent + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.actionType != buttonLayout.actionType) {
                int i8 = onNavigationEvent + 3;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.shareMessage, buttonLayout.shareMessage)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.bridgePageInfo, buttonLayout.bridgePageInfo)) {
                int i10 = IAuthTabCallback + 5;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.standardTermsBridgePageInfo, buttonLayout.standardTermsBridgePageInfo)) {
                int i12 = onNavigationEvent + 17;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.phoneNumber, buttonLayout.phoneNumber)) {
                int i14 = IAuthTabCallback + 9;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 58 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.animatedBoostingBridgePageInfo, buttonLayout.animatedBoostingBridgePageInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.dynamicIntelligencePageInfo, buttonLayout.dynamicIntelligencePageInfo)) {
                return true;
            }
            int i16 = onNavigationEvent + 49;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int i = 2 % 2;
            int iHashCode5 = this.title.hashCode();
            String str = this.scheme;
            int iHashCode6 = 0;
            if (str == null) {
                int i2 = IAuthTabCallback + 41;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 4;
                }
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.nextScheme;
            if (str2 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
                int i4 = IAuthTabCallback + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            ActionType actionType = this.actionType;
            int iHashCode7 = actionType == null ? 0 : actionType.hashCode();
            String str3 = this.shareMessage;
            int iHashCode8 = str3 == null ? 0 : str3.hashCode();
            BridgeModel.Page page = this.bridgePageInfo;
            if (page == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = page.hashCode();
                int i6 = onNavigationEvent + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            BridgeModel.StandardTerms standardTerms = this.standardTermsBridgePageInfo;
            int iHashCode9 = standardTerms == null ? 0 : standardTerms.hashCode();
            String str4 = this.phoneNumber;
            int iHashCode10 = str4 == null ? 0 : str4.hashCode();
            AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo = this.animatedBoostingBridgePageInfo;
            if (animatedBoostingBridgePageInfo == null) {
                int i8 = IAuthTabCallback + 121;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = animatedBoostingBridgePageInfo.hashCode();
            }
            InventoryAdDto.Dynamic dynamic = this.dynamicIntelligencePageInfo;
            if (dynamic != null) {
                int i10 = IAuthTabCallback + 85;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    dynamic.hashCode();
                    throw null;
                }
                iHashCode6 = dynamic.hashCode();
            }
            return (((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + iHashCode6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ButtonLayout(title=" + this.title + ", scheme=" + this.scheme + ", nextScheme=" + this.nextScheme + ", actionType=" + this.actionType + ", shareMessage=" + this.shareMessage + ", bridgePageInfo=" + this.bridgePageInfo + ", standardTermsBridgePageInfo=" + this.standardTermsBridgePageInfo + ", phoneNumber=" + this.phoneNumber + ", animatedBoostingBridgePageInfo=" + this.animatedBoostingBridgePageInfo + ", dynamicIntelligencePageInfo=" + this.dynamicIntelligencePageInfo + ")";
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ButtonLayout> serializer() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$ButtonLayout$$serializer transferResultPage$ButtonLayout$$serializer = TransferResultPage$ButtonLayout$$serializer.INSTANCE;
                if (i3 != 0) {
                    int i4 = 27 / 0;
                }
                return transferResultPage$ButtonLayout$$serializer;
            }
        }

        static {
            int i = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ ButtonLayout(int i, String str, String str2, String str3, ActionType actionType, String str4, BridgeModel.Page page, BridgeModel.StandardTerms standardTerms, String str5, AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo, InventoryAdDto.Dynamic dynamic, okycx okycxVar) {
            if (1 != (i & 1)) {
                int i2 = onNavigationEvent + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 1, TransferResultPage$ButtonLayout$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i & 2) == 0) {
                this.scheme = null;
            } else {
                this.scheme = str2;
            }
            if ((i & 4) == 0) {
                this.nextScheme = null;
            } else {
                this.nextScheme = str3;
            }
            if ((i & 8) == 0) {
                int i4 = IAuthTabCallback + 39;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                this.actionType = null;
            } else {
                this.actionType = actionType;
                int i6 = 2 % 2;
            }
            if ((i & 16) == 0) {
                int i7 = IAuthTabCallback + 45;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                this.shareMessage = null;
            } else {
                this.shareMessage = str4;
            }
            if ((i & 32) == 0) {
                this.bridgePageInfo = null;
            } else {
                this.bridgePageInfo = page;
                int i9 = IAuthTabCallback + 21;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            if ((i & 64) == 0) {
                this.standardTermsBridgePageInfo = null;
                int i12 = 2 % 2;
            } else {
                this.standardTermsBridgePageInfo = standardTerms;
            }
            if ((i & 128) == 0) {
                this.phoneNumber = null;
            } else {
                this.phoneNumber = str5;
            }
            if ((i & 256) == 0) {
                this.animatedBoostingBridgePageInfo = null;
            } else {
                this.animatedBoostingBridgePageInfo = animatedBoostingBridgePageInfo;
                int i13 = 2 % 2;
            }
            if ((i & 512) != 0) {
                this.dynamicIntelligencePageInfo = dynamic;
                return;
            }
            int i14 = IAuthTabCallback + 57;
            int i15 = i14 % 128;
            onNavigationEvent = i15;
            int i16 = i14 % 2;
            this.dynamicIntelligencePageInfo = null;
            int i17 = i15 + 47;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
        }

        public ButtonLayout(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable ActionType actionType, @Nullable String str4, @Nullable BridgeModel.Page page, @Nullable BridgeModel.StandardTerms standardTerms, @Nullable String str5, @Nullable AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo, @Nullable InventoryAdDto.Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            this.scheme = str2;
            this.nextScheme = str3;
            this.actionType = actionType;
            this.shareMessage = str4;
            this.bridgePageInfo = page;
            this.standardTermsBridgePageInfo = standardTerms;
            this.phoneNumber = str5;
            this.animatedBoostingBridgePageInfo = animatedBoostingBridgePageInfo;
            this.dynamicIntelligencePageInfo = dynamic;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ButtonLayout(String str, String str2, String str3, ActionType actionType, String str4, BridgeModel.Page page, BridgeModel.StandardTerms standardTerms, String str5, AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo, InventoryAdDto.Dynamic dynamic, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            ActionType actionType2;
            BridgeModel.Page page2;
            BridgeModel.StandardTerms standardTerms2;
            AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo2;
            InventoryAdDto.Dynamic dynamic2 = null;
            if ((i & 2) != 0) {
                int i2 = 2 % 2;
                str6 = null;
            } else {
                str6 = str2;
            }
            String str7 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i3 = onNavigationEvent + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                actionType2 = null;
            } else {
                actionType2 = actionType;
            }
            String str8 = (i & 16) != 0 ? null : str4;
            if ((i & 32) != 0) {
                int i6 = IAuthTabCallback + 1;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                int i7 = 2 % 2;
                page2 = null;
            } else {
                page2 = page;
            }
            if ((i & 64) != 0) {
                int i8 = onNavigationEvent + 21;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    dynamic2.hashCode();
                    throw null;
                }
                standardTerms2 = null;
            } else {
                standardTerms2 = standardTerms;
            }
            String str9 = (i & 128) != 0 ? null : str5;
            if ((i & 256) != 0) {
                int i9 = IAuthTabCallback + 103;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
                animatedBoostingBridgePageInfo2 = null;
            } else {
                animatedBoostingBridgePageInfo2 = animatedBoostingBridgePageInfo;
            }
            if ((i & 512) != 0) {
                int i12 = IAuthTabCallback + 119;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 2 % 2;
                }
            } else {
                dynamic2 = dynamic;
            }
            this(str, str6, str7, actionType2, str8, page2, standardTerms2, str9, animatedBoostingBridgePageInfo2, dynamic2);
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            ButtonLayout buttonLayout = (ButtonLayout) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = buttonLayout.title;
            if (i3 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.scheme;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.nextScheme;
            int i4 = i3 + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final ActionType onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            ActionType actionType = this.actionType;
            int i5 = i3 + 85;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return actionType;
        }

        public final String onTransact() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                str = this.shareMessage;
                int i4 = 85 / 0;
            } else {
                str = this.shareMessage;
            }
            int i5 = i3 + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return str;
        }

        public final BridgeModel.Page onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            BridgeModel.Page page = this.bridgePageInfo;
            int i4 = i2 + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return page;
        }

        public final BridgeModel.StandardTerms asInterface() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BridgeModel.StandardTerms standardTerms = this.standardTermsBridgePageInfo;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return standardTerms;
        }

        public final String asBinder() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 17;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.phoneNumber;
                int i4 = 43 / 0;
            } else {
                str = this.phoneNumber;
            }
            int i5 = i2 + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return str;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class ActionType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Companion Companion;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final ActionType REDIRECT = new ActionType("REDIRECT", 0);
            public static final ActionType CLOSE = new ActionType("CLOSE", 1);
            public static final ActionType CLOSE_APP = new ActionType("CLOSE_APP", 2);
            public static final ActionType SHARE = new ActionType("SHARE", 3);
            public static final ActionType INTRODUCE_SCHEDULED_TRANSFER = new ActionType("INTRODUCE_SCHEDULED_TRANSFER", 4);
            public static final ActionType INTRODUCE_SCHEDULED_TRANSFER_WITH_HOLDER_NAME = new ActionType("INTRODUCE_SCHEDULED_TRANSFER_WITH_HOLDER_NAME", 5);
            public static final ActionType CONFIRM_DUPLICATED_TRANSFER_AND_RERUN = new ActionType("CONFIRM_DUPLICATED_TRANSFER_AND_RERUN", 6);
            public static final ActionType ENTER_RECEIVER_REAL_NAME_AND_RERUN = new ActionType("ENTER_RECEIVER_REAL_NAME_AND_RERUN", 7);
            public static final ActionType CHANGE_WITHDRAWAL_ACCOUNT = new ActionType("CHANGE_WITHDRAWAL_ACCOUNT", 8);
            public static final ActionType REDIRECT_BRIDGE = new ActionType("REDIRECT_BRIDGE", 9);
            public static final ActionType PHONE_CALL = new ActionType("PHONE_CALL", 10);
            public static final ActionType STANDARD_TERMS_BRIDGE = new ActionType("STANDARD_TERMS_BRIDGE", 11);
            public static final ActionType ADS_SDK_FULL_PAGE = new ActionType("ADS_SDK_FULL_PAGE", 12);
            public static final ActionType DYNAMIC_INTELLIGENCE = new ActionType("DYNAMIC_INTELLIGENCE", 13);

            public static /* synthetic */ KSerializer $r8$lambda$GHIS_uWnmKOUQEjq_iu2EsA0hmk() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    _init_$_anonymous_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
                int i3 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializer_init_$_anonymous_;
            }

            private static final /* synthetic */ ActionType[] $values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                ActionType[] actionTypeArr = {REDIRECT, CLOSE, CLOSE_APP, SHARE, INTRODUCE_SCHEDULED_TRANSFER, INTRODUCE_SCHEDULED_TRANSFER_WITH_HOLDER_NAME, CONFIRM_DUPLICATED_TRANSFER_AND_RERUN, ENTER_RECEIVER_REAL_NAME_AND_RERUN, CHANGE_WITHDRAWAL_ACCOUNT, REDIRECT_BRIDGE, PHONE_CALL, STANDARD_TERMS_BRIDGE, ADS_SDK_FULL_PAGE, DYNAMIC_INTELLIGENCE};
                int i5 = i2 + 111;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return actionTypeArr;
                }
                throw null;
            }

            public static EnumEntries<ActionType> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                EnumEntries<ActionType> enumEntries = $ENTRIES;
                int i5 = i2 + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return enumEntries;
            }

            public static ActionType valueOf(String str) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ActionType actionType = (ActionType) Enum.valueOf(ActionType.class, str);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onExtraCallbackWithResult + 3;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return actionType;
            }

            public static ActionType[] values() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                ActionType[] actionTypeArr = (ActionType[]) $VALUES.clone();
                int i4 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return actionTypeArr;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 55;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer = (KSerializer) ActionType.access$get$cachedSerializer$delegate$cp().getValue();
                    if (i3 == 0) {
                        return kSerializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final KSerializer<ActionType> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 77;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    KSerializer<ActionType> kSerializerOnWarmupCompleted = onWarmupCompleted();
                    int i3 = IAuthTabCallback + 125;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializerOnWarmupCompleted;
                }
            }

            private ActionType(String str, int i) {
            }

            private static final /* synthetic */ KSerializer _init_$_anonymous_() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout.ActionType", values());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout.ActionType", values());
                int i3 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 21 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }

            public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
                int i5 = i3 + 77;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return lazy;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                ActionType[] actionTypeArr$values = $values();
                $VALUES = actionTypeArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(actionTypeArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout$ActionType$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 115;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            return TransferResultPage.ButtonLayout.ActionType.$r8$lambda$GHIS_uWnmKOUQEjq_iu2EsA0hmk();
                        }
                        TransferResultPage.ButtonLayout.ActionType.$r8$lambda$GHIS_uWnmKOUQEjq_iu2EsA0hmk();
                        throw null;
                    }
                });
                int i = onExtraCallback + 103;
                onNavigationEvent = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public final InventoryAdDto.Dynamic IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            InventoryAdDto.Dynamic dynamic = this.dynamicIntelligencePageInfo;
            int i5 = i2 + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return dynamic;
        }

        public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i2;
            int i8 = ~i5;
            int i9 = (~(i7 | i8)) | (~(i8 | i));
            int i10 = ~((~i) | i2 | i5);
            int i11 = i9 | i10;
            int i12 = (~(i | i8 | i2)) | i10;
            int i13 = i2 | i5;
            int i14 = i2 + i5 + i4 + ((-1865910757) * i6) + ((-1665280692) * i3);
            int i15 = i14 * i14;
            int i16 = ((i2 * (-906343980)) - 215482368) + ((-906343980) * i5) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i4) + ((-1540882432) * i6) + ((-912261120) * i3) + (1566179328 * i15);
            int i17 = (i2 * (-52584228)) + 761582770 + (i5 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i4 * (-52583813)) + (i6 * (-195242759)) + (i3 * 1657508740) + (i15 * (-834797568));
            if (i16 + (i17 * i17 * 1251344384) == 1) {
                return onNavigationEvent(objArr);
            }
            int i18 = 2 % 2;
            int i19 = onNavigationEvent + 1;
            int i20 = i19 % 128;
            IAuthTabCallback = i20;
            int i21 = i19 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i22 = i20 + 67;
            onNavigationEvent = i22 % 128;
            int i23 = i22 % 2;
            return lazyArr;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (Lazy[]) onExtraCallback(iOnWarmupCompleted, 146833430, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[0], iOnWarmupCompleted2, -146833430, iOnWarmupCompleted3);
        }

        public final String IAuthTabCallback_Parcel() {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (String) onExtraCallback(iOnWarmupCompleted, -1301264508, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, 1301264509, iOnWarmupCompleted3);
        }
    }

    @liq
    public static final class AnimatedBoostingBridgePageInfo {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final BottomCTALayout bottomCTALayout;
        private final String fullScreenMessage;
        private final String message;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        static {
            int i = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimatedBoostingBridgePageInfo)) {
                return false;
            }
            AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo = (AnimatedBoostingBridgePageInfo) obj;
            if (!Intrinsics.areEqual(this.fullScreenMessage, animatedBoostingBridgePageInfo.fullScreenMessage)) {
                int i2 = onWarmupCompleted + 117;
                onNavigationEvent = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.title, animatedBoostingBridgePageInfo.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.message, animatedBoostingBridgePageInfo.message)) {
                return Intrinsics.areEqual(this.bottomCTALayout, animatedBoostingBridgePageInfo.bottomCTALayout);
            }
            int i3 = onWarmupCompleted + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.fullScreenMessage.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.bottomCTALayout.hashCode();
            int i4 = onWarmupCompleted + 23;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AnimatedBoostingBridgePageInfo(fullScreenMessage=" + this.fullScreenMessage + ", title=" + this.title + ", message=" + this.message + ", bottomCTALayout=" + this.bottomCTALayout + ")";
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AnimatedBoostingBridgePageInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer transferResultPage$AnimatedBoostingBridgePageInfo$$serializer = TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$AnimatedBoostingBridgePageInfo$$serializer;
            }
        }

        public /* synthetic */ AnimatedBoostingBridgePageInfo(int i, String str, String str2, String str3, BottomCTALayout bottomCTALayout, okycx okycxVar) {
            SerialDescriptor descriptor;
            int i2 = 15;
            if (15 != (i & 15)) {
                int i3 = onNavigationEvent + 103;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    descriptor = TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE.getDescriptor();
                    i2 = 24;
                } else {
                    descriptor = TransferResultPage$AnimatedBoostingBridgePageInfo$$serializer.INSTANCE.getDescriptor();
                }
                htf31.onExtraCallbackWithResult(i, i2, descriptor);
                int i4 = onNavigationEvent + 77;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this.fullScreenMessage = str;
            this.title = str2;
            this.message = str3;
            this.bottomCTALayout = bottomCTALayout;
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallbackWithResult(AnimatedBoostingBridgePageInfo animatedBoostingBridgePageInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, animatedBoostingBridgePageInfo.fullScreenMessage);
            vylVar.onExtraCallback(serialDescriptor, 1, animatedBoostingBridgePageInfo.title);
            vylVar.onExtraCallback(serialDescriptor, 2, animatedBoostingBridgePageInfo.message);
            vylVar.onNavigationEvent(serialDescriptor, 3, TransferResultPage$BottomCTALayout$$serializer.INSTANCE, animatedBoostingBridgePageInfo.bottomCTALayout);
            int i4 = onWarmupCompleted + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class TitleInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String amountPart;
        private final String completeVerbPart;
        private final String depositTargetPart;

        static {
            int i = IAuthTabCallback + 91;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public TitleInfo() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof TitleInfo) {
                    TitleInfo titleInfo = (TitleInfo) obj;
                    return Intrinsics.areEqual(this.depositTargetPart, titleInfo.depositTargetPart) && Intrinsics.areEqual(this.amountPart, titleInfo.amountPart) && Intrinsics.areEqual(this.completeVerbPart, titleInfo.completeVerbPart);
                }
                int i2 = onExtraCallback + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onWarmupCompleted;
            int i5 = i4 + 67;
            onExtraCallback = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i4 + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 51 / 0;
            }
            return z;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.depositTargetPart;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = onWarmupCompleted + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.amountPart;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.completeVerbPart;
            if (str3 != null) {
                int i4 = onWarmupCompleted + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    str3.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode2 = str3.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TitleInfo(depositTargetPart=" + this.depositTargetPart + ", amountPart=" + this.amountPart + ", completeVerbPart=" + this.completeVerbPart + ")";
            int i2 = onExtraCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TitleInfo> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$TitleInfo$$serializer transferResultPage$TitleInfo$$serializer = TransferResultPage$TitleInfo$$serializer.INSTANCE;
                int i4 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$TitleInfo$$serializer;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ TitleInfo(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, o.okycx r7) {
            /*
                r2 = this;
                r2.<init>()
                r7 = r3 & 1
                r0 = 0
                r1 = 2
                if (r7 != 0) goto L17
                r2.depositTargetPart = r0
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback
                int r4 = r4 + 55
                int r7 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted = r7
                int r4 = r4 % r1
                if (r4 != 0) goto L19
                goto L1b
            L17:
                r2.depositTargetPart = r4
            L19:
                int r4 = r1 % r1
            L1b:
                r4 = r3 & 2
                if (r4 != 0) goto L2b
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted
                int r4 = r4 + 17
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback = r5
                int r4 = r4 % r1
                r2.amountPart = r0
                goto L2d
            L2b:
                r2.amountPart = r5
            L2d:
                int r4 = r1 % r1
                r3 = r3 & 4
                if (r3 != 0) goto L3f
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback
                int r3 = r3 + 3
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted = r4
                int r3 = r3 % r1
                r2.completeVerbPart = r0
                return
            L3f:
                r2.completeVerbPart = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
        }

        public TitleInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.depositTargetPart = str;
            this.amountPart = str2;
            this.completeVerbPart = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted
                int r1 = r1 + 23
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L16
                boolean r1 = r6.onWarmupCompleted(r7, r2)
                if (r1 != 0) goto L21
                goto L1d
            L16:
                boolean r1 = r6.onWarmupCompleted(r7, r2)
                if (r1 == 0) goto L1d
                goto L21
            L1d:
                java.lang.String r1 = r5.depositTargetPart
                if (r1 == 0) goto L28
            L21:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.depositTargetPart
                r6.onExtraCallbackWithResult(r7, r2, r1, r3)
            L28:
                r1 = 1
                boolean r3 = r6.onWarmupCompleted(r7, r1)
                if (r3 != 0) goto L45
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback
                int r3 = r3 + 99
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted = r4
                int r3 = r3 % r0
                if (r3 != 0) goto L41
                java.lang.String r3 = r5.amountPart
                r4 = 3
                int r4 = r4 / r2
                if (r3 == 0) goto L4c
                goto L45
            L41:
                java.lang.String r2 = r5.amountPart
                if (r2 == 0) goto L4c
            L45:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r5.amountPart
                r6.onExtraCallbackWithResult(r7, r1, r2, r3)
            L4c:
                boolean r1 = r6.onWarmupCompleted(r7, r0)
                if (r1 != 0) goto L66
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted
                int r1 = r1 + 75
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L62
                java.lang.String r1 = r5.completeVerbPart
                if (r1 == 0) goto L6d
                goto L66
            L62:
                java.lang.String r5 = r5.completeVerbPart
                r5 = 0
                throw r5
            L66:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r5.completeVerbPart
                r6.onExtraCallbackWithResult(r7, r0, r1, r5)
            L6d:
                int r5 = viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback
                int r5 = r5 + 67
                int r6 = r5 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onWarmupCompleted = r6
                int r5 = r5 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.TitleInfo.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage$TitleInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TitleInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 81;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i3 = onWarmupCompleted + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i6 = onWarmupCompleted;
                int i7 = i6 + 3;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 31;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
                str3 = null;
            }
            this(str, str2, str3);
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.depositTargetPart;
            int i5 = i2 + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.amountPart;
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.completeVerbPart;
            int i4 = i2 + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
    }

    @liq
    public static final class Suggestion {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final Meta meta;
        private final String title;
        private final String titlePrefix;

        static {
            int i = onWarmupCompleted + 85;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public Suggestion() {
            this((String) null, (String) null, (Meta) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 125;
                onExtraCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(obj instanceof Suggestion)) {
                int i5 = i2 + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            if (!Intrinsics.areEqual(this.titlePrefix, suggestion.titlePrefix)) {
                int i7 = onNavigationEvent + 47;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.title, suggestion.title)) {
                return false;
            }
            if (Intrinsics.areEqual(this.meta, suggestion.meta)) {
                return true;
            }
            int i9 = onExtraCallback + 11;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            String str = this.titlePrefix;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = onExtraCallback + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            String str2 = this.title;
            if (str2 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
                int i4 = onNavigationEvent + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            Meta meta = this.meta;
            int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (meta != null ? meta.hashCode() : 0);
            int i6 = onExtraCallback + 9;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 80 / 0;
            }
            return iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Suggestion(titlePrefix=" + this.titlePrefix + ", title=" + this.title + ", meta=" + this.meta + ")";
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Suggestion> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$Suggestion$$serializer transferResultPage$Suggestion$$serializer = TransferResultPage$Suggestion$$serializer.INSTANCE;
                if (i3 != 0) {
                    return transferResultPage$Suggestion$$serializer;
                }
                throw null;
            }
        }

        public /* synthetic */ Suggestion(int i, String str, String str2, Meta meta, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.titlePrefix = null;
            } else {
                this.titlePrefix = str;
                int i2 = 2 % 2;
            }
            if ((i & 2) == 0) {
                int i3 = onNavigationEvent + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                this.title = null;
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.meta = null;
                int i5 = onNavigationEvent + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            this.meta = meta;
            int i7 = onNavigationEvent + 111;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }

        public Suggestion(@Nullable String str, @Nullable String str2, @Nullable Meta meta) {
            this.titlePrefix = str;
            this.title = str2;
            this.meta = meta;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback
                int r1 = r1 + 61
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent = r2
                int r1 = r1 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 == 0) goto L14
                goto L21
            L14:
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent
                int r2 = r2 + 119
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback = r3
                int r2 = r2 % r0
                java.lang.String r2 = r4.titlePrefix
                if (r2 == 0) goto L31
            L21:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r4.titlePrefix
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback
                int r1 = r1 + 67
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent = r2
                int r1 = r1 % r0
            L31:
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L45
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback
                int r2 = r2 + 47
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent = r3
                int r2 = r2 % r0
                java.lang.String r2 = r4.title
                if (r2 == 0) goto L55
            L45:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r4.title
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent
                int r1 = r1 + 71
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback = r2
                int r1 = r1 % r0
            L55:
                boolean r1 = r5.onWarmupCompleted(r6, r0)
                if (r1 != 0) goto L6f
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onNavigationEvent
                int r1 = r1 + 51
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.onExtraCallback = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L6b
                viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta r1 = r4.meta
                if (r1 == 0) goto L76
                goto L6f
            L6b:
                viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta r4 = r4.meta
                r4 = 0
                throw r4
            L6f:
                viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer r1 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta r4 = r4.meta
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L76:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Suggestion(String str, String str2, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 43;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i7 = onNavigationEvent + 113;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i10 = onNavigationEvent + 47;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                meta = null;
            }
            this(str, str2, meta);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.titlePrefix;
            int i5 = i2 + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 107;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.title;
            int i4 = i2 + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return str;
        }

        public final Meta onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Meta meta = this.meta;
            int i5 = i2 + 1;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return meta;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @liq
        public static final class Meta {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            private final Integer withdrawalBankCode;

            static {
                int i = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Meta() {
                Integer num = null;
                this(num, 1, (DefaultConstructorMarker) num);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onWarmupCompleted + 121;
                    onExtraCallback = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (obj instanceof Meta) {
                    return Intrinsics.areEqual(this.withdrawalBankCode, ((Meta) obj).withdrawalBankCode);
                }
                int i3 = onWarmupCompleted + 43;
                onExtraCallback = i3 % 128;
                return i3 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Integer num = this.withdrawalBankCode;
                if (num != null) {
                    return num.hashCode();
                }
                int i5 = i2 + 35;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Meta(withdrawalBankCode=" + this.withdrawalBankCode + ")";
                int i2 = onWarmupCompleted + 57;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Meta> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 113;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        TransferResultPage$Suggestion$Meta$$serializer transferResultPage$Suggestion$Meta$$serializer = TransferResultPage$Suggestion$Meta$$serializer.INSTANCE;
                        throw null;
                    }
                    TransferResultPage$Suggestion$Meta$$serializer transferResultPage$Suggestion$Meta$$serializer2 = TransferResultPage$Suggestion$Meta$$serializer.INSTANCE;
                    int i3 = onNavigationEvent + 91;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return transferResultPage$Suggestion$Meta$$serializer2;
                }
            }

            public /* synthetic */ Meta(int i, Integer num, okycx okycxVar) {
                Object obj = null;
                if ((i & 1) != 0) {
                    this.withdrawalBankCode = num;
                    int i2 = onExtraCallback + 11;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                this.withdrawalBankCode = null;
                int i3 = onWarmupCompleted + 65;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public Meta(@Nullable Integer num) {
                this.withdrawalBankCode = num;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta r3, o.vyl r4, kotlinx.serialization.descriptors.SerialDescriptor r5) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta.onExtraCallback
                    int r1 = r1 + 13
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta.onWarmupCompleted = r2
                    int r1 = r1 % r0
                    r2 = 0
                    if (r1 != 0) goto L18
                    boolean r1 = r4.onWarmupCompleted(r5, r2)
                    r1 = r1 ^ 1
                    if (r1 == 0) goto L22
                    goto L1e
                L18:
                    boolean r1 = r4.onWarmupCompleted(r5, r2)
                    if (r1 != 0) goto L22
                L1e:
                    java.lang.Integer r1 = r3.withdrawalBankCode
                    if (r1 == 0) goto L29
                L22:
                    o.getDynamicHeight r1 = o.getDynamicHeight.onWarmupCompleted
                    java.lang.Integer r3 = r3.withdrawalBankCode
                    r4.onExtraCallbackWithResult(r5, r2, r1, r3)
                L29:
                    int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta.onExtraCallback
                    int r3 = r3 + 35
                    int r4 = r3 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta.onWarmupCompleted = r4
                    int r3 = r3 % r0
                    if (r3 == 0) goto L35
                    return
                L35:
                    r3 = 0
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Meta(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback;
                    int i3 = i2 + 29;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 29 / 0;
                    }
                    int i5 = i2 + 109;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    num = null;
                }
                this(num);
            }

            public final Integer onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.withdrawalBankCode;
                }
                throw null;
            }
        }
    }

    @liq
    public static final class LogInfo {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final Integer depositBankCode;
        private final IntelligenceLogParams intelligenceLogParams;
        private final String nextScreenType;
        private final String selfTransferType;
        private final String status;
        private final String transferType;
        private final String type;
        private final Integer withdrawalBankCode;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = LogDto.$stable;

        static {
            int i = IAuthTabCallback + 41;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public LogInfo() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (IntelligenceLogParams) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof LogInfo)) {
                return false;
            }
            LogInfo logInfo = (LogInfo) obj;
            if (!Intrinsics.areEqual(this.status, logInfo.status)) {
                int i4 = onExtraCallback + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.nextScreenType, logInfo.nextScreenType) || !Intrinsics.areEqual(this.type, logInfo.type)) {
                return false;
            }
            if (Intrinsics.areEqual(this.withdrawalBankCode, logInfo.withdrawalBankCode)) {
                return Intrinsics.areEqual(this.depositBankCode, logInfo.depositBankCode) && Intrinsics.areEqual(this.selfTransferType, logInfo.selfTransferType) && Intrinsics.areEqual(this.transferType, logInfo.transferType) && Intrinsics.areEqual(this.intelligenceLogParams, logInfo.intelligenceLogParams);
            }
            int i6 = onWarmupCompleted + 115;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 9;
            onWarmupCompleted = i3 % 128;
            int iHashCode5 = 1;
            int iHashCode6 = 0;
            if (i3 % 2 == 0) {
                str = this.status;
                if (str == null) {
                    i = 1;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 1;
                    iHashCode2 = str.hashCode();
                }
            } else {
                str = this.status;
                if (str == null) {
                    i = 0;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 0;
                    iHashCode2 = str.hashCode();
                }
            }
            String str2 = this.nextScreenType;
            if (str2 == null) {
                int i4 = onExtraCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str2.hashCode();
            }
            String str3 = this.type;
            if (str3 == null) {
                int i6 = onExtraCallback + 89;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    iHashCode5 = 0;
                }
            } else {
                iHashCode5 = str3.hashCode();
            }
            Integer num = this.withdrawalBankCode;
            int iHashCode7 = num == null ? 0 : num.hashCode();
            Integer num2 = this.depositBankCode;
            if (num2 == null) {
                int i7 = onExtraCallback + 67;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = num2.hashCode();
            }
            String str4 = this.selfTransferType;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.transferType;
            if (str5 == null) {
                int i9 = onWarmupCompleted + 93;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                iHashCode6 = str5.hashCode();
            }
            IntelligenceLogParams intelligenceLogParams = this.intelligenceLogParams;
            if (intelligenceLogParams != null) {
                iHashCode = intelligenceLogParams.hashCode();
            }
            return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + iHashCode6) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LogInfo(status=" + this.status + ", nextScreenType=" + this.nextScreenType + ", type=" + this.type + ", withdrawalBankCode=" + this.withdrawalBankCode + ", depositBankCode=" + this.depositBankCode + ", selfTransferType=" + this.selfTransferType + ", transferType=" + this.transferType + ", intelligenceLogParams=" + this.intelligenceLogParams + ")";
            int i2 = onExtraCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LogInfo> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$LogInfo$$serializer transferResultPage$LogInfo$$serializer = TransferResultPage$LogInfo$$serializer.INSTANCE;
                int i4 = onExtraCallbackWithResult + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$LogInfo$$serializer;
            }
        }

        public /* synthetic */ LogInfo(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, IntelligenceLogParams intelligenceLogParams, okycx okycxVar) {
            if ((i & 1) == 0) {
                this.status = null;
            } else {
                this.status = str;
            }
            if ((i & 2) == 0) {
                this.nextScreenType = null;
                int i2 = 2 % 2;
            } else {
                this.nextScreenType = str2;
            }
            if ((i & 4) == 0) {
                int i3 = onExtraCallback + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                this.type = null;
                if (i4 == 0) {
                    throw null;
                }
            } else {
                this.type = str3;
                int i5 = 2 % 2;
            }
            if ((i & 8) == 0) {
                this.withdrawalBankCode = null;
                int i6 = onExtraCallback + 45;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } else {
                this.withdrawalBankCode = num;
            }
            if ((i & 16) == 0) {
                this.depositBankCode = null;
            } else {
                this.depositBankCode = num2;
            }
            if ((i & 32) == 0) {
                int i8 = onExtraCallback + 115;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                this.selfTransferType = null;
                int i10 = 2 % 2;
            } else {
                this.selfTransferType = str4;
            }
            if ((i & 64) == 0) {
                this.transferType = null;
            } else {
                this.transferType = str5;
            }
            if ((i & 128) != 0) {
                this.intelligenceLogParams = intelligenceLogParams;
                return;
            }
            int i11 = onWarmupCompleted + 45;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            this.intelligenceLogParams = null;
        }

        public LogInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable IntelligenceLogParams intelligenceLogParams) {
            this.status = str;
            this.nextScreenType = str2;
            this.type = str3;
            this.withdrawalBankCode = num;
            this.depositBankCode = num2;
            this.selfTransferType = str4;
            this.transferType = str5;
            this.intelligenceLogParams = intelligenceLogParams;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage.LogInfo r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.LogInfo.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LogInfo(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, IntelligenceLogParams intelligenceLogParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            IntelligenceLogParams intelligenceLogParams2 = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str6 = null;
            } else {
                str6 = str;
            }
            String str8 = (i & 2) != 0 ? null : str2;
            if ((i & 4) != 0) {
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str7 = null;
            } else {
                str7 = str3;
            }
            Integer num3 = (i & 8) != 0 ? null : num;
            Integer num4 = (i & 16) != 0 ? null : num2;
            String str9 = (i & 32) != 0 ? null : str4;
            String str10 = (i & 64) != 0 ? null : str5;
            if ((i & 128) != 0) {
                int i7 = onExtraCallback + 7;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } else {
                intelligenceLogParams2 = intelligenceLogParams;
            }
            this(str6, str8, str7, num3, num4, str9, str10, intelligenceLogParams2);
        }

        public final String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                str = this.status;
                int i4 = 65 / 0;
            } else {
                str = this.status;
            }
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.nextScreenType;
            if (i3 != 0) {
                int i4 = 8 / 0;
            }
            return str;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.type;
            }
            throw null;
        }

        public final Integer IAuthTabCallbackStub() {
            Integer num;
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                num = this.withdrawalBankCode;
                int i4 = 48 / 0;
            } else {
                num = this.withdrawalBankCode;
            }
            int i5 = i3 + 75;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final Integer onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.depositBankCode;
            int i5 = i2 + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.selfTransferType;
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
            return str;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.transferType;
            int i5 = i2 + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final IntelligenceLogParams onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            IntelligenceLogParams intelligenceLogParams = this.intelligenceLogParams;
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return intelligenceLogParams;
        }
    }

    @liq
    public static final class ListRowBannerLayout {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        private final String description;
        private final Effect effect;
        private final Icon icon;
        private final LogInfo logInfo;
        private final String scheme;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = LogDto.$stable;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$ListRowBannerLayout$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = TransferResultPage.ListRowBannerLayout.onNavigationEvent();
                int i4 = onWarmupCompleted + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null};

        public ListRowBannerLayout() {
            this((String) null, (String) null, (String) null, (Icon) null, (Effect) null, (LogInfo) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = (~((~i2) | i)) | i3;
            int i8 = ~i3;
            int i9 = (~(i8 | i)) | (~(i8 | i2)) | (~(i | i2));
            int i10 = (~(i2 | (~i))) | i8;
            int i11 = i3 + i + i5 + ((-2137991558) * i4) + (111092868 * i6);
            int i12 = i11 * i11;
            int i13 = (((-431794203) * i3) - 566755328) + (427185167 * i) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i5) + ((-1247805440) * i4) + ((-1807745024) * i6) + ((-591921152) * i12);
            int i14 = (i3 * (-1469267343)) + 1003592187 + (i * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i5 * (-1469268067)) + (i4 * 1951436498) + (i6 * (-746069772)) + (i12 * (-1529348096));
            return i13 + ((i14 * i14) * 1762131968) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return (KSerializer) onNavigationEvent(2013918266, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[0], -2013918266, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Effect> kSerializerSerializer = Effect.Companion.serializer();
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerSerializer;
            }
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListRowBannerLayout)) {
                int i2 = onNavigationEvent + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ListRowBannerLayout listRowBannerLayout = (ListRowBannerLayout) obj;
            if (!Intrinsics.areEqual(this.title, listRowBannerLayout.title)) {
                int i4 = onNavigationEvent + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.description, listRowBannerLayout.description)) {
                int i6 = onExtraCallback + 119;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.scheme, listRowBannerLayout.scheme)) {
                int i8 = onExtraCallback + 59;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.icon, listRowBannerLayout.icon)) {
                int i10 = onExtraCallback + 45;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 60 / 0;
                }
                return false;
            }
            if (this.effect != listRowBannerLayout.effect) {
                return false;
            }
            if (Intrinsics.areEqual(this.logInfo, listRowBannerLayout.logInfo)) {
                return true;
            }
            int i12 = onNavigationEvent + 107;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.title;
            int iHashCode2 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.description;
            if (str2 == null) {
                int i4 = onNavigationEvent + 45;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            String str3 = this.scheme;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            Icon icon = this.icon;
            int iHashCode5 = icon == null ? 0 : icon.hashCode();
            Effect effect = this.effect;
            int iHashCode6 = effect == null ? 0 : effect.hashCode();
            LogInfo logInfo = this.logInfo;
            if (logInfo != null) {
                int i6 = onExtraCallback + 103;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    int iHashCode7 = logInfo.hashCode();
                    int i7 = 11 / 0;
                    iHashCode2 = iHashCode7;
                } else {
                    iHashCode2 = logInfo.hashCode();
                }
            }
            return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ListRowBannerLayout(title=" + this.title + ", description=" + this.description + ", scheme=" + this.scheme + ", icon=" + this.icon + ", effect=" + this.effect + ", logInfo=" + this.logInfo + ")";
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 73 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ListRowBannerLayout> serializer() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TransferResultPage$ListRowBannerLayout$$serializer transferResultPage$ListRowBannerLayout$$serializer = TransferResultPage$ListRowBannerLayout$$serializer.INSTANCE;
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
                return transferResultPage$ListRowBannerLayout$$serializer;
            }
        }

        static {
            int i = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ ListRowBannerLayout(int i, String str, String str2, String str3, Icon icon, Effect effect, LogInfo logInfo, okycx okycxVar) {
            Object obj = null;
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = null;
            } else {
                this.description = str2;
                int i2 = onExtraCallback + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 4) == 0) {
                this.scheme = null;
            } else {
                this.scheme = str3;
            }
            if ((i & 8) == 0) {
                int i5 = onExtraCallback + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                this.icon = null;
                if (i6 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i7 = 2 % 2;
            } else {
                this.icon = icon;
            }
            if ((i & 16) == 0) {
                this.effect = null;
                int i8 = 2 % 2;
            } else {
                this.effect = effect;
            }
            if ((i & 32) == 0) {
                this.logInfo = null;
            } else {
                this.logInfo = logInfo;
            }
        }

        public ListRowBannerLayout(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Icon icon, @Nullable Effect effect, @Nullable LogInfo logInfo) {
            this.title = str;
            this.description = str2;
            this.scheme = str3;
            this.icon = icon;
            this.effect = effect;
            this.logInfo = logInfo;
        }

        public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i5 = i3 + 61;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return lazyArr;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.$childSerializers
                r2 = 0
                boolean r3 = r7.onWarmupCompleted(r8, r2)
                r4 = 3
                if (r3 != 0) goto L1a
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onNavigationEvent
                int r3 = r3 + 71
                int r5 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onExtraCallback = r5
                int r3 = r3 % r0
                java.lang.String r3 = r6.title
                if (r3 == 0) goto L29
            L1a:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r6.title
                r7.onExtraCallbackWithResult(r8, r2, r3, r5)
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onExtraCallback
                int r2 = r2 + r4
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onNavigationEvent = r3
                int r2 = r2 % r0
            L29:
                r2 = 1
                boolean r3 = r7.onWarmupCompleted(r8, r2)
                if (r3 != 0) goto L34
                java.lang.String r3 = r6.description
                if (r3 == 0) goto L3b
            L34:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r6.description
                r7.onExtraCallbackWithResult(r8, r2, r3, r5)
            L3b:
                boolean r3 = r7.onWarmupCompleted(r8, r0)
                if (r3 != 0) goto L4e
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onExtraCallback
                int r3 = r3 + 35
                int r5 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onNavigationEvent = r5
                int r3 = r3 % r0
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L55
            L4e:
                o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r5 = r6.scheme
                r7.onExtraCallbackWithResult(r8, r0, r3, r5)
            L55:
                boolean r3 = r7.onWarmupCompleted(r8, r4)
                if (r3 != 0) goto L5f
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r3 = r6.icon
                if (r3 == 0) goto L66
            L5f:
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer r3 = viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$Icon r5 = r6.icon
                r7.onExtraCallbackWithResult(r8, r4, r3, r5)
            L66:
                r3 = 4
                boolean r4 = r7.onWarmupCompleted(r8, r3)
                if (r4 != 0) goto L71
                viva.republica.toss.network.model.transfer.TransferResultPage$Effect r4 = r6.effect
                if (r4 == 0) goto L7e
            L71:
                r1 = r1[r3]
                java.lang.Object r1 = r1.getValue()
                o.py r1 = (o.py) r1
                viva.republica.toss.network.model.transfer.TransferResultPage$Effect r4 = r6.effect
                r7.onExtraCallbackWithResult(r8, r3, r1, r4)
            L7e:
                r1 = 5
                boolean r3 = r7.onWarmupCompleted(r8, r1)
                if (r3 == r2) goto L89
                viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo r3 = r6.logInfo
                if (r3 == 0) goto L98
            L89:
                viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo$$serializer r3 = viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo$$serializer.INSTANCE
                viva.republica.toss.network.model.transfer.TransferResultPage$LogInfo r6 = r6.logInfo
                r7.onExtraCallbackWithResult(r8, r1, r3, r6)
                int r6 = viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onExtraCallback
                int r6 = r6 + r2
                int r7 = r6 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onNavigationEvent = r7
                int r6 = r6 % r0
            L98:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.ListRowBannerLayout.onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage$ListRowBannerLayout, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ListRowBannerLayout(String str, String str2, String str3, Icon icon, Effect effect, LogInfo logInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Icon icon2;
            Effect effect2;
            LogInfo logInfo2 = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 87;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                str = null;
            }
            String str4 = (i & 2) != 0 ? null : str2;
            String str5 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i4 = onNavigationEvent + 5;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                icon2 = null;
            } else {
                icon2 = icon;
            }
            if ((i & 16) != 0) {
                int i7 = onExtraCallback + 119;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                effect2 = null;
            } else {
                effect2 = effect;
            }
            if ((i & 32) != 0) {
                int i10 = onNavigationEvent + 55;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } else {
                logInfo2 = logInfo;
            }
            this(str, str4, str5, icon2, effect2, logInfo2);
        }

        public final String asBinder() {
            String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.title;
                int i4 = 26 / 0;
            } else {
                str = this.title;
            }
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.description;
            int i5 = i2 + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.scheme;
            int i4 = i3 + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final Icon onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Icon icon = this.icon;
            int i4 = i3 + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return icon;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            ListRowBannerLayout listRowBannerLayout = (ListRowBannerLayout) objArr[0];
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Effect effect = listRowBannerLayout.effect;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return effect;
            }
            obj.hashCode();
            throw null;
        }

        public final LogInfo IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.logInfo;
            }
            throw null;
        }

        private static final /* synthetic */ KSerializer onTransact() {
            return (KSerializer) onNavigationEvent(2013918266, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[0], -2013918266, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        }

        public final Effect onWarmupCompleted() {
            return (Effect) onNavigationEvent(-265466830, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this}, 265466831, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        }
    }

    @liq
    public static final class Icon {
        private static final Lazy<KSerializer<Object>>[] $childSerializers;
        public static final int $stable = 0;
        public static final Companion Companion;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        private final IconPlayOption playOption;
        private final Size size;
        private final IconType type;
        private final String url;

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~(i4 | i6);
            int i8 = ~i4;
            int i9 = ~i6;
            int i10 = i8 | i9;
            int i11 = i7 | (~(i10 | i2));
            int i12 = i9 | i4;
            int i13 = (~i10) | i2;
            int i14 = i2 + i4 + i + ((-1587644119) * i3) + (1302866265 * i5);
            int i15 = i14 * i14;
            int i16 = (i2 * (-1579585154)) + 1163788288 + ((-1579585154) * i4) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i) + (1500774400 * i3) + ((-1456209920) * i5) + ((-2144468992) * i15);
            int i17 = ((i2 * (-855313886)) - 1253577507) + (i4 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i * (-855313873)) + (i3 * (-1467678585)) + (i5 * 593082711) + (i15 * 74579968);
            return i16 + ((i17 * i17) * (-1668153344)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
        }

        private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<IconPlayOption> kSerializerSerializer = IconPlayOption.Companion.serializer();
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
            return kSerializerSerializer;
        }

        private static final /* synthetic */ KSerializer asInterface() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                IconType.Companion.serializer();
                throw null;
            }
            KSerializer<IconType> kSerializerSerializer = IconType.Companion.serializer();
            int i3 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerSerializer;
        }

        public static /* synthetic */ KSerializer onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerAsInterface = asInterface();
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerAsInterface;
        }

        public static /* synthetic */ KSerializer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallbackDefault();
            }
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                int i2 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Icon icon = (Icon) obj;
            if (!Intrinsics.areEqual(this.url, icon.url)) {
                int i4 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.type != icon.type) {
                return false;
            }
            if (this.playOption != icon.playOption) {
                int i6 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i6 % 128;
                return i6 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.size, icon.size)) {
                return true;
            }
            int i7 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.url.hashCode();
            int iHashCode3 = this.type.hashCode();
            int iHashCode4 = this.playOption.hashCode();
            Size size = this.size;
            if (size == null) {
                int i4 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 3;
                }
                iHashCode = 0;
            } else {
                iHashCode = size.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Icon(url=" + this.url + ", type=" + this.type + ", playOption=" + this.playOption + ", size=" + this.size + ")";
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Icon> serializer() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    TransferResultPage$Icon$$serializer transferResultPage$Icon$$serializer = TransferResultPage$Icon$$serializer.INSTANCE;
                    throw null;
                }
                TransferResultPage$Icon$$serializer transferResultPage$Icon$$serializer2 = TransferResultPage$Icon$$serializer.INSTANCE;
                int i3 = onNavigationEvent + 117;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return transferResultPage$Icon$$serializer2;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 33;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerOnNavigationEvent = TransferResultPage.Icon.onNavigationEvent();
                    int i4 = onExtraCallback + 91;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnNavigationEvent;
                }
            }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Icon$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 103;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 == 0) {
                        return TransferResultPage.Icon.onWarmupCompleted();
                    }
                    TransferResultPage.Icon.onWarmupCompleted();
                    throw null;
                }
            }), null};
            int i = onWarmupCompleted + 121;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public /* synthetic */ Icon(int i, String str, IconType iconType, IconPlayOption iconPlayOption, Size size, okycx okycxVar) {
            if (7 != (i & 7)) {
                htf31.onExtraCallbackWithResult(i, 7, TransferResultPage$Icon$$serializer.INSTANCE.getDescriptor());
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.url = str;
            this.type = iconType;
            this.playOption = iconPlayOption;
            if ((i & 8) == 0) {
                this.size = null;
                return;
            }
            this.size = size;
            int i5 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void onExtraCallback(Icon icon, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, icon.url);
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), icon.type);
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), icon.playOption);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
                int i2 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Size size = icon.size;
                    throw null;
                }
                if (icon.size == null) {
                    return;
                }
            }
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, TransferResultPage$Icon$Size$$serializer.INSTANCE, icon.size);
            int i3 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        public static final /* synthetic */ Lazy[] onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return lazyArr;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            Icon icon = (Icon) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = icon.url;
            if (i4 != 0) {
                int i5 = 21 / 0;
            }
            int i6 = i2 + 53;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IconType asBinder() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IconType iconType = this.type;
            int i5 = i3 + 69;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 98 / 0;
            }
            return iconType;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            Icon icon = (Icon) objArr[0];
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            IconPlayOption iconPlayOption = icon.playOption;
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
            int i6 = i3 + 107;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return iconPlayOption;
            }
            throw null;
        }

        public final Size onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Size size = this.size;
            int i5 = i3 + 121;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return size;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class IconType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconType[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Companion Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;
            public static final IconType WEBP = new IconType("WEBP", 0);
            public static final IconType LOTTIE = new IconType("LOTTIE", 1);
            public static final IconType PNG = new IconType("PNG", 2);
            public static final IconType APNG = new IconType("APNG", 3);

            /* renamed from: $r8$lambda$Aw10riC0nL19YkGBAE-3kY4uejg, reason: not valid java name */
            public static /* synthetic */ KSerializer m127$r8$lambda$Aw10riC0nL19YkGBAE3kY4uejg() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    _init_$_anonymous_();
                    throw null;
                }
                KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return kSerializer_init_$_anonymous_;
            }

            private static final /* synthetic */ IconType[] $values() {
                IconType[] iconTypeArr;
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 89;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    IconType iconType = WEBP;
                    IconType iconType2 = LOTTIE;
                    IconType iconType3 = PNG;
                    IconType iconType4 = APNG;
                    iconTypeArr = new IconType[2];
                    iconTypeArr[0] = iconType;
                    iconTypeArr[0] = iconType2;
                    iconTypeArr[4] = iconType3;
                    iconTypeArr[4] = iconType4;
                } else {
                    iconTypeArr = new IconType[]{WEBP, LOTTIE, PNG, APNG};
                }
                int i4 = i2 + 97;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iconTypeArr;
            }

            public static EnumEntries<IconType> getEntries() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return $ENTRIES;
                }
                throw null;
            }

            public static IconType valueOf(String str) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IconType iconType = (IconType) Enum.valueOf(IconType.class, str);
                if (i3 != 0) {
                    int i4 = 16 / 0;
                }
                int i5 = onNavigationEvent + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return iconType;
            }

            public static IconType[] values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IconType[] iconTypeArr = (IconType[]) $VALUES.clone();
                int i4 = IAuthTabCallback + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return iconTypeArr;
                }
                throw null;
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 37;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer = (KSerializer) IconType.access$get$cachedSerializer$delegate$cp().getValue();
                    if (i3 != 0) {
                        return kSerializer;
                    }
                    throw null;
                }

                public final KSerializer<IconType> serializer() {
                    KSerializer<IconType> kSerializerOnExtraCallbackWithResult;
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 119;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        int i3 = 15 / 0;
                    } else {
                        kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    }
                    int i4 = onExtraCallback + 97;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializerOnExtraCallbackWithResult;
                }
            }

            private IconType(String str, int i) {
            }

            private static final /* synthetic */ KSerializer _init_$_anonymous_() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Icon.IconType", values());
                }
                updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Icon.IconType", values());
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
                int i5 = i2 + 7;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return lazy;
            }

            static {
                IconType[] iconTypeArr$values = $values();
                $VALUES = iconTypeArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iconTypeArr$values);
                Companion = new Companion(null);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Icon$IconType$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 83;
                        onExtraCallback = i2 % 128;
                        if (i2 % 2 == 0) {
                            return TransferResultPage.Icon.IconType.m127$r8$lambda$Aw10riC0nL19YkGBAE3kY4uejg();
                        }
                        TransferResultPage.Icon.IconType.m127$r8$lambda$Aw10riC0nL19YkGBAE3kY4uejg();
                        throw null;
                    }
                });
                int i = onExtraCallback + 31;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }

        public final IconPlayOption IAuthTabCallback() {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (IconPlayOption) IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 819045504, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -819045503, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent);
        }

        public final String IAuthTabCallbackStub() {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            return (String) IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1042267903, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1042267903, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @liq
        public static final class IconPlayOption {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconPlayOption[] $VALUES;
            private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
            public static final Companion Companion;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final IconPlayOption STATIC = new IconPlayOption("STATIC", 0);
            public static final IconPlayOption ONCE = new IconPlayOption("ONCE", 1);
            public static final IconPlayOption INFINITE = new IconPlayOption("INFINITE", 2);

            public static /* synthetic */ KSerializer $r8$lambda$Luf11HCcvxroBjHCkpESJoRWWgM() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
                int i4 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer_init_$_anonymous_;
                }
                throw null;
            }

            private static final /* synthetic */ IconPlayOption[] $values() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IconPlayOption iconPlayOption = STATIC;
                if (i3 == 0) {
                    return new IconPlayOption[]{iconPlayOption, ONCE, INFINITE};
                }
                IconPlayOption iconPlayOption2 = ONCE;
                IconPlayOption iconPlayOption3 = INFINITE;
                IconPlayOption[] iconPlayOptionArr = new IconPlayOption[5];
                iconPlayOptionArr[1] = iconPlayOption;
                iconPlayOptionArr[1] = iconPlayOption2;
                iconPlayOptionArr[5] = iconPlayOption3;
                return iconPlayOptionArr;
            }

            public static EnumEntries<IconPlayOption> getEntries() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                EnumEntries<IconPlayOption> enumEntries = $ENTRIES;
                int i5 = i3 + 63;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 44 / 0;
                }
                return enumEntries;
            }

            public static IconPlayOption valueOf(String str) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IconPlayOption iconPlayOption = (IconPlayOption) Enum.valueOf(IconPlayOption.class, str);
                int i4 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return iconPlayOption;
            }

            public static IconPlayOption[] values() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                IconPlayOption[] iconPlayOptionArr = $VALUES;
                if (i3 != 0) {
                    return (IconPlayOption[]) iconPlayOptionArr.clone();
                }
                int i4 = 81 / 0;
                return (IconPlayOption[]) iconPlayOptionArr.clone();
            }

            public static final class Companion {
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                private final /* synthetic */ KSerializer onExtraCallbackWithResult() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 67;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    KSerializer kSerializer = (KSerializer) IconPlayOption.access$get$cachedSerializer$delegate$cp().getValue();
                    int i3 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return kSerializer;
                }

                public final KSerializer<IconPlayOption> serializer() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        onExtraCallbackWithResult();
                        throw null;
                    }
                    KSerializer<IconPlayOption> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
                    int i3 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return kSerializerOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }

            private IconPlayOption(String str, int i) {
            }

            private static final /* synthetic */ KSerializer _init_$_anonymous_() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Icon.IconPlayOption", values());
                }
                int i3 = 70 / 0;
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Icon.IconPlayOption", values());
            }

            public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return $cachedSerializer$delegate;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                IconPlayOption[] iconPlayOptionArr$values = $values();
                $VALUES = iconPlayOptionArr$values;
                $ENTRIES = access15300.onExtraCallbackWithResult(iconPlayOptionArr$values);
                DefaultConstructorMarker defaultConstructorMarker = null;
                Companion = new Companion(defaultConstructorMarker);
                $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Icon$IconPlayOption$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 83;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        KSerializer kSerializer$r8$lambda$Luf11HCcvxroBjHCkpESJoRWWgM = TransferResultPage.Icon.IconPlayOption.$r8$lambda$Luf11HCcvxroBjHCkpESJoRWWgM();
                        int i4 = onWarmupCompleted + 5;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return kSerializer$r8$lambda$Luf11HCcvxroBjHCkpESJoRWWgM;
                    }
                });
                int i = IAuthTabCallback + 47;
                onExtraCallback = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                defaultConstructorMarker.hashCode();
                throw null;
            }
        }

        @liq
        public static final class Size {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            private final int height;
            private final int width;

            static {
                int i = IAuthTabCallback + 59;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Size() {
                int i = 0;
                this(i, i, 3, (DefaultConstructorMarker) null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Size)) {
                    int i2 = onExtraCallback + 13;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 != 0;
                }
                Size size = (Size) obj;
                if (this.width != size.width) {
                    int i3 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (this.height == size.height) {
                    return true;
                }
                int i5 = onExtraCallbackWithResult + 69;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 87;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.width);
                return (i3 == 0 ? iHashCode - 104 : iHashCode * 31) + Integer.hashCode(this.height);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Size(width=" + this.width + ", height=" + this.height + ")";
                int i2 = onExtraCallbackWithResult + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public static final class Companion {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Size> serializer() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 3;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    TransferResultPage$Icon$Size$$serializer transferResultPage$Icon$Size$$serializer = TransferResultPage$Icon$Size$$serializer.INSTANCE;
                    int i4 = IAuthTabCallback + 69;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        return transferResultPage$Icon$Size$$serializer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public Size(int i, int i2) {
                this.width = i;
                this.height = i2;
            }

            public /* synthetic */ Size(int i, int i2, int i3, okycx okycxVar) {
                if ((i & 1) == 0) {
                    this.width = 0;
                } else {
                    this.width = i2;
                    int i4 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                }
                if ((i & 2) != 0) {
                    this.height = i3;
                    return;
                }
                int i7 = onExtraCallbackWithResult + 45;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                this.height = 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
            @kotlin.jvm.JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size.onExtraCallback
                    int r1 = r1 + 55
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L17
                    boolean r1 = r5.onWarmupCompleted(r6, r3)
                    if (r1 != 0) goto L21
                    goto L1d
                L17:
                    boolean r1 = r5.onWarmupCompleted(r6, r2)
                    if (r1 != 0) goto L21
                L1d:
                    int r1 = r4.width
                    if (r1 == 0) goto L2f
                L21:
                    int r1 = r4.width
                    r5.onExtraCallback(r6, r2, r1)
                    int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size.onExtraCallback
                    int r1 = r1 + 49
                    int r2 = r1 % 128
                    viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size.onExtraCallbackWithResult = r2
                    int r1 = r1 % r0
                L2f:
                    boolean r0 = r5.onWarmupCompleted(r6, r3)
                    if (r0 != 0) goto L39
                    int r0 = r4.height
                    if (r0 == 0) goto L3e
                L39:
                    int r4 = r4.height
                    r5.onExtraCallback(r6, r3, r4)
                L3e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.Icon.Size.onWarmupCompleted(viva.republica.toss.network.model.transfer.TransferResultPage$Icon$Size, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Size(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i3 & 1) != 0) {
                    int i4 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    i = 0;
                }
                if ((i3 & 2) != 0) {
                    int i6 = onExtraCallbackWithResult;
                    int i7 = i6 + 41;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 + 17;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 2;
                    }
                    i2 = 0;
                }
                this(i, i2);
            }

            public final int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.width;
                int i6 = i2 + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public final int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 117;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = this.height;
                int i5 = i2 + 87;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @liq
    public static final class Effect {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Effect[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;
        public static final Effect NONE = new Effect("NONE", 0);
        public static final Effect BLINK = new Effect("BLINK", 1);
        public static final Effect SHINE = new Effect("SHINE", 2);

        public static /* synthetic */ KSerializer $r8$lambda$rcziJxDkH67fqq5cnhKFOqwQuIc() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializer_init_$_anonymous_;
        }

        private static final /* synthetic */ Effect[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Effect[] effectArr = {NONE, BLINK, SHINE};
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return effectArr;
        }

        public static EnumEntries<Effect> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            EnumEntries<Effect> enumEntries = $ENTRIES;
            int i4 = i2 + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static Effect valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Effect effect = (Effect) Enum.valueOf(Effect.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return effect;
        }

        public static Effect[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Effect[] effectArr = (Effect[]) $VALUES.clone();
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return effectArr;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializer = (KSerializer) Effect.access$get$cachedSerializer$delegate$cp().getValue();
                int i4 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                return kSerializer;
            }

            public final KSerializer<Effect> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer<Effect> kSerializerOnExtraCallback = onExtraCallback();
                int i4 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnExtraCallback;
                }
                throw null;
            }
        }

        private Effect(String str, int i) {
        }

        private static final /* synthetic */ KSerializer _init_$_anonymous_() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Effect", values());
            }
            int i3 = 15 / 0;
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.transfer.TransferResultPage.Effect", values());
        }

        public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Lazy<KSerializer<Object>> lazy = $cachedSerializer$delegate;
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            return lazy;
        }

        static {
            Effect[] effectArr$values = $values();
            $VALUES = effectArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(effectArr$values);
            Companion = new Companion(null);
            $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferResultPage$Effect$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$rcziJxDkH67fqq5cnhKFOqwQuIc = TransferResultPage.Effect.$r8$lambda$rcziJxDkH67fqq5cnhKFOqwQuIc();
                    int i4 = onExtraCallback + 103;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$rcziJxDkH67fqq5cnhKFOqwQuIc;
                }
            });
            int i = onExtraCallbackWithResult + 57;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    @liq
    public static final class IntelligenceLogParams {
        public static final int $stable = LogDto.$stable;
        public static final Companion Companion;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String adId;
        private final LogDto log;
        private final String type;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new Companion(defaultConstructorMarker);
            int i = onWarmupCompleted + 63;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public IntelligenceLogParams() {
            this((String) null, (String) null, (LogDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IntelligenceLogParams)) {
                return false;
            }
            IntelligenceLogParams intelligenceLogParams = (IntelligenceLogParams) obj;
            if (!Intrinsics.areEqual(this.type, intelligenceLogParams.type)) {
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.adId, intelligenceLogParams.adId)) {
                return Intrinsics.areEqual(this.log, intelligenceLogParams.log);
            }
            int i6 = onExtraCallback + 123;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.type;
            if (str == null) {
                int i5 = i3 + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i7 = IAuthTabCallback + 41;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            String str2 = this.adId;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            LogDto logDto = this.log;
            return (((iHashCode * 31) + iHashCode2) * 31) + (logDto != null ? logDto.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IntelligenceLogParams(type=" + this.type + ", adId=" + this.adId + ", log=" + this.log + ")";
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<IntelligenceLogParams> serializer() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 69;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    TransferResultPage$IntelligenceLogParams$$serializer transferResultPage$IntelligenceLogParams$$serializer = TransferResultPage$IntelligenceLogParams$$serializer.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TransferResultPage$IntelligenceLogParams$$serializer transferResultPage$IntelligenceLogParams$$serializer2 = TransferResultPage$IntelligenceLogParams$$serializer.INSTANCE;
                int i3 = onExtraCallback + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return transferResultPage$IntelligenceLogParams$$serializer2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ IntelligenceLogParams(int r2, java.lang.String r3, java.lang.String r4, im.toss.inventory_sdk.model.LogDto r5, o.okycx r6) {
            /*
                r1 = this;
                r1.<init>()
                r6 = r2 & 1
                r0 = 0
                if (r6 != 0) goto Lb
                r1.type = r0
                goto Ld
            Lb:
                r1.type = r3
            Ld:
                r3 = r2 & 2
                r6 = 2
                if (r3 != 0) goto L24
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback
                int r3 = r3 + 3
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback = r4
                int r3 = r3 % r6
                r1.adId = r0
                if (r3 != 0) goto L20
                goto L32
            L20:
                r0.hashCode()
                throw r0
            L24:
                r1.adId = r4
                int r3 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback
                int r3 = r3 + 113
                int r4 = r3 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback = r4
                int r3 = r3 % r6
                if (r3 == 0) goto L32
                goto L34
            L32:
                int r3 = r6 % r6
            L34:
                r2 = r2 & 4
                if (r2 != 0) goto L3b
                r1.log = r0
                return
            L3b:
                r1.log = r5
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback
                int r2 = r2 + 11
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback = r3
                int r2 = r2 % r6
                if (r2 != 0) goto L49
                return
            L49:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.<init>(int, java.lang.String, java.lang.String, im.toss.inventory_sdk.model.LogDto, o.okycx):void");
        }

        public IntelligenceLogParams(@Nullable String str, @Nullable String str2, @Nullable LogDto logDto) {
            this.type = str;
            this.adId = str2;
            this.log = logDto;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                r1 = 0
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 != 0) goto L17
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback
                int r2 = r2 + 107
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback = r3
                int r2 = r2 % r0
                java.lang.String r2 = r4.type
                if (r2 == 0) goto L27
            L17:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r4.type
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback
                int r1 = r1 + 125
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback = r2
                int r1 = r1 % r0
            L27:
                r1 = 1
                boolean r2 = r5.onWarmupCompleted(r6, r1)
                if (r2 == r1) goto L3b
                int r2 = viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.IAuthTabCallback
                int r2 = r2 + 105
                int r3 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback = r3
                int r2 = r2 % r0
                java.lang.String r2 = r4.adId
                if (r2 == 0) goto L42
            L3b:
                o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r3 = r4.adId
                r5.onExtraCallbackWithResult(r6, r1, r2, r3)
            L42:
                boolean r1 = r5.onWarmupCompleted(r6, r0)
                if (r1 != 0) goto L4c
                im.toss.inventory_sdk.model.LogDto r1 = r4.log
                if (r1 == 0) goto L53
            L4c:
                im.toss.inventory_sdk.model.LogDto$$serializer r1 = im.toss.inventory_sdk.model.LogDto$.serializer.INSTANCE
                im.toss.inventory_sdk.model.LogDto r4 = r4.log
                r5.onExtraCallbackWithResult(r6, r0, r1, r4)
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.IntelligenceLogParams.onExtraCallback(viva.republica.toss.network.model.transfer.TransferResultPage$IntelligenceLogParams, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IntelligenceLogParams(String str, String str2, LogDto logDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i3 = onExtraCallback + 85;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 27;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i8 = onExtraCallback + 7;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                logDto = null;
            }
            this(str, str2, logDto);
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 53;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.adId;
            int i5 = i2 + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final LogDto onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            LogDto logDto = this.log;
            int i4 = i2 + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return logDto;
            }
            throw null;
        }
    }

    @liq
    public static final class SchemeActionInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final String scheme;

        static {
            int i = onExtraCallbackWithResult + 47;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 83 / 0;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SchemeActionInfo() {
            String str = null;
            this(str, 1, (DefaultConstructorMarker) str);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SchemeActionInfo)) {
                return false;
            }
            if (Intrinsics.areEqual(this.scheme, ((SchemeActionInfo) obj).scheme)) {
                return true;
            }
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        
            return r1.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r1 == null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r2 + 45;
            viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted
                int r1 = r1 + 3
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.IAuthTabCallback = r2
                int r1 = r1 % r0
                r3 = 0
                if (r1 != 0) goto L17
                java.lang.String r1 = r5.scheme
                r4 = 65
                int r4 = r4 / r3
                if (r1 != 0) goto L27
                goto L1b
            L17:
                java.lang.String r1 = r5.scheme
                if (r1 != 0) goto L27
            L1b:
                int r2 = r2 + 45
                int r1 = r2 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted = r1
                int r2 = r2 % r0
                if (r2 != 0) goto L25
                return r3
            L25:
                r0 = 0
                throw r0
            L27:
                int r0 = r1.hashCode()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SchemeActionInfo(scheme=" + this.scheme + ")";
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public static final class Companion {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SchemeActionInfo> serializer() {
                TransferResultPage$SchemeActionInfo$$serializer transferResultPage$SchemeActionInfo$$serializer;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    transferResultPage$SchemeActionInfo$$serializer = TransferResultPage$SchemeActionInfo$$serializer.INSTANCE;
                    int i3 = 79 / 0;
                } else {
                    transferResultPage$SchemeActionInfo$$serializer = TransferResultPage$SchemeActionInfo$$serializer.INSTANCE;
                }
                int i4 = onExtraCallbackWithResult + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return transferResultPage$SchemeActionInfo$$serializer;
            }
        }

        public /* synthetic */ SchemeActionInfo(int i, String str, okycx okycxVar) {
            if ((i & 1) != 0) {
                this.scheme = str;
                int i2 = onWarmupCompleted + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            this.scheme = null;
            int i4 = IAuthTabCallback + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public SchemeActionInfo(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.IAuthTabCallback
                int r1 = r1 + 57
                int r2 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L16
                boolean r1 = r5.onWarmupCompleted(r6, r2)
                if (r1 != 0) goto L30
                goto L1c
            L16:
                boolean r1 = r5.onWarmupCompleted(r6, r2)
                if (r1 != 0) goto L30
            L1c:
                int r1 = viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted
                int r1 = r1 + 101
                int r3 = r1 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.IAuthTabCallback = r3
                int r1 = r1 % r0
                if (r1 == 0) goto L2c
                java.lang.String r1 = r4.scheme
                if (r1 == 0) goto L37
                goto L30
            L2c:
                java.lang.String r4 = r4.scheme
                r4 = 0
                throw r4
            L30:
                o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
                java.lang.String r4 = r4.scheme
                r5.onExtraCallbackWithResult(r6, r2, r1, r4)
            L37:
                int r4 = viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onWarmupCompleted
                int r4 = r4 + 1
                int r5 = r4 % 128
                viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.IAuthTabCallback = r5
                int r4 = r4 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage.SchemeActionInfo.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferResultPage$SchemeActionInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ SchemeActionInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 119;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 79;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str = null;
            }
            this(str);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.scheme;
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            return str;
        }
    }
}
