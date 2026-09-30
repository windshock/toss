package im.toss.ads_sdk.playable;

import android.webkit.WebView;
import im.toss.ads_sdk.model.NativeAdsDto;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import o.GeckoHubImp;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.doGet;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.putChannelInfo;
import o.setInternalPageChangeListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsPlayableAdActivity$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ String $urlString;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ NativeAdsPlayableAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsPlayableAdActivity$onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, access13800<? super NativeAdsPlayableAdActivity$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = nativeAdsPlayableAdActivity;
        this.$urlString = str;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(nativeAdsPlayableAdActivity, str, str2);
        int i5 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsPlayableAdActivity$onNavigationEvent nativeAdsPlayableAdActivity$onNavigationEvent = new NativeAdsPlayableAdActivity$onNavigationEvent(this.this$0, this.$urlString, access13800Var);
        int i3 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsPlayableAdActivity$onNavigationEvent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsPlayableAdActivity$onNavigationEvent nativeAdsPlayableAdActivity$onNavigationEventCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            nativeAdsPlayableAdActivity$onNavigationEventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = nativeAdsPlayableAdActivity$onNavigationEventCreate.invokeSuspend(unit);
        int i5 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return objInvokeSuspend;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends String>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $urlString;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ NativeAdsPlayableAdActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsPlayableAdActivity;
            this.$urlString = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$urlString, access13800Var);
            int i3 = IAuthTabCallback + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 49 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Pair<String, String>> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, String>> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:67)|(1:(2:5|(12:7|61|8|9|63|32|(3:65|34|35)|43|(1:45)|46|55|(2:57|58)(1:69))(2:12|13))(3:14|15|16))(4:17|18|(3:20|(1:23)|24)|48)|25|59|26|(1:28)|29|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
        
            if (r5 == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[Catch: Exception -> 0x0115, CancellationException -> 0x0121, WebResourceResponseModel -> 0x0123, TryCatch #6 {CancellationException -> 0x0121, Exception -> 0x0115, WebResourceResponseModel -> 0x0123, blocks: (B:43:0x0100, B:45:0x0106, B:46:0x010a, B:42:0x00ec, B:15:0x004f, B:25:0x0086, B:18:0x005e), top: B:67:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity;
            int i2;
            Object objOnWarmupCompleted;
            int i3;
            onWarmupCompleted onwarmupcompleted;
            String str;
            Object objOnWarmupCompleted2;
            String strOnActivityResized = "";
            int i4 = 2 % 2;
            Object objOnWarmupCompleted3 = access14300.onWarmupCompleted();
            int i5 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                nativeAdsPlayableAdActivity = this.this$0;
                String str2 = this.$urlString;
                Result.Companion companion3 = Result.Companion;
                setInternalPageChangeListener setinternalpagechangelistenerOnRelationshipValidationResult = NativeAdsPlayableAdActivity.onRelationshipValidationResult(nativeAdsPlayableAdActivity);
                this.L$0 = nativeAdsPlayableAdActivity;
                this.L$1 = access15400.onNavigationEvent(this);
                i2 = 0;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnWarmupCompleted = setinternalpagechangelistenerOnRelationshipValidationResult.onWarmupCompleted(str2, this);
                if (objOnWarmupCompleted != objOnWarmupCompleted3) {
                    int i6 = IAuthTabCallback + 1;
                    onWarmupCompleted = i6 % 128;
                    i3 = i6 % 2 != 0 ? 0 : 1;
                    onwarmupcompleted = this;
                }
                return objOnWarmupCompleted3;
            }
            if (i5 != 1) {
                int i7 = onWarmupCompleted + 3;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strOnActivityResized = (String) this.L$3;
                str = (String) this.L$2;
                NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity2 = (NativeAdsPlayableAdActivity) this.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    nativeAdsPlayableAdActivity = nativeAdsPlayableAdActivity2;
                    objOnWarmupCompleted2 = obj;
                } catch (Exception e4) {
                    e = e4;
                    nativeAdsPlayableAdActivity = nativeAdsPlayableAdActivity2;
                    NativeAdsPlayableAdActivity.onNavigationEvent(nativeAdsPlayableAdActivity, "Remote MRAID download failed, fallback to local cache/asset " + e);
                    if (StringsKt.isBlank(strOnActivityResized)) {
                    }
                    obj2 = Result.constructor-impl(new Pair(str, strOnActivityResized));
                    if (!Result.onExtraCallback(obj2)) {
                    }
                }
                try {
                    String str3 = (String) objOnWarmupCompleted2;
                    if (!StringsKt.isBlank(str3)) {
                        try {
                            NativeAdsPlayableAdActivity.IAuthTabCallbackDefault(nativeAdsPlayableAdActivity, str3);
                            strOnActivityResized = str3;
                        } catch (Exception e5) {
                            e = e5;
                            strOnActivityResized = str3;
                            NativeAdsPlayableAdActivity.onNavigationEvent(nativeAdsPlayableAdActivity, "Remote MRAID download failed, fallback to local cache/asset " + e);
                            if (StringsKt.isBlank(strOnActivityResized)) {
                            }
                            obj2 = Result.constructor-impl(new Pair(str, strOnActivityResized));
                            if (!Result.onExtraCallback(obj2)) {
                            }
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    nativeAdsPlayableAdActivity2 = nativeAdsPlayableAdActivity;
                    nativeAdsPlayableAdActivity = nativeAdsPlayableAdActivity2;
                    NativeAdsPlayableAdActivity.onNavigationEvent(nativeAdsPlayableAdActivity, "Remote MRAID download failed, fallback to local cache/asset " + e);
                    if (StringsKt.isBlank(strOnActivityResized)) {
                    }
                    obj2 = Result.constructor-impl(new Pair(str, strOnActivityResized));
                    if (!Result.onExtraCallback(obj2)) {
                    }
                }
                if (StringsKt.isBlank(strOnActivityResized)) {
                    strOnActivityResized = NativeAdsPlayableAdActivity.onActivityResized(nativeAdsPlayableAdActivity);
                }
                obj2 = Result.constructor-impl(new Pair(str, strOnActivityResized));
                if (!Result.onExtraCallback(obj2)) {
                    return obj2;
                }
                int i9 = IAuthTabCallback + 69;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return null;
            }
            int i11 = this.I$1;
            int i12 = this.I$0;
            onwarmupcompleted = (access13800) this.L$1;
            nativeAdsPlayableAdActivity = (NativeAdsPlayableAdActivity) this.L$0;
            ResultKt.onNavigationEvent(obj);
            i2 = i12;
            i3 = i11;
            objOnWarmupCompleted = obj;
            str = (String) objOnWarmupCompleted;
            setInternalPageChangeListener setinternalpagechangelistenerOnRelationshipValidationResult2 = NativeAdsPlayableAdActivity.onRelationshipValidationResult(nativeAdsPlayableAdActivity);
            String strOnWarmupCompleted = ((NativeAdsDto) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1362740741, 1362740770, new Object[]{nativeAdsPlayableAdActivity})).onTransact().onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = NativeAdsPlayableAdActivity.extraCallbackWithResult(nativeAdsPlayableAdActivity).onExtraCallback();
            }
            this.L$0 = nativeAdsPlayableAdActivity;
            this.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
            this.L$2 = str;
            this.L$3 = "";
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 2;
            objOnWarmupCompleted2 = setinternalpagechangelistenerOnRelationshipValidationResult2.onWarmupCompleted(strOnWarmupCompleted, this);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $htmlBody;
        final /* synthetic */ String $mraidJs;
        int label;
        final /* synthetic */ NativeAdsPlayableAdActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, String str2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsPlayableAdActivity;
            this.$htmlBody = str;
            this.$mraidJs = str2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, this.$htmlBody, this.$mraidJs, access13800Var);
            int i3 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super String> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {this.this$0, this.$htmlBody, this.$mraidJs};
            String str = (String) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -393095694, 393095701, objArr);
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    private static final void onExtraCallbackWithResult(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        WebView webView = NativeAdsPlayableAdActivity.ICustomTabsCallback(nativeAdsPlayableAdActivity).ICustomTabsCallback;
        if (i4 == 0) {
            webView.loadDataWithBaseURL(str, str2, "text/html", "utf-8", null);
            return;
        }
        webView.loadDataWithBaseURL(str, str2, "text/html", "utf-8", null);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        if (r9 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            NativeAdsPlayableAdActivity.onNavigationEvent(this.this$0, "loadHtmlFromCdn start (Large file support): " + this.$urlString);
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$urlString, null);
            this.label = 1;
            obj = doGet.onWarmupCompleted(10000L, onwarmupcompleted, this);
            if (obj != objOnWarmupCompleted) {
            }
            int i6 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 22 / 0;
            }
            return objOnWarmupCompleted;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            ResultKt.onNavigationEvent(obj);
            final String str = (String) obj;
            final NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.this$0;
            final String str2 = this.$urlString;
            nativeAdsPlayableAdActivity.runOnUiThread(new Runnable() { // from class: im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity$loadHtmlFromCdn$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 61;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        NativeAdsPlayableAdActivity$onNavigationEvent.onNavigationEvent(nativeAdsPlayableAdActivity, str2, str);
                        int i12 = 73 / 0;
                    } else {
                        NativeAdsPlayableAdActivity$onNavigationEvent.onNavigationEvent(nativeAdsPlayableAdActivity, str2, str);
                    }
                    int i13 = onWarmupCompleted + 43;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
            });
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        Pair pair = (Pair) obj;
        if (pair == null) {
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        String str3 = (String) pair.onExtraCallbackWithResult();
        String str4 = (String) pair.IAuthTabCallback();
        GeckoHubImp geckoHubImpOnWarmupCompleted = putChannelInfo.onWarmupCompleted();
        onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, str3, str4, null);
        this.L$0 = access15400.onNavigationEvent(pair);
        this.L$1 = access15400.onNavigationEvent(str3);
        this.L$2 = access15400.onNavigationEvent(str4);
        this.label = 2;
        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpOnWarmupCompleted, onnavigationevent, this);
    }
}
