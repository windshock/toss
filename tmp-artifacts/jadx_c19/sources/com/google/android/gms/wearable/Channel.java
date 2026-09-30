package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Channel extends Parcelable {
    PendingResult<Status> addListener(@NonNull GoogleApiClient googleApiClient, @NonNull ChannelApi.ChannelListener channelListener);

    PendingResult<Status> close(@NonNull GoogleApiClient googleApiClient);

    PendingResult<Status> close(@NonNull GoogleApiClient googleApiClient, int i2);

    PendingResult<GetInputStreamResult> getInputStream(@NonNull GoogleApiClient googleApiClient);

    String getNodeId();

    PendingResult<GetOutputStreamResult> getOutputStream(@NonNull GoogleApiClient googleApiClient);

    String getPath();

    PendingResult<Status> receiveFile(@NonNull GoogleApiClient googleApiClient, @NonNull Uri uri, boolean z);

    PendingResult<Status> removeListener(@NonNull GoogleApiClient googleApiClient, @NonNull ChannelApi.ChannelListener channelListener);

    PendingResult<Status> sendFile(@NonNull GoogleApiClient googleApiClient, @NonNull Uri uri);

    PendingResult<Status> sendFile(@NonNull GoogleApiClient googleApiClient, @NonNull Uri uri, long j, long j2);
}
