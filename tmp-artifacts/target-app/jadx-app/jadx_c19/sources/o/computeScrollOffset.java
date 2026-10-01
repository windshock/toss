package o;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.common.model.ServerHosts;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class computeScrollOffset {
    private final ServerHosts onExtraCallback;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onWarmupCompleted = -1776194565;
    private static char onNavigationEvent = 27561;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i2;
        int i3 = (b2 * 4) + 4;
        byte[] bArr = $$a;
        int i4 = s * 2;
        int i5 = 110 - b;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public computeScrollOffset() {
        ServerHosts serverHosts = null;
        this(serverHosts, 1, serverHosts);
    }

    public computeScrollOffset(@NotNull ServerHosts serverHosts) {
        Intrinsics.checkNotNullParameter(serverHosts, "");
        this.onExtraCallback = serverHosts;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ computeScrollOffset(ServerHosts serverHosts, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 77;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                serverHosts = fixLayoutStartGap.onNavigationEvent.IAuthTabCallback();
                int i4 = 2 % 2;
            } else {
                fixLayoutStartGap.onNavigationEvent.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(serverHosts);
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function1<Prompt, CharSequence> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Prompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "");
            return prompt.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Uri onNavigationEvent(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable List<String> list, @Nullable String str4, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<? extends Prompt> list4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(this.onExtraCallback.onNavigationEvent()).path("oauth/authorize").appendQueryParameter("client_id", str).appendQueryParameter("redirect_uri", str3).appendQueryParameter("response_type", "code").appendQueryParameter("ka", str4);
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("agt", str2);
        }
        List<String> list5 = list;
        if (list5 != null) {
            int i3 = onExtraCallbackWithResult + 83;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 43 / 0;
                if (!list5.isEmpty()) {
                    builderAppendQueryParameter.appendQueryParameter("scope", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
                }
            } else if (!list5.isEmpty()) {
            }
        }
        if (list2 != null) {
            builderAppendQueryParameter.appendQueryParameter("channel_public_id", CollectionsKt.joinToString$default(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        if (list3 != null) {
            int i5 = onTransact + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            builderAppendQueryParameter.appendQueryParameter("service_terms", CollectionsKt.joinToString$default(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        if (list4 != null) {
            builderAppendQueryParameter.appendQueryParameter("prompt", CollectionsKt.joinToString$default(list4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, onExtraCallbackWithResult.IAuthTabCallback, 30, (Object) null));
        }
        if (str5 != null) {
            int i7 = onTransact + 17;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            builderAppendQueryParameter.appendQueryParameter("login_hint", str5);
        }
        if (str6 != null) {
            int i9 = onExtraCallbackWithResult + 57;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((char) ((Process.myTid() << 123) + 35589), (-1116410483) + (ViewConfiguration.getMaximumDrawingCacheSize() << 22), new char[]{5738, 1266, 26453, 59528, 38114}, new char[]{0, 0, 0, 0}, new char[]{36330, 29933, 1469, 16779}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a((char) ((Process.myTid() >> 22) + 35589), (-1116410483) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{5738, 1266, 26453, 59528, 38114}, new char[]{0, 0, 0, 0}, new char[]{36330, 29933, 1469, 16779}, objArr2);
                obj = objArr2[0];
            }
            builderAppendQueryParameter.appendQueryParameter(((String) obj).intern(), str6);
        }
        if (str7 != null) {
            builderAppendQueryParameter.appendQueryParameter("approval_type", str7);
        }
        if (str8 != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", str8);
        }
        if (str9 != null) {
            int i10 = onExtraCallbackWithResult + 107;
            onTransact = i10 % 128;
            if (i10 % 2 == 0) {
                builderAppendQueryParameter.appendQueryParameter("code_challenge_method", str9);
                int i11 = 98 / 0;
            } else {
                builderAppendQueryParameter.appendQueryParameter("code_challenge_method", str9);
            }
        }
        if (str10 != null) {
            builderAppendQueryParameter.appendQueryParameter("kauth_tx_id", str10);
        }
        if (fixLayoutStartGap.onNavigationEvent.asInterface()) {
            builderAppendQueryParameter.appendQueryParameter("device_type", "car");
            int i12 = onExtraCallbackWithResult + 119;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        return uriBuild;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 85;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 % 2;
        }
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), 44 - Color.green(0), 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.alpha(0)), Process.getGidForName("") + 30, (Process.myPid() >> 22) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
