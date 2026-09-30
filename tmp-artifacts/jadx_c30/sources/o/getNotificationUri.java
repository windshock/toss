package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.dy7;
import o.getNotificationUri;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getNotificationUri extends getColumnIndex {
    private static int IAuthTabCallbackDefault;
    private static final AppSetIdAndScope1 IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static byte[] access000;
    private static int extraCallbackWithResult;
    private static short[] getInterfaceDescriptor;
    private final SSLSocketFactory asInterface;
    private static final byte[] $$a = {5, -4, ISO7816.INS_READ_BINARY, 1};
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 1;
    private static int access100 = 0;
    private static int writeTypedObject = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = b * 3;
        byte[] bArr = $$a;
        int i5 = (i * 3) + 115;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i5 += i8;
            bArr2[i3] = (byte) i5;
            i6++;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i6];
            i5 += i8;
            bArr2[i3] = (byte) i5;
            i6++;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i6++;
            if (i3 == i7) {
            }
        }
    }

    static {
        extraCallbackWithResult = 0;
        onNavigationEvent();
        IAuthTabCallbackStub = ea10.onWarmupCompleted(getNotificationUri.class);
        int i = extraCallback + 97;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    @Override // o.getColumnIndex
    public /* bridge */ /* synthetic */ void IAuthTabCallback(Duration duration) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(duration);
        int i4 = writeTypedObject + 79;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    @Override // o.getColumnIndex
    public /* bridge */ /* synthetic */ Duration onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onExtraCallbackWithResult();
            throw null;
        }
        Duration durationOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = access100 + 109;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return durationOnExtraCallbackWithResult;
    }

    @Override // o.getColumnIndex
    public /* bridge */ /* synthetic */ String toString() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String string = super.toString();
        int i4 = writeTypedObject + 51;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return string;
    }

    public CompletionStage<onChildViewAdded> onExtraCallbackWithResult(onChildViewAdded onchildviewadded) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CompletionStage<onChildViewAdded> completionStageOnExtraCallback = onExtraCallback(onchildviewadded, this.onNavigationEvent);
        int i4 = access100 + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return completionStageOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CompletableFuture onExtraCallbackWithResult(getNotificationUri getnotificationuri, onChildViewAdded onchildviewadded, String str, byte[] bArr, long j, int i, Executor executor, dy7.onExtraCallback onextracallback, Throwable th) {
        CompletableFuture completableFutureOnExtraCallbackWithResult;
        onChildViewAdded onchildviewadded2;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 49;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (th != null) {
                return getnotificationuri.onNavigationEvent(onchildviewadded, "could not acquire lock to send request", th);
            }
            try {
                onExtraCallback onextracallbackOnExtraCallbackWithResult = getnotificationuri.onExtraCallbackWithResult(str, bArr, j);
                if (onextracallbackOnExtraCallbackWithResult.onWarmupCompleted == 0) {
                    onchildviewadded2 = new onChildViewAdded(onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult);
                    getnotificationuri.onWarmupCompleted(onchildviewadded, onchildviewadded2, onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult, getnotificationuri.onWarmupCompleted);
                    int i5 = access100 + 25;
                    writeTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    onchildviewadded2 = new onChildViewAdded(0);
                    onchildviewadded2.IAuthTabCallback().onTransact(onextracallbackOnExtraCallbackWithResult.onWarmupCompleted);
                }
                onchildviewadded2.onWarmupCompleted(getnotificationuri);
                return CompletableFuture.completedFuture(onchildviewadded2);
            } catch (SocketTimeoutException e) {
                completableFutureOnExtraCallbackWithResult = getnotificationuri.onExtraCallbackWithResult(onchildviewadded, e);
                onextracallback.onWarmupCompleted(i, executor);
                int i7 = access100 + 51;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                return completableFutureOnExtraCallbackWithResult;
            } catch (IOException e2) {
                e = e2;
                completableFutureOnExtraCallbackWithResult = getnotificationuri.onExtraCallbackWithResult(e);
                onextracallback.onWarmupCompleted(i, executor);
                int i72 = access100 + 51;
                writeTypedObject = i72 % 128;
                int i82 = i72 % 2;
                return completableFutureOnExtraCallbackWithResult;
            } catch (URISyntaxException e3) {
                e = e3;
                completableFutureOnExtraCallbackWithResult = getnotificationuri.onExtraCallbackWithResult(e);
                onextracallback.onWarmupCompleted(i, executor);
                int i722 = access100 + 51;
                writeTypedObject = i722 % 128;
                int i822 = i722 % 2;
                return completableFutureOnExtraCallbackWithResult;
            }
        } finally {
            onextracallback.onWarmupCompleted(i, executor);
        }
    }

    public CompletionStage<onChildViewAdded> onExtraCallback(final onChildViewAdded onchildviewadded, final Executor executor) {
        int i = 2 % 2;
        final byte[] bArrAccess100 = IAuthTabCallback(onchildviewadded).access100();
        final String strOnNavigationEvent = onNavigationEvent(bArrAccess100);
        final long jOnExtraCallback = onExtraCallback();
        final int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
        CompletableFuture completableFuture = this.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallback, iOnNavigationEvent, executor).handleAsync(new BiFunction() { // from class: org.xbill.DNS.DohResolver$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return getNotificationUri.onExtraCallbackWithResult(this.f$0, onchildviewadded, strOnNavigationEvent, bArrAccess100, jOnExtraCallback, iOnNavigationEvent, executor, (dy7.onExtraCallback) obj, (Throwable) obj2);
            }
        }, executor).thenCompose(Function.identity()).toCompletableFuture();
        final Duration durationMinus = this.onExtraCallback.minus(onExtraCallback() - jOnExtraCallback, ChronoUnit.NANOS);
        CompletableFuture completableFutureExceptionally = lt55.IAuthTabCallback(completableFuture, durationMinus.toMillis(), TimeUnit.MILLISECONDS).exceptionally(new Function() { // from class: org.xbill.DNS.DohResolver$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return getNotificationUri.IAuthTabCallback(iOnNavigationEvent, onchildviewadded, durationMinus, (Throwable) obj);
            }
        });
        int i2 = access100 + 69;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return completableFutureExceptionally;
        }
        throw null;
    }

    public static /* synthetic */ onChildViewAdded IAuthTabCallback(int i, onChildViewAdded onchildviewadded, Duration duration, Throwable th) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            if (th instanceof TimeoutException) {
                throw new CompletionException(new TimeoutException("Query " + i + " for " + onchildviewadded.onNavigationEvent().access000() + "/" + lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()) + " timed out in remaining " + duration.toMillis() + "ms"));
            }
            if (th instanceof CompletionException) {
                int i5 = i3 + 125;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw ((CompletionException) th);
                }
                int i6 = 60 / 0;
                throw ((CompletionException) th);
            }
            throw new CompletionException(th);
        }
        boolean z = th instanceof TimeoutException;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallback {
        private final byte[] onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public onExtraCallback(int i, byte[] bArr) {
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return onExtraCallback() == onextracallback.onExtraCallback() && Arrays.equals(onNavigationEvent(), onextracallback.onNavigationEvent());
        }

        public int hashCode() {
            return ((onExtraCallback() + 59) * 59) + Arrays.hashCode(onNavigationEvent());
        }

        public String toString() {
            return "DohResolver.SendAndGetMessageBytesResponse(rc=" + onExtraCallback() + ", responseBytes=" + Arrays.toString(onNavigationEvent()) + ")";
        }

        public int onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public byte[] onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0185, code lost:
    
        throw new java.net.SocketTimeoutException("Timed out waiting for response data, got " + r7 + " of " + r0 + " expected bytes");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private onExtraCallback onExtraCallbackWithResult(String str, byte[] bArr, long j) throws Throwable {
        String strIntern;
        onExtraCallback onextracallback;
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            int i2 = access100 + 117;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.asInterface);
        }
        if (this.onTransact) {
            Object[] objArr = new Object[1];
            a((short) ((-125) - Color.red(0)), (byte) (Color.blue(0) + 10), View.MeasureSpec.getMode(0) + 271108653, 1377727148 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (-103) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            strIntern = ((String) objArr[0]).intern();
            int i4 = access100 + 125;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr2 = new Object[1];
            a((short) ((-18) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), (byte) ((-84) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 271108655 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1377727139, TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) - 104, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        httpURLConnection.setRequestMethod(strIntern);
        httpURLConnection.setRequestProperty("Content-Type", "application/dns-message");
        httpURLConnection.setRequestProperty("Accept", "application/dns-message");
        Duration duration = this.onExtraCallback;
        long jOnExtraCallback = onExtraCallback();
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        Duration durationMinus = duration.minus(jOnExtraCallback - j, chronoUnit);
        if (durationMinus.toMillis() <= 0) {
            throw new SocketTimeoutException("No time left to connect");
        }
        int i6 = access100 + 57;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        httpURLConnection.setConnectTimeout((int) durationMinus.toMillis());
        if (this.onTransact) {
            int i8 = writeTypedObject + 85;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            httpURLConnection.setDoOutput(true);
        }
        httpURLConnection.connect();
        Duration durationMinus2 = this.onExtraCallback.minus(onExtraCallback() - j, chronoUnit);
        if (durationMinus2.toMillis() <= 0) {
            throw new SocketTimeoutException("No time left to request data");
        }
        httpURLConnection.setReadTimeout((int) durationMinus2.toMillis());
        if (!(!this.onTransact)) {
            httpURLConnection.getOutputStream().write(bArr);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            onNavigationEvent(httpURLConnection.getInputStream());
            onNavigationEvent(httpURLConnection.getErrorStream());
            onExtraCallback onextracallback2 = new onExtraCallback(2, null);
            int i10 = access100 + 53;
            writeTypedObject = i10 % 128;
            int i11 = i10 % 2;
            return onextracallback2;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                if (httpURLConnection.getContentLength() >= 0) {
                    int contentLength = httpURLConnection.getContentLength();
                    byte[] bArr2 = new byte[contentLength];
                    int i12 = 0;
                    while (true) {
                        int i13 = inputStream.read(bArr2, i12, contentLength - i12);
                        if (i13 > 0) {
                            i12 += i13;
                            Duration durationMinus3 = this.onExtraCallback.minus(onExtraCallback() - j, ChronoUnit.NANOS);
                            if (i12 != contentLength && (durationMinus3.isNegative() || durationMinus3.isZero())) {
                                break;
                            }
                        } else {
                            if (i12 < contentLength) {
                                throw new EOFException("Could not read expected content length");
                            }
                            onextracallback = new onExtraCallback(0, bArr2);
                        }
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr3 = new byte[PKIFailureInfo.certConfirmed];
                        while (true) {
                            int i14 = inputStream.read(bArr3, 0, PKIFailureInfo.certConfirmed);
                            if (i14 <= 0) {
                                onextracallback = new onExtraCallback(0, byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.close();
                                break;
                            }
                            Duration durationMinus4 = this.onExtraCallback.minus(onExtraCallback() - j, ChronoUnit.NANOS);
                            if (durationMinus4.isNegative() || durationMinus4.isZero()) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, i14);
                        }
                        throw new SocketTimeoutException("Timed out waiting for response data, got " + byteArrayOutputStream.size() + " bytes so far");
                    } finally {
                    }
                }
                inputStream.close();
                return onextracallback;
            } finally {
            }
        } catch (IOException e) {
            onNavigationEvent(httpURLConnection.getErrorStream());
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x022e A[PHI: r3
      0x022e: PHI (r3v9 int) = (r3v8 int), (r3v42 int) binds: [B:53:0x022c, B:50:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0230 A[PHI: r3
      0x0230: PHI (r3v39 int) = (r3v8 int), (r3v42 int) binds: [B:53:0x022c, B:50:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            char c = 3;
            if (z) {
                byte[] bArr = access000;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 121;
                        $11 = i9 % 128;
                        if (i9 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 12844);
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55;
                                int i10 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2166;
                                byte b2 = $$a[c];
                                byte b3 = (byte) (b2 - 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, keyRepeatTimeout, i10, -299036574, false, $$c(b3, b3, (byte) (-b2)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8 <<= 1;
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    char cMyTid = (char) ((Process.myTid() >> 22) + 12843);
                                    int iBlue = Color.blue(0) + 55;
                                    int iRgb = Color.rgb(0, 0, 0) + 16779383;
                                    byte b4 = $$a[3];
                                    byte b5 = (byte) (b4 - 1);
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, iBlue, iRgb, -299036574, false, $$c(b5, b5, (byte) (-b4)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i8++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        i6 = 2;
                        f = 0.0f;
                        c = 3;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $10 + 85;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = access000;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 43424), 42 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getSize(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                    int i13 = $11 + 25;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    iIntValue = (short) (((short) (getInterfaceDescriptor[i + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i15 = $10;
                int i16 = i15 + 41;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    i4 = ((i >> iIntValue) << 3) - ((int) (IAuthTabCallbackDefault - 4629411779493505016L));
                    if (z) {
                        i5 = 1;
                    } else {
                        int i17 = i15 + 73;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallbackDefault ^ (-4629411779493505016L)));
                    if (!(!z)) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback_Parcel), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), (ViewConfiguration.getEdgeSlop() >> 16) + 86, (KeyEvent.getMaxKeyCode() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access000;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i19 = 0;
                    while (i19 < length2) {
                        int i20 = $10 + 85;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            bArr5[i19] = (byte) (bArr4[i19] * (-4629411779493505016L));
                        } else {
                            bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                            i19++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = access000;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = getInterfaceDescriptor;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private void onNavigationEvent(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 93;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
            if (inputStream == null) {
                return;
            }
        } else if (inputStream == null) {
            return;
        }
        int i5 = i2 + 101;
        access100 = i5 % 128;
        try {
            try {
                do {
                } while (inputStream.read(i5 % 2 != 0 ? new byte[26195] : new byte[PKIFailureInfo.certConfirmed]) > 0);
                inputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // o.getColumnIndex
    protected <T> CompletableFuture<T> onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        completableFuture.completeExceptionally(th);
        int i2 = writeTypedObject + 51;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return completableFuture;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = 1267789275;
        IAuthTabCallbackStubProxy = -1538795421;
        IAuthTabCallback_Parcel = 161895852;
        access000 = new byte[]{ISOFileInfo.DATA_BYTES1, ISOFileInfo.FILE_IDENTIFIER, 122, -69, 108, 8, 8};
    }
}
