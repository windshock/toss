package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zzafb;
import com.google.android.gms.internal.p000firebaseauthapi.zzafr;
import com.google.android.gms.internal.p000firebaseauthapi.zzxv;
import com.google.firebase.auth.UserInfo;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzab extends AbstractSafeParcelable implements UserInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<zzab> CREATOR;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private Uri zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private String zzi;

    public final Uri getPhotoUrl() {
        int i2 = 2 % 2;
        int i3 = onTransact + 3;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if ((!TextUtils.isEmpty(this.zzd)) && this.zze == null) {
            int i5 = onTransact + 41;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                this.zze = Uri.parse(this.zzd);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.zze = Uri.parse(this.zzd);
        }
        return this.zze;
    }

    public static zzab zza(@NonNull String str) throws Throwable {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, TextUtils.getCapsMode("", 0, 0) + 127, objArr);
            zzab zzabVar = new zzab(jSONObject.optString(((String) objArr[0]).intern()), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
            int i3 = onTransact + 61;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return zzabVar;
        } catch (JSONException e) {
            throw new zzxv(e);
        }
    }

    public final String getDisplayName() {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.zzc;
        int i5 = i4 + 95;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return this.zzf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumber() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        String str = this.zzg;
        int i6 = i3 + 115;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProviderId() {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        String str = this.zzb;
        int i6 = i4 + 107;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String zza() {
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 71;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0) {
            str = this.zzi;
            int i5 = 45 / 0;
        } else {
            str = this.zzi;
        }
        int i6 = i4 + 117;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getUid() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 101;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        String str = this.zza;
        int i6 = i4 + 55;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String zzb() throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -123, -124, -125, -126, -127}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
            jSONObject.putOpt(((String) objArr[0]).intern(), this.zza);
            jSONObject.putOpt("providerId", this.zzb);
            jSONObject.putOpt("displayName", this.zzc);
            jSONObject.putOpt("photoUrl", this.zzd);
            jSONObject.putOpt("email", this.zzf);
            jSONObject.putOpt("phoneNumber", this.zzg);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.zzh));
            jSONObject.putOpt("rawUserInfo", this.zzi);
            String string = jSONObject.toString();
            int i3 = IAuthTabCallbackDefault + 73;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return string;
        } catch (JSONException e) {
            throw new zzxv(e);
        }
    }

    static {
        onExtraCallbackWithResult();
        CREATOR = new zzaa();
        int i2 = onExtraCallback + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public zzab(zzafr zzafrVar) {
        Preconditions.checkNotNull(zzafrVar);
        this.zza = zzafrVar.zzd();
        this.zzb = Preconditions.checkNotEmpty(zzafrVar.zzf());
        this.zzc = zzafrVar.zzb();
        Uri uriZza = zzafrVar.zza();
        if (uriZza != null) {
            this.zzd = uriZza.toString();
            this.zze = uriZza;
            int i2 = onTransact + 13;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 2;
            } else {
                int i4 = 2 % 2;
            }
        }
        this.zzf = zzafrVar.zzc();
        this.zzg = zzafrVar.zze();
        this.zzh = false;
        this.zzi = zzafrVar.zzg();
        int i5 = IAuthTabCallbackDefault + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public zzab(zzafb zzafbVar, String str) {
        Preconditions.checkNotNull(zzafbVar);
        Preconditions.checkNotEmpty(str);
        this.zza = Preconditions.checkNotEmpty(zzafbVar.zzi());
        this.zzb = str;
        this.zzf = zzafbVar.zzh();
        this.zzc = zzafbVar.zzg();
        Uri uriZzc = zzafbVar.zzc();
        if (uriZzc != null) {
            this.zzd = uriZzc.toString();
            this.zze = uriZzc;
            int i2 = onTransact + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.zzh = zzafbVar.zzm();
        this.zzi = null;
        this.zzg = zzafbVar.zzj();
        int i5 = onTransact + 35;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public zzab(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 4) String str4, @Nullable @SafeParcelable.Param(id = 3) String str5, @Nullable @SafeParcelable.Param(id = 6) String str6, @SafeParcelable.Param(id = 7) boolean z, @Nullable @SafeParcelable.Param(id = 8) String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzc = str5;
        this.zzd = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.zze = Uri.parse(this.zzd);
            int i2 = onTransact + 99;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.zzh = z;
        this.zzi = str7;
        int i4 = IAuthTabCallbackDefault + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getUid(), false);
        SafeParcelWriter.writeString(parcel, 2, getProviderId(), false);
        SafeParcelWriter.writeString(parcel, 3, getDisplayName(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 6, getPhoneNumber(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, isEmailVerified());
        SafeParcelWriter.writeString(parcel, 8, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i6 = onTransact + 77;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean isEmailVerified() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 87;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        boolean z = this.zzh;
        int i6 = i4 + 91;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        char c = '0';
        if (cArr3 != null) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 77, 20952 - ExpandableListView.getPackedPositionGroup(0L), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i6 = $10 + 69;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (KeyEvent.getMaxKeyCode() >> 16) + 75, 16036 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i8 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 121;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i11 = $11 + 7;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 63 - (ViewConfiguration.getJumpTapTimeout() >> 16), 12215 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{32456, 32458, 32472, 32459, 32444, 32473};
        onWarmupCompleted = -1184334011;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
    }
}
