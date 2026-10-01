package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.kakao.sdk.auth.model.OAuthToken;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.updateLayoutState;
import o.updateLayoutStateToFillStart;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class computeScrollExtent implements findLastPartiallyOrCompletelyInvisibleChild {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static char IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final Lazy<computeScrollExtent> onExtraCallback;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    private OAuthToken IAuthTabCallback;
    private final updateLayoutState onExtraCallbackWithResult;
    private final resolveShouldLayoutReverse onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public computeScrollExtent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public computeScrollExtent(@NotNull updateLayoutState updatelayoutstate, @NotNull resolveShouldLayoutReverse resolveshouldlayoutreverse) throws Throwable {
        OAuthToken oAuthToken;
        Intrinsics.checkNotNullParameter(updatelayoutstate, "");
        Intrinsics.checkNotNullParameter(resolveshouldlayoutreverse, "");
        this.onExtraCallbackWithResult = updatelayoutstate;
        this.onNavigationEvent = resolveshouldlayoutreverse;
        OAuthToken oAuthToken2 = null;
        if (updateLayoutState.onExtraCallback.onExtraCallbackWithResult(updatelayoutstate, "com.kakao.sdk.version", null, 2, null) == null) {
            onExtraCallbackWithResult();
            int i2 = IAuthTabCallbackDefault + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        String strOnExtraCallbackWithResult = updateLayoutState.onExtraCallback.onExtraCallbackWithResult(updatelayoutstate, "com.kakao.sdk.oauth_token", null, 2, null);
        if (strOnExtraCallbackWithResult != null) {
            int i4 = IAuthTabCallbackDefault + 65;
            asBinder = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    updateLayoutStateToFillEnd updatelayoutstatetofillend = updateLayoutStateToFillEnd.onWarmupCompleted;
                    String strIAuthTabCallback = resolveshouldlayoutreverse.IAuthTabCallback(strOnExtraCallbackWithResult);
                    wie2 wie2VarIAuthTabCallback = updatelayoutstatetofillend.IAuthTabCallback();
                    wie2VarIAuthTabCallback.onExtraCallback();
                    oAuthToken = (OAuthToken) wie2VarIAuthTabCallback.onExtraCallback(OAuthToken.Companion.serializer(), strIAuthTabCallback);
                    int i5 = 27 / 0;
                } else {
                    updateLayoutStateToFillEnd updatelayoutstatetofillend2 = updateLayoutStateToFillEnd.onWarmupCompleted;
                    String strIAuthTabCallback2 = resolveshouldlayoutreverse.IAuthTabCallback(strOnExtraCallbackWithResult);
                    wie2 wie2VarIAuthTabCallback2 = updatelayoutstatetofillend2.IAuthTabCallback();
                    wie2VarIAuthTabCallback2.onExtraCallback();
                    oAuthToken = (OAuthToken) wie2VarIAuthTabCallback2.onExtraCallback(OAuthToken.Companion.serializer(), strIAuthTabCallback2);
                }
                oAuthToken2 = oAuthToken;
                int i6 = 2 % 2;
            } catch (Throwable th) {
                updateLayoutStateToFillStart.Companion.onNavigationEvent(th);
            }
        }
        this.IAuthTabCallback = oAuthToken2;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Lazy<computeScrollExtent> lazy = onExtraCallback;
        int i6 = i3 + 15;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return lazy;
    }

    public /* synthetic */ computeScrollExtent(updateLayoutState updatelayoutstate, resolveShouldLayoutReverse resolveshouldlayoutreverse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        updatelayoutstate = (i2 & 1) != 0 ? new calculateExtraLayoutSpace(fixLayoutStartGap.onNavigationEvent.onExtraCallbackWithResult().asInterface()) : updatelayoutstate;
        if ((i2 & 2) != 0) {
            resolveshouldlayoutreverse = new recycleViewsFromEnd(null, 1, null);
            int i3 = asBinder + 21;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        this(updatelayoutstate, resolveshouldlayoutreverse);
    }

    @Override // o.findLastPartiallyOrCompletelyInvisibleChild
    public OAuthToken onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 119;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.findLastPartiallyOrCompletelyInvisibleChild
    public void onExtraCallback(@NotNull OAuthToken oAuthToken) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(oAuthToken, "");
            OAuthToken oAuthTokenOnWarmupCompleted = OAuthToken.onWarmupCompleted(oAuthToken, (String) null, (Date) null, (String) null, (Date) null, (String) null, (List) null, 63, (Object) null);
            try {
                updateLayoutState updatelayoutstate = this.onExtraCallbackWithResult;
                resolveShouldLayoutReverse resolveshouldlayoutreverse = this.onNavigationEvent;
                wie2 wie2VarIAuthTabCallback = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
                wie2VarIAuthTabCallback.onExtraCallback();
                updatelayoutstate.onWarmupCompleted("com.kakao.sdk.oauth_token", resolveshouldlayoutreverse.onNavigationEvent(wie2VarIAuthTabCallback.onWarmupCompleted(OAuthToken.Companion.serializer(), oAuthTokenOnWarmupCompleted))).onWarmupCompleted();
            } catch (Throwable th) {
                updateLayoutStateToFillStart.Companion.onNavigationEvent(th);
            }
            this.IAuthTabCallback = oAuthTokenOnWarmupCompleted;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final computeScrollExtent onNavigationEvent() {
            return (computeScrollExtent) computeScrollExtent.onWarmupCompleted().getValue();
        }
    }

    static final class onExtraCallback extends Lambda implements Function0<computeScrollExtent> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final computeScrollExtent invoke() {
            return new computeScrollExtent(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    static {
        onExtraCallback();
        Companion = new onWarmupCompleted(null);
        onExtraCallback = LazyKt.onExtraCallbackWithResult(onExtraCallback.IAuthTabCallback);
        int i2 = asInterface + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(2:4|(2:6|(3:8|(1:10)(1:13)|(1:15))(2:11|12))(0))(0)|16|102|17|(18:19|20|(3:22|(3:24|25|(1:30)(1:31))(2:28|(0)(0))|(2:35|36))(0)|42|110|43|(4:45|46|(1:51)(1:50)|(2:55|(4:57|58|106|59)(1:64)))(1:66)|67|70|104|71|(2:73|(1:81)(2:77|78))(0)|(1:83)(1:84)|108|85|(2:87|(1:91))|(1:96)(1:97)|(1:112)(2:100|101))(1:38)|39|42|110|43|(0)(0)|67|70|104|71|(0)(0)|(0)(0)|108|85|(0)|(0)(0)|(1:112)(1:111)) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        o.updateLayoutStateToFillStart.Companion.onNavigationEvent(r0);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ff, code lost:
    
        o.updateLayoutStateToFillStart.Companion.onNavigationEvent(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0245, code lost:
    
        o.updateLayoutStateToFillStart.Companion.onNavigationEvent(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[Catch: Exception -> 0x011f, PHI: r0
      0x00fe: PHI (r0v70 kotlinx.serialization.json.JsonPrimitive) = (r0v69 kotlinx.serialization.json.JsonPrimitive), (r0v72 kotlinx.serialization.json.JsonPrimitive) binds: [B:29:0x00fc, B:26:0x00f5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011f, blocks: (B:17:0x00b3, B:20:0x00c4, B:24:0x00ee, B:30:0x00fe, B:33:0x0106, B:36:0x0115, B:28:0x00f8), top: B:102:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7 A[Catch: Exception -> 0x01fe, TryCatch #1 {Exception -> 0x01fe, blocks: (B:71:0x01bf, B:73:0x01c7, B:75:0x01e6, B:77:0x01ec), top: B:104:0x01bf }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216 A[Catch: Exception -> 0x0244, TryCatch #3 {Exception -> 0x0244, blocks: (B:85:0x020e, B:87:0x0216, B:89:0x0235, B:91:0x023b), top: B:108:0x020e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult() throws Throwable {
        String strOnWarmupCompleted;
        String str;
        Long lValueOf;
        String strOnExtraCallback;
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        String strOnExtraCallback2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent2;
        String strOnExtraCallback3;
        String strOnWarmupCompleted2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent3;
        String strOnExtraCallback4;
        String strOnWarmupCompleted3;
        JsonPrimitive jsonPrimitiveOnNavigationEvent4;
        int i2 = 2 % 2;
        int i3 = asBinder + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{7, 0, 3, 1, 13871}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47), (-16777211) - Color.rgb(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        updateLayoutStateToFillStart.IAuthTabCallback iAuthTabCallback = updateLayoutStateToFillStart.Companion;
        iAuthTabCallback.onWarmupCompleted("=== Migrate from old version token");
        this.onExtraCallbackWithResult.onWarmupCompleted("com.kakao.sdk.version", "2.23.3").onWarmupCompleted();
        Long lValueOf2 = null;
        String strOnExtraCallback5 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.KakaoSecureMode", null);
        if (strOnExtraCallback5 != null) {
            wie2 wie2VarIAuthTabCallback = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
            wie2VarIAuthTabCallback.onExtraCallback();
            JsonElement jsonElement = (JsonElement) ((JsonObject) wie2VarIAuthTabCallback.onExtraCallback(JsonObject.Companion.serializer(), strOnExtraCallback5)).get(strIntern);
            if (jsonElement != null) {
                int i5 = IAuthTabCallbackDefault + 49;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    initRenderFinish.onNavigationEvent(jsonElement);
                    throw null;
                }
                JsonPrimitive jsonPrimitiveOnNavigationEvent5 = initRenderFinish.onNavigationEvent(jsonElement);
                strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent5 != null ? jsonPrimitiveOnNavigationEvent5.onWarmupCompleted() : null;
                if (strOnWarmupCompleted == null) {
                    strOnWarmupCompleted = "false";
                }
            }
        }
        iAuthTabCallback.onWarmupCompleted("secureMode: " + strOnWarmupCompleted);
        try {
            strOnExtraCallback4 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.AccessToken", null);
        } catch (Exception e) {
            updateLayoutStateToFillStart.Companion.onNavigationEvent(e);
            str = null;
        }
        if (strOnExtraCallback4 != null) {
            int i6 = asBinder + 39;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            wie2 wie2VarIAuthTabCallback2 = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
            wie2VarIAuthTabCallback2.onExtraCallback();
            JsonElement jsonElement2 = (JsonElement) ((JsonObject) wie2VarIAuthTabCallback2.onExtraCallback(JsonObject.Companion.serializer(), strOnExtraCallback4)).get(strIntern);
            if (jsonElement2 != null) {
                int i8 = IAuthTabCallbackDefault + 49;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    jsonPrimitiveOnNavigationEvent4 = initRenderFinish.onNavigationEvent(jsonElement2);
                    int i9 = 70 / 0;
                    strOnWarmupCompleted3 = jsonPrimitiveOnNavigationEvent4 != null ? jsonPrimitiveOnNavigationEvent4.onWarmupCompleted() : null;
                } else {
                    jsonPrimitiveOnNavigationEvent4 = initRenderFinish.onNavigationEvent(jsonElement2);
                    if (jsonPrimitiveOnNavigationEvent4 != null) {
                    }
                }
                if (strOnWarmupCompleted3 != null && Intrinsics.areEqual(strOnWarmupCompleted, "true")) {
                    int i10 = IAuthTabCallbackDefault + 17;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    strOnWarmupCompleted3 = this.onNavigationEvent.IAuthTabCallback(strOnWarmupCompleted3);
                }
            }
            updateLayoutStateToFillStart.Companion.onWarmupCompleted("accessToken: " + str);
            strOnExtraCallback3 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.RefreshToken", null);
            if (strOnExtraCallback3 == null) {
                int i12 = asBinder + 25;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                wie2 wie2VarIAuthTabCallback3 = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
                wie2VarIAuthTabCallback3.onExtraCallback();
                JsonElement jsonElement3 = (JsonElement) ((JsonObject) wie2VarIAuthTabCallback3.onExtraCallback(JsonObject.Companion.serializer(), strOnExtraCallback3)).get(strIntern);
                strOnWarmupCompleted2 = (jsonElement3 == null || (jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement3)) == null) ? null : jsonPrimitiveOnNavigationEvent3.onWarmupCompleted();
                if (strOnWarmupCompleted2 != null && Intrinsics.areEqual(strOnWarmupCompleted, "true")) {
                    int i14 = asBinder + 115;
                    IAuthTabCallbackDefault = i14 % 128;
                    if (i14 % 2 == 0) {
                        strOnWarmupCompleted2 = this.onNavigationEvent.IAuthTabCallback(strOnWarmupCompleted2);
                        int i15 = 35 / 0;
                    } else {
                        strOnWarmupCompleted2 = this.onNavigationEvent.IAuthTabCallback(strOnWarmupCompleted2);
                    }
                }
            } else {
                strOnWarmupCompleted2 = null;
            }
            String str2 = strOnWarmupCompleted2;
            updateLayoutStateToFillStart.Companion.onWarmupCompleted("refreshToken: " + str2);
            strOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.OAuthToken.ExpiresAt", null);
            if (strOnExtraCallback2 == null) {
                wie2 wie2VarIAuthTabCallback4 = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
                wie2VarIAuthTabCallback4.onExtraCallback();
                JsonElement jsonElement4 = (JsonElement) ((JsonObject) wie2VarIAuthTabCallback4.onExtraCallback(JsonObject.Companion.serializer(), strOnExtraCallback2)).get(strIntern);
                if (jsonElement4 == null || (jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement4)) == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(initRenderFinish.IAuthTabCallbackDefault(jsonPrimitiveOnNavigationEvent2));
                    int i16 = IAuthTabCallbackDefault + 121;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            long jLongValue = lValueOf == null ? lValueOf.longValue() : 0L;
            strOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.RefreshToken.ExpiresAt", null);
            if (strOnExtraCallback != null) {
                wie2 wie2VarIAuthTabCallback5 = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
                wie2VarIAuthTabCallback5.onExtraCallback();
                JsonElement jsonElement5 = (JsonElement) ((JsonObject) wie2VarIAuthTabCallback5.onExtraCallback(JsonObject.Companion.serializer(), strOnExtraCallback)).get(strIntern);
                if (jsonElement5 != null && (jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement5)) != null) {
                    lValueOf2 = Long.valueOf(initRenderFinish.IAuthTabCallbackDefault(jsonPrimitiveOnNavigationEvent));
                }
            }
            long jLongValue2 = lValueOf2 == null ? lValueOf2.longValue() : Long.MAX_VALUE;
            if (str != null || str2 == null) {
            }
            OAuthToken oAuthToken = new OAuthToken(str, new Date(jLongValue), str2, new Date(jLongValue2), (String) null, (List) null, 48, (DefaultConstructorMarker) null);
            updateLayoutState updatelayoutstate = this.onExtraCallbackWithResult;
            resolveShouldLayoutReverse resolveshouldlayoutreverse = this.onNavigationEvent;
            wie2 wie2VarIAuthTabCallback6 = updateLayoutStateToFillEnd.onWarmupCompleted.IAuthTabCallback();
            wie2VarIAuthTabCallback6.onExtraCallback();
            updatelayoutstate.onWarmupCompleted("com.kakao.sdk.oauth_token", resolveshouldlayoutreverse.onNavigationEvent(wie2VarIAuthTabCallback6.onWarmupCompleted(OAuthToken.Companion.serializer(), oAuthToken))).IAuthTabCallback("com.kakao.token.KakaoSecureMode").IAuthTabCallback("com.kakao.token.AccessToken").IAuthTabCallback("com.kakao.token.RefreshToken").IAuthTabCallback("com.kakao.token.OAuthToken.ExpiresAt").IAuthTabCallback("com.kakao.token.RefreshToken.ExpiresAt").onWarmupCompleted();
            int i18 = asBinder + 87;
            IAuthTabCallbackDefault = i18 % 128;
            int i19 = i18 % 2;
            return;
        }
        strOnWarmupCompleted3 = null;
        str = strOnWarmupCompleted3;
        updateLayoutStateToFillStart.Companion.onWarmupCompleted("accessToken: " + str);
        strOnExtraCallback3 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.RefreshToken", null);
        if (strOnExtraCallback3 == null) {
        }
        String str22 = strOnWarmupCompleted2;
        updateLayoutStateToFillStart.Companion.onWarmupCompleted("refreshToken: " + str22);
        strOnExtraCallback2 = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.OAuthToken.ExpiresAt", null);
        if (strOnExtraCallback2 == null) {
        }
        if (lValueOf == null) {
        }
        strOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback("com.kakao.token.RefreshToken.ExpiresAt", null);
        if (strOnExtraCallback != null) {
        }
        if (lValueOf2 == null) {
        }
        if (str != null) {
        }
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int length;
        char[] cArr2;
        int i4;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onWarmupCompleted;
        char c = '0';
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i6 = $10 + 7;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), TextUtils.indexOf("", c) + 27, (ViewConfiguration.getTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, 23140 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i7 = $11 + 45;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 5;
                }
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i9 = $11 + 47;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback << b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 24824), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, 8087 - TextUtils.indexOf((CharSequence) "", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.makeMeasureSpec(0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                                } else {
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i15 = 0; i15 < i2; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{64966, 64978, 64985, 64986, 64991, 64987, 64965, 64984, 64982};
        IAuthTabCallbackStub = (char) 51242;
    }
}
