package o;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Objects;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IADTypeLoaderFactory extends createOpenAdLoader {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 1;
    private static int access100;
    private static char[] asBinder = {27154, 27388, 27388, 27386};
    ISDKTypeFactory IAuthTabCallback;
    private boolean asInterface;
    transient int onExtraCallbackWithResult;
    transient int onNavigationEvent;
    private int onTransact;
    ISDKTypeFactory onWarmupCompleted;

    public IADTypeLoaderFactory(ISDKTypeFactory iSDKTypeFactory, ISDKTypeFactory iSDKTypeFactory2, int i) throws Throwable {
        super((byte) 12, i);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 75, 0}, false, new byte[]{1, 1, 0, 0}, objArr);
        Objects.requireNonNull(iSDKTypeFactory, ((String) objArr[0]).intern());
        this.IAuthTabCallback = iSDKTypeFactory;
        Objects.requireNonNull(iSDKTypeFactory2, "descriptor");
        this.onWarmupCompleted = iSDKTypeFactory2;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 45;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 33;
            access000 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (obj == null) {
            int i7 = i2 + 69;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (getClass() == obj.getClass()) {
            IADTypeLoaderFactory iADTypeLoaderFactory = (IADTypeLoaderFactory) obj;
            if (!this.onWarmupCompleted.equals(iADTypeLoaderFactory.onWarmupCompleted)) {
                return false;
            }
            if (this.IAuthTabCallback.equals(iADTypeLoaderFactory.IAuthTabCallback)) {
                return true;
            }
            int i9 = access100 + 5;
            access000 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = access100 + 29;
        access000 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    private void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = true;
        this.onTransact = ((this.onWarmupCompleted.hashCode() + 31) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = access100 + 13;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access100 + 49;
        int i3 = i2 % 128;
        access000 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!this.asInterface) {
                int i4 = i3 + 37;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    onExtraCallbackWithResult();
                } else {
                    onExtraCallbackWithResult();
                    obj.hashCode();
                    throw null;
                }
            }
            return this.onTransact;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.createNativeAdLoader
    public void onExtraCallback(createRewardAdLoader createrewardadloader) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(createrewardadloader);
        this.onNavigationEvent = createrewardadloader.IAuthTabCallback(this.onWarmupCompleted);
        this.onExtraCallbackWithResult = createrewardadloader.IAuthTabCallback(this.IAuthTabCallback);
        int i4 = access100 + 67;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NameAndType: " + this.IAuthTabCallback + "(" + this.onWarmupCompleted + ")";
        int i2 = access000 + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asBinder;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 35283), 35 - View.getDefaultSize(0, 0), 14239 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $11 + 19;
                $10 = i8 % 128;
                if (i8 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10935), View.MeasureSpec.makeMeasureSpec(0, 0) + 65, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - ExpandableListView.getPackedPositionGroup(0L), 17656 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ((Process.getThreadPriority(0) + 20) >> 6)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, 12486 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
        }
        if (z) {
            int i12 = $11 + 37;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $11 + 121;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
