package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zze extends zzb {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zze() {
    }
}
