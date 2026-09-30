package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda17 implements Closeable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static char[] getInterfaceDescriptor = {27180};
    private final File IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private int access100;
    private final File asBinder;
    private final File onExtraCallback;
    private final File onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private Writer onTransact;
    private long IAuthTabCallback_Parcel = 0;
    private final LinkedHashMap<String, onExtraCallbackWithResult> asInterface = new LinkedHashMap<>(0, 0.75f, true);
    private long access000 = 0;
    final ThreadPoolExecutor onWarmupCompleted = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new onExtraCallback());
    private final Callable<Void> IAuthTabCallback = new Callable<Void>() { // from class: o.SaversKtExternalSyntheticLambda17.2
        @Override // java.util.concurrent.Callable
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (SaversKtExternalSyntheticLambda17.this) {
                if (SaversKtExternalSyntheticLambda17.onExtraCallback(SaversKtExternalSyntheticLambda17.this) == null) {
                    return null;
                }
                SaversKtExternalSyntheticLambda17.onNavigationEvent(SaversKtExternalSyntheticLambda17.this);
                if (SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(SaversKtExternalSyntheticLambda17.this)) {
                    SaversKtExternalSyntheticLambda17.onTransact(SaversKtExternalSyntheticLambda17.this);
                    Object[] objArr = {SaversKtExternalSyntheticLambda17.this, 0};
                    int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                    ((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1869642504, iOnWarmupCompleted, objArr, -1869642502)).intValue();
                }
                return null;
            }
        }
    };

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i7;
        int i9 = ~i5;
        int i10 = ~i6;
        int i11 = (~(i8 | i10)) | i9;
        int i12 = ~(i10 | i9 | i8);
        int i13 = i5 + i7 + i4 + ((-112346298) * i3) + (505796074 * i2);
        int i14 = i13 * i13;
        int i15 = ((1543607772 * i5) - 1525940224) + (1734765094 * i7) + (i8 * 95578661) + ((-95578661) * i11) + (95578661 * i12) + (1639186432 * i4) + (859308032 * i3) + (310902784 * i2) + (417529856 * i14);
        int i16 = (i5 * (-1233303660)) + 1670658458 + (i7 * (-1233302158)) + (i8 * 751) + (i11 * (-751)) + (i12 * 751) + (i4 * (-1233302909)) + (i3 * 1075253458) + (i2 * 745806526) + (i14 * 1512636416);
        int i17 = i15 + (i16 * i16 * (-1737162752));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    static /* synthetic */ File IAuthTabCallback(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 23;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        File file = saversKtExternalSyntheticLambda17.onExtraCallback;
        if (i4 != 0) {
            return file;
        }
        throw null;
    }

    static /* synthetic */ Writer onExtraCallback(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 105;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Writer writer = saversKtExternalSyntheticLambda17.onTransact;
        if (i4 != 0) {
            return writer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 117;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallback = saversKtExternalSyntheticLambda17.onExtraCallback();
        int i5 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17 = (SaversKtExternalSyntheticLambda17) objArr[0];
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult;
        int i4 = i3 + 33;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = saversKtExternalSyntheticLambda17.IAuthTabCallbackStubProxy;
        int i7 = i3 + 79;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i6);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onNavigationEvent(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 103;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        saversKtExternalSyntheticLambda17.asInterface();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void onNavigationEvent(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17, IAuthTabCallback iAuthTabCallback, boolean z) throws IOException {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        saversKtExternalSyntheticLambda17.onNavigationEvent(iAuthTabCallback, z);
        int i5 = ICustomTabsCallback + 117;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void onTransact(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 23;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        saversKtExternalSyntheticLambda17.asBinder();
        int i5 = extraCallbackWithResult + 109;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17 = (SaversKtExternalSyntheticLambda17) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 41;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        Object obj = null;
        saversKtExternalSyntheticLambda17.access100 = iIntValue;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 35;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    private SaversKtExternalSyntheticLambda17(File file, int i2, int i3, long j) {
        this.onExtraCallback = file;
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = new File(file, "journal");
        this.asBinder = new File(file, "journal.tmp");
        this.IAuthTabCallbackDefault = new File(file, "journal.bkp");
        this.IAuthTabCallbackStubProxy = i3;
        this.IAuthTabCallbackStub = j;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws IOException {
        File file = (File) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int i2 = 2 % 2;
        if (jLongValue <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (iIntValue2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (!file3.exists()) {
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1486941700, iOnWarmupCompleted, new Object[]{file2, file3, false}, -1486941699);
            } else {
                int i3 = extraCallbackWithResult + 61;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                file2.delete();
            }
        }
        SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17 = new SaversKtExternalSyntheticLambda17(file, iIntValue, iIntValue2, jLongValue);
        if (saversKtExternalSyntheticLambda17.onExtraCallbackWithResult.exists()) {
            int i5 = extraCallbackWithResult + 89;
            ICustomTabsCallback = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    saversKtExternalSyntheticLambda17.onWarmupCompleted();
                    saversKtExternalSyntheticLambda17.IAuthTabCallback();
                    return saversKtExternalSyntheticLambda17;
                }
                saversKtExternalSyntheticLambda17.onWarmupCompleted();
                saversKtExternalSyntheticLambda17.IAuthTabCallback();
                throw null;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                saversKtExternalSyntheticLambda17.onExtraCallbackWithResult();
            }
        }
        file.mkdirs();
        SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda172 = new SaversKtExternalSyntheticLambda17(file, iIntValue, iIntValue2, jLongValue);
        saversKtExternalSyntheticLambda172.asBinder();
        return saversKtExternalSyntheticLambda172;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 35283), TextUtils.indexOf("", c, 0) + 36, TextUtils.indexOf("", "", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $10 + 29;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 10935), 64 - TextUtils.lastIndexOf("", '0', 0, 0), 16718 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49467), 69 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0') + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $11 + 77;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i17 = $11 + 55;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i19 = $10 + 21;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void onWarmupCompleted() throws IOException {
        int i2 = 2 % 2;
        SaversKtExternalSyntheticLambda16 saversKtExternalSyntheticLambda16 = new SaversKtExternalSyntheticLambda16(new FileInputStream(this.onExtraCallbackWithResult), SaversKtExternalSyntheticLambda13.onExtraCallback);
        try {
            String strOnExtraCallback = saversKtExternalSyntheticLambda16.onExtraCallback();
            String strOnExtraCallback2 = saversKtExternalSyntheticLambda16.onExtraCallback();
            String strOnExtraCallback3 = saversKtExternalSyntheticLambda16.onExtraCallback();
            String strOnExtraCallback4 = saversKtExternalSyntheticLambda16.onExtraCallback();
            String strOnExtraCallback5 = saversKtExternalSyntheticLambda16.onExtraCallback();
            if (!(!"libcore.io.DiskLruCache".equals(strOnExtraCallback))) {
                int i3 = 0;
                Object[] objArr = new Object[1];
                a(new int[]{0, 1, 148, 1}, true, new byte[]{1}, objArr);
                if (((String) objArr[0]).intern().equals(strOnExtraCallback2) && Integer.toString(this.onNavigationEvent).equals(strOnExtraCallback3) && Integer.toString(this.IAuthTabCallbackStubProxy).equals(strOnExtraCallback4)) {
                    int i4 = ICustomTabsCallback + 19;
                    extraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(!"".equals(strOnExtraCallback5))) {
                        while (true) {
                            try {
                                onExtraCallbackWithResult(saversKtExternalSyntheticLambda16.onExtraCallback());
                                i3++;
                                int i6 = extraCallbackWithResult + 61;
                                ICustomTabsCallback = i6 % 128;
                                int i7 = i6 % 2;
                            } catch (EOFException unused) {
                                this.access100 = i3 - this.asInterface.size();
                                if (saversKtExternalSyntheticLambda16.IAuthTabCallback()) {
                                    asBinder();
                                } else {
                                    this.onTransact = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.onExtraCallbackWithResult, true), SaversKtExternalSyntheticLambda13.onExtraCallback));
                                }
                                SaversKtExternalSyntheticLambda13.onNavigationEvent(saversKtExternalSyntheticLambda16);
                                return;
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strOnExtraCallback + ", " + strOnExtraCallback2 + ", " + strOnExtraCallback4 + ", " + strOnExtraCallback5 + "]");
        } catch (Throwable th) {
            SaversKtExternalSyntheticLambda13.onNavigationEvent(saversKtExternalSyntheticLambda16);
            throw th;
        }
    }

    private void onExtraCallbackWithResult(String str) throws IOException {
        String strSubstring;
        int i2 = 2 % 2;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i3 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i3);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i3);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.asInterface.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i3, iIndexOf2);
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.asInterface.get(strSubstring);
        AnonymousClass2 anonymousClass2 = null;
        if (onextracallbackwithresult == null) {
            onextracallbackwithresult = new onExtraCallbackWithResult(strSubstring);
            this.asInterface.put(strSubstring, onextracallbackwithresult);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            onextracallbackwithresult.onTransact = true;
            onextracallbackwithresult.IAuthTabCallback = null;
            onextracallbackwithresult.onWarmupCompleted(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5) {
            int i4 = extraCallbackWithResult + 7;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            if (str.startsWith("DIRTY")) {
                onextracallbackwithresult.IAuthTabCallback = new IAuthTabCallback(onextracallbackwithresult);
                return;
            }
        }
        if (iIndexOf2 == -1) {
            int i6 = extraCallbackWithResult + 1;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0 ? iIndexOf == 4 : iIndexOf == 5) {
                if (str.startsWith("READ")) {
                    int i7 = ICustomTabsCallback + 97;
                    extraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return;
                    }
                    anonymousClass2.hashCode();
                    throw null;
                }
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void IAuthTabCallback() throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 103;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(this.asBinder);
        Iterator<onExtraCallbackWithResult> it = this.asInterface.values().iterator();
        while (it.hasNext()) {
            onExtraCallbackWithResult next = it.next();
            int i5 = 0;
            if (next.IAuthTabCallback == null) {
                while (i5 < this.IAuthTabCallbackStubProxy) {
                    this.IAuthTabCallback_Parcel += next.asInterface[i5];
                    i5++;
                }
            } else {
                next.IAuthTabCallback = null;
                int i6 = ICustomTabsCallback + 41;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                while (i5 < this.IAuthTabCallbackStubProxy) {
                    onExtraCallback(next.onNavigationEvent(i5));
                    onExtraCallback(next.IAuthTabCallback(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    private void asBinder() throws IOException {
        synchronized (this) {
            Writer writer = this.onTransact;
            if (writer != null) {
                onWarmupCompleted(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.asBinder), SaversKtExternalSyntheticLambda13.onExtraCallback));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                Object[] objArr = new Object[1];
                a(new int[]{0, 1, 148, 1}, true, new byte[]{1}, objArr);
                bufferedWriter.write(((String) objArr[0]).intern());
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.onNavigationEvent));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.IAuthTabCallbackStubProxy));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (onExtraCallbackWithResult onextracallbackwithresult : this.asInterface.values()) {
                    if (onextracallbackwithresult.IAuthTabCallback != null) {
                        bufferedWriter.write("DIRTY " + onextracallbackwithresult.onExtraCallback + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + onextracallbackwithresult.onExtraCallback + onextracallbackwithresult.onExtraCallback() + '\n');
                    }
                }
                onWarmupCompleted(bufferedWriter);
                if (this.onExtraCallbackWithResult.exists()) {
                    Object[] objArr2 = {this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, true};
                    onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486941700, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, -1486941699);
                }
                Object[] objArr3 = {this.asBinder, this.onExtraCallbackWithResult, false};
                onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486941700, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr3, -1486941699);
                this.IAuthTabCallbackDefault.delete();
                this.onTransact = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.onExtraCallbackWithResult, true), SaversKtExternalSyntheticLambda13.onExtraCallback));
            } catch (Throwable th) {
                onWarmupCompleted(bufferedWriter);
                throw th;
            }
        }
    }

    private static void onExtraCallback(File file) throws IOException {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 1;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            file.exists();
            throw null;
        }
        if (!file.exists() || file.delete()) {
            int i4 = extraCallbackWithResult + 111;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
                return;
            }
            return;
        }
        throw new IOException();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws IOException {
        File file = (File) objArr[0];
        File file2 = (File) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 39;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (zBooleanValue) {
            int i6 = i3 + 7;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            onExtraCallback(file2);
        }
        if (file.renameTo(file2)) {
            return null;
        }
        throw new IOException();
    }

    public onNavigationEvent onWarmupCompleted(String str) throws IOException {
        synchronized (this) {
            onNavigationEvent();
            onExtraCallbackWithResult onextracallbackwithresult = this.asInterface.get(str);
            if (onextracallbackwithresult == null) {
                return null;
            }
            if (!onextracallbackwithresult.onTransact) {
                return null;
            }
            for (File file : onextracallbackwithresult.onNavigationEvent) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.access100++;
            this.onTransact.append((CharSequence) "READ");
            this.onTransact.append(' ');
            this.onTransact.append((CharSequence) str);
            this.onTransact.append('\n');
            if (onExtraCallback()) {
                this.onWarmupCompleted.submit(this.IAuthTabCallback);
            }
            return new onNavigationEvent(str, onextracallbackwithresult.asBinder, onextracallbackwithresult.onNavigationEvent, onextracallbackwithresult.asInterface);
        }
    }

    public IAuthTabCallback IAuthTabCallback(String str) throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 115;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(str, -1L);
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        return iAuthTabCallbackOnNavigationEvent;
    }

    private IAuthTabCallback onNavigationEvent(String str, long j) throws IOException {
        synchronized (this) {
            onNavigationEvent();
            onExtraCallbackWithResult onextracallbackwithresult = this.asInterface.get(str);
            if (j != -1 && (onextracallbackwithresult == null || onextracallbackwithresult.asBinder != j)) {
                return null;
            }
            if (onextracallbackwithresult == null) {
                onextracallbackwithresult = new onExtraCallbackWithResult(str);
                this.asInterface.put(str, onextracallbackwithresult);
            } else if (onextracallbackwithresult.IAuthTabCallback != null) {
                return null;
            }
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(onextracallbackwithresult);
            onextracallbackwithresult.IAuthTabCallback = iAuthTabCallback;
            this.onTransact.append((CharSequence) "DIRTY");
            this.onTransact.append(' ');
            this.onTransact.append((CharSequence) str);
            this.onTransact.append('\n');
            IAuthTabCallback(this.onTransact);
            return iAuthTabCallback;
        }
    }

    private void onNavigationEvent(IAuthTabCallback iAuthTabCallback, boolean z) throws IOException {
        synchronized (this) {
            onExtraCallbackWithResult onextracallbackwithresult = iAuthTabCallback.onNavigationEvent;
            if (onextracallbackwithresult.IAuthTabCallback != iAuthTabCallback) {
                throw new IllegalStateException();
            }
            if (z && !onextracallbackwithresult.onTransact) {
                for (int i2 = 0; i2 < this.IAuthTabCallbackStubProxy; i2++) {
                    if (!iAuthTabCallback.onExtraCallbackWithResult[i2]) {
                        iAuthTabCallback.IAuthTabCallback();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!onextracallbackwithresult.IAuthTabCallback(i2).exists()) {
                        iAuthTabCallback.IAuthTabCallback();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.IAuthTabCallbackStubProxy; i3++) {
                File fileIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(i3);
                if (z) {
                    if (fileIAuthTabCallback.exists()) {
                        File fileOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(i3);
                        fileIAuthTabCallback.renameTo(fileOnNavigationEvent);
                        long j = onextracallbackwithresult.asInterface[i3];
                        long length = fileOnNavigationEvent.length();
                        onextracallbackwithresult.asInterface[i3] = length;
                        this.IAuthTabCallback_Parcel = (this.IAuthTabCallback_Parcel - j) + length;
                    }
                } else {
                    onExtraCallback(fileIAuthTabCallback);
                }
            }
            this.access100++;
            onextracallbackwithresult.IAuthTabCallback = null;
            if (onextracallbackwithresult.onTransact | z) {
                onextracallbackwithresult.onTransact = true;
                this.onTransact.append((CharSequence) "CLEAN");
                this.onTransact.append(' ');
                this.onTransact.append((CharSequence) onextracallbackwithresult.onExtraCallback);
                this.onTransact.append((CharSequence) onextracallbackwithresult.onExtraCallback());
                this.onTransact.append('\n');
                if (z) {
                    long j2 = this.access000;
                    this.access000 = 1 + j2;
                    onextracallbackwithresult.asBinder = j2;
                }
            } else {
                this.asInterface.remove(onextracallbackwithresult.onExtraCallback);
                this.onTransact.append((CharSequence) "REMOVE");
                this.onTransact.append(' ');
                this.onTransact.append((CharSequence) onextracallbackwithresult.onExtraCallback);
                this.onTransact.append('\n');
            }
            IAuthTabCallback(this.onTransact);
            if (this.IAuthTabCallback_Parcel > this.IAuthTabCallbackStub || onExtraCallback()) {
                this.onWarmupCompleted.submit(this.IAuthTabCallback);
            }
        }
    }

    private boolean onExtraCallback() {
        int i2;
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult;
        int i5 = i4 + 107;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.access100;
            if (i2 < 5188) {
                return false;
            }
        } else {
            i2 = this.access100;
            if (i2 < 2000) {
                return false;
            }
        }
        int i6 = i4 + 37;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return i2 >= this.asInterface.size();
    }

    public boolean onNavigationEvent(String str) throws IOException {
        synchronized (this) {
            onNavigationEvent();
            onExtraCallbackWithResult onextracallbackwithresult = this.asInterface.get(str);
            if (onextracallbackwithresult != null && onextracallbackwithresult.IAuthTabCallback == null) {
                for (int i2 = 0; i2 < this.IAuthTabCallbackStubProxy; i2++) {
                    File fileOnNavigationEvent = onextracallbackwithresult.onNavigationEvent(i2);
                    if (fileOnNavigationEvent.exists() && !fileOnNavigationEvent.delete()) {
                        throw new IOException("failed to delete " + fileOnNavigationEvent);
                    }
                    this.IAuthTabCallback_Parcel -= onextracallbackwithresult.asInterface[i2];
                    onextracallbackwithresult.asInterface[i2] = 0;
                }
                this.access100++;
                this.onTransact.append((CharSequence) "REMOVE");
                this.onTransact.append(' ');
                this.onTransact.append((CharSequence) str);
                this.onTransact.append('\n');
                this.asInterface.remove(str);
                if (onExtraCallback()) {
                    this.onWarmupCompleted.submit(this.IAuthTabCallback);
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        throw new java.lang.IllegalStateException("cache is closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.onTransact != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.onTransact != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r2 = r2 + 35;
        o.SaversKtExternalSyntheticLambda17.ICustomTabsCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 39;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            if (this.onTransact == null) {
                return;
            }
            Iterator it = new ArrayList(this.asInterface.values()).iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) it.next();
                if (onextracallbackwithresult.IAuthTabCallback != null) {
                    onextracallbackwithresult.IAuthTabCallback.IAuthTabCallback();
                }
            }
            asInterface();
            onWarmupCompleted(this.onTransact);
            this.onTransact = null;
        }
    }

    private void asInterface() throws IOException {
        int i2 = 2 % 2;
        while (this.IAuthTabCallback_Parcel > this.IAuthTabCallbackStub) {
            int i3 = extraCallbackWithResult + 47;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(this.asInterface.entrySet().iterator().next().getKey());
            int i5 = ICustomTabsCallback + 121;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void onExtraCallbackWithResult() throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            close();
            SaversKtExternalSyntheticLambda13.onWarmupCompleted(this.onExtraCallback);
        } else {
            close();
            SaversKtExternalSyntheticLambda13.onWarmupCompleted(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void onWarmupCompleted(Writer writer) throws IOException {
        int i2 = 2 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            int i3 = extraCallbackWithResult + 81;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            writer.close();
            int i5 = ICustomTabsCallback + 45;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
            StrictMode.setThreadPolicy(threadPolicy);
            int i7 = extraCallbackWithResult + 121;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    private static void IAuthTabCallback(Writer writer) throws IOException {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 26) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
            try {
                writer.flush();
                return;
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        int i5 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        writer.flush();
    }

    static /* synthetic */ int onWarmupCompleted(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Integer) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 664165806, iOnWarmupCompleted, new Object[]{saversKtExternalSyntheticLambda17}, -664165803)).intValue();
    }

    static /* synthetic */ int onExtraCallbackWithResult(SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17, int i2) {
        Object[] objArr = {saversKtExternalSyntheticLambda17, Integer.valueOf(i2)};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Integer) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1869642504, iOnWarmupCompleted, objArr, -1869642502)).intValue();
    }

    public static SaversKtExternalSyntheticLambda17 onExtraCallback(File file, int i2, int i3, long j) throws IOException {
        Object[] objArr = {file, Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j)};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (SaversKtExternalSyntheticLambda17) onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -1153994921, iOnWarmupCompleted, objArr, 1153994921);
    }

    private static void onExtraCallback(File file, File file2, boolean z) throws IOException {
        Object[] objArr = {file, file2, Boolean.valueOf(z)};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 1486941700, iOnWarmupCompleted, objArr, -1486941699);
    }

    public final class onNavigationEvent {
        private final long IAuthTabCallback;
        private final String onExtraCallback;
        private final File[] onNavigationEvent;
        private final long[] onWarmupCompleted;

        private onNavigationEvent(String str, long j, File[] fileArr, long[] jArr) {
            this.onExtraCallback = str;
            this.IAuthTabCallback = j;
            this.onNavigationEvent = fileArr;
            this.onWarmupCompleted = jArr;
        }

        public File onNavigationEvent(int i2) {
            return this.onNavigationEvent[i2];
        }
    }

    public final class IAuthTabCallback {
        private boolean IAuthTabCallback;
        private final boolean[] onExtraCallbackWithResult;
        private final onExtraCallbackWithResult onNavigationEvent;

        private IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
            boolean[] zArr;
            this.onNavigationEvent = onextracallbackwithresult;
            if (onextracallbackwithresult.onTransact) {
                zArr = null;
            } else {
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                zArr = new boolean[((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 664165806, iOnWarmupCompleted, new Object[]{SaversKtExternalSyntheticLambda17.this}, -664165803)).intValue()];
            }
            this.onExtraCallbackWithResult = zArr;
        }

        public File IAuthTabCallback(int i2) throws IOException {
            File fileIAuthTabCallback;
            synchronized (SaversKtExternalSyntheticLambda17.this) {
                if (this.onNavigationEvent.IAuthTabCallback != this) {
                    throw new IllegalStateException();
                }
                if (!this.onNavigationEvent.onTransact) {
                    this.onExtraCallbackWithResult[i2] = true;
                }
                fileIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(i2);
                SaversKtExternalSyntheticLambda17.IAuthTabCallback(SaversKtExternalSyntheticLambda17.this).mkdirs();
            }
            return fileIAuthTabCallback;
        }

        public void onExtraCallback() throws IOException {
            SaversKtExternalSyntheticLambda17.onNavigationEvent(SaversKtExternalSyntheticLambda17.this, this, true);
            this.IAuthTabCallback = true;
        }

        public void IAuthTabCallback() throws IOException {
            SaversKtExternalSyntheticLambda17.onNavigationEvent(SaversKtExternalSyntheticLambda17.this, this, false);
        }

        public void onNavigationEvent() {
            if (this.IAuthTabCallback) {
                return;
            }
            try {
                IAuthTabCallback();
            } catch (IOException unused) {
            }
        }
    }

    final class onExtraCallbackWithResult {
        private IAuthTabCallback IAuthTabCallback;
        private long asBinder;
        private final long[] asInterface;
        private final String onExtraCallback;
        File[] onExtraCallbackWithResult;
        File[] onNavigationEvent;
        private boolean onTransact;

        /* JADX WARN: Incorrect condition in loop: B:4:0x00b2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private onExtraCallbackWithResult(String str) {
            this.onExtraCallback = str;
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            this.asInterface = new long[((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, 664165806, iOnWarmupCompleted, new Object[]{SaversKtExternalSyntheticLambda17.this}, -664165803)).intValue()];
            int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted5 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted6 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            this.onNavigationEvent = new File[((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted6, iOnWarmupCompleted5, 664165806, iOnWarmupCompleted4, new Object[]{SaversKtExternalSyntheticLambda17.this}, -664165803)).intValue()];
            int iOnWarmupCompleted7 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted8 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted9 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            this.onExtraCallbackWithResult = new File[((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted9, iOnWarmupCompleted8, 664165806, iOnWarmupCompleted7, new Object[]{SaversKtExternalSyntheticLambda17.this}, -664165803)).intValue()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < ((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted, 664165806, iOnWarmupCompleted, new Object[]{SaversKtExternalSyntheticLambda17.this}, -664165803)).intValue(); i2++) {
                sb.append(i2);
                this.onNavigationEvent[i2] = new File(SaversKtExternalSyntheticLambda17.IAuthTabCallback(SaversKtExternalSyntheticLambda17.this), sb.toString());
                sb.append(".tmp");
                this.onExtraCallbackWithResult[i2] = new File(SaversKtExternalSyntheticLambda17.IAuthTabCallback(SaversKtExternalSyntheticLambda17.this), sb.toString());
                sb.setLength(length);
            }
        }

        public String onExtraCallback() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.asInterface) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onWarmupCompleted(String[] strArr) throws IOException {
            int length = strArr.length;
            Object[] objArr = {SaversKtExternalSyntheticLambda17.this};
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            if (length != ((Integer) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, 664165806, iOnWarmupCompleted, objArr, -664165803)).intValue()) {
                throw onNavigationEvent(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.asInterface[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw onNavigationEvent(strArr);
                }
            }
        }

        private IOException onNavigationEvent(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File onNavigationEvent(int i2) {
            return this.onNavigationEvent[i2];
        }

        public File IAuthTabCallback(int i2) {
            return this.onExtraCallbackWithResult[i2];
        }
    }

    static final class onExtraCallback implements ThreadFactory {
        private onExtraCallback() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }
}
