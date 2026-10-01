package o;

import android.location.Location;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileDescriptor;
import o.addOnChildAttachStateChangeListener;
import o.isComputingLayout;
import o.removeOnScrollListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class saveOldPositions extends removeOnScrollListener {
    protected static final addFocusables IAuthTabCallback = addFocusables.onExtraCallback(saveOldPositions.class.getSimpleName());
    private CamcorderProfile asBinder;
    protected MediaRecorder onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    protected abstract void IAuthTabCallback(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted, @NonNull MediaRecorder mediaRecorder);

    protected abstract CamcorderProfile onNavigationEvent(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted);

    saveOldPositions(@Nullable removeOnScrollListener.onExtraCallback onextracallback) {
        super(onextracallback);
    }

    protected final boolean onExtraCallback(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted) {
        if (this.onWarmupCompleted) {
            return true;
        }
        return onExtraCallbackWithResult(onwarmupcompleted, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallbackWithResult(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted, boolean z) throws Throwable {
        int i2;
        String str;
        String str2;
        IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"prepareMediaRecorder:", "Preparing on thread", Thread.currentThread()});
        this.onExtraCallbackWithResult = new MediaRecorder();
        this.asBinder = onNavigationEvent(onwarmupcompleted);
        IAuthTabCallback(onwarmupcompleted, this.onExtraCallbackWithResult);
        addItemDecoration additemdecoration = onwarmupcompleted.onExtraCallbackWithResult;
        if (additemdecoration == addItemDecoration.ON) {
            i2 = this.asBinder.audioChannels;
        } else if (additemdecoration == addItemDecoration.MONO) {
            i2 = 1;
        } else {
            i2 = additemdecoration == addItemDecoration.STEREO ? 2 : 0;
        }
        boolean z2 = i2 > 0;
        if (z2) {
            this.onExtraCallbackWithResult.setAudioSource(0);
        }
        considerReleasingGlowsOnScroll considerreleasingglowsonscroll = onwarmupcompleted.IAuthTabCallback_Parcel;
        if (considerreleasingglowsonscroll == considerReleasingGlowsOnScroll.H_264) {
            CamcorderProfile camcorderProfile = this.asBinder;
            camcorderProfile.videoCodec = 2;
            camcorderProfile.fileFormat = 2;
        } else if (considerreleasingglowsonscroll == considerReleasingGlowsOnScroll.H_263) {
            CamcorderProfile camcorderProfile2 = this.asBinder;
            camcorderProfile2.videoCodec = 1;
            camcorderProfile2.fileFormat = 2;
        }
        addOnItemTouchListener addonitemtouchlistener = onwarmupcompleted.onNavigationEvent;
        if (addonitemtouchlistener == addOnItemTouchListener.AAC) {
            this.asBinder.audioCodec = 3;
        } else if (addonitemtouchlistener == addOnItemTouchListener.HE_AAC) {
            this.asBinder.audioCodec = 4;
        } else if (addonitemtouchlistener == addOnItemTouchListener.AAC_ELD) {
            this.asBinder.audioCodec = 5;
        }
        this.onExtraCallbackWithResult.setOutputFormat(this.asBinder.fileFormat);
        if (onwarmupcompleted.writeTypedObject <= 0) {
            onwarmupcompleted.writeTypedObject = this.asBinder.videoFrameRate;
        }
        if (onwarmupcompleted.getInterfaceDescriptor <= 0) {
            onwarmupcompleted.getInterfaceDescriptor = this.asBinder.videoBitRate;
        }
        if (onwarmupcompleted.IAuthTabCallback <= 0 && z2) {
            onwarmupcompleted.IAuthTabCallback = this.asBinder.audioBitRate;
        }
        if (z) {
            CamcorderProfile camcorderProfile3 = this.asBinder;
            int i3 = camcorderProfile3.audioCodec;
            if (i3 == 2) {
                str = "audio/amr-wb";
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                str = "audio/mp4a-latm";
            } else {
                str = i3 != 6 ? "audio/3gpp" : "audio/vorbis";
            }
            int i4 = camcorderProfile3.videoCodec;
            if (i4 == 1) {
                str2 = "video/3gpp";
            } else if (i4 == 2) {
                str2 = "video/avc";
            } else if (i4 == 3) {
                str2 = "video/mp4v-es";
            } else if (i4 == 4) {
                str2 = "video/x-vnd.on2.vp8";
            } else if (i4 == 5) {
                str2 = "video/hevc";
            }
            String str3 = str2;
            boolean z3 = onwarmupcompleted.IAuthTabCallbackStubProxy % 180 != 0;
            if (z3) {
                onwarmupcompleted.access100 = onwarmupcompleted.access100.onNavigationEvent();
            }
            int iOnWarmupCompleted = 0;
            boolean z4 = false;
            int iOnExtraCallback = 0;
            int iOnWarmupCompleted2 = 0;
            int i5 = 0;
            int i6 = 0;
            removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnNavigationEvent = null;
            while (!z4) {
                IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"prepareMediaRecorder:", "Checking DeviceEncoders...", "videoOffset:", Integer.valueOf(i5), "audioOffset:", Integer.valueOf(i6)});
                try {
                    int i7 = iOnExtraCallback;
                    int i8 = iOnWarmupCompleted2;
                    isComputingLayout iscomputinglayout = new isComputingLayout(0, str3, str, i5, i6);
                    try {
                        removeonchildattachstatechangelistenerOnNavigationEvent = iscomputinglayout.onNavigationEvent(onwarmupcompleted.access100);
                        iOnWarmupCompleted2 = iscomputinglayout.onWarmupCompleted(onwarmupcompleted.getInterfaceDescriptor);
                        try {
                            iOnWarmupCompleted = iscomputinglayout.onWarmupCompleted(removeonchildattachstatechangelistenerOnNavigationEvent, onwarmupcompleted.writeTypedObject);
                            iscomputinglayout.IAuthTabCallback(str3, removeonchildattachstatechangelistenerOnNavigationEvent, iOnWarmupCompleted, iOnWarmupCompleted2);
                            if (z2) {
                                iOnExtraCallback = iscomputinglayout.onExtraCallback(onwarmupcompleted.IAuthTabCallback);
                                try {
                                    iscomputinglayout.onExtraCallbackWithResult(str, iOnExtraCallback, this.asBinder.audioSampleRate, i2);
                                } catch (isComputingLayout.onExtraCallback e) {
                                    e = e;
                                    IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"prepareMediaRecorder:", "Got VideoException:", e.getMessage()});
                                    i5++;
                                } catch (isComputingLayout.onExtraCallbackWithResult e2) {
                                    e = e2;
                                    IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"prepareMediaRecorder:", "Got AudioException:", e.getMessage()});
                                    i6++;
                                }
                            } else {
                                iOnExtraCallback = i7;
                            }
                            z4 = true;
                        } catch (isComputingLayout.onExtraCallback e3) {
                            e = e3;
                            iOnExtraCallback = i7;
                        } catch (isComputingLayout.onExtraCallbackWithResult e4) {
                            e = e4;
                            iOnExtraCallback = i7;
                        }
                    } catch (isComputingLayout.onExtraCallback e5) {
                        e = e5;
                        iOnExtraCallback = i7;
                        iOnWarmupCompleted2 = i8;
                    } catch (isComputingLayout.onExtraCallbackWithResult e6) {
                        e = e6;
                        iOnExtraCallback = i7;
                        iOnWarmupCompleted2 = i8;
                    }
                } catch (RuntimeException unused) {
                    IAuthTabCallback.onWarmupCompleted(new Object[]{"prepareMediaRecorder:", "Could not respect encoders parameters.", "Trying again without checking encoders."});
                    return onExtraCallbackWithResult(onwarmupcompleted, false);
                }
            }
            onwarmupcompleted.access100 = removeonchildattachstatechangelistenerOnNavigationEvent;
            onwarmupcompleted.getInterfaceDescriptor = iOnWarmupCompleted2;
            onwarmupcompleted.IAuthTabCallback = iOnExtraCallback;
            onwarmupcompleted.writeTypedObject = iOnWarmupCompleted;
            if (z3) {
                onwarmupcompleted.access100 = removeonchildattachstatechangelistenerOnNavigationEvent.onNavigationEvent();
            }
        }
        boolean z5 = onwarmupcompleted.IAuthTabCallbackStubProxy % 180 != 0;
        MediaRecorder mediaRecorder = this.onExtraCallbackWithResult;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = onwarmupcompleted.access100;
        mediaRecorder.setVideoSize(z5 ? removeonchildattachstatechangelistener.onExtraCallbackWithResult() : removeonchildattachstatechangelistener.onExtraCallback(), z5 ? onwarmupcompleted.access100.onExtraCallback() : onwarmupcompleted.access100.onExtraCallbackWithResult());
        this.onExtraCallbackWithResult.setVideoFrameRate(onwarmupcompleted.writeTypedObject);
        this.onExtraCallbackWithResult.setVideoEncoder(this.asBinder.videoCodec);
        this.onExtraCallbackWithResult.setVideoEncodingBitRate(onwarmupcompleted.getInterfaceDescriptor);
        if (z2) {
            this.onExtraCallbackWithResult.setAudioChannels(i2);
            this.onExtraCallbackWithResult.setAudioSamplingRate(this.asBinder.audioSampleRate);
            this.onExtraCallbackWithResult.setAudioEncoder(this.asBinder.audioCodec);
            this.onExtraCallbackWithResult.setAudioEncodingBitRate(onwarmupcompleted.IAuthTabCallback);
        }
        Location location = onwarmupcompleted.onTransact;
        if (location != null) {
            this.onExtraCallbackWithResult.setLocation((float) location.getLatitude(), (float) onwarmupcompleted.onTransact.getLongitude());
        }
        File file = onwarmupcompleted.asBinder;
        if (file != null) {
            this.onExtraCallbackWithResult.setOutputFile(file.getAbsolutePath());
        } else {
            FileDescriptor fileDescriptor = onwarmupcompleted.IAuthTabCallbackStub;
            if (fileDescriptor != null) {
                this.onExtraCallbackWithResult.setOutputFile(fileDescriptor);
            } else {
                throw new IllegalStateException("file and fileDescriptor are both null.");
            }
        }
        this.onExtraCallbackWithResult.setOrientationHint(onwarmupcompleted.IAuthTabCallbackStubProxy);
        MediaRecorder mediaRecorder2 = this.onExtraCallbackWithResult;
        long jRound = onwarmupcompleted.access000;
        if (jRound > 0) {
            jRound = Math.round(jRound / 0.9d);
        }
        mediaRecorder2.setMaxFileSize(jRound);
        IAuthTabCallback.onExtraCallbackWithResult(new Object[]{"prepareMediaRecorder:", "Increased max size from", Long.valueOf(onwarmupcompleted.access000), "to", Long.valueOf(Math.round(onwarmupcompleted.access000 / 0.9d))});
        this.onExtraCallbackWithResult.setMaxDuration(onwarmupcompleted.IAuthTabCallbackDefault);
        this.onExtraCallbackWithResult.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: o.saveOldPositions.1
            @Override // android.media.MediaRecorder.OnInfoListener
            public void onInfo(MediaRecorder mediaRecorder3, int i9, int i10) {
                addFocusables addfocusables = saveOldPositions.IAuthTabCallback;
                addfocusables.onExtraCallbackWithResult(new Object[]{"OnInfoListener:", "Received info", Integer.valueOf(i9), Integer.valueOf(i10), "Thread: ", Thread.currentThread()});
                switch (i9) {
                    case 800:
                        ((removeOnScrollListener) saveOldPositions.this).onNavigationEvent.onExtraCallback = 2;
                        break;
                    case 801:
                    case 802:
                        ((removeOnScrollListener) saveOldPositions.this).onNavigationEvent.onExtraCallback = 1;
                        break;
                    default:
                        return;
                }
                addfocusables.onExtraCallbackWithResult(new Object[]{"OnInfoListener:", "Stopping"});
                saveOldPositions.this.onExtraCallbackWithResult(false);
            }
        });
        this.onExtraCallbackWithResult.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: o.saveOldPositions.4
            @Override // android.media.MediaRecorder.OnErrorListener
            public void onError(MediaRecorder mediaRecorder3, int i9, int i10) {
                addFocusables addfocusables = saveOldPositions.IAuthTabCallback;
                addfocusables.onNavigationEvent(new Object[]{"OnErrorListener: got error", Integer.valueOf(i9), Integer.valueOf(i10), ". Stopping."});
                saveOldPositions saveoldpositions = saveOldPositions.this;
                ((removeOnScrollListener) saveoldpositions).onNavigationEvent = null;
                ((removeOnScrollListener) saveoldpositions).onExtraCallback = new RuntimeException("MediaRecorder error: " + i9 + " " + i10);
                addfocusables.onExtraCallbackWithResult(new Object[]{"OnErrorListener:", "Stopping"});
                saveOldPositions.this.onExtraCallbackWithResult(false);
            }
        });
        try {
            this.onExtraCallbackWithResult.prepare();
            this.onWarmupCompleted = true;
            ((removeOnScrollListener) this).onExtraCallback = null;
            return true;
        } catch (Exception e7) {
            IAuthTabCallback.onWarmupCompleted(new Object[]{"prepareMediaRecorder:", "Error while preparing media recorder.", e7});
            this.onWarmupCompleted = false;
            ((removeOnScrollListener) this).onExtraCallback = e7;
            return false;
        }
    }

    protected void onWarmupCompleted() throws IllegalStateException {
        if (!onExtraCallback(((removeOnScrollListener) this).onNavigationEvent)) {
            ((removeOnScrollListener) this).onNavigationEvent = null;
            onExtraCallbackWithResult(false);
            return;
        }
        try {
            this.onExtraCallbackWithResult.start();
            IAuthTabCallback();
        } catch (Exception e) {
            IAuthTabCallback.onWarmupCompleted(new Object[]{"start:", "Error while starting media recorder.", e});
            ((removeOnScrollListener) this).onNavigationEvent = null;
            ((removeOnScrollListener) this).onExtraCallback = e;
            onExtraCallbackWithResult(false);
        }
    }

    protected void onWarmupCompleted(boolean z) throws IllegalStateException {
        if (this.onExtraCallbackWithResult != null) {
            onExtraCallback();
            try {
                addFocusables addfocusables = IAuthTabCallback;
                addfocusables.onExtraCallbackWithResult(new Object[]{"stop:", "Stopping MediaRecorder..."});
                this.onExtraCallbackWithResult.stop();
                addfocusables.onExtraCallbackWithResult(new Object[]{"stop:", "Stopped MediaRecorder."});
            } catch (Exception e) {
                ((removeOnScrollListener) this).onNavigationEvent = null;
                if (((removeOnScrollListener) this).onExtraCallback == null) {
                    IAuthTabCallback.onWarmupCompleted(new Object[]{"stop:", "Error while closing media recorder.", e});
                    ((removeOnScrollListener) this).onExtraCallback = e;
                }
            }
            try {
                addFocusables addfocusables2 = IAuthTabCallback;
                addfocusables2.onExtraCallbackWithResult(new Object[]{"stop:", "Releasing MediaRecorder..."});
                this.onExtraCallbackWithResult.release();
                addfocusables2.onExtraCallbackWithResult(new Object[]{"stop:", "Released MediaRecorder."});
            } catch (Exception e2) {
                ((removeOnScrollListener) this).onNavigationEvent = null;
                if (((removeOnScrollListener) this).onExtraCallback == null) {
                    IAuthTabCallback.onWarmupCompleted(new Object[]{"stop:", "Error while releasing media recorder.", e2});
                    ((removeOnScrollListener) this).onExtraCallback = e2;
                }
            }
        }
        this.asBinder = null;
        this.onExtraCallbackWithResult = null;
        this.onWarmupCompleted = false;
        onNavigationEvent();
    }
}
