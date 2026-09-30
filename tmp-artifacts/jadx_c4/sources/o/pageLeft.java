package o;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.PlayableAdInfoResponse;
import im.toss.ads_sdk.remote.api.ApiResponse;
import im.toss.ads_sdk.remote.model.AdInAdRequest;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.ads_sdk.remote.model.SspSdkAdResponse;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class pageLeft {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final setOffscreenPageLimit IAuthTabCallback;
    private final Context onExtraCallback;
    private String onNavigationEvent;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallbackWithResult = 8;

    static final class asBinder<T> extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            pageLeft pageleft = pageLeft.this;
            if (i3 != 0) {
                return pageLeft.onExtraCallback(pageleft, null, null, null, this);
            }
            pageLeft.onExtraCallback(pageleft, null, null, null, this);
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = pageLeft.onExtraCallbackWithResult(pageLeft.this, this);
            int i4 = onExtraCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    static {
        int i = onWarmupCompleted + 105;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i)) | (~(i7 | i9)) | (~(i9 | i));
        int i14 = i + i4 + i5 + (669352129 * i2) + (266941808 * i6);
        int i15 = i14 * i14;
        int i16 = (720661947 * i) + 1572077568 + ((-1243901369) * i4) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i5) + ((-1100480512) * i2) + ((-1249902592) * i6) + ((-491520000) * i15);
        int i17 = (i * 1617402437) + 56426783 + (i4 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i5 * 1617401855) + (i2 * 1244927807) + (i6 * (-404665712)) + (i15 * (-45350912));
        return i16 + ((i17 * i17) * 1565261824) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    @Inject
    public pageLeft(@NotNull setOffscreenPageLimit setoffscreenpagelimit, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(setoffscreenpagelimit, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = setoffscreenpagelimit;
        this.onExtraCallback = context;
    }

    public static final /* synthetic */ setOffscreenPageLimit IAuthTabCallback(pageLeft pageleft) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        setOffscreenPageLimit setoffscreenpagelimit = pageleft.IAuthTabCallback;
        int i5 = i3 + 23;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return setoffscreenpagelimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallback(pageLeft pageleft, String str, Map map, Function1 function1, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return pageleft.onWarmupCompleted(str, map, function1, access13800Var);
        }
        pageleft.onWarmupCompleted(str, map, function1, access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallback(pageLeft pageleft) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = pageleft.onNavigationEvent;
        int i5 = i3 + 47;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(pageLeft pageleft, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        Object objIAuthTabCallback = IAuthTabCallback(-925441249, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, 925441249, iOnExtraCallback2, new Object[]{pageleft, access13800Var}, PushInfo.Companion.onExtraCallback());
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onNavigationEvent(pageLeft pageleft, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        pageleft.onNavigationEvent = str;
        int i5 = i2 + 67;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
    }

    public static final /* synthetic */ Context onWarmupCompleted(pageLeft pageleft) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Context context = pageleft.onExtraCallback;
        int i5 = i2 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public final Object onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull GetNativeAdsRequestBody.AppInfo appInfo, @NotNull String str4, @NotNull Set<String> set, @Nullable String str5, @Nullable String str6, @NotNull Map<String, String> map, @NotNull GetNativeAdsRequestBody.AdRequestOption adRequestOption, @NotNull access13800<? super NativeAdsDto> access13800Var) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted("getNativeAds", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("space_unit_id", str2), getWrite.IAuthTabCallback("session_id", str), getWrite.IAuthTabCallback("sdk_id", str3)}), new onExtraCallback(str5, map, str6, str2, str, str3, set, appInfo, str4, adRequestOption, null), access13800Var);
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, @NotNull GetNativeAdsRequestBody.AppInfo appInfo, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @NotNull Map<String, String> map, @NotNull access13800<? super SspSdkAdResponse> access13800Var) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted("getNativeAdsV2", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("space_unit_id", str2), getWrite.IAuthTabCallback("slot_id", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), getWrite.IAuthTabCallback("session_id", str), getWrite.IAuthTabCallback("sdk_id", str3), getWrite.IAuthTabCallback("product_type", str5)}), new asInterface(str7, map, str8, list, str4, str, appInfo, str5, str6, str2, null), access13800Var);
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onExtraCallbackWithResult(@NotNull String str, @NotNull JsonObject jsonObject, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map, @NotNull access13800<? super JsonObject> access13800Var) throws Throwable {
        int i = 2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted("getNativeAdsRaw", access8100.onNavigationEvent(getWrite.IAuthTabCallback("session_id", str)), new IAuthTabCallbackDefault(str2, str3, map, jsonObject, str, new GetNativeAdsRequestBody((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Set) null, (GetNativeAdsRequestBody.AppInfo) null, (GetNativeAdsRequestBody.DeviceInfo) null, (GetNativeAdsRequestBody.AdRequestOption) null, (String) null, (String) null, (List) null, 16383, (DefaultConstructorMarker) null), null), access13800Var);
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return objOnWarmupCompleted;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function1<access13800<? super JsonObject>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $carrier;
        final /* synthetic */ GetNativeAdsRequestBody $default;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ JsonObject $requestBody;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ String $ssrKey;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(String str, String str2, Map<String, String> map, JsonObject jsonObject, String str3, GetNativeAdsRequestBody getNativeAdsRequestBody, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(1, access13800Var);
            this.$carrier = str;
            this.$ssrKey = str2;
            this.$headers = map;
            this.$requestBody = jsonObject;
            this.$sessionId = str3;
            this.$default = getNativeAdsRequestBody;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = pageLeft.this.new IAuthTabCallbackDefault(this.$carrier, this.$ssrKey, this.$headers, this.$requestBody, this.$sessionId, this.$default, access13800Var);
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((access13800) obj);
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(access13800<? super JsonObject> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (r10 != r1) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOnExtraCallback;
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                strOnExtraCallback = pageLeft.onExtraCallback(pageLeft.this);
                if (strOnExtraCallback == null) {
                    pageLeft pageleft = pageLeft.this;
                    this.label = 1;
                    obj = pageLeft.onExtraCallbackWithResult(pageleft, this);
                } else {
                    pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
                    GetNativeAdsRequestBody.DeviceInfo deviceInfoOnExtraCallbackWithResult = GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier);
                    setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback = pageLeft.IAuthTabCallback(pageLeft.this);
                    String str = this.$ssrKey;
                    Map<String, String> map = this.$headers;
                    JsonObject jsonObjectOnWarmupCompleted = populate.onWarmupCompleted(this.$requestBody, this.$sessionId, this.$default, deviceInfoOnExtraCallbackWithResult);
                    this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
                    this.L$1 = access15400.onNavigationEvent(deviceInfoOnExtraCallbackWithResult);
                    this.label = 2;
                    objOnWarmupCompleted = setoffscreenpagelimitIAuthTabCallback.onWarmupCompleted(str, map, jsonObjectOnWarmupCompleted, (access13800<? super JsonObject>) this);
                    if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                        return objOnWarmupCompleted;
                    }
                }
                return objOnWarmupCompleted2;
            }
            if (i4 != 1) {
                int i5 = IAuthTabCallback;
                int i6 = i5 + 39;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 53;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            strOnExtraCallback = (String) obj;
            pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
            GetNativeAdsRequestBody.DeviceInfo deviceInfoOnExtraCallbackWithResult2 = GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier);
            setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback2 = pageLeft.IAuthTabCallback(pageLeft.this);
            String str2 = this.$ssrKey;
            Map<String, String> map2 = this.$headers;
            JsonObject jsonObjectOnWarmupCompleted2 = populate.onWarmupCompleted(this.$requestBody, this.$sessionId, this.$default, deviceInfoOnExtraCallbackWithResult2);
            this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
            this.L$1 = access15400.onNavigationEvent(deviceInfoOnExtraCallbackWithResult2);
            this.label = 2;
            objOnWarmupCompleted = setoffscreenpagelimitIAuthTabCallback2.onWarmupCompleted(str2, map2, jsonObjectOnWarmupCompleted2, (access13800<? super JsonObject>) this);
            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        pageLeft pageleft = (pageLeft) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int i = 2 % 2;
        Object objOnWarmupCompleted = pageleft.onWarmupCompleted("getPlayableAdInfo", access8100.onNavigationEvent(getWrite.IAuthTabCallback("advertisement_id", str)), pageleft.new onWarmupCompleted(str3, str, str2, null), (access13800) objArr[4]);
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return objOnWarmupCompleted;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function1<access13800<? super PlayableAdInfoResponse>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $advertisementId;
        final /* synthetic */ String $carrier;
        final /* synthetic */ String $ssrKey;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, String str2, String str3, access13800<? super onWarmupCompleted> access13800Var) {
            super(1, access13800Var);
            this.$ssrKey = str;
            this.$advertisementId = str2;
            this.$carrier = str3;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = pageLeft.this.new onWarmupCompleted(this.$ssrKey, this.$advertisementId, this.$carrier, access13800Var);
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((access13800) obj);
            int i4 = onWarmupCompleted + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(access13800<? super PlayableAdInfoResponse> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (r9 != r1) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String strOnExtraCallback;
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                strOnExtraCallback = pageLeft.onExtraCallback(pageLeft.this);
                if (strOnExtraCallback == null) {
                    int i3 = onWarmupCompleted + 59;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    pageLeft pageleft = pageLeft.this;
                    this.label = 1;
                    obj = pageLeft.onExtraCallbackWithResult(pageleft, this);
                } else {
                    pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
                    setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback = pageLeft.IAuthTabCallback(pageLeft.this);
                    String str = this.$ssrKey;
                    AdInAdRequest adInAdRequest = new AdInAdRequest(this.$advertisementId, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier));
                    this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
                    this.label = 2;
                    objOnExtraCallbackWithResult = setoffscreenpagelimitIAuthTabCallback.onExtraCallbackWithResult(str, adInAdRequest, this);
                    if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                        return objOnExtraCallbackWithResult;
                    }
                }
                return objOnWarmupCompleted;
            }
            int i5 = onNavigationEvent + 13;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 123;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            strOnExtraCallback = (String) obj;
            pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
            setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback2 = pageLeft.IAuthTabCallback(pageLeft.this);
            String str2 = this.$ssrKey;
            AdInAdRequest adInAdRequest2 = new AdInAdRequest(this.$advertisementId, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier));
            this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
            this.label = 2;
            objOnExtraCallbackWithResult = setoffscreenpagelimitIAuthTabCallback2.onExtraCallbackWithResult(str2, adInAdRequest2, this);
            if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onTransact<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function1<access13800<? super T>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$block = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$block, access13800Var);
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super T> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super T>, Object> function1 = this.$block;
                this.label = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
            }
            int i3 = IAuthTabCallback + 57;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            int i8 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 36 / 0;
            }
            return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> Object onWarmupCompleted(String str, Map<String, ? extends Object> map, Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super T> access13800Var) throws Throwable {
        asBinder asbinder;
        Object obj;
        int i = 2 % 2;
        if (access13800Var instanceof asBinder) {
            int i2 = IAuthTabCallbackDefault + 75;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            asbinder = (asBinder) access13800Var;
            int i4 = asbinder.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asbinder.label = i4 - 2147483648;
                int i5 = onTransact + 115;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object objOnExtraCallback = asbinder.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = asbinder.label;
        try {
            if (i7 != 0) {
                int i8 = onTransact;
                int i9 = i8 + 73;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 == 0 ? i7 != 1 : i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i8 + 95;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                map = (Map) asbinder.L$1;
                str = (String) asbinder.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onTransact ontransact = new onTransact(function1, null);
                asbinder.L$0 = str;
                asbinder.L$1 = map;
                asbinder.L$2 = access15400.onNavigationEvent(function1);
                asbinder.L$3 = access15400.onNavigationEvent(asbinder);
                asbinder.I$0 = 0;
                asbinder.I$1 = 0;
                asbinder.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, ontransact, asbinder);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            obj = kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (Exception e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
        }
        Throwable th = kotlin.Result.exceptionOrNull-impl(obj);
        if (th != null && !(th instanceof CancellationException)) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("NativeAdsSdkApiError", "Native ads api call failed: " + str, th, access8100.IAuthTabCallback(map, getWrite.IAuthTabCallback("api_name", str)));
        }
        ResultKt.onNavigationEvent(obj);
        return obj;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = pageLeft.this.new IAuthTabCallback(access13800Var);
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 31 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            String id = AdvertisingIdClient.getAdvertisingIdInfo(pageLeft.onWarmupCompleted(pageLeft.this)).getId();
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 25 / 0;
            }
            return id;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i;
        Object obj;
        pageLeft pageleft = (pageLeft) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult2 = (access13800) objArr[1];
        int i2 = 2 % 2;
        if (onextracallbackwithresult2 instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = onextracallbackwithresult2;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i3 - 2147483648;
                i = IAuthTabCallbackDefault + 35;
            } else {
                onextracallbackwithresult = pageleft.new onExtraCallbackWithResult(onextracallbackwithresult2);
                i = IAuthTabCallbackDefault + 27;
            }
        }
        onTransact = i % 128;
        int i4 = i % 2;
        Object objOnExtraCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        Object obj2 = null;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Result.Companion companion = kotlin.Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                IAuthTabCallback iAuthTabCallback = pageleft.new IAuthTabCallback(null);
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
                onextracallbackwithresult.I$0 = 0;
                onextracallbackwithresult.I$1 = 0;
                onextracallbackwithresult.label = 1;
                objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, onextracallbackwithresult);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i6 = IAuthTabCallbackDefault + 33;
                    onTransact = i6 % 128;
                    if (i6 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
            }
            obj = kotlin.Result.constructor-impl(objOnExtraCallback);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            int i7 = onTransact + 59;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            return null;
        }
        return obj;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function1<access13800<? super NativeAdsDto>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ GetNativeAdsRequestBody.AdRequestOption $adRequestOption;
        final /* synthetic */ GetNativeAdsRequestBody.AppInfo $appInfo;
        final /* synthetic */ Set<String> $availableStyleIds;
        final /* synthetic */ String $carrier;
        final /* synthetic */ String $extOverrides;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ String $sdkId;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ String $spaceUnitId;
        final /* synthetic */ String $ssrKey;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, Map<String, String> map, String str2, String str3, String str4, String str5, Set<String> set, GetNativeAdsRequestBody.AppInfo appInfo, String str6, GetNativeAdsRequestBody.AdRequestOption adRequestOption, access13800<? super onExtraCallback> access13800Var) {
            super(1, access13800Var);
            this.$ssrKey = str;
            this.$headers = map;
            this.$extOverrides = str2;
            this.$spaceUnitId = str3;
            this.$sessionId = str4;
            this.$sdkId = str5;
            this.$availableStyleIds = set;
            this.$appInfo = appInfo;
            this.$carrier = str6;
            this.$adRequestOption = adRequestOption;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = pageLeft.this.new onExtraCallback(this.$ssrKey, this.$headers, this.$extOverrides, this.$spaceUnitId, this.$sessionId, this.$sdkId, this.$availableStyleIds, this.$appInfo, this.$carrier, this.$adRequestOption, access13800Var);
            int i2 = onNavigationEvent + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((access13800) obj);
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super NativeAdsDto> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(access13800Var);
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 57 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            if (r3 != r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
        
            if (r3 != r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        
            if (r0 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
        
            return (im.toss.ads_sdk.model.NativeAdsDto) r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type im.toss.ads_sdk.model.NativeAdsDto");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOnExtraCallback;
            Object objOnExtraCallbackWithResult;
            Object objOnWarmupCompleted;
            Object objIAuthTabCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                strOnExtraCallback = pageLeft.onExtraCallback(pageLeft.this);
                if (strOnExtraCallback == null) {
                    pageLeft pageleft = pageLeft.this;
                    this.label = 1;
                    objOnExtraCallbackWithResult = pageLeft.onExtraCallbackWithResult(pageleft, this);
                } else {
                    pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
                    setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback = pageLeft.IAuthTabCallback(pageLeft.this);
                    String str = this.$ssrKey;
                    Map<String, String> mapOnNavigationEvent = populate.onNavigationEvent(this.$headers, this.$extOverrides);
                    GetNativeAdsRequestBody getNativeAdsRequestBody = new GetNativeAdsRequestBody(this.$spaceUnitId, (List) null, (String) null, "2.0.0", this.$sessionId, (String) null, this.$sdkId, this.$availableStyleIds, this.$appInfo, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier), this.$adRequestOption, (String) null, (String) null, (List) null, 14374, (DefaultConstructorMarker) null);
                    this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
                    this.label = 2;
                    objOnWarmupCompleted = setoffscreenpagelimitIAuthTabCallback.onWarmupCompleted(str, mapOnNavigationEvent, getNativeAdsRequestBody, (access13800<? super ApiResponse<NativeAdsDto>>) this);
                }
                return objOnWarmupCompleted2;
            }
            int i3 = onNavigationEvent + 59;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (i2 != 1) {
                int i6 = i4 + 1;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0 ? i2 != 2 : i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
                ApiResponse<?> apiResponse = (ApiResponse) objOnWarmupCompleted;
                if (!apiResponse.onExtraCallbackWithResult()) {
                    removeOnPageChangeListener removeonpagechangelistenerOnNavigationEvent = apiResponse.onNavigationEvent();
                    if (removeonpagechangelistenerOnNavigationEvent != null) {
                        throw removeonpagechangelistenerOnNavigationEvent;
                    }
                    int i7 = onNavigationEvent + 99;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    throw removeOnPageChangeListener.Companion.onWarmupCompleted(apiResponse);
                }
                int i9 = onNavigationEvent + 123;
                onWarmupCompleted = i9 % 128;
                try {
                    if (i9 % 2 != 0) {
                        objIAuthTabCallback = apiResponse.IAuthTabCallback();
                        int i10 = 94 / 0;
                    } else {
                        objIAuthTabCallback = apiResponse.IAuthTabCallback();
                    }
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(NativeAdsDto.class, Object.class)) {
                        int i11 = onNavigationEvent + 55;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        if (!Intrinsics.areEqual(NativeAdsDto.class, Unit.class)) {
                            removeOnPageChangeListener removeonpagechangelistenerOnExtraCallbackWithResult = removeOnPageChangeListener.Companion.onExtraCallbackWithResult(e);
                            removeonpagechangelistenerOnExtraCallbackWithResult.onNavigationEvent(apiResponse.asInterface());
                            throw removeonpagechangelistenerOnExtraCallbackWithResult;
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                int i13 = onWarmupCompleted + 9;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                objOnExtraCallbackWithResult = obj;
            }
            strOnExtraCallback = (String) objOnExtraCallbackWithResult;
            pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
            setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback2 = pageLeft.IAuthTabCallback(pageLeft.this);
            String str2 = this.$ssrKey;
            Map<String, String> mapOnNavigationEvent2 = populate.onNavigationEvent(this.$headers, this.$extOverrides);
            GetNativeAdsRequestBody getNativeAdsRequestBody2 = new GetNativeAdsRequestBody(this.$spaceUnitId, (List) null, (String) null, "2.0.0", this.$sessionId, (String) null, this.$sdkId, this.$availableStyleIds, this.$appInfo, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier), this.$adRequestOption, (String) null, (String) null, (List) null, 14374, (DefaultConstructorMarker) null);
            this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
            this.label = 2;
            objOnWarmupCompleted = setoffscreenpagelimitIAuthTabCallback2.onWarmupCompleted(str2, mapOnNavigationEvent2, getNativeAdsRequestBody2, (access13800<? super ApiResponse<NativeAdsDto>>) this);
        }
    }

    private final Object IAuthTabCallback(access13800<? super String> access13800Var) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return IAuthTabCallback(-925441249, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, 925441249, iOnExtraCallback2, new Object[]{this, access13800Var}, PushInfo.Companion.onExtraCallback());
    }

    public final Object onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super PlayableAdInfoResponse> access13800Var) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return IAuthTabCallback(-1635110962, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, 1635110963, iOnExtraCallback2, new Object[]{this, str, str2, str3, access13800Var}, PushInfo.Companion.onExtraCallback());
    }

    static final class asInterface extends SuspendLambda implements Function1<access13800<? super SspSdkAdResponse>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ GetNativeAdsRequestBody.AppInfo $appInfo;
        final /* synthetic */ String $carrier;
        final /* synthetic */ String $extOverrides;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $productType;
        final /* synthetic */ String $referrer;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ List<String> $slotIds;
        final /* synthetic */ String $ssrKey;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(String str, Map<String, String> map, String str2, List<String> list, String str3, String str4, GetNativeAdsRequestBody.AppInfo appInfo, String str5, String str6, String str7, access13800<? super asInterface> access13800Var) {
            super(1, access13800Var);
            this.$ssrKey = str;
            this.$headers = map;
            this.$extOverrides = str2;
            this.$slotIds = list;
            this.$carrier = str3;
            this.$sessionId = str4;
            this.$appInfo = appInfo;
            this.$productType = str5;
            this.$referrer = str6;
            this.$placementId = str7;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = pageLeft.this.new asInterface(this.$ssrKey, this.$headers, this.$extOverrides, this.$slotIds, this.$carrier, this.$sessionId, this.$appInfo, this.$productType, this.$referrer, this.$placementId, access13800Var);
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
            }
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            access13800<? super SspSdkAdResponse> access13800Var = (access13800) obj;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
            int i3 = onNavigationEvent + 65;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(access13800<? super SspSdkAdResponse> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r3 != r2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
        
            if (r3 != r2) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[LOOP:0: B:21:0x0084->B:23:0x008a, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOnExtraCallback;
            Object objOnExtraCallbackWithResult;
            Iterator<T> it;
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                strOnExtraCallback = pageLeft.onExtraCallback(pageLeft.this);
                if (strOnExtraCallback == null) {
                    pageLeft pageleft = pageLeft.this;
                    this.label = 1;
                    objOnExtraCallbackWithResult = pageLeft.onExtraCallbackWithResult(pageleft, this);
                } else {
                    pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
                    setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback = pageLeft.IAuthTabCallback(pageLeft.this);
                    String str = this.$ssrKey;
                    Map<String, String> mapOnNavigationEvent = populate.onNavigationEvent(this.$headers, this.$extOverrides);
                    List<String> list = this.$slotIds;
                    String str2 = this.$placementId;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new GetNativeAdsRequestBody.Placement(str2, (String) it.next()));
                    }
                    GetNativeAdsRequestBody getNativeAdsRequestBody = new GetNativeAdsRequestBody((String) null, arrayList, (String) null, (String) null, this.$sessionId, (String) null, (String) null, (Set) null, this.$appInfo, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier), (GetNativeAdsRequestBody.AdRequestOption) null, this.$productType, this.$referrer, SdkTemplate.Companion.onExtraCallback(), 44, (DefaultConstructorMarker) null);
                    this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
                    this.label = 2;
                    objOnNavigationEvent = setoffscreenpagelimitIAuthTabCallback.onNavigationEvent(str, mapOnNavigationEvent, getNativeAdsRequestBody, this);
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                int i5 = IAuthTabCallback + 33;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 2 : i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = obj;
                ApiResponse<?> apiResponse = (ApiResponse) objOnNavigationEvent;
                if (!apiResponse.onExtraCallbackWithResult()) {
                    removeOnPageChangeListener removeonpagechangelistenerOnNavigationEvent = apiResponse.onNavigationEvent();
                    if (removeonpagechangelistenerOnNavigationEvent == null) {
                        throw removeOnPageChangeListener.Companion.onWarmupCompleted(apiResponse);
                    }
                    throw removeonpagechangelistenerOnNavigationEvent;
                }
                try {
                    Object objIAuthTabCallback = apiResponse.IAuthTabCallback();
                    if (objIAuthTabCallback == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.ads_sdk.remote.model.SspSdkAdResponse");
                    }
                    int i6 = IAuthTabCallback + 83;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return (SspSdkAdResponse) objIAuthTabCallback;
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(SspSdkAdResponse.class, Object.class) || Intrinsics.areEqual(SspSdkAdResponse.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    removeOnPageChangeListener removeonpagechangelistenerOnExtraCallbackWithResult = removeOnPageChangeListener.Companion.onExtraCallbackWithResult(e);
                    removeonpagechangelistenerOnExtraCallbackWithResult.onNavigationEvent(apiResponse.asInterface());
                    throw removeonpagechangelistenerOnExtraCallbackWithResult;
                }
            }
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallbackWithResult = obj;
            strOnExtraCallback = (String) objOnExtraCallbackWithResult;
            pageLeft.onNavigationEvent(pageLeft.this, strOnExtraCallback);
            setOffscreenPageLimit setoffscreenpagelimitIAuthTabCallback2 = pageLeft.IAuthTabCallback(pageLeft.this);
            String str3 = this.$ssrKey;
            Map<String, String> mapOnNavigationEvent2 = populate.onNavigationEvent(this.$headers, this.$extOverrides);
            List<String> list2 = this.$slotIds;
            String str22 = this.$placementId;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            GetNativeAdsRequestBody getNativeAdsRequestBody2 = new GetNativeAdsRequestBody((String) null, arrayList2, (String) null, (String) null, this.$sessionId, (String) null, (String) null, (Set) null, this.$appInfo, GetNativeAdsRequestBody.DeviceInfo.Companion.onExtraCallbackWithResult(pageLeft.onWarmupCompleted(pageLeft.this), strOnExtraCallback, this.$carrier), (GetNativeAdsRequestBody.AdRequestOption) null, this.$productType, this.$referrer, SdkTemplate.Companion.onExtraCallback(), 44, (DefaultConstructorMarker) null);
            this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
            this.label = 2;
            objOnNavigationEvent = setoffscreenpagelimitIAuthTabCallback2.onNavigationEvent(str3, mapOnNavigationEvent2, getNativeAdsRequestBody2, this);
        }
    }
}
