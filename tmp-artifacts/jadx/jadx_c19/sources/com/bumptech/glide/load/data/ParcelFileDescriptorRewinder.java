package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import java.io.IOException;
import o.SaversKtExternalSyntheticLambda33;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ParcelFileDescriptorRewinder implements SaversKtExternalSyntheticLambda33<ParcelFileDescriptor> {
    private final InternalRewinder onNavigationEvent;

    public static boolean IAuthTabCallback() {
        return true;
    }

    @Override // o.SaversKtExternalSyntheticLambda33
    public void onWarmupCompleted() {
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.onNavigationEvent = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // o.SaversKtExternalSyntheticLambda33
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor onNavigationEvent() throws IOException {
        return this.onNavigationEvent.rewind();
    }

    public static final class onWarmupCompleted implements SaversKtExternalSyntheticLambda33.onExtraCallback<ParcelFileDescriptor> {
        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public SaversKtExternalSyntheticLambda33<ParcelFileDescriptor> onExtraCallback(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        public Class<ParcelFileDescriptor> onExtraCallbackWithResult() {
            return ParcelFileDescriptor.class;
        }
    }

    static final class InternalRewinder {
        private final ParcelFileDescriptor onExtraCallback;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.onExtraCallback = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.onExtraCallback.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.onExtraCallback;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }
}
