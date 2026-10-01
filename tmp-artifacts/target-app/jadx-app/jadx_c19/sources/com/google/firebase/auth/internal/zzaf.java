package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zzafm;
import com.google.android.gms.internal.p000firebaseauthapi.zzafp;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.zzd;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zzaf extends FirebaseUser {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<zzaf> CREATOR;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private zzafm zza;
    private zzab zzb;
    private String zzc;
    private String zzd;
    private List<zzab> zze;
    private List<String> zzf;
    private String zzg;
    private Boolean zzh;
    private zzah zzi;
    private boolean zzj;
    private zzd zzk;
    private zzbj zzl;
    private List<zzafp> zzm;

    public Uri getPhotoUrl() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Uri photoUrl = this.zzb.getPhotoUrl();
        int i5 = onWarmupCompleted + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return photoUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FirebaseApp zza() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        FirebaseApp firebaseApp = FirebaseApp.getInstance(this.zzc);
        int i5 = onWarmupCompleted + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return firebaseApp;
    }

    public final zzd zzg() {
        zzd zzdVar;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            zzdVar = this.zzk;
            int i5 = 1 / 0;
        } else {
            zzdVar = this.zzk;
        }
        int i6 = i3 + 65;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return zzdVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FirebaseUser zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        int i2 = 2 % 2;
        zzaf zzafVar = new zzaf(firebaseApp, firebaseUser.getProviderData());
        if (!(firebaseUser instanceof zzaf)) {
            zzafVar.zzi = null;
        } else {
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            zzaf zzafVar2 = (zzaf) firebaseUser;
            zzafVar.zzg = zzafVar2.zzg;
            zzafVar.zzd = zzafVar2.zzd;
            zzafVar.zzi = (zzah) zzafVar2.getMetadata();
        }
        if (firebaseUser.zzc() != null) {
            zzafVar.zza(firebaseUser.zzc());
        }
        if (!firebaseUser.isAnonymous()) {
            int i5 = onWarmupCompleted + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            zzafVar.zzb();
            if (i6 != 0) {
                throw null;
            }
        }
        return zzafVar;
    }

    public final /* synthetic */ FirebaseUser zzb() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.zzh = Boolean.FALSE;
        if (i4 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FirebaseUser zza(List<? extends UserInfo> list) {
        synchronized (this) {
            Preconditions.checkNotNull(list);
            this.zze = new ArrayList(list.size());
            this.zzf = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                UserInfo userInfo = list.get(i2);
                if (userInfo.getProviderId().equals("firebase")) {
                    this.zzb = (zzab) userInfo;
                } else {
                    this.zzf.add(userInfo.getProviderId());
                }
                this.zze.add((zzab) userInfo);
            }
            if (this.zzb == null) {
                this.zzb = this.zze.get(0);
            }
        }
        return this;
    }

    public FirebaseUserMetadata getMetadata() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 31;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        zzah zzahVar = this.zzi;
        int i5 = i3 + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return zzahVar;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ MultiFactor getMultiFactor() {
        int i2 = 2 % 2;
        zzaj zzajVar = new zzaj(this);
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return zzajVar;
        }
        throw null;
    }

    public final zzafm zzc() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        zzafm zzafmVar = this.zza;
        int i6 = i4 + 117;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return zzafmVar;
        }
        throw null;
    }

    public final zzaf zza(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.zzg = str;
        int i6 = i4 + 93;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return this;
    }

    public final String zzd() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strZzc = zzc().zzc();
        int i5 = IAuthTabCallback + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return strZzc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDisplayName() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String displayName = this.zzb.getDisplayName();
        int i5 = IAuthTabCallback + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return displayName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getEmail() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String email = this.zzb.getEmail();
        int i5 = onWarmupCompleted + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPhoneNumber() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzb.getPhoneNumber();
            throw null;
        }
        String phoneNumber = this.zzb.getPhoneNumber();
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return phoneNumber;
        }
        throw null;
    }

    public String getProviderId() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String providerId = this.zzb.getProviderId();
        int i5 = onWarmupCompleted + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return providerId;
    }

    public final String zze() throws JSONException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzafm zzafmVar = this.zza;
        if (i4 != 0) {
            return zzafmVar.zzf();
        }
        zzafmVar.zzf();
        throw null;
    }

    public String getTenantId() {
        int i2 = 2 % 2;
        zzafm zzafmVar = this.zza;
        Object obj = null;
        if (zzafmVar != null && zzafmVar.zzc() != null) {
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Map map = (Map) zzbi.zza(this.zza.zzc()).getClaims().get("firebase");
            if (map != null) {
                int i5 = IAuthTabCallback + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                String str = (String) map.get("tenant");
                if (i6 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public String getUid() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String uid = this.zzb.getUid();
        int i5 = IAuthTabCallback + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return uid;
    }

    public final List<MultiFactorInfo> zzh() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        zzbj zzbjVar = this.zzl;
        if (zzbjVar != null) {
            int i6 = i3 + 9;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return zzbjVar.zza();
            }
            zzbjVar.zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return new ArrayList();
    }

    public List<? extends UserInfo> getProviderData() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.zze;
        int i5 = i3 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return list;
    }

    public final List<String> zzf() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        List<String> list = this.zzf;
        int i6 = i4 + 57;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final List<zzab> zzi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        List<zzab> list = this.zze;
        int i6 = i4 + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    static {
        onWarmupCompleted();
        CREATOR = new zzae();
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public zzaf(FirebaseApp firebaseApp, List<? extends UserInfo> list) throws Throwable {
        Preconditions.checkNotNull(firebaseApp);
        this.zzc = firebaseApp.getName();
        this.zzd = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        Object[] objArr = new Object[1];
        a(new int[]{-1674143252, 1089629987}, -ExpandableListView.getPackedPositionChild(0L), objArr);
        this.zzg = ((String) objArr[0]).intern();
        zza(list);
    }

    zzaf(@SafeParcelable.Param(id = 1) zzafm zzafmVar, @SafeParcelable.Param(id = 2) zzab zzabVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) List<zzab> list, @SafeParcelable.Param(id = 6) List<String> list2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Boolean bool, @SafeParcelable.Param(id = 9) zzah zzahVar, @SafeParcelable.Param(id = 10) boolean z, @SafeParcelable.Param(id = 11) zzd zzdVar, @SafeParcelable.Param(id = 12) zzbj zzbjVar, @SafeParcelable.Param(id = 13) List<zzafp> list3) {
        this.zza = zzafmVar;
        this.zzb = zzabVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = str3;
        this.zzh = bool;
        this.zzi = zzahVar;
        this.zzj = z;
        this.zzk = zzdVar;
        this.zzl = zzbjVar;
        this.zzm = list3;
    }

    public final void zza(zzafm zzafmVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.zza = (zzafm) Preconditions.checkNotNull(zzafmVar);
        int i5 = IAuthTabCallback + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void zza(@Nullable zzd zzdVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.zzk = zzdVar;
        int i6 = i4 + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void zzc(List<zzafp> list) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(list);
        this.zzm = list;
        int i5 = onWarmupCompleted + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public final void zza(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.zzj = z;
        int i6 = i4 + 27;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void zza(zzah zzahVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.zzi = zzahVar;
        int i6 = i3 + 77;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzb(List<MultiFactorInfo> list) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.zzl = zzbj.zza(list);
        if (i4 != 0) {
            throw null;
        }
        int i5 = onWarmupCompleted + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        long j = 0;
        int i4 = -1469660336;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0) + 72, 8848 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 29;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr3 = {Integer.valueOf(iArr6[i9])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getMode(0) + 72, 8848 - (ViewConfiguration.getLongPressTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                int i12 = $10 + 23;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i4 = -1469660336;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4032), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 78, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, zzc(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i2, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 6, zzf(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(isAnonymous()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getMetadata(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i2, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        int i6 = onWarmupCompleted + 93;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isAnonymous() {
        int i2 = 2 % 2;
        Boolean bool = this.zzh;
        if (bool == null || bool.booleanValue()) {
            zzafm zzafmVar = this.zza;
            String signInProvider = "";
            if (zzafmVar != null) {
                int i3 = IAuthTabCallback + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                GetTokenResult getTokenResultZza = zzbi.zza(zzafmVar.zzc());
                if (getTokenResultZza != null) {
                    int i5 = onWarmupCompleted + 81;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    signInProvider = getTokenResultZza.getSignInProvider();
                }
            }
            boolean z = true;
            if (getProviderData().size() > 1 || (signInProvider != null && signInProvider.equals("custom"))) {
                z = false;
            }
            this.zzh = Boolean.valueOf(z);
        }
        return this.zzh.booleanValue();
    }

    public boolean isEmailVerified() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        zzab zzabVar = this.zzb;
        if (i4 != 0) {
            return zzabVar.isEmailVerified();
        }
        zzabVar.isEmailVerified();
        throw null;
    }

    public final boolean zzj() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        boolean z = this.zzj;
        int i6 = i4 + 59;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return z;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new int[]{1938531672, -1059147795, -612741312, -1293313228, -1009021295, 104283485, 540609465, 1016796129, -230302713, -65400261, -181515424, -1185440716, 1664476029, -596363455, 61388749, -1111705496, 1407247758, 1087789715};
    }
}
