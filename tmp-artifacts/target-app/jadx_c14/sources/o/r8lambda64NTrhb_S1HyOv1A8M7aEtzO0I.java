package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.login.GlobalCoreResetPasswordResponse;
import viva.republica.toss.network.model.login.ResetPasswordResp;
import viva.republica.toss.network.model.verify.ResetPasswordResponse;
import viva.republica.toss.network.model.verify.global.GlobalResetPasswordResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I {
    private final DefaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private final Object onExtraCallback;

    @Inject
    public r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I(@NotNull DefaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1 defaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(defaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.IAuthTabCallback = defaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1;
        this.onExtraCallback = obj;
    }

    public final Object IAuthTabCallback(@NotNull Context context, long j, @Nullable isJSONTypeIgnore isjsontypeignore, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull asArray asarray, @NotNull asArray asarray2, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onExtraCallbackWithResult(isjsontypeignore, graniteBrownfieldModule_closeView, asarray2, asarray, j, context, this, z, null), access13800Var);
        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ isJSONTypeIgnore $authCredential;
        final /* synthetic */ Context $context;
        final /* synthetic */ asArray $currentPasswordFormat;
        final /* synthetic */ boolean $fromTossCert;
        final /* synthetic */ GraniteBrownfieldModule_closeView $newPassword;
        final /* synthetic */ asArray $newPasswordFormat;
        final /* synthetic */ long $verifySessionId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        final /* synthetic */ r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I this$0;
        private static final byte[] $$a = {98, -3, -80, -4};
        private static final int $$b = 229;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int onExtraCallback = -1063303080;
        private static char onExtraCallbackWithResult = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, short r8, int r9) {
            /*
                int r8 = 110 - r8
                byte[] r0 = o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onExtraCallbackWithResult.$$a
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r9 = r9 * 2
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onExtraCallbackWithResult.$$c(int, short, int):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(isJSONTypeIgnore isjsontypeignore, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, asArray asarray2, long j, Context context, r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I r8lambda64ntrhb_s1hyov1a8m7aetzo0i, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$authCredential = isjsontypeignore;
            this.$newPassword = graniteBrownfieldModule_closeView;
            this.$newPasswordFormat = asarray;
            this.$currentPasswordFormat = asarray2;
            this.$verifySessionId = j;
            this.$context = context;
            this.this$0 = r8lambda64ntrhb_s1hyov1a8m7aetzo0i;
            this.$fromTossCert = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$authCredential, this.$newPassword, this.$newPasswordFormat, this.$currentPasswordFormat, this.$verifySessionId, this.$context, this.this$0, this.$fromTossCert, access13800Var);
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
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

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return objInvokeSuspend;
        }

        public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter onExtraCallbackWithResult;
            final /* synthetic */ MapConverter onNavigationEvent;

            public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onNavigationEvent = mapConverter;
                this.onExtraCallbackWithResult = mapConverter2;
            }

            public final deserializeIp<ResetPasswordResp.Success> apply(writeRaw<BaseApiResponse<ResetPasswordResp.Success>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, "");
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q(new Function1<BaseApiResponse<ResetPasswordResp.Success>, deserializeIp<? extends ResetPasswordResp.Success>>() { // from class: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onExtraCallbackWithResult.IAuthTabCallback.5
                    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends ResetPasswordResp.Success> invoke(BaseApiResponse<ResetPasswordResp.Success> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = ResetPasswordResp.Success.class.newInstance();
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
                MapConverter mapConverter = this.onNavigationEvent;
                if (mapConverter != null) {
                    writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                    Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
                }
                MapConverter mapConverter2 = this.onExtraCallbackWithResult;
                if (mapConverter2 == null) {
                    return writerawOnExtraCallbackWithResult;
                }
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                return writerawIAuthTabCallback;
            }
        }

        public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter onNavigationEvent;
            final /* synthetic */ MapConverter onWarmupCompleted;

            public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onNavigationEvent = mapConverter;
                this.onWarmupCompleted = mapConverter2;
            }

            public final deserializeIp<ResetPasswordResponse> apply(writeRaw<BaseApiResponse<ResetPasswordResponse>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, "");
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q(new Function1<BaseApiResponse<ResetPasswordResponse>, deserializeIp<? extends ResetPasswordResponse>>() { // from class: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onExtraCallbackWithResult.onExtraCallback.3
                    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends ResetPasswordResponse> invoke(BaseApiResponse<ResetPasswordResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = ResetPasswordResponse.class.newInstance();
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
                MapConverter mapConverter = this.onNavigationEvent;
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

        /* JADX WARN: Code restructure failed: missing block: B:134:0x067c, code lost:
        
            if (((java.lang.reflect.Method) r3).invoke(r1, r2) == r10) goto L186;
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x0713, code lost:
        
            if (((java.lang.reflect.Method) r3).invoke(r2, r0) == r10) goto L186;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:126:0x05e3  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0638 A[Catch: all -> 0x07cc, TryCatch #9 {all -> 0x07cc, blocks: (B:178:0x078c, B:180:0x079d, B:181:0x07c4, B:129:0x062b, B:131:0x0638, B:133:0x0676, B:82:0x04a8, B:84:0x04c2, B:86:0x0502, B:71:0x03ca, B:73:0x03f2, B:74:0x0443, B:46:0x01ec, B:48:0x01f9, B:49:0x022b), top: B:196:0x01ec }] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0675  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0680  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x075d  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x079d A[Catch: all -> 0x07cc, TryCatch #9 {all -> 0x07cc, blocks: (B:178:0x078c, B:180:0x079d, B:181:0x07c4, B:129:0x062b, B:131:0x0638, B:133:0x0676, B:82:0x04a8, B:84:0x04c2, B:86:0x0502, B:71:0x03ca, B:73:0x03f2, B:74:0x0443, B:46:0x01ec, B:48:0x01f9, B:49:0x022b), top: B:196:0x01ec }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x02f1  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x03f2 A[Catch: all -> 0x07cc, TryCatch #9 {all -> 0x07cc, blocks: (B:178:0x078c, B:180:0x079d, B:181:0x07c4, B:129:0x062b, B:131:0x0638, B:133:0x0676, B:82:0x04a8, B:84:0x04c2, B:86:0x0502, B:71:0x03ca, B:73:0x03f2, B:74:0x0443, B:46:0x01ec, B:48:0x01f9, B:49:0x022b), top: B:196:0x01ec }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x044b  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0452  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x052f  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v35 */
        /* JADX WARN: Type inference failed for: r11v46 */
        /* JADX WARN: Type inference failed for: r11v47 */
        /* JADX WARN: Type inference failed for: r43v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r43v38 */
        /* JADX WARN: Type inference failed for: r43v39 */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v26 */
        /* JADX WARN: Type inference failed for: r5v3, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 2116
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $11 + 125;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 42 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 49123), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 1494 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 23972), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, View.getDefaultSize(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 45848), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), 12577 - (ViewConfiguration.getLongPressTimeout() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 99;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = -5987228809814249720L;
        final /* synthetic */ Context $context;
        final /* synthetic */ isJSONTypeIgnore $credential;
        final /* synthetic */ asArray $currentPasswordFormat;
        final /* synthetic */ boolean $needBiometricRegister;
        final /* synthetic */ GraniteBrownfieldModule_closeView $newPassword;
        final /* synthetic */ asArray $newPasswordFormat;
        final /* synthetic */ GetBillingConfigParamsBuilder $unifiedSessions;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isJSONTypeIgnore isjsontypeignore, GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, asArray asarray, asArray asarray2, GetBillingConfigParamsBuilder getBillingConfigParamsBuilder, Context context, boolean z, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$credential = isjsontypeignore;
            this.$newPassword = graniteBrownfieldModule_closeView;
            this.$newPasswordFormat = asarray;
            this.$currentPasswordFormat = asarray2;
            this.$unifiedSessions = getBillingConfigParamsBuilder;
            this.$context = context;
            this.$needBiometricRegister = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$credential, this.$newPassword, this.$newPasswordFormat, this.$currentPasswordFormat, this.$unifiedSessions, this.$context, this.$needBiometricRegister, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 36 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter onExtraCallback;
            final /* synthetic */ MapConverter onNavigationEvent;

            public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onNavigationEvent = mapConverter;
                this.onExtraCallback = mapConverter2;
            }

            public final deserializeIp<GlobalResetPasswordResponse> apply(writeRaw<BaseApiResponse<GlobalResetPasswordResponse>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, "");
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$r8lambda50PeDeOZ7xBZFvhmt63acaX0YUk(new Function1<BaseApiResponse<GlobalResetPasswordResponse>, deserializeIp<? extends GlobalResetPasswordResponse>>() { // from class: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onWarmupCompleted.IAuthTabCallback.2
                    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends GlobalResetPasswordResponse> invoke(BaseApiResponse<GlobalResetPasswordResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = GlobalResetPasswordResponse.class.newInstance();
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
                MapConverter mapConverter = this.onNavigationEvent;
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

        public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter IAuthTabCallback;
            final /* synthetic */ MapConverter onExtraCallback;

            public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
                this.onExtraCallback = mapConverter;
                this.IAuthTabCallback = mapConverter2;
            }

            public final deserializeIp<GlobalCoreResetPasswordResponse> apply(writeRaw<BaseApiResponse<GlobalCoreResetPasswordResponse>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, "");
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$r8lambda50PeDeOZ7xBZFvhmt63acaX0YUk(new Function1<BaseApiResponse<GlobalCoreResetPasswordResponse>, deserializeIp<? extends GlobalCoreResetPasswordResponse>>() { // from class: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onWarmupCompleted.onNavigationEvent.1
                    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends GlobalCoreResetPasswordResponse> invoke(BaseApiResponse<GlobalCoreResetPasswordResponse> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, "");
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = GlobalCoreResetPasswordResponse.class.newInstance();
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
                MapConverter mapConverter2 = this.IAuthTabCallback;
                if (mapConverter2 == null) {
                    return writerawOnExtraCallbackWithResult;
                }
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                return writerawIAuthTabCallback;
            }
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 111;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.indexOf("", "", 0)), ImageFormat.getBitsPerPixel(0) + 85, (ViewConfiguration.getJumpTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 19 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + 89;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0307, code lost:
        
            if (r0 == r2) goto L103;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x04b9 A[Catch: all -> 0x0673, TryCatch #0 {all -> 0x0673, blocks: (B:95:0x0632, B:97:0x0644, B:98:0x066b, B:82:0x0567, B:84:0x0582, B:85:0x05c2, B:72:0x0491, B:74:0x04b9, B:75:0x0508, B:41:0x0255, B:43:0x0262, B:44:0x0298, B:58:0x037e, B:60:0x038b, B:61:0x03be, B:29:0x0162, B:31:0x016f, B:32:0x01a3), top: B:108:0x0162 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0510 A[PHI: r0 r4 r6 r7 r8
          0x0510: PHI (r0v32 o.asArray) = (r0v25 o.asArray), (r0v33 o.asArray) binds: [B:76:0x050e, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
          0x0510: PHI (r4v31 java.lang.String) = (r4v27 java.lang.String), (r4v34 java.lang.String) binds: [B:76:0x050e, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
          0x0510: PHI (r6v32 java.lang.String) = (r6v28 java.lang.String), (r6v49 java.lang.String) binds: [B:76:0x050e, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
          0x0510: PHI (r7v32 java.lang.String) = (r7v31 java.lang.String), (r7v36 java.lang.String) binds: [B:76:0x050e, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]
          0x0510: PHI (r8v22 java.lang.String) = (r8v21 java.lang.String), (r8v28 java.lang.String) binds: [B:76:0x050e, B:7:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0512  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x05d5  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0602  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0644 A[Catch: all -> 0x0673, TryCatch #0 {all -> 0x0673, blocks: (B:95:0x0632, B:97:0x0644, B:98:0x066b, B:82:0x0567, B:84:0x0582, B:85:0x05c2, B:72:0x0491, B:74:0x04b9, B:75:0x0508, B:41:0x0255, B:43:0x0262, B:44:0x0298, B:58:0x037e, B:60:0x038b, B:61:0x03be, B:29:0x0162, B:31:0x016f, B:32:0x01a3), top: B:108:0x0162 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1757
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Object onExtraCallbackWithResult(@NotNull Context context, @NotNull GetBillingConfigParamsBuilder getBillingConfigParamsBuilder, @Nullable isJSONTypeIgnore isjsontypeignore, @NotNull GraniteBrownfieldModule_closeView graniteBrownfieldModule_closeView, @NotNull asArray asarray, @NotNull asArray asarray2, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onWarmupCompleted(), new onWarmupCompleted(isjsontypeignore, graniteBrownfieldModule_closeView, asarray2, asarray, getBillingConfigParamsBuilder, context, z, null), access13800Var);
        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
