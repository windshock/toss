package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class MultiFactorResolver extends AbstractSafeParcelable {
    public abstract FirebaseAuth getFirebaseAuth();

    public abstract List<MultiFactorInfo> getHints();

    public abstract MultiFactorSession getSession();

    public abstract Task<AuthResult> resolveSignIn(@NonNull MultiFactorAssertion multiFactorAssertion);
}
