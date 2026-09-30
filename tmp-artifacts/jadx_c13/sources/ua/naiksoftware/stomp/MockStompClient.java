package ua.naiksoftware.stomp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFb1vSDKAFa1ySDK;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getPackageType;
import o.getShine;
import o.getTileModeX;
import o.onLoadStarted;
import o.putChannelInfo;
import o.setRubIn;
import o.setShine;
import o.ycxycx;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ua.naiksoftware.stomp.dto.StompHeader;
import ua.naiksoftware.stomp.dto.StompMessage;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MockStompClient implements StompClient {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MockStompClient";
    private getPackageType job;
    private final ConcurrentHashMap<String, AFb1vSDKAFa1ySDK> topics = new ConcurrentHashMap<>();
    private final getBorderRadius<StompMessage> _messageStream = getShine.onWarmupCompleted(1, 0, null, 6, null);
    private final getCornerRadius<Boolean> _isConnected = setShine.onNavigationEvent(Boolean.FALSE);
    private final findResAndMsg coroutineScope = findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback());

    @Override // ua.naiksoftware.stomp.StompClient
    public void setLegacyWhitespace(boolean z) {
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public getTileModeX<StompMessage> getMessageStream() {
        return ycxycx.onExtraCallbackWithResult((getBorderRadius) this._messageStream);
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public setRubIn<Boolean> isConnected() {
        return ycxycx.onExtraCallback((getCornerRadius) this._isConnected);
    }

    public final getPackageType getJob() {
        return this.job;
    }

    public final void setJob(@Nullable getPackageType getpackagetype) {
        this.job = getpackagetype;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object connect(@Nullable List<? extends StompHeader> list, int i, int i2, @NotNull Function1<? super Throwable, Unit> function1, @NotNull access13800<? super Boolean> access13800Var) {
        getPackageType getpackagetype = this.job;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this._isConnected.onWarmupCompleted(access14000.onNavigationEvent(true));
        this.job = onLoadStarted.onExtraCallback(this.coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        return access14000.onNavigationEvent(true);
    }

    /* renamed from: ua.naiksoftware.stomp.MockStompClient$connect$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return MockStompClient.this.new AnonymousClass2(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e2 -> B:28:0x00e5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map map;
            MockStompClient mockStompClient;
            Iterator it;
            int i;
            Object objM31constructorimpl;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i2 == 1) {
                ResultKt.onNavigationEvent(obj);
                ConcurrentHashMap concurrentHashMap = MockStompClient.this.topics;
                MockStompClient mockStompClient2 = MockStompClient.this;
                it = concurrentHashMap.entrySet().iterator();
                map = concurrentHashMap;
                mockStompClient = mockStompClient2;
                i = 0;
                if (!it.hasNext()) {
                }
                return objOnExtraCallback;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (Iterator) this.L$2;
            mockStompClient = (MockStompClient) this.L$1;
            map = (Map) this.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (!it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                StompMessage stompMessage = new StompMessage("MOCK", CollectionsKt__CollectionsKt.arrayListOf(new StompHeader(StompHeader.DESTINATION, str)), _UrlKt.FRAGMENT_ENCODE_SET);
                Result.Companion companion3 = Result.Companion;
                getBorderRadius getborderradius = mockStompClient._messageStream;
                this.L$0 = access15400.onNavigationEvent(map);
                this.L$1 = mockStompClient;
                this.L$2 = it;
                this.L$3 = access15400.onNavigationEvent(entry);
                this.L$4 = access15400.onNavigationEvent(str);
                this.L$5 = access15400.onNavigationEvent(this);
                this.L$6 = access15400.onNavigationEvent(stompMessage);
                this.L$7 = access15400.onNavigationEvent(this);
                this.I$0 = i;
                this.I$1 = 0;
                this.I$2 = 0;
                this.I$3 = 0;
                this.label = 2;
                if (getborderradius.emit(stompMessage, this) == objOnExtraCallback) {
                }
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (!it.hasNext()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(50L, this) != objOnExtraCallback) {
                        ConcurrentHashMap concurrentHashMap2 = MockStompClient.this.topics;
                        MockStompClient mockStompClient3 = MockStompClient.this;
                        it = concurrentHashMap2.entrySet().iterator();
                        map = concurrentHashMap2;
                        mockStompClient = mockStompClient3;
                        i = 0;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
            return objOnExtraCallback;
        }
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object disconnect(@Nullable Throwable th, @NotNull access13800<? super Unit> access13800Var) {
        this._isConnected.onWarmupCompleted(access14000.onNavigationEvent(false));
        getPackageType getpackagetype = this.job;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public void cancel() {
        getPackageType getpackagetype = this.job;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this._isConnected.onWarmupCompleted(Boolean.FALSE);
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object addTopic(@NotNull AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, @Nullable List<? extends StompHeader> list, @NotNull access13800<? super Unit> access13800Var) {
        subscribePath(aFb1vSDKAFa1ySDK, list);
        return Unit.INSTANCE;
    }

    private final void subscribePath(AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, List<? extends StompHeader> list) {
        if (isSubscribed(aFb1vSDKAFa1ySDK.IAuthTabCallbackStub())) {
            return;
        }
        this.topics.put(aFb1vSDKAFa1ySDK.IAuthTabCallbackStub(), aFb1vSDKAFa1ySDK);
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public Object removeTopic(@NotNull String str, @NotNull access13800<? super Unit> access13800Var) {
        this.topics.remove(str);
        return Unit.INSTANCE;
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public AFb1vSDKAFa1ySDK getSubscriptionKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.topics.get(str);
    }

    @Override // ua.naiksoftware.stomp.StompClient
    public boolean isSubscribed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.topics.containsKey(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
