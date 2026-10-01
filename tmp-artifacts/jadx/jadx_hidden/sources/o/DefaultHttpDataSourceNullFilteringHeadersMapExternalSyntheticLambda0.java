package o;

import java.util.ArrayList;
import o.ContentDataSourceContentDataSourceException;

/* loaded from: classes.dex */
public class DefaultHttpDataSourceNullFilteringHeadersMapExternalSyntheticLambda0 implements ContentDataSourceContentDataSourceException.onNavigationEvent {
    private static final byte[] $$a = {98, -3, -80, -4, 70, -31, -14, 4, 42, -49, 27, -12, 18, 70, -32, 13, -47, 6, 17, 25, -8, 4, 36, -25, -6, 5, 15, 6, 3, -3, 29, -28, 4, 24, 67, -70, 6, 46, -46, 9, 7, 22, 35, -25, -6, 5, 15, 6, 3, -3, 25, -13, -6, 17, 27, -14, -9, 3, 14, -3, 6, 37, -14, -16, 18, 7, 11, -14, 16, -1, 6, 46, -44, 22, -4, -1};
    private static final int $$b = 67;
    private final int onExtraCallbackWithResult;

    private static void a(int i, short s, int i2, Object[] objArr) {
        int i3 = s * 40;
        byte[] bArr = $$a;
        int i4 = 111 - (i * 2);
        int i5 = (i2 * 56) + 4;
        byte[] bArr2 = new byte[i3 + 17];
        int i6 = i3 + 16;
        int i7 = -1;
        if (bArr == null) {
            i4 = i4 + (-i5) + 5;
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i5;
            i4 = i4 + (-bArr[i5]) + 5;
            i5 = i9 + 1;
            i7 = i8;
        }
    }

    @Override // o.ContentDataSourceContentDataSourceException.onNavigationEvent
    public void onWarmupCompleted(Object[] objArr) throws Throwable {
        ContentDataSourceContentDataSourceException.onExtraCallbackWithResult = objArr;
        try {
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
            ContentDataSourceContentDataSourceException.IAuthTabCallback = jLongValue;
            ContentDataSourceContentDataSourceException.onExtraCallback = jLongValue >> 12;
            if (((int[]) objArr[1])[0] != ((int[]) objArr[0])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[2];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                try {
                    Object[] objArr2 = {Long.valueOf(((r0 ^ r4) & 4294967295L) ^ 98624749902495744L), 22962865L};
                    byte[] bArr = $$a;
                    byte b = bArr[69];
                    byte b2 = (byte) (b + 1);
                    byte b3 = (byte) (-b);
                    Object[] objArr3 = new Object[1];
                    a(b2, b3, (byte) (b3 - 1), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    byte b4 = bArr[69];
                    byte b5 = (byte) (b4 + 1);
                    Object[] objArr4 = new Object[1];
                    a(b5, b5, (byte) (-b4), objArr4);
                    cls.getMethod((String) objArr4[0], Long.TYPE, Long.TYPE).invoke(null, objArr2);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException();
        }
    }

    public DefaultHttpDataSourceNullFilteringHeadersMapExternalSyntheticLambda0(int i) {
        this.onExtraCallbackWithResult = i;
    }
}
