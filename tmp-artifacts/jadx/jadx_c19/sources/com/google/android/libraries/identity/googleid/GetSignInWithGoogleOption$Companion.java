package com.google.android.libraries.identity.googleid;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class GetSignInWithGoogleOption$Companion {
    private GetSignInWithGoogleOption$Companion() {
    }

    public /* synthetic */ GetSignInWithGoogleOption$Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
    }

    @JvmStatic
    public static final Bundle zza(@NonNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str2);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException */
    @JvmStatic
    public final GetSignInWithGoogleOption createFrom(@NonNull Bundle bundle) throws GoogleIdTokenParsingException {
        Intrinsics.checkNotNullParameter(bundle, "");
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID");
            Intrinsics.checkNotNull(string);
            return new GetSignInWithGoogleOption(string, bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"), bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE"));
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }
}
