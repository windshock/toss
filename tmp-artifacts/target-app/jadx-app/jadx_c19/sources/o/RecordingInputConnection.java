package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RecordingInputConnection {
    private final File IAuthTabCallback;
    private final File onNavigationEvent;

    public RecordingInputConnection(File file) {
        this.onNavigationEvent = file;
        this.IAuthTabCallback = new File(file.getPath() + ".bak");
    }

    public boolean onWarmupCompleted() {
        return this.onNavigationEvent.exists() || this.IAuthTabCallback.exists();
    }

    public void onExtraCallback() {
        this.onNavigationEvent.delete();
        this.IAuthTabCallback.delete();
    }

    public OutputStream onNavigationEvent() throws IOException {
        if (this.onNavigationEvent.exists()) {
            if (!this.IAuthTabCallback.exists()) {
                if (!this.onNavigationEvent.renameTo(this.IAuthTabCallback)) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AtomicFile", "Couldn't rename file " + this.onNavigationEvent + " to backup file " + this.IAuthTabCallback);
                }
            } else {
                this.onNavigationEvent.delete();
            }
        }
        try {
            return new onWarmupCompleted(this.onNavigationEvent);
        } catch (FileNotFoundException e) {
            File parentFile = this.onNavigationEvent.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.onNavigationEvent, e);
            }
            try {
                return new onWarmupCompleted(this.onNavigationEvent);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.onNavigationEvent, e2);
            }
        }
    }

    public void onWarmupCompleted(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.IAuthTabCallback.delete();
    }

    public InputStream onExtraCallbackWithResult() throws FileNotFoundException {
        IAuthTabCallback();
        return new FileInputStream(this.onNavigationEvent);
    }

    private void IAuthTabCallback() {
        if (this.IAuthTabCallback.exists()) {
            this.onNavigationEvent.delete();
            this.IAuthTabCallback.renameTo(this.onNavigationEvent);
        }
    }

    static final class onWarmupCompleted extends OutputStream {
        private boolean onNavigationEvent = false;
        private final FileOutputStream onWarmupCompleted;

        public onWarmupCompleted(File file) throws FileNotFoundException {
            this.onWarmupCompleted = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            flush();
            try {
                this.onWarmupCompleted.getFD().sync();
            } catch (IOException e) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.onWarmupCompleted.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.onWarmupCompleted.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            this.onWarmupCompleted.write(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.onWarmupCompleted.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.onWarmupCompleted.write(bArr, i2, i3);
        }
    }
}
