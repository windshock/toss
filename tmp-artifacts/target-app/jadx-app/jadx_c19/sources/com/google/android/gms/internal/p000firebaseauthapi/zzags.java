package com.google.android.gms.internal.p000firebaseauthapi;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.internal.zzr;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzags extends AbstractSafeParcelable implements zzacr {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<zzags> CREATOR;
    private static int IAuthTabCallback = 0;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public final zzags zza(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.zzj = false;
        int i6 = i4 + 93;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final zzags zza(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.zzb = Preconditions.checkNotEmpty(str);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onWarmupCompleted + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final zzags zzb(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.zzo = true;
        int i6 = i3 + 45;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final zzags zzc(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.zzi = true;
        int i6 = i3 + 89;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzags zzb(@Nullable String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.zzn = str;
        if (i4 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzacr
    public final String zza() throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                jSONObject.put("idToken", str);
                throw null;
            }
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            int i4 = IAuthTabCallback + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            int i6 = IAuthTabCallback + 9;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 9, 38, 9}, true, null, objArr);
            jSONObject.put(((String) objArr[0]).intern(), this.zzl);
        }
        if (!(!TextUtils.isEmpty(this.zzm))) {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        } else {
            jSONObject.put("requestUri", this.zzm);
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        String string = jSONObject.toString();
        int i8 = IAuthTabCallback + 125;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 81 / 0;
        }
        return string;
    }

    static {
        IAuthTabCallback();
        CREATOR = new zzagr();
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public zzags() {
        this.zzi = true;
        this.zzj = true;
    }

    public zzags(zzr zzrVar, String str) {
        Preconditions.checkNotNull(zzrVar);
        this.zzl = Preconditions.checkNotEmpty(zzrVar.zzd());
        this.zzm = Preconditions.checkNotEmpty(str);
        this.zze = Preconditions.checkNotEmpty(zzrVar.zzc());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzags(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = Preconditions.checkNotEmpty(str3);
        Object obj = null;
        this.zzf = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            int i2 = onWarmupCompleted + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                sb.append("id_token=");
                sb.append(this.zzc);
                sb.append("&");
                throw null;
            }
            sb.append("id_token=");
            sb.append(this.zzc);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb.append("access_token=");
            sb.append(this.zzd);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            int i3 = onWarmupCompleted + 9;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append("identifier=");
                sb.append(this.zzf);
                sb.append("&");
                obj.hashCode();
                throw null;
            }
            sb.append("identifier=");
            sb.append(this.zzf);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            int i4 = IAuthTabCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            sb.append("oauth_token_secret=");
            sb.append(this.zzh);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            int i6 = onWarmupCompleted + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            sb.append("code=");
            sb.append(this.zzk);
            sb.append("&");
            int i8 = onWarmupCompleted + 69;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
            int i10 = 2 % 2;
        }
        sb.append("providerId=");
        sb.append(this.zze);
        this.zzg = sb.toString();
        this.zzj = true;
    }

    zzags(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) boolean z, @SafeParcelable.Param(id = 11) boolean z2, @SafeParcelable.Param(id = 12) String str9, @SafeParcelable.Param(id = 13) String str10, @SafeParcelable.Param(id = 14) String str11, @SafeParcelable.Param(id = 15) String str12, @SafeParcelable.Param(id = MaterialButton.ICON_GRAVITY_TOP) boolean z3, @SafeParcelable.Param(id = 17) String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z3;
        this.zzp = str13;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i6 = IAuthTabCallback + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        char c = '0';
        if (cArr2 != null) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c) + 35235), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34, TextUtils.lastIndexOf("", c) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    c = '0';
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $11 + 39;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 10935), 64 - TextUtils.indexOf((CharSequence) "", '0'), 16718 - Drawable.resolveOpacity(0, 0), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    int i13 = $11 + 37;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 5 / 4;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 29 - View.MeasureSpec.getSize(0), 17657 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 49467), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, ImageFormat.getBitsPerPixel(0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i16 = $11 + 79;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 1, cArr6, 1, i4);
                System.arraycopy(cArr6, 0, cArr4, i4 >> i6, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i4 % i6);
            } else {
                char[] cArr7 = new char[i4];
                System.arraycopy(cArr4, 0, cArr7, 0, i4);
                int i17 = i4 - i6;
                System.arraycopy(cArr7, 0, cArr4, i17, i6);
                System.arraycopy(cArr7, i6, cArr4, 0, i17);
            }
        }
        if (z) {
            int i18 = $10 + 125;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{27332, 27169, 27354, 27355, 27329, 27351, 27351, 27333, 27351};
    }
}
