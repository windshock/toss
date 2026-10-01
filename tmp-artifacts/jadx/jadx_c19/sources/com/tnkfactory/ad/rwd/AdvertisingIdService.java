package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.tnkfactory.ad.e.d;
import com.tnkfactory.ad.e.e;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdvertisingIdService {
    public static final AdvertisingIdService INSTANCE = new AdvertisingIdService();

    public static d a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new d(iBinder) : (d) iInterfaceQueryLocalInterface;
    }

    public final AdvertisingIdInfo getAdvertisingIdInfo(@NotNull Context context) throws PackageManager.NameNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        e eVarA = a(applicationContext);
        Intrinsics.checkNotNull(eVarA, "");
        try {
            try {
                try {
                    d dVarA = a(eVarA.a());
                    Intrinsics.checkNotNull(dVarA);
                    return new AdvertisingIdInfo(dVarA.a(), dVarA.a(true));
                } catch (InterruptedException e) {
                    throw new IOException("Interrupted exception: " + e);
                }
            } catch (RemoteException e2) {
                throw new IOException("GMS Remote exception: " + e2);
            }
        } finally {
            applicationContext.unbindService(eVarA);
        }
    }

    public static e a(Context context) throws PackageManager.NameNotFoundException, IOException {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.android.vending", 0);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
                if (packageInfo.versionCode >= 4242000) {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
                        if (applicationInfo.enabled) {
                            e eVar = new e();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            if (context.bindService(intent, eVar, 1)) {
                                return eVar;
                            }
                            throw new IOException("Connection failure");
                        }
                        throw new IOException("Google Play services is not enabled.");
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new IOException("Google Play services is missing when getting application info.");
                    }
                }
                throw new IOException("Google Play services out of date. Requires 4242000 but found " + packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new IOException("Google Play services is missing.");
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            throw new IOException("Google Play Store is missing.");
        }
    }
}
