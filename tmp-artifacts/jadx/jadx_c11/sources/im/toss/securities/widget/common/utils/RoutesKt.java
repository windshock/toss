package im.toss.securities.widget.common.utils;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.WindowInsetsPadding_androidKtExternalSyntheticLambda5;
import o.delimiterOffset;
import o.isSensitiveHeader;
import o.newChunkedSink;
import o.q8ExternalSyntheticLambda1;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RoutesKt {
    private static final Lazy IAuthTabCallback;
    private static final WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<String> IAuthTabCallbackDefault;
    private static final WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<String> IAuthTabCallbackStub;
    private static int access100;
    private static int asBinder;
    private static final Lazy onExtraCallback;
    private static final WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<String> onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static final WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<Integer> onWarmupCompleted;
    private static final byte[] $$a = {48, 86, 58, 71};
    private static final int $$b = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int onTransact = 0;
    private static int asInterface = 1;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        static {
            int[] iArr = new int[delimiterOffset.values().length];
            try {
                iArr[delimiterOffset.STOCK.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[delimiterOffset.BOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[delimiterOffset.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[delimiterOffset.CURRENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[delimiterOffset.INDEX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[delimiterOffset.COMMODITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[delimiterOffset.TREASURY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[delimiterOffset.CRYPTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.values().length];
            try {
                iArr2[r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET.ordinal()] = 2;
                int i2 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused10) {
            }
            onExtraCallback = iArr2;
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3 = 105 - (b * 4);
        int i4 = i + 4;
        int i5 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            i3 = i5;
            int i7 = 0;
            i3 += -i4;
            i4 = i6;
            i2 = i7;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i4 = bArr[i8];
            i3 += -i4;
            i4 = i6;
            i2 = i7;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder();
        int i4 = asInterface + 97;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return strAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Uri onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        Uri uri = (Uri) onNavigationEvent(iIAuthTabCallback, 548682925, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, -548682922, new Object[0]);
        int i4 = onTransact + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return uri;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012d A[PHI: r5
      0x012d: PHI (r5v14 java.lang.String) = (r5v13 java.lang.String), (r5v33 java.lang.String) binds: [B:15:0x012b, B:12:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        String queryParameter;
        boolean z;
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i;
        int i10 = ~(i9 | i2);
        int i11 = i8 | i10;
        int i12 = ~i2;
        int i13 = ~(i12 | i6);
        int i14 = (~(i | i7)) | i13 | i10;
        int i15 = (~(i9 | i6)) | (~(i12 | i9)) | i13;
        int i16 = i2 + i6 + i5 + ((-954185507) * i4) + (2055044340 * i3);
        int i17 = i16 * i16;
        int i18 = (i2 * 1290134917) + 267690129 + (i6 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (1290136159 * i5) + (826674179 * i4) + (1594648204 * i3) + (i17 * 572063744);
        int i19 = ((1110557339 * i2) - 760807424) + ((-878567756) * i6) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i5) + (1313472512 * i4) + (606601216 * i3) + ((-1232666624) * i17) + (i18 * i18 * 607715328);
        if (i19 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        Uri uri = (Uri) objArr[0];
        int i20 = 2 % 2;
        int i21 = asInterface + 59;
        onTransact = i21 % 128;
        if (i21 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(73 >>> TextUtils.getOffsetBefore("", 0), 112 % TextUtils.getTrimmedLength(""), new char[]{11, 5, '\f', 6, 65530, 65530, 65496, 16, '\t', 65528, 4, 0, '\t', 7, 16, 65532, 65506}, true, 4737 / TextUtils.lastIndexOf("", 'o', 1), objArr2);
            queryParameter = uri.getQueryParameter(((String) objArr2[0]).intern());
            if (queryParameter != null) {
                int i22 = onTransact + 99;
                asInterface = i22 % 128;
                int i23 = i22 % 2;
                if (!StringsKt.isBlank(queryParameter)) {
                    int i24 = onTransact + 103;
                    asInterface = i24 % 128;
                    int i25 = i24 % 2;
                    z = false;
                } else {
                    int i26 = onTransact + 97;
                    asInterface = i26 % 128;
                    int i27 = i26 % 2;
                    z = true;
                }
            }
        } else {
            Object[] objArr3 = new Object[1];
            a(TextUtils.getOffsetBefore("", 0) + 17, TextUtils.getTrimmedLength("") + 14, new char[]{11, 5, '\f', 6, 65530, 65530, 65496, 16, '\t', 65528, 4, 0, '\t', 7, 16, 65532, 65506}, true, 166 - TextUtils.lastIndexOf("", '0', 0), objArr3);
            queryParameter = uri.getQueryParameter(((String) objArr3[0]).intern());
            if (queryParameter != null) {
            }
        }
        Uri.Builder builder = new Uri.Builder();
        Object[] objArr4 = new Object[1];
        a(9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 9, new char[]{3, 5, 0, 65525, 2, 4, 65535, 3, 3}, false, 173 - TextUtils.lastIndexOf("", '0'), objArr4);
        Uri.Builder builderScheme = builder.scheme(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(9 - TextUtils.indexOf((CharSequence) "", '0', 0), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{7, 7, 65529, 65533, '\b', 65533, 6, '\t', 65527, 65529}, true, 169 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
        Uri.Builder builderAuthority = builderScheme.authority(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{4, 65531, 1}, true, 175 - KeyEvent.getDeadChar(0, 0), objArr6);
        Uri.Builder builderAppendQueryParameter = builderAuthority.appendQueryParameter(((String) objArr6[0]).intern(), uri.toString());
        Object[] objArr7 = new Object[1];
        a(16 - TextUtils.indexOf("", ""), 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{'\n', 65533, 65508, '\n', 65533, 65535, 16, '\n', 17, 11, 65535, 65535, 65501, 1, '\b', 0}, true, TextUtils.getCapsMode("", 0, 0) + 162, objArr7);
        String string = builderAppendQueryParameter.appendQueryParameter(((String) objArr7[0]).intern(), String.valueOf(true ^ z)).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = asInterface + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackDefault;
    }

    static {
        access100 = 1;
        onTransact();
        Object[] objArr = new Object[1];
        a(4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -ExpandableListView.getPackedPositionChild(0L), new char[]{4, 65531, 1}, true, (ViewConfiguration.getLongPressTimeout() >> 16) + 175, objArr);
        onExtraCallbackWithResult = new WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<>(((String) objArr[0]).intern());
        onWarmupCompleted = new WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<>("appWidgetId");
        IAuthTabCallbackDefault = new WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<>("widget_type");
        IAuthTabCallbackStub = new WindowInsetsPadding_androidKtExternalSyntheticLambda5.onExtraCallbackWithResult<>("widget_size");
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.utils.RoutesKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                Uri uriOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    uriOnNavigationEvent = RoutesKt.onNavigationEvent();
                    int i3 = 38 / 0;
                } else {
                    uriOnNavigationEvent = RoutesKt.onNavigationEvent();
                }
                int i4 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 13 / 0;
                }
                return uriOnNavigationEvent;
            }
        });
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.utils.RoutesKt$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws Throwable {
                String strOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    strOnWarmupCompleted = RoutesKt.onWarmupCompleted();
                    int i3 = 6 / 0;
                } else {
                    strOnWarmupCompleted = RoutesKt.onWarmupCompleted();
                }
                int i4 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return strOnWarmupCompleted;
            }
        });
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.securities.widget.common.utils.RoutesKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return RoutesKt.onExtraCallbackWithResult();
                }
                RoutesKt.onExtraCallbackWithResult();
                throw null;
            }
        });
        int i = access000 + 105;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static final Uri IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Uri uri = (Uri) onExtraCallback.getValue();
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return uri;
    }

    private static final String IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = IAuthTabCallback((String) null);
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public static final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) IAuthTabCallback.getValue();
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public static final String IAuthTabCallback(@Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Uri.Builder builderBuildUpon = IAuthTabCallbackStub().buildUpon();
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, new char[]{3, 5, 65534, 65531}, true, TextUtils.getTrimmedLength("") + 168, objArr);
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("tab", ((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
        Uri uriBuild = onWarmupCompleted(onNavigationEvent(builderAppendQueryParameter, str)).build();
        Intrinsics.checkNotNull(uriBuild);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        String str2 = (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
        int i4 = onTransact + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onNavigationEvent.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String asBinder() {
        int i = 2 % 2;
        Uri.Builder builderPath = new Uri.Builder().path("/calendar");
        Intrinsics.checkNotNullExpressionValue(builderPath, "");
        String string = onWarmupCompleted(builderPath).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Uri uriBuild = IAuthTabCallbackStub().buildUpon().appendQueryParameter("nextLandingUrl", string).build();
        Intrinsics.checkNotNull(uriBuild);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        String str = (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String strValueOf;
        Long l = (Long) objArr[0];
        int i = 2 % 2;
        Uri.Builder builderAppendQueryParameter = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", "watchlist");
        Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
        if (l != null) {
            int i2 = onTransact + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            strValueOf = String.valueOf(l.longValue());
        } else {
            strValueOf = null;
        }
        Uri uriBuild = onWarmupCompleted(isSensitiveHeader.onNavigationEvent(builderAppendQueryParameter, TossSecRoute.Main.PARAM_WATCHLIST_ID, strValueOf)).build();
        Intrinsics.checkNotNull(uriBuild);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        String str = (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
        int i4 = onTransact + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ String onExtraCallback(String str, String str2, String str3, String str4, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            str2 = "watchlist";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i3 = onTransact + 81;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str4 = null;
        }
        String strOnNavigationEvent = onNavigationEvent(str, str2, str3, str4);
        int i5 = onTransact + 83;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) throws NoWhenBranchMatchedException {
        String str5;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (WhenMappings.IAuthTabCallback[delimiterOffset.Companion.onNavigationEvent(str, str3).ordinal()]) {
            case 1:
                str5 = "/stocks/" + str;
                i = asInterface + 109;
                onTransact = i % 128;
                int i5 = i % 2;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().path(str5).appendQueryParameter("stockGroupCategory", "widget");
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
                String string = onWarmupCompleted(builderAppendQueryParameter).build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Uri.Builder builderAppendQueryParameter2 = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string);
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter2, "");
                Uri uriBuild = onNavigationEvent(builderAppendQueryParameter2, str4).build();
                Intrinsics.checkNotNull(uriBuild);
                int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
                return (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
            case 2:
                str5 = "/bonds/" + str;
                i = asInterface + 61;
                onTransact = i % 128;
                int i52 = i % 2;
                Uri.Builder builderAppendQueryParameter3 = new Uri.Builder().path(str5).appendQueryParameter("stockGroupCategory", "widget");
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter3, "");
                String string2 = onWarmupCompleted(builderAppendQueryParameter3).build().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Uri.Builder builderAppendQueryParameter22 = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string2);
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter22, "");
                Uri uriBuild2 = onNavigationEvent(builderAppendQueryParameter22, str4).build();
                Intrinsics.checkNotNull(uriBuild2);
                int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback22 = AdResponseKtKt.IAuthTabCallback();
                return (String) onNavigationEvent(iIAuthTabCallback3, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback22, 446453179, new Object[]{uriBuild2});
            case 3:
                str5 = "/options/" + str;
                Uri.Builder builderAppendQueryParameter32 = new Uri.Builder().path(str5).appendQueryParameter("stockGroupCategory", "widget");
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter32, "");
                String string22 = onWarmupCompleted(builderAppendQueryParameter32).build().toString();
                Intrinsics.checkNotNullExpressionValue(string22, "");
                Uri.Builder builderAppendQueryParameter222 = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string22);
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter222, "");
                Uri uriBuild22 = onNavigationEvent(builderAppendQueryParameter222, str4).build();
                Intrinsics.checkNotNull(uriBuild22);
                int iIAuthTabCallback32 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback222 = AdResponseKtKt.IAuthTabCallback();
                return (String) onNavigationEvent(iIAuthTabCallback32, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback222, 446453179, new Object[]{uriBuild22});
            case 4:
                int i6 = asInterface + 95;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                str5 = "/exchange-rate";
                Uri.Builder builderAppendQueryParameter322 = new Uri.Builder().path(str5).appendQueryParameter("stockGroupCategory", "widget");
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter322, "");
                String string222 = onWarmupCompleted(builderAppendQueryParameter322).build().toString();
                Intrinsics.checkNotNullExpressionValue(string222, "");
                Uri.Builder builderAppendQueryParameter2222 = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string222);
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter2222, "");
                Uri uriBuild222 = onNavigationEvent(builderAppendQueryParameter2222, str4).build();
                Intrinsics.checkNotNull(uriBuild222);
                int iIAuthTabCallback322 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback2222 = AdResponseKtKt.IAuthTabCallback();
                return (String) onNavigationEvent(iIAuthTabCallback322, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2222, 446453179, new Object[]{uriBuild222});
            case 5:
            case 6:
            case 7:
            case 8:
                str5 = "/indices/" + str;
                Uri.Builder builderAppendQueryParameter3222 = new Uri.Builder().path(str5).appendQueryParameter("stockGroupCategory", "widget");
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter3222, "");
                String string2222 = onWarmupCompleted(builderAppendQueryParameter3222).build().toString();
                Intrinsics.checkNotNullExpressionValue(string2222, "");
                Uri.Builder builderAppendQueryParameter22222 = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string2222);
                Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter22222, "");
                Uri uriBuild2222 = onNavigationEvent(builderAppendQueryParameter22222, str4).build();
                Intrinsics.checkNotNull(uriBuild2222);
                int iIAuthTabCallback3222 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback22222 = AdResponseKtKt.IAuthTabCallback();
                return (String) onNavigationEvent(iIAuthTabCallback3222, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback22222, 446453179, new Object[]{uriBuild2222});
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String onNavigationEvent(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        Intrinsics.checkNotNullExpressionValue(builderBuildUpon, "");
        String string = onWarmupCompleted(builderBuildUpon).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Uri.Builder builderAppendQueryParameter = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", str2).appendQueryParameter("nextLandingUrl", string);
        Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
        Uri uriBuild = onNavigationEvent(builderAppendQueryParameter, str3).build();
        Intrinsics.checkNotNull(uriBuild);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        String str4 = (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
        int i4 = onTransact + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str4;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 23 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 55, 2167 - (Process.myTid() >> 22), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            int i8 = $10 + 53;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i10 = $11 + 29;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 55 - Color.red(0), 2168 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Uri.Builder builderPath;
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(str, q8ExternalSyntheticLambda1.EXCHANGE_RATE.getCode())) {
            builderPath = new Uri.Builder().path("/exchange-rate");
        } else {
            builderPath = new Uri.Builder().path("/indices/" + str);
            int i4 = asInterface + 21;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        Intrinsics.checkNotNull(builderPath);
        String string = onWarmupCompleted(builderPath).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Uri uriBuild = IAuthTabCallbackStub().buildUpon().appendQueryParameter("tab", "watchlist").appendQueryParameter("nextLandingUrl", string).build();
        Intrinsics.checkNotNull(uriBuild);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback2, 446453179, new Object[]{uriBuild});
    }

    public static /* synthetic */ String onExtraCallback(String str, r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 85;
            int i7 = i6 % 128;
            asInterface = i7;
            Object obj2 = null;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            int i8 = i7 + 95;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            str2 = null;
        }
        return onWarmupCompleted(str, r8lambdabrizzqzhaizmdvstl2yymmz7zsg, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return onExtraCallback(r9, null, r11, null, 10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r10 = new java.lang.Object[1];
        a(5 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, new char[]{3, 5, 65534, 65531}, true, 169 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), r10);
        r9 = onExtraCallback(r9, ((java.lang.String) r10[0]).intern(), r11, null, 8, null);
        r10 = im.toss.securities.widget.common.utils.RoutesKt.onTransact + 33;
        im.toss.securities.widget.common.utils.RoutesKt.asInterface = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if ((r10 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        r9 = null;
        r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        r0 = gatewayprotocol.v1.AdResponseKtKt.IAuthTabCallback();
        r4 = gatewayprotocol.v1.AdResponseKtKt.IAuthTabCallback();
        r3 = gatewayprotocol.v1.AdResponseKtKt.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        return (java.lang.String) onNavigationEvent(r0, -1383276284, gatewayprotocol.v1.AdResponseKtKt.IAuthTabCallback(), r3, r4, 1383276285, new java.lang.Object[]{r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r10 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r10 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r10 == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onWarmupCompleted(@NotNull String str, @NotNull r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsg, @Nullable String str2) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
            i = WhenMappings.onExtraCallback[r8lambdabrizzqzhaizmdvstl2yymmz7zsg.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r8lambdabrizzqzhaizmdvstl2yymmz7zsg, "");
            i = WhenMappings.onExtraCallback[r8lambdabrizzqzhaizmdvstl2yymmz7zsg.ordinal()];
        }
    }

    private static final Uri.Builder onWarmupCompleted(Uri.Builder builder) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("utm_source", "tosssec").appendQueryParameter("utm_medium", "widget");
        Intrinsics.checkNotNullExpressionValue(builderAppendQueryParameter, "");
        int i4 = onTransact + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return builderAppendQueryParameter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Uri.Builder onNavigationEvent(Uri.Builder builder, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    int i4 = asInterface + 1;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    str = null;
                }
            }
        } else if (str != null) {
        }
        Object[] objArr = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 17, AndroidCharacter.getMirror('0') - '\"', new char[]{11, 5, '\f', 6, 65530, 65530, 65496, 16, '\t', 65528, 4, 0, '\t', 7, 16, 65532, 65506}, true, 167 - View.combineMeasuredStates(0, 0), objArr);
        Uri.Builder builderOnNavigationEvent = isSensitiveHeader.onNavigationEvent(builder, ((String) objArr[0]).intern(), str);
        int i6 = asInterface + 53;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return builderOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
            return Uri.parse(newChunkedSink.onExtraCallbackWithResult().ResultReceiver());
        }
        return Uri.parse(newChunkedSink.onExtraCallbackWithResult().ResultReceiver());
    }

    private static final String IAuthTabCallback(Uri uri) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, -446453177, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 446453179, new Object[]{uri});
    }

    public static final String onExtraCallback(@NotNull String str) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, -1383276284, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 1383276285, new Object[]{str});
    }

    public static final String IAuthTabCallback(@Nullable Long l) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (String) onNavigationEvent(iIAuthTabCallback, -199646709, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, 199646709, new Object[]{l});
    }

    private static final Uri asInterface() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Uri) onNavigationEvent(iIAuthTabCallback, 548682925, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, -548682922, new Object[0]);
    }

    static void onTransact() {
        asBinder = 478308887;
    }
}
