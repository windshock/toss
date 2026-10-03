package viva.republica.toss.appsintoss;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.appsintoss.iap.InAppPurchasePreparationActivity;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERTaggedObject;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QueryProductDetailsParamsProduct;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.RightClickGesturesKtonRightClickDown2;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1;
import o.access13800;
import o.access5300;
import o.addFixedPosition;
import o.dequeImageProxy;
import o.getAdjustedTime;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.isRepeatingEnabled;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.toMetersPerSecond;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$;

@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AppsInTossSubscriptionDemoActivity extends Hilt_AppsInTossSubscriptionDemoActivity {
    private final Lazy IAuthTabCallback = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(AppsInTossSubscriptionDemoViewModel.class), new asBinder(this), new IAuthTabCallbackDefault(this), new IAuthTabCallbackStub(null, this));
    private final IEngagementSignalsCallback_Parcel<Intent> onExtraCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda4
        public final Object invoke(Object obj) {
            return AppsInTossSubscriptionDemoActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private QueryProductDetailsParamsProduct onExtraCallbackWithResult = new QueryProductDetailsParamsProduct.onExtraCallbackWithResult().onExtraCallback(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final AppsInTossSubscriptionDemoViewModel onExtraCallbackWithResult() {
        return (AppsInTossSubscriptionDemoViewModel) this.IAuthTabCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        String str;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            str = "구독 성공";
        } else {
            str = "구독 실패";
        }
        Toast.makeText((Context) appsInTossSubscriptionDemoActivity, (CharSequence) str, 0).show();
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackDefault implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1278188928, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda8(this))), 1, (Object) null);
        onWarmupCompleted();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public asBinder(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onWarmupCompleted.getViewModelStore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1278188928, i, -1, "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:77)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1734988504, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda5(appsInTossSubscriptionDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 IAuthTabCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStub(Function0 function0, ComponentActivity componentActivity) {
            this.IAuthTabCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.IAuthTabCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onWarmupCompleted.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1734988504, i, -1, "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:78)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, ForwardingCameraControl.onExtraCallback(1137263283, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda6(appsInTossSubscriptionDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-41389606, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda7(appsInTossSubscriptionDemoActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 12582912, 131066);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity) {
        appsInTossSubscriptionDemoActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit asBinder(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity r13, o.CameraCaptureResultEmptyCameraCaptureResult r14, int r15) {
        /*
            r2 = r15 & 3
            r3 = 2
            if (r2 == r3) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            r3 = r15 & 1
            boolean r2 = r14.onWarmupCompleted(r2, r3)
            if (r2 == 0) goto L5c
            boolean r2 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r2 == 0) goto L1f
            r2 = -1
            java.lang.String r3 = "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:81)"
            r4 = 1137263283(0x43c942b3, float:402.5211)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r4, r15, r2, r3)
        L1f:
            boolean r1 = r14.onExtraCallback(r13)
            java.lang.Object r2 = r14.onMinimized()
            if (r1 != 0) goto L31
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r1 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r1 = r1.onExtraCallback()
            if (r2 != r1) goto L39
        L31:
            viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda9 r2 = new viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda9
            r2.<init>(r13)
            r14.onWarmupCompleted(r2)
        L39:
            r0 = r2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            o.DERUnknownTag r1 = o.DERUnknownTag.onWarmupCompleted
            o.getBacktraceNote r9 = r1.onExtraCallback()
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = 126(0x7e, float:1.77E-43)
            r10 = r14
            o.MaxAdViewAdapterListener.onWarmupCompleted(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto L5f
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto L5f
        L5c:
            r14.ICustomTabsCallbackStubProxy()
        L5f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.asBinder(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v13 ??, still in use, count: 1, list:
          (r3v13 ?? I:java.lang.Object) from 0x00fb: INVOKE (r25v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r3v13 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:469)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onExtraCallbackWithResult(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v13 ??, still in use, count: 1, list:
          (r3v13 ?? I:java.lang.Object) from 0x00fb: INVOKE (r25v0 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r3v13 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:469)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-150437083, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda0(appsInTossSubscriptionDemoActivity, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-1890016690, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda1(appsInTossSubscriptionDemoActivity)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-128800019, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda2(cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>>) cameraPresenceProviderExternalSyntheticLambda65).size(), (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(1094169724, true, new AppsInTossSubscriptionDemoActivity$.ExternalSyntheticLambda3(appsInTossSubscriptionDemoActivity, cameraPresenceProviderExternalSyntheticLambda65)), 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-150437083, i, -1, "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:99)");
            }
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<String>) cameraPresenceProviderExternalSyntheticLambda6);
            String strOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<String>) cameraPresenceProviderExternalSyntheticLambda62);
            String strOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<String>) cameraPresenceProviderExternalSyntheticLambda63);
            AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult = appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function1 function1 = (access5300) objOnMinimized;
            AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult2 = appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult2);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onWarmupCompleted(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            Function1 function12 = (access5300) objOnMinimized2;
            AppsInTossSubscriptionDemoViewModel appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult3 = appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult();
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult3);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new onExtraCallback(appsInTossSubscriptionDemoViewModelOnExtraCallbackWithResult3);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getAdjustedTime.onWarmupCompleted(strOnExtraCallbackWithResult, strOnNavigationEvent, strOnExtraCallback, function1, function12, (access5300) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<String, Unit> {
        IAuthTabCallback(Object obj) {
            super(1, obj, AppsInTossSubscriptionDemoViewModel.class, "updateDeploymentId", "updateDeploymentId(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((String) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ((AppsInTossSubscriptionDemoViewModel) ((CallableReference) this).receiver).onNavigationEvent(str);
        }
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<String, Unit> {
        onWarmupCompleted(Object obj) {
            super(1, obj, AppsInTossSubscriptionDemoViewModel.class, "updateAppName", "updateAppName(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((String) obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = {(AppsInTossSubscriptionDemoViewModel) ((CallableReference) this).receiver, str};
            int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
            int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
            AppsInTossSubscriptionDemoViewModel.onExtraCallback(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 906322503, objArr, iIAuthTabCallback, iIAuthTabCallback2, -906322503);
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<String, Unit> {
        onExtraCallback(Object obj) {
            super(1, obj, AppsInTossSubscriptionDemoViewModel.class, "updateOfferId", "updateOfferId(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((String) obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ((AppsInTossSubscriptionDemoViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onExtraCallback(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity r20, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r21, o.CameraCaptureResultEmptyCameraCaptureResult r22, int r23) {
        /*
            r0 = r20
            r10 = r22
            r1 = r23
            java.lang.String r2 = ""
            r3 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = r1 & 17
            r3 = 16
            r4 = 1
            r5 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            if (r2 == r3) goto L1a
            r5 = r4
        L1a:
            r2 = r1 & 1
            boolean r2 = r10.onWarmupCompleted(r5, r2)
            if (r2 == 0) goto La4
            boolean r2 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r2 == 0) goto L31
            r2 = -1
            java.lang.String r3 = "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:109)"
            r5 = -1890016690(0xffffffff8f58a24e, float:-1.0680881E-29)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r5, r1, r2, r3)
        L31:
            o.QuirksExternalSyntheticBackport0$onExtraCallback r1 = o.QuirksExternalSyntheticBackport0.Companion
            r2 = 0
            r3 = 0
            o.QuirksExternalSyntheticBackport0 r11 = o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(r1, r2, r4, r3)
            r1 = 1094713344(0x41400000, float:12.0)
            float r13 = o.VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r1)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 13
            r17 = 0
            o.QuirksExternalSyntheticBackport0 r1 = o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = r10.onExtraCallback(r0)
            java.lang.Object r3 = r22.onMinimized()
            if (r2 != 0) goto L5c
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r2 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r2 = r2.onExtraCallback()
            if (r3 != r2) goto L64
        L5c:
            viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda12 r3 = new viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda12
            r3.<init>(r0)
            r10.onWarmupCompleted(r3)
        L64:
            r6 = r3
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            java.lang.String r0 = "상품 불러오기"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 54
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r8 = 956(0x3bc, float:1.34E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r8 = r9
            r10 = r22
            java.lang.Object[] r15 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            int r13 = o.setAutoCaptured.onExtraCallbackWithResult()
            int r17 = o.setAutoCaptured.onExtraCallbackWithResult()
            int r18 = o.setAutoCaptured.onExtraCallbackWithResult()
            int r19 = o.setAutoCaptured.onExtraCallbackWithResult()
            r14 = -1453984414(0xffffffffa955f562, float:-4.7508337E-14)
            r16 = 1453984418(0x56aa0aa2, float:9.348132E13)
            o.setAdvertiser.onExtraCallbackWithResult(r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r0 == 0) goto La7
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto La7
        La4:
            r22.ICustomTabsCallbackStubProxy()
        La7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onExtraCallback(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity) {
        appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult().IAuthTabCallbackDefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jLongValue;
        long jLongValue2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-128800019, i, -1, "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:118)");
            }
            if (IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1675512419);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(777243284);
                    jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(777244244);
                    jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"상품을 불러오는 중...", quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(jLongValue2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 54, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>>) cameraPresenceProviderExternalSyntheticLambda62).isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1675039390);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 13, (Object) null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(777262356);
                    jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(777263316);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"구독 상품이 없습니다. 미니앱 정보를 입력 후 조회해주세요.", quirksExternalSyntheticBackport0OnExtraCallback2, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 54, 196608, 98292}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1674498347);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onNavigationEvent(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity r8, o.CameraPresenceProviderExternalSyntheticLambda6 r9, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r10, int r11, o.CameraCaptureResultEmptyCameraCaptureResult r12, int r13) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10 = r13 & 48
            if (r10 != 0) goto L15
            boolean r10 = r12.onExtraCallback(r11)
            if (r10 == 0) goto L12
            r10 = 32
            goto L14
        L12:
            r10 = 16
        L14:
            r13 = r13 | r10
        L15:
            r10 = r13 & 145(0x91, float:2.03E-43)
            r0 = 144(0x90, float:2.02E-43)
            r1 = 1
            if (r10 == r0) goto L1e
            r10 = r1
            goto L1f
        L1e:
            r10 = 0
        L1f:
            r0 = r13 & 1
            boolean r10 = r12.onWarmupCompleted(r10, r0)
            if (r10 == 0) goto L81
            boolean r10 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r10 == 0) goto L36
            r10 = -1
            java.lang.String r0 = "viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsInTossSubscriptionDemoActivity.kt:137)"
            r2 = 1094169724(0x4137b47c, float:11.481564)
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r2, r13, r10, r0)
        L36:
            java.util.List r9 = onWarmupCompleted(r9)
            java.lang.Object r9 = r9.get(r11)
            r3 = r9
            o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1 r3 = (o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1) r3
            o.QuirksExternalSyntheticBackport0$onExtraCallback r9 = o.QuirksExternalSyntheticBackport0.Companion
            r10 = 1090519040(0x41000000, float:8.0)
            float r10 = o.VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r10)
            r11 = 0
            r13 = 0
            o.QuirksExternalSyntheticBackport0 r2 = o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(r9, r11, r10, r1, r13)
            boolean r9 = r12.onExtraCallback(r8)
            java.lang.Object r10 = r12.onMinimized()
            if (r9 != 0) goto L61
            o.CameraCaptureResultEmptyCameraCaptureResult$onWarmupCompleted r9 = o.CameraCaptureResultEmptyCameraCaptureResult.Companion
            java.lang.Object r9 = r9.onExtraCallback()
            if (r10 != r9) goto L69
        L61:
            viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda11 r10 = new viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity$$ExternalSyntheticLambda11
            r10.<init>(r8)
            r12.onWarmupCompleted(r10)
        L69:
            r4 = r10
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            int r8 = o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1.onNavigationEvent
            int r8 = r8 << 3
            r6 = r8 | 6
            r7 = 0
            r5 = r12
            o.getAdjustedTime.onWarmupCompleted(r2, r3, r4, r5, r6, r7)
            boolean r8 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r8 == 0) goto L84
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto L84
        L81:
            r12.ICustomTabsCallbackStubProxy()
        L84:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity.onNavigationEvent(viva.republica.toss.appsintoss.AppsInTossSubscriptionDemoActivity, o.CameraPresenceProviderExternalSyntheticLambda6, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, int, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(AppsInTossSubscriptionDemoActivity appsInTossSubscriptionDemoActivity, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null) {
            str2 = appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult().IAuthTabCallback();
        }
        appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult().asBinder();
        appsInTossSubscriptionDemoActivity.onExtraCallback.onNavigationEvent(InAppPurchasePreparationActivity.Companion.onExtraCallback(appsInTossSubscriptionDemoActivity, appsInTossSubscriptionDemoActivity.onExtraCallbackWithResult().onNavigationEvent(), str, InAppPurchaseProductAuthorizer.PARTNER, "SUBSCRIPTION", str2));
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted() {
        this.onExtraCallbackWithResult.onNavigationEvent(new onNavigationEvent(this));
    }

    private static final String onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<String> cameraPresenceProviderExternalSyntheticLambda6) {
        return (String) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
    }

    private static final String onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<String> cameraPresenceProviderExternalSyntheticLambda6) {
        return (String) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
    }

    private static final String onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<String> cameraPresenceProviderExternalSyntheticLambda6) {
        return (String) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
    }

    private static final List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1> onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends List<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda1>> cameraPresenceProviderExternalSyntheticLambda6) {
        return (List) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
    }

    private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.appsintoss.Hilt_AppsInTossSubscriptionDemoActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
