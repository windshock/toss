package im.toss.rn.toss.core.legacy.bundle.v2;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.payment.ui.autopay.R;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.bundle.cache.RnBundleFileProcessLock;
import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import im.toss.rn.toss.core.common.process.RnRemoteProcessGuardRecorder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.AUTextView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import o.WebSocketFactory;
import o.access8100;
import o.adInfo;
import o.getWrite;
import o.onSignalCollected;
import o.setWrite;
import o.videoFrameChanged;
import o.wie2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleFileManager {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static final wie2 onWarmupCompleted;
    private final onSignalCollected onExtraCallbackWithResult;
    private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 105 - (i * 2);
        int i4 = 5 - (s * 3);
        int i5 = b * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i6;
            int i7 = i4;
            int i8 = 0;
            i3 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i4;
            i4 = bArr[i4];
            i3 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        adInfo adinfo = (adInfo) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(adinfo);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~((~i3) | i2 | i);
        int i11 = i9 | i10;
        int i12 = (~(i3 | i8 | i2)) | i10;
        int i13 = i2 | i;
        int i14 = i2 + i + i6 + ((-1865910757) * i5) + ((-1665280692) * i4);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-906343980)) - 215482368) + ((-906343980) * i) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i6) + ((-1540882432) * i5) + ((-912261120) * i4) + (1566179328 * i15);
        int i17 = (i2 * (-52584228)) + 761582770 + (i * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i6 * (-52583813)) + (i5 * (-195242759)) + (i4 * 1657508740) + (i15 * (-834797568));
        return i16 + ((i17 * i17) * 1251344384) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    @Inject
    public ReactBundleFileManager(@NotNull onSignalCollected onsignalcollected) {
        Intrinsics.checkNotNullParameter(onsignalcollected, "");
        this.onExtraCallbackWithResult = onsignalcollected;
    }

    public final File onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        File fileOnExtraCallback = Companion.onExtraCallback(Companion, this.onExtraCallbackWithResult.onNavigationEvent(str2, str3), str, null, 2, null);
        int i4 = onExtraCallback + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return fileOnExtraCallback;
    }

    public final File onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        File fileIAuthTabCallback = Companion.IAuthTabCallback(Companion, this.onExtraCallbackWithResult.onNavigationEvent(str2, str3), str, ".meta");
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return fileIAuthTabCallback;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.MeasureSpec.makeMeasureSpec(0, 0)), 22 - ExpandableListView.getPackedPositionChild(0L), 10278 - TextUtils.indexOf("", "", 0, 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 12843);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 55;
                        int defaultSize = 2167 - View.getDefaultSize(0, 0);
                        byte b = $$a[0];
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, scrollBarSize, defaultSize, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i9 = $10 + 77;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char cMyTid = (char) (12843 - (Process.myTid() >> 22));
                        int longPressTimeout = 55 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iBlue = Color.blue(0) + 2167;
                        byte b3 = $$a[0];
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, longPressTimeout, iBlue, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i11 = $11 + 119;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onNavigationEvent(ReactBundleFileManager reactBundleFileManager, String str, Map map, int i, Object obj) throws setWrite {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 85;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            map = access8100.onNavigationEvent();
        }
        reactBundleFileManager.onExtraCallbackWithResult(str, map);
        int i8 = onNavigationEvent + 25;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 64 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
    private final void onExtraCallbackWithResult(String str, Map<String, String> map) throws setWrite {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
                RnRemoteProcessGuardRecorder.IAuthTabCallback.onExtraCallbackWithResult(str, map);
                throw new setWrite();
            }
            int i3 = onExtraCallback + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        RnProcessRuntime.onWarmupCompleted.IAuthTabCallback();
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ File IAuthTabCallback(Companion companion, File file, String str, String str2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            File fileOnExtraCallbackWithResult = companion.onExtraCallbackWithResult(file, str, str2);
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return fileOnExtraCallbackWithResult;
            }
            throw null;
        }

        private final String IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strAsInterface = iAuthTabCallback.IAuthTabCallback(Arrays.copyOf(bytes, bytes.length)).onTransact().asInterface();
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return strAsInterface;
        }

        static /* synthetic */ File onExtraCallback(Companion companion, File file, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = "";
            }
            File fileOnExtraCallbackWithResult = companion.onExtraCallbackWithResult(file, str, str2);
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            return fileOnExtraCallbackWithResult;
        }

        private final File onExtraCallbackWithResult(File file, String str, String str2) {
            int i = 2 % 2;
            File file2 = new File(file, IAuthTabCallback(str) + str2);
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return file2;
        }

        public final void IAuthTabCallback(@NotNull File file) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            if (file.exists()) {
                int i2 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                file.delete();
            }
            int i4 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
        }
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        onWarmupCompleted = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = R.onWarmupCompleted();
                int iOnWarmupCompleted2 = R.onWarmupCompleted();
                Unit unit = (Unit) ReactBundleFileManager.onNavigationEvent(new Object[]{(adInfo) obj}, 163143893, -163143892, iOnWarmupCompleted, R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted2);
                int i4 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        }, 1, (Object) null);
        int i = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(false);
            adinfo.IAuthTabCallback(false);
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
            adinfo.onExtraCallbackWithResult(false);
        } else {
            Intrinsics.checkNotNullParameter(adinfo, "");
            adinfo.IAuthTabCallbackDefault(true);
            adinfo.IAuthTabCallback(true);
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 186882589, new Object[]{adinfo, true}, iOnExtraCallback4, iOnExtraCallback3);
            adinfo.onExtraCallbackWithResult(true);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws IOException {
        Object obj;
        Object obj2;
        FileLock fileLock;
        File file;
        boolean z;
        int i;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallback;
        File file2;
        File file3;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallback2;
        ReentrantLock reentrantLock;
        ReactBundleFileManager reactBundleFileManager = (ReactBundleFileManager) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(reactBundleFileManager.onExtraCallbackWithResult.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLockPutIfAbsent == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) == null) {
            reentrantLockPutIfAbsent = reentrantLock;
        }
        ReentrantLock reentrantLock2 = reentrantLockPutIfAbsent;
        reentrantLock2.lock();
        try {
            if (reentrantLock2.getHoldCount() > 1) {
                File fileOnNavigationEvent = reactBundleFileManager.onNavigationEvent(str, str6, str7);
                File fileOnWarmupCompleted = reactBundleFileManager.onWarmupCompleted(str, str6, str7);
                try {
                } catch (IOException e) {
                    e = e;
                    file2 = fileOnWarmupCompleted;
                    file3 = fileOnNavigationEvent;
                }
                if (fileOnNavigationEvent.exists()) {
                    file3 = fileOnNavigationEvent;
                    if (!fileOnWarmupCompleted.exists()) {
                        int i3 = onExtraCallback + 99;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        try {
                            try {
                                tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnWarmupCompleted));
                                try {
                                    tossReactBundleMetaOnExtraCallback2 = TossReactBundleMeta.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                } finally {
                                }
                            } catch (IOException e2) {
                                e = e2;
                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", e.getMessage(), e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("signature", str2), getWrite.IAuthTabCallback("deploymentId", str3), getWrite.IAuthTabCallback("deployedAt", str4), getWrite.IAuthTabCallback("sharedMinDeployedAt", str5), getWrite.IAuthTabCallback("region", str6), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback("bundleFileExists", Boolean.valueOf(file3.exists())), getWrite.IAuthTabCallback("metaFileExists", Boolean.valueOf(file2.exists())), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
                                Companion companion = Companion;
                                companion.IAuthTabCallback(file3);
                                companion.IAuthTabCallback(file2);
                                z = false;
                                i = 2;
                                reentrantLock2.unlock();
                                int i5 = onExtraCallback + 1;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % i;
                                return Boolean.valueOf(z);
                            }
                        } catch (IOException e3) {
                            e = e3;
                            file2 = fileOnWarmupCompleted;
                            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", e.getMessage(), e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("signature", str2), getWrite.IAuthTabCallback("deploymentId", str3), getWrite.IAuthTabCallback("deployedAt", str4), getWrite.IAuthTabCallback("sharedMinDeployedAt", str5), getWrite.IAuthTabCallback("region", str6), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback("bundleFileExists", Boolean.valueOf(file3.exists())), getWrite.IAuthTabCallback("metaFileExists", Boolean.valueOf(file2.exists())), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
                            Companion companion2 = Companion;
                            companion2.IAuthTabCallback(file3);
                            companion2.IAuthTabCallback(file2);
                            z = false;
                            i = 2;
                            reentrantLock2.unlock();
                            int i52 = onExtraCallback + 1;
                            onNavigationEvent = i52 % 128;
                            int i62 = i52 % i;
                            return Boolean.valueOf(z);
                        }
                        if (Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback2.onTransact(), str2)) {
                            int i7 = onNavigationEvent + 49;
                            onExtraCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback2.IAuthTabCallback(), str3);
                                throw null;
                            }
                            if (Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback2.IAuthTabCallback(), str3)) {
                                if (Intrinsics.areEqual((String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallback2}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()), str4) && Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback2.asInterface(), str5)) {
                                    int i8 = onExtraCallback + 21;
                                    onNavigationEvent = i8 % 128;
                                    int i9 = i8 % 2;
                                    z = true;
                                }
                                i = 2;
                            }
                        }
                    }
                    z = false;
                    i = 2;
                } else {
                    z = false;
                    i = 2;
                }
            } else {
                File parentFile = fileOnExtraCallback.getParentFile();
                if (parentFile != null) {
                    obj2 = "region";
                    int i10 = onNavigationEvent + 81;
                    obj = "sharedMinDeployedAt";
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        parentFile.mkdirs();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    parentFile.mkdirs();
                } else {
                    obj = "sharedMinDeployedAt";
                    obj2 = "region";
                }
                FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        File fileOnNavigationEvent2 = reactBundleFileManager.onNavigationEvent(str, str6, str7);
                        try {
                            File fileOnWarmupCompleted2 = reactBundleFileManager.onWarmupCompleted(str, str6, str7);
                            try {
                            } catch (IOException e4) {
                                e = e4;
                                file = fileOnWarmupCompleted2;
                                fileLock = fileLockLock;
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockLock;
                            }
                            try {
                                if (fileOnNavigationEvent2.exists() && fileOnWarmupCompleted2.exists()) {
                                    fileLock = fileLockLock;
                                    try {
                                        try {
                                            try {
                                                tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnWarmupCompleted2));
                                                try {
                                                    tossReactBundleMetaOnExtraCallback = TossReactBundleMeta.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
                                                    CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } catch (IOException e5) {
                                                e = e5;
                                                file = fileOnWarmupCompleted2;
                                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", e.getMessage(), e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("signature", str2), getWrite.IAuthTabCallback("deploymentId", str3), getWrite.IAuthTabCallback("deployedAt", str4), getWrite.IAuthTabCallback(obj, str5), getWrite.IAuthTabCallback(obj2, str6), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback("bundleFileExists", Boolean.valueOf(fileOnNavigationEvent2.exists())), getWrite.IAuthTabCallback("metaFileExists", Boolean.valueOf(file.exists())), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
                                                Companion companion3 = Companion;
                                                companion3.IAuthTabCallback(fileOnNavigationEvent2);
                                                companion3.IAuthTabCallback(file);
                                                z = false;
                                                fileLock.release();
                                                CloseableKt.closeFinally(channel, (Throwable) null);
                                                int i11 = onNavigationEvent + 31;
                                                onExtraCallback = i11 % 128;
                                                i = 2;
                                                int i12 = i11 % 2;
                                                reentrantLock2.unlock();
                                                int i522 = onExtraCallback + 1;
                                                onNavigationEvent = i522 % 128;
                                                int i622 = i522 % i;
                                                return Boolean.valueOf(z);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            channel = channel;
                                            fileLock.release();
                                            throw th;
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", e.getMessage(), e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("signature", str2), getWrite.IAuthTabCallback("deploymentId", str3), getWrite.IAuthTabCallback("deployedAt", str4), getWrite.IAuthTabCallback(obj, str5), getWrite.IAuthTabCallback(obj2, str6), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback("bundleFileExists", Boolean.valueOf(fileOnNavigationEvent2.exists())), getWrite.IAuthTabCallback("metaFileExists", Boolean.valueOf(file.exists())), getWrite.IAuthTabCallback("errorType", e.getClass().getSimpleName())}));
                                        Companion companion32 = Companion;
                                        companion32.IAuthTabCallback(fileOnNavigationEvent2);
                                        companion32.IAuthTabCallback(file);
                                        z = false;
                                        fileLock.release();
                                        CloseableKt.closeFinally(channel, (Throwable) null);
                                        int i112 = onNavigationEvent + 31;
                                        onExtraCallback = i112 % 128;
                                        i = 2;
                                        int i122 = i112 % 2;
                                        reentrantLock2.unlock();
                                        int i5222 = onExtraCallback + 1;
                                        onNavigationEvent = i5222 % 128;
                                        int i6222 = i5222 % i;
                                        return Boolean.valueOf(z);
                                    }
                                    if (Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback.onTransact(), str2) && Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback.IAuthTabCallback(), str3)) {
                                        int i13 = onNavigationEvent + 79;
                                        onExtraCallback = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            Intrinsics.areEqual((String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallback}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()), str4);
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        if (Intrinsics.areEqual((String) TossReactBundleMeta.onWarmupCompleted(new Object[]{tossReactBundleMetaOnExtraCallback}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()), str4) && Intrinsics.areEqual(tossReactBundleMetaOnExtraCallback.asInterface(), str5)) {
                                            z = true;
                                        }
                                        fileLock.release();
                                        CloseableKt.closeFinally(channel, (Throwable) null);
                                        int i1122 = onNavigationEvent + 31;
                                        onExtraCallback = i1122 % 128;
                                        i = 2;
                                        int i1222 = i1122 % 2;
                                    }
                                } else {
                                    fileLock = fileLockLock;
                                }
                                fileLock.release();
                                CloseableKt.closeFinally(channel, (Throwable) null);
                                int i11222 = onNavigationEvent + 31;
                                onExtraCallback = i11222 % 128;
                                i = 2;
                                int i12222 = i11222 % 2;
                            } catch (Throwable th3) {
                                th = th3;
                                channel = channel;
                                Throwable th4 = th;
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    CloseableKt.closeFinally(channel, th4);
                                    throw th5;
                                }
                            }
                            z = false;
                        } catch (Throwable th6) {
                            th = th6;
                            channel = channel;
                            fileLock = fileLockLock;
                            fileLock.release();
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            reentrantLock2.unlock();
            int i52222 = onExtraCallback + 1;
            onNavigationEvent = i52222 % 128;
            int i62222 = i52222 % i;
            return Boolean.valueOf(z);
        } catch (Throwable th9) {
            reentrantLock2.unlock();
            throw th9;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager$Companion] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r4v31, types: [im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleFileManager$Companion] */
    /* JADX WARN: Type inference failed for: r6v43, types: [kotlin.Pair[]] */
    public final String onNavigationEvent(@NotNull String str, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7, @Nullable String str8) throws Throwable {
        String str9;
        FileChannel fileChannel;
        Throwable th;
        File file;
        File file2;
        Object obj;
        ReactBundleFileManager reactBundleFileManager;
        Object obj2;
        FileChannel fileChannel2;
        File file3;
        File file4;
        Object obj3;
        File file5;
        Object obj4;
        ReactBundleFileManager reactBundleFileManager2;
        File file6;
        File file7;
        String absolutePath;
        File file8;
        Object obj5;
        ReactBundleFileManager reactBundleFileManager3;
        File file9;
        File file10;
        File file11;
        File file12;
        String str10;
        File file13;
        ReactBundleFileManager reactBundleFileManager4;
        File file14;
        File file15;
        Object obj6;
        String str11;
        ?? r1;
        ?? r3;
        Object obj7;
        Object obj8;
        int i;
        ?? r25;
        ?? r27;
        ?? r2;
        ?? r11;
        Pair pairIAuthTabCallback;
        File file16;
        Throwable th2;
        Object obj9;
        File file17;
        File file18;
        Object obj10;
        Pair pairIAuthTabCallback2;
        String str12;
        File file19;
        File file20;
        File file21;
        File file22;
        char c;
        File file23;
        boolean z;
        Closeable closeable;
        wie2 wie2Var;
        File file24;
        File file25;
        File file26;
        Object obj11;
        File file27;
        int i2;
        Pair pairIAuthTabCallback3;
        Pair pairIAuthTabCallback4;
        Pair pairIAuthTabCallback5;
        Pair pairIAuthTabCallback6;
        Pair pairIAuthTabCallback7;
        Pair pairIAuthTabCallback8;
        Pair pairIAuthTabCallback9;
        Pair pairIAuthTabCallback10;
        Pair[] pairArr;
        String str13 = str;
        String str14 = str3;
        String str15 = str6;
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 5, 2 - Color.red(0), new char[]{65531, 65532, 4, 6}, false, 145 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str7, "");
        onExtraCallbackWithResult("ReactBundleFileManager.saveBundleFileDirect", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleName", str13), getWrite.IAuthTabCallback("region", str15), getWrite.IAuthTabCallback("company", str7)}));
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLockPutIfAbsent == null) {
            ReentrantLock reentrantLock = new ReentrantLock();
            reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, reentrantLock);
            if (reentrantLockPutIfAbsent != null) {
                int i4 = onNavigationEvent;
                int i5 = i4 + 7;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 23;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                reentrantLockPutIfAbsent = reentrantLock;
            }
        }
        ReentrantLock reentrantLock2 = reentrantLockPutIfAbsent;
        reentrantLock2.lock();
        try {
            String str16 = "from";
            if (reentrantLock2.getHoldCount() > 1) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_save_direct_started", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str13), getWrite.IAuthTabCallback("deploymentId", str14), getWrite.IAuthTabCallback("region", str15), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback(strIntern, "bytes")}), (String) null, false, (String) null, 56, (Object) null);
                File fileOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(str15, str7);
                ?? r112 = Companion;
                File fileIAuthTabCallback = Companion.IAuthTabCallback(r112, fileOnNavigationEvent, str13, ".tmp");
                File fileIAuthTabCallback2 = Companion.IAuthTabCallback(r112, fileOnNavigationEvent, str13, ".meta.tmp");
                File fileOnNavigationEvent2 = onNavigationEvent(str13, str15, str7);
                File fileOnWarmupCompleted = onWarmupCompleted(str13, str15, str7);
                File file28 = fileOnNavigationEvent2;
                try {
                    TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback, false));
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(tTAppOpenAdTransActivity);
                        try {
                            CloseableKt.closeFinally(tTAppOpenAdTransActivity, (Throwable) null);
                            try {
                                CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
                                Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback("from", "ReactBundleFileManager");
                                Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback("bundleName", str13);
                                str16 = "filePath";
                                try {
                                    pairIAuthTabCallback2 = getWrite.IAuthTabCallback(str16, fileIAuthTabCallback.getAbsolutePath());
                                    str12 = "ReactBundleFileManager";
                                } catch (Exception e) {
                                    e = e;
                                    obj6 = "bytes";
                                    str15 = "ReactBundleFileManager";
                                    obj10 = "bundleName";
                                    str11 = strIntern;
                                }
                                try {
                                    try {
                                        Pair pairIAuthTabCallback13 = getWrite.IAuthTabCallback("fileSize", Long.valueOf(fileIAuthTabCallback.length()));
                                        pairIAuthTabCallback = getWrite.IAuthTabCallback("deploymentId", str14);
                                        Pair pairIAuthTabCallback14 = getWrite.IAuthTabCallback(strIntern, "bytes");
                                        obj6 = "bytes";
                                        r3 = 6;
                                        try {
                                            ?? r6 = new Pair[6];
                                            r6[0] = pairIAuthTabCallback11;
                                            r1 = 1;
                                            r6[1] = pairIAuthTabCallback12;
                                            r6[2] = pairIAuthTabCallback2;
                                            r11 = 3;
                                            try {
                                                r6[3] = pairIAuthTabCallback13;
                                                try {
                                                    try {
                                                        r6[4] = pairIAuthTabCallback;
                                                        r6[5] = pairIAuthTabCallback14;
                                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_file_saved_direct", access8100.onWarmupCompleted((Pair[]) r6), (String) null, false, (String) null, 56, (Object) null);
                                                        Closeable closeableOnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback2, false));
                                                        try {
                                                            wie2Var = onWarmupCompleted;
                                                            obj6 = obj6;
                                                            r25 = 3;
                                                            obj7 = "region";
                                                            str11 = strIntern;
                                                            r27 = 4;
                                                            obj8 = "company";
                                                            r1 = fileOnWarmupCompleted;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            closeable = closeableOnExtraCallbackWithResult;
                                                        }
                                                        try {
                                                            TossReactBundleMeta tossReactBundleMeta = new TossReactBundleMeta(str2, str3, str4, str5, j, j, str8);
                                                            wie2Var.onExtraCallback();
                                                            closeableOnExtraCallbackWithResult.onExtraCallback(wie2Var.onWarmupCompleted(TossReactBundleMeta.Companion.serializer(), tossReactBundleMeta));
                                                            try {
                                                                CloseableKt.closeFinally(closeableOnExtraCallbackWithResult, (Throwable) null);
                                                                r112.IAuthTabCallback(file28);
                                                                r112.IAuthTabCallback(r1);
                                                                if (!fileIAuthTabCallback.renameTo(file28)) {
                                                                    throw new IOException("Failed to rename temp bundle to final: " + fileIAuthTabCallback.getPath() + " -> " + file28.getPath());
                                                                }
                                                                int i9 = onNavigationEvent + 123;
                                                                onExtraCallback = i9 % 128;
                                                                int i10 = i9 % 2;
                                                                r2 = fileIAuthTabCallback2;
                                                                try {
                                                                    if (!r2.renameTo(r1)) {
                                                                        file28.renameTo(fileIAuthTabCallback);
                                                                        throw new IOException("Failed to rename temp meta to final: " + r2.getPath() + " -> " + r1.getPath());
                                                                    }
                                                                    str15 = str12;
                                                                    str16 = "from";
                                                                    try {
                                                                        pairIAuthTabCallback3 = getWrite.IAuthTabCallback(str16, str15);
                                                                        strIntern = str;
                                                                        r11 = "bundleName";
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        strIntern = str;
                                                                        file16 = fileIAuthTabCallback;
                                                                        file27 = file28;
                                                                        pairIAuthTabCallback = "deploymentId";
                                                                        r11 = "bundleName";
                                                                    }
                                                                    try {
                                                                        pairIAuthTabCallback4 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                                        file16 = fileIAuthTabCallback;
                                                                        pairIAuthTabCallback = "deploymentId";
                                                                        str14 = str3;
                                                                        try {
                                                                            pairIAuthTabCallback5 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                                            pairIAuthTabCallback6 = getWrite.IAuthTabCallback("bundleSize", Long.valueOf(file28.length()));
                                                                            file27 = file28;
                                                                            try {
                                                                                pairIAuthTabCallback7 = getWrite.IAuthTabCallback(str16, file28.getAbsolutePath());
                                                                                try {
                                                                                    pairIAuthTabCallback8 = getWrite.IAuthTabCallback(obj7, str6);
                                                                                    obj7 = obj7;
                                                                                    try {
                                                                                        pairIAuthTabCallback9 = getWrite.IAuthTabCallback(obj8, str7);
                                                                                        obj8 = obj8;
                                                                                        try {
                                                                                            pairIAuthTabCallback10 = getWrite.IAuthTabCallback(str11, obj6);
                                                                                            obj6 = obj6;
                                                                                        } catch (Exception e3) {
                                                                                            e = e3;
                                                                                            obj6 = obj6;
                                                                                        }
                                                                                    } catch (Exception e4) {
                                                                                        e = e4;
                                                                                        obj8 = obj8;
                                                                                    }
                                                                                } catch (Exception e5) {
                                                                                    e = e5;
                                                                                    obj7 = obj7;
                                                                                }
                                                                            } catch (Exception e6) {
                                                                                e = e6;
                                                                            }
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            file27 = file28;
                                                                        }
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        file16 = fileIAuthTabCallback;
                                                                        file27 = file28;
                                                                        pairIAuthTabCallback = "deploymentId";
                                                                        r11 = r11;
                                                                        i2 = 6;
                                                                        str14 = str3;
                                                                        i = i2;
                                                                        r3 = file27;
                                                                        ?? r4 = Companion;
                                                                        r4.IAuthTabCallback(file16);
                                                                        r4.IAuthTabCallback(r2);
                                                                        r4.IAuthTabCallback(r3);
                                                                        r4.IAuthTabCallback(r1);
                                                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                        Pair pairIAuthTabCallback15 = getWrite.IAuthTabCallback(str16, str15);
                                                                        Pair pairIAuthTabCallback16 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                                        Pair pairIAuthTabCallback17 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                                        Pair pairIAuthTabCallback18 = getWrite.IAuthTabCallback(obj7, str6);
                                                                        Pair pairIAuthTabCallback19 = getWrite.IAuthTabCallback(obj8, str7);
                                                                        Pair pairIAuthTabCallback20 = getWrite.IAuthTabCallback(str11, obj6);
                                                                        Pair[] pairArr2 = new Pair[i];
                                                                        pairArr2[0] = pairIAuthTabCallback15;
                                                                        pairArr2[1] = pairIAuthTabCallback16;
                                                                        pairArr2[2] = pairIAuthTabCallback17;
                                                                        pairArr2[r25] = pairIAuthTabCallback18;
                                                                        pairArr2[r27] = pairIAuthTabCallback19;
                                                                        pairArr2[5] = pairIAuthTabCallback20;
                                                                        convertFloatArrayToByteArray2.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr2));
                                                                        absolutePath = null;
                                                                        return absolutePath;
                                                                    }
                                                                    try {
                                                                        pairArr = new Pair[8];
                                                                        str11 = str11;
                                                                        pairArr[0] = pairIAuthTabCallback3;
                                                                        try {
                                                                            pairArr[1] = pairIAuthTabCallback4;
                                                                            pairArr[2] = pairIAuthTabCallback5;
                                                                            pairArr[3] = pairIAuthTabCallback6;
                                                                            pairArr[4] = pairIAuthTabCallback7;
                                                                            pairArr[5] = pairIAuthTabCallback8;
                                                                            i2 = 6;
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            i2 = 6;
                                                                        }
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        str11 = str11;
                                                                        i2 = 6;
                                                                        i = i2;
                                                                        r3 = file27;
                                                                        ?? r42 = Companion;
                                                                        r42.IAuthTabCallback(file16);
                                                                        r42.IAuthTabCallback(r2);
                                                                        r42.IAuthTabCallback(r3);
                                                                        r42.IAuthTabCallback(r1);
                                                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray22 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                        Pair pairIAuthTabCallback152 = getWrite.IAuthTabCallback(str16, str15);
                                                                        Pair pairIAuthTabCallback162 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                                        Pair pairIAuthTabCallback172 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                                        Pair pairIAuthTabCallback182 = getWrite.IAuthTabCallback(obj7, str6);
                                                                        Pair pairIAuthTabCallback192 = getWrite.IAuthTabCallback(obj8, str7);
                                                                        Pair pairIAuthTabCallback202 = getWrite.IAuthTabCallback(str11, obj6);
                                                                        Pair[] pairArr22 = new Pair[i];
                                                                        pairArr22[0] = pairIAuthTabCallback152;
                                                                        pairArr22[1] = pairIAuthTabCallback162;
                                                                        pairArr22[2] = pairIAuthTabCallback172;
                                                                        pairArr22[r25] = pairIAuthTabCallback182;
                                                                        pairArr22[r27] = pairIAuthTabCallback192;
                                                                        pairArr22[5] = pairIAuthTabCallback202;
                                                                        convertFloatArrayToByteArray22.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr22));
                                                                        absolutePath = null;
                                                                        return absolutePath;
                                                                    }
                                                                    try {
                                                                        pairArr[6] = pairIAuthTabCallback9;
                                                                        pairArr[7] = pairIAuthTabCallback10;
                                                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "react_native_debug", "bundle_saved_direct_completed", access8100.onWarmupCompleted(pairArr), (String) null, false, (String) null, 56, (Object) null);
                                                                        absolutePath = file27.getAbsolutePath();
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        i = i2;
                                                                        r3 = file27;
                                                                        ?? r422 = Companion;
                                                                        r422.IAuthTabCallback(file16);
                                                                        r422.IAuthTabCallback(r2);
                                                                        r422.IAuthTabCallback(r3);
                                                                        r422.IAuthTabCallback(r1);
                                                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                        Pair pairIAuthTabCallback1522 = getWrite.IAuthTabCallback(str16, str15);
                                                                        Pair pairIAuthTabCallback1622 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                                        Pair pairIAuthTabCallback1722 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                                        Pair pairIAuthTabCallback1822 = getWrite.IAuthTabCallback(obj7, str6);
                                                                        Pair pairIAuthTabCallback1922 = getWrite.IAuthTabCallback(obj8, str7);
                                                                        Pair pairIAuthTabCallback2022 = getWrite.IAuthTabCallback(str11, obj6);
                                                                        Pair[] pairArr222 = new Pair[i];
                                                                        pairArr222[0] = pairIAuthTabCallback1522;
                                                                        pairArr222[1] = pairIAuthTabCallback1622;
                                                                        pairArr222[2] = pairIAuthTabCallback1722;
                                                                        pairArr222[r25] = pairIAuthTabCallback1822;
                                                                        pairArr222[r27] = pairIAuthTabCallback1922;
                                                                        pairArr222[5] = pairIAuthTabCallback2022;
                                                                        convertFloatArrayToByteArray222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr222));
                                                                        absolutePath = null;
                                                                        return absolutePath;
                                                                    }
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    strIntern = str;
                                                                    file24 = fileIAuthTabCallback;
                                                                    file25 = file28;
                                                                    str15 = str12;
                                                                    pairIAuthTabCallback = "deploymentId";
                                                                    obj11 = "bundleName";
                                                                    str16 = "from";
                                                                    file26 = r2;
                                                                    str14 = str3;
                                                                    r1 = r1;
                                                                    r2 = file26;
                                                                    r3 = file25;
                                                                    file16 = file24;
                                                                    r11 = obj11;
                                                                    r25 = r25;
                                                                    r27 = r27;
                                                                    i = 6;
                                                                    ?? r4222 = Companion;
                                                                    r4222.IAuthTabCallback(file16);
                                                                    r4222.IAuthTabCallback(r2);
                                                                    r4222.IAuthTabCallback(r3);
                                                                    r4222.IAuthTabCallback(r1);
                                                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                                    Pair pairIAuthTabCallback15222 = getWrite.IAuthTabCallback(str16, str15);
                                                                    Pair pairIAuthTabCallback16222 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                                    Pair pairIAuthTabCallback17222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                                    Pair pairIAuthTabCallback18222 = getWrite.IAuthTabCallback(obj7, str6);
                                                                    Pair pairIAuthTabCallback19222 = getWrite.IAuthTabCallback(obj8, str7);
                                                                    Pair pairIAuthTabCallback20222 = getWrite.IAuthTabCallback(str11, obj6);
                                                                    Pair[] pairArr2222 = new Pair[i];
                                                                    pairArr2222[0] = pairIAuthTabCallback15222;
                                                                    pairArr2222[1] = pairIAuthTabCallback16222;
                                                                    pairArr2222[2] = pairIAuthTabCallback17222;
                                                                    pairArr2222[r25] = pairIAuthTabCallback18222;
                                                                    pairArr2222[r27] = pairIAuthTabCallback19222;
                                                                    pairArr2222[5] = pairIAuthTabCallback20222;
                                                                    convertFloatArrayToByteArray2222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr2222));
                                                                    absolutePath = null;
                                                                    return absolutePath;
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                strIntern = str;
                                                                file24 = fileIAuthTabCallback;
                                                                file25 = file28;
                                                                str15 = str12;
                                                                file26 = fileIAuthTabCallback2;
                                                                pairIAuthTabCallback = "deploymentId";
                                                                obj11 = "bundleName";
                                                                str16 = "from";
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            closeable = closeableOnExtraCallbackWithResult;
                                                            Throwable th5 = th;
                                                            try {
                                                                throw th5;
                                                            } catch (Throwable th6) {
                                                                CloseableKt.closeFinally(closeable, th5);
                                                                throw th6;
                                                            }
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        file20 = fileIAuthTabCallback;
                                                        str11 = strIntern;
                                                        str15 = str12;
                                                        pairIAuthTabCallback = "deploymentId";
                                                        file21 = file28;
                                                        obj7 = "region";
                                                        obj8 = "company";
                                                        file22 = fileOnWarmupCompleted;
                                                        str16 = "from";
                                                        strIntern = str13;
                                                        file23 = fileIAuthTabCallback2;
                                                        z = 3;
                                                        c = 4;
                                                        r11 = "bundleName";
                                                        r1 = file22;
                                                        r2 = file23;
                                                        r3 = file21;
                                                        file16 = file20;
                                                        r25 = z;
                                                        r27 = c;
                                                        i = 6;
                                                        ?? r42222 = Companion;
                                                        r42222.IAuthTabCallback(file16);
                                                        r42222.IAuthTabCallback(r2);
                                                        r42222.IAuthTabCallback(r3);
                                                        r42222.IAuthTabCallback(r1);
                                                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                                        Pair pairIAuthTabCallback152222 = getWrite.IAuthTabCallback(str16, str15);
                                                        Pair pairIAuthTabCallback162222 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                                        Pair pairIAuthTabCallback172222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                                        Pair pairIAuthTabCallback182222 = getWrite.IAuthTabCallback(obj7, str6);
                                                        Pair pairIAuthTabCallback192222 = getWrite.IAuthTabCallback(obj8, str7);
                                                        Pair pairIAuthTabCallback202222 = getWrite.IAuthTabCallback(str11, obj6);
                                                        Pair[] pairArr22222 = new Pair[i];
                                                        pairArr22222[0] = pairIAuthTabCallback152222;
                                                        pairArr22222[1] = pairIAuthTabCallback162222;
                                                        pairArr22222[2] = pairIAuthTabCallback172222;
                                                        pairArr22222[r25] = pairIAuthTabCallback182222;
                                                        pairArr22222[r27] = pairIAuthTabCallback192222;
                                                        pairArr22222[5] = pairIAuthTabCallback202222;
                                                        convertFloatArrayToByteArray22222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr22222));
                                                        absolutePath = null;
                                                        return absolutePath;
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    r2 = str13;
                                                    file16 = r6;
                                                    r25 = str12;
                                                    r27 = file28;
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                file20 = fileIAuthTabCallback;
                                                str11 = strIntern;
                                                str15 = str12;
                                                pairIAuthTabCallback = "deploymentId";
                                                file21 = file28;
                                                obj7 = "region";
                                                obj8 = "company";
                                                file22 = fileOnWarmupCompleted;
                                                str16 = "from";
                                                c = 4;
                                                strIntern = str13;
                                                file23 = fileIAuthTabCallback2;
                                                z = 3;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            file19 = fileIAuthTabCallback;
                                            str11 = strIntern;
                                            str15 = str12;
                                            pairIAuthTabCallback = "deploymentId";
                                            r3 = file28;
                                            obj7 = "region";
                                            obj8 = "company";
                                            r1 = fileOnWarmupCompleted;
                                            str16 = "from";
                                            r11 = "bundleName";
                                            r25 = 3;
                                            r27 = 4;
                                            strIntern = str13;
                                            r2 = fileIAuthTabCallback2;
                                            file16 = file19;
                                            i = 6;
                                            ?? r422222 = Companion;
                                            r422222.IAuthTabCallback(file16);
                                            r422222.IAuthTabCallback(r2);
                                            r422222.IAuthTabCallback(r3);
                                            r422222.IAuthTabCallback(r1);
                                            ConvertFloatArrayToByteArray convertFloatArrayToByteArray222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                            Pair pairIAuthTabCallback1522222 = getWrite.IAuthTabCallback(str16, str15);
                                            Pair pairIAuthTabCallback1622222 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                            Pair pairIAuthTabCallback1722222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                            Pair pairIAuthTabCallback1822222 = getWrite.IAuthTabCallback(obj7, str6);
                                            Pair pairIAuthTabCallback1922222 = getWrite.IAuthTabCallback(obj8, str7);
                                            Pair pairIAuthTabCallback2022222 = getWrite.IAuthTabCallback(str11, obj6);
                                            Pair[] pairArr222222 = new Pair[i];
                                            pairArr222222[0] = pairIAuthTabCallback1522222;
                                            pairArr222222[1] = pairIAuthTabCallback1622222;
                                            pairArr222222[2] = pairIAuthTabCallback1722222;
                                            pairArr222222[r25] = pairIAuthTabCallback1822222;
                                            pairArr222222[r27] = pairIAuthTabCallback1922222;
                                            pairArr222222[5] = pairIAuthTabCallback2022222;
                                            convertFloatArrayToByteArray222222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr222222));
                                            absolutePath = null;
                                            return absolutePath;
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        obj6 = "bytes";
                                        pairIAuthTabCallback = "deploymentId";
                                        file19 = fileIAuthTabCallback;
                                        str11 = strIntern;
                                        str15 = str12;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    obj6 = "bytes";
                                    obj10 = "bundleName";
                                    str11 = strIntern;
                                    str15 = str12;
                                    file17 = file28;
                                    obj7 = "region";
                                    obj8 = "company";
                                    file18 = fileOnWarmupCompleted;
                                    str16 = "from";
                                    obj9 = obj10;
                                    r25 = 3;
                                    r27 = 4;
                                    strIntern = str13;
                                    pairIAuthTabCallback = "deploymentId";
                                    r2 = fileIAuthTabCallback2;
                                    file16 = fileIAuthTabCallback;
                                    r1 = file18;
                                    r3 = file17;
                                    r11 = obj9;
                                    i = 6;
                                    ?? r4222222 = Companion;
                                    r4222222.IAuthTabCallback(file16);
                                    r4222222.IAuthTabCallback(r2);
                                    r4222222.IAuthTabCallback(r3);
                                    r4222222.IAuthTabCallback(r1);
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback15222222 = getWrite.IAuthTabCallback(str16, str15);
                                    Pair pairIAuthTabCallback16222222 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                    Pair pairIAuthTabCallback17222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                    Pair pairIAuthTabCallback18222222 = getWrite.IAuthTabCallback(obj7, str6);
                                    Pair pairIAuthTabCallback19222222 = getWrite.IAuthTabCallback(obj8, str7);
                                    Pair pairIAuthTabCallback20222222 = getWrite.IAuthTabCallback(str11, obj6);
                                    Pair[] pairArr2222222 = new Pair[i];
                                    pairArr2222222[0] = pairIAuthTabCallback15222222;
                                    pairArr2222222[1] = pairIAuthTabCallback16222222;
                                    pairArr2222222[2] = pairIAuthTabCallback17222222;
                                    pairArr2222222[r25] = pairIAuthTabCallback18222222;
                                    pairArr2222222[r27] = pairIAuthTabCallback19222222;
                                    pairArr2222222[5] = pairIAuthTabCallback20222222;
                                    convertFloatArrayToByteArray2222222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr2222222));
                                    absolutePath = null;
                                    return absolutePath;
                                }
                            } catch (Exception e20) {
                                e = e20;
                                obj6 = "bytes";
                                str15 = "ReactBundleFileManager";
                                obj9 = "bundleName";
                                str11 = strIntern;
                                file17 = file28;
                                obj7 = "region";
                                obj8 = "company";
                                file18 = fileOnWarmupCompleted;
                            }
                        } catch (Throwable th7) {
                            obj6 = "bytes";
                            str15 = "ReactBundleFileManager";
                            r11 = "bundleName";
                            str11 = strIntern;
                            r3 = file28;
                            obj7 = "region";
                            obj8 = "company";
                            r1 = fileOnWarmupCompleted;
                            r25 = 3;
                            r27 = 4;
                            strIntern = str13;
                            pairIAuthTabCallback = "deploymentId";
                            r2 = fileIAuthTabCallback2;
                            file16 = fileIAuthTabCallback;
                            th2 = th7;
                            i = 6;
                            int i11 = onNavigationEvent + 41;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                throw th2;
                            } catch (Throwable th8) {
                                try {
                                    CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, th2);
                                    throw th8;
                                } catch (Exception e21) {
                                    e = e21;
                                    ?? r42222222 = Companion;
                                    r42222222.IAuthTabCallback(file16);
                                    r42222222.IAuthTabCallback(r2);
                                    r42222222.IAuthTabCallback(r3);
                                    r42222222.IAuthTabCallback(r1);
                                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray22222222 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                                    Pair pairIAuthTabCallback152222222 = getWrite.IAuthTabCallback(str16, str15);
                                    Pair pairIAuthTabCallback162222222 = getWrite.IAuthTabCallback((Object) r11, strIntern);
                                    Pair pairIAuthTabCallback172222222 = getWrite.IAuthTabCallback(pairIAuthTabCallback, str14);
                                    Pair pairIAuthTabCallback182222222 = getWrite.IAuthTabCallback(obj7, str6);
                                    Pair pairIAuthTabCallback192222222 = getWrite.IAuthTabCallback(obj8, str7);
                                    Pair pairIAuthTabCallback202222222 = getWrite.IAuthTabCallback(str11, obj6);
                                    Pair[] pairArr22222222 = new Pair[i];
                                    pairArr22222222[0] = pairIAuthTabCallback152222222;
                                    pairArr22222222[1] = pairIAuthTabCallback162222222;
                                    pairArr22222222[2] = pairIAuthTabCallback172222222;
                                    pairArr22222222[r25] = pairIAuthTabCallback182222222;
                                    pairArr22222222[r27] = pairIAuthTabCallback192222222;
                                    pairArr22222222[5] = pairIAuthTabCallback202222222;
                                    convertFloatArrayToByteArray22222222.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(pairArr22222222));
                                    absolutePath = null;
                                    return absolutePath;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        obj6 = "bytes";
                        str15 = "ReactBundleFileManager";
                        str11 = strIntern;
                        r3 = file28;
                        obj7 = "region";
                        obj8 = "company";
                        r25 = 3;
                        r27 = 4;
                        strIntern = str13;
                        r2 = fileIAuthTabCallback2;
                        r1 = fileOnWarmupCompleted;
                        r11 = "bundleName";
                        pairIAuthTabCallback = "deploymentId";
                        file16 = fileIAuthTabCallback;
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            i = 6;
                            try {
                                CloseableKt.closeFinally(tTAppOpenAdTransActivity, th9);
                                throw th10;
                            } catch (Throwable th11) {
                                th2 = th11;
                                int i112 = onNavigationEvent + 41;
                                onExtraCallback = i112 % 128;
                                int i122 = i112 % 2;
                                throw th2;
                            }
                        }
                    }
                } catch (Exception e22) {
                    e = e22;
                    obj6 = "bytes";
                    str15 = "ReactBundleFileManager";
                    str11 = strIntern;
                    r1 = fileOnWarmupCompleted;
                    r3 = file28;
                    obj7 = "region";
                    obj8 = "company";
                    i = 6;
                    r25 = 3;
                    r27 = 4;
                    strIntern = str13;
                    r2 = fileIAuthTabCallback2;
                    r11 = "bundleName";
                    pairIAuthTabCallback = "deploymentId";
                    file16 = fileIAuthTabCallback;
                }
            } else {
                String str17 = str15;
                ?? r14 = "ReactBundleFileManager";
                String str18 = str13;
                ?? r15 = "bytes";
                String str19 = "deploymentId";
                File parentFile = fileOnExtraCallback.getParentFile();
                if (parentFile != null) {
                    str9 = " -> ";
                    int i13 = onExtraCallback + 49;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 == 0) {
                        parentFile.mkdirs();
                        int i14 = 80 / 0;
                    } else {
                        parentFile.mkdirs();
                    }
                } else {
                    str9 = " -> ";
                }
                FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        Object obj12 = "region";
                        try {
                            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "react_native_debug", "bundle_save_direct_started", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", (Object) r14), getWrite.IAuthTabCallback("bundleName", str18), getWrite.IAuthTabCallback(str19, str14), getWrite.IAuthTabCallback("region", str17), getWrite.IAuthTabCallback("company", str7), getWrite.IAuthTabCallback(strIntern, (Object) r15)}), (String) null, false, (String) null, 56, (Object) null);
                            ReactBundleFileManager reactBundleFileManager5 = this;
                            File fileOnNavigationEvent3 = reactBundleFileManager5.onExtraCallbackWithResult.onNavigationEvent(str17, str7);
                            Companion companion = Companion;
                            File fileIAuthTabCallback3 = Companion.IAuthTabCallback(companion, fileOnNavigationEvent3, str18, ".tmp");
                            Object obj13 = "company";
                            File fileIAuthTabCallback4 = Companion.IAuthTabCallback(companion, fileOnNavigationEvent3, str18, ".meta.tmp");
                            File fileOnNavigationEvent4 = reactBundleFileManager5.onNavigationEvent(str18, str17, str7);
                            File fileOnWarmupCompleted2 = reactBundleFileManager5.onWarmupCompleted(str18, str17, str7);
                            try {
                                try {
                                    try {
                                        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult2 = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback3, false));
                                        try {
                                            try {
                                                tTAppOpenAdActivity9OnExtraCallbackWithResult2.onExtraCallbackWithResult(tTAppOpenAdTransActivity);
                                                try {
                                                    CloseableKt.closeFinally(tTAppOpenAdTransActivity, (Throwable) null);
                                                    try {
                                                        CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult2, (Throwable) null);
                                                    } catch (Exception e23) {
                                                        e = e23;
                                                        str14 = strIntern;
                                                        file8 = fileIAuthTabCallback3;
                                                        obj5 = "from";
                                                        reactBundleFileManager3 = r14;
                                                        obj2 = r15;
                                                        file9 = fileOnNavigationEvent4;
                                                        file10 = fileOnWarmupCompleted2;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                try {
                                                    throw th13;
                                                } catch (Throwable th14) {
                                                    try {
                                                        CloseableKt.closeFinally(tTAppOpenAdTransActivity, th13);
                                                        throw th14;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        throw th;
                                                    }
                                                }
                                            }
                                        } catch (Exception e24) {
                                            e = e24;
                                            file7 = str17;
                                            file6 = fileOnWarmupCompleted2;
                                            reactBundleFileManager2 = reactBundleFileManager5;
                                            obj4 = fileIAuthTabCallback3;
                                            obj3 = fileIAuthTabCallback4;
                                            file4 = r14;
                                            file5 = r15;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        fileChannel = channel;
                                        try {
                                            fileLockLock.release();
                                            throw th;
                                        } catch (Throwable th17) {
                                            th = th17;
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (Throwable th18) {
                                                CloseableKt.closeFinally(fileChannel, th);
                                                throw th18;
                                            }
                                        }
                                    }
                                } catch (Exception e25) {
                                    e = e25;
                                    str14 = strIntern;
                                    file = fileOnWarmupCompleted2;
                                    file2 = fileIAuthTabCallback3;
                                    obj = "from";
                                    reactBundleFileManager = r14;
                                    obj2 = r15;
                                    fileChannel2 = channel;
                                    file3 = fileOnNavigationEvent4;
                                }
                                try {
                                    try {
                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "react_native_debug", "bundle_file_saved_direct", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", (Object) r14), getWrite.IAuthTabCallback("bundleName", str18), getWrite.IAuthTabCallback("filePath", fileIAuthTabCallback3.getAbsolutePath()), getWrite.IAuthTabCallback("fileSize", Long.valueOf(fileIAuthTabCallback3.length())), getWrite.IAuthTabCallback(str19, str14), getWrite.IAuthTabCallback(strIntern, (Object) r15)}), (String) null, false, (String) null, 56, (Object) null);
                                        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult3 = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback4, false));
                                        try {
                                            wie2 wie2Var2 = onWarmupCompleted;
                                            obj2 = r15;
                                            file11 = fileOnNavigationEvent4;
                                            file12 = fileOnWarmupCompleted2;
                                            fileChannel2 = channel;
                                            str10 = str9;
                                            file13 = fileIAuthTabCallback4;
                                            try {
                                                TossReactBundleMeta tossReactBundleMeta2 = new TossReactBundleMeta(str2, str3, str4, str5, j, j, str8);
                                                wie2Var2.onExtraCallback();
                                                tTAppOpenAdActivity9OnExtraCallbackWithResult3.onExtraCallback(wie2Var2.onWarmupCompleted(TossReactBundleMeta.Companion.serializer(), tossReactBundleMeta2));
                                                try {
                                                    CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult3, (Throwable) null);
                                                    companion.IAuthTabCallback(file11);
                                                    companion.IAuthTabCallback(file12);
                                                    file15 = fileIAuthTabCallback3;
                                                } catch (Exception e26) {
                                                    e = e26;
                                                    str19 = str;
                                                    reactBundleFileManager4 = r14;
                                                    obj12 = obj12;
                                                    str14 = strIntern;
                                                    file14 = fileIAuthTabCallback3;
                                                }
                                                try {
                                                } catch (Exception e27) {
                                                    e = e27;
                                                    str19 = str;
                                                    reactBundleFileManager4 = r14;
                                                    obj12 = obj12;
                                                    str14 = strIntern;
                                                    file14 = file15;
                                                    str18 = str19;
                                                    obj13 = obj13;
                                                    obj3 = "bundleName";
                                                    obj4 = "from";
                                                    file7 = file12;
                                                    file6 = file14;
                                                    reactBundleFileManager2 = reactBundleFileManager4;
                                                    file4 = file13;
                                                    file5 = file11;
                                                    Companion companion2 = Companion;
                                                    companion2.IAuthTabCallback(file6);
                                                    companion2.IAuthTabCallback(file4);
                                                    companion2.IAuthTabCallback(file5);
                                                    companion2.IAuthTabCallback(file7);
                                                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj4, reactBundleFileManager2), getWrite.IAuthTabCallback(obj3, str19), getWrite.IAuthTabCallback(str18, str3), getWrite.IAuthTabCallback(obj12, str6), getWrite.IAuthTabCallback(obj13, str7), getWrite.IAuthTabCallback(str14, obj2)}));
                                                    absolutePath = null;
                                                    try {
                                                        fileLockLock.release();
                                                        CloseableKt.closeFinally(fileChannel2, (Throwable) null);
                                                        return absolutePath;
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        fileChannel = fileChannel2;
                                                        th = th;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                        }
                                    } catch (Exception e28) {
                                        e = e28;
                                        str19 = str18;
                                        obj4 = "from";
                                        reactBundleFileManager2 = r14;
                                        obj2 = r15;
                                        file5 = fileOnNavigationEvent4;
                                        file7 = fileOnWarmupCompleted2;
                                        file6 = fileIAuthTabCallback3;
                                        fileChannel2 = channel;
                                        str18 = str19;
                                        str14 = strIntern;
                                        file4 = fileIAuthTabCallback4;
                                        obj3 = "bundleName";
                                    }
                                } catch (Exception e29) {
                                    e = e29;
                                    str14 = strIntern;
                                    obj5 = "from";
                                    reactBundleFileManager3 = r14;
                                    obj2 = r15;
                                    file9 = fileOnNavigationEvent4;
                                    file10 = fileOnWarmupCompleted2;
                                    file8 = fileIAuthTabCallback3;
                                    fileChannel2 = channel;
                                    file = file10;
                                    file2 = file8;
                                    reactBundleFileManager = reactBundleFileManager3;
                                    obj = obj5;
                                    file3 = file9;
                                    file4 = fileIAuthTabCallback4;
                                    obj3 = "bundleName";
                                    str18 = str19;
                                    str19 = str18;
                                    file7 = file;
                                    file6 = file2;
                                    reactBundleFileManager2 = reactBundleFileManager;
                                    obj4 = obj;
                                    file5 = file3;
                                    Companion companion22 = Companion;
                                    companion22.IAuthTabCallback(file6);
                                    companion22.IAuthTabCallback(file4);
                                    companion22.IAuthTabCallback(file5);
                                    companion22.IAuthTabCallback(file7);
                                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj4, reactBundleFileManager2), getWrite.IAuthTabCallback(obj3, str19), getWrite.IAuthTabCallback(str18, str3), getWrite.IAuthTabCallback(obj12, str6), getWrite.IAuthTabCallback(obj13, str7), getWrite.IAuthTabCallback(str14, obj2)}));
                                    absolutePath = null;
                                    fileLockLock.release();
                                    CloseableKt.closeFinally(fileChannel2, (Throwable) null);
                                    return absolutePath;
                                }
                                if (!file15.renameTo(file11)) {
                                    throw new IOException("Failed to rename temp bundle to final: " + file15.getPath() + str10 + file11.getPath());
                                }
                                if (!file13.renameTo(file12)) {
                                    file11.renameTo(file15);
                                    throw new IOException("Failed to rename temp meta to final: " + file13.getPath() + str10 + file12.getPath());
                                }
                                ReactBundleFileManager reactBundleFileManager6 = r14;
                                Object obj14 = "from";
                                try {
                                    Pair pairIAuthTabCallback21 = getWrite.IAuthTabCallback(obj14, reactBundleFileManager6);
                                    str19 = str;
                                    Object obj15 = "bundleName";
                                    try {
                                        Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback(obj15, str19);
                                        str18 = str19;
                                        try {
                                            Pair pairIAuthTabCallback23 = getWrite.IAuthTabCallback(str18, str3);
                                            Pair pairIAuthTabCallback24 = getWrite.IAuthTabCallback("bundleSize", Long.valueOf(file11.length()));
                                            Pair pairIAuthTabCallback25 = getWrite.IAuthTabCallback("filePath", file11.getAbsolutePath());
                                            try {
                                                Pair pairIAuthTabCallback26 = getWrite.IAuthTabCallback(obj12, str6);
                                                obj12 = obj12;
                                                try {
                                                    Pair pairIAuthTabCallback27 = getWrite.IAuthTabCallback(obj13, str7);
                                                    obj13 = obj13;
                                                    str14 = strIntern;
                                                    try {
                                                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, "react_native_debug", "bundle_saved_direct_completed", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback21, pairIAuthTabCallback22, pairIAuthTabCallback23, pairIAuthTabCallback24, pairIAuthTabCallback25, pairIAuthTabCallback26, pairIAuthTabCallback27, getWrite.IAuthTabCallback(str14, obj2)}), (String) null, false, (String) null, 56, (Object) null);
                                                        absolutePath = file11.getAbsolutePath();
                                                    } catch (Exception e30) {
                                                        e = e30;
                                                        obj2 = obj2;
                                                        file7 = file12;
                                                        file6 = file15;
                                                        reactBundleFileManager2 = reactBundleFileManager6;
                                                        obj4 = obj14;
                                                        obj3 = obj15;
                                                        file4 = file13;
                                                        file5 = file11;
                                                        Companion companion222 = Companion;
                                                        companion222.IAuthTabCallback(file6);
                                                        companion222.IAuthTabCallback(file4);
                                                        companion222.IAuthTabCallback(file5);
                                                        companion222.IAuthTabCallback(file7);
                                                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj4, reactBundleFileManager2), getWrite.IAuthTabCallback(obj3, str19), getWrite.IAuthTabCallback(str18, str3), getWrite.IAuthTabCallback(obj12, str6), getWrite.IAuthTabCallback(obj13, str7), getWrite.IAuthTabCallback(str14, obj2)}));
                                                        absolutePath = null;
                                                        fileLockLock.release();
                                                        CloseableKt.closeFinally(fileChannel2, (Throwable) null);
                                                        return absolutePath;
                                                    }
                                                } catch (Exception e31) {
                                                    e = e31;
                                                    obj13 = obj13;
                                                    str14 = strIntern;
                                                    file7 = file12;
                                                    file6 = file15;
                                                    reactBundleFileManager2 = reactBundleFileManager6;
                                                    obj4 = obj14;
                                                    obj3 = obj15;
                                                    file4 = file13;
                                                    file5 = file11;
                                                }
                                            } catch (Exception e32) {
                                                e = e32;
                                                obj12 = obj12;
                                                str14 = strIntern;
                                                obj13 = obj13;
                                                file7 = file12;
                                                file6 = file15;
                                                reactBundleFileManager2 = reactBundleFileManager6;
                                                obj4 = obj14;
                                                obj3 = obj15;
                                                file4 = file13;
                                                file5 = file11;
                                                Companion companion2222 = Companion;
                                                companion2222.IAuthTabCallback(file6);
                                                companion2222.IAuthTabCallback(file4);
                                                companion2222.IAuthTabCallback(file5);
                                                companion2222.IAuthTabCallback(file7);
                                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_save_direct_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj4, reactBundleFileManager2), getWrite.IAuthTabCallback(obj3, str19), getWrite.IAuthTabCallback(str18, str3), getWrite.IAuthTabCallback(obj12, str6), getWrite.IAuthTabCallback(obj13, str7), getWrite.IAuthTabCallback(str14, obj2)}));
                                                absolutePath = null;
                                                fileLockLock.release();
                                                CloseableKt.closeFinally(fileChannel2, (Throwable) null);
                                                return absolutePath;
                                            }
                                        } catch (Exception e33) {
                                            e = e33;
                                            obj12 = obj12;
                                        }
                                    } catch (Exception e34) {
                                        e = e34;
                                        obj12 = obj12;
                                        str14 = strIntern;
                                        str18 = str19;
                                    }
                                } catch (Exception e35) {
                                    e = e35;
                                    str19 = str;
                                    obj12 = obj12;
                                    str14 = strIntern;
                                    str18 = str19;
                                    obj13 = obj13;
                                    obj3 = "bundleName";
                                    file7 = file12;
                                    file6 = file15;
                                    reactBundleFileManager2 = reactBundleFileManager6;
                                    obj4 = obj14;
                                    file4 = file13;
                                    file5 = file11;
                                }
                                fileLockLock.release();
                                CloseableKt.closeFinally(fileChannel2, (Throwable) null);
                            } catch (Throwable th22) {
                                th = th22;
                            }
                        } catch (Throwable th23) {
                            th = th23;
                            fileChannel = channel;
                        }
                    } catch (Throwable th24) {
                        th = th24;
                        fileChannel = channel;
                    }
                } catch (Throwable th25) {
                    th = th25;
                    fileChannel = channel;
                }
            }
            return absolutePath;
        } finally {
            reentrantLock2.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final void onExtraCallbackWithResult(@NotNull String str, long j, @NotNull String str2, @NotNull String str3) throws Throwable {
        ReentrantLock reentrantLock;
        FileLock fileLock;
        String str4;
        FileLock fileLock2;
        TTHistoryActivity42 tTHistoryActivity42OnWarmupCompleted;
        TossReactBundleMeta.Companion companion;
        TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult;
        ReentrantLock reentrantLockPutIfAbsent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onExtraCallbackWithResult("ReactBundleFileManager.updateBundleMeta", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str2), getWrite.IAuthTabCallback("company", str3)}));
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLock2 = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLock2 == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock2 = new ReentrantLock()))) != null) {
            reentrantLock2 = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock3 = reentrantLock2;
        reentrantLock3.lock();
        try {
            reentrantLock = reentrantLock3;
            File file = fileOnExtraCallback;
            try {
                if (reentrantLock3.getHoldCount() > 1) {
                    int i2 = onNavigationEvent + 5;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    File fileOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(str2, str3);
                    File fileOnWarmupCompleted = onWarmupCompleted(str, str2, str3);
                    File fileIAuthTabCallback = Companion.IAuthTabCallback(Companion, fileOnNavigationEvent, str, ".meta.tmp");
                    try {
                        try {
                            TTHistoryActivity42 tTHistoryActivity42OnWarmupCompleted2 = TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnWarmupCompleted);
                            try {
                                TossReactBundleMeta.Companion companion2 = TossReactBundleMeta.Companion;
                                TossReactBundleMeta tossReactBundleMetaOnExtraCallbackWithResult2 = companion2.onExtraCallbackWithResult(tTHistoryActivity42OnWarmupCompleted2);
                                CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted2, (Throwable) null);
                                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "Update bundle meta", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j)), getWrite.IAuthTabCallback("oldUpdatedAt", String.valueOf(tossReactBundleMetaOnExtraCallbackWithResult2.IAuthTabCallbackStubProxy()))}), (String) null, false, (String) null, 56, (Object) null);
                                TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback, false));
                                try {
                                    wie2 wie2Var = onWarmupCompleted;
                                    TossReactBundleMeta tossReactBundleMetaIAuthTabCallback = TossReactBundleMeta.IAuthTabCallback(tossReactBundleMetaOnExtraCallbackWithResult2, (String) null, (String) null, (String) null, (String) null, 0L, j, (String) null, 95, (Object) null);
                                    wie2Var.onExtraCallback();
                                    tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallback(wie2Var.onWarmupCompleted(companion2.serializer(), tossReactBundleMetaIAuthTabCallback));
                                    CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult, (Throwable) null);
                                    fileIAuthTabCallback.renameTo(fileOnWarmupCompleted);
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Exception e) {
                            e = e;
                            Companion.IAuthTabCallback(fileIAuthTabCallback);
                            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_meta_update_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j))}));
                            Unit unit = Unit.INSTANCE;
                            int i4 = onNavigationEvent + 27;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            reentrantLock.unlock();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Companion.IAuthTabCallback(fileIAuthTabCallback);
                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "bundle_meta_update_failed", e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j))}));
                        Unit unit2 = Unit.INSTANCE;
                        int i42 = onNavigationEvent + 27;
                        onExtraCallback = i42 % 128;
                        int i52 = i42 % 2;
                        reentrantLock.unlock();
                    }
                } else {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    ?? channel = new RandomAccessFile(file, "rw").getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            try {
                                File fileOnNavigationEvent2 = this.onExtraCallbackWithResult.onNavigationEvent(str2, str3);
                                File fileOnWarmupCompleted2 = onWarmupCompleted(str, str2, str3);
                                File fileIAuthTabCallback2 = Companion.IAuthTabCallback(Companion, fileOnNavigationEvent2, str, ".meta.tmp");
                                try {
                                    try {
                                        tTHistoryActivity42OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(fileOnWarmupCompleted2);
                                        try {
                                            companion = TossReactBundleMeta.Companion;
                                            tossReactBundleMetaOnExtraCallbackWithResult = companion.onExtraCallbackWithResult(tTHistoryActivity42OnWarmupCompleted);
                                            file = channel;
                                        } finally {
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        Companion.IAuthTabCallback(fileIAuthTabCallback2);
                                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", str4, e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j))}));
                                        Unit unit3 = Unit.INSTANCE;
                                        fileLock2.release();
                                        CloseableKt.closeFinally(file, (Throwable) null);
                                        reentrantLock.unlock();
                                    }
                                    try {
                                        CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted, (Throwable) null);
                                        fileLock2 = fileLockLock;
                                        try {
                                            str4 = "bundle_meta_update_failed";
                                            try {
                                                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "Update bundle meta", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j)), getWrite.IAuthTabCallback("oldUpdatedAt", String.valueOf(tossReactBundleMetaOnExtraCallbackWithResult.IAuthTabCallbackStubProxy()))}), (String) null, false, (String) null, 56, (Object) null);
                                                TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult2 = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(TTCeilingLandingPageActivity5.onWarmupCompleted(fileIAuthTabCallback2, false));
                                                try {
                                                    wie2 wie2Var2 = onWarmupCompleted;
                                                    TossReactBundleMeta tossReactBundleMetaIAuthTabCallback2 = TossReactBundleMeta.IAuthTabCallback(tossReactBundleMetaOnExtraCallbackWithResult, (String) null, (String) null, (String) null, (String) null, 0L, j, (String) null, 95, (Object) null);
                                                    wie2Var2.onExtraCallback();
                                                    tTAppOpenAdActivity9OnExtraCallbackWithResult2.onExtraCallback(wie2Var2.onWarmupCompleted(companion.serializer(), tossReactBundleMetaIAuthTabCallback2));
                                                    CloseableKt.closeFinally(tTAppOpenAdActivity9OnExtraCallbackWithResult2, (Throwable) null);
                                                    fileIAuthTabCallback2.renameTo(fileOnWarmupCompleted2);
                                                    int i6 = onNavigationEvent + 43;
                                                    onExtraCallback = i6 % 128;
                                                    int i7 = i6 % 2;
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                Companion.IAuthTabCallback(fileIAuthTabCallback2);
                                                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", str4, e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j))}));
                                                Unit unit32 = Unit.INSTANCE;
                                                fileLock2.release();
                                                CloseableKt.closeFinally(file, (Throwable) null);
                                                reentrantLock.unlock();
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            str4 = "bundle_meta_update_failed";
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        str4 = "bundle_meta_update_failed";
                                        fileLock2 = fileLockLock;
                                        Companion.IAuthTabCallback(fileIAuthTabCallback2);
                                        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", str4, e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactBundleFileManager"), getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("company", str3), getWrite.IAuthTabCallback("updatedAt", String.valueOf(j))}));
                                        Unit unit322 = Unit.INSTANCE;
                                        fileLock2.release();
                                        CloseableKt.closeFinally(file, (Throwable) null);
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        th = th;
                                        fileLock = fileLockLock;
                                        channel = file;
                                        fileLock.release();
                                        throw th;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    file = channel;
                                } catch (Throwable th2) {
                                    th = th2;
                                    file = channel;
                                }
                                try {
                                    fileLock2.release();
                                    CloseableKt.closeFinally(file, (Throwable) null);
                                } catch (Throwable th3) {
                                    th = th3;
                                    channel = file;
                                    Throwable th4 = th;
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        CloseableKt.closeFinally((Closeable) channel, th4);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            fileLock = fileLockLock;
                            channel = channel;
                            fileLock.release();
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th9) {
                th = th9;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            reentrantLock = reentrantLock3;
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3) throws IOException, setWrite {
        ReentrantLock reentrantLockPutIfAbsent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onExtraCallbackWithResult("ReactBundleFileManager.invalidateBundle", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("bundleName", str), getWrite.IAuthTabCallback("region", str2), getWrite.IAuthTabCallback("company", str3)}));
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
            reentrantLock = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            Object obj = null;
            if (reentrantLock2.getHoldCount() > 1) {
                int i4 = onNavigationEvent + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    Companion companion = Companion;
                    companion.IAuthTabCallback(onNavigationEvent(str, str2, str3));
                    companion.IAuthTabCallback(onWarmupCompleted(str, str2, str3));
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                Companion companion2 = Companion;
                companion2.IAuthTabCallback(onNavigationEvent(str, str2, str3));
                companion2.IAuthTabCallback(onWarmupCompleted(str, str2, str3));
                Unit unit2 = Unit.INSTANCE;
                reentrantLock2.unlock();
                obj.hashCode();
                throw null;
            }
            File parentFile = fileOnExtraCallback.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                int i5 = onNavigationEvent + 87;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 3;
                }
            }
            FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
            try {
                FileLock fileLockLock = channel.lock();
                try {
                    Companion companion3 = Companion;
                    companion3.IAuthTabCallback(onNavigationEvent(str, str2, str3));
                    companion3.IAuthTabCallback(onWarmupCompleted(str, str2, str3));
                    Unit unit3 = Unit.INSTANCE;
                    CloseableKt.closeFinally(channel, (Throwable) null);
                } finally {
                    fileLockLock.release();
                }
            } finally {
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    public final void onExtraCallbackWithResult() throws IOException, setWrite {
        ReentrantLock reentrantLockPutIfAbsent;
        int i = 2 % 2;
        Object obj = null;
        onNavigationEvent(this, "ReactBundleFileManager.clearCaches", null, 2, null);
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(this.onExtraCallbackWithResult.onWarmupCompleted());
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            reentrantLock = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            if (reentrantLock2.getHoldCount() > 1) {
                FilesKt.deleteRecursively(this.onExtraCallbackWithResult.onWarmupCompleted());
                return;
            }
            File parentFile = fileOnExtraCallback.getParentFile();
            if (parentFile != null) {
                int i3 = onNavigationEvent + 121;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    parentFile.mkdirs();
                    throw null;
                }
                parentFile.mkdirs();
            }
            FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
            try {
                FileLock fileLockLock = channel.lock();
                try {
                    FilesKt.deleteRecursively(this.onExtraCallbackWithResult.onWarmupCompleted());
                    CloseableKt.closeFinally(channel, (Throwable) null);
                } finally {
                    fileLockLock.release();
                }
            } finally {
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(adInfo adinfo) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return (Unit) onNavigationEvent(new Object[]{adinfo}, 163143893, -163143892, iOnWarmupCompleted, R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Object[] objArr = {this, str, str2, str3, str4, str5, str6, str7};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(objArr, -1587490076, 1587490076, iOnWarmupCompleted, R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted2)).booleanValue();
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 478308865;
    }
}
