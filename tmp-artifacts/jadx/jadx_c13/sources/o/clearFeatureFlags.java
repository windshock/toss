package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import im.toss.websocket.network.model.TossWebSocketMessageDto;
import im.toss.websocket.network.model.TossWebSocketMessageMetaDto;
import im.toss.websocket.network.model.TossWebSocketSessionMetaDto;
import im.toss.websocket.network.sec.TossWebSocketMessageDecryptor;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.text.StringsKt__StringsKt;
import o.convertErrorbugsnag_android_core_release;
import o.lt;
import o.lud;
import o.setLogBuffers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.util.RetryWithDelay;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearFeatureFlags {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private final Random IAuthTabCallback;
    private final OkHttpClient IAuthTabCallbackDefault;
    private IAuthTabCallback IAuthTabCallbackStub;
    private WebSocket asBinder;
    private final parseTraceId asInterface;
    private int getInterfaceDescriptor;
    private final AppSetIdAndScope1 onExtraCallback;
    private long onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final resumeSession onTransact;
    private toDate onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws logClientInitWarning, pauseSession {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = clearFeatureFlags.this.onNavigationEvent(false, (access13800<? super IAnimation<? extends convertErrorbugsnag_android_core_release>>) this);
            int i4 = onExtraCallbackWithResult + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i5) | i4);
        int i8 = ~i2;
        int i9 = i7 | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i5);
        int i13 = (~(i8 | i5)) | i11 | i12;
        int i14 = (~(i2 | i10)) | i12;
        int i15 = i5 + i4 + i6 + (1039959776 * i3) + ((-2046201414) * i);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i5) - 8388608) + ((-1785926397) * i4) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i6) + ((-201326592) * i3) + ((-406847488) * i) + (529399808 * i16);
        int i18 = ((i5 * 868240256) - 1765242424) + (i4 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i6 * 868239597) + (i3 * 817356128) + (i * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i19 == 3) {
            return onNavigationEvent(objArr);
        }
        clearFeatureFlags clearfeatureflags = (clearFeatureFlags) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i20 = 2 % 2;
        int i21 = access100 + 95;
        access000 = i21 % 128;
        int i22 = i21 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(clearfeatureflags, zBooleanValue);
        int i23 = access100 + 125;
        access000 = i23 % 128;
        int i24 = i23 % 2;
        return Boolean.valueOf(zOnWarmupCompleted);
    }

    public clearFeatureFlags(@NotNull OkHttpClient okHttpClient, @NotNull parseTraceId parsetraceid) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(parsetraceid, "");
        this.IAuthTabCallbackDefault = okHttpClient;
        this.asInterface = parsetraceid;
        this.onExtraCallback = ea10.onExtraCallbackWithResult(onVisit.IAuthTabCallback(clearFeatureFlags.class));
        this.IAuthTabCallbackStub = IAuthTabCallback.DISCONNECTED;
        this.IAuthTabCallback = RandomKt.onWarmupCompleted(zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
        this.onTransact = new resumeSession();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        clearFeatureFlags clearfeatureflags = (clearFeatureFlags) objArr[0];
        WebSocket webSocket = (WebSocket) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 43;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        clearfeatureflags.asBinder = webSocket;
        int i5 = i3 + 59;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ parseTraceId IAuthTabCallback(clearFeatureFlags clearfeatureflags) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 71;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        parseTraceId parsetraceid = clearfeatureflags.asInterface;
        int i5 = i2 + 67;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return parsetraceid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ resumeSession onExtraCallback(clearFeatureFlags clearfeatureflags) {
        int i = 2 % 2;
        int i2 = access000 + 87;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        resumeSession resumesession = clearfeatureflags.onTransact;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 1;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return resumesession;
    }

    public static final /* synthetic */ void onExtraCallback(clearFeatureFlags clearfeatureflags, long j) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        clearfeatureflags.onExtraCallbackWithResult = j;
        int i5 = i3 + 113;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(clearFeatureFlags clearfeatureflags, String str) {
        int i = 2 % 2;
        int i2 = access100 + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(clearFeatureFlags clearfeatureflags, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 93;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        clearfeatureflags.onNavigationEvent = i;
        int i6 = i4 + 71;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 9 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        clearFeatureFlags clearfeatureflags = (clearFeatureFlags) objArr[0];
        toDate todate = (toDate) objArr[1];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 55;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        clearfeatureflags.onWarmupCompleted = todate;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 99;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ toDate onNavigationEvent(clearFeatureFlags clearfeatureflags) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        toDate todate = clearfeatureflags.onWarmupCompleted;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 37;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return todate;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onWarmupCompleted(clearFeatureFlags clearfeatureflags) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = clearfeatureflags.onExtraCallback;
        if (i3 == 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(clearFeatureFlags clearfeatureflags, IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = access100 + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        clearfeatureflags.IAuthTabCallbackStub = iAuthTabCallback;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        clearFeatureFlags clearfeatureflags = (clearFeatureFlags) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = clearfeatureflags.IAuthTabCallbackStub;
        if (i3 == 0) {
            IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.CONNECTED;
            throw null;
        }
        if (iAuthTabCallback == IAuthTabCallback.CONNECTED) {
            return true;
        }
        int i4 = access000 + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final class asBinder<Upstream, Downstream> implements deserializeUri {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public asBinder(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<TossWebSocketSessionMetaDto> apply(writeRaw<BaseApiResponse<TossWebSocketSessionMetaDto>> writeraw) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<TossWebSocketSessionMetaDto>, deserializeIp<? extends TossWebSocketSessionMetaDto>>() { // from class: o.clearFeatureFlags.asBinder.1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                static {
                    int i2 = onExtraCallbackWithResult + 65;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ deserializeIp<? extends TossWebSocketSessionMetaDto> invoke(BaseApiResponse<TossWebSocketSessionMetaDto> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 65;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    deserializeIp<? extends TossWebSocketSessionMetaDto> deserializeipIAuthTabCallback = IAuthTabCallback(baseApiResponse);
                    if (i4 == 0) {
                        int i5 = 55 / 0;
                    }
                    return deserializeipIAuthTabCallback;
                }

                public final deserializeIp<? extends TossWebSocketSessionMetaDto> IAuthTabCallback(BaseApiResponse<TossWebSocketSessionMetaDto> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 107;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (!(!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue())) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = TossWebSocketSessionMetaDto.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                        int i5 = onWarmupCompleted + 39;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 4 % 2;
                        }
                    }
                    writeRaw writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                    int i7 = onNavigationEvent + 41;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 60 / 0;
                    }
                    return writerawOnExtraCallbackWithResult;
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$getOnBackPressedDispatcher
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.onExtraCallbackWithResult = anonymousClass1;
                }

                @Override // o.deserializeIntNullableCollection
                public final /* synthetic */ Object apply(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 7;
                    onExtraCallback = i3 % 128;
                    Object obj2 = null;
                    if (i3 % 2 == 0) {
                        this.onExtraCallbackWithResult.invoke(obj);
                        throw null;
                    }
                    Object objInvoke = this.onExtraCallbackWithResult.invoke(obj);
                    int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvoke;
                    }
                    obj2.hashCode();
                    throw null;
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            int i4 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return writerawIAuthTabCallback;
        }
    }

    private final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 51;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = this.onNavigationEvent;
            if (i4 == 0) {
                int i5 = i2 + 73;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                return 0L;
            }
            if (i4 < 6) {
                int i7 = i2 + 101;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                return 500L;
            }
            return this.IAuthTabCallback.onExtraCallback(3000L, 9001L);
        }
        throw null;
    }

    private final OkHttpClient onWarmupCompleted(toDate todate) {
        int i = 2 % 2;
        OkHttpClient.Builder builderNewBuilder = this.IAuthTabCallbackDefault.newBuilder();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        OkHttpClient okHttpClientBuild = builderNewBuilder.m278connectTimeoutLRDsOJo(setCommandLine.IAuthTabCallback(10L, setRevision.SECONDS)).m280readTimeoutLRDsOJo(setCommandLine.IAuthTabCallback(0L, setRevision.MILLISECONDS)).addInterceptor(new convertAppWithStatebugsnag_android_core_release(todate)).build();
        int i2 = access100 + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return okHttpClientBuild;
    }

    private final Request onWarmupCompleted(String str) {
        int i = 2 % 2;
        Request requestBuild = onWarmupCompleted(new Request.Builder().url(str)).build();
        int i2 = access100 + 113;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return requestBuild;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onWarmupCompleted(clearFeatureFlags clearfeatureflags, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
            if (!z) {
                long jIAuthTabCallbackDefault = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
                long j = clearfeatureflags.onExtraCallbackWithResult;
                if (clearfeatureflags.onWarmupCompleted != null) {
                    int i4 = access000;
                    int i5 = i4 + 81;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    if (jIAuthTabCallbackDefault - j < 600000) {
                        int i7 = i4 + 45;
                        access100 = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    }
                }
            }
        } else if (!z) {
        }
        return false;
    }

    public static final class onNavigationEvent implements deserializeIpNullableCollection<TossWebSocketSessionMetaDto> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ maybeRemoveAttachStateListener<toDate> onExtraCallbackWithResult;
        final /* synthetic */ clearFeatureFlags onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(maybeRemoveAttachStateListener<? super toDate> mayberemoveattachstatelistener, clearFeatureFlags clearfeatureflags) {
            this.onExtraCallbackWithResult = mayberemoveattachstatelistener;
            this.onNavigationEvent = clearfeatureflags;
        }

        @Override // o.deserializeIpNullableCollection
        public /* bridge */ /* synthetic */ void onNavigationEvent(TossWebSocketSessionMetaDto tossWebSocketSessionMetaDto) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent2(tossWebSocketSessionMetaDto);
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
        }

        /* renamed from: o.clearFeatureFlags$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0026onNavigationEvent implements Function1<Throwable, Unit> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ deserializeUriNullableCollection onNavigationEvent;

            C0026onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
                this.onNavigationEvent = deserializeurinullablecollection;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Throwable th) {
                Unit unit;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onNavigationEvent(th);
                if (i3 != 0) {
                    unit = Unit.INSTANCE;
                    int i4 = 11 / 0;
                } else {
                    unit = Unit.INSTANCE;
                }
                int i5 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 75 / 0;
                }
                return unit;
            }

            public final void onNavigationEvent(Throwable th) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                this.onNavigationEvent.dispose();
                int i4 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            this.onExtraCallbackWithResult.IAuthTabCallback(new C0026onNavigationEvent(deserializeurinullablecollection));
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
        public void onNavigationEvent2(TossWebSocketSessionMetaDto tossWebSocketSessionMetaDto) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tossWebSocketSessionMetaDto, "");
            toDate todateOnWarmupCompleted = clearFeatureFlags.onExtraCallback(this.onNavigationEvent).onWarmupCompleted(tossWebSocketSessionMetaDto);
            Object[] objArr = {this.onNavigationEvent, todateOnWarmupCompleted};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, -1183983029, 1183983032, iOnNavigationEvent2);
            clearFeatureFlags.onExtraCallback(this.onNavigationEvent, zzaj.onWarmupCompleted().IAuthTabCallbackDefault());
            maybeRemoveAttachStateListener<toDate> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(todateOnWarmupCompleted));
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            maybeRemoveAttachStateListener<toDate> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new startSession(th.getMessage()))));
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r9 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(boolean z, @NotNull access13800<? super IAnimation<? extends convertErrorbugsnag_android_core_release>> access13800Var) throws logClientInitWarning, pauseSession {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onextracallbackwithresult.label;
        Object obj = null;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            if (this.getInterfaceDescriptor >= 500) {
                throw new logClientInitWarning(clearFeatureFlags.class.getSimpleName());
            }
            int i4 = access000 + 123;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                this.IAuthTabCallbackStub = IAuthTabCallback.CONNECTING;
                obj.hashCode();
                throw null;
            }
            this.IAuthTabCallbackStub = IAuthTabCallback.CONNECTING;
            int i5 = this.onNavigationEvent;
            if (i5 != 0) {
                if (i5 > 50) {
                    throw new pauseSession(clearFeatureFlags.class.getSimpleName());
                }
                int i6 = access000 + 105;
                access100 = i6 % 128;
                if (i6 % 2 == 0) {
                    long jOnNavigationEvent = onNavigationEvent();
                    onextracallbackwithresult.Z$0 = z;
                    onextracallbackwithresult.label = 0;
                    if (formatMsgs.onWarmupCompleted(jOnNavigationEvent, onextracallbackwithresult) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
                long jOnNavigationEvent2 = onNavigationEvent();
                onextracallbackwithresult.Z$0 = z;
                onextracallbackwithresult.label = 1;
                if (formatMsgs.onWarmupCompleted(jOnNavigationEvent2, onextracallbackwithresult) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = access000 + 125;
                access100 = i7 % 128;
                if (i7 % 2 == 0) {
                    ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                    throw null;
                }
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                toDate todate = (toDate) objOnExtraCallbackWithResult;
                return ycxycx.onNavigationEvent(new onWarmupCompleted(onWarmupCompleted(todate), onWarmupCompleted(todate.IAuthTabCallback()), new TossWebSocketMessageDecryptor(todate.onExtraCallback()), null));
            }
            z = onextracallbackwithresult.Z$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        this.getInterfaceDescriptor++;
        this.onNavigationEvent++;
        onextracallbackwithresult.Z$0 = z;
        onextracallbackwithresult.label = 2;
        objOnExtraCallbackWithResult = onExtraCallbackWithResult(z, onextracallbackwithresult);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<ok<? super convertErrorbugsnag_android_core_release>, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ OkHttpClient $client;
        final /* synthetic */ TossWebSocketMessageDecryptor $messageDecryptor;
        final /* synthetic */ Request $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(OkHttpClient okHttpClient, Request request, TossWebSocketMessageDecryptor tossWebSocketMessageDecryptor, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$client = okHttpClient;
            this.$request = request;
            this.$messageDecryptor = tossWebSocketMessageDecryptor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = clearFeatureFlags.this.new onWarmupCompleted(this.$client, this.$request, this.$messageDecryptor, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(ok<? super convertErrorbugsnag_android_core_release> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(okVar, access13800Var);
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(ok<? super convertErrorbugsnag_android_core_release> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            final ok okVar = (ok) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                final clearFeatureFlags clearfeatureflags = clearFeatureFlags.this;
                OkHttpClient okHttpClient = this.$client;
                Request request = this.$request;
                final TossWebSocketMessageDecryptor tossWebSocketMessageDecryptor = this.$messageDecryptor;
                Object[] objArr = {clearfeatureflags, okHttpClient.newWebSocket(request, new WebSocketListener() { // from class: o.clearFeatureFlags.onWarmupCompleted.4
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // okhttp3.WebSocketListener
                    public void onOpen(WebSocket webSocket, Response response) {
                        int i5 = 2 % 2;
                        Intrinsics.checkNotNullParameter(webSocket, "");
                        Intrinsics.checkNotNullParameter(response, "");
                        clearFeatureFlags.onExtraCallbackWithResult(clearfeatureflags, 0);
                        clearFeatureFlags.onWarmupCompleted(clearfeatureflags, IAuthTabCallback.CONNECTED);
                        Object objIAuthTabCallback = okVar.IAuthTabCallback(convertErrorbugsnag_android_core_release.onExtraCallbackWithResult.IAuthTabCallback);
                        clearFeatureFlags clearfeatureflags2 = clearfeatureflags;
                        if (objIAuthTabCallback instanceof lud.onExtraCallback) {
                            Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objIAuthTabCallback);
                            clearFeatureFlags.onWarmupCompleted(clearfeatureflags2);
                            if (thOnWarmupCompleted != null) {
                                int i6 = IAuthTabCallback + 41;
                                onWarmupCompleted = i6 % 128;
                                int i7 = i6 % 2;
                                thOnWarmupCompleted.getMessage();
                            }
                        }
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, "[" + webSocket.hashCode() + "] socket open");
                        int i8 = IAuthTabCallback + 103;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                    }

                    @Override // okhttp3.WebSocketListener
                    public void onMessage(WebSocket webSocket, String str) {
                        int i5 = 2 % 2;
                        Intrinsics.checkNotNullParameter(webSocket, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        TossWebSocketMessageDto tossWebSocketMessageDtoOnExtraCallback = tossWebSocketMessageDecryptor.onExtraCallback(str);
                        clearFeatureFlags clearfeatureflags2 = clearfeatureflags;
                        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDtoOnNavigationEvent = tossWebSocketMessageDtoOnExtraCallback.onNavigationEvent();
                        if (tossWebSocketMessageMetaDtoOnNavigationEvent != null) {
                            int i6 = IAuthTabCallback + 101;
                            onWarmupCompleted = i6 % 128;
                            if (i6 % 2 == 0) {
                                clearfeatureflags2.onNavigationEvent(tossWebSocketMessageMetaDtoOnNavigationEvent);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            clearfeatureflags2.onNavigationEvent(tossWebSocketMessageMetaDtoOnNavigationEvent);
                        }
                        Object objIAuthTabCallback = okVar.IAuthTabCallback(new convertErrorbugsnag_android_core_release.IAuthTabCallback(tossWebSocketMessageDtoOnExtraCallback));
                        clearFeatureFlags clearfeatureflags3 = clearfeatureflags;
                        if (!(!(objIAuthTabCallback instanceof lud.onExtraCallback))) {
                            Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objIAuthTabCallback);
                            clearFeatureFlags.onWarmupCompleted(clearfeatureflags3);
                            if (thOnWarmupCompleted != null) {
                                int i7 = onWarmupCompleted + 51;
                                IAuthTabCallback = i7 % 128;
                                int i8 = i7 % 2;
                                thOnWarmupCompleted.getMessage();
                                int i9 = IAuthTabCallback + 103;
                                onWarmupCompleted = i9 % 128;
                                int i10 = i9 % 2;
                            }
                        }
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, "[" + webSocket.hashCode() + "] socket message : " + tossWebSocketMessageDtoOnExtraCallback);
                    }

                    @Override // okhttp3.WebSocketListener
                    public void onClosing(WebSocket webSocket, int i5, String str) {
                        int i6 = 2 % 2;
                        Intrinsics.checkNotNullParameter(webSocket, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, "[" + webSocket.hashCode() + "] socket closing");
                        clearFeatureFlags.onWarmupCompleted(clearfeatureflags, IAuthTabCallback.DISCONNECTED);
                        Object objIAuthTabCallback = okVar.IAuthTabCallback(new convertErrorbugsnag_android_core_release.onExtraCallback("[" + i5 + "] " + str));
                        clearFeatureFlags clearfeatureflags2 = clearfeatureflags;
                        if (!(!(objIAuthTabCallback instanceof lud.onExtraCallback))) {
                            Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objIAuthTabCallback);
                            clearFeatureFlags.onWarmupCompleted(clearfeatureflags2);
                            if (thOnWarmupCompleted != null) {
                                thOnWarmupCompleted.getMessage();
                                int i7 = IAuthTabCallback + 85;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                            }
                        }
                        clearFeatureFlags clearfeatureflags3 = clearfeatureflags;
                        if (i5 != 1007) {
                            int i9 = IAuthTabCallback + 77;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            if (i5 != 1011) {
                                return;
                            }
                        }
                        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                        clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{clearfeatureflags3, null}, -1183983029, 1183983032, iOnNavigationEvent2);
                        clearFeatureFlags.onExtraCallback(clearfeatureflags3, 0L);
                    }

                    @Override // okhttp3.WebSocketListener
                    public void onClosed(WebSocket webSocket, int i5, String str) {
                        int i6 = 2 % 2;
                        Intrinsics.checkNotNullParameter(webSocket, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, "[" + webSocket.hashCode() + "] socket closed");
                        lt.onWarmupCompleted.onExtraCallbackWithResult(okVar, null, 1, null);
                        int i7 = IAuthTabCallback + 39;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                    }

                    @Override // okhttp3.WebSocketListener
                    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                        int i5 = 2 % 2;
                        Intrinsics.checkNotNullParameter(webSocket, "");
                        Intrinsics.checkNotNullParameter(th, "");
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, "[" + webSocket.hashCode() + "] socket failure : " + th.getMessage());
                        Object[] objArr2 = {clearfeatureflags, null};
                        clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr2, -1183983029, 1183983032, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        clearFeatureFlags.onExtraCallback(clearfeatureflags, 0L);
                        clearFeatureFlags.onWarmupCompleted(clearfeatureflags, IAuthTabCallback.DISCONNECTED);
                        Object objIAuthTabCallback = okVar.IAuthTabCallback(new convertErrorbugsnag_android_core_release.onNavigationEvent(th));
                        clearFeatureFlags clearfeatureflags2 = clearfeatureflags;
                        if (objIAuthTabCallback instanceof lud.onExtraCallback) {
                            int i6 = onWarmupCompleted + 63;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objIAuthTabCallback);
                            clearFeatureFlags.onWarmupCompleted(clearfeatureflags2);
                            if (thOnWarmupCompleted != null) {
                                thOnWarmupCompleted.getMessage();
                            }
                        }
                        okVar.onExtraCallback(th);
                        int i8 = onWarmupCompleted + 63;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }
                })};
                int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                clearFeatureFlags.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, -1612159863, 1612159865, iOnNavigationEvent2);
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.label = 1;
                if (jw.IAuthTabCallback(okVar, null, this, 1, null) == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 47;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnExtraCallback;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i;
        int i2 = 2 % 2;
        WebSocket webSocket = this.asBinder;
        Object obj = null;
        if (webSocket != null) {
            int i3 = access000 + 27;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (str == null || StringsKt__StringsKt.isBlank(str)) {
                i = 1000;
            } else {
                int i4 = access100 + 111;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                i = 1002;
            }
            if (str == null) {
                str = "NORMAL";
            }
            webSocket.close(i, str);
            int i6 = access100 + 17;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        }
        this.IAuthTabCallbackStub = IAuthTabCallback.DISCONNECTED;
        this.asBinder = null;
    }

    public final void onNavigationEvent(@NotNull TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossWebSocketMessageMetaDto, "");
        if (!Intrinsics.areEqual(tossWebSocketMessageMetaDto.onExtraCallbackWithResult(), Boolean.TRUE)) {
            return;
        }
        int i2 = access100 + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        parseTraceId parsetraceid = this.asInterface;
        String strIAuthTabCallback = tossWebSocketMessageMetaDto.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            int i4 = access000 + 53;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            parsetraceid.onWarmupCompleted(strIAuthTabCallback);
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Map<String, ?> IAuthTabCallback() {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = access100 + 113;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getWrite.IAuthTabCallback("retryCount", Integer.valueOf(this.onNavigationEvent));
            throw null;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("retryCount", Integer.valueOf(this.onNavigationEvent));
        WebSocket webSocket = this.asBinder;
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("socket", webSocket != null ? Integer.valueOf(webSocket.hashCode()) : null);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("socketConnected", this.IAuthTabCallbackStub.name());
        WebSocket webSocket2 = this.asBinder;
        if (webSocket2 != null) {
            int i3 = access000 + 87;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                Long.valueOf(webSocket2.queueSize());
                throw null;
            }
            lValueOf = Long.valueOf(webSocket2.queueSize());
        } else {
            lValueOf = null;
        }
        Map<String, ?> mapIAuthTabCallbackStub = access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("queue size", lValueOf));
        int i4 = access000 + 33;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return mapIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2 == 0 ? 1 : 0;
        this.getInterfaceDescriptor = i3;
        this.onNavigationEvent = i3;
    }

    private final Request.Builder onWarmupCompleted(Request.Builder builder) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Request.Builder builderAddHeader = builder.addHeader("X-Toss-Websocket-Connect-EventId", string);
        int i4 = access000 + 85;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return builderAddHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback CONNECTING = new IAuthTabCallback("CONNECTING", 0);
        public static final IAuthTabCallback CONNECTED = new IAuthTabCallback("CONNECTED", 1);
        public static final IAuthTabCallback DISCONNECTED = new IAuthTabCallback("DISCONNECTED", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {CONNECTING, CONNECTED, DISCONNECTED};
            int i5 = i3 + 51;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 107;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 78 / 0;
            }
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private final Object onExtraCallbackWithResult(boolean z, access13800<? super toDate> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (!((Boolean) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, -1950776138, 1950776138, iOnNavigationEvent2)).booleanValue()) {
            writeRaw<BaseApiResponse<TossWebSocketSessionMetaDto>> writerawOnNavigationEvent = IAuthTabCallback(this).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw<R> writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            writerawIAuthTabCallback.IAuthTabCallbackStub(RetryWithDelay.Companion.onExtraCallbackWithResult()).IAuthTabCallback(new onNavigationEvent(setresourceinternal, this));
        } else {
            int i2 = access000 + 7;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            toDate todateOnNavigationEvent = onNavigationEvent(this);
            if (todateOnNavigationEvent != null) {
                Result.Companion companion = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(todateOnNavigationEvent));
            } else {
                Result.Companion companion2 = Result.Companion;
                setresourceinternal.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new startSession("Something wrong with cached session."))));
            }
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            int i4 = access100 + 17;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(clearFeatureFlags clearfeatureflags, boolean z) {
        Object[] objArr = {clearfeatureflags, Boolean.valueOf(z)};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, -1950776138, 1950776138, iOnNavigationEvent2)).booleanValue();
    }

    public static final /* synthetic */ void onNavigationEvent(clearFeatureFlags clearfeatureflags, toDate todate) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, new Object[]{clearfeatureflags, todate}, -1183983029, 1183983032, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onExtraCallback(clearFeatureFlags clearfeatureflags, WebSocket webSocket) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, new Object[]{clearfeatureflags, webSocket}, -1612159863, 1612159865, iOnNavigationEvent2);
    }

    public final boolean onWarmupCompleted() {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent3, new Object[]{this}, 2116677382, -2116677381, iOnNavigationEvent2)).booleanValue();
    }
}
