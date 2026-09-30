package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class MultiFactor {
    public abstract Task<Void> enroll(@NonNull MultiFactorAssertion multiFactorAssertion, @Nullable String str);

    public abstract List<MultiFactorInfo> getEnrolledFactors();

    public abstract Task<MultiFactorSession> getSession();

    public abstract Task<Void> unenroll(@NonNull MultiFactorInfo multiFactorInfo);

    public abstract Task<Void> unenroll(@NonNull String str);
}
