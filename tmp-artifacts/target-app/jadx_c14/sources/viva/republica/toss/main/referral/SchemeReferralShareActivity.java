package viva.republica.toss.main.referral;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.base.BaseActivity;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeReferralShareActivity extends BaseActivity {
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static long asInterface = 7798559133331975163L;
    private static int IAuthTabCallbackStub = -1776194565;
    private static char IAuthTabCallbackDefault = 47678;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 109
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = viva.republica.toss.main.referral.SchemeReferralShareActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r6
            r6 = r5
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.referral.SchemeReferralShareActivity.$$c(short, short, short):java.lang.String");
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return "SchemeReferralShareActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String str;
        String str2;
        boolean z;
        int i;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("medium");
        if (stringExtra != null) {
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 34170509 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022242).substring(19, 20).codePointAt(0), new char[]{37939, 33676, 60395, 56989, 33278, 34843, 27538}, new char[]{0, 0, 0, 0}, new char[]{44523, 2406, 26626, 18153}, objArr);
            String stringExtra2 = intent.getStringExtra(((String) objArr[0]).intern());
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = getIntent().getStringExtra("destination");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            String upperCase = stringExtra.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.areEqual(upperCase, "KAKAOTALK")) {
                int i3 = asBinder + 125;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    IAuthTabCallback(stringExtra2);
                    int i4 = 58 / 0;
                } else {
                    IAuthTabCallback(stringExtra2);
                }
            } else if (Intrinsics.areEqual(upperCase, "SMS")) {
                String str3 = stringExtra3;
                StringsKt.replace$default(str3, " ", "", false, 4, (Object) null);
                StringsKt.replace$default(str3, "-", "", false, 4, (Object) null);
                if (StringsKt.startsWith$default(stringExtra3, "+821", false, 2, (Object) null)) {
                    Object[] objArr2 = new Object[1];
                    a((char) (34228 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 923916893, new char[]{20911}, new char[]{0, 0, 0, 0}, new char[]{24004, 4570, 46391, 45445}, objArr2);
                    StringsKt.replace$default(stringExtra3, "+82", ((String) objArr2[0]).intern(), false, 4, (Object) null);
                } else if (StringsKt.startsWith$default(stringExtra3, "+82", false, 2, (Object) null)) {
                    int i5 = onTransact + 89;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        str = "+82";
                        str2 = "";
                        z = false;
                        i = 3;
                    } else {
                        str = "+82";
                        str2 = "";
                        z = false;
                        i = 4;
                    }
                    StringsKt.replace$default(stringExtra3, str, str2, z, i, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
                onExtraCallbackWithResult(stringExtra2, stringExtra3);
            }
        }
        finish();
        int i6 = onTransact + 107;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage("com.kakao.talk");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getString(R.string.app_main_referral___783e15a640)));
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + str2));
        intent.putExtra("sms_body", str);
        if (intent.resolveActivity(getPackageManager()) != null) {
            int i2 = asBinder + 59;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            startActivity(intent);
            int i4 = asBinder + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42, (Process.myPid() >> 22) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.getSize(0)), (Process.myTid() >> 22) + 44, TextUtils.lastIndexOf("", '0', 0, 0) + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 23973), 50 - (ViewConfiguration.getScrollBarSize() >> 8), 22938 - ImageFormat.getBitsPerPixel(0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.alpha(0)), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12577 - Color.blue(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i7 = $11 + 67;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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

    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asBinder + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }
}
