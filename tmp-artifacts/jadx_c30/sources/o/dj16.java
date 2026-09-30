package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.NioFileSystemWrappingFileSystem$;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class dj16 extends OutputStream {
    private OutputStream IAuthTabCallback;
    private final long asInterface;
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private long onNavigationEvent;
    private Path onTransact;
    private final byte[] onWarmupCompleted;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static long asBinder = 7798559133331975163L;
    private static int IAuthTabCallbackDefault = -208780570;
    private static char IAuthTabCallbackStub = 27643;

    private static String $$c(byte b, byte b2, byte b3) {
        int i = b2 + 4;
        byte[] bArr = $$a;
        int i2 = b3 * 4;
        int i3 = 110 - b;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            i++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallbackWithResult) {
            return;
        }
        int i5 = i2 + 89;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback();
        if (i6 != 0) {
            throw null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 117;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 27;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), 43 - KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1452, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cResolveSize = (char) (49123 - View.resolveSize(0, 0));
                    int i8 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43;
                    int iLastIndexOf = 1493 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, i8, iLastIndexOf, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 22938 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (Process.myPid() >> 22)), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asBinder ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStub ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i9 = $11 + 21;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private Path tA_(Integer num) throws Throwable {
        int iIntValue;
        String string;
        int i;
        int i2 = 2 % 2;
        if (num == null) {
            int i3 = access000 + 121;
            IAuthTabCallback_Parcel = i3 % 128;
            iIntValue = i3 % 2 != 0 ? this.onExtraCallback * 3 : this.onExtraCallback + 2;
        } else {
            iIntValue = num.intValue();
        }
        String strTD_ = getAdChoicesView.tD_(this.onTransact);
        if (iIntValue <= 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(".z");
            Object[] objArr = new Object[1];
            a((char) (43327 - View.MeasureSpec.getMode(0)), Color.green(0) - 962735431, new char[]{14075}, new char[]{0, 0, 0, 0}, new char[]{47540, 40402, 16326, 47785}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(iIntValue);
            string = sb.toString();
            i = access000 + 91;
            IAuthTabCallback_Parcel = i % 128;
        } else {
            string = ".z" + iIntValue;
            i = IAuthTabCallback_Parcel + 111;
            access000 = i % 128;
        }
        int i4 = i % 2;
        Path parent = this.onTransact.getParent();
        String string2 = parent != null ? parent.toAbsolutePath().toString() : onVideoError.onExtraCallbackWithResult;
        Path path = this.onTransact.getFileSystem().getPath(string2, strTD_ + string);
        if (!Files.exists(path, new LinkOption[0])) {
            return path;
        }
        throw new IOException("split ZIP segment " + strTD_ + string + " already exists");
    }

    private void onExtraCallback() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult) {
            throw new IOException("This archive has already been finished");
        }
        String strTD_ = getAdChoicesView.tD_(this.onTransact);
        this.IAuthTabCallback.close();
        Path path = this.onTransact;
        Files.move(path, path.resolveSibling(strTD_ + ".zip"), NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline2.m());
        this.onExtraCallbackWithResult = true;
        int i4 = access000 + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onNavigationEvent;
        int i4 = i2 + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return j;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i3 + 11;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return i5;
    }

    private void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback == 0) {
            int i5 = i3 + 73;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallback.close();
            Files.move(this.onTransact, tA_(1), NioFileSystemWrappingFileSystem$.ExternalSyntheticApiModelOutline2.m());
            int i7 = access000 + 97;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        Path pathTA_ = tA_(null);
        this.IAuthTabCallback.close();
        this.IAuthTabCallback = Files.newOutputStream(pathTA_, new OpenOption[0]);
        this.onNavigationEvent = 0L;
        this.onTransact = pathTA_;
        this.onExtraCallback++;
    }

    public void onWarmupCompleted(long j) throws Throwable {
        int i = 2 % 2;
        long j2 = this.asInterface;
        if (j > j2) {
            throw new IllegalArgumentException("The unsplittable content size is bigger than the split segment size");
        }
        int i2 = IAuthTabCallback_Parcel + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (j2 - this.onNavigationEvent < j) {
            onWarmupCompleted();
            int i4 = access000 + 95;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = access000;
        int i5 = i4 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        if (i2 <= 0) {
            int i7 = i4 + 107;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onNavigationEvent;
        long j2 = this.asInterface;
        if (j >= j2) {
            onWarmupCompleted();
            write(bArr, i, i2);
            int i8 = access000 + 21;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 87 / 0;
                return;
            }
            return;
        }
        long j3 = i2;
        if (j + j3 > j2) {
            int i10 = ((int) j2) - ((int) j);
            write(bArr, i, i10);
            onWarmupCompleted();
            write(bArr, i + i10, i2 - i10);
            return;
        }
        this.IAuthTabCallback.write(bArr, i, i2);
        this.onNavigationEvent += j3;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = this.onWarmupCompleted;
        bArr[0] = (byte) i;
        write(bArr);
        int i5 = IAuthTabCallback_Parcel + 97;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
    }
}
