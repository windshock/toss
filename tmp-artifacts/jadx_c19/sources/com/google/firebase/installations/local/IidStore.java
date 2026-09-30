package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IidStore {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] ALLOWABLE_SCOPES;
    private static int[] IAuthTabCallback = null;
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    static {
        IAuthTabCallback();
        ALLOWABLE_SCOPES = new String[]{"*", "FCM", "GCM", ""};
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r4.startsWith("2:") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r4.startsWith("2:") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r1 = com.google.firebase.installations.local.IidStore.onExtraCallback + 65;
        com.google.firebase.installations.local.IidStore.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        int i2 = 2 % 2;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
            }
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            int i5 = onWarmupCompleted + 9;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        int i7 = onWarmupCompleted + 31;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private String createTokenKey(@NonNull String str, @NonNull String str2) {
        int i2 = 2 % 2;
        String str3 = STORE_KEY_TOKEN + str + STORE_KEY_SEPARATOR + str2;
        int i3 = onWarmupCompleted + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return str3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String readToken() {
        synchronized (this.iidPrefs) {
            for (String str : ALLOWABLE_SCOPES) {
                String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(JSON_ENCODED_PREFIX)) {
                        string = parseIidTokenFromJson(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object[] objArr = new Object[1];
            a(new int[]{1937710581, -538988007, -42468740, 698468586}, 5 - View.MeasureSpec.getSize(0), objArr);
            String string = jSONObject.getString(((String) objArr[0]).intern());
            int i3 = onWarmupCompleted + 67;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return string;
            }
            throw null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String readIid() {
        synchronized (this.iidPrefs) {
            String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (instanceIdFromLocalStorage != null) {
                return instanceIdFromLocalStorage;
            }
            return readPublicKeyFromLocalStorageAndCalculateInstanceId();
        }
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 16;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = $11 + 13;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> i6), 72 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 8849 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i10++;
                    i6 = 16;
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
        int[] iArr5 = IAuthTabCallback;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, i7, i7)), TextUtils.lastIndexOf("", c) + 73, 8848 - (ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = -1469660336;
                c = '0';
                i7 = 0;
            }
            i3 = i7;
            iArr5 = iArr6;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i3] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.lastIndexOf("", '0')), 39 - (ViewConfiguration.getLongPressTimeout() >> 16), 10301 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
                int i14 = $11 + 85;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4033), 78 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.MeasureSpec.getMode(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
            if (string == null) {
                return null;
            }
            PublicKey key = parseKey(string);
            if (key == null) {
                return null;
            }
            return getIdFromPublicKey(key);
        }
    }

    private static String getIdFromPublicKey(@NonNull PublicKey publicKey) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            String strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            int i5 = onWarmupCompleted + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            return strEncodeToString;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private PublicKey parseKey(String str) throws InvalidKeySpecException {
        int i2 = 2 % 2;
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            Object[] objArr = new Object[1];
            a(new int[]{196737009, -1231181491}, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new X509EncodedKeySpec(bArrDecode));
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return publicKeyGeneratePublic;
            }
            throw null;
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.toString();
            return null;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new int[]{-1100228030, -1188235706, 1953781415, -2069793032, -707749796, 215442973, -1211849652, -802921573, -281766903, 754125398, 881483861, -2000953510, 1215723848, -1956039612, 1933323179, 1547645644, -1300379589, -81368251};
    }
}
