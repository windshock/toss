package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzbxa implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbmk zzg;
    private final boolean zzi;
    private final List zzh = new ArrayList();
    private final Map zzj = new HashMap();

    public zzbxa(@Nullable Date date, int i2, @Nullable Set set, @Nullable Location location, boolean z, int i3, zzbmk zzbmkVar, List list, boolean z2, int i4, String str) {
        this.zza = date;
        this.zzb = i2;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i3;
        this.zzg = zzbmkVar;
        this.zzi = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str3 = strArrSplit[2];
                        if ("true".equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str3)) {
                            this.zzj.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    public final float getAdVolume() {
        return zzeu.zzb().zzg();
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.formats.NativeAdOptions$Builder] */
    public final NativeAdOptions getNativeAdOptions() {
        Parcelable.Creator creator = zzbmk.CREATOR;
        ?? r0 = new Object() { // from class: com.google.android.gms.ads.formats.NativeAdOptions$Builder
            private VideoOptions zze;
            private boolean zza = false;
            private int zzb = -1;
            private int zzc = 0;
            private boolean zzd = false;
            private int zzf = 1;
            private boolean zzg = false;

            public NativeAdOptions build() {
                return new NativeAdOptions(this, (byte[]) null);
            }

            public NativeAdOptions$Builder setAdChoicesPlacement(@NativeAdOptions.AdChoicesPlacement int i2) {
                this.zzf = i2;
                return this;
            }

            @Deprecated
            public NativeAdOptions$Builder setImageOrientation(int i2) {
                this.zzb = i2;
                return this;
            }

            public NativeAdOptions$Builder setMediaAspectRatio(@NativeAdOptions.NativeMediaAspectRatio int i2) {
                this.zzc = i2;
                return this;
            }

            public NativeAdOptions$Builder setRequestCustomMuteThisAd(boolean z) {
                this.zzg = z;
                return this;
            }

            public NativeAdOptions$Builder setRequestMultipleImages(boolean z) {
                this.zzd = z;
                return this;
            }

            public NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean z) {
                this.zza = z;
                return this;
            }

            public NativeAdOptions$Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
                this.zze = videoOptions;
                return this;
            }

            final /* synthetic */ boolean zza() {
                return this.zza;
            }

            final /* synthetic */ int zzb() {
                return this.zzb;
            }

            final /* synthetic */ int zzc() {
                return this.zzc;
            }

            final /* synthetic */ boolean zzd() {
                return this.zzd;
            }

            final /* synthetic */ VideoOptions zze() {
                return this.zze;
            }

            final /* synthetic */ int zzf() {
                return this.zzf;
            }

            final /* synthetic */ boolean zzg() {
                return this.zzg;
            }
        };
        zzbmk zzbmkVar = this.zzg;
        if (zzbmkVar == null) {
            return r0.build();
        }
        int i2 = zzbmkVar.zza;
        if (i2 == 2) {
            r0.setAdChoicesPlacement(zzbmkVar.zze);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    r0.setRequestCustomMuteThisAd(zzbmkVar.zzg);
                    r0.setMediaAspectRatio(zzbmkVar.zzh);
                }
            }
            zzfw zzfwVar = zzbmkVar.zzf;
            if (zzfwVar != null) {
                r0.setVideoOptions(new VideoOptions(zzfwVar));
            }
            r0.setAdChoicesPlacement(zzbmkVar.zze);
        }
        r0.setReturnUrlsForImageAssets(zzbmkVar.zzb);
        r0.setImageOrientation(zzbmkVar.zzc);
        r0.setRequestMultipleImages(zzbmkVar.zzd);
        return r0.build();
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbmk.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return zzeu.zzb().zzi();
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final boolean zza() {
        return this.zzh.contains("3");
    }

    public final Map zzb() {
        return this.zzj;
    }
}
