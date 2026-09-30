package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setOuterDislike {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted = {27260, 27175, 27177, 27177};
    private boolean IAuthTabCallback;
    private setOuterDislike onExtraCallback;
    private setVastVideoHelper onExtraCallbackWithResult;
    private setDirectDestroyWebView onNavigationEvent;

    public setOuterDislike(setVastVideoHelper setvastvideohelper, boolean z) {
        this.onExtraCallbackWithResult = setvastvideohelper;
        if (z) {
            this.onNavigationEvent = new setDirectDestroyWebView(setvastvideohelper.onExtraCallbackWithResult());
        } else {
            this.onNavigationEvent = new setDirectDestroyWebView();
            int i = IAuthTabCallbackDefault + 61;
            onTransact = i % 128;
            int i2 = i % 2;
        }
        int i3 = 2 % 2;
        this.onExtraCallback = null;
        this.IAuthTabCallback = false;
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public setDirectDestroyWebView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        setDirectDestroyWebView setdirectdestroywebview = this.onNavigationEvent;
        int i5 = i3 + 19;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return setdirectdestroywebview;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setOuterDislike IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        setOuterDislike setouterdislike = this.onExtraCallback;
        int i5 = i2 + 43;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return setouterdislike;
    }

    public void IAuthTabCallback(setOuterDislike setouterdislike) {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = setouterdislike;
        int i5 = i3 + 83;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public String asInterface() {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            strIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
            int i3 = 41 / 0;
        } else {
            strIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
        }
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    public String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = this.onExtraCallbackWithResult.IAuthTabCallbackStub();
        int i4 = onTransact + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallbackStub;
        }
        throw null;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 31;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return strOnNavigationEvent;
    }

    public int onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setVastVideoHelper setvastvideohelper = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            return setvastvideohelper.onExtraCallback();
        }
        setvastvideohelper.onExtraCallback();
        throw null;
    }

    public setVastVideoHelper IAuthTabCallback_Parcel() {
        setVastVideoHelper setvastvideohelperAsBinder;
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            setvastvideohelperAsBinder = this.onExtraCallbackWithResult.asBinder();
            int i3 = 56 / 0;
        } else {
            setvastvideohelperAsBinder = this.onExtraCallbackWithResult.asBinder();
        }
        int i4 = onTransact + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return setvastvideohelperAsBinder;
    }

    public boolean onExtraCallback(setOuterDislike setouterdislike) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(setouterdislike.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(setouterdislike.onExtraCallbackWithResult);
        int i3 = IAuthTabCallbackDefault + 101;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public void IAuthTabCallback(String str, String str2, String str3) throws ArrayIndexOutOfBoundsException {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(this.onNavigationEvent, str, str2, str3);
        int i4 = IAuthTabCallbackDefault + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        for (int length = i2 % 2 == 0 ? this.onNavigationEvent.getLength() : this.onNavigationEvent.getLength() - 1; length >= 0; length--) {
            int i3 = onTransact + 59;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (!this.onNavigationEvent.getType(length).equals("ID")) {
                String qName = this.onNavigationEvent.getQName(length);
                Object[] objArr = new Object[1];
                a(new int[]{0, 4, 0, 1}, false, new byte[]{1, 1, 1, 0}, objArr);
                if (qName.equals(((String) objArr[0]).intern())) {
                    this.onNavigationEvent.onWarmupCompleted(length);
                }
            }
        }
    }

    public void onExtraCallbackWithResult() throws ArrayIndexOutOfBoundsException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        for (int length = this.onNavigationEvent.getLength() - 1; length >= 0; length--) {
            int i4 = IAuthTabCallbackDefault + 107;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                String localName = this.onNavigationEvent.getLocalName(length);
                if (this.onNavigationEvent.getValue(length) == null || localName == null || localName.length() == 0) {
                    this.onNavigationEvent.onWarmupCompleted(length);
                }
            } else {
                this.onNavigationEvent.getLocalName(length);
                this.onNavigationEvent.getValue(length);
                throw null;
            }
        }
    }

    public void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = true;
        int i5 = i3 + 3;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 49;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 35282), AndroidCharacter.getMirror('0') - '\r', View.MeasureSpec.getSize(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 10935), 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.red(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i9 = $10 + 103;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Color.green(0) + 29, 17657 - (ViewConfiguration.getScrollBarSize() >> 8), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49466), 70 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 12486 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i12, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $11 + 111;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $11 + 31;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
