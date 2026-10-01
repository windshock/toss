package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p000firebaseauthapi.zzacg;
import com.google.android.gms.internal.p000firebaseauthapi.zzaci;
import com.google.android.gms.internal.p000firebaseauthapi.zzacl;
import com.google.android.gms.internal.p000firebaseauthapi.zzaec;
import com.google.android.gms.internal.p000firebaseauthapi.zzags;
import com.google.android.gms.internal.p000firebaseauthapi.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.removeOnContextAvailableListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GenericIdpActivity extends FragmentActivity implements zzaci {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static boolean asBinder = false;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static boolean onTransact;
    private static long zzb;
    private static final zzce zzc;
    private boolean zzd = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final Context zza() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 45;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Context applicationContext = getApplicationContext();
        int i5 = IAuthTabCallback_Parcel + 41;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Uri.Builder zza(Uri.Builder builder, Intent intent, String str, String str2) throws Throwable {
        String strJoin;
        int i2 = 2 % 2;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra != null) {
            int i3 = getInterfaceDescriptor + 109;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 56 / 0;
                if (stringArrayListExtra.isEmpty()) {
                    int i5 = IAuthTabCallback_Parcel + 101;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    strJoin = null;
                } else {
                    strJoin = TextUtils.join(",", stringArrayListExtra);
                }
            } else if (!stringArrayListExtra.isEmpty()) {
            }
        }
        String strZza = zza(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza2 = zzacl.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = strJoin;
        zzo.zza().zza(getApplicationContext(), str, string, strZza2, action, stringExtra2, stringExtra3, stringExtra4);
        String strZza3 = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(stringExtra4).getPersistenceKey()).zza();
        if (!(!TextUtils.isEmpty(strZza3))) {
            zza(zzao.zza("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza2 == null) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("eid", TtmlNode.TAG_P).appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -122, -123, -124, -125, -127, -127, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(((String) objArr[0]).intern(), strZza2).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-114, -126, -115, -116, -125, -117, -118, -119, -120}, View.resolveSize(0, 0) + 127, objArr2);
        builderAppendQueryParameter2.appendQueryParameter(((String) objArr2[0]).intern(), strZza3);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(strZza)) {
            builder.appendQueryParameter("customParameters", strZza);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final Uri.Builder zza(@NonNull Intent intent, @NonNull String str, @NonNull String str2) throws Throwable {
        int i2 = 2 % 2;
        Uri.Builder builderZza = zza(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
        int i3 = IAuthTabCallback_Parcel + 33;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return builderZza;
    }

    static /* synthetic */ Uri zza(Uri uri, Task task) throws Exception {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (task.isSuccessful()) {
                AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
                if (appCheckTokenResult.getError() != null) {
                    int i4 = getInterfaceDescriptor + 79;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    String.valueOf(appCheckTokenResult.getError());
                }
                builderBuildUpon.fragment("fac=" + appCheckTokenResult.getToken());
            } else {
                task.getException().getMessage();
            }
            Uri uriBuild = builderBuildUpon.build();
            int i6 = getInterfaceDescriptor + 39;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                return uriBuild;
            }
            throw null;
        }
        uri.buildUpon();
        task.isSuccessful();
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final String zza(@NonNull String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return zzaec.zzb(str);
        }
        zzaec.zzb(str);
        throw null;
    }

    private static String zza(Bundle bundle) throws JSONException {
        int i2 = 2 % 2;
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int i3 = IAuthTabCallback_Parcel + 109;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    int i5 = getInterfaceDescriptor + 89;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final HttpURLConnection zza(@NonNull URL url) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) zzb.zza().zza(url, "client-firebase-auth-api");
                int i4 = getInterfaceDescriptor + 59;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return httpURLConnection;
            }
            obj.hashCode();
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    static {
        onWarmupCompleted();
        zzc = zzce.zzc();
        int i2 = asInterface + 115;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb() {
        int i2 = 2 % 2;
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!(!zza(intent))) {
            zzc.zza((Context) this);
        } else {
            int i3 = getInterfaceDescriptor + 47;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            zzbl.zza((Context) this, zzao.zza("WEB_CONTEXT_CANCELED"));
        }
        finish();
        int i5 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(Status status) {
        int i2 = 2 % 2;
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        zzcf.zza(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (zza(intent)) {
            zzc.zza((Context) this);
        } else {
            int i3 = IAuthTabCallback_Parcel + 3;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                zzbl.zza(getApplicationContext(), status);
                throw null;
            }
            zzbl.zza(getApplicationContext(), status);
            int i4 = getInterfaceDescriptor + 11;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final void zza(@NonNull String str, @Nullable Status status) {
        int i2 = 2 % 2;
        if (status != null) {
            zza(status);
            return;
        }
        int i3 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        int i5 = getInterfaceDescriptor + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaci
    public final void zza(@NonNull final Uri uri, @NonNull final String str, @NonNull Provider<InteropAppCheckTokenProvider> provider) {
        Task taskForResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = (InteropAppCheckTokenProvider) provider.get();
        if (interopAppCheckTokenProvider != null) {
            taskForResult = interopAppCheckTokenProvider.getToken(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.zzbf
                public final Object then(Task task) {
                    return GenericIdpActivity.zza(uri, task);
                }
            });
            int i5 = getInterfaceDescriptor + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        taskForResult.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzbg
            public final void onComplete(Task task) {
                FragmentActivity fragmentActivity = this.zza;
                String str2 = str;
                if (fragmentActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    zzacl.zzb(fragmentActivity, str2);
                    return;
                }
                List<ResolveInfo> listQueryIntentServices = fragmentActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    new removeOnContextAvailableListener.onExtraCallbackWithResult().onExtraCallbackWithResult().onExtraCallback(fragmentActivity, (Uri) task.getResult());
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str2);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                fragmentActivity.startActivity(intent);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[PHI: r1
      0x003a: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0037, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@NonNull Bundle bundle) {
        String action;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 125;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            super.onCreate(bundle);
            action = getIntent().getAction();
            int i4 = 85 / 0;
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action)) {
                if (!"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && (!"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action))) {
                    int i5 = IAuthTabCallback_Parcel + 41;
                    getInterfaceDescriptor = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (!"android.intent.action.VIEW".equals(action)) {
                            zzb();
                            return;
                        }
                    } else {
                        "android.intent.action.VIEW".equals(action);
                        throw null;
                    }
                }
            }
        } else {
            super.onCreate(bundle);
            action = getIntent().getAction();
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action)) {
            }
        }
        long jCurrentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (jCurrentTimeMillis - zzb < 30000) {
            return;
        }
        zzb = jCurrentTimeMillis;
        if (bundle != null) {
            this.zzd = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
        int i6 = IAuthTabCallback_Parcel + 11;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(@NonNull Intent intent) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
            setIntent(intent);
        } else {
            super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
            setIntent(intent);
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackStub;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                int i8 = i7 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 77, 20952 - Color.red(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 2;
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
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 75 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16793253 + Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (!(!asBinder)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $10 + 33;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i2] << iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 62 - ImageFormat.getBitsPerPixel(0), ExpandableListView.getPackedPositionChild(0L) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 64, 12213 - TextUtils.lastIndexOf("", '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i10 = $10 + 45;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i2] - iIntValue);
                        i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                        i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i3;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $11 + 65;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(j) + 64, 12213 - ExpandableListView.getPackedPositionChild(j), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                j = 0;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int i2 = 2 % 2;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (!(!this.zzd)) {
                zzb();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US);
                FirebaseApp firebaseApp = FirebaseApp.getInstance(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
                if (zzaec.zza(firebaseApp)) {
                    zza(zza(Uri.parse(zzaec.zza(firebaseApp.getOptions().getApiKey())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, (Provider<InteropAppCheckTokenProvider>) firebaseAuth.zzc());
                } else {
                    new zzacg(packageName, lowerCase, getIntent(), firebaseApp, this).executeOnExecutor(firebaseAuth.zze(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                String.valueOf(e);
                zzacl.zzb(this, packageName);
            }
            this.zzd = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            zza(zzcf.zza(intent.getStringExtra("firebaseError")));
            return;
        }
        if (intent.hasExtra("link")) {
            int i3 = getInterfaceDescriptor + 65;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                intent.hasExtra("eventId");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName2 = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                zzr zzrVarZza = zzo.zza().zza(this, packageName2, stringExtra2);
                if (zzrVarZza == null) {
                    zzb();
                }
                if (booleanExtra) {
                    stringExtra = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(zzrVarZza.zza()).getPersistenceKey()).zza(stringExtra);
                }
                zzags zzagsVar = new zzags(zzrVarZza, stringExtra);
                String strZze = zzrVarZza.zze();
                String strZzb = zzrVarZza.zzb();
                zzagsVar.zzb(strZze);
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strZzb)) {
                    int i4 = IAuthTabCallback_Parcel + 61;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    if (!"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strZzb)) {
                        int i6 = IAuthTabCallback_Parcel + 17;
                        getInterfaceDescriptor = i6 % 128;
                        int i7 = i6 % 2;
                        if (!"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strZzb)) {
                            zzb();
                            return;
                        }
                    }
                }
                zzb = 0L;
                this.zzd = false;
                Intent intent2 = new Intent();
                SafeParcelableSerializer.serializeToIntentExtra(zzagsVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strZzb);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (zza(intent2)) {
                    zzc.zza((Context) this);
                } else {
                    zzbl.zza(getApplicationContext(), zzagsVar, strZzb, strZze);
                }
                finish();
                return;
            }
        }
        zzb();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.zzd);
        int i5 = getInterfaceDescriptor + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zza(Intent intent) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zSendBroadcast = LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        int i4 = getInterfaceDescriptor + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return zSendBroadcast;
    }

    public void onStart() {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback_Parcel + 97;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    public void onPause() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 117;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        super.onPause();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void attachBaseContext(Context context) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 111;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        int i5 = IAuthTabCallback_Parcel + 117;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new char[]{32524, 32530, 32534, 32520, 32521, 32758, 32531, 32527, 32514, 32541, 32523, 32540, 32756, 32518};
        IAuthTabCallbackDefault = -1184333889;
        onTransact = true;
        asBinder = true;
    }
}
