package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.payment.ui.autopay.R;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.bundle.cache.RnBundleFileProcessLock;
import im.toss.rn.toss.core.bundle.model.BundleMetadata;
import im.toss.rn.toss.core.remoteprocess.PreparedRnBundleSnapshot;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.MaxFullscreenAdImpl;
import o.WebSocketFactory;
import o.adInfo;
import o.onInterstitialAdLoaded;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInterstitialAdLoaded {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int[] onExtraCallbackWithResult = null;
    private static final wie2 onNavigationEvent;
    private static int onTransact = 1;
    private static final Regex onWarmupCompleted;
    private final Context IAuthTabCallback;
    private final File onExtraCallback;

    public static /* synthetic */ CharSequence onExtraCallback(byte b) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(b);
            throw null;
        }
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(b);
        int i3 = IAuthTabCallbackDefault + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i6)) | i8 | (~(i3 | i6));
        int i10 = (~(i7 | (~i6))) | i8;
        int i11 = (~(i6 | i5)) | (~((~i3) | i5));
        int i12 = i5 + i3 + i2 + (929125522 * i4) + (1849324972 * i);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i5) + 1146290176 + ((-1462591364) * i3) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i2) + ((-291241984) * i4) + (1012400128 * i) + ((-1810169856) * i13);
        int i15 = ((i5 * (-2058557531)) - 518432259) + (i3 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i2 * (-2058558961)) + (i4 * 548722830) + (i * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        return i16 != 1 ? i16 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i4 = IAuthTabCallbackDefault + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public onInterstitialAdLoaded(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        this.IAuthTabCallback = applicationContext;
        this.onExtraCallback = new File(applicationContext.getCacheDir(), "rn_remote_process_snapshots");
    }

    public final PreparedRnBundleSnapshot onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback(str);
        int iOnWarmupCompleted = R.onWarmupCompleted();
        File file = new File((File) onExtraCallback(new Object[]{this, str}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, iOnWarmupCompleted), "snapshot.json");
        wie2 wie2Var = onNavigationEvent;
        String text$default = FilesKt.readText$default(file, (Charset) null, 1, (Object) null);
        wie2Var.onExtraCallback();
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) wie2Var.onExtraCallback(PreparedRnBundleSnapshot.Companion.serializer(), text$default);
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        onExtraCallback(new Object[]{this, str, preparedRnBundleSnapshot}, R.onWarmupCompleted(), R.onWarmupCompleted(), 798115453, R.onWarmupCompleted(), -798115451, iOnWarmupCompleted2);
        int i2 = IAuthTabCallbackDefault + 61;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return preparedRnBundleSnapshot;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int iOnWarmupCompleted = R.onWarmupCompleted();
        FilesKt.deleteRecursively((File) onExtraCallback(new Object[]{this, str}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, iOnWarmupCompleted));
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(File file, PreparedRnBundleSnapshot preparedRnBundleSnapshot) {
        int i = 2 % 2;
        File file2 = new File(file, "snapshot.json.tmp");
        File file3 = new File(file, "snapshot.json");
        wie2 wie2Var = onNavigationEvent;
        wie2Var.onExtraCallback();
        FilesKt.writeText$default(file2, wie2Var.onWarmupCompleted(PreparedRnBundleSnapshot.Companion.serializer(), preparedRnBundleSnapshot), (Charset) null, 2, (Object) null);
        if (!file2.renameTo(file3)) {
            file2.delete();
            throw new IllegalStateException("Failed to activate RN remote process snapshot: " + file3.getPath());
        }
        int i2 = asBinder + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 java.io.File) = (r1v4 java.io.File), (r1v23 java.io.File) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final File onExtraCallbackWithResult(String str, File file) throws IOException {
        File parentFile;
        FileOutputStream fileOutputStream;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            parentFile = file.getParentFile();
            int i3 = 76 / 0;
            if (parentFile != null) {
                parentFile.mkdirs();
                int i4 = asBinder + 123;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            parentFile = file.getParentFile();
            if (parentFile != null) {
            }
        }
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        file2.delete();
        if (StringsKt.startsWith$default(str, "assets://", false, 2, (Object) null)) {
            InputStream inputStreamOpen = this.IAuthTabCallback.getAssets().open(StringsKt.removePrefix(str, "assets://"));
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics.checkNotNull(inputStreamOpen);
                    ByteStreamsKt.copyTo$default(inputStreamOpen, fileOutputStream, 0, 2, (Object) null);
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                } finally {
                }
            } finally {
            }
        } else {
            File file3 = new File(str);
            if (!file3.exists()) {
                throw new IllegalArgumentException(("Bundle file does not exist: " + str).toString());
            }
            if (!file3.isFile()) {
                throw new IllegalArgumentException(("Bundle source is not a regular file: " + str).toString());
            }
            FileInputStream fileInputStream = new FileInputStream(file3);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, fileOutputStream, 0, 2, (Object) null);
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                    int i6 = asBinder + 37;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 % 5;
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
            }
        }
        if (file2.length() <= 0) {
            throw new IllegalArgumentException(("Bundle snapshot is empty: " + str).toString());
        }
        int i8 = asBinder + 67;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            file.delete();
            file2.renameTo(file);
            throw null;
        }
        file.delete();
        if (file2.renameTo(file)) {
            return file;
        }
        file2.delete();
        throw new IllegalStateException("Failed to activate RN remote process bundle snapshot: " + file.getPath());
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), View.resolveSize(0, 0) + 72, 8848 - TextUtils.getTrimmedLength(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 41;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $10 + 85;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', i5) + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72, 8847 - MotionEvent.axisFromString(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 73, 8847 - ExpandableListView.getPackedPositionChild(0L), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                int i13 = $11 + 37;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 22252), ExpandableListView.getPackedPositionType(0L) + 39, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i11 += 31;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getEdgeSlop() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 39, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i11++;
                }
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 78 - ExpandableListView.getPackedPositionGroup(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i17 = $10 + 31;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void onExtraCallback(String str, MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (StringsKt.startsWith$default(str, "assets://", false, 2, (Object) null)) {
                return;
            }
        } else if (StringsKt.startsWith$default(str, "assets://", false, 2, (Object) null)) {
            return;
        }
        File file = new File(str + ".meta");
        if (!file.isFile()) {
            throw new IllegalArgumentException(("Bundle meta file does not exist: " + file.getPath()).toString());
        }
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(file));
        try {
            BundleMetadata bundleMetadataOnExtraCallback = BundleMetadata.Companion.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
            CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
            if (!Intrinsics.areEqual(bundleMetadataOnExtraCallback.IAuthTabCallbackStub(), onextracallbackwithresult.onExtraCallbackWithResult().onTransact())) {
                throw new IllegalArgumentException(("Bundle signature changed before snapshot: " + str).toString());
            }
            int i3 = asBinder + 93;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(bundleMetadataOnExtraCallback.onNavigationEvent(), onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback())) {
                throw new IllegalArgumentException(("Bundle deploymentId changed before snapshot: " + str).toString());
            }
            int i5 = IAuthTabCallbackDefault + 17;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            if (!Intrinsics.areEqual((String) BundleMetadata.onExtraCallback(2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -2147204812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{bundleMetadataOnExtraCallback}), (String) TossReactBundleMeta.onWarmupCompleted(new Object[]{onextracallbackwithresult.onExtraCallbackWithResult()}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback()))) {
                throw new IllegalArgumentException(("Bundle deployedAt changed before snapshot: " + str).toString());
            }
            int i7 = IAuthTabCallbackDefault + 13;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.areEqual(bundleMetadataOnExtraCallback.onTransact(), onextracallbackwithresult.onExtraCallbackWithResult().asInterface());
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(bundleMetadataOnExtraCallback.onTransact(), onextracallbackwithresult.onExtraCallbackWithResult().asInterface())) {
                return;
            }
            throw new IllegalArgumentException(("Bundle sharedMinDeployedAt changed before snapshot: " + str).toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, th);
                throw th2;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        onInterstitialAdLoaded oninterstitialadloaded = (onInterstitialAdLoaded) objArr[0];
        String str = (String) objArr[1];
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) objArr[2];
        int i = 2 % 2;
        if (preparedRnBundleSnapshot.asInterface() != 1) {
            throw new IllegalArgumentException(("Unsupported RN remote process snapshot schema: " + preparedRnBundleSnapshot.asInterface()).toString());
        }
        int i2 = asBinder + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(preparedRnBundleSnapshot.onExtraCallback(), str)) {
            throw new IllegalArgumentException("RN remote process snapshot id mismatch");
        }
        File canonicalFile = ((File) onExtraCallback(new Object[]{oninterstitialadloaded, str}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, R.onWarmupCompleted())).getCanonicalFile();
        Intrinsics.checkNotNull(canonicalFile);
        File fileOnExtraCallback = oninterstitialadloaded.onExtraCallback(canonicalFile, preparedRnBundleSnapshot.IAuthTabCallbackDefault());
        File fileOnExtraCallback2 = oninterstitialadloaded.onExtraCallback(canonicalFile, preparedRnBundleSnapshot.IAuthTabCallback_Parcel());
        if (fileOnExtraCallback.length() != ((Long) PreparedRnBundleSnapshot.IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -762314512, setVisitUrl.onExtraCallbackWithResult(), new Object[]{preparedRnBundleSnapshot}, setVisitUrl.onExtraCallbackWithResult(), 762314512)).longValue()) {
            throw new IllegalArgumentException("RN remote process service bundle size mismatch");
        }
        if (fileOnExtraCallback2.length() != preparedRnBundleSnapshot.readTypedObject()) {
            throw new IllegalArgumentException("RN remote process shared bundle size mismatch");
        }
        int i4 = asBinder + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if (!Intrinsics.areEqual(oninterstitialadloaded.onExtraCallback(fileOnExtraCallback), preparedRnBundleSnapshot.IAuthTabCallbackStub())) {
            throw new IllegalArgumentException("RN remote process service bundle hash mismatch");
        }
        int i6 = asBinder + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        if (!Intrinsics.areEqual(oninterstitialadloaded.onExtraCallback(fileOnExtraCallback2), preparedRnBundleSnapshot.extraCallback())) {
            throw new IllegalArgumentException("RN remote process shared bundle hash mismatch");
        }
        oninterstitialadloaded.onExtraCallback(fileOnExtraCallback, preparedRnBundleSnapshot.IAuthTabCallbackStubProxy().onTransact(), (String) PreparedRnBundleSnapshot.IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1908734453, setVisitUrl.onExtraCallbackWithResult(), new Object[]{preparedRnBundleSnapshot}, setVisitUrl.onExtraCallbackWithResult(), 1908734456), preparedRnBundleSnapshot.onNavigationEvent(), "service");
        String strOnTransact = ((TossReactBundleMeta) PreparedRnBundleSnapshot.IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1663581814, setVisitUrl.onExtraCallbackWithResult(), new Object[]{preparedRnBundleSnapshot}, setVisitUrl.onExtraCallbackWithResult(), -1663581812)).onTransact();
        String str2 = (String) PreparedRnBundleSnapshot.IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1908734453, setVisitUrl.onExtraCallbackWithResult(), new Object[]{preparedRnBundleSnapshot}, setVisitUrl.onExtraCallbackWithResult(), 1908734456);
        String strOnNavigationEvent = preparedRnBundleSnapshot.onNavigationEvent();
        Object[] objArr2 = new Object[1];
        a(new int[]{143676647, 201963790, 633819909, -1173118761}, KeyEvent.getDeadChar(0, 0) + 6, objArr2);
        oninterstitialadloaded.onExtraCallback(fileOnExtraCallback2, strOnTransact, str2, strOnNavigationEvent, ((String) objArr2[0]).intern());
        int i8 = asBinder + 57;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 88 / 0;
        }
        return null;
    }

    private final void onExtraCallback(File file, String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKeyOnExtraCallback = hExternalSyntheticLambda7.IAuthTabCallback.onExtraCallback(str2, str3);
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(TTCeilingLandingPageActivity5.onWarmupCompleted(file));
        try {
            boolean zIAuthTabCallback = dbExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(tTAppOpenAdTransActivityOnExtraCallback, str, publicKeyOnExtraCallback);
            CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
            if (zIAuthTabCallback) {
                int i4 = IAuthTabCallbackDefault + 1;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            } else {
                throw new IllegalArgumentException(("RN remote process " + str4 + " bundle signature verification failed").toString());
            }
        } finally {
        }
    }

    private final File onExtraCallback(File file, String str) throws IOException {
        int i = 2 % 2;
        File canonicalFile = new File(str).getCanonicalFile();
        String path = canonicalFile.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        if (!StringsKt.startsWith$default(path, file.getPath() + File.separator, false, 2, (Object) null)) {
            throw new IllegalArgumentException(("RN remote process bundle path escapes snapshot directory: " + str).toString());
        }
        if (!canonicalFile.isFile()) {
            throw new IllegalArgumentException(("RN remote process bundle is not a regular file: " + str).toString());
        }
        int i2 = asBinder + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (canonicalFile.length() <= 0) {
            throw new IllegalArgumentException(("RN remote process bundle is empty: " + str).toString());
        }
        Intrinsics.checkNotNull(canonicalFile);
        int i4 = asBinder + 53;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return canonicalFile;
        }
        throw null;
    }

    private final void IAuthTabCallback(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(UUID.fromString(str));
            int i2 = IAuthTabCallbackDefault + 39;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 5;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            throw new IllegalArgumentException("Invalid RN remote process snapshot id: " + str, th2);
        }
        int i4 = asBinder + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final String onExtraCallback(File file) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            int i2 = IAuthTabCallbackDefault + 91;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                int i4 = fileInputStream.read(bArr);
                if (i4 < 0) {
                    break;
                }
                int i5 = asBinder + 89;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                messageDigest.update(bArr, 0, i4);
            }
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            CloseableKt.closeFinally(fileInputStream, (Throwable) null);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            String strJoinToString$default = ArraysKt.joinToString$default(bArrDigest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.rn.toss.core.remoteprocess.PreparedRnBundleSnapshotStore$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 105;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    CharSequence charSequenceOnExtraCallback = onInterstitialAdLoaded.onExtraCallback(((Byte) obj2).byteValue());
                    if (i9 != 0) {
                        int i10 = 4 / 0;
                    }
                    int i11 = IAuthTabCallback + 93;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        return charSequenceOnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, 30, (Object) null);
            int i7 = IAuthTabCallbackDefault + 99;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                return strJoinToString$default;
            }
            obj.hashCode();
            throw null;
        } finally {
        }
    }

    private static final CharSequence onNavigationEvent(byte b) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i4 = IAuthTabCallbackDefault + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[PHI: r5
      0x0050: PHI (r5v5 java.io.File) = (r5v4 java.io.File), (r5v6 java.io.File) binds: [B:12:0x004e, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        File file;
        onInterstitialAdLoaded oninterstitialadloaded = (onInterstitialAdLoaded) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = oninterstitialadloaded.onExtraCallback.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        int i4 = asBinder + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int length = fileArrListFiles.length;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = IAuthTabCallbackDefault + 121;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                file = fileArrListFiles[i6];
                if (jCurrentTimeMillis % file.lastModified() > 604800000) {
                    Intrinsics.checkNotNull(file);
                    FilesKt.deleteRecursively(file);
                }
            } else {
                file = fileArrListFiles[i6];
                if (jCurrentTimeMillis - file.lastModified() > 604800000) {
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onInterstitialAdLoaded oninterstitialadloaded = (onInterstitialAdLoaded) objArr[0];
        int i = 2 % 2;
        File file = new File(oninterstitialadloaded.onExtraCallback, (String) objArr[1]);
        int i2 = asBinder + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return file;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onExtraCallbackWithResult(String str) {
        String strReplace;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            strReplace = onWarmupCompleted.replace(StringsKt.substringAfterLast$default(str, 'V', (String) null, 4, (Object) null), "_");
            if (StringsKt.isBlank(strReplace)) {
                int i3 = asBinder + 9;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                strReplace = "bundle";
            }
        } else {
            strReplace = onWarmupCompleted.replace(StringsKt.substringAfterLast$default(str, '/', (String) null, 2, (Object) null), "_");
            if (StringsKt.isBlank(strReplace)) {
            }
        }
        return strReplace + ".hbc";
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        onWarmupCompleted = new Regex("[^A-Za-z0-9._-]");
        onNavigationEvent = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.rn.toss.core.remoteprocess.PreparedRnBundleSnapshotStore$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = onInterstitialAdLoaded.onWarmupCompleted((adInfo) obj);
                int i4 = onWarmupCompleted + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, 1, (Object) null);
        int i = IAuthTabCallbackStub + 57;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        adinfo.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 41;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final PreparedRnBundleSnapshot onWarmupCompleted(@NotNull MaxFullscreenAdImplExternalSyntheticLambda6 maxFullscreenAdImplExternalSyntheticLambda6, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull File file) throws IOException {
        Throwable th;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult;
        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2;
        ReentrantLock reentrantLockPutIfAbsent;
        ?? r2 = 2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(maxFullscreenAdImplExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(file, "");
        RnBundleFileProcessLock rnBundleFileProcessLock = RnBundleFileProcessLock.onExtraCallbackWithResult;
        File fileOnExtraCallback = rnBundleFileProcessLock.onExtraCallback(file);
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMapOnExtraCallback = rnBundleFileProcessLock.onExtraCallback();
        String canonicalPath = fileOnExtraCallback.getCanonicalPath();
        ReentrantLock reentrantLock = concurrentHashMapOnExtraCallback.get(canonicalPath);
        if (reentrantLock == null && (reentrantLockPutIfAbsent = concurrentHashMapOnExtraCallback.putIfAbsent(canonicalPath, (reentrantLock = new ReentrantLock()))) != null) {
            reentrantLock = reentrantLockPutIfAbsent;
        }
        ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            if (reentrantLock2.getHoldCount() > 1) {
                onExtraCallback(new Object[]{this}, R.onWarmupCompleted(), R.onWarmupCompleted(), -927002196, R.onWarmupCompleted(), 927002196, R.onWarmupCompleted());
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                File file2 = (File) onExtraCallback(new Object[]{this, string}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, R.onWarmupCompleted());
                file2.mkdirs();
                MaxFullscreenAdImpl maxFullscreenAdImplIAuthTabCallbackStub = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStub();
                MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult3 = maxFullscreenAdImplIAuthTabCallbackStub instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult ? (MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImplIAuthTabCallbackStub : null;
                if (onextracallbackwithresult3 == null) {
                    throw new IllegalStateException("Service bundle state is not prepared");
                }
                MaxFullscreenAdImpl maxFullscreenAdImplOnWarmupCompleted = maxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted();
                MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult4 = true ^ (maxFullscreenAdImplOnWarmupCompleted instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) ? null : (MaxFullscreenAdImpl.onExtraCallbackWithResult) maxFullscreenAdImplOnWarmupCompleted;
                if (onextracallbackwithresult4 == null) {
                    throw new IllegalStateException("Shared bundle state is not prepared");
                }
                String strAsBinder = maxFullscreenAdImplExternalSyntheticLambda6.asBinder();
                String strOnExtraCallback = maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback();
                if (strOnExtraCallback == null) {
                    int i4 = asBinder + 123;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        onextracallbackwithresult4.onWarmupCompleted();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    strOnExtraCallback = onextracallbackwithresult4.onWarmupCompleted();
                }
                onExtraCallback(strAsBinder, onextracallbackwithresult3);
                onExtraCallback(strOnExtraCallback, onextracallbackwithresult4);
                String strAsInterface = maxFullscreenAdImplExternalSyntheticLambda6.asInterface();
                String strIAuthTabCallback = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback();
                File file3 = new File(file2, onExtraCallbackWithResult(strAsInterface));
                File file4 = new File(file2, "shared.hbc");
                if (Intrinsics.areEqual(file3.getName(), file4.getName())) {
                    throw new IllegalArgumentException(("Service bundle file name collides with shared bundle: " + strAsInterface).toString());
                }
                onExtraCallbackWithResult(strAsBinder, file3);
                onExtraCallbackWithResult(strOnExtraCallback, file4);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String absolutePath = file3.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                String absolutePath2 = file4.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
                PreparedRnBundleSnapshot preparedRnBundleSnapshot = new PreparedRnBundleSnapshot(0, string, jCurrentTimeMillis, str, str2, str3, str4, strAsInterface, strIAuthTabCallback, absolutePath, absolutePath2, file3.length(), file4.length(), onExtraCallback(file3), onExtraCallback(file4), maxFullscreenAdImplExternalSyntheticLambda6.onTransact(), maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(), onextracallbackwithresult3.onExtraCallbackWithResult(), onextracallbackwithresult4.onExtraCallbackWithResult(), onextracallbackwithresult3.onNavigationEvent(), onextracallbackwithresult4.onNavigationEvent(), 1, (DefaultConstructorMarker) null);
                onExtraCallbackWithResult(file2, preparedRnBundleSnapshot);
                reentrantLock2.unlock();
                return preparedRnBundleSnapshot;
            }
            File parentFile = fileOnExtraCallback.getParentFile();
            if (parentFile != null) {
                int i5 = IAuthTabCallbackDefault + 69;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                parentFile.mkdirs();
            }
            FileChannel channel = new RandomAccessFile(fileOnExtraCallback, "rw").getChannel();
            try {
                FileLock fileLockLock = channel.lock();
                try {
                    onExtraCallback(new Object[]{this}, R.onWarmupCompleted(), R.onWarmupCompleted(), -927002196, R.onWarmupCompleted(), 927002196, R.onWarmupCompleted());
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    File file5 = (File) onExtraCallback(new Object[]{this, string2}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, R.onWarmupCompleted());
                    file5.mkdirs();
                    MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallbackStub();
                    if (onextracallbackwithresultIAuthTabCallbackStub instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
                        int i7 = IAuthTabCallbackDefault + 57;
                        asBinder = i7 % 128;
                        if (i7 % 2 == 0) {
                            MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresultIAuthTabCallbackStub;
                            throw null;
                        }
                        onextracallbackwithresult = onextracallbackwithresultIAuthTabCallbackStub;
                    } else {
                        onextracallbackwithresult = null;
                    }
                    try {
                        if (onextracallbackwithresult == null) {
                            throw new IllegalStateException("Service bundle state is not prepared");
                        }
                        MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = maxFullscreenAdImplExternalSyntheticLambda6.onWarmupCompleted();
                        if (onextracallbackwithresultOnWarmupCompleted instanceof MaxFullscreenAdImpl.onExtraCallbackWithResult) {
                            int i8 = IAuthTabCallbackDefault + 11;
                            asBinder = i8 % 128;
                            if (i8 % 2 == 0) {
                                MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresultOnWarmupCompleted;
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
                        } else {
                            onextracallbackwithresult2 = null;
                        }
                        if (onextracallbackwithresult2 == null) {
                            throw new IllegalStateException("Shared bundle state is not prepared");
                        }
                        int i9 = IAuthTabCallbackDefault + 103;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        String strAsBinder2 = maxFullscreenAdImplExternalSyntheticLambda6.asBinder();
                        String strOnExtraCallback2 = maxFullscreenAdImplExternalSyntheticLambda6.onExtraCallback();
                        if (strOnExtraCallback2 == null) {
                            strOnExtraCallback2 = onextracallbackwithresult2.onWarmupCompleted();
                        }
                        onExtraCallback(strAsBinder2, onextracallbackwithresult);
                        onExtraCallback(strOnExtraCallback2, onextracallbackwithresult2);
                        String strAsInterface2 = maxFullscreenAdImplExternalSyntheticLambda6.asInterface();
                        String strIAuthTabCallback2 = maxFullscreenAdImplExternalSyntheticLambda6.IAuthTabCallback();
                        File file6 = new File(file5, onExtraCallbackWithResult(strAsInterface2));
                        File file7 = new File(file5, "shared.hbc");
                        if (Intrinsics.areEqual(file6.getName(), file7.getName())) {
                            throw new IllegalArgumentException(("Service bundle file name collides with shared bundle: " + strAsInterface2).toString());
                        }
                        onExtraCallbackWithResult(strAsBinder2, file6);
                        onExtraCallbackWithResult(strOnExtraCallback2, file7);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        String absolutePath3 = file6.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath3, "");
                        String absolutePath4 = file7.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath4, "");
                        try {
                            PreparedRnBundleSnapshot preparedRnBundleSnapshot2 = new PreparedRnBundleSnapshot(0, string2, jCurrentTimeMillis2, str, str2, str3, str4, strAsInterface2, strIAuthTabCallback2, absolutePath3, absolutePath4, file6.length(), file7.length(), onExtraCallback(file6), onExtraCallback(file7), maxFullscreenAdImplExternalSyntheticLambda6.onTransact(), maxFullscreenAdImplExternalSyntheticLambda6.onNavigationEvent(), onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult2.onExtraCallbackWithResult(), onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult2.onNavigationEvent(), 1, (DefaultConstructorMarker) null);
                            onExtraCallbackWithResult(file5, preparedRnBundleSnapshot2);
                            try {
                                fileLockLock.release();
                                CloseableKt.closeFinally(channel, (Throwable) null);
                                reentrantLock2.unlock();
                                return preparedRnBundleSnapshot2;
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = channel;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally((Closeable) r2, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r2 = channel;
                            try {
                                fileLockLock.release();
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r2 = channel;
                }
            } catch (Throwable th8) {
                th = th8;
                r2 = channel;
            }
        } catch (Throwable th9) {
            reentrantLock2.unlock();
            throw th9;
        }
    }

    private final void onExtraCallback() {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        onExtraCallback(new Object[]{this}, R.onWarmupCompleted(), R.onWarmupCompleted(), -927002196, R.onWarmupCompleted(), 927002196, iOnWarmupCompleted);
    }

    private final File onWarmupCompleted(String str) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (File) onExtraCallback(new Object[]{this, str}, R.onWarmupCompleted(), R.onWarmupCompleted(), -650609095, R.onWarmupCompleted(), 650609096, iOnWarmupCompleted);
    }

    private final void onNavigationEvent(String str, PreparedRnBundleSnapshot preparedRnBundleSnapshot) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        onExtraCallback(new Object[]{this, str, preparedRnBundleSnapshot}, R.onWarmupCompleted(), R.onWarmupCompleted(), 798115453, R.onWarmupCompleted(), -798115451, iOnWarmupCompleted);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{-1275594243, -2048247826, 843625065, 1050224464, 1128245538, -490986742, 1415692834, 2107038253, 904045220, -950469637, -1281725623, -541659275, 1241302527, 689385367, 1848980447, -706142752, 136849023, -559320592};
    }
}
