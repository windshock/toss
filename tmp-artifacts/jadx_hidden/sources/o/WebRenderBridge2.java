package o;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferInputAmountModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferInputMessageModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferInputReceiverModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferInputSenderModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferRefreshParamsRequest;
import im.toss.global.features.transfer.data.model.region.eu.EuTransferSendRequest;
import im.toss.global.features.transfer.data.model.send.GlobalTransferSendResponse;
import im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse;
import im.toss.global.features.transfer.data.model.session.output.GlobalTransferSessionOutputBaseResponse;
import im.toss.global.features.transfer.domain.account.eu.EuAccountModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class WebRenderBridge2 {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    public static final int IAuthTabCallback = 8;
    private static int extraCallback = 0;
    private static int onActivityResized = 0;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 1;
    private final getCornerRadius<GlobalTransferSessionResponse<EuTransferInputModel, EuTransferOutputModel>> IAuthTabCallbackDefault;
    private final getCornerRadius<Integer> IAuthTabCallbackStub;
    private final setRubIn<List<back>> IAuthTabCallbackStubProxy;
    private final setRubIn<GlobalTransferSendResponse<EuAccountModel, EuTransferInputAmountModel>> IAuthTabCallback_Parcel;
    private final setRubIn<GlobalTransferSessionResponse<EuTransferInputModel, EuTransferOutputModel>> ICustomTabsCallback;
    private final setRubIn<EuTransferInputModel> access000;
    private final setRubIn<EuTransferOutputModel> access100;
    private final MiniWebView3 asBinder;
    private final getCornerRadius<GlobalTransferSendResponse<EuAccountModel, EuTransferInputAmountModel>> asInterface;
    private final setRubIn<Integer> extraCallbackWithResult;
    private final setRubIn<EuTransferSendRequest> getInterfaceDescriptor;
    private final getCornerRadius<EuTransferOutputModel> onExtraCallback;
    private final getCornerRadius<EuTransferInputModel> onExtraCallbackWithResult;
    private final getCornerRadius<List<back>> onNavigationEvent;
    private final getCornerRadius<EuTransferSendRequest> onTransact;
    private String onWarmupCompleted;
    private TextLinkScopeExternalSyntheticLambda7 readTypedObject;
    private final findResAndMsg writeTypedObject;

    static {
        int i = extraCallback + 3;
        onMessageChannelReady = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i5) | i3)) | (~(i3 | i));
        int i8 = (~i3) | (~i);
        int i9 = i7 | (~(i8 | i5));
        int i10 = (~i8) | i5;
        int i11 = ~(i | i5);
        int i12 = i5 + i3 + i2 + ((-417414852) * i6) + (1247522396 * i4);
        int i13 = i12 * i12;
        int i14 = (i5 * (-1219797419)) + 1526988800 + ((-1219797419) * i3) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i2) + ((-2135949312) * i6) + ((-953155584) * i4) + ((-430374912) * i13);
        int i15 = ((i5 * 184508743) - 476012450) + (i3 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i2 * 184509739) + (i6 * (-953474796)) + (i4 * (-288057996)) + (i13 * (-839712768));
        int i16 = i14 + (i15 * i15 * 1709113344);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        WebRenderBridge2 webRenderBridge2 = (WebRenderBridge2) objArr[0];
        int i17 = 2 % 2;
        int i18 = onMinimized;
        int i19 = i18 + 91;
        onActivityResized = i19 % 128;
        int i20 = i19 % 2;
        getCornerRadius<EuTransferInputModel> getcornerradius = webRenderBridge2.onExtraCallbackWithResult;
        int i21 = i18 + 39;
        onActivityResized = i21 % 128;
        int i22 = i21 % 2;
        return getcornerradius;
    }

    @Inject
    public WebRenderBridge2(@NotNull MiniWebView3 miniWebView3) {
        Intrinsics.checkNotNullParameter(miniWebView3, "");
        this.asBinder = miniWebView3;
        this.writeTypedObject = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        getCornerRadius<Integer> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(-1);
        this.IAuthTabCallbackStub = getcornerradiusOnNavigationEvent;
        this.extraCallbackWithResult = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getCornerRadius<GlobalTransferSessionResponse<EuTransferInputModel, EuTransferOutputModel>> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackDefault = getcornerradiusOnNavigationEvent2;
        this.ICustomTabsCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        getCornerRadius<EuTransferInputModel> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(new EuTransferInputModel((EuTransferInputSenderModel) null, (EuTransferInputReceiverModel) null, (EuTransferInputAmountModel) null, (EuTransferInputMessageModel) null, 15, (DefaultConstructorMarker) null));
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent3;
        this.access000 = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        getCornerRadius<EuTransferOutputModel> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(new EuTransferOutputModel((GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, 255, (DefaultConstructorMarker) null));
        this.onExtraCallback = getcornerradiusOnNavigationEvent4;
        this.access100 = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        getCornerRadius<List<back>> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.onNavigationEvent = getcornerradiusOnNavigationEvent5;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent5);
        getCornerRadius<EuTransferSendRequest> getcornerradiusOnNavigationEvent6 = setShine.onNavigationEvent((Object) null);
        this.onTransact = getcornerradiusOnNavigationEvent6;
        this.getInterfaceDescriptor = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent6);
        getCornerRadius<GlobalTransferSendResponse<EuAccountModel, EuTransferInputAmountModel>> getcornerradiusOnNavigationEvent7 = setShine.onNavigationEvent((Object) null);
        this.asInterface = getcornerradiusOnNavigationEvent7;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent7);
    }

    public static final /* synthetic */ MiniWebView3 onNavigationEvent(WebRenderBridge2 webRenderBridge2) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 49;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        MiniWebView3 miniWebView3 = webRenderBridge2.asBinder;
        int i5 = i2 + 59;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return miniWebView3;
        }
        throw null;
    }

    public static final /* synthetic */ EuTransferRefreshParamsRequest onWarmupCompleted(WebRenderBridge2 webRenderBridge2, List list) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return webRenderBridge2.IAuthTabCallback((List<? extends back>) list);
        }
        webRenderBridge2.IAuthTabCallback((List<? extends back>) list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setRubIn<Integer> asBinder() {
        int i = 2 % 2;
        int i2 = onMinimized + 13;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        setRubIn<Integer> setrubin = this.extraCallbackWithResult;
        int i5 = i3 + 73;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setRubIn<EuTransferInputModel> onWarmupCompleted() {
        setRubIn<EuTransferInputModel> setrubin;
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 != 0) {
            setrubin = this.access000;
            int i4 = 74 / 0;
        } else {
            setrubin = this.access000;
        }
        int i5 = i3 + 73;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public setRubIn<EuTransferOutputModel> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityResized + 29;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        setRubIn<EuTransferOutputModel> setrubin = this.access100;
        int i5 = i3 + 13;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public setRubIn<List<back>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<GlobalTransferSendResponse<EuAccountModel, EuTransferInputAmountModel>> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 11;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 33;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 25;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void onExtraCallback(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @Nullable String str) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        if (this.readTypedObject == null) {
            this.readTypedObject = textLinkScopeExternalSyntheticLambda7;
            this.onWarmupCompleted = str;
            Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("global_transfer_session_id");
            if (num != null) {
                int i2 = onMinimized + 17;
                onActivityResized = i2 % 128;
                if (i2 % 2 != 0) {
                    num.intValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            if (iIntValue != -1) {
                this.IAuthTabCallbackStub.onWarmupCompleted(Integer.valueOf(iIntValue));
                int i3 = onActivityResized + 33;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel r7, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel>>> r8) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onExtraCallbackWithResult(im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallback(int r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel>>> r9) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onExtraCallback(int, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel>>> r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof o.WebRenderBridge2.onTransact
            if (r1 == 0) goto L28
            r1 = r8
            o.WebRenderBridge2$onTransact r1 = (o.WebRenderBridge2.onTransact) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L28
            int r8 = o.WebRenderBridge2.onActivityResized
            int r8 = r8 + 3
            int r4 = r8 % 128
            o.WebRenderBridge2.onMinimized = r4
            int r8 = r8 % r0
            int r2 = r2 + r3
            r1.label = r2
            int r8 = o.WebRenderBridge2.onActivityResized
            int r8 = r8 + 91
            int r2 = r8 % 128
            o.WebRenderBridge2.onMinimized = r2
            int r8 = r8 % r0
            goto L2d
        L28:
            o.WebRenderBridge2$onTransact r1 = new o.WebRenderBridge2$onTransact
            r1.<init>(r7, r8)
        L2d:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L53
            int r2 = o.WebRenderBridge2.onMinimized
            int r2 = r2 + 39
            int r5 = r2 % 128
            o.WebRenderBridge2.onActivityResized = r5
            int r2 = r2 % r0
            if (r3 != r4) goto L4b
            java.lang.Object r1 = r1.L$0
            o.access13800 r1 = (o.access13800) r1
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            goto L8a
        L4b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L53:
            kotlin.ResultKt.onNavigationEvent(r8)
            java.lang.Object r8 = r7.IAuthTabCallbackStub()
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r3 != 0) goto Lbf
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            o.GeckoHubImp r3 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            o.WebRenderBridge2$IAuthTabCallbackStub r5 = new o.WebRenderBridge2$IAuthTabCallbackStub     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r6 = 0
            r5.<init>(r6, r7, r8)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            java.lang.Object r6 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r1.L$0 = r6     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r1.I$0 = r8     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r8 = 0
            r1.I$1 = r8     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r1.I$2 = r8     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r1.I$3 = r8     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            r1.label = r4     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r3, r5, r1)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            if (r8 != r2) goto L8a
            return r2
        L8a:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L8f java.util.concurrent.CancellationException -> L9b o.WebResourceResponseModel -> L9d
            goto La8
        L8f:
            r8 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto La8
        L9b:
            r8 = move-exception
            throw r8
        L9d:
            r8 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        La8:
            boolean r1 = kotlin.Result.onNavigationEvent(r8)
            r1 = r1 ^ r4
            if (r1 == r4) goto Lbe
            int r1 = o.WebRenderBridge2.onActivityResized
            int r1 = r1 + 51
            int r2 = r1 % 128
            o.WebRenderBridge2.onMinimized = r2
            int r1 = r1 % r0
            r0 = r8
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r0 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r0
            r7.IAuthTabCallback(r0)
        Lbe:
            return r8
        Lbf:
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onNavigationEvent(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel>>> r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.WebRenderBridge2.onMinimized
            int r1 = r1 + 71
            int r2 = r1 % 128
            o.WebRenderBridge2.onActivityResized = r2
            int r1 = r1 % r0
            boolean r1 = r9 instanceof o.WebRenderBridge2.extraCallback
            if (r1 == 0) goto L1f
            r1 = r9
            o.WebRenderBridge2$extraCallback r1 = (o.WebRenderBridge2.extraCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L2d
        L1f:
            o.WebRenderBridge2$extraCallback r1 = new o.WebRenderBridge2$extraCallback
            r1.<init>(r7, r9)
            int r9 = o.WebRenderBridge2.onActivityResized
            int r9 = r9 + 99
            int r2 = r9 % 128
            o.WebRenderBridge2.onMinimized = r2
            int r9 = r9 % r0
        L2d:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L4e
            if (r3 != r4) goto L46
            java.lang.Object r8 = r1.L$1
            o.access13800 r8 = (o.access13800) r8
            java.lang.Object r8 = r1.L$0
            im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel r8 = (im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel) r8
            kotlin.ResultKt.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            goto L94
        L46:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4e:
            kotlin.ResultKt.onNavigationEvent(r9)
            java.lang.Object r9 = r7.IAuthTabCallbackStub()
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r9)
            if (r3 != 0) goto Lc8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            o.GeckoHubImp r3 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            o.WebRenderBridge2$onMinimized r5 = new o.WebRenderBridge2$onMinimized     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r6 = 0
            r5.<init>(r6, r7, r9, r8)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            java.lang.Object r8 = o.access15400.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.L$0 = r8     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            java.lang.Object r8 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.L$1 = r8     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.I$0 = r9     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r8 = 0
            r1.I$1 = r8     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.I$2 = r8     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.I$3 = r8     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.label = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            java.lang.Object r9 = o.maybeUpdateAnimatable.onExtraCallback(r3, r5, r1)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            if (r9 != r2) goto L94
            int r8 = o.WebRenderBridge2.onMinimized
            int r8 = r8 + 83
            int r9 = r8 % 128
            o.WebRenderBridge2.onActivityResized = r9
            int r8 = r8 % r0
            return r2
        L94:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r9)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            goto Lb2
        L99:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto Lb2
        La5:
            r8 = move-exception
            throw r8
        La7:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        Lb2:
            boolean r9 = kotlin.Result.onNavigationEvent(r8)
            if (r9 == 0) goto Lc7
            r9 = r8
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r9 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r9
            r7.IAuthTabCallback(r9)
            int r9 = o.WebRenderBridge2.onActivityResized
            int r9 = r9 + 95
            int r1 = r9 % 128
            o.WebRenderBridge2.onMinimized = r1
            int r9 = r9 % r0
        Lc7:
            return r8
        Lc8:
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onWarmupCompleted(im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.util.List<? extends o.back> r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.eu.EuTransferInputModel, im.toss.global.features.transfer.data.model.region.eu.EuTransferOutputModel>>> r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onExtraCallbackWithResult(java.util.List, o.access13800):java.lang.Object");
    }

    public void onWarmupCompleted(@Nullable String str) {
        EuTransferInputMessageModel euTransferInputMessageModel;
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<EuTransferInputModel> getcornerradius = this.onExtraCallbackWithResult;
        EuTransferInputModel euTransferInputModel = (EuTransferInputModel) getcornerradius.IAuthTabCallback();
        if (str != null) {
            EuTransferInputMessageModel euTransferInputMessageModel2 = new EuTransferInputMessageModel(str);
            int i4 = onActivityResized + 65;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            euTransferInputMessageModel = euTransferInputMessageModel2;
        } else {
            euTransferInputMessageModel = null;
        }
        getcornerradius.onWarmupCompleted(EuTransferInputModel.onExtraCallbackWithResult(euTransferInputModel, (EuTransferInputSenderModel) null, (EuTransferInputReceiverModel) null, (EuTransferInputAmountModel) null, euTransferInputMessageModel, 7, (Object) null));
        int i6 = onActivityResized + 107;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onNavigationEvent(@NotNull EuTransferInputModel euTransferInputModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 19;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(euTransferInputModel, "");
        this.onExtraCallbackWithResult.onWarmupCompleted(euTransferInputModel);
        int i4 = onMinimized + 13;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onTransact() {
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) asBinder().IAuthTabCallback()).intValue() == -1) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(this.writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, (access13800) null), 3, (Object) null);
        int i4 = onMinimized + 29;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public void asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) asBinder().IAuthTabCallback()).intValue() == -1) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(this.writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new writeTypedObject(this, (access13800) null), 3, (Object) null);
        int i4 = onMinimized + 77;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    public List<back> IAuthTabCallback(@NotNull EuTransferOutputModel euTransferOutputModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(euTransferOutputModel, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(WebBridgeResponse.onWarmupCompleted(euTransferOutputModel));
        if (euTransferOutputModel.asBinder() instanceof GlobalTransferSessionOutputBaseResponse.Fail) {
            int i4 = onMinimized + 107;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
            listCreateListBuilder.add(back.RECEIVER_POSTAL_ADDRESS);
            int i6 = onActivityResized + 111;
            onMinimized = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 5;
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public void onNavigationEvent(@NotNull List<? extends back> list) {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            list.isEmpty();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            this.onNavigationEvent.onWarmupCompleted(CollectionsKt.emptyList());
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(this.writeTypedObject, (CoroutineContext) null, (setRandomHost) null, new readTypedObject(this, list, (access13800) null), 3, (Object) null);
        int i3 = onActivityResized + 119;
        onMinimized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.onWarmupCompleted(-1);
        this.IAuthTabCallbackDefault.onWarmupCompleted((Object) null);
        this.onExtraCallbackWithResult.onWarmupCompleted(new EuTransferInputModel((EuTransferInputSenderModel) null, (EuTransferInputReceiverModel) null, (EuTransferInputAmountModel) null, (EuTransferInputMessageModel) null, 15, (DefaultConstructorMarker) null));
        this.onExtraCallback.onWarmupCompleted(new EuTransferOutputModel((GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, 255, (DefaultConstructorMarker) null));
        this.onNavigationEvent.onWarmupCompleted(CollectionsKt.emptyList());
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = this.readTypedObject;
        if (textLinkScopeExternalSyntheticLambda7 != null) {
            int i2 = onActivityResized + 55;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.region.eu.EuTransferPrepareResponse>> r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    public final void onExtraCallbackWithResult(@NotNull EuTransferSendRequest euTransferSendRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(euTransferSendRequest, "");
        this.onTransact.onWarmupCompleted(euTransferSendRequest);
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = this.readTypedObject;
        if (textLinkScopeExternalSyntheticLambda7 != null) {
            int i2 = onActivityResized + 71;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            textLinkScopeExternalSyntheticLambda7.onWarmupCompleted("eu_transfer_request", euTransferSendRequest);
            int i4 = onActivityResized + 5;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onMinimized + 115;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WebRenderBridge2 webRenderBridge2 = (WebRenderBridge2) objArr[0];
        GlobalTransferSessionResponse globalTransferSessionResponse = (GlobalTransferSessionResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 111;
        onMinimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            webRenderBridge2.onExtraCallback(globalTransferSessionResponse.onWarmupCompleted());
            webRenderBridge2.IAuthTabCallbackDefault.onWarmupCompleted(globalTransferSessionResponse);
            webRenderBridge2.onExtraCallbackWithResult.onWarmupCompleted(globalTransferSessionResponse.IAuthTabCallback());
            webRenderBridge2.onExtraCallback.onWarmupCompleted(globalTransferSessionResponse.onExtraCallbackWithResult());
            return null;
        }
        webRenderBridge2.onExtraCallback(globalTransferSessionResponse.onWarmupCompleted());
        webRenderBridge2.IAuthTabCallbackDefault.onWarmupCompleted(globalTransferSessionResponse);
        webRenderBridge2.onExtraCallbackWithResult.onWarmupCompleted(globalTransferSessionResponse.IAuthTabCallback());
        webRenderBridge2.onExtraCallback.onWarmupCompleted(globalTransferSessionResponse.onExtraCallbackWithResult());
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(GlobalTransferSendResponse<? extends EuAccountModel, EuTransferInputAmountModel> globalTransferSendResponse) {
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.onWarmupCompleted(globalTransferSendResponse);
        if (i3 == 0) {
            throw null;
        }
    }

    private final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 75;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallbackStub.onWarmupCompleted(Integer.valueOf(i));
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = this.readTypedObject;
            if (textLinkScopeExternalSyntheticLambda7 != null) {
                textLinkScopeExternalSyntheticLambda7.onWarmupCompleted("global_transfer_session_id", Integer.valueOf(i));
            }
            int i4 = onActivityResized + 115;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.IAuthTabCallbackStub.onWarmupCompleted(Integer.valueOf(i));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        Object objIAuthTabCallback = ((WebRenderBridge2) objArr[0]).asBinder().IAuthTabCallback();
        if (((Number) objIAuthTabCallback).intValue() == -1) {
            objIAuthTabCallback = null;
        }
        Integer num = (Integer) objIAuthTabCallback;
        if (num == null) {
            Result.Companion companion = Result.Companion;
            Object obj = Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("Global transfer session is not initialized.")));
            int i2 = onMinimized + 85;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        }
        int iIntValue = num.intValue();
        Result.Companion companion2 = Result.Companion;
        Object obj2 = Result.constructor-impl(Integer.valueOf(iIntValue));
        int i4 = onActivityResized + 49;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return obj2;
    }

    private final EuTransferRefreshParamsRequest IAuthTabCallback(List<? extends back> list) {
        int i = 2 % 2;
        EuTransferRefreshParamsRequest euTransferRefreshParamsRequest = new EuTransferRefreshParamsRequest(list.contains(back.SENDER_ACCOUNT_META), list.contains(back.SENDER_BALANCE), list.contains(back.RECEIVER_ACCOUNT_META), list.contains(back.RECEIVER_VERIFICATION), list.contains(back.RECEIVER_POSTAL_ADDRESS));
        int i2 = onActivityResized + 117;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return euTransferRefreshParamsRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IAuthTabCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.account.GlobalTransferRecommendSenderResponse<im.toss.global.features.transfer.domain.account.eu.EuAccountModel>>> r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.WebRenderBridge2.onActivityResized
            int r1 = r1 + 81
            int r2 = r1 % 128
            o.WebRenderBridge2.onMinimized = r2
            int r1 = r1 % r0
            boolean r1 = r7 instanceof o.WebRenderBridge2.onExtraCallback
            if (r1 == 0) goto L1f
            r1 = r7
            o.WebRenderBridge2$onExtraCallback r1 = (o.WebRenderBridge2.onExtraCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L24
        L1f:
            o.WebRenderBridge2$onExtraCallback r1 = new o.WebRenderBridge2$onExtraCallback
            r1.<init>(r6, r7)
        L24:
            java.lang.Object r7 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L62
            if (r3 != r5) goto L5a
            int r2 = o.WebRenderBridge2.onMinimized
            int r2 = r2 + 95
            int r3 = r2 % 128
            o.WebRenderBridge2.onActivityResized = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L52
            java.lang.Object r1 = r1.L$0
            o.access13800 r1 = (o.access13800) r1
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            int r1 = o.WebRenderBridge2.onMinimized
            r2 = 5
            int r1 = r1 + r2
            int r3 = r1 % 128
            o.WebRenderBridge2.onActivityResized = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L94
            int r2 = r2 % 4
            goto L94
        L52:
            java.lang.Object r1 = r1.L$0
            o.access13800 r1 = (o.access13800) r1
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            throw r4
        L5a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L62:
            kotlin.ResultKt.onNavigationEvent(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            o.GeckoHubImp r7 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            o.WebRenderBridge2$IAuthTabCallbackDefault r3 = new o.WebRenderBridge2$IAuthTabCallbackDefault     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r3.<init>(r4, r6)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            java.lang.Object r4 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.L$0 = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r4 = 0
            r1.I$0 = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.I$1 = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.I$2 = r4     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            r1.label = r5     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            java.lang.Object r7 = o.maybeUpdateAnimatable.onExtraCallback(r7, r3, r1)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            if (r7 != r2) goto L94
            int r7 = o.WebRenderBridge2.onActivityResized
            int r7 = r7 + 61
            int r1 = r7 % 128
            o.WebRenderBridge2.onMinimized = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L93
            r7 = 45
            int r7 = r7 / r4
        L93:
            return r2
        L94:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)     // Catch: java.lang.Exception -> L99 java.util.concurrent.CancellationException -> La5 o.WebResourceResponseModel -> La7
            return r7
        L99:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto Lbb
        La5:
            r7 = move-exception
            throw r7
        La7:
            r7 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            int r1 = o.WebRenderBridge2.onMinimized
            int r1 = r1 + 105
            int r2 = r1 % 128
            o.WebRenderBridge2.onActivityResized = r2
            int r1 = r1 % r0
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c A[Catch: Exception -> 0x015e, CancellationException -> 0x0173, WebResourceResponseModel -> 0x0175, TryCatch #4 {CancellationException -> 0x0173, Exception -> 0x015e, WebResourceResponseModel -> 0x0175, blocks: (B:32:0x008c, B:38:0x00c0, B:40:0x00e8, B:42:0x00ee, B:53:0x011d, B:56:0x0136, B:58:0x013c, B:59:0x0142, B:43:0x00f1, B:44:0x00f8, B:60:0x0150, B:62:0x0156, B:63:0x015c, B:46:0x00fa, B:48:0x0104, B:51:0x010f, B:52:0x011c, B:20:0x0055, B:22:0x0060, B:27:0x0068, B:35:0x0093), top: B:75:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r14) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge2.onExtraCallback(o.access13800):java.lang.Object");
    }

    public static final /* synthetic */ getCornerRadius onExtraCallbackWithResult(WebRenderBridge2 webRenderBridge2) {
        return (getCornerRadius) onNavigationEvent(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{webRenderBridge2}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1982602837, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1982602837, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private final void IAuthTabCallback(GlobalTransferSessionResponse<EuTransferInputModel, EuTransferOutputModel> globalTransferSessionResponse) {
        onNavigationEvent(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{this, globalTransferSessionResponse}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -1646904605, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 1646904607, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private final Object IAuthTabCallbackStub() {
        return onNavigationEvent(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{this}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 257327092, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -257327091, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }
}
