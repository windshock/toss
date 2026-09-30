package androidx.media3.datasource.cache;

import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o.RecordingInputConnection_androidKt;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda18;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CacheDataSink implements TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 {
    private ReusableBufferedOutputStream IAuthTabCallback;
    private File IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final long asBinder;
    private OutputStream asInterface;
    private final int onExtraCallback;
    private final Cache onExtraCallbackWithResult;
    private long onNavigationEvent;
    private long onTransact;
    private TextFieldSelectionStateExternalSyntheticLambda12 onWarmupCompleted;

    public static final class IAuthTabCallback implements TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0.onNavigationEvent {
        private Cache onNavigationEvent;
        private long onExtraCallbackWithResult = 5242880;
        private int IAuthTabCallback = 20480;

        public IAuthTabCallback IAuthTabCallback(Cache cache) {
            this.onNavigationEvent = cache;
            return this;
        }

        @Override // o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0.onNavigationEvent
        public TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 onNavigationEvent() {
            return new CacheDataSink((Cache) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent), this.onExtraCallbackWithResult, this.IAuthTabCallback);
        }
    }

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j, int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.onExtraCallbackWithResult = (Cache) RecordingInputConnection_androidKt.onExtraCallbackWithResult(cache);
        this.asBinder = j == -1 ? Long.MAX_VALUE : j;
        this.onExtraCallback = i2;
    }

    @Override // o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0
    public void onWarmupCompleted(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws CacheDataSinkException {
        String str = textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallbackStub;
        if (textFieldSelectionStateExternalSyntheticLambda12.asBinder == -1 && textFieldSelectionStateExternalSyntheticLambda12.onExtraCallback(2)) {
            this.onWarmupCompleted = null;
            return;
        }
        this.onWarmupCompleted = textFieldSelectionStateExternalSyntheticLambda12;
        this.onTransact = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallback(4) ? this.asBinder : Long.MAX_VALUE;
        this.onNavigationEvent = 0L;
        try {
            onExtraCallback(textFieldSelectionStateExternalSyntheticLambda12);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3) throws IOException {
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12 = this.onWarmupCompleted;
        if (textFieldSelectionStateExternalSyntheticLambda12 != null) {
            int i4 = 0;
            while (i4 < i3) {
                try {
                    if (this.IAuthTabCallbackStub == this.onTransact) {
                        onExtraCallbackWithResult();
                        onExtraCallback(textFieldSelectionStateExternalSyntheticLambda12);
                    }
                    int iMin = (int) Math.min(i3 - i4, this.onTransact - this.IAuthTabCallbackStub);
                    Object[] objArr = {this.asInterface};
                    Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
                    Object obj = objOnNavigationEvent;
                    ((OutputStream) objOnNavigationEvent).write(bArr, i2 + i4, iMin);
                    i4 += iMin;
                    long j = iMin;
                    this.IAuthTabCallbackStub += j;
                    this.onNavigationEvent += j;
                } catch (IOException e) {
                    throw new CacheDataSinkException(e);
                }
            }
        }
    }

    @Override // o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0
    public void onExtraCallback() throws CacheDataSinkException {
        if (this.onWarmupCompleted == null) {
            return;
        }
        try {
            onExtraCallbackWithResult();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    private void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        long j = textFieldSelectionStateExternalSyntheticLambda12.asBinder;
        long jMin = j != -1 ? Math.min(j - this.onNavigationEvent, this.onTransact) : -1L;
        Cache cache = this.onExtraCallbackWithResult;
        Object[] objArr = {textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallbackStub};
        this.IAuthTabCallbackDefault = cache.IAuthTabCallback((String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742), textFieldSelectionStateExternalSyntheticLambda12.onTransact + this.onNavigationEvent, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.IAuthTabCallbackDefault);
        if (this.onExtraCallback > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.IAuthTabCallback;
            if (reusableBufferedOutputStream == null) {
                this.IAuthTabCallback = new ReusableBufferedOutputStream(fileOutputStream, this.onExtraCallback);
            } else {
                reusableBufferedOutputStream.onExtraCallbackWithResult(fileOutputStream);
            }
            this.asInterface = this.IAuthTabCallback;
        } else {
            this.asInterface = fileOutputStream;
        }
        this.IAuthTabCallbackStub = 0L;
    }

    private void onExtraCallbackWithResult() throws IOException {
        OutputStream outputStream = this.asInterface;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.asInterface);
            this.asInterface = null;
            Object[] objArr = {this.IAuthTabCallbackDefault};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            File file = (File) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
            this.IAuthTabCallbackDefault = null;
            this.onExtraCallbackWithResult.onNavigationEvent(file, this.IAuthTabCallbackStub);
        } catch (Throwable th) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.asInterface);
            this.asInterface = null;
            Object[] objArr2 = {this.IAuthTabCallbackDefault};
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            File file2 = (File) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742);
            this.IAuthTabCallbackDefault = null;
            file2.delete();
            throw th;
        }
    }
}
