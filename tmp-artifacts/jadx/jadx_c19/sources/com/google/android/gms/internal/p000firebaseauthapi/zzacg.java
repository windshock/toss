package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzao;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzacg extends AsyncTask<Void, Void, zzacj> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final Logger zza;
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaci> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final FirebaseApp zzg;

    private final zzacj zza(Void... voidArr) throws IOException {
        int i2 = 2 % 2;
        try {
            URL url = new URL(this.zzc);
            zzaci zzaciVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaciVar.zza(url);
            httpURLConnectionZza.addRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzacv(zzaciVar.zza(), this.zzg, zzact.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                int i3 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                String strZza = zza(httpURLConnectionZza);
                zza.e(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(responseCode)), new Object[0]);
                return zzacj.zzb(strZza);
            }
            zzafh zzafhVar = new zzafh();
            zzafhVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzafhVar.zza().contains(this.zzf) ? zzacj.zzb("UNAUTHORIZED_DOMAIN") : zzacj.zza(this.zzf);
            }
            for (String str : zzafhVar.zza()) {
                int i5 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (zza(str)) {
                    return zzacj.zza(str);
                }
            }
            return null;
        } catch (zzaah e) {
            zza.e("ConversionException encountered: " + e.getMessage(), new Object[0]);
            return null;
        } catch (IOException e2) {
            zza.e("IOException occurred: " + e2.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e3) {
            zza.e("Null pointer encountered: " + e3.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ zzacj doInBackground(Void[] voidArr) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        zzacj zzacjVarZza = zza(voidArr);
        int i5 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return zzacjVarZza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.getResponseCode() >= 400) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String zza(HttpURLConnection httpURLConnection) throws zzaah {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i3 % 128;
        try {
        } catch (IOException e) {
            zza.w("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e), new Object[0]);
        }
        if (i3 % 2 != 0) {
            if (httpURLConnection.getResponseCode() >= 22673) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                }
                String str = (String) zzaco.zza(new String(zza(errorStream, 128)), String.class);
                int i4 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }
            int i6 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    static {
        onNavigationEvent();
        zza = new Logger("FirebaseAuth", new String[]{"GetAuthDomainTask"});
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public zzacg(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzaci zzaciVar) throws Throwable {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder builderBuildUpon = Uri.parse(zzaciVar.zza(strCheckNotEmpty)).buildUpon();
        Uri.Builder builderAppendPath = builderBuildUpon.appendPath("getProjectConfig");
        Object[] objArr = new Object[1];
        a(new char[]{57362, 14925, 21666}, 55890 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        builderAppendPath.appendQueryParameter(((String) objArr[0]).intern(), strCheckNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaciVar);
        this.zze = zzaciVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzacj zzacjVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        zza((zzacj) null);
        int i5 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(zzacj zzacjVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            zza(zzacjVar);
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        zza(zzacjVar);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i4 = $11 + 33;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionGroup(0L) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallback - 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.red(0) + 59, 6383 - (Process.myTid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "", 0) + 24, 19627 - Color.red(0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 60, TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i7 = $11 + 5;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i9 = $10 + 33;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 59, 6382 - Process.getGidForName(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r4 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r4 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r4.authority(r2);
        r1.zza(r6.zze.build(), r6.zzb, com.google.firebase.auth.FirebaseAuth.getInstance(r6.zzg).zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(zzacj zzacjVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        int i2 = 2 % 2;
        zzaci zzaciVar = this.zzd.get();
        if (zzacjVar != null) {
            strZza = zzacjVar.zza();
            strZzb = zzacjVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaciVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(strZza)) {
            int i3 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                builder = this.zze;
                int i4 = 27 / 0;
            } else {
                builder = this.zze;
            }
        }
        zzaciVar.zza(this.zzb, zzao.zza(strZzb));
        int i5 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static boolean zza(String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            a(new char[]{57361, 1084, 10351, 19610, 28878, 38070, 47472, 56577}, 58416 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            String host = new URI(((String) objArr[0]).intern() + str).getHost();
            if (host != null) {
                if (!host.endsWith("firebaseapp.com")) {
                    int i3 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        host.endsWith("web.app");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (host.endsWith("web.app")) {
                        int i4 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
                return true;
            }
        } catch (URISyntaxException e) {
            zza.e("Error parsing URL for auth domain check: " + str + ". " + e.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i2) throws IOException {
        int i3 = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            int i4 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                int i7 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                byteArrayOutputStream.write(bArr, 0, i6);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = 8929979596589851982L;
    }
}
