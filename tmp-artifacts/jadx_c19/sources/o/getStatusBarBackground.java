package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getStatusBarBackground {
    public final String IAuthTabCallback;
    public final String onExtraCallback;
    public final String onNavigationEvent;
    public final List<offsetChildToAnchor> onWarmupCompleted;
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int IAuthTabCallbackDefault = -487414935;
    private static char onTransact = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i2, int i3) {
        int i4;
        int i5 = i2 * 3;
        byte[] bArr = $$a;
        int i6 = 3 - (i3 * 4);
        int i7 = b + 109;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        int i9 = -1;
        if (bArr == null) {
            int i10 = i8;
            i4 = i6;
            i6 += i10;
            i9++;
            bArr2[i9] = (byte) i6;
            i4++;
            if (i9 == i8) {
                return new String(bArr2, 0);
            }
            i10 = bArr[i4];
            i6 += i10;
            i9++;
            bArr2[i9] = (byte) i6;
            i4++;
            if (i9 == i8) {
            }
        } else {
            i6 = i7;
            i4 = i6;
            i9++;
            bArr2[i9] = (byte) i6;
            i4++;
            if (i9 == i8) {
            }
        }
    }

    public getStatusBarBackground(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4856), 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{34304, 56716, 50296, 4444}, new char[]{0, 0, 0, 0}, new char[]{27979, 16130, 63814, 35090}, objArr);
        int i2 = 0;
        this.onNavigationEvent = jSONObject.getString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (43731 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 251226205 - Color.rgb(0, 0, 0), new char[]{23303, 61079, 58129, 44260, 13814}, new char[]{0, 0, 0, 0}, new char[]{23951, 63848, 54031, 49322}, objArr2);
        this.onExtraCallback = jSONObject.optString(((String) objArr2[0]).intern());
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int i3 = 2 % 2;
            while (i2 < jSONArrayOptJSONArray.length()) {
                arrayList.add(new offsetChildToAnchor(jSONArrayOptJSONArray.getJSONObject(i2)));
                i2++;
                int i4 = asInterface + 27;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        this.onWarmupCompleted = arrayList;
        this.IAuthTabCallback = jSONObject.optString("path_type", "absolute");
        int i6 = asBinder + 69;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 43, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49123), '\\' - AndroidCharacter.getMirror('0'), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16801188), 50 - Color.blue(0), 22939 - Color.argb(0, 0, 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - Process.getGidForName("")), (Process.myPid() >> 22) + 29, 12578 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i4 = $11 + 69;
                        $10 = i4 % 128;
                        int i5 = i4 % 2;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 35;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 36 / 0;
            objArr[0] = str;
        }
    }
}
