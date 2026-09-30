package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.android.gms.internal.p000firebaseauthapi.zzxv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzby {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {27179, 27198, 27284, 27282, 27304};
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private Logger zzd;

    public final FirebaseUser zza() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            TextUtils.isEmpty(this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", null));
            throw null;
        }
        String string = this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            int i4 = onNavigationEvent + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            Object[] objArr = new Object[1];
            a(new int[]{1, 4, 112, 2}, false, new byte[]{0, 1, 1, 1}, objArr);
            if (jSONObject.has(((String) objArr[0]).intern())) {
                int i6 = onNavigationEvent + 71;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = new Object[1];
                a(new int[]{1, 4, 112, 2}, false, new byte[]{0, 1, 1, 1}, objArr2);
                if ("com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(((String) objArr2[0]).intern()))) {
                    zzaf zzafVarZza = zza(jSONObject);
                    int i8 = onNavigationEvent + 9;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 9 / 0;
                    }
                    return zzafVarZza;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzafm zza(FirebaseUser firebaseUser) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(firebaseUser);
        String string = this.zzc.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), null);
        if (string == null) {
            return null;
        }
        int i5 = onNavigationEvent + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        zzafm zzafmVarZzb = zzafm.zzb(string);
        if (i6 != 0) {
            int i7 = 49 / 0;
        }
        return zzafmVarZzb;
    }

    private final zzaf zza(JSONObject jSONObject) throws Throwable {
        JSONArray jSONArray;
        MultiFactorInfo multiFactorInfoZza;
        zzah zzahVarZza;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            Object[] objArr = new Object[1];
            a(new int[]{0, 1, 153, 1}, true, new byte[]{1}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                strIntern = string3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            int i4 = 0;
            while (i4 < length) {
                arrayList.add(zzab.zza(jSONArray2.getString(i4)));
                i4++;
                int i5 = onExtraCallback + 87;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            zzaf zzafVar = new zzaf(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.zza(zzafm.zzb(string));
            }
            if (!z) {
                zzafVar.zzb();
            }
            zzafVar.zza(strIntern);
            if (jSONObject.has("userMetadata") && (zzahVarZza = zzah.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                int i7 = onNavigationEvent + 27;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                zzafVar.zza(zzahVarZza);
            }
            if (!(!jSONObject.has("userMultiFactorInfo")) && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i9));
                    String strOptString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(strOptString)) {
                        multiFactorInfoZza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else if (Objects.equals(strOptString, "totp")) {
                        multiFactorInfoZza = TotpMultiFactorInfo.zza(jSONObject2);
                    } else {
                        int i10 = onNavigationEvent + 119;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        multiFactorInfoZza = null;
                    }
                    arrayList2.add(multiFactorInfoZza);
                }
                zzafVar.zzb(arrayList2);
            }
            return zzafVar;
        } catch (zzxv | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            this.zzd.wtf(e);
            return null;
        }
    }

    private final String zzc(FirebaseUser firebaseUser) throws Throwable {
        String str;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (!zzaf.class.isAssignableFrom(firebaseUser.getClass())) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.zza().getName());
            Object[] objArr = new Object[1];
            a(new int[]{1, 4, 112, 2}, false, new byte[]{0, 1, 1, 1}, objArr);
            jSONObject.put(((String) objArr[0]).intern(), "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.zzi() != null) {
                JSONArray jSONArray = new JSONArray();
                List<zzab> listZzi = zzafVar.zzi();
                int size = listZzi.size();
                if (listZzi.size() > 30) {
                    this.zzd.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", new Object[]{30, Integer.valueOf(listZzi.size())});
                    size = 30;
                }
                boolean z = false;
                for (int i3 = 0; i3 < size; i3++) {
                    zzab zzabVar = listZzi.get(i3);
                    if (zzabVar.getProviderId().equals("firebase")) {
                        z = true;
                    }
                    if (i3 == size - 1 && !z) {
                        break;
                    }
                    jSONArray.put(zzabVar.zzb());
                }
                if (!z) {
                    for (int i4 = size - 1; i4 < listZzi.size() && i4 >= 0; i4++) {
                        zzab zzabVar2 = listZzi.get(i4);
                        if (zzabVar2.getProviderId().equals("firebase")) {
                            jSONArray.put(zzabVar2.zzb());
                            break;
                        }
                        if (i4 == listZzi.size() - 1) {
                            int i5 = onNavigationEvent + 97;
                            onExtraCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                jSONArray.put(zzabVar2.zzb());
                                throw null;
                            }
                            jSONArray.put(zzabVar2.zzb());
                        }
                    }
                    if (!z) {
                        int i6 = onNavigationEvent + 59;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        this.zzd.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", new Object[]{Integer.valueOf(listZzi.size()), Integer.valueOf(size)});
                        if (listZzi.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator<zzab> it = listZzi.iterator();
                            while (it.hasNext()) {
                                int i8 = onExtraCallback + 37;
                                onNavigationEvent = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[1] = it.next().getProviderId();
                                    str = String.format("Provider - %s\n", objArr2);
                                } else {
                                    str = String.format("Provider - %s\n", it.next().getProviderId());
                                }
                                sb.append(str);
                            }
                            this.zzd.w(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.isAnonymous());
            Object[] objArr3 = new Object[1];
            a(new int[]{0, 1, 153, 1}, true, new byte[]{1}, objArr3);
            jSONObject.put("version", ((String) objArr3[0]).intern());
            if (zzafVar.getMetadata() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.getMetadata()).zza());
            }
            List<MultiFactorInfo> enrolledFactors = ((zzaj) zzafVar.getMultiFactor()).getEnrolledFactors();
            if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                int i9 = onNavigationEvent + 41;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < enrolledFactors.size()) {
                    int i12 = onExtraCallback + 9;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    jSONArray2.put(enrolledFactors.get(i11).toJson());
                    i11++;
                    int i14 = onNavigationEvent + 105;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            String string = jSONObject.toString();
            int i16 = onNavigationEvent + 67;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            return string;
        } catch (Exception e) {
            this.zzd.wtf("Failed to turn object into JSON", e, new Object[0]);
            throw new zzxv(e);
        }
    }

    public zzby(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.zzb), 0);
        this.zzd = new Logger("StorageHelpers", new String[0]);
    }

    public final void zza(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorEdit = this.zzc.edit();
        if (i4 != 0) {
            editorEdit.remove(str).apply();
        } else {
            editorEdit.remove(str).apply();
            throw null;
        }
    }

    public final void zzb(FirebaseUser firebaseUser) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(firebaseUser);
        String strZzc = zzc(firebaseUser);
        if (!TextUtils.isEmpty(strZzc)) {
            int i5 = onExtraCallback + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.zzc.edit().putString("com.google.firebase.auth.FIREBASE_USER", strZzc).apply();
        }
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzafmVar);
        this.zzc.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), zzafmVar.zzf()).apply();
        int i5 = onExtraCallback + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onWarmupCompleted;
        if (cArr != null) {
            int i8 = $11 + 93;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 113;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 35283), 35 - (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i10++;
                    i2 = 2;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i13 = $10 + 117;
                $11 = i13 % 128;
                if (i13 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, 17657 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "")), TextUtils.getOffsetBefore("", 0) + 65, 16718 - TextUtils.indexOf("", ""), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 49467), TextUtils.indexOf("", "", 0) + 70, 12487 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i16 = $10 + 53;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i18, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i18);
            int i19 = $10 + 13;
            $11 = i19 % 128;
            int i20 = i19 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i21 = $11 + 5;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 << trackGroupExternalSyntheticLambda0.onNavigationEvent) << 1];
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
