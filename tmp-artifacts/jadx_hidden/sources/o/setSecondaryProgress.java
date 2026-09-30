package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import o.s5a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class setSecondaryProgress {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final onWarmupCompleted IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int asBinder = 1;
    private static long asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final setSecondaryProgress onExtraCallback;
    private static final SecretKey onExtraCallbackWithResult;
    private static final IvParameterSpec onNavigationEvent;
    private static int onTransact;
    private static final onNavigationEvent onWarmupCompleted;

    private setSecondaryProgress() {
    }

    public static final /* synthetic */ SecretKey IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SecretKey secretKey = onExtraCallbackWithResult;
        int i5 = i2 + 105;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return secretKey;
    }

    public static final /* synthetic */ IvParameterSpec onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        IvParameterSpec ivParameterSpec = onNavigationEvent;
        int i5 = i3 + 111;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return ivParameterSpec;
    }

    static {
        onWarmupCompleted();
        onExtraCallback = new setSecondaryProgress();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 4, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
        onExtraCallbackWithResult = getTitleBar.onWarmupCompleted(keyGenerator);
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        onNavigationEvent = new IvParameterSpec(bArr);
        onWarmupCompleted = new onNavigationEvent();
        IAuthTabCallback = new onWarmupCompleted();
        int i = asBinder + 65;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String IAuthTabCallback(@NotNull String str) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = setup.IAuthTabCallback(onWarmupCompleted, str, 1, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = setup.IAuthTabCallback(onWarmupCompleted, str, 0, 2, (Object) null);
        }
        int i3 = getInterfaceDescriptor + 75;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return strIAuthTabCallback;
    }

    public final String onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return setup.onNavigationEvent(IAuthTabCallback, str, 0, 4, (Object) null);
        }
        Intrinsics.checkNotNullParameter(str, "");
        return setup.onNavigationEvent(IAuthTabCallback, str, 0, 2, (Object) null);
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(IAuthTabCallbackStub[i + i6]), i6, asInterface, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 77;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new char[]{60821, 23116, 33341};
        asInterface = 8019390784629266953L;
    }
}
