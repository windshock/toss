package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.enableLayers;
import o.setLogBuffers;
import o.unregisterDataSetObserver;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableLayers {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static char[] asInterface = null;
    private static int getInterfaceDescriptor = 1;
    private static final MediaType onExtraCallback;
    public static final int onNavigationEvent;
    private final FragmentStateAdapter4 IAuthTabCallback;
    private final pageRight asBinder;
    private final zzad onExtraCallbackWithResult;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = enableLayers.this.IAuthTabCallback((Function1<? super Integer, Unit>) null, (onSecondaryPointerUp) null, (Function1<? super Integer, Request>) null, (access13800<? super getPageTitle>) this);
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {enableLayers.this, null, null, null, this};
            Object objOnNavigationEvent = enableLayers.onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1840052998, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr, -1840052995);
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(enableLayers enablelayers) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {enablelayers};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) onNavigationEvent(iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, 1754610290, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr, -1754610288);
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Request IAuthTabCallback(enableLayers enablelayers, String str, String str2, RequestBody requestBody, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Request requestOnWarmupCompleted = onWarmupCompleted(enablelayers, str, str2, requestBody, z, i);
        int i5 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return requestOnWarmupCompleted;
    }

    public static /* synthetic */ OkHttpClient onExtraCallback(enableLayers enablelayers) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(enablelayers);
            throw null;
        }
        OkHttpClient okHttpClientOnNavigationEvent = onNavigationEvent(enablelayers);
        int i3 = IAuthTabCallbackStub + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return okHttpClientOnNavigationEvent;
    }

    public static /* synthetic */ Request onExtraCallback(enableLayers enablelayers, String str, String str2, RequestBody requestBody, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Request requestOnNavigationEvent = onNavigationEvent(enablelayers, str, str2, requestBody, z, i);
        int i5 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return requestOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = i7 | i3;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i3));
        int i11 = (~(i5 | i3)) | (~(i7 | i5));
        int i12 = i9 | i8;
        int i13 = i3 + i6 + i4 + (988256597 * i) + ((-695401848) * i2);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i3) - 1270611968) + ((-1462879173) * i6) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i) + (1063256064 * i2) + (1273561088 * i14);
        int i16 = (i3 * (-1367684995)) + 376186498 + (i6 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i4 * (-1367684709)) + (i * 1512018807) + (i2 * 1127043160) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    @Inject
    public enableLayers(@NotNull FragmentStateAdapter4 fragmentStateAdapter4, @NotNull zzad zzadVar, @NotNull pageRight pageright) {
        Intrinsics.checkNotNullParameter(fragmentStateAdapter4, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(pageright, "");
        this.IAuthTabCallback = fragmentStateAdapter4;
        this.onExtraCallbackWithResult = zzadVar;
        this.asBinder = pageright;
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingFireClient$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    enableLayers.onExtraCallback(this.f$0);
                    throw null;
                }
                OkHttpClient okHttpClientOnExtraCallback = enableLayers.onExtraCallback(this.f$0);
                int i3 = onExtraCallback + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return okHttpClientOnExtraCallback;
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingFireClient$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                String strIAuthTabCallback = enableLayers.IAuthTabCallback(this.f$0);
                int i4 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return strIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public static final /* synthetic */ OkHttpClient onExtraCallbackWithResult(enableLayers enablelayers) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return enablelayers.onExtraCallbackWithResult();
        }
        enablelayers.onExtraCallbackWithResult();
        throw null;
    }

    private final OkHttpClient onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return okHttpClient;
    }

    private static final OkHttpClient onNavigationEvent(enableLayers enablelayers) {
        OkHttpClient.Builder builder;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            OkHttpClient.Builder builderIAuthTabCallback = enablelayers.asBinder.IAuthTabCallback();
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            setRevision setrevision = setRevision.SECONDS;
            builder = builderIAuthTabCallback.connectTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(96, setrevision)).readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(62, setrevision));
            z = false;
        } else {
            OkHttpClient.Builder builderIAuthTabCallback2 = enablelayers.asBinder.IAuthTabCallback();
            setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
            setRevision setrevision2 = setRevision.SECONDS;
            builder = builderIAuthTabCallback2.connectTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision2)).readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(10, setrevision2));
            z = true;
        }
        return onPageScrolled.IAuthTabCallback(builder.retryOnConnectionFailure(z), "NativeAdsTrackingFire").build();
    }

    public static /* synthetic */ RequestBody onNavigationEvent(enableLayers enablelayers, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 85;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 103;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = ViewPager.IAuthTabCallback.onExtraCallback();
        }
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (RequestBody) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1582011601, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{enablelayers, str, str2, str3, str4}, -1582011601);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        enableLayers enablelayers = (enableLayers) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        RequestBody requestBodyOnExtraCallback = enablelayers.onExtraCallback(enablelayers.onNavigationEvent(str, str2, str3, str4));
        int i4 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return requestBodyOnExtraCallback;
        }
        throw null;
    }

    public final String onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 191, 3}, false, new byte[]{0, 1, 1, 1}, objArr);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 4, 32, 3}, true, new byte[]{0, 1, 1, 1}, objArr2);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr2[0]).intern(), str2);
        dynamicTrack.onExtraCallback(pangleEncryptManager, "eventTs", str4);
        if (str3 != null) {
            int i2 = IAuthTabCallbackStub + 97;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.isBlank(str3)) {
                int i4 = IAuthTabCallbackDefault + 27;
                IAuthTabCallbackStub = i4 % 128;
                str3 = null;
                if (i4 % 2 != 0) {
                    str3.hashCode();
                    throw null;
                }
            }
            if (str3 != null) {
                int i5 = IAuthTabCallbackStub + 91;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    dynamicTrack.onExtraCallback(pangleEncryptManager, "automationSessionId", str3);
                    int i6 = 49 / 0;
                } else {
                    dynamicTrack.onExtraCallback(pangleEncryptManager, "automationSessionId", str3);
                }
            }
        }
        String string = pangleEncryptManager.onExtraCallbackWithResult().toString();
        int i7 = IAuthTabCallbackDefault + 103;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 1 / 0;
        }
        return string;
    }

    public final RequestBody onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        RequestBody requestBodyCreate = RequestBody.Companion.create(str, onExtraCallback);
        int i4 = IAuthTabCallbackDefault + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return requestBodyCreate;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        enableLayers enablelayers = (enableLayers) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            HttpUrl.Companion.get(enablelayers.onExtraCallbackWithResult.onNavigationEvent()).host();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strHost = HttpUrl.Companion.get(enablelayers.onExtraCallbackWithResult.onNavigationEvent()).host();
        int i3 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return strHost;
    }

    private final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onWarmupCompleted.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        int i4 = 7 / 0;
        return (String) value;
    }

    public static /* synthetic */ Request onWarmupCompleted(enableLayers enablelayers, String str, String str2, RequestBody requestBody, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 67;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        return enablelayers.onNavigationEvent(str, str2, requestBody, z);
    }

    public final Request onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable RequestBody requestBody, boolean z) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Request.Builder builderUrl = new Request.Builder().url(str2);
        if (requestBody == null) {
            builderUrl.get();
        } else {
            builderUrl.post(requestBody);
        }
        Request.Builder builderAddHeader = builderUrl.addHeader("X-Toss-RequestId", str).addHeader("X-Toss-RequestTs", ViewPager.IAuthTabCallback.onExtraCallback());
        if (z) {
            HttpUrl httpUrl = HttpUrl.Companion.parse(str2);
            String strHost = null;
            if (httpUrl != null) {
                int i2 = IAuthTabCallbackDefault + 45;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    httpUrl.host();
                    throw null;
                }
                strHost = httpUrl.host();
            }
            if (Intrinsics.areEqual(strHost, onNavigationEvent()) && (strOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted()) != null) {
                int i3 = IAuthTabCallbackStub + 73;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                builderAddHeader.addHeader("Authorization", strOnWarmupCompleted);
            }
        }
        return builderAddHeader.build();
    }

    public final Request IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Request requestBuild = new Request.Builder().url(str).get().build();
        int i2 = IAuthTabCallbackDefault + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return requestBuild;
    }

    static final class IAuthTabCallback implements Function1<Throwable, Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Call onExtraCallback;

        IAuthTabCallback(Call call) {
            this.onExtraCallback = call;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((Throwable) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(Throwable th) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Call call = this.onExtraCallback;
            try {
                if (i3 == 0) {
                    Result.Companion companion = kotlin.Result.Companion;
                    call.cancel();
                    kotlin.Result.constructor-impl(Unit.INSTANCE);
                    int i4 = 62 / 0;
                } else {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    call.cancel();
                    kotlin.Result.constructor-impl(Unit.INSTANCE);
                }
            } catch (Throwable th2) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
            }
        }
    }

    public static final class onWarmupCompleted implements Callback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ onSecondaryPointerUp onExtraCallbackWithResult;
        final /* synthetic */ Request onNavigationEvent;
        final /* synthetic */ maybeRemoveAttachStateListener<unregisterDataSetObserver> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Request request, onSecondaryPointerUp onsecondarypointerup, maybeRemoveAttachStateListener<? super unregisterDataSetObserver> mayberemoveattachstatelistener) {
            this.onNavigationEvent = request;
            this.onExtraCallbackWithResult = onsecondarypointerup;
            this.onWarmupCompleted = mayberemoveattachstatelistener;
        }

        public void onFailure(Call call, IOException iOException) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            onSecondaryPointerUp onsecondarypointerup = this.onExtraCallbackWithResult;
            if (onsecondarypointerup != null) {
                int i4 = onExtraCallback + 9;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onsecondarypointerup.onResult(this.onNavigationEvent.url().toString(), null, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback, iOException.getLocalizedMessage());
                    int i5 = 87 / 0;
                } else {
                    onsecondarypointerup.onResult(this.onNavigationEvent.url().toString(), null, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback, iOException.getLocalizedMessage());
                }
            }
            maybeRemoveAttachStateListener<unregisterDataSetObserver> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = kotlin.Result.Companion;
            mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:3:0x0011, B:5:0x001b, B:15:0x003a, B:17:0x0052, B:11:0x002f, B:12:0x0032), top: B:25:0x0011 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onResponse(Call call, okhttp3.Response response) {
            unregisterDataSetObserver onextracallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            Request request = this.onNavigationEvent;
            onSecondaryPointerUp onsecondarypointerup = this.onExtraCallbackWithResult;
            maybeRemoveAttachStateListener<unregisterDataSetObserver> mayberemoveattachstatelistener = this.onWarmupCompleted;
            try {
                int iCode = response.code();
                if (response.isSuccessful()) {
                    onextracallback = unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback;
                } else if (500 <= iCode) {
                    int i2 = onExtraCallback + 73;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    onextracallback = iCode < 600 ? unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent : new unregisterDataSetObserver.onExtraCallback(iCode);
                }
                if (onsecondarypointerup != null) {
                    onsecondarypointerup.onResult(request.url().toString(), Integer.valueOf(iCode), onextracallback, null);
                    int i4 = IAuthTabCallback + 95;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
                Result.Companion companion = kotlin.Result.Companion;
                mayberemoveattachstatelistener.resumeWith(kotlin.Result.constructor-impl(onextracallback));
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(response, (Throwable) null);
            } finally {
            }
        }
    }

    private static final Request onNavigationEvent(enableLayers enablelayers, String str, String str2, RequestBody requestBody, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            enablelayers.onNavigationEvent(str, str2, requestBody, z);
            obj.hashCode();
            throw null;
        }
        Request requestOnNavigationEvent = enablelayers.onNavigationEvent(str, str2, requestBody, z);
        int i4 = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return requestOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        enableLayers enablelayers = (enableLayers) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        onSecondaryPointerUp onsecondarypointerup = (onSecondaryPointerUp) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        access13800 access13800Var = (access13800) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        Object obj2 = null;
        if ((iIntValue & 1) != 0) {
            int i2 = IAuthTabCallbackStub + 87;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            function1 = null;
        }
        if ((iIntValue & 2) != 0) {
            int i4 = IAuthTabCallbackDefault + 1;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            onsecondarypointerup = null;
        }
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        Object objOnNavigationEvent = onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1840052998, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{enablelayers, function1, onsecondarypointerup, function12, access13800Var}, -1840052995);
        int i6 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return objOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e2 -> B:35:0x00e7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ec -> B:37:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        onNavigationEvent onnavigationevent;
        int i;
        Function1 function1;
        onSecondaryPointerUp onsecondarypointerup;
        int i2;
        Function1 function12;
        Function1 function13;
        int i3;
        int i4;
        int i5;
        unregisterDataSetObserver unregisterdatasetobserver;
        enableLayers enablelayers = (enableLayers) objArr[0];
        Function1 function14 = (Function1) objArr[1];
        onSecondaryPointerUp onsecondarypointerup2 = (onSecondaryPointerUp) objArr[2];
        Function1 function15 = (Function1) objArr[3];
        onNavigationEvent onnavigationevent2 = (access13800) objArr[4];
        int i6 = 2 % 2;
        if (onnavigationevent2 instanceof onNavigationEvent) {
            int i7 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = onnavigationevent2.label;
                throw null;
            }
            onnavigationevent = onnavigationevent2;
            int i9 = onnavigationevent.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i9 - 2147483648;
                int i10 = IAuthTabCallbackDefault + 49;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
            } else {
                onnavigationevent = enablelayers.new onNavigationEvent(onnavigationevent2);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i12 = onnavigationevent.label;
        if (i12 != 0) {
            int i13 = IAuthTabCallbackStub;
            int i14 = i13 + 113;
            IAuthTabCallbackDefault = i14 % 128;
            if (i14 % 2 != 0 ? i12 == 1 : i12 == 1) {
                int i15 = onnavigationevent.I$3;
                i2 = onnavigationevent.I$2;
                int i16 = onnavigationevent.I$1;
                i = onnavigationevent.I$0;
                Function1 function16 = (Function1) onnavigationevent.L$2;
                onSecondaryPointerUp onsecondarypointerup3 = (onSecondaryPointerUp) onnavigationevent.L$1;
                Function1 function17 = (Function1) onnavigationevent.L$0;
                ResultKt.onNavigationEvent(obj);
                int i17 = i16;
                int i18 = i2;
                int i19 = i15;
                function14 = function17;
                int i20 = i18 + 1;
                if (function14 != null) {
                    int i21 = IAuthTabCallbackStub + 85;
                    IAuthTabCallbackDefault = i21 % 128;
                    if (i21 % 2 == 0) {
                        function14.invoke(access14000.onNavigationEvent(i20));
                        int i22 = 3 / 0;
                    } else {
                        function14.invoke(access14000.onNavigationEvent(i20));
                    }
                }
                Request request = (Request) function16.invoke(access14000.onNavigationEvent(i20));
                onnavigationevent.L$0 = function14;
                onnavigationevent.L$1 = onsecondarypointerup3;
                onnavigationevent.L$2 = function16;
                onnavigationevent.I$0 = i;
                onnavigationevent.I$1 = i17;
                onnavigationevent.I$2 = i18;
                onnavigationevent.I$3 = i19;
                onnavigationevent.I$4 = i20;
                onnavigationevent.label = 2;
                Object objIAuthTabCallback = enablelayers.IAuthTabCallback(request, onsecondarypointerup3, onnavigationevent);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    i3 = i;
                    function13 = function16;
                    onsecondarypointerup = onsecondarypointerup3;
                    function12 = function14;
                    i5 = i20;
                    int i23 = i17;
                    obj = objIAuthTabCallback;
                    i4 = i23;
                    unregisterdatasetobserver = (unregisterDataSetObserver) obj;
                    if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback) && !(unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback) && !Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
                        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = i4 + 1;
                        function1 = function13;
                        function14 = function12;
                        i = i3;
                        if (i2 >= i) {
                            return new getPageTitle(unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent, 3);
                        }
                        if (i2 > 0) {
                            onnavigationevent.L$0 = function14;
                            onnavigationevent.L$1 = onsecondarypointerup;
                            onnavigationevent.L$2 = function1;
                            onnavigationevent.I$0 = i;
                            onnavigationevent.I$1 = i2;
                            onnavigationevent.I$2 = i2;
                            onnavigationevent.I$3 = 0;
                            onnavigationevent.label = 1;
                            if (formatMsgs.onWarmupCompleted((1 << (i2 - 1)) * 1000, onnavigationevent) != objOnWarmupCompleted) {
                                function17 = function14;
                                onsecondarypointerup3 = onsecondarypointerup;
                                function16 = function1;
                                i15 = 0;
                                i16 = i2;
                                int i172 = i16;
                                int i182 = i2;
                                int i192 = i15;
                                function14 = function17;
                                int i202 = i182 + 1;
                                if (function14 != null) {
                                }
                                Request request2 = (Request) function16.invoke(access14000.onNavigationEvent(i202));
                                onnavigationevent.L$0 = function14;
                                onnavigationevent.L$1 = onsecondarypointerup3;
                                onnavigationevent.L$2 = function16;
                                onnavigationevent.I$0 = i;
                                onnavigationevent.I$1 = i172;
                                onnavigationevent.I$2 = i182;
                                onnavigationevent.I$3 = i192;
                                onnavigationevent.I$4 = i202;
                                onnavigationevent.label = 2;
                                Object objIAuthTabCallback2 = enablelayers.IAuthTabCallback(request2, onsecondarypointerup3, onnavigationevent);
                                if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                                }
                            }
                        } else {
                            onsecondarypointerup3 = onsecondarypointerup;
                            function16 = function1;
                            i182 = i2;
                            i172 = i182;
                            i192 = 0;
                            int i2022 = i182 + 1;
                            if (function14 != null) {
                            }
                            Request request22 = (Request) function16.invoke(access14000.onNavigationEvent(i2022));
                            onnavigationevent.L$0 = function14;
                            onnavigationevent.L$1 = onsecondarypointerup3;
                            onnavigationevent.L$2 = function16;
                            onnavigationevent.I$0 = i;
                            onnavigationevent.I$1 = i172;
                            onnavigationevent.I$2 = i182;
                            onnavigationevent.I$3 = i192;
                            onnavigationevent.I$4 = i2022;
                            onnavigationevent.label = 2;
                            Object objIAuthTabCallback22 = enablelayers.IAuthTabCallback(request22, onsecondarypointerup3, onnavigationevent);
                            if (objIAuthTabCallback22 != objOnWarmupCompleted) {
                            }
                        }
                    }
                    return new getPageTitle(unregisterdatasetobserver, i5);
                }
                return objOnWarmupCompleted;
            }
            int i24 = i13 + 45;
            IAuthTabCallbackDefault = i24 % 128;
            if (i24 % 2 != 0 ? i12 != 2 : i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = onnavigationevent.I$4;
            i4 = onnavigationevent.I$1;
            int i25 = onnavigationevent.I$0;
            function13 = (Function1) onnavigationevent.L$2;
            onSecondaryPointerUp onsecondarypointerup4 = (onSecondaryPointerUp) onnavigationevent.L$1;
            function12 = (Function1) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            int i26 = IAuthTabCallbackStub + 49;
            IAuthTabCallbackDefault = i26 % 128;
            int i27 = i26 % 2;
            i3 = i25;
            onsecondarypointerup = onsecondarypointerup4;
            unregisterdatasetobserver = (unregisterDataSetObserver) obj;
            if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
                return new getPageTitle(unregisterdatasetobserver, i5);
            }
            if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
            }
        } else {
            ResultKt.onNavigationEvent(obj);
            i = 3;
            function1 = function15;
            onsecondarypointerup = onsecondarypointerup2;
            i2 = 0;
            if (i2 >= i) {
            }
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(enableLayers enablelayers, String str, String str2, RequestBody requestBody, Function1 function1, onSecondaryPointerUp onsecondarypointerup, boolean z, access13800 access13800Var, int i, Object obj) throws NoWhenBranchMatchedException {
        Function1 function12;
        onSecondaryPointerUp onsecondarypointerup2;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = IAuthTabCallbackDefault + 87;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 16) != 0) {
            int i5 = IAuthTabCallbackDefault + 35;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            onsecondarypointerup2 = null;
        } else {
            onsecondarypointerup2 = onsecondarypointerup;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallbackDefault + 43;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        Object objOnWarmupCompleted = enablelayers.onWarmupCompleted(str, str2, requestBody, (Function1<? super Integer, Unit>) function12, onsecondarypointerup2, z2, (access13800<? super getPageTitle>) access13800Var);
        int i9 = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i9 % 128;
        int i10 = i9 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(@NotNull final String str, @NotNull final String str2, @Nullable final RequestBody requestBody, @Nullable Function1<? super Integer, Unit> function1, @Nullable onSecondaryPointerUp onsecondarypointerup, final boolean z, @NotNull access13800<? super getPageTitle> access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(function1, onsecondarypointerup, new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsTrackingFireClient$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Request requestIAuthTabCallback = enableLayers.IAuthTabCallback(this.f$0, str, str2, requestBody, z, ((Integer) obj).intValue());
                int i5 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return requestIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, access13800Var);
        int i2 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return objIAuthTabCallback;
    }

    private static final Request onWarmupCompleted(enableLayers enablelayers, String str, String str2, RequestBody requestBody, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return enablelayers.onNavigationEvent(str, str2, requestBody, z);
        }
        enablelayers.onNavigationEvent(str, str2, requestBody, z);
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = asInterface;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = $11 + 51;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = $10 + 11;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Drawable.resolveOpacity(0, 0)), 35 - ((Process.getThreadPriority(0) + 20) >> 6), AndroidCharacter.getMirror('0') + 14191, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i11 = $11 + 125;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), KeyEvent.keyCodeFromString("") + 65, 16718 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, 17657 - (Process.myPid() >> 22), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49467), (-16777146) - Color.rgb(0, 0, 0), View.combineMeasuredStates(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i14 = $11 + 9;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i16, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i17 = $10 + 29;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c6 -> B:29:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cd -> B:29:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@Nullable Function1<? super Integer, Unit> function1, @Nullable onSecondaryPointerUp onsecondarypointerup, @NotNull Function1<? super Integer, Request> function12, @NotNull access13800<? super getPageTitle> access13800Var) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult onextracallbackwithresult;
        Function1<? super Integer, Unit> function13;
        Function1<? super Integer, Request> function14;
        int i;
        onExtraCallbackWithResult onextracallbackwithresult2;
        int i2;
        onSecondaryPointerUp onsecondarypointerup2;
        Function1<? super Integer, Request> function15;
        Function1<? super Integer, Unit> function16;
        onExtraCallbackWithResult onextracallbackwithresult3;
        int i3;
        int i4;
        unregisterDataSetObserver unregisterdatasetobserver;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 121;
        int i7 = i6 % 128;
        IAuthTabCallbackStub = i7;
        int i8 = i6 % 2;
        if (!(!(access13800Var instanceof onExtraCallbackWithResult))) {
            int i9 = i7 + 73;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i11 = onextracallbackwithresult.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i11 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i12 = onextracallbackwithresult.label;
        if (i12 != 0) {
            int i13 = IAuthTabCallbackStub + 31;
            int i14 = i13 % 128;
            IAuthTabCallbackDefault = i14;
            if (i13 % 2 != 0 ? i12 == 1 : i12 == 0) {
                int i15 = onextracallbackwithresult.I$3;
                int i16 = onextracallbackwithresult.I$2;
                i2 = onextracallbackwithresult.I$1;
                i = onextracallbackwithresult.I$0;
                function15 = (Function1) onextracallbackwithresult.L$2;
                onSecondaryPointerUp onsecondarypointerup3 = (onSecondaryPointerUp) onextracallbackwithresult.L$1;
                Function1<? super Integer, Unit> function17 = (Function1) onextracallbackwithresult.L$0;
                ResultKt.onNavigationEvent(obj);
                int i17 = i16 + 2;
                if (function17 != null) {
                    function17.invoke(access14000.onNavigationEvent(i17));
                }
                Request request = (Request) function15.invoke(access14000.onNavigationEvent(i17));
                onextracallbackwithresult.L$0 = function17;
                onextracallbackwithresult.L$1 = onsecondarypointerup3;
                onextracallbackwithresult.L$2 = function15;
                onextracallbackwithresult.I$0 = i;
                onextracallbackwithresult.I$1 = i2;
                onextracallbackwithresult.I$2 = i16;
                onextracallbackwithresult.I$3 = i15;
                onextracallbackwithresult.I$4 = i17;
                onextracallbackwithresult.label = 2;
                Object objIAuthTabCallback = IAuthTabCallback(request, onsecondarypointerup3, onextracallbackwithresult);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    i3 = i2;
                    onextracallbackwithresult3 = onextracallbackwithresult;
                    onsecondarypointerup2 = onsecondarypointerup3;
                    function16 = function17;
                    i4 = i17;
                    obj = objIAuthTabCallback;
                    unregisterdatasetobserver = (unregisterDataSetObserver) obj;
                    if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback) && !(unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback)) {
                        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
                            getPageTitle getpagetitle = new getPageTitle(unregisterdatasetobserver, i4);
                            int i18 = IAuthTabCallbackDefault + 107;
                            IAuthTabCallbackStub = i18 % 128;
                            if (i18 % 2 == 0) {
                                return getpagetitle;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i19 = i3 + 1;
                        onextracallbackwithresult2 = onextracallbackwithresult3;
                        function14 = function15;
                        i2 = i19;
                        function13 = function16;
                        if (i2 < i) {
                            return new getPageTitle(unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent, 3);
                        }
                        onextracallbackwithresult2.L$0 = function13;
                        onextracallbackwithresult2.L$1 = onsecondarypointerup2;
                        onextracallbackwithresult2.L$2 = function14;
                        onextracallbackwithresult2.I$0 = i;
                        onextracallbackwithresult2.I$1 = i2;
                        onextracallbackwithresult2.I$2 = i2;
                        onextracallbackwithresult2.I$3 = 0;
                        onextracallbackwithresult2.label = 1;
                        if (formatMsgs.onWarmupCompleted((1 << i2) * 1000, onextracallbackwithresult2) != objOnWarmupCompleted) {
                            int i20 = IAuthTabCallbackStub + 35;
                            IAuthTabCallbackDefault = i20 % 128;
                            if (i20 % 2 == 0) {
                                function17 = function13;
                                onsecondarypointerup3 = onsecondarypointerup2;
                                function15 = function14;
                                onextracallbackwithresult = onextracallbackwithresult2;
                                i16 = i2;
                                i15 = 1;
                            } else {
                                function17 = function13;
                                onsecondarypointerup3 = onsecondarypointerup2;
                                function15 = function14;
                                i15 = 0;
                                onextracallbackwithresult = onextracallbackwithresult2;
                                i16 = i2;
                            }
                            int i172 = i16 + 2;
                            if (function17 != null) {
                            }
                            Request request2 = (Request) function15.invoke(access14000.onNavigationEvent(i172));
                            onextracallbackwithresult.L$0 = function17;
                            onextracallbackwithresult.L$1 = onsecondarypointerup3;
                            onextracallbackwithresult.L$2 = function15;
                            onextracallbackwithresult.I$0 = i;
                            onextracallbackwithresult.I$1 = i2;
                            onextracallbackwithresult.I$2 = i16;
                            onextracallbackwithresult.I$3 = i15;
                            onextracallbackwithresult.I$4 = i172;
                            onextracallbackwithresult.label = 2;
                            Object objIAuthTabCallback2 = IAuthTabCallback(request2, onsecondarypointerup3, onextracallbackwithresult);
                            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                            }
                        }
                    }
                    return new getPageTitle(unregisterdatasetobserver, i4);
                }
                return objOnWarmupCompleted;
            }
            int i21 = i14 + 105;
            IAuthTabCallbackStub = i21 % 128;
            int i22 = i21 % 2;
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = onextracallbackwithresult.I$4;
            i3 = onextracallbackwithresult.I$1;
            int i23 = onextracallbackwithresult.I$0;
            Function1<? super Integer, Request> function18 = (Function1) onextracallbackwithresult.L$2;
            onSecondaryPointerUp onsecondarypointerup4 = (onSecondaryPointerUp) onextracallbackwithresult.L$1;
            function16 = (Function1) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            onextracallbackwithresult3 = onextracallbackwithresult;
            onsecondarypointerup2 = onsecondarypointerup4;
            function15 = function18;
            i = i23;
            unregisterdatasetobserver = (unregisterDataSetObserver) obj;
            if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
                return new getPageTitle(unregisterdatasetobserver, i4);
            }
            if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            }
        } else {
            ResultKt.onNavigationEvent(obj);
            function13 = function1;
            function14 = function12;
            i = 2;
            onextracallbackwithresult2 = onextracallbackwithresult;
            i2 = 0;
            onsecondarypointerup2 = onsecondarypointerup;
            if (i2 < i) {
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

    static {
        onExtraCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        onNavigationEvent = 8;
        onExtraCallback = MediaType.Companion.get("application/json; charset=utf-8");
        int i = IAuthTabCallback_Parcel + 23;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final Object IAuthTabCallback(@NotNull Request request, @Nullable onSecondaryPointerUp onsecondarypointerup, @NotNull access13800<? super unregisterDataSetObserver> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        Call callNewCall = onExtraCallbackWithResult(this).newCall(request);
        setresourceinternal.IAuthTabCallback(new IAuthTabCallback(callNewCall));
        callNewCall.enqueue(new onWarmupCompleted(request, onsecondarypointerup, setresourceinternal));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            int i2 = IAuthTabCallbackDefault + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
        }
        return objIAuthTabCallbackDefault;
    }

    private static final String onWarmupCompleted(enableLayers enablelayers) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (String) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1754610290, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{enablelayers}, -1754610288);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(enableLayers enablelayers, Function1 function1, onSecondaryPointerUp onsecondarypointerup, Function1 function12, access13800 access13800Var, int i, Object obj) {
        Object[] objArr = {enablelayers, function1, onsecondarypointerup, function12, access13800Var, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2146488407, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, 2146488408);
    }

    public final Object onWarmupCompleted(@Nullable Function1<? super Integer, Unit> function1, @Nullable onSecondaryPointerUp onsecondarypointerup, @NotNull Function1<? super Integer, Request> function12, @NotNull access13800<? super getPageTitle> access13800Var) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1840052998, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, function1, onsecondarypointerup, function12, access13800Var}, -1840052995);
    }

    public final RequestBody IAuthTabCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (RequestBody) onNavigationEvent(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1582011601, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, str, str2, str3, str4}, -1582011601);
    }

    static void onExtraCallback() {
        asInterface = new char[]{27346, 27517, 27495, 27493, 27140, 27332, 27340, 27340};
    }
}
