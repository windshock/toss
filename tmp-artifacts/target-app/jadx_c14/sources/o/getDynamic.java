package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDynamic {
    private static final ArrayList<String> IAuthTabCallback;
    private static int asBinder;
    private static int asInterface;
    private static final String[] onExtraCallback;
    private static final String[] onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    public static final getDynamic onWarmupCompleted;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackDefault = 0;

    private static String $$c(int i, short s, byte b) {
        int i2 = 3 - (b * 2);
        int i3 = (s * 2) + 105;
        byte[] bArr = $$a;
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += -i2;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i2 + 1;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i7];
            i2 = i7;
            i5 = i6;
        }
    }

    private getDynamic() {
    }

    static {
        asInterface = 1;
        onWarmupCompleted();
        onWarmupCompleted = new getDynamic();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, 7 - Color.blue(0), new char[]{65535, 4, 2, 65525, 0, 5, 3, 3, 3}, true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 172, objArr);
        IAuthTabCallback = CollectionsKt.arrayListOf(new String[]{((String) objArr[0]).intern(), "toss.im", "komoju.com"});
        Object[] objArr2 = new Object[1];
        a(9 - ((Process.getThreadPriority(0) + 20) >> 6), 7 - TextUtils.indexOf("", "", 0), new char[]{65535, 4, 2, 65525, 0, 5, 3, 3, 3}, true, 173 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        onExtraCallbackWithResult = new String[]{((String) objArr2[0]).intern(), "http", "https"};
        Object[] objArr3 = new Object[1];
        a(15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, new char[]{2, 20, 65484, 65484, 65495, 16, 16, '\f', 17, 15, 2, '\r', 18, 16, 65535}, true, View.MeasureSpec.getMode(0) + 160, objArr3);
        onExtraCallback = new String[]{((String) objArr3[0]).intern()};
        onNavigationEvent = 8;
        int i = IAuthTabCallbackDefault + 83;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (onNavigationEvent(r12) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: Exception -> 0x007b, PHI: r1
      0x003d: PHI (r1v6 android.net.Uri) = (r1v5 android.net.Uri), (r1v7 android.net.Uri) binds: [B:14:0x003b, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:5:0x0014, B:7:0x0024, B:15:0x003d, B:21:0x0050, B:27:0x0070, B:24:0x0060, B:28:0x0073, B:13:0x002d), top: B:35:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.lang.String r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getDynamic.onTransact
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.getDynamic.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L2a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            android.net.Uri r1 = android.net.Uri.parse(r12)     // Catch: java.lang.Exception -> L7b
            java.lang.String[] r4 = o.getDynamic.onExtraCallbackWithResult     // Catch: java.lang.Exception -> L7b
            java.lang.String r5 = r1.getScheme()     // Catch: java.lang.Exception -> L7b
            boolean r4 = kotlin.collections.ArraysKt.contains(r4, r5)     // Catch: java.lang.Exception -> L7b
            r5 = 16
            int r5 = r5 / r3
            if (r4 == 0) goto L7a
            goto L3d
        L28:
            r12 = move-exception
            throw r12
        L2a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            android.net.Uri r1 = android.net.Uri.parse(r12)     // Catch: java.lang.Exception -> L7b
            java.lang.String[] r4 = o.getDynamic.onExtraCallbackWithResult     // Catch: java.lang.Exception -> L7b
            java.lang.String r5 = r1.getScheme()     // Catch: java.lang.Exception -> L7b
            boolean r4 = kotlin.collections.ArraysKt.contains(r4, r5)     // Catch: java.lang.Exception -> L7b
            if (r4 == 0) goto L7a
        L3d:
            java.lang.String[] r4 = o.getDynamic.onExtraCallback     // Catch: java.lang.Exception -> L7b
            int r5 = r4.length     // Catch: java.lang.Exception -> L7b
            r6 = r3
        L41:
            r7 = 1
            if (r6 >= r5) goto L73
            int r8 = o.getDynamic.IAuthTabCallbackStub
            int r8 = r8 + 37
            int r9 = r8 % 128
            o.getDynamic.onTransact = r9
            int r8 = r8 % r0
            r9 = 0
            if (r8 == 0) goto L60
            r8 = r4[r6]     // Catch: java.lang.Exception -> L7b
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Exception -> L7b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L7b
            boolean r7 = kotlin.text.StringsKt.contains$default(r10, r8, r7, r0, r9)     // Catch: java.lang.Exception -> L7b
            if (r7 == 0) goto L70
            goto L7a
        L60:
            r7 = r4[r6]     // Catch: java.lang.Exception -> L7b
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> L7b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)     // Catch: java.lang.Exception -> L7b
            boolean r7 = kotlin.text.StringsKt.contains$default(r8, r7, r3, r0, r9)     // Catch: java.lang.Exception -> L7b
            if (r7 == 0) goto L70
            goto L7a
        L70:
            int r6 = r6 + 1
            goto L41
        L73:
            boolean r12 = r11.onNavigationEvent(r12)     // Catch: java.lang.Exception -> L7b
            if (r12 == 0) goto L7a
            return r7
        L7a:
            return r3
        L7b:
            r12 = move-exception
            o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r1 = "QRCodeUtils::validateQRCode"
            r0.IAuthTabCallback(r1, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDynamic.onExtraCallbackWithResult(java.lang.String):boolean");
    }

    public final boolean onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            a(9 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 7, new char[]{65535, 4, 2, 65525, 0, 5, 3, 3, 3}, true, Color.red(0) + 173, new Object[1]);
            if (!(!TextUtils.equals(scheme, ((String) r5[0]).intern()))) {
                return true;
            }
            if (URLUtil.isNetworkUrl(str)) {
                Intrinsics.checkNotNull(uri);
                if (!(!filterCreatePageParams.IAuthTabCallback(uri, new String[]{"toss.im", "komoju.com"}))) {
                    int i4 = IAuthTabCallbackStub + 61;
                    onTransact = i4 % 128;
                    return !(i4 % 2 != 0);
                }
            }
            return false;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("QRCodeUtils::isWhiteListQR", e);
            return false;
        }
    }

    public final Bitmap onExtraCallback(@NotNull String str, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            QRCodeWriter qRCodeWriter = new QRCodeWriter();
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrixEncode = qRCodeWriter.encode(str, BarcodeFormat.QR_CODE, i, i2, hashtable);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitMatrixEncode.getWidth(), bitMatrixEncode.getHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            IntIterator it = RangesKt.until(0, bitMatrixEncode.getWidth()).iterator();
            while (!(!it.hasNext())) {
                int i4 = onTransact + 27;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                int iNextInt = it.nextInt();
                IntIterator it2 = RangesKt.until(0, bitMatrixEncode.getHeight()).iterator();
                int i6 = onTransact + 71;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                while (it2.hasNext()) {
                    int i8 = IAuthTabCallbackStub + 5;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    int iNextInt2 = it2.nextInt();
                    bitmapCreateBitmap.setPixel(iNextInt, iNextInt2, bitMatrixEncode.get(iNextInt, iNextInt2) ? -16777216 : -1);
                }
            }
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDynamic.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        asBinder = 478308884;
    }
}
