package im.toss.rn.toss.core.legacy.bundle.v2;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.payment.ui.autopay.R;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.log.ReactLogKt;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager;
import im.toss.rn.toss.core.legacy.bundle.v2.ReactRemoteBundleSource;
import im.toss.rn.toss.core.util.RnAppVersion;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.IdGeneratorExternalSyntheticLambda1;
import o.MaxNativeAdLoaderImplb;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity5;
import o.WebSocketFactory;
import o.access13800;
import o.access14000;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.hExternalSyntheticLambda7;
import o.setCampaign;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactRemoteBundleSourceImpl$fetchBundle$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ReactRemoteBundleSource.Result>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -407439845116825381L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ String $bundleName;
    final /* synthetic */ String $company;
    final /* synthetic */ Date $minDeployedAt;
    final /* synthetic */ String $regionCode;
    int label;
    final /* synthetic */ ReactRemoteBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactRemoteBundleSourceImpl$fetchBundle$2(ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl, String str, String str2, String str3, Date date, access13800<? super ReactRemoteBundleSourceImpl$fetchBundle$2> access13800Var) {
        super(2, access13800Var);
        this.this$0 = reactRemoteBundleSourceImpl;
        this.$bundleName = str;
        this.$regionCode = str2;
        this.$company = str3;
        this.$minDeployedAt = date;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactRemoteBundleSourceImpl$fetchBundle$2 reactRemoteBundleSourceImpl$fetchBundle$2 = new ReactRemoteBundleSourceImpl$fetchBundle$2(this.this$0, this.$bundleName, this.$regionCode, this.$company, this.$minDeployedAt, access13800Var);
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return reactRemoteBundleSourceImpl$fetchBundle$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super ReactRemoteBundleSource.Result> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ReactRemoteBundleSourceImpl$fetchBundle$2 reactRemoteBundleSourceImpl$fetchBundle$2Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return reactRemoteBundleSourceImpl$fetchBundle$2Create.invokeSuspend(unit);
        }
        reactRemoteBundleSourceImpl$fetchBundle$2Create.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x05b0, code lost:
    
        if (r0.before(r51.$minDeployedAt) == false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af A[Catch: Exception -> 0x07d9, TryCatch #9 {Exception -> 0x07d9, blocks: (B:9:0x005c, B:11:0x006f, B:13:0x0075, B:15:0x0111, B:24:0x0134, B:31:0x0153, B:36:0x0181, B:39:0x0199, B:42:0x01a7, B:44:0x01af, B:46:0x01b8, B:45:0x01b4), top: B:229:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4 A[Catch: Exception -> 0x07d9, TryCatch #9 {Exception -> 0x07d9, blocks: (B:9:0x005c, B:11:0x006f, B:13:0x0075, B:15:0x0111, B:24:0x0134, B:31:0x0153, B:36:0x0181, B:39:0x0199, B:42:0x01a7, B:44:0x01af, B:46:0x01b8, B:45:0x01b4), top: B:229:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e4 A[Catch: Exception -> 0x07c8, TryCatch #23 {Exception -> 0x07c8, blocks: (B:49:0x01df, B:51:0x01ec, B:50:0x01e4), top: B:252:0x01cd }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029a A[Catch: Exception -> 0x0726, TRY_LEAVE, TryCatch #12 {Exception -> 0x0726, blocks: (B:63:0x027d, B:66:0x0295, B:68:0x029a), top: B:234:0x027d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a7 A[Catch: Exception -> 0x07a9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x07a9, blocks: (B:57:0x022e, B:59:0x0269, B:62:0x0271, B:70:0x02a7, B:76:0x02f9, B:81:0x0342, B:91:0x03a7, B:77:0x0330, B:80:0x033f, B:88:0x03a2, B:89:0x03a5), top: B:218:0x022e, inners: #11 }] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [o.hExternalSyntheticLambda7] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pairIAuthTabCallback;
        Object obj2;
        Pair pairIAuthTabCallback2;
        Object obj3;
        Pair pairIAuthTabCallback3;
        ?? r7;
        String strOnExtraCallback;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        Date date;
        ReactRemoteBundleSourceImpl reactRemoteBundleSourceImpl;
        Map mapOnExtraCallback;
        Pair pair;
        ?? r12;
        String str;
        String strIntern;
        Ref.LongRef longRef;
        String str2;
        String str3;
        Response responseNetworkResponse;
        Pair pair2;
        Object obj4;
        int iCode;
        Object obj5;
        Object obj6;
        byte[] bArrExtraCallback;
        String str4;
        Pair pair3;
        Pair pair4;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        TTBaseActivity tTBaseActivityOnWarmupCompleted;
        boolean zOnExtraCallbackWithResult;
        String str5;
        Object obj11;
        String str6;
        ReactBundle reactBundle;
        String strExecute = "react_native_debug";
        int i = 2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        try {
            strOnExtraCallback = ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company);
            convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String str7 = this.$bundleName;
            String str8 = this.$regionCode;
            String str9 = this.$company;
            date = this.$minDeployedAt;
            reactRemoteBundleSourceImpl = this.this$0;
            try {
                mapOnExtraCallback = access8100.onExtraCallback();
                mapOnExtraCallback.put("from", "ReactRemoteBundleSourceImpl");
                mapOnExtraCallback.put("bundleName", str7);
                mapOnExtraCallback.put("region", str8);
                mapOnExtraCallback.put("company", str9);
                pair = "errorType";
            } catch (Exception e) {
                e = e;
                pairIAuthTabCallback = "errorType";
                obj2 = "region";
                strExecute = "react_native_debug";
            }
        } catch (Exception e2) {
            e = e2;
            pairIAuthTabCallback = "errorType";
            obj2 = "region";
        }
        try {
            Object[] objArr = new Object[1];
            a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            mapOnExtraCallback.put(((String) objArr[0]).intern(), strOnExtraCallback);
            Object obj12 = null;
            mapOnExtraCallback.put("minDeployedAt", date != null ? date.toString() : null);
            mapOnExtraCallback.putAll(MaxNativeAdLoaderImplb.onNavigationEvent.onWarmupCompleted(ReactRemoteBundleSourceImpl.IAuthTabCallback(reactRemoteBundleSourceImpl)));
            Unit unit = Unit.INSTANCE;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_started", access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
            Request requestBuild = new Request.Builder().headers(new Headers.Builder().add("x-toss-app-version", RnAppVersion.onExtraCallback.onWarmupCompleted(ReactRemoteBundleSourceImpl.IAuthTabCallback(this.this$0), ReactRemoteBundleSourceImpl.onExtraCallbackWithResult(this.this$0))).add("TossDeviceId", ReactRemoteBundleSourceImpl.onNavigationEvent(this.this$0).onNavigationEvent()).build()).url(strOnExtraCallback).build();
            ReactLogKt.onNavigationEvent(this.$bundleName, strOnExtraCallback);
            final Ref.LongRef longRef2 = new Ref.LongRef();
            strExecute = ReactRemoteBundleSourceImpl.onWarmupCompleted(this.this$0).newBuilder().eventListener(new EventListener() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactRemoteBundleSourceImpl$fetchBundle$2$response$1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public void responseBodyEnd(Call call, long j) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(call, "");
                    } else {
                        Intrinsics.checkNotNullParameter(call, "");
                    }
                    super.responseBodyEnd(call, j);
                    longRef2.element += j;
                }
            }).build().newCall(requestBuild).execute();
            Response responseNetworkResponse2 = strExecute.networkResponse();
            if (responseNetworkResponse2 != null && responseNetworkResponse2.code() == 304) {
                int i2 = onWarmupCompleted + 89;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    r12 = 1;
                }
                int i3 = onWarmupCompleted + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                str = strExecute.headers().get("x-toss-signature");
                if (str == null) {
                }
                strIntern = strExecute.headers().get("x-toss-deployment-id");
                if (strIntern != null) {
                }
                str2 = strExecute.headers().get("x-toss-deployed-at");
                if (str2 == null) {
                }
                str3 = strExecute.headers().get("x-toss-shared-min-deployed-at");
                if (str3 == null) {
                }
                String str10 = this.$bundleName;
                Response responseNetworkResponse3 = strExecute.networkResponse();
                String str11 = str3;
                ReactLogKt.IAuthTabCallback(str10, strOnExtraCallback, responseNetworkResponse3 == null ? responseNetworkResponse3.code() : strExecute.code(), strIntern);
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("from", "ReactRemoteBundleSourceImpl");
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("bundleName", this.$bundleName);
                responseNetworkResponse = strExecute.networkResponse();
                if (responseNetworkResponse == null) {
                }
                Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("statusCode", access14000.onNavigationEvent(iCode));
                pairIAuthTabCallback3 = getWrite.IAuthTabCallback("contentLength", access14000.onExtraCallback(strExecute.body().contentLength()));
                pairIAuthTabCallback = getWrite.IAuthTabCallback("signature", str);
                Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("deploymentId", strIntern);
                Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("deployedAt", str2);
                pairIAuthTabCallback2 = getWrite.IAuthTabCallback("region", this.$regionCode);
                obj2 = "region";
                r7 = 6;
                Pair[] pairArr = {pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback3, pairIAuthTabCallback, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback2, getWrite.IAuthTabCallback("company", this.$company)};
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_response", access8100.onWarmupCompleted(pairArr), (String) null, false, (String) null, 56, (Object) null);
                if (strExecute.isSuccessful()) {
                    bArrExtraCallback = strExecute.body().source().extraCallback();
                    tTBaseActivityOnWarmupCompleted = new TTBaseActivity().onWarmupCompleted(bArrExtraCallback);
                    String str12 = this.$regionCode;
                    String str13 = this.$company;
                    ?? r72 = hExternalSyntheticLambda7.IAuthTabCallback;
                    zOnExtraCallbackWithResult = ReactBundleExtensionsKt.onExtraCallbackWithResult(tTBaseActivityOnWarmupCompleted, str, r72.onExtraCallback(str12, str13));
                    Object obj13 = null;
                    obj13 = null;
                    obj13 = null;
                    CloseableKt.closeFinally(tTBaseActivityOnWarmupCompleted, (Throwable) null);
                    if (zOnExtraCallbackWithResult) {
                    }
                }
                return new ReactRemoteBundleSource.Result.Error(new Exception("번들 fetch에 실패했습니다: " + this.$bundleName));
            }
            r12 = 0;
            int i32 = onWarmupCompleted + 35;
            onNavigationEvent = i32 % 128;
            int i42 = i32 % 2;
            str = strExecute.headers().get("x-toss-signature");
            if (str == null) {
                int i5 = onNavigationEvent + 109;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    obj12.hashCode();
                    throw null;
                }
                str = "";
            }
            strIntern = strExecute.headers().get("x-toss-deployment-id");
            if (strIntern != null) {
                longRef = longRef2;
                Object[] objArr2 = new Object[1];
                a(new char[]{13721, 27159, 35501, 11069, 19415, 59506, 2300}, ExpandableListView.getPackedPositionChild(0L) + 24470, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            } else {
                longRef = longRef2;
            }
            str2 = strExecute.headers().get("x-toss-deployed-at");
            if (str2 == null) {
                int i6 = onNavigationEvent + 13;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str2 = "00000000000000";
            }
            str3 = strExecute.headers().get("x-toss-shared-min-deployed-at");
            if (str3 == null) {
                str3 = "00000000000000";
            }
            String str102 = this.$bundleName;
            Response responseNetworkResponse32 = strExecute.networkResponse();
            String str112 = str3;
            ReactLogKt.IAuthTabCallback(str102, strOnExtraCallback, responseNetworkResponse32 == null ? responseNetworkResponse32.code() : strExecute.code(), strIntern);
            Pair pairIAuthTabCallback42 = getWrite.IAuthTabCallback("from", "ReactRemoteBundleSourceImpl");
            Pair pairIAuthTabCallback52 = getWrite.IAuthTabCallback("bundleName", this.$bundleName);
            responseNetworkResponse = strExecute.networkResponse();
            try {
                if (responseNetworkResponse == null) {
                    pair2 = "bundleName";
                    int i8 = onNavigationEvent + 3;
                    obj4 = "ReactRemoteBundleSourceImpl";
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    iCode = responseNetworkResponse.code();
                } else {
                    pair2 = "bundleName";
                    obj4 = "ReactRemoteBundleSourceImpl";
                    iCode = strExecute.code();
                }
                Pair pairIAuthTabCallback62 = getWrite.IAuthTabCallback("statusCode", access14000.onNavigationEvent(iCode));
                pairIAuthTabCallback3 = getWrite.IAuthTabCallback("contentLength", access14000.onExtraCallback(strExecute.body().contentLength()));
                pairIAuthTabCallback = getWrite.IAuthTabCallback("signature", str);
                Pair pairIAuthTabCallback72 = getWrite.IAuthTabCallback("deploymentId", strIntern);
                Pair pairIAuthTabCallback82 = getWrite.IAuthTabCallback("deployedAt", str2);
                try {
                    pairIAuthTabCallback2 = getWrite.IAuthTabCallback("region", this.$regionCode);
                    obj2 = "region";
                    try {
                        try {
                            r7 = 6;
                            Pair[] pairArr2 = {pairIAuthTabCallback42, pairIAuthTabCallback52, pairIAuthTabCallback62, pairIAuthTabCallback3, pairIAuthTabCallback, pairIAuthTabCallback72, pairIAuthTabCallback82, pairIAuthTabCallback2, getWrite.IAuthTabCallback("company", this.$company)};
                            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_fetch_response", access8100.onWarmupCompleted(pairArr2), (String) null, false, (String) null, 56, (Object) null);
                            try {
                                if (strExecute.isSuccessful() && strExecute.body() != null) {
                                    bArrExtraCallback = strExecute.body().source().extraCallback();
                                    try {
                                        tTBaseActivityOnWarmupCompleted = new TTBaseActivity().onWarmupCompleted(bArrExtraCallback);
                                        String str122 = this.$regionCode;
                                        String str132 = this.$company;
                                        try {
                                            ?? r722 = hExternalSyntheticLambda7.IAuthTabCallback;
                                            zOnExtraCallbackWithResult = ReactBundleExtensionsKt.onExtraCallbackWithResult(tTBaseActivityOnWarmupCompleted, str, r722.onExtraCallback(str122, str132));
                                            Object obj132 = null;
                                            obj132 = null;
                                            obj132 = null;
                                            CloseableKt.closeFinally(tTBaseActivityOnWarmupCompleted, (Throwable) null);
                                            if (zOnExtraCallbackWithResult) {
                                                return new ReactRemoteBundleSource.Result.Error(new Exception("번들 파일 검증에 실패했습니다."));
                                            }
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            try {
                                                try {
                                                    try {
                                                        if (r12 != 0) {
                                                            int i10 = onNavigationEvent + 65;
                                                            onWarmupCompleted = i10 % 128;
                                                            if (i10 % 2 != 0) {
                                                                ((Boolean) ReactBundleFileManager.onNavigationEvent(new Object[]{ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0), this.$bundleName, str, strIntern, str2, str112, this.$regionCode, this.$company}, -1587490076, 1587490076, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted())).booleanValue();
                                                                throw null;
                                                            }
                                                            try {
                                                                if (((Boolean) ReactBundleFileManager.onNavigationEvent(new Object[]{ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0), this.$bundleName, str, strIntern, str2, str112, this.$regionCode, this.$company}, -1587490076, 1587490076, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted())).booleanValue()) {
                                                                    ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onExtraCallbackWithResult(this.$bundleName, jCurrentTimeMillis, this.$regionCode, this.$company);
                                                                    File fileOnNavigationEvent = ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onNavigationEvent(this.$bundleName, this.$regionCode, this.$company);
                                                                    try {
                                                                        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onWarmupCompleted(this.$bundleName, this.$regionCode, this.$company)));
                                                                        try {
                                                                            TossReactBundleMeta tossReactBundleMetaOnExtraCallback = TossReactBundleMeta.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                                                                            CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                                                            reactBundle = new ReactBundle(this.$bundleName, fileOnNavigationEvent.getAbsolutePath(), tossReactBundleMetaOnExtraCallback.onTransact(), tossReactBundleMetaOnExtraCallback.IAuthTabCallback(), (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallback}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()), tossReactBundleMetaOnExtraCallback.asInterface(), access14000.onExtraCallback(tossReactBundleMetaOnExtraCallback.asBinder()), access14000.onExtraCallback(jCurrentTimeMillis), false);
                                                                            str6 = strExecute;
                                                                            str5 = "react_native_debug";
                                                                            pairIAuthTabCallback3 = pair2;
                                                                            r722 = obj4;
                                                                            obj11 = "deploymentId";
                                                                            obj132 = "from";
                                                                            pairIAuthTabCallback2 = "company";
                                                                        } finally {
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        Object obj14 = obj4;
                                                                        Object obj15 = "from";
                                                                        try {
                                                                            pairIAuthTabCallback3 = pair2;
                                                                            try {
                                                                                pairIAuthTabCallback2 = "company";
                                                                                try {
                                                                                    pairIAuthTabCallback = pair;
                                                                                    try {
                                                                                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "metadata_read_failed_after_update", e3, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj15, obj14), getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName), getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company), getWrite.IAuthTabCallback("deploymentId", strIntern), getWrite.IAuthTabCallback(pairIAuthTabCallback, e3.getClass().getSimpleName())}));
                                                                                        return new ReactRemoteBundleSource.Result.Error(new Exception("업데이트 후 기존 번들 " + this.$bundleName + " 의 메타데이터를 읽는데 실패했습니다.", e3));
                                                                                    } catch (Exception e4) {
                                                                                        e = e4;
                                                                                        strExecute = "react_native_debug";
                                                                                        obj3 = obj15;
                                                                                        r7 = obj14;
                                                                                    }
                                                                                } catch (Exception e5) {
                                                                                    e = e5;
                                                                                    strExecute = "react_native_debug";
                                                                                    pairIAuthTabCallback = pair;
                                                                                    obj3 = obj15;
                                                                                    r7 = obj14;
                                                                                }
                                                                            } catch (Exception e6) {
                                                                                e = e6;
                                                                                strExecute = "react_native_debug";
                                                                                pairIAuthTabCallback = pair;
                                                                                obj6 = obj15;
                                                                                obj5 = obj14;
                                                                                pairIAuthTabCallback2 = "company";
                                                                                obj3 = obj6;
                                                                                r7 = obj5;
                                                                                ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                                Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                                                                                Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                                                                                Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                                                                                Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                                                                                Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                                                                                Object[] objArr3 = new Object[1];
                                                                                a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
                                                                                convertFloatArrayToByteArray2.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, pairIAuthTabCallback13, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                                                                                return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                                                                            }
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            strExecute = "react_native_debug";
                                                                            pairIAuthTabCallback = pair;
                                                                            pairIAuthTabCallback3 = pair2;
                                                                            obj6 = obj15;
                                                                            obj5 = obj14;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str5 = "react_native_debug";
                                                                    pairIAuthTabCallback3 = pair2;
                                                                    r722 = obj4;
                                                                    obj11 = "deploymentId";
                                                                    obj132 = "from";
                                                                    pairIAuthTabCallback2 = "company";
                                                                    if (r12 != 0 && bArrExtraCallback.length == 0) {
                                                                        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", this.$bundleName + " 에 대해 HTTP_NOT_MODIFIED 응답을 받았으나, 일치하는 로컬 번들이 없습니다.", (Throwable) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(obj132, (Object) r722)), 4, (Object) null);
                                                                        return new ReactRemoteBundleSource.Result.Error(new Exception(this.$bundleName + " 에 대해 HTTP_NOT_MODIFIED 응답을 받았으나, 로컬 번들이 없거나 헤더가 일치하지 않습니다."));
                                                                    }
                                                                    try {
                                                                        pair = pair;
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        pair = pair;
                                                                    }
                                                                    try {
                                                                        str6 = strExecute;
                                                                        String strOnNavigationEvent = ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onNavigationEvent(this.$bundleName, new TTBaseActivity().onWarmupCompleted(bArrExtraCallback), str, strIntern, str2, str112, jCurrentTimeMillis, this.$regionCode, this.$company, ReactRemoteBundleSourceImpl.onExtraCallbackWithResult(this.this$0).requestPostMessageChannelWithExtras());
                                                                        if (strOnNavigationEvent == null) {
                                                                            ReactRemoteBundleSource.Result.Error error = new ReactRemoteBundleSource.Result.Error(new Exception(this.$bundleName + " 번들 직접 저장 실패"));
                                                                            int i11 = onNavigationEvent + 107;
                                                                            onWarmupCompleted = i11 % 128;
                                                                            if (i11 % 2 == 0) {
                                                                                return error;
                                                                            }
                                                                            throw null;
                                                                        }
                                                                        try {
                                                                            reactBundle = new ReactBundle(this.$bundleName, strOnNavigationEvent, str, strIntern, str2, str112, access14000.onExtraCallback(jCurrentTimeMillis), access14000.onExtraCallback(jCurrentTimeMillis), false);
                                                                            obj132 = obj132;
                                                                            r722 = r722;
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            r12 = obj2;
                                                                            obj2 = r12;
                                                                            pairIAuthTabCallback = pair;
                                                                            strExecute = str5;
                                                                            obj3 = obj132;
                                                                            r7 = r722;
                                                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray22 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                            Pair pairIAuthTabCallback92 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                                                                            Pair pairIAuthTabCallback102 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                                                                            Pair pairIAuthTabCallback112 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                                                                            Pair pairIAuthTabCallback122 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                                                                            Pair pairIAuthTabCallback132 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                                                                            Object[] objArr32 = new Object[1];
                                                                            a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr32);
                                                                            convertFloatArrayToByteArray22.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback92, pairIAuthTabCallback102, pairIAuthTabCallback112, pairIAuthTabCallback122, pairIAuthTabCallback132, getWrite.IAuthTabCallback(((String) objArr32[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                                                                            return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                                                                        }
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        pairIAuthTabCallback = pair;
                                                                        try {
                                                                            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str5, "bundle_save_direct_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj132, (Object) r722), getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName), getWrite.IAuthTabCallback(obj2, this.$regionCode), getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company), getWrite.IAuthTabCallback(obj11, strIntern), getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName())}));
                                                                            return new ReactRemoteBundleSource.Result.Error(new Exception(this.$bundleName + " 번들을 직접 저장하는데 실패했습니다.", e));
                                                                        } catch (Exception e11) {
                                                                            e = e11;
                                                                            obj2 = obj2;
                                                                            strExecute = str5;
                                                                            obj3 = obj132;
                                                                            r7 = r722;
                                                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                            Pair pairIAuthTabCallback922 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                                                                            Pair pairIAuthTabCallback1022 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                                                                            Pair pairIAuthTabCallback1122 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                                                                            Pair pairIAuthTabCallback1222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                                                                            Pair pairIAuthTabCallback1322 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                                                                            Object[] objArr322 = new Object[1];
                                                                            a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr322);
                                                                            convertFloatArrayToByteArray222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback922, pairIAuthTabCallback1022, pairIAuthTabCallback1122, pairIAuthTabCallback1222, pairIAuthTabCallback1322, getWrite.IAuthTabCallback(((String) objArr322[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                                                                            return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                                                                        }
                                                                    }
                                                                }
                                                                if (this.$minDeployedAt != null) {
                                                                    Locale locale = Locale.US;
                                                                    Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                    Object[] objArr4 = new Object[1];
                                                                    a(new char[]{13717, 12778, 15723, 14568, 9309, 9178, 12146, 10993, 5724, 7635, 6519, 1268, 'k', 4076}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1151, objArr4);
                                                                    Date dateOnWarmupCompleted = setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr4[0]).intern(), locale), reactBundle.IAuthTabCallback());
                                                                    if (dateOnWarmupCompleted != null) {
                                                                        int i12 = onWarmupCompleted + 47;
                                                                        onNavigationEvent = i12 % 128;
                                                                        int i13 = i12 % 2;
                                                                    }
                                                                    String str14 = this.$bundleName;
                                                                    String strIAuthTabCallback = reactBundle.IAuthTabCallback();
                                                                    Date date2 = this.$minDeployedAt;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    try {
                                                                        sb.append("minDeployedAt verification Failed for bundle ");
                                                                        sb.append(str14);
                                                                        sb.append(". Bundle deployed at ");
                                                                        sb.append(strIAuthTabCallback);
                                                                        sb.append(" (parsed: ");
                                                                        sb.append(dateOnWarmupCompleted);
                                                                        sb.append("), required at least ");
                                                                        sb.append(date2);
                                                                        String string = sb.toString();
                                                                        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "react_native_debug", "min_deployed_at_verification_failed", (Throwable) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj132, (Object) r722), getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName), getWrite.IAuthTabCallback(obj2, this.$regionCode), getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company), getWrite.IAuthTabCallback(obj11, strIntern), getWrite.IAuthTabCallback("bundleDeployedAt", reactBundle.IAuthTabCallback()), getWrite.IAuthTabCallback("requiredMinDeployedAt", this.$minDeployedAt.toString())}), 4, (Object) null);
                                                                        ReactBundleFileManager.Companion companion = ReactBundleFileManager.Companion;
                                                                        companion.IAuthTabCallback(ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onNavigationEvent(this.$bundleName, this.$regionCode, this.$company));
                                                                        companion.IAuthTabCallback(ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0).onWarmupCompleted(this.$bundleName, this.$regionCode, this.$company));
                                                                        return new ReactRemoteBundleSource.Result.Error(new Exception(string));
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        pairIAuthTabCallback = pair;
                                                                        strExecute = str5;
                                                                        obj3 = obj132;
                                                                        r7 = r722;
                                                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                        Pair pairIAuthTabCallback9222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                                                                        Pair pairIAuthTabCallback10222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                                                                        Pair pairIAuthTabCallback11222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                                                                        Pair pairIAuthTabCallback12222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                                                                        Pair pairIAuthTabCallback13222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                                                                        Object[] objArr3222 = new Object[1];
                                                                        a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr3222);
                                                                        convertFloatArrayToByteArray2222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback9222, pairIAuthTabCallback10222, pairIAuthTabCallback11222, pairIAuthTabCallback12222, pairIAuthTabCallback13222, getWrite.IAuthTabCallback(((String) objArr3222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                                                                        return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                                                                    }
                                                                }
                                                                return new ReactRemoteBundleSource.Result.Success(reactBundle, str6.code(), longRef.element);
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                str5 = "react_native_debug";
                                                                pairIAuthTabCallback = pair;
                                                                pairIAuthTabCallback3 = pair2;
                                                                r722 = obj4;
                                                                obj132 = "from";
                                                                pairIAuthTabCallback2 = "company";
                                                                strExecute = str5;
                                                                obj3 = obj132;
                                                                r7 = r722;
                                                                ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                Pair pairIAuthTabCallback92222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                                                                Pair pairIAuthTabCallback102222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                                                                Pair pairIAuthTabCallback112222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                                                                Pair pairIAuthTabCallback122222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                                                                Pair pairIAuthTabCallback132222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                                                                Object[] objArr32222 = new Object[1];
                                                                a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr32222);
                                                                convertFloatArrayToByteArray22222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback92222, pairIAuthTabCallback102222, pairIAuthTabCallback112222, pairIAuthTabCallback122222, pairIAuthTabCallback132222, getWrite.IAuthTabCallback(((String) objArr32222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                                                                return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                                                            }
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                            }
                                        } catch (Throwable th) {
                                            str4 = "react_native_debug";
                                            pair3 = pair;
                                            pair4 = pair2;
                                            obj7 = obj4;
                                            obj8 = "deploymentId";
                                            obj9 = "from";
                                            obj10 = "company";
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                try {
                                                    CloseableKt.closeFinally(tTBaseActivityOnWarmupCompleted, th);
                                                    throw th2;
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str4, "bundle_verification_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj9, obj7), getWrite.IAuthTabCallback(pair4, this.$bundleName), getWrite.IAuthTabCallback(obj10, this.$company), getWrite.IAuthTabCallback(obj8, strIntern), getWrite.IAuthTabCallback(pair3, e.getClass().getSimpleName())}));
                                                    return new ReactRemoteBundleSource.Result.Error(new Exception(e));
                                                }
                                            }
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        str4 = "react_native_debug";
                                        pair3 = pair;
                                        pair4 = pair2;
                                        obj7 = obj4;
                                        obj8 = "deploymentId";
                                        obj9 = "from";
                                        obj10 = "company";
                                    }
                                }
                                return new ReactRemoteBundleSource.Result.Error(new Exception("번들 fetch에 실패했습니다: " + this.$bundleName));
                            } catch (Exception e19) {
                                e = e19;
                                obj3 = pairArr2;
                            }
                        } catch (Exception e20) {
                            e = e20;
                            strExecute = "react_native_debug";
                            pairIAuthTabCallback = pair;
                            pairIAuthTabCallback3 = pair2;
                            obj5 = obj4;
                            obj6 = "from";
                            pairIAuthTabCallback2 = "company";
                            obj3 = obj6;
                            r7 = obj5;
                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                            Pair pairIAuthTabCallback922222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                            Pair pairIAuthTabCallback1022222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                            Pair pairIAuthTabCallback1122222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                            Pair pairIAuthTabCallback1222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                            Pair pairIAuthTabCallback1322222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                            Object[] objArr322222 = new Object[1];
                            a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr322222);
                            convertFloatArrayToByteArray222222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback922222, pairIAuthTabCallback1022222, pairIAuthTabCallback1122222, pairIAuthTabCallback1222222, pairIAuthTabCallback1322222, getWrite.IAuthTabCallback(((String) objArr322222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                            return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                        }
                    } catch (Exception e21) {
                        e = e21;
                        pairIAuthTabCallback2 = "company";
                        strExecute = "react_native_debug";
                        pairIAuthTabCallback = pair;
                        pairIAuthTabCallback3 = pair2;
                        r7 = obj4;
                        obj3 = "from";
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Pair pairIAuthTabCallback9222222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
                        Pair pairIAuthTabCallback10222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
                        Pair pairIAuthTabCallback11222222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
                        Pair pairIAuthTabCallback12222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
                        Pair pairIAuthTabCallback13222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
                        Object[] objArr3222222 = new Object[1];
                        a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr3222222);
                        convertFloatArrayToByteArray2222222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback9222222, pairIAuthTabCallback10222222, pairIAuthTabCallback11222222, pairIAuthTabCallback12222222, pairIAuthTabCallback13222222, getWrite.IAuthTabCallback(((String) objArr3222222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
                        return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
                    }
                } catch (Exception e22) {
                    e = e22;
                    obj2 = "region";
                }
            } catch (Exception e23) {
                e = e23;
                obj2 = "region";
                strExecute = "react_native_debug";
                pairIAuthTabCallback = pair;
                pairIAuthTabCallback3 = pair2;
                r7 = obj4;
                pairIAuthTabCallback2 = "company";
                obj3 = "from";
            }
        } catch (Exception e24) {
            e = e24;
            obj2 = "region";
            strExecute = "react_native_debug";
            pairIAuthTabCallback = pair;
            pairIAuthTabCallback2 = "company";
            obj3 = "from";
            pairIAuthTabCallback3 = "bundleName";
            r7 = "ReactRemoteBundleSourceImpl";
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback92222222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
            Pair pairIAuthTabCallback102222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
            Pair pairIAuthTabCallback112222222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
            Pair pairIAuthTabCallback122222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
            Pair pairIAuthTabCallback132222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
            Object[] objArr32222222 = new Object[1];
            a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr32222222);
            convertFloatArrayToByteArray22222222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback92222222, pairIAuthTabCallback102222222, pairIAuthTabCallback112222222, pairIAuthTabCallback122222222, pairIAuthTabCallback132222222, getWrite.IAuthTabCallback(((String) objArr32222222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
            return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback922222222 = getWrite.IAuthTabCallback(obj3, (Object) r7);
        Pair pairIAuthTabCallback1022222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback3, this.$bundleName);
        Pair pairIAuthTabCallback1122222222 = getWrite.IAuthTabCallback(obj2, this.$regionCode);
        Pair pairIAuthTabCallback1222222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback2, this.$company);
        Pair pairIAuthTabCallback1322222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, e.getClass().getSimpleName());
        Object[] objArr322222222 = new Object[1];
        a(new char[]{13721, 42055, 5682}, 37337 - (ViewConfiguration.getTouchSlop() >> 8), objArr322222222);
        convertFloatArrayToByteArray222222222.onExtraCallbackWithResult(strExecute, "bundle_fetch_failed", e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback922222222, pairIAuthTabCallback1022222222, pairIAuthTabCallback1122222222, pairIAuthTabCallback1222222222, pairIAuthTabCallback1322222222, getWrite.IAuthTabCallback(((String) objArr322222222[0]).intern(), ReactRemoteBundleSourceImpl.onExtraCallback(this.this$0, this.$bundleName, this.$regionCode, this.$company))}));
        return new ReactRemoteBundleSource.Result.Error(new Exception("Error fetching bundle " + this.$bundleName, e));
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 19627 - TextUtils.getCapsMode("", 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") + 60, 6382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 21;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }
}
