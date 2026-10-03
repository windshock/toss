package o;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onTileLoadError {
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int IAuthTabCallback = 478309036;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = o.onTileLoadError.$$a
            int r5 = r5 * 4
            int r5 = r5 + 105
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L16
            r5 = r6
            r3 = r7
            goto L2b
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L27:
            int r5 = r5 + 1
            r3 = r0[r5]
        L2b:
            int r3 = -r3
            int r6 = r6 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onTileLoadError.$$c(byte, int, byte):java.lang.String");
    }

    public static final boolean onWarmupCompleted(@NotNull ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        String strName = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda12, "");
            imagePipelineExperimentsBuilderExternalSyntheticLambda12.access000();
            strName.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(imagePipelineExperimentsBuilderExternalSyntheticLambda12, "");
        if (imagePipelineExperimentsBuilderExternalSyntheticLambda12.access000() != null) {
            int i3 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            JsonObject jsonObjectAccess000 = imagePipelineExperimentsBuilderExternalSyntheticLambda12.access000();
            if (jsonObjectAccess000 == null || jsonObjectAccess000.size() != 0) {
                if (onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda12, imagePipelineExperimentsBuilderExternalSyntheticLambda12.onExtraCallbackWithResult(), "authSmsTime") && onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda12, imagePipelineExperimentsBuilderExternalSyntheticLambda12.onExtraCallback(), "agreeTermsTime")) {
                    int i5 = onExtraCallbackWithResult + 41;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        imagePipelineExperimentsBuilderExternalSyntheticLambda12.writeTypedObject();
                        strName.hashCode();
                        throw null;
                    }
                    LoanFunnelType loanFunnelTypeWriteTypedObject = imagePipelineExperimentsBuilderExternalSyntheticLambda12.writeTypedObject();
                    if (loanFunnelTypeWriteTypedObject != null) {
                        strName = loanFunnelTypeWriteTypedObject.name();
                        int i6 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 5 % 2;
                        }
                    }
                    a(5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 5, new char[]{4, '\t', 0, 65525}, false, 245 - TextUtils.getOffsetBefore("", 0), new Object[1]);
                    if (!(!onNavigationEvent(imagePipelineExperimentsBuilderExternalSyntheticLambda12, strName, ((String) r1[0]).intern()))) {
                        return true;
                    }
                }
                return false;
            }
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanComparisonManualRequest", "scrapedData is Empty at " + imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackDefault(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onNavigationEvent(@org.jetbrains.annotations.NotNull o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onTileLoadError.onNavigationEvent(o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12):boolean");
    }

    private static final boolean onNavigationEvent(ImagePipelineExperimentsBuilderExternalSyntheticLambda12 imagePipelineExperimentsBuilderExternalSyntheticLambda12, String str, String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && !StringsKt.isBlank(str)) {
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanComparisonManualRequest", str2 + " is Empty at " + imagePipelineExperimentsBuilderExternalSyntheticLambda12.IAuthTabCallbackDefault(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r20, int r21, char[] r22, boolean r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onTileLoadError.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
