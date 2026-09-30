package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RecaptchaTasksClient {
    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction);

    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction, long j);
}
