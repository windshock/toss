package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class initSingleCardInTwoCardStyleLandscape implements jc3, Closeable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallbackStub = {27299, 27282, 27298, 27309, 27286, 27260, 27175, 27177, 27177};
    private static int asBinder = 1;
    private static int onTransact;
    private final Stack<okzb> IAuthTabCallback;
    private onExtraCallback asInterface;
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final ok21 onNavigationEvent;
    private IAuthTabCallback onWarmupCompleted;

    public enum onExtraCallback {
        INITIAL,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        DONE,
        CLOSED
    }

    protected abstract void IAuthTabCallback();

    protected abstract void IAuthTabCallback(String str);

    protected abstract void IAuthTabCallbackDefault();

    protected abstract void IAuthTabCallbackStub();

    protected abstract void asBinder();

    protected abstract void asInterface();

    protected abstract void onExtraCallback(long j);

    protected abstract void onExtraCallback(String str);

    protected abstract void onExtraCallback(RFEndCardBackUpLayout2 rFEndCardBackUpLayout2);

    protected abstract void onExtraCallback(ObjectId objectId);

    protected boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        return i2 % 2 != 0;
    }

    protected abstract void onExtraCallbackWithResult();

    protected abstract void onExtraCallbackWithResult(String str);

    protected abstract void onExtraCallbackWithResult(ea41 ea41Var);

    protected abstract void onExtraCallbackWithResult(boolean z);

    protected abstract void onNavigationEvent();

    protected abstract void onNavigationEvent(double d);

    protected abstract void onNavigationEvent(long j);

    protected void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    protected abstract void onNavigationEvent(initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape);

    protected abstract void onNavigationEvent(p_ p_Var);

    protected abstract void onNavigationEvent(Decimal128 decimal128);

    protected abstract void onWarmupCompleted();

    protected abstract void onWarmupCompleted(int i);

    protected abstract void onWarmupCompleted(String str);

    public initSingleCardInTwoCardStyleLandscape(ok21 ok21Var) {
        this(ok21Var, new pmi3());
    }

    protected initSingleCardInTwoCardStyleLandscape(ok21 ok21Var, okzb okzbVar) {
        Stack<okzb> stack = new Stack<>();
        this.IAuthTabCallback = stack;
        if (okzbVar == null) {
            throw new IllegalArgumentException("Validator can not be null");
        }
        this.onNavigationEvent = ok21Var;
        stack.push(okzbVar);
        this.asInterface = onExtraCallback.INITIAL;
        int i = asBinder + 89;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    protected String IAuthTabCallback_Parcel() {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 43;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.onWarmupCompleted.onExtraCallbackWithResult;
            int i3 = 69 / 0;
        } else {
            str = this.onWarmupCompleted.onExtraCallbackWithResult;
        }
        int i4 = onTransact + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    protected boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected void onExtraCallback(onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = onextracallback;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 107;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public onExtraCallback access100() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = this.asInterface;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return onextracallback;
    }

    public IAuthTabCallback onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = iAuthTabCallback;
        int i5 = i2 + 15;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        float f = 0.0f;
        Throwable th = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 95;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 35283), 35 - ((Process.getThreadPriority(0) + 20) >> 6), ((byte) KeyEvent.getModifierMetaStateMask()) + ISOFileInfo.A0, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                    f = 0.0f;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = $11 + 35;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - Process.getGidForName(BuildConfig.FLAVOR)), 65 - Color.red(0), 16718 - View.getDefaultSize(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(th, objArr3)).charValue();
                        th.hashCode();
                        throw th;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - ExpandableListView.getPackedPositionType(0L)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 65, 16717 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(th, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 29, 17657 - View.combineMeasuredStates(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(th, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 49467), (-16777146) - Color.rgb(0, 0, 0), 12486 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                th = null;
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i16 = $10 + 99;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i17 = $11 + 95;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // o.jc3
    public void onActivityLayout() {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeStartDocument", onExtraCallback.INITIAL, onExtraCallback.VALUE, onExtraCallback.SCOPE_DOCUMENT, onExtraCallback.DONE);
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            int i4 = asBinder + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (iAuthTabCallback.onExtraCallbackWithResult != null) {
                int i6 = onTransact + 119;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    Stack<okzb> stack = this.IAuthTabCallback;
                    stack.push(stack.peek().onNavigationEvent(IAuthTabCallback_Parcel()));
                    throw null;
                }
                Stack<okzb> stack2 = this.IAuthTabCallback;
                stack2.push(stack2.peek().onNavigationEvent(IAuthTabCallback_Parcel()));
            }
        }
        int i7 = this.onExtraCallback + 1;
        this.onExtraCallback = i7;
        if (i7 > this.onNavigationEvent.onExtraCallback()) {
            throw new ycxsya1("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
        }
        int i8 = onTransact + 107;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            asInterface();
            onExtraCallback(onExtraCallback.NAME);
            throw null;
        }
        asInterface();
        onExtraCallback(onExtraCallback.NAME);
        int i9 = asBinder + 105;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 72 / 0;
        }
    }

    @Override // o.jc3
    public void readTypedObject() {
        int i = 2 % 2;
        IAuthTabCallback("writeEndDocument", onExtraCallback.NAME);
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnWarmupCompleted = onTransact().onWarmupCompleted();
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx = RFEndCardBackUpLayoutycx.DOCUMENT;
        if (rFEndCardBackUpLayoutycxOnWarmupCompleted != rFEndCardBackUpLayoutycx) {
            int i2 = onTransact + 107;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx2 = RFEndCardBackUpLayoutycx.SCOPE_DOCUMENT;
            if (rFEndCardBackUpLayoutycxOnWarmupCompleted != rFEndCardBackUpLayoutycx2) {
                int i4 = onTransact + 59;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    RFEndCardBackUpLayoutycx[] rFEndCardBackUpLayoutycxArr = new RFEndCardBackUpLayoutycx[5];
                    rFEndCardBackUpLayoutycxArr[1] = rFEndCardBackUpLayoutycx;
                    rFEndCardBackUpLayoutycxArr[0] = rFEndCardBackUpLayoutycx2;
                    onNavigationEvent("WriteEndDocument", rFEndCardBackUpLayoutycxOnWarmupCompleted, rFEndCardBackUpLayoutycxArr);
                } else {
                    onNavigationEvent("WriteEndDocument", rFEndCardBackUpLayoutycxOnWarmupCompleted, rFEndCardBackUpLayoutycx, rFEndCardBackUpLayoutycx2);
                }
            }
        }
        if (this.onWarmupCompleted.onNavigationEvent() != null) {
            int i5 = onTransact + 39;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                String unused = this.onWarmupCompleted.onNavigationEvent().onExtraCallbackWithResult;
                throw null;
            }
            if (this.onWarmupCompleted.onNavigationEvent().onExtraCallbackWithResult != null) {
                this.IAuthTabCallback.pop();
            }
        }
        this.onExtraCallback--;
        IAuthTabCallback();
        if (onTransact() == null || onTransact().onWarmupCompleted() == RFEndCardBackUpLayoutycx.TOP_LEVEL) {
            onExtraCallback(onExtraCallback.DONE);
            return;
        }
        int i6 = asBinder + 85;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            onExtraCallback(IAuthTabCallbackStubProxy());
        } else {
            onExtraCallback(IAuthTabCallbackStubProxy());
            int i7 = 47 / 0;
        }
    }

    @Override // o.jc3
    public void extraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = onExtraCallback.VALUE;
        IAuthTabCallback("writeStartArray", onextracallback);
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            int i4 = onTransact + 73;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (iAuthTabCallback.onExtraCallbackWithResult != null) {
                Stack<okzb> stack = this.IAuthTabCallback;
                stack.push(stack.peek().onNavigationEvent(IAuthTabCallback_Parcel()));
                int i6 = onTransact + 11;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
            }
        }
        int i8 = this.onExtraCallback + 1;
        this.onExtraCallback = i8;
        if (i8 > this.onNavigationEvent.onExtraCallback()) {
            throw new ycxsya1("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
        }
        IAuthTabCallbackDefault();
        onExtraCallback(onextracallback);
        int i9 = onTransact + 21;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // o.jc3
    public void access000() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeEndArray", onExtraCallback.VALUE);
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnWarmupCompleted = onTransact().onWarmupCompleted();
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx = RFEndCardBackUpLayoutycx.ARRAY;
        if (rFEndCardBackUpLayoutycxOnWarmupCompleted != rFEndCardBackUpLayoutycx) {
            int i4 = onTransact + 75;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycxOnWarmupCompleted2 = onTransact().onWarmupCompleted();
                RFEndCardBackUpLayoutycx[] rFEndCardBackUpLayoutycxArr = new RFEndCardBackUpLayoutycx[0];
                rFEndCardBackUpLayoutycxArr[0] = rFEndCardBackUpLayoutycx;
                onNavigationEvent("WriteEndArray", rFEndCardBackUpLayoutycxOnWarmupCompleted2, rFEndCardBackUpLayoutycxArr);
            } else {
                onNavigationEvent("WriteEndArray", onTransact().onWarmupCompleted(), rFEndCardBackUpLayoutycx);
            }
        }
        if (this.onWarmupCompleted.onNavigationEvent() != null) {
            int i5 = onTransact + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            IAuthTabCallback iAuthTabCallbackOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
            if (i6 != 0) {
                if (iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult != null) {
                    this.IAuthTabCallback.pop();
                }
            } else {
                String unused = iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult;
                throw null;
            }
        }
        this.onExtraCallback--;
        onExtraCallbackWithResult();
        onExtraCallback(IAuthTabCallbackStubProxy());
    }

    @Override // o.jc3
    public void onExtraCallback(initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), initoneslotmultipleadslayoutlandscape);
        IAuthTabCallback("writeBinaryData", onExtraCallback.VALUE, onExtraCallback.INITIAL);
        onNavigationEvent(initoneslotmultipleadslayoutlandscape);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.jc3
    public void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeBoolean", onExtraCallback.VALUE, onExtraCallback.INITIAL);
        onExtraCallbackWithResult(z);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jc3
    public void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeDateTime", onExtraCallback.VALUE, onExtraCallback.INITIAL);
        onNavigationEvent(j);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 77;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.jc3
    public void onExtraCallbackWithResult(RFEndCardBackUpLayout2 rFEndCardBackUpLayout2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), rFEndCardBackUpLayout2);
        IAuthTabCallback("writeDBPointer", onExtraCallback.VALUE, onExtraCallback.INITIAL);
        onExtraCallback(rFEndCardBackUpLayout2);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.jc3
    public void onWarmupCompleted(double d) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback onextracallback = onExtraCallback.VALUE;
            onExtraCallback onextracallback2 = onExtraCallback.INITIAL;
            onExtraCallback[] onextracallbackArr = new onExtraCallback[2];
            onextracallbackArr[1] = onextracallback;
            onextracallbackArr[1] = onextracallback2;
            IAuthTabCallback("writeDBPointer", onextracallbackArr);
        } else {
            IAuthTabCallback("writeDBPointer", onExtraCallback.VALUE, onExtraCallback.INITIAL);
        }
        onNavigationEvent(d);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i3 = asBinder + 125;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.jc3
    public void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback("writeInt32", onExtraCallback.VALUE);
        onWarmupCompleted(i);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i5 = onTransact + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.jc3
    public void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback[] onextracallbackArr = new onExtraCallback[0];
            onextracallbackArr[1] = onExtraCallback.VALUE;
            IAuthTabCallback("writeInt64", onextracallbackArr);
        } else {
            IAuthTabCallback("writeInt64", onExtraCallback.VALUE);
        }
        onExtraCallback(j);
        onExtraCallback(IAuthTabCallbackStubProxy());
    }

    @Override // o.jc3
    public void onExtraCallback(Decimal128 decimal128) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), decimal128);
        IAuthTabCallback("writeInt64", onExtraCallback.VALUE);
        onNavigationEvent(decimal128);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    @Override // o.jc3
    public void asBinder(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        IAuthTabCallback("writeJavaScript", onExtraCallback.VALUE);
        onWarmupCompleted(str);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 13;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.jc3
    public void IAuthTabCallbackStub(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 119, 1}, true, null, objArr);
            pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
            IAuthTabCallback("writeJavaScriptWithScope", onExtraCallback.VALUE);
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 5, 119, 1}, true, null, objArr2);
            pmi10.onExtraCallbackWithResult(((String) objArr2[0]).intern(), str);
            IAuthTabCallback("writeJavaScriptWithScope", onExtraCallback.VALUE);
        }
        IAuthTabCallback(str);
        onExtraCallback(onExtraCallback.SCOPE_DOCUMENT);
        int i3 = asBinder + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.jc3
    public void extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeMaxKey", onExtraCallback.VALUE);
        onNavigationEvent();
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.jc3
    public void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback[] onextracallbackArr = new onExtraCallback[0];
            onextracallbackArr[1] = onExtraCallback.VALUE;
            IAuthTabCallback("writeMinKey", onextracallbackArr);
        } else {
            IAuthTabCallback("writeMinKey", onExtraCallback.VALUE);
        }
        onWarmupCompleted();
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i3 = asBinder + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.jc3
    public void onTransact(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{5, 4, 0, 0}, true, new byte[]{1, 0, 0, 1}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        onExtraCallback onextracallback = this.asInterface;
        onExtraCallback onextracallback2 = onExtraCallback.NAME;
        if (onextracallback != onextracallback2) {
            int i4 = onTransact + 59;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback[] onextracallbackArr = new onExtraCallback[1];
                onextracallbackArr[1] = onextracallback2;
                onNavigationEvent("WriteName", onextracallbackArr);
            } else {
                onNavigationEvent("WriteName", onextracallback2);
            }
        }
        if (!this.IAuthTabCallback.peek().IAuthTabCallback(str)) {
            throw new IllegalArgumentException(String.format("Invalid BSON field name %s", str));
        }
        onNavigationEvent(str);
        this.onWarmupCompleted.onExtraCallbackWithResult = str;
        this.asInterface = onExtraCallback.VALUE;
        int i5 = asBinder + 87;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.jc3
    public void writeTypedObject() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeNull", onExtraCallback.VALUE);
        asBinder();
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jc3
    public void onWarmupCompleted(ObjectId objectId) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), objectId);
        IAuthTabCallback("writeObjectId", onExtraCallback.VALUE);
        onExtraCallback(objectId);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 115;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.jc3
    public void onNavigationEvent(ea41 ea41Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), ea41Var);
        IAuthTabCallback("writeRegularExpression", onExtraCallback.VALUE);
        onExtraCallbackWithResult(ea41Var);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallback(String str, String str2) {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{5, 4, 0, 0}, false, new byte[]{1, 0, 0, 1}, objArr);
            pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 5, 119, 1}, true, null, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a(new int[]{5, 4, 0, 0}, true, new byte[]{1, 0, 0, 1}, objArr3);
            pmi10.onExtraCallbackWithResult(((String) objArr3[0]).intern(), str);
            Object[] objArr4 = new Object[1];
            a(new int[]{0, 5, 119, 1}, true, null, objArr4);
            obj = objArr4[0];
        }
        pmi10.onExtraCallbackWithResult(((String) obj).intern(), str2);
        onTransact(str);
        asInterface(str2);
        int i3 = asBinder + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.jc3
    public void asInterface(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        IAuthTabCallback("writeString", onExtraCallback.VALUE);
        onExtraCallback(str);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
    }

    @Override // o.jc3
    public void IAuthTabCallbackDefault(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        IAuthTabCallback("writeSymbol", onExtraCallback.VALUE);
        onExtraCallbackWithResult(str);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.jc3
    public void onExtraCallbackWithResult(p_ p_Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 119, 1}, true, null, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), p_Var);
        IAuthTabCallback("writeTimestamp", onExtraCallback.VALUE);
        onNavigationEvent(p_Var);
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = onTransact + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.jc3
    public void onActivityResized() {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback("writeUndefined", onExtraCallback.VALUE);
        IAuthTabCallbackStub();
        onExtraCallback(IAuthTabCallbackStubProxy());
        int i4 = asBinder + 75;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected onExtraCallback IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            if (onTransact().onWarmupCompleted() == RFEndCardBackUpLayoutycx.ARRAY) {
                int i3 = onTransact + 39;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    return onExtraCallback.VALUE;
                }
                int i4 = 10 / 0;
                return onExtraCallback.VALUE;
            }
            onExtraCallback onextracallback = onExtraCallback.NAME;
            int i5 = onTransact + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }
        onTransact().onWarmupCompleted();
        RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx = RFEndCardBackUpLayoutycx.ARRAY;
        throw null;
    }

    protected boolean IAuthTabCallback(onExtraCallback[] onextracallbackArr) {
        int i = 2 % 2;
        for (onExtraCallback onextracallback : onextracallbackArr) {
            if (onextracallback == access100()) {
                int i2 = onTransact + 125;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 49 / 0;
                }
                return true;
            }
        }
        int i4 = asBinder + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    protected void IAuthTabCallback(String str, onExtraCallback... onextracallbackArr) {
        int i = 2 % 2;
        if (getInterfaceDescriptor()) {
            throw new IllegalStateException("BsonWriter is closed");
        }
        int i2 = onTransact + 83;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(onextracallbackArr);
            obj.hashCode();
            throw null;
        }
        if (!IAuthTabCallback(onextracallbackArr)) {
            int i3 = onTransact + 89;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent(str, onextracallbackArr);
                throw null;
            }
            onNavigationEvent(str, onextracallbackArr);
        }
        int i4 = asBinder + 79;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected void onNavigationEvent(String str, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx, RFEndCardBackUpLayoutycx... rFEndCardBackUpLayoutycxArr) {
        int i = 2 % 2;
        throw new wie3(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", str, pmi31.onExtraCallbackWithResult(" or ", Arrays.asList(rFEndCardBackUpLayoutycxArr)), rFEndCardBackUpLayoutycx));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onNavigationEvent(String str, onExtraCallback... onextracallbackArr) {
        String str2;
        int i = 2 % 2;
        onExtraCallback onextracallback = this.asInterface;
        if (onextracallback != onExtraCallback.INITIAL) {
            int i2 = asBinder + 75;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback onextracallback2 = onExtraCallback.SCOPE_DOCUMENT;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onextracallback == onExtraCallback.SCOPE_DOCUMENT || onextracallback == onExtraCallback.DONE) {
                if ((!str.startsWith("end")) && !str.equals("writeName")) {
                    String strSubstring = str.substring(5);
                    if (strSubstring.startsWith("start")) {
                        strSubstring = strSubstring.substring(5);
                    }
                    if (Arrays.asList('A', 'E', 'I', 'O', 'U').contains(Character.valueOf(strSubstring.charAt(0)))) {
                        int i3 = asBinder + 31;
                        onTransact = i3 % 128;
                        int i4 = i3 % 2;
                        str2 = "An";
                    } else {
                        str2 = "A";
                    }
                    throw new wie3(String.format("%s %s value cannot be written to the root level of a BSON document.", str2, strSubstring));
                }
            }
        }
        throw new wie3(String.format("%s can only be called when State is %s, not when State is %s", str, pmi31.onExtraCallbackWithResult(" or ", Arrays.asList(onextracallbackArr)), this.asInterface));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        int i5 = i3 + 121;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jc3
    public void onWarmupCompleted(htfycx htfycxVar) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            pmi10.onExtraCallbackWithResult("reader", htfycxVar);
            onExtraCallbackWithResult(htfycxVar, null);
            int i3 = onTransact + 105;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        pmi10.onExtraCallbackWithResult("reader", htfycxVar);
        onExtraCallbackWithResult(htfycxVar, null);
        throw null;
    }

    public void onNavigationEvent(htfycx htfycxVar, List<ea3> list) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        pmi10.onExtraCallbackWithResult("reader", htfycxVar);
        pmi10.onExtraCallbackWithResult("extraElements", list);
        onExtraCallbackWithResult(htfycxVar, list);
        int i4 = asBinder + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void onWarmupCompleted(List<ea3> list) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        pmi10.onExtraCallbackWithResult("extraElements", list);
        int i4 = asBinder + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        for (ea3 ea3Var : list) {
            onTransact(ea3Var.onExtraCallback());
            onExtraCallback(ea3Var.onWarmupCompleted());
        }
    }

    private void onExtraCallbackWithResult(htfycx htfycxVar, List<ea3> list) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        htfycxVar.warmup();
        onActivityLayout();
        while (htfycxVar.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
            int i4 = onTransact + 13;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            onTransact(htfycxVar.requestPostMessageChannelWithExtras());
            onExtraCallback(htfycxVar);
            if (onExtraCallback()) {
                return;
            }
        }
        htfycxVar.extraCommand();
        if (list != null) {
            onWarmupCompleted(list);
        }
        readTypedObject();
    }

    private void IAuthTabCallback(htfycx htfycxVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(htfycxVar.prefetch());
        Object obj = null;
        onExtraCallbackWithResult(htfycxVar, null);
        int i4 = onTransact + 91;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: o.initSingleCardInTwoCardStyleLandscape$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[t_.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[t_.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[t_.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[t_.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[t_.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[t_.BINARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[t_.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[t_.OBJECT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[t_.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onWarmupCompleted[t_.DATE_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onWarmupCompleted[t_.NULL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onWarmupCompleted[t_.REGULAR_EXPRESSION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onWarmupCompleted[t_.JAVASCRIPT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onWarmupCompleted[t_.SYMBOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onWarmupCompleted[t_.JAVASCRIPT_WITH_SCOPE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onWarmupCompleted[t_.INT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onWarmupCompleted[t_.TIMESTAMP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onWarmupCompleted[t_.INT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onWarmupCompleted[t_.DECIMAL128.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onWarmupCompleted[t_.MIN_KEY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onWarmupCompleted[t_.DB_POINTER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onWarmupCompleted[t_.MAX_KEY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private void onExtraCallback(htfycx htfycxVar) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = AnonymousClass5.onWarmupCompleted[htfycxVar.onActivityLayout().ordinal()];
            throw null;
        }
        switch (AnonymousClass5.onWarmupCompleted[htfycxVar.onActivityLayout().ordinal()]) {
            case 1:
                onExtraCallbackWithResult(htfycxVar, null);
                return;
            case 2:
                onNavigationEvent(htfycxVar);
                return;
            case 3:
                onWarmupCompleted(htfycxVar.ICustomTabsCallback_Parcel());
                return;
            case 4:
                asInterface(htfycxVar.ICustomTabsServiceStub());
                return;
            case 5:
                onExtraCallback(htfycxVar.ICustomTabsCallbackDefault());
                return;
            case 6:
                htfycxVar.ICustomTabsServiceDefault();
                onActivityResized();
                return;
            case 7:
                onWarmupCompleted(htfycxVar.receiveFile());
                return;
            case 8:
                onExtraCallback(htfycxVar.onRelationshipValidationResult());
                int i4 = onTransact + 95;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return;
            case 9:
                onExtraCallbackWithResult(htfycxVar.onUnminimized());
                return;
            case 10:
                htfycxVar.setEngagementSignalsCallback();
                writeTypedObject();
                return;
            case 11:
                onNavigationEvent(htfycxVar.requestPostMessageChannel());
                return;
            case 12:
                asBinder(htfycxVar.newSession());
                return;
            case 13:
                IAuthTabCallbackDefault(htfycxVar.updateVisuals());
                return;
            case 14:
                IAuthTabCallback(htfycxVar);
                return;
            case 15:
                onNavigationEvent(htfycxVar.mayLaunchUrl());
                return;
            case 16:
                onExtraCallbackWithResult(htfycxVar.validateRelationship());
                return;
            case 17:
                IAuthTabCallback(htfycxVar.postMessage());
                return;
            case 18:
                onExtraCallback(htfycxVar.isEngagementSignalsApiAvailable());
                return;
            case 19:
                htfycxVar.newAuthTabSession();
                ICustomTabsCallback();
                return;
            case 20:
                onExtraCallbackWithResult(htfycxVar.ICustomTabsCallbackStubProxy());
                return;
            case 21:
                htfycxVar.newSessionWithExtras();
                extraCallbackWithResult();
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unhandled BSON type: ");
                sb.append(htfycxVar.onActivityLayout());
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private void onWarmupCompleted(getButtonTextForNewStyleBar getbuttontextfornewstylebar) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onActivityLayout();
            for (Map.Entry<String, jc2> entry : getbuttontextfornewstylebar.entrySet()) {
                int i3 = onTransact + 11;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                onTransact(entry.getKey());
                onExtraCallback(entry.getValue());
                int i5 = onTransact + 107;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            readTypedObject();
            return;
        }
        onActivityLayout();
        getbuttontextfornewstylebar.entrySet().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onNavigationEvent(htfycx htfycxVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        htfycxVar.prefetchWithMultipleUrls();
        extraCallback();
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        while (htfycxVar.ICustomTabsCallbackStub() != t_.END_OF_DOCUMENT) {
            onExtraCallback(htfycxVar);
            if (onExtraCallback()) {
                return;
            }
        }
        htfycxVar.ICustomTabsService();
        access000();
    }

    private void IAuthTabCallback(initViewsDefault initviewsdefault) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCallback();
            initviewsdefault.iterator();
            throw null;
        }
        extraCallback();
        Iterator<jc2> it = initviewsdefault.iterator();
        while (!(!it.hasNext())) {
            int i3 = asBinder + 63;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(it.next());
                obj.hashCode();
                throw null;
            }
            onExtraCallback(it.next());
        }
        access000();
    }

    private void onWarmupCompleted(getOutline getoutline) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getoutline.onNavigationEvent());
        onWarmupCompleted(getoutline.onExtraCallback());
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private void onExtraCallback(jc2 jc2Var) throws Throwable {
        int i = 2 % 2;
        switch (AnonymousClass5.onWarmupCompleted[jc2Var.IAuthTabCallback().ordinal()]) {
            case 1:
                onWarmupCompleted(jc2Var.IAuthTabCallback_Parcel());
                return;
            case 2:
                IAuthTabCallback(jc2Var.onTransact());
                return;
            case 3:
                onWarmupCompleted(jc2Var.getInterfaceDescriptor().onNavigationEvent());
                return;
            case 4:
                asInterface(jc2Var.onActivityResized().onExtraCallback());
                return;
            case 5:
                onExtraCallback(jc2Var.IAuthTabCallbackDefault());
                return;
            case 6:
                onActivityResized();
                int i2 = asBinder + 85;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 7:
                onWarmupCompleted(jc2Var.readTypedObject().onNavigationEvent());
                return;
            case 8:
                onExtraCallback(jc2Var.IAuthTabCallbackStub().onWarmupCompleted());
                int i3 = asBinder + 49;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 83 / 0;
                    return;
                }
                return;
            case 9:
                onExtraCallbackWithResult(jc2Var.IAuthTabCallbackStubProxy().onWarmupCompleted());
                return;
            case 10:
                writeTypedObject();
                return;
            case 11:
                onNavigationEvent(jc2Var.extraCallbackWithResult());
                return;
            case 12:
                asBinder(jc2Var.writeTypedObject().onNavigationEvent());
                return;
            case 13:
                IAuthTabCallbackDefault(jc2Var.onMinimized().onExtraCallbackWithResult());
                return;
            case 14:
                onWarmupCompleted(jc2Var.extraCallback());
                return;
            case 15:
                onNavigationEvent(jc2Var.access000().onExtraCallbackWithResult());
                return;
            case 16:
                onExtraCallbackWithResult(jc2Var.onMessageChannelReady());
                return;
            case 17:
                IAuthTabCallback(jc2Var.ICustomTabsCallback().onNavigationEvent());
                return;
            case 18:
                onExtraCallback(jc2Var.access100().onWarmupCompleted());
                int i5 = onTransact + 75;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return;
            case 19:
                ICustomTabsCallback();
                return;
            case 20:
                onExtraCallbackWithResult(jc2Var.asBinder());
                return;
            case 21:
                extraCallbackWithResult();
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unhandled BSON type: ");
                sb.append(jc2Var.IAuthTabCallback());
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public class IAuthTabCallback {
        private final IAuthTabCallback onExtraCallback;
        private String onExtraCallbackWithResult;
        private final RFEndCardBackUpLayoutycx onNavigationEvent;

        public IAuthTabCallback(IAuthTabCallback iAuthTabCallback, RFEndCardBackUpLayoutycx rFEndCardBackUpLayoutycx) {
            this.onExtraCallback = iAuthTabCallback;
            this.onNavigationEvent = rFEndCardBackUpLayoutycx;
        }

        public IAuthTabCallback onNavigationEvent() {
            return this.onExtraCallback;
        }

        public RFEndCardBackUpLayoutycx onWarmupCompleted() {
            return this.onNavigationEvent;
        }
    }
}
