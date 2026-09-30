package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN;
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client";
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final Charset UTF_8;
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private final Context context;
    private final Provider<HeartBeatController> heartBeatProvider;
    private final RequestLimiter requestLimiter = new RequestLimiter();
    private boolean shouldServerErrorRetry;
    private static final byte[] $$a = {48, -22, 122, 126};
    private static final int $$b = 214;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;

    private static String $$c(short s, byte b, short s2) {
        int i2 = (s * 4) + 115;
        int i3 = (s2 * 4) + 4;
        int i4 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 += -i3;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i2 += -bArr[i3];
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    private static boolean isSuccessfulResponseCode(int i2) {
        int i3 = 2 % 2;
        if (i2 < 200 || i2 >= 300) {
            int i4 = asBinder + 47;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = asBinder + 57;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static {
        IAuthTabCallbackDefault = 0;
        IAuthTabCallback();
        EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
        UTF_8 = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.context = context;
        this.heartBeatProvider = provider;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.FirebaseException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.firebase.installations.FirebaseInstallationsException] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallationResponse createFirebaseInstallation(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws Throwable {
        int responseCode;
        InstallationResponse createResponse;
        int i2 = 2 % 2;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(CREATE_REQUEST_RESOURCE_NAME_FORMAT, str3));
        int i3 = asBinder + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 <= 1) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_CREATE_INSTALLATION_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    Object[] objArr = new Object[1];
                    a((short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-830930502) - TextUtils.getTrimmedLength(""), 22744 + AndroidCharacter.getMirror('0'), (Process.myPid() >> 22) - 107, objArr);
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod(((String) objArr[0]).intern());
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        int i6 = asInterface + 109;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        httpURLConnectionOpenHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                    }
                } finally {
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            try {
                writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
                responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                this.requestLimiter.setNextRequestTime(responseCode);
            } catch (IOException | AssertionError unused2) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                int i8 = asInterface + 99;
                int i9 = i8 % 128;
                asBinder = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 65;
                asInterface = i11 % 128;
                if (i11 % 2 != 0) {
                }
            }
            if (isSuccessfulResponseCode(responseCode)) {
                int i12 = asBinder + 89;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    readCreateResponse(httpURLConnectionOpenHttpURLConnection);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                createResponse = readCreateResponse(httpURLConnectionOpenHttpURLConnection);
            } else {
                try {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
                } catch (IOException | AssertionError unused3) {
                }
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    logBadConfigError();
                    createResponse = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                    int i13 = asInterface + 67;
                    asBinder = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int i82 = asInterface + 99;
                    int i92 = i82 % 128;
                    asBinder = i92;
                    int i102 = i82 % 2;
                    int i112 = i92 + 65;
                    asInterface = i112 % 128;
                    i5 = i112 % 2 != 0 ? i5 + 66 : i5 + 1;
                }
            }
            return createResponse;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
        int i5 = asBinder + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String string = jSONObject.toString();
        if (i4 != 0) {
            string.getBytes(HexStringUtil.DEFAULT_CHARSET_NAME);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        byte[] bytes = string.getBytes(HexStringUtil.DEFAULT_CHARSET_NAME);
        int i5 = asInterface + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return bytes;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        long j;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43424), Drawable.resolveOpacity(0, 0) + 42, 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onExtraCallback;
                if (bArr2 != null) {
                    int i11 = $10 + 85;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 0;
                    }
                    for (int i12 = i7; i12 < length; i12++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2167 - Drawable.resolveOpacity(0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i13 = $10 + 113;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getMode(0)), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) * ((int) (IAuthTabCallback & (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallback;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 43424), 42 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i6;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i2 + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 86 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $10 + 83;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 56 / 0;
                        if (z) {
                            byte[] bArr7 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                    } else if (z) {
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r1.write(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r3 = com.google.firebase.installations.remote.FirebaseInstallationServiceClient.asBinder + 33;
        com.google.firebase.installations.remote.FirebaseInstallationServiceClient.asInterface = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1.close();
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = new java.util.zip.GZIPOutputStream(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream;
        int i2 = 2 % 2;
        int i3 = asBinder + 53;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            outputStream = uRLConnection.getOutputStream();
            int i4 = 0 / 0;
        } else {
            outputStream = uRLConnection.getOutputStream();
        }
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(@Nullable String str, @NonNull String str2) throws Throwable {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            Object[] objArr = new Object[1];
            a((short) (42 - View.resolveSizeAndState(0, 0, 0)), (byte) Color.blue(0), (-830930542) + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2030655769 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-106) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            jSONObject.put(((String) objArr[0]).intern(), str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:17.2.0");
            int i3 = asBinder + 3;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
            int i4 = 98 / 0;
        } else {
            writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
        }
        int i5 = asBinder + 75;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() throws JSONException {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            int i3 = asInterface + 3;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.FirebaseException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.firebase.installations.FirebaseInstallationsException] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void deleteFirebaseInstallation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws Throwable {
        int responseCode;
        int i2 = 2 % 2;
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(DELETE_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        int i3 = 0;
        while (i3 <= 1) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_DELETE_INSTALLATION_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod("DELETE");
                httpURLConnectionOpenHttpURLConnection.addRequestProperty(RtspHeaders.AUTHORIZATION, "FIS_v2 " + str4);
                responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200) {
                int i4 = asInterface + 23;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    if (responseCode != 30818) {
                        if (responseCode != 404) {
                            logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                            if (responseCode != 429) {
                                int i5 = asInterface + 113;
                                asBinder = i5 % 128;
                                int i6 = i5 % 2;
                                if (responseCode < 500 || responseCode >= 600) {
                                    logBadConfigError();
                                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                                }
                            } else {
                                continue;
                            }
                            i3++;
                            httpURLConnectionOpenHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                } else if (responseCode != 401) {
                }
            }
            httpURLConnectionOpenHttpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.FirebaseException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.firebase.installations.FirebaseInstallationsException] */
    private URL getFullyQualifiedRequestUri(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            Object[] objArr = {FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, str};
            Object[] objArr2 = new Object[1];
            a((short) ((-77) - Gravity.getAbsoluteGravity(0, 0)), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-830930536) - View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 2030655776, (-107) - KeyEvent.getDeadChar(0, 0), objArr2);
            URL url = new URL(String.format(((String) objArr2[0]).intern(), objArr));
            int i3 = asBinder + 15;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return url;
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.FirebaseException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.firebase.installations.FirebaseInstallationsException] */
    public TokenResult generateAuthToken(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws Throwable {
        int responseCode;
        TokenResult generateAuthTokenResponse;
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    Object[] objArr = new Object[1];
                    a((short) (45 - (KeyEvent.getMaxKeyCode() >> 16)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-830930502) - Color.alpha(0), 2030655752 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) - 107, objArr);
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod(((String) objArr[0]).intern());
                    StringBuilder sb = new StringBuilder();
                    sb.append("FIS_v2 ");
                    try {
                        sb.append(str4);
                        httpURLConnectionOpenHttpURLConnection.addRequestProperty(RtspHeaders.AUTHORIZATION, sb.toString());
                        httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                        writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
                        responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                        this.requestLimiter.setNextRequestTime(responseCode);
                    } catch (IOException | AssertionError unused) {
                        continue;
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (isSuccessfulResponseCode(responseCode)) {
                    generateAuthTokenResponse = readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                } else {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                    if (responseCode != 401) {
                        int i6 = asBinder + 79;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        if (responseCode != 404) {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                logBadConfigError();
                                generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                            } else {
                                httpURLConnectionOpenHttpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                int i8 = asInterface + 63;
                                asBinder = i8 % 128;
                                int i9 = i8 % 2;
                            }
                        }
                    }
                    generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                }
                return generateAuthTokenResponse;
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private static void logBadConfigError() {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.FirebaseException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.google.firebase.installations.FirebaseInstallationsException] */
    private HttpURLConnection openHttpURLConnection(URL url, String str) throws FirebaseException {
        int i2 = 2 % 2;
        int i3 = asBinder + 109;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", JSON_CONTENT_TYPE);
            httpURLConnection.addRequestProperty("Accept", JSON_CONTENT_TYPE);
            httpURLConnection.addRequestProperty("Content-Encoding", GZIP_CONTENT_ENCODING);
            httpURLConnection.addRequestProperty("Cache-Control", CACHE_CONTROL_DIRECTIVE);
            httpURLConnection.addRequestProperty(X_ANDROID_PACKAGE_HEADER_KEY, this.context.getPackageName());
            HeartBeatController heartBeatController = (HeartBeatController) this.heartBeatProvider.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty(HEART_BEAT_HEADER, (String) Tasks.await(heartBeatController.getHeartBeatsHeader()));
                    int i5 = asInterface + 109;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty(X_ANDROID_CERT_HEADER_KEY, getFingerprintHashForPackage());
            httpURLConnection.addRequestProperty(API_KEY_HEADER, str);
            int i7 = asBinder + 113;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i4 = asBinder + 13;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            String strNextName = jsonReader.nextName();
            Object[] objArr = new Object[1];
            a((short) (Color.rgb(0, 0, 0) + 16777152), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-830930520) - View.getDefaultSize(0, 0), 22774 + AndroidCharacter.getMirror('0'), (-107) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            if (strNextName.equals(((String) objArr[0]).intern())) {
                builder2.setUri(jsonReader.nextString());
                i2 = asInterface + 89;
                asBinder = i2 % 128;
            } else if (!(!strNextName.equals("fid"))) {
                int i6 = asBinder + 37;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else {
                Object[] objArr2 = new Object[1];
                a((short) (View.MeasureSpec.getMode(0) - 99), (byte) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) - 830930515, 2030655769 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) - 107, objArr2);
                if (strNextName.equals(((String) objArr2[0]).intern())) {
                    jsonReader.beginObject();
                    int i8 = asBinder + 23;
                    asInterface = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 % 2;
                    }
                    while (jsonReader.hasNext()) {
                        int i10 = asBinder + 5;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        String strNextName2 = jsonReader.nextName();
                        Object[] objArr3 = new Object[1];
                        a((short) (View.MeasureSpec.getMode(0) + 67), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-830930506) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 2030655788, (-107) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                        if (strNextName2.equals(((String) objArr3[0]).intern())) {
                            int i12 = asBinder + 125;
                            asInterface = i12 % 128;
                            if (i12 % 2 == 0) {
                                builder.setToken(jsonReader.nextString());
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            builder.setToken(jsonReader.nextString());
                        } else if (strNextName2.equals("expiresIn")) {
                            builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    builder2.setAuthToken(builder.build());
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                    int i13 = asInterface + 13;
                    asBinder = i13 % 128;
                    if (i13 % 2 != 0) {
                        i2 = 5;
                    }
                }
            }
            int i14 = i2 % 2;
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws Throwable {
        int i2 = 2 % 2;
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Object[] objArr = new Object[1];
            a((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 67), (byte) View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 830930507, 2030655788 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-107) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            if (strNextName.equals(((String) objArr[0]).intern())) {
                builder.setToken(jsonReader.nextString());
            } else if (!strNextName.equals("expiresIn")) {
                jsonReader.skipValue();
            } else {
                int i3 = asBinder + 15;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    throw null;
                }
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        TokenResult tokenResultBuild = builder.setResponseCode(TokenResult.ResponseCode.OK).build();
        int i4 = asInterface + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return tokenResultBuild;
    }

    private String getFingerprintHashForPackage() {
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                this.context.getPackageName();
                return null;
            }
            String strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            int i5 = asBinder + 101;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return strBytesToStringUppercase;
        } catch (PackageManager.NameNotFoundException unused) {
            this.context.getPackageName();
            return null;
        }
    }

    static long parseTokenExpirationTimestamp(String str) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i5 = asBinder + 49;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        int i7 = asInterface + 123;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return j;
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
            if (TextUtils.isEmpty(readErrorResponse(httpURLConnection))) {
                return;
            }
        } else if (TextUtils.isEmpty(readErrorResponse(httpURLConnection))) {
            return;
        }
        availableFirebaseOptions(str, str2, str3);
        int i5 = asBinder + 119;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 % 3;
        }
    }

    private static String availableFirebaseOptions(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i3 = asInterface + 53;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            str4 = "";
        } else {
            str4 = ", " + str;
            int i5 = asInterface + 21;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
        }
        String str5 = String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
        int i7 = asBinder + 75;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return str5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String readErrorResponse(HttpURLConnection httpURLConnection) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            int i5 = asBinder + 93;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    int i7 = asInterface + 37;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -1782503835;
        IAuthTabCallback = -1538795422;
        onNavigationEvent = 582057792;
        onExtraCallback = new byte[]{-109, -7, -89, -34, -19, -82, -109, 75, 1, -109, 75, 1, -109, 75, 69, 74, 28, 88, 65, 69, 81, -110, 48, 68, 59, -105, 100, 85, 87, 118, 71, 95, 106, Byte.MAX_VALUE, -109, -50, -65, -79, -80, -110, -36, -33, -38};
    }
}
