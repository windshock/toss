package viva.republica.toss.guest.certify.guardian;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseFragment;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.define.MobileCarrier;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.useronboarding.guardian.OnboardingGuardianInfoViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.Map;
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
import kotlin.text.Regex;
import net.sf.scuba.smartcards.BuildConfig;
import o.APEncodeResultCODE;
import o.APImageInfo;
import o.AUPop;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.AdSettingsIntegrationErrorMode;
import o.AntUI;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.ForwardingCameraControl;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NestmonNativeException;
import o.NetConverter3;
import o.QuirksExternalSyntheticBackport0;
import o.RippleNode;
import o.SetDetectableSize;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.clearTid;
import o.createPaints;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.enableViewRecyclingForImage;
import o.enableVirtualViewRenderState;
import o.fileSRect;
import o.findResAndMsg;
import o.getIconfontFileName;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.isImageLoaded;
import o.isVivoY11;
import o.maybeUpdateAnimatable;
import o.notifyEdgeReached;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.startRearDisplaySession;
import o.startScroll;
import o.varyFields;
import o.writeRaw;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.CertifyGuestActivity;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;
import viva.republica.toss.guest.certify.guardian.GuardianInfoFragment;
import viva.republica.toss.guest.certify.verify.SmsVerificationFragment;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.MAX)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GuardianInfoFragment extends Hilt_GuardianInfoFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static char onExtraCallback = 47687;
    private static char onExtraCallbackWithResult = 33849;
    private static char onNavigationEvent = 8514;
    private static int onTransact = 0;
    private static char onWarmupCompleted = 10800;
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda4
        public final Object invoke() {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return (getIconfontFileName) GuardianInfoFragment.onExtraCallback(zzgsa.onWarmupCompleted(), -2060359532, iOnWarmupCompleted2, iOnWarmupCompleted, 2060359532, iOnWarmupCompleted3, new Object[0]);
        }
    });

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[notifyEdgeReached.values().length];
            try {
                iArr[notifyEdgeReached.TELCO_SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~(i7 | i4);
        int i10 = i8 | i9;
        int i11 = ~i5;
        int i12 = (~((~i4) | i7 | i5)) | (~(i7 | i11 | i4));
        int i13 = i9 | (~(i11 | i2));
        int i14 = i2 + i5 + i3 + ((-1696018712) * i6) + (2108813197 * i);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i2) - 2121662464) + (1221732374 * i5) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i3) + (39845888 * i6) + (227278848 * i) + ((-1705377792) * i15);
        int i17 = ((i2 * 362004572) - 1408384217) + (i5 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i3 * 362004373) + (i6 * (-1290304248)) + (i * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(GuardianInfoFragment guardianInfoFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(guardianInfoFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 121;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getIconfontFileName geticonfontfilenameIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onTransact + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return geticonfontfilenameIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuardianInfoFragment guardianInfoFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(guardianInfoFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        int i6 = onTransact + 93;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GuardianInfoFragment guardianInfoFragment = (GuardianInfoFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(guardianInfoFragment);
        int i4 = onTransact + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuardianInfoFragment guardianInfoFragment) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(guardianInfoFragment);
        }
        IAuthTabCallback(guardianInfoFragment);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return 1216623L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ startScroll $carrier;
        int label;
        private static char[] onNavigationEvent = {64989, 64977, 64960, 64986, 64991, 65004, 64961, 64976, 64967, 64990, 64983, 64966, 64988, 64982, 64963, 64980};
        private static char onExtraCallback = 51245;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(startScroll startscroll, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$carrier = startscroll;
        }

        public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~i;
            int i9 = (~(i7 | i8 | (~i5))) | (~(i4 | i | i5));
            int i10 = (~(i8 | i5)) | (~(i8 | i4));
            int i11 = (~(i5 | i)) | i4;
            int i12 = i4 + i + i6 + (1661237432 * i2) + (961048624 * i3);
            int i13 = i12 * i12;
            int i14 = ((119520104 * i4) - 281083904) + ((-1329838950) * i) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i6) + ((-1559232512) * i2) + (1553989632 * i3) + (2020540416 * i13);
            int i15 = (i4 * (-2040814728)) + 92927091 + (i * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i6 * (-2040814133)) + (i2 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
            return i14 + ((i15 * i15) * 1800994816) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            Object obj = objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(th);
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(GuardianInfoFragment guardianInfoFragment, Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(guardianInfoFragment, th, setDetectableSize);
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallback;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            GuardianInfoFragment guardianInfoFragment = (GuardianInfoFragment) objArr[0];
            Throwable th = (Throwable) objArr[1];
            Throwable th2 = (Throwable) objArr[2];
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(guardianInfoFragment, th, th2);
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            throw null;
        }

        public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(function1, obj);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            int i5 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 57 / 0;
            }
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = GuardianInfoFragment.this.new onExtraCallback(this.$carrier, access13800Var);
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
            final /* synthetic */ MapConverter IAuthTabCallback;
            final /* synthetic */ MapConverter onNavigationEvent;

            public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
                this.IAuthTabCallback = mapConverter;
                this.onNavigationEvent = mapConverter2;
            }

            public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
                Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
                writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.onExtraCallback.onExtraCallbackWithResult.2
                    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                    public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                        Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact == null) {
                                objOnTransact = Object.class.newInstance();
                            }
                            return writeRaw.onExtraCallback(objOnTransact);
                        }
                        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                        if (apiErrorExtraCallbackWithResult == null) {
                            apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        }
                        return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                    }
                }) { // from class: o.UtilsKtExternalSyntheticLambda17.ComponentActivityExternalSyntheticLambda10
                    private final /* synthetic */ Function1 onExtraCallbackWithResult;

                    public ComponentActivityExternalSyntheticLambda10(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                        this.onExtraCallbackWithResult = function1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        return this.onExtraCallbackWithResult.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
                MapConverter mapConverter = this.IAuthTabCallback;
                if (mapConverter != null) {
                    writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                    Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
                }
                MapConverter mapConverter2 = this.onNavigationEvent;
                if (mapConverter2 == null) {
                    return writerawOnExtraCallbackWithResult;
                }
                writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
                return writerawIAuthTabCallback;
            }
        }

        /* renamed from: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onExtraCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function1<access13800<? super Result<? extends Long>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static char[] onExtraCallbackWithResult = {27335, 27463, 27465, 27486, 27313, 27312};
            private static int onNavigationEvent = 1;
            final /* synthetic */ startScroll $carrier;
            Object L$0;
            int label;
            final /* synthetic */ GuardianInfoFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(GuardianInfoFragment guardianInfoFragment, startScroll startscroll, access13800<? super AnonymousClass5> access13800Var) {
                super(1, access13800Var);
                this.this$0 = guardianInfoFragment;
                this.$carrier = startscroll;
            }

            public final access13800<Unit> create(access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$carrier, access13800Var);
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 26 / 0;
                }
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
                int i4 = onNavigationEvent + 45;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(access13800<? super Result<Long>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(access13800Var);
                if (i3 != 0) {
                    anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 73;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                String strIntern;
                Object objIAuthTabCallback;
                Object obj2;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    enableViewRecyclingForImage enableviewrecyclingforimage = enableViewRecyclingForImage.onWarmupCompleted;
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
                    enableViewRecyclingForImage.onWarmupCompleted(enableviewrecyclingforimage, contextRequireContext, (Regex) null, 2, (Object) null);
                    if (GuardianInfoFragment.onExtraCallbackWithResult(this.this$0).onUnminimized()) {
                        int i5 = IAuthTabCallback + 33;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            Object[] objArr = new Object[1];
                            a(new int[]{0, 6, 190, 1}, true, new byte[]{0, 1, 1, 1, 0, 0}, objArr);
                            obj2 = objArr[0];
                        } else {
                            Object[] objArr2 = new Object[1];
                            a(new int[]{0, 6, 190, 1}, true, new byte[]{0, 1, 1, 1, 0, 0}, objArr2);
                            obj2 = objArr2[0];
                        }
                        strIntern = ((String) obj2).intern();
                    } else {
                        strIntern = "TS-LGR";
                    }
                    AUPop aUPopOnNavigationEvent = isImageLoaded.onNavigationEvent(strIntern, GuardianInfoFragment.onExtraCallbackWithResult(this.this$0).access100(), this.$carrier, APImageInfo.onNavigationEvent, false, 16, null);
                    getIconfontFileName geticonfontfilenameOnExtraCallback = GuardianInfoFragment.onExtraCallback(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(aUPopOnNavigationEvent);
                    this.label = 1;
                    objIAuthTabCallback = geticonfontfilenameOnExtraCallback.IAuthTabCallback(aUPopOnNavigationEvent, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        int i6 = onNavigationEvent + 105;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 47 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = ((Result) obj).onNavigationEvent();
                }
                return Result.IAuthTabCallback(objIAuthTabCallback);
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2;
                int i3 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = onExtraCallbackWithResult;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 83;
                        $10 = i9 % 128;
                        if (i9 % i2 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 35284), 34 - Process.getGidForName(BuildConfig.FLAVOR), Gravity.getAbsoluteGravity(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Drawable.resolveOpacity(0, 0)), 35 - (ViewConfiguration.getScrollBarSize() >> 8), View.getDefaultSize(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i8++;
                        }
                        i2 = 2;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10935), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65, (ViewConfiguration.getScrollBarSize() >> 8) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } else {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), ((Process.getThreadPriority(0) + 20) >> 6) + 29, Process.getGidForName(BuildConfig.FLAVOR) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49467), 70 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12486 - View.MeasureSpec.getSize(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    int i12 = $10 + 91;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        char[] cArr5 = new char[i5];
                        System.arraycopy(cArr3, 1, cArr5, 1, i5);
                        System.arraycopy(cArr5, 0, cArr3, i5 - i7, i7);
                        System.arraycopy(cArr5, i7, cArr3, 0, i5 >> i7);
                    } else {
                        char[] cArr6 = new char[i5];
                        System.arraycopy(cArr3, 0, cArr6, 0, i5);
                        int i13 = i5 - i7;
                        System.arraycopy(cArr6, 0, cArr3, i13, i7);
                        System.arraycopy(cArr6, i7, cArr3, 0, i13);
                    }
                }
                if (z) {
                    int i14 = $10 + 49;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    char[] cArr7 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        int i16 = $11 + 43;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    int i18 = $11 + 75;
                    $10 = i18 % 128;
                    i = 2;
                    int i19 = i18 % 2;
                    cArr3 = cArr7;
                } else {
                    i = 2;
                }
                if (i6 > 0) {
                    int i20 = $10 + 31;
                    $11 = i20 % 128;
                    int i21 = i20 % i;
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        int i22 = $10 + 47;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            int i23 = 5 / 2;
                        }
                        i = 2;
                    }
                }
                String str = new String(cArr3);
                int i24 = $11 + 91;
                $10 = i24 % 128;
                int i25 = i24 % 2;
                objArr[0] = str;
            }
        }

        private static final void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(obj);
            if (i3 != 0) {
                throw null;
            }
        }

        private static final Unit onExtraCallback(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onExtraCallback(GuardianInfoFragment guardianInfoFragment, Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
            String str;
            TossApiCallException.ApiError apiError;
            String strOnTransact;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!(!GuardianInfoFragment.onExtraCallbackWithResult(guardianInfoFragment).onUnminimized())) {
                int i4 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                str = "reset_password_organic";
            } else {
                str = BuildConfig.FLAVOR;
            }
            setDetectableSize.onExtraCallback("youth_inflow_type", str);
            boolean z = th instanceof TossApiCallException.ApiError;
            String strAsBinder = null;
            if (z) {
                int i6 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                apiError = (TossApiCallException.ApiError) th;
            } else {
                apiError = null;
            }
            if (apiError != null) {
                int i7 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                strOnTransact = apiError.onTransact();
            } else {
                strOnTransact = null;
            }
            Object[] objArr = new Object[1];
            a(new char[]{11, 0, '\f', '\b', 13831}, (byte) ('8' - AndroidCharacter.getMirror('0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), strOnTransact);
            TossApiCallException.ApiError apiError2 = z ? (TossApiCallException.ApiError) th : null;
            String message = apiError2 != null ? apiError2.getMessage() : null;
            Object[] objArr2 = new Object[1];
            a(new char[]{'\t', 14, 3, 6, 7, 2, '\f', '\n', 0, 15, 13933}, (byte) (121 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), message);
            TossApiCallException.ApiError apiError3 = z ? (TossApiCallException.ApiError) th : null;
            if (apiError3 != null) {
                int i9 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    apiError3.asBinder();
                    throw null;
                }
                strAsBinder = apiError3.asBinder();
            }
            setDetectableSize.onExtraCallback("err_code", strAsBinder);
            Object[] objArr3 = new Object[1];
            a(new char[]{3, 15, 14, 1, '\t', 4, 1, 14, 13849, 13849, 0, 15, 1, 4, 2, 11}, (byte) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 48), 16 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), Long.valueOf(GuardianInfoFragment.onExtraCallbackWithResult(guardianInfoFragment).access100()));
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallback(final GuardianInfoFragment guardianInfoFragment, final Throwable th, Throwable th2) {
            int i = 2 % 2;
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1262663L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onCertifyRequired$1$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return GuardianInfoFragment.onExtraCallback.onNavigationEvent(guardianInfoFragment, th, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            getParamImp.onWarmupCompleted(th2, guardianInfoFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                BaseFragment.showProgressDialog$default(GuardianInfoFragment.this, (String) null, false, 3, (Object) null);
                GuardianInfoFragment guardianInfoFragment = GuardianInfoFragment.this;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(guardianInfoFragment, this.$carrier, null);
                this.label = 1;
                obj = GuestBaseFragment.onNavigationEvent(guardianInfoFragment, (Function0) null, anonymousClass5, this, 1, (Object) null);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            Result result = (Result) obj;
            if (result != null) {
                Object objOnNavigationEvent = result.onNavigationEvent();
                GuardianInfoFragment guardianInfoFragment2 = GuardianInfoFragment.this;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    long jLongValue = ((Number) objOnNavigationEvent).longValue();
                    writeRaw writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.requestPostMessageChannelWithExtras().onWarmupCompleted(new NestmonNativeException(jLongValue, createPaints.IAuthTabCallback.asBinder()));
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
                    writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
                    deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onCertifyRequired$1$$ExternalSyntheticLambda0
                        public final void accept(Object obj2) {
                            GuardianInfoFragment.onExtraCallback.onExtraCallback(new Object[]{obj2}, -1385440981, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1385440981, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
                        }
                    };
                    final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onCertifyRequired$1$$ExternalSyntheticLambda1
                        public final Object invoke(Object obj2) {
                            return GuardianInfoFragment.onExtraCallback.onExtraCallbackWithResult((Throwable) obj2);
                        }
                    };
                    deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onCertifyRequired$1$$ExternalSyntheticLambda2
                        public final void accept(Object obj2) {
                            GuardianInfoFragment.onExtraCallback.onWarmupCompleted(function1, obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, BuildConfig.FLAVOR);
                    GuardianInfoFragment.IAuthTabCallback(guardianInfoFragment2, deserializeurinullablecollectionOnNavigationEvent);
                    GuardianInfoFragment.onExtraCallbackWithResult(guardianInfoFragment2, R.id.action_guardianInfoFragment_to_smsVerificationFragment, SmsVerificationFragment.Companion.onExtraCallback(jLongValue, GuardianInfoFragment.onExtraCallbackWithResult(guardianInfoFragment2).onUnminimized()));
                    int i4 = onWarmupCompleted + 3;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 / 2;
                    }
                }
                final GuardianInfoFragment guardianInfoFragment3 = GuardianInfoFragment.this;
                final Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (th != null) {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onCertifyRequired", th);
                    GuardianInfoFragment.onExtraCallbackWithResult(guardianInfoFragment3, th, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$onCertifyRequired$1$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj2) {
                            return (Unit) GuardianInfoFragment.onExtraCallback.onExtraCallback(new Object[]{guardianInfoFragment3, th, (Throwable) obj2}, -1672447333, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1672447334, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
                        }
                    });
                }
                Result.IAuthTabCallback(objOnNavigationEvent);
            }
            GuardianInfoFragment.this.dismissProgressDialog();
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            char c;
            char c2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            int i4 = 13;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = $10 + 121;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + i4;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i7 %= 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, View.resolveSizeAndState(0, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    }
                    i4 = 13;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c3 = 6;
            char c4 = '\b';
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $11 + 117;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        c2 = c3;
                        obj = obj2;
                        c = c4;
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[9] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[c4] = Integer.valueOf(cCharValue);
                        objArr5[7] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[c3] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[3] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = defaultGainProviderExternalSyntheticLambda0;
                        objArr5[0] = defaultGainProviderExternalSyntheticLambda0;
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (Process.myPid() >> 22)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 74, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                c2 = 6;
                                c = '\b';
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), Drawable.resolveOpacity(0, 0) + 30, 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '\b';
                                c2 = 6;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            c = '\b';
                            c2 = 6;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i12 = $11 + 61;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    c4 = c;
                    c3 = c2;
                }
            }
            int i18 = $10 + 5;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public static /* synthetic */ Unit onWarmupCompleted(GuardianInfoFragment guardianInfoFragment, Throwable th, Throwable th2) {
            return (Unit) onExtraCallback(new Object[]{guardianInfoFragment, th, th2}, -1672447333, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1672447334, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(GuardianInfoFragment guardianInfoFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        guardianInfoFragment.autoDisposable(deserializeurinullablecollection);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getIconfontFileName onExtraCallback(GuardianInfoFragment guardianInfoFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            return (getIconfontFileName) onExtraCallback(zzgsa.onWarmupCompleted(), 2060604978, iOnWarmupCompleted2, iOnWarmupCompleted, -2060604977, iOnWarmupCompleted3, new Object[]{guardianInfoFragment});
        }
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted5 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted6 = zzgsa.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CertifyGuestViewModel onExtraCallbackWithResult(GuardianInfoFragment guardianInfoFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CertifyGuestViewModel certifyGuestViewModelOnUnminimized = guardianInfoFragment.onUnminimized();
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return certifyGuestViewModelOnUnminimized;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GuardianInfoFragment guardianInfoFragment, int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = asInterface + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        guardianInfoFragment.onExtraCallback(i, bundle);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GuardianInfoFragment guardianInfoFragment, Throwable th, Function1 function1) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        guardianInfoFragment.onExtraCallback(th, function1);
        int i4 = asInterface + 55;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getIconfontFileName IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getIconfontFileName geticonfontfilenameOnWarmupCompleted = AntUI.onWarmupCompleted();
        int i4 = asInterface + 29;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return geticonfontfilenameOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GuardianInfoFragment guardianInfoFragment = (GuardianInfoFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getIconfontFileName geticonfontfilename = (getIconfontFileName) guardianInfoFragment.IAuthTabCallback.getValue();
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return geticonfontfilename;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (onUnminimized().onUnminimized()) {
            int i4 = onTransact + 113;
            asInterface = i4 % 128;
            str = "reset_password_organic";
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
        } else {
            int i6 = onTransact + 75;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            str = BuildConfig.FLAVOR;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("youth_inflow_type", str);
        Object[] objArr = new Object[1];
        a(new char[]{25839, 53082, 44226, 29544, 232, 5890, 35134, 43515, 12246, 8403, 62463, 64880, 63604, 63125, 65514, 64309}, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Long.valueOf(onUnminimized().access100()))});
    }

    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(menuInflater, BuildConfig.FLAVOR);
        menuInflater.inflate(R.menu.menu_service_info, menu);
        int i4 = asInterface + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r9 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1217317, false, (java.lang.String) null, (java.util.Map) null, (kotlin.jvm.functions.Function1) null, 91, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1217317, false, (java.lang.String) null, (java.util.Map) null, (kotlin.jvm.functions.Function1) null, 30, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        onUnminimized().extraCallback().onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r9 = super/*im.toss.base.BaseFragment*\/.onOptionsItemSelected(r9);
        r1 = viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.onTransact + 105;
        viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r9.getItemId() == viva.republica.toss.R.id.action_service_info) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r9.getItemId() == viva.republica.toss.R.id.action_service_info) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r9 = viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.asInterface + 5;
        viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.onTransact = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menuItem, BuildConfig.FLAVOR);
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(menuItem, BuildConfig.FLAVOR);
        }
    }

    public static final class onExtraCallbackWithResult extends OnBackPressedCallback {
        onExtraCallbackWithResult() {
            super(true);
        }

        public void handleOnBackPressed() {
            RippleNode.onNavigationEvent(GuardianInfoFragment.this).getInterfaceDescriptor();
        }
    }

    @Override // viva.republica.toss.guest.certify.guardian.Hilt_GuardianInfoFragment
    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new onExtraCallbackWithResult());
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) throws Throwable {
        CertifyGuestActivity certifyGuestActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        CertifyGuestActivity certifyGuestActivityRequireActivity = requireActivity();
        if (certifyGuestActivityRequireActivity instanceof CertifyGuestActivity) {
            int i2 = asInterface + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            certifyGuestActivity = certifyGuestActivityRequireActivity;
        } else {
            int i4 = onTransact + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            certifyGuestActivity = null;
        }
        if (certifyGuestActivity != null) {
            int i6 = asInterface + 79;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                certifyGuestActivity.getSupportActionBar();
                throw null;
            }
            IPostMessageServiceStubProxy supportActionBar = certifyGuestActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onWarmupCompleted((Drawable) null);
            }
        }
        if (fileSRect.onNavigationEvent.getInterfaceDescriptor()) {
            asInterface();
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(373667529, true, new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return GuardianInfoFragment.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        return composeView;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 83;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 117;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                        int i14 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, iKeyCodeFromString, i14, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10 - Color.blue(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 16015), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 15, View.resolveSizeAndState(0, 0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit IAuthTabCallback(GuardianInfoFragment guardianInfoFragment) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        fileSRect filesrect = fileSRect.onNavigationEvent;
        APImageInfo aPImageInfo = APImageInfo.onNavigationEvent;
        filesrect.onWarmupCompleted(aPImageInfo.IAuthTabCallback(), aPImageInfo.asBinder(), aPImageInfo.onNavigationEvent(), aPImageInfo.onTransact(), aPImageInfo.onExtraCallback().serverValue());
        guardianInfoFragment.onExtraCallback(notifyEdgeReached.TELCO_SMS);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(GuardianInfoFragment guardianInfoFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        guardianInfoFragment.onUnminimized().ICustomTabsCallback().onWarmupCompleted();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final GuardianInfoFragment guardianInfoFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 107;
            int i7 = i6 % 128;
            asInterface = i7;
            z = i6 % 2 != 0;
            int i8 = i7 + 99;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 3;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i10 = onTransact + 31;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1087820767, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (GuardianInfoFragment.kt:105)");
            }
            boolean zOnWarmupCompleted = varyFields.onWarmupCompleted((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
            long jAccess100 = guardianInfoFragment.onUnminimized().access100();
            boolean zOnUnminimized = guardianInfoFragment.onUnminimized().onUnminimized();
            boolean zBooleanValue = ((Boolean) CertifyGuestViewModel.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{guardianInfoFragment.onUnminimized()}, -1033083291, 1033083313, ICustomTabsCallbackStubProxy.onExtraCallback())).booleanValue();
            String strAsBinder = createPaints.IAuthTabCallback.asBinder();
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(guardianInfoFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback2) {
                objOnMinimized = new Function0() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda2
                    public final Object invoke() {
                        return GuardianInfoFragment.onWarmupCompleted(this.f$0);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                Function0 function0 = (Function0) objOnMinimized;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(guardianInfoFragment);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                    int i12 = onTransact + 89;
                    asInterface = i12 % 128;
                    if (i12 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function0() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda3
                            public final Object invoke() {
                                Object[] objArr = {this.f$0};
                                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                                return (Unit) GuardianInfoFragment.onExtraCallback(zzgsa.onWarmupCompleted(), 1029256964, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -1029256962, zzgsa.onWarmupCompleted(), objArr);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        int i13 = onTransact + 59;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    APEncodeResultCODE.onNavigationEvent(jAccess100, zOnUnminimized, zBooleanValue, zOnWarmupCompleted, strAsBinder, function0, (Function0) objOnMinimized2, (QuirksExternalSyntheticBackport0) null, (OnboardingGuardianInfoViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 384);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                int i15 = asInterface + 67;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                Function0 function02 = (Function0) objOnMinimized;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(guardianInfoFragment);
                Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final GuardianInfoFragment guardianInfoFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        asInterface = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 4, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = asInterface + 61;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = asInterface + 85;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(373667529, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianInfoFragment.onCreateView.<anonymous>.<anonymous> (GuardianInfoFragment.kt:104)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1087820767, true, new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return GuardianInfoFragment.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1087820767, true, new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianInfoFragment$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2) {
                        return GuardianInfoFragment.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        } else {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        }
        super/*im.toss.base.BaseFragment*/.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        int i3 = onTransact + 103;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void asInterface() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        APImageInfo aPImageInfo = APImageInfo.onNavigationEvent;
        fileSRect filesrect = fileSRect.onNavigationEvent;
        aPImageInfo.onWarmupCompleted(filesrect.onTransact());
        aPImageInfo.IAuthTabCallback(filesrect.IAuthTabCallbackDefault());
        aPImageInfo.onNavigationEvent(filesrect.onExtraCallbackWithResult());
        aPImageInfo.onExtraCallbackWithResult(filesrect.asBinder());
        Object obj = MobileCarrier.Companion;
        try {
            Object[] objArr = {filesrect.IAuthTabCallbackStub()};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1901493767);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), View.MeasureSpec.getSize(0) + 46, KeyEvent.normalizeMetaState(0) + 6951, 1075216535, false, "onExtraCallback", new Class[]{String.class});
            }
            aPImageInfo.IAuthTabCallback((MobileCarrier) ((Method) objOnExtraCallback).invoke(obj, objArr));
            int i4 = asInterface + 59;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(notifyEdgeReached notifyedgereached) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (onWarmupCompleted.onExtraCallbackWithResult[notifyedgereached.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        APImageInfo aPImageInfo = APImageInfo.onNavigationEvent;
        startScroll startscrollOnNavigationEvent = enableVirtualViewRenderState.onNavigationEvent(aPImageInfo.onExtraCallback());
        aPImageInfo.onExtraCallbackWithResult(isVivoY11.SMS);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(startscrollOnNavigationEvent, null), 3, (Object) null);
        int i4 = onTransact + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getIconfontFileName IAuthTabCallback() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (getIconfontFileName) onExtraCallback(zzgsa.onWarmupCompleted(), -2060359532, iOnWarmupCompleted2, iOnWarmupCompleted, 2060359532, iOnWarmupCompleted3, new Object[0]);
    }

    public static /* synthetic */ Unit onNavigationEvent(GuardianInfoFragment guardianInfoFragment) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (Unit) onExtraCallback(zzgsa.onWarmupCompleted(), 1029256964, iOnWarmupCompleted2, iOnWarmupCompleted, -1029256962, iOnWarmupCompleted3, new Object[]{guardianInfoFragment});
    }

    private final getIconfontFileName onExtraCallback() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (getIconfontFileName) onExtraCallback(zzgsa.onWarmupCompleted(), 2060604978, iOnWarmupCompleted2, iOnWarmupCompleted, -2060604977, iOnWarmupCompleted3, new Object[]{this});
    }
}
