package im.toss.ads_sdk.playable;

import im.toss.ads_sdk.model.NativeAdsDto;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.GeckoHubImp;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getScaleY;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.putChannelInfo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsPlayableAdActivity$onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ NativeAdsPlayableAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsPlayableAdActivity$onTransact(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, access13800<? super NativeAdsPlayableAdActivity$onTransact> access13800Var) {
        super(2, access13800Var);
        this.this$0 = nativeAdsPlayableAdActivity;
    }

    public static /* synthetic */ void onExtraCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(nativeAdsPlayableAdActivity, str);
        int i5 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsPlayableAdActivity$onTransact nativeAdsPlayableAdActivity$onTransact = new NativeAdsPlayableAdActivity$onTransact(this.this$0, access13800Var);
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsPlayableAdActivity$onTransact;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 == 0) {
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends String>>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ NativeAdsPlayableAdActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsPlayableAdActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
            int i3 = onExtraCallback + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 30 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Pair<String, String>> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, String>> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 73;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallback + 5;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            r2 = new java.io.File(new java.io.File(r6.this$0.getFilesDir(), "ads_sdk/playablead/html"), "playable_" + im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity.onUnminimized(r6.this$0).IAuthTabCallbackStub() + ".html");
            r3 = new java.io.File(new java.io.File(r6.this$0.getFilesDir(), "ads_sdk/mraid"), "mraid_cache.js");
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
        
            if (r2.exists() == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
        
            if (r3.exists() == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
        
            return new kotlin.Pair(kotlin.io.FilesKt.readText$default(r2, (java.nio.charset.Charset) null, 1, (java.lang.Object) null), kotlin.io.FilesKt.readText$default(r3, (java.nio.charset.Charset) null, 1, (java.lang.Object) null));
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r6.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r7);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 23;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 85 / 0;
            }
            int i5 = onWarmupCompleted + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ String $htmlBody;
        final /* synthetic */ String $mraidJs;
        int label;
        final /* synthetic */ NativeAdsPlayableAdActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, String str2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsPlayableAdActivity;
            this.$htmlBody = str;
            this.$mraidJs = str2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$htmlBody, this.$mraidJs, access13800Var);
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            if (i4 == 0) {
                int i5 = 89 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 43;
            onExtraCallbackWithResult = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 != 0) {
                Object[] objArr = {this.this$0, this.$htmlBody, this.$mraidJs};
                obj2.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.this$0, this.$htmlBody, this.$mraidJs};
            String str = (String) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -393095694, 393095701, objArr2);
            int i7 = onExtraCallback + 107;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 83 / 0;
            }
            return str;
        }
    }

    private static final void IAuthTabCallback(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getScaleY getscaleyICustomTabsCallback = NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity);
        if (i4 == 0) {
            getscaleyICustomTabsCallback.ICustomTabsCallback.loadDataWithBaseURL("about:blank", str, "text/html", "utf-8", null);
            int i5 = 97 / 0;
        } else {
            getscaleyICustomTabsCallback.ICustomTabsCallback.loadDataWithBaseURL("about:blank", str, "text/html", "utf-8", null);
        }
        int i6 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r3 == r2) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback;
        Object objOnExtraCallback2;
        String strOnMinimized;
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        NativeAdsDto.Creative.PlayableAd playableAd = null;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, null);
            this.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
            if (objOnExtraCallback != objOnWarmupCompleted) {
            }
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
        int i6 = onNavigationEvent + 27;
        int i7 = i6 % 128;
        onExtraCallbackWithResult = i7;
        if (i6 % 2 == 0 ? i3 != 1 : i3 != 0) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i7 + 117;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                ResultKt.onNavigationEvent(obj);
                int i9 = 62 / 0;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            objOnExtraCallback2 = obj;
            final String str = (String) objOnExtraCallback2;
            final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.this$0;
            nativeAdsPlayableAdActivity.runOnUiThread(new Runnable() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$loadInitialContent$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 35;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        NativeAdsPlayableAdActivity$onTransact.onExtraCallback(nativeAdsPlayableAdActivity, str);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    NativeAdsPlayableAdActivity$onTransact.onExtraCallback(nativeAdsPlayableAdActivity, str);
                    int i12 = onExtraCallbackWithResult + 37;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                }
            });
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = obj;
        Pair pair = (Pair) objOnExtraCallback;
        if (pair == null) {
            if (StringsKt.isBlank(NativeAdsPlayableAdActivity.onMinimized(this.this$0))) {
                Object[] objArr = {this.this$0};
                if (((Integer) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1820653566, 1820653592, objArr)).intValue() >= 0) {
                    NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(this.this$0);
                    if (playableAdICustomTabsCallbackStub == null) {
                        int i10 = onExtraCallbackWithResult + 95;
                        onNavigationEvent = i10 % 128;
                        if (i10 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        playableAd = playableAdICustomTabsCallbackStub;
                    }
                    List listIAuthTabCallbackStubProxy = playableAd.IAuthTabCallbackStubProxy();
                    Object[] objArr2 = {this.this$0};
                    strOnMinimized = (String) listIAuthTabCallbackStubProxy.get(((Integer) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1820653566, 1820653592, objArr2)).intValue());
                } else {
                    NativeAdsDto.Creative.PlayableAd playableAdICustomTabsCallbackStub2 = NativeAdsPlayableAdActivity.ICustomTabsCallbackStub(this.this$0);
                    if (playableAdICustomTabsCallbackStub2 == null) {
                        int i11 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        playableAd = playableAdICustomTabsCallbackStub2;
                    }
                    strOnMinimized = (String) NativeAdsDto.Creative.PlayableAd.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{playableAd}, -994883355, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 994883356, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
            } else {
                strOnMinimized = NativeAdsPlayableAdActivity.onMinimized(this.this$0);
            }
            NativeAdsPlayableAdActivity.asInterface(this.this$0, strOnMinimized);
            return Unit.INSTANCE;
        }
        String str2 = (String) pair.onExtraCallbackWithResult();
        String str3 = (String) pair.IAuthTabCallback();
        GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, str2, str3, null);
        this.L$0 = access15400.onNavigationEvent(pair);
        this.L$1 = access15400.onNavigationEvent(str2);
        this.L$2 = access15400.onNavigationEvent(str3);
        this.label = 2;
        objOnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, iAuthTabCallback, this);
    }
}
