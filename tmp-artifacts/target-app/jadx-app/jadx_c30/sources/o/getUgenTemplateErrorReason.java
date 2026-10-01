package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getUgenTemplateErrorReason implements getJsObject {
    private boolean IAuthTabCallback;
    private final getExpressInteractionListener onExtraCallbackWithResult;
    private final Writer onTransact;
    private int onWarmupCompleted;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static long asInterface = 7798559133331975163L;
    private static int asBinder = -1776194565;
    private static char IAuthTabCallbackDefault = 51318;
    private onExtraCallback onNavigationEvent = new onExtraCallback(null, onWarmupCompleted.TOP_LEVEL, BuildConfig.FLAVOR);
    private IAuthTabCallback onExtraCallback = IAuthTabCallback.INITIAL;

    enum IAuthTabCallback {
        INITIAL,
        NAME,
        VALUE,
        DONE
    }

    enum onWarmupCompleted {
        TOP_LEVEL,
        DOCUMENT,
        ARRAY
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = (b2 * 2) + 4;
        byte[] bArr = $$a;
        int i3 = 110 - b;
        int i4 = b3 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            i3 = i4;
            int i6 = 0;
            i2++;
            i3 += i5;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i2];
            i2++;
            i3 += i5;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    static class onExtraCallback {
        private final onWarmupCompleted IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final onExtraCallback onNavigationEvent;
        private boolean onWarmupCompleted;

        onExtraCallback(onExtraCallback onextracallback, onWarmupCompleted onwarmupcompleted, String str) {
            this.onNavigationEvent = onextracallback;
            this.IAuthTabCallback = onwarmupcompleted;
            if (onextracallback != null) {
                str = onextracallback.onExtraCallbackWithResult + str;
            }
            this.onExtraCallbackWithResult = str;
        }
    }

    public getUgenTemplateErrorReason(Writer writer, getExpressInteractionListener getexpressinteractionlistener) {
        this.onTransact = writer;
        this.onExtraCallbackWithResult = getexpressinteractionlistener;
    }

    @Override // o.getJsObject
    public void onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(str);
        asInterface();
        int i4 = IAuthTabCallbackStub + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getJsObject
    public void onExtraCallbackWithResult(String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (62084 - View.getDefaultSize(0, 0)), Color.blue(0), new char[]{14913, 56536, 17517, 52029}, new char[]{0, 0, 0, 0}, new char[]{53547, 15268, 33979, 3826}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        onExtraCallbackWithResult(str);
        IAuthTabCallback(z);
        int i4 = access100 + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getJsObject
    public void onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (62084 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Color.alpha(0), new char[]{14913, 56536, 17517, 52029}, new char[]{0, 0, 0, 0}, new char[]{53547, 15268, 33979, 3826}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a((char) (Color.red(0) + 59153), (-499872559) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{961, 61643, 1618, 48413, 55098}, new char[]{0, 0, 0, 0}, new char[]{54008, 13452, 4578, 63719}, objArr2);
        pmi10.onExtraCallbackWithResult(((String) objArr2[0]).intern(), str2);
        onExtraCallbackWithResult(str);
        onExtraCallback(str2);
        int i4 = IAuthTabCallbackStub + 105;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getJsObject
    public void onWarmupCompleted(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 62084), Color.blue(0), new char[]{14913, 56536, 17517, 52029}, new char[]{0, 0, 0, 0}, new char[]{53547, 15268, 33979, 3826}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a((char) (59153 - Drawable.resolveOpacity(0, 0)), KeyEvent.getDeadChar(0, 0) - 499872558, new char[]{961, 61643, 1618, 48413, 55098}, new char[]{0, 0, 0, 0}, new char[]{54008, 13452, 4578, 63719}, objArr2);
        pmi10.onExtraCallbackWithResult(((String) objArr2[0]).intern(), str2);
        onExtraCallbackWithResult(str);
        IAuthTabCallback(str2);
        int i4 = IAuthTabCallbackStub + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 35;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 39;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, 1451 - View.resolveSize(0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), '\\' - AndroidCharacter.getMirror('0'), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (Process.myPid() >> 22)), (ViewConfiguration.getPressedStateDuration() >> 16) + 50, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 30, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackDefault ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    @Override // o.getJsObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a((char) (16839300 - Color.rgb(0, 1, 0)), Color.green(0), new char[]{14913, 56536, 17517, 52029}, new char[]{0, 0, 0, 0}, new char[]{53547, 15268, 33979, 3826}, objArr);
            pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
            onWarmupCompleted(IAuthTabCallback.NAME);
            if (this.onNavigationEvent.onWarmupCompleted) {
                IAuthTabCallbackDefault(",");
            }
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (Color.rgb(0, 0, 0) + 16839300), Color.green(0), new char[]{14913, 56536, 17517, 52029}, new char[]{0, 0, 0, 0}, new char[]{53547, 15268, 33979, 3826}, objArr2);
            pmi10.onExtraCallbackWithResult(((String) objArr2[0]).intern(), str);
            onWarmupCompleted(IAuthTabCallback.NAME);
            if (this.onNavigationEvent.onWarmupCompleted) {
            }
        }
        if (!this.onExtraCallbackWithResult.onNavigationEvent()) {
            if (this.onNavigationEvent.onWarmupCompleted) {
                int i3 = IAuthTabCallbackStub + 77;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                IAuthTabCallbackDefault(" ");
            }
        } else {
            IAuthTabCallbackDefault(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
            IAuthTabCallbackDefault(this.onNavigationEvent.onExtraCallbackWithResult);
        }
        onTransact(str);
        IAuthTabCallbackDefault(": ");
        this.onExtraCallback = IAuthTabCallback.VALUE;
    }

    @Override // o.getJsObject
    public void IAuthTabCallback(boolean z) throws IOException {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(IAuthTabCallback.VALUE);
        asBinder();
        if (!z) {
            str = "false";
        } else {
            int i4 = IAuthTabCallbackStub + 121;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
            str = "true";
        }
        IAuthTabCallbackDefault(str);
        IAuthTabCallbackStub();
    }

    @Override // o.getJsObject
    public void onExtraCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (KeyEvent.getDeadChar(0, 0) + 59153), (-499872559) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), new char[]{961, 61643, 1618, 48413, 55098}, new char[]{0, 0, 0, 0}, new char[]{54008, 13452, 4578, 63719}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        onWarmupCompleted(IAuthTabCallback.VALUE);
        asBinder();
        IAuthTabCallbackDefault(str);
        IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackStub + 67;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getJsObject
    public void IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59153), View.MeasureSpec.getSize(0) - 499872558, new char[]{961, 61643, 1618, 48413, 55098}, new char[]{0, 0, 0, 0}, new char[]{54008, 13452, 4578, 63719}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        onWarmupCompleted(IAuthTabCallback.VALUE);
        asBinder();
        onTransact(str);
        IAuthTabCallbackStub();
        int i4 = access100 + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getJsObject
    public void onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((char) (59153 - (ViewConfiguration.getTouchSlop() >> 8)), (-499872558) - Color.red(0), new char[]{961, 61643, 1618, 48413, 55098}, new char[]{0, 0, 0, 0}, new char[]{54008, 13452, 4578, 63719}, objArr);
        pmi10.onExtraCallbackWithResult(((String) objArr[0]).intern(), str);
        onWarmupCompleted(IAuthTabCallback.VALUE);
        asBinder();
        IAuthTabCallbackDefault(str);
        IAuthTabCallbackStub();
        int i4 = access100 + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getJsObject
    public void IAuthTabCallback() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(IAuthTabCallback.VALUE);
        asBinder();
        IAuthTabCallbackDefault("null");
        IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackStub + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getJsObject
    public void asInterface() throws IOException {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        if (iAuthTabCallback != IAuthTabCallback.INITIAL) {
            int i2 = IAuthTabCallbackStub + 85;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.VALUE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iAuthTabCallback != IAuthTabCallback.VALUE) {
                throw new wie3("Invalid state " + this.onExtraCallback);
            }
        }
        asBinder();
        IAuthTabCallbackDefault("{");
        this.onNavigationEvent = new onExtraCallback(this.onNavigationEvent, onWarmupCompleted.DOCUMENT, this.onExtraCallbackWithResult.IAuthTabCallback());
        this.onExtraCallback = IAuthTabCallback.NAME;
        int i3 = IAuthTabCallbackStub + 71;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onExtraCallbackWithResult() throws IOException {
        int i = 2 % 2;
        asBinder();
        IAuthTabCallbackDefault("[");
        this.onNavigationEvent = new onExtraCallback(this.onNavigationEvent, onWarmupCompleted.ARRAY, this.onExtraCallbackWithResult.IAuthTabCallback());
        this.onExtraCallback = IAuthTabCallback.VALUE;
        int i2 = IAuthTabCallbackStub + 93;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.getJsObject
    public void onWarmupCompleted() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(IAuthTabCallback.NAME);
            if (this.onExtraCallbackWithResult.onNavigationEvent() && this.onNavigationEvent.onWarmupCompleted) {
                IAuthTabCallbackDefault(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
                IAuthTabCallbackDefault(this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult);
            }
            IAuthTabCallbackDefault("}");
            onExtraCallback onextracallback = this.onNavigationEvent.onNavigationEvent;
            this.onNavigationEvent = onextracallback;
            if (onextracallback.IAuthTabCallback == onWarmupCompleted.TOP_LEVEL) {
                int i3 = access100 + 43;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    this.onExtraCallback = IAuthTabCallback.DONE;
                    return;
                } else {
                    this.onExtraCallback = IAuthTabCallback.DONE;
                    throw null;
                }
            }
            IAuthTabCallbackStub();
            int i4 = access100 + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        onWarmupCompleted(IAuthTabCallback.NAME);
        this.onExtraCallbackWithResult.onNavigationEvent();
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback() throws IOException {
        int i = 2 % 2;
        onWarmupCompleted(IAuthTabCallback.VALUE);
        if (this.onNavigationEvent.IAuthTabCallback != onWarmupCompleted.ARRAY) {
            throw new wie3("Can't end an array if not in an array");
        }
        int i2 = IAuthTabCallbackStub + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onExtraCallbackWithResult.onNavigationEvent() && this.onNavigationEvent.onWarmupCompleted) {
            int i4 = access100 + 15;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallbackDefault(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
                IAuthTabCallbackDefault(this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult);
                throw null;
            }
            IAuthTabCallbackDefault(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
            IAuthTabCallbackDefault(this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult);
        }
        IAuthTabCallbackDefault("]");
        onExtraCallback onextracallback = this.onNavigationEvent.onNavigationEvent;
        this.onNavigationEvent = onextracallback;
        if (onextracallback.IAuthTabCallback == onWarmupCompleted.TOP_LEVEL) {
            this.onExtraCallback = IAuthTabCallback.DONE;
        } else {
            IAuthTabCallbackStub();
        }
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return z;
    }

    private void asBinder() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        if (this.onNavigationEvent.IAuthTabCallback == onWarmupCompleted.ARRAY) {
            int i4 = IAuthTabCallbackStub + 61;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            if (this.onNavigationEvent.onWarmupCompleted) {
                IAuthTabCallbackDefault(",");
            }
            if (this.onExtraCallbackWithResult.onNavigationEvent()) {
                IAuthTabCallbackDefault(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
                IAuthTabCallbackDefault(this.onNavigationEvent.onExtraCallbackWithResult);
            } else if (this.onNavigationEvent.onWarmupCompleted) {
                int i6 = access100 + 13;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    IAuthTabCallbackDefault(" ");
                    int i7 = 40 / 0;
                } else {
                    IAuthTabCallbackDefault(" ");
                }
                int i8 = access100 + 11;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        this.onNavigationEvent.onWarmupCompleted = true;
    }

    private void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.onNavigationEvent.IAuthTabCallback == onWarmupCompleted.ARRAY) {
                int i3 = IAuthTabCallbackStub + 37;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    this.onExtraCallback = IAuthTabCallback.VALUE;
                    return;
                } else {
                    this.onExtraCallback = IAuthTabCallback.VALUE;
                    int i4 = 1 / 0;
                    return;
                }
            }
            this.onExtraCallback = IAuthTabCallback.NAME;
            return;
        }
        onWarmupCompleted unused = this.onNavigationEvent.IAuthTabCallback;
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.ARRAY;
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private void onTransact(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 34
            r9.IAuthTabCallback(r1)
            int r2 = o.getUgenTemplateErrorReason.IAuthTabCallbackStub
            r3 = 5
            int r2 = r2 + r3
            int r4 = r2 % 128
            o.getUgenTemplateErrorReason.access100 = r4
            int r2 = r2 % r0
            r2 = 0
        L12:
            int r4 = r10.length()
            if (r2 >= r4) goto Lbe
            char r4 = r10.charAt(r2)
            r5 = 12
            if (r4 == r5) goto Lac
            r6 = 13
            if (r4 == r6) goto La6
            if (r4 == r1) goto La0
            r6 = 92
            if (r4 == r6) goto L9a
            switch(r4) {
                case 8: goto L4f;
                case 9: goto L49;
                case 10: goto L43;
                default: goto L2d;
            }
        L2d:
            int r6 = java.lang.Character.getType(r4)
            r7 = 1
            if (r6 == r7) goto L96
            if (r6 == r0) goto L96
            r7 = 3
            if (r6 == r7) goto L96
            int r7 = o.getUgenTemplateErrorReason.access100
            int r7 = r7 + 65
            int r8 = r7 % 128
            o.getUgenTemplateErrorReason.IAuthTabCallbackStub = r8
            int r7 = r7 % r0
            goto L55
        L43:
            java.lang.String r4 = "\\n"
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        L49:
            java.lang.String r4 = "\\t"
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        L4f:
            java.lang.String r4 = "\\b"
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        L55:
            if (r6 == r3) goto L96
            int r8 = r8 + 45
            int r7 = r8 % 128
            o.getUgenTemplateErrorReason.access100 = r7
            int r8 = r8 % r0
            switch(r6) {
                case 9: goto L96;
                case 10: goto L96;
                case 11: goto L96;
                case 12: goto L96;
                default: goto L61;
            }
        L61:
            switch(r6) {
                case 20: goto L96;
                case 21: goto L96;
                case 22: goto L96;
                case 23: goto L96;
                case 24: goto L96;
                case 25: goto L96;
                case 26: goto L96;
                case 27: goto L96;
                case 28: goto L96;
                case 29: goto L96;
                case 30: goto L96;
                default: goto L64;
            }
        L64:
            java.lang.String r6 = "\\u"
            r9.IAuthTabCallbackDefault(r6)
            r6 = 61440(0xf000, float:8.6096E-41)
            r6 = r6 & r4
            int r5 = r6 >> 12
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r9.IAuthTabCallbackDefault(r5)
            r5 = r4 & 3840(0xf00, float:5.381E-42)
            int r5 = r5 >> 8
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r9.IAuthTabCallbackDefault(r5)
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> 4
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r9.IAuthTabCallbackDefault(r5)
            r4 = r4 & 15
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        L96:
            r9.IAuthTabCallback(r4)
            goto Lb1
        L9a:
            java.lang.String r4 = "\\\\"
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        La0:
            java.lang.String r4 = "\\\""
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        La6:
            java.lang.String r4 = "\\r"
            r9.IAuthTabCallbackDefault(r4)
            goto Lb1
        Lac:
            java.lang.String r4 = "\\f"
            r9.IAuthTabCallbackDefault(r4)
        Lb1:
            int r2 = r2 + 1
            int r4 = o.getUgenTemplateErrorReason.IAuthTabCallbackStub
            int r4 = r4 + 111
            int r5 = r4 % 128
            o.getUgenTemplateErrorReason.access100 = r5
            int r4 = r4 % r0
            goto L12
        Lbe:
            r9.IAuthTabCallback(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUgenTemplateErrorReason.onTransact(java.lang.String):void");
    }

    private void IAuthTabCallbackDefault(String str) throws IOException {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (this.onExtraCallbackWithResult.onWarmupCompleted() != 0) {
                int i4 = access100 + 41;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                if (str.length() + this.onWarmupCompleted >= this.onExtraCallbackWithResult.onWarmupCompleted()) {
                    this.onTransact.write(str.substring(0, this.onExtraCallbackWithResult.onWarmupCompleted() - this.onWarmupCompleted));
                    this.onWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted();
                    this.IAuthTabCallback = true;
                    return;
                } else {
                    int i6 = access100 + 73;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            this.onTransact.write(str);
            this.onWarmupCompleted += str.length();
        } catch (IOException e) {
            onWarmupCompleted(e);
        }
    }

    private void IAuthTabCallback(char c) throws IOException {
        int i = 2 % 2;
        try {
            if (this.onExtraCallbackWithResult.onWarmupCompleted() != 0) {
                int i2 = access100 + 93;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                if (this.onWarmupCompleted >= this.onExtraCallbackWithResult.onWarmupCompleted()) {
                    this.IAuthTabCallback = true;
                    return;
                }
            }
            this.onTransact.write(c);
            this.onWarmupCompleted++;
            int i4 = access100 + 33;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (IOException e) {
            onWarmupCompleted(e);
        }
    }

    private void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            if (this.onExtraCallback != iAuthTabCallback) {
                throw new wie3("Invalid state " + this.onExtraCallback);
            }
            int i4 = i3 + 121;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onWarmupCompleted(IOException iOException) {
        int i = 2 % 2;
        throw new initSingleCardInTwoCardStyle("Wrapping IOException", iOException);
    }
}
