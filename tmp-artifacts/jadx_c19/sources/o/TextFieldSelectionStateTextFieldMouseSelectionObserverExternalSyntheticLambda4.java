package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda4 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private long IAuthTabCallback;
    private TextFieldSelectionStateExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private TextFieldSelectionStateExternalSyntheticLambda12 IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private final onWarmupCompleted access000;
    private boolean access100;
    private long asBinder;
    private final TextFieldSelectionStateExternalSyntheticLambda0 asInterface;
    private final boolean extraCallback;
    private long extraCallbackWithResult;
    private TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 getInterfaceDescriptor;
    private final TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 onExtraCallback;
    private final Cache onExtraCallbackWithResult;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onMessageChannelReady;
    private Uri onNavigationEvent;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onTransact;
    private final boolean onWarmupCompleted;
    private TextFieldSelectionStateExternalSyntheticLambda12 readTypedObject;
    private long writeTypedObject;

    public interface onWarmupCompleted {
    }

    public static final class IAuthTabCallback implements TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback {
        private Cache IAuthTabCallback;
        private PriorityTaskManager IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private int asBinder;
        private onWarmupCompleted asInterface;
        private TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onExtraCallback = new FileDataSource.onExtraCallback();
        private TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 onExtraCallbackWithResult = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0.onNavigationEvent;
        private boolean onNavigationEvent;
        private TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onTransact;
        private TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted;

        public IAuthTabCallback onNavigationEvent(Cache cache) {
            this.IAuthTabCallback = cache;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(@Nullable TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback) {
            this.onTransact = onextracallback;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(int i2) {
            this.asBinder = i2;
            return this;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda4 createDataSource() {
            TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onextracallback = this.onTransact;
            return onExtraCallbackWithResult(onextracallback != null ? onextracallback.createDataSource() : null, this.asBinder, this.IAuthTabCallbackStub);
        }

        private TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda4 onExtraCallbackWithResult(@Nullable TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, int i2, int i3) {
            TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0OnNavigationEvent;
            Cache cache = (Cache) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
            if (this.onNavigationEvent || textFieldSelectionStateExternalSyntheticLambda0 == null) {
                textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0OnNavigationEvent = null;
            } else {
                TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent = this.onWarmupCompleted;
                if (onnavigationevent != null) {
                    textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0OnNavigationEvent = onnavigationevent.onNavigationEvent();
                } else {
                    textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0OnNavigationEvent = new CacheDataSink.IAuthTabCallback().IAuthTabCallback(cache).onNavigationEvent();
                }
            }
            return new TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda4(cache, textFieldSelectionStateExternalSyntheticLambda0, this.onExtraCallback.createDataSource(), textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0OnNavigationEvent, this.onExtraCallbackWithResult, i2, this.IAuthTabCallbackDefault, i3, this.asInterface);
        }
    }

    private TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda4(Cache cache, @Nullable TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda02, @Nullable TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0, @Nullable TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0, int i2, @Nullable PriorityTaskManager priorityTaskManager, int i3, @Nullable onWarmupCompleted onwarmupcompleted) {
        this.onExtraCallbackWithResult = cache;
        this.onTransact = textFieldSelectionStateExternalSyntheticLambda02;
        this.onExtraCallback = textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 == null ? TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0.onNavigationEvent : textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0;
        this.onWarmupCompleted = (i2 & 1) != 0;
        this.extraCallback = (i2 & 2) != 0;
        this.IAuthTabCallbackStubProxy = (i2 & 4) != 0;
        if (textFieldSelectionStateExternalSyntheticLambda0 != null) {
            textFieldSelectionStateExternalSyntheticLambda0 = priorityTaskManager != null ? new TextFieldSelectionStateExternalSyntheticLambda8(textFieldSelectionStateExternalSyntheticLambda0, priorityTaskManager, i3) : textFieldSelectionStateExternalSyntheticLambda0;
            this.onMessageChannelReady = textFieldSelectionStateExternalSyntheticLambda0;
            this.asInterface = textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 != null ? new TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda0(textFieldSelectionStateExternalSyntheticLambda0, textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0) : null;
        } else {
            this.onMessageChannelReady = TextFieldSelectionStateExternalSyntheticLambda9.onExtraCallback;
            this.asInterface = null;
        }
        this.access000 = onwarmupcompleted;
    }

    public Cache IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 onNavigationEvent() {
        return this.onExtraCallback;
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.onTransact.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
        this.onMessageChannelReady.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        try {
            String strBuildCacheKey = this.onExtraCallback.buildCacheKey(textFieldSelectionStateExternalSyntheticLambda12);
            TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallbackWithResult().onNavigationEvent(strBuildCacheKey).onExtraCallbackWithResult();
            this.readTypedObject = textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult;
            this.onNavigationEvent = onExtraCallbackWithResult(this.onExtraCallbackWithResult, strBuildCacheKey, textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult.asInterface);
            this.extraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda12.onTransact;
            boolean z = onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda12) != -1;
            this.access100 = z;
            if (z) {
                this.IAuthTabCallback = -1L;
            } else {
                long jIAuthTabCallback = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.IAuthTabCallback(this.onExtraCallbackWithResult.onNavigationEvent(strBuildCacheKey));
                this.IAuthTabCallback = jIAuthTabCallback;
                if (jIAuthTabCallback != -1) {
                    long j = jIAuthTabCallback - textFieldSelectionStateExternalSyntheticLambda12.onTransact;
                    this.IAuthTabCallback = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = textFieldSelectionStateExternalSyntheticLambda12.asBinder;
            if (jMin != -1) {
                long j2 = this.IAuthTabCallback;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.IAuthTabCallback = jMin;
            }
            long j3 = this.IAuthTabCallback;
            if (j3 > 0 || j3 == -1) {
                onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult, false);
            }
            long j4 = textFieldSelectionStateExternalSyntheticLambda12.asBinder;
            return j4 != -1 ? j4 : this.IAuthTabCallback;
        } catch (Throwable th) {
            onNavigationEvent(th);
            throw th;
        }
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.IAuthTabCallback == 0) {
            return -1;
        }
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12 = (TextFieldSelectionStateExternalSyntheticLambda12) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.readTypedObject);
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda122 = (TextFieldSelectionStateExternalSyntheticLambda12) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
        try {
            if (this.extraCallbackWithResult >= this.IAuthTabCallbackStub) {
                onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12, true);
            }
            int iOnWarmupCompleted = ((TextFieldSelectionStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault)).onWarmupCompleted(bArr, i2, i3);
            if (iOnWarmupCompleted != -1) {
                if (IAuthTabCallbackStub()) {
                    this.writeTypedObject += iOnWarmupCompleted;
                }
                long j = iOnWarmupCompleted;
                this.extraCallbackWithResult += j;
                this.asBinder += j;
                long j2 = this.IAuthTabCallback;
                if (j2 != -1) {
                    this.IAuthTabCallback = j2 - j;
                    return iOnWarmupCompleted;
                }
            } else {
                if (IAuthTabCallbackDefault()) {
                    long j3 = textFieldSelectionStateExternalSyntheticLambda122.asBinder;
                    if (j3 == -1 || this.asBinder < j3) {
                        Object[] objArr = {textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallbackStub};
                        Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
                        Object obj = objOnNavigationEvent;
                        IAuthTabCallback((String) objOnNavigationEvent);
                        return iOnWarmupCompleted;
                    }
                }
                long j4 = this.IAuthTabCallback;
                if (j4 > 0 || j4 == -1) {
                    asBinder();
                    onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12, false);
                    return onWarmupCompleted(bArr, i2, i3);
                }
            }
            return iOnWarmupCompleted;
        } catch (Throwable th) {
            onNavigationEvent(th);
            throw th;
        }
    }

    public Uri onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public Map<String, List<String>> onExtraCallbackWithResult() {
        if (IAuthTabCallbackDefault()) {
            return this.onMessageChannelReady.onExtraCallbackWithResult();
        }
        return Collections.EMPTY_MAP;
    }

    public void onExtraCallback() throws IOException {
        this.readTypedObject = null;
        this.onNavigationEvent = null;
        this.extraCallbackWithResult = 0L;
        IAuthTabCallbackStubProxy();
        try {
            asBinder();
        } catch (Throwable th) {
            onNavigationEvent(th);
            throw th;
        }
    }

    private void onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) throws IOException {
        TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback;
        long jMin;
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult;
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0;
        String str = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallbackStub}, -1084655742);
        if (this.access100) {
            textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback = null;
        } else if (this.onWarmupCompleted) {
            try {
                textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(str, this.extraCallbackWithResult, this.IAuthTabCallback);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback = this.onExtraCallbackWithResult.onNavigationEvent(str, this.extraCallbackWithResult, this.IAuthTabCallback);
        }
        if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback == null) {
            textFieldSelectionStateExternalSyntheticLambda0 = this.onMessageChannelReady;
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallbackWithResult().onExtraCallbackWithResult(this.extraCallbackWithResult).onWarmupCompleted(this.IAuthTabCallback).onExtraCallbackWithResult();
        } else if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback) {
            Uri uriFromFile = Uri.fromFile((File) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.onExtraCallbackWithResult}, -1084655742));
            long j = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.IAuthTabCallbackDefault;
            long j2 = this.extraCallbackWithResult - j;
            long jMin2 = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.onExtraCallback - j2;
            long j3 = this.IAuthTabCallback;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallbackWithResult().IAuthTabCallback(uriFromFile).IAuthTabCallback(j).onExtraCallbackWithResult(j2).onWarmupCompleted(jMin2).onExtraCallbackWithResult();
            textFieldSelectionStateExternalSyntheticLambda0 = this.onTransact;
        } else {
            if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted()) {
                jMin = this.IAuthTabCallback;
            } else {
                jMin = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.onExtraCallback;
                long j4 = this.IAuthTabCallback;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallbackWithResult().onExtraCallbackWithResult(this.extraCallbackWithResult).onWarmupCompleted(jMin).onExtraCallbackWithResult();
            textFieldSelectionStateExternalSyntheticLambda0 = this.asInterface;
            if (textFieldSelectionStateExternalSyntheticLambda0 == null) {
                textFieldSelectionStateExternalSyntheticLambda0 = this.onMessageChannelReady;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback);
                textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback = null;
            }
        }
        this.IAuthTabCallbackStub = (this.access100 || textFieldSelectionStateExternalSyntheticLambda0 != this.onMessageChannelReady) ? Long.MAX_VALUE : this.extraCallbackWithResult + 102400;
        if (z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(asInterface());
            if (textFieldSelectionStateExternalSyntheticLambda0 == this.onMessageChannelReady) {
                return;
            }
            try {
                asBinder();
            } finally {
            }
        }
        if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback != null && textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback.onExtraCallback()) {
            this.getInterfaceDescriptor = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnExtraCallback;
        }
        this.IAuthTabCallbackDefault = textFieldSelectionStateExternalSyntheticLambda0;
        this.IAuthTabCallback_Parcel = textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult;
        this.asBinder = 0L;
        long jOnNavigationEvent = textFieldSelectionStateExternalSyntheticLambda0.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult);
        TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1 = new TextFieldSelectionState_androidKtExternalSyntheticLambda1();
        if (textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult.asBinder == -1 && jOnNavigationEvent != -1) {
            this.IAuthTabCallback = jOnNavigationEvent;
            TextFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1, this.extraCallbackWithResult + jOnNavigationEvent);
        }
        if (IAuthTabCallbackDefault()) {
            Uri uriOnWarmupCompleted = textFieldSelectionStateExternalSyntheticLambda0.onWarmupCompleted();
            this.onNavigationEvent = uriOnWarmupCompleted;
            TextFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1, !textFieldSelectionStateExternalSyntheticLambda12.asInterface.equals(uriOnWarmupCompleted) ? this.onNavigationEvent : null);
        }
        if (onTransact()) {
            this.onExtraCallbackWithResult.onWarmupCompleted(str, textFieldSelectionState_androidKtExternalSyntheticLambda1);
        }
    }

    private void IAuthTabCallback(String str) throws IOException {
        this.IAuthTabCallback = 0L;
        if (onTransact()) {
            TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1 = new TextFieldSelectionState_androidKtExternalSyntheticLambda1();
            TextFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1, this.extraCallbackWithResult);
            this.onExtraCallbackWithResult.onWarmupCompleted(str, textFieldSelectionState_androidKtExternalSyntheticLambda1);
        }
    }

    private static Uri onExtraCallbackWithResult(Cache cache, String str, Uri uri) {
        Uri uriOnNavigationEvent = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.onNavigationEvent(cache.onNavigationEvent(str));
        return uriOnNavigationEvent != null ? uriOnNavigationEvent : uri;
    }

    private boolean IAuthTabCallbackDefault() {
        return !IAuthTabCallbackStub();
    }

    private boolean asInterface() {
        return this.IAuthTabCallbackDefault == this.onMessageChannelReady;
    }

    private boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault == this.onTransact;
    }

    private boolean onTransact() {
        return this.IAuthTabCallbackDefault == this.asInterface;
    }

    private void asBinder() throws IOException {
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
        if (textFieldSelectionStateExternalSyntheticLambda0 != null) {
            try {
                textFieldSelectionStateExternalSyntheticLambda0.onExtraCallback();
            } finally {
                this.IAuthTabCallback_Parcel = null;
                this.IAuthTabCallbackDefault = null;
                TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 = this.getInterfaceDescriptor;
                if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 != null) {
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
                    this.getInterfaceDescriptor = null;
                }
            }
        }
    }

    private void onNavigationEvent(Throwable th) {
        if (IAuthTabCallbackStub() || (th instanceof Cache.CacheException)) {
            this.ICustomTabsCallback = true;
        }
    }

    private int onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
        if (this.extraCallback && this.ICustomTabsCallback) {
            return 0;
        }
        return (this.IAuthTabCallbackStubProxy && textFieldSelectionStateExternalSyntheticLambda12.asBinder == -1) ? 1 : -1;
    }

    private void IAuthTabCallbackStubProxy() {
        if (this.access000 == null || this.writeTypedObject <= 0) {
            return;
        }
        this.onExtraCallbackWithResult.onNavigationEvent();
        this.writeTypedObject = 0L;
    }
}
