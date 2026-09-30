package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.play.core.assetpacks.model.AssetPackErrorCode;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.assetpacks.model.AssetPackUpdateAvailability;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class AssetPackState {
    public static AssetPackState a(@NonNull String str, @AssetPackStatus int i2, @AssetPackErrorCode int i3, long j, long j2, double d, @AssetPackUpdateAvailability int i4, String str2, String str3) {
        return new bn(str, i2, i3, j, j2, (int) Math.rint(100.0d * d), i4, str2, str3);
    }

    static AssetPackState b(Bundle bundle, String str, co coVar, ea eaVar, be beVar) {
        int iA = beVar.a(bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("status", str)), str);
        int i2 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str));
        long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str));
        long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str));
        double dA = coVar.a(str);
        long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str));
        long j4 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_base_version", str));
        int i3 = 1;
        int i4 = 4;
        if (iA != 4) {
            i4 = iA;
        } else if (j4 != 0 && j4 != j3) {
            i3 = 2;
        }
        return a(str, i4, i2, j, j2, dA, i3, bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), eaVar.a(str));
    }

    public abstract String availableVersionTag();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String installedVersionTag();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}
