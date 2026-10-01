package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.time.Duration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import o.lt37;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverConfig;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt37 implements Resolver {
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int access000;
    private static byte[] access100;
    private static int extraCallbackWithResult;
    private static short[] getInterfaceDescriptor;
    private static InetSocketAddress onExtraCallback;
    private static final AppSetIdAndScope1 onWarmupCompleted;
    private InetSocketAddress IAuthTabCallback;
    private lt42 IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private InetSocketAddress asBinder;
    private Duration asInterface;
    private TRANS_ImportCert onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private fby10 onTransact;
    private static final byte[] $$a = {68, 4, -12, -68};
    private static final int $$b = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int writeTypedObject = 0;
    private static int readTypedObject = 0;
    private static int extraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (i * 2) + 115;
        int i6 = i2 + 4;
        int i7 = (s * 3) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5 += i6;
            i6 = i8;
            i3 = i4;
            int i9 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i9;
            i6 = bArr[i9];
            i5 += i6;
            i6 = i8;
            i3 = i4;
            int i92 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static {
        extraCallbackWithResult = 1;
        onWarmupCompleted();
        onWarmupCompleted = ea10.onWarmupCompleted((Class<?>) lt37.class);
        onExtraCallback = new InetSocketAddress(InetAddress.getLoopbackAddress(), 53);
        int i = writeTypedObject + 69;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public lt37() throws UnknownHostException {
        this((String) null);
    }

    public lt37(String str) throws Throwable {
        InetAddress byName;
        this.onTransact = new fby10(1280, 0, 0, 0);
        this.asInterface = Duration.ofSeconds(10L);
        this.onExtraCallbackWithResult = new GetSignPrikey();
        if (str == null) {
            InetSocketAddress inetSocketAddressOnExtraCallbackWithResult = ResolverConfig.onNavigationEvent().onExtraCallbackWithResult();
            this.IAuthTabCallback = inetSocketAddressOnExtraCallbackWithResult;
            if (inetSocketAddressOnExtraCallbackWithResult == null) {
                this.IAuthTabCallback = onExtraCallback;
                int i = readTypedObject + 91;
                extraCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 / 5;
                    return;
                } else {
                    int i3 = 2 % 2;
                    return;
                }
            }
            return;
        }
        Object[] objArr = new Object[1];
        a((short) ((-2) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (byte) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + Imgproc.COLOR_YUV2BGRA_YVYU), 1522204875 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-499587592) + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-68) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        if (((String) objArr[0]).intern().equals(str)) {
            int i4 = extraCallback + 35;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            byName = InetAddress.getLoopbackAddress();
            int i6 = 2 % 2;
        } else {
            byName = InetAddress.getByName(str);
        }
        this.IAuthTabCallback = new InetSocketAddress(byName, 53);
    }

    public lt37(InetSocketAddress inetSocketAddress) {
        this.onTransact = new fby10(1280, 0, 0, 0);
        this.asInterface = Duration.ofSeconds(10L);
        this.onExtraCallbackWithResult = new GetSignPrikey();
        Objects.requireNonNull(inetSocketAddress, "host must not be null");
        this.IAuthTabCallback = inetSocketAddress;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        char c;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ((byte) KeyEvent.getModifierMetaStateMask())), 42 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 87;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = access100;
                if (bArr != null) {
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), 55 - View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2166, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = access100;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), 42 - KeyEvent.normalizeMetaState(0), 22439 - Gravity.getAbsoluteGravity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (getInterfaceDescriptor[i + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(access000), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 86, (ViewConfiguration.getEdgeSlop() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access100;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    int i13 = $10 + 115;
                    $11 = i13 % 128;
                    i5 = 2;
                    int i14 = i13 % 2;
                    bArr4 = bArr5;
                } else {
                    i5 = 2;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 97;
                    $11 = i15 % 128;
                    int i16 = i15 % i5;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i17 = $11;
                    int i18 = i17 + 101;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    if (z) {
                        int i20 = i17 + 79;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            byte[] bArr6 = access100;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >> 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback >> (((byte) (((byte) (bArr6[r7] % (-4629411779493505016L))) % s)) ^ b));
                        } else {
                            byte[] bArr7 = access100;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
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
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void IAuthTabCallback(Duration duration) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = duration;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.xbill.DNS.Resolver
    public Duration onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 123;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Duration duration = this.asInterface;
        int i4 = i2 + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return duration;
    }

    private onChildViewAdded onExtraCallbackWithResult(byte[] bArr) throws WireParseException {
        int i = 2 % 2;
        try {
            onChildViewAdded onchildviewadded = new onChildViewAdded(bArr);
            int i2 = extraCallback + 35;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return onchildviewadded;
        } catch (IOException e) {
            if (!(e instanceof WireParseException)) {
                throw new WireParseException("Error parsing message", e);
            }
            throw ((WireParseException) e);
        }
    }

    private void onWarmupCompleted(onChildViewAdded onchildviewadded, onChildViewAdded onchildviewadded2, byte[] bArr) {
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        lt42 lt42Var = this.IAuthTabCallbackDefault;
        if (lt42Var == null) {
            return;
        }
        int iOnExtraCallbackWithResult = lt42Var.onExtraCallbackWithResult(onchildviewadded2, bArr, onchildviewadded.onWarmupCompleted());
        onchildviewadded.IAuthTabCallback().onNavigationEvent();
        Rcode.onNavigationEvent(iOnExtraCallbackWithResult);
        int i4 = extraCallback + 37;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    private void IAuthTabCallback(onChildViewAdded onchildviewadded) {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (this.onTransact != null && onchildviewadded.onExtraCallback() == null) {
            onchildviewadded.onNavigationEvent(this.onTransact, 3);
            int i4 = extraCallback + 75;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = readTypedObject + 11;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private int onExtraCallback(onChildViewAdded onchildviewadded) {
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        fby10 fby10VarOnExtraCallback = onchildviewadded.onExtraCallback();
        if (fby10VarOnExtraCallback == null) {
            int i4 = readTypedObject + 29;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Imgcodecs.IMWRITE_AVIF_QUALITY;
        }
        int iIAuthTabCallbackStub = fby10VarOnExtraCallback.IAuthTabCallbackStub();
        int i6 = readTypedObject + 115;
        extraCallback = i6 % 128;
        int i7 = i6 % 2;
        return iIAuthTabCallbackStub;
    }

    @Override // org.xbill.DNS.Resolver
    public CompletionStage<onChildViewAdded> onExtraCallbackWithResult(onChildViewAdded onchildviewadded) {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(onchildviewadded, ForkJoinPool.commonPool());
            throw null;
        }
        CompletionStage<onChildViewAdded> completionStageOnExtraCallback = onExtraCallback(onchildviewadded, ForkJoinPool.commonPool());
        int i3 = extraCallback + 113;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return completionStageOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(lt37 lt37Var, CompletableFuture completableFuture, onChildViewAdded onchildviewadded) {
        int i = 2 % 2;
        int i2 = extraCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        try {
            completableFuture.complete(lt37Var.onNavigationEvent(onchildviewadded));
            int i4 = readTypedObject + 19;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (IOException e) {
            completableFuture.completeExceptionally(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // org.xbill.DNS.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CompletionStage<onChildViewAdded> onExtraCallback(final onChildViewAdded onchildviewadded, Executor executor) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
            if (onchildviewadded.IAuthTabCallback().IAuthTabCallback() == 0) {
                Record recordOnNavigationEvent = onchildviewadded.onNavigationEvent();
                if (recordOnNavigationEvent != null && recordOnNavigationEvent.extraCallback() == 252) {
                    final CompletableFuture completableFuture = new CompletableFuture();
                    CompletableFuture.runAsync(new Runnable() { // from class: org.xbill.DNS.SimpleResolver$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lt37.onExtraCallbackWithResult(this.f$0, completableFuture, onchildviewadded);
                        }
                    }, executor);
                    return completableFuture;
                }
            }
        } else if (onchildviewadded.IAuthTabCallback().IAuthTabCallback() == 0) {
        }
        onChildViewAdded onchildviewaddedClone = onchildviewadded.clone();
        IAuthTabCallback(onchildviewaddedClone);
        lt42 lt42Var = this.IAuthTabCallbackDefault;
        if (lt42Var != null) {
            int i4 = extraCallback + 77;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            onchildviewaddedClone.IAuthTabCallback(lt42Var, 0, (lt46) null);
        }
        return IAuthTabCallback(onchildviewaddedClone, this.IAuthTabCallbackStub, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CompletableFuture<onChildViewAdded> IAuthTabCallback(final onChildViewAdded onchildviewadded, boolean z, final Executor executor) {
        boolean z2;
        int i = 2 % 2;
        int i2 = extraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        final int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
        final boolean z3 = false;
        if (onchildviewadded.IAuthTabCallback().IAuthTabCallback() != 5) {
            int i4 = readTypedObject + 69;
            int i5 = i4 % 128;
            extraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 21;
            readTypedObject = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 % 4;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            byte[] bArrIAuthTabCallback = onchildviewadded.IAuthTabCallback(Settings.DEFAULT_INITIAL_WINDOW_SIZE, z2);
            int iOnExtraCallback = onExtraCallback(onchildviewadded);
            if (!z) {
                int i9 = extraCallback + 69;
                readTypedObject = i9 % 128;
                if (i9 % 2 == 0 ? bArrIAuthTabCallback.length > iOnExtraCallback : bArrIAuthTabCallback.length > iOnExtraCallback) {
                    z3 = true;
                }
            }
            AppSetIdAndScope1 appSetIdAndScope1 = onWarmupCompleted;
            if (!(true ^ appSetIdAndScope1.onNavigationEvent())) {
                new Object[]{onchildviewadded.onNavigationEvent().access000(), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), Integer.valueOf(iOnNavigationEvent), z3 ? "tcp" : "udp", this.IAuthTabCallback.getAddress().getHostAddress(), Integer.valueOf(this.IAuthTabCallback.getPort()), onchildviewadded};
            } else if (appSetIdAndScope1.onExtraCallback()) {
                new Object[]{onchildviewadded.onNavigationEvent().access000(), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), Integer.valueOf(iOnNavigationEvent), z3 ? "tcp" : "udp", this.IAuthTabCallback.getAddress().getHostAddress(), Integer.valueOf(this.IAuthTabCallback.getPort())};
            }
            return (z3 ? this.onExtraCallbackWithResult.onNavigationEvent().onWarmupCompleted(this.asBinder, this.IAuthTabCallback, onchildviewadded, bArrIAuthTabCallback, this.asInterface) : this.onExtraCallbackWithResult.IAuthTabCallback().onNavigationEvent(this.asBinder, this.IAuthTabCallback, onchildviewadded, bArrIAuthTabCallback, iOnExtraCallback, this.asInterface)).thenComposeAsync(new Function() { // from class: org.xbill.DNS.SimpleResolver$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return lt37.onWarmupCompleted(this.f$0, iOnNavigationEvent, onchildviewadded, z3, executor, (byte[]) obj);
                }
            }, executor);
        } catch (obyycx1 e) {
            CompletableFuture<onChildViewAdded> completableFuture = new CompletableFuture<>();
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ CompletionStage onWarmupCompleted(lt37 lt37Var, int i, onChildViewAdded onchildviewadded, boolean z, Executor executor, byte[] bArr) {
        int i2 = 2 % 2;
        CompletableFuture completableFuture = new CompletableFuture();
        if (bArr.length < 12) {
            completableFuture.completeExceptionally(new WireParseException("invalid DNS header - too short"));
            return completableFuture;
        }
        int i3 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        if (i3 != i) {
            completableFuture.completeExceptionally(new WireParseException("invalid message id: expected " + i + "; got id " + i3));
            int i4 = readTypedObject + 75;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return completableFuture;
        }
        try {
            onChildViewAdded onchildviewaddedOnExtraCallbackWithResult = lt37Var.onExtraCallbackWithResult(bArr);
            if (onchildviewadded.IAuthTabCallback().IAuthTabCallback() == 5) {
                if (onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().IAuthTabCallback() != 5) {
                    completableFuture.completeExceptionally(new WireParseException("invalid message: opcode response is not UPDATE"));
                    return completableFuture;
                }
            } else {
                if (onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent() == null) {
                    completableFuture.completeExceptionally(new WireParseException("invalid message: question section missing"));
                    return completableFuture;
                }
                if (!onchildviewadded.onNavigationEvent().access000().equals(onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().access000())) {
                    completableFuture.completeExceptionally(new WireParseException("invalid name in message: expected " + onchildviewadded.onNavigationEvent().access000() + "; got " + onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().access000()));
                    return completableFuture;
                }
                if (onchildviewadded.onNavigationEvent().getInterfaceDescriptor() != onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().getInterfaceDescriptor()) {
                    completableFuture.completeExceptionally(new WireParseException("invalid class in message: expected " + ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()) + "; got " + ryzbycx.onWarmupCompleted(onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().getInterfaceDescriptor())));
                    return completableFuture;
                }
                if (onchildviewadded.onNavigationEvent().extraCallback() != onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().extraCallback()) {
                    completableFuture.completeExceptionally(new WireParseException("invalid type in message: expected " + lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()) + "; got " + lt54.onNavigationEvent(onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent().extraCallback())));
                    return completableFuture;
                }
            }
            lt37Var.onWarmupCompleted(onchildviewadded, onchildviewaddedOnExtraCallbackWithResult, bArr);
            if (!z) {
                int i6 = readTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
                extraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 26 / 0;
                    if (!lt37Var.onNavigationEvent) {
                        if (onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallback(6)) {
                            int i8 = extraCallback + 43;
                            readTypedObject = i8 % 128;
                            return i8 % 2 != 0 ? lt37Var.IAuthTabCallback(onchildviewadded, false, executor) : lt37Var.IAuthTabCallback(onchildviewadded, true, executor);
                        }
                    }
                } else if (!lt37Var.onNavigationEvent) {
                }
            }
            onchildviewaddedOnExtraCallbackWithResult.onWarmupCompleted(lt37Var);
            completableFuture.complete(onchildviewaddedOnExtraCallbackWithResult);
            return completableFuture;
        } catch (WireParseException e) {
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }

    private onChildViewAdded onNavigationEvent(onChildViewAdded onchildviewadded) throws IOException {
        int i = 2 % 2;
        lt64 lt64VarOnExtraCallbackWithResult = lt64.onExtraCallbackWithResult(onchildviewadded.onNavigationEvent().access000(), this.IAuthTabCallback, this.IAuthTabCallbackDefault);
        lt64VarOnExtraCallbackWithResult.onExtraCallback(this.asInterface);
        lt64VarOnExtraCallbackWithResult.onNavigationEvent(this.asBinder);
        try {
            lt64VarOnExtraCallbackWithResult.onNavigationEvent();
            List<Record> listOnWarmupCompleted = lt64VarOnExtraCallbackWithResult.onWarmupCompleted();
            onChildViewAdded onchildviewadded2 = new onChildViewAdded(onchildviewadded.IAuthTabCallback().onNavigationEvent());
            onchildviewadded2.IAuthTabCallback().IAuthTabCallback(5);
            onchildviewadded2.IAuthTabCallback().IAuthTabCallback(0);
            onchildviewadded2.onNavigationEvent(onchildviewadded.onNavigationEvent(), 0);
            Iterator<Record> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                int i2 = extraCallback + 107;
                readTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    onchildviewadded2.onNavigationEvent(it.next(), 0);
                } else {
                    onchildviewadded2.onNavigationEvent(it.next(), 1);
                }
            }
            int i3 = readTypedObject + 113;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onchildviewadded2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (lt62 e) {
            throw new WireParseException(e.getMessage());
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SimpleResolver [" + this.IAuthTabCallback + "]";
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback_Parcel = 16983869;
        IAuthTabCallbackStubProxy = -1538795445;
        access000 = -1182744016;
        access100 = new byte[]{-74};
    }
}
