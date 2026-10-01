package org.tensorflow.lite;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.ListenerSetExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.tensorflow.lite.InterpreterApi;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TensorFlowLite {
    private static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String[][] TFLITE_RUNTIME_LIBNAMES;
    private static final AtomicBoolean[] haveLogged;
    private static volatile boolean isInit;
    private static final Logger logger;
    private static char onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static final byte[] onWarmupCompleted = {111, -53, -88, 102, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
    private static final int IAuthTabCallback = 26;

    private static native void nativeDoNothing();

    static {
        onExtraCallback();
        logger = Logger.getLogger(TensorFlowLite.class.getName());
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        TFLITE_RUNTIME_LIBNAMES = strArr;
        isInit = false;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    onWarmupCompleted(str);
                    logger.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    logger.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        LOAD_LIBRARY_EXCEPTION = unsatisfiedLinkError;
        haveLogged = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i2 = 0; i2 < InterpreterApi.Options.TfLiteRuntime.values().length; i2++) {
            haveLogged[i2] = new AtomicBoolean();
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]) ^ (timelineExternalSyntheticLambda0.onExtraCallbackWithResult * (onExtraCallbackWithResult ^ (-7907085296252847348L))));
            timelineExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private TensorFlowLite() {
    }

    @Deprecated
    public static String version() {
        return schemaVersion();
    }

    public static String runtimeVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static String schemaVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    public static String schemaVersion() {
        return schemaVersion(null);
    }

    public static void init() {
        if (isInit) {
            return;
        }
        try {
            nativeDoNothing();
            isInit = true;
        } catch (UnsatisfiedLinkError e) {
            Throwable th = LOAD_LIBRARY_EXCEPTION;
            if (th == null) {
                th = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    private static void b(char[] cArr, byte b, int i, Object[] objArr) {
        int i2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ (-8609172136126592983L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-8609172136126592983L) ^ onExtraCallback);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda0.onExtraCallback / c;
                    defaultGainProviderExternalSyntheticLambda0.onTransact = defaultGainProviderExternalSyntheticLambda0.onExtraCallback % c;
                    defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / c;
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % c;
                    if (defaultGainProviderExternalSyntheticLambda0.onTransact == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult = ((defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult + c) - 1) % c;
                        defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted = ((defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted + c) - 1) % c;
                        int i4 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i5 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i4];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i5];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + c) - 1) % c;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + c) - 1) % c;
                        int i6 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i6];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                    } else {
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * c) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * c) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, String str, String str2) {
        Exception exception;
        String str3;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        InterpreterApi.Options.TfLiteRuntime tfLiteRuntime2 = InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION;
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime = RuntimeFromSystem.TFLITE;
            if (possiblyAvailableRuntime.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime.getFactory();
            }
            exception = possiblyAvailableRuntime.getException();
        } else {
            exception = null;
        }
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime2 = RuntimeFromApplication.TFLITE;
            if (possiblyAvailableRuntime2.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime2.getFactory();
            }
            if (exception == null) {
                exception = possiblyAvailableRuntime2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(possiblyAvailableRuntime2.getException());
            }
        }
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[tfLiteRuntime.ordinal()];
        if (i == 1) {
            str3 = String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2);
        } else if (i == 2) {
            str3 = String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2);
        } else {
            str3 = "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java";
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + str3, exception);
    }

    /* renamed from: org.tensorflow.lite.TensorFlowLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime = iArr;
            try {
                iArr[InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a12 A[Catch: all -> 0x0a14, TryCatch #91 {, blocks: (B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:777:0x09f3, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a13 A[Catch: all -> 0x0a14, TRY_LEAVE, TryCatch #91 {, blocks: (B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:777:0x09f3, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0a2f A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a30 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0a72 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a73 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a95 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0a96 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0ab2 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0ab3 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ae6 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0ae7 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b08 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b09 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b28 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0b29 A[Catch: Exception -> 0x0bbf, TryCatch #39 {Exception -> 0x0bbf, blocks: (B:404:0x0a16, B:405:0x0a17, B:413:0x0a28, B:415:0x0a2f, B:416:0x0a30, B:418:0x0a32, B:420:0x0a3d, B:421:0x0a3e, B:424:0x0a45, B:426:0x0a4b, B:427:0x0a4c, B:430:0x0a53, B:432:0x0a59, B:433:0x0a5a, B:441:0x0a6b, B:443:0x0a72, B:444:0x0a73, B:460:0x0a8e, B:462:0x0a95, B:463:0x0a96, B:473:0x0aab, B:475:0x0ab2, B:476:0x0ab3, B:484:0x0ac4, B:486:0x0acb, B:487:0x0acc, B:498:0x0adf, B:500:0x0ae6, B:501:0x0ae7, B:514:0x0b01, B:516:0x0b08, B:517:0x0b09, B:527:0x0b21, B:529:0x0b28, B:530:0x0b29, B:538:0x0b39, B:540:0x0b40, B:541:0x0b41, B:548:0x0b57, B:550:0x0b5e, B:551:0x0b5f, B:556:0x0b6b, B:558:0x0b72, B:559:0x0b73, B:566:0x0b85, B:568:0x0b8c, B:569:0x0b8d, B:574:0x0b99, B:576:0x0ba0, B:577:0x0ba1, B:581:0x0ba8, B:583:0x0bb1, B:584:0x0bb2, B:586:0x0bb4, B:588:0x0bbd, B:589:0x0bbe, B:361:0x0983, B:12:0x00bd, B:11:0x00a9, B:382:0x09f3, B:384:0x09f6, B:385:0x09fb, B:398:0x0a0b, B:400:0x0a12, B:401:0x0a13), top: B:614:0x0983, inners: #4, #48, #49, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x07b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x09ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0bd5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0bc7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v119 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r14v120 */
    /* JADX WARN: Type inference failed for: r14v121 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Class, java.lang.Class<java.io.File>] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v8, types: [char[]] */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r14v91, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r5v100, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r5v97, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v101 */
    /* JADX WARN: Type inference failed for: r6v102 */
    /* JADX WARN: Type inference failed for: r6v112 */
    /* JADX WARN: Type inference failed for: r6v116, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v136 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v97 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onWarmupCompleted(String str) throws Exception {
        ?? declaredConstructor;
        int i;
        int i2;
        int i3;
        Exception exc;
        Object[] objArr;
        String str2;
        Throwable cause;
        Throwable cause2;
        Throwable cause3;
        Throwable cause4;
        Throwable cause5;
        Object objInvoke;
        Throwable cause6;
        Throwable th;
        Throwable th2;
        Object objInvoke2;
        Throwable cause7;
        Throwable cause8;
        Object objInvoke3;
        String str3 = str;
        int i4 = 0;
        int declaredMethod = 1;
        Object[] objArr2 = new Object[1];
        a(new char[]{57445, 10857, 57366, 50115, 16264, 2054, 59529, 18633, 46657, 16895, 17106, 40804, 19618}, View.combineMeasuredStates(0, 0), objArr2);
        String str4 = (String) objArr2[0];
        int i5 = 14;
        Object[] objArr3 = new Object[1];
        a(new char[]{42359, 22005, 42256, 52499, 16388, 2181, 58959, 18539, 62290, 15999, 19487, 40928, 2490, 38820}, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0), objArr3);
        String str5 = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        b(new char[]{29, 28, 16, 20, 13778}, (byte) (47 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), '5' - AndroidCharacter.getMirror('0'), objArr4);
        try {
            Object[] objArr5 = {(String) objArr4[0]};
            int i6 = 12;
            Object[] objArr6 = new Object[1];
            a(new char[]{4769, 64730, 4806, 6221, 59691, 2483, 13073, 18765, 17544, 38730, 39248, 40652}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr6);
            String[] strArrOnExtraCallback = ListenerSetExternalSyntheticLambda1.onExtraCallback(ListenerSetExternalSyntheticLambda1.IAuthTabCallback((byte[]) String.class.getMethod((String) objArr6[0], String.class).invoke(str3, objArr5)));
            if (strArrOnExtraCallback == null) {
                strArrOnExtraCallback = new String[0];
            }
            int length = strArrOnExtraCallback.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(strArrOnExtraCallback, 0, strArr, 0, length);
            strArr[length] = str3;
            int i7 = 0;
            while (i7 <= length) {
                String str6 = strArr[i7];
                try {
                    declaredConstructor = new char[]{30357, 53084, 30394, 14062, 55980, 59089, 7591, 42521, 8356, 42135, 47090, 29116, 55873, 3337, 57609, 3067, 29708, 55214, 6295, 42323, 12199, 41453, 45814, 32600, 55655, 2580, 60479, 5886, 29460, 54278, 1938, 40994, 10966, 48875};
                    objArr = new Object[declaredMethod];
                    a(declaredConstructor, KeyEvent.getDeadChar(i4, i4), objArr);
                } catch (Exception e) {
                    e = e;
                    declaredConstructor = declaredMethod;
                    i5 = i5;
                }
                try {
                    Object[] objArr7 = {(String) objArr[i4]};
                    Class[] clsArr = new Class[declaredMethod];
                    clsArr[i4] = String.class;
                    declaredConstructor = File.class.getDeclaredConstructor(clsArr);
                    Object objNewInstance = declaredConstructor.newInstance(objArr7);
                    try {
                        declaredConstructor = File.class;
                        char[] cArr = new char[i6];
                        // fill-array-data instruction
                        cArr[0] = 43451;
                        cArr[1] = 55710;
                        cArr[2] = 43480;
                        cArr[3] = 25871;
                        cArr[4] = 52331;
                        cArr[5] = 16970;
                        cArr[6] = 20041;
                        cArr[7] = 673;
                        cArr[8] = 65433;
                        cArr[9] = 45587;
                        cArr[10] = 58371;
                        cArr[11] = 54563;
                        Object[] objArr8 = new Object[declaredMethod];
                        a(cArr, ViewConfiguration.getScrollBarSize() >> 8, objArr8);
                        if (((Boolean) declaredConstructor.getMethod((String) objArr8[i4], null).invoke(objNewInstance, null)).booleanValue()) {
                            ClassLoader classLoader = TensorFlowLite.class.getClassLoader();
                            Object[] objArr9 = {i7 < length ? str3 : str6};
                            byte b = (byte) (onWarmupCompleted[4] + declaredMethod);
                            byte b2 = b;
                            Object[] objArr10 = new Object[declaredMethod];
                            c(b, b2, b2, objArr10);
                            String str7 = (String) objArr10[0];
                            Class[] clsArr2 = new Class[declaredMethod];
                            clsArr2[0] = String.class;
                            Method declaredMethod2 = ClassLoader.class.getDeclaredMethod(str7, clsArr2);
                            declaredMethod2.setAccessible(declaredMethod);
                            str2 = (String) declaredMethod2.invoke(classLoader, objArr9);
                            if (str2 != null) {
                            }
                        } else {
                            try {
                                char[] cArr2 = new char[i5];
                                // fill-array-data instruction
                                cArr2[0] = 15;
                                cArr2[1] = 7;
                                cArr2[2] = 21;
                                cArr2[3] = 7;
                                cArr2[4] = '\"';
                                cArr2[5] = '\r';
                                cArr2[6] = 25;
                                cArr2[7] = 30;
                                cArr2[8] = '\"';
                                cArr2[9] = 31;
                                cArr2[10] = 24;
                                cArr2[11] = 11;
                                cArr2[12] = 17;
                                cArr2[13] = '\r';
                                byte b3 = (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21);
                                int iArgb = Color.argb(i4, i4, i4, i4) + i5;
                                Object[] objArr11 = new Object[declaredMethod];
                                b(cArr2, b3, iArgb, objArr11);
                                String str8 = (String) objArr11[i4];
                                try {
                                    Object[] objArr12 = {System.getProperty(str8, str8)};
                                    Class[] clsArr3 = new Class[declaredMethod];
                                    clsArr3[i4] = String.class;
                                    objNewInstance = File.class.getDeclaredConstructor(clsArr3).newInstance(objArr12);
                                    try {
                                        Object[] objArr13 = new Object[declaredMethod];
                                        a(new char[]{43451, 55710, 43480, 25871, 52331, 16970, 20041, 673, 65433, 45587, 58371, 54563}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
                                        if (!((Boolean) File.class.getMethod((String) objArr13[i4], null).invoke(objNewInstance, null)).booleanValue()) {
                                            objNewInstance = Environment.getExternalStorageDirectory();
                                        }
                                        try {
                                            ClassLoader classLoader2 = TensorFlowLite.class.getClassLoader();
                                            try {
                                                Object[] objArr92 = {i7 < length ? str3 : str6};
                                                byte b4 = (byte) (onWarmupCompleted[4] + declaredMethod);
                                                byte b22 = b4;
                                                try {
                                                    Object[] objArr102 = new Object[declaredMethod];
                                                    c(b4, b22, b22, objArr102);
                                                    String str72 = (String) objArr102[0];
                                                    Class[] clsArr22 = new Class[declaredMethod];
                                                    clsArr22[0] = String.class;
                                                    Method declaredMethod22 = ClassLoader.class.getDeclaredMethod(str72, clsArr22);
                                                    declaredMethod22.setAccessible(declaredMethod);
                                                    str2 = (String) declaredMethod22.invoke(classLoader2, objArr92);
                                                    try {
                                                        if (str2 != null) {
                                                            try {
                                                                Object objInvoke4 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                if (i7 >= length) {
                                                                    str6 = str;
                                                                }
                                                                try {
                                                                    Object[] objArr14 = {str6};
                                                                    try {
                                                                        Object[] objArr15 = new Object[declaredMethod];
                                                                        b(new char[]{0, 27, '\n', 7, 16, 22, 30, 14, 6, 15, 13802}, (byte) (7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr15);
                                                                        String str9 = (String) objArr15[0];
                                                                        Class[] clsArr4 = new Class[declaredMethod];
                                                                        clsArr4[0] = String.class;
                                                                        Runtime.class.getMethod(str9, clsArr4).invoke(objInvoke4, objArr14);
                                                                        return;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        Throwable th4 = th;
                                                                        Throwable cause9 = th4.getCause();
                                                                        if (cause9 == null) {
                                                                            throw th4;
                                                                        }
                                                                        throw cause9;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                            } catch (Throwable th6) {
                                                                Throwable cause10 = th6.getCause();
                                                                if (cause10 == null) {
                                                                    throw th6;
                                                                }
                                                                throw cause10;
                                                            }
                                                        } else {
                                                            try {
                                                                Object[] objArr16 = new Object[declaredMethod];
                                                                try {
                                                                    objArr16[0] = 47;
                                                                    Object[] objArr17 = new Object[declaredMethod];
                                                                    b(new char[]{'\t', 15, 21, ' ', '#', 4, '\b', 0, 11, 19, 13917}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 96), 10 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), objArr17);
                                                                    try {
                                                                        String str10 = (String) objArr17[0];
                                                                        Class[] clsArr5 = new Class[declaredMethod];
                                                                        clsArr5[0] = Integer.TYPE;
                                                                        int iIntValue = ((Integer) String.class.getMethod(str10, clsArr5).invoke(str2, objArr16)).intValue() + declaredMethod;
                                                                        try {
                                                                            Object[] objArr18 = new Object[declaredMethod];
                                                                            try {
                                                                                objArr18[0] = Integer.valueOf(iIntValue);
                                                                                Class[] clsArr6 = new Class[declaredMethod];
                                                                                clsArr6[0] = Integer.TYPE;
                                                                                try {
                                                                                    Object[] objArr19 = {objNewInstance, String.class.getMethod(str4, clsArr6).invoke(str2, objArr18)};
                                                                                    Class[] clsArr7 = new Class[2];
                                                                                    try {
                                                                                        clsArr7[0] = File.class;
                                                                                        clsArr7[declaredMethod] = String.class;
                                                                                        File file = (File) File.class.getDeclaredConstructor(clsArr7).newInstance(objArr19);
                                                                                        try {
                                                                                            ClassLoader classLoader3 = TensorFlowLite.class.getClassLoader();
                                                                                            try {
                                                                                                Object[] objArr20 = {str2};
                                                                                                try {
                                                                                                    Object[] objArr21 = new Object[declaredMethod];
                                                                                                    b(new char[]{20, 3, 30, 3, '\b', 26, 26, 6, '\r', '\f', 13932}, (byte) (Color.green(0) + 109), AndroidCharacter.getMirror('0') - '%', objArr21);
                                                                                                    try {
                                                                                                        String str11 = (String) objArr21[0];
                                                                                                        Class[] clsArr8 = new Class[declaredMethod];
                                                                                                        clsArr8[0] = String.class;
                                                                                                        Object objInvoke5 = ClassLoader.class.getMethod(str11, clsArr8).invoke(classLoader3, objArr20);
                                                                                                        if (objInvoke5 == null) {
                                                                                                            try {
                                                                                                                Object[] objArr22 = new Object[declaredMethod];
                                                                                                                b(new char[]{'\f', 29, 3, '#', '\n', 15, 2, 23}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 95), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 9, objArr22);
                                                                                                                String str12 = (String) objArr22[0];
                                                                                                                Class[] clsArr9 = new Class[declaredMethod];
                                                                                                                clsArr9[0] = CharSequence.class;
                                                                                                                if (((Boolean) String.class.getMethod(str12, clsArr9).invoke(str2, "!")).booleanValue()) {
                                                                                                                    try {
                                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                                        Object[] objArr23 = new Object[declaredMethod];
                                                                                                                        a(new char[]{30590, 51762, 30484, 61248, 57287, 29476, 50202, 13218, 8520, 41407, 28244, 58445, 56292}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr23);
                                                                                                                        sb.append((String) objArr23[0]);
                                                                                                                        sb.append(str2);
                                                                                                                        try {
                                                                                                                            Object[] objArr24 = {sb.toString()};
                                                                                                                            Class[] clsArr10 = new Class[declaredMethod];
                                                                                                                            clsArr10[0] = String.class;
                                                                                                                            Object objNewInstance2 = URL.class.getDeclaredConstructor(clsArr10).newInstance(objArr24);
                                                                                                                            try {
                                                                                                                                Object[] objArr25 = new Object[declaredMethod];
                                                                                                                                a(new char[]{13551, 42362, 13448, 19350, 45195, 1524, 24778, 17688, 25310, 52970, 51846}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), objArr25);
                                                                                                                                Object objInvoke6 = URL.class.getMethod((String) objArr25[0], null).invoke(objNewInstance2, null);
                                                                                                                                try {
                                                                                                                                    Object[] objArr26 = new Object[declaredMethod];
                                                                                                                                    b(new char[]{'\t', 15, 21, ' ', '#', 4, '\b', 0, 11, 19, 13917}, (byte) (View.MeasureSpec.getSize(0) + 97), 11 - Color.alpha(0), objArr26);
                                                                                                                                    String str13 = (String) objArr26[0];
                                                                                                                                    Class[] clsArr11 = new Class[declaredMethod];
                                                                                                                                    clsArr11[0] = String.class;
                                                                                                                                    try {
                                                                                                                                        Object[] objArr27 = new Object[2];
                                                                                                                                        objArr27[declaredMethod] = Integer.valueOf(((Integer) String.class.getMethod(str13, clsArr11).invoke(objInvoke6, "!/")).intValue());
                                                                                                                                        objArr27[0] = 5;
                                                                                                                                        Class[] clsArr12 = new Class[2];
                                                                                                                                        clsArr12[0] = Integer.TYPE;
                                                                                                                                        clsArr12[declaredMethod] = Integer.TYPE;
                                                                                                                                        try {
                                                                                                                                            Object[] objArr28 = {String.class.getMethod(str4, clsArr12).invoke(objInvoke6, objArr27)};
                                                                                                                                            Class[] clsArr13 = new Class[declaredMethod];
                                                                                                                                            clsArr13[0] = String.class;
                                                                                                                                            Object objNewInstance3 = ZipFile.class.getDeclaredConstructor(clsArr13).newInstance(objArr28);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr29 = new Object[declaredMethod];
                                                                                                                                                b(new char[]{'\t', 15, 21, ' ', '#', 4, '\b', 0, 11, 19, 13917}, (byte) (KeyEvent.getDeadChar(0, 0) + 97), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 11, objArr29);
                                                                                                                                                String str14 = (String) objArr29[0];
                                                                                                                                                Class[] clsArr14 = new Class[declaredMethod];
                                                                                                                                                clsArr14[0] = String.class;
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr30 = new Object[declaredMethod];
                                                                                                                                                    objArr30[0] = Integer.valueOf(((Integer) String.class.getMethod(str14, clsArr14).invoke(str2, "!/")).intValue());
                                                                                                                                                    Class[] clsArr15 = new Class[declaredMethod];
                                                                                                                                                    clsArr15[0] = Integer.TYPE;
                                                                                                                                                    Object objInvoke7 = String.class.getMethod(str4, clsArr15).invoke(str2, objArr30);
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr31 = new Object[declaredMethod];
                                                                                                                                                        objArr31[0] = 2;
                                                                                                                                                        Class[] clsArr16 = new Class[declaredMethod];
                                                                                                                                                        clsArr16[0] = Integer.TYPE;
                                                                                                                                                        try {
                                                                                                                                                            Object[] objArr32 = {String.class.getMethod(str4, clsArr16).invoke(objInvoke7, objArr31)};
                                                                                                                                                            Object[] objArr33 = new Object[1];
                                                                                                                                                            b(new char[]{20, 3, ' ', 27, 3, '#', '\r', 0}, (byte) (18 - View.getDefaultSize(0, 0)), 7 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr33);
                                                                                                                                                            try {
                                                                                                                                                                Object[] objArr34 = {ZipFile.class.getMethod((String) objArr33[0], String.class).invoke(objNewInstance3, objArr32)};
                                                                                                                                                                Object[] objArr35 = new Object[1];
                                                                                                                                                                b(new char[]{20, 3, '\"', '#', 11, '#', '\t', ' ', 21, 3, 14, 0, 6, '!'}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 50), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, objArr35);
                                                                                                                                                                objInvoke = ZipFile.class.getMethod((String) objArr35[0], ZipEntry.class).invoke(objNewInstance3, objArr34);
                                                                                                                                                                declaredConstructor = ZipEntry.class;
                                                                                                                                                            } catch (Throwable th7) {
                                                                                                                                                                Throwable cause11 = th7.getCause();
                                                                                                                                                                if (cause11 == null) {
                                                                                                                                                                    throw th7;
                                                                                                                                                                }
                                                                                                                                                                throw cause11;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th8) {
                                                                                                                                                            Throwable cause12 = th8.getCause();
                                                                                                                                                            if (cause12 == null) {
                                                                                                                                                                throw th8;
                                                                                                                                                            }
                                                                                                                                                            throw cause12;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th9) {
                                                                                                                                                        Throwable cause13 = th9.getCause();
                                                                                                                                                        if (cause13 == null) {
                                                                                                                                                            throw th9;
                                                                                                                                                        }
                                                                                                                                                        throw cause13;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th10) {
                                                                                                                                                    Throwable cause14 = th10.getCause();
                                                                                                                                                    if (cause14 == null) {
                                                                                                                                                        throw th10;
                                                                                                                                                    }
                                                                                                                                                    throw cause14;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th11) {
                                                                                                                                                Throwable cause15 = th11.getCause();
                                                                                                                                                if (cause15 == null) {
                                                                                                                                                    throw th11;
                                                                                                                                                }
                                                                                                                                                throw cause15;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th12) {
                                                                                                                                            Throwable cause16 = th12.getCause();
                                                                                                                                            if (cause16 == null) {
                                                                                                                                                throw th12;
                                                                                                                                            }
                                                                                                                                            throw cause16;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th13) {
                                                                                                                                        Throwable cause17 = th13.getCause();
                                                                                                                                        if (cause17 == null) {
                                                                                                                                            throw th13;
                                                                                                                                        }
                                                                                                                                        throw cause17;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th14) {
                                                                                                                                    Throwable cause18 = th14.getCause();
                                                                                                                                    if (cause18 == null) {
                                                                                                                                        throw th14;
                                                                                                                                    }
                                                                                                                                    throw cause18;
                                                                                                                                }
                                                                                                                            } catch (Throwable th15) {
                                                                                                                                Throwable cause19 = th15.getCause();
                                                                                                                                if (cause19 == null) {
                                                                                                                                    throw th15;
                                                                                                                                }
                                                                                                                                throw cause19;
                                                                                                                            }
                                                                                                                        } catch (Throwable th16) {
                                                                                                                            Throwable cause20 = th16.getCause();
                                                                                                                            if (cause20 == null) {
                                                                                                                                throw th16;
                                                                                                                            }
                                                                                                                            throw cause20;
                                                                                                                        }
                                                                                                                    } catch (Exception e2) {
                                                                                                                        exc = e2;
                                                                                                                        i3 = 14;
                                                                                                                        i2 = 0;
                                                                                                                        i = 1;
                                                                                                                        if (i7 < length) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    try {
                                                                                                                        objInvoke = FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                                                                                        declaredConstructor = CharSequence.class;
                                                                                                                    } catch (Throwable th17) {
                                                                                                                        Throwable cause21 = th17.getCause();
                                                                                                                        if (cause21 == null) {
                                                                                                                            throw th17;
                                                                                                                        }
                                                                                                                        throw cause21;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th18) {
                                                                                                                Throwable cause22 = th18.getCause();
                                                                                                                if (cause22 == null) {
                                                                                                                    throw th18;
                                                                                                                }
                                                                                                                throw cause22;
                                                                                                            }
                                                                                                        } else {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                        a(new char[]{13551, 42362, 13448, 19350, 45195, 1524, 24778, 17688, 25310, 52970, 51846}, (-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr36);
                                                                                                                        Object objInvoke8 = URL.class.getMethod((String) objArr36[0], null).invoke(objInvoke5, null);
                                                                                                                        try {
                                                                                                                            Object[] objArr37 = {"!/".concat(String.valueOf(str2))};
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    Object[] objArr38 = new Object[1];
                                                                                                                                    b(new char[]{'\t', 15, 21, ' ', '#', 4, '\b', 0, 11, 19, 13917}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 97), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 11, objArr38);
                                                                                                                                    try {
                                                                                                                                        String str15 = (String) objArr38[0];
                                                                                                                                        Class[] clsArr17 = new Class[1];
                                                                                                                                        try {
                                                                                                                                            clsArr17[0] = String.class;
                                                                                                                                            try {
                                                                                                                                                Object[] objArr39 = new Object[2];
                                                                                                                                                try {
                                                                                                                                                    objArr39[1] = Integer.valueOf(((Integer) String.class.getMethod(str15, clsArr17).invoke(objInvoke8, objArr37)).intValue());
                                                                                                                                                    try {
                                                                                                                                                        objArr39[0] = 5;
                                                                                                                                                        Class[] clsArr18 = new Class[2];
                                                                                                                                                        clsArr18[0] = Integer.TYPE;
                                                                                                                                                        try {
                                                                                                                                                            clsArr18[1] = Integer.TYPE;
                                                                                                                                                            try {
                                                                                                                                                                Object[] objArr40 = {String.class.getMethod(str4, clsArr18).invoke(objInvoke8, objArr39)};
                                                                                                                                                                Class[] clsArr19 = new Class[1];
                                                                                                                                                                try {
                                                                                                                                                                    clsArr19[0] = String.class;
                                                                                                                                                                } catch (Throwable th19) {
                                                                                                                                                                    th = th19;
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    Object objNewInstance4 = ZipFile.class.getDeclaredConstructor(clsArr19).newInstance(objArr40);
                                                                                                                                                                    try {
                                                                                                                                                                        Object[] objArr41 = {str2};
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                Object[] objArr42 = new Object[1];
                                                                                                                                                                                b(new char[]{20, 3, ' ', 27, 3, '#', '\r', 0}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18), (Process.myTid() >> 22) + 8, objArr42);
                                                                                                                                                                                try {
                                                                                                                                                                                    String str16 = (String) objArr42[0];
                                                                                                                                                                                    Class[] clsArr20 = new Class[1];
                                                                                                                                                                                    clsArr20[0] = String.class;
                                                                                                                                                                                    try {
                                                                                                                                                                                        Object[] objArr43 = {ZipFile.class.getMethod(str16, clsArr20).invoke(objNewInstance4, objArr41)};
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Object[] objArr44 = new Object[1];
                                                                                                                                                                                                    b(new char[]{20, 3, '\"', '#', 11, '#', '\t', ' ', 21, 3, 14, 0, 6, '!'}, (byte) (50 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), 14 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr44);
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        String str17 = (String) objArr44[0];
                                                                                                                                                                                                        Class[] clsArr21 = new Class[1];
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            clsArr21[0] = ZipEntry.class;
                                                                                                                                                                                                            objInvoke = ZipFile.class.getMethod(str17, clsArr21).invoke(objNewInstance4, objArr43);
                                                                                                                                                                                                            declaredConstructor = ZipEntry.class;
                                                                                                                                                                                                        } catch (Throwable th20) {
                                                                                                                                                                                                            th = th20;
                                                                                                                                                                                                            Throwable th21 = th;
                                                                                                                                                                                                            cause5 = th21.getCause();
                                                                                                                                                                                                            if (cause5 == null) {
                                                                                                                                                                                                                throw th21;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            throw cause5;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th22) {
                                                                                                                                                                                                        th = th22;
                                                                                                                                                                                                        Throwable th212 = th;
                                                                                                                                                                                                        cause5 = th212.getCause();
                                                                                                                                                                                                        if (cause5 == null) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Throwable th23) {
                                                                                                                                                                                                    th = th23;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th24) {
                                                                                                                                                                                                th = th24;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th25) {
                                                                                                                                                                                            th = th25;
                                                                                                                                                                                            Throwable th2122 = th;
                                                                                                                                                                                            cause5 = th2122.getCause();
                                                                                                                                                                                            if (cause5 == null) {
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th26) {
                                                                                                                                                                                        th = th26;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th27) {
                                                                                                                                                                                    th = th27;
                                                                                                                                                                                    Throwable th28 = th;
                                                                                                                                                                                    cause4 = th28.getCause();
                                                                                                                                                                                    if (cause4 != null) {
                                                                                                                                                                                        throw th28;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw cause4;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th29) {
                                                                                                                                                                                th = th29;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th30) {
                                                                                                                                                                            th = th30;
                                                                                                                                                                            Throwable th282 = th;
                                                                                                                                                                            cause4 = th282.getCause();
                                                                                                                                                                            if (cause4 != null) {
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th31) {
                                                                                                                                                                        th = th31;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th32) {
                                                                                                                                                                    th = th32;
                                                                                                                                                                    Throwable th33 = th;
                                                                                                                                                                    Throwable cause23 = th33.getCause();
                                                                                                                                                                    if (cause23 == null) {
                                                                                                                                                                        throw th33;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause23;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th34) {
                                                                                                                                                                th = th34;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th35) {
                                                                                                                                                            th = th35;
                                                                                                                                                            Throwable th36 = th;
                                                                                                                                                            cause3 = th36.getCause();
                                                                                                                                                            if (cause3 != null) {
                                                                                                                                                                throw th36;
                                                                                                                                                            }
                                                                                                                                                            throw cause3;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th37) {
                                                                                                                                                        th = th37;
                                                                                                                                                        Throwable th362 = th;
                                                                                                                                                        cause3 = th362.getCause();
                                                                                                                                                        if (cause3 != null) {
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th38) {
                                                                                                                                                    th = th38;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th39) {
                                                                                                                                                th = th39;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th40) {
                                                                                                                                            th = th40;
                                                                                                                                            Throwable th41 = th;
                                                                                                                                            cause2 = th41.getCause();
                                                                                                                                            if (cause2 != null) {
                                                                                                                                                throw th41;
                                                                                                                                            }
                                                                                                                                            throw cause2;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th42) {
                                                                                                                                        th = th42;
                                                                                                                                        Throwable th412 = th;
                                                                                                                                        cause2 = th412.getCause();
                                                                                                                                        if (cause2 != null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Throwable th43) {
                                                                                                                                    th = th43;
                                                                                                                                }
                                                                                                                            } catch (Throwable th44) {
                                                                                                                                th = th44;
                                                                                                                            }
                                                                                                                        } catch (Throwable th45) {
                                                                                                                            th = th45;
                                                                                                                        }
                                                                                                                    } catch (Throwable th46) {
                                                                                                                        th = th46;
                                                                                                                        Throwable th47 = th;
                                                                                                                        cause = th47.getCause();
                                                                                                                        if (cause != null) {
                                                                                                                            throw th47;
                                                                                                                        }
                                                                                                                        throw cause;
                                                                                                                    }
                                                                                                                } catch (Throwable th48) {
                                                                                                                    th = th48;
                                                                                                                    Throwable th472 = th;
                                                                                                                    cause = th472.getCause();
                                                                                                                    if (cause != null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th49) {
                                                                                                                th = th49;
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            Object[] objArr45 = {objInvoke};
                                                                                                            try {
                                                                                                                Class[] clsArr23 = new Class[1];
                                                                                                                try {
                                                                                                                    clsArr23[0] = InputStream.class;
                                                                                                                    InputStream inputStream = (InputStream) BufferedInputStream.class.getDeclaredConstructor(clsArr23).newInstance(objArr45);
                                                                                                                    try {
                                                                                                                        Object[] objArr46 = {inputStream};
                                                                                                                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(500370472);
                                                                                                                        if (objOnExtraCallback == null) {
                                                                                                                            try {
                                                                                                                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 6782), 60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 54 - (ViewConfiguration.getTapTimeout() >> 16), 747893432, false, "onNavigationEvent", new Class[]{InputStream.class});
                                                                                                                            } catch (Throwable th50) {
                                                                                                                                th = th50;
                                                                                                                                Throwable cause24 = th.getCause();
                                                                                                                                if (cause24 == null) {
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                throw cause24;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        Method method = (Method) objOnExtraCallback;
                                                                                                                        ?? r5 = (InputStream) method.invoke(null, objArr46);
                                                                                                                        if (inputStream == r5) {
                                                                                                                            r5.close();
                                                                                                                            try {
                                                                                                                                Object objInvoke9 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            Object[] objArr47 = {str2, TensorFlowLite.class.getClassLoader()};
                                                                                                                                            Object[] objArr48 = new Object[1];
                                                                                                                                            a(new char[]{16672, 64612, 16716, 7367, 59807, 2025, 14222, 18225}, (-1) - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr48);
                                                                                                                                            Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr48[0], String.class, ClassLoader.class);
                                                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                                                            declaredMethod3.invoke(objInvoke9, objArr47);
                                                                                                                                        } catch (Throwable th51) {
                                                                                                                                            Throwable cause25 = th51.getCause();
                                                                                                                                            if (cause25 == null) {
                                                                                                                                                throw th51;
                                                                                                                                            }
                                                                                                                                            throw cause25;
                                                                                                                                        }
                                                                                                                                    } catch (NoSuchMethodException unused) {
                                                                                                                                        try {
                                                                                                                                            objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                            ClassLoader classLoader4 = TensorFlowLite.class.getClassLoader();
                                                                                                                                            synchronized (objInvoke3) {
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr49 = {str2, classLoader4};
                                                                                                                                                    Object[] objArr50 = new Object[1];
                                                                                                                                                    a(new char[]{39863, 47693, 39897, 11564, 44984, 33363, 1648, 49798, 52625, 53708, 44056, 5424, 14198, 30749}, 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr50);
                                                                                                                                                    Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr50[0], String.class, ClassLoader.class);
                                                                                                                                                    declaredMethod4.setAccessible(true);
                                                                                                                                                    String str18 = (String) declaredMethod4.invoke(objInvoke3, objArr49);
                                                                                                                                                    if (str18 != null) {
                                                                                                                                                        throw new UnsatisfiedLinkError(str18);
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th52) {
                                                                                                                                                    Throwable cause26 = th52.getCause();
                                                                                                                                                    if (cause26 == null) {
                                                                                                                                                        throw th52;
                                                                                                                                                    }
                                                                                                                                                    throw cause26;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i3 = 14;
                                                                                                                                            i2 = 0;
                                                                                                                                            i = 1;
                                                                                                                                            i7++;
                                                                                                                                            str3 = str;
                                                                                                                                            i4 = i2;
                                                                                                                                            declaredMethod = i;
                                                                                                                                            i6 = 12;
                                                                                                                                            i5 = i3;
                                                                                                                                        } catch (Throwable th53) {
                                                                                                                                            Throwable cause27 = th53.getCause();
                                                                                                                                            if (cause27 == null) {
                                                                                                                                                throw th53;
                                                                                                                                            }
                                                                                                                                            throw cause27;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Exception unused2) {
                                                                                                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                                                                                                        try {
                                                                                                                                            Object objInvoke10 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr51 = {str2, TensorFlowLite.class.getClassLoader()};
                                                                                                                                                Object[] objArr52 = new Object[1];
                                                                                                                                                a(new char[]{20706, 63087, 20614, 16959, 58260, 10832, 26971, 27267, 1747, 40431}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr52);
                                                                                                                                                Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr52[0], String.class, ClassLoader.class);
                                                                                                                                                declaredMethod5.setAccessible(true);
                                                                                                                                                declaredMethod5.invoke(objInvoke10, objArr51);
                                                                                                                                            } catch (Throwable th54) {
                                                                                                                                                Throwable cause28 = th54.getCause();
                                                                                                                                                if (cause28 == null) {
                                                                                                                                                    throw th54;
                                                                                                                                                }
                                                                                                                                                throw cause28;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                            Throwable cause29 = th55.getCause();
                                                                                                                                            if (cause29 == null) {
                                                                                                                                                throw th55;
                                                                                                                                            }
                                                                                                                                            throw cause29;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                        ClassLoader classLoader42 = TensorFlowLite.class.getClassLoader();
                                                                                                                                        synchronized (objInvoke3) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th56) {
                                                                                                                                Throwable cause30 = th56.getCause();
                                                                                                                                if (cause30 == null) {
                                                                                                                                    throw th56;
                                                                                                                                }
                                                                                                                                throw cause30;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            try {
                                                                                                                                Object[] objArr53 = {r5, file};
                                                                                                                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1142972385);
                                                                                                                                i5 = r5;
                                                                                                                                declaredMethod = method;
                                                                                                                                if (objOnExtraCallback2 == null) {
                                                                                                                                    try {
                                                                                                                                        declaredMethod = 1;
                                                                                                                                        ?? r52 = {InputStream.class, File.class};
                                                                                                                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1969267057, false, "onNavigationEvent", (Class[]) r52);
                                                                                                                                        i5 = r52;
                                                                                                                                    } catch (Throwable th57) {
                                                                                                                                        th2 = th57;
                                                                                                                                        Throwable cause31 = th2.getCause();
                                                                                                                                        if (cause31 == null) {
                                                                                                                                            throw th2;
                                                                                                                                        }
                                                                                                                                        throw cause31;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                Object objInvoke11 = ((Method) objOnExtraCallback2).invoke(null, objArr53);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            Object objInvoke12 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr54 = new Object[1];
                                                                                                                                                a(new char[]{9041, 63196, 9014, 54133, 58157, 23062, 63529, 6891, 30051, 40267, 21090, 52598, 36740, 13468, 1240, 46874, 8640, 60972, 64773}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr54);
                                                                                                                                                declaredMethod = 0;
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr55 = {File.class.getMethod((String) objArr54[0], null).invoke(objInvoke11, null), TensorFlowLite.class.getClassLoader()};
                                                                                                                                                    Object[] objArr56 = new Object[1];
                                                                                                                                                    a(new char[]{16672, 64612, 16716, 7367, 59807, 2025, 14222, 18225}, (-1) - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), objArr56);
                                                                                                                                                    String str19 = (String) objArr56[0];
                                                                                                                                                    declaredConstructor = new Class[]{String.class, ClassLoader.class};
                                                                                                                                                    declaredMethod = Runtime.class.getDeclaredMethod(str19, declaredConstructor);
                                                                                                                                                    declaredMethod.setAccessible(true);
                                                                                                                                                    declaredMethod.invoke(objInvoke12, objArr55);
                                                                                                                                                } catch (Throwable th58) {
                                                                                                                                                    Throwable cause32 = th58.getCause();
                                                                                                                                                    if (cause32 == null) {
                                                                                                                                                        throw th58;
                                                                                                                                                    }
                                                                                                                                                    throw cause32;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                Throwable cause33 = th59.getCause();
                                                                                                                                                if (cause33 == null) {
                                                                                                                                                    throw th59;
                                                                                                                                                }
                                                                                                                                                throw cause33;
                                                                                                                                            }
                                                                                                                                        } catch (Exception unused3) {
                                                                                                                                            i5 = 27;
                                                                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                                                                try {
                                                                                                                                                    Object objInvoke13 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr57 = new Object[1];
                                                                                                                                                        a(new char[]{9041, 63196, 9014, 54133, 58157, 23062, 63529, 6891, 30051, 40267, 21090, 52598, 36740, 13468, 1240, 46874, 8640, 60972, 64773}, ViewConfiguration.getTapTimeout() >> 16, objArr57);
                                                                                                                                                        try {
                                                                                                                                                            Object[] objArr58 = {File.class.getMethod((String) objArr57[0], null).invoke(objInvoke11, null), TensorFlowLite.class.getClassLoader()};
                                                                                                                                                            Object[] objArr59 = new Object[1];
                                                                                                                                                            a(new char[]{20706, 63087, 20614, 16959, 58260, 10832, 26971, 27267, 1747, 40431}, Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, objArr59);
                                                                                                                                                            Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr59[0], String.class, ClassLoader.class);
                                                                                                                                                            declaredMethod6.setAccessible(true);
                                                                                                                                                            declaredMethod6.invoke(objInvoke13, objArr58);
                                                                                                                                                        } catch (Throwable th60) {
                                                                                                                                                            Throwable cause34 = th60.getCause();
                                                                                                                                                            if (cause34 == null) {
                                                                                                                                                                throw th60;
                                                                                                                                                            }
                                                                                                                                                            throw cause34;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th61) {
                                                                                                                                                        Throwable cause35 = th61.getCause();
                                                                                                                                                        if (cause35 == null) {
                                                                                                                                                            throw th61;
                                                                                                                                                        }
                                                                                                                                                        throw cause35;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th62) {
                                                                                                                                                    Throwable cause36 = th62.getCause();
                                                                                                                                                    if (cause36 == null) {
                                                                                                                                                        throw th62;
                                                                                                                                                    }
                                                                                                                                                    throw cause36;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    i5 = 0;
                                                                                                                                                    objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                                    try {
                                                                                                                                                    } catch (Throwable th63) {
                                                                                                                                                        th = th63;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr60 = new Object[1];
                                                                                                                                                        a(new char[]{9041, 63196, 9014, 54133, 58157, 23062, 63529, 6891, 30051, 40267, 21090, 52598, 36740, 13468, 1240, 46874, 8640, 60972, 64773}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr60);
                                                                                                                                                        try {
                                                                                                                                                            Object objInvoke14 = File.class.getMethod((String) objArr60[0], null).invoke(objInvoke11, null);
                                                                                                                                                            try {
                                                                                                                                                                ClassLoader classLoader5 = TensorFlowLite.class.getClassLoader();
                                                                                                                                                                synchronized (objInvoke2) {
                                                                                                                                                                    try {
                                                                                                                                                                        Object[] objArr61 = {objInvoke14, classLoader5};
                                                                                                                                                                        i5 = 14;
                                                                                                                                                                        i3 = 14;
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                Object[] objArr62 = new Object[1];
                                                                                                                                                                                a(new char[]{39863, 47693, 39897, 11564, 44984, 33363, 1648, 49798, 52625, 53708, 44056, 5424, 14198, 30749}, ExpandableListView.getPackedPositionType(0L), objArr62);
                                                                                                                                                                                declaredMethod = 0;
                                                                                                                                                                                i2 = 0;
                                                                                                                                                                                try {
                                                                                                                                                                                    String str20 = (String) objArr62[0];
                                                                                                                                                                                    Class[] clsArr24 = new Class[2];
                                                                                                                                                                                    clsArr24[0] = String.class;
                                                                                                                                                                                    declaredConstructor = 1;
                                                                                                                                                                                    i = 1;
                                                                                                                                                                                    try {
                                                                                                                                                                                        clsArr24[1] = ClassLoader.class;
                                                                                                                                                                                        Method declaredMethod7 = Runtime.class.getDeclaredMethod(str20, clsArr24);
                                                                                                                                                                                        declaredMethod7.setAccessible(true);
                                                                                                                                                                                        String str21 = (String) declaredMethod7.invoke(objInvoke2, objArr61);
                                                                                                                                                                                        if (str21 != null) {
                                                                                                                                                                                            throw new UnsatisfiedLinkError(str21);
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th64) {
                                                                                                                                                                                        th = th64;
                                                                                                                                                                                        Throwable th65 = th;
                                                                                                                                                                                        cause8 = th65.getCause();
                                                                                                                                                                                        if (cause8 == null) {
                                                                                                                                                                                            throw th65;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause8;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th66) {
                                                                                                                                                                                    th = th66;
                                                                                                                                                                                    Throwable th652 = th;
                                                                                                                                                                                    cause8 = th652.getCause();
                                                                                                                                                                                    if (cause8 == null) {
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th67) {
                                                                                                                                                                                th = th67;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th68) {
                                                                                                                                                                            th = th68;
                                                                                                                                                                            Throwable th6522 = th;
                                                                                                                                                                            cause8 = th6522.getCause();
                                                                                                                                                                            if (cause8 == null) {
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th69) {
                                                                                                                                                                        th = th69;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } catch (Exception e3) {
                                                                                                                                                                e = e3;
                                                                                                                                                                i5 = 14;
                                                                                                                                                                declaredMethod = 0;
                                                                                                                                                                declaredConstructor = 1;
                                                                                                                                                                exc = e;
                                                                                                                                                                i3 = i5;
                                                                                                                                                                i2 = declaredMethod;
                                                                                                                                                                i = declaredConstructor;
                                                                                                                                                                if (i7 < length) {
                                                                                                                                                                    throw exc;
                                                                                                                                                                }
                                                                                                                                                                i7++;
                                                                                                                                                                str3 = str;
                                                                                                                                                                i4 = i2;
                                                                                                                                                                declaredMethod = i;
                                                                                                                                                                i6 = 12;
                                                                                                                                                                i5 = i3;
                                                                                                                                                            }
                                                                                                                                                            i7++;
                                                                                                                                                            str3 = str;
                                                                                                                                                            i4 = i2;
                                                                                                                                                            declaredMethod = i;
                                                                                                                                                            i6 = 12;
                                                                                                                                                            i5 = i3;
                                                                                                                                                        } catch (Throwable th70) {
                                                                                                                                                            th = th70;
                                                                                                                                                            Throwable th71 = th;
                                                                                                                                                            cause7 = th71.getCause();
                                                                                                                                                            if (cause7 != null) {
                                                                                                                                                                throw th71;
                                                                                                                                                            }
                                                                                                                                                            throw cause7;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th72) {
                                                                                                                                                        th = th72;
                                                                                                                                                        Throwable th712 = th;
                                                                                                                                                        cause7 = th712.getCause();
                                                                                                                                                        if (cause7 != null) {
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th73) {
                                                                                                                                                    Throwable cause37 = th73.getCause();
                                                                                                                                                    if (cause37 == null) {
                                                                                                                                                        throw th73;
                                                                                                                                                    }
                                                                                                                                                    throw cause37;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (NoSuchMethodException unused4) {
                                                                                                                                        i5 = 0;
                                                                                                                                        objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                                        Object[] objArr602 = new Object[1];
                                                                                                                                        a(new char[]{9041, 63196, 9014, 54133, 58157, 23062, 63529, 6891, 30051, 40267, 21090, 52598, 36740, 13468, 1240, 46874, 8640, 60972, 64773}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr602);
                                                                                                                                        Object objInvoke142 = File.class.getMethod((String) objArr602[0], null).invoke(objInvoke11, null);
                                                                                                                                        ClassLoader classLoader52 = TensorFlowLite.class.getClassLoader();
                                                                                                                                        synchronized (objInvoke2) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Throwable th74) {
                                                                                                                                    Throwable cause38 = th74.getCause();
                                                                                                                                    if (cause38 == null) {
                                                                                                                                        throw th74;
                                                                                                                                    }
                                                                                                                                    throw cause38;
                                                                                                                                }
                                                                                                                            } catch (Throwable th75) {
                                                                                                                                th2 = th75;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i3 = 14;
                                                                                                                        i2 = 0;
                                                                                                                        i = 1;
                                                                                                                    } catch (Throwable th76) {
                                                                                                                        th = th76;
                                                                                                                    }
                                                                                                                } catch (Throwable th77) {
                                                                                                                    th = th77;
                                                                                                                    Throwable th78 = th;
                                                                                                                    cause6 = th78.getCause();
                                                                                                                    if (cause6 != null) {
                                                                                                                        throw th78;
                                                                                                                    }
                                                                                                                    throw cause6;
                                                                                                                }
                                                                                                            } catch (Throwable th79) {
                                                                                                                th = th79;
                                                                                                                Throwable th782 = th;
                                                                                                                cause6 = th782.getCause();
                                                                                                                if (cause6 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th80) {
                                                                                                            th = th80;
                                                                                                        }
                                                                                                    } catch (Throwable th81) {
                                                                                                        th = th81;
                                                                                                        Throwable th82 = th;
                                                                                                        Throwable cause39 = th82.getCause();
                                                                                                        if (cause39 == null) {
                                                                                                            throw th82;
                                                                                                        }
                                                                                                        throw cause39;
                                                                                                    }
                                                                                                } catch (Throwable th83) {
                                                                                                    th = th83;
                                                                                                }
                                                                                            } catch (Throwable th84) {
                                                                                                th = th84;
                                                                                            }
                                                                                        } catch (Exception e4) {
                                                                                            e = e4;
                                                                                            declaredConstructor = declaredMethod;
                                                                                            i5 = 14;
                                                                                            declaredMethod = 0;
                                                                                        }
                                                                                    } catch (Throwable th85) {
                                                                                        th = th85;
                                                                                        Throwable th86 = th;
                                                                                        Throwable cause40 = th86.getCause();
                                                                                        if (cause40 == null) {
                                                                                            throw th86;
                                                                                        }
                                                                                        throw cause40;
                                                                                    }
                                                                                } catch (Throwable th87) {
                                                                                    th = th87;
                                                                                }
                                                                            } catch (Throwable th88) {
                                                                                th = th88;
                                                                                Throwable th89 = th;
                                                                                Throwable cause41 = th89.getCause();
                                                                                if (cause41 == null) {
                                                                                    throw th89;
                                                                                }
                                                                                throw cause41;
                                                                            }
                                                                        } catch (Throwable th90) {
                                                                            th = th90;
                                                                        }
                                                                    } catch (Throwable th91) {
                                                                        th = th91;
                                                                        Throwable th92 = th;
                                                                        Throwable cause42 = th92.getCause();
                                                                        if (cause42 == null) {
                                                                            throw th92;
                                                                        }
                                                                        throw cause42;
                                                                    }
                                                                } catch (Throwable th93) {
                                                                    th = th93;
                                                                }
                                                            } catch (Throwable th94) {
                                                                th = th94;
                                                            }
                                                        }
                                                    } catch (Exception e5) {
                                                        exc = e5;
                                                        i = declaredMethod;
                                                        i3 = 14;
                                                        i2 = 0;
                                                    }
                                                } catch (Throwable th95) {
                                                    th = th95;
                                                    Throwable th96 = th;
                                                    Throwable cause43 = th96.getCause();
                                                    if (cause43 == null) {
                                                        throw th96;
                                                    }
                                                    throw cause43;
                                                }
                                            } catch (Throwable th97) {
                                                th = th97;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            declaredConstructor = declaredMethod;
                                            i5 = 14;
                                            declaredMethod = i4;
                                            exc = e;
                                            i3 = i5;
                                            i2 = declaredMethod;
                                            i = declaredConstructor;
                                            if (i7 < length) {
                                            }
                                        }
                                    } catch (Throwable th98) {
                                        Throwable cause44 = th98.getCause();
                                        if (cause44 == null) {
                                            throw th98;
                                        }
                                        throw cause44;
                                    }
                                } catch (Throwable th99) {
                                    Throwable cause45 = th99.getCause();
                                    if (cause45 == null) {
                                        throw th99;
                                    }
                                    throw cause45;
                                }
                            } catch (Exception e7) {
                                exc = e7;
                                i = declaredMethod;
                                i3 = 14;
                                i2 = i4;
                                if (i7 < length) {
                                }
                            }
                        }
                        i7++;
                        str3 = str;
                        i4 = i2;
                        declaredMethod = i;
                        i6 = 12;
                        i5 = i3;
                    } catch (Throwable th100) {
                        Throwable cause46 = th100.getCause();
                        if (cause46 == null) {
                            throw th100;
                        }
                        throw cause46;
                    }
                } catch (Throwable th101) {
                    Throwable cause47 = th101.getCause();
                    if (cause47 == null) {
                        throw th101;
                    }
                    throw cause47;
                }
            }
        } catch (Throwable th102) {
            Throwable cause48 = th102.getCause();
            if (cause48 == null) {
                throw th102;
            }
            throw cause48;
        }
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{64993, 64970, 64982, 64991, 64981, 64989, 64983, 64971, 64966, 64978, 65023, 64994, 64961, 64985, 65013, 64992, 64986, 64976, 64907, 64965, 64960, 64980, 64926, 65020, 64988, 64995, 65014, 64999, 64998, 64963, 64990, 64925, 64977, 64967, 65018, 64997};
        onExtraCallback = (char) 51247;
        onExtraCallbackWithResult = 3517709088423046808L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int i7 = 3 - (i * 4);
        int i8 = 102 - (i3 * 3);
        int i9 = 11 - (i2 * 2);
        byte[] bArr = onWarmupCompleted;
        byte[] bArr2 = new byte[i9];
        if (bArr == null) {
            int i10 = i7;
            int i11 = 0;
            i7 = i7 + (-i8) + 2;
            i5 = i10;
            i4 = i11;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i9) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i5 + 1;
            i10 = i12;
            i8 = bArr[i12];
            i11 = i6;
            i7 = i7 + (-i8) + 2;
            i5 = i10;
            i4 = i11;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i9) {
            }
        } else {
            i4 = 0;
            i5 = i7;
            i7 = i8;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i9) {
            }
        }
    }
}
