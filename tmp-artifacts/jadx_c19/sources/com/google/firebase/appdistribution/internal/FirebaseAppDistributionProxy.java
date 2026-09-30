package com.google.firebase.appdistribution.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appdistribution.AppDistributionRelease;
import com.google.firebase.appdistribution.FirebaseAppDistribution;
import com.google.firebase.appdistribution.InterruptionLevel;
import com.google.firebase.appdistribution.UpdateTask;
import com.google.firebase.inject.Provider;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class FirebaseAppDistributionProxy implements FirebaseAppDistribution {
    private final FirebaseAppDistribution delegate;

    public FirebaseAppDistributionProxy(Provider<FirebaseAppDistribution> provider) {
        FirebaseAppDistributionStub firebaseAppDistributionStub = (FirebaseAppDistribution) provider.get();
        this.delegate = firebaseAppDistributionStub == null ? new FirebaseAppDistributionStub() : firebaseAppDistributionStub;
    }

    public UpdateTask updateIfNewReleaseAvailable() {
        return this.delegate.updateIfNewReleaseAvailable();
    }

    public boolean isTesterSignedIn() {
        return this.delegate.isTesterSignedIn();
    }

    public Task<Void> signInTester() {
        return this.delegate.signInTester();
    }

    public void signOutTester() {
        this.delegate.signOutTester();
    }

    public Task<AppDistributionRelease> checkForNewRelease() {
        Task<AppDistributionRelease> taskCheckForNewRelease;
        synchronized (this) {
            taskCheckForNewRelease = this.delegate.checkForNewRelease();
        }
        return taskCheckForNewRelease;
    }

    public UpdateTask updateApp() {
        return this.delegate.updateApp();
    }

    public void startFeedback(int i2) {
        this.delegate.startFeedback(i2);
    }

    public void startFeedback(@NonNull CharSequence charSequence) {
        this.delegate.startFeedback(charSequence);
    }

    public void startFeedback(int i2, @Nullable Uri uri) {
        this.delegate.startFeedback(i2, uri);
    }

    public void startFeedback(@NonNull CharSequence charSequence, @Nullable Uri uri) {
        this.delegate.startFeedback(charSequence, uri);
    }

    public void showFeedbackNotification(int i2, @NonNull InterruptionLevel interruptionLevel) {
        this.delegate.showFeedbackNotification(i2, interruptionLevel);
    }

    public void showFeedbackNotification(@NonNull CharSequence charSequence, @NonNull InterruptionLevel interruptionLevel) {
        this.delegate.showFeedbackNotification(charSequence, interruptionLevel);
    }

    public void cancelFeedbackNotification() {
        this.delegate.cancelFeedbackNotification();
    }
}
